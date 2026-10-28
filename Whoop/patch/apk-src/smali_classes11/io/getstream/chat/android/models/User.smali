.class public final Lio/getstream/chat/android/models/User;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/models/CustomObject;
.implements Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/models/User$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008.\n\u0002\u0010\u000f\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008!\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002:\u0001yB\u00c9\u0002\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0017\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0017\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0017\u0012\u000e\u0008\u0002\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000f\u0012\u000e\u0008\u0002\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u0014\u0008\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e\u0012\u000e\u0008\u0002\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020 0\u000f\u0012\u000e\u0008\u0002\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000f\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\u0014\u0008\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\'0\u001e\u0012\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008)\u0010*J\u0016\u0010U\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010V2\u0006\u0010W\u001a\u00020\u0004H\u0016J\u0008\u0010X\u001a\u00020YH\u0007J\t\u0010Z\u001a\u00020\u0004H\u00c6\u0003J\t\u0010[\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0004H\u00c6\u0003J\t\u0010]\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00101J\u000b\u0010_\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010`\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00101J\u000f\u0010b\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0003J\t\u0010c\u001a\u00020\tH\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\t\u0010g\u001a\u00020\u0017H\u00c6\u0003J\t\u0010h\u001a\u00020\u0017H\u00c6\u0003J\t\u0010i\u001a\u00020\u0017H\u00c6\u0003J\u000f\u0010j\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000fH\u00c6\u0003J\u000f\u0010k\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000fH\u00c6\u0003J\u0015\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001eH\u00c6\u0003J\u000f\u0010m\u001a\u0008\u0012\u0004\u0012\u00020 0\u000fH\u00c6\u0003J\u000f\u0010n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000fH\u00c6\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010#H\u00c6\u0003\u00a2\u0006\u0002\u0010JJ\u000b\u0010p\u001a\u0004\u0018\u00010%H\u00c6\u0003J\u0015\u0010q\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\'0\u001eH\u00c6\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u00d0\u0002\u0010s\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00042\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\t2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00172\u000e\u0008\u0002\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000f2\u000e\u0008\u0002\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000f2\u0014\u0008\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e2\u000e\u0008\u0002\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020 0\u000f2\u000e\u0008\u0002\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000f2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010%2\u0014\u0008\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\'0\u001e2\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001\u00a2\u0006\u0002\u0010tJ\u0013\u0010u\u001a\u00020\t2\u0008\u0010v\u001a\u0004\u0018\u00010\'H\u00d6\u0003J\t\u0010w\u001a\u00020\u0017H\u00d6\u0001J\t\u0010x\u001a\u00020\u0004H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010,R\u0011\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010,R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010,R\u0015\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\u00080\u00101R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u0011\u0010\u000c\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010,R\u0015\u0010\r\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\u00086\u00101R\u0017\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u00108R\u0011\u0010\u0011\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010<R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010<R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010<R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010@R\u0011\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010@R\u0011\u0010\u0019\u001a\u00020\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u0010@R\u0017\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u00108R\u0017\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008D\u00108R\u001d\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u0010FR\u0017\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020 0\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u00108R\u0017\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008H\u00108R\u0015\u0010\"\u001a\u0004\u0018\u00010#\u00a2\u0006\n\n\u0002\u0010K\u001a\u0004\u0008I\u0010JR\u0013\u0010$\u001a\u0004\u0018\u00010%\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008L\u0010MR \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\'0\u001eX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u0010FR\u0013\u0010(\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008O\u0010<R\u0011\u0010P\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008P\u0010:R\u0011\u0010Q\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008Q\u0010:R\u0011\u0010R\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008R\u0010:R\u0011\u0010S\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008S\u0010:R\u0011\u0010T\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008T\u0010:\u00a8\u0006z"
    }
    d2 = {
        "Lio/getstream/chat/android/models/User;",
        "Lio/getstream/chat/android/models/CustomObject;",
        "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
        "id",
        "",
        "role",
        "name",
        "image",
        "invisible",
        "",
        "privacySettings",
        "Lio/getstream/chat/android/PrivacySettings;",
        "language",
        "banned",
        "devices",
        "",
        "Lio/getstream/chat/android/models/Device;",
        "online",
        "createdAt",
        "Ljava/util/Date;",
        "updatedAt",
        "lastActive",
        "totalUnreadCount",
        "",
        "unreadChannels",
        "unreadThreads",
        "mutes",
        "Lio/getstream/chat/android/models/Mute;",
        "teams",
        "teamsRole",
        "",
        "channelMutes",
        "Lio/getstream/chat/android/models/ChannelMute;",
        "blockedUserIds",
        "avgResponseTime",
        "",
        "pushPreference",
        "Lio/getstream/chat/android/models/PushPreference;",
        "extraData",
        "",
        "deactivatedAt",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;)V",
        "getId",
        "()Ljava/lang/String;",
        "getRole",
        "getName",
        "getImage",
        "getInvisible",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getPrivacySettings",
        "()Lio/getstream/chat/android/PrivacySettings;",
        "getLanguage",
        "getBanned",
        "getDevices",
        "()Ljava/util/List;",
        "getOnline",
        "()Z",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "getUpdatedAt",
        "getLastActive",
        "getTotalUnreadCount",
        "()I",
        "getUnreadChannels",
        "getUnreadThreads",
        "getMutes",
        "getTeams",
        "getTeamsRole",
        "()Ljava/util/Map;",
        "getChannelMutes",
        "getBlockedUserIds",
        "getAvgResponseTime",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getPushPreference",
        "()Lio/getstream/chat/android/models/PushPreference;",
        "getExtraData",
        "getDeactivatedAt",
        "isBanned",
        "isInvisible",
        "isTypingIndicatorsEnabled",
        "isReadReceiptsEnabled",
        "isDeliveryReceiptsEnabled",
        "getComparableField",
        "",
        "fieldName",
        "newBuilder",
        "Lio/getstream/chat/android/models/User$Builder;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
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
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;)Lio/getstream/chat/android/models/User;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "Builder",
        "stream-chat-android-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final avgResponseTime:Ljava/lang/Long;

