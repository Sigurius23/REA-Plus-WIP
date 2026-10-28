.class public interface abstract Llive/hms/video/signal/ISignal;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/events/IAnalyticsTransport;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/signal/ISignal$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00dc\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008JF\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J.\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0017\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u000e\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH&\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u00a6@\u00a2\u0006\u0004\u0008!\u0010\"J\u001d\u0010#\u001a\u00020\u00042\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H&\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u000bH&\u00a2\u0006\u0004\u0008&\u0010\'J(\u0010+\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008+\u0010,J*\u00100\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0008\u0010/\u001a\u0004\u0018\u00010.H\u00a6@\u00a2\u0006\u0004\u00080\u00101J \u00104\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u00084\u00105J \u00107\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0004\u00087\u00108J(\u0010<\u001a\u00020\u00042\u0006\u0010:\u001a\u0002092\u0006\u00102\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0004\u0008<\u0010=JD\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u000b2\u0008\u0010?\u001a\u0004\u0018\u00010>2\u0008\u0010@\u001a\u0004\u0018\u00010\u00022\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142\u0006\u0010/\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008<\u0010BJ\u0018\u0010E\u001a\u00020\u00042\u0006\u0010D\u001a\u00020CH\u00a6@\u00a2\u0006\u0004\u0008E\u0010FJ\u001a\u0010H\u001a\u00020\u00042\u0008\u0010D\u001a\u0004\u0018\u00010GH\u00a6@\u00a2\u0006\u0004\u0008H\u0010IJ\u001a\u0010J\u001a\u00020\u00042\u0008\u0010D\u001a\u0004\u0018\u00010GH\u00a6@\u00a2\u0006\u0004\u0008J\u0010IJ\u0010\u0010K\u001a\u00020\u0004H\u00a6@\u00a2\u0006\u0004\u0008K\u0010LJ\u0018\u0010M\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008M\u0010\u0006J\u0018\u0010O\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008O\u0010\u0006J\u001a\u0010R\u001a\u00020Q2\u0008\u0010P\u001a\u0004\u0018\u00010\u0002H\u00a6@\u00a2\u0006\u0004\u0008R\u0010\u0006J\"\u0010U\u001a\u00020T2\u0006\u0010P\u001a\u00020\u00022\u0008\u0010N\u001a\u0004\u0018\u00010SH\u00a6@\u00a2\u0006\u0004\u0008U\u0010VJ\u001e\u0010Y\u001a\u00020\u00042\u000c\u0010X\u001a\u0008\u0012\u0004\u0012\u00020W0\u0014H\u00a6@\u00a2\u0006\u0004\u0008Y\u0010ZJ6\u0010`\u001a\u00020\u00042\u000c\u0010\\\u001a\u0008\u0012\u0004\u0012\u00020[0\u00142\u0006\u0010]\u001a\u00020[2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020^H\u00a6@\u00a2\u0006\u0004\u0008`\u0010aJ\u001e\u0010d\u001a\u00020c2\u000c\u0010b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0014H\u00a6@\u00a2\u0006\u0004\u0008d\u0010ZJ\u0018\u0010g\u001a\u00020f2\u0006\u0010\u001f\u001a\u00020eH\u00a6@\u00a2\u0006\u0004\u0008g\u0010hJ\u0018\u0010k\u001a\u00020j2\u0006\u0010\u001f\u001a\u00020iH\u00a6@\u00a2\u0006\u0004\u0008k\u0010lJ\u0018\u0010n\u001a\u00020\u00042\u0006\u0010m\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008n\u0010\u0006J\u0018\u0010o\u001a\u00020\u00042\u0006\u0010m\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008o\u0010\u0006J\u0018\u0010q\u001a\u00020r2\u0006\u0010q\u001a\u00020pH\u00a6@\u00a2\u0006\u0004\u0008q\u0010sJ\u0018\u0010w\u001a\u00020v2\u0006\u0010u\u001a\u00020tH\u00a6@\u00a2\u0006\u0004\u0008w\u0010xJ\u0018\u0010|\u001a\u00020{2\u0006\u0010z\u001a\u00020yH\u00a6@\u00a2\u0006\u0004\u0008|\u0010}J\u0018\u0010\u007f\u001a\u00020~2\u0006\u0010m\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u007f\u0010\u0006J\u001d\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010z\u001a\u00030\u0080\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u0082\u0001\u0010\u0083\u0001J3\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u0008\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u0008\u0010\u0087\u0001\u001a\u00030\u0086\u00012\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0002H\u00a6@\u00a2\u0006\u0006\u0008\u008a\u0001\u0010\u008b\u0001J\u001e\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u0008\u0010\u008d\u0001\u001a\u00030\u008c\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u008f\u0001\u0010\u0090\u0001J\u001c\u0010\u0093\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0091\u0001\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0005\u0008\u0093\u0001\u0010\u0006J\u001c\u0010\u0096\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u0094\u0001\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0005\u0008\u0096\u0001\u0010\u0006J\u001c\u0010\u0097\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u0094\u0001\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0005\u0008\u0097\u0001\u0010\u0006J#\u0010\u0098\u0001\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00022\u0007\u0010\u0094\u0001\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0005\u0008\u0098\u0001\u00105J#\u0010\u0099\u0001\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00022\u0007\u0010\u0094\u0001\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0005\u0008\u0099\u0001\u00105JS\u0010\u00a0\u0001\u001a\u00030\u009f\u00012\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00022\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00022\u001d\u0010\u009d\u0001\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u009b\u0001j\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u009c\u00012\u0008\u0010\u009e\u0001\u001a\u00030\u0086\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001J\'\u0010\u00a3\u0001\u001a\u00030\u009f\u00012\u0007\u0010\u00a2\u0001\u001a\u00020\u00022\u0008\u0010\u009e\u0001\u001a\u00030\u0086\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001J\u001d\u0010\u00a7\u0001\u001a\u00020\u00042\u0008\u0010\u00a6\u0001\u001a\u00030\u00a5\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u00a7\u0001\u0010\u00a8\u0001J\u001d\u0010\u00a9\u0001\u001a\u00020\u00042\u0008\u0010\u00a6\u0001\u001a\u00030\u00a5\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u00a9\u0001\u0010\u00a8\u0001J1\u0010\u00ae\u0001\u001a\u00030\u00ad\u00012\u0007\u0010\u00aa\u0001\u001a\u00020\u00022\u0008\u0010\u009e\u0001\u001a\u00030\u0086\u00012\u0008\u0010\u00ac\u0001\u001a\u00030\u00ab\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u00ae\u0001\u0010\u00af\u0001R\u0018\u0010\u00b3\u0001\u001a\u00030\u00b0\u00018&X\u00a6\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b1\u0001\u0010\u00b2\u0001R\u0017\u0010\u00b4\u0001\u001a\u00020\u000b8&X\u00a6\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b4\u0001\u0010\u00b5\u0001\u00a8\u0006\u00b6\u0001"
    }
    d2 = {
        "Llive/hms/video/signal/ISignal;",
        "Llive/hms/video/events/IAnalyticsTransport;",
        "",
        "uri",
        "Ll83/a0;",
        "open",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "close",
        "()V",
        "name",
        "data",
        "",
        "serverSideSubscribeDegradation",
        "Llive/hms/video/connection/models/HMSSessionDescription;",
        "offer",
        "Llive/hms/video/sdk/models/IRetryAttemptTracking;",
        "retryAttemptTracking",
        "simulcastEnabled",
        "join",
        "(Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/connection/models/HMSSessionDescription;Llive/hms/video/sdk/models/IRetryAttemptTracking;ZLq83/d;)Ljava/lang/Object;",
        "",
        "Llive/hms/video/sdk/models/HMSNotifications$Track;",
        "tracks",
        "nodeInfo",
        "(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "answer",
        "(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/lang/String;)V",
        "Llive/hms/video/connection/models/HMSTrickle;",
        "trickle",
        "(Llive/hms/video/connection/models/HMSTrickle;)V",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
        "params",
        "Llive/hms/video/sdk/models/HMSMessageSendResponse;",
        "sendMessage",
        "(Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)Ljava/lang/Object;",
        "trackUpdate",
        "(Ljava/util/List;)V",
        "notifyServer",
        "leave",
        "(Z)V",
        "forPeerId",
        "force",
        "role",
        "roleChangeRequest",
        "(Ljava/lang/String;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "token",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "requestedBy",
        "roleChangeAccept",
        "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)Ljava/lang/Object;",
        "peerId",
        "reason",
        "removePeer",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "lock",
        "endRoom",
        "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "hmsTrack",
        "mute",
        "changeTrackState",
        "(Llive/hms/video/media/tracks/HMSTrack;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/media/tracks/HMSTrackType;",
        "type",
        "source",
        "roles",
        "(ZLlive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/sdk/models/HMSRecordingConfig;",
        "config",
        "startRtmpOrRecording",
        "(Llive/hms/video/sdk/models/HMSRecordingConfig;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/sdk/models/HMSHLSConfig;",
        "startHLSStreaming",
        "(Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)Ljava/lang/Object;",
        "stopHLSStreaming",
        "stopRtmpAndRecording",
        "(Lq83/d;)Ljava/lang/Object;",
        "changeName",
        "metadata",
        "changeMetadata",
        "key",
        "Llive/hms/video/sessionstore/SessionMetadataResult;",
        "getSessionMetadata",
        "Lcom/google/gson/JsonElement;",
        "Llive/hms/video/sessionstore/SetSessionMetadataResult;",
        "changeSessionMetadata",
        "(Ljava/lang/String;Lcom/google/gson/JsonElement;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/sdk/models/HMSHLSTimedMetadata;",
        "metadataModelList",
        "setHlsSessionMetadata",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/sdk/models/role/HMSRole;",
        "ofRoles",
        "toRole",
        "Llive/hms/video/sdk/HMSActionResultListener;",
        "hmsActionResultListener",
        "bulkRoleChangeRequest",
        "(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;",
        "tags",
        "Llive/hms/video/sessionstore/SetMetadataListenerResult;",
        "setMetadataListener",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;",
        "Llive/hms/video/polls/network/PollCreateResponse;",
        "createPoll",
        "(Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;",
        "Llive/hms/video/polls/network/SetQuestionsResponse;",
        "createQuestion",
        "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;Lq83/d;)Ljava/lang/Object;",
        "pollId",
        "pollStart",
        "pollStop",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;",
        "pollQuestionsGet",
        "Llive/hms/video/polls/network/PollQuestionGetResponse;",
        "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/polls/HMSPollResponseBuilder;",
        "hmsPollResponseBuilder",
        "Llive/hms/video/polls/models/answer/PollAnswerResponse;",
        "pollAddResponse",
        "(Llive/hms/video/polls/HMSPollResponseBuilder;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;",
        "param",
        "Llive/hms/video/polls/network/PollGetResponsesReply;",
        "pollGetResponses",
        "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/polls/network/PollResultsResponse;",
        "pollGetResults",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;",
        "Llive/hms/video/polls/network/PollLeaderboardResponse;",
        "pollGetLeaderboard",
        "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/polls/models/HmsPollState;",
        "state",
        "",
        "count",
        "start",
        "Llive/hms/video/polls/network/PollListResponse;",
        "pollGetList",
        "(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;",
        "options",
        "Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;",
        "createWhiteBoard",
        "(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;Lq83/d;)Ljava/lang/Object;",
        "id",
        "Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;",
        "getWhiteBoard",
        "groupName",
        "Llive/hms/video/groups/GroupJoinLeaveResponse;",
        "groupJoin",
        "groupLeave",
        "groupAdd",
        "groupRemove",
        "roleName",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "peerIds",
        "limit",
        "Llive/hms/video/sdk/models/FindPeerResponse;",
        "findPeer",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILq83/d;)Ljava/lang/Object;",
        "iteratorId",
        "peerIteratorNext",
        "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/sdk/models/TranscriptionsMode;",
        "mode",
        "startRealTimeTranscription",
        "(Llive/hms/video/sdk/models/TranscriptionsMode;Lq83/d;)Ljava/lang/Object;",
        "stopRealTimeTranscription",
        "query",
        "",
        "offset",
        "Llive/hms/video/sdk/models/PeerNameSearchResponse;",
        "peerNameSearch",
        "(Ljava/lang/String;IJLq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/signal/ISignalEventsObserver;",
        "getObserver",
        "()Llive/hms/video/signal/ISignalEventsObserver;",
        "observer",
        "isConnected",
        "()Z",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract answer(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/lang/String;)V
