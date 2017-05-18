// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/instance/v1/spanner_instance_admin.proto

package com.google.spanner.admin.instance.v1;

public interface DeleteInstanceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.instance.v1.DeleteInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the instance to be deleted. Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;`
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the instance to be deleted. Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;`
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
