.class public final Lay/d0;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lab/g0;


# direct methods
.method public constructor <init>(Lab/g0;)V
    .locals 1

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    const-string v0, "https://b.stripecdn.com/mobile-confirmation-challenge/assets/index.html?v=1"

    iput-object v0, p0, Lay/d0;->a:Ljava/lang/String;

    iput-object p1, p0, Lay/d0;->b:Lab/g0;

    return-void
.end method

.method public static a(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 4

    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    new-array v1, v1, [C

    const/16 v2, 0x2f

    const/4 v3, 0x0

    aput-char v2, v1, v3

    invoke-static {v0, v1}, Lyb3/r;->R0(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    const-string v0, "parse(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lay/d0;->a(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p0

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lay/d0;->a(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 10
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Lay/d0;->a:Ljava/lang/String;

    invoke-static {p4, p1}, Lay/d0;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 12
    :cond_0
    new-instance p1, Lay/a;

    .line 13
    const-string p2, "generic_resource_error"

    .line 14
    invoke-direct {p1, p3, p2}, Lay/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object p2, p0, Lay/d0;->b:Lab/g0;

    invoke-virtual {p2, p1}, Lab/g0;->d(Lay/a;)V

    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    .line 2
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    iget-object v1, p0, Lay/d0;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lay/d0;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    if-eqz p3, :cond_2

    .line 3
    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_2
    if-eqz p3, :cond_3

    .line 4
    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getErrorCode()I

    :cond_3
    if-eqz p2, :cond_4

    .line 5
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 6
    :cond_4
    new-instance p2, Lay/a;

    .line 7
    const-string p3, "generic_resource_error"

    .line 8
    invoke-direct {p2, p1, p3}, Lay/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lay/d0;->b:Lab/g0;

    invoke-virtual {p1, p2}, Lab/g0;->d(Lay/a;)V

    return-void
.end method

.method public final onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 2

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    iget-object v1, p0, Lay/d0;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lay/d0;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    if-eqz p3, :cond_2

    invoke-virtual {p3}, Landroid/webkit/WebResourceResponse;->getReasonPhrase()Ljava/lang/String;

    move-result-object p1

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p3}, Landroid/webkit/WebResourceResponse;->getStatusCode()I

    :cond_3
    if-eqz p2, :cond_4

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    :cond_4
    new-instance p2, Lay/a;

    const-string p3, "http_error"

    invoke-direct {p2, p1, p3}, Lay/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lay/d0;->b:Lab/g0;

    invoke-virtual {p1, p2}, Lab/g0;->d(Lay/a;)V

    return-void
.end method

.method public final onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/webkit/SslErrorHandler;->cancel()V

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/net/http/SslError;->getPrimaryError()I

    :cond_1
    if-eqz p3, :cond_2

    invoke-virtual {p3}, Landroid/net/http/SslError;->getUrl()Ljava/lang/String;

    :cond_2
    new-instance p1, Lay/a;

    const-string p2, "received ssl error"

    const-string p3, "ssl_error"

    invoke-direct {p1, p2, p3}, Lay/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lay/d0;->b:Lab/g0;

    invoke-virtual {p2, p1}, Lab/g0;->d(Lay/a;)V

    return-void
.end method

.method public final onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z
    .locals 3

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    :cond_0
    new-instance v0, Lay/a;

    const-string v1, "render process crashed"

    const-string v2, "render_process_gone"

    invoke-direct {v0, v1, v2}, Lay/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lay/d0;->b:Lab/g0;

    invoke-virtual {v1, v0}, Lab/g0;->d(Lay/a;)V

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z

    move-result p1

    return p1
.end method
