import React from 'react';
import { Box,  Button,  Card, CardActions, CardContent, TextField, Typography} from "@mui/material";
import {buttons} from "../../Utils/labels";
import {buttonStyle, textFieldStyle} from "./cardStyle";



const ProductDetailsCard = () => {

    return (
       <Card sx={{ maxWidth: 400, backgroundColor: "MintCream"}}>
               <CardContent sx={{display: "flex", justifyContent:"space-between"}}>
                   <Box sx={{display: "flex", flexDirection:"column"}}>
                       <Typography gutterBottom variant="h5" component="div" sx={{color:"SeaGreen", fontWeight:"bold"}}>
                           box of chocolates
                       </Typography>
                       <Typography gutterBottom variant="body2" component="div" sx={{color:"SeaGreen"}}>
                           imported
                       </Typography>
                   </Box>
                   <Box sx={{display: "flex", flexDirection:"column"}}>
                       <Typography variant="body2" color="text.secondary" sx={{color:"SeaGreen"}}>
                           NetPrice:
                       </Typography>
                       <Typography variant="h4" color="text.secondary" sx={{color: "Chocolate"}}>
                           $16.49
                       </Typography>
                   </Box>
               </CardContent>
           <CardActions sx={{display: "flex", justifyContent:"space-between", alignItems:"center",}}>
               <TextField
                   size="small"
                   sx={textFieldStyle}
                   type="number"
                   variant="outlined"
                   label="amount"
                   value={1}
               />
                   <Button
                       color="primary"
                       sx={buttonStyle}
                   >
                       {buttons.addToBasket}
                   </Button>
           </CardActions>
       </Card>
    );
}

export default ProductDetailsCard;