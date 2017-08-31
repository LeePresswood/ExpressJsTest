var express = require('express');
var bodyParser = require('body-parser');
var path = require('path');

var app = express();

// var logger = function(req, res, next){
//     console.log('Logging...');
//     next();
// };

//View Engine
app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));

//Body Parser Middleware
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended : false}));

//Set Static Path
// app.use(express.static(path.join(__dirname, 'public')));

// var people = [
//     {
//         name : 'Jeff',
//         age : 30
//     },
//     {
//         name : 'Sarah',
//         age : 22
//     },
//     {
//         name : 'Bill',
//         age : 40
//     },
// ];
//
// app.get('/', function(req, res){
//     res.json(people);
// });

app.get('/', function(req, res){
    res.render('index');
});

app.listen(3000, function(){
    console.log('Server started on port 3000');
});