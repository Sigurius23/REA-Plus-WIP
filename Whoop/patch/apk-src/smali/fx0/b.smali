.class public final Lfx0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lfx0/b;",
        "",
        "Liy1/c;",
        "metricsInteractor",
        "Lca2/h;",
        "rawDataTrackingService",
        "<init>",
        "(Liy1/c;Lca2/h;)V",
        "Lfx0/a;",
        "dataSyncMetric",
        "Ll83/a0;",
        "a",
        "(Lfx0/a;Lq83/d;)Ljava/lang/Object;",
        "Liy1/c;",
        "b",
        "Lca2/h;",
        "data-sync-service_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Liy1/c;

.field private final b:Lca2/h;


# direct methods
.method public constructor <init>(Liy1/c;Lca2/h;)V
    .locals 1

    const-string v0, "metricsInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawDataTrackingService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfx0/b;->a:Liy1/c;

    iput-object p2, p0, Lfx0/b;->b:Lca2/h;

    return-void
.end method


# virtual methods
.method public final a(Lfx0/a;Lq83/d;)Ljava/lang/Object;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfx0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lfx0/b$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lfx0/b$a;

    iget v4, v3, Lfx0/b$a;->J:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lfx0/b$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v3, Lfx0/b$a;

    invoke-direct {v3, v0, v2}, Lfx0/b$a;-><init>(Lfx0/b;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lfx0/b$a;->H:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lfx0/b$a;->J:I

    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v5, :cond_5

    if-eq v5, v10, :cond_4

    if-eq v5, v9, :cond_2

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_3

    if-ne v5, v6, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v3, Lfx0/b$a;->E:Ljava/lang/Object;

    check-cast v1, Ljy1/a;

    :cond_3
    :goto_1
    iget-object v1, v3, Lfx0/b$a;->z:Ljava/lang/Object;

    check-cast v1, Ljy1/a;

    iget-object v1, v3, Lfx0/b$a;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v3, Lfx0/b$a;->x:Ljava/lang/Object;

    check-cast v1, Lfx0/a;

    iget-object v1, v3, Lfx0/b$a;->w:Ljava/lang/Object;

    check-cast v1, Lfx0/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_4
    iget-boolean v1, v3, Lfx0/b$a;->G:Z

    iget v5, v3, Lfx0/b$a;->F:I

    iget-object v6, v3, Lfx0/b$a;->E:Ljava/lang/Object;

    check-cast v6, Ljy1/a;

    iget-object v7, v3, Lfx0/b$a;->z:Ljava/lang/Object;

    check-cast v7, Ljy1/a;

    iget-object v7, v3, Lfx0/b$a;->y:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v7, v3, Lfx0/b$a;->x:Ljava/lang/Object;

    check-cast v7, Lfx0/a;

    iget-object v7, v3, Lfx0/b$a;->w:Ljava/lang/Object;

    check-cast v7, Lfx0/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_5
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lfx0/b;->b:Lca2/h;

    invoke-interface {v2}, Lca2/h;->c()Z

    move-result v2

    invoke-interface {v1}, Lfx0/a;->a()Ljava/lang/String;

    move-result-object v5

    const-string v12, "TriggerSource:"

    invoke-static {v12, v5}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v12, "is_raw_data_in_strap_or_app_backlog:"

    invoke-static {v12, v2}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v12

    filled-new-array {v5, v12}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    instance-of v5, v1, Lfx0/a$b;

    const/4 v12, 0x0

    if-eqz v5, :cond_7

    move v5, v12

    new-instance v12, Ljy1/a;

    check-cast v1, Lfx0/a$b;

    invoke-virtual {v1}, Lfx0/a$b;->b()J

    move-result-wide v6

    invoke-virtual {v1}, Lfx0/a$b;->d()J

    move-result-wide v13

    sub-long/2addr v6, v13

    long-to-double v6, v6

    new-instance v15, Ljava/lang/Double;

    invoke-direct {v15, v6, v7}, Ljava/lang/Double;-><init>(D)V

    const/16 v18, 0x11

    const/16 v19, 0x0

    const/4 v13, 0x0

    const-string v14, "connectivity.strap.app.data_sync.full_status_complete"

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v12

    new-instance v12, Ljy1/a;

    invoke-virtual {v1}, Lfx0/a$b;->c()I

    move-result v1

    int-to-double v7, v1

    new-instance v15, Ljava/lang/Double;

    invoke-direct {v15, v7, v8}, Ljava/lang/Double;-><init>(D)V

    const-string v14, "connectivity.strap.app.data_sync.sensor_data_sync_upload_count"

    invoke-direct/range {v12 .. v19}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, Lfx0/b;->a:Liy1/c;

    iput-object v11, v3, Lfx0/b$a;->w:Ljava/lang/Object;

    iput-object v11, v3, Lfx0/b$a;->x:Ljava/lang/Object;

    iput-object v11, v3, Lfx0/b$a;->y:Ljava/lang/Object;

    iput-object v11, v3, Lfx0/b$a;->z:Ljava/lang/Object;

    iput-object v12, v3, Lfx0/b$a;->E:Ljava/lang/Object;

    iput v5, v3, Lfx0/b$a;->F:I

    iput-boolean v2, v3, Lfx0/b$a;->G:Z

    iput v10, v3, Lfx0/b$a;->J:I

    invoke-interface {v1, v6, v3}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_6

    goto/16 :goto_3

    :cond_6
    move v1, v2

    move-object v6, v12

    :goto_2
    iget-object v2, v0, Lfx0/b;->a:Liy1/c;

    iput-object v11, v3, Lfx0/b$a;->w:Ljava/lang/Object;

    iput-object v11, v3, Lfx0/b$a;->x:Ljava/lang/Object;

    iput-object v11, v3, Lfx0/b$a;->y:Ljava/lang/Object;

    iput-object v11, v3, Lfx0/b$a;->z:Ljava/lang/Object;

    iput-object v11, v3, Lfx0/b$a;->E:Ljava/lang/Object;

    iput v5, v3, Lfx0/b$a;->F:I

    iput-boolean v1, v3, Lfx0/b$a;->G:Z

    iput v9, v3, Lfx0/b$a;->J:I

    invoke-interface {v2, v6, v3}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_a

    goto/16 :goto_3

    :cond_7
    move v5, v12

    instance-of v9, v1, Lfx0/a$a;

    if-eqz v9, :cond_8

    new-instance v12, Ljy1/a;

    check-cast v1, Lfx0/a$a;

    invoke-virtual {v1}, Lfx0/a$a;->b()J

    move-result-wide v6

    long-to-double v6, v6

    new-instance v15, Ljava/lang/Double;

    invoke-direct {v15, v6, v7}, Ljava/lang/Double;-><init>(D)V

    const/16 v18, 0x11

    const/16 v19, 0x0

    const/4 v13, 0x0

    const-string v14, "connectivity.strap.app.data_sync.sensor_data_sync_cancelled"

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, Lfx0/b;->a:Liy1/c;

    iput-object v11, v3, Lfx0/b$a;->w:Ljava/lang/Object;

    iput-object v11, v3, Lfx0/b$a;->x:Ljava/lang/Object;

    iput-object v11, v3, Lfx0/b$a;->y:Ljava/lang/Object;

    iput-object v11, v3, Lfx0/b$a;->z:Ljava/lang/Object;

    iput v5, v3, Lfx0/b$a;->F:I

    iput-boolean v2, v3, Lfx0/b$a;->G:Z

    iput v8, v3, Lfx0/b$a;->J:I

    invoke-interface {v1, v12, v3}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_a

    goto :goto_3

    :cond_8
    instance-of v8, v1, Lfx0/a$c;

    if-eqz v8, :cond_9

    new-instance v12, Ljy1/a;

    check-cast v1, Lfx0/a$c;

    invoke-virtual {v1}, Lfx0/a$c;->b()J

    move-result-wide v8

    invoke-virtual {v1}, Lfx0/a$c;->c()J

    move-result-wide v13

    sub-long/2addr v8, v13

    long-to-double v8, v8

    new-instance v15, Ljava/lang/Double;

    invoke-direct {v15, v8, v9}, Ljava/lang/Double;-><init>(D)V

    const/16 v18, 0x11

    const/16 v19, 0x0

    const/4 v13, 0x0

    const-string v14, "connectivity.strap.app.data_sync.sensor_data_sync_fail"

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, Lfx0/b;->a:Liy1/c;

    iput-object v11, v3, Lfx0/b$a;->w:Ljava/lang/Object;

    iput-object v11, v3, Lfx0/b$a;->x:Ljava/lang/Object;

    iput-object v11, v3, Lfx0/b$a;->y:Ljava/lang/Object;

    iput-object v11, v3, Lfx0/b$a;->z:Ljava/lang/Object;

    iput v5, v3, Lfx0/b$a;->F:I

    iput-boolean v2, v3, Lfx0/b$a;->G:Z

    iput v7, v3, Lfx0/b$a;->J:I

    invoke-interface {v1, v12, v3}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_a

    goto :goto_3

    :cond_9
    instance-of v7, v1, Lfx0/a$d;

    if-eqz v7, :cond_b

    new-instance v12, Ljy1/a;

    check-cast v1, Lfx0/a$d;

    invoke-virtual {v1}, Lfx0/a$d;->b()J

    move-result-wide v7

    long-to-double v7, v7

    new-instance v15, Ljava/lang/Double;

    invoke-direct {v15, v7, v8}, Ljava/lang/Double;-><init>(D)V

    const/16 v18, 0x11

    const/16 v19, 0x0

    const/4 v13, 0x0

    const-string v14, "connectivity.strap.app.data_sync.duplicate_in_progress"

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, Lfx0/b;->a:Liy1/c;

    iput-object v11, v3, Lfx0/b$a;->w:Ljava/lang/Object;

    iput-object v11, v3, Lfx0/b$a;->x:Ljava/lang/Object;

    iput-object v11, v3, Lfx0/b$a;->y:Ljava/lang/Object;

    iput-object v11, v3, Lfx0/b$a;->z:Ljava/lang/Object;

    iput v5, v3, Lfx0/b$a;->F:I

    iput-boolean v2, v3, Lfx0/b$a;->G:Z

    iput v6, v3, Lfx0/b$a;->J:I

    invoke-interface {v1, v12, v3}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_a

    :goto_3
    return-object v4

    :cond_a
    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
