import axios from "axios";
import React, { Fragment, useEffect, useState } from "react";
import {Form ,FormGroup, Input, Container,Button} from "reactstrap";
import base_url from "../api/BootAPi";
import{ToastContainer,toast} from "react-toastify"
const Addcourse =()=>
{

useEffect(()=>{
    document.title = "Add Course || Learn With me"
},[])

const [course,setCourses] = useState({});

// from handle function

const handleFrom=(e)=>
{
    console.log(course);
    postDatatoServer(course);
    e.preventDefault();
  
}

// create function to post data on server

const postDatatoServer=(data)=>
{
    axios.post(`${base_url}/courses`,data)
    .then(
        (response)=>{
              console.log(response);
              toast.success("Course has been added succesfully");
        },
        (error)=>{
               console.log(error);
               toast.error("Somting went wrong");
        }
    );
};


    return(
        <Fragment>
            <h1 className="text-center my-3"> Fill Course Detail</h1>
            <Form onSubmit={handleFrom}>
                 <FormGroup>
                     <label for="usrId">Course Id</label>
                     <Input type="text" placeholder="Enter here" name="userId" id="userId"
                     onChange={(e)=>{
                        setCourses({...course,id:e.target.value});
                     }}
                     />
                 </FormGroup>

                 <FormGroup>
                     <label for="title">Course title</label>
                     <Input type="text" placeholder="Enter title here"  id="title"
                     onChange={(e)=>{
                        setCourses({...course,title:e.target.value});
                     }}/>
                 </FormGroup>

                 <FormGroup>
                     <label for="description">Course description</label>
                     <Input type="textarea" placeholder="Enter description"  id="description"
                     onChange={(e)=>{
                        setCourses({...course,description:e.target.value});
                     }}/>
                 </FormGroup>

                 <Container className="text-center">
                       <Button type="submit" color="success" >Add Course</Button>
                             <Button color="warning " type="reset">Clear</Button>
                 </Container>
            </Form>
        </Fragment>
        
    );
}
export default Addcourse;