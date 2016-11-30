import React from "react";

import CalcKey from "./CalcKey";
import {KEYS} from "../models/Keys";

class CalcBoard extends React.Component {
	constructor(props) {
		super(props);

		this.calcKeys = KEYS.map(k => 
			<CalcKey key={k.idx} type={k.type} value={k.value} click={this.props.updateScreen} />
		);
	}

	render() {
	  return (
	    <div id="calc-board">
	    	<div class="container-fluid">
	        <div class="row">
	        	{this.calcKeys.slice(0, 4)}
	        </div>
	        <div class="row">
	        	{this.calcKeys.slice(4, 8)}
	        </div>
	        <div class="row">
	        	{this.calcKeys.slice(8, 12)}
	        </div>
	        <div class="row">
	        	{this.calcKeys.slice(12, 16)}
	        </div>
	        <div class="row">
	        	{this.calcKeys.slice(16, 20)}
	        </div>
	      </div>
		  </div>
		 );
	}
}

export default CalcBoard;