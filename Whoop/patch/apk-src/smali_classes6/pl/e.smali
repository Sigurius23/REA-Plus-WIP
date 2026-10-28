.class public final Lpl/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpl/b;
.implements Lql/h;


# static fields
.field public static final A:Z


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lul/d;

.field public final c:Ljava/lang/Object;

.field public final d:Landroid/content/Context;

.field public final e:Lcom/bumptech/glide/c;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Class;

.field public final h:Lpl/a;

.field public final i:I

.field public final j:I

.field public final k:Lcom/bumptech/glide/d;

.field public final l:Lql/i;

.field public final m:Ljava/util/List;

.field public final n:Lrl/d;

.field public final o:Ljava/util/concurrent/Executor;

.field public p:Lzk/z;

.field public q:Lz63/d;

.field public r:J

.field public volatile s:Lzk/l;

.field public t:Landroid/graphics/drawable/Drawable;

.field public u:Landroid/graphics/drawable/Drawable;

.field public v:Landroid/graphics/drawable/Drawable;

.field public w:I

.field public x:I

.field public y:Z

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "Request"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Lpl/e;->A:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/c;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Lpl/a;IILcom/bumptech/glide/d;Lql/i;Ljava/util/ArrayList;Lzk/l;Lrl/d;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-boolean v0, Lpl/e;->A:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lpl/e;->a:Ljava/lang/String;

    new-instance v0, Lul/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lpl/e;->b:Lul/d;

    iput-object p3, p0, Lpl/e;->c:Ljava/lang/Object;

    iput-object p1, p0, Lpl/e;->d:Landroid/content/Context;

    iput-object p2, p0, Lpl/e;->e:Lcom/bumptech/glide/c;

    iput-object p4, p0, Lpl/e;->f:Ljava/lang/Object;

    iput-object p5, p0, Lpl/e;->g:Ljava/lang/Class;

    iput-object p6, p0, Lpl/e;->h:Lpl/a;

    iput p7, p0, Lpl/e;->i:I

    iput p8, p0, Lpl/e;->j:I

    iput-object p9, p0, Lpl/e;->k:Lcom/bumptech/glide/d;

    iput-object p10, p0, Lpl/e;->l:Lql/i;

    iput-object p11, p0, Lpl/e;->m:Ljava/util/List;

    iput-object p12, p0, Lpl/e;->s:Lzk/l;

    iput-object p13, p0, Lpl/e;->n:Lrl/d;

    iput-object p14, p0, Lpl/e;->o:Ljava/util/concurrent/Executor;

    const/4 p1, 0x1

    iput p1, p0, Lpl/e;->z:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    const-string v0, "finished run method in "

    iget-object v1, p0, Lpl/e;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v2, p0, Lpl/e;->y:Z

    if-nez v2, :cond_a

    iget-object v2, p0, Lpl/e;->b:Lul/d;

    invoke-virtual {v2}, Lul/d;->b()V

    sget v2, Ltl/g;->b:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v2

    iput-wide v2, p0, Lpl/e;->r:J

    iget-object v2, p0, Lpl/e;->f:Ljava/lang/Object;

    const/4 v3, 0x3

    if-nez v2, :cond_3

    iget v0, p0, Lpl/e;->i:I

    iget v2, p0, Lpl/e;->j:I

    invoke-static {v0, v2}, Ltl/l;->h(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lpl/e;->i:I

    iput v0, p0, Lpl/e;->w:I

    iget v0, p0, Lpl/e;->j:I

    iput v0, p0, Lpl/e;->x:I

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    :goto_0
    iget-object v0, p0, Lpl/e;->v:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    iget-object v0, p0, Lpl/e;->h:Lpl/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    iput-object v0, p0, Lpl/e;->v:Landroid/graphics/drawable/Drawable;

    :cond_1
    iget-object v0, p0, Lpl/e;->v:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_2

    const/4 v3, 0x5

    :cond_2
    new-instance v0, Lcom/bumptech/glide/load/engine/GlideException;

    const-string v2, "Received null model"

    invoke-direct {v0, v2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v3}, Lpl/e;->i(Lcom/bumptech/glide/load/engine/GlideException;I)V

    monitor-exit v1

    return-void

    :cond_3
    iget v2, p0, Lpl/e;->z:I

    const/4 v4, 0x2

    if-eq v2, v4, :cond_9

    const/4 v5, 0x4

    if-ne v2, v5, :cond_4

    iget-object v0, p0, Lpl/e;->p:Lzk/z;

    sget-object v2, Lwk/a;->E:Lwk/a;

    invoke-virtual {p0, v0, v2}, Lpl/e;->k(Lzk/z;Lwk/a;)V

    monitor-exit v1

    return-void

    :cond_4
    iput v3, p0, Lpl/e;->z:I

    iget v2, p0, Lpl/e;->i:I

    iget v5, p0, Lpl/e;->j:I

    invoke-static {v2, v5}, Ltl/l;->h(II)Z

    move-result v2

    if-eqz v2, :cond_5

    iget v2, p0, Lpl/e;->i:I

    iget v5, p0, Lpl/e;->j:I

    invoke-virtual {p0, v2, v5}, Lpl/e;->l(II)V

    goto :goto_1

    :cond_5
    iget-object v2, p0, Lpl/e;->l:Lql/i;

    invoke-interface {v2, p0}, Lql/i;->h(Lql/h;)V

    :goto_1
    iget v2, p0, Lpl/e;->z:I

    if-eq v2, v4, :cond_6

    if-ne v2, v3, :cond_7

    :cond_6
    iget-object v2, p0, Lpl/e;->l:Lql/i;

    invoke-virtual {p0}, Lpl/e;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-interface {v2, v3}, Lql/i;->c(Landroid/graphics/drawable/Drawable;)V

    :cond_7
    sget-boolean v2, Lpl/e;->A:Z

    if-eqz v2, :cond_8

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, p0, Lpl/e;->r:J

    invoke-static {v3, v4}, Ltl/g;->a(J)D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lpl/e;->h(Ljava/lang/String;)V

    :cond_8
    monitor-exit v1

    return-void

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot restart a running request"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b()V
    .locals 3

    iget-boolean v0, p0, Lpl/e;->y:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lpl/e;->b:Lul/d;

    invoke-virtual {v0}, Lul/d;->b()V

    iget-object v0, p0, Lpl/e;->l:Lql/i;

    invoke-interface {v0, p0}, Lql/i;->a(Lql/h;)V

    iget-object v0, p0, Lpl/e;->q:Lz63/d;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lz63/d;->y:Ljava/lang/Object;

    check-cast v1, Lzk/l;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, Lz63/d;->w:Ljava/lang/Object;

    check-cast v2, Lzk/p;

    iget-object v0, v0, Lz63/d;->x:Ljava/lang/Object;

    check-cast v0, Lpl/e;

    invoke-virtual {v2, v0}, Lzk/p;->i(Lpl/e;)V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-object v0, p0, Lpl/e;->q:Lz63/d;

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()V
    .locals 5

    iget-object v0, p0, Lpl/e;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lpl/e;->y:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Lpl/e;->b:Lul/d;

    invoke-virtual {v1}, Lul/d;->b()V

    iget v1, p0, Lpl/e;->z:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lpl/e;->b()V

    iget-object v1, p0, Lpl/e;->p:Lzk/z;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iput-object v3, p0, Lpl/e;->p:Lzk/z;

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    iget-object v3, p0, Lpl/e;->l:Lql/i;

    invoke-virtual {p0}, Lpl/e;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-interface {v3, v4}, Lql/i;->e(Landroid/graphics/drawable/Drawable;)V

    iput v2, p0, Lpl/e;->z:I

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    iget-object v0, p0, Lpl/e;->s:Lzk/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lzk/l;->f(Lzk/z;)V

    :cond_2
    return-void

    :cond_3
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final d()Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Lpl/e;->u:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    iget-object v0, p0, Lpl/e;->h:Lpl/a;

    iget-object v1, v0, Lpl/a;->E:Landroid/graphics/drawable/Drawable;

    iput-object v1, p0, Lpl/e;->u:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_0

    iget v0, v0, Lpl/a;->F:I

    if-lez v0, :cond_0

    invoke-virtual {p0, v0}, Lpl/e;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lpl/e;->u:Landroid/graphics/drawable/Drawable;

    :cond_0
    iget-object v0, p0, Lpl/e;->u:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final e()Z
    .locals 3

    iget-object v0, p0, Lpl/e;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lpl/e;->z:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final f()Z
    .locals 3

    iget-object v0, p0, Lpl/e;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lpl/e;->z:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final g(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Lpl/e;->h:Lpl/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lpl/e;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    iget-object v1, p0, Lpl/e;->e:Lcom/bumptech/glide/c;

    invoke-static {v1, v1, p1, v0}, Le4/a;->z(Landroid/content/Context;Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/String;)V
    .locals 1

    const-string v0, " this: "

    invoke-static {p1, v0}, Le4/p;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, p0, Lpl/e;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Request"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final i(Lcom/bumptech/glide/load/engine/GlideException;I)V
    .locals 8

    const-string v0, "Load failed for "

    iget-object v1, p0, Lpl/e;->b:Lul/d;

    invoke-virtual {v1}, Lul/d;->b()V

    iget-object v1, p0, Lpl/e;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lpl/e;->e:Lcom/bumptech/glide/c;

    iget v2, v2, Lcom/bumptech/glide/c;->h:I

    if-gt v2, p2, :cond_0

    const-string p2, "Glide"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lpl/e;->f:Ljava/lang/Object;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " with size ["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lpl/e;->w:I

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "x"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lpl/e;->x:I

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p2, 0x4

    if-gt v2, p2, :cond_0

    invoke-virtual {p1}, Lcom/bumptech/glide/load/engine/GlideException;->d()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    :goto_0
    const/4 p2, 0x0

    iput-object p2, p0, Lpl/e;->q:Lz63/d;

    const/4 v0, 0x5

    iput v0, p0, Lpl/e;->z:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpl/e;->y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    :try_start_1
    iget-object v3, p0, Lpl/e;->m:Ljava/util/List;

    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v2

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpl/c;

    iget-object v6, p0, Lpl/e;->f:Ljava/lang/Object;

    iget-object v7, p0, Lpl/e;->l:Lql/i;

    invoke-interface {v5, p1, v6, v7, v0}, Lpl/c;->a(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;Lql/i;Z)Z

    move-result v5

    or-int/2addr v4, v5

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_1
    move v4, v2

    :cond_2
    if-nez v4, :cond_8

    iget-object p1, p0, Lpl/e;->f:Ljava/lang/Object;

    if-nez p1, :cond_4

    iget-object p1, p0, Lpl/e;->v:Landroid/graphics/drawable/Drawable;

    if-nez p1, :cond_3

    iget-object p1, p0, Lpl/e;->h:Lpl/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, Lpl/e;->v:Landroid/graphics/drawable/Drawable;

    :cond_3
    iget-object p1, p0, Lpl/e;->v:Landroid/graphics/drawable/Drawable;

    goto :goto_2

    :cond_4
    move-object p1, p2

    :goto_2
    if-nez p1, :cond_6

    iget-object p1, p0, Lpl/e;->t:Landroid/graphics/drawable/Drawable;

    if-nez p1, :cond_5

    iget-object p1, p0, Lpl/e;->h:Lpl/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, Lpl/e;->t:Landroid/graphics/drawable/Drawable;

    iget p1, p1, Lpl/a;->z:I

    if-lez p1, :cond_5

    invoke-virtual {p0, p1}, Lpl/e;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lpl/e;->t:Landroid/graphics/drawable/Drawable;

    :cond_5
    iget-object p1, p0, Lpl/e;->t:Landroid/graphics/drawable/Drawable;

    :cond_6
    if-nez p1, :cond_7

    invoke-virtual {p0}, Lpl/e;->d()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    :cond_7
    iget-object p2, p0, Lpl/e;->l:Lql/i;

    invoke-interface {p2, p1}, Lql/i;->g(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_8
    :try_start_2
    iput-boolean v2, p0, Lpl/e;->y:Z

    monitor-exit v1

    return-void

    :goto_3
    iput-boolean v2, p0, Lpl/e;->y:Z

    throw p1

    :goto_4
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final j(Lzk/z;Ljava/lang/Object;Lwk/a;)V
    .locals 9

    const/4 v0, 0x4

    iput v0, p0, Lpl/e;->z:I

    iput-object p1, p0, Lpl/e;->p:Lzk/z;

    iget-object p1, p0, Lpl/e;->e:Lcom/bumptech/glide/c;

    iget p1, p1, Lcom/bumptech/glide/c;->h:I

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Finished loading "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " from "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lpl/e;->f:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " with size ["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lpl/e;->w:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "x"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lpl/e;->x:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "] in "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lpl/e;->r:J

    invoke-static {v0, v1}, Ltl/g;->a(J)D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, " ms"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Glide"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lpl/e;->y:Z

    const/4 p1, 0x0

    :try_start_0
    iget-object v0, p0, Lpl/e;->m:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v1, p1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lpl/c;

    iget-object v5, p0, Lpl/e;->f:Ljava/lang/Object;

    iget-object v6, p0, Lpl/e;->l:Lql/i;

    const/4 v8, 0x1

    move-object v4, p2

    move-object v7, p3

    invoke-interface/range {v3 .. v8}, Lpl/c;->b(Ljava/lang/Object;Ljava/lang/Object;Lql/i;Lwk/a;Z)Z

    move-result p2

    or-int/2addr v1, p2

    move-object p2, v4

    move-object p3, v7

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto :goto_3

    :cond_1
    :goto_1
    move-object v4, p2

    move-object v7, p3

    goto :goto_2

    :cond_2
    move v1, p1

    goto :goto_1

    :goto_2
    if-nez v1, :cond_3

    iget-object p2, p0, Lpl/e;->n:Lrl/d;

    invoke-interface {p2, v7}, Lrl/d;->e(Lwk/a;)Lrl/c;

    move-result-object p2

    iget-object p3, p0, Lpl/e;->l:Lql/i;

    invoke-interface {p3, v4, p2}, Lql/i;->b(Ljava/lang/Object;Lrl/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    iput-boolean p1, p0, Lpl/e;->y:Z

    return-void

    :goto_3
    iput-boolean p1, p0, Lpl/e;->y:Z

    throw p2
.end method

.method public final k(Lzk/z;Lwk/a;)V
    .locals 7

    const-string v0, "Expected to receive an object of "

    const-string v1, "Expected to receive a Resource<R> with an object of "

    iget-object v2, p0, Lpl/e;->b:Lul/d;

    invoke-virtual {v2}, Lul/d;->b()V

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lpl/e;->c:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iput-object v2, p0, Lpl/e;->q:Lz63/d;

    const/4 v4, 0x5

    if-nez p1, :cond_0

    new-instance p1, Lcom/bumptech/glide/load/engine/GlideException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lpl/e;->g:Ljava/lang/Class;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " inside, but instead got null."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v4}, Lpl/e;->i(Lcom/bumptech/glide/load/engine/GlideException;I)V

    monitor-exit v3

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    invoke-interface {p1}, Lzk/z;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v5, p0, Lpl/e;->g:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, v1, p2}, Lpl/e;->j(Lzk/z;Ljava/lang/Object;Lwk/a;)V

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :cond_2
    :goto_0
    :try_start_2
    iput-object v2, p0, Lpl/e;->p:Lzk/z;

    new-instance p2, Lcom/bumptech/glide/load/engine/GlideException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lpl/e;->g:Ljava/lang/Class;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " but instead got "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_1

    :catchall_1
    move-exception p2

    move-object v2, p1

    move-object p1, p2

    goto :goto_3

    :cond_3
    const-string v0, ""

    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "{"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "} inside Resource{"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "}."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_4

    const-string v0, ""

    goto :goto_2

    :cond_4
    const-string v0, " To indicate failure return a null Resource object, rather than a Resource object containing null data."

    :goto_2
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2, v4}, Lpl/e;->i(Lcom/bumptech/glide/load/engine/GlideException;I)V

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object p2, p0, Lpl/e;->s:Lzk/l;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lzk/l;->f(Lzk/z;)V

    return-void

    :goto_3
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    if-eqz v2, :cond_5

    iget-object p2, p0, Lpl/e;->s:Lzk/l;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lzk/l;->f(Lzk/z;)V

    :cond_5
    throw p1
.end method

.method public final l(II)V
    .locals 22

    move-object/from16 v1, p0

    move/from16 v0, p1

    move/from16 v2, p2

    const-string v3, "finished onSizeReady in "

    const-string v4, "finished setup for calling load in "

    const-string v5, "Got onSizeReady in "

    iget-object v6, v1, Lpl/e;->b:Lul/d;

    invoke-virtual {v6}, Lul/d;->b()V

    iget-object v6, v1, Lpl/e;->c:Ljava/lang/Object;

    monitor-enter v6

    :try_start_0
    sget-boolean v20, Lpl/e;->A:Z

    if-eqz v20, :cond_0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v8, v1, Lpl/e;->r:J

    invoke-static {v8, v9}, Ltl/g;->a(J)D

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lpl/e;->h(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v3, v1

    move-object v1, v6

    goto/16 :goto_4

    :cond_0
    :goto_0
    iget v5, v1, Lpl/e;->z:I

    const/4 v7, 0x3

    if-eq v5, v7, :cond_1

    monitor-exit v6

    return-void

    :cond_1
    const/4 v5, 0x2

    iput v5, v1, Lpl/e;->z:I

    iget-object v7, v1, Lpl/e;->h:Lpl/a;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v7, -0x80000000

    const/high16 v8, 0x3f800000    # 1.0f

    if-ne v0, v7, :cond_2

    goto :goto_1

    :cond_2
    int-to-float v0, v0

    mul-float/2addr v0, v8

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    :goto_1
    iput v0, v1, Lpl/e;->w:I

    if-ne v2, v7, :cond_3

    move v0, v2

    goto :goto_2

    :cond_3
    int-to-float v0, v2

    mul-float/2addr v8, v0

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v0

    :goto_2
    iput v0, v1, Lpl/e;->x:I

    if-eqz v20, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v7, v1, Lpl/e;->r:J

    invoke-static {v7, v8}, Ltl/g;->a(J)D

    move-result-wide v7

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lpl/e;->h(Ljava/lang/String;)V

    :cond_4
    iget-object v2, v1, Lpl/e;->s:Lzk/l;

    move-object v0, v3

    iget-object v3, v1, Lpl/e;->e:Lcom/bumptech/glide/c;

    iget-object v4, v1, Lpl/e;->f:Ljava/lang/Object;

    iget-object v7, v1, Lpl/e;->h:Lpl/a;

    move v8, v5

    iget-object v5, v7, Lpl/a;->J:Lwk/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v9, v6

    :try_start_1
    iget v6, v1, Lpl/e;->w:I

    iget v10, v1, Lpl/e;->x:I

    move v11, v8

    iget-object v8, v7, Lpl/a;->O:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    move-object v12, v9

    :try_start_2
    iget-object v9, v1, Lpl/e;->g:Ljava/lang/Class;

    move v13, v10

    iget-object v10, v1, Lpl/e;->k:Lcom/bumptech/glide/d;

    move v14, v11

    iget-object v11, v7, Lpl/a;->x:Lzk/k;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    move-object v15, v12

    :try_start_3
    iget-object v12, v7, Lpl/a;->N:Ltl/b;

    move/from16 v16, v13

    iget-boolean v13, v7, Lpl/a;->K:Z

    move/from16 v17, v14

    iget-boolean v14, v7, Lpl/a;->R:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    move-object/from16 v18, v15

    :try_start_4
    iget-object v15, v7, Lpl/a;->M:Lwk/h;

    move-object/from16 p1, v0

    iget-boolean v0, v7, Lpl/a;->G:Z

    iget-boolean v7, v7, Lpl/a;->S:Z

    move/from16 v19, v0

    iget-object v0, v1, Lpl/e;->o:Ljava/util/concurrent/Executor;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    move/from16 v21, v19

    move-object/from16 v19, v0

    move/from16 v0, v17

    move/from16 v17, v7

    move/from16 v7, v16

    move/from16 v16, v21

    move-object/from16 v21, v18

    move-object/from16 v18, v1

    move-object/from16 v1, v21

    :try_start_5
    invoke-virtual/range {v2 .. v19}, Lzk/l;->a(Lcom/bumptech/glide/c;Ljava/lang/Object;Lwk/e;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/d;Lzk/k;Ltl/b;ZZLwk/h;ZZLpl/e;Ljava/util/concurrent/Executor;)Lz63/d;

    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move-object/from16 v3, v18

    :try_start_6
    iput-object v2, v3, Lpl/e;->q:Lz63/d;

    iget v2, v3, Lpl/e;->z:I

    if-eq v2, v0, :cond_5

    const/4 v0, 0x0

    iput-object v0, v3, Lpl/e;->q:Lz63/d;

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_5
    :goto_3
    if-eqz v20, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v2, p1

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, v3, Lpl/e;->r:J

    invoke-static {v4, v5}, Ltl/g;->a(J)D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lpl/e;->h(Ljava/lang/String;)V

    :cond_6
    monitor-exit v1

    return-void

    :catchall_2
    move-exception v0

    move-object/from16 v3, v18

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object v3, v1

    move-object/from16 v1, v18

    goto :goto_4

    :catchall_4
    move-exception v0

    move-object v3, v1

    move-object v1, v15

    goto :goto_4

    :catchall_5
    move-exception v0

    move-object v3, v1

    move-object v1, v12

    goto :goto_4

    :catchall_6
    move-exception v0

    move-object v3, v1

    move-object v1, v9

    :goto_4
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw v0
.end method
