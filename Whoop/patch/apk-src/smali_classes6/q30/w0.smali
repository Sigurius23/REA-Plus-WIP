.class public final Lq30/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcq/d;
.implements Luf/o;
.implements Lto/n;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Lq30/w0;->w:I

    const/4 v0, 0x1

    sparse-switch p1, :sswitch_data_0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    .line 13
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lq30/w0;->y:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 14
    iput-object v1, p0, Lq30/w0;->z:Ljava/lang/Object;

    const/high16 v1, -0x1000000

    .line 15
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 16
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 17
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 18
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void

    .line 19
    :sswitch_0
    const-string p1, "toString(...)"

    .line 20
    invoke-static {p1}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    sget-object v0, Lne3/l;->z:Lne3/k;

    invoke-static {p1}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object p1

    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    .line 23
    sget-object p1, Lud3/j0;->e:Lud3/h0;

    iput-object p1, p0, Lq30/w0;->y:Ljava/lang/Object;

    .line 24
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lq30/w0;->z:Ljava/lang/Object;

    return-void

    .line 25
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance p1, Lmf/c;

    .line 27
    invoke-direct {p1, v0}, Lmf/c;-><init>(I)V

    .line 28
    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    .line 29
    new-instance p1, Lmf/c;

    .line 30
    invoke-direct {p1, v0}, Lmf/c;-><init>(I)V

    .line 31
    iput-object p1, p0, Lq30/w0;->y:Ljava/lang/Object;

    .line 32
    new-instance p1, Lmf/c;

    .line 33
    invoke-direct {p1, v0}, Lmf/c;-><init>(I)V

    .line 34
    iput-object p1, p0, Lq30/w0;->z:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x13 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 1
    iput p1, p0, Lq30/w0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 2
    iput p1, p0, Lq30/w0;->w:I

    const/4 p1, 0x0

    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    iput-object p1, p0, Lq30/w0;->y:Ljava/lang/Object;

    iput-object p1, p0, Lq30/w0;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/16 v0, 0x1d

    iput v0, p0, Lq30/w0;->w:I

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    sget-object v1, Lbc3/q0;->a:Lkc3/e;

    .line 84
    sget-object v1, Lkc3/d;->w:Lkc3/d;

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    .line 87
    iput-object v1, p0, Lq30/w0;->y:Ljava/lang/Object;

    .line 88
    new-instance p1, Lvv1/c;

    invoke-direct {p1, p0, v0}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lq30/w0;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Landroid/content/Context;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lv40/a;Lu40/h;Lu40/f;Lcom/stripe/hcaptcha/webview/HCaptchaWebView;)V
    .locals 6

    const/16 v0, 0x1a

    iput v0, p0, Lq30/w0;->w:I

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p3, p0, Lq30/w0;->x:Ljava/lang/Object;

    .line 54
    iput-object p6, p0, Lq30/w0;->y:Ljava/lang/Object;

    .line 55
    iput-object p7, p0, Lq30/w0;->z:Ljava/lang/Object;

    .line 56
    new-instance v0, Ly40/d;

    invoke-direct {v0, p1, p3, p5}, Ly40/d;-><init>(Landroid/os/Handler;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lu40/h;)V

    .line 57
    new-instance p5, Ly40/a;

    invoke-direct {p5, p2}, Ly40/a;-><init>(Landroid/content/Context;)V

    .line 58
    invoke-virtual {p7}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    const-string v1, "getSettings(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 59
    invoke-virtual {p2, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 60
    invoke-virtual {p2, v1}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    const/4 v2, -0x1

    .line 61
    invoke-virtual {p2, v2}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    const/4 v2, 0x0

    .line 62
    invoke-virtual {p2, v2}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    .line 63
    invoke-virtual {p2, v2}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 64
    invoke-virtual {p2, v2}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 65
    new-instance p2, Ly40/f;

    invoke-direct {p2, p0, p1, p6}, Ly40/f;-><init>(Lq30/w0;Landroid/os/Handler;Lu40/f;)V

    invoke-virtual {p7, p2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 66
    new-instance p1, Ly40/e;

    .line 67
    invoke-direct {p1}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 68
    invoke-virtual {p7, p1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 69
    invoke-virtual {p7, v2}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 70
    invoke-virtual {p3}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getDisableHardwareAcceleration()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 71
    invoke-virtual {p7, v1, p1}, Landroid/webkit/WebView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 72
    :cond_0
    const-string p1, "JSInterface"

    invoke-virtual {p7, v0, p1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    const-string p1, "JSDI"

    invoke-virtual {p7, p5, p1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    invoke-virtual {p3}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getHost()Ljava/lang/String;

    move-result-object v1

    .line 75
    iget-object p1, p4, Lv40/a;->w:Lc93/a;

    .line 76
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    const-string v4, "UTF-8"

    const/4 v5, 0x0

    const-string v3, "text/html"

    move-object v0, p7

    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, Lq30/w0;->w:I

    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    iput-object p2, p0, Lq30/w0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lq30/w0;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    const/16 v0, 0x1b

    iput v0, p0, Lq30/w0;->w:I

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    new-instance v0, Lpg3/p;

    const/16 v1, 0x10

    const/4 v2, 0x0

    .line 101
    invoke-direct {v0, v1, v2}, Lpg3/p;-><init>(IZ)V

    .line 102
    iput-object v0, p0, Lq30/w0;->y:Ljava/lang/Object;

    .line 103
    iput-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    .line 104
    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ln30/d;Lq83/j;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lq30/w0;->w:I

    .line 38
    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    .line 41
    iput-object p2, p0, Lq30/w0;->y:Ljava/lang/Object;

    .line 42
    iput-object p3, p0, Lq30/w0;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayDeque;Ljava/io/BufferedReader;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Lq30/w0;->w:I

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    iput-object p1, p0, Lq30/w0;->z:Ljava/lang/Object;

    .line 130
    iput-object p2, p0, Lq30/w0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln30/d;Lq83/j;)V
    .locals 3

    const/16 v0, 0xc

    iput v0, p0, Lq30/w0;->w:I

    const-string v0, "errorReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    sget-object v0, Ls30/c;->a:Ls30/c;

    .line 44
    new-instance v1, Lso/q;

    const-string v2, "errorReporter"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "workContext"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, v1, Lso/q;->w:Ljava/lang/Object;

    .line 47
    iput-object p2, v1, Lso/q;->x:Ljava/lang/Object;

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p2, p0, Lq30/w0;->z:Ljava/lang/Object;

    .line 50
    iput-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    .line 51
    iput-object v1, p0, Lq30/w0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp3/e0;Lq30/w0;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lq30/w0;->w:I

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    .line 126
    iput-object p2, p0, Lq30/w0;->y:Ljava/lang/Object;

    .line 127
    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lq30/w0;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lqy/c;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x1c

    iput v0, p0, Lq30/w0;->w:I

    const-string v0, "apiVersion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    iput-object p1, p0, Lq30/w0;->y:Ljava/lang/Object;

    .line 97
    iput-object p2, p0, Lq30/w0;->x:Ljava/lang/Object;

    .line 98
    iput-object p3, p0, Lq30/w0;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr23/d;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, Lq30/w0;->w:I

    .line 77
    new-instance v0, Lqt2/w;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lqt2/w;-><init>(I)V

    .line 78
    const-string v1, "retryPolicy"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    .line 81
    iput-object v0, p0, Lq30/w0;->y:Ljava/lang/Object;

    .line 82
    const-string p1, "CallRetryService"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lq30/w0;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr93/i;Ljava/util/List;Lq30/w0;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lq30/w0;->w:I

    const-string v0, "classifierDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    .line 93
    iput-object p2, p0, Lq30/w0;->y:Ljava/lang/Object;

    .line 94
    iput-object p3, p0, Lq30/w0;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lso/b;Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lq30/w0;->w:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq30/w0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lq30/w0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lq30/w0;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lup/c;Lvp/f;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, Lq30/w0;->w:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq30/w0;->y:Ljava/lang/Object;

    .line 6
    invoke-static {p1}, Luo/w;->f(Ljava/lang/Object;)V

    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwm/g;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lq30/w0;->w:I

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lyy/j;Lyy/c;Lbz/c;)V
    .locals 1

    const/16 v0, 0x19

    iput v0, p0, Lq30/w0;->w:I

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "durationProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    .line 9
    iput-object p2, p0, Lq30/w0;->y:Ljava/lang/Object;

    .line 10
    iput-object p3, p0, Lq30/w0;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([Ltm/h;)V
    .locals 5

    const/16 v0, 0x10

    iput v0, p0, Lq30/w0;->w:I

    .line 105
    new-instance v0, Ltm/x;

    invoke-direct {v0}, Ltm/x;-><init>()V

    new-instance v1, Ltm/z;

    .line 106
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/high16 v2, 0x3f800000    # 1.0f

    .line 107
    iput v2, v1, Ltm/z;->c:F

    .line 108
    iput v2, v1, Ltm/z;->d:F

    .line 109
    sget-object v2, Ltm/g;->e:Ltm/g;

    iput-object v2, v1, Ltm/z;->e:Ltm/g;

    .line 110
    iput-object v2, v1, Ltm/z;->f:Ltm/g;

    .line 111
    iput-object v2, v1, Ltm/z;->g:Ltm/g;

    .line 112
    iput-object v2, v1, Ltm/z;->h:Ltm/g;

    .line 113
    sget-object v2, Ltm/h;->a:Ljava/nio/ByteBuffer;

    iput-object v2, v1, Ltm/z;->k:Ljava/nio/ByteBuffer;

    .line 114
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v3

    iput-object v3, v1, Ltm/z;->l:Ljava/nio/ShortBuffer;

    .line 115
    iput-object v2, v1, Ltm/z;->m:Ljava/nio/ByteBuffer;

    const/4 v2, -0x1

    .line 116
    iput v2, v1, Ltm/z;->b:I

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    array-length v2, p1

    add-int/lit8 v2, v2, 0x2

    new-array v2, v2, [Ltm/h;

    iput-object v2, p0, Lq30/w0;->x:Ljava/lang/Object;

    const/4 v3, 0x0

    .line 119
    array-length v4, p1

    invoke-static {p1, v3, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 120
    iput-object v0, p0, Lq30/w0;->y:Ljava/lang/Object;

    .line 121
    iput-object v1, p0, Lq30/w0;->z:Ljava/lang/Object;

    .line 122
    array-length v3, p1

    aput-object v0, v2, v3

    .line 123
    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    aput-object v1, v2, p1

    return-void
.end method

.method public static final a(Lq30/w0;Ljava/lang/String;Ljava/lang/String;)Lq30/h0;
    .locals 3

    iget-object p0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    const-string v0, "url"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.net.HttpURLConnection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/net/HttpURLConnection;

    const-string v1, "POST"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const-string v1, "Content-Type"

    invoke-virtual {v0, v1, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    const-string v1, "Content-Length"

    invoke-virtual {v0, v1, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p2

    :try_start_0
    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v2, "UTF_8"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/io/OutputStreamWriter;

    invoke-direct {v2, p2, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    invoke-virtual {v2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/OutputStreamWriter;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    invoke-virtual {v2}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    invoke-interface {p2}, Ljava/io/Closeable;->close()V

    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p1

    const/16 p2, 0xc8

    if-gt p2, p1, :cond_2

    const/16 p2, 0x12c

    if-ge p1, p2, :cond_2

    new-instance p0, Lq30/h0;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    const-string p2, "getInputStream(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_3
    sget-object p2, Lyb3/a;->a:Ljava/nio/charset/Charset;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    new-instance p1, Ljava/io/BufferedReader;

    const/16 p2, 0x2000

    invoke-direct {p1, v1, p2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-static {p1}, Lvf3/b;->h(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p2

    :try_start_6
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v1

    :try_start_7
    invoke-static {p1, p2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_0
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    :goto_1
    instance-of p1, p2, Ll83/m;

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    :cond_0
    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_1

    const-string p2, ""

    :cond_1
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lq30/h0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    :cond_2
    new-instance p2, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;

    const-string v0, "Unsuccessful response code from "

    const-string v1, ": "

    invoke-static {p1, v0, p0, v1}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-direct {p2, p0, p1}, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;-><init>(Ljava/lang/String;I)V

    throw p2

    :catchall_3
    move-exception p0

    goto :goto_2

    :catchall_4
    move-exception p0

    :try_start_8
    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :catchall_5
    move-exception p1

    :try_start_9
    invoke-static {v2, p0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :goto_2
    :try_start_a
    throw p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    :catchall_6
    move-exception p1

    invoke-static {p2, p0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static m(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;
    .locals 8

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v3, p3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p3, "url"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "options"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyy/g;

    sget-object v1, Lyy/k0;->x:Lyy/k0;

    iget-object p3, p0, Lq30/w0;->y:Ljava/lang/Object;

    move-object v5, p3

    check-cast v5, Lqy/c;

    iget-object p3, p0, Lq30/w0;->x:Ljava/lang/Object;

    move-object v6, p3

    check-cast v6, Ljava/lang/String;

    iget-object p0, p0, Lq30/w0;->z:Ljava/lang/Object;

    move-object v7, p0

    check-cast v7, Ljava/lang/String;

    move-object v2, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v7}, Lyy/g;-><init>(Lyy/k0;Ljava/lang/String;Ljava/util/Map;Lyy/f;Lqy/c;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;
    .locals 8

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v3, p3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p3, "url"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "options"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyy/g;

    sget-object v1, Lyy/k0;->y:Lyy/k0;

    iget-object p3, p0, Lq30/w0;->y:Ljava/lang/Object;

    move-object v5, p3

    check-cast v5, Lqy/c;

    iget-object p3, p0, Lq30/w0;->x:Ljava/lang/Object;

    move-object v6, p3

    check-cast v6, Ljava/lang/String;

    iget-object p0, p0, Lq30/w0;->z:Ljava/lang/Object;

    move-object v7, p0

    check-cast v7, Ljava/lang/String;

    move-object v2, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v7}, Lyy/g;-><init>(Lyy/k0;Ljava/lang/String;Ljava/util/Map;Lyy/f;Lqy/c;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static o(Lkotlin/time/Duration;)Ljava/lang/Float;
    .locals 2

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v0

    sget-object p0, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, p0}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v0

    double-to-float p0, v0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public A(La6/e;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lr23/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lr23/a;

    iget v1, v0, Lr23/a;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lr23/a;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lr23/a;

    invoke-direct {v0, p0, p2}, Lr23/a;-><init>(Lq30/w0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lr23/a;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lr23/a;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    const/4 p1, 0x2

    if-ne v2, p1, :cond_1

    iget-object p1, v0, Lr23/a;->z:Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Lr23/a;->y:Lkotlin/jvm/internal/e0;

    iget-object v4, v0, Lr23/a;->x:Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Lr23/a;->w:Lq30/w0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget p2, v2, Lkotlin/jvm/internal/e0;->w:I

    add-int/2addr p2, v3

    iput p2, v2, Lkotlin/jvm/internal/e0;->w:I

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lr23/a;->E:Lkotlin/jvm/internal/g0;

    iget-object v1, v0, Lr23/a;->z:Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Lr23/a;->y:Lkotlin/jvm/internal/e0;

    iget-object v0, v0, Lr23/a;->w:Lq30/w0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v2, Lkotlin/jvm/internal/e0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput v3, v2, Lkotlin/jvm/internal/e0;->w:I

    new-instance p2, Lkotlin/jvm/internal/g0;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    move-object v5, p0

    move-object v4, p1

    move-object p1, p2

    :goto_1
    iput-object v5, v0, Lr23/a;->w:Lq30/w0;

    iput-object v4, v0, Lr23/a;->x:Lkotlin/jvm/functions/Function1;

    iput-object v2, v0, Lr23/a;->y:Lkotlin/jvm/internal/e0;

    iput-object p1, v0, Lr23/a;->z:Lkotlin/jvm/internal/g0;

    iput-object p1, v0, Lr23/a;->E:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lr23/a;->H:I

    invoke-interface {v4, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v1, p1

    move-object v0, v5

    :goto_2
    iput-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ln23/h;

    instance-of v3, p2, Ln23/g;

    if-nez v3, :cond_7

    instance-of p2, p2, Ln23/f;

    if-eqz p2, :cond_6

    iget-object p2, v0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v3, Lr23/d;

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_3

    :cond_5
    iget p1, v2, Lkotlin/jvm/internal/e0;->w:I

    iget-object p2, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Ln23/f;

    iget-object p2, p2, Ln23/f;->a:Ln23/e;

    invoke-interface {v3, p1, p2}, Lr23/d;->shouldRetry(ILn23/e;)Z

    iget p1, v2, Lkotlin/jvm/internal/e0;->w:I

    iget-object p2, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Ln23/f;

    iget-object p2, p2, Ln23/f;->a:Ln23/e;

    invoke-interface {v3, p1, p2}, Lr23/d;->retryTimeout(ILn23/e;)I

    iget-object p1, v0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast p1, Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb23/k;

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object v0, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->z:Lb23/g;

    invoke-interface {p2, v3, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_7

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    iget p2, v2, Lkotlin/jvm/internal/e0;->w:I

    iget-object v2, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Ln23/f;

    iget-object v2, v2, Ln23/f;->a:Ln23/e;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "API call failed (attempt "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "). Giving up for now, will retry when connection recovers. Error was "

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v2, 0x0

    invoke-interface {p1, v3, v0, p2, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_3
    iget-object p1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-object p1
.end method

.method public B(Lro/i;)V
    .locals 0

    iput-object p1, p0, Lq30/w0;->y:Ljava/lang/Object;

    return-void
.end method

.method public C(Ljava/lang/Integer;)V
    .locals 1

    iget v0, p0, Lq30/w0;->w:I

    sparse-switch v0, :sswitch_data_0

    iput-object p1, p0, Lq30/w0;->z:Ljava/lang/Object;

    return-void

    :sswitch_0
    iput-object p1, p0, Lq30/w0;->z:Ljava/lang/Object;

    return-void

    :sswitch_1
    iput-object p1, p0, Lq30/w0;->z:Ljava/lang/Object;

    return-void

    :sswitch_2
    iput-object p1, p0, Lq30/w0;->z:Ljava/lang/Object;

    return-void

    :sswitch_3
    iput-object p1, p0, Lq30/w0;->z:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_3
        0x2 -> :sswitch_2
        0x16 -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method

.method public D(Lro/i;)V
    .locals 0

    iput-object p1, p0, Lq30/w0;->y:Ljava/lang/Object;

    return-void
.end method

.method public E(Ljava/math/BigInteger;)V
    .locals 1

    iget v0, p0, Lq30/w0;->w:I

    packed-switch v0, :pswitch_data_0

    iput-object p1, p0, Lq30/w0;->y:Ljava/lang/Object;

    return-void

    :pswitch_0
    iput-object p1, p0, Lq30/w0;->y:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_0
    .end packed-switch
.end method

.method public F(Lqs/d;)V
    .locals 0

    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    return-void
.end method

.method public G(Lqs/l;)V
    .locals 0

    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    return-void
.end method

.method public H(Lws/c;)V
    .locals 0

    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    return-void
.end method

.method public I(Lws/q;)V
    .locals 0

    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    return-void
.end method

.method public J(Lws/x;)V
    .locals 0

    iput-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    return-void
.end method

.method public K(Ljava/security/spec/ECPoint;)V
    .locals 0

    iput-object p1, p0, Lq30/w0;->y:Ljava/lang/Object;

    return-void
.end method

.method public L(Lud3/h0;)V
    .locals 2

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lud3/h0;->b:Ljava/lang/String;

    const-string v1, "multipart"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lq30/w0;->y:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "multipart != "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public M(Lcom/stripe/hcaptcha/HCaptchaException;)Z
    .locals 2

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getRetryPredicate()Lc93/m;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1, v0, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lq30/w0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/location/FusedLocationProviderClient;

    iget-object v1, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v1, Lnp/j;

    iget-object v2, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v2, Landroid/app/PendingIntent;

    check-cast p1, Lnp/i;

    check-cast p2, Lcq/i;

    invoke-virtual {v0, v1, v2, p1, p2}, Lcom/google/android/gms/location/FusedLocationProviderClient;->zza(Lnp/j;Landroid/app/PendingIntent;Lnp/i;Lcq/i;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/location/FusedLocationProviderClient;

    iget-object v1, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v1, Lcq/a;

    iget-object v2, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v2, Lnp/j;

    check-cast p1, Lnp/i;

    check-cast p2, Lcq/i;

    invoke-virtual {v0, v1, v2, p1, p2}, Lcom/google/android/gms/location/FusedLocationProviderClient;->zzc(Lcq/a;Lnp/j;Lnp/i;Lcq/i;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lrv/o;)V
    .locals 4

    const-string v0, "layer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxStyleManager;

    new-instance v2, Lcom/mapbox/maps/LayerPosition;

    iget-object v3, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-direct {v2, v3, v1, v1}, Lcom/mapbox/maps/LayerPosition;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {p1, v0, v2}, Lrv/o;->a(Lcom/mapbox/maps/MapboxStyleManager;Lcom/mapbox/maps/LayerPosition;)V

    return-void

    :cond_0
    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxStyleManager;

    new-instance v2, Lcom/mapbox/maps/LayerPosition;

    iget-object v3, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-direct {v2, v1, v3, v1}, Lcom/mapbox/maps/LayerPosition;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {p1, v0, v2}, Lrv/o;->a(Lcom/mapbox/maps/MapboxStyleManager;Lcom/mapbox/maps/LayerPosition;)V

    return-void

    :cond_1
    iget-object v0, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxStyleManager;

    invoke-virtual {p1, v0, v1}, Lrv/o;->a(Lcom/mapbox/maps/MapboxStyleManager;Lcom/mapbox/maps/LayerPosition;)V

    return-void
.end method

.method public d(Ljava/lang/Object;Lag/d;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Luf/u;

    iget-object p2, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast p2, Lmf/c;

    iget-object p2, p2, La2/a;->x:Ljava/lang/Object;

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v2, p1, Luf/u;->b:Ljava/lang/Object;

    check-cast v2, Lvf/b;

    iget-object v2, v2, Lvf/b;->y:Lmf/c;

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {v2, v1, v0}, La2/a;->h(Ljava/lang/String;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast p2, Lmf/c;

    iget-object p2, p2, La2/a;->x:Ljava/lang/Object;

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v2, p1, Luf/u;->b:Ljava/lang/Object;

    check-cast v2, Lvf/b;

    iget-object v2, v2, Lvf/b;->y:Lmf/c;

    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0, v1}, La2/a;->N(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast p2, Lmf/c;

    iget-object p2, p2, La2/a;->x:Ljava/lang/Object;

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v2, p1, Luf/u;->b:Ljava/lang/Object;

    check-cast v2, Lvf/b;

    iget-object v2, v2, Lvf/b;->y:Lmf/c;

    invoke-virtual {v2, v1}, La2/a;->o(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p1, Luf/u;->b:Ljava/lang/Object;

    check-cast v2, Lvf/b;

    iget-object v2, v2, Lvf/b;->y:Lmf/c;

    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0, v1}, La2/a;->N(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    return-object p1
.end method

.method public e(Lud3/d0;Lud3/v0;)V
    .locals 1

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Content-Type"

    invoke-virtual {p1, v0}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "Content-Length"

    invoke-virtual {p1, v0}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lud3/i0;

    invoke-direct {v0, p1, p2}, Lud3/i0;-><init>(Lud3/d0;Lud3/v0;)V

    invoke-virtual {p0, v0}, Lq30/w0;->f(Lud3/i0;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unexpected header: Content-Length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unexpected header: Content-Type"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Lud3/i0;)V
    .locals 1

    const-string v0, "part"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g()Lqs/a;
    .locals 5

    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lqs/d;

    if-eqz v0, :cond_9

    iget-object v1, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v1, Lro/i;

    if-eqz v1, :cond_9

    iget v2, v0, Lqs/d;->a:I

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lct/a;

    iget-object v1, v1, Lct/a;->a:[B

    array-length v1, v1

    if-ne v2, v1, :cond_8

    invoke-virtual {v0}, Lqs/d;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lqs/d;

    invoke-virtual {v0}, Lqs/d;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lqs/d;

    iget-object v0, v0, Lqs/d;->c:Lqs/c;

    sget-object v1, Lqs/c;->e:Lqs/c;

    if-ne v0, v1, :cond_4

    sget-object v0, Lcom/google/crypto/tink/internal/a0;->a:Lct/a;

    goto :goto_3

    :cond_4
    sget-object v1, Lqs/c;->d:Lqs/c;

    if-eq v0, v1, :cond_7

    sget-object v1, Lqs/c;->c:Lqs/c;

    if-ne v0, v1, :cond_5

    goto :goto_2

    :cond_5
    sget-object v1, Lqs/c;->b:Lqs/c;

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->b(I)Lct/a;

    move-result-object v0

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown AesCmacParametersParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v2, Lqs/d;

    iget-object v2, v2, Lqs/d;->c:Lqs/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_2
    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->a(I)Lct/a;

    move-result-object v0

    :goto_3
    new-instance v1, Lqs/a;

    iget-object v2, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v2, Lqs/d;

    iget-object v3, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v3, Lro/i;

    iget-object v4, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-direct {v1, v2, v3, v0, v4}, Lqs/a;-><init>(Lqs/d;Lro/i;Lct/a;Ljava/lang/Integer;)V

    return-object v1

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h()Lqs/h;
    .locals 5

    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lqs/l;

    if-eqz v0, :cond_9

    iget-object v1, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v1, Lro/i;

    if-eqz v1, :cond_9

    iget v2, v0, Lqs/l;->a:I

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lct/a;

    iget-object v1, v1, Lct/a;->a:[B

    array-length v1, v1

    if-ne v2, v1, :cond_8

    invoke-virtual {v0}, Lqs/l;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lqs/l;

    invoke-virtual {v0}, Lqs/l;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lqs/l;

    iget-object v0, v0, Lqs/l;->c:Lqs/k;

    sget-object v1, Lqs/k;->e:Lqs/k;

    if-ne v0, v1, :cond_4

    sget-object v0, Lcom/google/crypto/tink/internal/a0;->a:Lct/a;

    goto :goto_3

    :cond_4
    sget-object v1, Lqs/k;->d:Lqs/k;

    if-eq v0, v1, :cond_7

    sget-object v1, Lqs/k;->c:Lqs/k;

    if-ne v0, v1, :cond_5

    goto :goto_2

    :cond_5
    sget-object v1, Lqs/k;->b:Lqs/k;

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->b(I)Lct/a;

    move-result-object v0

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown HmacParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v2, Lqs/l;

    iget-object v2, v2, Lqs/l;->c:Lqs/k;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_2
    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->a(I)Lct/a;

    move-result-object v0

    :goto_3
    new-instance v1, Lqs/h;

    iget-object v2, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v2, Lqs/l;

    iget-object v3, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v3, Lro/i;

    iget-object v4, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-direct {v1, v2, v3, v0, v4}, Lqs/h;-><init>(Lqs/l;Lro/i;Lct/a;Ljava/lang/Integer;)V

    return-object v1

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i()Lud3/j0;
    .locals 4

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Lud3/j0;

    iget-object v2, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v2, Lne3/l;

    iget-object v3, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v3, Lud3/h0;

    invoke-static {v0}, Lwd3/h;->j(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v2, v3, v0}, Lud3/j0;-><init>(Lne3/l;Lud3/h0;Ljava/util/List;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Multipart body must have at least one part."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j()Lws/e;
    .locals 5

    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lws/c;

    if-eqz v0, :cond_9

    iget-object v1, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/security/spec/ECPoint;

    if-eqz v1, :cond_8

    iget-object v0, v0, Lws/c;->b:Lws/a;

    iget-object v0, v0, Lws/a;->b:Ljava/security/spec/ECParameterSpec;

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/crypto/tink/internal/e;->b(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lws/c;

    invoke-virtual {v0}, Lws/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lws/c;

    invoke-virtual {v0}, Lws/c;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lws/c;

    iget-object v0, v0, Lws/c;->d:Lws/b;

    sget-object v1, Lws/b;->k:Lws/b;

    if-ne v0, v1, :cond_4

    sget-object v0, Lcom/google/crypto/tink/internal/a0;->a:Lct/a;

    goto :goto_3

    :cond_4
    sget-object v1, Lws/b;->j:Lws/b;

    if-eq v0, v1, :cond_7

    sget-object v1, Lws/b;->i:Lws/b;

    if-ne v0, v1, :cond_5

    goto :goto_2

    :cond_5
    sget-object v1, Lws/b;->h:Lws/b;

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->b(I)Lct/a;

    move-result-object v0

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown EcdsaParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v2, Lws/c;

    iget-object v2, v2, Lws/c;->d:Lws/b;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_2
    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->a(I)Lct/a;

    move-result-object v0

    :goto_3
    new-instance v1, Lws/e;

    iget-object v2, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v2, Lws/c;

    iget-object v3, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v3, Ljava/security/spec/ECPoint;

    iget-object v4, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-direct {v1, v2, v3, v0, v4}, Lws/e;-><init>(Lws/c;Ljava/security/spec/ECPoint;Lct/a;Ljava/lang/Integer;)V

    return-object v1

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without public point"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public k()Lws/s;
    .locals 5

    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lws/q;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/math/BigInteger;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    iget-object v1, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v1, Lws/q;

    iget v2, v1, Lws/q;->a:I

    if-ne v0, v2, :cond_8

    invoke-virtual {v1}, Lws/q;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lws/q;

    invoke-virtual {v0}, Lws/q;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lws/q;

    iget-object v0, v0, Lws/q;->c:Lws/p;

    sget-object v1, Lws/p;->e:Lws/p;

    if-ne v0, v1, :cond_4

    sget-object v0, Lcom/google/crypto/tink/internal/a0;->a:Lct/a;

    goto :goto_3

    :cond_4
    sget-object v1, Lws/p;->d:Lws/p;

    if-eq v0, v1, :cond_7

    sget-object v1, Lws/p;->c:Lws/p;

    if-ne v0, v1, :cond_5

    goto :goto_2

    :cond_5
    sget-object v1, Lws/p;->b:Lws/p;

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->b(I)Lct/a;

    move-result-object v0

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown RsaSsaPkcs1Parameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v2, Lws/q;

    iget-object v2, v2, Lws/q;->c:Lws/p;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_2
    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->a(I)Lct/a;

    move-result-object v0

    :goto_3
    new-instance v1, Lws/s;

    iget-object v2, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v2, Lws/q;

    iget-object v3, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v3, Ljava/math/BigInteger;

    iget-object v4, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-direct {v1, v2, v3, v0, v4}, Lws/s;-><init>(Lws/q;Ljava/math/BigInteger;Lct/a;Ljava/lang/Integer;)V

    return-object v1

    :cond_8
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v3, "Got modulus size "

    const-string v4, ", but parameters requires modulus size "

    invoke-static {v0, v2, v3, v4}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without modulus"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l()Lws/z;
    .locals 5

    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lws/x;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/math/BigInteger;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    iget-object v1, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v1, Lws/x;

    iget v2, v1, Lws/x;->a:I

    if-ne v0, v2, :cond_8

    invoke-virtual {v1}, Lws/x;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lws/x;

    invoke-virtual {v0}, Lws/x;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lws/x;

    iget-object v0, v0, Lws/x;->c:Lws/w;

    sget-object v1, Lws/w;->e:Lws/w;

    if-ne v0, v1, :cond_4

    sget-object v0, Lcom/google/crypto/tink/internal/a0;->a:Lct/a;

    goto :goto_3

    :cond_4
    sget-object v1, Lws/w;->d:Lws/w;

    if-eq v0, v1, :cond_7

    sget-object v1, Lws/w;->c:Lws/w;

    if-ne v0, v1, :cond_5

    goto :goto_2

    :cond_5
    sget-object v1, Lws/w;->b:Lws/w;

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->b(I)Lct/a;

    move-result-object v0

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown RsaSsaPssParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v2, Lws/x;

    iget-object v2, v2, Lws/x;->c:Lws/w;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_2
    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->a(I)Lct/a;

    move-result-object v0

    :goto_3
    new-instance v1, Lws/z;

    iget-object v2, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v2, Lws/x;

    iget-object v3, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v3, Ljava/math/BigInteger;

    iget-object v4, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-direct {v1, v2, v3, v0, v4}, Lws/z;-><init>(Lws/x;Ljava/math/BigInteger;Lct/a;Ljava/lang/Integer;)V

    return-object v1

    :cond_8
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v3, "Got modulus size "

    const-string v4, ", but parameters requires modulus size "

    invoke-static {v0, v2, v3, v4}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without modulus"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public p(Lxx/e;)V
    .locals 3

    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lyy/j;

    iget-object v1, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v1, Lyy/c;

    invoke-interface {p1}, Lxx/e;->getParams()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lyy/c;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lyy/j;->a(Lyy/b;)V

    return-void
.end method

.method public q(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    iget-object p1, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast p1, Lso/b;

    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/ScheduledFuture;

    iget-object v2, p1, Lso/b;->a:La0/f1;

    monitor-enter v2

    :try_start_0
    iget-object p1, p1, Lso/b;->a:La0/f1;

    invoke-virtual {p1, v0}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    invoke-interface {v1, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public r()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public s()Lr93/i;
    .locals 1

    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lr93/i;

    return-object v0
.end method

.method public t(Leu/t;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Lvp/f;

    new-instance v1, Lup/e;

    invoke-direct {v1, p1}, Lup/e;-><init>(Leu/t;)V

    invoke-virtual {v0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object p1

    invoke-static {p1, v1}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v1, 0x9

    invoke-virtual {v0, p1, v1}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lq30/w0;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-object v1, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v1, Lpg3/p;

    iget-object v1, v1, Lpg3/p;->y:Ljava/lang/Object;

    check-cast v1, Lpg3/p;

    const-string v2, ""

    :goto_0
    if-eqz v1, :cond_1

    iget-object v3, v1, Lpg3/p;->x:Ljava/lang/Object;

    check-cast v3, Lz7/a;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v3, :cond_0

    const-class v2, Lz7/a;

    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result v2

    if-eqz v2, :cond_0

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    invoke-virtual {v0, v2, v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_1
    iget-object v1, v1, Lpg3/p;->y:Ljava/lang/Object;

    check-cast v1, Lpg3/p;

    const-string v2, ", "

    goto :goto_0

    :cond_1
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_0
    .end packed-switch
.end method

.method public u()Lq30/w0;
    .locals 1

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Lq30/w0;

    return-object v0
.end method

.method public v()Landroid/graphics/Typeface;
    .locals 2

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type android.graphics.Typeface"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/Typeface;

    return-object v0
.end method

.method public w()Z
    .locals 3

    iget-object v0, p0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    iget-object v1, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    return v2

    :cond_1
    iget-object v0, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/io/BufferedReader;

    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return v2

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public x(Lko/l;Landroid/net/Uri;Ljava/util/Map;JJLsn/k0;)V
    .locals 7

    new-instance v1, Lwm/f;

    move-object v2, p1

    move-wide v3, p4

    move-wide v5, p6

    invoke-direct/range {v1 .. v6}, Lwm/f;-><init>(Lko/i;JJ)V

    iput-object v1, p0, Lq30/w0;->z:Ljava/lang/Object;

    iget-object p1, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast p1, Lwm/i;

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast p1, Lwm/g;

    monitor-enter p1

    :try_start_0
    new-instance p4, Ljava/util/ArrayList;

    const/16 p5, 0xe

    invoke-direct {p4, p5}, Ljava/util/ArrayList;-><init>(I)V

    const-string p6, "Content-Type"

    invoke-interface {p3, p6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    const/4 p6, 0x0

    const/4 p7, 0x0

    if-eqz p3, :cond_2

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p3, p7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    goto :goto_1

    :cond_2
    :goto_0
    move-object p3, p6

    :goto_1
    invoke-static {p3}, Llo/a;->t(Ljava/lang/String;)I

    move-result p3

    const/4 v0, -0x1

    if-eq p3, v0, :cond_3

    invoke-static {p4, p3}, Lwm/g;->a(Ljava/util/ArrayList;I)V

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto/16 :goto_d

    :cond_3
    :goto_2
    invoke-static {p2}, Llo/a;->u(Landroid/net/Uri;)I

    move-result p2

    if-eq p2, v0, :cond_4

    if-eq p2, p3, :cond_4

    invoke-static {p4, p2}, Lwm/g;->a(Ljava/util/ArrayList;I)V

    :cond_4
    sget-object v0, Lwm/g;->a:[I

    move v2, p7

    :goto_3
    if-ge v2, p5, :cond_6

    aget v5, v0, v2

    if-eq v5, p3, :cond_5

    if-eq v5, p2, :cond_5

    invoke-static {p4, v5}, Lwm/g;->a(Ljava/util/ArrayList;I)V

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [Lwm/i;

    invoke-virtual {p4, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lwm/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    array-length p1, p2

    const/4 p3, 0x1

    if-ne p1, p3, :cond_7

    aget-object p1, p2, p7

    iput-object p1, p0, Lq30/w0;->y:Ljava/lang/Object;

    goto/16 :goto_c

    :cond_7
    array-length p1, p2

    move p4, p7

    :goto_4
    if-ge p4, p1, :cond_d

    aget-object p5, p2, p4

    :try_start_1
    invoke-interface {p5, v1}, Lwm/i;->g(Lwm/j;)Z

    move-result v0

    if-eqz v0, :cond_8

    iput-object p5, p0, Lq30/w0;->y:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iput p7, v1, Lwm/f;->F:I

    goto :goto_a

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto :goto_7

    :cond_8
    iget-object p5, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast p5, Lwm/i;

    if-nez p5, :cond_a

    iget-wide v5, v1, Lwm/f;->z:J

    cmp-long p5, v5, v3

    if-nez p5, :cond_9

    goto :goto_5

    :cond_9
    move p5, p7

    goto :goto_6

    :cond_a
    :goto_5
    move p5, p3

    :goto_6
    invoke-static {p5}, Llo/a;->i(Z)V

    iput p7, v1, Lwm/f;->F:I

    goto :goto_9

    :goto_7
    iget-object p2, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast p2, Lwm/i;

    if-nez p2, :cond_c

    iget-wide p4, v1, Lwm/f;->z:J

    cmp-long p2, p4, v3

    if-nez p2, :cond_b

    goto :goto_8

    :cond_b
    move p3, p7

    :cond_c
    :goto_8
    invoke-static {p3}, Llo/a;->i(Z)V

    iput p7, v1, Lwm/f;->F:I

    throw p1

    :catch_0
    iget-object p5, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast p5, Lwm/i;

    if-nez p5, :cond_a

    iget-wide v5, v1, Lwm/f;->z:J

    cmp-long p5, v5, v3

    if-nez p5, :cond_9

    goto :goto_5

    :goto_9
    add-int/lit8 p4, p4, 0x1

    goto :goto_4

    :cond_d
    :goto_a
    iget-object p1, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast p1, Lwm/i;

    if-nez p1, :cond_10

    new-instance p1, Lcom/google/android/exoplayer2/source/UnrecognizedInputFormatException;

    sget p4, Llo/y;->a:I

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    move p5, p7

    :goto_b
    array-length p8, p2

    if-ge p5, p8, :cond_f

    aget-object p8, p2, p5

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p8

    invoke-virtual {p8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p8

    invoke-virtual {p4, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p8, p2

    sub-int/2addr p8, p3

    if-ge p5, p8, :cond_e

    const-string p8, ", "

    invoke-virtual {p4, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_e
    add-int/lit8 p5, p5, 0x1

    goto :goto_b

    :cond_f
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/16 p4, 0x3a

    invoke-static {p4, p2}, Lq63/c;->b(ILjava/lang/String;)I

    move-result p4

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5, p4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p4, "None of the available extractors ("

    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ") could read the stream."

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p6, p7, p3}, Lcom/google/android/exoplayer2/ParserException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    throw p1

    :cond_10
    :goto_c
    iget-object p1, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast p1, Lwm/i;

    invoke-interface {p1, p8}, Lwm/i;->h(Lwm/k;)V

    return-void

    :goto_d
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p2
.end method

.method public y()Z
    .locals 2

    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lq30/w0;->z:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Lq30/w0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lq30/w0;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public z()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lq30/w0;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    iput-object v1, p0, Lq30/w0;->x:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
