.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$4;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "io/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$4",
        "Landroidx/room/k;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;",
        "",
        "createQuery",
        "()Ljava/lang/String;",
        "Ltb/c;",
        "statement",
        "entity",
        "Ll83/a0;",
        "bind",
        "(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;)V",
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
.field final synthetic this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$4;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bind(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;)V
    .locals 4

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x3

    .line 4
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    .line 5
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getParentId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_0

    .line 6
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 8
    :goto_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$4;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__listConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getMentionedUsersIds()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->fromStringList(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_1

    .line 9
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    .line 10
    :cond_1
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 11
    :goto_1
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getSilent()Z

    move-result v0

    const/4 v1, 0x6

    int-to-long v2, v0

    .line 12
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 13
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getShowInChannel()Z

    move-result v0

    const/4 v1, 0x7

    int-to-long v2, v0

    .line 14
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 15
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getReplyMessageId()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_2

    .line 16
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    .line 17
    :cond_2
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 18
    :goto_2
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getCommand()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_3

    .line 19
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    .line 20
    :cond_3
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 21
    :goto_3
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getArgs()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_4

    .line 22
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_4

    .line 23
    :cond_4
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 24
    :goto_4
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$4;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->access$get__extraDataConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getExtraData()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {v0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->mapToString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p2

    const/16 v0, 0xb

    if-nez p2, :cond_5

    .line 25
    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    return-void

    .line 26
    :cond_5
    invoke-interface {p1, v0, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$4;->bind(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;)V

    return-void
.end method

.method public final createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `stream_chat_draft_message_entity` (`id`,`cid`,`text`,`parentId`,`mentionedUsersIds`,`silent`,`showInChannel`,`replyMessageId`,`command`,`args`,`extraData`) VALUES (?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
