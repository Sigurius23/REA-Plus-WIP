.class public final Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008%\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0010\u0008\u0002\u0010\u0015\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003J\t\u0010-\u001a\u00020\u0006H\u00c6\u0003J\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u00103\u001a\u00020\u0010H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u0011\u00106\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017H\u00c6\u0003J\u0097\u0001\u00107\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u00062\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\u0008\u0002\u0010\u0015\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017H\u00c6\u0001J\u0013\u00108\u001a\u00020\u00062\u0008\u00109\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010:\u001a\u00020\u0010H\u00d6\u0001J\t\u0010;\u001a\u00020\u000eH\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001dR\u0011\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0019\u0010\u0015\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*\u00a8\u0006<"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;",
        "",
        "messageItems",
        "",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;",
        "endOfNewMessagesReached",
        "",
        "endOfOldMessagesReached",
        "isLoading",
        "isLoadingNewerMessages",
        "isLoadingOlderMessages",
        "currentUser",
        "Lio/getstream/chat/android/models/User;",
        "parentMessageId",
        "",
        "unreadCount",
        "",
        "newMessageState",
        "Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;",
        "selectedMessageState",
        "Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;",
        "unreadLabel",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/UnreadLabel;",
        "<init>",
        "(Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;)V",
        "getMessageItems",
        "()Ljava/util/List;",
        "getEndOfNewMessagesReached",
        "()Z",
        "getEndOfOldMessagesReached",
        "getCurrentUser",
        "()Lio/getstream/chat/android/models/User;",
        "getParentMessageId",
        "()Ljava/lang/String;",
        "getUnreadCount",
        "()I",
        "getNewMessageState",
        "()Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;",
        "getSelectedMessageState",
        "()Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;",
        "getUnreadLabel",
        "()Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;",
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
        "copy",
        "equals",
        "other",
        "hashCode",
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

.field private final endOfNewMessagesReached:Z

.field private final endOfOldMessagesReached:Z

.field private final isLoading:Z

.field private final isLoadingNewerMessages:Z

.field private final isLoadingOlderMessages:Z

.field private final messageItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;",
            ">;"
        }
    .end annotation
.end field

.field private final newMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

.field private final parentMessageId:Ljava/lang/String;

.field private final selectedMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;

.field private final unreadCount:I

.field private final unreadLabel:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;


