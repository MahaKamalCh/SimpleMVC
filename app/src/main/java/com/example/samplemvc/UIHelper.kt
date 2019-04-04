package com.example.samplemvc

import android.graphics.Color
import android.support.design.widget.Snackbar
import android.view.View

class UIHelper {
    companion object {
        fun showSnackbarWithAction(view: View, message: String, actionMessage: String, action: View.OnClickListener):
                Snackbar {
            val snackbar = Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE)
                .setAction(actionMessage, action)
                .setActionTextColor(Color.RED)
            snackbar.show()
            return snackbar
        }

        fun showSimpleSnackbar(view: View, message: String): Snackbar{
            val snackbar = Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE)
            snackbar.show()
            return snackbar
        }
    }
}