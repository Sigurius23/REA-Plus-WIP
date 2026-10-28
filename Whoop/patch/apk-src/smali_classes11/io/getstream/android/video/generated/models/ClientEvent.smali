.class public final Lio/getstream/android/video/generated/models/ClientEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008#\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00d7\u0002\u0012\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010!\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010&\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010%J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010%J\u0012\u0010+\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010%J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010%J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010%J\u0012\u00100\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010%J\u0012\u00101\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010%J\u0012\u00102\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010%J\u0012\u00103\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010%J\u0012\u00104\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00084\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u00086\u0010,J\u0012\u00107\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00087\u0010%J\u0012\u00108\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00088\u0010%J\u0012\u00109\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00089\u0010%J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010%J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010%J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010%J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008=\u0010%J\u0012\u0010>\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008>\u00105J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u0010%J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008@\u0010%J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008A\u0010%J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008B\u0010%J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008C\u0010%J\u0012\u0010D\u001a\u0004\u0018\u00010 H\u00c6\u0003\u00a2\u0006\u0004\u0008D\u0010EJ\u00e0\u0002\u0010F\u001a\u00020\u00002\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\u0008\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00102\n\u0008\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010!\u001a\u0004\u0018\u00010 H\u00c6\u0001\u00a2\u0006\u0004\u0008F\u0010GJ\u0010\u0010H\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008H\u0010%J\u0010\u0010I\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008I\u0010JJ\u001a\u0010L\u001a\u00020 2\u0008\u0010K\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008L\u0010MJ)\u0010S\u001a\u00020R*\u00060Nj\u0002`O2\u0006\u0010P\u001a\u00020\u00022\u0008\u0010Q\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0004\u0008S\u0010TR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010U\u001a\u0004\u0008V\u0010%R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010U\u001a\u0004\u0008W\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010U\u001a\u0004\u0008X\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010U\u001a\u0004\u0008Y\u0010%R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010Z\u001a\u0004\u0008[\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010U\u001a\u0004\u0008\\\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010U\u001a\u0004\u0008]\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010U\u001a\u0004\u0008^\u0010%R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010U\u001a\u0004\u0008_\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010U\u001a\u0004\u0008`\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010U\u001a\u0004\u0008a\u0010%R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010U\u001a\u0004\u0008b\u0010%R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010c\u001a\u0004\u0008d\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010Z\u001a\u0004\u0008e\u0010,R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010U\u001a\u0004\u0008f\u0010%R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010U\u001a\u0004\u0008g\u0010%R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010U\u001a\u0004\u0008h\u0010%R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010U\u001a\u0004\u0008i\u0010%R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010U\u001a\u0004\u0008j\u0010%R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010U\u001a\u0004\u0008k\u0010%R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010U\u001a\u0004\u0008l\u0010%R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010c\u001a\u0004\u0008m\u00105R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010U\u001a\u0004\u0008n\u0010%R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010U\u001a\u0004\u0008o\u0010%R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010U\u001a\u0004\u0008p\u0010%R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010U\u001a\u0004\u0008q\u0010%R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010U\u001a\u0004\u0008r\u0010%R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010s\u001a\u0004\u0008t\u0010E\u00a8\u0006u"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/ClientEvent;",
        "",
        "",
        "callSessionId",
        "cameraPermissionStatus",
        "coordinatorConnectId",
        "joinReason",
        "",
        "elapsedTime",
        "eventType",
        "iceState",
        "id",
        "joinAttemptId",
        "microphonePermissionStatus",
        "outcome",
        "peerConnection",
        "Ljg3/i;",
        "previouslyConnectedTimestamp",
        "retryCountAttempt",
        "retryFailureCode",
        "retryFailureReason",
        "screenShareStatus",
        "sdkVersion",
        "sfuId",
        "stage",
        "stageId",
        "timestamp",
        "trackId",
        "type",
        "userAgent",
        "userId",
        "userSessionId",
        "",
        "wasPreviouslyConnected",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V",
        "toLog$stream_video_android_core_release",
        "()Ljava/lang/String;",
        "toLog",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Ljava/lang/Integer;",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "()Ljg3/i;",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "component28",
        "()Ljava/lang/Boolean;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/ClientEvent;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/StringBuilder;",
        "Lkotlin/text/StringBuilder;",
        "key",
        "value",
        "Ll83/a0;",
        "appendIfNotNull",
        "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V",
        "Ljava/lang/String;",
        "getCallSessionId",
        "getCameraPermissionStatus",
        "getCoordinatorConnectId",
        "getJoinReason",
        "Ljava/lang/Integer;",
        "getElapsedTime",
        "getEventType",
        "getIceState",
        "getId",
        "getJoinAttemptId",
        "getMicrophonePermissionStatus",
        "getOutcome",
        "getPeerConnection",
        "Ljg3/i;",
        "getPreviouslyConnectedTimestamp",
        "getRetryCountAttempt",
        "getRetryFailureCode",
        "getRetryFailureReason",
        "getScreenShareStatus",
        "getSdkVersion",
        "getSfuId",
        "getStage",
        "getStageId",
        "getTimestamp",
        "getTrackId",
        "getType",
        "getUserAgent",
        "getUserId",
        "getUserSessionId",
        "Ljava/lang/Boolean;",
        "getWasPreviouslyConnected",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final callSessionId:Ljava/lang/String;

