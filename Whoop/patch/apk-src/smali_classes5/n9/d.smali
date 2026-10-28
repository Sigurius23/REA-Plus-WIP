.class public final Ln9/d;
.super Lb9/f;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final R:Lng3/o;

.field public final S:La9/e;

.field public T:Ln9/a;

.field public final U:Ln9/c;

.field public V:Z

.field public W:I

.field public X:Lqa/f;

.field public Y:Lqa/i;

.field public Z:Lqa/d;

.field public a0:Lqa/d;

.field public b0:I

.field public final c0:Landroid/os/Handler;

.field public final d0:Lb9/c0;

.field public final e0:Lqg3/d;

.field public f0:Z

.field public g0:Z

.field public h0:Lu8/p;

.field public i0:J

.field public j0:J

.field public k0:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Lb9/c0;Landroid/os/Looper;)V
    .locals 2

    sget-object v0, Ln9/c;->n:Lla/b;

    const/4 v1, 0x3

    invoke-direct {p0, v1}, Lb9/f;-><init>(I)V

    iput-object p1, p0, Ln9/d;->d0:Lb9/c0;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    :goto_0
    iput-object p1, p0, Ln9/d;->c0:Landroid/os/Handler;

    iput-object v0, p0, Ln9/d;->U:Ln9/c;

    new-instance p1, Lng3/o;

    const/16 p2, 0x11

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lng3/o;-><init>(IZ)V

    iput-object p1, p0, Ln9/d;->R:Lng3/o;

    new-instance p1, La9/e;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, La9/e;-><init>(I)V

    iput-object p1, p0, Ln9/d;->S:La9/e;

    new-instance p1, Lqg3/d;

    const/4 p2, 0x4

    invoke-direct {p1, p2, v0}, Lqg3/d;-><init>(IC)V

    iput-object p1, p0, Ln9/d;->e0:Lqg3/d;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Ln9/d;->j0:J

    iput-wide p1, p0, Ln9/d;->i0:J

    return-void
.end method


