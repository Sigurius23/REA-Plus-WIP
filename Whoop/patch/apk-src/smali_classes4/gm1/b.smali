.class public final synthetic Lgm1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lgm1/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lgm1/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lh01/p;->p(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lu2/r;

    invoke-virtual {p1}, Lu2/r;->j()I

    move-result p1

    const/4 v0, 0x2

    invoke-static {p1, v0}, Lu2/d0;->f(II)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lu2/r;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 p1, 0x7fc00000    # Float.NaN

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lu2/r;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_5
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lgz0/l0;->a(Lkd1/g;)Lgz0/k0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lgz0/j0;->a(Lkd1/g;)Lgz0/i0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lgz0/h0;->a(Lkd1/g;)Lgz0/g0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lgz0/f0;->a(Lkd1/g;)Lgz0/e0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lgz0/d0;->a(Lkd1/g;)Lgz0/c0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lgz0/b0;->a(Lkd1/g;)Lgz0/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lgz0/z;->a(Lkd1/g;)Lgz0/y;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lgz0/x;->a(Lkd1/g;)Lgz0/w;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lgz0/v;->a(Lkd1/g;)Lgz0/u;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lgz0/t;->a(Lkd1/g;)Lgz0/s;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lgz0/r;->a(Lkd1/g;)Lgz0/q;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lgz0/p;->a(Lkd1/g;)Lgz0/o;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lgz0/n;->a(Lkd1/g;)Lgz0/m;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lgz0/l;->a(Lkd1/g;)Lgz0/k;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lgz0/d;->a(Lkd1/g;)Lgz0/c;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lgz0/b;->a(Lkd1/g;)Lgz0/a;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;

    invoke-static {p1}, Lgt2/a;->a(Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;)Lht2/a;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lgt2/a;->c(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lgt2/a;->b(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;

    invoke-static {p1}, Lgm1/c;->t(Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;)Ljm1/d;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lcom/whoop/home/domain/models/WeeklyPlanHomeTileWrapperModel;

    invoke-static {p1}, Lgm1/c;->h(Lcom/whoop/home/domain/models/WeeklyPlanHomeTileWrapperModel;)Lht2/f;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lcom/whoop/home/domain/models/ScoreGaugeStickyModel;

    invoke-static {p1}, Lgm1/c;->s(Lcom/whoop/home/domain/models/ScoreGaugeStickyModel;)Lwm1/l;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lcom/whoop/home/domain/models/WhatToExpectCardModel;

    invoke-static {p1}, Lgm1/c;->p(Lcom/whoop/home/domain/models/WhatToExpectCardModel;)Lzm1/f;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lcom/whoop/home/domain/models/WelcomeCardModel;

    invoke-static {p1}, Lgm1/c;->e(Lcom/whoop/home/domain/models/WelcomeCardModel;)Lmm1/k;

    move-result-object p1

    return-object p1

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
