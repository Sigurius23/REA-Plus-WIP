.class public final Lio/getstream/chat/android/models/Thread;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/models/CustomObject;
.implements Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008 \n\u0002\u0010\u000f\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u00bf\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0011\u0012\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0011\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0014\u0008\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010@\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010A2\u0006\u0010B\u001a\u00020\u0006H\u0016J\t\u0010C\u001a\u00020\u0004H\u00c6\u0003J\t\u0010D\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010F\u001a\u00020\u0006H\u00c6\u0003J\t\u0010G\u001a\u00020\u000bH\u00c6\u0003J\t\u0010H\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u0010J\u001a\u00020\u0004H\u00c6\u0003J\u000f\u0010K\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0003J\t\u0010L\u001a\u00020\u0014H\u00c6\u0003J\t\u0010M\u001a\u00020\u0014H\u00c6\u0003J\t\u0010N\u001a\u00020\u0014H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\t\u0010P\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0011H\u00c6\u0003J\u000f\u0010R\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0011H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\u0015\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fH\u00c6\u0003J\u00e3\u0001\u0010U\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00062\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00142\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00062\u000e\u0008\u0002\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00112\u000e\u0008\u0002\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00112\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0014\u0008\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fH\u00c6\u0001J\u0013\u0010V\u001a\u00020W2\u0008\u0010X\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010Y\u001a\u00020\u0004H\u00d6\u0001J\t\u0010Z\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010&R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0011\u0010\u000c\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0011\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010$R\u0017\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00103R\u0011\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00103R\u0011\u0010\u0016\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u00103R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00103R\u0011\u0010\u0018\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010&R\u0017\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u00101R\u0017\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u00101R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010;R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010=R\u0011\u0010>\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010$\u00a8\u0006["
    }
    d2 = {
        "Lio/getstream/chat/android/models/Thread;",
        "Lio/getstream/chat/android/models/CustomObject;",
        "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
        "activeParticipantCount",
        "",
        "cid",
        "",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "parentMessageId",
        "parentMessage",
        "Lio/getstream/chat/android/models/Message;",
        "createdByUserId",
        "createdBy",
        "Lio/getstream/chat/android/models/User;",
        "participantCount",
        "threadParticipants",
        "",
        "Lio/getstream/chat/android/models/ThreadParticipant;",
        "lastMessageAt",
        "Ljava/util/Date;",
        "createdAt",
        "updatedAt",
        "deletedAt",
        "title",
        "latestReplies",
        "read",
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "draft",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "extraData",
        "",
        "",
        "<init>",
        "(ILjava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/models/User;ILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;Ljava/util/Map;)V",
        "getActiveParticipantCount",
        "()I",
        "getCid",
        "()Ljava/lang/String;",
        "getChannel",
        "()Lio/getstream/chat/android/models/Channel;",
        "getParentMessageId",
        "getParentMessage",
        "()Lio/getstream/chat/android/models/Message;",
        "getCreatedByUserId",
        "getCreatedBy",
        "()Lio/getstream/chat/android/models/User;",
        "getParticipantCount",
        "getThreadParticipants",
        "()Ljava/util/List;",
        "getLastMessageAt",
        "()Ljava/util/Date;",
        "getCreatedAt",
        "getUpdatedAt",
        "getDeletedAt",
        "getTitle",
        "getLatestReplies",
        "getRead",
        "getDraft",
        "()Lio/getstream/chat/android/models/DraftMessage;",
        "getExtraData",
        "()Ljava/util/Map;",
        "replyCount",
        "getReplyCount",
        "getComparableField",
        "",
        "fieldName",
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

.field private final draft:Lio/getstream/chat/android/models/DraftMessage;

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

.field private final latestReplies:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation
.end field

.field private final parentMessage:Lio/getstream/chat/android/models/Message;

.field private final parentMessageId:Ljava/lang/String;

.field private final participantCount:I

.field private final read:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;"
        }
    .end annotation
