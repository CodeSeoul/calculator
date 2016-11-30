import React from "react";

import CalcKey from "./CalcKey";

class CalcBoard extends React.Component {
	render() {
	  return (
	    <div id="calc-board">
	    	<div class="container-fluid">
	        <div class="row">
	        	<CalcKey type="reset" value="C" />
	        	<CalcKey type="paren" value="(" />
	        	<CalcKey type="paren" value=")" />
	          <CalcKey type="op" value="+" />
	        </div>
	        <div class="row">
	        	<CalcKey type="num" value="7" />
	        	<CalcKey type="num" value="8" />
	        	<CalcKey type="num" value="9" />
	        	<CalcKey type="op" value="-" />
	        </div>
	        <div class="row">
	        	<CalcKey type="num" value="4" />
	        	<CalcKey type="num" value="5" />
	        	<CalcKey type="num" value="6" />
	        	<CalcKey type="op" value="*" />
	        </div>
	        <div class="row">
	        	<CalcKey type="num" value="1" />
	        	<CalcKey type="num" value="2" />
	        	<CalcKey type="num" value="3" />
	        	<CalcKey type="op" value="/" />
	        </div>
	        <div class="row">
	        	<CalcKey type="num" value="." />
	        	<CalcKey type="num" value="0" />
	        	<CalcKey type="num" value="00" />
	        	<CalcKey type="eq" value="=" />
	        </div>
	      </div>
		  </div>
		 );
	}
}

export default CalcBoard;