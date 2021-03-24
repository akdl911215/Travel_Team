import { useState } from "react"

import React, {useState}  from 'react';

const ItemRegisterForm = () => {
    const itemRegister = () => {
        alert('클릭1')
        axios.post(`http://localhost:8080/saleItems/register`)
        .then(res =>{
            alert(`res: ${JSON.stringify(res.data)}`)
        })
        .catch(err => {
            alert(`err: ${err}`)
        })
    }
    return(<>
   <form>
    <h3>판매 상품 등록하기</h3>
    <table>
      <tr>
        <td>제목</td>
        <td><input type="text"/></td>
      </tr>
      <tr>
        <td>작성자</td>
        <td><input type="text"/></td>
      </tr>
      <tr>
        <td>태그</td>
        <td><input type="text"/></td>
      </tr>
      <tr>
        <td>사진</td>
        <td><input type="file"/></td>
      </tr>
      <tr>
        <td>본문</td>
        <td><textarea rows="5"></textarea></td>
      </tr>
      <tr>
        <td>가격</td>
        <td><input type="text"/></td>
      </tr>
    </table>

    <div>
      <button onClick={itemRegister}>등록</button>
      <Link to="/">
        취소
      </Link>
    </div>
  </form>
    </>)
}

export default ItemRegisterForm