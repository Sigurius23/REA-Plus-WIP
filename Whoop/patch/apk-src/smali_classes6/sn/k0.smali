.class public final Lsn/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/s;
.implements Lwm/k;
.implements Lko/y;
.implements Lko/b0;
.implements Lsn/p0;


# static fields
.field public static final l0:Ljava/util/Map;

.field public static final m0:Lrm/c0;


# instance fields
.field public final E:Lsn/z;

.field public final F:Lsn/z;

.field public final G:Lsn/n0;

.field public final H:Lko/o;

.field public final I:J

.field public final J:Lko/c0;

.field public final K:Lq30/w0;

.field public final L:Lb9/m1;

.field public final M:Lsn/g0;

.field public final N:Lsn/g0;

.field public final O:Landroid/os/Handler;

.field public P:Lsn/r;

.field public Q:Lmn/c;

.field public R:[Lsn/q0;

.field public S:[Lsn/j0;

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:Lq/f;

.field public X:Lwm/p;

.field public Y:J

.field public Z:Z

.field public a0:I

.field public b0:Z

.field public c0:Z

.field public d0:I

.field public e0:J

.field public f0:J

.field public g0:J

.field public h0:Z

.field public i0:I

.field public j0:Z

.field public k0:Z

.field public final w:Landroid/net/Uri;

.field public final x:Lko/l;

.field public final y:Lvm/h;

.field public final z:Lg73/d;


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

    sput-object v0, Lsn/k0;->l0:Ljava/util/Map;

    new-instance v0, Lrm/b0;

    invoke-direct {v0}, Lrm/b0;-><init>()V

    const-string v1, "icy"

    iput-object v1, v0, Lrm/b0;->a:Ljava/lang/String;

    const-string v1, "application/x-icy"

    iput-object v1, v0, Lrm/b0;->k:Ljava/lang/String;

    new-instance v1, Lrm/c0;

    invoke-direct {v1, v0}, Lrm/c0;-><init>(Lrm/b0;)V

    sput-object v1, Lsn/k0;->m0:Lrm/c0;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lko/l;Lq30/w0;Lvm/h;Lsn/z;Lg73/d;Lsn/z;Lsn/n0;Lko/o;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/k0;->w:Landroid/net/Uri;

    iput-object p2, p0, Lsn/k0;->x:Lko/l;

    iput-object p4, p0, Lsn/k0;->y:Lvm/h;

    iput-object p5, p0, Lsn/k0;->F:Lsn/z;

    iput-object p6, p0, Lsn/k0;->z:Lg73/d;

    iput-object p7, p0, Lsn/k0;->E:Lsn/z;

    iput-object p8, p0, Lsn/k0;->G:Lsn/n0;

    iput-object p9, p0, Lsn/k0;->H:Lko/o;

    int-to-long p1, p10

    iput-wide p1, p0, Lsn/k0;->I:J

    new-instance p1, Lko/c0;

    const-string p2, "ProgressiveMediaPeriod"

    invoke-direct {p1, p2}, Lko/c0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lsn/k0;->J:Lko/c0;

    iput-object p3, p0, Lsn/k0;->K:Lq30/w0;

    new-instance p1, Lb9/m1;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, Lb9/m1;-><init>(I)V

    iput-object p1, p0, Lsn/k0;->L:Lb9/m1;

    new-instance p1, Lsn/g0;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lsn/g0;-><init>(Lsn/k0;I)V

    iput-object p1, p0, Lsn/k0;->M:Lsn/g0;

    new-instance p1, Lsn/g0;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lsn/g0;-><init>(Lsn/k0;I)V

    iput-object p1, p0, Lsn/k0;->N:Lsn/g0;

    const/4 p1, 0x0

    invoke-static {p1}, Llo/y;->k(Lmo/h;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lsn/k0;->O:Landroid/os/Handler;

    const/4 p1, 0x0

    new-array p2, p1, [Lsn/j0;

    iput-object p2, p0, Lsn/k0;->S:[Lsn/j0;

    new-array p1, p1, [Lsn/q0;

    iput-object p1, p0, Lsn/k0;->R:[Lsn/q0;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lsn/k0;->g0:J

    const-wide/16 p3, -0x1

    iput-wide p3, p0, Lsn/k0;->e0:J

    iput-wide p1, p0, Lsn/k0;->Y:J

    const/4 p1, 0x1

    iput p1, p0, Lsn/k0;->a0:I

    return-void
.end method


# virtual methods
.method public final A(I)V
    .locals 13

    invoke-virtual {p0}, Lsn/k0;->s()V

    iget-object v0, p0, Lsn/k0;->W:Lq/f;

    iget-object v1, v0, Lq/f;->E:Ljava/lang/Object;

    check-cast v1, [Z

    aget-boolean v2, v1, p1

    if-nez v2, :cond_0

    iget-object v0, v0, Lq/f;->x:Ljava/lang/Object;

    check-cast v0, Lsn/x0;

    invoke-virtual {v0, p1}, Lsn/x0;->a(I)Lsn/w0;

    move-result-object v0

    const/4 v2, 0x0

    iget-object v0, v0, Lsn/w0;->y:[Lrm/c0;

    aget-object v6, v0, v2

    iget-object v0, v6, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v0}, Llo/m;->g(Ljava/lang/String;)I

    move-result v5

    iget-wide v2, p0, Lsn/k0;->f0:J

    move-wide v7, v2

    new-instance v3, Ll9/y;

    iget-object v0, p0, Lsn/k0;->E:Lsn/z;

    invoke-virtual {v0, v7, v8}, Lsn/z;->a(J)J

    move-result-wide v9

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v12}, Ll9/y;-><init>(IILjava/lang/Object;ILjava/lang/Object;JJ)V

    invoke-virtual {v0, v3}, Lsn/z;->b(Ll9/y;)V

    const/4 v0, 0x1

    aput-boolean v0, v1, p1

    :cond_0
    return-void
.end method

.method public final B(I)V
    .locals 4

    invoke-virtual {p0}, Lsn/k0;->s()V

    iget-object v0, p0, Lsn/k0;->W:Lq/f;

    iget-object v0, v0, Lq/f;->y:Ljava/lang/Object;

    check-cast v0, [Z

    iget-boolean v1, p0, Lsn/k0;->h0:Z

    if-eqz v1, :cond_2

    aget-boolean v0, v0, p1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lsn/k0;->R:[Lsn/q0;

    aget-object p1, v0, p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lsn/q0;->p(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lsn/k0;->g0:J

    iput-boolean v0, p0, Lsn/k0;->h0:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lsn/k0;->c0:Z

    iput-wide v1, p0, Lsn/k0;->f0:J

    iput v0, p0, Lsn/k0;->i0:I

    iget-object p1, p0, Lsn/k0;->R:[Lsn/q0;

    array-length v1, p1

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    invoke-virtual {v3, v0}, Lsn/q0;->u(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lsn/k0;->P:Lsn/r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p0}, Lsn/s0;->c(Lsn/t0;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final C(Lsn/j0;)Lsn/q0;
    .locals 5

    iget-object v0, p0, Lsn/k0;->R:[Lsn/q0;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lsn/k0;->S:[Lsn/j0;

    aget-object v2, v2, v1

    invoke-virtual {p1, v2}, Lsn/j0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Lsn/k0;->R:[Lsn/q0;

    aget-object p1, p1, v1

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Lsn/q0;

    iget-object v2, p0, Lsn/k0;->y:Lvm/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lsn/k0;->H:Lko/o;

    iget-object v4, p0, Lsn/k0;->F:Lsn/z;

    invoke-direct {v1, v3, v2, v4}, Lsn/q0;-><init>(Lko/o;Lvm/h;Lsn/z;)V

    iput-object p0, v1, Lsn/q0;->f:Ljava/lang/Object;

    iget-object v2, p0, Lsn/k0;->S:[Lsn/j0;

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lsn/j0;

    aput-object p1, v2, v0

    sget p1, Llo/y;->a:I

    iput-object v2, p0, Lsn/k0;->S:[Lsn/j0;

    iget-object p1, p0, Lsn/k0;->R:[Lsn/q0;

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lsn/q0;

    aput-object v1, p1, v0

    iput-object p1, p0, Lsn/k0;->R:[Lsn/q0;

    return-object v1
.end method

.method public final D()V
    .locals 14

    new-instance v0, Lsn/h0;

    iget-object v4, p0, Lsn/k0;->K:Lq30/w0;

    iget-object v6, p0, Lsn/k0;->L:Lb9/m1;

    iget-object v2, p0, Lsn/k0;->w:Landroid/net/Uri;

    iget-object v3, p0, Lsn/k0;->x:Lko/l;

    move-object v5, p0

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lsn/h0;-><init>(Lsn/k0;Landroid/net/Uri;Lko/l;Lq30/w0;Lsn/k0;Lb9/m1;)V

    iget-boolean v2, v1, Lsn/k0;->U:Z

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lsn/k0;->y()Z

    move-result v2

    invoke-static {v2}, Llo/a;->i(Z)V

    iget-wide v2, v1, Lsn/k0;->Y:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    const/4 v7, 0x1

    if-eqz v6, :cond_0

    iget-wide v8, v1, Lsn/k0;->g0:J

    cmp-long v2, v8, v2

    if-lez v2, :cond_0

    iput-boolean v7, v1, Lsn/k0;->j0:Z

    iput-wide v4, v1, Lsn/k0;->g0:J

    return-void

    :cond_0
    iget-object v2, v1, Lsn/k0;->X:Lwm/p;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v8, v1, Lsn/k0;->g0:J

    invoke-interface {v2, v8, v9}, Lwm/p;->c(J)Lwm/o;

    move-result-object v2

    iget-object v2, v2, Lwm/o;->a:Lwm/q;

    iget-wide v2, v2, Lwm/q;->b:J

    iget-wide v8, v1, Lsn/k0;->g0:J

    iget-object v6, v0, Lsn/h0;->f:Lt9/s;

    iput-wide v2, v6, Lt9/s;->a:J

    iput-wide v8, v0, Lsn/h0;->i:J

    iput-boolean v7, v0, Lsn/h0;->h:Z

    const/4 v2, 0x0

    iput-boolean v2, v0, Lsn/h0;->m:Z

    iget-object v3, v1, Lsn/k0;->R:[Lsn/q0;

    array-length v6, v3

    :goto_0
    if-ge v2, v6, :cond_1

    aget-object v7, v3, v2

    iget-wide v8, v1, Lsn/k0;->g0:J

    iput-wide v8, v7, Lsn/q0;->t:J

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iput-wide v4, v1, Lsn/k0;->g0:J

    :cond_2
    invoke-virtual {p0}, Lsn/k0;->t()I

    move-result v2

    iput v2, v1, Lsn/k0;->i0:I

    iget-object v2, v1, Lsn/k0;->z:Lg73/d;

    iget v3, v1, Lsn/k0;->a0:I

    invoke-virtual {v2, v3}, Lg73/d;->h(I)I

    move-result v2

    iget-object v3, v1, Lsn/k0;->J:Lko/c0;

    invoke-virtual {v3, v0, p0, v2}, Lko/c0;->d(Lko/a0;Lko/y;I)J

    iget-object v2, v0, Lsn/h0;->j:Lko/n;

    new-instance v4, Lsn/m;

    invoke-direct {v4, v2}, Lsn/m;-><init>(Lko/n;)V

    iget-wide v10, v0, Lsn/h0;->i:J

    iget-wide v12, v1, Lsn/k0;->Y:J

    iget-object v3, v1, Lsn/k0;->E:Lsn/z;

    const/4 v5, 0x1

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v3 .. v13}, Lsn/z;->i(Lsn/m;IILrm/c0;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public final E()Z
    .locals 1

    iget-boolean v0, p0, Lsn/k0;->c0:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lsn/k0;->y()Z

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

    iget-object v0, p0, Lsn/k0;->J:Lko/c0;

    invoke-virtual {v0}, Lko/c0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsn/k0;->L:Lb9/m1;

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

.method public final b(Lsn/r;J)V
    .locals 0

    iput-object p1, p0, Lsn/k0;->P:Lsn/r;

    iget-object p1, p0, Lsn/k0;->L:Lb9/m1;

    invoke-virtual {p1}, Lb9/m1;->c()Z

    invoke-virtual {p0}, Lsn/k0;->D()V

    return-void
.end method

.method public final c(Lko/a0;)V
    .locals 12

    check-cast p1, Lsn/h0;

    iget-wide v0, p0, Lsn/k0;->Y:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget-object v0, p0, Lsn/k0;->X:Lwm/p;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lwm/p;->e()Z

    move-result v0

    invoke-virtual {p0}, Lsn/k0;->w()J

    move-result-wide v1

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    const-wide/16 v1, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v3, 0x2710

    add-long/2addr v1, v3

    :goto_0
    iput-wide v1, p0, Lsn/k0;->Y:J

    iget-object v3, p0, Lsn/k0;->G:Lsn/n0;

    iget-boolean v4, p0, Lsn/k0;->Z:Z

    invoke-virtual {v3, v1, v2, v0, v4}, Lsn/n0;->q(JZZ)V

    :cond_1
    iget-object v0, p1, Lsn/h0;->b:Lko/i0;

    new-instance v2, Lsn/m;

    iget-object v0, v0, Lko/i0;->y:Landroid/net/Uri;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v0, p0, Lsn/k0;->z:Lg73/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v8, p1, Lsn/h0;->i:J

    iget-wide v10, p0, Lsn/k0;->Y:J

    iget-object v1, p0, Lsn/k0;->E:Lsn/z;

    const/4 v3, 0x1

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v11}, Lsn/z;->e(Lsn/m;IILrm/c0;ILjava/lang/Object;JJ)V

    iget-wide v0, p0, Lsn/k0;->e0:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-wide v0, p1, Lsn/h0;->k:J

    iput-wide v0, p0, Lsn/k0;->e0:J

    :cond_2
    const/4 p1, 0x1

    iput-boolean p1, p0, Lsn/k0;->j0:Z

    iget-object p1, p0, Lsn/k0;->P:Lsn/r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p0}, Lsn/s0;->c(Lsn/t0;)V

    return-void
.end method

.method public final d()J
    .locals 2

    iget v0, p0, Lsn/k0;->d0:I

    if-nez v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lsn/k0;->m()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e(J)J
    .locals 5

    invoke-virtual {p0}, Lsn/k0;->s()V

    iget-object v0, p0, Lsn/k0;->W:Lq/f;

    iget-object v0, v0, Lq/f;->y:Ljava/lang/Object;

    check-cast v0, [Z

    iget-object v1, p0, Lsn/k0;->X:Lwm/p;

    invoke-interface {v1}, Lwm/p;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 p1, 0x0

    :goto_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Lsn/k0;->c0:Z

    iput-wide p1, p0, Lsn/k0;->f0:J

    invoke-virtual {p0}, Lsn/k0;->y()Z

    move-result v2

    if-eqz v2, :cond_1

    iput-wide p1, p0, Lsn/k0;->g0:J

    return-wide p1

    :cond_1
    iget v2, p0, Lsn/k0;->a0:I

    const/4 v3, 0x7

    if-eq v2, v3, :cond_3

    iget-object v2, p0, Lsn/k0;->R:[Lsn/q0;

    array-length v2, v2

    move v3, v1

    :goto_1
    if-ge v3, v2, :cond_6

    iget-object v4, p0, Lsn/k0;->R:[Lsn/q0;

    aget-object v4, v4, v3

    invoke-virtual {v4, p1, p2, v1}, Lsn/q0;->v(JZ)Z

    move-result v4

    if-nez v4, :cond_2

    aget-boolean v4, v0, v3

    if-nez v4, :cond_3

    iget-boolean v4, p0, Lsn/k0;->V:Z

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    iput-boolean v1, p0, Lsn/k0;->h0:Z

    iput-wide p1, p0, Lsn/k0;->g0:J

    iput-boolean v1, p0, Lsn/k0;->j0:Z

    iget-object v0, p0, Lsn/k0;->J:Lko/c0;

    invoke-virtual {v0}, Lko/c0;->b()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lsn/k0;->R:[Lsn/q0;

    array-length v3, v2

    :goto_3
    if-ge v1, v3, :cond_4

    aget-object v4, v2, v1

    invoke-virtual {v4}, Lsn/q0;->g()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Lko/c0;->a()V

    return-wide p1

    :cond_5
    const/4 v2, 0x0

    iput-object v2, v0, Lko/c0;->c:Ljava/io/IOException;

    iget-object v0, p0, Lsn/k0;->R:[Lsn/q0;

    array-length v2, v0

    move v3, v1

    :goto_4
    if-ge v3, v2, :cond_6

    aget-object v4, v0, v3

    invoke-virtual {v4, v1}, Lsn/q0;->u(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_6
    return-wide p1
.end method

.method public final f()J
    .locals 2

    iget-boolean v0, p0, Lsn/k0;->c0:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lsn/k0;->j0:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lsn/k0;->t()I

    move-result v0

    iget v1, p0, Lsn/k0;->i0:I

    if-le v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lsn/k0;->c0:Z

    iget-wide v0, p0, Lsn/k0;->f0:J

    return-wide v0

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final g()V
    .locals 7

    iget-object v0, p0, Lsn/k0;->R:[Lsn/q0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lsn/q0;->u(Z)V

    iget-object v5, v4, Lsn/q0;->h:Lty/c;

    if-eqz v5, :cond_0

    iget-object v6, v4, Lsn/q0;->e:Lsn/z;

    invoke-virtual {v5, v6}, Lty/c;->u(Lsn/z;)V

    iput-object v3, v4, Lsn/q0;->h:Lty/c;

    iput-object v3, v4, Lsn/q0;->g:Lrm/c0;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lsn/k0;->K:Lq30/w0;

    iget-object v1, v0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v1, Lwm/i;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Lwm/i;->release()V

    iput-object v3, v0, Lq30/w0;->y:Ljava/lang/Object;

    :cond_2
    iput-object v3, v0, Lq30/w0;->z:Ljava/lang/Object;

    return-void
.end method

.method public final h()V
    .locals 3

    iget-object v0, p0, Lsn/k0;->z:Lg73/d;

    iget v1, p0, Lsn/k0;->a0:I

    invoke-virtual {v0, v1}, Lg73/d;->h(I)I

    move-result v0

    iget-object v1, p0, Lsn/k0;->J:Lko/c0;

    iget-object v2, v1, Lko/c0;->c:Ljava/io/IOException;

    if-nez v2, :cond_5

    iget-object v1, v1, Lko/c0;->b:Lko/z;

    if-eqz v1, :cond_2

    const/high16 v2, -0x80000000

    if-ne v0, v2, :cond_0

    iget v0, v1, Lko/z;->w:I

    :cond_0
    iget-object v2, v1, Lko/z;->z:Ljava/io/IOException;

    if-eqz v2, :cond_2

    iget v1, v1, Lko/z;->E:I

    if-gt v1, v0, :cond_1

    goto :goto_0

    :cond_1
    throw v2

    :cond_2
    :goto_0
    iget-boolean v0, p0, Lsn/k0;->j0:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lsn/k0;->U:Z

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "Loading finished before preparation is complete."

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

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

    invoke-virtual {p0}, Lsn/k0;->s()V

    invoke-virtual {p0}, Lsn/k0;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lsn/k0;->W:Lq/f;

    iget-object v0, v0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, [Z

    iget-object v1, p0, Lsn/k0;->R:[Lsn/q0;

    array-length v1, v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    iget-object v3, p0, Lsn/k0;->R:[Lsn/q0;

    aget-object v3, v3, v2

    aget-boolean v4, v0, v2

    invoke-virtual {v3, p1, p2, v4}, Lsn/q0;->f(JZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final j([Lio/o;[Z[Lsn/r0;[ZJ)J
    .locals 8

    invoke-virtual {p0}, Lsn/k0;->s()V

    iget-object v0, p0, Lsn/k0;->W:Lq/f;

    iget-object v1, v0, Lq/f;->x:Ljava/lang/Object;

    check-cast v1, Lsn/x0;

    iget-object v0, v0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, [Z

    iget v2, p0, Lsn/k0;->d0:I

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
    check-cast v5, Lsn/i0;

    iget v5, v5, Lsn/i0;->w:I

    aget-boolean v7, v0, v5

    invoke-static {v7}, Llo/a;->i(Z)V

    iget v7, p0, Lsn/k0;->d0:I

    sub-int/2addr v7, v6

    iput v7, p0, Lsn/k0;->d0:I

    aput-boolean v3, v0, v5

    const/4 v5, 0x0

    aput-object v5, p3, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iget-boolean p2, p0, Lsn/k0;->b0:Z

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

    invoke-interface {v4}, Lio/o;->length()I

    move-result v5

    if-ne v5, v6, :cond_5

    move v5, v6

    goto :goto_4

    :cond_5
    move v5, v3

    :goto_4
    invoke-static {v5}, Llo/a;->i(Z)V

    invoke-interface {v4, v3}, Lio/o;->e(I)I

    move-result v5

    if-nez v5, :cond_6

    move v5, v6

    goto :goto_5

    :cond_6
    move v5, v3

    :goto_5
    invoke-static {v5}, Llo/a;->i(Z)V

    invoke-interface {v4}, Lio/o;->j()Lsn/w0;

    move-result-object v4

    iget-object v5, v1, Lsn/x0;->x:Lzr/w0;

    invoke-virtual {v5, v4}, Lzr/g0;->indexOf(Ljava/lang/Object;)I

    move-result v4

    if-ltz v4, :cond_7

    goto :goto_6

    :cond_7
    const/4 v4, -0x1

    :goto_6
    aget-boolean v5, v0, v4

    xor-int/2addr v5, v6

    invoke-static {v5}, Llo/a;->i(Z)V

    iget v5, p0, Lsn/k0;->d0:I

    add-int/2addr v5, v6

    iput v5, p0, Lsn/k0;->d0:I

    aput-boolean v6, v0, v4

    new-instance v5, Lsn/i0;

    invoke-direct {v5, p0, v4}, Lsn/i0;-><init>(Lsn/k0;I)V

    aput-object v5, p3, v2

    aput-boolean v6, p4, v2

    if-nez p2, :cond_9

    iget-object p2, p0, Lsn/k0;->R:[Lsn/q0;

    aget-object p2, p2, v4

    invoke-virtual {p2, p5, p6, v6}, Lsn/q0;->v(JZ)Z

    move-result v4

    if-nez v4, :cond_8

    invoke-virtual {p2}, Lsn/q0;->l()I

    move-result p2

    if-eqz p2, :cond_8

    move p2, v6

    goto :goto_7

    :cond_8
    move p2, v3

    :cond_9
    :goto_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_a
    iget p1, p0, Lsn/k0;->d0:I

    if-nez p1, :cond_d

    iput-boolean v3, p0, Lsn/k0;->h0:Z

    iput-boolean v3, p0, Lsn/k0;->c0:Z

    iget-object p1, p0, Lsn/k0;->J:Lko/c0;

    invoke-virtual {p1}, Lko/c0;->b()Z

    move-result p2

    if-eqz p2, :cond_c

    iget-object p2, p0, Lsn/k0;->R:[Lsn/q0;

    array-length p3, p2

    :goto_8
    if-ge v3, p3, :cond_b

    aget-object p4, p2, v3

    invoke-virtual {p4}, Lsn/q0;->g()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_b
    invoke-virtual {p1}, Lko/c0;->a()V

    goto :goto_b

    :cond_c
    iget-object p1, p0, Lsn/k0;->R:[Lsn/q0;

    array-length p2, p1

    move p3, v3

    :goto_9
    if-ge p3, p2, :cond_f

    aget-object p4, p1, p3

    invoke-virtual {p4, v3}, Lsn/q0;->u(Z)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_9

    :cond_d
    if-eqz p2, :cond_f

    invoke-virtual {p0, p5, p6}, Lsn/k0;->e(J)J

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
    iput-boolean v6, p0, Lsn/k0;->b0:Z

    return-wide p5
.end method

.method public final k()Lsn/x0;
    .locals 1

    invoke-virtual {p0}, Lsn/k0;->s()V

    iget-object v0, p0, Lsn/k0;->W:Lq/f;

    iget-object v0, v0, Lq/f;->x:Ljava/lang/Object;

    check-cast v0, Lsn/x0;

    return-object v0
.end method

.method public final l()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lsn/k0;->T:Z

    iget-object v0, p0, Lsn/k0;->O:Landroid/os/Handler;

    iget-object v1, p0, Lsn/k0;->M:Lsn/g0;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final m()J
    .locals 12

    invoke-virtual {p0}, Lsn/k0;->s()V

    iget-object v0, p0, Lsn/k0;->W:Lq/f;

    iget-object v0, v0, Lq/f;->y:Ljava/lang/Object;

    check-cast v0, [Z

    iget-boolean v1, p0, Lsn/k0;->j0:Z

    const-wide/high16 v2, -0x8000000000000000L

    if-eqz v1, :cond_0

    return-wide v2

    :cond_0
    invoke-virtual {p0}, Lsn/k0;->y()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-wide v0, p0, Lsn/k0;->g0:J

    return-wide v0

    :cond_1
    iget-boolean v1, p0, Lsn/k0;->V:Z

    const-wide v4, 0x7fffffffffffffffL

    if-eqz v1, :cond_3

    iget-object v1, p0, Lsn/k0;->R:[Lsn/q0;

    array-length v1, v1

    const/4 v6, 0x0

    move-wide v7, v4

    :goto_0
    if-ge v6, v1, :cond_4

    aget-boolean v9, v0, v6

    if-eqz v9, :cond_2

    iget-object v9, p0, Lsn/k0;->R:[Lsn/q0;

    aget-object v9, v9, v6

    monitor-enter v9

    :try_start_0
    iget-boolean v10, v9, Lsn/q0;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v9

    if-nez v10, :cond_2

    iget-object v9, p0, Lsn/k0;->R:[Lsn/q0;

    aget-object v9, v9, v6

    monitor-enter v9

    :try_start_1
    iget-wide v10, v9, Lsn/q0;->v:J
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

    invoke-virtual {p0}, Lsn/k0;->w()J

    move-result-wide v7

    :cond_5
    cmp-long v0, v7, v2

    if-nez v0, :cond_6

    iget-wide v0, p0, Lsn/k0;->f0:J

    return-wide v0

    :cond_6
    return-wide v7
.end method

.method public final n(J)V
    .locals 0

    return-void
.end method

.method public final o(II)Lwm/s;
    .locals 1

    new-instance p2, Lsn/j0;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lsn/j0;-><init>(IZ)V

    invoke-virtual {p0, p2}, Lsn/k0;->C(Lsn/j0;)Lsn/q0;

    move-result-object p1

    return-object p1
.end method

.method public final p(Lko/a0;Z)V
    .locals 12

    check-cast p1, Lsn/h0;

    iget-object v0, p1, Lsn/h0;->b:Lko/i0;

    new-instance v2, Lsn/m;

    iget-object v0, v0, Lko/i0;->y:Landroid/net/Uri;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v0, p0, Lsn/k0;->z:Lg73/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v8, p1, Lsn/h0;->i:J

    iget-wide v10, p0, Lsn/k0;->Y:J

    iget-object v1, p0, Lsn/k0;->E:Lsn/z;

    const/4 v3, 0x1

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v11}, Lsn/z;->c(Lsn/m;IILrm/c0;ILjava/lang/Object;JJ)V

    if-nez p2, :cond_2

    iget-wide v0, p0, Lsn/k0;->e0:J

    const-wide/16 v2, -0x1

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    iget-wide p1, p1, Lsn/h0;->k:J

    iput-wide p1, p0, Lsn/k0;->e0:J

    :cond_0
    iget-object p1, p0, Lsn/k0;->R:[Lsn/q0;

    array-length p2, p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_1

    aget-object v2, p1, v1

    invoke-virtual {v2, v0}, Lsn/q0;->u(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget p1, p0, Lsn/k0;->d0:I

    if-lez p1, :cond_2

    iget-object p1, p0, Lsn/k0;->P:Lsn/r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p0}, Lsn/s0;->c(Lsn/t0;)V

    :cond_2
    return-void
.end method

.method public final q(Lko/a0;Ljava/io/IOException;I)Lbb/f;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    move-object/from16 v1, p1

    check-cast v1, Lsn/h0;

    iget-wide v2, v0, Lsn/k0;->e0:J

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-wide v2, v1, Lsn/h0;->k:J

    iput-wide v2, v0, Lsn/k0;->e0:J

    :cond_0
    iget-object v2, v1, Lsn/h0;->b:Lko/i0;

    new-instance v3, Lsn/m;

    iget-object v2, v2, Lko/i0;->y:Landroid/net/Uri;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    sget v2, Llo/y;->a:I

    iget-object v2, v0, Lsn/k0;->z:Lg73/d;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v2, v12, Lcom/google/android/exoplayer2/ParserException;

    const/4 v6, 0x1

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v2, :cond_3

    instance-of v2, v12, Ljava/io/FileNotFoundException;

    if-nez v2, :cond_3

    instance-of v2, v12, Lcom/google/android/exoplayer2/upstream/HttpDataSource$CleartextNotPermittedException;

    if-nez v2, :cond_3

    instance-of v2, v12, Lcom/google/android/exoplayer2/upstream/Loader$UnexpectedLoaderException;

    if-nez v2, :cond_3

    sget v2, Lcom/google/android/exoplayer2/upstream/DataSourceException;->x:I

    move-object v2, v12

    :goto_0
    if-eqz v2, :cond_2

    instance-of v9, v2, Lcom/google/android/exoplayer2/upstream/DataSourceException;

    if-eqz v9, :cond_1

    move-object v9, v2

    check-cast v9, Lcom/google/android/exoplayer2/upstream/DataSourceException;

    iget v9, v9, Lcom/google/android/exoplayer2/upstream/DataSourceException;->w:I

    const/16 v10, 0x7d8

    if-ne v9, v10, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    goto :goto_0

    :cond_2
    add-int/lit8 v2, p3, -0x1

    mul-int/lit16 v2, v2, 0x3e8

    const/16 v9, 0x1388

    invoke-static {v2, v9}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-long v9, v2

    goto :goto_2

    :cond_3
    :goto_1
    move-wide v9, v7

    :goto_2
    cmp-long v2, v9, v7

    const/4 v11, 0x0

    if-nez v2, :cond_4

    sget-object v2, Lko/c0;->f:Lbb/f;

    :goto_3
    move-object v14, v2

    goto :goto_8

    :cond_4
    invoke-virtual {v0}, Lsn/k0;->t()I

    move-result v2

    iget v13, v0, Lsn/k0;->i0:I

    if-le v2, v13, :cond_5

    move v13, v6

    goto :goto_4

    :cond_5
    move v13, v11

    :goto_4
    iget-wide v14, v0, Lsn/k0;->e0:J

    cmp-long v4, v14, v4

    if-nez v4, :cond_9

    iget-object v4, v0, Lsn/k0;->X:Lwm/p;

    if-eqz v4, :cond_6

    invoke-interface {v4}, Lwm/p;->f()J

    move-result-wide v4

    cmp-long v4, v4, v7

    if-eqz v4, :cond_6

    goto :goto_6

    :cond_6
    iget-boolean v2, v0, Lsn/k0;->U:Z

    if-eqz v2, :cond_7

    invoke-virtual {v0}, Lsn/k0;->E()Z

    move-result v2

    if-nez v2, :cond_7

    iput-boolean v6, v0, Lsn/k0;->h0:Z

    sget-object v2, Lko/c0;->e:Lbb/f;

    goto :goto_3

    :cond_7
    iget-boolean v2, v0, Lsn/k0;->U:Z

    iput-boolean v2, v0, Lsn/k0;->c0:Z

    const-wide/16 v4, 0x0

    iput-wide v4, v0, Lsn/k0;->f0:J

    iput v11, v0, Lsn/k0;->i0:I

    iget-object v2, v0, Lsn/k0;->R:[Lsn/q0;

    array-length v7, v2

    move v8, v11

    :goto_5
    if-ge v8, v7, :cond_8

    aget-object v14, v2, v8

    invoke-virtual {v14, v11}, Lsn/q0;->u(Z)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_8
    iget-object v2, v1, Lsn/h0;->f:Lt9/s;

    iput-wide v4, v2, Lt9/s;->a:J

    iput-wide v4, v1, Lsn/h0;->i:J

    iput-boolean v6, v1, Lsn/h0;->h:Z

    iput-boolean v11, v1, Lsn/h0;->m:Z

    goto :goto_7

    :cond_9
    :goto_6
    iput v2, v0, Lsn/k0;->i0:I

    :goto_7
    new-instance v2, Lbb/f;

    invoke-direct {v2, v13, v9, v10, v11}, Lbb/f;-><init>(IJB)V

    goto :goto_3

    :goto_8
    iget v2, v14, Lbb/f;->a:I

    if-eqz v2, :cond_a

    if-ne v2, v6, :cond_b

    :cond_a
    move v11, v6

    :cond_b
    xor-int/lit8 v13, v11, 0x1

    iget-wide v8, v1, Lsn/h0;->i:J

    iget-wide v10, v0, Lsn/k0;->Y:J

    iget-object v1, v0, Lsn/k0;->E:Lsn/z;

    move-object v2, v3

    const/4 v3, 0x1

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v13}, Lsn/z;->g(Lsn/m;IILrm/c0;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    return-object v14
.end method

.method public final r()V
    .locals 2

    iget-object v0, p0, Lsn/k0;->O:Landroid/os/Handler;

    iget-object v1, p0, Lsn/k0;->M:Lsn/g0;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final s()V
    .locals 1

    iget-boolean v0, p0, Lsn/k0;->U:Z

    invoke-static {v0}, Llo/a;->i(Z)V

    iget-object v0, p0, Lsn/k0;->W:Lq/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lsn/k0;->X:Lwm/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final t()I
    .locals 6

    iget-object v0, p0, Lsn/k0;->R:[Lsn/q0;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    iget v5, v4, Lsn/q0;->q:I

    iget v4, v4, Lsn/q0;->p:I

    add-int/2addr v5, v4

    add-int/2addr v3, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method public final u(J)Z
    .locals 0

    iget-boolean p1, p0, Lsn/k0;->j0:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Lsn/k0;->J:Lko/c0;

    iget-object p2, p1, Lko/c0;->c:Ljava/io/IOException;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean p2, p0, Lsn/k0;->h0:Z

    if-nez p2, :cond_3

    iget-boolean p2, p0, Lsn/k0;->U:Z

    if-eqz p2, :cond_1

    iget p2, p0, Lsn/k0;->d0:I

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lsn/k0;->L:Lb9/m1;

    invoke-virtual {p2}, Lb9/m1;->c()Z

    move-result p2

    invoke-virtual {p1}, Lko/c0;->b()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lsn/k0;->D()V

    const/4 p1, 0x1

    return p1

    :cond_2
    return p2

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final v(JLrm/h1;)J
    .locals 9

    invoke-virtual {p0}, Lsn/k0;->s()V

    iget-object v0, p0, Lsn/k0;->X:Lwm/p;

    invoke-interface {v0}, Lwm/p;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_0
    iget-object v0, p0, Lsn/k0;->X:Lwm/p;

    invoke-interface {v0, p1, p2}, Lwm/p;->c(J)Lwm/o;

    move-result-object v0

    iget-object v1, v0, Lwm/o;->a:Lwm/q;

    iget-wide v5, v1, Lwm/q;->a:J

    iget-object v0, v0, Lwm/o;->b:Lwm/q;

    iget-wide v7, v0, Lwm/q;->a:J

    move-wide v3, p1

    move-object v2, p3

    invoke-virtual/range {v2 .. v8}, Lrm/h1;->a(JJJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final w()J
    .locals 8

    iget-object v0, p0, Lsn/k0;->R:[Lsn/q0;

    array-length v1, v0

    const-wide/high16 v2, -0x8000000000000000L

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    aget-object v5, v0, v4

    monitor-enter v5

    :try_start_0
    iget-wide v6, v5, Lsn/q0;->v:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v5

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_0
    return-wide v2
.end method

.method public final x(Lwm/p;)V
    .locals 2

    new-instance v0, Lr5/b;

    const/16 v1, 0xb

    invoke-direct {v0, v1, p0, p1}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lsn/k0;->O:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final y()Z
    .locals 4

    iget-wide v0, p0, Lsn/k0;->g0:J

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
    .locals 13

    iget-boolean v0, p0, Lsn/k0;->k0:Z

    if-nez v0, :cond_a

    iget-boolean v0, p0, Lsn/k0;->U:Z

    if-nez v0, :cond_a

    iget-boolean v0, p0, Lsn/k0;->T:Z

    if-eqz v0, :cond_a

    iget-object v0, p0, Lsn/k0;->X:Lwm/p;

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v0, p0, Lsn/k0;->R:[Lsn/q0;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    invoke-virtual {v4}, Lsn/q0;->o()Lrm/c0;

    move-result-object v4

    if-nez v4, :cond_1

    goto/16 :goto_5

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lsn/k0;->L:Lb9/m1;

    monitor-enter v0

    :try_start_0
    iput-boolean v2, v0, Lb9/m1;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lsn/k0;->R:[Lsn/q0;

    array-length v0, v0

    new-array v1, v0, [Lsn/w0;

    new-array v3, v0, [Z

    move v4, v2

    :goto_1
    const/4 v5, 0x1

    if-ge v4, v0, :cond_9

    iget-object v6, p0, Lsn/k0;->R:[Lsn/q0;

    aget-object v6, v6, v4

    invoke-virtual {v6}, Lsn/q0;->o()Lrm/c0;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v6, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v7}, Llo/m;->h(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_4

    invoke-static {v7}, Llo/m;->j(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    move v7, v2

    goto :goto_3

    :cond_4
    :goto_2
    move v7, v5

    :goto_3
    aput-boolean v7, v3, v4

    iget-boolean v9, p0, Lsn/k0;->V:Z

    or-int/2addr v7, v9

    iput-boolean v7, p0, Lsn/k0;->V:Z

    iget-object v7, p0, Lsn/k0;->Q:Lmn/c;

    if-eqz v7, :cond_8

    iget v9, v7, Lmn/c;->w:I

    if-nez v8, :cond_5

    iget-object v10, p0, Lsn/k0;->S:[Lsn/j0;

    aget-object v10, v10, v4

    iget-boolean v10, v10, Lsn/j0;->b:Z

    if-eqz v10, :cond_7

    :cond_5
    iget-object v10, v6, Lrm/c0;->J:Lin/c;

    if-nez v10, :cond_6

    new-instance v10, Lin/c;

    new-array v5, v5, [Lin/b;

    aput-object v7, v5, v2

    invoke-direct {v10, v5}, Lin/c;-><init>([Lin/b;)V

    goto :goto_4

    :cond_6
    new-array v11, v5, [Lin/b;

    aput-object v7, v11, v2

    new-instance v7, Lin/c;

    iget-object v10, v10, Lin/c;->w:[Lin/b;

    sget v12, Llo/y;->a:I

    array-length v12, v10

    add-int/2addr v12, v5

    invoke-static {v10, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v12

    array-length v10, v10

    invoke-static {v11, v2, v12, v10, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    check-cast v12, [Lin/b;

    invoke-direct {v7, v12}, Lin/c;-><init>([Lin/b;)V

    move-object v10, v7

    :goto_4
    invoke-virtual {v6}, Lrm/c0;->a()Lrm/b0;

    move-result-object v5

    iput-object v10, v5, Lrm/b0;->i:Lin/c;

    new-instance v6, Lrm/c0;

    invoke-direct {v6, v5}, Lrm/c0;-><init>(Lrm/b0;)V

    :cond_7
    if-eqz v8, :cond_8

    iget v5, v6, Lrm/c0;->F:I

    const/4 v7, -0x1

    if-ne v5, v7, :cond_8

    iget v5, v6, Lrm/c0;->G:I

    if-ne v5, v7, :cond_8

    if-eq v9, v7, :cond_8

    invoke-virtual {v6}, Lrm/c0;->a()Lrm/b0;

    move-result-object v5

    iput v9, v5, Lrm/b0;->f:I

    new-instance v6, Lrm/c0;

    invoke-direct {v6, v5}, Lrm/c0;-><init>(Lrm/b0;)V

    :cond_8
    iget-object v5, p0, Lsn/k0;->y:Lvm/h;

    invoke-interface {v5, v6}, Lvm/h;->b(Lrm/c0;)I

    move-result v5

    invoke-virtual {v6}, Lrm/c0;->a()Lrm/b0;

    move-result-object v6

    iput v5, v6, Lrm/b0;->D:I

    new-instance v5, Lrm/c0;

    invoke-direct {v5, v6}, Lrm/c0;-><init>(Lrm/b0;)V

    new-instance v6, Lsn/w0;

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v5}, [Lrm/c0;

    move-result-object v5

    invoke-direct {v6, v7, v5}, Lsn/w0;-><init>(Ljava/lang/String;[Lrm/c0;)V

    aput-object v6, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    :cond_9
    new-instance v0, Lq/f;

    new-instance v2, Lsn/x0;

    invoke-direct {v2, v1}, Lsn/x0;-><init>([Lsn/w0;)V

    invoke-direct {v0, v2, v3}, Lq/f;-><init>(Lsn/x0;[Z)V

    iput-object v0, p0, Lsn/k0;->W:Lq/f;

    iput-boolean v5, p0, Lsn/k0;->U:Z

    iget-object v0, p0, Lsn/k0;->P:Lsn/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, p0}, Lsn/r;->g(Lsn/s;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_a
    :goto_5
    return-void
.end method
