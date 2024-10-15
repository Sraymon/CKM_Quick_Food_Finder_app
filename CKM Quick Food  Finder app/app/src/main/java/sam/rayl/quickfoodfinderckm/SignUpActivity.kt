/*package sam.rayl.quickfoodfinderckm

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.FacebookAuthProvider
//import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.facebook.login.LoginManager
import com.facebook.CallbackManager

class SignUpActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var callbackManager: CallbackManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up) // Link to sign-up layout

        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()

        //val emailEditText = findViewById<TextInputEditText>(R.id.emailEditText)
        //val passwordEditText = findViewById<TextInputEditText>(R.id.passwordEditText)
        //val signUpButton = findViewById<com.google.android.material.button.MaterialButton>(R.id.signUpButton)
        //val googleSignUpButton = findViewById<com.google.android.material.button.MaterialButton>(R.id.googleSignUpButton)
        //val facebookSignUpButton = findViewById<com.google.android.material.button.MaterialButton>(R.id.facebookSignUpButton)

        // Handle regular email sign-up
        signUpButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(this, "Sign-up successful!", Toast.LENGTH_SHORT).show()
                            finish()
                        } else {
                            Toast.makeText(this, "Sign-up failed: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                        }
                    }
            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
        }

        // Handle Google Sign-Up
        googleSignUpButton.setOnClickListener {
            val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id)) // Make sure this is set in your Firebase project
                .requestEmail()
                .build()
            val googleSignInClient = GoogleSignIn.getClient(this, gso)
            val signInIntent = googleSignInClient.signInIntent
            startActivityForResult(signInIntent, RC_SIGN_IN)
        }

        // Handle Facebook Sign-Up
        callbackManager = CallbackManager.Factory.create()
        facebookSignUpButton.setOnClickListener {
            LoginManager.getInstance().logInWithReadPermissions(this, listOf("email", "public_profile"))
        }
    }

    companion object {
        private const val RC_SIGN_IN = 9001
    }
}
*/