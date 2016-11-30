import React from "react";

import CalcBoard from "../components/CalcBoard"
import CalcScreen from "../components/CalcScreen"

class CalculatorV2 extends React.Component {
	constructor() {
		super();
		this.state = {
			text: ''
		};
	}

	updateScreen(key) {
		let newText = this.state.text;
		if (key == '=') {
			newText = 'calculating...';
		} else if (key == 'C') {
			newText = '';
		} else {
			newText += key;
		}
		this.setState({
			text: newText
		});
	}

	render() {
		return (
			<div id="calc-v2">
				<div class="page-header">
					<h1>Calculator <small>(ver. 2)</small></h1>
				</div>
				<div class="well">
					<CalcScreen text={this.state.text} />
					<div>&nbsp;</div>
					<CalcBoard updateScreen={this.updateScreen.bind(this)} />
				</div>
			</div>
		);
	}
}

export default CalculatorV2;