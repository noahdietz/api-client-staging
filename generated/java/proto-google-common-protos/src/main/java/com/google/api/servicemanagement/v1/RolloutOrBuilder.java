// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/resources.proto

package com.google.api.servicemanagement.v1;

public interface RolloutOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.Rollout)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional unique identifier of this Rollout. Only lower case letters, digits
   *  and '-' are allowed.
   * If not specified by client, the server will generate one. The generated id
   * will have the form of &lt;date&gt;&lt;revision number&gt;, where "date" is the create
   * date in ISO 8601 format.  "revision number" is a monotonically increasing
   * positive number that is reset every day for each service.
   * An example of the generated rollout_id is '2016-02-16r1'
   * </pre>
   *
   * <code>optional string rollout_id = 1;</code>
   */
  java.lang.String getRolloutId();
  /**
   * <pre>
   * Optional unique identifier of this Rollout. Only lower case letters, digits
   *  and '-' are allowed.
   * If not specified by client, the server will generate one. The generated id
   * will have the form of &lt;date&gt;&lt;revision number&gt;, where "date" is the create
   * date in ISO 8601 format.  "revision number" is a monotonically increasing
   * positive number that is reset every day for each service.
   * An example of the generated rollout_id is '2016-02-16r1'
   * </pre>
   *
   * <code>optional string rollout_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getRolloutIdBytes();

  /**
   * <pre>
   * Creation time of the rollout. Readonly.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp create_time = 2;</code>
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Creation time of the rollout. Readonly.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Creation time of the rollout. Readonly.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * The user who created the Rollout. Readonly.
   * </pre>
   *
   * <code>optional string created_by = 3;</code>
   */
  java.lang.String getCreatedBy();
  /**
   * <pre>
   * The user who created the Rollout. Readonly.
   * </pre>
   *
   * <code>optional string created_by = 3;</code>
   */
  com.google.protobuf.ByteString
      getCreatedByBytes();

  /**
   * <pre>
   * The status of this rollout. Readonly. In case of a failed rollout,
   * the system will automatically rollback to the current Rollout
   * version. Readonly.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.Rollout.RolloutStatus status = 4;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of this rollout. Readonly. In case of a failed rollout,
   * the system will automatically rollback to the current Rollout
   * version. Readonly.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.Rollout.RolloutStatus status = 4;</code>
   */
  com.google.api.servicemanagement.v1.Rollout.RolloutStatus getStatus();

  /**
   * <pre>
   * Google Service Control selects service configurations based on
   * traffic percentage.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.Rollout.TrafficPercentStrategy traffic_percent_strategy = 5;</code>
   */
  com.google.api.servicemanagement.v1.Rollout.TrafficPercentStrategy getTrafficPercentStrategy();
  /**
   * <pre>
   * Google Service Control selects service configurations based on
   * traffic percentage.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.Rollout.TrafficPercentStrategy traffic_percent_strategy = 5;</code>
   */
  com.google.api.servicemanagement.v1.Rollout.TrafficPercentStrategyOrBuilder getTrafficPercentStrategyOrBuilder();

  /**
   * <pre>
   * The strategy associated with a rollout to delete a `ManagedService`.
   * Readonly.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.Rollout.DeleteServiceStrategy delete_service_strategy = 200;</code>
   */
  com.google.api.servicemanagement.v1.Rollout.DeleteServiceStrategy getDeleteServiceStrategy();
  /**
   * <pre>
   * The strategy associated with a rollout to delete a `ManagedService`.
   * Readonly.
   * </pre>
   *
   * <code>optional .google.api.servicemanagement.v1.Rollout.DeleteServiceStrategy delete_service_strategy = 200;</code>
   */
  com.google.api.servicemanagement.v1.Rollout.DeleteServiceStrategyOrBuilder getDeleteServiceStrategyOrBuilder();

  /**
   * <pre>
   * The name of the service associated with this Rollout.
   * </pre>
   *
   * <code>optional string service_name = 8;</code>
   */
  java.lang.String getServiceName();
  /**
   * <pre>
   * The name of the service associated with this Rollout.
   * </pre>
   *
   * <code>optional string service_name = 8;</code>
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  public com.google.api.servicemanagement.v1.Rollout.StrategyCase getStrategyCase();
}
