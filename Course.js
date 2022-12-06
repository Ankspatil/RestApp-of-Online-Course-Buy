import axios from "axios";
import React from "react";
import { toast } from "react-toastify";
import{
    Card,
    CardBody,
    CardTitle,
    CardSubtitle,
    CardText,
    CardFooter,
    Button,
    Container,
} from "reactstrap";
import base_url from "../api/BootAPi";

const Course =({course})=>
{
    const deleteCourse=(id)=>{
        axios.delete(`${base_url}/courses/${id}`).then(
            (response)=>{
                toast.success("Course deleted")

            },
            (error)=>{
                toast.error("Course not delete because Server problem")
            }
        )
    }
return(
    <Card className="text-center">
        <CardBody>
            <CardSubtitle className="font-weight-bold">{course.title}</CardSubtitle>
            <CardText>{course.description}</CardText>
            <Container className="text-center">
                <Button color="danger" onClick={()=>{deleteCourse(course.id);}}>Delete</Button>
                <Button color="warning ml-9" >Update</Button>
            </Container>
        </CardBody>
    </Card>
)
}
export default Course;