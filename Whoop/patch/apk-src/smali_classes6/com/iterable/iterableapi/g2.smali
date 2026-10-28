.class public final Lcom/iterable/iterableapi/g2;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lcom/iterable/iterableapi/g2;->a:I

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/iterable/iterableapi/g2;->a:I

    iput-object p1, p0, Lcom/iterable/iterableapi/g2;->b:Ljava/lang/Object;

    .line 2
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 4

    iget p1, p0, Lcom/iterable/iterableapi/g2;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lcom/iterable/iterableapi/g2;->b:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;

    iget-object v0, p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->x:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    const-string v2, "progressBar"

    if-eqz v0, :cond_2

    const/16 v3, 0x64

    if-ge p2, v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    const/16 v3, 0x8

    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->x:Landroid/widget/ProgressBar;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    return-void

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    const/16 p1, 0x64

    if-ne p2, p1, :cond_3

    iget-object p1, p0, Lcom/iterable/iterableapi/g2;->b:Ljava/lang/Object;

    check-cast p1, Lcom/iterable/iterableapi/v0;

    invoke-virtual {p1}, Lcom/iterable/iterableapi/v0;->G()V

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
