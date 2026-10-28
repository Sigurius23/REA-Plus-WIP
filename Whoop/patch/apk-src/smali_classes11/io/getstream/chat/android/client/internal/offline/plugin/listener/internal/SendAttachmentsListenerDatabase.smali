.class public final Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "messageRepository",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "channelRepository",
        "<init>",
        "(Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;)V",
        "",
        "channelType",
        "channelId",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "Ll83/a0;",
        "onAttachmentSendRequest",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
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
.field private final channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

.field private final messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;)V
    .locals 1

    const-string v0, "messageRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    return-void
.end method


# virtual methods
.method public final onAttachmentSendRequest(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;

    if-eqz p1, :cond_0

    move-object p1, p4

    check-cast p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;

    iget p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->label:I

    const/high16 v0, -0x80000000

    and-int v1, p2, v0

    if-eqz v1, :cond_0

    sub-int/2addr p2, v0

    iput p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->label:I

    goto :goto_0

    :cond_0
    new-instance p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;

    invoke-direct {p1, p0, p4}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object p2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->result:Ljava/lang/Object;

    sget-object p4, Lr83/a;->w:Lr83/a;

    iget v0, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->label:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_2

    if-ne v0, v1, :cond_1

    iget-object p3, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->L$2:Ljava/lang/Object;

    check-cast p3, Lio/getstream/chat/android/models/Message;

    iget-object p3, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->L$1:Ljava/lang/Object;

    check-cast p3, Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p3, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->L$2:Ljava/lang/Object;

    check-cast p3, Lio/getstream/chat/android/models/Message;

    iget-object v0, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v3, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->L$0:Ljava/lang/Object;

    iput-object v3, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->L$1:Ljava/lang/Object;

    iput-object p3, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->L$2:Ljava/lang/Object;

    iput v2, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->label:I

    invoke-interface {p2, p3, p1}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, p4, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v0

    iput-object v3, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->L$0:Ljava/lang/Object;

    iput-object v3, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->L$1:Ljava/lang/Object;

    iput-object v3, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->L$2:Ljava/lang/Object;

    iput v1, p1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase$onAttachmentSendRequest$1;->label:I

    invoke-interface {p2, v0, p3, p1}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->updateLastMessageForChannel(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p4, :cond_5

    :goto_2
    return-object p4

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
