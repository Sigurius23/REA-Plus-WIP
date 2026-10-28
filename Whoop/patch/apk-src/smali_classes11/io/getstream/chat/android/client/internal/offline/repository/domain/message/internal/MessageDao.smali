.class public interface abstract Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008a\u0018\u0000 T2\u00020\u0001:\u0001TJ\u001e\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0097@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0002H\u0017\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u000c\u001a\u00020\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0002H\'\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H\u0097@\u00a2\u0006\u0004\u0008\u0006\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J$\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00022\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\'\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0097@\u00a2\u0006\u0004\u0008\u0018\u0010\u0013J\u001e\u0010\u0019\u001a\u00020\u00052\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0002H\u0097@\u00a2\u0006\u0004\u0008\u0019\u0010\u0007J\u001e\u0010\u001c\u001a\u00020\u00052\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u001c\u0010\u0007J\u001e\u0010\u001f\u001a\u00020\u00052\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u001f\u0010\u0007J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u00a7@\u00a2\u0006\u0004\u0008\"\u0010#J\u0016\u0010$\u001a\u0008\u0012\u0004\u0012\u00020 0\u0002H\u00a7@\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010\'\u001a\u0004\u0018\u00010 2\u0006\u0010&\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010*\u001a\u0004\u0018\u00010 2\u0006\u0010)\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008*\u0010(J\u0018\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008,\u0010(J0\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010&\u001a\u00020\u00082\u0008\u0008\u0002\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u00a7@\u00a2\u0006\u0004\u00081\u00102J0\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010&\u001a\u00020\u00082\u0008\u0008\u0002\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u00a7@\u00a2\u0006\u0004\u00083\u00102J0\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010&\u001a\u00020\u00082\u0008\u0008\u0002\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u00a7@\u00a2\u0006\u0004\u00084\u00102J0\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010&\u001a\u00020\u00082\u0008\u0008\u0002\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u00a7@\u00a2\u0006\u0004\u00085\u00102J(\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010&\u001a\u00020\u00082\u0008\u0008\u0002\u0010.\u001a\u00020-H\u00a7@\u00a2\u0006\u0004\u00086\u00107J(\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010+\u001a\u00020\u00082\u0008\u0008\u0002\u0010.\u001a\u00020-H\u00a7@\u00a2\u0006\u0004\u00088\u00107J \u0010:\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00082\u0006\u00109\u001a\u00020/H\u00a7@\u00a2\u0006\u0004\u0008:\u0010;J \u0010<\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00082\u0006\u0010+\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008<\u0010=J\u0018\u0010>\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008>\u0010(J\u001e\u0010>\u001a\u00020\u00052\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0002H\u00a7@\u00a2\u0006\u0004\u0008>\u0010\u0007J$\u0010@\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0002H\u0097@\u00a2\u0006\u0004\u0008@\u0010\u0007J$\u0010A\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0002H\u00a7@\u00a2\u0006\u0004\u0008A\u0010\u0007J\u001a\u0010@\u001a\u0004\u0018\u00010\u00032\u0006\u0010B\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008@\u0010(J\u0016\u0010C\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0097@\u00a2\u0006\u0004\u0008C\u0010%J(\u0010F\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010E\u001a\u00020D2\u0008\u0008\u0002\u0010.\u001a\u00020-H\u00a7@\u00a2\u0006\u0004\u0008F\u0010GJ\u001e\u0010I\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010H\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008I\u0010(J&\u0010J\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010&\u001a\u00020\u00082\u0006\u0010H\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008J\u0010=J(\u0010K\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00022\u0006\u0010E\u001a\u00020D2\u0008\u0008\u0002\u0010.\u001a\u00020-H\u00a7@\u00a2\u0006\u0004\u0008K\u0010GJ\u001e\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010L\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008M\u0010(J\u0010\u0010N\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008N\u0010%J:\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010&\u001a\u00020\u00082\u000c\u0010O\u001a\u0008\u0012\u0004\u0012\u00020-0\u00022\u000c\u0010P\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0002H\u00a7@\u00a2\u0006\u0004\u0008Q\u0010RJ\u0010\u0010S\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008S\u0010%\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006U\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;",
        "",
        "",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
        "messageEntities",
        "Ll83/a0;",
        "insert",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "",
        "messageIds",
        "deleteAttachments",
        "(Ljava/util/List;)V",
        "deleteAttachmentsChunked",
        "messageEntity",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;",
        "messageInnerEntity",
        "",
        "insertMessageInnerEntity",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Lq83/d;)Ljava/lang/Object;",
        "messageInnerEntities",
        "insertMessageInnerEntities",
        "updateMessageInnerEntity",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;)V",
        "upsertMessageInnerEntity",
        "upsertMessageInnerEntities",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;",
        "attachmentEntities",
        "insertAttachments",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
        "reactions",
        "insertReactions",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;",
        "draftMessage",
        "insertDraftMessages",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;Lq83/d;)Ljava/lang/Object;",
        "selectDraftMessages",
        "(Lq83/d;)Ljava/lang/Object;",
        "cid",
        "selectDraftMessageByCid",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "parentId",
        "selectDraftMessageByParentId",
        "messageId",
        "deleteDraftMessage",
        "",
        "limit",
        "Ljava/util/Date;",
        "dateFilter",
        "messagesForChannelNewerThan",
        "(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;",
        "messagesForChannelEqualOrNewerThan",
        "messagesForChannelOlderThan",
        "messagesForChannelEqualOrOlderThan",
        "messagesForChannel",
        "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "messagesForThread",
        "deleteMessagesBefore",
        "deleteChannelMessagesBefore",
        "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;",
        "deleteMessage",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "deleteMessages",
        "ids",
        "select",
        "selectChunked",
        "id",
        "selectWaitForAttachments",
        "Lio/getstream/chat/android/models/SyncStatus;",
        "syncStatus",
        "selectBySyncStatus",
        "(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;",
        "userId",
        "selectByUserId",
        "selectByCidAndUserId",
        "selectIdsBySyncStatus",
        "pollId",
        "selectMessagesWithPoll",
        "deleteAll",
        "syncStatuses",
        "types",
        "selectBySyncStatusOrTypeForChannel",
        "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "deleteAllDrafts",
        "Companion",
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


