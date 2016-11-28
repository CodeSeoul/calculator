import React from "react";

export default class Calculator extends React.Component {
	constructor() {
		super();
		this.state = {
			operator: '+',
			first: '',
			second: '',
			answer: ''
		}
	}

	handleClick(event) {
		const op = this.state.operator;
		const fi = parseFloat(this.state.first);
		const se = parseFloat(this.state.second);
		console.log(op, fi, se);
		let answer = 0
		if (op === '+') {
			answer = fi + se;
		} else if (op === '-') {
			answer = fi - se;
		} else if (op === '*') {
			answer = fi * se;
		} else if (op === '/') {
			answer = fi / se;
		}
		this.setState({answer});
	}

	render() {
		return (
			<div class="row">
				<div class="btn-toolbar" role="toolbar">
					<div class="btn-group" role="group">
						<input value={this.state.first} onChange={(event) => this.setState({first: event.target.value})} type="number" class="form-control" id="first" placeholder="first" />
					</div>
					<div class="btn-group" role="group">
  					<select value={this.state.operator} onChange={(event) => this.setState({operator: event.target.value})} class="form-control">
						  <option>+</option>
						  <option>-</option>
						  <option>*</option>
						  <option>/</option>
						</select>
					</div>	
					<div class="btn-group" role="group">
						<input value={this.state.second} onChange={(event) => this.setState({second: event.target.value})} type="number" class="form-control" id="second" placeholder="second" />
					</div>
					<div class="btn-group" role="group">
						<button type="button" class="btn btn-default" onClick={this.handleClick.bind(this)}><b>=</b></button>
					</div>
					<div class="btn-group" role="group">
						<input value={this.state.answer} type="text" readOnly class="form-control" id="answer" placeholder="answer" />
					</div>
				</div>
			</div>
		);
	}
}