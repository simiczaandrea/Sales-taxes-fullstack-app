import React from 'react';
import './App.css';
import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import Products from "./pages/Products";
import ShoppingBasket from "./pages/ShoppingBasket";
import SideMenu from "./components/navbar/sideMenü";

function App() {
  return (
      <BrowserRouter>
          <SideMenu/>
        <Routes>
          <Route path="/" element={<Products />} />
          <Route path="/shoppingBasket" element={<ShoppingBasket />} />
        </Routes>
      </BrowserRouter>
  );
}

export default App;
