.class final Lkj2/k$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkj2/k;->v()Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lnj2/l;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.stress.interactor.StressMonitorInteractor$metricSyncFlowToDomainState$1"
    f = "StressMonitorInteractor.kt"
    l = {
        0x4d,
        0x57,
        0x5e,
        0x5e,
        0x61,
        0x68,
        0x68
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:J

.field F:I

.field private synthetic G:Ljava/lang/Object;

.field final synthetic H:Lkj2/k;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lkj2/k;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkj2/k;",
            "Lq83/d<",
            "-",
            "Lkj2/k$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkj2/k$f;->H:Lkj2/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkj2/k$f;

    iget-object v1, p0, Lkj2/k$f;->H:Lkj2/k;

    invoke-direct {v0, v1, p2}, Lkj2/k$f;-><init>(Lkj2/k;Lq83/d;)V

    iput-object p1, v0, Lkj2/k$f;->G:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lkj2/k$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkj2/k$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkj2/k$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkj2/k$f;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v3, p0

    iget-object v0, v3, Lkj2/k$f;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lec3/m;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v0, v3, Lkj2/k$f;->F:I

    const/4 v1, 0x0

    const/4 v8, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-wide v0, v3, Lkj2/k$f;->E:J

    iget-object v2, v3, Lkj2/k$f;->x:Ljava/lang/Object;

    move-object v6, v2

    check-cast v6, Lec3/m;

    iget-object v2, v3, Lkj2/k$f;->w:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-wide v11, v0

    move-object/from16 v0, p1

    goto/16 :goto_4

    :pswitch_1
    iget-wide v0, v3, Lkj2/k$f;->E:J

    iget-object v2, v3, Lkj2/k$f;->w:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-wide v11, v0

    goto/16 :goto_3

    :pswitch_2
    iget-object v0, v3, Lkj2/k$f;->w:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_3
    iget-wide v0, v3, Lkj2/k$f;->E:J

    iget-object v2, v3, Lkj2/k$f;->x:Ljava/lang/Object;

    move-object v6, v2

    check-cast v6, Lec3/m;

    iget-object v2, v3, Lkj2/k$f;->w:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto/16 :goto_2

    :pswitch_4
    iget-wide v0, v3, Lkj2/k$f;->E:J

    iget-object v2, v3, Lkj2/k$f;->w:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_5
    iget-wide v4, v3, Lkj2/k$f;->E:J

    iget-object v0, v3, Lkj2/k$f;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v2, v3, Lkj2/k$f;->w:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-wide v9, v4

    move-object v4, v2

    move-object/from16 v2, p1

    goto :goto_0

    :pswitch_6
    invoke-static/range {p1 .. p1}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v0

    iget-object v2, v3, Lkj2/k$f;->H:Lkj2/k;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {}, Lkj2/l;->a()J

    move-result-wide v9

    new-instance v11, Lkj2/k$f$a;

    invoke-direct {v11, v2, v8}, Lkj2/k$f$a;-><init>(Lkj2/k;Lq83/d;)V

    iput-object v6, v3, Lkj2/k$f;->G:Ljava/lang/Object;

    iput-object v0, v3, Lkj2/k$f;->w:Ljava/lang/Object;

    iput-object v0, v3, Lkj2/k$f;->x:Ljava/lang/Object;

    iput v1, v3, Lkj2/k$f;->y:I

    iput-wide v4, v3, Lkj2/k$f;->E:J

    iput v1, v3, Lkj2/k$f;->z:I

    const/4 v2, 0x1

    iput v2, v3, Lkj2/k$f;->F:I

    invoke-static {v9, v10, v11, v3}, Lbc3/k2;->e(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_0

    goto/16 :goto_5

    :cond_0
    move-wide v9, v4

    move-object v4, v0

    :goto_0
    iput-object v2, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    sub-long/2addr v11, v9

    iget-object v0, v3, Lkj2/k$f;->H:Lkj2/k;

    invoke-static {v0}, Lkj2/k;->f(Lkj2/k;)Ltr2/n;

    move-result-object v0

    iget-object v2, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    const-string v5, "metricSyncFlowToDomainState syncState is: "

    invoke-static {v2, v5}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/interactor/MetricHeartDataSyncState;

    instance-of v0, v0, Lcom/whoop/data/interactor/MetricHeartDataSyncState$ForcedSyncSuccess;

    if-eqz v0, :cond_3

    iget-object v0, v3, Lkj2/k$f;->H:Lkj2/k;

    invoke-static {v0}, Lkj2/k;->b(Lkj2/k;)Lfj2/a;

    move-result-object v0

    invoke-virtual {v0}, Lfj2/a;->i()V

    iget-object v0, v3, Lkj2/k$f;->H:Lkj2/k;

    invoke-static {v0}, Lkj2/k;->g(Lkj2/k;)Liy1/c;

    move-result-object v0

    new-instance v13, Ljy1/a;

    sget-object v1, Ley1/h;->SCORE:Ley1/h;

    invoke-virtual {v1}, Ley1/h;->getValue()Ljava/lang/String;

    move-result-object v15

    long-to-double v1, v11

    new-instance v5, Ljava/lang/Double;

    invoke-direct {v5, v1, v2}, Ljava/lang/Double;-><init>(D)V

    sget-object v1, Ley1/i;->SUCCESS:Ley1/i;

    invoke-virtual {v1}, Ley1/i;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v19, 0x11

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v5

    invoke-direct/range {v13 .. v20}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, v3, Lkj2/k$f;->G:Ljava/lang/Object;

    iput-object v4, v3, Lkj2/k$f;->w:Ljava/lang/Object;

    iput-object v8, v3, Lkj2/k$f;->x:Ljava/lang/Object;

    iput-wide v11, v3, Lkj2/k$f;->E:J

    const/4 v1, 0x2

    iput v1, v3, Lkj2/k$f;->F:I

    invoke-interface {v0, v13, v3}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_1

    goto/16 :goto_5

    :cond_1
    move-object v2, v4

    move-wide v0, v11

    :goto_1
    iget-object v4, v3, Lkj2/k$f;->H:Lkj2/k;

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    const-string v5, "null cannot be cast to non-null type com.whoop.data.interactor.MetricHeartDataSyncState.ForcedSyncSuccess"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/whoop/data/interactor/MetricHeartDataSyncState$ForcedSyncSuccess;

    invoke-virtual {v2}, Lcom/whoop/data/interactor/MetricHeartDataSyncState$ForcedSyncSuccess;->getMetricsBundle()Lcom/whoop/data/interactor/MetricsHeartDataBundle;

    move-result-object v2

    iput-object v8, v3, Lkj2/k$f;->G:Ljava/lang/Object;

    iput-object v8, v3, Lkj2/k$f;->w:Ljava/lang/Object;

    iput-object v6, v3, Lkj2/k$f;->x:Ljava/lang/Object;

    iput-wide v0, v3, Lkj2/k$f;->E:J

    const/4 v5, 0x3

    iput v5, v3, Lkj2/k$f;->F:I

    invoke-static {v4, v2, v3}, Lkj2/k;->r(Lkj2/k;Lcom/whoop/data/interactor/MetricsHeartDataBundle;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_2

    goto/16 :goto_5

    :cond_2
    :goto_2
    iput-object v8, v3, Lkj2/k$f;->G:Ljava/lang/Object;

    iput-object v8, v3, Lkj2/k$f;->w:Ljava/lang/Object;

    iput-object v8, v3, Lkj2/k$f;->x:Ljava/lang/Object;

    iput-wide v0, v3, Lkj2/k$f;->E:J

    const/4 v0, 0x4

    iput v0, v3, Lkj2/k$f;->F:I

    invoke-interface {v6, v2, v3}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_6

    goto :goto_5

    :cond_3
    iget-object v0, v3, Lkj2/k$f;->H:Lkj2/k;

    invoke-static {v0}, Lkj2/k;->g(Lkj2/k;)Liy1/c;

    move-result-object v0

    new-instance v13, Ljy1/a;

    sget-object v1, Ley1/h;->SCORE:Ley1/h;

    invoke-virtual {v1}, Ley1/h;->getValue()Ljava/lang/String;

    move-result-object v15

    long-to-double v1, v11

    new-instance v4, Ljava/lang/Double;

    invoke-direct {v4, v1, v2}, Ljava/lang/Double;-><init>(D)V

    sget-object v1, Ley1/i;->FAILURE:Ley1/i;

    invoke-virtual {v1}, Ley1/i;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v19, 0x11

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v4

    invoke-direct/range {v13 .. v20}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, v3, Lkj2/k$f;->G:Ljava/lang/Object;

    iput-object v8, v3, Lkj2/k$f;->w:Ljava/lang/Object;

    iput-object v8, v3, Lkj2/k$f;->x:Ljava/lang/Object;

    iput-wide v11, v3, Lkj2/k$f;->E:J

    const/4 v1, 0x5

    iput v1, v3, Lkj2/k$f;->F:I

    invoke-interface {v0, v13, v3}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_4

    goto :goto_5

    :cond_4
    :goto_3
    iget-object v0, v3, Lkj2/k$f;->H:Lkj2/k;

    iput-object v8, v3, Lkj2/k$f;->G:Ljava/lang/Object;

    iput-object v8, v3, Lkj2/k$f;->w:Ljava/lang/Object;

    iput-object v6, v3, Lkj2/k$f;->x:Ljava/lang/Object;

    iput-wide v11, v3, Lkj2/k$f;->E:J

    const/4 v1, 0x6

    iput v1, v3, Lkj2/k$f;->F:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkj2/k;->y(Lkj2/k;ZLjava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_5

    goto :goto_5

    :cond_5
    :goto_4
    iput-object v8, v3, Lkj2/k$f;->G:Ljava/lang/Object;

    iput-object v8, v3, Lkj2/k$f;->w:Ljava/lang/Object;

    iput-object v8, v3, Lkj2/k$f;->x:Ljava/lang/Object;

    iput-wide v11, v3, Lkj2/k$f;->E:J

    const/4 v1, 0x7

    iput v1, v3, Lkj2/k$f;->F:I

    invoke-interface {v6, v0, v3}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_6

    :goto_5
    return-object v7

    :cond_6
    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