.end method

.method public abstract bulkRoleChangeRequest(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            ">;",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            "Z",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract changeMetadata(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract changeName(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract changeSessionMetadata(Ljava/lang/String;Lcom/google/gson/JsonElement;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/gson/JsonElement;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sessionstore/SetSessionMetadataResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract changeTrackState(Llive/hms/video/media/tracks/HMSTrack;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/tracks/HMSTrack;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract changeTrackState(ZLlive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Llive/hms/video/media/tracks/HMSTrackType;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract close()V
.end method

.method public abstract createPoll(Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/network/PollCreateResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract createQuestion(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/network/SetQuestionsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract createWhiteBoard(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract endRoom(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract findPeer(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;I",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/models/FindPeerResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getObserver()Llive/hms/video/signal/ISignalEventsObserver;
.end method

.method public abstract getSessionMetadata(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sessionstore/SessionMetadataResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getWhiteBoard(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract groupAdd(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract groupJoin(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/groups/GroupJoinLeaveResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract groupLeave(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/groups/GroupJoinLeaveResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract groupRemove(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract isConnected()Z
.end method

.method public abstract join(Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/connection/models/HMSSessionDescription;Llive/hms/video/sdk/models/IRetryAttemptTracking;ZLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Llive/hms/video/connection/models/HMSSessionDescription;",
            "Llive/hms/video/sdk/models/IRetryAttemptTracking;",
            "Z",
            "Lq83/d<",
            "-",
            "Llive/hms/video/connection/models/HMSSessionDescription;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract leave(Z)V
.end method

.method public abstract offer(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/connection/models/HMSSessionDescription;",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSNotifications$Track;",
            ">;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/connection/models/HMSSessionDescription;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract open(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract peerIteratorNext(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/models/FindPeerResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract peerNameSearch(Ljava/lang/String;IJLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IJ",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/models/PeerNameSearchResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract pollAddResponse(Llive/hms/video/polls/HMSPollResponseBuilder;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/polls/HMSPollResponseBuilder;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/models/answer/PollAnswerResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract pollGetLeaderboard(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/network/PollLeaderboardResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract pollGetList(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/polls/models/HmsPollState;",
            "I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/network/PollListResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract pollGetResponses(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/network/PollGetResponsesReply;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract pollGetResults(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/network/PollResultsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract pollQuestionsGet(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/network/PollQuestionGetResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract pollStart(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract pollStop(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract removePeer(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract roleChangeAccept(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/models/HMSPeer;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract roleChangeRequest(Ljava/lang/String;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract sendMessage(Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/models/HMSMessageSendResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract setHlsSessionMetadata(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSHLSTimedMetadata;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract setMetadataListener(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sessionstore/SetMetadataListenerResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract startHLSStreaming(Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSHLSConfig;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract startRealTimeTranscription(Llive/hms/video/sdk/models/TranscriptionsMode;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/TranscriptionsMode;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract startRtmpOrRecording(Llive/hms/video/sdk/models/HMSRecordingConfig;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSRecordingConfig;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract stopHLSStreaming(Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSHLSConfig;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract stopRealTimeTranscription(Llive/hms/video/sdk/models/TranscriptionsMode;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/TranscriptionsMode;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract stopRtmpAndRecording(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract trackUpdate(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSNotifications$Track;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract trickle(Llive/hms/video/connection/models/HMSTrickle;)V
.end method
