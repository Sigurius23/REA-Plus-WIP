.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008%\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\n\u0012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0007H\u00c6\u0003J\t\u00100\u001a\u00020\u0007H\u00c6\u0003J\u000f\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\t\u00102\u001a\u00020\rH\u00c6\u0003J\t\u00103\u001a\u00020\rH\u00c6\u0003J\t\u00104\u001a\u00020\rH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u00130\nH\u00c6\u0003J\u000f\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u00030\nH\u00c6\u0003J\u0015\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016H\u00c6\u0003J\u00b5\u0001\u0010:\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\n2\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n2\u0014\u0008\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016H\u00c6\u0001J\u0013\u0010;\u001a\u00020<2\u0008\u0010=\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010>\u001a\u00020\u0007H\u00d6\u0001J\t\u0010?\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001eR\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0011\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010#R\u0011\u0010\u000f\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010#R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u001aR\u0017\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010!R\u0017\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010!R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+\u00a8\u0006@"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;",
        "",
        "parentMessageId",
        "",
        "cid",
        "createdByUserId",
        "activeParticipantCount",
        "",
        "participantCount",
        "threadParticipants",
        "",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;",
        "lastMessageAt",
        "Ljava/util/Date;",
        "createdAt",
        "updatedAt",
        "deletedAt",
        "title",
        "read",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;",
        "latestReplyIds",
        "extraData",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V",
        "getParentMessageId",
        "()Ljava/lang/String;",
        "getCid",
        "getCreatedByUserId",
        "getActiveParticipantCount",
        "()I",
        "getParticipantCount",
        "getThreadParticipants",
        "()Ljava/util/List;",
        "getLastMessageAt",
        "()Ljava/util/Date;",
        "getCreatedAt",
        "getUpdatedAt",
        "getDeletedAt",
        "getTitle",
        "getRead",
        "getLatestReplyIds",
        "getExtraData",
        "()Ljava/util/Map;",
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
        "copy",
        "equals",
        "",
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
.field private final activeParticipantCount:I

.field private final cid:Ljava/lang/String;

.field private final createdAt:Ljava/util/Date;

.field private final createdByUserId:Ljava/lang/String;

.field private final deletedAt:Ljava/util/Date;

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

.field private final lastMessageAt:Ljava/util/Date;

.field private final latestReplyIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final parentMessageId:Ljava/lang/String;

.field private final participantCount:I

.field private final read:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final threadParticipants:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;

.field private final updatedAt:Ljava/util/Date;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;",
            ">;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "parentMessageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdByUserId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadParticipants"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastMessageAt"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "read"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestReplyIds"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->parentMessageId:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->cid:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->createdByUserId:Ljava/lang/String;

    iput p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->activeParticipantCount:I

    iput p5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->participantCount:I

    iput-object p6, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->threadParticipants:Ljava/util/List;

    iput-object p7, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->lastMessageAt:Ljava/util/Date;

    iput-object p8, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->createdAt:Ljava/util/Date;

    iput-object p9, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->updatedAt:Ljava/util/Date;

    iput-object p10, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->deletedAt:Ljava/util/Date;

    iput-object p11, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->title:Ljava/lang/String;

    iput-object p12, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->read:Ljava/util/List;

    iput-object p13, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->latestReplyIds:Ljava/util/List;

    iput-object p14, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->extraData:Ljava/util/Map;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->parentMessageId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->cid:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->createdByUserId:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget v4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->activeParticipantCount:I

    goto :goto_3

    :cond_3
    move/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget v5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->participantCount:I

    goto :goto_4

    :cond_4
    move/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->threadParticipants:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget-object v7, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->lastMessageAt:Ljava/util/Date;

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-object v8, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->createdAt:Ljava/util/Date;

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-object v9, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->updatedAt:Ljava/util/Date;

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-object v10, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->deletedAt:Ljava/util/Date;

    goto :goto_9

    :cond_9
    move-object/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-object v11, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->title:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget-object v12, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->read:Ljava/util/List;

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget-object v13, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->latestReplyIds:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->extraData:Ljava/util/Map;

    move-object/from16 p15, v0

    :goto_d
    move-object p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move/from16 p5, v4

    move/from16 p6, v5

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
    invoke-virtual/range {p1 .. p15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->parentMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->deletedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->read:Ljava/util/List;

    return-object v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->latestReplyIds:Ljava/util/List;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->createdByUserId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->activeParticipantCount:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->participantCount:I

    return v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->threadParticipants:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->lastMessageAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component8()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component9()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;",
            ">;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;"
        }
    .end annotation

    const-string v0, "parentMessageId"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdByUserId"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadParticipants"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastMessageAt"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "read"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestReplyIds"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->parentMessageId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->parentMessageId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->createdByUserId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->createdByUserId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->activeParticipantCount:I

    iget v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->activeParticipantCount:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->participantCount:I

    iget v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->participantCount:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->threadParticipants:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->threadParticipants:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->lastMessageAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->lastMessageAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->updatedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->updatedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->deletedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->deletedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->title:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->read:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->read:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->latestReplyIds:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->latestReplyIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->extraData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->extraData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getActiveParticipantCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->activeParticipantCount:I

    return v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getCreatedByUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->createdByUserId:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeletedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->deletedAt:Ljava/util/Date;

    return-object v0
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getLastMessageAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->lastMessageAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getLatestReplyIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->latestReplyIds:Ljava/util/List;

    return-object v0
.end method

.method public final getParentMessageId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->parentMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getParticipantCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->participantCount:I

    return v0
.end method

.method public final getRead()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->read:Ljava/util/List;

    return-object v0
.end method

.method public final getThreadParticipants()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->threadParticipants:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->parentMessageId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->createdByUserId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->activeParticipantCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->participantCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->threadParticipants:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->lastMessageAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->createdAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->updatedAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->deletedAt:Ljava/util/Date;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->read:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->latestReplyIds:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->extraData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->parentMessageId:Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->cid:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->createdByUserId:Ljava/lang/String;

    iget v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->activeParticipantCount:I

    iget v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->participantCount:I

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->threadParticipants:Ljava/util/List;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->lastMessageAt:Ljava/util/Date;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->createdAt:Ljava/util/Date;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->updatedAt:Ljava/util/Date;

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->deletedAt:Ljava/util/Date;

    iget-object v11, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->title:Ljava/lang/String;

    iget-object v12, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->read:Ljava/util/List;

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->latestReplyIds:Ljava/util/List;

    iget-object v14, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->extraData:Ljava/util/Map;

    const-string v15, ", cid="

    const-string v0, ", createdByUserId="

    move-object/from16 v16, v14

    const-string v14, "ThreadEntity(parentMessageId="

    invoke-static {v14, v1, v15, v2, v0}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", activeParticipantCount="

    const-string v2, ", participantCount="

    invoke-static {v4, v3, v1, v2, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", threadParticipants="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastMessageAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    const-string v2, ", updatedAt="

    invoke-static {v0, v7, v1, v8, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v1, ", deletedAt="

    const-string v2, ", title="

    invoke-static {v0, v9, v1, v10, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v1, ", read="

    const-string v2, ", latestReplyIds="

    invoke-static {v11, v1, v2, v0, v12}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