# virtual methods
.method public final A(Lu8/p;)I
    .locals 3

    iget-object v0, p1, Lu8/p;->n:Ljava/lang/String;

    const-string v1, "application/x-media3-cues"

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p1, Lu8/p;->n:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Ln9/d;->U:Ln9/c;

    check-cast v0, Lla/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Ljc/b;

    invoke-virtual {v0, p1}, Ljc/b;->g(Lu8/p;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "application/cea-608"

    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "application/x-mp4-cea-608"

    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "application/cea-708"

    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lu8/d0;->m(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    invoke-static {p1, v2, v2, v2}, Lb9/f;->f(IIII)I

    move-result p1

    return p1

    :cond_1
    invoke-static {v2, v2, v2, v2}, Lb9/f;->f(IIII)I

    move-result p1

    return p1

    :cond_2
    :goto_0
    iget p1, p1, Lu8/p;->M:I

    if-nez p1, :cond_3

    const/4 p1, 0x4

    goto :goto_1

    :cond_3
    const/4 p1, 0x2

    :goto_1
    invoke-static {p1, v2, v2, v2}, Lb9/f;->f(IIII)I

    move-result p1

    return p1
.end method

.method public final C()V
    .locals 3

    iget-object v0, p0, Ln9/d;->h0:Lu8/p;

    iget-object v0, v0, Lu8/p;->n:Ljava/lang/String;

    const-string v1, "application/cea-608"

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ln9/d;->h0:Lu8/p;

    iget-object v0, v0, Lu8/p;->n:Ljava/lang/String;

    const-string v1, "application/x-mp4-cea-608"

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ln9/d;->h0:Lu8/p;

    iget-object v0, v0, Lu8/p;->n:Ljava/lang/String;

    const-string v1, "application/cea-708"

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Legacy decoding is disabled, can\'t handle "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ln9/d;->h0:Lu8/p;

    iget-object v2, v2, Lu8/p;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " samples (expected application/x-media3-cues)."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lva3/g;->h(Ljava/lang/String;Z)V

    return-void
.end method

.method public final D()J
    .locals 4

    iget v0, p0, Ln9/d;->b0:I

    const/4 v1, -0x1

    const-wide v2, 0x7fffffffffffffffL

    if-ne v0, v1, :cond_0

    return-wide v2

    :cond_0
    iget-object v0, p0, Ln9/d;->Z:Lqa/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Ln9/d;->b0:I

    iget-object v1, p0, Ln9/d;->Z:Lqa/d;

    invoke-virtual {v1}, Lqa/d;->j()I

    move-result v1

    if-lt v0, v1, :cond_1

    return-wide v2

    :cond_1
    iget-object v0, p0, Ln9/d;->Z:Lqa/d;

    iget v1, p0, Ln9/d;->b0:I

    invoke-virtual {v0, v1}, Lqa/d;->h(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final E(J)J
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lva3/g;->i(Z)V

    iget-wide v0, p0, Lb9/f;->K:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public final F()V
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Ln9/d;->V:Z

    iget-object v1, p0, Ln9/d;->h0:Lu8/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Ln9/d;->U:Ln9/c;

    check-cast v2, Lla/b;

    iget-object v2, v2, Lla/b;->x:Ljava/lang/Object;

    check-cast v2, Ljc/b;

    iget-object v3, v1, Lu8/p;->n:Ljava/lang/String;

    iget v4, v1, Lu8/p;->I:I

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v5

    const/4 v6, -0x1

    sparse-switch v5, :sswitch_data_0

    :goto_0
    move v0, v6

    goto :goto_1

    :sswitch_0
    const-string v0, "application/cea-708"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    goto :goto_1

    :sswitch_1
    const-string v5, "application/cea-608"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :sswitch_2
    const-string v0, "application/x-mp4-cea-608"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_1
    packed-switch v0, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    new-instance v0, Lra/f;

    iget-object v1, v1, Lu8/p;->q:Ljava/util/List;

    invoke-direct {v0, v4, v1}, Lra/f;-><init>(ILjava/util/List;)V

    goto :goto_3

    :pswitch_1
    new-instance v0, Lra/c;

    invoke-direct {v0, v3, v4}, Lra/c;-><init>(Ljava/lang/String;I)V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-virtual {v2, v1}, Ljc/b;->g(Lu8/p;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v2, v1}, Ljc/b;->h(Lu8/p;)Lqa/l;

    move-result-object v0

    new-instance v1, Lh9/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Decoder"

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {v1, v0}, Lh9/b;-><init>(Lqa/l;)V

    move-object v0, v1

    :goto_3
    iput-object v0, p0, Ln9/d;->X:Lqa/f;

    iget-wide v1, p0, Lb9/f;->L:J

    invoke-interface {v0, v1, v2}, La9/d;->d(J)V

    return-void

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Attempted to create decoder for unsupported MIME type: "

    invoke-static {v1, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x37713300 -> :sswitch_2
        0x5d578071 -> :sswitch_1
        0x5d578432 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final G(Lw8/c;)V
    .locals 5

    iget-object v0, p1, Lw8/c;->a:Lzr/g0;

    iget-object v1, p0, Ln9/d;->d0:Lb9/c0;

    iget-object v2, v1, Lb9/c0;->w:Lb9/f0;

    iget-object v2, v2, Lb9/f0;->N:Lx8/i;

    new-instance v3, Lb9/a0;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Lb9/a0;-><init>(Ljava/util/List;I)V

    const/16 v0, 0x1b

    invoke-virtual {v2, v0, v3}, Lx8/i;->e(ILx8/f;)V

    iget-object v1, v1, Lb9/c0;->w:Lb9/f0;

    iput-object p1, v1, Lb9/f0;->B0:Lw8/c;

    iget-object v1, v1, Lb9/f0;->N:Lx8/i;

    new-instance v2, Lab/g0;

    const/4 v3, 0x7

    invoke-direct {v2, p1, v3}, Lab/g0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v0, v2}, Lx8/i;->e(ILx8/f;)V

    return-void
.end method

.method public final H()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Ln9/d;->Y:Lqa/i;

    const/4 v1, -0x1

    iput v1, p0, Ln9/d;->b0:I

    iget-object v1, p0, Ln9/d;->Z:Lqa/d;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, La9/f;->p()V

    iput-object v0, p0, Ln9/d;->Z:Lqa/d;

    :cond_0
    iget-object v1, p0, Ln9/d;->a0:Lqa/d;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, La9/f;->p()V

    iput-object v0, p0, Ln9/d;->a0:Lqa/d;

    :cond_1
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lw8/c;

    invoke-virtual {p0, p1}, Ln9/d;->G(Lw8/c;)V

    return v1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    const-string v0, "TextRenderer"

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Ln9/d;->g0:Z

    return v0
.end method

.method public final n()Z
    .locals 7

    iget-object v0, p0, Ln9/d;->h0:Lu8/p;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Ln9/d;->k0:Ljava/io/IOException;

    if-nez v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lb9/f;->I:Ll9/z0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Ll9/z0;->c()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iput-object v0, p0, Ln9/d;->k0:Ljava/io/IOException;

    :cond_1
    :goto_0
    iget-object v0, p0, Ln9/d;->k0:Ljava/io/IOException;

    if-eqz v0, :cond_7

    iget-object v0, p0, Ln9/d;->h0:Lu8/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lu8/p;->n:Ljava/lang/String;

    const-string v2, "application/x-media3-cues"

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ln9/d;->T:Ln9/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v3, p0, Ln9/d;->i0:J

    invoke-interface {v0, v3, v4}, Ln9/a;->c(J)J

    move-result-wide v3

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v0, v3, v5

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    return v1

    :cond_3
    iget-boolean v0, p0, Ln9/d;->g0:Z

    if-nez v0, :cond_6

    iget-boolean v0, p0, Ln9/d;->f0:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Ln9/d;->Z:Lqa/d;

    iget-wide v3, p0, Ln9/d;->i0:J

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lqa/d;->j()I

    move-result v5

    sub-int/2addr v5, v1

    invoke-virtual {v0, v5}, Lqa/d;->h(I)J

    move-result-wide v5

    cmp-long v0, v5, v3

    if-gtz v0, :cond_7

    :cond_4
    iget-object v0, p0, Ln9/d;->a0:Lqa/d;

    iget-wide v3, p0, Ln9/d;->i0:J

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lqa/d;->j()I

    move-result v5

    sub-int/2addr v5, v1

    invoke-virtual {v0, v5}, Lqa/d;->h(I)J

    move-result-wide v5

    cmp-long v0, v5, v3

    if-gtz v0, :cond_7

    :cond_5
    iget-object v0, p0, Ln9/d;->Y:Lqa/i;

    if-eqz v0, :cond_7

    :cond_6
    return v2

    :cond_7
    :goto_2
    return v1
.end method

.method public final o()V
    .locals 7

    const/4 v0, 0x0

    iput-object v0, p0, Ln9/d;->h0:Lu8/p;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Ln9/d;->j0:J

    new-instance v3, Lw8/c;

    sget-object v4, Lzr/w0;->E:Lzr/w0;

    iget-wide v5, p0, Ln9/d;->i0:J

    invoke-virtual {p0, v5, v6}, Ln9/d;->E(J)J

    invoke-direct {v3, v4}, Lw8/c;-><init>(Ljava/util/List;)V

    iget-object v4, p0, Ln9/d;->c0:Landroid/os/Handler;

    if-eqz v4, :cond_0

    const/4 v5, 0x1

    invoke-virtual {v4, v5, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v3

    invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v3}, Ln9/d;->G(Lw8/c;)V

    :goto_0
    iput-wide v1, p0, Ln9/d;->i0:J

    iget-object v1, p0, Ln9/d;->X:Lqa/f;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Ln9/d;->H()V

    iget-object v1, p0, Ln9/d;->X:Lqa/f;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1}, La9/d;->release()V

    iput-object v0, p0, Ln9/d;->X:Lqa/f;

    const/4 v0, 0x0

    iput v0, p0, Ln9/d;->W:I

    :cond_1
    return-void
.end method

.method public final q(JZ)V
    .locals 2

    iput-wide p1, p0, Ln9/d;->i0:J

    iget-object p1, p0, Ln9/d;->T:Ln9/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ln9/a;->clear()V

    :cond_0
    new-instance p1, Lw8/c;

    sget-object p2, Lzr/w0;->E:Lzr/w0;

    iget-wide v0, p0, Ln9/d;->i0:J

    invoke-virtual {p0, v0, v1}, Ln9/d;->E(J)J

    invoke-direct {p1, p2}, Lw8/c;-><init>(Ljava/util/List;)V

    iget-object p2, p0, Ln9/d;->c0:Landroid/os/Handler;

    if-eqz p2, :cond_1

    const/4 p3, 0x1

    invoke-virtual {p2, p3, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Ln9/d;->G(Lw8/c;)V

    :goto_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Ln9/d;->f0:Z

    iput-boolean p1, p0, Ln9/d;->g0:Z

    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p2, p0, Ln9/d;->j0:J

    iget-object p2, p0, Ln9/d;->h0:Lu8/p;

    if-eqz p2, :cond_3

    iget-object p2, p2, Lu8/p;->n:Ljava/lang/String;

    const-string p3, "application/x-media3-cues"

    invoke-static {p2, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    iget p2, p0, Ln9/d;->W:I

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Ln9/d;->H()V

    iget-object p2, p0, Ln9/d;->X:Lqa/f;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p2}, La9/d;->release()V

    const/4 p2, 0x0

    iput-object p2, p0, Ln9/d;->X:Lqa/f;

    iput p1, p0, Ln9/d;->W:I

    invoke-virtual {p0}, Ln9/d;->F()V

    return-void

    :cond_2
    invoke-virtual {p0}, Ln9/d;->H()V

    iget-object p1, p0, Ln9/d;->X:Lqa/f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, La9/d;->flush()V

    iget-wide p2, p0, Lb9/f;->L:J

    invoke-interface {p1, p2, p3}, La9/d;->d(J)V

    :cond_3
    return-void
.end method

.method public final v([Lu8/p;JJLl9/c0;)V
    .locals 0

    const/4 p2, 0x0

    aget-object p1, p1, p2

    iput-object p1, p0, Ln9/d;->h0:Lu8/p;

    iget-object p1, p1, Lu8/p;->n:Ljava/lang/String;

    const-string p2, "application/x-media3-cues"

    invoke-static {p1, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 p2, 0x1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ln9/d;->C()V

    iget-object p1, p0, Ln9/d;->X:Lqa/f;

    if-eqz p1, :cond_0

    iput p2, p0, Ln9/d;->W:I

    return-void

    :cond_0
    invoke-virtual {p0}, Ln9/d;->F()V

    return-void

    :cond_1
    iget-object p1, p0, Ln9/d;->h0:Lu8/p;

    iget p1, p1, Lu8/p;->J:I

    if-ne p1, p2, :cond_2

    new-instance p1, Ln9/b;

    invoke-direct {p1}, Ln9/b;-><init>()V

    goto :goto_0

    :cond_2
    new-instance p1, Laa3/u0;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, Laa3/u0;-><init>(I)V

    :goto_0
    iput-object p1, p0, Ln9/d;->T:Ln9/a;

    return-void
.end method

.method public final x(JJ)V
    .locals 18

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    iget-boolean v0, v1, Lb9/f;->N:Z

    const/4 v4, 0x1

    if-eqz v0, :cond_0

    iget-wide v5, v1, Ln9/d;->j0:J

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v5, v7

    if-eqz v0, :cond_0

    cmp-long v0, v2, v5

    if-ltz v0, :cond_0

    invoke-virtual {v1}, Ln9/d;->H()V

    iput-boolean v4, v1, Ln9/d;->g0:Z

    :cond_0
    iget-boolean v0, v1, Ln9/d;->g0:Z

    if-eqz v0, :cond_1

    goto/16 :goto_10

    :cond_1
    iget-object v0, v1, Ln9/d;->h0:Lu8/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lu8/p;->n:Ljava/lang/String;

    const-string v5, "application/x-media3-cues"

    invoke-static {v0, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iget-object v5, v1, Ln9/d;->c0:Landroid/os/Handler;

    const/4 v6, 0x4

    const/4 v7, -0x4

    iget-object v8, v1, Ln9/d;->e0:Lqg3/d;

    const/4 v9, 0x0

    if-eqz v0, :cond_a

    iget-object v0, v1, Ln9/d;->T:Ln9/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v0, v1, Ln9/d;->f0:Z

    if-eqz v0, :cond_2

    goto/16 :goto_1

    :cond_2
    iget-object v0, v1, Ln9/d;->S:La9/e;

    invoke-virtual {v1, v8, v0, v9}, Lb9/f;->w(Lqg3/d;La9/e;I)I

    move-result v8

    if-eq v8, v7, :cond_3

    goto/16 :goto_1

    :cond_3
    invoke-virtual {v0, v6}, La9/a;->f(I)Z

    move-result v6

    if-eqz v6, :cond_4

    iput-boolean v4, v1, Ln9/d;->f0:Z

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, La9/e;->r()V

    iget-object v6, v0, La9/e;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v12, v0, La9/e;->G:J

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v7

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v8

    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    move-result v6

    iget-object v10, v1, Ln9/d;->R:Lng3/o;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v10

    invoke-virtual {v10, v7, v8, v6}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {v10, v9}, Landroid/os/Parcel;->setDataPosition(I)V

    const-class v6, Landroid/os/Bundle;

    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {v10, v6}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object v6

    invoke-virtual {v10}, Landroid/os/Parcel;->recycle()V

    const-string v7, "c"

    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v10, Lqa/a;

    new-instance v8, Llive/hms/video/factories/c;

    const/16 v11, 0x1c

    invoke-direct {v8, v11}, Llive/hms/video/factories/c;-><init>(I)V

    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object v11

    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v14

    if-ge v9, v14, :cond_5

    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/os/Bundle;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8, v14}, Llive/hms/video/factories/c;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v11, v14}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {v11}, Lzr/d0;->f()Lzr/w0;

    move-result-object v11

    const-string v7, "d"

    invoke-virtual {v6, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v14

    invoke-direct/range {v10 .. v15}, Lqa/a;-><init>(Ljava/util/List;JJ)V

    invoke-virtual {v0}, La9/e;->o()V

    iget-object v0, v1, Ln9/d;->T:Ln9/a;

    invoke-interface {v0, v10, v2, v3}, Ln9/a;->e(Lqa/a;J)Z

    move-result v9

    :goto_1
    iget-object v0, v1, Ln9/d;->T:Ln9/a;

    iget-wide v6, v1, Ln9/d;->i0:J

    invoke-interface {v0, v6, v7}, Ln9/a;->c(J)J

    move-result-wide v6

    const-wide/high16 v10, -0x8000000000000000L

    cmp-long v0, v6, v10

    if-nez v0, :cond_6

    iget-boolean v8, v1, Ln9/d;->f0:Z

    if-eqz v8, :cond_6

    if-nez v9, :cond_6

    iput-boolean v4, v1, Ln9/d;->g0:Z

    :cond_6
    if-eqz v0, :cond_7

    cmp-long v0, v6, v2

    if-gtz v0, :cond_7

    move v9, v4

    :cond_7
    if-eqz v9, :cond_9

    iget-object v0, v1, Ln9/d;->T:Ln9/a;

    invoke-interface {v0, v2, v3}, Ln9/a;->a(J)Lzr/g0;

    move-result-object v0

    iget-object v6, v1, Ln9/d;->T:Ln9/a;

    invoke-interface {v6, v2, v3}, Ln9/a;->b(J)J

    move-result-wide v6

    new-instance v8, Lw8/c;

    invoke-virtual {v1, v6, v7}, Ln9/d;->E(J)J

    invoke-direct {v8, v0}, Lw8/c;-><init>(Ljava/util/List;)V

    if-eqz v5, :cond_8

    invoke-virtual {v5, v4, v8}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_2

    :cond_8
    invoke-virtual {v1, v8}, Ln9/d;->G(Lw8/c;)V

    :goto_2
    iget-object v0, v1, Ln9/d;->T:Ln9/a;

    invoke-interface {v0, v6, v7}, Ln9/a;->d(J)V

    :cond_9
    iput-wide v2, v1, Ln9/d;->i0:J

    return-void

    :cond_a
    invoke-virtual {v1}, Ln9/d;->C()V

    iput-wide v2, v1, Ln9/d;->i0:J

    iget-object v0, v1, Ln9/d;->a0:Lqa/d;

    const-string v10, "Subtitle decoding failed. streamFormat="

    const-string v11, "TextRenderer"

    const/4 v12, 0x0

    if-nez v0, :cond_c

    iget-object v0, v1, Ln9/d;->X:Lqa/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, v2, v3}, Lqa/f;->a(J)V

    :try_start_0
    iget-object v0, v1, Ln9/d;->X:Lqa/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, La9/d;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqa/d;

    iput-object v0, v1, Ln9/d;->a0:Lqa/d;
    :try_end_0
    .catch Landroidx/media3/extractor/text/SubtitleDecoderException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v1, Ln9/d;->h0:Lu8/p;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2, v0}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Lw8/c;

    sget-object v2, Lzr/w0;->E:Lzr/w0;

    iget-wide v6, v1, Ln9/d;->i0:J

    invoke-virtual {v1, v6, v7}, Ln9/d;->E(J)J

    invoke-direct {v0, v2}, Lw8/c;-><init>(Ljava/util/List;)V

    if-eqz v5, :cond_b

    invoke-virtual {v5, v4, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_3

    :cond_b
    invoke-virtual {v1, v0}, Ln9/d;->G(Lw8/c;)V

    :goto_3
    invoke-virtual {v1}, Ln9/d;->H()V

    iget-object v0, v1, Ln9/d;->X:Lqa/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, La9/d;->release()V

    iput-object v12, v1, Ln9/d;->X:Lqa/f;

    iput v9, v1, Ln9/d;->W:I

    invoke-virtual {v1}, Ln9/d;->F()V

    goto/16 :goto_10

    :cond_c
    :goto_4
    iget v0, v1, Lb9/f;->H:I

    const/4 v13, 0x2

    if-eq v0, v13, :cond_d

    goto/16 :goto_10

    :cond_d
    iget-object v0, v1, Ln9/d;->Z:Lqa/d;

    if-eqz v0, :cond_e

    invoke-virtual {v1}, Ln9/d;->D()J

    move-result-wide v14

    move v0, v9

    :goto_5
    cmp-long v14, v14, v2

    if-gtz v14, :cond_f

    iget v0, v1, Ln9/d;->b0:I

    add-int/2addr v0, v4

    iput v0, v1, Ln9/d;->b0:I

    invoke-virtual {v1}, Ln9/d;->D()J

    move-result-wide v14

    move v0, v4

    goto :goto_5

    :cond_e
    move v0, v9

    :cond_f
    iget-object v14, v1, Ln9/d;->a0:Lqa/d;

    if-eqz v14, :cond_10

    invoke-virtual {v14, v6}, La9/a;->f(I)Z

    move-result v15

    if-eqz v15, :cond_12

    if-nez v0, :cond_10

    invoke-virtual {v1}, Ln9/d;->D()J

    move-result-wide v14

    const-wide v16, 0x7fffffffffffffffL

    cmp-long v14, v14, v16

    if-nez v14, :cond_10

    iget v14, v1, Ln9/d;->W:I

    if-ne v14, v13, :cond_11

    invoke-virtual {v1}, Ln9/d;->H()V

    iget-object v14, v1, Ln9/d;->X:Lqa/f;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v14}, La9/d;->release()V

    iput-object v12, v1, Ln9/d;->X:Lqa/f;

    iput v9, v1, Ln9/d;->W:I

    invoke-virtual {v1}, Ln9/d;->F()V

    :cond_10
    :goto_6
    move-object v15, v8

    goto :goto_7

    :cond_11
    invoke-virtual {v1}, Ln9/d;->H()V

    iput-boolean v4, v1, Ln9/d;->g0:Z

    goto :goto_6

    :cond_12
    move-object v15, v8

    iget-wide v7, v14, La9/f;->y:J

    cmp-long v7, v7, v2

    if-gtz v7, :cond_14

    iget-object v0, v1, Ln9/d;->Z:Lqa/d;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, La9/f;->p()V

    :cond_13
    invoke-virtual {v14, v2, v3}, Lqa/d;->b(J)I

    move-result v0

    iput v0, v1, Ln9/d;->b0:I

    iput-object v14, v1, Ln9/d;->Z:Lqa/d;

    iput-object v12, v1, Ln9/d;->a0:Lqa/d;

    move v0, v4

    :cond_14
    :goto_7
    if-eqz v0, :cond_19

    iget-object v0, v1, Ln9/d;->Z:Lqa/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v1, Ln9/d;->Z:Lqa/d;

    invoke-virtual {v0, v2, v3}, Lqa/d;->b(J)I

    move-result v0

    if-eqz v0, :cond_17

    iget-object v7, v1, Ln9/d;->Z:Lqa/d;

    invoke-virtual {v7}, Lqa/d;->j()I

    move-result v7

    if-nez v7, :cond_15

    goto :goto_8

    :cond_15
    const/4 v7, -0x1

    if-ne v0, v7, :cond_16

    iget-object v0, v1, Ln9/d;->Z:Lqa/d;

    invoke-virtual {v0}, Lqa/d;->j()I

    move-result v7

    sub-int/2addr v7, v4

    invoke-virtual {v0, v7}, Lqa/d;->h(I)J

    move-result-wide v7

    goto :goto_9

    :cond_16
    iget-object v7, v1, Ln9/d;->Z:Lqa/d;

    sub-int/2addr v0, v4

    invoke-virtual {v7, v0}, Lqa/d;->h(I)J

    move-result-wide v7

    goto :goto_9

    :cond_17
    :goto_8
    iget-object v0, v1, Ln9/d;->Z:Lqa/d;

    iget-wide v7, v0, La9/f;->y:J

    :goto_9
    invoke-virtual {v1, v7, v8}, Ln9/d;->E(J)J

    new-instance v0, Lw8/c;

    iget-object v7, v1, Ln9/d;->Z:Lqa/d;

    invoke-virtual {v7, v2, v3}, Lqa/d;->d(J)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Lw8/c;-><init>(Ljava/util/List;)V

    if-eqz v5, :cond_18

    invoke-virtual {v5, v4, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_a

    :cond_18
    invoke-virtual {v1, v0}, Ln9/d;->G(Lw8/c;)V

    :cond_19
    :goto_a
    iget v0, v1, Ln9/d;->W:I

    if-ne v0, v13, :cond_1a

    goto/16 :goto_10

    :cond_1a
    :goto_b
    :try_start_1
    iget-boolean v0, v1, Ln9/d;->f0:Z

    if-nez v0, :cond_22

    iget-object v0, v1, Ln9/d;->Y:Lqa/i;

    if-nez v0, :cond_1c

    iget-object v0, v1, Ln9/d;->X:Lqa/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, La9/d;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqa/i;

    if-nez v0, :cond_1b

    goto/16 :goto_10

    :cond_1b
    iput-object v0, v1, Ln9/d;->Y:Lqa/i;

    goto :goto_c

    :catch_1
    move-exception v0

    goto :goto_e

    :cond_1c
    :goto_c
    iget v2, v1, Ln9/d;->W:I

    if-ne v2, v4, :cond_1d

    iput v6, v0, La9/a;->x:I

    iget-object v2, v1, Ln9/d;->X:Lqa/f;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v2, v0}, La9/d;->e(Lqa/i;)V

    iput-object v12, v1, Ln9/d;->Y:Lqa/i;

    iput v13, v1, Ln9/d;->W:I

    return-void

    :cond_1d
    invoke-virtual {v1, v15, v0, v9}, Lb9/f;->w(Lqg3/d;La9/e;I)I

    move-result v2

    const/4 v3, -0x4

    if-ne v2, v3, :cond_20

    invoke-virtual {v0, v6}, La9/a;->f(I)Z

    move-result v2

    if-eqz v2, :cond_1e

    iput-boolean v4, v1, Ln9/d;->f0:Z

    iput-boolean v9, v1, Ln9/d;->V:Z

    goto :goto_d

    :cond_1e
    iget-object v2, v15, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v2, Lu8/p;

    if-nez v2, :cond_1f

    goto :goto_10

    :cond_1f
    iget-wide v7, v2, Lu8/p;->s:J

    iput-wide v7, v0, Lqa/i;->J:J

    invoke-virtual {v0}, La9/e;->r()V

    iget-boolean v2, v1, Ln9/d;->V:Z

    invoke-virtual {v0, v4}, La9/a;->f(I)Z

    move-result v7

    xor-int/2addr v7, v4

    and-int/2addr v2, v7

    iput-boolean v2, v1, Ln9/d;->V:Z

    :goto_d
    iget-boolean v2, v1, Ln9/d;->V:Z

    if-nez v2, :cond_1a

    iget-object v2, v1, Ln9/d;->X:Lqa/f;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v2, v0}, La9/d;->e(Lqa/i;)V

    iput-object v12, v1, Ln9/d;->Y:Lqa/i;
    :try_end_1
    .catch Landroidx/media3/extractor/text/SubtitleDecoderException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_b

    :cond_20
    const/4 v0, -0x3

    if-ne v2, v0, :cond_1a

    goto :goto_10

    :goto_e
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v1, Ln9/d;->h0:Lu8/p;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2, v0}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Lw8/c;

    sget-object v2, Lzr/w0;->E:Lzr/w0;

    iget-wide v6, v1, Ln9/d;->i0:J

    invoke-virtual {v1, v6, v7}, Ln9/d;->E(J)J

    invoke-direct {v0, v2}, Lw8/c;-><init>(Ljava/util/List;)V

    if-eqz v5, :cond_21

    invoke-virtual {v5, v4, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_f

    :cond_21
    invoke-virtual {v1, v0}, Ln9/d;->G(Lw8/c;)V

    :goto_f
    invoke-virtual {v1}, Ln9/d;->H()V

    iget-object v0, v1, Ln9/d;->X:Lqa/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, La9/d;->release()V

    iput-object v12, v1, Ln9/d;->X:Lqa/f;

    iput v9, v1, Ln9/d;->W:I

    invoke-virtual {v1}, Ln9/d;->F()V

    :cond_22
    :goto_10
    return-void
.end method
