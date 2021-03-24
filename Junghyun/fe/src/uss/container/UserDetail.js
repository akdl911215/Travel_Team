import './src/uss/component/userDetail.css'

const UserDetail = () => (
    <form action="/action_page.php">
        <div className="container">
            <h1>Read (읽기전용)</h1>
            <p>Please fill in this form to read an account.</p>
            <hr/>

            <label for="email"><b>Email ( ID )</b></label>
            <input type="text" placeholder="Enter Email" name="email" id="email" required/>

            <label for="psw"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="psw" id="psw" required/>

            <label for="psw-repeat"><b>Repeat Password</b></label>
            <input type="password" placeholder="Repeat Password" name="psw-repeat" id="psw-repeat" required/>
            <hr/>
            <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

            <button type="/submit" class="registerbtn">Read (읽기전용)</button>
        </div>
        
        <div className="container signin">
            <p>Already have an account? <a href="#">Sign in</a>.</p>
        </div>
    </form>
)

export default UserDetail