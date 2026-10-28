.class public final Lcom/iterable/iterableapi/h2;
.super Landroid/webkit/WebView;
.source "SourceFile"


# instance fields
.field public final synthetic w:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/iterable/iterableapi/h2;->w:I

    .line 2
    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/iterable/iterableapi/h2;->w:I

    invoke-direct {p0, p1, p2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/iterable/iterableapi/v0;Ljava/lang/String;)V
    .locals 8

    new-instance v0, Lcom/iterable/iterableapi/i2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/iterable/iterableapi/i2;-><init>(I)V

    iput-object p1, v0, Lcom/iterable/iterableapi/i2;->b:Ljava/lang/Object;

    new-instance v1, Lcom/iterable/iterableapi/g2;

    invoke-direct {v1}, Lcom/iterable/iterableapi/g2;-><init>()V

    iput-object p1, v1, Lcom/iterable/iterableapi/g2;->b:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    invoke-virtual {p0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Landroid/view/View;->setOverScrollMode(I)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V

    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    :try_start_0
    sget-object p1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object p1, p1, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    const-string v0, "IterableUtilImpl"

    const-string v1, "Failed to get configured WebView baseURL, using empty default"

    invoke-static {v0, v1, p1}, Ldt/b;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    const-string v6, "UTF-8"

    const-string v7, ""

    const-string v3, ""

    const-string v5, "text/html"

    move-object v2, p0

    move-object v4, p2

    invoke-virtual/range {v2 .. v7}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget v0, p0, Lcom/iterable/iterableapi/h2;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :pswitch_0
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    :goto_0
    const/4 p1, 0x0

    return p1

    :pswitch_1
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public performClick()Z
    .locals 1

    iget v0, p0, Lcom/iterable/iterableapi/h2;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Landroid/view/View;->performClick()Z

    move-result v0

    return v0

    :pswitch_0
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_1
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
