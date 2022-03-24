
export const textFieldStyle = {
    width: 80, textAlign:"center",
    '&:hover': {
        color:"Teal",
    },
    '& label': {
        color: "SeaGreen",
    },
    '& .MuiFormLabel-root.Mui-focused': {
        color: "SeaGreen",
    },
    '& .MuiOutlinedInput-root': {
        '& fieldset': {
            borderColor: 'SeaGreen',
            borderWidth: '2px',
        },
        '&:hover fieldset': {
            borderColor: 'SeaGreen',
            borderWidth: '2px',
        },
        '& .Mui-focused fieldset': {
            borderColor: 'SeaGreen',
        },
        '& .MuiInputBase-input': {
            color: 'SeaGreen',
        },
    },
}

export const buttonStyle = {
    color:"LightGreen",
    backgroundColor:"Teal",
    '&:hover': {
        color:"Teal",
        backgroundColor:"LightGreen",
    },
    fontWeight:"bold"
}