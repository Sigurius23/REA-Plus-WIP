.class public final Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lec3/m;

.field final synthetic x:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

.field final synthetic y:Ljx0/a;


# direct methods
.method public constructor <init>(Lec3/m;Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;Ljx0/a;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a;->w:Lec3/m;

    iput-object p2, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a;->x:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    iput-object p3, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a;->y:Ljx0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;

    iget v3, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;

    invoke-direct {v2, v1, v0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;-><init>(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a;Lq83/d;)V

    :goto_0
    iget-object v0, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->x:I

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v4, :cond_5

    if-eq v4, v8, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v4, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->K:I

    iget-object v6, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->J:Ljava/lang/Object;

    check-cast v6, Lmx0/d;

    iget-object v6, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->I:Ljava/lang/Object;

    check-cast v6, Lq83/d;

    iget-object v6, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->H:Ljava/lang/Object;

    check-cast v6, Lec3/m;

    iget-object v7, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->G:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v7, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->E:Ljava/lang/Object;

    check-cast v7, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    :catch_0
    move-exception v0

    goto/16 :goto_5

    :cond_3
    iget-wide v7, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->M:J

    iget v4, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->L:I

    iget v11, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->K:I

    iget-object v12, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->J:Ljava/lang/Object;

    check-cast v12, Lmx0/d;

    iget-object v13, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->I:Ljava/lang/Object;

    check-cast v13, Lq83/d;

    iget-object v13, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->H:Ljava/lang/Object;

    check-cast v13, Lec3/m;

    iget-object v14, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->G:Ljava/lang/Object;

    check-cast v14, Lec3/m;

    iget-object v14, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->E:Ljava/lang/Object;

    check-cast v14, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_4
    iget-wide v11, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->M:J

    iget v4, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->L:I

    iget v8, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->K:I

    iget-object v13, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->J:Ljava/lang/Object;

    check-cast v13, Lmx0/d;

    iget-object v14, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->I:Ljava/lang/Object;

    check-cast v14, Lq83/d;

    iget-object v14, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->H:Ljava/lang/Object;

    check-cast v14, Lec3/m;

    iget-object v15, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->G:Ljava/lang/Object;

    check-cast v15, Lec3/m;

    iget-object v15, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->E:Ljava/lang/Object;

    check-cast v15, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_5
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lmx0/d;

    invoke-virtual {v4}, Lmx0/d;->b()Llx0/e;

    move-result-object v11

    instance-of v12, v11, Llx0/e$a;

    if-eqz v12, :cond_b

    invoke-virtual {v4}, Lmx0/d;->b()Llx0/e;

    move-result-object v11

    check-cast v11, Llx0/e$a;

    invoke-virtual {v11}, Llx0/e$a;->a()Ldt0/c;

    move-result-object v11

    invoke-virtual {v11}, Ldt0/c;->c()J

    move-result-wide v11

    const-wide/16 v13, -0x1

    cmp-long v13, v11, v13

    if-eqz v13, :cond_8

    iget-object v13, v1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a;->x:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-static {v13}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->q(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Ltr2/n;

    move-result-object v13

    const-string v14, "WM Updating High watermark - "

    invoke-static {v11, v12, v14}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v14

    new-array v15, v9, [Lqr2/a$a;

    invoke-interface {v13, v14, v15}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v13, v1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a;->x:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-static {v13}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->o(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Lmx0/c;

    move-result-object v13

    invoke-virtual {v13, v11, v12}, Lmx0/c;->g(J)V

    iget-object v13, v1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a;->x:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-static {v13}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->k(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Ljava/time/Clock;

    move-result-object v13

    invoke-virtual {v13}, Ljava/time/Clock;->millis()J

    move-result-wide v13

    sget-object v15, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v15, Lkotlin/time/DurationUnit;->MINUTES:Lkotlin/time/DurationUnit;

    const/16 v5, 0xf

    invoke-static {v5, v15}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v15

    sub-long/2addr v13, v15

    cmp-long v13, v13, v11

    if-lez v13, :cond_8

    sget-object v13, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v5, v13}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v13

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->y:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->E:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->F:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->G:Ljava/lang/Object;

    iput-object v0, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->H:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->I:Ljava/lang/Object;

    iput-object v4, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->J:Ljava/lang/Object;

    iput v9, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->K:I

    iput v9, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->L:I

    iput-wide v11, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->M:J

    iput v8, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->x:I

    invoke-static {v13, v14, v2}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_6

    goto/16 :goto_8

    :cond_6
    move-object v14, v0

    move-object v13, v4

    move v4, v9

    move v8, v4

    :goto_1
    iget-object v0, v1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a;->x:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-static {v0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->o(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Lmx0/c;

    move-result-object v0

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->y:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->E:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->F:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->G:Ljava/lang/Object;

    iput-object v14, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->H:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->I:Ljava/lang/Object;

    iput-object v13, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->J:Ljava/lang/Object;

    iput v8, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->K:I

    iput v4, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->L:I

    iput-wide v11, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->M:J

    iput v7, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->x:I

    invoke-virtual {v0, v2}, Lmx0/c;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_7

    goto/16 :goto_8

    :cond_7
    move-wide/from16 v25, v11

    move v11, v8

    move-wide/from16 v7, v25

    move-object v12, v13

    move-object v13, v14

    :goto_2
    move v0, v4

    move v4, v11

    goto :goto_3

    :cond_8
    move-object v13, v0

    move v0, v9

    move-wide v7, v11

    move-object v12, v4

    move v4, v0

    :goto_3
    iget-object v5, v1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a;->y:Ljx0/a;

    if-eqz v5, :cond_a

    :try_start_1
    iget-object v5, v1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a;->x:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-static {v5}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->m(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Ljx0/f;

    move-result-object v5

    iget-object v14, v1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a;->y:Ljx0/a;

    invoke-virtual {v12}, Lmx0/d;->b()Llx0/e;

    move-result-object v11

    check-cast v11, Llx0/e$a;

    invoke-virtual {v11}, Llx0/e$a;->a()Ldt0/c;

    move-result-object v11

    invoke-virtual {v11}, Ldt0/c;->d()J

    move-result-wide v11

    long-to-int v11, v11

    const/16 v23, 0x2f

    const/16 v24, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    move/from16 v21, v11

    invoke-static/range {v14 .. v24}, Ljx0/a;->b(Ljx0/a;Ljava/lang/String;Ljava/lang/String;JJIIILjava/lang/Object;)Ljx0/a;

    move-result-object v11

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->y:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->E:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->F:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->G:Ljava/lang/Object;

    iput-object v13, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->H:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->I:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->J:Ljava/lang/Object;

    iput v4, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->K:I

    iput v0, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->L:I

    iput-wide v7, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->M:J

    iput v6, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->x:I

    invoke-virtual {v5, v11, v2}, Ljx0/f;->e(Ljx0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-ne v0, v3, :cond_9

    goto :goto_8

    :cond_9
    move-object v6, v13

    :goto_4
    move-object v0, v6

    goto :goto_6

    :catch_1
    move-exception v0

    move-object v6, v13

    :goto_5
    iget-object v5, v1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a;->x:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-static {v5}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->q(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Ltr2/n;

    move-result-object v5

    const-string v7, "Error updating DataSyncWork in DB"

    new-array v8, v9, [Lqr2/a$a;

    invoke-interface {v5, v7, v0, v8}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_4

    :cond_a
    move-object v0, v13

    :goto_6
    iget-object v5, v1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a;->x:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-static {v5}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->q(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Ltr2/n;

    move-result-object v5

    const-string v6, "WM job complete"

    new-array v7, v9, [Lqr2/a$a;

    invoke-interface {v5, v6, v7}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object v5

    move v9, v4

    goto :goto_7

    :cond_b
    instance-of v4, v11, Llx0/e$c;

    if-eqz v4, :cond_c

    iget-object v4, v1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a;->x:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-static {v4}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->q(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Ltr2/n;

    move-result-object v4

    const-string v5, "WM job skipped - no upload required"

    new-array v6, v9, [Lqr2/a$a;

    invoke-interface {v4, v5, v6}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object v5

    goto :goto_7

    :cond_c
    iget-object v4, v1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a;->x:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-static {v4}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->q(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Ltr2/n;

    move-result-object v4

    const-string v5, "WM job failed"

    new-array v6, v9, [Lqr2/a$a;

    invoke-interface {v4, v5, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v5, Lic/r;

    invoke-direct {v5}, Lic/r;-><init>()V

    :goto_7
    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->y:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->E:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->F:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->G:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->H:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->I:Ljava/lang/Object;

    iput-object v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->J:Ljava/lang/Object;

    iput v9, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->K:I

    const/4 v4, 0x4

    iput v4, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k$a$a;->x:I

    invoke-interface {v0, v5, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_d

    :goto_8
    return-object v3

    :cond_d
    :goto_9
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
