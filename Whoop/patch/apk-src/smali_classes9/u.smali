.class public final Lu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lu;->w:I

    iput-object p1, p0, Lu;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget v3, v0, Lu;->w:I

    const/4 v4, -0x1

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    iget-object v10, v0, Lu;->x:Ljava/lang/Object;

    packed-switch v3, :pswitch_data_0

    check-cast v1, Lkotlin/time/Duration;

    invoke-virtual {v1}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v3

    check-cast v10, Lx20/w;

    iget-object v8, v10, Lx20/w;->y:Lec3/h2;

    :cond_0
    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lx20/p;

    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lx20/p;->a(Lx20/p;JLx20/o;ZI)Lx20/p;

    move-result-object v2

    invoke-virtual {v8, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v9

    :pswitch_0
    check-cast v1, Lwx/e;

    check-cast v10, Lcom/stripe/android/attestation/AttestationActivity;

    sget v2, Lcom/stripe/android/attestation/AttestationActivity;->y:I

    new-instance v2, Ll83/k;

    const-string v3, "com.stripe.android.attestation.AttestationActivityContract.extra_result"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v1

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v2, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v1

    const/16 v2, 0x12f3

    invoke-virtual {v10, v2, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {v10}, Landroid/app/Activity;->finish()V

    return-object v9

    :pswitch_1
    check-cast v1, Ljava/lang/Boolean;

    check-cast v10, Lio/sentry/android/replay/video/d;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, v10, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v6, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, v10, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    check-cast v1, Lz23/c;

    iget-object v2, v10, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    check-cast v2, La30/w0;

    iget-object v2, v2, La30/w0;->y:Ljava/lang/Object;

    check-cast v2, Lec3/r1;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, v10, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    move-object v12, v3

    check-cast v12, Ljava/lang/String;

    iget-object v3, v10, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    move-object v13, v3

    check-cast v13, Ljava/lang/String;

    iget-object v3, v10, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v3, Lso/q;

    iget-object v3, v3, Lso/q;->x:Ljava/lang/Object;

    check-cast v3, Lec3/r1;

    iget-object v4, v3, Lec3/r1;->w:Lec3/f2;

    iget-object v3, v3, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v4}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lw23/h;

    iget-object v4, v4, Lw23/h;->b:Ljava/lang/String;

    if-nez v4, :cond_1

    const-string v4, "unknown"

    :cond_1
    move-object/from16 v18, v4

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lw23/h;

    iget-object v4, v4, Lw23/h;->a:Ls93/k;

    if-nez v4, :cond_2

    sget-object v4, Lx23/e;->w:Lx23/e;

    :cond_2
    move-object/from16 v17, v4

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw23/h;

    iget-object v3, v3, Lw23/h;->e:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "sfuId"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "callType"

    invoke-static {v13, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "toString(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v1, Lz23/c;->a:La33/d;

    iget-object v11, v1, Lz23/c;->c:Lz23/a;

    sget-object v14, Lb33/d;->F:Lb33/d;

    sget-object v15, Lb33/g;->x:Lb33/g;

    const/16 v30, 0x0

    const v31, 0x7fcf80

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v25, v2

    move-object/from16 v24, v3

    move-object/from16 v16, v4

    invoke-static/range {v11 .. v31}, Lz23/a;->a(Lz23/a;Ljava/lang/String;Ljava/lang/String;Lb33/f;Lb33/g;Ljava/lang/String;Ls93/k;Ljava/lang/String;Ljava/lang/Long;Lb33/c;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb33/i;Ljava/lang/Boolean;Lw23/t;Ljava/lang/Boolean;Ljava/lang/Boolean;I)Lio/getstream/android/video/generated/models/ClientEvent;

    move-result-object v1

    invoke-virtual {v5, v1}, La33/d;->P(Lio/getstream/android/video/generated/models/ClientEvent;)V

    iget-object v1, v10, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    check-cast v1, Lbc3/c2;

    if-eqz v1, :cond_3

    invoke-virtual {v1, v8}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_3
    iput-object v8, v10, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    :cond_4
    return-object v9

    :pswitch_2
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    check-cast v10, Lw20/b0;

    iget-object v3, v10, Lw20/b0;->b:Lec3/h2;

    :cond_5
    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lw20/y;

    xor-int/lit8 v5, v2, 0x1

    const/4 v6, 0x7

    invoke-static {v4, v8, v5, v6}, Lw20/y;->a(Lw20/y;Lw20/z;ZI)Lw20/y;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    return-object v9

    :pswitch_3
    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_6

    check-cast v10, Lt20/w;

    iget-object v2, v10, Lt20/w;->P:Lg40/z1;

    iget-object v2, v2, Lg40/z1;->j:Lg40/r0;

    invoke-virtual {v2, v1}, Lg40/r0;->s(Ljava/lang/String;)V

    :cond_6
    return-object v9

    :pswitch_4
    check-cast v1, Lsz/g0;

    if-eqz v1, :cond_7

    check-cast v10, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;

    sget v2, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;->z:I

    invoke-virtual {v10, v1}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;->o(Lsz/g0;)V

    :cond_7
    return-object v9

    :pswitch_5
    check-cast v1, Lsz/o;

    if-eqz v1, :cond_8

    check-cast v10, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;

    sget v2, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->z:I

    invoke-virtual {v10, v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->o(Lsz/o;)V

    :cond_8
    return-object v9

    :pswitch_6
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_9

    check-cast v10, Lcom/stripe/android/view/PaymentAuthWebViewActivity;

    sget v1, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->E:I

    invoke-virtual {v10}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->r()Liz/d;

    move-result-object v1

    iget-object v1, v1, Liz/d;->b:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    const-string v2, "progressBar"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_9
    return-object v9

    :pswitch_7
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    check-cast v10, Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v10}, Lcom/stripe/android/view/CardMultilineWidget;->getCardBrandView$payments_core_release()Lcom/stripe/android/view/CardBrandView;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/stripe/android/view/CardBrandView;->setCbcEligible(Z)V

    return-object v9

    :pswitch_8
    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_a

    check-cast v10, Lp00/o;

    invoke-virtual {v10, v1, v2}, Lp00/o;->n(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_a

    move-object v9, v1

    :cond_a
    return-object v9

    :pswitch_9
    check-cast v1, Ljava/lang/String;

    check-cast v10, Lg40/a2;

    if-eqz v10, :cond_b

    iget-object v2, v10, Lg40/a2;->c:Lg40/z1;

    if-eqz v2, :cond_b

    iget-object v3, v2, Lg40/z1;->e:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v2, v2, Lg40/z1;->k:Ln53/e;

    iget-object v2, v2, Ln53/e;->y:Ll83/e;

    check-cast v2, Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg40/k2;

    invoke-virtual {v2}, Lg40/k2;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    :cond_b
    if-eqz v8, :cond_c

    invoke-static {v8}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_d

    :cond_c
    if-eqz v10, :cond_d

    iget-object v2, v10, Lg40/a2;->c:Lg40/z1;

    if-eqz v2, :cond_d

    iget-object v2, v2, Lg40/z1;->j:Lg40/r0;

    if-eqz v2, :cond_d

    invoke-virtual {v2, v1}, Lg40/r0;->s(Ljava/lang/String;)V

    :cond_d
    return-object v9

    :pswitch_a
    check-cast v1, Le10/b0;

    instance-of v2, v1, Le10/a0;

    if-nez v2, :cond_10

    instance-of v2, v1, Le10/z;

    if-eqz v2, :cond_e

    goto :goto_0

    :cond_e
    instance-of v2, v1, Le10/y;

    if-eqz v2, :cond_f

    check-cast v10, Ln20/i;

    check-cast v1, Le10/y;

    iget-object v1, v1, Le10/y;->a:Le10/x;

    invoke-static {v10, v1}, Ln20/i;->a(Ln20/i;Le10/x;)V

    goto :goto_0

    :cond_f
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_10
    :goto_0
    return-object v9

    :pswitch_b
    check-cast v1, Llz/g;

    check-cast v10, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;

    instance-of v2, v1, Llz/e;

    if-eqz v2, :cond_12

    iget-object v2, v10, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->w:Landroid/webkit/WebView;

    if-eqz v2, :cond_11

    check-cast v1, Llz/e;

    iget-object v1, v1, Llz/e;->a:Ljava/lang/String;

    invoke-virtual {v2, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_1

    :cond_11
    const-string v1, "webView"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v8

    :cond_12
    instance-of v2, v1, Llz/d;

    if-eqz v2, :cond_13

    check-cast v1, Llz/d;

    iget-object v1, v1, Llz/d;->a:Lkz/h;

    sget v2, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->z:I

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    new-instance v3, Ll83/k;

    const-string v5, "com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result"

    invoke-direct {v3, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v10, v4, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {v10}, Landroid/app/Activity;->finish()V

    goto :goto_1

    :cond_13
    instance-of v2, v1, Llz/f;

    if-eqz v2, :cond_14

    check-cast v1, Llz/f;

    iget-object v1, v1, Llz/f;->a:Ljava/lang/String;

    sget v2, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->z:I

    new-instance v2, Lib/i;

    invoke-direct {v2}, Lib/i;-><init>()V

    invoke-virtual {v2}, Lib/i;->e()V

    invoke-virtual {v2}, Lib/i;->d()V

    iget-object v3, v2, Lib/i;->c:Ljava/lang/Object;

    check-cast v3, Landroid/content/Intent;

    const-string v4, "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON"

    invoke-virtual {v3, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {v2}, Lib/i;->a()Lq3/i;

    move-result-object v2

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v2, v10, v1}, Lq3/i;->h(Landroid/content/Context;Landroid/net/Uri;)V

    :goto_1
    return-object v9

    :cond_14
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :pswitch_c
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v2

    check-cast v10, Lgm/r;

    iget-object v1, v10, Lgm/r;->x:Ljava/lang/Object;

    check-cast v1, Lxl/a;

    iget-object v1, v1, Lxl/a;->x:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lec3/h2;

    :cond_15
    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lm43/b;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const/16 v16, 0x0

    const/16 v17, 0x3d

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Lm43/b;->a(Lm43/b;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/Integer;La30/w0;Li43/b;ZLjava/lang/Long;I)Lm43/b;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    return-object v9

    :pswitch_d
    move-object v11, v1

    check-cast v11, Lj00/i0;

    check-cast v10, Lj00/h;

    iget-object v2, v10, Lj00/h;->H:Lec3/h2;

    :cond_16
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lj00/k;

    const/4 v14, 0x0

    const/16 v15, 0xffe

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lj00/k;->a(Lj00/k;Lj00/i0;ZZLn00/d;I)Lj00/k;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    return-object v9

    :pswitch_e
    check-cast v1, Lt23/c0;

    check-cast v10, Li43/b;

    if-eqz v1, :cond_17

    iput-object v1, v10, Li43/b;->b:Lt23/c0;

    :cond_17
    sget v2, Li43/b;->d:I

    invoke-virtual {v10}, Li43/b;->a()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_19

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    if-eqz v1, :cond_18

    iget-object v1, v1, Lt23/c0;->v:Ljava/lang/String;

    goto :goto_2

    :cond_18
    move-object v1, v8

    :goto_2
    const-string v3, "Collected call: "

    invoke-static {v3, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v5, v4, v1, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_19
    return-object v9

    :pswitch_f
    check-cast v1, Li20/m;

    check-cast v10, Li20/j1;

    iget-object v3, v10, Li20/j1;->I:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li20/b;

    if-eqz v1, :cond_1a

    invoke-interface {v1}, Li20/m;->a()Lh20/x0;

    move-result-object v5

    goto :goto_3

    :cond_1a
    move-object v5, v8

    :goto_3
    new-instance v6, Li20/b;

    if-eqz v4, :cond_1b

    iget-object v7, v4, Li20/b;->w:Ljava/lang/String;

    goto :goto_4

    :cond_1b
    move-object v7, v8

    :goto_4
    if-nez v5, :cond_1d

    if-eqz v4, :cond_1c

    iget-object v5, v4, Li20/b;->x:Lh20/x0;

    goto :goto_5

    :cond_1c
    move-object v5, v8

    :cond_1d
    :goto_5
    if-eqz v4, :cond_1e

    iget-object v11, v4, Li20/b;->y:Ljava/lang/String;

    goto :goto_6

    :cond_1e
    move-object v11, v8

    :goto_6
    if-eqz v4, :cond_1f

    iget-object v4, v4, Li20/b;->z:Ljava/lang/Boolean;

    goto :goto_7

    :cond_1f
    move-object v4, v8

    :goto_7
    invoke-direct {v6, v7, v5, v11, v4}, Li20/b;-><init>(Ljava/lang/String;Lh20/x0;Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-static {v6, v8}, Li20/l1;->p(Li20/b;Lh20/i1;)Ljava/util/Map;

    move-result-object v4

    instance-of v5, v1, Li20/l;

    if-eqz v5, :cond_20

    iget-object v1, v10, Li20/j1;->z:Leg/j;

    if-eqz v1, :cond_22

    new-instance v5, Lg40/w;

    invoke-direct {v5, v4}, Lg40/w;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1, v5}, Leg/j;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_20
    instance-of v5, v1, Li20/k;

    if-eqz v5, :cond_21

    iget-object v1, v10, Li20/j1;->z:Leg/j;

    if-eqz v1, :cond_22

    new-instance v5, Lg40/x;

    invoke-direct {v5, v4}, Lg40/x;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1, v5}, Leg/j;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_21
    if-nez v1, :cond_23

    :cond_22
    :goto_8
    invoke-virtual {v3, v6, v2}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    return-object v9

    :cond_23
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :pswitch_10
    check-cast v1, Ljava/lang/String;

    move-object v2, v10

    check-cast v2, Li20/v0;

    iget-object v3, v2, Li20/v0;->H:Lg40/d3;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_25

    iget-object v1, v3, Lg40/d3;->z:Lec3/p1;

    :cond_24
    move-object v2, v1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lg40/r3;

    invoke-virtual {v2, v3, v8}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_24

    goto :goto_9

    :cond_25
    iget-object v3, v3, Lg40/d3;->z:Lec3/p1;

    :cond_26
    move-object v1, v3

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lg40/r3;

    new-instance v5, Lg40/q3;

    new-instance v6, Lh02/n0;

    const/16 v8, 0xb

    invoke-direct {v6, v2, v8}, Lh02/n0;-><init>(Ljava/lang/Object;I)V

    const/4 v8, 0x2

    const v10, 0x7f0807c4

    invoke-direct {v5, v10, v7, v6, v8}, Lg40/q3;-><init>(IZLh02/n0;I)V

    invoke-virtual {v1, v4, v5}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_26

    :goto_9
    return-object v9

    :pswitch_11
    check-cast v1, Lq20/y;

    check-cast v10, Lh20/z;

    if-eqz v1, :cond_27

    iget-object v2, v10, Lh20/z;->b:Ljava/lang/String;

    iget-object v3, v10, Lh20/z;->d:Le30/a;

    invoke-virtual {v3}, Le30/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lq20/y;->f(Ljava/lang/String;Z)Lzy/c;

    move-result-object v2

    goto :goto_a

    :cond_27
    move-object v2, v8

    :goto_a
    instance-of v3, v1, Lq20/w;

    if-eqz v3, :cond_28

    move-object v8, v1

    check-cast v8, Lq20/w;

    :cond_28
    if-eqz v8, :cond_29

    iget-object v1, v8, Lq20/w;->x:Ly00/o4;

    iget-object v1, v1, Ly00/o4;->E:Ly00/f4;

    sget-object v3, Ly00/f4;->L:Ly00/f4;

    if-ne v1, v3, :cond_29

    move v6, v7

    :cond_29
    invoke-virtual {v10, v2, v6}, Lh20/z;->a(Lzy/c;Z)V

    return-object v9

    :pswitch_12
    check-cast v1, Lq20/y;

    check-cast v10, Lh20/g;

    iget-object v2, v10, Lh20/g;->f:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_2a

    invoke-static {v1}, Lug/m;->D(Lq20/y;)Ljava/lang/String;

    move-result-object v8

    :cond_2a
    iget-object v1, v10, Lh20/g;->j:Landroidx/lifecycle/k1;

    if-eqz v8, :cond_2c

    invoke-virtual {v10, v8}, Lh20/g;->c(Ljava/lang/String;)Lh20/v;

    move-result-object v2

    sget-object v3, Lh20/t;->b:Lh20/t;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2b

    goto :goto_b

    :cond_2b
    const-string v2, "previously_completed_payment_form"

    invoke-virtual {v1, v2}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2c

    iget-object v3, v10, Lh20/g;->i:Lk20/a;

    invoke-virtual {v3, v8}, Lk20/a;->n(Ljava/lang/String;)V

    invoke-virtual {v1, v8, v2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2c
    :goto_b
    return-object v9

    :pswitch_13
    check-cast v1, Lg20/d;

    if-eqz v1, :cond_2d

    check-cast v10, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;

    sget v2, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->z:I

    invoke-virtual {v10, v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->o(Lg20/d;)V

    :cond_2d
    return-object v9

    :pswitch_14
    check-cast v1, Lfy/d;

    check-cast v10, Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;

    sget v2, Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;->y:I

    new-instance v2, Ll83/k;

    const-string v3, "com.stripe.android.challenge.warmer.activity.PassiveChallengeWarmerContract.extra_result"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v1

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v2, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v1

    const/16 v2, 0x121f

    invoke-virtual {v10, v2, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {v10}, Landroid/app/Activity;->finish()V

    return-object v9

    :pswitch_15
    check-cast v1, Ldy/f;

    check-cast v10, Lcom/stripe/android/challenge/passive/PassiveChallengeActivity;

    sget v2, Lcom/stripe/android/challenge/passive/PassiveChallengeActivity;->y:I

    new-instance v2, Ll83/k;

    const-string v3, "com.stripe.android.challenge.PassiveChallengeActivityContract.extra_result"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v1

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v2, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v1

    const/16 v2, 0x121e

    invoke-virtual {v10, v2, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {v10}, Landroid/app/Activity;->finish()V

    return-object v9

    :pswitch_16
    check-cast v1, Ll83/a0;

    check-cast v10, Ld30/v;

    iget-object v1, v10, Ld30/v;->j:Lq83/j;

    new-instance v3, La13/h;

    invoke-direct {v3, v10, v8, v5}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v3, v2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_2e

    move-object v9, v1

    :cond_2e
    return-object v9

    :pswitch_17
    check-cast v1, Ll83/a0;

    check-cast v10, Ld1/j;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-lt v1, v2, :cond_2f

    invoke-virtual {v10}, Ld1/j;->y()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v1

    iget-object v2, v10, Ld1/j;->x:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    invoke-static {v1, v2}, Lc4/v;->l(Landroid/view/inputmethod/InputMethodManager;Landroid/view/View;)V

    :cond_2f
    return-object v9

    :pswitch_18
    check-cast v1, Lo20/b;

    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-interface {v10, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v9

    :pswitch_19
    check-cast v1, Lb30/z0;

    check-cast v10, Ld1/j;

    iget-object v2, v10, Ld1/j;->y:Ljava/lang/Object;

    check-cast v2, Ls00/b;

    iget-object v1, v1, Lb30/z0;->b:Lv00/c0;

    check-cast v2, Ls00/a;

    iget-object v3, v2, Ls00/a;->c:Landroidx/lifecycle/k1;

    iget-object v4, v2, Ls00/a;->e:Lec3/r1;

    const-string v5, "paymentMethodMetadata"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Lv00/c0;->l0:La30/l0;

    if-eqz v1, :cond_30

    iget-object v8, v1, La30/l0;->w:Lwz/g0;

    :cond_30
    sget-object v1, Ls00/f;->w:Ls00/f;

    const-string v5, "it"

    const-string v6, "LINK_EMBEDDED_STATE_KEY"

    if-nez v8, :cond_31

    iget-object v2, v4, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls00/c;

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ls00/c;

    invoke-direct {v2, v1}, Ls00/c;-><init>(Ls00/g;)V

    invoke-virtual {v3, v2, v6}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_c

    :cond_31
    iget-object v2, v2, Ls00/a;->b:Lwz/l1;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v8}, Lwz/l1;->b(Lwz/g0;)Ln20/e;

    move-result-object v2

    invoke-virtual {v2}, Ln20/e;->b()Lb00/a;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v4, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls00/c;

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ls00/c;

    invoke-direct {v2, v1}, Ls00/c;-><init>(Ls00/g;)V

    invoke-virtual {v3, v2, v6}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_c
    return-object v9

    :pswitch_1a
    check-cast v10, Landroidx/lifecycle/q0;

    check-cast v10, Landroidx/lifecycle/r0;

    invoke-virtual {v10, v1, v2}, Landroidx/lifecycle/r0;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_32

    move-object v9, v1

    :cond_32
    return-object v9

    :pswitch_1b
    check-cast v1, La20/f;

    check-cast v10, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;

    instance-of v2, v1, La20/e;

    if-eqz v2, :cond_34

    check-cast v1, La20/e;

    iget-object v2, v10, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->x:Lkz/o;

    if-eqz v2, :cond_33

    new-instance v3, Ljz/f;

    iget-object v4, v1, La20/e;->b:Ljava/lang/String;

    iget-object v5, v1, La20/e;->a:Ljava/lang/String;

    iget-object v6, v1, La20/e;->c:Ljava/lang/String;

    invoke-direct {v3, v4, v5, v6}, Ljz/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v1, La20/e;->d:Ljz/e;

    invoke-interface {v2, v3, v1}, Lkz/o;->c(Ljz/f;Ljz/e;)V

    goto :goto_d

    :cond_33
    const-string v1, "financialConnectionsLauncher"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v8

    :cond_34
    instance-of v2, v1, La20/d;

    if-eqz v2, :cond_35

    check-cast v1, La20/d;

    sget v2, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->z:I

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    new-instance v3, Lz10/f;

    iget-object v1, v1, La20/d;->a:Lz10/r;

    invoke-direct {v3, v1}, Lz10/f;-><init>(Lz10/r;)V

    new-instance v1, Ll83/k;

    const-string v5, "com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result"

    invoke-direct {v1, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v10, v4, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {v10}, Landroid/app/Activity;->finish()V

    :goto_d
    return-object v9

    :cond_35
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :pswitch_1c
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    check-cast v10, Lc93/a;

    invoke-interface {v10}, Lc93/a;->invoke()Ljava/lang/Object;

    return-object v9

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
