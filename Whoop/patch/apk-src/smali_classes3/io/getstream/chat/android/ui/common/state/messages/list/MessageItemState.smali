.class public final Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;
.super Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00a3\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0007\u0012\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\u0007H\u00c6\u0003J\t\u00100\u001a\u00020\u0007H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u00102\u001a\u00020\rH\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\t\u00104\u001a\u00020\u0007H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000f\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\u000f\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017H\u00c6\u0003J\t\u00109\u001a\u00020\u0007H\u00c6\u0003J\u00a7\u0001\u0010:\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00072\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00072\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010;\u001a\u00020\u00072\u0008\u0010<\u001a\u0004\u0018\u00010=H\u00d6\u0003J\t\u0010>\u001a\u00020?H\u00d6\u0001J\t\u0010@\u001a\u00020\u0005H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u001fR\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0017\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0011\u0010\u0015\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u001fR\u0017\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0011\u0010\u0018\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u001f\u00a8\u0006A"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/HasMessageListItemState;",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "parentMessageId",
        "",
        "isMine",
        "",
        "isInThread",
        "showMessageFooter",
        "currentUser",
        "Lio/getstream/chat/android/models/User;",
        "groupPosition",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;",
        "isMessageRead",
        "isMessageDelivered",
        "focusState",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;",
        "messageReadBy",
        "",
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "showOriginalText",
        "ownCapabilities",
        "",
        "isPreviewMode",
        "<init>",
        "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZZZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZZLio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;Ljava/util/List;ZLjava/util/Set;Z)V",
        "getMessage",
        "()Lio/getstream/chat/android/models/Message;",
        "getParentMessageId",
        "()Ljava/lang/String;",
        "()Z",
        "getShowMessageFooter",
        "getCurrentUser",
        "()Lio/getstream/chat/android/models/User;",
        "getGroupPosition",
        "()Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;",
        "getFocusState",
        "()Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;",
        "getMessageReadBy",
        "()Ljava/util/List;",
        "getShowOriginalText",
        "getOwnCapabilities",
        "()Ljava/util/Set;",
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
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "stream-chat-android-ui-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final currentUser:Lio/getstream/chat/android/models/User;

.field private final focusState:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;

.field private final groupPosition:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

.field private final isInThread:Z

.field private final isMessageDelivered:Z

.field private final isMessageRead:Z

.field private final isMine:Z

.field private final isPreviewMode:Z

.field private final message:Lio/getstream/chat/android/models/Message;

.field private final messageReadBy:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;"
        }
    .end annotation
.end field

.field private final ownCapabilities:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final parentMessageId:Ljava/lang/String;

.field private final showMessageFooter:Z

.field private final showOriginalText:Z


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZZZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZZLio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;Ljava/util/List;ZLjava/util/Set;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "ZZZ",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;",
            "ZZ",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "groupPosition"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageReadBy"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->message:Lio/getstream/chat/android/models/Message;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->parentMessageId:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMine:Z

    .line 5
    iput-boolean p4, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isInThread:Z

    .line 6
    iput-boolean p5, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->showMessageFooter:Z

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->currentUser:Lio/getstream/chat/android/models/User;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->groupPosition:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    .line 9
    iput-boolean p8, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageRead:Z

    .line 10
    iput-boolean p9, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageDelivered:Z

    .line 11
    iput-object p10, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->focusState:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;

    .line 12
    iput-object p11, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->messageReadBy:Ljava/util/List;

    .line 13
    iput-boolean p12, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->showOriginalText:Z

    .line 14
    iput-object p13, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->ownCapabilities:Ljava/util/Set;

    .line 15
    iput-boolean p14, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isPreviewMode:Z

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZZZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZZLio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;Ljava/util/List;ZLjava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 54

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 16
    new-instance v2, Lio/getstream/chat/android/models/Message;

    const v52, 0xffff

    const/16 v53, 0x0

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

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, -0x1

    invoke-direct/range {v2 .. v53}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v5, v2

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v1, v0, 0x4

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    move v6, v3

    goto :goto_2

    :cond_2
    move/from16 v6, p3

    :goto_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    move v7, v3

    goto :goto_3

    :cond_3
    move/from16 v7, p4

    :goto_3
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_4

    move v8, v3

    goto :goto_4

    :cond_4
    move/from16 v8, p5

    :goto_4
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_5

    move-object v9, v2

    goto :goto_5

    :cond_5
    move-object/from16 v9, p6

    :goto_5
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_6

    .line 17
    sget-object v1, Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;->NONE:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    move-object v10, v1

    goto :goto_6

    :cond_6
    move-object/from16 v10, p7

    :goto_6
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_7

    move v11, v3

    goto :goto_7

    :cond_7
    move/from16 v11, p8

    :goto_7
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_8

    move v12, v3

    goto :goto_8

    :cond_8
    move/from16 v12, p9

    :goto_8
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_9

    move-object v13, v2

    goto :goto_9

    :cond_9
    move-object/from16 v13, p10

    :goto_9
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_a

    .line 18
    sget-object v1, Lm83/y;->w:Lm83/y;

    move-object v14, v1

    goto :goto_a

    :cond_a
    move-object/from16 v14, p11

    :goto_a
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_b

    move v15, v3

    goto :goto_b

    :cond_b
    move/from16 v15, p12

    :goto_b
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_c

    move/from16 v17, v3

    move-object/from16 v16, p13

    move-object/from16 v3, p0

    goto :goto_c

    :cond_c
    move/from16 v17, p14

    move-object/from16 v3, p0

    move-object/from16 v16, p13

    .line 19
    :goto_c
    invoke-direct/range {v3 .. v17}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;-><init>(Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZZZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZZLio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;Ljava/util/List;ZLjava/util/Set;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZZZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZZLio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;Ljava/util/List;ZLjava/util/Set;ZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->message:Lio/getstream/chat/android/models/Message;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->parentMessageId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget-boolean v3, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMine:Z

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-boolean v4, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isInThread:Z

    goto :goto_3

    :cond_3
    move/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget-boolean v5, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->showMessageFooter:Z

    goto :goto_4

    :cond_4
    move/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->currentUser:Lio/getstream/chat/android/models/User;

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget-object v7, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->groupPosition:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-boolean v8, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageRead:Z

    goto :goto_7

    :cond_7
    move/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-boolean v9, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageDelivered:Z

    goto :goto_8

    :cond_8
    move/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-object v10, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->focusState:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;

    goto :goto_9

    :cond_9
    move-object/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-object v11, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->messageReadBy:Ljava/util/List;

    goto :goto_a

    :cond_a
    move-object/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget-boolean v12, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->showOriginalText:Z

    goto :goto_b

    :cond_b
    move/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget-object v13, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->ownCapabilities:Ljava/util/Set;

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isPreviewMode:Z

    move/from16 p15, v0

    :goto_d
    move-object p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move/from16 p4, v3

    move/from16 p5, v4

    move/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move/from16 p9, v8

    move/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v11

    move/from16 p13, v12

    move-object/from16 p14, v13

    goto :goto_e

    :cond_d
    move/from16 p15, p14

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p15}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->copy(Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZZZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZZLio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;Ljava/util/List;ZLjava/util/Set;Z)Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->message:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final component10()Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->focusState:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->messageReadBy:Ljava/util/List;

    return-object v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->showOriginalText:Z

    return v0
