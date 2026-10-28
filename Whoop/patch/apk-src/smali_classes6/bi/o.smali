.class public final Lbi/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luh/f;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lfi/o;

.field public final c:Ll83/h;

.field public final d:Ll83/p;

.field public final e:Ll83/h;

.field public final f:Lbi/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lfi/o;Ll83/p;Ll83/p;Ll83/p;Lbi/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbi/o;->a:Ljava/lang/String;

    iput-object p2, p0, Lbi/o;->b:Lfi/o;

    iput-object p3, p0, Lbi/o;->c:Ll83/h;

    iput-object p4, p0, Lbi/o;->d:Ll83/p;

    iput-object p5, p0, Lbi/o;->e:Ll83/h;

    iput-object p6, p0, Lbi/o;->f:Lbi/e;

    return-void
.end method

.method public static final b(Lbi/o;Lbi/t;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lbi/m;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lbi/m;

    iget v1, v0, Lbi/m;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbi/m;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbi/m;

    invoke-direct {v0, p0, p2}, Lbi/m;-><init>(Lbi/o;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lbi/m;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbi/m;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lbi/m;->x:Lne3/h;

    iget-object p1, v0, Lbi/m;->w:Lbi/o;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p0

    move-object p0, p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lne3/h;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p0, v0, Lbi/m;->w:Lbi/o;

    iput-object p2, v0, Lbi/m;->x:Lne3/h;

    iput v3, v0, Lbi/m;->E:I

    iget-object p1, p1, Lbi/t;->w:Lne3/j;

    invoke-interface {p1, p2}, Lne3/j;->P0(Lne3/i;)J

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lbi/o;->e()Lne3/p;

    move-result-object p0

    invoke-static {p2, p0}, Ls2/d;->h(Lne3/j;Lne3/p;)Lsh/s;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lbi/o;Lth/g;Lbi/s;Lbi/s;Ls83/c;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v5, v4, Lbi/n;

    if-eqz v5, :cond_0

    move-object v5, v4

    check-cast v5, Lbi/n;

    iget v6, v5, Lbi/n;->F:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Lbi/n;->F:I

    goto :goto_0

    :cond_0
    new-instance v5, Lbi/n;

    invoke-direct {v5, v0, v4}, Lbi/n;-><init>(Lbi/o;Ls83/c;)V

    :goto_0
    iget-object v4, v5, Lbi/n;->z:Ljava/lang/Object;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v7, v5, Lbi/n;->F:I

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v7, :cond_3

    if-eq v7, v10, :cond_2

    if-ne v7, v8, :cond_1

    iget-object v0, v5, Lbi/n;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lth/f;

    iget-object v0, v5, Lbi/n;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbi/s;

    iget-object v0, v5, Lbi/n;->w:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lbi/s;

    :try_start_0
    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 p4, v11

    goto/16 :goto_e

    :catch_0
    move-exception v0

    goto/16 :goto_10

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v5, Lbi/n;->y:Ljava/lang/Object;

    check-cast v0, Lbi/s;

    iget-object v1, v5, Lbi/n;->x:Ljava/lang/Object;

    check-cast v1, Lth/g;

    iget-object v2, v5, Lbi/n;->w:Ljava/lang/Object;

    check-cast v2, Lbi/o;

    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v3, v0

    move-object/from16 p4, v11

    goto/16 :goto_4

    :cond_3
    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, v0, Lbi/o;->b:Lfi/o;

    iget-object v4, v4, Lfi/o;->h:Lfi/b;

    iget-boolean v4, v4, Lfi/b;->x:Z

    if-nez v4, :cond_5

    if-eqz v1, :cond_4

    :try_start_1
    invoke-static {v1}, Lm4/a;->w(Ljava/lang/AutoCloseable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v11

    :catch_1
    :cond_4
    move-object/from16 p4, v11

    goto/16 :goto_6

    :catch_2
    move-exception v0

    throw v0

    :cond_5
    iget-object v4, v0, Lbi/o;->e:Ll83/h;

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbi/c;

    iput-object v0, v5, Lbi/n;->w:Ljava/lang/Object;

    iput-object v1, v5, Lbi/n;->x:Ljava/lang/Object;

    iput-object v3, v5, Lbi/n;->y:Ljava/lang/Object;

    iput v10, v5, Lbi/n;->F:I

    check-cast v4, Lci/a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, v3, Lbi/s;->a:I

    const/16 v7, 0x130

    if-ne v4, v7, :cond_8

    if-eqz v2, :cond_8

    iget-object v2, v2, Lbi/s;->d:Lbi/q;

    iget-object v4, v3, Lbi/s;->d:Lbi/q;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, Lbi/q;->a:Ljava/util/Map;

    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map$Entry;

    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Collection;

    invoke-static {v12}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v12

    invoke-interface {v7, v13, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_6
    iget-object v2, v4, Lbi/q;->a:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v12, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "toLowerCase(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-interface {v7, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_7
    new-instance v2, Lbi/q;

    invoke-static {v7}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    invoke-direct {v2, v4}, Lbi/q;-><init>(Ljava/util/Map;)V

    new-instance v4, Lbi/b;

    iget v14, v3, Lbi/s;->a:I

    iget-wide v12, v3, Lbi/s;->b:J

    move-object/from16 p4, v11

    move-wide v15, v12

    iget-wide v11, v3, Lbi/s;->c:J

    iget-object v7, v3, Lbi/s;->f:Ljava/lang/Object;

    new-instance v13, Lbi/s;

    const/16 v20, 0x0

    move-object/from16 v19, v2

    move-object/from16 v21, v7

    move-wide/from16 v17, v11

    invoke-direct/range {v13 .. v21}, Lbi/s;-><init>(IJJLbi/q;Lbi/t;Ljava/lang/Object;)V

    invoke-direct {v4, v13}, Lbi/b;-><init>(Lbi/s;)V

    goto :goto_3

    :cond_8
    move-object/from16 p4, v11

    new-instance v2, Lbi/b;

    invoke-direct {v2, v3}, Lbi/b;-><init>(Lbi/s;)V

    move-object v4, v2

    :goto_3
    if-ne v4, v6, :cond_9

    goto/16 :goto_f

    :cond_9
    move-object v2, v0

    :goto_4
    check-cast v4, Lbi/b;

    iget-object v4, v4, Lbi/b;->a:Lbi/s;

    if-nez v4, :cond_a

    goto :goto_6

    :cond_a
    if-eqz v1, :cond_b

    iget-object v0, v1, Lth/g;->w:Lth/c;

    iget-object v1, v0, Lth/c;->y:Lth/e;

    iget-object v7, v1, Lth/e;->H:Ljava/lang/Object;

    monitor-enter v7

    :try_start_2
    invoke-virtual {v0}, Lth/c;->close()V

    iget-object v0, v0, Lth/c;->w:Lth/b;

    iget-object v0, v0, Lth/b;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lth/e;->h(Ljava/lang/String;)Lb9/b;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v7

    if-eqz v0, :cond_d

    new-instance v1, Lth/f;

    invoke-direct {v1, v0}, Lth/f;-><init>(Lb9/b;)V

    goto :goto_5

    :catchall_0
    move-exception v0

    monitor-exit v7

    throw v0

    :cond_b
    iget-object v0, v2, Lbi/o;->d:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lth/a;

    if-eqz v0, :cond_d

    iget-object v1, v2, Lbi/o;->b:Lfi/o;

    iget-object v1, v1, Lfi/o;->e:Ljava/lang/String;

    if-nez v1, :cond_c

    iget-object v1, v2, Lbi/o;->a:Ljava/lang/String;

    :cond_c
    check-cast v0, Lth/h;

    iget-object v0, v0, Lth/h;->b:Lth/e;

    sget-object v7, Lne3/l;->z:Lne3/k;

    invoke-static {v1}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object v1

    const-string v7, "SHA-256"

    invoke-virtual {v1, v7}, Lne3/l;->c(Ljava/lang/String;)Lne3/l;

    move-result-object v1

    invoke-virtual {v1}, Lne3/l;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lth/e;->h(Ljava/lang/String;)Lb9/b;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v1, Lth/f;

    invoke-direct {v1, v0}, Lth/f;-><init>(Lb9/b;)V

    goto :goto_5

    :cond_d
    move-object/from16 v1, p4

    :goto_5
    if-nez v1, :cond_e

    :goto_6
    return-object p4

    :cond_e
    :try_start_3
    invoke-virtual {v2}, Lbi/o;->e()Lne3/p;

    move-result-object v0

    iget-object v7, v1, Lth/f;->a:Lb9/b;

    invoke-virtual {v7, v9}, Lb9/b;->k(I)Lne3/e0;

    move-result-object v7

    invoke-virtual {v0, v7, v9}, Lne3/p;->p0(Lne3/e0;Z)Lne3/n0;

    move-result-object v0

    invoke-static {v0}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v7
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :try_start_4
    invoke-static {v4, v7}, Lse/a;->l0(Lbi/s;Lne3/h0;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-virtual {v7}, Lne3/h0;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-object/from16 v0, p4

    goto :goto_8

    :catchall_1
    move-exception v0

    goto :goto_8

    :catchall_2
    move-exception v0

    move-object v11, v0

    :try_start_6
    invoke-virtual {v7}, Lne3/h0;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_7

    :catchall_3
    move-exception v0

    :try_start_7
    invoke-static {v11, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_7
    move-object v0, v11

    :goto_8
    if-nez v0, :cond_12

    iget-object v0, v4, Lbi/s;->e:Lbi/t;

    if-eqz v0, :cond_10

    invoke-virtual {v2}, Lbi/o;->e()Lne3/p;

    move-result-object v2

    iget-object v7, v1, Lth/f;->a:Lb9/b;

    invoke-virtual {v7, v10}, Lb9/b;->k(I)Lne3/e0;

    move-result-object v7

    iput-object v3, v5, Lbi/n;->w:Ljava/lang/Object;

    iput-object v4, v5, Lbi/n;->x:Ljava/lang/Object;

    iput-object v1, v5, Lbi/n;->y:Ljava/lang/Object;

    iput v8, v5, Lbi/n;->F:I

    iget-object v0, v0, Lbi/t;->w:Lne3/j;

    invoke-virtual {v2, v7, v9}, Lne3/p;->p0(Lne3/e0;Z)Lne3/n0;

    move-result-object v2

    invoke-static {v2}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    :try_start_8
    invoke-interface {v0, v2}, Lne3/j;->P0(Lne3/i;)J

    move-result-wide v7

    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, v7, v8}, Ljava/lang/Long;-><init>(J)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :try_start_9
    invoke-virtual {v2}, Lne3/h0;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    move-object/from16 v0, p4

    goto :goto_c

    :catchall_4
    move-exception v0

    goto :goto_c

    :goto_9
    move-object v5, v0

    goto :goto_a

    :catchall_5
    move-exception v0

    goto :goto_9

    :goto_a
    :try_start_a
    invoke-virtual {v2}, Lne3/h0;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    goto :goto_b

    :catchall_6
    move-exception v0

    :try_start_b
    invoke-static {v5, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_b
    move-object v0, v5

    :goto_c
    if-nez v0, :cond_f

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-ne v0, v6, :cond_10

    goto :goto_f

    :cond_f
    throw v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3

    :goto_d
    move-object v2, v4

    goto :goto_10

    :catch_3
    move-exception v0

    goto :goto_d

    :cond_10
    move-object v2, v4

    :goto_e
    :try_start_c
    iget-object v0, v1, Lth/f;->a:Lb9/b;

    iget-object v4, v0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v4, Lth/e;

    iget-object v5, v4, Lth/e;->H:Ljava/lang/Object;

    monitor-enter v5
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    :try_start_d
    invoke-virtual {v0, v10}, Lb9/b;->f(Z)V

    iget-object v0, v0, Lb9/b;->y:Ljava/lang/Object;

    check-cast v0, Lth/b;

    iget-object v0, v0, Lth/b;->a:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lth/e;->i(Ljava/lang/String;)Lth/c;

    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    :try_start_e
    monitor-exit v5

    if-eqz v0, :cond_11

    new-instance v4, Lth/g;

    invoke-direct {v4, v0}, Lth/g;-><init>(Lth/c;)V

    move-object v6, v4

    goto :goto_f

    :cond_11
    move-object/from16 v6, p4

    :goto_f
    return-object v6

    :catchall_7
    move-exception v0

    monitor-exit v5

    throw v0
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0

    :cond_12
    :try_start_f
    throw v0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_3

    :goto_10
    :try_start_10
    iget-object v1, v1, Lth/f;->a:Lb9/b;

    invoke-virtual {v1, v9}, Lb9/b;->f(Z)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_4

    :catch_4
    iget-object v1, v3, Lbi/s;->e:Lbi/t;

    if-eqz v1, :cond_13

    :try_start_11
    invoke-static {v1}, Lm4/a;->w(Ljava/lang/AutoCloseable;)V
    :try_end_11
    .catch Ljava/lang/RuntimeException; {:try_start_11 .. :try_end_11} :catch_5
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_6

    goto :goto_11

    :catch_5
    move-exception v0

    throw v0

    :catch_6
    :cond_13
    :goto_11
    iget-object v1, v2, Lbi/s;->e:Lbi/t;

    if-eqz v1, :cond_14

    :try_start_12
    invoke-static {v1}, Lm4/a;->w(Ljava/lang/AutoCloseable;)V
    :try_end_12
    .catch Ljava/lang/RuntimeException; {:try_start_12 .. :try_end_12} :catch_7
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_8

    goto :goto_12

    :catch_7
    move-exception v0

    throw v0

    :catch_8
    :cond_14
    :goto_12
    throw v0
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "text/plain"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {p0}, Lcom/squareup/wire/n;->K(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    if-eqz p1, :cond_2

    const/16 p0, 0x3b

    invoke-static {p1, p0}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 14

    instance-of v0, p1, Lbi/l;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lbi/l;

    iget v1, v0, Lbi/l;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbi/l;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbi/l;

    check-cast p1, Ls83/c;

    invoke-direct {v0, p0, p1}, Lbi/l;-><init>(Lbi/o;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lbi/l;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbi/l;->F:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lbi/l;->w:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/internal/g0;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_9

    :catch_0
    move-exception v0

    :goto_1
    move-object p1, v0

    goto/16 :goto_a

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lbi/l;->x:Lkotlin/jvm/internal/g0;

    iget-object v4, v0, Lbi/l;->w:Ljava/lang/Object;

    check-cast v4, Lbi/o;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_7

    :catch_1
    move-exception v0

    move-object p1, v0

    move-object v1, v2

    goto/16 :goto_a

    :cond_3
    iget-object v2, v0, Lbi/l;->y:Lkotlin/jvm/internal/g0;

    iget-object v5, v0, Lbi/l;->x:Lkotlin/jvm/internal/g0;

    iget-object v7, v0, Lbi/l;->w:Ljava/lang/Object;

    check-cast v7, Lbi/o;

    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_4

    :catch_2
    move-exception v0

    move-object p1, v0

    move-object v1, v5

    goto/16 :goto_a

    :cond_4
    invoke-static {p1}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object p1

    iget-object v2, p0, Lbi/o;->b:Lfi/o;

    iget-object v7, v2, Lfi/o;->h:Lfi/b;

    iget-boolean v7, v7, Lfi/b;->w:Z

    iget-object v8, p0, Lbi/o;->a:Ljava/lang/String;

    if-eqz v7, :cond_6

    iget-object v7, p0, Lbi/o;->d:Ll83/p;

    invoke-virtual {v7}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lth/a;

    if-eqz v7, :cond_6

    iget-object v2, v2, Lfi/o;->e:Ljava/lang/String;

    if-nez v2, :cond_5

    move-object v2, v8

    :cond_5
    check-cast v7, Lth/h;

    iget-object v7, v7, Lth/h;->b:Lth/e;

    sget-object v9, Lne3/l;->z:Lne3/k;

    invoke-static {v2}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object v2

    const-string v9, "SHA-256"

    invoke-virtual {v2, v9}, Lne3/l;->c(Ljava/lang/String;)Lne3/l;

    move-result-object v2

    invoke-virtual {v2}, Lne3/l;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Lth/e;->i(Ljava/lang/String;)Lth/c;

    move-result-object v2

    if-eqz v2, :cond_6

    new-instance v7, Lth/g;

    invoke-direct {v7, v2}, Lth/g;-><init>(Lth/c;)V

    goto :goto_2

    :cond_6
    move-object v7, v6

    :goto_2
    iput-object v7, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :try_start_3
    new-instance v2, Lkotlin/jvm/internal/g0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    if-eqz v7, :cond_c

    invoke-virtual {p0}, Lbi/o;->e()Lne3/p;

    move-result-object v7

    iget-object v9, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v9, Lth/g;

    iget-object v9, v9, Lth/g;->w:Lth/c;

    iget-boolean v10, v9, Lth/c;->x:Z

    if-nez v10, :cond_b

    iget-object v9, v9, Lth/c;->w:Lth/b;

    iget-object v9, v9, Lth/b;->c:Ljava/util/ArrayList;

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lne3/e0;

    invoke-virtual {v7, v9}, Lne3/p;->T(Lne3/e0;)Ln4/f;

    move-result-object v7

    iget-object v7, v7, Ln4/f;->e:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Long;

    if-nez v7, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    const-wide/16 v11, 0x0

    cmp-long v7, v9, v11

    if-nez v7, :cond_8

    new-instance v0, Luh/h;

    iget-object v1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lth/g;

    invoke-virtual {p0, v1}, Lbi/o;->h(Lth/g;)Lsh/p;

    move-result-object v1

    invoke-static {v8, v6}, Lbi/o;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lsh/h;->y:Lsh/h;

    invoke-direct {v0, v1, v2, v3}, Luh/h;-><init>(Lsh/q;Ljava/lang/String;Lsh/h;)V

    return-object v0

    :catch_3
    move-exception v0

    move-object v1, p1

    goto/16 :goto_1

    :cond_8
    :goto_3
    iget-object v7, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v7, Lth/g;

    invoke-virtual {p0, v7}, Lbi/o;->i(Lth/g;)Lbi/s;

    move-result-object v7

    iput-object v7, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v7, :cond_c

    iget-object v7, p0, Lbi/o;->e:Ll83/h;

    invoke-interface {v7}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lbi/c;

    iget-object v8, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v8, Lbi/s;

    invoke-virtual {p0}, Lbi/o;->g()Lbi/r;

    iput-object p0, v0, Lbi/l;->w:Ljava/lang/Object;

    iput-object p1, v0, Lbi/l;->x:Lkotlin/jvm/internal/g0;

    iput-object v2, v0, Lbi/l;->y:Lkotlin/jvm/internal/g0;

    iput v5, v0, Lbi/l;->F:I

    check-cast v7, Lci/a;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lbi/a;

    invoke-direct {v5, v8}, Lbi/a;-><init>(Lbi/s;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    if-ne v5, v1, :cond_9

    goto/16 :goto_8

    :cond_9
    move-object v7, v5

    move-object v5, p1

    move-object p1, v7

    move-object v7, p0

    :goto_4
    :try_start_4
    check-cast p1, Lbi/a;

    iget-object v8, p1, Lbi/a;->a:Lbi/s;

    if-eqz v8, :cond_a

    new-instance v0, Luh/h;

    iget-object v1, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lth/g;

    invoke-virtual {v7, v1}, Lbi/o;->h(Lth/g;)Lsh/p;

    move-result-object v1

    iget-object v2, v7, Lbi/o;->a:Ljava/lang/String;

    iget-object p1, p1, Lbi/a;->a:Lbi/s;

    iget-object p1, p1, Lbi/s;->d:Lbi/q;

    invoke-virtual {p1}, Lbi/q;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lbi/o;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v2, Lsh/h;->y:Lsh/h;

    invoke-direct {v0, v1, p1, v2}, Luh/h;-><init>(Lsh/q;Ljava/lang/String;Lsh/h;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    return-object v0

    :cond_a
    move-object v8, v5

    move-object v9, v7

    :goto_5
    move-object v10, v2

    goto :goto_6

    :cond_b
    :try_start_5
    const-string v0, "snapshot is closed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    :cond_c
    move-object v9, p0

    move-object v8, p1

    goto :goto_5

    :goto_6
    :try_start_6
    invoke-virtual {v9}, Lbi/o;->g()Lbi/r;

    move-result-object v11

    new-instance v7, La30/s;

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-direct/range {v7 .. v13}, La30/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object v9, v0, Lbi/l;->w:Ljava/lang/Object;

    iput-object v8, v0, Lbi/l;->x:Lkotlin/jvm/internal/g0;

    iput-object v6, v0, Lbi/l;->y:Lkotlin/jvm/internal/g0;

    iput v4, v0, Lbi/l;->F:I

    invoke-virtual {v9, v11, v7, v0}, Lbi/o;->d(Lbi/r;Lc93/m;Lbi/l;)Ljava/lang/Object;

    move-result-object p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    if-ne p1, v1, :cond_d

    goto :goto_8

    :cond_d
    move-object v2, v8

    move-object v4, v9

    :goto_7
    :try_start_7
    check-cast p1, Luh/h;

    if-nez p1, :cond_f

    invoke-virtual {v4}, Lbi/o;->g()Lbi/r;

    move-result-object p1

    new-instance v5, Le;

    const/16 v7, 0x17

    invoke-direct {v5, v4, v6, v7}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object v2, v0, Lbi/l;->w:Ljava/lang/Object;

    iput-object v6, v0, Lbi/l;->x:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lbi/l;->F:I

    invoke-virtual {v4, p1, v5, v0}, Lbi/o;->d(Lbi/r;Lc93/m;Lbi/l;)Ljava/lang/Object;

    move-result-object p1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    if-ne p1, v1, :cond_e

    :goto_8
    return-object v1

    :cond_e
    move-object v1, v2

    :goto_9
    :try_start_8
    check-cast p1, Luh/h;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    :cond_f
    return-object p1

    :catch_4
    move-exception v0

    move-object p1, v0

    move-object v1, v8

    :goto_a
    iget-object v0, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lth/g;

    if-eqz v0, :cond_10

    :try_start_9
    invoke-static {v0}, Lm4/a;->w(Ljava/lang/AutoCloseable;)V
    :try_end_9
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_5
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    goto :goto_b

    :catch_5
    move-exception v0

    move-object p1, v0

    throw p1

    :catch_6
    :cond_10
    :goto_b
    throw p1
.end method

.method public final d(Lbi/r;Lc93/m;Lbi/l;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lbi/o;->b:Lfi/o;

    iget-object v0, v0, Lfi/o;->i:Lfi/b;

    iget-boolean v0, v0, Lfi/b;->w:Z

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/os/NetworkOnMainThreadException;

    invoke-direct {p1}, Landroid/os/NetworkOnMainThreadException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lbi/o;->c:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lei/b;

    new-instance v1, Lbi/k;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, p2, v2, v3}, Lbi/k;-><init>(Lc93/m;Lq83/d;I)V

    iget-object p2, v0, Lei/b;->a:Lud3/l0;

    invoke-static {p2, p1, v1, p3}, Lei/b;->a(Lud3/l0;Lbi/r;Lbi/k;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e()Lne3/p;
    .locals 1

    iget-object v0, p0, Lbi/o;->d:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lth/a;

    if-eqz v0, :cond_1

    check-cast v0, Lth/h;

    iget-object v0, v0, Lth/h;->a:Lne3/p;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lbi/o;->b:Lfi/o;

    iget-object v0, v0, Lfi/o;->f:Lne3/p;

    return-object v0
.end method

.method public final g()Lbi/r;
    .locals 5

    sget-object v0, Lbi/h;->b:Lf93/a;

    iget-object v1, p0, Lbi/o;->b:Lfi/o;

    invoke-static {v1, v0}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbi/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lbi/p;

    invoke-direct {v2, v0}, Lbi/p;-><init>(Lbi/q;)V

    iget-object v0, v1, Lfi/o;->h:Lfi/b;

    iget-boolean v3, v0, Lfi/b;->w:Z

    iget-object v4, v1, Lfi/o;->i:Lfi/b;

    iget-boolean v4, v4, Lfi/b;->w:Z

    if-eqz v4, :cond_0

    iget-object v4, p0, Lbi/o;->f:Lbi/e;

    invoke-interface {v4}, Lbi/e;->isOnline()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-nez v4, :cond_1

    if-eqz v3, :cond_1

    const-string v0, "only-if-cached, max-stale=2147483647"

    invoke-virtual {v2, v0}, Lbi/p;->d(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    if-eqz v4, :cond_3

    if-nez v3, :cond_3

    iget-boolean v0, v0, Lfi/b;->x:Z

    if-eqz v0, :cond_2

    const-string v0, "no-cache"

    invoke-virtual {v2, v0}, Lbi/p;->d(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const-string v0, "no-cache, no-store"

    invoke-virtual {v2, v0}, Lbi/p;->d(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    if-nez v4, :cond_4

    if-nez v3, :cond_4

    const-string v0, "no-cache, only-if-cached"

    invoke-virtual {v2, v0}, Lbi/p;->d(Ljava/lang/String;)V

    :cond_4
    :goto_1
    new-instance v0, Lbi/r;

    sget-object v3, Lbi/h;->a:Lf93/a;

    invoke-static {v1, v3}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v4, Lbi/q;

    iget-object v2, v2, Lbi/p;->a:Ljava/util/LinkedHashMap;

    invoke-static {v2}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {v4, v2}, Lbi/q;-><init>(Ljava/util/Map;)V

    sget-object v2, Lbi/h;->c:Lf93/a;

    invoke-static {v1, v2}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_5

    iget-object v1, v1, Lfi/o;->j:Lrh/i;

    iget-object v2, p0, Lbi/o;->a:Ljava/lang/String;

    invoke-direct {v0, v2, v3, v4, v1}, Lbi/r;-><init>(Ljava/lang/String;Ljava/lang/String;Lbi/q;Lrh/i;)V

    return-object v0

    :cond_5
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0
.end method

.method public final h(Lth/g;)Lsh/p;
    .locals 4

    iget-object v0, p1, Lth/g;->w:Lth/c;

    iget-boolean v1, v0, Lth/c;->x:Z

    if-nez v1, :cond_1

    iget-object v0, v0, Lth/c;->w:Lth/b;

    iget-object v0, v0, Lth/b;->c:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lne3/e0;

    invoke-virtual {p0}, Lbi/o;->e()Lne3/p;

    move-result-object v1

    iget-object v2, p0, Lbi/o;->b:Lfi/o;

    iget-object v2, v2, Lfi/o;->e:Ljava/lang/String;

    if-nez v2, :cond_0

    iget-object v2, p0, Lbi/o;->a:Ljava/lang/String;

    :cond_0
    const/16 v3, 0x10

    invoke-static {v0, v1, v2, p1, v3}, Ls2/d;->g(Lne3/e0;Lne3/p;Ljava/lang/String;Lth/g;I)Lsh/p;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "snapshot is closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i(Lth/g;)Lbi/s;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lbi/o;->e()Lne3/p;

    move-result-object v1

    iget-object p1, p1, Lth/g;->w:Lth/c;

    iget-boolean v2, p1, Lth/c;->x:Z

    if-nez v2, :cond_1

    iget-object p1, p1, Lth/c;->w:Lth/b;

    iget-object p1, p1, Lth/b;->c:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lne3/e0;

    invoke-virtual {v1, p1}, Lne3/p;->x0(Lne3/e0;)Lne3/p0;

    move-result-object p1

    invoke-static {p1}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {p1}, Lse/a;->T(Lne3/j0;)Lbi/s;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {p1}, Lne3/j0;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object p1, v0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_3
    invoke-virtual {p1}, Lne3/j0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception p1

    :try_start_4
    invoke-static {v1, p1}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_0
    move-object p1, v1

    move-object v1, v0

    :goto_1
    if-nez p1, :cond_0

    return-object v1

    :cond_0
    throw p1

    :cond_1
    const-string p1, "snapshot is closed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    return-object v0
.end method
