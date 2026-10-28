.class public final Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\'B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0004\u0008\u0018\u0010\u0014J\u001e\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0019\u001a\u00020\u0002H\u0087@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u001cR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u001dR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u001fR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%\u00a8\u0006("
    }
    d2 = {
        "Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;",
        "",
        "",
        "channelType",
        "channelId",
        "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;",
        "channelStateLogic",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "messageRepository",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "Lio/getstream/chat/android/client/attachment/AttachmentUploader;",
        "attachmentUploader",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/attachment/AttachmentUploader;)V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "Ln23/h;",
        "Ll83/a0;",
        "sendAttachments",
        "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "uploadAttachments",
        "updateMessages",
        "messageId",
        "uploadAttachmentsForMessage",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lio/getstream/chat/android/client/attachment/AttachmentUploader;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "ProgressCallbackImpl",
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
.field private final attachmentUploader:Lio/getstream/chat/android/client/attachment/AttachmentUploader;

.field private final channelId:Ljava/lang/String;

.field private final channelStateLogic:Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

.field private final channelType:Ljava/lang/String;

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final logger$delegate:Ll83/h;

.field private final messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/attachment/AttachmentUploader;)V
    .locals 1

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachmentUploader"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->channelType:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->channelId:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->channelStateLogic:Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->attachmentUploader:Lio/getstream/chat/android/client/attachment/AttachmentUploader;

    .line 8
    const-string p1, "Chat:UploadWorker"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->logger$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/attachment/AttachmentUploader;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 9
    new-instance p6, Lio/getstream/chat/android/client/attachment/AttachmentUploader;

    invoke-direct {p6, p5}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;-><init>(Lio/getstream/chat/android/client/ChatClient;)V

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 10
    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/attachment/AttachmentUploader;)V

    return-void
.end method

.method public static final synthetic access$getAttachmentUploader$p(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;)Lio/getstream/chat/android/client/attachment/AttachmentUploader;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->attachmentUploader:Lio/getstream/chat/android/client/attachment/AttachmentUploader;

    return-object p0
.end method

