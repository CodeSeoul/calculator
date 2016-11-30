import React from "react";

import Calculator from "../components/Calculator"
import CalculatorV2 from "./CalculatorV2"

export default class Layout extends React.Component {
  render() {
    return (
        <div class="container">
          <Calculator />
          <hr />
          <CalculatorV2 />
        </div>
    );
  }
}