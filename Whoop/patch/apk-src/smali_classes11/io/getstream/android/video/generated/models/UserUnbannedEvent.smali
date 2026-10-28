.class public final Lio/getstream/android/video/generated/models/UserUnbannedEvent;
.super Lio/getstream/android/video/generated/models/VideoEvent;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u00088\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00c3\u0001\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0008\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u0005\u0012\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0018\u0008\u0003\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001aJ\u0012\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001aJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001cJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010\u001aJ \u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010\u001eJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010 J\u00cc\u0001\u0010.\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0016\u0008\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0008\u0008\u0003\u0010\t\u001a\u00020\u00082\u0008\u0008\u0003\u0010\n\u001a\u00020\u00052\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0018\u0008\u0003\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00042\n\u0008\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u00080\u0010\u001aJ\u0010\u00101\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u00081\u00102J\u001a\u00104\u001a\u00020\u00122\u0008\u00103\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003\u00a2\u0006\u0004\u00084\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00106\u001a\u0004\u00087\u0010\u001cR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00108\u001a\u0004\u00089\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010:\u001a\u0004\u0008;\u0010 R\u0017\u0010\n\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010<\u001a\u0004\u0008=\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010<\u001a\u0004\u0008>\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010?\u001a\u0004\u0008@\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010?\u001a\u0004\u0008A\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010<\u001a\u0004\u0008B\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010<\u001a\u0004\u0008C\u0010\u001aR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u00106\u001a\u0004\u0008D\u0010\u001cR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010E\u001a\u0004\u0008F\u0010*R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010<\u001a\u0004\u0008G\u0010\u001aR\'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u00108\u001a\u0004\u0008H\u0010\u001eR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010:\u001a\u0004\u0008I\u0010 \u00a8\u0006J"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/UserUnbannedEvent;",
        "Lio/getstream/android/video/generated/models/VideoEvent;",
        "Ljg3/i;",
        "createdAt",
        "",
        "",
        "",
        "custom",
        "Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
        "user",
        "type",
        "channelId",
        "",
        "channelMemberCount",
        "channelMessageCount",
        "channelType",
        "cid",
        "receivedAt",
        "",
        "shadow",
        "team",
        "channelCustom",
        "createdBy",
        "<init>",
        "(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;)V",
        "getEventType",
        "()Ljava/lang/String;",
        "component1",
        "()Ljg3/i;",
        "component2",
        "()Ljava/util/Map;",
        "component3",
        "()Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
        "component4",
        "component5",
        "component6",
        "()Ljava/lang/Integer;",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "()Ljava/lang/Boolean;",
        "component12",
        "component13",
        "component14",
        "copy",
        "(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;)Lio/getstream/android/video/generated/models/UserUnbannedEvent;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljg3/i;",
        "getCreatedAt",
        "Ljava/util/Map;",
        "getCustom",
        "Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
        "getUser",
        "Ljava/lang/String;",
        "getType",
        "getChannelId",
        "Ljava/lang/Integer;",
        "getChannelMemberCount",
        "getChannelMessageCount",
        "getChannelType",
        "getCid",
        "getReceivedAt",
        "Ljava/lang/Boolean;",
        "getShadow",
        "getTeam",
        "getChannelCustom",
        "getCreatedBy",
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
.field private final channelCustom:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final channelId:Ljava/lang/String;

.field private final channelMemberCount:Ljava/lang/Integer;

.field private final channelMessageCount:Ljava/lang/Integer;

.field private final channelType:Ljava/lang/String;

.field private final cid:Ljava/lang/String;

.field private final createdAt:Ljg3/i;

.field private final createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

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

.field private final receivedAt:Ljg3/i;

.field private final shadow:Ljava/lang/Boolean;

.field private final team:Ljava/lang/String;

.field private final type:Ljava/lang/String;

.field private final user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;


