.class final Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lio/getstream/chat/android/models/Attachment;",
        "<anonymous>",
        "(Lbc3/c0;)Lio/getstream/chat/android/models/Attachment;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.attachment.worker.UploadAttachmentsWorker$uploadAttachments$2$1$1"
    f = "UploadAttachmentsWorker.kt"
    l = {
        0x81
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $attachment:Lio/getstream/chat/android/models/Attachment;

.field final synthetic $message:Lio/getstream/chat/android/models/Message;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;Lio/getstream/chat/android/models/Message;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Attachment;",
            "Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    iput-object p2, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->this$0:Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;

    iput-object p3, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->$message:Lio/getstream/chat/android/models/Message;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$2(Lio/getstream/chat/android/models/Attachment;Ln23/e;)Lio/getstream/chat/android/models/Attachment;
    .locals 24

    new-instance v0, Lio/getstream/chat/android/models/Attachment$UploadState$Failed;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/models/Attachment$UploadState$Failed;-><init>(Ln23/e;)V

    const v22, 0xbffff

    const/16 v23, 0x0

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

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v1, p0

    move-object/from16 v20, v0

    invoke-static/range {v1 .. v23}, Lio/getstream/chat/android/models/Attachment;->copy$default(Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Attachment;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;

    iget-object v0, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    iget-object v1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->this$0:Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;

    iget-object v2, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->$message:Lio/getstream/chat/android/models/Message;

    invoke-direct {p1, v0, v1, v2, p2}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;-><init>(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;Lio/getstream/chat/android/models/Message;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object p1

    sget-object v1, Lio/getstream/chat/android/models/Attachment$UploadState$Success;->INSTANCE:Lio/getstream/chat/android/models/Attachment$UploadState$Success;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x0

    const-string v3, " for message "

    if-nez p1, :cond_7

    iget-object p1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->this$0:Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;

    invoke-static {p1}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->access$getLogger(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;)Lb23/k;

    move-result-object p1

    iget-object v4, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    iget-object v5, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->$message:Lio/getstream/chat/android/models/Message;

    iget-object v6, p1, Lb23/k;->c:Lb23/e;

    iget-object v7, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-static {v4}, Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;->getUploadId(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    const-string v6, "[uploadAttachments] #uploader; uploading attachment "

    invoke-static {v6, v4, v3, v5}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v8, v7, v3, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->this$0:Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;

    invoke-static {p1}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->access$getChannelStateLogic$p(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;)Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v3, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->$message:Lio/getstream/chat/android/models/Message;

    iget-object v4, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    new-instance v5, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4}, Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;->getUploadId(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v5, v3, v4, p1}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$ProgressCallbackImpl;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;)V

    move-object v10, v5

    goto :goto_0

    :cond_3
    move-object v10, v1

    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->this$0:Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;

    invoke-static {p1}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->access$getAttachmentUploader$p(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;)Lio/getstream/chat/android/client/attachment/AttachmentUploader;

    move-result-object v6

    iget-object p1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->this$0:Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;

    invoke-static {p1}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->access$getChannelType$p(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;)Ljava/lang/String;

    move-result-object v7

    iget-object p1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->this$0:Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;

    invoke-static {p1}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->access$getChannelId$p(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;)Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    iput-object v1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->label:I

    move-object v11, p0

    invoke-virtual/range {v6 .. v11}, Lio/getstream/chat/android/client/attachment/AttachmentUploader;->uploadAttachment(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/client/utils/ProgressCallback;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    check-cast p1, Ln23/h;

    iget-object v0, v11, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    const-string v1, "<this>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p1, Ln23/g;

    if-eqz v1, :cond_5

    check-cast p1, Ln23/g;

    goto :goto_2

    :cond_5
    instance-of v1, p1, Ln23/f;

    if-eqz v1, :cond_6

    new-instance v1, Ln23/g;

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->invokeSuspend$lambda$2(Lio/getstream/chat/android/models/Attachment;Ln23/e;)Lio/getstream/chat/android/models/Attachment;

    move-result-object p1

    invoke-direct {v1, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    move-object p1, v1

    :goto_2
    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    move-object v11, p0

    iget-object p1, v11, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->this$0:Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;

    invoke-static {p1}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->access$getLogger(Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;)Lb23/k;

    move-result-object p1

    iget-object v0, v11, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    iget-object v2, v11, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->$message:Lio/getstream/chat/android/models/Message;

    iget-object v4, p1, Lb23/k;->c:Lb23/e;

    iget-object v5, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->z:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-static {v0}, Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;->getUploadId(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v4, "[uploadAttachments] #uploader; attachment "

    const-string v7, " already uploaded"

    invoke-static {v4, v0, v3, v2, v7}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v6, v5, v0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    iget-object p1, v11, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    return-object p1
.end method
