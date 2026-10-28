.class public final Lkl/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Luk/e;

.field public final b:Landroid/os/Handler;

.field public final c:Ljava/util/ArrayList;

.field public final d:Lcom/bumptech/glide/h;

.field public final e:Lal/b;

.field public f:Z

.field public g:Z

.field public h:Lcom/bumptech/glide/f;

.field public i:Lkl/d;

.field public j:Z

.field public k:Lkl/d;

.field public l:Landroid/graphics/Bitmap;

.field public m:Lkl/d;

.field public n:I

.field public o:I

.field public p:I


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/b;Luk/e;IILfl/a;Landroid/graphics/Bitmap;)V
    .locals 4

    iget-object v0, p1, Lcom/bumptech/glide/b;->x:Lal/b;

    iget-object p1, p1, Lcom/bumptech/glide/b;->z:Lcom/bumptech/glide/c;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/h;->j()Lcom/bumptech/glide/f;

    move-result-object p1

    new-instance v2, Lpl/d;

    invoke-direct {v2}, Lpl/a;-><init>()V

    sget-object v3, Lzk/k;->c:Lzk/k;

    invoke-virtual {v2, v3}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object v2

    check-cast v2, Lpl/d;

    invoke-virtual {v2}, Lpl/a;->v()Lpl/a;

    move-result-object v2

    check-cast v2, Lpl/d;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lpl/a;->r(Z)Lpl/a;

    move-result-object v2

    check-cast v2, Lpl/d;

    invoke-virtual {v2, p3, p4}, Lpl/a;->i(II)Lpl/a;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/bumptech/glide/f;->w(Lpl/a;)Lcom/bumptech/glide/f;

    move-result-object p1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lkl/g;->c:Ljava/util/ArrayList;

    iput-object v1, p0, Lkl/g;->d:Lcom/bumptech/glide/h;

    new-instance p3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p4

    new-instance v1, Lkl/f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lkl/f;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p3, p4, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lkl/g;->e:Lal/b;

    iput-object p3, p0, Lkl/g;->b:Landroid/os/Handler;

    iput-object p1, p0, Lkl/g;->h:Lcom/bumptech/glide/f;

    iput-object p2, p0, Lkl/g;->a:Luk/e;

    invoke-virtual {p0, p5, p6}, Lkl/g;->i(Lwk/l;Landroid/graphics/Bitmap;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lkl/g;->a:Luk/e;

    iget-object v0, v0, Luk/e;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public final b()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lkl/g;->i:Lkl/d;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lkl/d;->G:Landroid/graphics/Bitmap;

    return-object v0

    :cond_0
    iget-object v0, p0, Lkl/g;->l:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final c()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lkl/g;->l:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, Lkl/g;->a:Luk/e;

    iget-object v0, v0, Luk/e;->l:Luk/c;

    iget v0, v0, Luk/c;->c:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lkl/g;->p:I

    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lkl/g;->o:I

    return v0
.end method

.method public final g()V
    .locals 7

    iget-boolean v0, p0, Lkl/g;->f:Z

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lkl/g;->g:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lkl/g;->m:Lkl/d;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    iput-object v1, p0, Lkl/g;->m:Lkl/d;

    invoke-virtual {p0, v0}, Lkl/g;->h(Lkl/d;)V

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkl/g;->g:Z

    iget-object v1, p0, Lkl/g;->a:Luk/e;

    iget-object v2, v1, Luk/e;->l:Luk/c;

    iget v3, v2, Luk/c;->c:I

    if-lez v3, :cond_4

    iget v4, v1, Luk/e;->k:I

    if-gez v4, :cond_2

    goto :goto_0

    :cond_2
    if-ltz v4, :cond_3

    if-ge v4, v3, :cond_3

    iget-object v2, v2, Luk/c;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Luk/b;

    iget v2, v2, Luk/b;->i:I

    goto :goto_1

    :cond_3
    const/4 v2, -0x1

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v2, 0x0

    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    int-to-long v5, v2

    add-long/2addr v3, v5

    invoke-virtual {v1}, Luk/e;->a()V

    new-instance v2, Lkl/d;

    iget-object v5, p0, Lkl/g;->b:Landroid/os/Handler;

    iget v6, v1, Luk/e;->k:I

    invoke-direct {v2, v5, v6, v3, v4}, Lkl/d;-><init>(Landroid/os/Handler;IJ)V

    iput-object v2, p0, Lkl/g;->k:Lkl/d;

    iget-object v2, p0, Lkl/g;->h:Lcom/bumptech/glide/f;

    new-instance v3, Lsl/d;

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-direct {v3, v4}, Lsl/d;-><init>(Ljava/lang/Object;)V

    new-instance v4, Lpl/d;

    invoke-direct {v4}, Lpl/a;-><init>()V

    invoke-virtual {v4, v3}, Lpl/a;->q(Lwk/e;)Lpl/a;

    move-result-object v3

    check-cast v3, Lpl/d;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/f;->w(Lpl/a;)Lcom/bumptech/glide/f;

    move-result-object v2

    iput-object v1, v2, Lcom/bumptech/glide/f;->Y:Ljava/lang/Object;

    iput-boolean v0, v2, Lcom/bumptech/glide/f;->a0:Z

    iget-object v0, p0, Lkl/g;->k:Lkl/d;

    invoke-virtual {v2, v0}, Lcom/bumptech/glide/f;->z(Lql/i;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public final h(Lkl/d;)V
    .locals 8

    const/4 v0, 0x0

    iput-boolean v0, p0, Lkl/g;->g:Z

    iget-boolean v0, p0, Lkl/g;->j:Z

    const/4 v1, 0x2

    iget-object v2, p0, Lkl/g;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    invoke-virtual {v2, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void

    :cond_0
    iget-boolean v0, p0, Lkl/g;->f:Z

    if-nez v0, :cond_1

    iput-object p1, p0, Lkl/g;->m:Lkl/d;

    return-void

    :cond_1
    iget-object v0, p1, Lkl/d;->G:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lkl/g;->l:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    iget-object v3, p0, Lkl/g;->e:Lal/b;

    invoke-interface {v3, v0}, Lal/b;->h(Landroid/graphics/Bitmap;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lkl/g;->l:Landroid/graphics/Bitmap;

    :cond_2
    iget-object v0, p0, Lkl/g;->i:Lkl/d;

    iput-object p1, p0, Lkl/g;->i:Lkl/d;

    iget-object p1, p0, Lkl/g;->c:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    :goto_0
    if-ltz v3, :cond_8

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkl/e;

    check-cast v4, Lkl/b;

    iget-object v5, v4, Lkl/b;->w:Lar/a;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v6

    :goto_1
    instance-of v7, v6, Landroid/graphics/drawable/Drawable;

    if-eqz v7, :cond_3

    check-cast v6, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v6

    goto :goto_1

    :cond_3
    if-nez v6, :cond_4

    invoke-virtual {v4}, Lkl/b;->stop()V

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    iget-object v5, v5, Lar/a;->b:Ljava/lang/Object;

    check-cast v5, Lkl/g;

    iget-object v6, v5, Lkl/g;->i:Lkl/d;

    const/4 v7, -0x1

    if-eqz v6, :cond_5

    iget v6, v6, Lkl/d;->E:I

    goto :goto_2

    :cond_5
    move v6, v7

    :goto_2
    invoke-virtual {v5}, Lkl/g;->d()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    if-ne v6, v5, :cond_6

    iget v5, v4, Lkl/b;->F:I

    add-int/lit8 v5, v5, 0x1

    iput v5, v4, Lkl/b;->F:I

    :cond_6
    iget v5, v4, Lkl/b;->G:I

    if-eq v5, v7, :cond_7

    iget v6, v4, Lkl/b;->F:I

    if-lt v6, v5, :cond_7

    invoke-virtual {v4}, Lkl/b;->stop()V

    :cond_7
    :goto_3
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_8
    if-eqz v0, :cond_9

    invoke-virtual {v2, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_9
    invoke-virtual {p0}, Lkl/g;->g()V

    return-void
.end method

.method public final i(Lwk/l;Landroid/graphics/Bitmap;)V
    .locals 3

    const-string v0, "Argument must not be null"

    invoke-static {p1, v0}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lkl/g;->l:Landroid/graphics/Bitmap;

    iget-object v0, p0, Lkl/g;->h:Lcom/bumptech/glide/f;

    new-instance v1, Lpl/d;

    invoke-direct {v1}, Lpl/a;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Lpl/a;->u(Lwk/l;Z)Lpl/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/f;->w(Lpl/a;)Lcom/bumptech/glide/f;

    move-result-object p1

    iput-object p1, p0, Lkl/g;->h:Lcom/bumptech/glide/f;

    invoke-static {p2}, Ltl/l;->c(Landroid/graphics/Bitmap;)I

    move-result p1

    iput p1, p0, Lkl/g;->n:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    iput p1, p0, Lkl/g;->o:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    iput p1, p0, Lkl/g;->p:I

    return-void
.end method

.method public final j(Lkl/b;)V
    .locals 2

    iget-boolean v0, p0, Lkl/g;->j:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lkl/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_1

    iget-boolean p1, p0, Lkl/g;->f:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lkl/g;->f:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lkl/g;->j:Z

    invoke-virtual {p0}, Lkl/g;->g()V

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot subscribe twice in a row"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot subscribe to a cleared frame loader"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k(Lkl/b;)V
    .locals 1

    iget-object v0, p0, Lkl/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lkl/g;->f:Z

    :cond_0
    return-void
.end method
