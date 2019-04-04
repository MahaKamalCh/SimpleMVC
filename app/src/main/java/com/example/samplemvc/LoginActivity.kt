package com.example.samplemvc

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {

    lateinit var snackbar: Snackbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_submit.setOnClickListener {
            val email = et_email.text.toString()
            val password = et_password.text.toString()

            if (ValidationHelper.validateEmail(email)) {
                val requestBody = SigninRequest(email, password)
                val call = SampleMVCApplication.mRestClient.getApiService().signin(requestBody)
                snackbar = UIHelper.showSimpleSnackbar(cl_root, getString(R.string.info_validating_login))
                call.enqueue(object : Callback<SigninResponse> {
                    override fun onResponse(call: Call<SigninResponse>, response: Response<SigninResponse>) {
                        snackbar.dismiss()
                        snackbar = UIHelper.showSimpleSnackbar(cl_root, getString(R.string.info_login_success))
                    }

                    override fun onFailure(call: Call<SigninResponse>, t: Throwable) {
                        snackbar.dismiss()
                        snackbar = UIHelper.showSnackbarWithAction(
                            cl_root, getString(R.string.info_login_failure),
                            getString(R.string.action_ok), View.OnClickListener {}
                        )
                    }
                })
            } else {
                snackbar = UIHelper.showSnackbarWithAction(
                    cl_root, getString(R.string.error_invalid_email_format),
                    getString(R.string.action_ok), View.OnClickListener {}
                )
            }
        }

    }
}
