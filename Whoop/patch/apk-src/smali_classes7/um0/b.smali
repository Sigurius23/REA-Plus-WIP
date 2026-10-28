.class public final synthetic Lum0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lum0/b;->w:I

    iput-object p2, p0, Lum0/b;->x:Ljava/lang/Object;

    iput-object p3, p0, Lum0/b;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lum0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    check-cast p1, Liz/d;

    const-string v2, "$this$AndroidViewBinding"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p1, Liz/d;

    if-eqz p1, :cond_0

    iget-object p1, p1, Liz/d;->b:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lx20/w;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/g0;

    check-cast p1, Lp1/i0;

    const-string v2, "$this$DisposableEffect"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lx20/l;

    invoke-direct {p1, v0}, Lx20/l;-><init>(Lx20/w;)V

    invoke-interface {v1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    new-instance v0, Ld0/b2;

    const/4 v2, 0x7

    invoke-direct {v0, v2, v1, p1}, Ld0/b2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, p1}, Lwo1/h0;->a(Ljava/util/List;Lp1/c1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lso1/t;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lwo1/o;->g(Lso1/t;Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lso1/d;

    invoke-static {v0, v1, p1}, Lwo1/k;->e(Lkotlin/jvm/functions/Function1;Lso1/d;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lwe1/k;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lwe1/l;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lwe1/k;->d(Lwe1/k;Lwe1/l;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lwc/x0;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lmg/h;

    check-cast p1, Lkd/e;

    const-string v2, "$this$fromEnvironment"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lwc/x0;->x:Ljava/lang/String;

    iput-object v2, p1, Lkd/e;->d:Ljava/lang/String;

    iget-object v0, v0, Lwc/x0;->z:Lpf/a;

    iget-object v2, p1, Lkd/e;->a:Lzt/q;

    invoke-virtual {v2, v0}, Lzt/q;->G(Lpf/a;)V

    iput-object v1, p1, Lkd/e;->j:Lmg/h;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lw71/v;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, v1, p1}, Lw71/x;->b(Lkotlin/jvm/functions/Function1;Lw71/v;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lw71/t;

    invoke-static {v0, v1, p1}, Lw71/u;->a(Lkotlin/jvm/functions/Function1;Lw71/t;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lw51/f;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Li2/x;

    check-cast p1, Lk2/e;

    invoke-static {v0, v1, p1}, Lw51/g;->c(Lw51/f;Li2/x;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lw21/b$a;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, p1}, Lw21/c;->b(Lw21/b$a;Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lw11/c;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lw11/b;->b(Lw11/c;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/g0;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Luy1/e;

    check-cast p1, Lp1/i0;

    invoke-static {v0, v1, p1}, Lvy1/b;->n(Landroidx/lifecycle/g0;Luy1/e;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lvx0/e;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lvx0/c;->k(Lp1/t2;Lvx0/e;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Luv2/c$b;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lvv2/e;->g(Luv2/c$b;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lvv2/a;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Ll83/h;

    check-cast p1, Luv2/a;

    invoke-static {v0, v1, p1}, Lvv2/e;->h(Lvv2/a;Ll83/h;Luv2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lvt2/h;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lwt2/p;

    invoke-static {v0, v1, p1}, Lvt2/f;->n(Lvt2/h;Lwt2/p;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lus2/f$c;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lvs2/e;->m(Lus2/f$c;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Ltp1/i;

    invoke-static {v0, v1, p1}, Lvp1/h;->q(Lkotlin/jvm/functions/Function1;Ltp1/i;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Ltp1/q;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lvp1/h;->Q(Ltp1/q;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lso1/h0;

    invoke-static {v0, v1, p1}, Lvo1/x;->m(Lkotlin/jvm/functions/Function1;Lso1/h0;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lso1/c0$f;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, p1}, Lvo1/t;->c(Lkotlin/jvm/functions/Function1;Lso1/c0$f;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lso1/c0$f;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lvo1/t;->j(Ljava/lang/String;Lso1/c0$f;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lte2/a;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;

    check-cast p1, Lte2/b;

    invoke-static {v0, v1, p1}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->A(Lte2/a;Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;Lte2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lv30/e;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lj/a;

    const-string v2, "result"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    iput-boolean v2, v0, Lv30/e;->d:Z

    iget-object v0, v0, Lv30/e;->b:Lv30/b;

    iget-object v3, p1, Lj/a;->x:Landroid/content/Intent;

    iget p1, p1, Lj/a;->w:I

    const/4 v4, -0x1

    if-ne p1, v4, :cond_7

    if-eqz v3, :cond_7

    sget-object p1, Ldq/k;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v2, "com.google.android.gms.wallet.PaymentCardRecognitionResult"

    invoke-virtual {v3, v2}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    move-object p1, v3

    goto :goto_0

    :cond_1
    invoke-static {v2, p1}, Lrg/a;->j([BLandroid/os/Parcelable$Creator;)Lvo/d;

    move-result-object p1

    :goto_0
    check-cast p1, Ldq/k;

    if-eqz p1, :cond_2

    iget-object v2, p1, Ldq/k;->w:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, v3

    :goto_1
    if-eqz p1, :cond_3

    iget-object p1, p1, Ldq/k;->x:Ldq/d;

    goto :goto_2

    :cond_3
    move-object p1, v3

    :goto_2
    if-eqz v2, :cond_6

    new-instance v4, Lv30/h;

    new-instance v5, Lv30/m;

    if-eqz p1, :cond_4

    iget v6, p1, Ldq/d;->w:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_3

    :cond_4
    move-object v6, v3

    :goto_3
    if-eqz p1, :cond_5

    iget p1, p1, Ldq/d;->x:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :cond_5
    invoke-direct {v5, v6, v3, v2}, Lv30/m;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-direct {v4, v5}, Lv30/h;-><init>(Lv30/m;)V

    goto :goto_4

    :cond_6
    new-instance v4, Lv30/i;

    new-instance p1, Lcom/stripe/android/ui/core/cardscan/CardScanParseException;

    const-string v2, "PAN not found in PaymentCardRecognitionResult"

    invoke-direct {p1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, p1}, Lv30/i;-><init>(Ljava/lang/Exception;)V

    goto :goto_4

    :cond_7
    if-nez p1, :cond_8

    sget-object v4, Lv30/g;->a:Lv30/g;

    goto :goto_4

    :cond_8
    new-instance v4, Lv30/i;

    new-instance v5, Lcom/stripe/android/ui/core/cardscan/CardScanActivityResultException;

    if-eqz v3, :cond_9

    const/4 v2, 0x1

    :cond_9
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Invalid activity result: code="

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", hasData="

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "message"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, v5}, Lv30/i;-><init>(Ljava/lang/Exception;)V

    :goto_4
    instance-of p1, v4, Lv30/h;

    if-eqz p1, :cond_a

    invoke-interface {v0}, Lv30/b;->f()V

    goto :goto_5

    :cond_a
    instance-of p1, v4, Lv30/g;

    if-eqz p1, :cond_b

    invoke-interface {v0}, Lv30/b;->a()V

    goto :goto_5

    :cond_b
    instance-of p1, v4, Lv30/i;

    if-eqz p1, :cond_c

    move-object p1, v4

    check-cast p1, Lv30/i;

    iget-object p1, p1, Lv30/i;->a:Ljava/lang/Exception;

    invoke-interface {v0, p1}, Lv30/b;->d(Ljava/lang/Throwable;)V

    :goto_5
    invoke-interface {v1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_18
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Ll83/h;

    check-cast p1, Ltw0/c;

    invoke-static {v0, v1, p1}, Luw0/n;->h(Lc93/a;Ll83/h;Ltw0/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Luu2/k0;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1, p1}, Luu2/l;->p(Luu2/k0;Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lus1/b;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lvs1/a;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lus1/b;->g(Lus1/b;Lvs1/a;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/cache/persistence/a;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Ltb/a;

    check-cast p1, La0/g;

    invoke-static {v0, v1, p1}, Lcom/whoop/cache/persistence/a;->n(Lcom/whoop/cache/persistence/a;Ltb/a;La0/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lum0/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/cache/persistence/a;

    iget-object v1, p0, Lum0/b;->y:Ljava/lang/Object;

    check-cast v1, Lum0/c;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lcom/whoop/cache/persistence/a;->v(Lcom/whoop/cache/persistence/a;Lum0/c;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

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
