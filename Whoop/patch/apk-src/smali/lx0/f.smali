.class public final Llx0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ<\u0010\u0010\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\n2\u0006\u0010\u000c\u001a\u00020\u000b2\u001c\u0010\u000f\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0080@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Llx0/f;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ljava/time/Clock;",
        "clock",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/time/Clock;Ltr2/n;)V",
        "T",
        "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;",
        "triggerSource",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "block",
        "a",
        "(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "b",
        "Ljava/time/Clock;",
        "c",
        "Ltr2/n;",
        "Lmc3/a;",
        "d",
        "Lmc3/a;",
        "mutex",
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
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final b:Ljava/time/Clock;

.field private final c:Ltr2/n;

.field private final d:Lmc3/a;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/time/Clock;Ltr2/n;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llx0/f;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p2, p0, Llx0/f;->b:Ljava/time/Clock;

    iput-object p3, p0, Llx0/f;->c:Ltr2/n;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Llx0/f;->d:Lmc3/a;

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    instance-of v3, v2, Llx0/f$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Llx0/f$a;

    iget v4, v3, Llx0/f$a;->J:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Llx0/f$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v3, Llx0/f$a;

    invoke-direct {v3, v1, v2}, Llx0/f$a;-><init>(Llx0/f;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Llx0/f$a;->H:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Llx0/f$a;->J:I

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v0, v3, Llx0/f$a;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lmc3/a;

    iget-object v0, v3, Llx0/f$a;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v0, v3, Llx0/f$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    :try_start_0
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v0, v3, Llx0/f$a;->F:I

    iget-wide v7, v3, Llx0/f$a;->z:J

    iget-object v5, v3, Llx0/f$a;->y:Ljava/lang/Object;

    check-cast v5, Lmc3/a;

    iget-object v11, v3, Llx0/f$a;->x:Ljava/lang/Object;

    check-cast v11, Lkotlin/jvm/functions/Function1;

    iget-object v12, v3, Llx0/f$a;->w:Ljava/lang/Object;

    check-cast v12, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move v2, v0

    move-object v0, v11

    goto :goto_1

    :cond_3
    iget-object v0, v3, Llx0/f$a;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v0, v3, Llx0/f$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v2

    :cond_4
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Llx0/f;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v5, "droid-sequential-upload-pipeline"

    invoke-interface {v2, v5}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_6

    iput-object v10, v3, Llx0/f$a;->w:Ljava/lang/Object;

    iput-object v10, v3, Llx0/f$a;->x:Ljava/lang/Object;

    iput v8, v3, Llx0/f$a;->J:I

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_5

    goto/16 :goto_3

    :cond_5
    return-object v0

    :cond_6
    iget-object v2, v1, Llx0/f;->b:Ljava/time/Clock;

    invoke-virtual {v2}, Ljava/time/Clock;->millis()J

    move-result-wide v11

    iget-object v2, v1, Llx0/f;->d:Lmc3/a;

    move-object/from16 v5, p1

    iput-object v5, v3, Llx0/f$a;->w:Ljava/lang/Object;

    iput-object v0, v3, Llx0/f$a;->x:Ljava/lang/Object;

    iput-object v2, v3, Llx0/f$a;->y:Ljava/lang/Object;

    iput-wide v11, v3, Llx0/f$a;->z:J

    iput v9, v3, Llx0/f$a;->F:I

    iput v7, v3, Llx0/f$a;->J:I

    invoke-interface {v2, v3}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_7

    goto :goto_3

    :cond_7
    move-wide v7, v11

    move-object v12, v5

    move-object v5, v2

    move v2, v9

    :goto_1
    :try_start_1
    iget-object v11, v1, Llx0/f;->b:Ljava/time/Clock;

    invoke-virtual {v11}, Ljava/time/Clock;->millis()J

    move-result-wide v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    sub-long/2addr v13, v7

    const-wide/16 v15, 0x0

    cmp-long v11, v13, v15

    const-string v15, "Upload gate acquired for "

    if-lez v11, :cond_8

    :try_start_2
    iget-object v11, v1, Llx0/f;->c:Ltr2/n;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v12, " after "

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v12, "ms wait"

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v12, v9, [Lqr2/a$a;

    invoke-interface {v11, v6, v12}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v4, v5

    goto :goto_5

    :cond_8
    iget-object v6, v1, Llx0/f;->c:Ltr2/n;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    new-array v12, v9, [Lqr2/a$a;

    invoke-interface {v6, v11, v12}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_2
    iput-object v10, v3, Llx0/f$a;->w:Ljava/lang/Object;

    iput-object v10, v3, Llx0/f$a;->x:Ljava/lang/Object;

    iput-object v5, v3, Llx0/f$a;->y:Ljava/lang/Object;

    iput-wide v7, v3, Llx0/f$a;->z:J

    iput v2, v3, Llx0/f$a;->F:I

    iput v9, v3, Llx0/f$a;->G:I

    iput-wide v13, v3, Llx0/f$a;->E:J

    const/4 v2, 0x3

    iput v2, v3, Llx0/f$a;->J:I

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v2, v4, :cond_9

    :goto_3
    return-object v4

    :cond_9
    move-object v4, v5

    :goto_4
    invoke-interface {v4, v10}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v2

    :goto_5
    invoke-interface {v4, v10}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0
.end method
