import React from 'react';
import { render, screen } from '@testing-library/react';
import Products from "../pages/Products";

test('renders product cards', () => {
    render(<Products />);


});