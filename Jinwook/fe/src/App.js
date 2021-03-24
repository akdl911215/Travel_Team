import {Link, Route} from 'react-router-dom'
import ItemRegis from './its/container/ItemRegis';



const App = () => {

  return(<>
    <Route path="/ItemRegis" component={ItemRegis} exact/>
    <Link to={"ItemRegis"}>ItemRegis</Link>
  </>)
}
export default App
