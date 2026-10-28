.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008,\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0007H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u00106\u001a\u00020\u000eH\u00c6\u0003J\t\u00107\u001a\u00020\u000eH\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012H\u00c6\u0003J\t\u0010:\u001a\u00020\u0014H\u00c6\u0003J\u00a1\u0001\u0010;\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0014\u0008\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014H\u00c6\u0001J\u0013\u0010<\u001a\u00020\u000e2\u0008\u0010=\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010>\u001a\u00020\u0007H\u00d6\u0001J\t\u0010?\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001eR\u0013\u0010\u000c\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u0018R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u001e\u0010*\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008+\u0010\u001c\"\u0004\u0008,\u0010-\u00a8\u0006@"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
        "",
        "messageId",
        "",
        "userId",
        "type",
        "score",
        "",
        "createdAt",
        "Ljava/util/Date;",
        "createdLocallyAt",
        "updatedAt",
        "deletedAt",
        "enforceUnique",
        "",
        "skipPush",
        "emojiCode",
        "extraData",
        "",
        "syncStatus",
        "Lio/getstream/chat/android/models/SyncStatus;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;)V",
        "getMessageId",
        "()Ljava/lang/String;",
        "getUserId",
        "getType",
        "getScore",
        "()I",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "getCreatedLocallyAt",
        "getUpdatedAt",
        "getDeletedAt",
        "getEnforceUnique",
        "()Z",
        "getSkipPush",
        "getEmojiCode",
        "getExtraData",
        "()Ljava/util/Map;",
        "getSyncStatus",
        "()Lio/getstream/chat/android/models/SyncStatus;",
        "id",
        "getId",
        "setId",
        "(I)V",
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
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "stream-chat-android-client_release"
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
.field private final createdAt:Ljava/util/Date;

.field private final createdLocallyAt:Ljava/util/Date;

.field private final deletedAt:Ljava/util/Date;

.field private final emojiCode:Ljava/lang/String;

.field private final enforceUnique:Z

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

.field private id:I

.field private final messageId:Ljava/lang/String;

.field private final score:I

.field private final skipPush:Z

.field private final syncStatus:Lio/getstream/chat/android/models/SyncStatus;

.field private final type:Ljava/lang/String;

.field private final updatedAt:Ljava/util/Date;

.field private final userId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "ZZ",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/chat/android/models/SyncStatus;",
            ")V"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncStatus"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->messageId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->userId:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->type:Ljava/lang/String;

    .line 5
    iput p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->score:I

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->createdAt:Ljava/util/Date;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->createdLocallyAt:Ljava/util/Date;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->updatedAt:Ljava/util/Date;

    .line 9
    iput-object p8, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->deletedAt:Ljava/util/Date;

    .line 10
    iput-boolean p9, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->enforceUnique:Z

    .line 11
    iput-boolean p10, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->skipPush:Z

    .line 12
    iput-object p11, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->emojiCode:Ljava/lang/String;

    .line 13
    iput-object p12, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->extraData:Ljava/util/Map;

    .line 14
    iput-object p13, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    add-int/2addr p2, p1

    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result p1

    add-int/2addr p1, p2

    iput p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->id:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    move v6, v1

    goto :goto_0

    :cond_0
    move/from16 v6, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object/from16 v7, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object/from16 v8, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move-object v9, v2

    goto :goto_3

    :cond_3
    move-object/from16 v9, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move-object v10, v2

    goto :goto_4

    :cond_4
    move-object/from16 v10, p8

    :goto_4
    and-int/lit16 v1, v0, 0x100

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    move v11, v3

    goto :goto_5

    :cond_5
    move/from16 v11, p9

    :goto_5
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_6

    move v12, v3

    goto :goto_6

    :cond_6
    move/from16 v12, p10

    :goto_6
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_7

    move-object v13, v2

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v2, p0

    goto :goto_7

    :cond_7
    move-object/from16 v13, p11

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    .line 16
    :goto_7
    invoke-direct/range {v2 .. v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;ILjava/lang/Object;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->messageId:Ljava/lang/String;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->userId:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->type:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->score:I

    goto :goto_2

    :cond_3
    move/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->createdAt:Ljava/util/Date;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->createdLocallyAt:Ljava/util/Date;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-object v6, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->updatedAt:Ljava/util/Date;

    goto :goto_5

    :cond_6
    move-object/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->deletedAt:Ljava/util/Date;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-boolean v8, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->enforceUnique:Z

    goto :goto_7

    :cond_8
    move/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-boolean v9, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->skipPush:Z

    goto :goto_8

    :cond_9
    move/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-object v10, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->emojiCode:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->extraData:Ljava/util/Map;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    move-object/from16 p15, v0

    :goto_b
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move/from16 p11, v8

    move/from16 p12, v9

    move-object/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_c

    :cond_c
    move-object/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->skipPush:Z

    return v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->emojiCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component13()Lio/getstream/chat/android/models/SyncStatus;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->score:I

    return v0
.end method

.method public final component5()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component6()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->createdLocallyAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component7()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component8()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->deletedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->enforceUnique:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "ZZ",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/chat/android/models/SyncStatus;",
            ")",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;"
        }
    .end annotation

    const-string v0, "messageId"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncStatus"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->messageId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->messageId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->userId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->userId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->score:I

    iget v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->score:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->createdLocallyAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->createdLocallyAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->updatedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->updatedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->deletedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->deletedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->enforceUnique:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->enforceUnique:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->skipPush:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->skipPush:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->emojiCode:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->emojiCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->extraData:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->extraData:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    iget-object p1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    if-eq v1, p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getCreatedLocallyAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->createdLocallyAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getDeletedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->deletedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getEmojiCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->emojiCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnforceUnique()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->enforceUnique:Z

    return v0
.end method

.method public final getExtraData()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->id:I

    return v0
.end method

.method public final getMessageId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getScore()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->score:I

    return v0
.end method

.method public final getSkipPush()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->skipPush:Z

    return v0
.end method

.method public final getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->messageId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->userId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->type:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->score:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->createdAt:Ljava/util/Date;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->createdLocallyAt:Ljava/util/Date;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->updatedAt:Ljava/util/Date;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->deletedAt:Ljava/util/Date;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->enforceUnique:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->skipPush:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->emojiCode:Ljava/lang/String;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->extraData:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setId(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->id:I

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->messageId:Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->userId:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->type:Ljava/lang/String;

    iget v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->score:I

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->createdAt:Ljava/util/Date;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->createdLocallyAt:Ljava/util/Date;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->updatedAt:Ljava/util/Date;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->deletedAt:Ljava/util/Date;

    iget-boolean v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->enforceUnique:Z

    iget-boolean v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->skipPush:Z

    iget-object v11, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->emojiCode:Ljava/lang/String;

    iget-object v12, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->extraData:Ljava/util/Map;

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    const-string v14, ", userId="

    const-string v15, ", type="

    const-string v0, "ReactionEntity(messageId="

    invoke-static {v0, v1, v14, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", score="

    const-string v2, ", createdAt="

    invoke-static {v4, v3, v1, v2, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", createdLocallyAt="

    const-string v2, ", updatedAt="

    invoke-static {v0, v5, v1, v6, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v1, ", deletedAt="

    const-string v2, ", enforceUnique="

    invoke-static {v0, v7, v1, v8, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v1, ", skipPush="

    const-string v2, ", emojiCode="

    invoke-static {v0, v9, v1, v10, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", extraData="

    const-string v2, ", syncStatus="

    invoke-static {v0, v11, v1, v12, v2}, Lvl/b;->w(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
