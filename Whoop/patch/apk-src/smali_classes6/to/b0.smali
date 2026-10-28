.class public final Lto/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcq/d;


# instance fields
.field public final E:J

.field public final w:Lto/f;

.field public final x:I

.field public final y:Lto/a;

.field public final z:J


# direct methods
.method public constructor <init>(Lto/f;ILto/a;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lto/b0;->w:Lto/f;

    iput p2, p0, Lto/b0;->x:I

    iput-object p3, p0, Lto/b0;->y:Lto/a;

    iput-wide p4, p0, Lto/b0;->z:J

    iput-wide p6, p0, Lto/b0;->E:J

    return-void
.end method

.method public static a(Lto/f;ILto/a;)Lto/b0;
    .locals 10

    invoke-virtual {p0}, Lto/f;->g()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Luo/k;->a()Luo/k;

    move-result-object v0

    iget-object v0, v0, Luo/k;->a:Ljava/lang/Object;

    check-cast v0, Luo/l;

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    iget-boolean v2, v0, Luo/l;->x:Z

    if-eqz v2, :cond_2

    iget-boolean v0, v0, Luo/l;->y:Z

    iget-object v2, p0, Lto/f;->J:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lto/v;

    if-eqz v2, :cond_1

    iget-object v3, v2, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    instance-of v4, v3, Luo/c;

    if-eqz v4, :cond_2

    check-cast v3, Luo/c;

    iget-object v4, v3, Luo/c;->v:Luo/d0;

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Luo/c;->o()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-static {v2, v3, p1}, Lto/b0;->b(Lto/v;Luo/c;I)Luo/f;

    move-result-object v0

    if-eqz v0, :cond_2

    iget v3, v2, Lto/v;->q:I

    add-int/2addr v3, v1

    iput v3, v2, Lto/v;->q:I

    iget-boolean v1, v0, Luo/f;->y:Z

    goto :goto_1

    :cond_1
    move v1, v0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_3
    :goto_1
    new-instance v2, Lto/b0;

    const-wide/16 v3, 0x0

    if-eqz v1, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    move-wide v6, v5

    goto :goto_2

    :cond_4
    move-wide v6, v3

    :goto_2
    if-eqz v1, :cond_5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    :cond_5
    move-object v5, p2

    move-wide v8, v3

    move-object v3, p0

    move v4, p1

    invoke-direct/range {v2 .. v9}, Lto/b0;-><init>(Lto/f;ILto/a;JJ)V

    return-object v2
.end method

.method public static b(Lto/v;Luo/c;I)Luo/f;
    .locals 4

    iget-object p1, p1, Luo/c;->v:Luo/d0;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Luo/d0;->z:Luo/f;

    :goto_0
    if-eqz p1, :cond_6

    iget-boolean v1, p1, Luo/f;->x:Z

    if-eqz v1, :cond_6

    iget-object v1, p1, Luo/f;->z:[I

    const/4 v2, 0x0

    if-nez v1, :cond_3

    iget-object v1, p1, Luo/f;->F:[I

    if-nez v1, :cond_1

    goto :goto_3

    :cond_1
    :goto_1
    array-length v3, v1

    if-ge v2, v3, :cond_4

    aget v3, v1, v2

    if-ne v3, p2, :cond_2

    goto :goto_4

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    array-length v3, v1

    if-ge v2, v3, :cond_6

    aget v3, v1, v2

    if-ne v3, p2, :cond_5

    :cond_4
    :goto_3
    iget p0, p0, Lto/v;->q:I

    iget p2, p1, Luo/f;->E:I

    if-ge p0, p2, :cond_6

    return-object p1

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_6
    :goto_4
    return-object v0
.end method


# virtual methods
.method public final q(Lcom/google/android/gms/tasks/Task;)V
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lto/b0;->w:Lto/f;

    invoke-virtual {v1}, Lto/f;->g()Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_8

    :cond_0
    invoke-static {}, Luo/k;->a()Luo/k;

    move-result-object v2

    iget-object v2, v2, Luo/k;->a:Ljava/lang/Object;

    check-cast v2, Luo/l;

    if-eqz v2, :cond_1

    iget-boolean v3, v2, Luo/l;->x:Z

    if-eqz v3, :cond_b

    :cond_1
    iget-object v3, v0, Lto/b0;->y:Lto/a;

    iget-object v4, v1, Lto/f;->J:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lto/v;

    if-eqz v3, :cond_b

    iget-object v4, v3, Lto/v;->g:Lcom/google/android/gms/common/api/d;

    instance-of v5, v4, Luo/c;

    if-eqz v5, :cond_b

    check-cast v4, Luo/c;

    iget-wide v5, v0, Lto/b0;->z:J

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-lez v9, :cond_2

    move v12, v10

    goto :goto_0

    :cond_2
    move v12, v11

    :goto_0
    iget v13, v4, Luo/c;->p:I

    const/16 v14, 0x64

    if-eqz v2, :cond_5

    iget-boolean v15, v2, Luo/l;->y:Z

    and-int/2addr v12, v15

    iget v15, v2, Luo/l;->z:I

    iget v7, v2, Luo/l;->E:I

    iget v2, v2, Luo/l;->w:I

    iget-object v8, v4, Luo/c;->v:Luo/d0;

    if-eqz v8, :cond_4

    invoke-virtual {v4}, Luo/c;->o()Z

    move-result v8

    if-nez v8, :cond_4

    iget v7, v0, Lto/b0;->x:I

    invoke-static {v3, v4, v7}, Lto/b0;->b(Lto/v;Luo/c;I)Luo/f;

    move-result-object v3

    if-eqz v3, :cond_b

    iget-boolean v4, v3, Luo/f;->y:Z

    if-eqz v4, :cond_3

    if-lez v9, :cond_3

    goto :goto_1

    :cond_3
    move v10, v11

    :goto_1
    iget v7, v3, Luo/f;->E:I

    move v12, v10

    :cond_4
    :goto_2
    move v3, v15

    goto :goto_3

    :cond_5
    const/16 v15, 0x1388

    move v2, v11

    move v7, v14

    goto :goto_2

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v4

    const/4 v8, -0x1

    if-eqz v4, :cond_6

    move v15, v11

    goto :goto_5

    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    move-result v4

    if-eqz v4, :cond_7

    move v11, v8

    move v15, v14

    goto :goto_5

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v4

    instance-of v9, v4, Lcom/google/android/gms/common/api/ApiException;

    if-eqz v9, :cond_9

    check-cast v4, Lcom/google/android/gms/common/api/ApiException;

    iget-object v4, v4, Lcom/google/android/gms/common/api/ApiException;->w:Lcom/google/android/gms/common/api/Status;

    iget v11, v4, Lcom/google/android/gms/common/api/Status;->w:I

    iget-object v4, v4, Lcom/google/android/gms/common/api/Status;->z:Lcom/google/android/gms/common/a;

    if-nez v4, :cond_8

    :goto_4
    move v15, v11

    move v11, v8

    goto :goto_5

    :cond_8
    iget v4, v4, Lcom/google/android/gms/common/a;->x:I

    move v15, v11

    move v11, v4

    goto :goto_5

    :cond_9
    const/16 v11, 0x65

    goto :goto_4

    :goto_5
    if-eqz v12, :cond_a

    iget-wide v8, v0, Lto/b0;->E:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v18

    sub-long v8, v18, v8

    long-to-int v8, v8

    move-wide/from16 v19, v16

    move-wide/from16 v17, v5

    :goto_6
    move/from16 v24, v8

    goto :goto_7

    :cond_a
    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    goto :goto_6

    :goto_7
    iget v14, v0, Lto/b0;->x:I

    move/from16 v23, v13

    new-instance v13, Luo/j;

    const/16 v21, 0x0

    const/16 v22, 0x0

    move/from16 v16, v11

    invoke-direct/range {v13 .. v24}, Luo/j;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v19, v13

    int-to-long v3, v3

    new-instance v18, Lto/c0;

    move/from16 v20, v2

    move-wide/from16 v21, v3

    move/from16 v23, v7

    invoke-direct/range {v18 .. v23}, Lto/c0;-><init>(Luo/j;IJI)V

    move-object/from16 v2, v18

    iget-object v1, v1, Lto/f;->N:Ljp/d;

    const/16 v3, 0x12

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_b
    :goto_8
    return-void
.end method
