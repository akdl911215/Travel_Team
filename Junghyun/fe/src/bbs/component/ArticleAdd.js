import React from 'react'

export class ArticleAdd extends React.Component { 
    constructor (props) {
        super(props)
        this.state = { value:'' }
    }

    doChange (e) {
        const newValue = e.target.value
        this.setState({value: newValue})
    }

    doSubmit (e) {
        window.alert('생성 완료: ' + this.state.value)
        e.prventDefault()
    }
   
    render () {
        const doSubmit = (e) => this.doSubmit(e)
        const doChange = (e) => this.doChange(e)

    return (

        <form onSubmit={doSubmit}>

        <input type='text'
        value={this.state.value}
        onChange={doChange} />

        <input type='submit' value='생성' />
        </form>
        )
    }
}
export default ArticleAdd;
