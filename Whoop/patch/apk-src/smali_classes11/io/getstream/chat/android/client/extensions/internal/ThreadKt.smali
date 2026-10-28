.class public final Lio/getstream/chat/android/client/extensions/internal/ThreadKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0018\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0005*\u0008\u0012\u0004\u0012\u00020\u00020\u0005H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0007\u001a\u0014\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0007\u001a\u0014\u0010\u000c\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0007\u001a$\u0010\u000e\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u0014\u0010\u0015\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u001c\u0010\u0016\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u001a$\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\u0018\u001a\u00020\t2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0005H\u0002\u001a$\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00022\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0005H\u0002\u001a$\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00052\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00052\u0006\u0010\r\u001a\u00020\tH\u0002\"\u001e\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\u0008\u0012\u0004\u0012\u00020\u0002`\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "PARTICIPANT_BY_LAST_REPLY",
        "Ljava/util/Comparator;",
        "Lio/getstream/chat/android/models/ThreadParticipant;",
        "Lkotlin/Comparator;",
        "sortedByLastReply",
        "",
        "updateParentOrReply",
        "Lio/getstream/chat/android/models/Thread;",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "updateParent",
        "parent",
        "upsertReply",
        "reply",
        "markAsReadByUser",
        "threadInfo",
        "Lio/getstream/chat/android/models/ThreadInfo;",
        "user",
        "Lio/getstream/chat/android/models/User;",
        "createdAt",
        "Ljava/util/Date;",
        "applyThreadUpdatedEventChanges",
        "markAsUnreadByUser",
        "upsertMessageInList",
        "newMessage",
        "messages",
        "upsertThreadParticipantInList",
        "newParticipant",
        "participants",
        "updateReadCounts",
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "read",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final PARTICIPANT_BY_LAST_REPLY:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lio/getstream/chat/android/models/ThreadParticipant;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/extensions/internal/ThreadKt$special$$inlined$compareByDescending$1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->PARTICIPANT_BY_LAST_REPLY:Ljava/util/Comparator;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/models/ThreadParticipant;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->upsertThreadParticipantInList$lambda$6(Lio/getstream/chat/android/models/ThreadParticipant;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final applyThreadUpdatedEventChanges(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/ThreadInfo;)Lio/getstream/chat/android/models/Thread;
    .locals 22
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "<this>"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadInfo"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ThreadInfo;->getParentMessageId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v2}, Lio/getstream/chat/android/models/ThreadInfo;->getTitle()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ThreadInfo;->getUpdatedAt()Ljava/util/Date;

    move-result-object v13

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ThreadInfo;->getExtraData()Ljava/util/Map;

    move-result-object v19

    const v20, 0x1d7ff

    const/16 v21, 0x0

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

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v1 .. v21}, Lio/getstream/chat/android/models/Thread;->copy$default(Lio/getstream/chat/android/models/Thread;ILjava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/models/User;ILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Thread;

    move-result-object v0

    return-object v0
.end method

.method public static final markAsReadByUser(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/ThreadInfo;Lio/getstream/chat/android/models/User;Ljava/util/Date;)Lio/getstream/chat/android/models/Thread;
    .locals 22
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "<this>"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadInfo"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    move-object/from16 v4, p2

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    move-object/from16 v5, p3

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ThreadInfo;->getParentMessageId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getRead()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/ChannelUserRead;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/16 v11, 0x78

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v12}, Lio/getstream/chat/android/models/ChannelUserRead;->copy$default(Lio/getstream/chat/android/models/ChannelUserRead;Lio/getstream/chat/android/models/User;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v3

    :cond_1
    invoke-interface {v13, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Lio/getstream/chat/android/models/ThreadInfo;->getActiveParticipantCount()I

    move-result v0

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ThreadInfo;->getDeletedAt()Ljava/util/Date;

    move-result-object v14

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ThreadInfo;->getLastMessageAt()Ljava/util/Date;

    move-result-object v3

    if-nez v3, :cond_3

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getLastMessageAt()Ljava/util/Date;

    move-result-object v3

    :cond_3
    move-object v11, v3

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ThreadInfo;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    if-nez v3, :cond_4

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    :cond_4
    move-object v6, v3

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ThreadInfo;->getParticipantCount()I

    move-result v9

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ThreadInfo;->getTitle()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ThreadInfo;->getUpdatedAt()Ljava/util/Date;

    move-result-object v2

    const v20, 0x3456e

    const/16 v21, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v13

    move-object v13, v2

    move v2, v0

    invoke-static/range {v1 .. v21}, Lio/getstream/chat/android/models/Thread;->copy$default(Lio/getstream/chat/android/models/Thread;ILjava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/models/User;ILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Thread;

    move-result-object v0

    return-object v0
.end method

.method public static final markAsUnreadByUser(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/User;Ljava/util/Date;)Lio/getstream/chat/android/models/Thread;
    .locals 22
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    move-object/from16 v3, p1

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    move-object/from16 v4, p2

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getRead()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelUserRead;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelUserRead;->getUnreadMessages()I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    const/16 v10, 0x78

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v11}, Lio/getstream/chat/android/models/ChannelUserRead;->copy$default(Lio/getstream/chat/android/models/ChannelUserRead;Lio/getstream/chat/android/models/User;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v2

    :cond_0
    invoke-interface {v12, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    goto :goto_0

    :cond_1
    const v20, 0x37fff

    const/16 v21, 0x0

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

    move-object/from16 v17, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v1 .. v21}, Lio/getstream/chat/android/models/Thread;->copy$default(Lio/getstream/chat/android/models/Thread;ILjava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/models/User;ILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Thread;

    move-result-object v0

    return-object v0
.end method

.method public static final sortedByLastReply(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ThreadParticipant;",
            ">;)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ThreadParticipant;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    sget-object v0, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->PARTICIPANT_BY_LAST_REPLY:Ljava/util/Comparator;

    invoke-static {p0, v0}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final updateParent(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Thread;
    .locals 54
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "<this>"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    :cond_1
    move-object/from16 v45, v0

    const v52, 0xfbff

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

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, -0x1

    invoke-static/range {v2 .. v53}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getDeletedAt()Ljava/util/Date;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getUpdatedAt()Ljava/util/Date;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getUpdatedAt()Ljava/util/Date;

    move-result-object v0

    :cond_2
    move-object v13, v0

    const v20, 0x3e7ef

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v1 .. v21}, Lio/getstream/chat/android/models/Thread;->copy$default(Lio/getstream/chat/android/models/Thread;ILjava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/models/User;ILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Thread;

    move-result-object v0

    return-object v0
.end method

.method public static final updateParentOrReply(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Thread;
    .locals 2
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->updateParent(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Thread;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->upsertReply(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Thread;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method private static final updateReadCounts(Ljava/util/List;Lio/getstream/chat/android/models/Message;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;"
        }
    .end annotation

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelUserRead;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelUserRead;->getUnreadMessages()I

    move-result v1

    add-int/lit8 v5, v1, 0x1

    const/16 v10, 0x7b

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v11}, Lio/getstream/chat/android/models/ChannelUserRead;->copy$default(Lio/getstream/chat/android/models/ChannelUserRead;Lio/getstream/chat/android/models/User;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v2

    :cond_0
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static final upsertMessageInList(Lio/getstream/chat/android/models/Message;Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v1, p0

    :cond_2
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object p1

    :cond_4
    :goto_1
    check-cast p1, Ljava/util/Collection;

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p1, p0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static final upsertReply(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Thread;
    .locals 22
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "reply"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getLatestReplies()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v2}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->upsertMessageInList(Lio/getstream/chat/android/models/Message;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getLatestReplies()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-le v3, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    new-instance v4, Lio/getstream/chat/android/client/extensions/internal/ThreadKt$upsertReply$$inlined$sortedBy$1;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-static {v2, v4}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Message;

    if-eqz v2, :cond_2

    invoke-static {v2}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrNull(Lio/getstream/chat/android/models/Message;)Ljava/util/Date;

    move-result-object v2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-eqz v3, :cond_3

    new-instance v4, Lio/getstream/chat/android/models/ThreadParticipant;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-static {v0}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrNull(Lio/getstream/chat/android/models/Message;)Ljava/util/Date;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lio/getstream/chat/android/models/ThreadParticipant;-><init>(Lio/getstream/chat/android/models/User;Ljava/util/Date;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getThreadParticipants()Ljava/util/List;

    move-result-object v5

    invoke-static {v4, v5}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->upsertThreadParticipantInList(Lio/getstream/chat/android/models/ThreadParticipant;Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    :goto_2
    move-object v10, v4

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getThreadParticipants()Ljava/util/List;

    move-result-object v4

    goto :goto_2

    :goto_3
    if-eqz v3, :cond_4

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v4

    :goto_4
    move v9, v4

    goto :goto_5

    :cond_4
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getParticipantCount()I

    move-result v4

    goto :goto_4

    :goto_5
    if-eqz v3, :cond_5

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getRead()Ljava/util/List;

    move-result-object v3

    invoke-static {v3, v0}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->updateReadCounts(Ljava/util/List;Lio/getstream/chat/android/models/Message;)Ljava/util/List;

    move-result-object v0

    :goto_6
    move-object/from16 v17, v0

    goto :goto_7

    :cond_5
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getRead()Ljava/util/List;

    move-result-object v0

    goto :goto_6

    :goto_7
    if-nez v2, :cond_6

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getLastMessageAt()Ljava/util/Date;

    move-result-object v0

    move-object v11, v0

    goto :goto_8

    :cond_6
    move-object v11, v2

    :goto_8
    if-nez v2, :cond_7

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getUpdatedAt()Ljava/util/Date;

    move-result-object v2

    :cond_7
    move-object v13, v2

    const v20, 0x3347f

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v1 .. v21}, Lio/getstream/chat/android/models/Thread;->copy$default(Lio/getstream/chat/android/models/Thread;ILjava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/models/User;ILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Thread;

    move-result-object v0

    return-object v0
.end method

.method private static final upsertThreadParticipantInList(Lio/getstream/chat/android/models/ThreadParticipant;Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/ThreadParticipant;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ThreadParticipant;",
            ">;)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ThreadParticipant;",
            ">;"
        }
    .end annotation

    new-instance v2, Lg1/u4;

    const/4 v0, 0x5

    invoke-direct {v2, v0}, Lg1/u4;-><init>(I)V

    sget-object v3, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->PARTICIPANT_BY_LAST_REPLY:Ljava/util/Comparator;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Lio/getstream/chat/android/client/internal/state/utils/internal/ListKt;->upsertSorted$default(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final upsertThreadParticipantInList$lambda$6(Lio/getstream/chat/android/models/ThreadParticipant;)Ljava/lang/String;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ThreadParticipant;->getUserId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
