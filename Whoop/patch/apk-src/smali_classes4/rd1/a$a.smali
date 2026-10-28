.class final Lrd1/a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd1/a;->e(JLjava/time/Instant;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.domain.heartdata.AppBacklogTracker$sendAppBacklogMetricsToDataDog$1"
    f = "AppBacklogTracker.kt"
    l = {
        0x17,
        0x1e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field final synthetic F:Lrd1/a;

.field final synthetic G:Ljava/time/Instant;

.field final synthetic H:J

.field w:I

.field x:Z

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lrd1/a;Ljava/time/Instant;JLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrd1/a;",
            "Ljava/time/Instant;",
            "J",
            "Lq83/d<",
            "-",
            "Lrd1/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrd1/a$a;->F:Lrd1/a;

    iput-object p2, p0, Lrd1/a$a;->G:Ljava/time/Instant;

    iput-wide p3, p0, Lrd1/a$a;->H:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lrd1/a$a;

    iget-object v1, p0, Lrd1/a$a;->F:Lrd1/a;

    iget-object v2, p0, Lrd1/a$a;->G:Ljava/time/Instant;

    iget-wide v3, p0, Lrd1/a$a;->H:J

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lrd1/a$a;-><init>(Lrd1/a;Ljava/time/Instant;JLq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lrd1/a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrd1/a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrd1/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrd1/a$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lrd1/a$a;->E:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lrd1/a$a;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, p0, Lrd1/a$a;->y:Ljava/lang/Object;

    check-cast v0, Ljava/time/Instant;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lrd1/a$a;->F:Lrd1/a;

    invoke-static {p1}, Lrd1/a;->d(Lrd1/a;)Lz92/a;

    move-result-object p1

    iput v3, p0, Lrd1/a$a;->E:I

    invoke-interface {p1, p0}, Lz92/a;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto/16 :goto_2

    :cond_3
    :goto_0
    check-cast p1, Lcom/whoop/domain/model/User;

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->canUploadData()Z

    move-result p1

    goto :goto_1

    :cond_4
    move p1, v1

    :goto_1
    iget-object v3, p0, Lrd1/a$a;->F:Lrd1/a;

    invoke-static {v3}, Lrd1/a;->c(Lrd1/a;)Lca2/h;

    move-result-object v3

    invoke-interface {v3}, Lca2/h;->c()Z

    move-result v3

    iget-object v4, p0, Lrd1/a$a;->G:Ljava/time/Instant;

    invoke-virtual {v4}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v4

    iget-wide v6, p0, Lrd1/a$a;->H:J

    cmp-long v4, v4, v6

    if-lez v4, :cond_5

    if-eqz p1, :cond_5

    iget-object v4, p0, Lrd1/a$a;->G:Ljava/time/Instant;

    invoke-virtual {v4, v6, v7}, Ljava/time/Instant;->minusMillis(J)Ljava/time/Instant;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "is_raw_data_in_strap_or_app_backlog:"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    iget-object v5, p0, Lrd1/a$a;->F:Lrd1/a;

    invoke-static {v5}, Lrd1/a;->a(Lrd1/a;)Ltr2/n;

    move-result-object v5

    invoke-virtual {v4}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v6

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "App was backlogged by "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " millis for metrics data, isRawDataInBacklog: "

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v5, v6, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, p0, Lrd1/a$a;->F:Lrd1/a;

    invoke-static {v1}, Lrd1/a;->b(Lrd1/a;)Liy1/c;

    move-result-object v1

    new-instance v6, Ljy1/a;

    invoke-virtual {v4}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v4

    long-to-double v4, v4

    new-instance v9, Ljava/lang/Double;

    invoke-direct {v9, v4, v5}, Ljava/lang/Double;-><init>(D)V

    sget-object v11, Lcom/whoop/metrics/domain/models/MetricPostType;->DISTRIBUTION:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v7, 0x0

    const-string v8, "connectivity.app.cloud.app_backlog"

    invoke-direct/range {v6 .. v13}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x0

    iput-object v4, p0, Lrd1/a$a;->y:Ljava/lang/Object;

    iput-object v4, p0, Lrd1/a$a;->z:Ljava/lang/Object;

    iput p1, p0, Lrd1/a$a;->w:I

    iput-boolean v3, p0, Lrd1/a$a;->x:Z

    iput v2, p0, Lrd1/a$a;->E:I

    invoke-interface {v1, v6, p0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
