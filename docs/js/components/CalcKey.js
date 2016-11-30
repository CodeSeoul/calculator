import React from "react";

class CalcKey extends React.Component {
	constructor() {
		super();
		this.classMap = {
			num: 'btn btn-default',
			op: 'btn btn-success',
			paren: 'btn btn-warning',
			eq: 'btn btn-primary',
			reset: 'btn btn-danger',
		};
	}

	handleClick(event) {
		console.log(this.props.value + " clicked.");
		this.props.click(this.props.value);
	}

	render() {
		return (
			<button class={this.classMap[this.props.type]} onClick={this.handleClick.bind(this)}>{this.props.value}</button>
		);
	}
}

export default CalcKey;