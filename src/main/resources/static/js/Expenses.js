import React, {Component} from 'react' ;
import AppNav from './AppNav' ;
import DatePicker from 'react-datepicker';
import './App.css';
import "react-datepicker/dist/react-datepicker.css";

class Expenses extends Component {
    state = { }

    handleChange
    render() {
        return (
            <div>
                <AppNav/>
                <Container>

                    <Form>
                        <FormGroup>
                            <label for="title">Title</label>
                            <input type="text" name="title" id ="title" onChange={this.handleChange}></>
                        </FormGroup>

                        <FormGroup>
                            <label for="category">Category</label>
                            <input type="text" name="category" id ="category" onChange={this.handleChange}></>
                        </FormGroup>

                    </Form>



                </Container>
            </div>
        );

    }
    }

    export default Expenses;
