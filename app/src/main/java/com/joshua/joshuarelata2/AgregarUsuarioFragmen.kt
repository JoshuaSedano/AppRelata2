package com.joshua.joshuarelata2

import android.content.ContentValues
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.fragment.app.commit

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AgregarUsuarioFragmen.newInstance] factory method to
 * create an instance of this fragment.
 */
class AgregarUsuarioFragmen : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView : View = inflater.inflate(R.layout.fragment_agregar_usuario, container, false)
        val etUsuario = rootView.findViewById<EditText>(R.id.et_username)
        val etPass1 = rootView.findViewById<EditText>(R.id.et_userpsw_add1)
        val etPAss2 = rootView.findViewById<EditText>(R.id.et_userpsw_add2)
        val btnAddUser = rootView.findViewById<Button>(R.id.btn_Add_user)

        btnAddUser.setOnClickListener{
            val admin = BaseDatosAPP(context, "bd", null, 1)
            val bd = admin.writableDatabase
            val reg = ContentValues()

            reg.put("ID", 1)
            reg.put("NOMBRE", etUsuario.text.toString())
            reg.put("PASSWORD", etPass1.text.toString())

            bd.insert("Usuarios", null, reg)
            bd.close()
        }


        return rootView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AgregarUsuarioFragmen.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AgregarUsuarioFragmen().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}