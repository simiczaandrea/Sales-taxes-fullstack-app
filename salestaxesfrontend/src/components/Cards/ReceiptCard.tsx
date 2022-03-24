import React from 'react';
import {Button, Card, CardActions, CardContent, Divider, Grid, Typography} from "@mui/material";
import {buttons} from "../../Utils/labels";
import {buttonStyle} from "./cardStyle";

const ReceiptCard = () => {


    return (
        <Card sx={{ maxWidth: 400, backgroundColor: "MintCream"}}>
            <CardContent sx={{display: "flex", flexDirection: "column"}}>
                <Grid container sx={{marginBottom: 2}}>
                    <Grid item xs={2}>
                        <Typography variant="body1" component="p" sx={{color:"SeaGreen"}}>
                           1
                        </Typography>
                    </Grid>
                    <Grid item xs={7}>
                        <Typography variant="body1" component="p" sx={{color:"SeaGreen"}}>
                            music CD
                        </Typography>
                    </Grid>
                    <Grid item xs={3}  sx={{textAlign:"right"}}>
                        <Typography variant="body1" component="p" sx={{color:"SeaGreen"}}>
                            16.99
                        </Typography>
                    </Grid>
                </Grid>
                <Grid container>
                    <Grid item xs={9}>
                        <Typography variant="body1" component="p" sx={{color:"SeaGreen"}}>
                            Sales taxes:
                        </Typography>
                    </Grid>
                    <Grid item xs={3}  sx={{textAlign:"right"}}>
                        <Typography variant="body1" component="p" sx={{color:"SeaGreen"}}>
                            1.50
                        </Typography>
                    </Grid>
                </Grid>
                <Divider/>
                <Grid container sx={{marginTop: 2}}>
                    <Grid item xs={9}>
                        <Typography variant="h5" component="h6" sx={{color:"SeaGreen", fontWeight:"bold"}}>
                            Total:
                        </Typography>
                    </Grid>
                    <Grid item xs={3} sx={{textAlign:"right"}}>
                        <Typography variant="h5" component="h6" sx={{color:"SeaGreen", fontWeight:"bold"}}>
                            16.99
                        </Typography>
                    </Grid>
                </Grid>
            </CardContent>
            <CardActions sx={{display: "flex", justifyContent: "flex-end"}}>
                <Button
                    color="primary"
                    sx={buttonStyle}
                >
                    {buttons.clearBasket}
                </Button>
            </CardActions>
        </Card>
    );
}

export default ReceiptCard;