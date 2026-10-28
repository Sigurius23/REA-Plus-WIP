.class public final Lj9/b;
.super Lb9/f;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final R:Lj9/a;

.field public final S:Lb9/c0;

.field public final T:Landroid/os/Handler;

.field public final U:Lca/a;

.field public V:Lvd/f;

.field public W:Z

.field public X:Z

.field public Y:J

.field public Z:Lu8/c0;

.field public a0:J


# direct methods
.method public constructor <init>(Lb9/c0;Landroid/os/Looper;)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lb9/f;-><init>(I)V

    iput-object p1, p0, Lj9/b;->S:Lb9/c0;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    :goto_0
    iput-object p1, p0, Lj9/b;->T:Landroid/os/Handler;

    sget-object p1, Lj9/a;->a:Lj9/a;

    iput-object p1, p0, Lj9/b;->R:Lj9/a;

    new-instance p1, Lca/a;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, La9/e;-><init>(I)V

    iput-object p1, p0, Lj9/b;->U:Lca/a;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lj9/b;->a0:J

    return-void
.end method


# virtual methods
.method public final A(Lu8/p;)I
    .locals 2

    iget-object v0, p0, Lj9/b;->R:Lj9/a;

    invoke-virtual {v0, p1}, Lj9/a;->b(Lu8/p;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget p1, p1, Lu8/p;->M:I

    if-nez p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    invoke-static {p1, v1, v1, v1}, Lb9/f;->f(IIII)I

    move-result p1

    return p1

    :cond_1
    invoke-static {v1, v1, v1, v1}, Lb9/f;->f(IIII)I

    move-result p1

    return p1
.end method

.method public final C(Lu8/c0;Ljava/util/ArrayList;)V
    .locals 5

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Lu8/c0;->a:[Lu8/b0;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    aget-object v2, v1, v0

    invoke-interface {v2}, Lu8/b0;->d()Lu8/p;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v3, p0, Lj9/b;->R:Lj9/a;

    invoke-virtual {v3, v2}, Lj9/a;->b(Lu8/p;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3, v2}, Lj9/a;->a(Lu8/p;)Lvd/f;

    move-result-object v2

    aget-object v1, v1, v0

    invoke-interface {v1}, Lu8/b0;->j()[B

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lj9/b;->U:Lca/a;

    invoke-virtual {v3}, La9/e;->o()V

    array-length v4, v1

    invoke-virtual {v3, v4}, La9/e;->q(I)V

    iget-object v4, v3, La9/e;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {v4, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, La9/e;->r()V

    invoke-virtual {v2, v3}, Lvd/f;->m(Lca/a;)Lu8/c0;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v1, p2}, Lj9/b;->C(Lu8/c0;Ljava/util/ArrayList;)V

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

.method public final D(J)J
    .locals 7

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    invoke-static {v2}, Lva3/g;->i(Z)V

    iget-wide v5, p0, Lj9/b;->a0:J

    cmp-long v0, v5, v0

    if-eqz v0, :cond_1

    move v3, v4

    :cond_1
    invoke-static {v3}, Lva3/g;->i(Z)V

    iget-wide v0, p0, Lj9/b;->a0:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public final E(Lu8/c0;)V
    .locals 7

    iget-object v0, p0, Lj9/b;->S:Lb9/c0;

    iget-object v1, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v2, v1, Lb9/f0;->H0:Lu8/a0;

    iget-object v3, v1, Lb9/f0;->N:Lx8/i;

    invoke-virtual {v2}, Lu8/a0;->a()Lu8/z;

    move-result-object v2

    const/4 v4, 0x0

    :goto_0
    iget-object v5, p1, Lu8/c0;->a:[Lu8/b0;

    array-length v6, v5

    if-ge v4, v6, :cond_0

    aget-object v5, v5, v4

    invoke-interface {v5, v2}, Lu8/b0;->a(Lu8/z;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance v4, Lu8/a0;

    invoke-direct {v4, v2}, Lu8/a0;-><init>(Lu8/z;)V

    iput-object v4, v1, Lb9/f0;->H0:Lu8/a0;

    invoke-virtual {v1}, Lb9/f0;->R()Lu8/a0;

    move-result-object v2

    iget-object v4, v1, Lb9/f0;->q0:Lu8/a0;

    invoke-virtual {v2, v4}, Lu8/a0;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    iput-object v2, v1, Lb9/f0;->q0:Lu8/a0;

    new-instance v1, Lab/g0;

    const/16 v2, 0x8

    invoke-direct {v1, v0, v2}, Lab/g0;-><init>(Ljava/lang/Object;I)V

    const/16 v0, 0xe

    invoke-virtual {v3, v0, v1}, Lx8/i;->c(ILx8/f;)V

    :cond_1
    new-instance v0, Lab/g0;

    const/16 v1, 0x9

    invoke-direct {v0, p1, v1}, Lab/g0;-><init>(Ljava/lang/Object;I)V

    const/16 p1, 0x1c

    invoke-virtual {v3, p1, v0}, Lx8/i;->c(ILx8/f;)V

    invoke-virtual {v3}, Lx8/i;->b()V

    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lu8/c0;

    invoke-virtual {p0, p1}, Lj9/b;->E(Lu8/c0;)V

    return v1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    const-string v0, "MetadataRenderer"

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lj9/b;->X:Z

    return v0
.end method

.method public final n()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final o()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lj9/b;->Z:Lu8/c0;

    iput-object v0, p0, Lj9/b;->V:Lvd/f;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lj9/b;->a0:J

    return-void
.end method

.method public final q(JZ)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lj9/b;->Z:Lu8/c0;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lj9/b;->W:Z

    iput-boolean p1, p0, Lj9/b;->X:Z

    return-void
.end method

.method public final v([Lu8/p;JJLl9/c0;)V
    .locals 2

    const/4 p2, 0x0

    aget-object p1, p1, p2

    iget-object p2, p0, Lj9/b;->R:Lj9/a;

    invoke-virtual {p2, p1}, Lj9/a;->a(Lu8/p;)Lvd/f;

    move-result-object p1

    iput-object p1, p0, Lj9/b;->V:Lvd/f;

    iget-object p1, p0, Lj9/b;->Z:Lu8/c0;

    if-eqz p1, :cond_1

    iget-wide p2, p1, Lu8/c0;->b:J

    iget-wide v0, p0, Lj9/b;->a0:J

    add-long/2addr v0, p2

    sub-long/2addr v0, p4

    cmp-long p2, p2, v0

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Lu8/c0;

    iget-object p1, p1, Lu8/c0;->a:[Lu8/b0;

    invoke-direct {p2, v0, v1, p1}, Lu8/c0;-><init>(J[Lu8/b0;)V

    move-object p1, p2

    :goto_0
    iput-object p1, p0, Lj9/b;->Z:Lu8/c0;

    :cond_1
    iput-wide p4, p0, Lj9/b;->a0:J

    return-void
.end method

.method public final x(JJ)V
    .locals 5

    const/4 p3, 0x1

    move p4, p3

    :cond_0
    :goto_0
    if-eqz p4, :cond_6

    iget-boolean p4, p0, Lj9/b;->W:Z

    const/4 v0, 0x0

    if-nez p4, :cond_3

    iget-object p4, p0, Lj9/b;->Z:Lu8/c0;

    if-nez p4, :cond_3

    iget-object p4, p0, Lj9/b;->U:Lca/a;

    invoke-virtual {p4}, La9/e;->o()V

    iget-object v1, p0, Lb9/f;->y:Lqg3/d;

    invoke-virtual {v1}, Lqg3/d;->k()V

    invoke-virtual {p0, v1, p4, v0}, Lb9/f;->w(Lqg3/d;La9/e;I)I

    move-result v2

    const/4 v3, -0x4

    if-ne v2, v3, :cond_2

    const/4 v1, 0x4

    invoke-virtual {p4, v1}, La9/a;->f(I)Z

    move-result v1

    if-eqz v1, :cond_1

    iput-boolean p3, p0, Lj9/b;->W:Z

    goto :goto_1

    :cond_1
    iget-wide v1, p4, La9/e;->G:J

    iget-wide v3, p0, Lb9/f;->L:J

    cmp-long v1, v1, v3

    if-ltz v1, :cond_3

    iget-wide v1, p0, Lj9/b;->Y:J

    iput-wide v1, p4, Lca/a;->J:J

    invoke-virtual {p4}, La9/e;->r()V

    iget-object v1, p0, Lj9/b;->V:Lvd/f;

    sget v2, Lx8/t;->a:I

    invoke-virtual {v1, p4}, Lvd/f;->m(Lca/a;)Lu8/c0;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, v1, Lu8/c0;->a:[Lu8/b0;

    array-length v3, v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0, v1, v2}, Lj9/b;->C(Lu8/c0;Ljava/util/ArrayList;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Lu8/c0;

    iget-wide v3, p4, La9/e;->G:J

    invoke-virtual {p0, v3, v4}, Lj9/b;->D(J)J

    move-result-wide v3

    new-array p4, v0, [Lu8/b0;

    invoke-virtual {v2, p4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [Lu8/b0;

    invoke-direct {v1, v3, v4, p4}, Lu8/c0;-><init>(J[Lu8/b0;)V

    iput-object v1, p0, Lj9/b;->Z:Lu8/c0;

    goto :goto_1

    :cond_2
    const/4 p4, -0x5

    if-ne v2, p4, :cond_3

    iget-object p4, v1, Lqg3/d;->y:Ljava/lang/Object;

    check-cast p4, Lu8/p;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v1, p4, Lu8/p;->s:J

    iput-wide v1, p0, Lj9/b;->Y:J

    :cond_3
    :goto_1
    iget-object p4, p0, Lj9/b;->Z:Lu8/c0;

    if-eqz p4, :cond_5

    iget-wide v1, p4, Lu8/c0;->b:J

    invoke-virtual {p0, p1, p2}, Lj9/b;->D(J)J

    move-result-wide v3

    cmp-long p4, v1, v3

    if-gtz p4, :cond_5

    iget-object p4, p0, Lj9/b;->Z:Lu8/c0;

    iget-object v0, p0, Lj9/b;->T:Landroid/os/Handler;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p3, p4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p4

    invoke-virtual {p4}, Landroid/os/Message;->sendToTarget()V

    goto :goto_2

    :cond_4
    invoke-virtual {p0, p4}, Lj9/b;->E(Lu8/c0;)V

    :goto_2
    const/4 p4, 0x0

    iput-object p4, p0, Lj9/b;->Z:Lu8/c0;

    move p4, p3

    goto :goto_3

    :cond_5
    move p4, v0

    :goto_3
    iget-boolean v0, p0, Lj9/b;->W:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj9/b;->Z:Lu8/c0;

    if-nez v0, :cond_0

    iput-boolean p3, p0, Lj9/b;->X:Z

    goto/16 :goto_0

    :cond_6
    return-void
.end method
