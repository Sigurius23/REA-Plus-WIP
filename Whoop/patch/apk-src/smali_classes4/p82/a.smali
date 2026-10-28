.class public final Lp82/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp82/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0018\u0000 %2\u00020\u0001:\u0001\u0016BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lp82/a;",
        "",
        "Ltr2/n;",
        "logger",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "La6/g;",
        "Lf6/f;",
        "processNowDataStore",
        "Ljava/time/Clock;",
        "clock",
        "Liy1/c;",
        "metricWriter",
        "Lca2/h;",
        "rawDataTrackingService",
        "Lst0/r;",
        "strapLockStateTracker",
        "<init>",
        "(Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;La6/g;Ljava/time/Clock;Liy1/c;Lca2/h;Lst0/r;)V",
        "",
        "newestTimestamp",
        "Ll83/a0;",
        "a",
        "(JLq83/d;)Ljava/lang/Object;",
        "Ltr2/n;",
        "b",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "c",
        "La6/g;",
        "d",
        "Ljava/time/Clock;",
        "e",
        "Liy1/c;",
        "f",
        "Lca2/h;",
        "g",
        "Lst0/r;",
        "h",
        "sensor-data-upload_release"
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
.field public static final h:Lp82/a$a;


# instance fields
.field private final a:Ltr2/n;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final c:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final d:Ljava/time/Clock;

.field private final e:Liy1/c;

.field private final f:Lca2/h;

.field private final g:Lst0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp82/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp82/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lp82/a;->h:Lp82/a$a;

    return-void
.end method

.method public constructor <init>(Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;La6/g;Ljava/time/Clock;Liy1/c;Lca2/h;Lst0/r;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr2/n;",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;",
            "La6/g;",
            "Ljava/time/Clock;",
            "Liy1/c;",
            "Lca2/h;",
            "Lst0/r;",
            ")V"
        }
    .end annotation

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processNowDataStore"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawDataTrackingService"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapLockStateTracker"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp82/a;->a:Ltr2/n;

    iput-object p2, p0, Lp82/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p3, p0, Lp82/a;->c:La6/g;

    iput-object p4, p0, Lp82/a;->d:Ljava/time/Clock;

    iput-object p5, p0, Lp82/a;->e:Liy1/c;

    iput-object p6, p0, Lp82/a;->f:Lca2/h;

    iput-object p7, p0, Lp82/a;->g:Lst0/r;

    return-void
.end method


