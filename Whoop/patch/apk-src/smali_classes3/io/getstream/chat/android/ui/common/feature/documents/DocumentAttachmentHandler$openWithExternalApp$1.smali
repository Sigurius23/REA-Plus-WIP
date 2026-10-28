.class final Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->openWithExternalApp(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;)V
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
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.documents.DocumentAttachmentHandler$openWithExternalApp$1"
    f = "DocumentAttachmentHandler.kt"
    l = {
        0x57
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $attachment:Lio/getstream/chat/android/models/Attachment;

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $rootView:Landroid/view/View;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/models/Attachment;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->$rootView:Landroid/view/View;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->$context:Landroid/content/Context;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/internal/g0;Landroid/content/Context;JJ)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->invokeSuspend$lambda$3(Lkotlin/jvm/internal/g0;Landroid/content/Context;JJ)Ll83/a0;

    return-void
.end method

.method private static final invokeSuspend$lambda$3(Lkotlin/jvm/internal/g0;Landroid/content/Context;JJ)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Lmr/n;

    if-eqz p0, :cond_0

    invoke-static {p2, p3}, Lio/getstream/chat/android/ui/common/utils/MediaStringUtil;->convertFileSizeByteCount(J)Ljava/lang/String;

    move-result-object p2

    invoke-static {p4, p5}, Lio/getstream/chat/android/ui/common/utils/MediaStringUtil;->convertFileSizeByteCount(J)Ljava/lang/String;

    move-result-object p3

    sget p4, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_list_attachment_downloading:I

    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p4, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lmr/l;->i:Lmr/k;

    new-instance p3, Lio/getstream/chat/android/ui/common/feature/documents/a;

    invoke-direct {p3, p0, p1}, Lio/getstream/chat/android/ui/common/feature/documents/a;-><init>(Lmr/n;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final invokeSuspend$lambda$3$lambda$2$lambda$1(Lmr/n;Ljava/lang/String;)V
    .locals 1

    iget-object p0, p0, Lmr/l;->i:Lmr/k;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/snackbar/SnackbarContentLayout;

    invoke-virtual {p0}, Lcom/google/android/material/snackbar/SnackbarContentLayout;->getMessageView()Landroid/widget/TextView;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->$rootView:Landroid/view/View;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->$context:Landroid/content/Context;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-direct {v0, v1, v2, v3, p2}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;-><init>(Landroid/view/View;Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->L$0:Ljava/lang/Object;

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v5, p0

    iget-object v0, v5, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->label:I

    const/4 v9, 0x3

    const/4 v2, 0x1

    const/4 v10, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, v5, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    iget-object v1, v5, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, v0

    move-object/from16 v0, p1

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v12

    iget-object v13, v5, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->$rootView:Landroid/view/View;

    if-eqz v13, :cond_2

    iget-object v14, v5, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->$context:Landroid/content/Context;

    iget-object v15, v5, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    new-instance v11, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1$snackbarJob$1$1;

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v16}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1$snackbarJob$1$1;-><init>(Lkotlin/jvm/internal/g0;Landroid/view/View;Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lq83/d;)V

    invoke-static {v0, v10, v10, v11, v9}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    move-object v11, v0

    goto :goto_0

    :cond_2
    move-object v11, v10

    :goto_0
    invoke-static {}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->access$getShareFileManager$p()Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    move-result-object v0

    iget-object v1, v5, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->$context:Landroid/content/Context;

    iget-object v3, v5, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    move-object v4, v3

    new-instance v3, Lio/getstream/chat/android/ui/common/feature/documents/b;

    invoke-direct {v3, v12, v1}, Lio/getstream/chat/android/ui/common/feature/documents/b;-><init>(Lkotlin/jvm/internal/g0;Landroid/content/Context;)V

    iput-object v10, v5, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->L$0:Ljava/lang/Object;

    iput-object v12, v5, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->L$1:Ljava/lang/Object;

    iput-object v11, v5, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->L$2:Ljava/lang/Object;

    iput v2, v5, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->label:I

    move-object v2, v4

    const/4 v4, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->writeAttachmentToShareableFile$default(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lc93/m;Lc93/a;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_3

    return-object v8

    :cond_3
    move-object v1, v12

    :goto_1
    check-cast v0, Ln23/h;

    iget-object v2, v5, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->$context:Landroid/content/Context;

    iget-object v3, v5, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    instance-of v4, v0, Ln23/g;

    if-eqz v4, :cond_6

    move-object v6, v0

    check-cast v6, Ln23/g;

    iget-object v6, v6, Ln23/g;->a:Ljava/lang/Object;

    check-cast v6, Landroid/net/Uri;

    if-eqz v11, :cond_4

    invoke-interface {v11, v10}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_4
    iget-object v7, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v7, Lmr/n;

    if-eqz v7, :cond_5

    invoke-virtual {v7, v9}, Lmr/l;->a(I)V

    :cond_5
    sget-object v7, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;

    invoke-static {v7, v2, v6, v3}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->access$openFileUri(Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;Landroid/content/Context;Landroid/net/Uri;Lio/getstream/chat/android/models/Attachment;)V

    goto :goto_2

    :cond_6
    instance-of v2, v0, Ln23/f;

    if-eqz v2, :cond_d

    :goto_2
    iget-object v2, v5, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->$context:Landroid/content/Context;

    iget-object v3, v5, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;->$attachment:Lio/getstream/chat/android/models/Attachment;

    if-nez v4, :cond_c

    instance-of v4, v0, Ln23/f;

    if-eqz v4, :cond_b

    check-cast v0, Ln23/f;

    iget-object v0, v0, Ln23/f;->a:Ln23/e;

    if-eqz v11, :cond_7

    invoke-interface {v11, v10}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_7
    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lmr/n;

    if-eqz v1, :cond_8

    invoke-virtual {v1, v9}, Lmr/l;->a(I)V

    :cond_8
    sget-object v1, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->access$getLogger(Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;)Lb23/k;

    move-result-object v1

    iget-object v4, v1, Lb23/k;->c:Lb23/e;

    iget-object v6, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->F:Lb23/g;

    invoke-interface {v4, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_9

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    const-string v4, "[openWithExternalApp] Failed to download file: "

    invoke-static {v4, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v7, v6, v0, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    sget v0, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_list_attachment_download_failed:I

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Attachment;->getName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_a

    const-string v1, ""

    :cond_a
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_3

    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_c
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
