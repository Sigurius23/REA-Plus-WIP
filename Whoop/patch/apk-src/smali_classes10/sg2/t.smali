.class public final synthetic Lsg2/t;
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

    .line 1
    iput p1, p0, Lsg2/t;->w:I

    iput-object p2, p0, Lsg2/t;->y:Ljava/lang/Object;

    iput-object p3, p0, Lsg2/t;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lu0/r1;Ll3/e;Lu0/t0;)V
    .locals 0

    .line 2
    const/16 p1, 0x15

    iput p1, p0, Lsg2/t;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lsg2/t;->y:Ljava/lang/Object;

    iput-object p3, p0, Lsg2/t;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lsg2/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/cache/persistence/a;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lcom/whoop/cache/persistence/a;->q(Lcom/whoop/cache/persistence/a;Ljava/util/List;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/cache/persistence/a;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lcom/whoop/cache/persistence/a;->t(Ljava/lang/String;Lcom/whoop/cache/persistence/a;Ltb/a;)Lum0/d;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/archv2/feature/domain/p;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lui0/r;->e(Lc93/m;Lcom/whoop/archv2/feature/domain/p;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Luh1/b;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lvh1/a;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Luh1/b;->h(Luh1/b;Lvh1/a;Ltb/a;)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lld2/a;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-static {v0, v1, p1}, Lud2/e;->p(Lld2/a;Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Ltd2/h;

    check-cast p1, Ltd2/f;

    invoke-static {v0, v1, p1}, Lud2/e;->f(Lkotlin/jvm/functions/Function1;Ltd2/h;Ltd2/f;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/video/d;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    check-cast p1, Ljava/lang/String;

    const-string v2, "token"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getTokenExpiration-UwyO8pc()J

    move-result-wide v1

    iget-object v3, v0, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    check-cast v3, Landroid/os/Handler;

    new-instance v4, Llr/e;

    const/16 v5, 0x18

    invoke-direct {v4, v0, v5}, Llr/e;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1, v2}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v1

    invoke-virtual {v3, v4, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v1, Lu40/g;

    invoke-direct {v1, v3, p1}, Lu40/g;-><init>(Landroid/os/Handler;Ljava/lang/String;)V

    iput-object v1, v0, Lio/sentry/android/replay/video/d;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Lio/sentry/android/replay/video/d;->o()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lu0/r1;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Ll3/e;

    check-cast p1, Li2/g0;

    iget-object v2, v0, Lu0/r1;->b:Ll3/g;

    iget-object v0, v0, Lu0/r1;->a:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll3/r0;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    iget-object v3, v3, Ll3/r0;->a:Ll3/q0;

    if-eqz v3, :cond_0

    iget-object v3, v3, Ll3/q0;->a:Ll3/g;

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_2

    :cond_1
    :goto_1
    move-object v6, v4

    goto :goto_3

    :cond_2
    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/r0;

    if-eqz v0, :cond_1

    iget-object v2, v0, Ll3/r0;->b:Ll3/w;

    invoke-static {v1, v0}, Lu0/r1;->c(Ll3/e;Ll3/r0;)Ll3/e;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    iget v5, v1, Ll3/e;->c:I

    iget v1, v1, Ll3/e;->b:I

    invoke-virtual {v0, v1, v5}, Ll3/r0;->j(II)Li2/j;

    move-result-object v6

    invoke-virtual {v0, v1}, Ll3/r0;->b(I)Lh2/c;

    move-result-object v7

    sub-int/2addr v5, v3

    invoke-virtual {v0, v5}, Ll3/r0;->b(I)Lh2/c;

    move-result-object v0

    invoke-virtual {v2, v1}, Ll3/w;->d(I)I

    move-result v1

    invoke-virtual {v2, v5}, Ll3/w;->d(I)I

    move-result v2

    if-ne v1, v2, :cond_4

    iget v0, v0, Lh2/c;->a:F

    iget v1, v7, Lh2/c;->a:F

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    iget v1, v7, Lh2/c;->b:F

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v7, v0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x20

    shl-long/2addr v7, v2

    const-wide v9, 0xffffffffL

    and-long/2addr v0, v9

    or-long/2addr v0, v7

    const-wide v7, -0x7fffffff80000000L    # -1.0609978955E-314

    xor-long/2addr v0, v7

    invoke-virtual {v6, v0, v1}, Li2/j;->m(J)V

    :goto_3
    if-eqz v6, :cond_5

    new-instance v4, Lu0/q1;

    invoke-direct {v4, v6}, Lu0/q1;-><init>(Li2/j;)V

    :cond_5
    if-eqz v4, :cond_6

    check-cast p1, Li2/x0;

    invoke-virtual {p1, v4}, Li2/x0;->t(Li2/a1;)V

    invoke-virtual {p1, v3}, Li2/x0;->e(Z)V

    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Ll3/e;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lu0/t0;

    iget-object v1, v1, Lu0/t0;->b:Lp1/h1;

    check-cast p1, Lu0/x0;

    iget-object v2, v0, Ll3/e;->a:Ljava/lang/Object;

    check-cast v2, Ll3/v;

    invoke-virtual {v2}, Ll3/v;->b()Ll3/s0;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_7

    iget-object v3, v3, Ll3/s0;->a:Ll3/m0;

    goto :goto_4

    :cond_7
    move-object v3, v4

    :goto_4
    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v5

    and-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_8

    invoke-virtual {v2}, Ll3/v;->b()Ll3/s0;

    move-result-object v5

    if-eqz v5, :cond_8

    iget-object v5, v5, Ll3/s0;->b:Ll3/m0;

    goto :goto_5

    :cond_8
    move-object v5, v4

    :goto_5
    if-eqz v3, :cond_9

    invoke-virtual {v3, v5}, Ll3/m0;->d(Ll3/m0;)Ll3/m0;

    move-result-object v5

    :cond_9
    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v3

    and-int/lit8 v3, v3, 0x2

    if-eqz v3, :cond_a

    invoke-virtual {v2}, Ll3/v;->b()Ll3/s0;

    move-result-object v3

    if-eqz v3, :cond_a

    iget-object v3, v3, Ll3/s0;->c:Ll3/m0;

    goto :goto_6

    :cond_a
    move-object v3, v4

    :goto_6
    if-eqz v5, :cond_b

    invoke-virtual {v5, v3}, Ll3/m0;->d(Ll3/m0;)Ll3/m0;

    move-result-object v3

    :cond_b
    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v1

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_c

    invoke-virtual {v2}, Ll3/v;->b()Ll3/s0;

    move-result-object v1

    if-eqz v1, :cond_c

    iget-object v4, v1, Ll3/s0;->d:Ll3/m0;

    :cond_c
    if-eqz v3, :cond_d

    invoke-virtual {v3, v4}, Ll3/m0;->d(Ll3/m0;)Ll3/m0;

    move-result-object v4

    :cond_d
    new-instance v1, Lkotlin/jvm/internal/b0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v2, p1, Lu0/x0;->a:Ll3/g;

    new-instance v3, Ls90/f;

    const/16 v5, 0xe

    invoke-direct {v3, v1, v0, v4, v5}, Ls90/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Ll3/g;->d(Lkotlin/jvm/functions/Function1;)Ll3/g;

    move-result-object v0

    iput-object v0, p1, Lu0/x0;->b:Ll3/g;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lj0/i;

    check-cast p1, Lp1/i0;

    new-instance p1, Ld0/b2;

    const/4 v2, 0x5

    invoke-direct {p1, v2, v0, v1}, Ld0/b2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lu0/u0;

    check-cast p1, Ly2/i1;

    iget-object v1, v1, Lu0/u0;->a:Lc93/a;

    invoke-static {v0, v1}, Lq83/g;->g(Ljava/util/List;Lc93/a;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_7
    if-ge v2, v1, :cond_f

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll83/k;

    iget-object v4, v3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ly2/j1;

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v3, Lc93/a;

    if-eqz v3, :cond_e

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/j;

    iget-wide v5, v3, Ly3/j;->a:J

    goto :goto_8

    :cond_e
    const-wide/16 v5, 0x0

    :goto_8
    invoke-static {p1, v4, v5, v6}, Ly2/i1;->k(Ly2/i1;Ly2/j1;J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_f
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lq3/y;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lq3/y;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Ltg2/m;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Ltg2/e;->b(Lkotlin/jvm/functions/Function1;Ltg2/m;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lt71/p;

    check-cast p1, Li21/a;

    invoke-static {v0, v1, p1}, Lt71/o;->b(Lkotlin/jvm/functions/Function1;Lt71/p;Li21/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lt71/j;

    check-cast p1, Li21/a;

    invoke-static {v0, v1, p1}, Lt71/m;->f(Lkotlin/jvm/functions/Function1;Lt71/j;Li21/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lt31/c;

    invoke-static {v0, v1, p1}, Lt31/b;->a(Lkotlin/jvm/functions/Function1;Lt31/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lsy0/e;

    check-cast p1, Li3/z;

    invoke-static {v0, v1, p1}, Lt01/g;->c(Ljava/lang/String;Lsy0/e;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lux1/d;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lsx1/j;->q(Lux1/d;Lc93/m;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lux1/b;

    invoke-static {v0, v1, p1}, Lsx1/j;->t(Lc93/m;Lux1/b;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lsx0/d;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lsx0/a;->g(Lc93/m;Lsx0/d;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lsx0/f;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lsx0/a;->f(Lsx0/f;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lrv2/h$b;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lo0/s;

    invoke-static {v0, v1, p1}, Lsv2/e;->i(Lrv2/h$b;Lkotlin/jvm/functions/Function1;Lo0/s;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lsv2/a;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Ll83/h;

    check-cast p1, Lrv2/d;

    invoke-static {v0, v1, p1}, Lsv2/e;->k(Lsv2/a;Ll83/h;Lrv2/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lp31/l;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lsu1/f;->d(Lp31/l;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lrt1/f;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lst1/n;->h(Ljava/util/Map;Lrt1/f;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lrt1/g;

    check-cast p1, Lrt1/b;

    invoke-static {v0, v1, p1}, Lst1/l;->n(Lkotlin/jvm/functions/Function1;Lrt1/g;Lrt1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Lpo2/c$c;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lso2/g;->h(Lpo2/c$c;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/g0;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/healthconnect/view/HealthConnectFragment;

    check-cast p1, Lp1/i0;

    invoke-static {v0, v1, p1}, Lcom/whoop/healthconnect/view/HealthConnectFragment;->D(Landroidx/lifecycle/g0;Lcom/whoop/healthconnect/view/HealthConnectFragment;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lng2/f;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lsg2/v;->b(Landroid/content/Context;Lng2/f;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lsg2/t;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/g0;

    iget-object v1, p0, Lsg2/t;->x:Ljava/lang/Object;

    check-cast v1, Lng2/f;

    check-cast p1, Lp1/i0;

    invoke-static {v0, v1, p1}, Lsg2/v;->m(Landroidx/lifecycle/g0;Lng2/f;Lp1/i0;)Lp1/h0;

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
