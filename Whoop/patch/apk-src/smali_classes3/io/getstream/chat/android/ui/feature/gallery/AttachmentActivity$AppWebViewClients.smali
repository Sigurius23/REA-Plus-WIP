.class final Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity$AppWebViewClients;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "AppWebViewClients"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ)\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity$AppWebViewClients;",
        "Landroid/webkit/WebViewClient;",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;)V",
        "Landroid/webkit/WebView;",
        "view",
        "",
        "url",
        "",
        "shouldOverrideUrlLoading",
        "(Landroid/webkit/WebView;Ljava/lang/String;)Z",
        "Ll83/a0;",
        "onPageFinished",
        "(Landroid/webkit/WebView;Ljava/lang/String;)V",
        "Landroid/webkit/WebResourceRequest;",
        "request",
        "Landroid/webkit/WebResourceError;",
        "error",
        "onReceivedError",
        "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V",
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
.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity$AppWebViewClients;->this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity$AppWebViewClients;->this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->access$getBinding$p(Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;)Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;->progressBar:Landroid/widget/ProgressBar;

    const-string p2, "progressBar"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 3

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "request"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity$AppWebViewClients;->this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->access$getLogger(Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;)Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    sget-object v0, Lb23/g;->F:Lb23/g;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p2, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "The load failed due to an unknown error: "

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v2, 0x0

    invoke-interface {p1, v0, v1, p2, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    if-nez p3, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity$AppWebViewClients;->this$0:Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method
