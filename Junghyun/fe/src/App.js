import React, {Component, useState} from 'react'
import Home from './cmm/container/Home'
import {Route} from 'react-router-dom'

const App = () => {

  const isSeletedImg = (event: React.ChangeEvent<HTMLInputElement>) => {
    
    if (event.target.files !== null) {
      const fd = new FormData()
      fd.append('filename', event.target.files[0]);
      axios
        .post(`${URL}/Feed/profile-upload`, fd)
        .then(res => {
            setImgUpload(res.data.imge_url);
            props.imgStore(res.data.image_url);
        })
        .catch(err => {
          console.log(error.response);
        })
    }

  }

  return(<>
  
  <h1>Video or Photo Uploading...</h1>
  <Route path='/' component={Home} exact/>
  <form>
  업로드를 시작합니다.<br/>
  <ImgInput type="file" accept="image/jpeg/jpg" onChange={isSeletedImg} />          
  </form>
  </>)
  }

export default App