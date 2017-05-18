// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging.proto

package com.google.logging.v2;

public interface ListLogsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.ListLogsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of log names. For example,
   * `"projects/my-project/syslog"` or
   * `"organizations/123/cloudresourcemanager.googleapis.com%2Factivity"`.
   * </pre>
   *
   * <code>repeated string log_names = 3;</code>
   */
  java.util.List<java.lang.String>
      getLogNamesList();
  /**
   * <pre>
   * A list of log names. For example,
   * `"projects/my-project/syslog"` or
   * `"organizations/123/cloudresourcemanager.googleapis.com%2Factivity"`.
   * </pre>
   *
   * <code>repeated string log_names = 3;</code>
   */
  int getLogNamesCount();
  /**
   * <pre>
   * A list of log names. For example,
   * `"projects/my-project/syslog"` or
   * `"organizations/123/cloudresourcemanager.googleapis.com%2Factivity"`.
   * </pre>
   *
   * <code>repeated string log_names = 3;</code>
   */
  java.lang.String getLogNames(int index);
  /**
   * <pre>
   * A list of log names. For example,
   * `"projects/my-project/syslog"` or
   * `"organizations/123/cloudresourcemanager.googleapis.com%2Factivity"`.
   * </pre>
   *
   * <code>repeated string log_names = 3;</code>
   */
  com.google.protobuf.ByteString
      getLogNamesBytes(int index);

  /**
   * <pre>
   * If there might be more results than those appearing in this response, then
   * `nextPageToken` is included.  To get the next set of results, call this
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * If there might be more results than those appearing in this response, then
   * `nextPageToken` is included.  To get the next set of results, call this
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
