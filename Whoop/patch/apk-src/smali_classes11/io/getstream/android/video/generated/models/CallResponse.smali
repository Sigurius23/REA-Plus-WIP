.class public final Lio/getstream/android/video/generated/models/CallResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008V\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00a5\u0002\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\r\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u0007\u0012\u000e\u0008\u0003\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0010\u0012\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0012\u0012\u0016\u0008\u0003\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014\u0012\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u0018\u0012\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u001a\u0012\n\u0008\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\u0008\u0003\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0003\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010$\u001a\u0004\u0018\u00010#\u0012\n\u0008\u0003\u0010&\u001a\u0004\u0018\u00010%\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010*J\u0010\u0010,\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010-J\u0010\u00101\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010-J\u0010\u00102\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010*J\u0010\u00103\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010*J\u0010\u00104\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010*J\u0010\u00105\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u00085\u0010-J\u0010\u00106\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u00086\u0010/J\u0016\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00108J\u0010\u00109\u001a\u00020\u0012H\u00c6\u0003\u00a2\u0006\u0004\u00089\u0010:J\u001e\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010<J\u0010\u0010=\u001a\u00020\u0016H\u00c6\u0003\u00a2\u0006\u0004\u0008=\u0010>J\u0010\u0010?\u001a\u00020\u0018H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u0010@J\u0010\u0010A\u001a\u00020\u001aH\u00c6\u0003\u00a2\u0006\u0004\u0008A\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008C\u0010-J\u0012\u0010D\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008D\u0010/J\u0012\u0010E\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0004\u0008E\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008G\u0010-J\u0012\u0010H\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008H\u0010/J\u0012\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008I\u0010-J\u0012\u0010J\u001a\u0004\u0018\u00010#H\u00c6\u0003\u00a2\u0006\u0004\u0008J\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010%H\u00c6\u0003\u00a2\u0006\u0004\u0008L\u0010MJ\u00ae\u0002\u0010N\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0003\u0010\t\u001a\u00020\u00052\u0008\u0008\u0003\u0010\n\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0003\u0010\r\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u000e\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u000f\u001a\u00020\u00072\u000e\u0008\u0003\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00102\u0008\u0008\u0003\u0010\u0013\u001a\u00020\u00122\u0016\u0008\u0003\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00142\u0008\u0008\u0003\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0003\u0010\u0019\u001a\u00020\u00182\u0008\u0008\u0003\u0010\u001b\u001a\u00020\u001a2\n\u0008\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\u0008\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0003\u0010 \u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010!\u001a\u0004\u0018\u00010\u00072\n\u0008\u0003\u0010\"\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010$\u001a\u0004\u0018\u00010#2\n\u0008\u0003\u0010&\u001a\u0004\u0018\u00010%H\u00c6\u0001\u00a2\u0006\u0004\u0008N\u0010OJ\u0010\u0010P\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008P\u0010-J\u0010\u0010Q\u001a\u00020\u001eH\u00d6\u0001\u00a2\u0006\u0004\u0008Q\u0010RJ\u001a\u0010T\u001a\u00020\u00022\u0008\u0010S\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008T\u0010UR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010V\u001a\u0004\u0008W\u0010*R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010V\u001a\u0004\u0008X\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010Y\u001a\u0004\u0008Z\u0010-R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010[\u001a\u0004\u0008\\\u0010/R\u0017\u0010\t\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010Y\u001a\u0004\u0008]\u0010-R\u0017\u0010\n\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010Y\u001a\u0004\u0008^\u0010-R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010V\u001a\u0004\u0008_\u0010*R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010V\u001a\u0004\u0008`\u0010*R\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010V\u001a\u0004\u0008a\u0010*R\u0017\u0010\u000e\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010Y\u001a\u0004\u0008b\u0010-R\u0017\u0010\u000f\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010[\u001a\u0004\u0008c\u0010/R\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010d\u001a\u0004\u0008e\u00108R\u0017\u0010\u0013\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010f\u001a\u0004\u0008g\u0010:R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010h\u001a\u0004\u0008i\u0010<R\u0017\u0010\u0017\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010j\u001a\u0004\u0008k\u0010>R\u0017\u0010\u0019\u001a\u00020\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010l\u001a\u0004\u0008m\u0010@R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010n\u001a\u0004\u0008o\u0010BR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010Y\u001a\u0004\u0008p\u0010-R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010[\u001a\u0004\u0008q\u0010/R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010r\u001a\u0004\u0008s\u0010FR\u0019\u0010 \u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010Y\u001a\u0004\u0008t\u0010-R\u0019\u0010!\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010[\u001a\u0004\u0008u\u0010/R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010Y\u001a\u0004\u0008v\u0010-R\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010w\u001a\u0004\u0008x\u0010KR\u0019\u0010&\u001a\u0004\u0018\u00010%8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010y\u001a\u0004\u0008z\u0010M\u00a8\u0006{"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallResponse;",
        "",
        "",
        "backstage",
        "captioning",
        "",
        "cid",
        "Ljg3/i;",
        "createdAt",
        "currentSessionId",
        "id",
        "recording",
        "transcribing",
        "translating",
        "type",
        "updatedAt",
        "",
        "blockedUserIds",
        "Lio/getstream/android/video/generated/models/UserResponse;",
        "createdBy",
        "",
        "custom",
        "Lio/getstream/android/video/generated/models/EgressResponse;",
        "egress",
        "Lio/getstream/android/video/generated/models/CallIngressResponse;",
        "ingress",
        "Lio/getstream/android/video/generated/models/CallSettingsResponse;",
        "settings",
        "channelCid",
        "endedAt",
        "",
        "joinAheadTimeSeconds",
        "routingNumber",
        "startsAt",
        "team",
        "Lio/getstream/android/video/generated/models/CallSessionResponse;",
        "session",
        "Lio/getstream/android/video/generated/models/ThumbnailResponse;",
        "thumbnails",
        "<init>",
        "(ZZLjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljg3/i;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;Ljava/util/Map;Lio/getstream/android/video/generated/models/EgressResponse;Lio/getstream/android/video/generated/models/CallIngressResponse;Lio/getstream/android/video/generated/models/CallSettingsResponse;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;Lio/getstream/android/video/generated/models/ThumbnailResponse;)V",
        "component1",
        "()Z",
        "component2",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Ljg3/i;",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "()Ljava/util/List;",
        "component13",
        "()Lio/getstream/android/video/generated/models/UserResponse;",
        "component14",
        "()Ljava/util/Map;",
        "component15",
        "()Lio/getstream/android/video/generated/models/EgressResponse;",
        "component16",
        "()Lio/getstream/android/video/generated/models/CallIngressResponse;",
        "component17",
        "()Lio/getstream/android/video/generated/models/CallSettingsResponse;",
        "component18",
        "component19",
        "component20",
        "()Ljava/lang/Integer;",
        "component21",
        "component22",
        "component23",
        "component24",
        "()Lio/getstream/android/video/generated/models/CallSessionResponse;",
        "component25",
        "()Lio/getstream/android/video/generated/models/ThumbnailResponse;",
        "copy",
        "(ZZLjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljg3/i;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;Ljava/util/Map;Lio/getstream/android/video/generated/models/EgressResponse;Lio/getstream/android/video/generated/models/CallIngressResponse;Lio/getstream/android/video/generated/models/CallSettingsResponse;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;Lio/getstream/android/video/generated/models/ThumbnailResponse;)Lio/getstream/android/video/generated/models/CallResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getBackstage",
        "getCaptioning",
        "Ljava/lang/String;",
        "getCid",
        "Ljg3/i;",
        "getCreatedAt",
        "getCurrentSessionId",
        "getId",
        "getRecording",
        "getTranscribing",
        "getTranslating",
        "getType",
        "getUpdatedAt",
        "Ljava/util/List;",
        "getBlockedUserIds",
        "Lio/getstream/android/video/generated/models/UserResponse;",
        "getCreatedBy",
        "Ljava/util/Map;",
        "getCustom",
        "Lio/getstream/android/video/generated/models/EgressResponse;",
        "getEgress",
        "Lio/getstream/android/video/generated/models/CallIngressResponse;",
        "getIngress",
        "Lio/getstream/android/video/generated/models/CallSettingsResponse;",
        "getSettings",
        "getChannelCid",
        "getEndedAt",
        "Ljava/lang/Integer;",
        "getJoinAheadTimeSeconds",
        "getRoutingNumber",
        "getStartsAt",
        "getTeam",
        "Lio/getstream/android/video/generated/models/CallSessionResponse;",
        "getSession",
        "Lio/getstream/android/video/generated/models/ThumbnailResponse;",
        "getThumbnails",
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
.field private final backstage:Z

