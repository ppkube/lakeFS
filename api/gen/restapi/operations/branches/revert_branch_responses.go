// Code generated by go-swagger; DO NOT EDIT.

package branches

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"net/http"

	"github.com/go-openapi/runtime"

	"github.com/treeverse/lakefs/api/gen/models"
)

// RevertBranchNoContentCode is the HTTP code returned for type RevertBranchNoContent
const RevertBranchNoContentCode int = 204

/*RevertBranchNoContent reverted

swagger:response revertBranchNoContent
*/
type RevertBranchNoContent struct {
}

// NewRevertBranchNoContent creates RevertBranchNoContent with default headers values
func NewRevertBranchNoContent() *RevertBranchNoContent {

	return &RevertBranchNoContent{}
}

// WriteResponse to the client
func (o *RevertBranchNoContent) WriteResponse(rw http.ResponseWriter, producer runtime.Producer) {

	rw.Header().Del(runtime.HeaderContentType) //Remove Content-Type on empty responses

	rw.WriteHeader(204)
}

// RevertBranchUnauthorizedCode is the HTTP code returned for type RevertBranchUnauthorized
const RevertBranchUnauthorizedCode int = 401

/*RevertBranchUnauthorized Unauthorized

swagger:response revertBranchUnauthorized
*/
type RevertBranchUnauthorized struct {

	/*
	  In: Body
	*/
	Payload *models.Error `json:"body,omitempty"`
}

// NewRevertBranchUnauthorized creates RevertBranchUnauthorized with default headers values
func NewRevertBranchUnauthorized() *RevertBranchUnauthorized {

	return &RevertBranchUnauthorized{}
}

// WithPayload adds the payload to the revert branch unauthorized response
func (o *RevertBranchUnauthorized) WithPayload(payload *models.Error) *RevertBranchUnauthorized {
	o.Payload = payload
	return o
}

// SetPayload sets the payload to the revert branch unauthorized response
func (o *RevertBranchUnauthorized) SetPayload(payload *models.Error) {
	o.Payload = payload
}

// WriteResponse to the client
func (o *RevertBranchUnauthorized) WriteResponse(rw http.ResponseWriter, producer runtime.Producer) {

	rw.WriteHeader(401)
	if o.Payload != nil {
		payload := o.Payload
		if err := producer.Produce(rw, payload); err != nil {
			panic(err) // let the recovery middleware deal with this
		}
	}
}

// RevertBranchNotFoundCode is the HTTP code returned for type RevertBranchNotFound
const RevertBranchNotFoundCode int = 404

/*RevertBranchNotFound commit/branch not found

swagger:response revertBranchNotFound
*/
type RevertBranchNotFound struct {

	/*
	  In: Body
	*/
	Payload *models.Error `json:"body,omitempty"`
}

// NewRevertBranchNotFound creates RevertBranchNotFound with default headers values
func NewRevertBranchNotFound() *RevertBranchNotFound {

	return &RevertBranchNotFound{}
}

// WithPayload adds the payload to the revert branch not found response
func (o *RevertBranchNotFound) WithPayload(payload *models.Error) *RevertBranchNotFound {
	o.Payload = payload
	return o
}

// SetPayload sets the payload to the revert branch not found response
func (o *RevertBranchNotFound) SetPayload(payload *models.Error) {
	o.Payload = payload
}

// WriteResponse to the client
func (o *RevertBranchNotFound) WriteResponse(rw http.ResponseWriter, producer runtime.Producer) {

	rw.WriteHeader(404)
	if o.Payload != nil {
		payload := o.Payload
		if err := producer.Produce(rw, payload); err != nil {
			panic(err) // let the recovery middleware deal with this
		}
	}
}

/*RevertBranchDefault generic error response

swagger:response revertBranchDefault
*/
type RevertBranchDefault struct {
	_statusCode int

	/*
	  In: Body
	*/
	Payload *models.Error `json:"body,omitempty"`
}

// NewRevertBranchDefault creates RevertBranchDefault with default headers values
func NewRevertBranchDefault(code int) *RevertBranchDefault {
	if code <= 0 {
		code = 500
	}

	return &RevertBranchDefault{
		_statusCode: code,
	}
}

// WithStatusCode adds the status to the revert branch default response
func (o *RevertBranchDefault) WithStatusCode(code int) *RevertBranchDefault {
	o._statusCode = code
	return o
}

// SetStatusCode sets the status to the revert branch default response
func (o *RevertBranchDefault) SetStatusCode(code int) {
	o._statusCode = code
}

// WithPayload adds the payload to the revert branch default response
func (o *RevertBranchDefault) WithPayload(payload *models.Error) *RevertBranchDefault {
	o.Payload = payload
	return o
}

// SetPayload sets the payload to the revert branch default response
func (o *RevertBranchDefault) SetPayload(payload *models.Error) {
	o.Payload = payload
}

// WriteResponse to the client
func (o *RevertBranchDefault) WriteResponse(rw http.ResponseWriter, producer runtime.Producer) {

	rw.WriteHeader(o._statusCode)
	if o.Payload != nil {
		payload := o.Payload
		if err := producer.Produce(rw, payload); err != nil {
			panic(err) // let the recovery middleware deal with this
		}
	}
}