.end field

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
.method public constructor <init>(ILjava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/models/User;ILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;Ljava/util/Map;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Channel;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            "I",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ThreadParticipant;",
            ">;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p4

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    move-object/from16 v3, p9

    move-object/from16 v4, p10

    move-object/from16 v5, p11

    move-object/from16 v6, p12

    move-object/from16 v7, p14

    move-object/from16 v8, p15

    move-object/from16 v9, p16

    move-object/from16 v10, p18

    const-string v11, "cid"

    invoke-static {p2, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "parentMessageId"

    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "parentMessage"

    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "createdByUserId"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "threadParticipants"

    invoke-static {v3, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "lastMessageAt"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "createdAt"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "updatedAt"

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "title"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "latestReplies"

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "read"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "extraData"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lio/getstream/chat/android/models/Thread;->activeParticipantCount:I

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/models/Thread;->cid:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/models/Thread;->channel:Lio/getstream/chat/android/models/Channel;

    .line 5
    iput-object v0, p0, Lio/getstream/chat/android/models/Thread;->parentMessageId:Ljava/lang/String;

    .line 6
    iput-object v1, p0, Lio/getstream/chat/android/models/Thread;->parentMessage:Lio/getstream/chat/android/models/Message;

    .line 7
    iput-object v2, p0, Lio/getstream/chat/android/models/Thread;->createdByUserId:Ljava/lang/String;

    move-object/from16 p1, p7

    .line 8
    iput-object p1, p0, Lio/getstream/chat/android/models/Thread;->createdBy:Lio/getstream/chat/android/models/User;

    move/from16 p1, p8

    .line 9
    iput p1, p0, Lio/getstream/chat/android/models/Thread;->participantCount:I

    .line 10
    iput-object v3, p0, Lio/getstream/chat/android/models/Thread;->threadParticipants:Ljava/util/List;

    .line 11
    iput-object v4, p0, Lio/getstream/chat/android/models/Thread;->lastMessageAt:Ljava/util/Date;

    .line 12
    iput-object v5, p0, Lio/getstream/chat/android/models/Thread;->createdAt:Ljava/util/Date;

    .line 13
    iput-object v6, p0, Lio/getstream/chat/android/models/Thread;->updatedAt:Ljava/util/Date;

    move-object/from16 p1, p13

    .line 14
    iput-object p1, p0, Lio/getstream/chat/android/models/Thread;->deletedAt:Ljava/util/Date;

    .line 15
    iput-object v7, p0, Lio/getstream/chat/android/models/Thread;->title:Ljava/lang/String;

    .line 16
    iput-object v8, p0, Lio/getstream/chat/android/models/Thread;->latestReplies:Ljava/util/List;

    .line 17
    iput-object v9, p0, Lio/getstream/chat/android/models/Thread;->read:Ljava/util/List;

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, Lio/getstream/chat/android/models/Thread;->draft:Lio/getstream/chat/android/models/DraftMessage;

    .line 19
    iput-object v10, p0, Lio/getstream/chat/android/models/Thread;->extraData:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/models/User;ILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    const/high16 v0, 0x20000

    and-int v0, p19, v0

    if-eqz v0, :cond_0

    .line 20
    sget-object v0, Lm83/z;->w:Lm83/z;

    move-object/from16 v19, v0

    :goto_0
    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    goto :goto_1

    :cond_0
    move-object/from16 v19, p18

    goto :goto_0

    .line 21
    :goto_1
    invoke-direct/range {v1 .. v19}, Lio/getstream/chat/android/models/Thread;-><init>(ILjava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/models/User;ILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/models/Thread;ILjava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/models/User;ILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Thread;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lio/getstream/chat/android/models/Thread;->activeParticipantCount:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/models/Thread;->cid:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/models/Thread;->channel:Lio/getstream/chat/android/models/Channel;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/chat/android/models/Thread;->parentMessageId:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/chat/android/models/Thread;->parentMessage:Lio/getstream/chat/android/models/Message;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/chat/android/models/Thread;->createdByUserId:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/chat/android/models/Thread;->createdBy:Lio/getstream/chat/android/models/User;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lio/getstream/chat/android/models/Thread;->participantCount:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/getstream/chat/android/models/Thread;->threadParticipants:Ljava/util/List;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lio/getstream/chat/android/models/Thread;->lastMessageAt:Ljava/util/Date;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/chat/android/models/Thread;->createdAt:Ljava/util/Date;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/chat/android/models/Thread;->updatedAt:Ljava/util/Date;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/chat/android/models/Thread;->deletedAt:Ljava/util/Date;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/chat/android/models/Thread;->title:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lio/getstream/chat/android/models/Thread;->latestReplies:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lio/getstream/chat/android/models/Thread;->read:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p19, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lio/getstream/chat/android/models/Thread;->draft:Lio/getstream/chat/android/models/DraftMessage;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p19, v16

    if-eqz v16, :cond_11

    move-object/from16 p3, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Thread;->extraData:Ljava/util/Map;

    move-object/from16 p18, p3

    move-object/from16 p19, v1

    :goto_11
    move-object/from16 p17, p2

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_12

    :cond_11
    move-object/from16 p19, p18

    move-object/from16 p18, v1

    goto :goto_11

    :goto_12
    invoke-virtual/range {p1 .. p19}, Lio/getstream/chat/android/models/Thread;->copy(ILjava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/models/User;ILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;Ljava/util/Map;)Lio/getstream/chat/android/models/Thread;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Thread;->activeParticipantCount:I

    return v0
.end method

.method public final component10()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->lastMessageAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component11()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component12()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component13()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->deletedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->latestReplies:Ljava/util/List;

    return-object v0
.end method

.method public final component16()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->read:Ljava/util/List;

    return-object v0
.end method

.method public final component17()Lio/getstream/chat/android/models/DraftMessage;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->draft:Lio/getstream/chat/android/models/DraftMessage;

    return-object v0
.end method

.method public final component18()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/models/Channel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->channel:Lio/getstream/chat/android/models/Channel;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->parentMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->parentMessage:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->createdByUserId:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->createdBy:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Thread;->participantCount:I

    return v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ThreadParticipant;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->threadParticipants:Ljava/util/List;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/models/User;ILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;Ljava/util/Map;)Lio/getstream/chat/android/models/Thread;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Channel;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            "I",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ThreadParticipant;",
            ">;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/models/Thread;"
        }
    .end annotation

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parentMessageId"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parentMessage"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdByUserId"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadParticipants"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastMessageAt"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestReplies"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "read"

    move-object/from16 v2, p16

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v4, p18

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/models/Thread;

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v14, p13

    move-object/from16 v16, p15

    move-object/from16 v18, p17

    move-object/from16 v17, v2

    move-object/from16 v19, v4

    move/from16 v2, p1

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v19}, Lio/getstream/chat/android/models/Thread;-><init>(ILjava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/models/User;ILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/models/Thread;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/models/Thread;

    iget v1, p0, Lio/getstream/chat/android/models/Thread;->activeParticipantCount:I

    iget v3, p1, Lio/getstream/chat/android/models/Thread;->activeParticipantCount:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/models/Thread;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Thread;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/models/Thread;->channel:Lio/getstream/chat/android/models/Channel;

    iget-object v3, p1, Lio/getstream/chat/android/models/Thread;->channel:Lio/getstream/chat/android/models/Channel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/models/Thread;->parentMessageId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Thread;->parentMessageId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/models/Thread;->parentMessage:Lio/getstream/chat/android/models/Message;

    iget-object v3, p1, Lio/getstream/chat/android/models/Thread;->parentMessage:Lio/getstream/chat/android/models/Message;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/models/Thread;->createdByUserId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Thread;->createdByUserId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/models/Thread;->createdBy:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/models/Thread;->createdBy:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lio/getstream/chat/android/models/Thread;->participantCount:I

    iget v3, p1, Lio/getstream/chat/android/models/Thread;->participantCount:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/models/Thread;->threadParticipants:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Thread;->threadParticipants:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/models/Thread;->lastMessageAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Thread;->lastMessageAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/models/Thread;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Thread;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/models/Thread;->updatedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Thread;->updatedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/models/Thread;->deletedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/Thread;->deletedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/models/Thread;->title:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/Thread;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/chat/android/models/Thread;->latestReplies:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Thread;->latestReplies:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/chat/android/models/Thread;->read:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/Thread;->read:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lio/getstream/chat/android/models/Thread;->draft:Lio/getstream/chat/android/models/DraftMessage;

    iget-object v3, p1, Lio/getstream/chat/android/models/Thread;->draft:Lio/getstream/chat/android/models/DraftMessage;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lio/getstream/chat/android/models/Thread;->extraData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/models/Thread;->extraData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getActiveParticipantCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Thread;->activeParticipantCount:I

    return v0
.end method

.method public final getChannel()Lio/getstream/chat/android/models/Channel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->channel:Lio/getstream/chat/android/models/Channel;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->cid:Ljava/lang/String;

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
    const-string v0, "active_participant_count"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "activeParticipantCount"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    iget p1, p0, Lio/getstream/chat/android/models/Thread;->activeParticipantCount:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :sswitch_2
    const-string v0, "created_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "participant_count"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "lastMessageAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "createdAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/models/Thread;->createdAt:Ljava/util/Date;

    return-object p1

    :sswitch_6
    const-string v0, "participantCount"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget p1, p0, Lio/getstream/chat/android/models/Thread;->participantCount:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :sswitch_7
    const-string v0, "reply_count"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :sswitch_8
    const-string v0, "last_message_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/models/Thread;->lastMessageAt:Ljava/util/Date;

    return-object p1

    :sswitch_9
    const-string v0, "parentMessageId"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :sswitch_a
    const-string v0, "updated_at"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :sswitch_b
    const-string v0, "replyCount"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Thread;->getReplyCount()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :sswitch_c
    const-string v0, "parent_message_id"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/models/Thread;->parentMessageId:Ljava/lang/String;

    return-object p1

    :sswitch_d
    const-string v0, "updatedAt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    :goto_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Thread;->getExtraData()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/Comparable;

    if-eqz v0, :cond_6

    check-cast p1, Ljava/lang/Comparable;

    return-object p1

    :cond_6
    const/4 p1, 0x0

    return-object p1

    :cond_7
    iget-object p1, p0, Lio/getstream/chat/android/models/Thread;->updatedAt:Ljava/util/Date;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x742e59b2 -> :sswitch_d
        -0x485040f8 -> :sswitch_c
        -0x22486fbb -> :sswitch_b
        -0x119c6dc9 -> :sswitch_a
        -0xe5fa608 -> :sswitch_9
        -0x4f2f74c -> :sswitch_8
        0x8566f7a -> :sswitch_7
        0x118af99c -> :sswitch_6
        0x23aa6d3b -> :sswitch_5
        0x3f3738a4 -> :sswitch_4
        0x4ef03103 -> :sswitch_3
        0x51a3a8ea -> :sswitch_2
        0x759bf0c2 -> :sswitch_1
        0x76ff240a -> :sswitch_0
    .end sparse-switch
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getCreatedBy()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->createdBy:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final getCreatedByUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->createdByUserId:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeletedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->deletedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getDraft()Lio/getstream/chat/android/models/DraftMessage;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->draft:Lio/getstream/chat/android/models/DraftMessage;

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

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->extraData:Ljava/util/Map;

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

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->lastMessageAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getLatestReplies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->latestReplies:Ljava/util/List;

    return-object v0
.end method

.method public final getParentMessage()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->parentMessage:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final getParentMessageId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->parentMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getParticipantCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/Thread;->participantCount:I

    return v0
.end method

.method public final getRead()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->read:Ljava/util/List;

    return-object v0
.end method

.method public final getReplyCount()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->parentMessage:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getReplyCount()I

    move-result v0

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

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->threadParticipants:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lio/getstream/chat/android/models/Thread;->activeParticipantCount:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Thread;->cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Thread;->channel:Lio/getstream/chat/android/models/Channel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Thread;->parentMessageId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Thread;->parentMessage:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/models/Thread;->createdByUserId:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Thread;->createdBy:Lio/getstream/chat/android/models/User;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/models/Thread;->participantCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Thread;->threadParticipants:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Thread;->lastMessageAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Thread;->createdAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Thread;->updatedAt:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Thread;->deletedAt:Ljava/util/Date;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/Thread;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Thread;->latestReplies:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Thread;->read:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/Thread;->draft:Lio/getstream/chat/android/models/DraftMessage;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lio/getstream/chat/android/models/DraftMessage;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/models/Thread;->extraData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 21

    move-object/from16 v0, p0

    iget v1, v0, Lio/getstream/chat/android/models/Thread;->activeParticipantCount:I

    iget-object v2, v0, Lio/getstream/chat/android/models/Thread;->cid:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/models/Thread;->channel:Lio/getstream/chat/android/models/Channel;

    iget-object v4, v0, Lio/getstream/chat/android/models/Thread;->parentMessageId:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/chat/android/models/Thread;->parentMessage:Lio/getstream/chat/android/models/Message;

    iget-object v6, v0, Lio/getstream/chat/android/models/Thread;->createdByUserId:Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/models/Thread;->createdBy:Lio/getstream/chat/android/models/User;

    iget v8, v0, Lio/getstream/chat/android/models/Thread;->participantCount:I

    iget-object v9, v0, Lio/getstream/chat/android/models/Thread;->threadParticipants:Ljava/util/List;

    iget-object v10, v0, Lio/getstream/chat/android/models/Thread;->lastMessageAt:Ljava/util/Date;

    iget-object v11, v0, Lio/getstream/chat/android/models/Thread;->createdAt:Ljava/util/Date;

    iget-object v12, v0, Lio/getstream/chat/android/models/Thread;->updatedAt:Ljava/util/Date;

    iget-object v13, v0, Lio/getstream/chat/android/models/Thread;->deletedAt:Ljava/util/Date;

    iget-object v14, v0, Lio/getstream/chat/android/models/Thread;->title:Ljava/lang/String;

    iget-object v15, v0, Lio/getstream/chat/android/models/Thread;->latestReplies:Ljava/util/List;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Thread;->read:Ljava/util/List;

    move-object/from16 v17, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Thread;->draft:Lio/getstream/chat/android/models/DraftMessage;

    move-object/from16 v18, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/Thread;->extraData:Ljava/util/Map;

    const-string v0, ", cid="

    move-object/from16 v19, v15

    const-string v15, ", channel="

    move-object/from16 v20, v14

    const-string v14, "Thread(activeParticipantCount="

    invoke-static {v1, v14, v0, v2, v15}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", parentMessageId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", parentMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdByUserId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", createdBy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", participantCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", threadParticipants="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastMessageAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    const-string v2, ", deletedAt="

    invoke-static {v0, v11, v1, v12, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", latestReplies="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", read="

    const-string v2, ", draft="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