.field private final cameraPermissionStatus:Ljava/lang/String;

.field private final coordinatorConnectId:Ljava/lang/String;

.field private final elapsedTime:Ljava/lang/Integer;

.field private final eventType:Ljava/lang/String;

.field private final iceState:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final joinAttemptId:Ljava/lang/String;

.field private final joinReason:Ljava/lang/String;

.field private final microphonePermissionStatus:Ljava/lang/String;

.field private final outcome:Ljava/lang/String;

.field private final peerConnection:Ljava/lang/String;

.field private final previouslyConnectedTimestamp:Ljg3/i;

.field private final retryCountAttempt:Ljava/lang/Integer;

.field private final retryFailureCode:Ljava/lang/String;

.field private final retryFailureReason:Ljava/lang/String;

.field private final screenShareStatus:Ljava/lang/String;

.field private final sdkVersion:Ljava/lang/String;

.field private final sfuId:Ljava/lang/String;

.field private final stage:Ljava/lang/String;

.field private final stageId:Ljava/lang/String;

.field private final timestamp:Ljg3/i;

.field private final trackId:Ljava/lang/String;

.field private final type:Ljava/lang/String;

.field private final userAgent:Ljava/lang/String;

.field private final userId:Ljava/lang/String;

.field private final userSessionId:Ljava/lang/String;