# direct methods
.method public constructor <init>(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;)V
    .locals 1
    .param p1    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/UserResponseCommonFields;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "channel_id"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "channel_member_count"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "channel_message_count"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "channel_type"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "cid"
        .end annotation
    .end param
    .param p10    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "received_at"
        .end annotation
    .end param
    .param p11    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "shadow"
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "team"
        .end annotation
    .end param
    .param p13    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "channel_custom"
        .end annotation
    .end param
    .param p14    # Lio/getstream/android/video/generated/models/UserResponseCommonFields;
        .annotation runtime Lqx/q;
            name = "created_by"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljg3/i;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
            ")V"
        }
    .end annotation

    const-string v0, "createdAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "custom"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lio/getstream/android/video/generated/models/VideoEvent;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->createdAt:Ljg3/i;

    .line 4
    iput-object p2, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->custom:Ljava/util/Map;

    .line 5
    iput-object p3, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    .line 6
    iput-object p4, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->type:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelId:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelMemberCount:Ljava/lang/Integer;

    .line 9
    iput-object p7, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelMessageCount:Ljava/lang/Integer;

    .line 10
    iput-object p8, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelType:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->cid:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->receivedAt:Ljg3/i;

    .line 13
    iput-object p11, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->shadow:Ljava/lang/Boolean;

    .line 14
    iput-object p12, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->team:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelCustom:Ljava/util/Map;

    .line 16
    iput-object p14, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    return-void
.end method

