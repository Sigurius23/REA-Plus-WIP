.class public final Lzk/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/ArrayList;

.field public c:Lcom/bumptech/glide/c;

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:I

.field public g:Ljava/lang/Class;

.field public h:Lio/sentry/android/core/util/a;

.field public i:Lwk/h;

.field public j:Ljava/util/Map;

.field public k:Ljava/lang/Class;

.field public l:Z

.field public m:Z

.field public n:Lwk/e;

.field public o:Lcom/bumptech/glide/d;

.field public p:Lzk/k;

.field public q:Z

.field public r:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzk/g;->a:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzk/g;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 8

    iget-boolean v0, p0, Lzk/g;->m:Z

    iget-object v1, p0, Lzk/g;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzk/g;->m:Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Lzk/g;->b()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_3

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ldl/s;

    iget-object v6, v5, Ldl/s;->a:Lwk/e;

    iget-object v7, v5, Ldl/s;->b:Ljava/util/List;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    iget-object v5, v5, Ldl/s;->a:Lwk/e;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    move v5, v3

    :goto_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_2

    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public final b()Ljava/util/ArrayList;
    .locals 9

    iget-boolean v0, p0, Lzk/g;->l:Z

    iget-object v1, p0, Lzk/g;->a:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzk/g;->l:Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lzk/g;->c:Lcom/bumptech/glide/c;

    iget-object v0, v0, Lcom/bumptech/glide/c;->b:La3/l1;

    iget-object v2, p0, Lzk/g;->d:Ljava/lang/Object;

    invoke-virtual {v0, v2}, La3/l1;->i(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ldl/t;

    iget-object v5, p0, Lzk/g;->d:Ljava/lang/Object;

    iget v6, p0, Lzk/g;->e:I

    iget v7, p0, Lzk/g;->f:I

    iget-object v8, p0, Lzk/g;->i:Lwk/h;

    invoke-interface {v4, v5, v6, v7, v8}, Ldl/t;->b(Ljava/lang/Object;IILwk/h;)Ldl/s;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final c(Ljava/lang/Class;)Lzk/x;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    iget-object v0, v1, Lzk/g;->c:Lcom/bumptech/glide/c;

    iget-object v0, v0, Lcom/bumptech/glide/c;->b:La3/l1;

    iget-object v9, v1, Lzk/g;->g:Ljava/lang/Class;

    iget-object v10, v1, Lzk/g;->k:Ljava/lang/Class;

    iget-object v2, v0, La3/l1;->j:Ljava/lang/Object;

    check-cast v2, Lol/c;

    iget-object v4, v2, Lol/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v11, 0x0

    invoke-virtual {v4, v11}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ltl/j;

    if-nez v4, :cond_0

    new-instance v4, Ltl/j;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    :cond_0
    invoke-virtual {v4, v3, v9, v10}, Ltl/j;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    iget-object v5, v2, Lol/c;->a:La0/g;

    monitor-enter v5

    :try_start_0
    iget-object v6, v2, Lol/c;->a:La0/g;

    invoke-virtual {v6, v4}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lzk/x;

    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    iget-object v2, v2, Lol/c;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v2, v0, La3/l1;->j:Ljava/lang/Object;

    check-cast v2, Lol/c;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lol/c;->c:Lzk/x;

    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v11

    :cond_1
    if-nez v6, :cond_f

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v2, Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v2, v3, v9}, Lcom/google/crypto/tink/internal/l0;->U(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/Class;

    iget-object v2, v0, La3/l1;->g:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/k0;

    invoke-virtual {v2, v4, v10}, Lkotlin/jvm/internal/k0;->i(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/Class;

    iget-object v2, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v2, Lcom/google/crypto/tink/internal/l0;

    monitor-enter v2

    :try_start_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iget-object v7, v2, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/16 v16, 0x1

    if-eqz v8, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    iget-object v11, v2, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v11, Ljava/util/HashMap;

    invoke-virtual {v11, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    if-nez v8, :cond_3

    :cond_2
    const/4 v11, 0x0

    goto :goto_2

    :cond_3
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_4
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lol/d;

    iget-object v15, v11, Lol/d;->a:Ljava/lang/Class;

    invoke-virtual {v15, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v15

    if-eqz v15, :cond_5

    iget-object v15, v11, Lol/d;->b:Ljava/lang/Class;

    invoke-virtual {v4, v15}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v15

    if-eqz v15, :cond_5

    move/from16 v15, v16

    goto :goto_4

    :cond_5
    const/4 v15, 0x0

    :goto_4
    if-eqz v15, :cond_4

    iget-object v11, v11, Lol/d;->c:Lwk/j;

    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_a

    :cond_6
    monitor-exit v2

    iget-object v2, v0, La3/l1;->g:Ljava/lang/Object;

    move-object v7, v2

    check-cast v7, Lkotlin/jvm/internal/k0;

    monitor-enter v7

    :try_start_2
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_7

    sget-object v2, Lll/c;->x:Lll/c;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v7

    :goto_5
    move-object v7, v2

    goto :goto_8

    :catchall_1
    move-exception v0

    goto :goto_9

    :cond_7
    :try_start_3
    iget-object v2, v7, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lll/b;

    iget-object v11, v8, Lll/b;->a:Ljava/lang/Class;

    invoke-virtual {v11, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_8

    iget-object v11, v8, Lll/b;->b:Ljava/lang/Class;

    invoke-virtual {v5, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_8

    move/from16 v11, v16

    goto :goto_7

    :cond_8
    const/4 v11, 0x0

    :goto_7
    if-eqz v11, :cond_9

    iget-object v2, v8, Lll/b;->c:Lll/a;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v7

    goto :goto_5

    :goto_8
    new-instance v2, Lzk/j;

    iget-object v8, v0, La3/l1;->k:Ljava/lang/Object;

    check-cast v8, Ls/m2;

    invoke-direct/range {v2 .. v8}, Lzk/j;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Lll/a;Ls/m2;)V

    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, p1

    const/4 v11, 0x0

    goto/16 :goto_1

    :cond_9
    move-object/from16 v3, p1

    goto :goto_6

    :cond_a
    :try_start_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No transcoder registered to transcode from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_9
    monitor-exit v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :goto_a
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0

    :cond_b
    move-object/from16 v3, p1

    goto/16 :goto_0

    :cond_c
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_d

    move-object/from16 v3, p1

    move-object v4, v9

    move-object v5, v10

    const/4 v11, 0x0

    goto :goto_b

    :cond_d
    new-instance v2, Lzk/x;

    iget-object v3, v0, La3/l1;->k:Ljava/lang/Object;

    move-object v7, v3

    check-cast v7, Ls/m2;

    move-object/from16 v3, p1

    move-object v4, v9

    move-object v5, v10

    move-object v6, v12

    invoke-direct/range {v2 .. v7}, Lzk/x;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Ls/m2;)V

    move-object v11, v2

    :goto_b
    iget-object v0, v0, La3/l1;->j:Ljava/lang/Object;

    check-cast v0, Lol/c;

    iget-object v2, v0, Lol/c;->a:La0/g;

    monitor-enter v2

    :try_start_6
    iget-object v0, v0, Lol/c;->a:La0/g;

    new-instance v6, Ltl/j;

    invoke-direct {v6, v3, v4, v5}, Ltl/j;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    if-eqz v11, :cond_e

    move-object v3, v11

    goto :goto_c

    :cond_e
    sget-object v3, Lol/c;->c:Lzk/x;

    :goto_c
    invoke-virtual {v0, v6, v3}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v2

    return-object v11

    :catchall_2
    move-exception v0

    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw v0

    :cond_f
    return-object v6

    :catchall_3
    move-exception v0

    :try_start_7
    monitor-exit v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v0
.end method

.method public final d(Ljava/lang/Object;)Lwk/c;
    .locals 5

    iget-object v0, p0, Lzk/g;->c:Lcom/bumptech/glide/c;

    iget-object v0, v0, Lcom/bumptech/glide/c;->b:La3/l1;

    iget-object v0, v0, La3/l1;->c:Ljava/lang/Object;

    check-cast v0, Lol/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lol/b;->w:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lol/a;

    iget-object v4, v3, Lol/a;->a:Ljava/lang/Class;

    invoke-virtual {v4, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v1, v3, Lol/a;->b:Lwk/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    monitor-exit v0

    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    new-instance v0, Lcom/bumptech/glide/Registry$NoSourceEncoderAvailableException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const-string v1, "Failed to find source encoder for data class: "

    invoke-static {p1, v1}, Ld;->m(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final e(Ljava/lang/Class;)Lwk/l;
    .locals 4

    iget-object v0, p0, Lzk/g;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwk/l;

    if-nez v0, :cond_1

    iget-object v1, p0, Lzk/g;->j:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwk/l;

    :cond_1
    if-nez v0, :cond_4

    iget-object v0, p0, Lzk/g;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lzk/g;->q:Z

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Missing transformation for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". If you wish to ignore unknown resource types, use the optional transformation methods."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    sget-object p1, Lfl/a;->b:Lfl/a;

    return-object p1

    :cond_4
    return-object v0
.end method