# static fields
.field public static final synthetic Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$Companion;->$$INSTANCE:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$Companion;

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$Companion;

    return-void
.end method

.method public static insert$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 31
    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->insert(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static insert$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    .line 1
    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->label:I

    const/16 v3, 0xa

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->L$1:Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    iget-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->L$1:Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    iget-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->L$1:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Ljava/util/List;

    iget-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    .line 2
    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    .line 3
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 5
    check-cast v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    .line 6
    invoke-virtual {v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;->getMessageInnerEntity()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    move-result-object v7

    .line 7
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 8
    :cond_5
    iput-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->L$1:Ljava/lang/Object;

    iput v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->label:I

    invoke-interface {p0, v2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->upsertMessageInnerEntities(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto/16 :goto_7

    .line 9
    :cond_6
    :goto_2
    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    .line 10
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 12
    check-cast v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    .line 13
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;->getMessageInnerEntity()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getId()Ljava/lang/String;

    move-result-object v6

    .line 14
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 15
    :cond_7
    invoke-interface {p0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->deleteAttachments(Ljava/util/List;)V

    .line 16
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 17
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 18
    check-cast v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    .line 19
    invoke-virtual {v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;->getAttachments()Ljava/util/List;

    move-result-object v3

    .line 20
    check-cast v3, Ljava/lang/Iterable;

    .line 21
    invoke-static {v2, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_4

    .line 22
    :cond_8
    iput-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->L$1:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->label:I

    invoke-interface {p0, v2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->insertAttachments(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    goto :goto_7

    :cond_9
    move-object v8, p1

    move-object p1, p0

    move-object p0, v8

    .line 23
    :goto_5
    check-cast p0, Ljava/lang/Iterable;

    .line 24
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 25
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 26
    check-cast v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    .line 27
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;->getLatestReactions()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;->getOwnReactions()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v3, v2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    .line 28
    invoke-static {p2, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_6

    :cond_a
    const/4 p0, 0x0

    .line 29
    iput-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->L$0:Ljava/lang/Object;

    iput-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$insert$1;->label:I

    invoke-interface {p1, p2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->insertReactions(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_b

    :goto_7
    return-object v1

    .line 30
    :cond_b
    :goto_8
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic messagesForChannel$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Ljava/lang/String;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/16 p2, 0x64

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->messagesForChannel(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: messagesForChannel"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic messagesForChannelEqualOrNewerThan$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Ljava/lang/String;ILjava/util/Date;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/16 p2, 0x64

    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->messagesForChannelEqualOrNewerThan(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: messagesForChannelEqualOrNewerThan"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic messagesForChannelEqualOrOlderThan$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Ljava/lang/String;ILjava/util/Date;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/16 p2, 0x64

    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->messagesForChannelEqualOrOlderThan(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: messagesForChannelEqualOrOlderThan"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic messagesForChannelNewerThan$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Ljava/lang/String;ILjava/util/Date;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/16 p2, 0x64

    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->messagesForChannelNewerThan(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: messagesForChannelNewerThan"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic messagesForChannelOlderThan$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Ljava/lang/String;ILjava/util/Date;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/16 p2, 0x64

    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->messagesForChannelOlderThan(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: messagesForChannelOlderThan"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic messagesForThread$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Ljava/lang/String;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/16 p2, 0x64

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->messagesForThread(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: messagesForThread"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static select$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->I$1:I

    iget p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->I$0:I

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->L$7:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->L$5:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->L$4:Ljava/lang/Object;

    check-cast v5, Ljava/util/Collection;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->L$3:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move v8, p1

    move p1, p0

    move-object p0, v6

    move-object v6, v5

    move-object v5, v2

    move-object v2, v0

    move v0, v8

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Iterable;

    const/16 p2, 0x3e7

    invoke-static {p1, p2}, Lm83/s;->v0(Ljava/lang/Iterable;I)Ljava/util/ArrayList;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v2, p1

    move-object v5, p2

    move p1, v4

    move p2, p1

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    iput-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->L$0:Ljava/lang/Object;

    const/4 v7, 0x0

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->L$3:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->L$4:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->L$5:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->L$6:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->L$7:Ljava/lang/Object;

    iput p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->I$0:I

    iput p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->I$1:I

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->I$2:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$select$1;->label:I

    invoke-interface {p0, v6, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->selectChunked(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_3

    return-object v1

    :cond_3
    move-object v8, v0

    move v0, p2

    move-object p2, v6

    move-object v6, v5

    move-object v5, v2

    move-object v2, v8

    :goto_2
    check-cast p2, Ljava/lang/Iterable;

    invoke-static {v6, p2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    move p2, v0

    move-object v0, v2

    move-object v2, v5

    move-object v5, v6

    goto :goto_1

    :cond_4
    check-cast v5, Ljava/util/List;

    return-object v5
.end method

.method public static synthetic selectBySyncStatus$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lio/getstream/chat/android/models/SyncStatus;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, -0x1

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->selectBySyncStatus(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: selectBySyncStatus"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic selectIdsBySyncStatus$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lio/getstream/chat/android/models/SyncStatus;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, -0x1

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->selectIdsBySyncStatus(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: selectIdsBySyncStatus"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic selectWaitForAttachments$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v1, Lio/getstream/chat/android/models/SyncStatus;->AWAITING_ATTACHMENTS:Lio/getstream/chat/android/models/SyncStatus;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->selectBySyncStatus$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lio/getstream/chat/android/models/SyncStatus;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static upsertMessageInnerEntities$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntities$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntities$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntities$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntities$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntities$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntities$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntities$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntities$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntities$1;->L$1:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Ljava/util/List;

    iget-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntities$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntities$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntities$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntities$1;->label:I

    invoke-interface {p0, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->insertMessageInnerEntities(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v1, 0x0

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    const/4 v4, 0x0

    if-ltz v1, :cond_6

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v2, v5, v7

    if-nez v2, :cond_4

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    move v1, v3

    goto :goto_2

    :cond_6
    invoke-static {}, Lwb3/f;->d0()V

    throw v4

    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    invoke-interface {p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->updateMessageInnerEntity(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;)V

    goto :goto_3

    :cond_8
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static upsertMessageInnerEntity$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntity$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntity$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntity$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntity$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntity$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntity$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntity$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntity$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntity$1;->L$1:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    iget-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntity$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntity$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntity$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$upsertMessageInnerEntity$1;->label:I

    invoke-interface {p0, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->insertMessageInnerEntity(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p2, v0, v2

    if-nez p2, :cond_4

    invoke-interface {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->updateMessageInnerEntity(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;)V

    :cond_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public abstract deleteAll(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract deleteAllDrafts(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public deleteAttachments(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "messageIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    const/16 v0, 0x3e7

    invoke-static {p1, v0}, Lm83/s;->v0(Ljava/lang/Iterable;I)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {p0, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->deleteAttachmentsChunked(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract deleteAttachmentsChunked(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract deleteChannelMessagesBefore(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract deleteDraftMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract deleteMessage(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract deleteMessages(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract deleteMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public insert(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->insert$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public insert(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->insert$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract insertAttachments(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insertDraftMessages(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insertMessageInnerEntities(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insertMessageInnerEntity(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insertReactions(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract messagesForChannel(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract messagesForChannelEqualOrNewerThan(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract messagesForChannelEqualOrOlderThan(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract messagesForChannelNewerThan(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract messagesForChannelOlderThan(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract messagesForThread(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract select(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public select(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->select$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract selectByCidAndUserId(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectBySyncStatus(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectBySyncStatusOrTypeForChannel(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectByUserId(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectChunked(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectDraftMessageByCid(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectDraftMessageByParentId(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectDraftMessages(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectIdsBySyncStatus(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectMessagesWithPoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public selectWaitForAttachments(Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->selectWaitForAttachments$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract updateMessageInnerEntity(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;)V
.end method

.method public upsertMessageInnerEntities(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->upsertMessageInnerEntities$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public upsertMessageInnerEntity(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->upsertMessageInnerEntity$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
