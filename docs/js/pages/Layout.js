import React from "react";

import Calculator from "../components/Calculator"

export default class Layout extends React.Component {
  render() {
    return (
        <div class="container">
          <h1>Simeple Calculator</h1>
          <Calculator />
        </div>
    );
  }
}