.field private final wasPreviouslyConnected:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 31

    .line 1
    const v29, 0xfffffff

    const/16 v30, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v30}, Lio/getstream/android/video/generated/models/ClientEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_session_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "camera_permission_status"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "coordinator_connect_id"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "join_reason"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "elapsed_time"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "event_type"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "ice_state"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "id"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "join_attempt_id"
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "microphone_permission_status"
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "outcome"
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "peer_connection"
        .end annotation
    .end param
    .param p13    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "previously_connected_timestamp"
        .end annotation
    .end param
    .param p14    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "retry_count_attempt"
        .end annotation
    .end param
    .param p15    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "retry_failure_code"
        .end annotation
    .end param
    .param p16    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "retry_failure_reason"
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "screen_share_status"
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "sdk_version"
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "sfu_id"
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "stage"
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "stage_id"
        .end annotation
    .end param
    .param p22    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "timestamp"
        .end annotation
    .end param
    .param p23    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "track_id"
        .end annotation
    .end param
    .param p24    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p25    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_agent"
        .end annotation
    .end param
    .param p26    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_id"
        .end annotation
    .end param
    .param p27    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_session_id"
        .end annotation
    .end param
    .param p28    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "was_previously_connected"
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->callSessionId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->cameraPermissionStatus:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lio/getstream/android/video/generated/models/ClientEvent;->coordinatorConnectId:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lio/getstream/android/video/generated/models/ClientEvent;->joinReason:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lio/getstream/android/video/generated/models/ClientEvent;->elapsedTime:Ljava/lang/Integer;

    .line 8
    iput-object p6, p0, Lio/getstream/android/video/generated/models/ClientEvent;->eventType:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lio/getstream/android/video/generated/models/ClientEvent;->iceState:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lio/getstream/android/video/generated/models/ClientEvent;->id:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lio/getstream/android/video/generated/models/ClientEvent;->joinAttemptId:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lio/getstream/android/video/generated/models/ClientEvent;->microphonePermissionStatus:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lio/getstream/android/video/generated/models/ClientEvent;->outcome:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lio/getstream/android/video/generated/models/ClientEvent;->peerConnection:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lio/getstream/android/video/generated/models/ClientEvent;->previouslyConnectedTimestamp:Ljg3/i;

    .line 16
    iput-object p14, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryCountAttempt:Ljava/lang/Integer;

    .line 17
    iput-object p15, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureCode:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureReason:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->screenShareStatus:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->sdkVersion:Ljava/lang/String;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->sfuId:Ljava/lang/String;

    move-object/from16 p1, p20

    .line 22
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->stage:Ljava/lang/String;

    move-object/from16 p1, p21

    .line 23
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->stageId:Ljava/lang/String;

    move-object/from16 p1, p22

    .line 24
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->timestamp:Ljg3/i;

    move-object/from16 p1, p23

    .line 25
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->trackId:Ljava/lang/String;

    move-object/from16 p1, p24

    .line 26
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->type:Ljava/lang/String;

    move-object/from16 p1, p25

    .line 27
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->userAgent:Ljava/lang/String;

    move-object/from16 p1, p26

    .line 28
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->userId:Ljava/lang/String;

    move-object/from16 p1, p27

    .line 29
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->userSessionId:Ljava/lang/String;

    move-object/from16 p1, p28

    .line 30
    iput-object p1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->wasPreviouslyConnected:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 29

    move/from16 v0, p29

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    const/4 v6, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    const/4 v7, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    const/4 v8, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    const/4 v10, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    const/4 v11, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    const/4 v12, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    const/4 v13, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    const/4 v14, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    const/4 v15, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    const/16 v17, 0x0

    goto :goto_10

    :cond_10
    move-object/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    const/16 v18, 0x0

    goto :goto_11

    :cond_11
    move-object/from16 v18, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    if-eqz v19, :cond_12

    const/16 v19, 0x0

    goto :goto_12

    :cond_12
    move-object/from16 v19, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v20, v0, v20

    if-eqz v20, :cond_13

    const/16 v20, 0x0

    goto :goto_13

    :cond_13
    move-object/from16 v20, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v21, v0, v21

    if-eqz v21, :cond_14

    const/16 v21, 0x0

    goto :goto_14

    :cond_14
    move-object/from16 v21, p21

    :goto_14
    const/high16 v22, 0x200000

    and-int v22, v0, v22

    if-eqz v22, :cond_15

    const/16 v22, 0x0

    goto :goto_15

    :cond_15
    move-object/from16 v22, p22

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, v0, v23

    if-eqz v23, :cond_16

    const/16 v23, 0x0

    goto :goto_16

    :cond_16
    move-object/from16 v23, p23

    :goto_16
    const/high16 v24, 0x800000

    and-int v24, v0, v24

    if-eqz v24, :cond_17

    const/16 v24, 0x0

    goto :goto_17

    :cond_17
    move-object/from16 v24, p24

    :goto_17
    const/high16 v25, 0x1000000

    and-int v25, v0, v25

    if-eqz v25, :cond_18

    const/16 v25, 0x0

    goto :goto_18

    :cond_18
    move-object/from16 v25, p25

    :goto_18
    const/high16 v26, 0x2000000

    and-int v26, v0, v26

    if-eqz v26, :cond_19

    const/16 v26, 0x0

    goto :goto_19

    :cond_19
    move-object/from16 v26, p26

    :goto_19
    const/high16 v27, 0x4000000

    and-int v27, v0, v27

    if-eqz v27, :cond_1a

    const/16 v27, 0x0

    goto :goto_1a

    :cond_1a
    move-object/from16 v27, p27

    :goto_1a
    const/high16 v28, 0x8000000

    and-int v0, v0, v28

    if-eqz v0, :cond_1b

    const/16 p29, 0x0

    :goto_1b
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p17, v16

    move-object/from16 p18, v17

    move-object/from16 p19, v18

    move-object/from16 p20, v19

    move-object/from16 p21, v20

    move-object/from16 p22, v21

    move-object/from16 p23, v22

    move-object/from16 p24, v23

    move-object/from16 p25, v24

    move-object/from16 p26, v25

    move-object/from16 p27, v26

    move-object/from16 p28, v27

    goto :goto_1c

    :cond_1b
    move-object/from16 p29, p28

    goto :goto_1b

    .line 31
    :goto_1c
    invoke-direct/range {p1 .. p29}, Lio/getstream/android/video/generated/models/ClientEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method private final appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    if-nez p3, :cond_0

    return-void

    :cond_0
    const-string v0, "("

    invoke-static {p1, v0}, Lyb3/r;->Y(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ",\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/ClientEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/ClientEvent;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p29

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/android/video/generated/models/ClientEvent;->callSessionId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/android/video/generated/models/ClientEvent;->cameraPermissionStatus:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/android/video/generated/models/ClientEvent;->coordinatorConnectId:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/android/video/generated/models/ClientEvent;->joinReason:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/android/video/generated/models/ClientEvent;->elapsedTime:Ljava/lang/Integer;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/android/video/generated/models/ClientEvent;->eventType:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/android/video/generated/models/ClientEvent;->iceState:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lio/getstream/android/video/generated/models/ClientEvent;->id:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/getstream/android/video/generated/models/ClientEvent;->joinAttemptId:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lio/getstream/android/video/generated/models/ClientEvent;->microphonePermissionStatus:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/android/video/generated/models/ClientEvent;->outcome:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/android/video/generated/models/ClientEvent;->peerConnection:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/android/video/generated/models/ClientEvent;->previouslyConnectedTimestamp:Ljg3/i;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/android/video/generated/models/ClientEvent;->retryCountAttempt:Ljava/lang/Integer;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureCode:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureReason:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p29, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lio/getstream/android/video/generated/models/ClientEvent;->screenShareStatus:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p29, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lio/getstream/android/video/generated/models/ClientEvent;->sdkVersion:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p29, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lio/getstream/android/video/generated/models/ClientEvent;->sfuId:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p29, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lio/getstream/android/video/generated/models/ClientEvent;->stage:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p29, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lio/getstream/android/video/generated/models/ClientEvent;->stageId:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p29, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lio/getstream/android/video/generated/models/ClientEvent;->timestamp:Ljg3/i;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p29, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lio/getstream/android/video/generated/models/ClientEvent;->trackId:Ljava/lang/String;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p29, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lio/getstream/android/video/generated/models/ClientEvent;->type:Ljava/lang/String;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p29, v16

    move-object/from16 p10, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lio/getstream/android/video/generated/models/ClientEvent;->userAgent:Ljava/lang/String;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p29, v16

    move-object/from16 p11, v1

    if-eqz v16, :cond_19

    iget-object v1, v0, Lio/getstream/android/video/generated/models/ClientEvent;->userId:Ljava/lang/String;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p29, v16

    move-object/from16 p12, v1

    if-eqz v16, :cond_1a

    iget-object v1, v0, Lio/getstream/android/video/generated/models/ClientEvent;->userSessionId:Ljava/lang/String;

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p27

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p29, v16

    if-eqz v16, :cond_1b

    move-object/from16 p13, v1

    iget-object v1, v0, Lio/getstream/android/video/generated/models/ClientEvent;->wasPreviouslyConnected:Ljava/lang/Boolean;

    move-object/from16 p28, p13

    move-object/from16 p29, v1

    :goto_1b
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p24, p9

    move-object/from16 p25, p10

    move-object/from16 p26, p11

    move-object/from16 p27, p12

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_1c

    :cond_1b
    move-object/from16 p29, p28

    move-object/from16 p28, v1

    goto :goto_1b

    :goto_1c
    invoke-virtual/range {p1 .. p29}, Lio/getstream/android/video/generated/models/ClientEvent;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/ClientEvent;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->callSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->microphonePermissionStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->outcome:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->peerConnection:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->previouslyConnectedTimestamp:Ljg3/i;

    return-object v0
.end method

.method public final component14()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryCountAttempt:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureReason:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->screenShareStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->sdkVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->sfuId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->cameraPermissionStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->stage:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->stageId:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->timestamp:Ljg3/i;

    return-object v0
.end method

.method public final component23()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->trackId:Ljava/lang/String;

    return-object v0
.end method

.method public final component24()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component25()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->userAgent:Ljava/lang/String;

    return-object v0
.end method

.method public final component26()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final component27()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->userSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component28()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->wasPreviouslyConnected:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->coordinatorConnectId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->joinReason:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->elapsedTime:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->eventType:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->iceState:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->joinAttemptId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/ClientEvent;
    .locals 29
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "call_session_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "camera_permission_status"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "coordinator_connect_id"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "join_reason"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "elapsed_time"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "event_type"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "ice_state"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "id"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "join_attempt_id"
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "microphone_permission_status"
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "outcome"
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "peer_connection"
        .end annotation
    .end param
    .param p13    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "previously_connected_timestamp"
        .end annotation
    .end param
    .param p14    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "retry_count_attempt"
        .end annotation
    .end param
    .param p15    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "retry_failure_code"
        .end annotation
    .end param
    .param p16    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "retry_failure_reason"
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "screen_share_status"
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "sdk_version"
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "sfu_id"
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "stage"
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "stage_id"
        .end annotation
    .end param
    .param p22    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "timestamp"
        .end annotation
    .end param
    .param p23    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "track_id"
        .end annotation
    .end param
    .param p24    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p25    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_agent"
        .end annotation
    .end param
    .param p26    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_id"
        .end annotation
    .end param
    .param p27    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "user_session_id"
        .end annotation
    .end param
    .param p28    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "was_previously_connected"
        .end annotation
    .end param

    new-instance v0, Lio/getstream/android/video/generated/models/ClientEvent;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    move-object/from16 v23, p23

    move-object/from16 v24, p24

    move-object/from16 v25, p25

    move-object/from16 v26, p26

    move-object/from16 v27, p27

    move-object/from16 v28, p28

    invoke-direct/range {v0 .. v28}, Lio/getstream/android/video/generated/models/ClientEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/ClientEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/ClientEvent;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->callSessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->callSessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->cameraPermissionStatus:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->cameraPermissionStatus:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->coordinatorConnectId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->coordinatorConnectId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->joinReason:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->joinReason:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->elapsedTime:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->elapsedTime:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->eventType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->eventType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->iceState:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->iceState:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->joinAttemptId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->joinAttemptId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->microphonePermissionStatus:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->microphonePermissionStatus:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->outcome:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->outcome:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->peerConnection:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->peerConnection:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->previouslyConnectedTimestamp:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->previouslyConnectedTimestamp:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryCountAttempt:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->retryCountAttempt:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureCode:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureReason:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureReason:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->screenShareStatus:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->screenShareStatus:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->sdkVersion:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->sdkVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->sfuId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->sfuId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->stage:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->stage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->stageId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->stageId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->timestamp:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->timestamp:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->trackId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->trackId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->userAgent:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->userAgent:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->userId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->userId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->userSessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ClientEvent;->userSessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ClientEvent;->wasPreviouslyConnected:Ljava/lang/Boolean;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/ClientEvent;->wasPreviouslyConnected:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1d

    return v2

    :cond_1d
    return v0
.end method

.method public final getCallSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->callSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCameraPermissionStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->cameraPermissionStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final getCoordinatorConnectId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->coordinatorConnectId:Ljava/lang/String;

    return-object v0
.end method

.method public final getElapsedTime()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->elapsedTime:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getEventType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->eventType:Ljava/lang/String;

    return-object v0
.end method

.method public final getIceState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->iceState:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getJoinAttemptId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->joinAttemptId:Ljava/lang/String;

    return-object v0
.end method

.method public final getJoinReason()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->joinReason:Ljava/lang/String;

    return-object v0
.end method

.method public final getMicrophonePermissionStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->microphonePermissionStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final getOutcome()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->outcome:Ljava/lang/String;

    return-object v0
.end method

.method public final getPeerConnection()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->peerConnection:Ljava/lang/String;

    return-object v0
.end method

.method public final getPreviouslyConnectedTimestamp()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->previouslyConnectedTimestamp:Ljg3/i;

    return-object v0
.end method

.method public final getRetryCountAttempt()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryCountAttempt:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getRetryFailureCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getRetryFailureReason()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureReason:Ljava/lang/String;

    return-object v0
.end method

.method public final getScreenShareStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->screenShareStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final getSdkVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->sdkVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getSfuId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->sfuId:Ljava/lang/String;

    return-object v0
.end method

.method public final getStage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->stage:Ljava/lang/String;

    return-object v0
.end method

.method public final getStageId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->stageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimestamp()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->timestamp:Ljg3/i;

    return-object v0
.end method

.method public final getTrackId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->trackId:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserAgent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->userAgent:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->userSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getWasPreviouslyConnected()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->wasPreviouslyConnected:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ClientEvent;->callSessionId:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->cameraPermissionStatus:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->coordinatorConnectId:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->joinReason:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->elapsedTime:Ljava/lang/Integer;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->eventType:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->iceState:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->id:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->joinAttemptId:Ljava/lang/String;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->microphonePermissionStatus:Ljava/lang/String;

    if-nez v2, :cond_9

    move v2, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->outcome:Ljava/lang/String;

    if-nez v2, :cond_a

    move v2, v1

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->peerConnection:Ljava/lang/String;

    if-nez v2, :cond_b

    move v2, v1

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->previouslyConnectedTimestamp:Ljg3/i;

    if-nez v2, :cond_c

    move v2, v1

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljg3/i;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryCountAttempt:Ljava/lang/Integer;

    if-nez v2, :cond_d

    move v2, v1

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureCode:Ljava/lang/String;

    if-nez v2, :cond_e

    move v2, v1

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureReason:Ljava/lang/String;

    if-nez v2, :cond_f

    move v2, v1

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->screenShareStatus:Ljava/lang/String;

    if-nez v2, :cond_10

    move v2, v1

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_10
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->sdkVersion:Ljava/lang/String;

    if-nez v2, :cond_11

    move v2, v1

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_11
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->sfuId:Ljava/lang/String;

    if-nez v2, :cond_12

    move v2, v1

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_12
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->stage:Ljava/lang/String;

    if-nez v2, :cond_13

    move v2, v1

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_13
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->stageId:Ljava/lang/String;

    if-nez v2, :cond_14

    move v2, v1

    goto :goto_14

    :cond_14
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_14
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->timestamp:Ljg3/i;

    if-nez v2, :cond_15

    move v2, v1

    goto :goto_15

    :cond_15
    invoke-virtual {v2}, Ljg3/i;->hashCode()I

    move-result v2

    :goto_15
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->trackId:Ljava/lang/String;

    if-nez v2, :cond_16

    move v2, v1

    goto :goto_16

    :cond_16
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_16
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->type:Ljava/lang/String;

    if-nez v2, :cond_17

    move v2, v1

    goto :goto_17

    :cond_17
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_17
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->userAgent:Ljava/lang/String;

    if-nez v2, :cond_18

    move v2, v1

    goto :goto_18

    :cond_18
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_18
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->userId:Ljava/lang/String;

    if-nez v2, :cond_19

    move v2, v1

    goto :goto_19

    :cond_19
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_19
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->userSessionId:Ljava/lang/String;

    if-nez v2, :cond_1a

    move v2, v1

    goto :goto_1a

    :cond_1a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1a
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->wasPreviouslyConnected:Ljava/lang/Boolean;

    if-nez v2, :cond_1b

    goto :goto_1b

    :cond_1b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1b
    add-int/2addr v0, v1

    return v0
.end method

.method public final toLog$stream_video_android_core_release()Ljava/lang/String;
    .locals 3

    const-string v0, "ClientEvent("

    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "type"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->type:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "eventType"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->eventType:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "stage"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->stage:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "outcome"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->outcome:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "callSessionId"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->callSessionId:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "stageId"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->stageId:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "userSessionId"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->userSessionId:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "joinAttemptId"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->joinAttemptId:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "joinReason"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->joinReason:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "coordinatorConnectId"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->coordinatorConnectId:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "userId"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->userId:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "sfuId"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->sfuId:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "peerConnection"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->peerConnection:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "iceState"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->iceState:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "retryCountAttempt"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryCountAttempt:Ljava/lang/Integer;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "retryFailureCode"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureCode:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "retryFailureReason"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureReason:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "elapsedTime"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->elapsedTime:Ljava/lang/Integer;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "wasPreviouslyConnected"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->wasPreviouslyConnected:Ljava/lang/Boolean;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "previouslyConnectedTimestamp"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->previouslyConnectedTimestamp:Ljg3/i;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "sdkVersion"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->sdkVersion:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "timestamp"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->timestamp:Ljg3/i;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "cameraPermissionStatus"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->cameraPermissionStatus:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "microphonePermissionStatus"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->microphonePermissionStatus:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "screenShareStatus"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->screenShareStatus:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "trackId"

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ClientEvent;->trackId:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lio/getstream/android/video/generated/models/ClientEvent;->appendIfNotNull(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 31

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/android/video/generated/models/ClientEvent;->callSessionId:Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/android/video/generated/models/ClientEvent;->cameraPermissionStatus:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/android/video/generated/models/ClientEvent;->coordinatorConnectId:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/android/video/generated/models/ClientEvent;->joinReason:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/android/video/generated/models/ClientEvent;->elapsedTime:Ljava/lang/Integer;

    iget-object v6, v0, Lio/getstream/android/video/generated/models/ClientEvent;->eventType:Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/android/video/generated/models/ClientEvent;->iceState:Ljava/lang/String;

    iget-object v8, v0, Lio/getstream/android/video/generated/models/ClientEvent;->id:Ljava/lang/String;

    iget-object v9, v0, Lio/getstream/android/video/generated/models/ClientEvent;->joinAttemptId:Ljava/lang/String;

    iget-object v10, v0, Lio/getstream/android/video/generated/models/ClientEvent;->microphonePermissionStatus:Ljava/lang/String;

    iget-object v11, v0, Lio/getstream/android/video/generated/models/ClientEvent;->outcome:Ljava/lang/String;

    iget-object v12, v0, Lio/getstream/android/video/generated/models/ClientEvent;->peerConnection:Ljava/lang/String;

    iget-object v13, v0, Lio/getstream/android/video/generated/models/ClientEvent;->previouslyConnectedTimestamp:Ljg3/i;

    iget-object v14, v0, Lio/getstream/android/video/generated/models/ClientEvent;->retryCountAttempt:Ljava/lang/Integer;

    iget-object v15, v0, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureCode:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/ClientEvent;->retryFailureReason:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/ClientEvent;->screenShareStatus:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/ClientEvent;->sdkVersion:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/ClientEvent;->sfuId:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/ClientEvent;->stage:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/ClientEvent;->stageId:Ljava/lang/String;

    move-object/from16 v22, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/ClientEvent;->timestamp:Ljg3/i;

    move-object/from16 v23, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/ClientEvent;->trackId:Ljava/lang/String;

    move-object/from16 v24, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/ClientEvent;->type:Ljava/lang/String;

    move-object/from16 v25, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/ClientEvent;->userAgent:Ljava/lang/String;

    move-object/from16 v26, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/ClientEvent;->userId:Ljava/lang/String;

    move-object/from16 v27, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/ClientEvent;->userSessionId:Ljava/lang/String;

    move-object/from16 v28, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/ClientEvent;->wasPreviouslyConnected:Ljava/lang/Boolean;

    const-string v0, ", cameraPermissionStatus="

    move-object/from16 v29, v15

    const-string v15, ", coordinatorConnectId="

    move-object/from16 v30, v14

    const-string v14, "ClientEvent(callSessionId="

    invoke-static {v14, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", joinReason="

    const-string v2, ", elapsedTime="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", eventType="

    const-string v2, ", iceState="

    invoke-static {v5, v1, v6, v2, v0}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", id="

    const-string v2, ", joinAttemptId="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", microphonePermissionStatus="

    const-string v2, ", outcome="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", peerConnection="

    const-string v2, ", previouslyConnectedTimestamp="

    invoke-static {v0, v11, v1, v12, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retryCountAttempt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retryFailureCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", retryFailureReason="

    const-string v2, ", screenShareStatus="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", sdkVersion="

    const-string v2, ", sfuId="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", stage="

    const-string v2, ", stageId="

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trackId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    const-string v2, ", userAgent="

    move-object/from16 v3, v24

    move-object/from16 v4, v25

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", userId="

    const-string v2, ", userSessionId="

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", wasPreviouslyConnected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
