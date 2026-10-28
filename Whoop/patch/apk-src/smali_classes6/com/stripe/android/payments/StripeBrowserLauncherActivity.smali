.class public final Lcom/stripe/android/payments/StripeBrowserLauncherActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/payments/StripeBrowserLauncherActivity;",
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
.field public static final synthetic x:I


# instance fields
.field public final w:Landroidx/lifecycle/y1;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/m;-><init>()V

    new-instance v0, Lut2/a;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lut2/a;-><init>(I)V

    new-instance v1, Landroidx/lifecycle/y1;

    const-class v2, Lv10/r;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lv10/q;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lv10/q;-><init>(Lcom/stripe/android/payments/StripeBrowserLauncherActivity;I)V

    new-instance v4, Lv10/q;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lv10/q;-><init>(Lcom/stripe/android/payments/StripeBrowserLauncherActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->w:Landroidx/lifecycle/y1;

    return-void
.end method


# virtual methods
.method public final o(Lyx/b;)V
    .locals 10

    iget-object v0, p0, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->w:Landroidx/lifecycle/y1;

    invoke-virtual {v0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv10/r;

    iget-object v0, p1, Lyx/b;->z:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    iget-object v3, p1, Lyx/b;->y:Ljava/lang/String;

    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v7, v0

    iget-object v8, p1, Lyx/b;->H:Ljava/lang/String;

    iget-boolean v6, p1, Lyx/b;->I:Z

    new-instance v2, Lv10/b;

    const/4 v5, 0x0

    const/16 v9, 0x26

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v9}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v2}, Lv10/b;->b()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "putExtras(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 23

    move-object/from16 v1, p0

    invoke-super/range {p0 .. p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "getIntent(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "extra_args"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lyx/b;

    const/4 v3, 0x1

    const-string v4, "additionalNonPiiParams"

    const/4 v5, 0x4

    sget-object v6, Lm83/z;->w:Lm83/z;

    sget-object v8, Lqy/e;->b:Lqy/d;

    sget-object v9, Lm83/a0;->w:Lm83/a0;

    const-string v10, "getApplicationContext(...)"

    if-nez v2, :cond_1

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lyy/j;

    sget-object v10, Lbc3/q0;->a:Lkc3/e;

    sget-object v10, Lkc3/d;->w:Lkc3/d;

    invoke-static {v10}, Ls93/k;->c(Ljava/lang/Object;)V

    invoke-direct {v2, v8, v10}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v8, Lb10/b;

    new-instance v10, Lal0/f;

    invoke-direct {v10, v0, v3}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-direct {v8, v0, v9, v10}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    sget-object v0, Lb20/c;->S:Lb20/c;

    const/4 v3, 0x6

    and-int/2addr v3, v5

    if-eqz v3, :cond_0

    move-object v7, v6

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v7}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-virtual {v8, v0, v3}, Lyy/c;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object v0

    invoke-virtual {v2, v0}, Lyy/j;->a(Lyy/b;)V

    return-void

    :cond_1
    iget-object v11, v1, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->w:Landroidx/lifecycle/y1;

    invoke-virtual {v11}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv10/r;

    iget-object v0, v0, Lv10/r;->E:Landroidx/lifecycle/k1;

    const-string v12, "has_launched"

    invoke-virtual {v0, v12}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    const/4 v13, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_2
    move v0, v13

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v1, v2}, Lcom/stripe/android/payments/StripeBrowserLauncherActivity;->o(Lyx/b;)V

    goto/16 :goto_8

    :cond_3
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    new-instance v14, Lv10/p;

    invoke-direct {v14, v13, v1, v2}, Lv10/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v14}, Lg/l;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    invoke-virtual {v11}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lv10/r;

    iget-object v15, v2, Lyx/b;->z:Ljava/lang/String;

    move/from16 p1, v5

    invoke-static {v15}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    iget-object v13, v14, Lv10/r;->y:Lry/a;

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eqz v7, :cond_5

    if-ne v7, v3, :cond_4

    sget-object v7, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Z:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    :goto_2
    move-object/from16 v17, v7

    goto :goto_3

    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_5
    sget-object v7, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Y:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    goto :goto_2

    :goto_3
    iget-object v7, v14, Lv10/r;->w:Lyy/j;

    iget-object v14, v14, Lv10/r;->x:Lb10/b;

    const/16 v21, 0x0

    const/16 v22, 0x3e

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v16, v14

    invoke-static/range {v16 .. v22}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v14

    invoke-virtual {v7, v14}, Lyy/j;->a(Lyy/b;)V

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eqz v7, :cond_7

    if-ne v7, v3, :cond_6

    new-instance v7, Landroid/content/Intent;

    const-string v13, "android.intent.action.VIEW"

    invoke-direct {v7, v13, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    :goto_4
    const/4 v5, 0x0

    goto :goto_6

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_7
    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v7, v2, Lyx/b;->K:Ljava/lang/Integer;

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    const/high16 v13, -0x1000000

    or-int/2addr v7, v13

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v13, Lx/a;

    invoke-direct {v13, v7}, Lx/a;-><init>(Ljava/lang/Integer;)V

    goto :goto_5

    :cond_8
    const/4 v13, 0x0

    :goto_5
    new-instance v7, Lib/i;

    invoke-direct {v7}, Lib/i;-><init>()V

    invoke-virtual {v7}, Lib/i;->d()V

    if-eqz v13, :cond_9

    invoke-virtual {v13}, Lx/a;->c()Landroid/os/Bundle;

    move-result-object v13

    iput-object v13, v7, Lib/i;->f:Ljava/lang/Object;

    :cond_9
    invoke-virtual {v7}, Lib/i;->a()Lq3/i;

    move-result-object v7

    iget-object v7, v7, Lq3/i;->w:Ljava/lang/Object;

    check-cast v7, Landroid/content/Intent;

    invoke-virtual {v7, v5}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    goto :goto_4

    :goto_6
    :try_start_0
    invoke-virtual {v0, v7, v5}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    invoke-virtual {v11}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv10/r;

    iget-object v0, v0, Lv10/r;->E:Landroidx/lifecycle/k1;

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v7, v12}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_8

    :catch_0
    move-exception v0

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Lyy/j;

    sget-object v12, Lbc3/q0;->a:Lkc3/e;

    sget-object v12, Lkc3/d;->w:Lkc3/d;

    invoke-static {v12}, Ls93/k;->c(Ljava/lang/Object;)V

    invoke-direct {v10, v8, v12}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v8, Lb10/b;

    new-instance v12, Lal0/f;

    invoke-direct {v12, v7, v3}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-direct {v8, v7, v9, v12}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    sget-object v7, Lb20/c;->R:Lb20/c;

    sget v9, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v0}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v0

    and-int/lit8 v9, p1, 0x2

    if-eqz v9, :cond_a

    move-object v0, v5

    :cond_a
    and-int v9, p1, p1

    if-eqz v9, :cond_b

    move-object v5, v6

    :cond_b
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v0, :cond_c

    goto :goto_7

    :cond_c
    invoke-static {v0}, Lb20/a;->b(Lcom/stripe/android/core/exception/StripeException;)Ljava/util/Map;

    move-result-object v6

    :goto_7
    invoke-static {v6, v5}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v8, v7, v0}, Lyy/c;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object v0

    invoke-virtual {v10, v0}, Lyy/j;->a(Lyy/b;)V

    invoke-virtual {v11}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv10/r;

    invoke-static {v15}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    new-instance v8, Lcom/stripe/android/core/exception/LocalStripeException;

    iget-object v0, v0, Lv10/r;->z:Ljava/lang/String;

    const-string v5, "failedBrowserLaunchError"

    invoke-direct {v8, v0, v5}, Lcom/stripe/android/core/exception/LocalStripeException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iget-object v6, v2, Lyx/b;->y:Ljava/lang/String;

    invoke-virtual {v4}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_d

    const-string v4, ""

    :cond_d
    move-object v10, v4

    iget-object v11, v2, Lyx/b;->H:Ljava/lang/String;

    iget-boolean v9, v2, Lyx/b;->I:Z

    new-instance v5, Lv10/b;

    const/4 v7, 0x2

    const/16 v12, 0x20

    invoke-direct/range {v5 .. v12}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v5}, Lv10/b;->b()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    const-string v2, "putExtras(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, -0x1

    invoke-virtual {v1, v2, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    :goto_8
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lpf/c;->V(Landroid/view/Window;Z)V

    const v0, 0x1020002

    invoke-virtual {v1, v0}, Lm/m;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lux/f0;

    invoke-direct {v2, v3}, Lux/f0;-><init>(I)V

    sget-object v3, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0, v2}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    return-void
.end method
