/*
package sam.rayl.quickfoodfinderckm

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // Link the layout file (activity_login.xml)

        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()

        // Find views by ID
        val emailEditText = findViewById<TextInputEditText>(R.id.emailEditText)
        val passwordEditText = findViewById<TextInputEditText>(R.id.passwordEditText)
        val signInButton = findViewById<Button>(R.id.signInButton)
        val newUserText = findViewById<TextView>(R.id.newUserText)
        val forgotPasswordText = findViewById<TextView>(R.id.forgotPasswordText)

        // Sign In button logic
        signInButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                // Perform Firebase login
                auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // Login successful, navigate to the main screen (or another activity)
                            Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()
                            startActivity(Intent(this, MainActivity::class.java))
                            finish() // Close LoginActivity
                        } else {
                            // If login fails, display an error message
                            Toast.makeText(
                                this, "Login failed: ${task.exception?.message}",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
            }
        }

        // Handle new user sign up
        newUserText.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java)) // Navigate to Sign Up activity
        }

        // Handle forgot password
        forgotPasswordText.setOnClickListener {
            // Implement forgot password logic (reset password)
            if (emailEditText.text.toString().isNotEmpty()) {
                auth.sendPasswordResetEmail(emailEditText.text.toString())
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(this, "Password reset email sent", Toast.LENGTH_SHORT).show()
                        } else {
                            Toast.makeText(this, "Error: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                        }
                    }
            } else {
                Toast.makeText(this, "Enter your email to reset password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
*/