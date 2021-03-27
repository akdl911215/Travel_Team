import React from 'react'
import axios from 'axios'

const App = () => {

  const myButton = () => {
   
    alert('test')
    axios.post(`http://localhost:8080/feeds/create`,
    {
      "title": "테스트용",
      "writer":"작업중",
      "content": "테스트",
      "add_location":"강남",
      "hash_tag":"경남"
    }).then(res => {
      alert(`test 성공): ${JSON.stringify(res)}`)
    })
    .catch(err => {
      alert(`에러 : ${err}`)
    })
  }

  return(<>
  <button onClick={myButton} >Click me</button>
  </>)
  
}
export default App