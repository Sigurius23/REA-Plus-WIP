.class public final Lin/f;
.super Lrm/d;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final M:Lin/d;

.field public final N:Lrm/r;

.field public final O:Landroid/os/Handler;

.field public final P:Lin/e;

.field public Q:Lio/sentry/config/a;

.field public R:Z

.field public S:Z

.field public T:J

.field public U:J

.field public V:Lin/c;


# direct methods
.method public constructor <init>(Lrm/r;Landroid/os/Looper;)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lrm/d;-><init>(I)V

    iput-object p1, p0, Lin/f;->N:Lrm/r;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    sget p1, Llo/y;->a:I

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    :goto_0
    iput-object p1, p0, Lin/f;->O:Landroid/os/Handler;

    sget-object p1, Lin/d;->a:Lin/d;

    iput-object p1, p0, Lin/f;->M:Lin/d;

    new-instance p1, Lin/e;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lum/c;-><init>(I)V

    iput-object p1, p0, Lin/f;->P:Lin/e;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lin/f;->U:J

    return-void
.end method


# virtual methods
.method public final A(Lin/c;)V
    .locals 7

    iget-object v0, p0, Lin/f;->N:Lrm/r;

    iget-object v1, v0, Lrm/r;->w:Lrm/u;

    iget-object v2, v1, Lrm/u;->J0:Lrm/m0;

    iget-object v3, v1, Lrm/u;->M:Ld9/p;

    invoke-virtual {v2}, Lrm/m0;->a()Lrm/l0;

    move-result-object v2

    const/4 v4, 0x0

    :goto_0
    iget-object v5, p1, Lin/c;->w:[Lin/b;

    array-length v6, v5

    if-ge v4, v6, :cond_0

    aget-object v5, v5, v4

    invoke-interface {v5, v2}, Lin/b;->w(Lrm/l0;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance v4, Lrm/m0;

    invoke-direct {v4, v2}, Lrm/m0;-><init>(Lrm/l0;)V

    iput-object v4, v1, Lrm/u;->J0:Lrm/m0;

    invoke-virtual {v1}, Lrm/u;->R()Lrm/m0;

    move-result-object v2

    iget-object v4, v1, Lrm/u;->p0:Lrm/m0;

    invoke-virtual {v2, v4}, Lrm/m0;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    iput-object v2, v1, Lrm/u;->p0:Lrm/m0;

    new-instance v1, Lrm/p;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    const/16 v0, 0xe

    invoke-virtual {v3, v0, v1}, Ld9/p;->g(ILlo/h;)V

    :cond_1
    new-instance v0, Lrm/p;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    const/16 p1, 0x1c

    invoke-virtual {v3, p1, v0}, Ld9/p;->g(ILlo/h;)V

    invoke-virtual {v3}, Ld9/p;->b()V

    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    const-string v0, "MetadataRenderer"

    return-object v0
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lin/c;

    invoke-virtual {p0, p1}, Lin/f;->A(Lin/c;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Lin/f;->S:Z

    return v0
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final l()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lin/f;->V:Lin/c;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lin/f;->U:J

    iput-object v0, p0, Lin/f;->Q:Lio/sentry/config/a;

    return-void
.end method

.method public final n(JZ)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lin/f;->V:Lin/c;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lin/f;->U:J

    const/4 p1, 0x0

    iput-boolean p1, p0, Lin/f;->R:Z

    iput-boolean p1, p0, Lin/f;->S:Z

    return-void
.end method

.method public final r([Lrm/c0;JJ)V
    .locals 0

    const/4 p2, 0x0

    aget-object p1, p1, p2

    iget-object p2, p0, Lin/f;->M:Lin/d;

    invoke-virtual {p2, p1}, Lin/d;->a(Lrm/c0;)Lio/sentry/config/a;

    move-result-object p1

    iput-object p1, p0, Lin/f;->Q:Lio/sentry/config/a;

    return-void
.end method

.method public final t(JJ)V
    .locals 4

    const/4 p3, 0x1

    move p4, p3

    :cond_0
    :goto_0
    if-eqz p4, :cond_6

    iget-boolean p4, p0, Lin/f;->R:Z

    const/4 v0, 0x0

    if-nez p4, :cond_3

    iget-object p4, p0, Lin/f;->V:Lin/c;

    if-nez p4, :cond_3

    iget-object p4, p0, Lin/f;->P:Lin/e;

    invoke-virtual {p4}, Lum/c;->o()V

    iget-object v1, p0, Lrm/d;->x:Lxl/a;

    invoke-virtual {v1}, Lxl/a;->j()V

    invoke-virtual {p0, v1, p4, v0}, Lrm/d;->s(Lxl/a;Lum/c;I)I

    move-result v2

    const/4 v3, -0x4

    if-ne v2, v3, :cond_2

    const/4 v1, 0x4

    invoke-virtual {p4, v1}, La9/a;->f(I)Z

    move-result v1

    if-eqz v1, :cond_1

    iput-boolean p3, p0, Lin/f;->R:Z

    goto :goto_1

    :cond_1
    iget-wide v1, p0, Lin/f;->T:J

    iput-wide v1, p4, Lin/e;->I:J

    invoke-virtual {p4}, Lum/c;->r()V

    iget-object v1, p0, Lin/f;->Q:Lio/sentry/config/a;

    sget v2, Llo/y;->a:I

    invoke-virtual {v1, p4}, Lio/sentry/config/a;->s(Lin/e;)Lin/c;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, v1, Lin/c;->w:[Lin/b;

    array-length v3, v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0, v1, v2}, Lin/f;->z(Lin/c;Ljava/util/ArrayList;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Lin/c;

    invoke-direct {v1, v2}, Lin/c;-><init>(Ljava/util/List;)V

    iput-object v1, p0, Lin/f;->V:Lin/c;

    iget-wide v1, p4, Lum/c;->F:J

    iput-wide v1, p0, Lin/f;->U:J

    goto :goto_1

    :cond_2
    const/4 p4, -0x5

    if-ne v2, p4, :cond_3

    iget-object p4, v1, Lxl/a;->y:Ljava/lang/Object;

    check-cast p4, Lrm/c0;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v1, p4, Lrm/c0;->P:J

    iput-wide v1, p0, Lin/f;->T:J

    :cond_3
    :goto_1
    iget-object p4, p0, Lin/f;->V:Lin/c;

    if-eqz p4, :cond_5

    iget-wide v1, p0, Lin/f;->U:J

    cmp-long v1, v1, p1

    if-gtz v1, :cond_5

    iget-object v1, p0, Lin/f;->O:Landroid/os/Handler;

    if-eqz v1, :cond_4

    invoke-virtual {v1, v0, p4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p4

    invoke-virtual {p4}, Landroid/os/Message;->sendToTarget()V

    goto :goto_2

    :cond_4
    invoke-virtual {p0, p4}, Lin/f;->A(Lin/c;)V

    :goto_2
    const/4 p4, 0x0

    iput-object p4, p0, Lin/f;->V:Lin/c;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lin/f;->U:J

    move p4, p3

    goto :goto_3

    :cond_5
    move p4, v0

    :goto_3
    iget-boolean v0, p0, Lin/f;->R:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lin/f;->V:Lin/c;

    if-nez v0, :cond_0

    iput-boolean p3, p0, Lin/f;->S:Z

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method public final x(Lrm/c0;)I
    .locals 2

    iget-object v0, p0, Lin/f;->M:Lin/d;

    invoke-virtual {v0, p1}, Lin/d;->b(Lrm/c0;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget p1, p1, Lrm/c0;->e0:I

    if-nez p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    invoke-static {p1, v1, v1}, Lrm/d;->d(III)I

    move-result p1

    return p1

    :cond_1
    invoke-static {v1, v1, v1}, Lrm/d;->d(III)I

    move-result p1

    return p1
.end method

.method public final z(Lin/c;Ljava/util/ArrayList;)V
    .locals 5

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Lin/c;->w:[Lin/b;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    aget-object v2, v1, v0

    invoke-interface {v2}, Lin/b;->d()Lrm/c0;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v3, p0, Lin/f;->M:Lin/d;

    invoke-virtual {v3, v2}, Lin/d;->b(Lrm/c0;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3, v2}, Lin/d;->a(Lrm/c0;)Lio/sentry/config/a;

    move-result-object v2

    aget-object v1, v1, v0

    invoke-interface {v1}, Lin/b;->j()[B

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lin/f;->P:Lin/e;

    invoke-virtual {v3}, Lum/c;->o()V

    array-length v4, v1

    invoke-virtual {v3, v4}, Lum/c;->q(I)V

    iget-object v4, v3, Lum/c;->z:Ljava/nio/ByteBuffer;

    invoke-virtual {v4, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Lum/c;->r()V

    invoke-virtual {v2, v3}, Lio/sentry/config/a;->s(Lin/e;)Lin/c;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v1, p2}, Lin/f;->z(Lin/c;Ljava/util/ArrayList;)V

    goto :goto_1

    :cond_0
    aget-object v1, v1, v0

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
