.class public final Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;
.super Landroid/webkit/WebView;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;",
        "Landroid/webkit/WebView;",
        "Landroid/webkit/WebViewClient;",
        "client",
        "Ll83/a0;",
        "setWebViewClient",
        "(Landroid/webkit/WebViewClient;)V",
        "Lt30/z;",
        "listener",
        "setOnHtmlSubmitListener$3ds2sdk_release",
        "(Lt30/z;)V",
        "setOnHtmlSubmitListener",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final w:Lcom/iterable/iterableapi/i2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Lcom/iterable/iterableapi/i2;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, Lcom/iterable/iterableapi/i2;-><init>(I)V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;->w:Lcom/iterable/iterableapi/i2;

    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    const/4 v1, 0x2

    invoke-virtual {p2, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    invoke-virtual {p2, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {p2, v0}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/webkit/WebSettings;->setBlockNetworkImage(Z)V

    invoke-virtual {p2, v0}, Landroid/webkit/WebSettings;->setBlockNetworkLoads(Z)V

    invoke-super {p0, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method


# virtual methods
.method public final setOnHtmlSubmitListener$3ds2sdk_release(Lt30/z;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;->w:Lcom/iterable/iterableapi/i2;

    iput-object p1, v0, Lcom/iterable/iterableapi/i2;->b:Ljava/lang/Object;

    return-void
.end method

.method public setWebViewClient(Landroid/webkit/WebViewClient;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
