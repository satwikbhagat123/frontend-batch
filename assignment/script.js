document.getElementById("password").addEventListener("input", function() {
    const password = this.value;

    const upperCasePattern = /[A-Z]/;
    const lowerCasePattern = /[a-z]/;
    const numberPattern = /[0-9]/;
    const specialCharPattern = /[!@#$%^&*(),.?":{}|<>]/;

    updateValidation("uppercase", upperCasePattern.test(password));
    updateValidation("lowercase", lowerCasePattern.test(password));
    updateValidation("number", numberPattern.test(password));
    updateValidation("special", specialCharPattern.test(password));
});

function updateValidation(elementId, isValid) {
    const element = document.getElementById(elementId);
    const icon = element.querySelector("i");

    if (isValid) {
        element.classList.remove("invalid");
        element.classList.add("valid");
        icon.classList.remove("bi-shield-x");
        icon.classList.add("bi-shield-check");
    } else {
        element.classList.remove("valid");
        element.classList.add("invalid");
        icon.classList.remove("bi-shield-check");
        icon.classList.add("bi-shield-x");
    }
}

// Show/Hide Password functionality
const passwordInput = document.getElementById("password");
const togglePassword = document.getElementById("togglePassword");

togglePassword.addEventListener("click", function() {
    const type = passwordInput.getAttribute("type") === "password" ? "text" : "password";
    passwordInput.setAttribute("type", type);

    // Toggle the icon between eye and eye-slash
    this.classList.toggle("bi-eye");
    this.classList.toggle("bi-eye-slash");
});

// Submit form validation
document.getElementById("passwordForm").addEventListener("submit", function(event) {
    const password = passwordInput.value;

    // Check if all validations are met before submitting
    const isValid =
        /[A-Z]/.test(password) &&
        /[a-z]/.test(password) &&
        /[0-9]/.test(password) &&
        /[!@#$%^&*(),.?":{}|<>]/.test(password);

    if (!isValid) {
        event.preventDefault(); // Prevent form submission if password doesn't meet criteria
        alert("Password must meet all validation criteria.");
    } else {
        alert("Form submitted successfully!");
    }
});
