import React, { Component, PropTypes } from 'react';
import Categories from './mainSector/Categories';
import MainBanner from './mainSector/MainBanner';
import MainSearch from './mainSector/MainSearch';

export default class MainSection extends Component {
  constructor() {
    super();
  }

  render() {
    const { onClick, color } = this.props;

    return (
    <div className="main-section">
      <div className="containers">
        <Categories />
        <div className="right-banner">
            <MainSearch />
            <MainBanner />
        </div>
    </div>
</div>
    );
  }
}
