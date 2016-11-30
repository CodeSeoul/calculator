import React from "react";

import CalcBoard from "../components/CalcBoard"
import CalcScreen from "../components/CalcScreen"

class CalculatorV2 extends React.Component {
	render() {
		return (
			<div id="calc-v2">
				<div class="page-header">
					<h1>Calculator <small>(ver. 2)</small></h1>
				</div>
				<div class="well">
					<CalcScreen />
					<div>&nbsp;</div>
					<CalcBoard />
				</div>
			</div>
		);
	}
}

export default CalculatorV2;