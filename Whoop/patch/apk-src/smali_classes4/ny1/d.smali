.class public final Lny1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lny1/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0015B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lny1/d;",
        "",
        "Liy1/c;",
        "metricWriter",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Landroid/content/Context;",
        "context",
        "Lfy1/a;",
        "bffCacheSizeProvider",
        "Lq83/j;",
        "ioContext",
        "<init>",
        "(Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Landroid/content/Context;Lfy1/a;Lq83/j;)V",
        "Lny1/e;",
        "snapshot",
        "Ll83/a0;",
        "e",
        "(Lny1/e;Lq83/d;)Ljava/lang/Object;",
        "d",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "Liy1/c;",
        "b",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "c",
        "Landroid/content/Context;",
        "Lfy1/a;",
        "Lq83/j;",
        "f",
        "metrics_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final f:Lny1/d$a;


# instance fields
.field private final a:Liy1/c;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final c:Landroid/content/Context;

.field private final d:Lfy1/a;

.field private final e:Lq83/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lny1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lny1/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lny1/d;->f:Lny1/d$a;

    return-void
.end method

.method public constructor <init>(Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Landroid/content/Context;Lfy1/a;Lq83/j;)V
    .locals 1

    const-string v0, "metricWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bffCacheSizeProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lny1/d;->a:Liy1/c;

    .line 3
    iput-object p2, p0, Lny1/d;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 4
    iput-object p3, p0, Lny1/d;->c:Landroid/content/Context;

    .line 5
    iput-object p4, p0, Lny1/d;->d:Lfy1/a;

    .line 6
    iput-object p5, p0, Lny1/d;->e:Lq83/j;

    return-void
.end method

