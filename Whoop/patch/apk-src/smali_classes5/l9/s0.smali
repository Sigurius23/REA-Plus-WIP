.class public final Ll9/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/a0;
.implements Lt9/q;
.implements Lp9/g;
.implements Lp9/j;


# static fields
.field public static final p0:Ljava/util/Map;

.field public static final q0:Lu8/p;


# instance fields
.field public final E:Lg9/d;

.field public final F:Lg9/d;

.field public final G:Ll9/v0;

.field public final H:Lko/o;

.field public final I:J

.field public final J:Lu8/p;

.field public final K:J

.field public final L:Lp9/k;

.field public final M:Lgm/r;

.field public final N:Lb9/m1;

.field public final O:Ll9/n0;

.field public final P:Ll9/n0;

.field public final Q:Landroid/os/Handler;

.field public R:Ll9/z;

.field public S:Lga/b;

.field public T:[Ll9/y0;

.field public U:[Ll9/r0;

.field public V:Z

.field public W:Z

.field public X:Z

.field public Y:Z

.field public Z:La00/g;

.field public a0:Lt9/e0;

.field public b0:J

.field public c0:Z

.field public d0:I

.field public e0:Z

.field public f0:Z

.field public g0:Z

.field public h0:I

.field public i0:Z

.field public j0:J

.field public k0:J

.field public l0:Z

.field public m0:I

.field public n0:Z

.field public o0:Z

.field public final w:Landroid/net/Uri;

.field public final x:Lz8/f;

.field public final y:Lg9/h;

.field public final z:Ljc/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "Icy-MetaData"

    const-string v2, "1"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Ll9/s0;->p0:Ljava/util/Map;

    new-instance v0, Lu8/o;

    invoke-direct {v0}, Lu8/o;-><init>()V

    const-string v1, "icy"

    iput-object v1, v0, Lu8/o;->a:Ljava/lang/String;

    const-string v1, "application/x-icy"

    invoke-static {v1}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lu8/o;->m:Ljava/lang/String;

    new-instance v1, Lu8/p;

    invoke-direct {v1, v0}, Lu8/p;-><init>(Lu8/o;)V

    sput-object v1, Ll9/s0;->q0:Lu8/p;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lz8/f;Lgm/r;Lg9/h;Lg9/d;Ljc/b;Lg9/d;Ll9/v0;Lko/o;ILu8/p;JLq9/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/s0;->w:Landroid/net/Uri;

    iput-object p2, p0, Ll9/s0;->x:Lz8/f;

    iput-object p4, p0, Ll9/s0;->y:Lg9/h;

    iput-object p5, p0, Ll9/s0;->F:Lg9/d;

    iput-object p6, p0, Ll9/s0;->z:Ljc/b;

    iput-object p7, p0, Ll9/s0;->E:Lg9/d;

    iput-object p8, p0, Ll9/s0;->G:Ll9/v0;

    iput-object p9, p0, Ll9/s0;->H:Lko/o;

    int-to-long p1, p10

    iput-wide p1, p0, Ll9/s0;->I:J

    iput-object p11, p0, Ll9/s0;->J:Lu8/p;

    if-eqz p14, :cond_0

    new-instance p1, Lp9/k;

    invoke-direct {p1, p14}, Lp9/k;-><init>(Lq9/a;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lp9/k;

    const-string p2, "ProgressiveMediaPeriod"

    invoke-direct {p1, p2}, Lp9/k;-><init>(Ljava/lang/String;)V

    :goto_0
    iput-object p1, p0, Ll9/s0;->L:Lp9/k;

    iput-object p3, p0, Ll9/s0;->M:Lgm/r;

    iput-wide p12, p0, Ll9/s0;->K:J

    new-instance p1, Lb9/m1;

    const/4 p2, 0x7

    invoke-direct {p1, p2}, Lb9/m1;-><init>(I)V

    iput-object p1, p0, Ll9/s0;->N:Lb9/m1;

    new-instance p1, Ll9/n0;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Ll9/n0;-><init>(Ll9/s0;I)V

    iput-object p1, p0, Ll9/s0;->O:Ll9/n0;

    new-instance p1, Ll9/n0;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Ll9/n0;-><init>(Ll9/s0;I)V

    iput-object p1, p0, Ll9/s0;->P:Ll9/n0;

    const/4 p1, 0x0

    invoke-static {p1}, Lx8/t;->m(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Ll9/s0;->Q:Landroid/os/Handler;

    const/4 p1, 0x0

    new-array p2, p1, [Ll9/r0;

    iput-object p2, p0, Ll9/s0;->U:[Ll9/r0;

    new-array p1, p1, [Ll9/y0;

    iput-object p1, p0, Ll9/s0;->T:[Ll9/y0;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Ll9/s0;->k0:J

    const/4 p1, 0x1

    iput p1, p0, Ll9/s0;->d0:I

    return-void
.end method


# virtual methods
.method public final A(I)V
    .locals 10

    invoke-virtual {p0}, Ll9/s0;->b()V

    iget-object v0, p0, Ll9/s0;->Z:La00/g;

    iget-object v1, v0, La00/g;->E:Ljava/lang/Object;

    check-cast v1, [Z

    aget-boolean v2, v1, p1

    if-nez v2, :cond_0

    iget-object v0, v0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Ll9/g1;

    invoke-virtual {v0, p1}, Ll9/g1;->a(I)Lu8/p0;

    move-result-object v0

    const/4 v2, 0x0

    iget-object v0, v0, Lu8/p0;->d:[Lu8/p;

    aget-object v5, v0, v2

    iget-object v0, v5, Lu8/p;->n:Ljava/lang/String;

    invoke-static {v0}, Lu8/d0;->i(Ljava/lang/String;)I

    move-result v4

    const/4 v7, 0x0

    iget-wide v8, p0, Ll9/s0;->j0:J

    iget-object v3, p0, Ll9/s0;->E:Lg9/d;

    const/4 v6, 0x0

    invoke-virtual/range {v3 .. v9}, Lg9/d;->b(ILu8/p;ILjava/lang/Object;J)V

    const/4 v0, 0x1

    aput-boolean v0, v1, p1

    :cond_0
    return-void
.end method

.method public final B(I)V
    .locals 4

    invoke-virtual {p0}, Ll9/s0;->b()V

    iget-boolean v0, p0, Ll9/s0;->l0:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Ll9/s0;->X:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll9/s0;->Z:La00/g;

    iget-object v0, v0, La00/g;->y:Ljava/lang/Object;

    check-cast v0, [Z

    aget-boolean v0, v0, p1

    if-eqz v0, :cond_3

    :cond_0
    iget-object v0, p0, Ll9/s0;->T:[Ll9/y0;

    aget-object p1, v0, p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll9/y0;->o(Z)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Ll9/s0;->k0:J

    iput-boolean v0, p0, Ll9/s0;->l0:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Ll9/s0;->f0:Z

    iput-wide v1, p0, Ll9/s0;->j0:J

    iput v0, p0, Ll9/s0;->m0:I

    iget-object p1, p0, Ll9/s0;->T:[Ll9/y0;

    array-length v1, p1

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p1, v2

    invoke-virtual {v3, v0}, Ll9/y0;->s(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Ll9/s0;->R:Ll9/z;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p0}, Ll9/a1;->b(Ll9/b1;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final C(Ll9/r0;)Lt9/k0;
    .locals 5

    iget-object v0, p0, Ll9/s0;->T:[Ll9/y0;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Ll9/s0;->U:[Ll9/r0;

    aget-object v2, v2, v1

    invoke-virtual {p1, v2}, Ll9/r0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Ll9/s0;->T:[Ll9/y0;

    aget-object p1, p1, v1

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-boolean v1, p0, Ll9/s0;->V:Z

    if-eqz v1, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Extractor added new track (id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p1, p1, Ll9/r0;->a:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") after finishing tracks."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ProgressiveMediaPeriod"

    invoke-static {v0, p1}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lt9/m;

    invoke-direct {p1}, Lt9/m;-><init>()V

    return-object p1

    :cond_2
    new-instance v1, Ll9/y0;

    iget-object v2, p0, Ll9/s0;->y:Lg9/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Ll9/s0;->H:Lko/o;

    iget-object v4, p0, Ll9/s0;->F:Lg9/d;

    invoke-direct {v1, v3, v2, v4}, Ll9/y0;-><init>(Lko/o;Lg9/h;Lg9/d;)V

    iput-object p0, v1, Ll9/y0;->f:Ll9/s0;

    iget-object v2, p0, Ll9/s0;->U:[Ll9/r0;

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll9/r0;

    aput-object p1, v2, v0

    sget p1, Lx8/t;->a:I

    iput-object v2, p0, Ll9/s0;->U:[Ll9/r0;

    iget-object p1, p0, Ll9/s0;->T:[Ll9/y0;

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll9/y0;

    aput-object v1, p1, v0

    iput-object p1, p0, Ll9/s0;->T:[Ll9/y0;

    return-object v1
.end method

.method public final D(Lt9/e0;)V
    .locals 6

    iget-object v0, p0, Ll9/s0;->S:Lga/b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Lt9/t;

    invoke-direct {v0, v1, v2}, Lt9/t;-><init>(J)V

    :goto_0
    iput-object v0, p0, Ll9/s0;->a0:Lt9/e0;

    invoke-interface {p1}, Lt9/e0;->f()J

    move-result-wide v3

    iput-wide v3, p0, Ll9/s0;->b0:J

    iget-boolean v0, p0, Ll9/s0;->i0:Z

    const/4 v3, 0x1

    if-nez v0, :cond_1

    invoke-interface {p1}, Lt9/e0;->f()J

    move-result-wide v4

    cmp-long v0, v4, v1

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Ll9/s0;->c0:Z

    if-eqz v0, :cond_2

    const/4 v3, 0x7

    :cond_2
    iput v3, p0, Ll9/s0;->d0:I

    iget-boolean v1, p0, Ll9/s0;->W:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll9/s0;->G:Ll9/v0;

    iget-wide v2, p0, Ll9/s0;->b0:J

    invoke-virtual {v1, v2, v3, p1, v0}, Ll9/v0;->t(JLt9/e0;Z)V

    return-void

    :cond_3
    invoke-virtual {p0}, Ll9/s0;->z()V

    return-void
.end method

.method public final E()V
    .locals 10

    new-instance v0, Ll9/p0;

    iget-object v4, p0, Ll9/s0;->M:Lgm/r;

    iget-object v6, p0, Ll9/s0;->N:Lb9/m1;

    iget-object v2, p0, Ll9/s0;->w:Landroid/net/Uri;

    iget-object v3, p0, Ll9/s0;->x:Lz8/f;

    move-object v5, p0

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Ll9/p0;-><init>(Ll9/s0;Landroid/net/Uri;Lz8/f;Lgm/r;Ll9/s0;Lb9/m1;)V

    iget-boolean v2, v1, Ll9/s0;->W:Z

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Ll9/s0;->y()Z

    move-result v2

    invoke-static {v2}, Lva3/g;->i(Z)V

    iget-wide v2, v1, Ll9/s0;->b0:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    const/4 v7, 0x1

    if-eqz v6, :cond_0

    iget-wide v8, v1, Ll9/s0;->k0:J

    cmp-long v2, v8, v2

    if-lez v2, :cond_0

    iput-boolean v7, v1, Ll9/s0;->n0:Z

    iput-wide v4, v1, Ll9/s0;->k0:J

    return-void

    :cond_0
    iget-object v2, v1, Ll9/s0;->a0:Lt9/e0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v8, v1, Ll9/s0;->k0:J

    invoke-interface {v2, v8, v9}, Lt9/e0;->c(J)Lt9/d0;

    move-result-object v2

    iget-object v2, v2, Lt9/d0;->a:Lt9/f0;

    iget-wide v2, v2, Lt9/f0;->b:J

    iget-wide v8, v1, Ll9/s0;->k0:J

    iget-object v6, v0, Ll9/p0;->F:Lt9/s;

    iput-wide v2, v6, Lt9/s;->a:J

    iput-wide v8, v0, Ll9/p0;->I:J

    iput-boolean v7, v0, Ll9/p0;->H:Z

    const/4 v2, 0x0

    iput-boolean v2, v0, Ll9/p0;->L:Z

    iget-object v3, v1, Ll9/s0;->T:[Ll9/y0;

    array-length v6, v3

    :goto_0
    if-ge v2, v6, :cond_1

    aget-object v7, v3, v2

    iget-wide v8, v1, Ll9/s0;->k0:J

    iput-wide v8, v7, Ll9/y0;->t:J

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iput-wide v4, v1, Ll9/s0;->k0:J

    :cond_2
    invoke-virtual {p0}, Ll9/s0;->c()I

    move-result v2

    iput v2, v1, Ll9/s0;->m0:I

    iget-object v2, v1, Ll9/s0;->z:Ljc/b;

    iget v3, v1, Ll9/s0;->d0:I

    invoke-virtual {v2, v3}, Ljc/b;->q(I)I

    move-result v2

    iget-object v3, v1, Ll9/s0;->L:Lp9/k;

    invoke-virtual {v3, v0, p0, v2}, Lp9/k;->d(Lp9/i;Lp9/g;I)V

    return-void
.end method

.method public final F()Z
    .locals 1

    iget-boolean v0, p0, Ll9/s0;->f0:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll9/s0;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final a()Z
    .locals 2

    iget-object v0, p0, Ll9/s0;->L:Lp9/k;

    invoke-virtual {v0}, Lp9/k;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll9/s0;->N:Lb9/m1;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, v0, Lb9/m1;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b()V
    .locals 1

    iget-boolean v0, p0, Ll9/s0;->W:Z

    invoke-static {v0}, Lva3/g;->i(Z)V

    iget-object v0, p0, Ll9/s0;->Z:La00/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ll9/s0;->a0:Lt9/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final c()I
    .locals 6

    iget-object v0, p0, Ll9/s0;->T:[Ll9/y0;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    iget v5, v4, Ll9/y0;->q:I

    iget v4, v4, Ll9/y0;->p:I

    add-int/2addr v5, v4

    add-int/2addr v3, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method public final d()J
    .locals 2

    invoke-virtual {p0}, Ll9/s0;->m()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e(J)J
    .locals 9

    invoke-virtual {p0}, Ll9/s0;->b()V

    iget-object v0, p0, Ll9/s0;->Z:La00/g;

    iget-object v0, v0, La00/g;->y:Ljava/lang/Object;

    check-cast v0, [Z

    iget-object v1, p0, Ll9/s0;->a0:Lt9/e0;

    invoke-interface {v1}, Lt9/e0;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 p1, 0x0

    :goto_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Ll9/s0;->f0:Z

    iget-wide v2, p0, Ll9/s0;->j0:J

    cmp-long v2, v2, p1

    const/4 v3, 0x1

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    iput-wide p1, p0, Ll9/s0;->j0:J

    invoke-virtual {p0}, Ll9/s0;->y()Z

    move-result v4

    if-eqz v4, :cond_2

    iput-wide p1, p0, Ll9/s0;->k0:J

    return-wide p1

    :cond_2
    iget v4, p0, Ll9/s0;->d0:I

    const/4 v5, 0x7

    iget-object v6, p0, Ll9/s0;->L:Lp9/k;

    if-eq v4, v5, :cond_9

    iget-boolean v4, p0, Ll9/s0;->n0:Z

    if-nez v4, :cond_3

    invoke-virtual {v6}, Lp9/k;->a()Z

    move-result v4

    if-eqz v4, :cond_9

    :cond_3
    iget-object v4, p0, Ll9/s0;->T:[Ll9/y0;

    array-length v4, v4

    move v5, v1

    :goto_2
    if-ge v5, v4, :cond_8

    iget-object v7, p0, Ll9/s0;->T:[Ll9/y0;

    aget-object v7, v7, v5

    invoke-virtual {v7}, Ll9/y0;->l()I

    move-result v8

    if-nez v8, :cond_4

    if-eqz v2, :cond_4

    goto :goto_4

    :cond_4
    iget-boolean v8, p0, Ll9/s0;->Y:Z

    if-eqz v8, :cond_5

    iget v8, v7, Ll9/y0;->q:I

    invoke-virtual {v7, v8}, Ll9/y0;->t(I)Z

    move-result v7

    goto :goto_3

    :cond_5
    invoke-virtual {v7, p1, p2, v1}, Ll9/y0;->u(JZ)Z

    move-result v7

    :goto_3
    if-nez v7, :cond_7

    aget-boolean v7, v0, v5

    if-nez v7, :cond_6

    iget-boolean v7, p0, Ll9/s0;->X:Z

    if-nez v7, :cond_7

    :cond_6
    move v3, v1

    goto :goto_5

    :cond_7
    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_8
    :goto_5
    if-eqz v3, :cond_9

    goto :goto_8

    :cond_9
    iput-boolean v1, p0, Ll9/s0;->l0:Z

    iput-wide p1, p0, Ll9/s0;->k0:J

    iput-boolean v1, p0, Ll9/s0;->n0:Z

    iput-boolean v1, p0, Ll9/s0;->g0:Z

    invoke-virtual {v6}, Lp9/k;->a()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Ll9/s0;->T:[Ll9/y0;

    array-length v2, v0

    move v3, v1

    :goto_6
    if-ge v3, v2, :cond_a

    aget-object v4, v0, v3

    invoke-virtual {v4}, Ll9/y0;->g()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_a
    iget-object v0, v6, Lp9/k;->x:Lp9/h;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lp9/h;->a(Z)V

    return-wide p1

    :cond_b
    const/4 v0, 0x0

    iput-object v0, v6, Lp9/k;->y:Ljava/io/IOException;

    iget-object v0, p0, Ll9/s0;->T:[Ll9/y0;

    array-length v2, v0

    move v3, v1

    :goto_7
    if-ge v3, v2, :cond_c

    aget-object v4, v0, v3

    invoke-virtual {v4, v1}, Ll9/y0;->s(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_c
    :goto_8
    return-wide p1
.end method

.method public final f()J
    .locals 3

    iget-boolean v0, p0, Ll9/s0;->g0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Ll9/s0;->g0:Z

    iget-wide v0, p0, Ll9/s0;->j0:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Ll9/s0;->f0:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Ll9/s0;->n0:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll9/s0;->c()I

    move-result v0

    iget v2, p0, Ll9/s0;->m0:I

    if-le v0, v2, :cond_2

    :cond_1
    iput-boolean v1, p0, Ll9/s0;->f0:Z

    iget-wide v0, p0, Ll9/s0;->j0:J

    return-wide v0

    :cond_2
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final g()V
    .locals 7

    iget-object v0, p0, Ll9/s0;->T:[Ll9/y0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Ll9/y0;->s(Z)V

    iget-object v5, v4, Ll9/y0;->h:Le10/k0;

    if-eqz v5, :cond_0

    iget-object v6, v4, Ll9/y0;->e:Lg9/d;

    invoke-virtual {v5, v6}, Le10/k0;->K(Lg9/d;)V

    iput-object v3, v4, Ll9/y0;->h:Le10/k0;

    iput-object v3, v4, Ll9/y0;->g:Lu8/p;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ll9/s0;->M:Lgm/r;

    iget-object v1, v0, Lgm/r;->y:Ljava/lang/Object;

    check-cast v1, Lt9/n;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Lt9/n;->release()V

    iput-object v3, v0, Lgm/r;->y:Ljava/lang/Object;

    :cond_2
    iput-object v3, v0, Lgm/r;->z:Ljava/lang/Object;

    return-void
.end method

.method public final h()V
    .locals 3

    iget-object v0, p0, Ll9/s0;->z:Ljc/b;

    iget v1, p0, Ll9/s0;->d0:I

    invoke-virtual {v0, v1}, Ljc/b;->q(I)I

    move-result v0

    iget-object v1, p0, Ll9/s0;->L:Lp9/k;

    iget-object v2, v1, Lp9/k;->y:Ljava/io/IOException;

    if-nez v2, :cond_5

    iget-object v1, v1, Lp9/k;->x:Lp9/h;

    if-eqz v1, :cond_2

    const/high16 v2, -0x80000000

    if-ne v0, v2, :cond_0

    iget v0, v1, Lp9/h;->w:I

    :cond_0
    iget-object v2, v1, Lp9/h;->E:Ljava/io/IOException;

    if-eqz v2, :cond_2

    iget v1, v1, Lp9/h;->F:I

    if-gt v1, v0, :cond_1

    goto :goto_0

    :cond_1
    throw v2

    :cond_2
    :goto_0
    iget-boolean v0, p0, Ll9/s0;->n0:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Ll9/s0;->W:Z

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "Loading finished before preparation is complete."

    const/4 v1, 0x0

    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_4
    :goto_1
    return-void

    :cond_5
    throw v2
.end method

.method public final i(J)V
    .locals 5

    iget-boolean v0, p0, Ll9/s0;->Y:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Ll9/s0;->b()V

    invoke-virtual {p0}, Ll9/s0;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ll9/s0;->Z:La00/g;

    iget-object v0, v0, La00/g;->z:Ljava/lang/Object;

    check-cast v0, [Z

    iget-object v1, p0, Ll9/s0;->T:[Ll9/y0;

    array-length v1, v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    iget-object v3, p0, Ll9/s0;->T:[Ll9/y0;

    aget-object v3, v3, v2

    aget-boolean v4, v0, v2

    invoke-virtual {v3, p1, p2, v4}, Ll9/y0;->f(JZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final j(Z)J
    .locals 6

    const-wide/high16 v0, -0x8000000000000000L

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Ll9/s0;->T:[Ll9/y0;

    array-length v3, v3

    if-ge v2, v3, :cond_2

    if-nez p1, :cond_0

    iget-object v3, p0, Ll9/s0;->Z:La00/g;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v3, La00/g;->z:Ljava/lang/Object;

    check-cast v3, [Z

    aget-boolean v3, v3, v2

    if-eqz v3, :cond_1

    :cond_0
    iget-object v3, p0, Ll9/s0;->T:[Ll9/y0;

    aget-object v3, v3, v2

    monitor-enter v3

    :try_start_0
    iget-wide v4, v3, Ll9/y0;->v:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_2
    return-wide v0
.end method

.method public final k()Ll9/g1;
    .locals 1

    invoke-virtual {p0}, Ll9/s0;->b()V

    iget-object v0, p0, Ll9/s0;->Z:La00/g;

    iget-object v0, v0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Ll9/g1;

    return-object v0
.end method

.method public final l()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll9/s0;->V:Z

    iget-object v0, p0, Ll9/s0;->Q:Landroid/os/Handler;

    iget-object v1, p0, Ll9/s0;->O:Ll9/n0;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final m()J
    .locals 12

    invoke-virtual {p0}, Ll9/s0;->b()V

    iget-boolean v0, p0, Ll9/s0;->n0:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-nez v0, :cond_7

    iget v0, p0, Ll9/s0;->h0:I

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Ll9/s0;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Ll9/s0;->k0:J

    return-wide v0

    :cond_1
    iget-boolean v0, p0, Ll9/s0;->X:Z

    const/4 v3, 0x0

    const-wide v4, 0x7fffffffffffffffL

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll9/s0;->T:[Ll9/y0;

    array-length v0, v0

    move v6, v3

    move-wide v7, v4

    :goto_0
    if-ge v6, v0, :cond_4

    iget-object v9, p0, Ll9/s0;->Z:La00/g;

    iget-object v10, v9, La00/g;->y:Ljava/lang/Object;

    check-cast v10, [Z

    aget-boolean v10, v10, v6

    if-eqz v10, :cond_2

    iget-object v9, v9, La00/g;->z:Ljava/lang/Object;

    check-cast v9, [Z

    aget-boolean v9, v9, v6

    if-eqz v9, :cond_2

    iget-object v9, p0, Ll9/s0;->T:[Ll9/y0;

    aget-object v9, v9, v6

    monitor-enter v9

    :try_start_0
    iget-boolean v10, v9, Ll9/y0;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v9

    if-nez v10, :cond_2

    iget-object v9, p0, Ll9/s0;->T:[Ll9/y0;

    aget-object v9, v9, v6

    monitor-enter v9

    :try_start_1
    iget-wide v10, v9, Ll9/y0;->v:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v9

    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    :cond_2
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    move-wide v7, v4

    :cond_4
    cmp-long v0, v7, v4

    if-nez v0, :cond_5

    invoke-virtual {p0, v3}, Ll9/s0;->j(Z)J

    move-result-wide v7

    :cond_5
    cmp-long v0, v7, v1

    if-nez v0, :cond_6

    iget-wide v0, p0, Ll9/s0;->j0:J

    return-wide v0

    :cond_6
    return-wide v7

    :cond_7
    :goto_2
    return-wide v1
.end method

.method public final n(J)V
    .locals 0

    return-void
.end method

.method public final o(II)Lt9/k0;
    .locals 1

    new-instance p2, Ll9/r0;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Ll9/r0;-><init>(IZ)V

    invoke-virtual {p0, p2}, Ll9/s0;->C(Ll9/r0;)Lt9/k0;

    move-result-object p1

    return-object p1
.end method

.method public final p(Lp9/i;JJ)V
    .locals 13

    check-cast p1, Ll9/p0;

    iget-wide v0, p0, Ll9/s0;->b0:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Ll9/s0;->a0:Lt9/e0;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1}, Ll9/s0;->j(Z)J

    move-result-wide v2

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    const-wide/16 v2, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v4, 0x2710

    add-long/2addr v2, v4

    :goto_0
    iput-wide v2, p0, Ll9/s0;->b0:J

    iget-object v0, p0, Ll9/s0;->a0:Lt9/e0;

    iget-boolean v4, p0, Ll9/s0;->c0:Z

    iget-object v5, p0, Ll9/s0;->G:Ll9/v0;

    invoke-virtual {v5, v2, v3, v0, v4}, Ll9/v0;->t(JLt9/e0;Z)V

    :cond_1
    iget-object v0, p1, Ll9/p0;->x:Lz8/m;

    new-instance v3, Ll9/t;

    iget-object v0, v0, Lz8/m;->y:Landroid/net/Uri;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iget-object v0, p0, Ll9/s0;->z:Ljc/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v9, p1, Ll9/p0;->I:J

    iget-wide v11, p0, Ll9/s0;->b0:J

    iget-object v2, p0, Ll9/s0;->E:Lg9/d;

    const/4 v4, 0x1

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v2 .. v12}, Lg9/d;->d(Ll9/t;IILu8/p;ILjava/lang/Object;JJ)V

    iput-boolean v1, p0, Ll9/s0;->n0:Z

    iget-object p1, p0, Ll9/s0;->R:Ll9/z;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p0}, Ll9/a1;->b(Ll9/b1;)V

    return-void
.end method

.method public final q(Lp9/i;JJZ)V
    .locals 12

    check-cast p1, Ll9/p0;

    iget-object v0, p1, Ll9/p0;->x:Lz8/m;

    new-instance v2, Ll9/t;

    iget-object v0, v0, Lz8/m;->y:Landroid/net/Uri;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v0, p0, Ll9/s0;->z:Ljc/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v8, p1, Ll9/p0;->I:J

    iget-wide v10, p0, Ll9/s0;->b0:J

    iget-object v1, p0, Ll9/s0;->E:Lg9/d;

    const/4 v3, 0x1

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v11}, Lg9/d;->c(Ll9/t;IILu8/p;ILjava/lang/Object;JJ)V

    if-nez p6, :cond_1

    iget-object p1, p0, Ll9/s0;->T:[Ll9/y0;

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v3, p1, v2

    invoke-virtual {v3, v1}, Ll9/y0;->s(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget p1, p0, Ll9/s0;->h0:I

    if-lez p1, :cond_1

    iget-object p1, p0, Ll9/s0;->R:Ll9/z;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p0}, Ll9/a1;->b(Ll9/b1;)V

    :cond_1
    return-void
.end method

.method public final r(Lp9/i;Ljava/io/IOException;I)Lbb/f;
    .locals 14

    move-object/from16 v11, p2

    check-cast p1, Ll9/p0;

    iget-object v0, p1, Ll9/p0;->x:Lz8/m;

    new-instance v1, Ll9/t;

    iget-object v0, v0, Lz8/m;->y:Landroid/net/Uri;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sget v0, Lx8/t;->a:I

    iget-object v0, p0, Ll9/s0;->z:Ljc/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, v11, Landroidx/media3/common/ParserException;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, 0x1

    if-nez v0, :cond_1

    instance-of v0, v11, Ljava/io/FileNotFoundException;

    if-nez v0, :cond_1

    instance-of v0, v11, Landroidx/media3/datasource/HttpDataSource$CleartextNotPermittedException;

    if-nez v0, :cond_1

    instance-of v0, v11, Landroidx/media3/exoplayer/upstream/Loader$UnexpectedLoaderException;

    if-nez v0, :cond_1

    invoke-static {v11}, Landroidx/media3/datasource/DataSourceException;->a(Ljava/io/IOException;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, p3, -0x1

    mul-int/lit16 v0, v0, 0x3e8

    const/16 v5, 0x1388

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-long v5, v0

    goto :goto_1

    :cond_1
    :goto_0
    move-wide v5, v2

    :goto_1
    cmp-long v0, v5, v2

    const/4 v7, 0x0

    if-nez v0, :cond_2

    sget-object v0, Lp9/k;->E:Lbb/f;

    :goto_2
    move-object v13, v0

    goto :goto_7

    :cond_2
    invoke-virtual {p0}, Ll9/s0;->c()I

    move-result v0

    iget v8, p0, Ll9/s0;->m0:I

    if-le v0, v8, :cond_3

    move v8, v4

    goto :goto_3

    :cond_3
    move v8, v7

    :goto_3
    iget-boolean v9, p0, Ll9/s0;->i0:Z

    if-nez v9, :cond_7

    iget-object v9, p0, Ll9/s0;->a0:Lt9/e0;

    if-eqz v9, :cond_4

    invoke-interface {v9}, Lt9/e0;->f()J

    move-result-wide v9

    cmp-long v2, v9, v2

    if-eqz v2, :cond_4

    goto :goto_5

    :cond_4
    iget-boolean v0, p0, Ll9/s0;->W:Z

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Ll9/s0;->F()Z

    move-result v0

    if-nez v0, :cond_5

    iput-boolean v4, p0, Ll9/s0;->l0:Z

    sget-object v0, Lp9/k;->z:Lbb/f;

    goto :goto_2

    :cond_5
    iget-boolean v0, p0, Ll9/s0;->W:Z

    iput-boolean v0, p0, Ll9/s0;->f0:Z

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Ll9/s0;->j0:J

    iput v7, p0, Ll9/s0;->m0:I

    iget-object v0, p0, Ll9/s0;->T:[Ll9/y0;

    array-length v9, v0

    move v10, v7

    :goto_4
    if-ge v10, v9, :cond_6

    aget-object v12, v0, v10

    invoke-virtual {v12, v7}, Ll9/y0;->s(Z)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_6
    iget-object v0, p1, Ll9/p0;->F:Lt9/s;

    iput-wide v2, v0, Lt9/s;->a:J

    iput-wide v2, p1, Ll9/p0;->I:J

    iput-boolean v4, p1, Ll9/p0;->H:Z

    iput-boolean v7, p1, Ll9/p0;->L:Z

    goto :goto_6

    :cond_7
    :goto_5
    iput v0, p0, Ll9/s0;->m0:I

    :goto_6
    new-instance v0, Lbb/f;

    invoke-direct {v0, v8, v5, v6, v7}, Lbb/f;-><init>(IJB)V

    goto :goto_2

    :goto_7
    iget v0, v13, Lbb/f;->a:I

    if-eqz v0, :cond_8

    if-ne v0, v4, :cond_9

    :cond_8
    move v7, v4

    :cond_9
    xor-int/lit8 v12, v7, 0x1

    iget-wide v7, p1, Ll9/p0;->I:J

    iget-wide v9, p0, Ll9/s0;->b0:J

    iget-object v0, p0, Ll9/s0;->E:Lg9/d;

    const/4 v2, 0x1

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v12}, Lg9/d;->e(Ll9/t;IILu8/p;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    return-object v13
.end method

.method public final s(JLb9/k1;)J
    .locals 9

    invoke-virtual {p0}, Ll9/s0;->b()V

    iget-object v0, p0, Ll9/s0;->a0:Lt9/e0;

    invoke-interface {v0}, Lt9/e0;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_0
    iget-object v0, p0, Ll9/s0;->a0:Lt9/e0;

    invoke-interface {v0, p1, p2}, Lt9/e0;->c(J)Lt9/d0;

    move-result-object v0

    iget-object v1, v0, Lt9/d0;->a:Lt9/f0;

    iget-wide v5, v1, Lt9/f0;->a:J

    iget-object v0, v0, Lt9/d0;->b:Lt9/f0;

    iget-wide v7, v0, Lt9/f0;->a:J

    move-wide v3, p1

    move-object v2, p3

    invoke-virtual/range {v2 .. v8}, Lb9/k1;->a(JJJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final t(Ll9/z;J)V
    .locals 5

    iput-object p1, p0, Ll9/s0;->R:Ll9/z;

    iget-object p1, p0, Ll9/s0;->J:Lu8/p;

    if-eqz p1, :cond_0

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ll9/s0;->o(II)Lt9/k0;

    move-result-object v0

    invoke-interface {v0, p1}, Lt9/k0;->a(Lu8/p;)V

    new-instance p1, Lt9/a0;

    const/4 v0, 0x1

    new-array v2, v0, [J

    const-wide/16 v3, 0x0

    aput-wide v3, v2, v1

    new-array v0, v0, [J

    aput-wide v3, v0, v1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {p1, v3, v4, v2, v0}, Lt9/a0;-><init>(J[J[J)V

    invoke-virtual {p0, p1}, Ll9/s0;->D(Lt9/e0;)V

    invoke-virtual {p0}, Ll9/s0;->l()V

    iput-wide p2, p0, Ll9/s0;->k0:J

    return-void

    :cond_0
    iget-object p1, p0, Ll9/s0;->N:Lb9/m1;

    invoke-virtual {p1}, Lb9/m1;->c()Z

    invoke-virtual {p0}, Ll9/s0;->E()V

    return-void
.end method

.method public final u([Lo9/s;[Z[Ll9/z0;[ZJ)J
    .locals 8

    invoke-virtual {p0}, Ll9/s0;->b()V

    iget-object v0, p0, Ll9/s0;->Z:La00/g;

    iget-object v1, v0, La00/g;->x:Ljava/lang/Object;

    check-cast v1, Ll9/g1;

    iget-object v0, v0, La00/g;->z:Ljava/lang/Object;

    check-cast v0, [Z

    iget v2, p0, Ll9/s0;->h0:I

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    array-length v5, p1

    const/4 v6, 0x1

    if-ge v4, v5, :cond_2

    aget-object v5, p3, v4

    if-eqz v5, :cond_1

    aget-object v7, p1, v4

    if-eqz v7, :cond_0

    aget-boolean v7, p2, v4

    if-nez v7, :cond_1

    :cond_0
    check-cast v5, Ll9/q0;

    iget v5, v5, Ll9/q0;->w:I

    aget-boolean v7, v0, v5

    invoke-static {v7}, Lva3/g;->i(Z)V

    iget v7, p0, Ll9/s0;->h0:I

    sub-int/2addr v7, v6

    iput v7, p0, Ll9/s0;->h0:I

    aput-boolean v3, v0, v5

    const/4 v5, 0x0

    aput-object v5, p3, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iget-boolean p2, p0, Ll9/s0;->e0:Z

    if-eqz p2, :cond_4

    if-nez v2, :cond_3

    :goto_1
    move p2, v6

    goto :goto_2

    :cond_3
    move p2, v3

    goto :goto_2

    :cond_4
    const-wide/16 v4, 0x0

    cmp-long p2, p5, v4

    if-eqz p2, :cond_3

    iget-boolean p2, p0, Ll9/s0;->Y:Z

    if-nez p2, :cond_3

    goto :goto_1

    :goto_2
    move v2, v3

    :goto_3
    array-length v4, p1

    if-ge v2, v4, :cond_a

    aget-object v4, p3, v2

    if-nez v4, :cond_9

    aget-object v4, p1, v2

    if-eqz v4, :cond_9

    invoke-interface {v4}, Lo9/s;->length()I

    move-result v5

    if-ne v5, v6, :cond_5

    move v5, v6

    goto :goto_4

    :cond_5
    move v5, v3

    :goto_4
    invoke-static {v5}, Lva3/g;->i(Z)V

    invoke-interface {v4, v3}, Lo9/s;->e(I)I

    move-result v5

    if-nez v5, :cond_6

    move v5, v6

    goto :goto_5

    :cond_6
    move v5, v3

    :goto_5
    invoke-static {v5}, Lva3/g;->i(Z)V

    invoke-interface {v4}, Lo9/s;->j()Lu8/p0;

    move-result-object v5

    iget-object v7, v1, Ll9/g1;->b:Lzr/w0;

    invoke-virtual {v7, v5}, Lzr/g0;->indexOf(Ljava/lang/Object;)I

    move-result v5

    if-ltz v5, :cond_7

    goto :goto_6

    :cond_7
    const/4 v5, -0x1

    :goto_6
    aget-boolean v7, v0, v5

    xor-int/2addr v7, v6

    invoke-static {v7}, Lva3/g;->i(Z)V

    iget v7, p0, Ll9/s0;->h0:I

    add-int/2addr v7, v6

    iput v7, p0, Ll9/s0;->h0:I

    aput-boolean v6, v0, v5

    iget-boolean v7, p0, Ll9/s0;->g0:Z

    invoke-interface {v4}, Lo9/s;->n()Lu8/p;

    move-result-object v4

    iget-boolean v4, v4, Lu8/p;->t:Z

    or-int/2addr v4, v7

    iput-boolean v4, p0, Ll9/s0;->g0:Z

    new-instance v4, Ll9/q0;

    invoke-direct {v4, p0, v5}, Ll9/q0;-><init>(Ll9/s0;I)V

    aput-object v4, p3, v2

    aput-boolean v6, p4, v2

    if-nez p2, :cond_9

    iget-object p2, p0, Ll9/s0;->T:[Ll9/y0;

    aget-object p2, p2, v5

    invoke-virtual {p2}, Ll9/y0;->l()I

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {p2, p5, p6, v6}, Ll9/y0;->u(JZ)Z

    move-result p2

    if-nez p2, :cond_8

    move p2, v6

    goto :goto_7

    :cond_8
    move p2, v3

    :cond_9
    :goto_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_a
    iget p1, p0, Ll9/s0;->h0:I

    if-nez p1, :cond_d

    iput-boolean v3, p0, Ll9/s0;->l0:Z

    iput-boolean v3, p0, Ll9/s0;->f0:Z

    iput-boolean v3, p0, Ll9/s0;->g0:Z

    iget-object p1, p0, Ll9/s0;->L:Lp9/k;

    invoke-virtual {p1}, Lp9/k;->a()Z

    move-result p2

    if-eqz p2, :cond_c

    iget-object p2, p0, Ll9/s0;->T:[Ll9/y0;

    array-length p3, p2

    move p4, v3

    :goto_8
    if-ge p4, p3, :cond_b

    aget-object v0, p2, p4

    invoke-virtual {v0}, Ll9/y0;->g()V

    add-int/lit8 p4, p4, 0x1

    goto :goto_8

    :cond_b
    iget-object p1, p1, Lp9/k;->x:Lp9/h;

    invoke-static {p1}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {p1, v3}, Lp9/h;->a(Z)V

    goto :goto_b

    :cond_c
    iput-boolean v3, p0, Ll9/s0;->n0:Z

    iget-object p1, p0, Ll9/s0;->T:[Ll9/y0;

    array-length p2, p1

    move p3, v3

    :goto_9
    if-ge p3, p2, :cond_f

    aget-object p4, p1, p3

    invoke-virtual {p4, v3}, Ll9/y0;->s(Z)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_9

    :cond_d
    if-eqz p2, :cond_f

    invoke-virtual {p0, p5, p6}, Ll9/s0;->e(J)J

    move-result-wide p5

    :goto_a
    array-length p1, p3

    if-ge v3, p1, :cond_f

    aget-object p1, p3, v3

    if-eqz p1, :cond_e

    aput-boolean v6, p4, v3

    :cond_e
    add-int/lit8 v3, v3, 0x1

    goto :goto_a

    :cond_f
    :goto_b
    iput-boolean v6, p0, Ll9/s0;->e0:Z

    return-wide p5
.end method

.method public final v(Lt9/e0;)V
    .locals 2

    new-instance v0, Lio/sentry/android/core/r0;

    const/16 v1, 0xc

    invoke-direct {v0, v1, p0, p1}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Ll9/s0;->Q:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final w(Lp9/i;JI)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ll9/p0;

    iget-object v2, v1, Ll9/p0;->x:Lz8/m;

    if-nez p4, :cond_0

    new-instance v2, Ll9/t;

    iget-object v3, v1, Ll9/p0;->J:Lz8/g;

    invoke-direct {v2, v3}, Ll9/t;-><init>(Lz8/g;)V

    move-object v5, v2

    goto :goto_0

    :cond_0
    new-instance v3, Ll9/t;

    iget-object v2, v2, Lz8/m;->y:Landroid/net/Uri;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    move-object v5, v3

    :goto_0
    iget-wide v11, v1, Ll9/p0;->I:J

    iget-wide v13, v0, Ll9/s0;->b0:J

    iget-object v4, v0, Ll9/s0;->E:Lg9/d;

    const/4 v6, 0x1

    const/4 v7, -0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v15, p4

    invoke-virtual/range {v4 .. v15}, Lg9/d;->f(Ll9/t;IILu8/p;ILjava/lang/Object;JJI)V

    return-void
.end method

.method public final x(Lb9/o0;)Z
    .locals 1

    iget-boolean p1, p0, Ll9/s0;->n0:Z

    if-nez p1, :cond_4

    iget-object p1, p0, Ll9/s0;->L:Lp9/k;

    iget-object v0, p1, Lp9/k;->y:Ljava/io/IOException;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Ll9/s0;->l0:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ll9/s0;->W:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll9/s0;->J:Lu8/p;

    if-eqz v0, :cond_2

    :cond_1
    iget v0, p0, Ll9/s0;->h0:I

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Ll9/s0;->N:Lb9/m1;

    invoke-virtual {v0}, Lb9/m1;->c()Z

    move-result v0

    invoke-virtual {p1}, Lp9/k;->a()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0}, Ll9/s0;->E()V

    const/4 p1, 0x1

    return p1

    :cond_3
    return v0

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final y()Z
    .locals 4

    iget-wide v0, p0, Ll9/s0;->k0:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final z()V
    .locals 17

    move-object/from16 v1, p0

    iget-wide v2, v1, Ll9/s0;->K:J

    iget-boolean v0, v1, Ll9/s0;->o0:Z

    if-nez v0, :cond_e

    iget-boolean v0, v1, Ll9/s0;->W:Z

    if-nez v0, :cond_e

    iget-boolean v0, v1, Ll9/s0;->V:Z

    if-eqz v0, :cond_e

    iget-object v0, v1, Ll9/s0;->a0:Lt9/e0;

    if-nez v0, :cond_0

    goto/16 :goto_8

    :cond_0
    iget-object v0, v1, Ll9/s0;->T:[Ll9/y0;

    array-length v4, v0

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    const/4 v7, 0x0

    if-ge v6, v4, :cond_3

    aget-object v8, v0, v6

    monitor-enter v8

    :try_start_0
    iget-boolean v9, v8, Ll9/y0;->y:Z

    if-eqz v9, :cond_1

    goto :goto_1

    :cond_1
    iget-object v7, v8, Ll9/y0;->B:Lu8/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit v8

    if-nez v7, :cond_2

    goto/16 :goto_8

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_3
    iget-object v4, v1, Ll9/s0;->N:Lb9/m1;

    monitor-enter v4

    :try_start_2
    iput-boolean v5, v4, Lb9/m1;->x:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    monitor-exit v4

    iget-object v0, v1, Ll9/s0;->T:[Ll9/y0;

    array-length v0, v0

    new-array v4, v0, [Lu8/p0;

    new-array v6, v0, [Z

    move v8, v5

    :goto_2
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v11, 0x1

    if-ge v8, v0, :cond_c

    iget-object v12, v1, Ll9/s0;->T:[Ll9/y0;

    aget-object v12, v12, v8

    monitor-enter v12

    :try_start_3
    iget-boolean v13, v12, Ll9/y0;->y:Z

    if-eqz v13, :cond_4

    move-object v13, v7

    goto :goto_3

    :cond_4
    iget-object v13, v12, Ll9/y0;->B:Lu8/p;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_3
    monitor-exit v12

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v12, v13, Lu8/p;->n:Ljava/lang/String;

    invoke-static {v12}, Lu8/d0;->k(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_6

    invoke-static {v12}, Lu8/d0;->n(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_5

    goto :goto_4

    :cond_5
    move v15, v5

    goto :goto_5

    :cond_6
    :goto_4
    move v15, v11

    :goto_5
    aput-boolean v15, v6, v8

    move/from16 v16, v5

    iget-boolean v5, v1, Ll9/s0;->X:Z

    or-int/2addr v5, v15

    iput-boolean v5, v1, Ll9/s0;->X:Z

    invoke-static {v12}, Lu8/d0;->l(Ljava/lang/String;)Z

    move-result v5

    cmp-long v9, v2, v9

    if-eqz v9, :cond_7

    if-ne v0, v11, :cond_7

    if-eqz v5, :cond_7

    move v5, v11

    goto :goto_6

    :cond_7
    move/from16 v5, v16

    :goto_6
    iput-boolean v5, v1, Ll9/s0;->Y:Z

    iget-object v5, v1, Ll9/s0;->S:Lga/b;

    if-eqz v5, :cond_b

    iget v9, v5, Lga/b;->a:I

    if-nez v14, :cond_8

    iget-object v10, v1, Ll9/s0;->U:[Ll9/r0;

    aget-object v10, v10, v8

    iget-boolean v10, v10, Ll9/r0;->b:Z

    if-eqz v10, :cond_a

    :cond_8
    iget-object v10, v13, Lu8/p;->l:Lu8/c0;

    if-nez v10, :cond_9

    new-instance v10, Lu8/c0;

    new-array v11, v11, [Lu8/b0;

    aput-object v5, v11, v16

    invoke-direct {v10, v11}, Lu8/c0;-><init>([Lu8/b0;)V

    goto :goto_7

    :cond_9
    new-array v11, v11, [Lu8/b0;

    aput-object v5, v11, v16

    invoke-virtual {v10, v11}, Lu8/c0;->a([Lu8/b0;)Lu8/c0;

    move-result-object v10

    :goto_7
    invoke-virtual {v13}, Lu8/p;->a()Lu8/o;

    move-result-object v5

    iput-object v10, v5, Lu8/o;->k:Lu8/c0;

    new-instance v13, Lu8/p;

    invoke-direct {v13, v5}, Lu8/p;-><init>(Lu8/o;)V

    :cond_a
    if-eqz v14, :cond_b

    iget v5, v13, Lu8/p;->h:I

    const/4 v10, -0x1

    if-ne v5, v10, :cond_b

    iget v5, v13, Lu8/p;->i:I

    if-ne v5, v10, :cond_b

    if-eq v9, v10, :cond_b

    invoke-virtual {v13}, Lu8/p;->a()Lu8/o;

    move-result-object v5

    iput v9, v5, Lu8/o;->h:I

    new-instance v13, Lu8/p;

    invoke-direct {v13, v5}, Lu8/p;-><init>(Lu8/o;)V

    :cond_b
    iget-object v5, v1, Ll9/s0;->y:Lg9/h;

    invoke-interface {v5, v13}, Lg9/h;->a(Lu8/p;)I

    move-result v5

    invoke-virtual {v13}, Lu8/p;->a()Lu8/o;

    move-result-object v9

    iput v5, v9, Lu8/o;->L:I

    new-instance v5, Lu8/p;

    invoke-direct {v5, v9}, Lu8/p;-><init>(Lu8/o;)V

    new-instance v9, Lu8/p0;

    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v10

    filled-new-array {v5}, [Lu8/p;

    move-result-object v11

    invoke-direct {v9, v10, v11}, Lu8/p0;-><init>(Ljava/lang/String;[Lu8/p;)V

    aput-object v9, v4, v8

    iget-boolean v9, v1, Ll9/s0;->g0:Z

    iget-boolean v5, v5, Lu8/p;->t:Z

    or-int/2addr v5, v9

    iput-boolean v5, v1, Ll9/s0;->g0:Z

    add-int/lit8 v8, v8, 0x1

    move/from16 v5, v16

    goto/16 :goto_2

    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :cond_c
    new-instance v0, La00/g;

    new-instance v5, Ll9/g1;

    invoke-direct {v5, v4}, Ll9/g1;-><init>([Lu8/p0;)V

    invoke-direct {v0, v5, v6}, La00/g;-><init>(Ll9/g1;[Z)V

    iput-object v0, v1, Ll9/s0;->Z:La00/g;

    iget-boolean v0, v1, Ll9/s0;->Y:Z

    if-eqz v0, :cond_d

    iget-wide v4, v1, Ll9/s0;->b0:J

    cmp-long v0, v4, v9

    if-nez v0, :cond_d

    iput-wide v2, v1, Ll9/s0;->b0:J

    new-instance v0, Ll9/o0;

    iget-object v2, v1, Ll9/s0;->a0:Lt9/e0;

    invoke-direct {v0, v1, v2}, Ll9/o0;-><init>(Ll9/s0;Lt9/e0;)V

    iput-object v0, v1, Ll9/s0;->a0:Lt9/e0;

    :cond_d
    iget-object v0, v1, Ll9/s0;->G:Ll9/v0;

    iget-wide v2, v1, Ll9/s0;->b0:J

    iget-object v4, v1, Ll9/s0;->a0:Lt9/e0;

    iget-boolean v5, v1, Ll9/s0;->c0:Z

    invoke-virtual {v0, v2, v3, v4, v5}, Ll9/v0;->t(JLt9/e0;Z)V

    iput-boolean v11, v1, Ll9/s0;->W:Z

    iget-object v0, v1, Ll9/s0;->R:Ll9/z;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, v1}, Ll9/z;->c(Ll9/a0;)V

    return-void

    :catchall_2
    move-exception v0

    :try_start_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v0

    :cond_e
    :goto_8
    return-void
.end method
