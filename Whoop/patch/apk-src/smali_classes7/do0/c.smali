.class public final synthetic Ldo0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ldo0/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Ldo0/c;->w:I

    const-string v1, "it"

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    check-cast p1, Le51/e;

    invoke-static {p1}, Le51/l;->g(Le51/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Li3/z;

    invoke-static {p1}, Le51/l;->f(Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1}, Le51/l;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lp31/j;

    invoke-static {p1}, Le51/c;->b(Lp31/j;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1}, Le51/c;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {p1}, Le41/g;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {p1}, Le41/g;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lad3/g;

    const-string v0, "$this$Json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean v2, p1, Lad3/g;->c:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lx43/j;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lec3/f2;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_9
    check-cast p1, Lb30/j3;

    if-eqz p1, :cond_0

    iget-boolean p1, p1, Lb30/j3;->c:Z

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lr20/s;

    const-string v0, "currentScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr20/s;->k()Lec3/f2;

    move-result-object p1

    new-instance v0, Ldo0/c;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Ldo0/c;-><init>(I)V

    invoke-static {p1, v0}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-static {p1}, Le11/c;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Le02/h;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-static {p1}, Le01/b;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lcom/whoop/deepdive/domain/models/ArchMiniRecoveryImpactsModel;

    invoke-static {p1}, Ldy0/c;->a(Lcom/whoop/deepdive/domain/models/ArchMiniRecoveryImpactsModel;)Ld62/d;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lcom/whoop/deepdive/domain/models/ArchMiniTrendsModel;

    invoke-static {p1}, Ldy0/c;->b(Lcom/whoop/deepdive/domain/models/ArchMiniTrendsModel;)Lkm2/g;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Ldy0/c;->f(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ll8/c;

    const-string v0, "$this$initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/stripe/android/challenge/passive/PassiveChallengeActivity;->y:I

    invoke-static {p1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v0

    const-string v1, "passive_challenge_args"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldy/g;

    if-eqz v0, :cond_1

    sget-object v1, Landroidx/lifecycle/z1;->d:Lio/sentry/hints/j;

    invoke-virtual {p1, v1}, Ll8/c;->a(Ll8/b;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type android.app.Application"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/Application;

    new-instance v1, Ld1/i;

    const/16 v3, 0xb

    invoke-direct {v1, v0, v3}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    iget-object v3, v0, Ldy/g;->y:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    iget-object v0, v0, Ldy/g;->w:Ly00/c3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lt9/p;

    const/4 v5, 0x7

    invoke-direct {v4, v5}, Lt9/p;-><init>(I)V

    new-instance v5, Lt9/c0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    sget-object v6, Ldy/h;->b:Lcy/b;

    new-instance v7, Le20/a;

    const/4 v8, 0x5

    invoke-direct {v7, v4, v6, v8}, Le20/a;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static {v7}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v4

    new-instance v6, Luy/a;

    invoke-direct {v6, v5, v2}, Luy/a;-><init>(Lt9/c0;I)V

    invoke-static {v6}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v2

    sget-object v5, Ldy/h;->a:Lcy/b;

    invoke-static {v5}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v5

    new-instance v6, Ldy/j;

    new-instance v7, Luz/p;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    new-instance v8, Lyy/j;

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lqy/d;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lq83/j;

    invoke-direct {v8, v9, v10}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v9, Lb10/b;

    invoke-direct {v9, p1, v3, v1}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    invoke-interface {v5}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbz/c;

    new-instance v10, Lb20/f;

    new-instance v11, Lyy/j;

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lqy/d;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq83/j;

    invoke-direct {v11, v4, v2}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v2, Lb10/b;

    invoke-direct {v2, p1, v3, v1}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    invoke-direct {v10, v11, v2}, Lb20/f;-><init>(Lyy/j;Lyy/c;)V

    const-string p1, "durationProvider"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lq/f;

    invoke-direct {p1, v8, v9, v5, v10}, Lq/f;-><init>(Lyy/j;Lb10/b;Lbz/c;Lb20/f;)V

    invoke-static {v7, p1}, Luz/q;->a(Luz/p;Lq/f;)Luz/o;

    move-result-object p1

    invoke-direct {v6, v0, p1}, Ldy/j;-><init>(Ly00/c3;Luz/o;)V

    return-object v6

    :cond_1
    new-instance p1, Lcom/stripe/android/challenge/passive/PassiveChallengeViewModel$NoArgsException;

    invoke-direct {p1}, Lcom/stripe/android/challenge/passive/PassiveChallengeViewModel$NoArgsException;-><init>()V

    throw p1

    :pswitch_12
    check-cast p1, Law1/a;

    invoke-static {p1}, Ldw1/f;->h(Law1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Law1/a;

    invoke-static {p1}, Ldw1/f;->e(Law1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lk2/c;

    invoke-static {p1}, Ldw1/d;->f(Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Law1/a;

    invoke-static {p1}, Ldw1/d;->d(Law1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Law1/a;

    invoke-static {p1}, Ldw1/d;->g(Law1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Ldv1/b;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lcom/whoop/limitedtimeoffer/domain/models/TimerPillModel;

    invoke-static {p1}, Ldv1/a;->a(Lcom/whoop/limitedtimeoffer/domain/models/TimerPillModel;)Lcv1/d;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Ldv1/a;->c(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lo02/e;

    invoke-static {p1}, Ldp2/b;->a(Lo02/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Ltn0/a;

    invoke-static {p1}, Ldo0/d;->d(Ltn0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lzn0/a;

    invoke-static {p1}, Ldo0/d;->c(Lzn0/a;)Ll83/a0;

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
