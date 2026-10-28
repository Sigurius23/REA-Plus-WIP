.class public final Lcom/iterable/iterableapi/i2;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/iterable/iterableapi/i2;->a:I

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/iterable/iterableapi/i2;->a:I

    iput-object p1, p0, Lcom/iterable/iterableapi/i2;->b:Ljava/lang/Object;

    .line 2
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)V
    .locals 4

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v2, "ENGLISH"

    const-string v3, "toLowerCase(...)"

    invoke-static {v1, v2, v0, v1, v3}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://emv3ds/challenge"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/iterable/iterableapi/i2;->b:Ljava/lang/Object;

    check-cast v0, Lt30/z;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object p1

    check-cast v0, Lrm/p;

    iget-object v0, v0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lt30/v;

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    iput-object p1, v0, Lt30/v;->x:Ljava/lang/String;

    iget-object p1, v0, Lt30/v;->y:Landroid/view/View$OnClickListener;

    if-eqz p1, :cond_1

    invoke-interface {p1, v0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3

    iget v0, p0, Lcom/iterable/iterableapi/i2;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object p2, p0, Lcom/iterable/iterableapi/i2;->b:Ljava/lang/Object;

    check-cast p2, Lcom/iterable/iterableapi/v0;

    const/4 v0, 0x1

    iput-boolean v0, p2, Lcom/iterable/iterableapi/v0;->x:Z

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Landroidx/fragment/app/m;

    const/16 v1, 0xe

    invoke-direct {v0, p2, v1}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    const-wide/16 v1, 0x64

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 2

    iget v0, p0, Lcom/iterable/iterableapi/i2;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    const-string v1, "getUrl(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/iterable/iterableapi/i2;->a(Landroid/net/Uri;)V

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/webkit/URLUtil;->isDataUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/webkit/WebResourceResponse;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p2, p2}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 2

    iget v0, p0, Lcom/iterable/iterableapi/i2;->a:I

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z

    move-result p1

    return p1

    :pswitch_0
    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "request"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p1

    const-string p2, "getUrl(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/iterable/iterableapi/i2;->a(Landroid/net/Uri;)V

    return v1

    .line 24
    :pswitch_1
    iget-object p1, p0, Lcom/iterable/iterableapi/i2;->b:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;

    if-eqz p2, :cond_0

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    sget v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->z:I

    if-eqz p2, :cond_2

    .line 25
    iget-object p1, p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->y:Landroidx/lifecycle/y1;

    invoke-virtual {p1}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llz/i;

    .line 26
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "toString(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    new-instance v0, Llq0/d;

    invoke-direct {v0, p2, p1}, Llq0/d;-><init>(Ljava/lang/String;Llz/i;)V

    .line 28
    :try_start_0
    iget-object p2, p1, Llz/i;->G:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {v0, p2}, Llq0/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    sget-object p2, Ll83/a0;->a:Ll83/a0;

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_1

    .line 30
    :cond_1
    const-string p2, "Required value was null."

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    :goto_1
    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    .line 32
    :goto_2
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 33
    const-string v0, "State is null"

    invoke-virtual {p1, v0, p2}, Llz/i;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_3
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 6

    iget v0, p0, Lcom/iterable/iterableapi/i2;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result p1

    return p1

    .line 1
    :pswitch_0
    iget-object p1, p0, Lcom/iterable/iterableapi/i2;->b:Ljava/lang/Object;

    check-cast p1, Lcom/iterable/iterableapi/v0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v1, p1, Lcom/iterable/iterableapi/v0;->F:Ljava/lang/String;

    sget-object v2, Lcom/iterable/iterableapi/v0;->P:Lcom/iterable/iterableapi/y0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-static {}, Ldt/b;->F()V

    .line 4
    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->e()Lcom/iterable/iterableapi/d1;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/iterable/iterableapi/d1;->d(Ljava/lang/String;)Lcom/iterable/iterableapi/j1;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->a()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, v0, Lcom/iterable/iterableapi/k;->j:Lcom/google/crypto/tink/internal/l0;

    .line 7
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 8
    :try_start_0
    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/l0;->B(Lorg/json/JSONObject;)V

    .line 9
    const-string v4, "messageId"

    .line 10
    iget-object v5, v3, Lcom/iterable/iterableapi/j1;->a:Ljava/lang/String;

    .line 11
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 12
    const-string v4, "clickedUrl"

    invoke-virtual {v1, v4, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 13
    const-string v4, "messageContext"

    invoke-static {v3, v2}, Lcom/google/crypto/tink/internal/l0;->Q(Lcom/iterable/iterableapi/j1;Lcom/iterable/iterableapi/a1;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 14
    const-string v2, "deviceInfo"

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/l0;->O()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 15
    const-string v2, "events/trackInAppClick"

    invoke-virtual {v0, v2, v1}, Lcom/google/crypto/tink/internal/l0;->f0(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {v0, v1, p2}, Lcom/iterable/iterableapi/k;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    :goto_0
    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v1, p1, Lcom/iterable/iterableapi/v0;->F:Ljava/lang/String;

    sget-object v2, Lcom/iterable/iterableapi/k0;->x:Lcom/iterable/iterableapi/i0;

    sget-object v3, Lcom/iterable/iterableapi/v0;->P:Lcom/iterable/iterableapi/y0;

    invoke-virtual {v0, v1, p2, v2, v3}, Lcom/iterable/iterableapi/k;->o(Ljava/lang/String;Ljava/lang/String;Lcom/iterable/iterableapi/k0;Lcom/iterable/iterableapi/a1;)V

    .line 19
    sget-object v0, Lcom/iterable/iterableapi/v0;->O:Lqg3/d;

    if-eqz v0, :cond_2

    .line 20
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v0, p2}, Lqg3/d;->p(Landroid/net/Uri;)V

    .line 21
    :cond_2
    invoke-virtual {p1}, Lcom/iterable/iterableapi/v0;->F()V

    .line 22
    invoke-virtual {p1}, Lcom/iterable/iterableapi/v0;->E()V

    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