.field private final banned:Ljava/lang/Boolean;

.field private final blockedUserIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final channelMutes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelMute;",
            ">;"
        }
    .end annotation
.end field

.field private final createdAt:Ljava/util/Date;

.field private final deactivatedAt:Ljava/util/Date;

.field private final devices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Device;",
            ">;"
        }
    .end annotation
.end field

.field private final extraData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final id:Ljava/lang/String;

.field private final image:Ljava/lang/String;

.field private final invisible:Ljava/lang/Boolean;

.field private final language:Ljava/lang/String;

.field private final lastActive:Ljava/util/Date;

.field private final mutes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Mute;",
            ">;"
        }
    .end annotation
.end field

.field private final name:Ljava/lang/String;

.field private final online:Z

.field private final privacySettings:Lio/getstream/chat/android/PrivacySettings;

.field private final pushPreference:Lio/getstream/chat/android/models/PushPreference;

.field private final role:Ljava/lang/String;

.field private final teams:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final teamsRole:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final totalUnreadCount:I

.field private final unreadChannels:I

.field private final unreadThreads:I

.field private final updatedAt:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 28

    .line 1
    const v26, 0x1ffffff

    const/16 v27, 0x0

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

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v27}, Lio/getstream/chat/android/models/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lio/getstream/chat/android/PrivacySettings;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Device;",
            ">;Z",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "III",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Mute;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelMute;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Long;",
            "Lio/getstream/chat/android/models/PushPreference;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Date;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p7

    move-object/from16 v1, p9

    move-object/from16 v2, p17

    move-object/from16 v3, p18

    move-object/from16 v4, p19

    move-object/from16 v5, p20

    move-object/from16 v6, p21

    move-object/from16 v7, p24

    const-string v8, "id"

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "role"

    invoke-static {p2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "name"

    invoke-static {p3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "image"

    invoke-static {p4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "language"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "devices"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "mutes"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "teams"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "teamsRole"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "channelMutes"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "blockedUserIds"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "extraData"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/models/User;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/models/User;->role:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/models/User;->name:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/models/User;->image:Ljava/lang/String;

    move-object p1, p5

    .line 7
    iput-object p1, p0, Lio/getstream/chat/android/models/User;->invisible:Ljava/lang/Boolean;

    move-object p1, p6

    .line 8
    iput-object p1, p0, Lio/getstream/chat/android/models/User;->privacySettings:Lio/getstream/chat/android/PrivacySettings;

    .line 9
    iput-object v0, p0, Lio/getstream/chat/android/models/User;->language:Ljava/lang/String;

    move-object/from16 p1, p8

    .line 10
    iput-object p1, p0, Lio/getstream/chat/android/models/User;->banned:Ljava/lang/Boolean;

    .line 11
    iput-object v1, p0, Lio/getstream/chat/android/models/User;->devices:Ljava/util/List;

    move/from16 p1, p10

    .line 12
    iput-boolean p1, p0, Lio/getstream/chat/android/models/User;->online:Z

    move-object/from16 p1, p11

    .line 13
    iput-object p1, p0, Lio/getstream/chat/android/models/User;->createdAt:Ljava/util/Date;

    move-object/from16 p1, p12

    .line 14
    iput-object p1, p0, Lio/getstream/chat/android/models/User;->updatedAt:Ljava/util/Date;

    move-object/from16 p1, p13

    .line 15
    iput-object p1, p0, Lio/getstream/chat/android/models/User;->lastActive:Ljava/util/Date;

    move/from16 p1, p14

    .line 16
    iput p1, p0, Lio/getstream/chat/android/models/User;->totalUnreadCount:I

    move/from16 p1, p15

    .line 17
    iput p1, p0, Lio/getstream/chat/android/models/User;->unreadChannels:I

    move/from16 p1, p16

    .line 18
    iput p1, p0, Lio/getstream/chat/android/models/User;->unreadThreads:I

    .line 19
    iput-object v2, p0, Lio/getstream/chat/android/models/User;->mutes:Ljava/util/List;

    .line 20
    iput-object v3, p0, Lio/getstream/chat/android/models/User;->teams:Ljava/util/List;

    .line 21
    iput-object v4, p0, Lio/getstream/chat/android/models/User;->teamsRole:Ljava/util/Map;

    .line 22
    iput-object v5, p0, Lio/getstream/chat/android/models/User;->channelMutes:Ljava/util/List;

    .line 23
    iput-object v6, p0, Lio/getstream/chat/android/models/User;->blockedUserIds:Ljava/util/List;

    move-object/from16 p1, p22

    .line 24
    iput-object p1, p0, Lio/getstream/chat/android/models/User;->avgResponseTime:Ljava/lang/Long;

    move-object/from16 p1, p23

    .line 25
    iput-object p1, p0, Lio/getstream/chat/android/models/User;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    .line 26
    iput-object v7, p0, Lio/getstream/chat/android/models/User;->extraData:Ljava/util/Map;

    move-object/from16 p1, p25

    .line 27
    iput-object p1, p0, Lio/getstream/chat/android/models/User;->deactivatedAt:Ljava/util/Date;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 25

    move/from16 v0, p26

    and-int/lit8 v1, v0, 0x1

    .line 28
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move-object v4, v2

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move-object v5, v2

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
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    const/4 v8, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    goto :goto_6

    :cond_6
    move-object/from16 v2, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    sget-object v11, Lm83/y;->w:Lm83/y;

    if-eqz v10, :cond_8

    move-object v10, v11

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    const/4 v12, 0x0

    goto :goto_9

    :cond_9
    move/from16 v12, p10

    :goto_9
    and-int/lit16 v14, v0, 0x400

    if-eqz v14, :cond_a

    const/4 v14, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v14, p11

    :goto_a
    and-int/lit16 v15, v0, 0x800

    if-eqz v15, :cond_b

    const/4 v15, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v15, p12

    :goto_b
    and-int/lit16 v7, v0, 0x1000

    if-eqz v7, :cond_c

    const/4 v7, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v7, p13

    :goto_c
    and-int/lit16 v13, v0, 0x2000

    if-eqz v13, :cond_d

    const/4 v13, 0x0

    goto :goto_d

    :cond_d
    move/from16 v13, p14

    :goto_d
    move-object/from16 p27, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    const/4 v1, 0x0

    goto :goto_e

    :cond_e
    move/from16 v1, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x0

    goto :goto_f

    :cond_f
    move/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    move-object/from16 v17, v11

    goto :goto_10

    :cond_10
    move-object/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    move-object/from16 v18, v11

    goto :goto_11

    :cond_11
    move-object/from16 v18, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    sget-object v20, Lm83/z;->w:Lm83/z;

    if-eqz v19, :cond_12

    move-object/from16 v19, v20

    goto :goto_12

    :cond_12
    move-object/from16 v19, p19

    :goto_12
    const/high16 v21, 0x80000

    and-int v21, v0, v21

    if-eqz v21, :cond_13

    move-object/from16 v21, v11

    goto :goto_13

    :cond_13
    move-object/from16 v21, p20

    :goto_13
    const/high16 v22, 0x100000

    and-int v22, v0, v22

    if-eqz v22, :cond_14

    goto :goto_14

    :cond_14
    move-object/from16 v11, p21

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

    goto :goto_17

    :cond_17
    move-object/from16 v20, p24

    :goto_17
    const/high16 v24, 0x1000000

    and-int v0, v0, v24

    if-eqz v0, :cond_18

    const/16 p26, 0x0

    :goto_18
    move-object/from16 p1, p0

    move-object/from16 p2, p27

    move/from16 p16, v1

    move-object/from16 p8, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p14, v7

    move-object/from16 p7, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p22, v11

    move/from16 p11, v12

    move/from16 p15, v13

    move-object/from16 p12, v14

    move-object/from16 p13, v15

    move/from16 p17, v16

    move-object/from16 p18, v17

    move-object/from16 p19, v18

    move-object/from16 p20, v19

    move-object/from16 p25, v20

    move-object/from16 p21, v21

    move-object/from16 p23, v22

    move-object/from16 p24, v23

    goto :goto_19

    :cond_18
    move-object/from16 p26, p25

    goto :goto_18

    :goto_19
    invoke-direct/range {p1 .. p26}, Lio/getstream/chat/android/models/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/User;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p26

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/models/User;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/models/User;->role:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/models/User;->name:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/chat/android/models/User;->image:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/chat/android/models/User;->invisible:Ljava/lang/Boolean;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/chat/android/models/User;->privacySettings:Lio/getstream/chat/android/PrivacySettings;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/chat/android/models/User;->language:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lio/getstream/chat/android/models/User;->banned:Ljava/lang/Boolean;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/getstream/chat/android/models/User;->devices:Ljava/util/List;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lio/getstream/chat/android/models/User;->online:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/chat/android/models/User;->createdAt:Ljava/util/Date;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/chat/android/models/User;->updatedAt:Ljava/util/Date;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/chat/android/models/User;->lastActive:Ljava/util/Date;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lio/getstream/chat/android/models/User;->totalUnreadCount:I

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lio/getstream/chat/android/models/User;->unreadChannels:I

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget v1, v0, Lio/getstream/chat/android/models/User;->unreadThreads:I

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p26, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lio/getstream/chat/android/models/User;->mutes:Ljava/util/List;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p26, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lio/getstream/chat/android/models/User;->teams:Ljava/util/List;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p26, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lio/getstream/chat/android/models/User;->teamsRole:Ljava/util/Map;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p26, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lio/getstream/chat/android/models/User;->channelMutes:Ljava/util/List;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p26, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lio/getstream/chat/android/models/User;->blockedUserIds:Ljava/util/List;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p26, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lio/getstream/chat/android/models/User;->avgResponseTime:Ljava/lang/Long;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p26, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lio/getstream/chat/android/models/User;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p26, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lio/getstream/chat/android/models/User;->extraData:Ljava/util/Map;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p26, v16

    if-eqz v16, :cond_18

    move-object/from16 p10, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/User;->deactivatedAt:Ljava/util/Date;

    move-object/from16 p25, p10

    move-object/from16 p26, v1

    :goto_18
    move/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p24, p9

    move/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_19

    :cond_18
    move-object/from16 p26, p25

    move-object/from16 p25, v1

    goto :goto_18

    :goto_19
    invoke-virtual/range {p1 .. p26}, Lio/getstream/chat/android/models/User;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;)Lio/getstream/chat/android/models/User;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/User;->online:Z

    return v0
.end method

.method public final component11()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component12()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component13()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->lastActive:Ljava/util/Date;

    return-object v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/User;->totalUnreadCount:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/User;->unreadChannels:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/User;->unreadThreads:I

    return v0
.end method

.method public final component17()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Mute;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->mutes:Ljava/util/List;

    return-object v0
.end method

.method public final component18()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->teams:Ljava/util/List;

    return-object v0
.end method

.method public final component19()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->teamsRole:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelMute;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->channelMutes:Ljava/util/List;

    return-object v0
.end method

.method public final component21()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->blockedUserIds:Ljava/util/List;

    return-object v0
.end method

.method public final component22()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->avgResponseTime:Ljava/lang/Long;

    return-object v0
.end method

.method public final component23()Lio/getstream/chat/android/models/PushPreference;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    return-object v0
.end method

.method public final component24()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component25()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->deactivatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->invisible:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component6()Lio/getstream/chat/android/PrivacySettings;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->privacySettings:Lio/getstream/chat/android/PrivacySettings;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->language:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->banned:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Device;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->devices:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;)Lio/getstream/chat/android/models/User;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lio/getstream/chat/android/PrivacySettings;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Device;",
            ">;Z",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "III",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Mute;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelMute;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Long;",
            "Lio/getstream/chat/android/models/PushPreference;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Date;",
            ")",
            "Lio/getstream/chat/android/models/User;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "language"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "devices"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mutes"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teams"

    move-object/from16 v6, p18

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teamsRole"

    move-object/from16 v7, p19

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelMutes"

    move-object/from16 v9, p20

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "blockedUserIds"

    move-object/from16 v11, p21

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v12, p24

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/models/User;

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v26, p25

    move-object/from16 v19, v6

    move-object/from16 v20, v7

    move-object/from16 v21, v9

    move-object/from16 v22, v11

    move-object/from16 v25, v12

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v26}, Lio/getstream/chat/android/models/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/models/User;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/models/User;

    iget-object v1, p0, Lio/getstream/chat/android/models/User;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->role:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->role:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->image:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->image:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->invisible:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->invisible:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->privacySettings:Lio/getstream/chat/android/PrivacySettings;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->privacySettings:Lio/getstream/chat/android/PrivacySettings;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->language:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->language:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->banned:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->banned:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->devices:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->devices:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lio/getstream/chat/android/models/User;->online:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/User;->online:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->updatedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->updatedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->lastActive:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->lastActive:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lio/getstream/chat/android/models/User;->totalUnreadCount:I

    iget v3, p1, Lio/getstream/chat/android/models/User;->totalUnreadCount:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lio/getstream/chat/android/models/User;->unreadChannels:I

    iget v3, p1, Lio/getstream/chat/android/models/User;->unreadChannels:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lio/getstream/chat/android/models/User;->unreadThreads:I

    iget v3, p1, Lio/getstream/chat/android/models/User;->unreadThreads:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->mutes:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->mutes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->teams:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->teams:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->teamsRole:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->teamsRole:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->channelMutes:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->channelMutes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->blockedUserIds:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->blockedUserIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->avgResponseTime:Ljava/lang/Long;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->avgResponseTime:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->extraData:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/models/User;->extraData:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lio/getstream/chat/android/models/User;->deactivatedAt:Ljava/util/Date;

    iget-object p1, p1, Lio/getstream/chat/android/models/User;->deactivatedAt:Ljava/util/Date;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1a

    return v2

    :cond_1a
    return v0
