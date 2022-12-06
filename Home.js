import React, {useEffect} from "react";
import { Container } from "reactstrap";
import {Button} from "reactstrap"
import{ToastContainer,toast} from "react-toastify"
const Home = () =>
{

    useEffect(()=>{
        document.title="Home | Learn With Me..!";
    },[]);



    return(

        <div className="text-center">
         <h1>Learn With Me </h1>
<p>  Hello Geeks I Have All Courses That Need To Become Full-Stack-Developer</p>
<p> Please Visit On Our Courses</p>
<p>Thank You</p>
<ToastContainer />
<Button color="primary" outline size="lg"  >Start Here</Button>

        </div>
    );
}
export default Home;