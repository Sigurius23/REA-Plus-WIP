.class public final Lp1/e0;
.super Lz1/b0;
.source "SourceFile"


# static fields
.field public static final h:Ljava/lang/Object;


# instance fields
.field public c:J

.field public d:I

.field public e:La0/m0;

.field public f:Ljava/lang/Object;

.field public g:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lp1/e0;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz1/b0;-><init>(J)V

    sget-object p1, La0/z0;->a:La0/m0;

    const-string p2, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lp1/e0;->e:La0/m0;

    sget-object p1, Lp1/e0;->h:Ljava/lang/Object;

    iput-object p1, p0, Lp1/e0;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lz1/b0;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/e0;

    iget-object v0, p1, Lp1/e0;->e:La0/m0;

    iput-object v0, p0, Lp1/e0;->e:La0/m0;

    iget-object v0, p1, Lp1/e0;->f:Ljava/lang/Object;

    iput-object v0, p0, Lp1/e0;->f:Ljava/lang/Object;

    iget p1, p1, Lp1/e0;->g:I

    iput p1, p0, Lp1/e0;->g:I

    return-void
.end method

.method public final b(J)Lz1/b0;
    .locals 1

    new-instance v0, Lp1/e0;

    invoke-direct {v0, p1, p2}, Lp1/e0;-><init>(J)V

    return-object v0
.end method

.method public final c(Lp1/f0;Lz1/f;)Z
    .locals 6

    sget-object v0, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-wide v1, p0, Lp1/e0;->c:J

    invoke-virtual {p2}, Lz1/f;->g()J

    move-result-wide v3

    cmp-long v1, v1, v3

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    iget v1, p0, Lp1/e0;->d:I

    invoke-virtual {p2}, Lz1/f;->h()I

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v1, v4, :cond_0

    goto :goto_0

    :cond_0
    move v1, v3

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    :goto_0
    move v1, v2

    :goto_1
    monitor-exit v0

    iget-object v4, p0, Lp1/e0;->f:Ljava/lang/Object;

    sget-object v5, Lp1/e0;->h:Ljava/lang/Object;

    if-eq v4, v5, :cond_2

    if-eqz v1, :cond_3

    iget v4, p0, Lp1/e0;->g:I

    invoke-virtual {p0, p1, p2}, Lp1/e0;->d(Lp1/f0;Lz1/f;)I

    move-result p1

    if-ne v4, p1, :cond_2

    goto :goto_2

    :cond_2
    move v2, v3

    :cond_3
    :goto_2
    if-eqz v2, :cond_4

    if-eqz v1, :cond_4

    monitor-enter v0

    :try_start_1
    invoke-virtual {p2}, Lz1/f;->g()J

    move-result-wide v3

    iput-wide v3, p0, Lp1/e0;->c:J

    invoke-virtual {p2}, Lz1/f;->h()I

    move-result p1

    iput p1, p0, Lp1/e0;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v0

    return v2

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_4
    return v2

    :goto_3
    monitor-exit v0

    throw p1
.end method

