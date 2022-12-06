import logo from './logo.svg';
import './App.css';
import {Button ,Container,Row,Col ,exact,component} from "reactstrap";


import Home  from './Component/Home';
import Header from './Component/Header';
import Course from './Component/Course';
import AllCourses from './Component/AllCousres';
import Addcourse from './Component/Addcourse';
import Menus from './Component/Menus';
import {BrowserRouter as Router,Route,Routes} from "react-router-dom"
import{ToastContainer,toast} from "react-toastify"
function App() {
  
 
  
  return ( 

<div>
  <Router>
<Container>
       <Header/>
      <Row>
      <Col md={4} ><Menus /></Col>
      <Col md={8}>
         
        
       
         <Routes>
           <Route exact  path="/" element = {<Home />}/> 
           <Route exact path="/add-course" element = {<Addcourse />}/>  
           <Route  exact path="/view-courses" element = {<AllCourses />}/> 
           </Routes>
           
         </Col>
      </Row>
      </Container>
      </Router>
      </div>
  
  );
}
export default App;