.field private final blockedUserIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final captioning:Z

.field private final channelCid:Ljava/lang/String;

.field private final cid:Ljava/lang/String;

.field private final createdAt:Ljg3/i;

.field private final createdBy:Lio/getstream/android/video/generated/models/UserResponse;

.field private final currentSessionId:Ljava/lang/String;

.field private final custom:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final egress:Lio/getstream/android/video/generated/models/EgressResponse;

.field private final endedAt:Ljg3/i;

.field private final id:Ljava/lang/String;

.field private final ingress:Lio/getstream/android/video/generated/models/CallIngressResponse;

.field private final joinAheadTimeSeconds:Ljava/lang/Integer;

.field private final recording:Z

.field private final routingNumber:Ljava/lang/String;

.field private final session:Lio/getstream/android/video/generated/models/CallSessionResponse;

.field private final settings:Lio/getstream/android/video/generated/models/CallSettingsResponse;

.field private final startsAt:Ljg3/i;

.field private final team:Ljava/lang/String;

.field private final thumbnails:Lio/getstream/android/video/generated/models/ThumbnailResponse;

.field private final transcribing:Z

.field private final translating:Z

.field private final type:Ljava/lang/String;

.field private final updatedAt:Ljg3/i;


# direct methods
.method public constructor <init>(ZZLjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljg3/i;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;Ljava/util/Map;Lio/getstream/android/video/generated/models/EgressResponse;Lio/getstream/android/video/generated/models/CallIngressResponse;Lio/getstream/android/video/generated/models/CallSettingsResponse;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;Lio/getstream/android/video/generated/models/ThumbnailResponse;)V
    .locals 13
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "backstage"
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime Lqx/q;
            name = "captioning"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "cid"
        .end annotation
    .end param
    .param p4    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "current_session_id"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "id"
        .end annotation
    .end param
    .param p7    # Z
        .annotation runtime Lqx/q;
            name = "recording"
        .end annotation
    .end param
    .param p8    # Z
        .annotation runtime Lqx/q;
            name = "transcribing"
        .end annotation
    .end param
    .param p9    # Z
        .annotation runtime Lqx/q;
            name = "translating"
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p11    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "updated_at"
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "blocked_user_ids"
        .end annotation
    .end param
    .param p13    # Lio/getstream/android/video/generated/models/UserResponse;
        .annotation runtime Lqx/q;
            name = "created_by"
        .end annotation
    .end param
    .param p14    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .param p15    # Lio/getstream/android/video/generated/models/EgressResponse;
        .annotation runtime Lqx/q;
            name = "egress"
        .end annotation
    .end param
    .param p16    # Lio/getstream/android/video/generated/models/CallIngressResponse;
        .annotation runtime Lqx/q;
            name = "ingress"
        .end annotation
    .end param
    .param p17    # Lio/getstream/android/video/generated/models/CallSettingsResponse;
        .annotation runtime Lqx/q;
            name = "settings"
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "channel_cid"
        .end annotation
    .end param
    .param p19    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "ended_at"
        .end annotation
    .end param
    .param p20    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "join_ahead_time_seconds"
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "routing_number"
        .end annotation
    .end param
    .param p22    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "starts_at"
        .end annotation
    .end param
    .param p23    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "team"
        .end annotation
    .end param
    .param p24    # Lio/getstream/android/video/generated/models/CallSessionResponse;
        .annotation runtime Lqx/q;
            name = "session"
        .end annotation
    .end param
    .param p25    # Lio/getstream/android/video/generated/models/ThumbnailResponse;
        .annotation runtime Lqx/q;
            name = "thumbnails"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZ",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/android/video/generated/models/UserResponse;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/android/video/generated/models/EgressResponse;",
            "Lio/getstream/android/video/generated/models/CallIngressResponse;",
            "Lio/getstream/android/video/generated/models/CallSettingsResponse;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/CallSessionResponse;",
            "Lio/getstream/android/video/generated/models/ThumbnailResponse;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p10

    move-object/from16 v5, p11

    move-object/from16 v6, p12

    move-object/from16 v7, p13

    move-object/from16 v8, p14

    move-object/from16 v9, p15

    move-object/from16 v10, p16

    move-object/from16 v11, p17

    const-string v12, "cid"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "createdAt"

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "currentSessionId"

    invoke-static {v2, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "id"

    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "type"

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "updatedAt"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "blockedUserIds"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "createdBy"

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "custom"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "egress"

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "ingress"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "settings"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lio/getstream/android/video/generated/models/CallResponse;->backstage:Z

    .line 3
    iput-boolean p2, p0, Lio/getstream/android/video/generated/models/CallResponse;->captioning:Z

    .line 4
    iput-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->cid:Ljava/lang/String;

    .line 5
    iput-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->createdAt:Ljg3/i;

    .line 6
    iput-object v2, p0, Lio/getstream/android/video/generated/models/CallResponse;->currentSessionId:Ljava/lang/String;

    .line 7
    iput-object v3, p0, Lio/getstream/android/video/generated/models/CallResponse;->id:Ljava/lang/String;

    move/from16 p1, p7

    .line 8
    iput-boolean p1, p0, Lio/getstream/android/video/generated/models/CallResponse;->recording:Z

    move/from16 p1, p8

    .line 9
    iput-boolean p1, p0, Lio/getstream/android/video/generated/models/CallResponse;->transcribing:Z

    move/from16 p1, p9

    .line 10
    iput-boolean p1, p0, Lio/getstream/android/video/generated/models/CallResponse;->translating:Z

    .line 11
    iput-object v4, p0, Lio/getstream/android/video/generated/models/CallResponse;->type:Ljava/lang/String;

    .line 12
    iput-object v5, p0, Lio/getstream/android/video/generated/models/CallResponse;->updatedAt:Ljg3/i;

    .line 13
    iput-object v6, p0, Lio/getstream/android/video/generated/models/CallResponse;->blockedUserIds:Ljava/util/List;

    .line 14
    iput-object v7, p0, Lio/getstream/android/video/generated/models/CallResponse;->createdBy:Lio/getstream/android/video/generated/models/UserResponse;

    .line 15
    iput-object v8, p0, Lio/getstream/android/video/generated/models/CallResponse;->custom:Ljava/util/Map;

    .line 16
    iput-object v9, p0, Lio/getstream/android/video/generated/models/CallResponse;->egress:Lio/getstream/android/video/generated/models/EgressResponse;

    .line 17
    iput-object v10, p0, Lio/getstream/android/video/generated/models/CallResponse;->ingress:Lio/getstream/android/video/generated/models/CallIngressResponse;

    .line 18
    iput-object v11, p0, Lio/getstream/android/video/generated/models/CallResponse;->settings:Lio/getstream/android/video/generated/models/CallSettingsResponse;

    move-object/from16 p1, p18

    .line 19
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallResponse;->channelCid:Ljava/lang/String;

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallResponse;->endedAt:Ljg3/i;

    move-object/from16 p1, p20

    .line 21
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallResponse;->joinAheadTimeSeconds:Ljava/lang/Integer;

    move-object/from16 p1, p21

    .line 22
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallResponse;->routingNumber:Ljava/lang/String;

    move-object/from16 p1, p22

    .line 23
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallResponse;->startsAt:Ljg3/i;

    move-object/from16 p1, p23

    .line 24
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallResponse;->team:Ljava/lang/String;

    move-object/from16 p1, p24

    .line 25
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallResponse;->session:Lio/getstream/android/video/generated/models/CallSessionResponse;

    move-object/from16 p1, p25

    .line 26
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallResponse;->thumbnails:Lio/getstream/android/video/generated/models/ThumbnailResponse;

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljg3/i;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;Ljava/util/Map;Lio/getstream/android/video/generated/models/EgressResponse;Lio/getstream/android/video/generated/models/CallIngressResponse;Lio/getstream/android/video/generated/models/CallSettingsResponse;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;Lio/getstream/android/video/generated/models/ThumbnailResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 28

    move/from16 v0, p26

    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_0

    .line 27
    sget-object v1, Lm83/y;->w:Lm83/y;

    move-object v14, v1

    goto :goto_0

    :cond_0
    move-object/from16 v14, p12

    :goto_0
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_1

    .line 28
    sget-object v1, Lm83/z;->w:Lm83/z;

    move-object/from16 v16, v1

    goto :goto_1

    :cond_1
    move-object/from16 v16, p14

    :goto_1
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object/from16 v20, v2

    goto :goto_2

    :cond_2
    move-object/from16 v20, p18

    :goto_2
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_3

    move-object/from16 v21, v2

    goto :goto_3

    :cond_3
    move-object/from16 v21, p19

    :goto_3
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_4

    move-object/from16 v22, v2

    goto :goto_4

    :cond_4
    move-object/from16 v22, p20

    :goto_4
    const/high16 v1, 0x100000

    and-int/2addr v1, v0

    if-eqz v1, :cond_5

    move-object/from16 v23, v2

    goto :goto_5

    :cond_5
    move-object/from16 v23, p21

    :goto_5
    const/high16 v1, 0x200000

    and-int/2addr v1, v0

    if-eqz v1, :cond_6

    move-object/from16 v24, v2

    goto :goto_6

    :cond_6
    move-object/from16 v24, p22

    :goto_6
    const/high16 v1, 0x400000

    and-int/2addr v1, v0

    if-eqz v1, :cond_7

    move-object/from16 v25, v2

    goto :goto_7

    :cond_7
    move-object/from16 v25, p23

    :goto_7
    const/high16 v1, 0x800000

    and-int/2addr v1, v0

    if-eqz v1, :cond_8

    move-object/from16 v26, v2

    goto :goto_8

    :cond_8
    move-object/from16 v26, p24

    :goto_8
    const/high16 v1, 0x1000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_9

    move-object/from16 v27, v2

    move/from16 v3, p1

    move/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v15, p13

    move-object/from16 v17, p15

    move-object/from16 v18, p16

    move-object/from16 v19, p17

    move-object/from16 v2, p0

    goto :goto_9

    :cond_9
    move-object/from16 v27, p25

    move-object/from16 v2, p0

    move/from16 v3, p1

    move/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v15, p13

    move-object/from16 v17, p15

    move-object/from16 v18, p16

    move-object/from16 v19, p17

    .line 29
    :goto_9
    invoke-direct/range {v2 .. v27}, Lio/getstream/android/video/generated/models/CallResponse;-><init>(ZZLjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljg3/i;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;Ljava/util/Map;Lio/getstream/android/video/generated/models/EgressResponse;Lio/getstream/android/video/generated/models/CallIngressResponse;Lio/getstream/android/video/generated/models/CallSettingsResponse;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;Lio/getstream/android/video/generated/models/ThumbnailResponse;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallResponse;ZZLjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljg3/i;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;Ljava/util/Map;Lio/getstream/android/video/generated/models/EgressResponse;Lio/getstream/android/video/generated/models/CallIngressResponse;Lio/getstream/android/video/generated/models/CallSettingsResponse;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;Lio/getstream/android/video/generated/models/ThumbnailResponse;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallResponse;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p26

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lio/getstream/android/video/generated/models/CallResponse;->backstage:Z

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lio/getstream/android/video/generated/models/CallResponse;->captioning:Z

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/android/video/generated/models/CallResponse;->cid:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/android/video/generated/models/CallResponse;->createdAt:Ljg3/i;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/android/video/generated/models/CallResponse;->currentSessionId:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/android/video/generated/models/CallResponse;->id:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lio/getstream/android/video/generated/models/CallResponse;->recording:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lio/getstream/android/video/generated/models/CallResponse;->transcribing:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lio/getstream/android/video/generated/models/CallResponse;->translating:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lio/getstream/android/video/generated/models/CallResponse;->type:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/android/video/generated/models/CallResponse;->updatedAt:Ljg3/i;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/android/video/generated/models/CallResponse;->blockedUserIds:Ljava/util/List;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/android/video/generated/models/CallResponse;->createdBy:Lio/getstream/android/video/generated/models/UserResponse;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallResponse;->custom:Ljava/util/Map;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lio/getstream/android/video/generated/models/CallResponse;->egress:Lio/getstream/android/video/generated/models/EgressResponse;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallResponse;->ingress:Lio/getstream/android/video/generated/models/CallIngressResponse;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p26, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallResponse;->settings:Lio/getstream/android/video/generated/models/CallSettingsResponse;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p26, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallResponse;->channelCid:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p26, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallResponse;->endedAt:Ljg3/i;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p26, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallResponse;->joinAheadTimeSeconds:Ljava/lang/Integer;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p26, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallResponse;->routingNumber:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p26, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallResponse;->startsAt:Ljg3/i;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p26, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallResponse;->team:Ljava/lang/String;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p26, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallResponse;->session:Lio/getstream/android/video/generated/models/CallSessionResponse;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p26, v16

    if-eqz v16, :cond_18

    move-object/from16 p10, v1

    iget-object v1, v0, Lio/getstream/android/video/generated/models/CallResponse;->thumbnails:Lio/getstream/android/video/generated/models/ThumbnailResponse;

    move-object/from16 p25, p10

    move-object/from16 p26, v1

    :goto_18
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p24, p9

    move-object/from16 p16, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_19

    :cond_18
    move-object/from16 p26, p25

    move-object/from16 p25, v1

    goto :goto_18

    :goto_19
    invoke-virtual/range {p1 .. p26}, Lio/getstream/android/video/generated/models/CallResponse;->copy(ZZLjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljg3/i;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;Ljava/util/Map;Lio/getstream/android/video/generated/models/EgressResponse;Lio/getstream/android/video/generated/models/CallIngressResponse;Lio/getstream/android/video/generated/models/CallSettingsResponse;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;Lio/getstream/android/video/generated/models/ThumbnailResponse;)Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->backstage:Z

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->updatedAt:Ljg3/i;

    return-object v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->blockedUserIds:Ljava/util/List;

    return-object v0
.end method

.method public final component13()Lio/getstream/android/video/generated/models/UserResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->createdBy:Lio/getstream/android/video/generated/models/UserResponse;

    return-object v0
.end method

.method public final component14()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public final component15()Lio/getstream/android/video/generated/models/EgressResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->egress:Lio/getstream/android/video/generated/models/EgressResponse;

    return-object v0
.end method

.method public final component16()Lio/getstream/android/video/generated/models/CallIngressResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->ingress:Lio/getstream/android/video/generated/models/CallIngressResponse;

    return-object v0
.end method

.method public final component17()Lio/getstream/android/video/generated/models/CallSettingsResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->settings:Lio/getstream/android/video/generated/models/CallSettingsResponse;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->channelCid:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->endedAt:Ljg3/i;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->captioning:Z

    return v0
.end method

.method public final component20()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->joinAheadTimeSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->routingNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->startsAt:Ljg3/i;

    return-object v0
.end method

.method public final component23()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->team:Ljava/lang/String;

    return-object v0
.end method

.method public final component24()Lio/getstream/android/video/generated/models/CallSessionResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->session:Lio/getstream/android/video/generated/models/CallSessionResponse;

    return-object v0
.end method

.method public final component25()Lio/getstream/android/video/generated/models/ThumbnailResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->thumbnails:Lio/getstream/android/video/generated/models/ThumbnailResponse;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->currentSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->recording:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->transcribing:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->translating:Z

    return v0
.end method

.method public final copy(ZZLjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljg3/i;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;Ljava/util/Map;Lio/getstream/android/video/generated/models/EgressResponse;Lio/getstream/android/video/generated/models/CallIngressResponse;Lio/getstream/android/video/generated/models/CallSettingsResponse;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;Lio/getstream/android/video/generated/models/ThumbnailResponse;)Lio/getstream/android/video/generated/models/CallResponse;
    .locals 27
    .param p1    # Z
        .annotation runtime Lqx/q;
            name = "backstage"
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime Lqx/q;
            name = "captioning"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "cid"
        .end annotation
    .end param
    .param p4    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "current_session_id"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "id"
        .end annotation
    .end param
    .param p7    # Z
        .annotation runtime Lqx/q;
            name = "recording"
        .end annotation
    .end param
    .param p8    # Z
        .annotation runtime Lqx/q;
            name = "transcribing"
        .end annotation
    .end param
    .param p9    # Z
        .annotation runtime Lqx/q;
            name = "translating"
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p11    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "updated_at"
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "blocked_user_ids"
        .end annotation
    .end param
    .param p13    # Lio/getstream/android/video/generated/models/UserResponse;
        .annotation runtime Lqx/q;
            name = "created_by"
        .end annotation
    .end param
    .param p14    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .param p15    # Lio/getstream/android/video/generated/models/EgressResponse;
        .annotation runtime Lqx/q;
            name = "egress"
        .end annotation
    .end param
    .param p16    # Lio/getstream/android/video/generated/models/CallIngressResponse;
        .annotation runtime Lqx/q;
            name = "ingress"
        .end annotation
    .end param
    .param p17    # Lio/getstream/android/video/generated/models/CallSettingsResponse;
        .annotation runtime Lqx/q;
            name = "settings"
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "channel_cid"
        .end annotation
    .end param
    .param p19    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "ended_at"
        .end annotation
    .end param
    .param p20    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "join_ahead_time_seconds"
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "routing_number"
        .end annotation
    .end param
    .param p22    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "starts_at"
        .end annotation
    .end param
    .param p23    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "team"
        .end annotation
    .end param
    .param p24    # Lio/getstream/android/video/generated/models/CallSessionResponse;
        .annotation runtime Lqx/q;
            name = "session"
        .end annotation
    .end param
    .param p25    # Lio/getstream/android/video/generated/models/ThumbnailResponse;
        .annotation runtime Lqx/q;
            name = "thumbnails"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZ",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/android/video/generated/models/UserResponse;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/android/video/generated/models/EgressResponse;",
            "Lio/getstream/android/video/generated/models/CallIngressResponse;",
            "Lio/getstream/android/video/generated/models/CallSettingsResponse;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Lio/getstream/android/video/generated/models/CallSessionResponse;",
            "Lio/getstream/android/video/generated/models/ThumbnailResponse;",
            ")",
            "Lio/getstream/android/video/generated/models/CallResponse;"
        }
    .end annotation

    const-string v0, "cid"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentSessionId"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "blockedUserIds"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdBy"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "custom"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "egress"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ingress"

    move-object/from16 v2, p16

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settings"

    move-object/from16 v3, p17

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/CallResponse;

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v16, p15

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v25, p24

    move-object/from16 v26, p25

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    move/from16 v2, p1

    move/from16 v3, p2

    invoke-direct/range {v1 .. v26}, Lio/getstream/android/video/generated/models/CallResponse;-><init>(ZZLjava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljg3/i;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;Ljava/util/Map;Lio/getstream/android/video/generated/models/EgressResponse;Lio/getstream/android/video/generated/models/CallIngressResponse;Lio/getstream/android/video/generated/models/CallSettingsResponse;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;Lio/getstream/android/video/generated/models/ThumbnailResponse;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallResponse;

    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->backstage:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->backstage:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->captioning:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->captioning:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->createdAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->createdAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->currentSessionId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->currentSessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->recording:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->recording:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->transcribing:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->transcribing:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->translating:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->translating:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->updatedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->updatedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->blockedUserIds:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->blockedUserIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->createdBy:Lio/getstream/android/video/generated/models/UserResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->createdBy:Lio/getstream/android/video/generated/models/UserResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->custom:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->custom:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->egress:Lio/getstream/android/video/generated/models/EgressResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->egress:Lio/getstream/android/video/generated/models/EgressResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->ingress:Lio/getstream/android/video/generated/models/CallIngressResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->ingress:Lio/getstream/android/video/generated/models/CallIngressResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->settings:Lio/getstream/android/video/generated/models/CallSettingsResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->settings:Lio/getstream/android/video/generated/models/CallSettingsResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->channelCid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->channelCid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->endedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->endedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->joinAheadTimeSeconds:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->joinAheadTimeSeconds:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->routingNumber:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->routingNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->startsAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->startsAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->team:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->team:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->session:Lio/getstream/android/video/generated/models/CallSessionResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallResponse;->session:Lio/getstream/android/video/generated/models/CallSessionResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallResponse;->thumbnails:Lio/getstream/android/video/generated/models/ThumbnailResponse;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallResponse;->thumbnails:Lio/getstream/android/video/generated/models/ThumbnailResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1a

    return v2

    :cond_1a
    return v0
.end method

.method public final getBackstage()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->backstage:Z

    return v0
.end method

.method public final getBlockedUserIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->blockedUserIds:Ljava/util/List;

    return-object v0
.end method

.method public final getCaptioning()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->captioning:Z

    return v0
.end method

.method public final getChannelCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->channelCid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final getCreatedBy()Lio/getstream/android/video/generated/models/UserResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->createdBy:Lio/getstream/android/video/generated/models/UserResponse;

    return-object v0
.end method

.method public final getCurrentSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->currentSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustom()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public final getEgress()Lio/getstream/android/video/generated/models/EgressResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->egress:Lio/getstream/android/video/generated/models/EgressResponse;

    return-object v0
.end method

.method public final getEndedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->endedAt:Ljg3/i;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getIngress()Lio/getstream/android/video/generated/models/CallIngressResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->ingress:Lio/getstream/android/video/generated/models/CallIngressResponse;

    return-object v0
.end method

.method public final getJoinAheadTimeSeconds()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->joinAheadTimeSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getRecording()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->recording:Z

    return v0
.end method

.method public final getRoutingNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->routingNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getSession()Lio/getstream/android/video/generated/models/CallSessionResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->session:Lio/getstream/android/video/generated/models/CallSessionResponse;

    return-object v0
.end method

.method public final getSettings()Lio/getstream/android/video/generated/models/CallSettingsResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->settings:Lio/getstream/android/video/generated/models/CallSettingsResponse;

    return-object v0
.end method

.method public final getStartsAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->startsAt:Ljg3/i;

    return-object v0
.end method

.method public final getTeam()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->team:Ljava/lang/String;

    return-object v0
.end method

.method public final getThumbnails()Lio/getstream/android/video/generated/models/ThumbnailResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->thumbnails:Lio/getstream/android/video/generated/models/ThumbnailResponse;

    return-object v0
.end method

.method public final getTranscribing()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->transcribing:Z

    return v0
.end method

.method public final getTranslating()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->translating:Z

    return v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->updatedAt:Ljg3/i;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->backstage:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/CallResponse;->captioning:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallResponse;->cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallResponse;->createdAt:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallResponse;->currentSessionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallResponse;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/CallResponse;->recording:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/CallResponse;->transcribing:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/CallResponse;->translating:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallResponse;->type:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallResponse;->updatedAt:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallResponse;->blockedUserIds:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallResponse;->createdBy:Lio/getstream/android/video/generated/models/UserResponse;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/UserResponse;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->custom:Ljava/util/Map;

    invoke-static {v0, v2, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallResponse;->egress:Lio/getstream/android/video/generated/models/EgressResponse;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/EgressResponse;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->ingress:Lio/getstream/android/video/generated/models/CallIngressResponse;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallIngressResponse;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallResponse;->settings:Lio/getstream/android/video/generated/models/CallSettingsResponse;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallSettingsResponse;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->channelCid:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->endedAt:Ljg3/i;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->joinAheadTimeSeconds:Ljava/lang/Integer;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->routingNumber:Ljava/lang/String;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->startsAt:Ljg3/i;

    if-nez v0, :cond_4

    move v0, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->team:Ljava/lang/String;

    if-nez v0, :cond_5

    move v0, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->session:Lio/getstream/android/video/generated/models/CallSessionResponse;

    if-nez v0, :cond_6

    move v0, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSessionResponse;->hashCode()I

    move-result v0

    :goto_6
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallResponse;->thumbnails:Lio/getstream/android/video/generated/models/ThumbnailResponse;

    if-nez v0, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/ThumbnailResponse;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 28

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lio/getstream/android/video/generated/models/CallResponse;->backstage:Z

    iget-boolean v2, v0, Lio/getstream/android/video/generated/models/CallResponse;->captioning:Z

    iget-object v3, v0, Lio/getstream/android/video/generated/models/CallResponse;->cid:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/android/video/generated/models/CallResponse;->createdAt:Ljg3/i;

    iget-object v5, v0, Lio/getstream/android/video/generated/models/CallResponse;->currentSessionId:Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/android/video/generated/models/CallResponse;->id:Ljava/lang/String;

    iget-boolean v7, v0, Lio/getstream/android/video/generated/models/CallResponse;->recording:Z

    iget-boolean v8, v0, Lio/getstream/android/video/generated/models/CallResponse;->transcribing:Z

    iget-boolean v9, v0, Lio/getstream/android/video/generated/models/CallResponse;->translating:Z

    iget-object v10, v0, Lio/getstream/android/video/generated/models/CallResponse;->type:Ljava/lang/String;

    iget-object v11, v0, Lio/getstream/android/video/generated/models/CallResponse;->updatedAt:Ljg3/i;

    iget-object v12, v0, Lio/getstream/android/video/generated/models/CallResponse;->blockedUserIds:Ljava/util/List;

    iget-object v13, v0, Lio/getstream/android/video/generated/models/CallResponse;->createdBy:Lio/getstream/android/video/generated/models/UserResponse;

    iget-object v14, v0, Lio/getstream/android/video/generated/models/CallResponse;->custom:Ljava/util/Map;

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallResponse;->egress:Lio/getstream/android/video/generated/models/EgressResponse;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallResponse;->ingress:Lio/getstream/android/video/generated/models/CallIngressResponse;

    move-object/from16 v17, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallResponse;->settings:Lio/getstream/android/video/generated/models/CallSettingsResponse;

    move-object/from16 v18, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallResponse;->channelCid:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallResponse;->endedAt:Ljg3/i;

    move-object/from16 v20, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallResponse;->joinAheadTimeSeconds:Ljava/lang/Integer;

    move-object/from16 v21, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallResponse;->routingNumber:Ljava/lang/String;

    move-object/from16 v22, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallResponse;->startsAt:Ljg3/i;

    move-object/from16 v23, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallResponse;->team:Ljava/lang/String;

    move-object/from16 v24, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallResponse;->session:Lio/getstream/android/video/generated/models/CallSessionResponse;

    move-object/from16 v25, v15

    iget-object v15, v0, Lio/getstream/android/video/generated/models/CallResponse;->thumbnails:Lio/getstream/android/video/generated/models/ThumbnailResponse;

    const-string v0, ", captioning="

    move-object/from16 v26, v15

    const-string v15, ", cid="

    move-object/from16 v27, v14

    const-string v14, "CallResponse(backstage="

    invoke-static {v14, v0, v15, v1, v2}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentSessionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    const-string v2, ", recording="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", transcribing="

    const-string v2, ", translating="

    invoke-static {v0, v7, v1, v8, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", type="

    const-string v2, ", updatedAt="

    invoke-static {v0, v9, v1, v10, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", blockedUserIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdBy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", custom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", egress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ingress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", settings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channelCid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", endedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", joinAheadTimeSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", routingNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", startsAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", team="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", session="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", thumbnails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