.end method

.method public final getAvgResponseTime()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->avgResponseTime:Ljava/lang/Long;

    return-object v0
.end method

.method public final getBanned()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->banned:Ljava/lang/Boolean;

    return-object v0
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

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->blockedUserIds:Ljava/util/List;

    return-object v0
.end method

.method public final getChannelMutes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelMute;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->channelMutes:Ljava/util/List;

    return-object v0
.end method

.method public getComparableField(Ljava/lang/String;)Ljava/lang/Comparable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Comparable<",
            "*>;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "avgResponseTime"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "last_active"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "lastActive"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/models/User;->lastActive:Ljava/util/Date;

    return-object p1

    :sswitch_3
    const-string v0, "created_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "totalUnreadCount"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "createdAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/models/User;->createdAt:Ljava/util/Date;

    return-object p1

    :sswitch_6
    const-string v0, "deactivated_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "image"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/models/User;->image:Ljava/lang/String;

    return-object p1

    :sswitch_8
    const-string v0, "role"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/models/User;->role:Ljava/lang/String;

    return-object p1

    :sswitch_9
    const-string v0, "name"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/models/User;->name:Ljava/lang/String;

    return-object p1

    :sswitch_a
    const-string v0, "id"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/models/User;->id:Ljava/lang/String;

    return-object p1

    :sswitch_b
    const-string v0, "deactivatedAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    iget-object p1, p0, Lio/getstream/chat/android/models/User;->deactivatedAt:Ljava/util/Date;

    return-object p1

    :sswitch_c
    const-string v0, "updated_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "avg_response_time"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    iget-object p1, p0, Lio/getstream/chat/android/models/User;->avgResponseTime:Ljava/lang/Long;

    return-object p1

    :sswitch_e
    const-string v0, "unreadThreads"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "online"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    iget-boolean p1, p0, Lio/getstream/chat/android/models/User;->online:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :sswitch_10
    const-string v0, "unreadChannels"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :sswitch_11
    const-string v0, "banned"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    iget-object p1, p0, Lio/getstream/chat/android/models/User;->banned:Ljava/lang/Boolean;

    return-object p1

    :sswitch_12
    const-string v0, "language"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    iget-object p1, p0, Lio/getstream/chat/android/models/User;->language:Ljava/lang/String;

    return-object p1

    :sswitch_13
    const-string v0, "unread_threads"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    iget p1, p0, Lio/getstream/chat/android/models/User;->unreadThreads:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :sswitch_14
    const-string v0, "unread_channels"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :cond_c
    iget p1, p0, Lio/getstream/chat/android/models/User;->unreadChannels:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :sswitch_15
    const-string v0, "invisible"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_0

    :cond_d
    iget-object p1, p0, Lio/getstream/chat/android/models/User;->invisible:Ljava/lang/Boolean;

    return-object p1

    :sswitch_16
    const-string v0, "total_unread_count"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_0

    :cond_e
    iget p1, p0, Lio/getstream/chat/android/models/User;->totalUnreadCount:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :sswitch_17
    const-string v0, "updatedAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    :goto_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getExtraData()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/Comparable;

    if-eqz v0, :cond_f

    check-cast p1, Ljava/lang/Comparable;

    return-object p1

    :cond_f
    const/4 p1, 0x0

    return-object p1

    :cond_10
    iget-object p1, p0, Lio/getstream/chat/android/models/User;->updatedAt:Ljava/util/Date;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x742e59b2 -> :sswitch_17
        -0x71a39a66 -> :sswitch_16
        -0x715b4053 -> :sswitch_15
        -0x6fdb69a0 -> :sswitch_14
        -0x66a050e7 -> :sswitch_13
        -0x602d6ca8 -> :sswitch_12
        -0x533a80e2 -> :sswitch_11
        -0x4a322361 -> :sswitch_10
        -0x3c5549ad -> :sswitch_f
        -0x2b9adb06 -> :sswitch_e
        -0x19df92a2 -> :sswitch_d
        -0x119c6dc9 -> :sswitch_c
        -0x1017953d -> :sswitch_b
        0xd1b -> :sswitch_a
        0x337a8b -> :sswitch_9
        0x358076 -> :sswitch_8
        0x5faa95b -> :sswitch_7
        0xd255c62 -> :sswitch_6
        0x23aa6d3b -> :sswitch_5
        0x46e5bcbc -> :sswitch_4
        0x51a3a8ea -> :sswitch_3
        0x53f8353c -> :sswitch_2
        0x59b4f4cf -> :sswitch_1
        0x7ea9f6a0 -> :sswitch_0
    .end sparse-switch
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getDeactivatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->deactivatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getDevices()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Device;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->devices:Ljava/util/List;

    return-object v0