.method public final d(Lp1/f0;Lz1/f;)I
    .locals 20

    move-object/from16 v0, p2

    sget-object v1, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v1

    move-object/from16 v2, p0

    :try_start_0
    iget-object v3, v2, Lp1/e0;->e:La0/m0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v1

    iget v1, v3, La0/m0;->e:I

    const/4 v4, 0x7

    if-eqz v1, :cond_b

    invoke-static {}, Lp1/x;->q()Lr1/c;

    move-result-object v1

    iget-object v5, v1, Lr1/c;->w:[Ljava/lang/Object;

    iget v6, v1, Lr1/c;->y:I

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v6, :cond_0

    aget-object v9, v5, v8

    check-cast v9, Lp1/p;

    invoke-virtual {v9}, Lp1/p;->b()V

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v5, v3, La0/m0;->b:[Ljava/lang/Object;

    iget-object v6, v3, La0/m0;->c:[I

    iget-object v3, v3, La0/m0;->a:[J

    array-length v8, v3

    add-int/lit8 v8, v8, -0x2

    if-ltz v8, :cond_7

    move v10, v4

    const/4 v9, 0x0

    :goto_1
    aget-wide v11, v3, v9

    not-long v13, v11

    shl-long/2addr v13, v4

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_5

    sub-int v13, v9, v8

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v14, 0x8

    rsub-int/lit8 v13, v13, 0x8

    const/4 v15, 0x0

    :goto_2
    if-ge v15, v13, :cond_4

    const-wide/16 v16, 0xff

    and-long v16, v11, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_3

    shl-int/lit8 v16, v9, 0x3

    add-int v16, v16, v15

    aget-object v17, v5, v16

    move/from16 p1, v4

    aget v4, v6, v16

    move/from16 v16, v14

    move-object/from16 v14, v17

    check-cast v14, Lz1/z;

    const/4 v7, 0x1

    if-eq v4, v7, :cond_1

    move-object v7, v3

    goto :goto_4

    :cond_1
    instance-of v4, v14, Lp1/f0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v4, :cond_2

    :try_start_2
    check-cast v14, Lp1/f0;

    iget-object v4, v14, Lp1/f0;->z:Lp1/e0;

    invoke-static {v4, v0}, Lz1/l;->j(Lz1/b0;Lz1/f;)Lz1/b0;

    move-result-object v4

    check-cast v4, Lp1/e0;

    iget-object v7, v14, Lp1/f0;->x:Lc93/a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v2, 0x0

    :try_start_3
    invoke-virtual {v14, v4, v0, v2, v7}, Lp1/f0;->x(Lp1/e0;Lz1/f;ZLc93/a;)Lp1/e0;

    move-result-object v4

    goto :goto_3

    :catchall_0
    move-exception v0

    const/4 v2, 0x0

    goto/16 :goto_8

    :cond_2
    const/4 v2, 0x0

    invoke-interface {v14}, Lz1/z;->N()Lz1/b0;

    move-result-object v4

    invoke-static {v4, v0}, Lz1/l;->j(Lz1/b0;Lz1/f;)Lz1/b0;

    move-result-object v4

    :goto_3
    mul-int/lit8 v10, v10, 0x1f

    invoke-static {v4}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v10, v7

    mul-int/lit8 v10, v10, 0x1f

    move-object v7, v3

    iget-wide v2, v4, Lz1/b0;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    add-int/2addr v10, v2

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_8

    :cond_3
    move-object v7, v3

    move/from16 p1, v4

    move/from16 v16, v14

    :goto_4
    shr-long v11, v11, v16

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v2, p0

    move/from16 v4, p1

    move-object v3, v7

    move/from16 v14, v16

    goto :goto_2

    :cond_4
    move-object v7, v3

    move/from16 p1, v4

    move v2, v14

    if-ne v13, v2, :cond_8

    goto :goto_5

    :cond_5
    move-object v7, v3

    move/from16 p1, v4

    :goto_5
    if-eq v9, v8, :cond_6

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v2, p0

    move/from16 v4, p1

    move-object v3, v7

    goto/16 :goto_1

    :cond_6
    move v4, v10

    goto :goto_6

    :cond_7
    move/from16 p1, v4

    :goto_6
    move v10, v4

    :cond_8
    iget-object v0, v1, Lr1/c;->w:[Ljava/lang/Object;

    iget v1, v1, Lr1/c;->y:I

    const/4 v7, 0x0

    :goto_7
    if-ge v7, v1, :cond_9

    aget-object v2, v0, v7

    check-cast v2, Lp1/p;

    invoke-virtual {v2}, Lp1/p;->a()V

    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    :cond_9
    return v10

    :goto_8
    iget-object v2, v1, Lr1/c;->w:[Ljava/lang/Object;

    iget v1, v1, Lr1/c;->y:I

    const/4 v7, 0x0

    :goto_9
    if-ge v7, v1, :cond_a

    aget-object v3, v2, v7

    check-cast v3, Lp1/p;

    invoke-virtual {v3}, Lp1/p;->a()V

    add-int/lit8 v7, v7, 0x1

    goto :goto_9

    :cond_a
    throw v0

    :cond_b
    move/from16 p1, v4

    return p1

    :catchall_2
    move-exception v0

    monitor-exit v1

    throw v0
.end method
