.class public final Lio/getstream/android/video/generated/models/UserDeletedEvent;
.super Lio/getstream/android/video/generated/models/VideoEvent;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u0008\n\u0002\u0008\u0016\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u0006\u0012\u0016\u0008\u0003\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000c\u0012\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u0004\u0012\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u0018J\u008e\u0001\u0010&\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0003\u0010\t\u001a\u00020\u00042\u0008\u0008\u0003\u0010\n\u001a\u00020\u00062\u0008\u0008\u0003\u0010\u000b\u001a\u00020\u00062\u0016\u0008\u0003\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000c2\u0008\u0008\u0003\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0003\u0010\u0011\u001a\u00020\u00042\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u0016J\u0010\u0010*\u001a\u00020)H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010-\u001a\u00020\u00062\u0008\u0010,\u001a\u0004\u0018\u00010\rH\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00082\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00103\u001a\u0004\u00084\u0010\u001bR\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00101\u001a\u0004\u00085\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00101\u001a\u0004\u00086\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00103\u001a\u0004\u00087\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00103\u001a\u0004\u00088\u0010\u001bR%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00109\u001a\u0004\u0008:\u0010!R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010;\u001a\u0004\u0008<\u0010#R\u0017\u0010\u0011\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u00101\u001a\u0004\u0008=\u0010\u0016R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010/\u001a\u0004\u0008>\u0010\u0018\u00a8\u0006?"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/UserDeletedEvent;",
        "Lio/getstream/android/video/generated/models/VideoEvent;",
        "Ljg3/i;",
        "createdAt",
        "",
        "deleteConversation",
        "",
        "deleteConversationChannels",
        "deleteMessages",
        "deleteUser",
        "hardDelete",
        "markMessagesDeleted",
        "",
        "",
        "custom",
        "Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
        "user",
        "type",
        "receivedAt",
        "<init>",
        "(Ljg3/i;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;)V",
        "getEventType",
        "()Ljava/lang/String;",
        "component1",
        "()Ljg3/i;",
        "component2",
        "component3",
        "()Z",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Ljava/util/Map;",
        "component9",
        "()Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
        "component10",
        "component11",
        "copy",
        "(Ljg3/i;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;)Lio/getstream/android/video/generated/models/UserDeletedEvent;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljg3/i;",
        "getCreatedAt",
        "Ljava/lang/String;",
        "getDeleteConversation",
        "Z",
        "getDeleteConversationChannels",
        "getDeleteMessages",
        "getDeleteUser",
        "getHardDelete",
        "getMarkMessagesDeleted",
        "Ljava/util/Map;",
        "getCustom",
        "Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
        "getUser",
        "getType",
        "getReceivedAt",
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
.field private final createdAt:Ljg3/i;

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

.field private final deleteConversation:Ljava/lang/String;

.field private final deleteConversationChannels:Z

.field private final deleteMessages:Ljava/lang/String;

.field private final deleteUser:Ljava/lang/String;

.field private final hardDelete:Z

.field private final markMessagesDeleted:Z

.field private final receivedAt:Ljg3/i;

.field private final type:Ljava/lang/String;

.field private final user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;


# direct methods
.method public constructor <init>(Ljg3/i;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;)V
    .locals 1
    .param p1    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "delete_conversation"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime Lqx/q;
            name = "delete_conversation_channels"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "delete_messages"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "delete_user"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime Lqx/q;
            name = "hard_delete"
        .end annotation
    .end param
    .param p7    # Z
        .annotation runtime Lqx/q;
            name = "mark_messages_deleted"
        .end annotation
    .end param
    .param p8    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .param p9    # Lio/getstream/android/video/generated/models/UserResponseCommonFields;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p11    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "received_at"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ")V"
        }
    .end annotation

    const-string v0, "createdAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deleteConversation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deleteMessages"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deleteUser"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "custom"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lio/getstream/android/video/generated/models/VideoEvent;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->createdAt:Ljg3/i;

    .line 5
    iput-object p2, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteConversation:Ljava/lang/String;

    .line 6
    iput-boolean p3, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteConversationChannels:Z

    .line 7
    iput-object p4, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteMessages:Ljava/lang/String;

    .line 8
    iput-object p5, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteUser:Ljava/lang/String;

    .line 9
    iput-boolean p6, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->hardDelete:Z

    .line 10
    iput-boolean p7, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->markMessagesDeleted:Z

    .line 11
    iput-object p8, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->custom:Ljava/util/Map;

    .line 12
    iput-object p9, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    .line 13
    iput-object p10, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->type:Ljava/lang/String;

    .line 14
    iput-object p11, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->receivedAt:Ljg3/i;

    return-void
.end method

