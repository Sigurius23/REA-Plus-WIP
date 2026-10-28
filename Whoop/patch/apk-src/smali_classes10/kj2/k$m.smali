.class final Lkj2/k$m;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkj2/k;->D(Lcom/whoop/data/interactor/MetricsHeartDataBundle;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lnj2/l$e;",
        "<anonymous>",
        "()Lnj2/l$e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.stress.interactor.StressMonitorInteractor$uploadMetrics$result$1"
    f = "StressMonitorInteractor.kt"
    l = {
        0x101,
        0x10d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lud3/v0;

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lkj2/k;

.field final synthetic z:Loh2/d;


# direct methods
.method public constructor <init>(Lkj2/k;Loh2/d;Lud3/v0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkj2/k;",
            "Loh2/d;",
            "Lud3/v0;",
            "Lq83/d<",
            "-",
            "Lkj2/k$m;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkj2/k$m;->y:Lkj2/k;

    iput-object p2, p0, Lkj2/k$m;->z:Loh2/d;

    iput-object p3, p0, Lkj2/k$m;->E:Lud3/v0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkj2/k$m;

    iget-object v1, p0, Lkj2/k$m;->y:Lkj2/k;

    iget-object v2, p0, Lkj2/k$m;->z:Loh2/d;

    iget-object v3, p0, Lkj2/k$m;->E:Lud3/v0;

    invoke-direct {v0, v1, v2, v3, p1}, Lkj2/k$m;-><init>(Lkj2/k;Loh2/d;Lud3/v0;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lkj2/k$m;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lnj2/l$e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lkj2/k$m;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkj2/k$m;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lkj2/k$m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkj2/k$m;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lkj2/k$m;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/stress/domain/model/StressMonitorDto;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, Lkj2/k$m;->y:Lkj2/k;

    invoke-static {v1}, Lkj2/k;->c(Lkj2/k;)Lcom/whoop/stress/domain/StressMonitorApi;

    move-result-object v4

    invoke-static {}, Lkj2/l;->b()Ljava/lang/String;

    move-result-object v5

    const-string v1, "<get-TIME_STAMP_ON_SYNC>(...)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lkj2/k$m;->z:Loh2/d;

    invoke-virtual {v1}, Loh2/d;->h()Ljava/lang/String;

    move-result-object v6

    const-string v1, "getStrapId(...)"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lkj2/k$m;->z:Loh2/d;

    invoke-virtual {v1}, Loh2/d;->f()Loh2/c;

    move-result-object v1

    invoke-virtual {v1}, Loh2/c;->d()Ljava/lang/String;

    move-result-object v7

    iget-object v1, p0, Lkj2/k$m;->z:Loh2/d;

    invoke-virtual {v1}, Loh2/d;->e()Loh2/b;

    move-result-object v1

    invoke-interface {v1}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v8

    iget-object v1, p0, Lkj2/k$m;->z:Loh2/d;

    invoke-virtual {v1}, Loh2/d;->g()Loh2/e;

    move-result-object v1

    invoke-virtual {v1}, Loh2/e;->f()Ljava/lang/String;

    move-result-object v9

    const-string v1, "toSemanticVersionString(...)"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lkj2/k$m;->z:Loh2/d;

    invoke-virtual {v1}, Loh2/d;->d()B

    move-result v10

    iget-object v1, p0, Lkj2/k$m;->z:Loh2/d;

    invoke-virtual {v1}, Loh2/d;->c()B

    move-result v11

    iget-object v1, p0, Lkj2/k$m;->E:Lud3/v0;

    invoke-virtual {v1}, Lud3/v0;->contentLength()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v12

    iget-object v13, p0, Lkj2/k$m;->E:Lud3/v0;

    iput v3, p0, Lkj2/k$m;->x:I

    move-object v14, p0

    invoke-interface/range {v4 .. v14}, Lcom/whoop/stress/domain/StressMonitorApi;->updateStressMonitor(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lud3/v0;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast v1, Lcom/whoop/stress/domain/model/StressMonitorDto;

    iget-object v3, p0, Lkj2/k$m;->y:Lkj2/k;

    invoke-static {v3}, Lkj2/k;->c(Lkj2/k;)Lcom/whoop/stress/domain/StressMonitorApi;

    move-result-object v3

    iput-object v1, p0, Lkj2/k$m;->w:Ljava/lang/Object;

    iput v2, p0, Lkj2/k$m;->x:I

    invoke-interface {v3, p0}, Lcom/whoop/stress/domain/StressMonitorApi;->getStressEducation(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    move-object v0, v1

    :goto_2
    check-cast v2, Lcom/whoop/educationModels/FeatureEducationDto;

    iget-object v1, p0, Lkj2/k$m;->y:Lkj2/k;

    const/4 v3, 0x0

    invoke-static {v1, v0, v2, v3}, Lkj2/k;->q(Lkj2/k;Lcom/whoop/stress/domain/model/StressMonitorDto;Lcom/whoop/educationModels/FeatureEducationDto;Z)Lnj2/l$e;

    move-result-object v0

    return-object v0
.end method