# direct methods
.method public constructor <init>()V
    .locals 15

    .line 1
    const/16 v13, 0xfff

    const/4 v14, 0x0

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

    move-object v0, p0

    invoke-direct/range {v0 .. v14}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;-><init>(Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;",
            ">;ZZZZZ",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/lang/String;",
            "I",
            "Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;",
            "Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;",
            ")V"
        }
    .end annotation

    const-string v0, "messageItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->messageItems:Ljava/util/List;

    .line 4
    iput-boolean p2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->endOfNewMessagesReached:Z

    .line 5
    iput-boolean p3, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->endOfOldMessagesReached:Z

    .line 6
    iput-boolean p4, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoading:Z

    .line 7
    iput-boolean p5, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingNewerMessages:Z

    .line 8
    iput-boolean p6, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingOlderMessages:Z

    .line 9
    iput-object p7, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->currentUser:Lio/getstream/chat/android/models/User;

    .line 10
    iput-object p8, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->parentMessageId:Ljava/lang/String;

    .line 11
    iput p9, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->unreadCount:I

    .line 12
    iput-object p10, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->newMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    .line 13
    iput-object p11, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->selectedMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;

    .line 14
    iput-object p12, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->unreadLabel:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 37

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 15
    sget-object v1, Lm83/y;->w:Lm83/y;

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move v5, v4

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    move v6, v4

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    move v7, v4

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    .line 16
    new-instance v9, Lio/getstream/chat/android/models/User;

    const v35, 0x1ffffff

    const/16 v36, 0x0

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

    invoke-direct/range {v9 .. v36}, Lio/getstream/chat/android/models/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    const/4 v10, 0x0

    if-eqz v8, :cond_7

    move-object v8, v10

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    goto :goto_8

    :cond_8
    move/from16 v4, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    move-object v11, v10

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    move-object v12, v10

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    move-object/from16 p13, v10

    :goto_b
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move/from16 p3, v2

    move/from16 p4, v3

    move/from16 p10, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move-object/from16 p9, v8

    move-object/from16 p8, v9

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    goto :goto_c

    :cond_b
    move-object/from16 p13, p12

    goto :goto_b

    .line 17
    :goto_c
    invoke-direct/range {p1 .. p13}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;-><init>(Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->messageItems:Ljava/util/List;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->endOfNewMessagesReached:Z

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-boolean p3, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->endOfOldMessagesReached:Z

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-boolean p4, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoading:Z

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-boolean p5, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingNewerMessages:Z

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-boolean p6, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingOlderMessages:Z

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->currentUser:Lio/getstream/chat/android/models/User;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->parentMessageId:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget p9, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->unreadCount:I

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->newMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->selectedMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->unreadLabel:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy(Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->messageItems:Ljava/util/List;

    return-object v0
.end method

.method public final component10()Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->newMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    return-object v0
.end method

.method public final component11()Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->selectedMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;

    return-object v0
.end method

.method public final component12()Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->unreadLabel:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->endOfNewMessagesReached:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->endOfOldMessagesReached:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoading:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingNewerMessages:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingOlderMessages:Z

    return v0
.end method

.method public final component7()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->currentUser:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->parentMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->unreadCount:I

    return v0
.end method

.method public final copy(Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;",
            ">;ZZZZZ",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/lang/String;",
            "I",
            "Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;",
            "Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;",
            ")",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;"
        }
    .end annotation

    const-string v0, "messageItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-object v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;-><init>(Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->messageItems:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->messageItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->endOfNewMessagesReached:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->endOfNewMessagesReached:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->endOfOldMessagesReached:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->endOfOldMessagesReached:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoading:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoading:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingNewerMessages:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingNewerMessages:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingOlderMessages:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingOlderMessages:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->currentUser:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->currentUser:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->parentMessageId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->parentMessageId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->unreadCount:I

    iget v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->unreadCount:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->newMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->newMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->selectedMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->selectedMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->unreadLabel:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->unreadLabel:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getCurrentUser()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->currentUser:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final getEndOfNewMessagesReached()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->endOfNewMessagesReached:Z

    return v0
.end method

.method public final getEndOfOldMessagesReached()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->endOfOldMessagesReached:Z

    return v0
.end method

.method public final getMessageItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->messageItems:Ljava/util/List;

    return-object v0
.end method

.method public final getNewMessageState()Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->newMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    return-object v0
.end method

.method public final getParentMessageId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->parentMessageId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSelectedMessageState()Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->selectedMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;

    return-object v0
.end method

.method public final getUnreadCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->unreadCount:I

    return v0
.end method

.method public final getUnreadLabel()Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->unreadLabel:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->messageItems:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->endOfNewMessagesReached:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->endOfOldMessagesReached:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoading:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingNewerMessages:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingOlderMessages:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->currentUser:Lio/getstream/chat/android/models/User;

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

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->parentMessageId:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->unreadCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->newMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->selectedMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->unreadLabel:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public final isLoading()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoading:Z

    return v0
.end method

.method public final isLoadingNewerMessages()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingNewerMessages:Z

    return v0
.end method

.method public final isLoadingOlderMessages()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingOlderMessages:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->messageItems:Ljava/util/List;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->endOfNewMessagesReached:Z

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->endOfOldMessagesReached:Z

    iget-boolean v3, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoading:Z

    iget-boolean v4, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingNewerMessages:Z

    iget-boolean v5, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingOlderMessages:Z

    iget-object v6, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->currentUser:Lio/getstream/chat/android/models/User;

    iget-object v7, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->parentMessageId:Ljava/lang/String;

    iget v8, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->unreadCount:I

    iget-object v9, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->newMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    iget-object v10, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->selectedMessageState:Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;

    iget-object v11, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->unreadLabel:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "MessageListState(messageItems="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", endOfNewMessagesReached="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", endOfOldMessagesReached="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isLoading="

    const-string v1, ", isLoadingNewerMessages="

    invoke-static {v12, v2, v0, v3, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v0, ", isLoadingOlderMessages="

    const-string v1, ", currentUser="

    invoke-static {v12, v4, v0, v5, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", parentMessageId="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", unreadCount="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", newMessageState="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedMessageState="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", unreadLabel="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