.end method

.method public final component13()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->ownCapabilities:Ljava/util/Set;

    return-object v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isPreviewMode:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->parentMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMine:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isInThread:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->showMessageFooter:Z

    return v0
.end method

.method public final component6()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->currentUser:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component7()Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->groupPosition:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageRead:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageDelivered:Z

    return v0
.end method

.method public final copy(Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZZZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZZLio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;Ljava/util/List;ZLjava/util/Set;Z)Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "ZZZ",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;",
            "ZZ",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z)",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;"
        }
    .end annotation

    const-string v0, "message"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "groupPosition"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageReadBy"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v13, p12

    move/from16 v15, p14

    invoke-direct/range {v1 .. v15}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;-><init>(Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZZZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZZLio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;Ljava/util/List;ZLjava/util/Set;Z)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->message:Lio/getstream/chat/android/models/Message;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->message:Lio/getstream/chat/android/models/Message;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->parentMessageId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->parentMessageId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMine:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMine:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isInThread:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isInThread:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->showMessageFooter:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->showMessageFooter:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->currentUser:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->currentUser:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->groupPosition:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->groupPosition:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageRead:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageRead:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageDelivered:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageDelivered:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->focusState:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->focusState:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->messageReadBy:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->messageReadBy:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->showOriginalText:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->showOriginalText:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->ownCapabilities:Ljava/util/Set;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->ownCapabilities:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isPreviewMode:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isPreviewMode:Z

    if-eq v1, p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getCurrentUser()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->currentUser:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final getFocusState()Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->focusState:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;

    return-object v0
.end method

.method public final getGroupPosition()Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->groupPosition:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    return-object v0
.end method

.method public final getMessage()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->message:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final getMessageReadBy()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->messageReadBy:Ljava/util/List;

    return-object v0
.end method

.method public final getOwnCapabilities()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->ownCapabilities:Ljava/util/Set;

    return-object v0
.end method

.method public final getParentMessageId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->parentMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getShowMessageFooter()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->showMessageFooter:Z

    return v0
.end method

.method public final getShowOriginalText()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->showOriginalText:Z

    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->message:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->parentMessageId:Ljava/lang/String;

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

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMine:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isInThread:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->showMessageFooter:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->currentUser:Lio/getstream/chat/android/models/User;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->groupPosition:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageRead:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageDelivered:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->focusState:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->messageReadBy:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->showOriginalText:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->ownCapabilities:Ljava/util/Set;

    invoke-static {v2, v0, v1}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isPreviewMode:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isInThread()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isInThread:Z

    return v0
.end method

.method public final isMessageDelivered()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageDelivered:Z

    return v0
.end method

.method public final isMessageRead()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageRead:Z

    return v0
.end method

.method public final isMine()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMine:Z

    return v0
.end method

.method public final isPreviewMode()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isPreviewMode:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->message:Lio/getstream/chat/android/models/Message;

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->parentMessageId:Ljava/lang/String;

    iget-boolean v3, v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMine:Z

    iget-boolean v4, v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isInThread:Z

    iget-boolean v5, v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->showMessageFooter:Z

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->currentUser:Lio/getstream/chat/android/models/User;

    iget-object v7, v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->groupPosition:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    iget-boolean v8, v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageRead:Z

    iget-boolean v9, v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageDelivered:Z

    iget-object v10, v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->focusState:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;

    iget-object v11, v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->messageReadBy:Ljava/util/List;

    iget-boolean v12, v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->showOriginalText:Z

    iget-object v13, v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->ownCapabilities:Ljava/util/Set;

    iget-boolean v14, v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isPreviewMode:Z

    new-instance v15, Ljava/lang/StringBuilder;

    const-string v0, "MessageItemState(message="

    invoke-direct {v15, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", parentMessageId="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isMine="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isInThread="

    const-string v1, ", showMessageFooter="

    invoke-static {v15, v3, v0, v4, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", currentUser="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", groupPosition="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isMessageRead="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isMessageDelivered="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", focusState="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", messageReadBy="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", showOriginalText="

    const-string v1, ", ownCapabilities="

    invoke-static {v0, v1, v15, v11, v12}, Lnh3/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isPreviewMode="

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
