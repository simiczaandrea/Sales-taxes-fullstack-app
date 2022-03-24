import React from 'react'
import Toolbar from "@mui/material/Toolbar";
import Box from "@mui/material/Box";
import ReceiptCard from "../components/Cards/ReceiptCard";

const ShoppingBasket = () => {
    return(
        <Box component="main" sx={{ marginLeft: 30, p: 3}}>
            <Toolbar />
            <ReceiptCard/>
        </Box>
    )
}
export default ShoppingBasket;