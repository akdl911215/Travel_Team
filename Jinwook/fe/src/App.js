import {Link, Route} from 'react-router-dom'
import ItemRegisterForm from './its/container/ItemRegisterPage';



const App = () => {

  return(<>
    <Route path="/ItemRegis" component={ItemRegisterForm}/>
    <Link to={"ItemRegis"}>ItemRegis</Link>
  </>)
}
export default App
