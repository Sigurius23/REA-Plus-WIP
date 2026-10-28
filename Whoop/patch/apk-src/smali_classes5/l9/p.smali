.class public final Ll9/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/b0;


# instance fields
.field public final a:Ll9/o;

.field public b:Lz8/e;

.field public c:Ljc/b;

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:F

.field public final h:F

.field public i:Z


# direct methods
.method public constructor <init>(Lz8/e;)V
    .locals 1

    .line 1
    new-instance v0, Lt9/l;

    invoke-direct {v0}, Lt9/l;-><init>()V

    invoke-direct {p0, p1, v0}, Ll9/p;-><init>(Lz8/e;Lt9/l;)V

    return-void
.end method

.method public constructor <init>(Lz8/e;Lt9/l;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ll9/p;->b:Lz8/e;

    .line 4
    new-instance v0, Ljc/b;

    const/16 v1, 0x13

    .line 5
    invoke-direct {v0, v1}, Ljc/b;-><init>(I)V

    .line 6
    iput-object v0, p0, Ll9/p;->c:Ljc/b;

    .line 7
    new-instance v1, Ll9/o;

    invoke-direct {v1, p2, v0}, Ll9/o;-><init>(Lt9/l;Ljc/b;)V

    iput-object v1, p0, Ll9/p;->a:Ll9/o;

    .line 8
    iget-object p2, v1, Ll9/o;->e:Ljava/lang/Object;

    check-cast p2, Lz8/e;

    if-eq p1, p2, :cond_0

    .line 9
    iput-object p1, v1, Ll9/o;->e:Ljava/lang/Object;

    .line 10
    iget-object p1, v1, Ll9/o;->c:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 11
    iget-object p1, v1, Ll9/o;->d:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    iput-wide p1, p0, Ll9/p;->d:J

    .line 13
    iput-wide p1, p0, Ll9/p;->e:J

    .line 14
    iput-wide p1, p0, Ll9/p;->f:J

    const p1, -0x800001

    .line 15
    iput p1, p0, Ll9/p;->g:F

    .line 16
    iput p1, p0, Ll9/p;->h:F

    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Ll9/p;->i:Z

    return-void
.end method

.method public static e(Ljava/lang/Class;Lz8/e;)Ll9/b0;
    .locals 1

    :try_start_0
    const-class v0, Lz8/e;

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll9/b0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public final a(Ljc/b;)V
    .locals 2

    iput-object p1, p0, Ll9/p;->c:Ljc/b;

    iget-object v0, p0, Ll9/p;->a:Ll9/o;

    iput-object p1, v0, Ll9/o;->f:Ljava/lang/Object;

    iget-object v1, v0, Ll9/o;->b:Ljava/lang/Object;

    check-cast v1, Lt9/l;

    monitor-enter v1

    :try_start_0
    iput-object p1, v1, Lt9/l;->z:Ljc/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    iget-object v0, v0, Ll9/o;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll9/b0;

    invoke-interface {v1, p1}, Ll9/b0;->a(Ljc/b;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b(Lu8/x;)Ll9/a;
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v0, Lu8/x;->b:Lu8/u;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Lu8/x;->b:Lu8/u;

    iget-object v2, v2, Lu8/u;->a:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    const-string v4, "ssai"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    throw v3

    :cond_1
    :goto_0
    iget-object v2, v0, Lu8/x;->b:Lu8/u;

    iget-object v2, v2, Lu8/u;->b:Ljava/lang/String;

    const-string v4, "application/x-image-uri"

    invoke-static {v2, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    iget-object v2, v0, Lu8/x;->b:Lu8/u;

    iget-object v4, v2, Lu8/u;->a:Landroid/net/Uri;

    iget-object v2, v2, Lu8/u;->b:Ljava/lang/String;

    invoke-static {v4, v2}, Lx8/t;->D(Landroid/net/Uri;Ljava/lang/String;)I

    move-result v2

    iget-object v4, v0, Lu8/x;->b:Lu8/u;

    iget-wide v4, v4, Lu8/u;->e:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v4, v6

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    iget-object v4, v1, Ll9/p;->a:Ll9/o;

    iget-object v4, v4, Ll9/o;->b:Ljava/lang/Object;

    check-cast v4, Lt9/l;

    monitor-enter v4

    :try_start_0
    iput v5, v4, Lt9/l;->E:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_2
    :goto_1
    :try_start_2
    iget-object v4, v1, Ll9/p;->a:Ll9/o;

    iget-object v8, v4, Ll9/o;->d:Ljava/lang/Object;

    check-cast v8, Ljava/util/HashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll9/b0;

    if-eqz v9, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v4, v2}, Ll9/o;->a(I)Lyr/i;

    move-result-object v9

    invoke-interface {v9}, Lyr/i;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll9/b0;

    iget-object v10, v4, Ll9/o;->f:Ljava/lang/Object;

    check-cast v10, Ljc/b;

    invoke-interface {v9, v10}, Ll9/b0;->a(Ljc/b;)V

    iget-boolean v4, v4, Ll9/o;->a:Z

    invoke-interface {v9, v4}, Ll9/b0;->d(Z)V

    invoke-interface {v9}, Ll9/b0;->c()V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v8, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_2
    iget-object v2, v0, Lu8/x;->c:Lu8/t;

    invoke-virtual {v2}, Lu8/t;->a()Lf9/t;

    move-result-object v2

    iget-object v4, v0, Lu8/x;->c:Lu8/t;

    iget-wide v10, v4, Lu8/t;->a:J

    cmp-long v8, v10, v6

    if-nez v8, :cond_4

    iget-wide v10, v1, Ll9/p;->d:J

    iput-wide v10, v2, Lf9/t;->a:J

    :cond_4
    iget v8, v4, Lu8/t;->d:F

    const v10, -0x800001

    cmpl-float v8, v8, v10

    if-nez v8, :cond_5

    iget v8, v1, Ll9/p;->g:F

    iput v8, v2, Lf9/t;->d:F

    :cond_5
    iget v8, v4, Lu8/t;->e:F

    cmpl-float v8, v8, v10

    if-nez v8, :cond_6

    iget v8, v1, Ll9/p;->h:F

    iput v8, v2, Lf9/t;->e:F

    :cond_6
    iget-wide v10, v4, Lu8/t;->b:J

    cmp-long v8, v10, v6

    if-nez v8, :cond_7

    iget-wide v10, v1, Ll9/p;->e:J

    iput-wide v10, v2, Lf9/t;->b:J

    :cond_7
    iget-wide v10, v4, Lu8/t;->c:J

    cmp-long v4, v10, v6

    if-nez v4, :cond_8

    iget-wide v10, v1, Ll9/p;->f:J

    iput-wide v10, v2, Lf9/t;->c:J

    :cond_8
    new-instance v4, Lu8/t;

    invoke-direct {v4, v2}, Lu8/t;-><init>(Lf9/t;)V

    iget-object v2, v0, Lu8/x;->c:Lu8/t;

    invoke-virtual {v4, v2}, Lu8/t;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    new-instance v2, Lu8/w0;

    invoke-direct {v2}, Lu8/w0;-><init>()V

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v8, Lzr/w0;->E:Lzr/w0;

    sget-object v10, Lu8/v;->a:Lu8/v;

    iget-object v10, v0, Lu8/x;->e:Lu8/s;

    new-instance v11, Lt9/s;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    iget-wide v12, v10, Lu8/r;->a:J

    iput-wide v12, v11, Lt9/s;->a:J

    iget-object v10, v0, Lu8/x;->a:Ljava/lang/String;

    iget-object v12, v0, Lu8/x;->d:Lu8/a0;

    iget-object v13, v0, Lu8/x;->c:Lu8/t;

    invoke-virtual {v13}, Lu8/t;->a()Lf9/t;

    iget-object v13, v0, Lu8/x;->f:Lu8/v;

    iget-object v0, v0, Lu8/x;->b:Lu8/u;

    if-eqz v0, :cond_9

    iget-object v2, v0, Lu8/u;->b:Ljava/lang/String;

    iget-object v6, v0, Lu8/u;->a:Landroid/net/Uri;

    iget-object v7, v0, Lu8/u;->c:Ljava/util/List;

    iget-object v8, v0, Lu8/u;->d:Lzr/g0;

    new-instance v14, Lu8/w0;

    invoke-direct {v14}, Lu8/w0;-><init>()V

    iget-wide v14, v0, Lu8/u;->e:J

    move-object/from16 v18, v2

    move-object/from16 v17, v6

    move-object/from16 v20, v7

    move-wide/from16 v22, v14

    :goto_3
    move-object/from16 v21, v8

    goto :goto_4

    :cond_9
    move-object/from16 v20, v2

    move-object/from16 v17, v3

    move-object/from16 v18, v17

    move-wide/from16 v22, v6

    goto :goto_3

    :goto_4
    invoke-virtual {v4}, Lu8/t;->a()Lf9/t;

    move-result-object v0

    const/16 v19, 0x0

    if-eqz v17, :cond_a

    new-instance v16, Lu8/u;

    invoke-direct/range {v16 .. v23}, Lu8/u;-><init>(Landroid/net/Uri;Ljava/lang/String;Ls7/a;Ljava/util/List;Lzr/g0;J)V

    move-object/from16 v17, v16

    goto :goto_5

    :cond_a
    move-object/from16 v17, v19

    :goto_5
    new-instance v14, Lu8/x;

    if-eqz v10, :cond_b

    :goto_6
    move-object v15, v10

    goto :goto_7

    :cond_b
    const-string v10, ""

    goto :goto_6

    :goto_7
    new-instance v2, Lu8/s;

    invoke-direct {v2, v11}, Lu8/r;-><init>(Lt9/s;)V

    new-instance v4, Lu8/t;

    invoke-direct {v4, v0}, Lu8/t;-><init>(Lf9/t;)V

    if-eqz v12, :cond_c

    :goto_8
    move-object/from16 v16, v2

    move-object/from16 v18, v4

    move-object/from16 v19, v12

    move-object/from16 v20, v13

    goto :goto_9

    :cond_c
    sget-object v12, Lu8/a0;->B:Lu8/a0;

    goto :goto_8

    :goto_9
    invoke-direct/range {v14 .. v20}, Lu8/x;-><init>(Ljava/lang/String;Lu8/s;Lu8/u;Lu8/t;Lu8/a0;Lu8/v;)V

    goto :goto_a

    :cond_d
    move-object v14, v0

    :goto_a
    invoke-interface {v9, v14}, Ll9/b0;->b(Lu8/x;)Ll9/a;

    move-result-object v0

    iget-object v2, v14, Lu8/x;->b:Lu8/u;

    iget-object v2, v2, Lu8/u;->d:Lzr/g0;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_11

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    add-int/2addr v4, v5

    new-array v4, v4, [Ll9/a;

    const/4 v6, 0x0

    aput-object v0, v4, v6

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_10

    iget-boolean v0, v1, Ll9/p;->i:Z

    if-eqz v0, :cond_f

    new-instance v0, Lu8/o;

    invoke-direct {v0}, Lu8/o;-><init>()V

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu8/w;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lu8/d0;->a:Ljava/util/ArrayList;

    iput-object v3, v0, Lu8/o;->m:Ljava/lang/String;

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu8/w;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v3, v0, Lu8/o;->d:Ljava/lang/String;

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu8/w;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput v6, v0, Lu8/o;->e:I

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu8/w;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput v6, v0, Lu8/o;->f:I

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu8/w;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v3, v0, Lu8/o;->b:Ljava/lang/String;

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu8/w;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v3, v0, Lu8/o;->a:Ljava/lang/String;

    new-instance v4, Lu8/p;

    invoke-direct {v4, v0}, Lu8/p;-><init>(Lu8/o;)V

    iget-object v0, v1, Ll9/p;->c:Ljc/b;

    invoke-virtual {v0, v4}, Ljc/b;->g(Lu8/p;)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {v4}, Lu8/p;->a()Lu8/o;

    move-result-object v0

    const-string v5, "application/x-media3-cues"

    invoke-static {v5}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v0, Lu8/o;->m:Ljava/lang/String;

    iget-object v5, v4, Lu8/p;->n:Ljava/lang/String;

    iput-object v5, v0, Lu8/o;->j:Ljava/lang/String;

    iget-object v5, v1, Ll9/p;->c:Ljc/b;

    invoke-virtual {v5, v4}, Ljc/b;->i(Lu8/p;)I

    move-result v4

    iput v4, v0, Lu8/o;->I:I

    new-instance v4, Lu8/p;

    invoke-direct {v4, v0}, Lu8/p;-><init>(Lu8/o;)V

    :cond_e
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/w;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v3

    :cond_f
    iget-object v0, v1, Ll9/p;->b:Lz8/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/w;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sget-object v2, Lzr/g0;->x:Lzr/e0;

    sget-object v2, Lzr/w0;->E:Lzr/w0;

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v2, Lzr/w0;->E:Lzr/w0;

    sget-object v2, Lu8/v;->a:Lu8/v;

    sget-object v2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v3

    :cond_10
    new-instance v0, Ll9/m0;

    invoke-direct {v0, v4}, Ll9/m0;-><init>([Ll9/a;)V

    :cond_11
    iget-object v2, v14, Lu8/x;->e:Lu8/s;

    iget-wide v3, v2, Lu8/r;->a:J

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v3, v3, v6

    if-nez v3, :cond_12

    goto :goto_b

    :cond_12
    new-instance v3, Ll9/d;

    invoke-direct {v3, v0}, Ll9/d;-><init>(Ll9/a;)V

    iget-boolean v0, v3, Ll9/d;->d:Z

    xor-int/2addr v0, v5

    invoke-static {v0}, Lva3/g;->i(Z)V

    iget-wide v6, v2, Lu8/r;->a:J

    iget-boolean v0, v3, Ll9/d;->d:Z

    xor-int/2addr v0, v5

    invoke-static {v0}, Lva3/g;->i(Z)V

    iput-wide v6, v3, Ll9/d;->b:J

    iget-boolean v0, v3, Ll9/d;->d:Z

    xor-int/2addr v0, v5

    invoke-static {v0}, Lva3/g;->i(Z)V

    iput-boolean v5, v3, Ll9/d;->c:Z

    iget-boolean v0, v3, Ll9/d;->d:Z

    xor-int/2addr v0, v5

    invoke-static {v0}, Lva3/g;->i(Z)V

    iget-boolean v0, v3, Ll9/d;->d:Z

    xor-int/2addr v0, v5

    invoke-static {v0}, Lva3/g;->i(Z)V

    iput-boolean v5, v3, Ll9/d;->d:Z

    new-instance v0, Ll9/f;

    invoke-direct {v0, v3}, Ll9/f;-><init>(Ll9/d;)V

    :goto_b
    iget-object v2, v14, Lu8/x;->b:Lu8/u;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v14, Lu8/x;->b:Lu8/u;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0

    :catch_0
    move-exception v0

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :cond_13
    iget-object v0, v0, Lu8/x;->b:Lu8/u;

    iget-wide v4, v0, Lu8/u;->e:J

    sget v0, Lx8/t;->a:I

    throw v3
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Ll9/p;->a:Ll9/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Ll9/o;->b:Ljava/lang/Object;

    check-cast v0, Lt9/l;

    monitor-enter v0

    monitor-exit v0

    return-void
.end method

.method public final d(Z)V
    .locals 2

    iput-boolean p1, p0, Ll9/p;->i:Z

    iget-object v0, p0, Ll9/p;->a:Ll9/o;

    iput-boolean p1, v0, Ll9/o;->a:Z

    iget-object v1, v0, Ll9/o;->b:Ljava/lang/Object;

    check-cast v1, Lt9/l;

    monitor-enter v1

    :try_start_0
    iput-boolean p1, v1, Lt9/l;->y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    iget-object v0, v0, Ll9/o;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll9/b0;

    invoke-interface {v1, p1}, Ll9/b0;->d(Z)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
