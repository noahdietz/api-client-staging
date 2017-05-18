// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1/language_service.proto

package com.google.cloud.language.v1;

public interface TextSpanOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1.TextSpan)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The content of the output text.
   * </pre>
   *
   * <code>optional string content = 1;</code>
   */
  java.lang.String getContent();
  /**
   * <pre>
   * The content of the output text.
   * </pre>
   *
   * <code>optional string content = 1;</code>
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * The API calculates the beginning offset of the content in the original
   * document according to the [EncodingType][google.cloud.language.v1.EncodingType] specified in the API request.
   * </pre>
   *
   * <code>optional int32 begin_offset = 2;</code>
   */
  int getBeginOffset();
}
