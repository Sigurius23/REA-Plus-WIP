.class final Lr82/a$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr82/a;->g(ILjava/lang/String;)V
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
    c = "com.whoop.sensorDataUpload.throughput.SensorDataUploadThroughputTracker$sendThroughputMetric$1"
    f = "SensorDataUploadThroughputTracker.kt"
    l = {
        0x63
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lr82/a;

.field final synthetic F:Ljava/lang/String;

.field final synthetic G:I

.field w:Z

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lr82/a;Ljava/lang/String;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr82/a;",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Lr82/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lr82/a$c;->E:Lr82/a;

    iput-object p2, p0, Lr82/a$c;->F:Ljava/lang/String;

    iput p3, p0, Lr82/a$c;->G:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lr82/a$c;

    iget-object v0, p0, Lr82/a$c;->E:Lr82/a;

    iget-object v1, p0, Lr82/a$c;->F:Ljava/lang/String;

    iget v2, p0, Lr82/a$c;->G:I

    invoke-direct {p1, v0, v1, v2, p2}, Lr82/a$c;-><init>(Lr82/a;Ljava/lang/String;ILq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lr82/a$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lr82/a$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lr82/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lr82/a$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    const-string v0, "Sent throughput metric: "

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lr82/a$c;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v1, p0, Lr82/a$c;->y:Ljava/lang/Object;

    check-cast v1, Ljy1/a;

    iget-object v1, p0, Lr82/a$c;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lr82/a$c;->E:Lr82/a;

    invoke-static {p1}, Lr82/a;->c(Lr82/a;)Lca2/h;

    move-result-object p1

    invoke-interface {p1}, Lca2/h;->c()Z

    move-result p1

    iget-object v2, p0, Lr82/a$c;->F:Ljava/lang/String;

    const-string v5, "network_type:"

    invoke-static {v5, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "is_raw_data_in_strap_or_app_backlog:"

    invoke-static {v5, p1}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lr82/a$c;->E:Lr82/a;

    invoke-static {v6}, Lr82/a;->d(Lr82/a;)Lst0/r;

    move-result-object v6

    invoke-static {v6}, Lst0/s;->a(Lst0/r;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "strap_lock_state:"

    invoke-static {v7, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v2, v5, v6}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    :try_start_1
    new-instance v5, Ljy1/a;

    const-string v7, "mobile.cloud.data_upload.throughput"

    iget v2, p0, Lr82/a$c;->G:I

    int-to-double v10, v2

    new-instance v8, Ljava/lang/Double;

    invoke-direct {v8, v10, v11}, Ljava/lang/Double;-><init>(D)V

    sget-object v10, Lcom/whoop/metrics/domain/models/MetricPostType;->DISTRIBUTION:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v5 .. v12}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, p0, Lr82/a$c;->E:Lr82/a;

    invoke-static {v2}, Lr82/a;->b(Lr82/a;)Liy1/c;

    move-result-object v2

    const/4 v6, 0x0

    iput-object v6, p0, Lr82/a$c;->x:Ljava/lang/Object;

    iput-object v6, p0, Lr82/a$c;->y:Ljava/lang/Object;

    iput-boolean p1, p0, Lr82/a$c;->w:Z

    iput v4, p0, Lr82/a$c;->z:I

    invoke-interface {v2, v5, p0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    iget-object p1, p0, Lr82/a$c;->E:Lr82/a;

    invoke-static {p1}, Lr82/a;->a(Lr82/a;)Ltr2/n;

    move-result-object p1

    iget v1, p0, Lr82/a$c;->G:I

    iget-object v2, p0, Lr82/a$c;->F:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " bytes/sec, network: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    iget-object v0, p0, Lr82/a$c;->E:Lr82/a;

    invoke-static {v0}, Lr82/a;->a(Lr82/a;)Ltr2/n;

    move-result-object v0

    const-string v1, "Failed to send throughput metric"

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
