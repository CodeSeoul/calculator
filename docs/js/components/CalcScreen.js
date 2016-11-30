import React from "react";

class CalcScreen extends React.Component {
	render() {
	  return (
  		<div class="calc-screen container-fluid">
	      <div class="row">
	        <input type="text" class="form-control input-lg" value={this.props.text} />
	      </div>
      </div>
		);
	}
}

export default CalcScreen;