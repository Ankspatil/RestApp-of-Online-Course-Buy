import React, { useState , useEffect } from "react";
import Course from "./Course";
import base_url from "../api/BootAPi";
import axios from "axios"
const AllCourses =()=>
{
  


    useEffect(()=>{
        document.title="AllCoures | Learn With Me...!!";
    },[])
//function to call server
const getAllCoursesFromServer=()=>{
    axios.get(`${base_url}/courses`).then(
        (response)=>{
           console.log(response);
           setCourses(response.data)
        },
        (error)=>{
            console.log(error); 
        }
    )
};
//call loading  server
useEffect(()=>{
    getAllCoursesFromServer();
},[]);


    const [courses,setCourses]=useState([
       
    ])
    return(
<div>
    {

     courses.length>0? courses.map((item)=>(
        <Course course={item}/>
     )) : "No courses found"

    }
</div>
    );
}
export default AllCourses;