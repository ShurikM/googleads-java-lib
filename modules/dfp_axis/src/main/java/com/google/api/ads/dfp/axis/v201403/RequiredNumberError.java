/**
 * RequiredNumberError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201403;


/**
 * A list of all errors to be used in conjunction with required number
 * validators.
 */
public class RequiredNumberError  extends com.google.api.ads.dfp.axis.v201403.ApiError  implements java.io.Serializable {
    private com.google.api.ads.dfp.axis.v201403.RequiredNumberErrorReason reason;

    public RequiredNumberError() {
    }

    public RequiredNumberError(
           java.lang.String fieldPath,
           java.lang.String trigger,
           java.lang.String errorString,
           java.lang.String apiErrorType,
           com.google.api.ads.dfp.axis.v201403.RequiredNumberErrorReason reason) {
        super(
            fieldPath,
            trigger,
            errorString,
            apiErrorType);
        this.reason = reason;
    }


    /**
     * Gets the reason value for this RequiredNumberError.
     * 
     * @return reason
     */
    public com.google.api.ads.dfp.axis.v201403.RequiredNumberErrorReason getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this RequiredNumberError.
     * 
     * @param reason
     */
    public void setReason(com.google.api.ads.dfp.axis.v201403.RequiredNumberErrorReason reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequiredNumberError)) return false;
        RequiredNumberError other = (RequiredNumberError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequiredNumberError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "RequiredNumberError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "RequiredNumberError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}