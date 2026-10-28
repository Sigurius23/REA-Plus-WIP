.class public final Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;
.super Lmr/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lmr/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001b\u0010\r\u001a\u00020\u000c2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000c2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u000c2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;",
        "Lmr/i;",
        "Lmr/n;",
        "Landroid/content/Context;",
        "context",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Landroid/content/Context;Landroid/view/View;)V",
        "",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
        "validationErrors",
        "Ll83/a0;",
        "renderValidationErrors",
        "(Ljava/util/List;)V",
        "dismissValidationErrors",
        "()V",
        "snackbar",
        "onShown",
        "(Lmr/n;)V",
        "",
        "event",
        "onDismissed",
        "(Lmr/n;I)V",
        "Landroid/content/Context;",
        "Landroid/view/View;",
        "previousValidationError",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
        "currentlyVisibleSnackbar",
        "Lmr/n;",
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


# instance fields
.field private final context:Landroid/content/Context;

.field private currentlyVisibleSnackbar:Lmr/n;

.field private previousValidationError:Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;

.field private final view:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->context:Landroid/content/Context;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->view:Landroid/view/View;

    return-void
.end method

.method private static final renderValidationErrors$lambda$1$lambda$0(Lmr/n;Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x3

    invoke-virtual {p0, p1}, Lmr/l;->a(I)V

    return-void
.end method


# virtual methods
.method public final dismissValidationErrors()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->currentlyVisibleSnackbar:Lmr/n;

    if-eqz v0, :cond_0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lmr/l;->a(I)V

    :cond_0
    return-void
.end method

.method public final onDismissed(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, Lmr/n;

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->currentlyVisibleSnackbar:Lmr/n;

    return-void
.end method

.method public final onDismissed(Lmr/n;I)V
    .locals 0

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->currentlyVisibleSnackbar:Lmr/n;

    return-void
.end method

.method public final onShown(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lmr/n;

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->currentlyVisibleSnackbar:Lmr/n;

    return-void
.end method

.method public final onShown(Lmr/n;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->currentlyVisibleSnackbar:Lmr/n;

    return-void
.end method

.method public final renderValidationErrors(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;)V"
        }
    .end annotation

    const-string v0, "validationErrors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->dismissValidationErrors()V

    return-void

    :cond_0
    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->currentlyVisibleSnackbar:Lmr/n;

    if-nez v0, :cond_9

    if-eqz p1, :cond_9

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->previousValidationError:Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$MessageLengthExceeded;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->context:Landroid/content/Context;

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_error_message_length:I

    move-object v2, p1

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$MessageLengthExceeded;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$MessageLengthExceeded;->getMaxMessageLength()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentCountExceeded;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->context:Landroid/content/Context;

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_error_attachment_count:I

    move-object v2, p1

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentCountExceeded;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentCountExceeded;->getMaxAttachmentCount()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->context:Landroid/content/Context;

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_error_file_size:I

    move-object v2, p1

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$AttachmentSizeExceeded;->getMaxAttachmentSize()J

    move-result-wide v2

    invoke-static {v2, v3}, Lio/getstream/chat/android/ui/common/utils/MediaStringUtil;->convertFileSizeByteCount(J)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError$ContainsLinksWhenNotAllowed;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->context:Landroid/content/Context;

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_sending_links_not_allowed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->view:Landroid/view/View;

    const/4 v2, -0x2

    invoke-static {v1, v0, v2}, Lmr/n;->h(Landroid/view/View;Ljava/lang/CharSequence;I)Lmr/n;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->view:Landroid/view/View;

    iget-object v2, v0, Lmr/l;->l:Lmr/h;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lmr/h;->a()V

    :cond_4
    if-nez v1, :cond_5

    const/4 v1, 0x0

    goto :goto_1

    :cond_5
    new-instance v2, Lmr/h;

    invoke-direct {v2, v0, v1}, Lmr/h;-><init>(Lmr/n;Landroid/view/View;)V

    sget-object v3, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_6
    invoke-virtual {v1, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    move-object v1, v2

    :goto_1
    iput-object v1, v0, Lmr/l;->l:Lmr/h;

    iget-object v1, v0, Lmr/l;->u:Ljava/util/ArrayList;

    if-nez v1, :cond_7

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lmr/l;->u:Ljava/util/ArrayList;

    :cond_7
    iget-object v1, v0, Lmr/l;->u:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_ok:I

    new-instance v2, Lio/getstream/chat/android/ui/utils/b;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lio/getstream/chat/android/ui/utils/b;-><init>(Lmr/n;I)V

    invoke-virtual {v0, v1, v2}, Lmr/n;->i(ILandroid/view/View$OnClickListener;)V

    invoke-virtual {v0}, Lmr/n;->j()V

    goto :goto_2

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    :goto_2
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->previousValidationError:Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;

    return-void
.end method
