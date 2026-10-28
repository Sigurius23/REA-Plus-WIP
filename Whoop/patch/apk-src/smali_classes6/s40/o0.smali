.class public final Ls40/o0;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# instance fields
.field public final a:Lcom/stripe/android/view/PaymentAuthWebViewActivity;

.field public final b:Lqy/d;


# direct methods
.method public constructor <init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;Lqy/d;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    iput-object p1, p0, Ls40/o0;->a:Lcom/stripe/android/view/PaymentAuthWebViewActivity;

    iput-object p2, p0, Ls40/o0;->b:Lqy/d;

    return-void
.end method


# virtual methods
.method public final onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Ls40/o0;->b:Lqy/d;

    invoke-virtual {v1, v0}, Lqy/d;->a(Ljava/lang/String;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z

    move-result p1

    return p1
.end method

.method public final onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1

    new-instance p1, Lm/i;

    iget-object p2, p0, Ls40/o0;->a:Lcom/stripe/android/view/PaymentAuthWebViewActivity;

    const v0, 0x7f1502cc

    invoke-direct {p1, p2, v0}, Lm/i;-><init>(Landroid/content/Context;I)V

    iget-object p2, p1, Lm/i;->a:Lm/e;

    iput-object p3, p2, Lm/e;->f:Ljava/lang/CharSequence;

    new-instance p2, Ls40/n0;

    const/4 p3, 0x0

    invoke-direct {p2, p4, p3}, Ls40/n0;-><init>(Landroid/webkit/JsResult;I)V

    const p3, 0x104000a

    invoke-virtual {p1, p3, p2}, Lm/i;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object p1

    new-instance p2, Ls40/n0;

    const/4 p3, 0x1

    invoke-direct {p2, p4, p3}, Ls40/n0;-><init>(Landroid/webkit/JsResult;I)V

    const/high16 p3, 0x1040000

    invoke-virtual {p1, p3, p2}, Lm/i;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object p1

    invoke-virtual {p1}, Lm/i;->create()Lm/j;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    const/4 p1, 0x1

    return p1
.end method
