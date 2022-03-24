import * as React from 'react';
import Box from '@mui/material/Box';
import Drawer from '@mui/material/Drawer';
import AppBar from '@mui/material/AppBar';
import CssBaseline from '@mui/material/CssBaseline';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import ListItemText from '@mui/material/ListItemText';
import {navLabel, title} from '../../Utils/labels';
import {Link} from "react-router-dom";
import StoreMallDirectoryIcon from '@mui/icons-material/StoreMallDirectory';
import ShoppingBasketIcon from '@mui/icons-material/ShoppingBasket';
import {ListItemIcon, MenuItem, MenuList} from "@mui/material";
import {useLocation} from "react-router";

const drawerWidth = 240;

const menuItem = {
    items: [
        {
            id: 1,
            data:  [navLabel.products, "/"],
            icon: <StoreMallDirectoryIcon/>
        },
        {
            id: 2,
            data: [navLabel.shoppingBasket, "/shoppingBasket"],
            icon: <ShoppingBasketIcon/>
        }
    ]
}



const SideMenu = () => {
    const location = useLocation();
    const path = location.pathname;


    return (
        <Box sx={{ display: 'flex' }}>
            <CssBaseline />
            <AppBar position="fixed" sx={{ zIndex: (theme) => theme.zIndex.drawer + 1, backgroundColor: "DarkSeaGreen" }}>
                <Toolbar>
                    <Typography variant="h5" noWrap component="div" sx={{color:"Ivory", fontWeight:"bold"}}>
                        {title}
                    </Typography>
                </Toolbar>
            </AppBar>
            <Drawer
            variant="permanent"
            sx={{
                width: drawerWidth,
                flexShrink: 0,
                [`& .MuiDrawer-paper`]: { width: drawerWidth, boxSizing: 'border-box',  backgroundColor: "Ivory"},

            }}
            >
                <Toolbar />
                <Box sx={{ overflow: 'auto' }}>
                    <MenuList>
                        {menuItem.items.map(text => (
                            <Link to={text.data[1]}  key={text.id} style={{ textDecoration: "none", color: "black"}}>
                                <MenuItem
                                    key={text.id}
                                    selected={path === text.data[1]}
                                    sx={{
                                        '& .Mui-selected': {
                                            backgroundColor: "yellow"
                                        }
                                    }}
                                >
                                    <ListItemIcon sx={{color: "SeaGreen"}}>{text.icon}</ListItemIcon>
                                    <ListItemText sx={{color: "SeaGreen"}} primary={text.data[0]} />
                                </MenuItem>
                            </Link>
                        ))}
                    </MenuList>
                </Box>
            </Drawer>
        </Box>
    );
}

export default SideMenu;
