import Layout from "../../../lib/components/layout";
import React, {useRef, useState} from "react";
import {Redirect, Route} from "react-router-dom";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import Card from "react-bootstrap/Card";
import Form from "react-bootstrap/Form";
import {auth} from "../../../lib/api";
import {ActionGroup, ActionsBar, Error} from "../../../lib/components/controls";
import Button from "react-bootstrap/Button";
import {useRouter} from "../../../lib/hooks/router";
import jwt_decode from "jwt-decode";

const TOKEN_PARAM_NAME = "token";

const CreateUserWithPasswordForm = ({token}) => {

    const router = useRouter();
    const decoded = jwt_decode.decode(token);

    const onConfirmPasswordChange = () => {
        setPwdConfirmValid(true)
        if (newPwdField.current !== null) {
            const isPasswordMatch = newPwdField.current.value === confirmPasswordField.current.value;
            setPwdConfirmValid(isPasswordMatch);
            setFormValid(isPasswordMatch)
        }
    };

    const [formValid, setFormValid] = useState(false);
    const [pwdConfirmValid, setPwdConfirmValid] = useState(null);

    const [createUserError, setCreateUserError] = useState(null);
    const newPwdField = useRef(null);
    const confirmPasswordField = useRef(null);

    return (
        <Row>
            <Col md={{offset: 4, span: 4}}>
                <div className="invited-welcome-msg">
                    <div className="title">
                        Welcome to the lake!
                    </div>
                    <div className="body">
                        You were invited to use lakeFS Cloud!
                    </div>
                </div>
                <Card className="create-invited-user-widget">
                    <Card.Header>Activate User</Card.Header>
                    <Card.Body>
                        <Form onSubmit={async (e) => {
                            e.preventDefault()
                            try {
                                setCreateUserError(null);
                                //TODO: call the right backend here
                                await auth.updatePasswordByToken(token, e.target.newPassword.value)
                                router.push("/auth/login");
                            } catch (err) {
                                setCreateUserError(err);
                            }
                        }}>
                            <Form.Group controlId="invitedEmail">
                                <Form.Control type="text" placeholder={decoded.email} disabled={true}/>
                            </Form.Group>

                            <Form.Group controlId="password">
                                <Form.Control type="password" placeholder="Password" ref={newPwdField}/>
                            </Form.Group>

                            <Form.Group controlId="confirmPassword">
                                <Form.Control type="password" placeholder="Confirm Password" ref={confirmPasswordField} onChange={onConfirmPasswordChange}/>
                                {pwdConfirmValid === false &&
                                <Form.Text className="text-danger">
                                    Your password and confirmation password do not match.
                                </Form.Text>
                                }
                            </Form.Group>

                            {(!!createUserError) && <Error error={createUserError}/>}
                        </Form>
                    </Card.Body>
                </Card>
                <ActionsBar>
                    <ActionGroup orientation="right">
                        <Button type="submit" className="create-user" disabled={!formValid}>Create</Button>
                        <Button className="cancel-create-user" onClick={() => {router.push("/auth/login");}}>Cancel</Button>
                    </ActionGroup>
                </ActionsBar>
            </Col>
        </Row>
    );
}


export const CreateUserPage = () => {
    let queryString = window.location.search;
    let params = new URLSearchParams(queryString);
    const token = params.get(TOKEN_PARAM_NAME);

    return (
        <Layout>
            {
                !!token ?
                    <CreateUserWithPasswordForm token={token}/> :
                    <Route>
                        <Redirect to="/auth/login"/>
                    </Route>
            }
        </Layout>
    );
};

export default CreateUserPage;