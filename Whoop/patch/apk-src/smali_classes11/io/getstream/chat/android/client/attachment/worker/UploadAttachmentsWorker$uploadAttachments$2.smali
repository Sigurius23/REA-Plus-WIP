.class final Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;->uploadAttachments(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "<anonymous>",
        "(Lbc3/c0;)Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.attachment.worker.UploadAttachmentsWorker$uploadAttachments$2"
    f = "UploadAttachmentsWorker.kt"
    l = {
        0x8e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $message:Lio/getstream/chat/android/models/Message;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;->$message:Lio/getstream/chat/android/models/Message;

    iput-object p2, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;->this$0:Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
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

    new-instance v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;->$message:Lio/getstream/chat/android/models/Message;

    iget-object v2, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;->this$0:Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;

    invoke-direct {v0, v1, v2, p2}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;->$message:Lio/getstream/chat/android/models/Message;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v2, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;->this$0:Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;

    iget-object v4, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;->$message:Lio/getstream/chat/android/models/Message;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {p1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/Attachment;

    new-instance v8, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;

    invoke-direct {v8, v6, v2, v4, v7}, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2$1$1;-><init>(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker;Lio/getstream/chat/android/models/Message;Lq83/d;)V

    const/4 v6, 0x3

    invoke-static {v0, v7, v8, v6}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v7, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;->L$0:Ljava/lang/Object;

    iput v3, p0, Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsWorker$uploadAttachments$2;->label:I

    invoke-static {v5, p0}, Lbc3/f0;->f(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method
