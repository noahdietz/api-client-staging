// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/notification_service.proto

package com.google.monitoring.v3;

public final class NotificationServiceProto {
  private NotificationServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_GetNotificationChannelDescriptorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetNotificationChannelDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_CreateNotificationChannelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateNotificationChannelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_ListNotificationChannelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListNotificationChannelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_ListNotificationChannelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListNotificationChannelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_GetNotificationChannelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetNotificationChannelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_DeleteNotificationChannelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_DeleteNotificationChannelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_SendNotificationChannelVerificationCodeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_SendNotificationChannelVerificationCodeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/monitoring/v3/notification_serv" +
      "ice.proto\022\024google.monitoring.v3\032\034google/" +
      "api/annotations.proto\032\'google/monitoring" +
      "/v3/notification.proto\032\033google/protobuf/" +
      "empty.proto\032 google/protobuf/field_mask." +
      "proto\032\037google/protobuf/timestamp.proto\"`" +
      "\n)ListNotificationChannelDescriptorsRequ" +
      "est\022\014\n\004name\030\004 \001(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\n" +
      "page_token\030\003 \001(\t\"\227\001\n*ListNotificationCha" +
      "nnelDescriptorsResponse\022P\n\023channel_descr",
      "iptors\030\001 \003(\01323.google.monitoring.v3.Noti" +
      "ficationChannelDescriptor\022\027\n\017next_page_t" +
      "oken\030\002 \001(\t\"7\n\'GetNotificationChannelDesc" +
      "riptorRequest\022\014\n\004name\030\003 \001(\t\"y\n CreateNot" +
      "ificationChannelRequest\022\014\n\004name\030\003 \001(\t\022G\n" +
      "\024notification_channel\030\002 \001(\0132).google.mon" +
      "itoring.v3.NotificationChannel\"x\n\037ListNo" +
      "tificationChannelsRequest\022\014\n\004name\030\005 \001(\t\022" +
      "\016\n\006filter\030\006 \001(\t\022\020\n\010order_by\030\007 \001(\t\022\021\n\tpag" +
      "e_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\"\205\001\n Lis",
      "tNotificationChannelsResponse\022H\n\025notific" +
      "ation_channels\030\003 \003(\0132).google.monitoring" +
      ".v3.NotificationChannel\022\027\n\017next_page_tok" +
      "en\030\002 \001(\t\"-\n\035GetNotificationChannelReques" +
      "t\022\014\n\004name\030\003 \001(\t\"\234\001\n UpdateNotificationCh" +
      "annelRequest\022/\n\013update_mask\030\002 \001(\0132\032.goog" +
      "le.protobuf.FieldMask\022G\n\024notification_ch" +
      "annel\030\003 \001(\0132).google.monitoring.v3.Notif" +
      "icationChannel\"?\n DeleteNotificationChan" +
      "nelRequest\022\014\n\004name\030\003 \001(\t\022\r\n\005force\030\005 \001(\010\"",
      ">\n.SendNotificationChannelVerificationCo" +
      "deRequest\022\014\n\004name\030\001 \001(\t\"n\n-GetNotificati" +
      "onChannelVerificationCodeRequest\022\014\n\004name" +
      "\030\001 \001(\t\022/\n\013expire_time\030\002 \001(\0132\032.google.pro" +
      "tobuf.Timestamp\"o\n.GetNotificationChanne" +
      "lVerificationCodeResponse\022\014\n\004code\030\001 \001(\t\022" +
      "/\n\013expire_time\030\002 \001(\0132\032.google.protobuf.T" +
      "imestamp\">\n VerifyNotificationChannelReq" +
      "uest\022\014\n\004name\030\001 \001(\t\022\014\n\004code\030\002 \001(\t2\273\020\n\032Not" +
      "ificationChannelService\022\345\001\n\"ListNotifica",
      "tionChannelDescriptors\022?.google.monitori" +
      "ng.v3.ListNotificationChannelDescriptors" +
      "Request\032@.google.monitoring.v3.ListNotif" +
      "icationChannelDescriptorsResponse\"<\202\323\344\223\002" +
      "6\0224/v3/{name=projects/*}/notificationCha" +
      "nnelDescriptors\022\326\001\n GetNotificationChann" +
      "elDescriptor\022=.google.monitoring.v3.GetN" +
      "otificationChannelDescriptorRequest\0323.go" +
      "ogle.monitoring.v3.NotificationChannelDe" +
      "scriptor\">\202\323\344\223\0028\0226/v3/{name=projects/*/n",
      "otificationChannelDescriptors/*}\022\275\001\n\030Lis" +
      "tNotificationChannels\0225.google.monitorin" +
      "g.v3.ListNotificationChannelsRequest\0326.g" +
      "oogle.monitoring.v3.ListNotificationChan" +
      "nelsResponse\"2\202\323\344\223\002,\022*/v3/{name=projects" +
      "/*}/notificationChannels\022\256\001\n\026GetNotifica" +
      "tionChannel\0223.google.monitoring.v3.GetNo" +
      "tificationChannelRequest\032).google.monito" +
      "ring.v3.NotificationChannel\"4\202\323\344\223\002.\022,/v3" +
      "/{name=projects/*/notificationChannels/*",
      "}\022\310\001\n\031CreateNotificationChannel\0226.google" +
      ".monitoring.v3.CreateNotificationChannel" +
      "Request\032).google.monitoring.v3.Notificat" +
      "ionChannel\"H\202\323\344\223\002B\"*/v3/{name=projects/*" +
      "}/notificationChannels:\024notification_cha" +
      "nnel\022\337\001\n\031UpdateNotificationChannel\0226.goo" +
      "gle.monitoring.v3.UpdateNotificationChan" +
      "nelRequest\032).google.monitoring.v3.Notifi" +
      "cationChannel\"_\202\323\344\223\002Y2A/v3/{notification" +
      "_channel.name=projects/*/notificationCha",
      "nnels/*}:\024notification_channel\022\241\001\n\031Delet" +
      "eNotificationChannel\0226.google.monitoring" +
      ".v3.DeleteNotificationChannelRequest\032\026.g" +
      "oogle.protobuf.Empty\"4\202\323\344\223\002.*,/v3/{name=" +
      "projects/*/notificationChannels/*}\022\325\001\n\'S" +
      "endNotificationChannelVerificationCode\022D" +
      ".google.monitoring.v3.SendNotificationCh" +
      "annelVerificationCodeRequest\032\026.google.pr" +
      "otobuf.Empty\"L\202\323\344\223\002F\"A/v3/{name=projects" +
      "/*/notificationChannels/*}:sendVerificat",
      "ionCode:\001*\022\200\002\n&GetNotificationChannelVer" +
      "ificationCode\022C.google.monitoring.v3.Get" +
      "NotificationChannelVerificationCodeReque" +
      "st\032D.google.monitoring.v3.GetNotificatio" +
      "nChannelVerificationCodeResponse\"K\202\323\344\223\002E" +
      "\"@/v3/{name=projects/*/notificationChann" +
      "els/*}:getVerificationCode:\001*\022\276\001\n\031Verify" +
      "NotificationChannel\0226.google.monitoring." +
      "v3.VerifyNotificationChannelRequest\032).go" +
      "ogle.monitoring.v3.NotificationChannel\">",
      "\202\323\344\223\0028\"3/v3/{name=projects/*/notificatio" +
      "nChannels/*}:verify:\001*B\260\001\n\030com.google.mo" +
      "nitoring.v3B\030NotificationServiceProtoP\001Z" +
      ">google.golang.org/genproto/googleapis/m" +
      "onitoring/v3;monitoring\252\002\032Google.Cloud.M" +
      "onitoring.V3\312\002\032Google\\Cloud\\Monitoring\\V" +
      "3b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.monitoring.v3.NotificationProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsRequest_descriptor,
        new java.lang.String[] { "Name", "PageSize", "PageToken", });
    internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsResponse_descriptor,
        new java.lang.String[] { "ChannelDescriptors", "NextPageToken", });
    internal_static_google_monitoring_v3_GetNotificationChannelDescriptorRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_GetNotificationChannelDescriptorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_GetNotificationChannelDescriptorRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_monitoring_v3_CreateNotificationChannelRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_CreateNotificationChannelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_CreateNotificationChannelRequest_descriptor,
        new java.lang.String[] { "Name", "NotificationChannel", });
    internal_static_google_monitoring_v3_ListNotificationChannelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_v3_ListNotificationChannelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_ListNotificationChannelsRequest_descriptor,
        new java.lang.String[] { "Name", "Filter", "OrderBy", "PageSize", "PageToken", });
    internal_static_google_monitoring_v3_ListNotificationChannelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_v3_ListNotificationChannelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_ListNotificationChannelsResponse_descriptor,
        new java.lang.String[] { "NotificationChannels", "NextPageToken", });
    internal_static_google_monitoring_v3_GetNotificationChannelRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_monitoring_v3_GetNotificationChannelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_GetNotificationChannelRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_descriptor,
        new java.lang.String[] { "UpdateMask", "NotificationChannel", });
    internal_static_google_monitoring_v3_DeleteNotificationChannelRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_monitoring_v3_DeleteNotificationChannelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_DeleteNotificationChannelRequest_descriptor,
        new java.lang.String[] { "Name", "Force", });
    internal_static_google_monitoring_v3_SendNotificationChannelVerificationCodeRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_monitoring_v3_SendNotificationChannelVerificationCodeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_SendNotificationChannelVerificationCodeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_descriptor,
        new java.lang.String[] { "Name", "ExpireTime", });
    internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_descriptor,
        new java.lang.String[] { "Code", "ExpireTime", });
    internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_descriptor,
        new java.lang.String[] { "Name", "Code", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.monitoring.v3.NotificationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
