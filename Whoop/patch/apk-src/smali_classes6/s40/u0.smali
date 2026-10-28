.class public final Ls40/u0;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# static fields
.field public static final h:Ljava/util/Set;

.field public static final i:Ljava/util/Set;


# instance fields
.field public final a:Lqy/d;

.field public final b:Lec3/h2;

.field public final c:Ljava/lang/String;

.field public final d:Lkotlin/jvm/functions/Function1;

.field public final e:Lkotlin/jvm/functions/Function1;

.field public final f:Landroid/net/Uri;

.field public g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "https://hooks.stripe.com/three_d_secure/authenticate"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ls40/u0;->h:Ljava/util/Set;

    const-string v0, "https://hooks.stripe.com/3d_secure/complete/"

    const-string v1, "https://hooks.stripe.com/3d_secure_2/hosted/complete"

    const-string v2, "https://hooks.stripe.com/redirect/complete/"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ls40/u0;->i:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lqy/d;Lec3/h2;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    iput-object p1, p0, Ls40/u0;->a:Lqy/d;

    iput-object p2, p0, Ls40/u0;->b:Lec3/h2;

    iput-object p3, p0, Ls40/u0;->c:Ljava/lang/String;

    iput-object p5, p0, Ls40/u0;->d:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Ls40/u0;->e:Lkotlin/jvm/functions/Function1;

    if-eqz p4, :cond_0

    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Ls40/u0;->f:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Intent;)V
    .locals 3

    const-string v0, "PaymentAuthWebViewClient#openIntent()"

    iget-object v1, p0, Ls40/u0;->a:Lqy/d;

    invoke-virtual {v1, v0}, Lqy/d;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Ls40/u0;->d:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v2, "Failed to start Intent."

    invoke-virtual {v1, v2, v0}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string v2, "alipays"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "PaymentAuthWebViewClient#onAuthCompleted()"

    invoke-virtual {v1, p1}, Lqy/d;->a(Ljava/lang/String;)V

    iget-object p1, p0, Ls40/u0;->e:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 4

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PaymentAuthWebViewClient#onPageFinished() - "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ls40/u0;->a:Lqy/d;

    invoke-virtual {v1, v0}, Lqy/d;->a(Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    iget-boolean p1, p0, Ls40/u0;->g:Z

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "PaymentAuthWebViewClient#hideProgressBar()"

    invoke-virtual {v1, p1}, Lqy/d;->a(Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v2, p0, Ls40/u0;->b:Lec3/h2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v0, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    if-eqz p2, :cond_3

    sget-object p1, Ls40/u0;->i:Ljava/util/Set;

    check-cast p1, Ljava/lang/Iterable;

    instance-of v2, p1, Ljava/util/Collection;

    if-eqz v2, :cond_1

    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {p2, v2, v3}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string p1, " is a completion URL"

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lqy/d;->a(Ljava/lang/String;)V

    const-string p1, "PaymentAuthWebViewClient#onAuthCompleted()"

    invoke-virtual {v1, p1}, Lqy/d;->a(Ljava/lang/String;)V

    iget-object p1, p0, Ls40/u0;->e:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_0
    return-void
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 8

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "PaymentAuthWebViewClient#shouldOverrideUrlLoading(): "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ls40/u0;->a:Lqy/d;

    invoke-virtual {v2, v1}, Lqy/d;->a(Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v1, "PaymentAuthWebViewClient#updateCompletionUrl()"

    invoke-virtual {v2, v1}, Lqy/d;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "toString(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Ls40/u0;->h:Ljava/util/Set;

    check-cast v4, Ljava/lang/Iterable;

    instance-of v5, v4, Ljava/util/Collection;

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v5, :cond_0

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v1, v5, v7}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v1, "return_url"

    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    :goto_0
    move-object v1, v6

    :goto_1
    if-eqz v1, :cond_3

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    :cond_3
    const-string v1, "PaymentAuthWebViewClient#isReturnUrl()"

    invoke-virtual {v2, v1}, Lqy/d;->a(Ljava/lang/String;)V

    const-string v1, "stripejs://use_stripe_sdk/return_url"

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v4, 0x1

    if-nez v1, :cond_5

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "stripesdk://payment_return_url/"

    invoke-static {v1, v3, v7}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Ls40/u0;->f:Landroid/net/Uri;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual {v1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :cond_5
    :goto_2
    move v7, v4

    goto :goto_4

    :cond_6
    invoke-virtual {v0}, Landroid/net/Uri;->isOpaque()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {v0}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    move-result-object v1

    const-string v3, "payment_intent_client_secret"

    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-virtual {v0, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_8
    const-string v3, "setup_intent_client_secret"

    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {v0, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_9
    move-object v1, v6

    :goto_3
    iget-object v3, p0, Ls40/u0;->c:Ljava/lang/String;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    :cond_a
    :goto_4
    iget-object v1, p0, Ls40/u0;->e:Lkotlin/jvm/functions/Function1;

    const-string v3, "PaymentAuthWebViewClient#onAuthCompleted()"

    if-eqz v7, :cond_b

    const-string p1, "PaymentAuthWebViewClient#shouldOverrideUrlLoading() - handle return URL"

    invoke-virtual {v2, p1}, Lqy/d;->a(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lqy/d;->a(Ljava/lang/String;)V

    invoke-interface {v1, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return v4

    :cond_b
    const-string v5, "intent"

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_d

    const-string p1, "PaymentAuthWebViewClient#openIntentScheme()"

    invoke-virtual {v2, p1}, Lqy/d;->a(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v4}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "parseUri(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ls40/u0;->a(Landroid/content/Intent;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_5
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_c

    const-string p2, "Failed to start Intent."

    invoke-virtual {v2, p2, p1}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v2, v3}, Lqy/d;->a(Ljava/lang/String;)V

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    return v4

    :cond_d
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/webkit/URLUtil;->isNetworkUrl(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_e

    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.intent.action.VIEW"

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, p1}, Ls40/u0;->a(Landroid/content/Intent;)V

    return v4

    :cond_e
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z

    move-result p1

    return p1
.end method
