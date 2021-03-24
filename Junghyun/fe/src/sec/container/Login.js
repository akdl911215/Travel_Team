import '../component/login.css'


const Login = () => (<>
    <form method="post">
        <div className="imgcontainer">
            <a href="https://creativestudio.kr/1108">
            <img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2F51poH%2FbtqBXUYPZqX%2Fs7IH0C0htb9jEphUd4vuOK%2Fimg.png" alt="Avatar" className="avatar"/>
            </a>
        </div>
        <div className="container">
            <label for="uname"><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="uname" required/>
            <label for="psw"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="psw" required/>
            <button type="submit">Login</button>
            <label>
            <input type="checkbox" checked="checked" name="remember"/> Remember me
            </label>
        </div>
        <div className="container" style= {{backgroundColor: "#F1F1F1"}}>
            <button type="/button" className="cancelbtn">Cancel</button>
            <span className="psw">Forgot <a href="/#">password?</a></span>
        </div>
    </form>
</>)
export default Login;