.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDiffCallback;
.super Landroidx/recyclerview/widget/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/u;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J!\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDiffCallback;",
        "Landroidx/recyclerview/widget/u;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
        "<init>",
        "()V",
        "oldItem",
        "newItem",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;",
        "getMessageListItemChangePayload",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "getMessageChangePayload",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;",
        "",
        "areItemsTheSame",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Z",
        "areContentsTheSame",
        "",
        "getChangePayload",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Ljava/lang/Object;",
        "stream-chat-android-ui-components_release"
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
.field public static final INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDiffCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDiffCallback;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDiffCallback;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDiffCallback;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getMessageChangePayload(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;
    .locals 19

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getReplyTo()Lio/getstream/chat/android/models/Message;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v6

    :goto_0
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getReplyTo()Lio/getstream/chat/android/models/Message;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v6

    :cond_1
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    xor-int/2addr v5, v4

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getReactionGroups()Ljava/util/Map;

    move-result-object v6

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getReactionGroups()Ljava/util/Map;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    xor-int/2addr v6, v4

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    xor-int/2addr v7, v4

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getReplyCount()I

    move-result v8

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getReplyCount()I

    move-result v9

    const/4 v10, 0x0

    if-eq v8, v9, :cond_2

    move v8, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move v7, v8

    goto :goto_1

    :cond_2
    move v8, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move v7, v10

    :goto_1
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v9

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v11

    if-eq v9, v11, :cond_3

    move v9, v8

    goto :goto_2

    :cond_3
    move v9, v8

    move v8, v10

    :goto_2
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getDeletedAt()Ljava/util/Date;

    move-result-object v11

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getDeletedAt()Ljava/util/Date;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    xor-int/2addr v11, v9

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getPosition()Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    move-result-object v12

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getPosition()Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    move-result-object v13

    if-eq v12, v13, :cond_4

    move v12, v10

    move v10, v9

    goto :goto_3

    :cond_4
    move v12, v10

    :goto_3
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v13

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v14

    if-eq v13, v14, :cond_5

    move v13, v9

    move v9, v11

    move v11, v13

    goto :goto_4

    :cond_5
    move v13, v9

    move v9, v11

    move v11, v12

    :goto_4
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v14

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    xor-int/2addr v14, v13

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getMentionedUsers()Ljava/util/List;

    move-result-object v15

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getMentionedUsers()Ljava/util/List;

    move-result-object v12

    invoke-static {v15, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    xor-int/2addr v12, v13

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getShowMessageFooter()Z

    move-result v15

    move/from16 v17, v13

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getShowMessageFooter()Z

    move-result v13

    if-eq v15, v13, :cond_6

    move v13, v12

    move v12, v14

    move/from16 v14, v17

    goto :goto_5

    :cond_6
    move v13, v12

    move v12, v14

    const/4 v14, 0x0

    :goto_5
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v15, v0, 0x1

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isThreadMode()Z

    move-result v0

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isThreadMode()Z

    move-result v1

    if-eq v0, v1, :cond_7

    move/from16 v16, v17

    :goto_6
    const/4 v0, 0x0

    goto :goto_7

    :cond_7
    const/16 v16, 0x0

    goto :goto_6

    :goto_7
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getShowOriginalText()Z

    move-result v1

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getShowOriginalText()Z

    move-result v0

    if-eq v1, v0, :cond_8

    move/from16 v0, v17

    goto :goto_8

    :cond_8
    move/from16 v0, v17

    const/16 v17, 0x0

    :goto_8
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageRead()Z

    move-result v1

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMessageRead()Z

    move-result v0

    if-eq v1, v0, :cond_9

    const/16 v18, 0x1

    goto :goto_9

    :cond_9
    const/16 v18, 0x0

    :goto_9
    invoke-direct/range {v2 .. v18}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;-><init>(ZZZZZZZZZZZZZZZZ)V

    return-object v2
.end method

.method private final getMessageListItemChangePayload(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;
    .locals 2

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_2

    instance-of v0, p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    if-eqz v0, :cond_1

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-eqz p2, :cond_2

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDiffCallback;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDiffCallback;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDiffCallback;->getMessageChangePayload(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v1
.end method


# virtual methods
.method public final areContentsTheSame(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Z
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DiffUtilEquals"
        }
    .end annotation

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 3
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDiffCallback;->getMessageListItemChangePayload(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->anyChanged()Z

    move-result p1

    if-nez p1, :cond_0

    return v2

    :cond_0
    return v1

    .line 4
    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;

    const/4 v3, 0x0

    if-eqz v0, :cond_4

    .line 5
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;->getDate()Ljava/util/Date;

    move-result-object p1

    instance-of v0, p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;

    if-eqz v0, :cond_2

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;

    goto :goto_0

    :cond_2
    move-object p2, v3

    :goto_0
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;->getDate()Ljava/util/Date;

    move-result-object v3

    :cond_3
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 6
    :cond_4
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadSeparatorItem;

    if-eqz v0, :cond_6

    instance-of v0, p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadSeparatorItem;

    if-eqz v0, :cond_5

    move-object v3, p2

    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadSeparatorItem;

    .line 7
    :cond_5
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 8
    :cond_6
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$LoadingMoreIndicatorItem;

    if-eqz v0, :cond_7

    return v2

    .line 9
    :cond_7
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$TypingItem;

    if-eqz v0, :cond_b

    .line 10
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$TypingItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$TypingItem;->getUsers()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 13
    check-cast v2, Lio/getstream/chat/android/models/User;

    .line 14
    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    .line 15
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 16
    :cond_8
    instance-of p1, p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$TypingItem;

    if-eqz p1, :cond_9

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$TypingItem;

    goto :goto_2

    :cond_9
    move-object p2, v3

    :goto_2
    if-eqz p2, :cond_a

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$TypingItem;->getUsers()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_a

    check-cast p1, Ljava/lang/Iterable;

    .line 17
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {v3, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    .line 19
    check-cast p2, Lio/getstream/chat/android/models/User;

    .line 20
    invoke-virtual {p2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p2

    .line 21
    invoke-interface {v3, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 22
    :cond_a
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 23
    :cond_b
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadPlaceholderItem;

    if-eqz v0, :cond_c

    return v2

    .line 24
    :cond_c
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;

    if-eqz v0, :cond_f

    .line 25
    instance-of v0, p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;

    if-eqz v0, :cond_d

    move-object v3, p2

    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;

    :cond_d
    if-eqz v3, :cond_e

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;->getUnreadCount()I

    move-result p1

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;->getUnreadCount()I

    move-result p2

    if-ne p1, p2, :cond_e

    return v2

    :cond_e
    return v1

    .line 26
    :cond_f
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$StartOfTheChannelItem;

    if-eqz v0, :cond_12

    .line 27
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$StartOfTheChannelItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$StartOfTheChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object p1

    instance-of v0, p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$StartOfTheChannelItem;

    if-eqz v0, :cond_10

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$StartOfTheChannelItem;

    goto :goto_4

    :cond_10
    move-object p2, v3

    :goto_4
    if-eqz p2, :cond_11

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$StartOfTheChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v3

    :cond_11
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 28
    :cond_12
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDiffCallback;->areContentsTheSame(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Z

    move-result p1

    return p1
.end method

.method public final areItemsTheSame(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Z
    .locals 2

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;->getStableId()J

    move-result-wide v0

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;->getStableId()J

    move-result-wide p1

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDiffCallback;->areItemsTheSame(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Z

    move-result p1

    return p1
.end method

.method public final getChangePayload(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Ljava/lang/Object;
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDiffCallback;->getMessageListItemChangePayload(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDiffCallback;->getChangePayload(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
