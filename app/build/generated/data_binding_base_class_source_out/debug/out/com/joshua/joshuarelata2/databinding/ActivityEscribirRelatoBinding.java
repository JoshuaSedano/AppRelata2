// Generated by view binder compiler. Do not edit!
package com.joshua.joshuarelata2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.joshua.joshuarelata2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEscribirRelatoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView btnBAck;

  @NonNull
  public final Button btnGuardarRelato;

  @NonNull
  public final Button btnRelatoFin;

  @NonNull
  public final TextView etCabecera;

  @NonNull
  public final EditText iniciarRelatoText7;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final Toolbar toolbar2;

  @NonNull
  public final TextView txtBuscador;

  private ActivityEscribirRelatoBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView btnBAck, @NonNull Button btnGuardarRelato, @NonNull Button btnRelatoFin,
      @NonNull TextView etCabecera, @NonNull EditText iniciarRelatoText7, @NonNull ImageView logo,
      @NonNull Toolbar toolbar2, @NonNull TextView txtBuscador) {
    this.rootView = rootView;
    this.btnBAck = btnBAck;
    this.btnGuardarRelato = btnGuardarRelato;
    this.btnRelatoFin = btnRelatoFin;
    this.etCabecera = etCabecera;
    this.iniciarRelatoText7 = iniciarRelatoText7;
    this.logo = logo;
    this.toolbar2 = toolbar2;
    this.txtBuscador = txtBuscador;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEscribirRelatoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEscribirRelatoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_escribir_relato, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEscribirRelatoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBAck;
      ImageView btnBAck = ViewBindings.findChildViewById(rootView, id);
      if (btnBAck == null) {
        break missingId;
      }

      id = R.id.btnGuardarRelato;
      Button btnGuardarRelato = ViewBindings.findChildViewById(rootView, id);
      if (btnGuardarRelato == null) {
        break missingId;
      }

      id = R.id.btnRelatoFin;
      Button btnRelatoFin = ViewBindings.findChildViewById(rootView, id);
      if (btnRelatoFin == null) {
        break missingId;
      }

      id = R.id.etCabecera;
      TextView etCabecera = ViewBindings.findChildViewById(rootView, id);
      if (etCabecera == null) {
        break missingId;
      }

      id = R.id.iniciarRelatoText7;
      EditText iniciarRelatoText7 = ViewBindings.findChildViewById(rootView, id);
      if (iniciarRelatoText7 == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.toolbar2;
      Toolbar toolbar2 = ViewBindings.findChildViewById(rootView, id);
      if (toolbar2 == null) {
        break missingId;
      }

      id = R.id.txtBuscador;
      TextView txtBuscador = ViewBindings.findChildViewById(rootView, id);
      if (txtBuscador == null) {
        break missingId;
      }

      return new ActivityEscribirRelatoBinding((ConstraintLayout) rootView, btnBAck,
          btnGuardarRelato, btnRelatoFin, etCabecera, iniciarRelatoText7, logo, toolbar2,
          txtBuscador);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
