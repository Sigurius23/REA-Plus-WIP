.class public final synthetic Lfq2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lfq2/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lfq2/c;->w:I

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/16 v4, 0x708

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ld0/o0;

    iput v4, p1, Ld0/o0;->a:I

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-virtual {p1, v1, v0}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    move-result-object v0

    sget-object v1, Lg1/v4;->f:Ld0/v;

    iput-object v1, v0, Ld0/n0;->b:Ld0/z;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/16 v1, 0x61f

    invoke-virtual {p1, v1, v0}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    return-object v5

    :pswitch_0
    check-cast p1, Ld0/o0;

    iput v4, p1, Ld0/o0;->a:I

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/16 v1, 0x14d

    invoke-virtual {p1, v1, v0}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    move-result-object v0

    sget-object v1, Lg1/v4;->e:Ld0/v;

    iput-object v1, v0, Ld0/n0;->b:Ld0/z;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/16 v1, 0x49f

    invoke-virtual {p1, v1, v0}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    return-object v5

    :pswitch_1
    check-cast p1, Ld0/o0;

    iput v4, p1, Ld0/o0;->a:I

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    move-result-object v0

    sget-object v1, Lg1/v4;->d:Ld0/v;

    iput-object v1, v0, Ld0/n0;->b:Ld0/z;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/16 v1, 0x2ee

    invoke-virtual {p1, v1, v0}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    return-object v5

    :pswitch_2
    check-cast p1, Li3/z;

    sget p1, Lg1/v4;->a:F

    return-object v5

    :pswitch_3
    check-cast p1, Li3/z;

    sget p1, Lg1/j4;->a:F

    return-object v5

    :pswitch_4
    check-cast p1, Lg1/z3;

    sget p1, Landroidx/compose/material/c;->a:F

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_5
    check-cast p1, Li3/z;

    invoke-static {p1, v1}, Li3/w;->i(Li3/z;I)V

    return-object v5

    :pswitch_6
    check-cast p1, Lg1/t0;

    sget p1, Lg1/p2;->a:F

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_7
    check-cast p1, Lg1/r2;

    sget p1, Lg1/p2;->a:F

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_8
    check-cast p1, Ll8/c;

    const-string v0, "$this$initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;->y:I

    invoke-static {p1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v0

    const-string v1, "passive_challenge_warmer_args"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfy/c;

    if-eqz v0, :cond_0

    sget-object v1, Landroidx/lifecycle/z1;->d:Lio/sentry/hints/j;

    invoke-virtual {p1, v1}, Ll8/c;->a(Ll8/b;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type android.app.Application"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/Application;

    new-instance v1, Ld1/i;

    const/16 v2, 0x15

    invoke-direct {v1, v0, v2}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    iget-object v2, v0, Lfy/c;->y:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    iget-object v0, v0, Lfy/c;->w:Ly00/c3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lt9/p;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Lt9/p;-><init>(I)V

    new-instance v4, Lt9/c0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    sget-object v5, Ldy/h;->b:Lcy/b;

    new-instance v6, Le20/a;

    const/4 v7, 0x5

    invoke-direct {v6, v3, v5, v7}, Le20/a;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static {v6}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v3

    new-instance v5, Luy/a;

    const/4 v6, 0x1

    invoke-direct {v5, v4, v6}, Luy/a;-><init>(Lt9/c0;I)V

    invoke-static {v5}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v4

    sget-object v5, Ldy/h;->a:Lcy/b;

    invoke-static {v5}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v5

    new-instance v6, Lfy/g;

    new-instance v7, Luz/p;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    new-instance v8, Lyy/j;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lqy/d;

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lq83/j;

    invoke-direct {v8, v9, v10}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v9, Lb10/b;

    invoke-direct {v9, p1, v2, v1}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    invoke-interface {v5}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbz/c;

    new-instance v10, Lb20/f;

    new-instance v11, Lyy/j;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqy/d;

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq83/j;

    invoke-direct {v11, v3, v4}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v3, Lb10/b;

    invoke-direct {v3, p1, v2, v1}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    invoke-direct {v10, v11, v3}, Lb20/f;-><init>(Lyy/j;Lyy/c;)V

    const-string p1, "durationProvider"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lq/f;

    invoke-direct {p1, v8, v9, v5, v10}, Lq/f;-><init>(Lyy/j;Lb10/b;Lbz/c;Lb20/f;)V

    invoke-static {v7, p1}, Luz/q;->a(Luz/p;Lq/f;)Luz/o;

    move-result-object p1

    invoke-direct {v6, v0, p1}, Lfy/g;-><init>(Ly00/c3;Luz/o;)V

    return-object v6

    :cond_0
    new-instance p1, Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerViewModel$NoArgsException;

    invoke-direct {p1}, Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerViewModel$NoArgsException;-><init>()V

    throw p1

    :pswitch_9
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lfx2/g;->m0(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lfx2/g;->M(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lfx2/g;->Y(Ltb/a;)Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lfx2/g;->j0(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lfx2/g;->Q(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lfx2/g;->H(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lfx2/g;->L(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lfx2/g;->R(Ltb/a;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lfu0/f;->c(Ltb/a;)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lfu0/c;->d(Ltb/a;)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Leb/k1;

    invoke-static {p1}, Lfr1/d;->b(Leb/k1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Leb/y0;

    invoke-static {p1}, Lfr1/d;->a(Leb/y0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lfr1/b;->b(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/InsightValueListModel;

    invoke-static {p1}, Lfq2/d;->g(Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/InsightValueListModel;)Lxq2/s;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lcom/whoop/user/journey/model/yearinreview/YearInReviewHighlightsListModel;

    invoke-static {p1}, Lfq2/d;->c(Lcom/whoop/user/journey/model/yearinreview/YearInReviewHighlightsListModel;)Lnq2/f;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lcom/whoop/user/journey/model/yearinreview/YearInReviewStreaksStatsCard;

    invoke-static {p1}, Lfq2/d;->h(Lcom/whoop/user/journey/model/yearinreview/YearInReviewStreaksStatsCard;)Lnq2/i;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lcom/whoop/user/journey/model/yearinreview/YearInReviewSummaryCardModel;

    invoke-static {p1}, Lfq2/d;->p(Lcom/whoop/user/journey/model/yearinreview/YearInReviewSummaryCardModel;)Lxq2/u0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewCardModel;

    invoke-static {p1}, Lfq2/d;->n(Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewCardModel;)Lxq2/m0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;

    invoke-static {p1}, Lfq2/d;->i(Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;)Lxq2/r0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewTimelineModel;

    invoke-static {p1}, Lfq2/d;->a(Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewTimelineModel;)Lxq2/g1;

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
