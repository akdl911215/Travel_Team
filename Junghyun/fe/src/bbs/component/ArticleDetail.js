import React from 'react'

export class ArticleDetail extends React.Component { 
    constructor (props) {
        super(props)
        this.state = { value:'' }
    }

    doChange (e) {
        const newValue = e.target.value
        this.setState({value: newValue})
    }

    doSubmit (e) {
        window.alert('읽기 완료: ' + this.state.value)
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

        <input type='submit' value='읽기' />
        </form>
        )
    }
}

export default ArticleDetail;
