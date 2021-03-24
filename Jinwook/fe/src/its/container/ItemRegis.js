const { default: axios } = require("axios")

const ItemRegis = () =>{
    const itemRegister = () => {
        alert('클릭1')
        axios.get(`http://localhost:8080/saleItems/itsCreate`)
        .then(res =>{
            alert(`res: ${JSON.stringify(res.data)}`)
        })
        .catch(err => {
            alert(`err: ${err}`)
        })
    }
    return(<>
    <div>
    <button onClick={itemRegister}>button</button>
    </div>
    </>)
}
export default ItemRegis;