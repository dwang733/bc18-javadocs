/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package bc;

public class ErrorMessage {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ErrorMessage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ErrorMessage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

//  protected void finalize() {
//    delete();
//  }
//
//  public synchronized void delete() {
//    if (swigCPtr != 0) {
//      if (swigCMemOwn) {
//        swigCMemOwn = false;
//        bcJNI.delete_ErrorMessage(swigCPtr);
//      }
//      swigCPtr = 0;
//    }
//  }

  public ErrorMessage() {
    this(bcJNI.new_ErrorMessage(), true);
  }

  public String toJson() {
    return bcJNI.ErrorMessage_toJson(swigCPtr, this);
  }

  public String toString() {
    return bcJNI.ErrorMessage_toString(swigCPtr, this);
  }

  public void setError(String value) {
    bcJNI.ErrorMessage_error_set(swigCPtr, this, value);
  }

  public String getError() {
    return bcJNI.ErrorMessage_error_get(swigCPtr, this);
  }

}