.method public static final synthetic access$getChannelId$p(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->channelId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getChannelStateLogic$p(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;)Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->channelStateLogic:Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

    return-object p0
.end method

.method public static final synthetic access$getChannelType$p(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->channelType:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$sendAttachments(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->sendAttachments(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateMessages(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->updateMessages(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$uploadAttachments(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->uploadAttachments(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final sendAttachments(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 60
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;

    iget v3, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;-><init>(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->label:I

    const/4 v5, 0x0

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v4, :cond_4

    if-eq v4, v9, :cond_3

    if-eq v4, v8, :cond_2

    if-ne v4, v7, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v2, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->I$0:I

    iget-object v8, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/models/Message;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    iget-object v4, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    if-nez v1, :cond_8

    invoke-direct {v0}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v4, v1, Lb23/k;->c:Lb23/e;

    iget-object v10, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v4, "[sendAttachments] #uploader; current user is not set. Restoring credentials"

    invoke-interface {v1, v11, v10, v4, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iget-object v1, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/ChatClient;->containsStoredCredentials()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-direct {v0}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->F:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[sendAttachments] #uploader; user\'s credentials are not available"

    invoke-interface {v1, v4, v3, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    new-instance v1, Ln23/f;

    new-instance v2, Ln23/a;

    const-string v3, "Could not set user"

    invoke-direct {v2, v3}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ln23/f;-><init>(Ln23/e;)V

    return-object v1

    :cond_7
    iget-object v1, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    move-object/from16 v4, p1

    iput-object v4, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->L$0:Ljava/lang/Object;

    iput v9, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->label:I

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/ChatClient;->setUserWithoutConnectingIfNeeded$stream_chat_android_client_release(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    goto/16 :goto_4

    :cond_8
    move-object/from16 v4, p1

    :cond_9
    :goto_1
    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v10, v1, Ljava/util/Collection;

    const/4 v11, 0x0

    if-eqz v10, :cond_b

    move-object v10, v1

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_b

    :cond_a
    move v9, v11

    goto :goto_2

    :cond_b
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v12

    instance-of v12, v12, Lio/getstream/chat/android/models/Attachment$UploadState$InProgress;

    if-nez v12, :cond_d

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v10

    instance-of v10, v10, Lio/getstream/chat/android/models/Attachment$UploadState$Idle;

    if-eqz v10, :cond_c

    :cond_d
    :goto_2
    if-nez v9, :cond_f

    invoke-direct {v0}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v7, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_e

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v8, "[sendAttachments] #uploader; message "

    const-string v9, " doesn\'t have pending attachments"

    invoke-static {v8, v2, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v7, v3, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_e
    sget-object v1, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->INSTANCE:Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;

    invoke-virtual {v1, v4}, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->updateMessageAttachments(Lio/getstream/chat/android/models/Message;)V

    new-instance v1, Ln23/g;

    invoke-direct {v1, v6}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v1

    :cond_f
    iput-object v4, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->L$0:Ljava/lang/Object;

    iput v9, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->I$0:I

    iput v8, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->label:I

    invoke-direct {v0, v4, v2}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->uploadAttachments(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_10

    goto :goto_4

    :cond_10
    move-object v8, v4

    move v4, v9

    :goto_3
    move-object v15, v1

    check-cast v15, Ljava/util/List;

    const v58, 0xffff

    const/16 v59, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

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

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, -0x41

    invoke-static/range {v8 .. v59}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    iput-object v8, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->L$0:Ljava/lang/Object;

    iput-object v15, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->L$1:Ljava/lang/Object;

    iput v4, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->I$0:I

    iput v7, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$sendAttachments$1;->label:I

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->updateMessages(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_11

    :goto_4
    return-object v3

    :cond_11
    move-object v2, v8

    move-object v3, v15

    :goto_5
    check-cast v3, Ljava/lang/Iterable;

    instance-of v1, v3, Ljava/util/Collection;

    if-eqz v1, :cond_12

    move-object v1, v3

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_6

    :cond_12
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v3

    sget-object v4, Lio/getstream/chat/android/models/Attachment$UploadState$Success;->INSTANCE:Lio/getstream/chat/android/models/Attachment$UploadState$Success;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    invoke-direct {v0}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v6, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_14

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    const-string v7, "[sendAttachments] #uploader; unable to upload attachments for message "

    invoke-static {v7, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v6, v4, v3, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_14
    new-instance v1, Ln23/f;

    new-instance v3, Ln23/a;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v4, "Unable to upload attachments for message "

    invoke-static {v4, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v3}, Ln23/f;-><init>(Ln23/e;)V

    return-object v1

    :cond_15
    :goto_6
    invoke-direct {v0}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v7, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_16

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "[sendAttachments] #uploader; all attachments for message "

    const-string v8, " uploaded"

    invoke-static {v3, v2, v8}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v7, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_16
    new-instance v1, Ln23/g;

    invoke-direct {v1, v6}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v1
.end method

.method private final updateMessages(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 60
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$updateMessages$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$updateMessages$1;

    iget v3, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$updateMessages$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$updateMessages$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$updateMessages$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$updateMessages$1;-><init>(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$updateMessages$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$updateMessages$1;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$updateMessages$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v2, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$updateMessages$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    instance-of v6, v4, Ljava/util/Collection;

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    move-object v6, v4

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v6

    instance-of v6, v6, Lio/getstream/chat/android/models/Attachment$UploadState$Failed;

    if-eqz v6, :cond_4

    move-object v1, v7

    :cond_5
    :goto_1
    if-nez v1, :cond_6

    sget-object v1, Lio/getstream/chat/android/models/SyncStatus;->FAILED_PERMANENTLY:Lio/getstream/chat/android/models/SyncStatus;

    :cond_6
    move-object/from16 v23, v1

    const v58, 0xffff

    const/16 v59, 0x0

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

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, -0x4001

    move-object/from16 v8, p1

    invoke-static/range {v8 .. v59}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    iget-object v4, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->channelStateLogic:Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

    if-eqz v4, :cond_7

    invoke-interface {v4, v1}, Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_7
    iget-object v4, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object v7, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$updateMessages$1;->L$0:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$updateMessages$1;->L$1:Ljava/lang/Object;

    iput v5, v2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$updateMessages$1;->label:I

    invoke-interface {v4, v1, v2}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_8

    return-object v3

    :cond_8
    move-object v3, v1

    :goto_2
    sget-object v1, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->INSTANCE:Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;

    invoke-virtual {v1, v3}, Lio/getstream/chat/android/client/attachment/AttachmentsUploadStates;->updateMessageAttachments(Lio/getstream/chat/android/models/Message;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method private final uploadAttachments(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    instance-of v3, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$1;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$1;

    iget v4, v3, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$1;

    invoke-direct {v3, v1, v0}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$1;-><init>(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;Lq83/d;)V

    :goto_0
    iget-object v0, v3, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$1;->label:I

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v7, :cond_1

    iget-object v2, v3, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Message;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;

    invoke-direct {v0, v2, v1, v6}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;Lq83/d;)V

    iput-object v2, v3, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$1;->L$0:Ljava/lang/Object;

    iput v7, v3, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$1;->label:I

    invoke-static {v0, v3}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_3

    return-object v4

    :cond_3
    :goto_1
    check-cast v0, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :goto_2
    invoke-direct {v1}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->F:Lb23/g;

    invoke-interface {v4, v7, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    const-string v8, "[uploadAttachments] #uploader; unable to upload attachments: "

    invoke-static {v8, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v7, v5, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v4

    sget-object v5, Lio/getstream/chat/android/models/Attachment$UploadState$Success;->INSTANCE:Lio/getstream/chat/android/models/Attachment$UploadState$Success;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_4

    :cond_5
    move-object v4, v6

    :goto_4
    if-nez v4, :cond_6

    new-instance v4, Lio/getstream/chat/android/models/Attachment$UploadState$Failed;

    new-instance v5, Ln23/d;

    const-string v8, "Could not upload attachments."

    invoke-direct {v5, v8, v0}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v4, v5}, Lio/getstream/chat/android/models/Attachment$UploadState$Failed;-><init>(Ln23/e;)V

    :cond_6
    move-object/from16 v26, v4

    const v28, 0xbffff

    const/16 v29, 0x0

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

    const/16 v27, 0x0

    invoke-static/range {v7 .. v29}, Lio/getstream/chat/android/models/Attachment;->copy$default(Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Attachment;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    return-object v3
.end method


# virtual methods
.method public final uploadAttachmentsForMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "The message with id "

    instance-of v1, p2, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;

    iget v2, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;

    invoke-direct {v1, p0, p2}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;-><init>(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;Lq83/d;)V

    :goto_0
    iget-object p2, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->result:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->label:I

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v3, :cond_4

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_2

    if-ne v3, v5, :cond_1

    iget-object p1, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object p1, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Exception;

    iget-object v0, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    iget-object v0, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object p1, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object v3, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->L$0:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception p2

    move-object v0, p2

    move-object p2, p1

    move-object p1, v0

    move-object v0, v3

    goto/16 :goto_7

    :cond_3
    iget-object p1, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->channelStateLogic:Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

    if-eqz p2, :cond_6

    invoke-interface {p2}, Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;->channelState()Lio/getstream/chat/android/client/channel/state/ChannelState;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-interface {p2, p1}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p2

    if-nez p2, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    move-object v11, p2

    move-object p2, p1

    move-object p1, v11

    goto :goto_4

    :cond_6
    :goto_2
    iget-object p2, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->messageRepository:Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    iput-object p1, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->L$0:Ljava/lang/Object;

    iput v7, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->label:I

    invoke-interface {p2, p1, v1}, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_7

    goto/16 :goto_8

    :cond_7
    :goto_3
    check-cast p2, Lio/getstream/chat/android/models/Message;

    goto :goto_1

    :goto_4
    if-eqz p1, :cond_a

    :try_start_1
    iput-object p2, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->L$0:Ljava/lang/Object;

    iput-object p1, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->L$1:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->L$2:Ljava/lang/Object;

    iput v4, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->I$0:I

    iput v6, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->label:I

    invoke-direct {p0, p1, v1}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->sendAttachments(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-ne v3, v2, :cond_8

    goto :goto_8

    :cond_8
    move-object v11, v3

    move-object v3, p2

    move-object p2, v11

    :goto_5
    :try_start_2
    check-cast p2, Ln23/h;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-nez p2, :cond_9

    move-object p2, v3

    goto :goto_6

    :cond_9
    return-object p2

    :catch_1
    move-exception v0

    move-object v11, p2

    move-object p2, p1

    move-object p1, v0

    move-object v0, v11

    goto :goto_7

    :cond_a
    :goto_6
    :try_start_3
    new-instance v3, Ln23/f;

    new-instance v6, Ln23/a;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " could not be found."

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v6}, Ln23/f;-><init>(Ln23/e;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    return-object v3

    :goto_7
    invoke-direct {p0}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v6, v3, Lb23/k;->c:Lb23/e;

    iget-object v7, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->F:Lb23/g;

    invoke-interface {v6, v9, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_b

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    const-string v10, "[uploadAttachmentsForMessage] #uploader; couldn\'t upload attachments "

    invoke-static {v10, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v9, v7, v6, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    if-eqz p2, :cond_c

    iput-object v0, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->L$0:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->L$1:Ljava/lang/Object;

    iput-object p1, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->L$2:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->L$3:Ljava/lang/Object;

    iput v4, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->I$0:I

    iput v5, v1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachmentsForMessage$1;->label:I

    invoke-direct {p0, p2, v1}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->updateMessages(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_c

    :goto_8
    return-object v2

    :cond_c
    :goto_9
    new-instance p2, Ln23/f;

    new-instance v1, Ln23/d;

    const-string v2, "Could not upload attachments for message "

    invoke-static {v2, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p2, v1}, Ln23/f;-><init>(Ln23/e;)V

    return-object p2
.end method