.method public constructor <init>(Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Landroid/content/Context;Lfy1/a;Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 7
    sget-object p5, Lbc3/q0;->a:Lkc3/e;

    .line 8
    sget-object p5, Lkc3/d;->w:Lkc3/d;

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 9
    invoke-direct/range {v0 .. v5}, Lny1/d;-><init>(Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Landroid/content/Context;Lfy1/a;Lq83/j;)V

    return-void
.end method

.method public static final synthetic a(Lny1/d;Lny1/e;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lny1/d;->e(Lny1/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lny1/d;)Lfy1/a;
    .locals 0

    iget-object p0, p0, Lny1/d;->d:Lfy1/a;

    return-object p0
.end method

.method public static final synthetic c(Lny1/d;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lny1/d;->c:Landroid/content/Context;

    return-object p0
.end method

.method private final e(Lny1/e;Lq83/d;)Ljava/lang/Object;
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lny1/e;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lny1/d$d;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lny1/d$d;

    iget v3, v2, Lny1/d$d;->J:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lny1/d$d;->J:I

    goto :goto_0

    :cond_0
    new-instance v2, Lny1/d$d;

    invoke-direct {v2, v0, v1}, Lny1/d$d;-><init>(Lny1/d;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lny1/d$d;->H:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lny1/d$d;->J:I

    const-string v5, "db_name:"

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    if-eqz v4, :cond_5

    if-eq v4, v9, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v2, v2, Lny1/d$d;->w:Ljava/lang/Object;

    check-cast v2, Lny1/e;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lny1/d$d;->F:I

    iget-object v5, v2, Lny1/d$d;->E:Ljava/lang/Object;

    check-cast v5, Lny1/a;

    iget-object v5, v2, Lny1/d$d;->y:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v8, v2, Lny1/d$d;->x:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, v2, Lny1/d$d;->w:Ljava/lang/Object;

    check-cast v8, Lny1/e;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v1, v7

    goto/16 :goto_4

    :cond_3
    iget v4, v2, Lny1/d$d;->F:I

    iget-object v12, v2, Lny1/d$d;->E:Ljava/lang/Object;

    check-cast v12, Lny1/c;

    iget-object v12, v2, Lny1/d$d;->y:Ljava/lang/Object;

    check-cast v12, Ljava/util/Iterator;

    iget-object v13, v2, Lny1/d$d;->x:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    iget-object v13, v2, Lny1/d$d;->w:Ljava/lang/Object;

    check-cast v13, Lny1/e;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v1, v4

    move-object v4, v2

    move-object v2, v12

    move v12, v1

    move-object v1, v13

    goto/16 :goto_3

    :cond_4
    iget v4, v2, Lny1/d$d;->G:I

    iget v12, v2, Lny1/d$d;->F:I

    iget-object v13, v2, Lny1/d$d;->E:Ljava/lang/Object;

    check-cast v13, Lny1/c;

    iget-object v14, v2, Lny1/d$d;->y:Ljava/lang/Object;

    check-cast v14, Ljava/util/Iterator;

    iget-object v15, v2, Lny1/d$d;->x:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Iterable;

    iget-object v15, v2, Lny1/d$d;->w:Ljava/lang/Object;

    check-cast v15, Lny1/e;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move v1, v4

    move v4, v12

    move-object v12, v14

    goto :goto_2

    :cond_5
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lny1/e;->e()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v4, v2

    move v12, v10

    move-object v2, v1

    move-object/from16 v1, p1

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lny1/c;

    iget-object v14, v0, Lny1/d;->a:Liy1/c;

    new-instance v15, Ljy1/a;

    invoke-virtual {v13}, Lny1/c;->b()J

    move-result-wide v6

    long-to-double v6, v6

    new-instance v8, Ljava/lang/Double;

    invoke-direct {v8, v6, v7}, Ljava/lang/Double;-><init>(D)V

    invoke-virtual {v13}, Lny1/c;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v19

    sget-object v20, Lcom/whoop/metrics/domain/models/MetricPostType;->GAUGE:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v16, 0x0

    const-string v17, "storage.db_size_bytes"

    move-object/from16 v18, v8

    invoke-direct/range {v15 .. v22}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v4, Lny1/d$d;->w:Ljava/lang/Object;

    iput-object v11, v4, Lny1/d$d;->x:Ljava/lang/Object;

    iput-object v2, v4, Lny1/d$d;->y:Ljava/lang/Object;

    iput-object v11, v4, Lny1/d$d;->z:Ljava/lang/Object;

    iput-object v13, v4, Lny1/d$d;->E:Ljava/lang/Object;

    iput v12, v4, Lny1/d$d;->F:I

    iput v10, v4, Lny1/d$d;->G:I

    iput v9, v4, Lny1/d$d;->J:I

    invoke-interface {v14, v15, v4}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_6

    goto/16 :goto_5

    :cond_6
    move v15, v12

    move-object v12, v2

    move-object v2, v4

    move v4, v15

    move-object v15, v1

    move v1, v10

    :goto_2
    iget-object v6, v0, Lny1/d;->a:Liy1/c;

    new-instance v23, Ljy1/a;

    invoke-virtual {v13}, Lny1/c;->c()J

    move-result-wide v7

    long-to-double v7, v7

    new-instance v14, Ljava/lang/Double;

    invoke-direct {v14, v7, v8}, Ljava/lang/Double;-><init>(D)V

    invoke-virtual {v13}, Lny1/c;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v27

    sget-object v28, Lcom/whoop/metrics/domain/models/MetricPostType;->GAUGE:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/16 v29, 0x1

    const/16 v30, 0x0

    const/16 v24, 0x0

    const-string v25, "storage.wal_size_bytes"

    move-object/from16 v26, v14

    invoke-direct/range {v23 .. v30}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v23

    iput-object v15, v2, Lny1/d$d;->w:Ljava/lang/Object;

    iput-object v11, v2, Lny1/d$d;->x:Ljava/lang/Object;

    iput-object v12, v2, Lny1/d$d;->y:Ljava/lang/Object;

    iput-object v11, v2, Lny1/d$d;->z:Ljava/lang/Object;

    iput-object v11, v2, Lny1/d$d;->E:Ljava/lang/Object;

    iput v4, v2, Lny1/d$d;->F:I

    iput v1, v2, Lny1/d$d;->G:I

    const/4 v8, 0x2

    iput v8, v2, Lny1/d$d;->J:I

    invoke-interface {v6, v7, v2}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    goto/16 :goto_5

    :cond_7
    move v1, v4

    move-object v4, v2

    move-object v2, v12

    move v12, v1

    move-object v1, v15

    :goto_3
    const/4 v6, 0x4

    const/4 v7, 0x3

    goto/16 :goto_1

    :cond_8
    invoke-virtual {v1}, Lny1/e;->d()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v8, v1

    move-object v5, v2

    move-object v2, v4

    move v4, v10

    :cond_9
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lny1/a;

    iget-object v6, v0, Lny1/d;->a:Liy1/c;

    new-instance v12, Ljy1/a;

    invoke-virtual {v1}, Lny1/a;->a()J

    move-result-wide v13

    long-to-double v13, v13

    new-instance v15, Ljava/lang/Double;

    invoke-direct {v15, v13, v14}, Ljava/lang/Double;-><init>(D)V

    invoke-virtual {v1}, Lny1/a;->b()Ljava/lang/String;

    move-result-object v1

    const-string v7, "source:"

    invoke-static {v7, v1}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v16

    sget-object v17, Lcom/whoop/metrics/domain/models/MetricPostType;->GAUGE:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/4 v13, 0x0

    const-string v14, "storage.cache_size_bytes"

    invoke-direct/range {v12 .. v19}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, v2, Lny1/d$d;->w:Ljava/lang/Object;

    iput-object v11, v2, Lny1/d$d;->x:Ljava/lang/Object;

    iput-object v5, v2, Lny1/d$d;->y:Ljava/lang/Object;

    iput-object v11, v2, Lny1/d$d;->z:Ljava/lang/Object;

    iput-object v11, v2, Lny1/d$d;->E:Ljava/lang/Object;

    iput v4, v2, Lny1/d$d;->F:I

    iput v10, v2, Lny1/d$d;->G:I

    const/4 v1, 0x3

    iput v1, v2, Lny1/d$d;->J:I

    invoke-interface {v6, v12, v2}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_9

    goto :goto_5

    :cond_a
    iget-object v1, v0, Lny1/d;->a:Liy1/c;

    new-instance v12, Ljy1/a;

    invoke-virtual {v8}, Lny1/e;->c()J

    move-result-wide v4

    long-to-double v4, v4

    new-instance v15, Ljava/lang/Double;

    invoke-direct {v15, v4, v5}, Ljava/lang/Double;-><init>(D)V

    sget-object v17, Lcom/whoop/metrics/domain/models/MetricPostType;->GAUGE:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/4 v13, 0x0

    const-string v14, "memory.bff_cache_bytes"

    sget-object v16, Lm83/y;->w:Lm83/y;

    invoke-direct/range {v12 .. v19}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v11, v2, Lny1/d$d;->w:Ljava/lang/Object;

    iput-object v11, v2, Lny1/d$d;->x:Ljava/lang/Object;

    iput-object v11, v2, Lny1/d$d;->y:Ljava/lang/Object;

    iput-object v11, v2, Lny1/d$d;->z:Ljava/lang/Object;

    iput-object v11, v2, Lny1/d$d;->E:Ljava/lang/Object;

    const/4 v4, 0x4

    iput v4, v2, Lny1/d$d;->J:I

    invoke-interface {v1, v12, v2}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_b

    :goto_5
    return-object v3

    :cond_b
    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method


# virtual methods
.method public final d(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lny1/d$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lny1/d$b;

    iget v1, v0, Lny1/d$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lny1/d$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lny1/d$b;

    invoke-direct {v0, p0, p1}, Lny1/d$b;-><init>(Lny1/d;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lny1/d$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lny1/d$b;->z:I

    const/4 v3, 0x0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    iget-object v0, v0, Lny1/d$b;->w:Ljava/lang/Object;

    check-cast v0, Lny1/e;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lny1/d;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "android-oom-observability-storage"

    invoke-interface {p1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_4

    return-object v4

    :cond_4
    iget-object p1, p0, Lny1/d;->e:Lq83/j;

    new-instance v2, Lny1/d$c;

    invoke-direct {v2, p0, v3}, Lny1/d$c;-><init>(Lny1/d;Lq83/d;)V

    iput v6, v0, Lny1/d$b;->z:I

    invoke-static {p1, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p1, Lny1/e;

    iput-object v3, v0, Lny1/d$b;->w:Ljava/lang/Object;

    iput v5, v0, Lny1/d$b;->z:I

    invoke-direct {p0, p1, v0}, Lny1/d;->e(Lny1/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    return-object v4
.end method