.method public synthetic constructor <init>(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x2

    .line 1
    sget-object v2, Lm83/z;->w:Lm83/z;

    if-eqz v1, :cond_0

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x10

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move-object v8, v3

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    move-object v9, v3

    goto :goto_2

    :cond_2
    move-object/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move-object v10, v3

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move-object v11, v3

    goto :goto_4

    :cond_4
    move-object/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    move-object v12, v3

    goto :goto_5

    :cond_5
    move-object/from16 v12, p9

    :goto_5
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_6

    move-object v13, v3

    goto :goto_6

    :cond_6
    move-object/from16 v13, p10

    :goto_6
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_7

    move-object v14, v3

    goto :goto_7

    :cond_7
    move-object/from16 v14, p11

    :goto_7
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_8

    move-object v15, v3

    goto :goto_8

    :cond_8
    move-object/from16 v15, p12

    :goto_8
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_9

    move-object/from16 v16, v2

    goto :goto_9

    :cond_9
    move-object/from16 v16, p13

    :goto_9
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_a

    move-object/from16 v17, v3

    move-object/from16 v4, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v3, p0

    goto :goto_a

    :cond_a
    move-object/from16 v17, p14

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    :goto_a
    invoke-direct/range {v3 .. v17}, Lio/getstream/android/video/generated/models/UserUnbannedEvent;-><init>(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/UserUnbannedEvent;Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/UserUnbannedEvent;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->createdAt:Ljg3/i;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->custom:Ljava/util/Map;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget-object v3, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-object v4, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->type:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget-object v5, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelId:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelMemberCount:Ljava/lang/Integer;

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget-object v7, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelMessageCount:Ljava/lang/Integer;

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-object v8, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelType:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-object v9, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->cid:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-object v10, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->receivedAt:Ljg3/i;

    goto :goto_9

    :cond_9
    move-object/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-object v11, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->shadow:Ljava/lang/Boolean;

    goto :goto_a

    :cond_a
    move-object/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget-object v12, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->team:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget-object v13, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelCustom:Ljava/util/Map;

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    move-object/from16 p15, v0

    :goto_d
    move-object p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v11

    move-object/from16 p13, v12

    move-object/from16 p14, v13

    goto :goto_e

    :cond_d
    move-object/from16 p15, p14

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p15}, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->copy(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;)Lio/getstream/android/video/generated/models/UserUnbannedEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final component10()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->receivedAt:Ljg3/i;

    return-object v0
.end method

.method public final component11()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->shadow:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->team:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelCustom:Ljava/util/Map;

    return-object v0
.end method

.method public final component14()Lio/getstream/android/video/generated/models/UserResponseCommonFields;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    return-object v0
.end method

.method public final component2()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public final component3()Lio/getstream/android/video/generated/models/UserResponseCommonFields;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelMemberCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelMessageCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelType:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;)Lio/getstream/android/video/generated/models/UserUnbannedEvent;
    .locals 16
    .param p1    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/UserResponseCommonFields;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "channel_id"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "channel_member_count"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "channel_message_count"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "channel_type"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "cid"
        .end annotation
    .end param
    .param p10    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "received_at"
        .end annotation
    .end param
    .param p11    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "shadow"
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "team"
        .end annotation
    .end param
    .param p13    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "channel_custom"
        .end annotation
    .end param
    .param p14    # Lio/getstream/android/video/generated/models/UserResponseCommonFields;
        .annotation runtime Lqx/q;
            name = "created_by"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljg3/i;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
            ")",
            "Lio/getstream/android/video/generated/models/UserUnbannedEvent;"
        }
    .end annotation

    const-string v0, "createdAt"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "custom"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    invoke-direct/range {v1 .. v15}, Lio/getstream/android/video/generated/models/UserUnbannedEvent;-><init>(Ljg3/i;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->createdAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->createdAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->custom:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->custom:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelMemberCount:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelMemberCount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelMessageCount:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelMessageCount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->receivedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->receivedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->shadow:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->shadow:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->team:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->team:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelCustom:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelCustom:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getChannelCustom()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelCustom:Ljava/util/Map;

    return-object v0
.end method

.method public final getChannelId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelMemberCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelMemberCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getChannelMessageCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelMessageCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getChannelType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelType:Ljava/lang/String;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final getCreatedBy()Lio/getstream/android/video/generated/models/UserResponseCommonFields;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public getEventType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getReceivedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->receivedAt:Ljg3/i;

    return-object v0
.end method

.method public final getShadow()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->shadow:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getTeam()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->team:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUser()Lio/getstream/android/video/generated/models/UserResponseCommonFields;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->createdAt:Ljg3/i;

    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->custom:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/UserResponseCommonFields;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->type:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelId:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelMemberCount:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelMessageCount:Ljava/lang/Integer;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelType:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->cid:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->receivedAt:Ljg3/i;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljg3/i;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->shadow:Ljava/lang/Boolean;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->team:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelCustom:Ljava/util/Map;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    if-nez v1, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/UserResponseCommonFields;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->createdAt:Ljg3/i;

    iget-object v2, v0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->custom:Ljava/util/Map;

    iget-object v3, v0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    iget-object v4, v0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->type:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelId:Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelMemberCount:Ljava/lang/Integer;

    iget-object v7, v0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelMessageCount:Ljava/lang/Integer;

    iget-object v8, v0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelType:Ljava/lang/String;

    iget-object v9, v0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->cid:Ljava/lang/String;

    iget-object v10, v0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->receivedAt:Ljg3/i;

    iget-object v11, v0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->shadow:Ljava/lang/Boolean;

    iget-object v12, v0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->team:Ljava/lang/String;

    iget-object v13, v0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->channelCustom:Ljava/util/Map;

    iget-object v14, v0, Lio/getstream/android/video/generated/models/UserUnbannedEvent;->createdBy:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    new-instance v15, Ljava/lang/StringBuilder;

    const-string v0, "UserUnbannedEvent(createdAt="

    invoke-direct {v15, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", custom="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", user="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", channelId="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", channelMemberCount="

    const-string v1, ", channelMessageCount="

    invoke-static {v6, v5, v0, v1, v15}, Lq63/c;->w(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ", channelType="

    const-string v1, ", cid="

    invoke-static {v7, v0, v8, v1, v15}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", receivedAt="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shadow="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", team="

    const-string v1, ", channelCustom="

    invoke-static {v11, v0, v12, v1, v15}, Lev/n;->w(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", createdBy="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