.end method

.method public getExtraData()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public getExtraValue(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)TT;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/models/CustomObject;->getExtraValue(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final getInvisible()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->invisible:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getLanguage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->language:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastActive()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->lastActive:Ljava/util/Date;

    return-object v0
.end method

.method public final getMutes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Mute;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->mutes:Ljava/util/List;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnline()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/User;->online:Z

    return v0
.end method

.method public final getPrivacySettings()Lio/getstream/chat/android/PrivacySettings;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->privacySettings:Lio/getstream/chat/android/PrivacySettings;

    return-object v0
.end method

.method public final getPushPreference()Lio/getstream/chat/android/models/PushPreference;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    return-object v0
.end method

.method public final getRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final getTeams()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->teams:Ljava/util/List;

    return-object v0
.end method

.method public final getTeamsRole()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->teamsRole:Ljava/util/Map;

    return-object v0
.end method

.method public final getTotalUnreadCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/User;->totalUnreadCount:I

    return v0
.end method

.method public final getUnreadChannels()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/User;->unreadChannels:I

    return v0
.end method

.method public final getUnreadThreads()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/User;->unreadThreads:I

    return v0
.end method

.method public final getUpdatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->role:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->image:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->invisible:Ljava/lang/Boolean;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->privacySettings:Lio/getstream/chat/android/PrivacySettings;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lio/getstream/chat/android/PrivacySettings;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->language:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->banned:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->devices:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/models/User;->online:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->createdAt:Ljava/util/Date;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->updatedAt:Ljava/util/Date;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->lastActive:Ljava/util/Date;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/models/User;->totalUnreadCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/models/User;->unreadChannels:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/models/User;->unreadThreads:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->mutes:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->teams:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->teamsRole:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->channelMutes:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->blockedUserIds:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->avgResponseTime:Ljava/lang/Long;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lio/getstream/chat/android/models/PushPreference;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/User;->extraData:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/models/User;->deactivatedAt:Ljava/util/Date;

    if-nez v1, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    return v0
.end method

.method public final isBanned()Z
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->banned:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final isDeliveryReceiptsEnabled()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->privacySettings:Lio/getstream/chat/android/PrivacySettings;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/PrivacySettings;->getDeliveryReceipts()Lio/getstream/chat/android/DeliveryReceipts;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/DeliveryReceipts;->getEnabled()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final isInvisible()Z
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->invisible:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final isReadReceiptsEnabled()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->privacySettings:Lio/getstream/chat/android/PrivacySettings;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/PrivacySettings;->getReadReceipts()Lio/getstream/chat/android/ReadReceipts;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ReadReceipts;->getEnabled()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final isTypingIndicatorsEnabled()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/User;->privacySettings:Lio/getstream/chat/android/PrivacySettings;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/PrivacySettings;->getTypingIndicators()Lio/getstream/chat/android/TypingIndicators;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/TypingIndicators;->getEnabled()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final newBuilder()Lio/getstream/chat/android/models/User$Builder;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/models/User$Builder;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/models/User$Builder;-><init>(Lio/getstream/chat/android/models/User;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 28

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/models/User;->id:Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/models/User;->role:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/models/User;->name:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/models/User;->image:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/chat/android/models/User;->invisible:Ljava/lang/Boolean;

    iget-object v6, v0, Lio/getstream/chat/android/models/User;->privacySettings:Lio/getstream/chat/android/PrivacySettings;

    iget-object v7, v0, Lio/getstream/chat/android/models/User;->language:Ljava/lang/String;

    iget-object v8, v0, Lio/getstream/chat/android/models/User;->banned:Ljava/lang/Boolean;

    iget-object v9, v0, Lio/getstream/chat/android/models/User;->devices:Ljava/util/List;

    iget-boolean v10, v0, Lio/getstream/chat/android/models/User;->online:Z

    iget-object v11, v0, Lio/getstream/chat/android/models/User;->createdAt:Ljava/util/Date;

    iget-object v12, v0, Lio/getstream/chat/android/models/User;->updatedAt:Ljava/util/Date;

    iget-object v13, v0, Lio/getstream/chat/android/models/User;->lastActive:Ljava/util/Date;

    iget v14, v0, Lio/getstream/chat/android/models/User;->totalUnreadCount:I

    iget v15, v0, Lio/getstream/chat/android/models/User;->unreadChannels:I

    move/from16 v16, v15

    iget v15, v0, Lio/getstream/chat/android/models/User;->unreadThreads:I

    move/from16 v17, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/User;->mutes:Ljava/util/List;

    move-object/from16 v18, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/User;->teams:Ljava/util/List;

    move-object/from16 v19, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/User;->teamsRole:Ljava/util/Map;

    move-object/from16 v20, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/User;->channelMutes:Ljava/util/List;

    move-object/from16 v21, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/User;->blockedUserIds:Ljava/util/List;

    move-object/from16 v22, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/User;->avgResponseTime:Ljava/lang/Long;

    move-object/from16 v23, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/User;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    move-object/from16 v24, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/User;->extraData:Ljava/util/Map;

    move-object/from16 v25, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/User;->deactivatedAt:Ljava/util/Date;

    const-string v0, ", role="

    move-object/from16 v26, v15

    const-string v15, ", name="

    move/from16 v27, v14

    const-string v14, "User(id="

    invoke-static {v14, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", image="

    const-string v2, ", invisible="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", privacySettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", language="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", banned="

    const-string v2, ", devices="

    invoke-static {v8, v7, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", online="

    const-string v2, ", createdAt="

    invoke-static {v1, v2, v0, v9, v10}, Lnh3/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    const-string v1, ", updatedAt="

    const-string v2, ", lastActive="

    invoke-static {v0, v11, v1, v12, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", totalUnreadCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", unreadChannels="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", unreadThreads="

    const-string v2, ", mutes="

    move/from16 v3, v16

    move/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", teams="

    const-string v2, ", teamsRole="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channelMutes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", blockedUserIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", avgResponseTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pushPreference="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deactivatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    move-object/from16 v2, v26

    invoke-static {v0, v2, v1}, Lev/n;->k(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
