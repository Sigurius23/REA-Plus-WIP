.class public final Lio/getstream/chat/android/models/ThreadInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/models/CustomObject;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008,\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00a9\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0014\u0008\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0007H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000f\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u00c6\u0003J\u0015\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u001aH\u00c6\u0003J\u00c5\u0001\u0010F\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00072\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0014\u0008\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u001aH\u00c6\u0001J\u0013\u0010G\u001a\u00020H2\u0008\u0010I\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010J\u001a\u00020\u0003H\u00d6\u0001J\t\u0010K\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010#R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010!R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010!R\u0011\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101R\u0017\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00103R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00105\u00a8\u0006L"
    }
    d2 = {
        "Lio/getstream/chat/android/models/ThreadInfo;",
        "Lio/getstream/chat/android/models/CustomObject;",
        "activeParticipantCount",
        "",
        "cid",
        "",
        "createdAt",
        "Ljava/util/Date;",
        "createdBy",
        "Lio/getstream/chat/android/models/User;",
        "createdByUserId",
        "deletedAt",
        "lastMessageAt",
        "parentMessage",
        "Lio/getstream/chat/android/models/Message;",
        "parentMessageId",
        "participantCount",
        "replyCount",
        "title",
        "updatedAt",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "threadParticipants",
        "",
        "Lio/getstream/chat/android/models/ThreadParticipant;",
        "extraData",
        "",
        "",
        "<init>",
        "(ILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/Message;Ljava/lang/String;IILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/Map;)V",
        "getActiveParticipantCount",
        "()I",
        "getCid",
        "()Ljava/lang/String;",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "getCreatedBy",
        "()Lio/getstream/chat/android/models/User;",
        "getCreatedByUserId",
        "getDeletedAt",
        "getLastMessageAt",
        "getParentMessage",
        "()Lio/getstream/chat/android/models/Message;",
        "getParentMessageId",
        "getParticipantCount",
        "getReplyCount",
        "getTitle",
        "getUpdatedAt",
        "getChannel",
        "()Lio/getstream/chat/android/models/Channel;",
        "getThreadParticipants",
        "()Ljava/util/List;",
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
        "component15",
        "component16",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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
.field private final activeParticipantCount:I

.field private final channel:Lio/getstream/chat/android/models/Channel;

.field private final cid:Ljava/lang/String;

.field private final createdAt:Ljava/util/Date;

.field private final createdBy:Lio/getstream/chat/android/models/User;

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

.field private final parentMessage:Lio/getstream/chat/android/models/Message;

.field private final parentMessageId:Ljava/lang/String;

.field private final participantCount:I

.field private final replyCount:I

.field private final threadParticipants:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ThreadParticipant;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;

.field private final updatedAt:Ljava/util/Date;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/Message;Ljava/lang/String;IILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/models/Channel;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ThreadParticipant;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p12

    move-object/from16 v1, p13

    move-object/from16 v2, p15

    move-object/from16 v3, p16

    const-string v4, "cid"

    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "createdAt"

    invoke-static {p3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "createdByUserId"

    invoke-static {p5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "parentMessageId"

    invoke-static {p9, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "title"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "updatedAt"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "threadParticipants"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "extraData"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lio/getstream/chat/android/models/ThreadInfo;->activeParticipantCount:I

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/models/ThreadInfo;->cid:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/models/ThreadInfo;->createdAt:Ljava/util/Date;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/models/ThreadInfo;->createdBy:Lio/getstream/chat/android/models/User;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/models/ThreadInfo;->createdByUserId:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/models/ThreadInfo;->deletedAt:Ljava/util/Date;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/models/ThreadInfo;->lastMessageAt:Ljava/util/Date;

    .line 9
    iput-object p8, p0, Lio/getstream/chat/android/models/ThreadInfo;->parentMessage:Lio/getstream/chat/android/models/Message;

    .line 10
    iput-object p9, p0, Lio/getstream/chat/android/models/ThreadInfo;->parentMessageId:Ljava/lang/String;

    move p1, p10

    .line 11
    iput p1, p0, Lio/getstream/chat/android/models/ThreadInfo;->participantCount:I

    move/from16 p1, p11

    .line 12
    iput p1, p0, Lio/getstream/chat/android/models/ThreadInfo;->replyCount:I

    .line 13
    iput-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->title:Ljava/lang/String;

    .line 14
    iput-object v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->updatedAt:Ljava/util/Date;

    move-object/from16 p1, p14

    .line 15
    iput-object p1, p0, Lio/getstream/chat/android/models/ThreadInfo;->channel:Lio/getstream/chat/android/models/Channel;

    .line 16
    iput-object v2, p0, Lio/getstream/chat/android/models/ThreadInfo;->threadParticipants:Ljava/util/List;

    .line 17
    iput-object v3, p0, Lio/getstream/chat/android/models/ThreadInfo;->extraData:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/Message;Ljava/lang/String;IILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p17

    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object/from16 v16, v1

    goto :goto_0

    :cond_0
    move-object/from16 v16, p14

    :goto_0
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_1

    .line 18
    sget-object v1, Lm83/y;->w:Lm83/y;

    move-object/from16 v17, v1

    goto :goto_1

    :cond_1
    move-object/from16 v17, p15

    :goto_1
    const v1, 0x8000

    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    .line 19
    sget-object v0, Lm83/z;->w:Lm83/z;

    move-object/from16 v18, v0

    :goto_2
    move-object/from16 v2, p0

    move/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move/from16 v12, p10

    move/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    goto :goto_3

    :cond_2
    move-object/from16 v18, p16

    goto :goto_2

    .line 20
    :goto_3
    invoke-direct/range {v2 .. v18}, Lio/getstream/chat/android/models/ThreadInfo;-><init>(ILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/Message;Ljava/lang/String;IILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/models/ThreadInfo;ILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/Message;Ljava/lang/String;IILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/ThreadInfo;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lio/getstream/chat/android/models/ThreadInfo;->activeParticipantCount:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/models/ThreadInfo;->cid:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/models/ThreadInfo;->createdAt:Ljava/util/Date;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/chat/android/models/ThreadInfo;->createdBy:Lio/getstream/chat/android/models/User;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/chat/android/models/ThreadInfo;->createdByUserId:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/chat/android/models/ThreadInfo;->deletedAt:Ljava/util/Date;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/chat/android/models/ThreadInfo;->lastMessageAt:Ljava/util/Date;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lio/getstream/chat/android/models/ThreadInfo;->parentMessage:Lio/getstream/chat/android/models/Message;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/getstream/chat/android/models/ThreadInfo;->parentMessageId:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lio/getstream/chat/android/models/ThreadInfo;->participantCount:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lio/getstream/chat/android/models/ThreadInfo;->replyCount:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/chat/android/models/ThreadInfo;->title:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/chat/android/models/ThreadInfo;->updatedAt:Ljava/util/Date;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/chat/android/models/ThreadInfo;->channel:Lio/getstream/chat/android/models/Channel;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lio/getstream/chat/android/models/ThreadInfo;->threadParticipants:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lio/getstream/chat/android/models/ThreadInfo;->extraData:Ljava/util/Map;

    move-object/from16 p17, v1

    :goto_f
    move/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_10

    :cond_f
    move-object/from16 p17, p16

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p17}, Lio/getstream/chat/android/models/ThreadInfo;->copy(ILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/Message;Ljava/lang/String;IILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/Map;)Lio/getstream/chat/android/models/ThreadInfo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->activeParticipantCount:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->participantCount:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->replyCount:I

    return v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component14()Lio/getstream/chat/android/models/Channel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->channel:Lio/getstream/chat/android/models/Channel;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ThreadParticipant;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->threadParticipants:Ljava/util/List;

    return-object v0
.end method

.method public final component16()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component4()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->createdBy:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->createdByUserId:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->deletedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component7()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->lastMessageAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component8()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->parentMessage:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->parentMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/Message;Ljava/lang/String;IILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/Map;)Lio/getstream/chat/android/models/ThreadInfo;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/models/Channel;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ThreadParticipant;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/models/ThreadInfo;"
        }
    .end annotation

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdByUserId"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parentMessageId"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadParticipants"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v2, p16

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/models/ThreadInfo;

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, v2

    move/from16 v2, p1

    invoke-direct/range {v1 .. v17}, Lio/getstream/chat/android/models/ThreadInfo;-><init>(ILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/Message;Ljava/lang/String;IILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/models/ThreadInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/models/ThreadInfo;

    iget v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->activeParticipantCount:I

    iget v3, p1, Lio/getstream/chat/android/models/ThreadInfo;->activeParticipantCount:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/ThreadInfo;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/ThreadInfo;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->createdBy:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/models/ThreadInfo;->createdBy:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->createdByUserId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/ThreadInfo;->createdByUserId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->deletedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/ThreadInfo;->deletedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->lastMessageAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/ThreadInfo;->lastMessageAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->parentMessage:Lio/getstream/chat/android/models/Message;

    iget-object v3, p1, Lio/getstream/chat/android/models/ThreadInfo;->parentMessage:Lio/getstream/chat/android/models/Message;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->parentMessageId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/ThreadInfo;->parentMessageId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->participantCount:I

    iget v3, p1, Lio/getstream/chat/android/models/ThreadInfo;->participantCount:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->replyCount:I

    iget v3, p1, Lio/getstream/chat/android/models/ThreadInfo;->replyCount:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->title:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/ThreadInfo;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->updatedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/ThreadInfo;->updatedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->channel:Lio/getstream/chat/android/models/Channel;

    iget-object v3, p1, Lio/getstream/chat/android/models/ThreadInfo;->channel:Lio/getstream/chat/android/models/Channel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->threadParticipants:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/ThreadInfo;->threadParticipants:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->extraData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/models/ThreadInfo;->extraData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getActiveParticipantCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->activeParticipantCount:I

    return v0
.end method

.method public final getChannel()Lio/getstream/chat/android/models/Channel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->channel:Lio/getstream/chat/android/models/Channel;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getCreatedBy()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->createdBy:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final getCreatedByUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->createdByUserId:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeletedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->deletedAt:Ljava/util/Date;

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

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->extraData:Ljava/util/Map;

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

.method public final getLastMessageAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->lastMessageAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getParentMessage()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->parentMessage:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final getParentMessageId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->parentMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getParticipantCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->participantCount:I

    return v0
.end method

.method public final getReplyCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->replyCount:I

    return v0
.end method

.method public final getThreadParticipants()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ThreadParticipant;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->threadParticipants:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lio/getstream/chat/android/models/ThreadInfo;->activeParticipantCount:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/ThreadInfo;->cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/ThreadInfo;->createdAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/ThreadInfo;->createdBy:Lio/getstream/chat/android/models/User;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/ThreadInfo;->createdByUserId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/ThreadInfo;->deletedAt:Ljava/util/Date;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/ThreadInfo;->lastMessageAt:Ljava/util/Date;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/ThreadInfo;->parentMessage:Lio/getstream/chat/android/models/Message;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/ThreadInfo;->parentMessageId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/models/ThreadInfo;->participantCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/models/ThreadInfo;->replyCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/ThreadInfo;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/ThreadInfo;->updatedAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/ThreadInfo;->channel:Lio/getstream/chat/android/models/Channel;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/ThreadInfo;->threadParticipants:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/models/ThreadInfo;->extraData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget v1, v0, Lio/getstream/chat/android/models/ThreadInfo;->activeParticipantCount:I

    iget-object v2, v0, Lio/getstream/chat/android/models/ThreadInfo;->cid:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/models/ThreadInfo;->createdAt:Ljava/util/Date;

    iget-object v4, v0, Lio/getstream/chat/android/models/ThreadInfo;->createdBy:Lio/getstream/chat/android/models/User;

    iget-object v5, v0, Lio/getstream/chat/android/models/ThreadInfo;->createdByUserId:Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/chat/android/models/ThreadInfo;->deletedAt:Ljava/util/Date;

    iget-object v7, v0, Lio/getstream/chat/android/models/ThreadInfo;->lastMessageAt:Ljava/util/Date;

    iget-object v8, v0, Lio/getstream/chat/android/models/ThreadInfo;->parentMessage:Lio/getstream/chat/android/models/Message;

    iget-object v9, v0, Lio/getstream/chat/android/models/ThreadInfo;->parentMessageId:Ljava/lang/String;

    iget v10, v0, Lio/getstream/chat/android/models/ThreadInfo;->participantCount:I

    iget v11, v0, Lio/getstream/chat/android/models/ThreadInfo;->replyCount:I

    iget-object v12, v0, Lio/getstream/chat/android/models/ThreadInfo;->title:Ljava/lang/String;

    iget-object v13, v0, Lio/getstream/chat/android/models/ThreadInfo;->updatedAt:Ljava/util/Date;

    iget-object v14, v0, Lio/getstream/chat/android/models/ThreadInfo;->channel:Lio/getstream/chat/android/models/Channel;

    iget-object v15, v0, Lio/getstream/chat/android/models/ThreadInfo;->threadParticipants:Ljava/util/List;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/ThreadInfo;->extraData:Ljava/util/Map;

    const-string v0, ", cid="

    move-object/from16 v17, v15

    const-string v15, ", createdAt="

    move-object/from16 v18, v14

    const-string v14, "ThreadInfo(activeParticipantCount="

    invoke-static {v1, v14, v0, v2, v15}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdBy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdByUserId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", deletedAt="

    const-string v2, ", lastMessageAt="

    invoke-static {v0, v5, v1, v6, v2}, Lev/n;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", parentMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", parentMessageId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", participantCount="

    const-string v2, ", replyCount="

    invoke-static {v10, v9, v1, v2, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", title="

    const-string v2, ", updatedAt="

    invoke-static {v11, v1, v12, v2, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", threadParticipants="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
