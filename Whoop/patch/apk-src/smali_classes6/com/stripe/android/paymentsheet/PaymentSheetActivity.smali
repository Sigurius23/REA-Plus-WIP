.class public final Lcom/stripe/android/paymentsheet/PaymentSheetActivity;
.super Lb30/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb30/j;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0007\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheetActivity;",
        "Lb30/j;",
        "Lh20/b4;",
        "<init>",
        "()V",
        "",
        "isProcessing",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic z:I


# instance fields
.field public final w:La20/h;

.field public final x:Landroidx/lifecycle/y1;

.field public final y:Ll83/p;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/m;-><init>()V

    new-instance v0, La20/h;

    new-instance v1, Lh20/s3;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lh20/s3;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetActivity;I)V

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, La20/h;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->w:La20/h;

    new-instance v0, Lh20/s3;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lh20/s3;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetActivity;I)V

    new-instance v1, Landroidx/lifecycle/y1;

    const-class v2, Lh20/k4;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lh20/v3;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lh20/v3;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetActivity;I)V

    new-instance v4, Lh20/v3;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lh20/v3;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->x:Landroidx/lifecycle/y1;

    new-instance v0, Lh20/s3;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lh20/s3;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->y:Ll83/p;

    return-void
.end method


# virtual methods
.method public final bridge synthetic o()Le30/c;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->p()Lh20/k4;

    move-result-object v0

    return-object v0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 7

    invoke-super {p0, p1}, Lb30/j;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->y:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh20/w3;

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "PaymentSheet started without arguments."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    new-instance v0, Lh20/a4;

    invoke-direct {v0, p1}, Lh20/a4;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->r(Lh20/b4;)V

    invoke-virtual {p0}, Lb30/j;->finish()V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p1, Lh20/w3;->x:Lh20/x1;

    iget-object v1, p1, Lh20/w3;->w:La30/t0;

    invoke-virtual {v1}, La30/t0;->f()V

    invoke-static {v0}, Lio/sentry/config/a;->m(Lh20/x1;)Lmy/a;

    move-result-object v1

    sget-object v2, Lux/y;->y:Lux/y;

    if-nez v2, :cond_3

    new-instance v2, Lux/x;

    invoke-direct {v2, p0}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object v2, v2, Lux/x;->a:Landroid/content/SharedPreferences;

    const-string v3, "key_publishable_key"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    new-instance v5, Lux/y;

    const-string v6, "key_account_id"

    invoke-interface {v2, v6, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v3, v2}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v2, v5

    goto :goto_0

    :cond_1
    move-object v2, v4

    :goto_0
    if-eqz v2, :cond_2

    sput-object v2, Lux/y;->y:Lux/y;

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    iget-object v2, v2, Lux/y;->w:Ljava/lang/String;

    const-string v3, "pk_test"

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    iget-object p1, p1, Lh20/w3;->y:Ljava/lang/String;

    invoke-virtual {v1, p1, v2}, Lmy/a;->b(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, v0, Lh20/x1;->H:Lh20/h1;

    invoke-static {p1}, Luf/c0;->f0(Lh20/h1;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->p()Lh20/k4;

    move-result-object p1

    iget-object v0, p1, Le30/c;->J:Li20/y0;

    invoke-virtual {v0, p0, p0}, Li20/y0;->a(Lg/l;Lg/l;)V

    iget-object p1, p1, Lh20/k4;->s0:Le10/r0;

    invoke-virtual {p1, p0, p0}, Le10/r0;->f(Lj/c;Landroidx/lifecycle/g0;)V

    invoke-static {p0}, Ldp/d;->n(Lb30/j;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->p()Lh20/k4;

    move-result-object p1

    iget-object p1, p1, Le30/c;->Y:Lk20/d;

    invoke-virtual {p1}, Lk20/d;->a()V

    :cond_4
    new-instance p1, Lh20/u3;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lh20/u3;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetActivity;I)V

    new-instance v0, Lx1/b;

    const v1, 0x1cebc00c

    invoke-direct {v0, p1, v3, v1}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, v0}, Lh/f;->a(Lg/l;Lx1/b;)V

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lh20/a4;

    invoke-direct {v0, p1}, Lh20/a4;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->r(Lh20/b4;)V

    invoke-virtual {p0}, Lb30/j;->finish()V

    return-void
.end method

.method public final p()Lh20/k4;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {v0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/k4;

    return-object v0
.end method

.method public final r(Lh20/b4;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    new-instance v1, Lh20/x3;

    invoke-direct {v1, p1}, Lh20/x3;-><init>(Lh20/b4;)V

    new-instance p1, Ll83/k;

    const-string v2, "com.stripe.android.paymentsheet.PaymentSheetContract.extra_result"

    invoke-direct {p1, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    return-void
.end method
