import React from 'react'
import Box from "@mui/material/Box";
import Toolbar from "@mui/material/Toolbar";
import ProductDetailsCard from "../components/Cards/ProductDetailsCard";

const Products = () => {

    return(
        <Box component="main" sx={{ marginLeft: 30, p: 3}}>
            <Toolbar />
            <ProductDetailsCard />
        </Box>
    )
}

export default Products;