.method public synthetic constructor <init>(Ljg3/i;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p12

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_0

    .line 1
    sget-object v1, Lm83/z;->w:Lm83/z;

    move-object v10, v1

    goto :goto_0

    :cond_0
    move-object/from16 v10, p8

    :goto_0
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move-object v13, v0

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    goto :goto_2

    :cond_1
    move-object/from16 v13, p11

    goto :goto_1

    .line 2
    :goto_2
    invoke-direct/range {v2 .. v13}, Lio/getstream/android/video/generated/models/UserDeletedEvent;-><init>(Ljg3/i;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/UserDeletedEvent;Ljg3/i;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/UserDeletedEvent;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->createdAt:Ljg3/i;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteConversation:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-boolean p3, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteConversationChannels:Z

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteMessages:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteUser:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-boolean p6, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->hardDelete:Z

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-boolean p7, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->markMessagesDeleted:Z

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->custom:Ljava/util/Map;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->type:Ljava/lang/String;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->receivedAt:Ljg3/i;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lio/getstream/android/video/generated/models/UserDeletedEvent;->copy(Ljg3/i;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;)Lio/getstream/android/video/generated/models/UserDeletedEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->createdAt:Ljg3/i;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->receivedAt:Ljg3/i;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteConversation:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteConversationChannels:Z

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteMessages:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteUser:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->hardDelete:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->markMessagesDeleted:Z

    return v0
.end method

.method public final component8()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public final component9()Lio/getstream/android/video/generated/models/UserResponseCommonFields;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    return-object v0
.end method

.method public final copy(Ljg3/i;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;)Lio/getstream/android/video/generated/models/UserDeletedEvent;
    .locals 13
    .param p1    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "created_at"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "delete_conversation"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime Lqx/q;
            name = "delete_conversation_channels"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "delete_messages"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "delete_user"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime Lqx/q;
            name = "hard_delete"
        .end annotation
    .end param
    .param p7    # Z
        .annotation runtime Lqx/q;
            name = "mark_messages_deleted"
        .end annotation
    .end param
    .param p8    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "custom"
        .end annotation
    .end param
    .param p9    # Lio/getstream/android/video/generated/models/UserResponseCommonFields;
        .annotation runtime Lqx/q;
            name = "user"
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p11    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "received_at"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljg3/i;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/android/video/generated/models/UserResponseCommonFields;",
            "Ljava/lang/String;",
            "Ljg3/i;",
            ")",
            "Lio/getstream/android/video/generated/models/UserDeletedEvent;"
        }
    .end annotation

    const-string v0, "createdAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deleteConversation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deleteMessages"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deleteUser"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "custom"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/UserDeletedEvent;

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lio/getstream/android/video/generated/models/UserDeletedEvent;-><init>(Ljg3/i;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/UserDeletedEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/UserDeletedEvent;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->createdAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserDeletedEvent;->createdAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteConversation:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteConversation:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteConversationChannels:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteConversationChannels:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteMessages:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteMessages:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteUser:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteUser:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->hardDelete:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/UserDeletedEvent;->hardDelete:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->markMessagesDeleted:Z

    iget-boolean v3, p1, Lio/getstream/android/video/generated/models/UserDeletedEvent;->markMessagesDeleted:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->custom:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserDeletedEvent;->custom:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserDeletedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/UserDeletedEvent;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->receivedAt:Ljg3/i;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/UserDeletedEvent;->receivedAt:Ljg3/i;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getCreatedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->createdAt:Ljg3/i;

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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->custom:Ljava/util/Map;

    return-object v0
.end method

.method public final getDeleteConversation()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteConversation:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeleteConversationChannels()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteConversationChannels:Z

    return v0
.end method

.method public final getDeleteMessages()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteMessages:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeleteUser()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteUser:Ljava/lang/String;

    return-object v0
.end method

.method public getEventType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getHardDelete()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->hardDelete:Z

    return v0
.end method

.method public final getMarkMessagesDeleted()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->markMessagesDeleted:Z

    return v0
.end method

.method public final getReceivedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->receivedAt:Ljg3/i;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUser()Lio/getstream/android/video/generated/models/UserResponseCommonFields;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->createdAt:Ljg3/i;

    invoke-virtual {v0}, Ljg3/i;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteConversation:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteConversationChannels:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteMessages:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteUser:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->hardDelete:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->markMessagesDeleted:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->custom:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/UserResponseCommonFields;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->type:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->receivedAt:Ljg3/i;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljg3/i;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->createdAt:Ljg3/i;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteConversation:Ljava/lang/String;

    iget-boolean v2, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteConversationChannels:Z

    iget-object v3, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteMessages:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->deleteUser:Ljava/lang/String;

    iget-boolean v5, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->hardDelete:Z

    iget-boolean v6, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->markMessagesDeleted:Z

    iget-object v7, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->custom:Ljava/util/Map;

    iget-object v8, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->user:Lio/getstream/android/video/generated/models/UserResponseCommonFields;

    iget-object v9, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->type:Ljava/lang/String;

    iget-object v10, p0, Lio/getstream/android/video/generated/models/UserDeletedEvent;->receivedAt:Ljg3/i;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "UserDeletedEvent(createdAt="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", deleteConversation="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", deleteConversationChannels="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", deleteMessages="

    const-string v1, ", deleteUser="

    invoke-static {v11, v2, v0, v3, v1}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", hardDelete="

    const-string v1, ", markMessagesDeleted="

    invoke-static {v11, v4, v0, v5, v1}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", custom="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", user="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", receivedAt="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