# virtual methods
.method public final a(JLq83/d;)Ljava/lang/Object;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    instance-of v2, v0, Lp82/a$b;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lp82/a$b;

    iget v3, v2, Lp82/a$b;->P:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lp82/a$b;->P:I

    goto :goto_0

    :cond_0
    new-instance v2, Lp82/a$b;

    invoke-direct {v2, v1, v0}, Lp82/a$b;-><init>(Lp82/a;Lq83/d;)V

    :goto_0
    iget-object v0, v2, Lp82/a$b;->N:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lp82/a$b;->P:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    if-eqz v4, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lp82/a$b;->H:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    iget-object v3, v2, Lp82/a$b;->G:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    iget-object v3, v2, Lp82/a$b;->F:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v2, v2, Lp82/a$b;->E:Ljava/lang/Object;

    check-cast v2, Lf6/f;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v9

    :catch_0
    move-exception v0

    move-object/from16 v16, v9

    goto/16 :goto_9

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-wide v10, v2, Lp82/a$b;->z:J

    iget-wide v12, v2, Lp82/a$b;->x:J

    iget-wide v14, v2, Lp82/a$b;->w:J

    iget-object v4, v2, Lp82/a$b;->M:Ljava/lang/Object;

    check-cast v4, Ljy1/a;

    iget-object v4, v2, Lp82/a$b;->L:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lp82/a$b;->K:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v7, v2, Lp82/a$b;->J:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v7, v2, Lp82/a$b;->I:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v5, v2, Lp82/a$b;->H:Ljava/lang/Object;

    check-cast v5, Ljava/util/Map;

    iget-object v8, v2, Lp82/a$b;->G:Ljava/lang/Object;

    check-cast v8, Ljava/util/Map;

    iget-object v6, v2, Lp82/a$b;->F:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, v2, Lp82/a$b;->E:Ljava/lang/Object;

    check-cast v6, Lf6/f;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v6, v3

    move-object/from16 v16, v9

    const/4 v9, 0x2

    goto/16 :goto_6

    :cond_3
    iget-wide v4, v2, Lp82/a$b;->x:J

    iget-wide v6, v2, Lp82/a$b;->w:J

    :try_start_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    iget-object v0, v1, Lp82/a;->d:Ljava/time/Clock;

    invoke-virtual {v0}, Ljava/time/Clock;->millis()J

    move-result-wide v4

    iget-object v0, v1, Lp82/a;->c:La6/g;

    invoke-interface {v0}, La6/g;->getData()Lec3/l;

    move-result-object v0

    move-wide/from16 v10, p1

    iput-wide v10, v2, Lp82/a$b;->w:J

    iput-wide v4, v2, Lp82/a$b;->x:J

    iput v7, v2, Lp82/a$b;->P:I

    invoke-static {v0, v2}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_5

    move-object v6, v3

    goto/16 :goto_7

    :cond_5
    move-wide v6, v10

    :goto_1
    check-cast v0, Lf6/f;

    invoke-static {}, Ldt0/a;->b()Lf6/d;

    move-result-object v8

    invoke-virtual {v0, v8}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    if-nez v0, :cond_6

    :goto_2
    move-object/from16 v16, v9

    goto/16 :goto_8

    :cond_6
    :try_start_4
    sget-object v8, Lad3/c;->d:Lad3/b;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v10, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v11, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v10, v11, v11}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    invoke-virtual {v8, v10, v0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    :try_start_5
    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_7
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-static {v12}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v12

    if-eqz v12, :cond_7

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    cmp-long v12, v12, v6

    if-gtz v12, :cond_7

    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v8, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_8
    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_9

    goto :goto_2

    :cond_9
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-wide v12, v4

    move-wide v14, v6

    move-object v5, v8

    move-object v7, v10

    move-object v8, v0

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v6}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v6

    if-eqz v6, :cond_c

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    move-object v6, v5

    sub-long v4, v12, v10

    move-object/from16 p2, v6

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    move-object/from16 v16, v9

    :try_start_6
    const-string v9, "source:"

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v6

    iget-object v9, v1, Lp82/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-object/from16 v25, v3

    const-string v3, "droid-process-now-analytics-raw-data-tag"

    invoke-interface {v9, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v3, v1, Lp82/a;->f:Lca2/h;

    invoke-interface {v3}, Lca2/h;->c()Z

    move-result v3

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v26, v10

    const-string v10, "is_raw_data_in_strap_or_app_backlog:"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :catch_1
    move-exception v0

    goto/16 :goto_9

    :cond_a
    move-wide/from16 v26, v10

    :goto_5
    iget-object v3, v1, Lp82/a;->g:Lst0/r;

    invoke-static {v3}, Lst0/s;->a(Lst0/r;)Ljava/lang/String;

    move-result-object v3

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "strap_lock_state:"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v17, Ljy1/a;

    const-string v19, "connectivity.strap.cloud.process_now"

    long-to-double v9, v4

    new-instance v3, Ljava/lang/Double;

    invoke-direct {v3, v9, v10}, Ljava/lang/Double;-><init>(D)V

    sget-object v22, Lcom/whoop/metrics/domain/models/MetricPostType;->DISTRIBUTION:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v18, 0x0

    move-object/from16 v20, v3

    move-object/from16 v21, v6

    invoke-direct/range {v17 .. v24}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v17

    iget-object v6, v1, Lp82/a;->e:Liy1/c;

    const/4 v9, 0x0

    iput-object v9, v2, Lp82/a$b;->E:Ljava/lang/Object;

    iput-object v9, v2, Lp82/a$b;->F:Ljava/lang/Object;

    iput-object v8, v2, Lp82/a$b;->G:Ljava/lang/Object;

    move-object/from16 v10, p2

    iput-object v10, v2, Lp82/a$b;->H:Ljava/lang/Object;

    iput-object v7, v2, Lp82/a$b;->I:Ljava/lang/Object;

    iput-object v9, v2, Lp82/a$b;->J:Ljava/lang/Object;

    iput-object v0, v2, Lp82/a$b;->K:Ljava/lang/Object;

    iput-object v9, v2, Lp82/a$b;->L:Ljava/lang/Object;

    iput-object v9, v2, Lp82/a$b;->M:Ljava/lang/Object;

    iput-wide v14, v2, Lp82/a$b;->w:J

    iput-wide v12, v2, Lp82/a$b;->x:J

    move-wide/from16 v17, v12

    move-wide/from16 v11, v26

    iput-wide v11, v2, Lp82/a$b;->y:J

    iput-wide v4, v2, Lp82/a$b;->z:J

    const/4 v9, 0x2

    iput v9, v2, Lp82/a$b;->P:I

    invoke-interface {v6, v3, v2}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v6, v25

    if-ne v3, v6, :cond_b

    goto/16 :goto_7

    :cond_b
    move-wide v12, v4

    move-object v5, v10

    move-wide v10, v12

    move-object v4, v0

    move-wide/from16 v12, v17

    :goto_6
    iget-object v0, v1, Lp82/a;->a:Ltr2/n;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "ProcessNow analytics - source: "

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", timeDifference: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "ms"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v9, v4, [Lqr2/a$a;

    invoke-interface {v0, v3, v9}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    move-object v3, v6

    move-object/from16 v9, v16

    goto/16 :goto_4

    :cond_c
    move-object v10, v5

    move-wide/from16 v17, v12

    goto/16 :goto_4

    :cond_d
    move-object v6, v3

    move-object v10, v5

    move-object/from16 v16, v9

    move-wide/from16 v17, v12

    iget-object v0, v1, Lp82/a;->c:La6/g;

    new-instance v3, Lp82/a$c;

    const/4 v9, 0x0

    invoke-direct {v3, v8, v10, v9}, Lp82/a$c;-><init>(Ljava/util/Map;Ljava/util/Map;Lq83/d;)V

    iput-object v9, v2, Lp82/a$b;->E:Ljava/lang/Object;

    iput-object v9, v2, Lp82/a$b;->F:Ljava/lang/Object;

    iput-object v9, v2, Lp82/a$b;->G:Ljava/lang/Object;

    iput-object v9, v2, Lp82/a$b;->H:Ljava/lang/Object;

    iput-object v9, v2, Lp82/a$b;->I:Ljava/lang/Object;

    iput-object v9, v2, Lp82/a$b;->J:Ljava/lang/Object;

    iput-object v9, v2, Lp82/a$b;->K:Ljava/lang/Object;

    iput-object v9, v2, Lp82/a$b;->L:Ljava/lang/Object;

    iput-object v9, v2, Lp82/a$b;->M:Ljava/lang/Object;

    iput-wide v14, v2, Lp82/a$b;->w:J

    move-wide/from16 v12, v17

    iput-wide v12, v2, Lp82/a$b;->x:J

    const/4 v4, 0x3

    iput v4, v2, Lp82/a$b;->P:I

    invoke-static {v0, v3, v2}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_e

    :goto_7
    return-object v6

    :catch_2
    move-exception v0

    move-object/from16 v16, v9

    iget-object v2, v1, Lp82/a;->a:Ltr2/n;

    const-string v3, "Failed to parse process_now_trigger_map"

    const/4 v4, 0x0

    new-array v5, v4, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v5}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    :cond_e
    :goto_8
    return-object v16

    :goto_9
    iget-object v2, v1, Lp82/a;->a:Ltr2/n;

    const-string v3, "Failed to report process now analytics"

    const/4 v4, 0x0

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-object v16
.end method
