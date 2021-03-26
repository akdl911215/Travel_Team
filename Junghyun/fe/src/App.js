import React, {Component, useState} from 'react'
import axios from 'axios'

const App = () => {

  axios({
    url: '',
    method: 'get',
    data: {
      데이터(매개 변수)
    }
  })

  const myButton = () => {

  }

  return(<>
  <button onclick="myButton()" >Click me</button>
  </>)
  
}
export default App