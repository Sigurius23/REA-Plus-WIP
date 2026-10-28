.class public final Lzk/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzk/f;
.implements Lzk/e;


# instance fields
.field public E:Ljava/lang/Object;

.field public volatile F:Ldl/s;

.field public G:Lzk/d;

.field public final w:Lzk/g;

.field public final x:Lzk/i;

.field public y:I

.field public z:Lzk/c;


# direct methods
.method public constructor <init>(Lzk/g;Lzk/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzk/d0;->w:Lzk/g;

    iput-object p2, p0, Lzk/d0;->x:Lzk/i;

    return-void
.end method


# virtual methods
.method public final a(Lwk/e;Ljava/lang/Exception;Lxk/e;Lwk/a;)V
    .locals 1

    iget-object p4, p0, Lzk/d0;->x:Lzk/i;

    iget-object v0, p0, Lzk/d0;->F:Ldl/s;

    iget-object v0, v0, Ldl/s;->c:Lxk/e;

    invoke-interface {v0}, Lxk/e;->d()Lwk/a;

    move-result-object v0

    invoke-virtual {p4, p1, p2, p3, v0}, Lzk/i;->a(Lwk/e;Ljava/lang/Exception;Lxk/e;Lwk/a;)V

    return-void
.end method

.method public final b()Z
    .locals 12

    iget-object v0, p0, Lzk/d0;->E:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iput-object v1, p0, Lzk/d0;->E:Ljava/lang/Object;

    const-string v2, "SourceGenerator"

    const-string v3, "Finished encoding source to cache, key: "

    sget v4, Ltl/g;->b:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v4

    :try_start_0
    iget-object v6, p0, Lzk/d0;->w:Lzk/g;

    invoke-virtual {v6, v0}, Lzk/g;->d(Ljava/lang/Object;)Lwk/c;

    move-result-object v6

    new-instance v7, Lz63/d;

    iget-object v8, p0, Lzk/d0;->w:Lzk/g;

    iget-object v8, v8, Lzk/g;->i:Lwk/h;

    invoke-direct {v7, v6, v0, v8}, Lz63/d;-><init>(Lwk/c;Ljava/lang/Object;Lwk/h;)V

    new-instance v8, Lzk/d;

    iget-object v9, p0, Lzk/d0;->F:Ldl/s;

    iget-object v9, v9, Ldl/s;->a:Lwk/e;

    iget-object v10, p0, Lzk/d0;->w:Lzk/g;

    iget-object v11, v10, Lzk/g;->n:Lwk/e;

    invoke-direct {v8, v9, v11}, Lzk/d;-><init>(Lwk/e;Lwk/e;)V

    iput-object v8, p0, Lzk/d0;->G:Lzk/d;

    iget-object v8, v10, Lzk/g;->h:Lio/sentry/android/core/util/a;

    invoke-virtual {v8}, Lio/sentry/android/core/util/a;->a()Lbl/a;

    move-result-object v8

    iget-object v9, p0, Lzk/d0;->G:Lzk/d;

    invoke-interface {v8, v9, v7}, Lbl/a;->j(Lwk/e;Lz63/d;)V

    const/4 v7, 0x2

    invoke-static {v2, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lzk/d0;->G:Lzk/d;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", data: "

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", encoder: "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", duration: "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, Ltl/g;->a(J)D

    move-result-wide v3

    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lzk/d0;->F:Ldl/s;

    iget-object v0, v0, Ldl/s;->c:Lxk/e;

    invoke-interface {v0}, Lxk/e;->a()V

    new-instance v0, Lzk/c;

    iget-object v2, p0, Lzk/d0;->F:Ldl/s;

    iget-object v2, v2, Ldl/s;->a:Lwk/e;

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lzk/d0;->w:Lzk/g;

    invoke-direct {v0, v2, v3, p0}, Lzk/c;-><init>(Ljava/util/List;Lzk/g;Lzk/e;)V

    iput-object v0, p0, Lzk/d0;->z:Lzk/c;

    goto :goto_2

    :goto_1
    iget-object v1, p0, Lzk/d0;->F:Ldl/s;

    iget-object v1, v1, Ldl/s;->c:Lxk/e;

    invoke-interface {v1}, Lxk/e;->a()V

    throw v0

    :cond_1
    :goto_2
    iget-object v0, p0, Lzk/d0;->z:Lzk/c;

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lzk/c;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    return v2

    :cond_2
    iput-object v1, p0, Lzk/d0;->z:Lzk/c;

    iput-object v1, p0, Lzk/d0;->F:Ldl/s;

    const/4 v0, 0x0

    move v1, v0

    :cond_3
    :goto_3
    if-nez v1, :cond_5

    iget v3, p0, Lzk/d0;->y:I

    iget-object v4, p0, Lzk/d0;->w:Lzk/g;

    invoke-virtual {v4}, Lzk/g;->b()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_5

    iget-object v3, p0, Lzk/d0;->w:Lzk/g;

    invoke-virtual {v3}, Lzk/g;->b()Ljava/util/ArrayList;

    move-result-object v3

    iget v4, p0, Lzk/d0;->y:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lzk/d0;->y:I

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldl/s;

    iput-object v3, p0, Lzk/d0;->F:Ldl/s;

    iget-object v3, p0, Lzk/d0;->F:Ldl/s;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lzk/d0;->w:Lzk/g;

    iget-object v3, v3, Lzk/g;->p:Lzk/k;

    iget-object v4, p0, Lzk/d0;->F:Ldl/s;

    iget-object v4, v4, Ldl/s;->c:Lxk/e;

    invoke-interface {v4}, Lxk/e;->d()Lwk/a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lzk/k;->a(Lwk/a;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p0, Lzk/d0;->w:Lzk/g;

    iget-object v4, p0, Lzk/d0;->F:Ldl/s;

    iget-object v4, v4, Ldl/s;->c:Lxk/e;

    invoke-interface {v4}, Lxk/e;->b()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Lzk/g;->c(Ljava/lang/Class;)Lzk/x;

    move-result-object v3

    if-eqz v3, :cond_3

    :cond_4
    iget-object v1, p0, Lzk/d0;->F:Ldl/s;

    iget-object v3, p0, Lzk/d0;->F:Ldl/s;

    iget-object v3, v3, Ldl/s;->c:Lxk/e;

    iget-object v4, p0, Lzk/d0;->w:Lzk/g;

    iget-object v4, v4, Lzk/g;->o:Lcom/bumptech/glide/d;

    new-instance v5, Lq3/i;

    invoke-direct {v5, p0, v1, v0}, Lq3/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    invoke-interface {v3, v4, v5}, Lxk/e;->e(Lcom/bumptech/glide/d;Lxk/d;)V

    move v1, v2

    goto :goto_3

    :cond_5
    return v1
.end method

.method public final c(Lwk/e;Ljava/lang/Object;Lxk/e;Lwk/a;Lwk/e;)V
    .locals 6

    iget-object v0, p0, Lzk/d0;->x:Lzk/i;

    iget-object p4, p0, Lzk/d0;->F:Ldl/s;

    iget-object p4, p4, Ldl/s;->c:Lxk/e;

    invoke-interface {p4}, Lxk/e;->d()Lwk/a;

    move-result-object v4

    move-object v5, p1

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lzk/i;->c(Lwk/e;Ljava/lang/Object;Lxk/e;Lwk/a;Lwk/e;)V

    return-void
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lzk/d0;->F:Ldl/s;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ldl/s;->c:Lxk/e;

    invoke-interface {v0}, Lxk/e;->cancel()V

    :cond_0
    return-void
.end method
