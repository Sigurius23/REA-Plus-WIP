.class public final Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;",
        "Lm/m;",
        "<init>",
        "()V",
        "payments-core_release"
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
.field public final w:Ll83/p;

.field public final x:La20/h;

.field public final y:Landroidx/lifecycle/y1;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/m;-><init>()V

    new-instance v0, Lg20/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lg20/e;-><init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->w:Ll83/p;

    new-instance v0, La20/h;

    new-instance v1, Lg20/e;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lg20/e;-><init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;I)V

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, La20/h;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->x:La20/h;

    new-instance v0, Lg20/e;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lg20/e;-><init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;I)V

    new-instance v1, Landroidx/lifecycle/y1;

    const-class v2, Lg20/r;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lg20/f;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lg20/f;-><init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;I)V

    new-instance v4, Lg20/f;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lg20/f;-><init>(Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->y:Landroidx/lifecycle/y1;

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    invoke-static {p0}, Lb3/g1;->c(Landroid/app/Activity;)V

    return-void
.end method

.method public final o(Lg20/d;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ll83/k;

    const-string v2, "extra_args"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->finish()V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 11

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lm/m;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f140fe9

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    :try_start_0
    iget-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->w:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg20/l;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "PaymentLauncherConfirmationActivity was started without arguments"

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    const/4 v1, 0x1

    const-string v2, "additionalNonPiiParams"

    sget-object v3, Lm83/z;->w:Lm83/z;

    const/4 v4, 0x4

    const/4 v9, 0x0

    sget-object v5, Lqy/e;->b:Lqy/d;

    sget-object v6, Lm83/a0;->w:Lm83/a0;

    const-string v7, "getApplicationContext(...)"

    if-nez v0, :cond_12

    check-cast p1, Lg20/l;

    invoke-virtual {p1}, Lg20/l;->x()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance p1, Lg20/c;

    invoke-direct {p1, v0}, Lg20/c;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->o(Lg20/d;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lyy/j;

    sget-object v8, Lbc3/q0;->a:Lkc3/e;

    sget-object v8, Lkc3/d;->w:Lkc3/d;

    invoke-static {v8}, Ls93/k;->c(Ljava/lang/Object;)V

    invoke-direct {v7, v5, v8}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v5, Lb10/b;

    new-instance v8, Lal0/f;

    invoke-direct {v8, p1, v1}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-direct {v5, p1, v6, v8}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    sget-object p1, Lb20/c;->Q:Lb20/c;

    sget v1, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v0}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v0

    and-int/lit8 v1, v4, 0x2

    if-eqz v1, :cond_1

    move-object v0, v9

    :cond_1
    and-int v1, v4, v4

    if-eqz v1, :cond_2

    move-object v9, v3

    :cond_2
    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lb20/a;->b(Lcom/stripe/android/core/exception/StripeException;)Ljava/util/Map;

    move-result-object v3

    :goto_1
    invoke-static {v3, v9}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v5, p1, v0}, Lyy/c;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object p1

    invoke-virtual {v7, p1}, Lyy/j;->a(Lyy/b;)V

    return-void

    :cond_4
    invoke-virtual {p0}, Lg/l;->getOnBackPressedDispatcher()Lg/z;

    move-result-object v0

    new-instance v2, Lg1/u4;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lg1/u4;-><init>(I)V

    const/4 v3, 0x3

    invoke-static {v0, v9, v2, v3}, Lo73/a;->n(Lg/z;Lc4/d0;Lkotlin/jvm/functions/Function1;I)V

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v2, La20/b;

    const/16 v4, 0x16

    invoke-direct {v2, p0, v9, v4}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v9, v9, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->p()Lg20/r;

    move-result-object v0

    iget-object v2, v0, Lg20/r;->y:Lc20/a;

    new-instance v4, Lg20/q;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v5}, Lg20/q;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Lc20/a;->a()Ln83/i;

    move-result-object v6

    invoke-virtual {v6}, Ln83/i;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    move-object v7, v6

    check-cast v7, Li6/c;

    invoke-virtual {v7}, Li6/c;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    move-object v7, v6

    check-cast v7, Ln83/d;

    invoke-virtual {v7}, Ln83/d;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lc20/e;

    invoke-virtual {v7, p0, v4}, Lc20/e;->b(Lj/c;Lj/b;)V

    goto :goto_2

    :cond_5
    new-instance v6, Lcom/stripe/android/PaymentRelayContract;

    invoke-direct {v6}, Lcom/stripe/android/PaymentRelayContract;-><init>()V

    invoke-interface {p0, v6, v4}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v6

    iput-object v6, v2, Lc20/a;->e:Lj/d;

    new-instance v6, Lcom/stripe/android/auth/PaymentBrowserAuthContract;

    invoke-direct {v6}, Lcom/stripe/android/auth/PaymentBrowserAuthContract;-><init>()V

    invoke-interface {p0, v6, v4}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v4

    iput-object v4, v2, Lc20/a;->f:Lj/d;

    invoke-interface {p0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v2

    new-instance v4, Le10/q0;

    invoke-direct {v4, v0, v1}, Le10/q0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v4}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    invoke-virtual {p1}, Lg20/l;->k()Ljava/lang/Integer;

    move-result-object v0

    new-instance v8, Ls40/a;

    invoke-direct {v8, p0, v0}, Ls40/a;-><init>(Lg/l;Ljava/lang/Integer;)V

    instance-of v0, p1, Lg20/h;

    const-string v1, "key_has_started"

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->p()Lg20/r;

    move-result-object v6

    check-cast p1, Lg20/h;

    iget-object v7, p1, Lg20/h;->F:Ly00/s;

    const-string p1, "confirmStripeIntentParams"

    invoke-static {v7, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v6, Lg20/r;->K:Landroidx/lifecycle/k1;

    invoke-virtual {p1, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    :cond_6
    if-eqz v5, :cond_7

    goto/16 :goto_4

    :cond_7
    invoke-static {v6}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v5, Lb2/y;

    const/16 v10, 0x8

    invoke-direct/range {v5 .. v10}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, v9, v9, v5, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto/16 :goto_4

    :cond_8
    instance-of v0, p1, Lg20/g;

    if-eqz v0, :cond_c

    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->p()Lg20/r;

    move-result-object v0

    check-cast p1, Lg20/g;

    iget-object p1, p1, Lg20/g;->G:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    instance-of v1, p1, Ll83/m;

    if-eqz v1, :cond_9

    goto :goto_3

    :cond_9
    move-object v9, p1

    :goto_3
    check-cast v9, Ll83/k;

    if-eqz v9, :cond_a

    iget-object p1, v9, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_b

    :cond_a
    const-string p1, "UNKNOWN"

    :cond_b
    invoke-virtual {v0, p1, v8}, Lg20/r;->j(Ljava/lang/String;Ls40/a;)V

    goto :goto_4

    :cond_c
    instance-of v0, p1, Lg20/i;

    if-eqz v0, :cond_d

    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->p()Lg20/r;

    move-result-object v0

    check-cast p1, Lg20/i;

    iget-object p1, p1, Lg20/i;->F:Ljava/lang/String;

    invoke-virtual {v0, p1, v8}, Lg20/r;->j(Ljava/lang/String;Ls40/a;)V

    goto :goto_4

    :cond_d
    instance-of v0, p1, Lg20/j;

    if-eqz v0, :cond_e

    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->p()Lg20/r;

    move-result-object v0

    check-cast p1, Lg20/j;

    iget-object p1, p1, Lg20/j;->F:Ljava/lang/String;

    invoke-virtual {v0, p1, v8}, Lg20/r;->j(Ljava/lang/String;Ls40/a;)V

    goto :goto_4

    :cond_e
    instance-of v0, p1, Lg20/k;

    if-eqz v0, :cond_11

    invoke-virtual {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->p()Lg20/r;

    move-result-object v6

    check-cast p1, Lg20/k;

    iget-object v7, p1, Lg20/k;->F:Ly00/c8;

    const-string p1, "intent"

    invoke-static {v7, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v6, Lg20/r;->K:Landroidx/lifecycle/k1;

    invoke-virtual {p1, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    :cond_f
    if-eqz v5, :cond_10

    goto :goto_4

    :cond_10
    invoke-static {v6}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v5, Lg20/p;

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v10}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, v9, v9, v5, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_4
    return-void

    :cond_11
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_12
    new-instance p1, Lg20/c;

    invoke-direct {p1, v0}, Lg20/c;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->o(Lg20/d;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lyy/j;

    sget-object v8, Lbc3/q0;->a:Lkc3/e;

    sget-object v8, Lkc3/d;->w:Lkc3/d;

    invoke-static {v8}, Ls93/k;->c(Ljava/lang/Object;)V

    invoke-direct {v7, v5, v8}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v5, Lb10/b;

    new-instance v8, Lal0/f;

    invoke-direct {v8, p1, v1}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-direct {v5, p1, v6, v8}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    sget-object p1, Lb20/c;->P:Lb20/c;

    sget v1, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v0}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v0

    and-int/lit8 v1, v4, 0x2

    if-eqz v1, :cond_13

    move-object v0, v9

    :cond_13
    and-int v1, v4, v4

    if-eqz v1, :cond_14

    move-object v9, v3

    :cond_14
    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v0, :cond_15

    goto :goto_5

    :cond_15
    invoke-static {v0}, Lb20/a;->b(Lcom/stripe/android/core/exception/StripeException;)Ljava/util/Map;

    move-result-object v3

    :goto_5
    invoke-static {v3, v9}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v5, p1, v0}, Lyy/c;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object p1

    invoke-virtual {v7, p1}, Lyy/j;->a(Lyy/b;)V

    return-void
.end method

.method public final p()Lg20/r;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->y:Landroidx/lifecycle/y1;

    invoke-virtual {v0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg20/r;

    return-object v0
.end method
