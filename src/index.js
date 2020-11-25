const yargs = require("yargs")  
const path = require('path')
const express = require('express')
const hbs = require('hbs')

const app = express()
const port = 3000

const publicDirectory = path.join(__dirname, '../public')
const viewsPath = path.join(__dirname, '../templates/views')
const partialsPath = path.join(__dirname,'../templates/partials')

app.set('view engine','hbs')
app.set('views', viewsPath)
hbs.registerPartials(partialsPath)

//Setip static directory to serve
app.use(express.static(publicDirectory))

app.get('',(req,res)=>{
    res.render('index')
})

app.get('/pvse',(req,res)=>{
    res.render('pvse')
})

app.listen(port, ()=>{
    console.log('Server is up on port ' + port)
})