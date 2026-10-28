.class public final Lzk/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzk/f;
.implements Lxk/d;


# instance fields
.field public E:Lwk/e;

.field public F:Ljava/util/List;

.field public G:I

.field public volatile H:Ldl/s;

.field public I:Ljava/io/File;

.field public J:Lzk/b0;

.field public final w:Lzk/i;

.field public final x:Lzk/g;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lzk/g;Lzk/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lzk/a0;->z:I

    iput-object p1, p0, Lzk/a0;->x:Lzk/g;

    iput-object p2, p0, Lzk/a0;->w:Lzk/i;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 21

    move-object/from16 v1, p0

    iget-object v0, v1, Lzk/a0;->x:Lzk/g;

    invoke-virtual {v0}, Lzk/g;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v2, v1, Lzk/a0;->x:Lzk/g;

    iget-object v4, v2, Lzk/g;->c:Lcom/bumptech/glide/c;

    iget-object v4, v4, Lcom/bumptech/glide/c;->b:La3/l1;

    iget-object v5, v2, Lzk/g;->d:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    iget-object v6, v2, Lzk/g;->g:Ljava/lang/Class;

    iget-object v2, v2, Lzk/g;->k:Ljava/lang/Class;

    iget-object v7, v4, La3/l1;->i:Ljava/lang/Object;

    check-cast v7, Lwe/o;

    iget-object v8, v7, Lwe/o;->w:Ljava/lang/Object;

    check-cast v8, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ltl/j;

    if-nez v8, :cond_1

    new-instance v8, Ltl/j;

    invoke-direct {v8, v5, v6, v2}, Ltl/j;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v8, v5, v6, v2}, Ltl/j;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    :goto_0
    iget-object v10, v7, Lwe/o;->x:Ljava/lang/Object;

    check-cast v10, La0/g;

    monitor-enter v10

    :try_start_0
    iget-object v11, v7, Lwe/o;->x:Ljava/lang/Object;

    check-cast v11, La0/g;

    invoke-virtual {v11, v8}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    iget-object v7, v7, Lwe/o;->w:Ljava/lang/Object;

    check-cast v7, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v7, v8}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    if-nez v11, :cond_5

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iget-object v7, v4, La3/l1;->b:Ljava/lang/Object;

    check-cast v7, Lwe/o;

    monitor-enter v7

    :try_start_1
    iget-object v8, v7, Lwe/o;->w:Ljava/lang/Object;

    check-cast v8, Ldl/z;

    invoke-virtual {v8, v5}, Ldl/z;->d(Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v7

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Class;

    iget-object v10, v4, La3/l1;->d:Ljava/lang/Object;

    check-cast v10, Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v10, v8, v6}, Lcom/google/crypto/tink/internal/l0;->U(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_3
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Class;

    iget-object v12, v4, La3/l1;->g:Ljava/lang/Object;

    check-cast v12, Lkotlin/jvm/internal/k0;

    invoke-virtual {v12, v10, v2}, Lkotlin/jvm/internal/k0;->i(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v12

    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_3

    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    iget-object v4, v4, La3/l1;->i:Ljava/lang/Object;

    check-cast v4, Lwe/o;

    invoke-static {v11}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    iget-object v8, v4, Lwe/o;->x:Ljava/lang/Object;

    check-cast v8, La0/g;

    monitor-enter v8

    :try_start_2
    iget-object v4, v4, Lwe/o;->x:Ljava/lang/Object;

    check-cast v4, La0/g;

    new-instance v10, Ltl/j;

    invoke-direct {v10, v5, v6, v2}, Ltl/j;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-virtual {v4, v10, v7}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v8

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    :cond_5
    :goto_2
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    const-class v0, Ljava/io/File;

    iget-object v2, v1, Lzk/a0;->x:Lzk/g;

    iget-object v2, v2, Lzk/g;->k:Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto/16 :goto_5

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to find any load path from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v1, Lzk/a0;->x:Lzk/g;

    iget-object v3, v3, Lzk/g;->d:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lzk/a0;->x:Lzk/g;

    iget-object v3, v3, Lzk/g;->k:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_3
    iget-object v2, v1, Lzk/a0;->F:Ljava/util/List;

    const/4 v4, 0x1

    if-eqz v2, :cond_a

    iget v5, v1, Lzk/a0;->G:I

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v5, v2, :cond_a

    iput-object v9, v1, Lzk/a0;->H:Ldl/s;

    :cond_8
    :goto_4
    if-nez v3, :cond_9

    iget v0, v1, Lzk/a0;->G:I

    iget-object v2, v1, Lzk/a0;->F:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_9

    iget-object v0, v1, Lzk/a0;->F:Ljava/util/List;

    iget v2, v1, Lzk/a0;->G:I

    add-int/lit8 v5, v2, 0x1

    iput v5, v1, Lzk/a0;->G:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldl/t;

    iget-object v2, v1, Lzk/a0;->I:Ljava/io/File;

    iget-object v5, v1, Lzk/a0;->x:Lzk/g;

    iget v6, v5, Lzk/g;->e:I

    iget v7, v5, Lzk/g;->f:I

    iget-object v5, v5, Lzk/g;->i:Lwk/h;

    invoke-interface {v0, v2, v6, v7, v5}, Ldl/t;->b(Ljava/lang/Object;IILwk/h;)Ldl/s;

    move-result-object v0

    iput-object v0, v1, Lzk/a0;->H:Ldl/s;

    iget-object v0, v1, Lzk/a0;->H:Ldl/s;

    if-eqz v0, :cond_8

    iget-object v0, v1, Lzk/a0;->x:Lzk/g;

    iget-object v2, v1, Lzk/a0;->H:Ldl/s;

    iget-object v2, v2, Ldl/s;->c:Lxk/e;

    invoke-interface {v2}, Lxk/e;->b()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Lzk/g;->c(Ljava/lang/Class;)Lzk/x;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object v0, v1, Lzk/a0;->H:Ldl/s;

    iget-object v0, v0, Ldl/s;->c:Lxk/e;

    iget-object v2, v1, Lzk/a0;->x:Lzk/g;

    iget-object v2, v2, Lzk/g;->o:Lcom/bumptech/glide/d;

    invoke-interface {v0, v2, v1}, Lxk/e;->e(Lcom/bumptech/glide/d;Lxk/d;)V

    move v3, v4

    goto :goto_4

    :cond_9
    return v3

    :cond_a
    iget v2, v1, Lzk/a0;->z:I

    add-int/2addr v2, v4

    iput v2, v1, Lzk/a0;->z:I

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v5

    if-lt v2, v5, :cond_c

    iget v2, v1, Lzk/a0;->y:I

    add-int/2addr v2, v4

    iput v2, v1, Lzk/a0;->y:I

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lt v2, v4, :cond_b

    :goto_5
    return v3

    :cond_b
    iput v3, v1, Lzk/a0;->z:I

    :cond_c
    iget v2, v1, Lzk/a0;->y:I

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lwk/e;

    iget v2, v1, Lzk/a0;->z:I

    invoke-interface {v11, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    iget-object v4, v1, Lzk/a0;->x:Lzk/g;

    invoke-virtual {v4, v2}, Lzk/g;->e(Ljava/lang/Class;)Lwk/l;

    move-result-object v18

    new-instance v12, Lzk/b0;

    iget-object v4, v1, Lzk/a0;->x:Lzk/g;

    iget-object v5, v4, Lzk/g;->c:Lcom/bumptech/glide/c;

    iget-object v13, v5, Lcom/bumptech/glide/c;->a:Lal/g;

    iget-object v15, v4, Lzk/g;->n:Lwk/e;

    iget v5, v4, Lzk/g;->e:I

    iget v6, v4, Lzk/g;->f:I

    iget-object v7, v4, Lzk/g;->i:Lwk/h;

    move-object/from16 v19, v2

    move/from16 v16, v5

    move/from16 v17, v6

    move-object/from16 v20, v7

    invoke-direct/range {v12 .. v20}, Lzk/b0;-><init>(Lal/g;Lwk/e;Lwk/e;IILwk/l;Ljava/lang/Class;Lwk/h;)V

    iput-object v12, v1, Lzk/a0;->J:Lzk/b0;

    iget-object v2, v4, Lzk/g;->h:Lio/sentry/android/core/util/a;

    invoke-virtual {v2}, Lio/sentry/android/core/util/a;->a()Lbl/a;

    move-result-object v2

    iget-object v4, v1, Lzk/a0;->J:Lzk/b0;

    invoke-interface {v2, v4}, Lbl/a;->n(Lwk/e;)Ljava/io/File;

    move-result-object v2

    iput-object v2, v1, Lzk/a0;->I:Ljava/io/File;

    if-eqz v2, :cond_7

    iput-object v14, v1, Lzk/a0;->E:Lwk/e;

    iget-object v4, v1, Lzk/a0;->x:Lzk/g;

    iget-object v4, v4, Lzk/g;->c:Lcom/bumptech/glide/c;

    iget-object v4, v4, Lcom/bumptech/glide/c;->b:La3/l1;

    invoke-virtual {v4, v2}, La3/l1;->i(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lzk/a0;->F:Ljava/util/List;

    iput v3, v1, Lzk/a0;->G:I

    goto/16 :goto_3

    :catchall_2
    move-exception v0

    :try_start_4
    monitor-exit v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0
.end method

.method public final c(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, Lzk/a0;->w:Lzk/i;

    iget-object v1, p0, Lzk/a0;->J:Lzk/b0;

    iget-object v2, p0, Lzk/a0;->H:Ldl/s;

    iget-object v2, v2, Ldl/s;->c:Lxk/e;

    sget-object v3, Lwk/a;->z:Lwk/a;

    invoke-virtual {v0, v1, p1, v2, v3}, Lzk/i;->a(Lwk/e;Ljava/lang/Exception;Lxk/e;Lwk/a;)V

    return-void
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lzk/a0;->H:Ldl/s;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ldl/s;->c:Lxk/e;

    invoke-interface {v0}, Lxk/e;->cancel()V

    :cond_0
    return-void
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lzk/a0;->w:Lzk/i;

    iget-object v1, p0, Lzk/a0;->E:Lwk/e;

    iget-object v2, p0, Lzk/a0;->H:Ldl/s;

    iget-object v3, v2, Ldl/s;->c:Lxk/e;

    sget-object v4, Lwk/a;->z:Lwk/a;

    iget-object v5, p0, Lzk/a0;->J:Lzk/b0;

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Lzk/i;->c(Lwk/e;Ljava/lang/Object;Lxk/e;Lwk/a;Lwk/e;)V

    return-void
.end method
