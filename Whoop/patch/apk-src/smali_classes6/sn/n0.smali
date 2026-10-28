.class public final Lsn/n0;
.super Lsn/a;
.source "SourceFile"


# instance fields
.field public final h:Lrm/k0;

.field public final i:Lrm/i0;

.field public final j:Lko/k;

.field public final k:Lrm/p;

.field public final l:Lvm/h;

.field public final m:Lg73/d;

.field public final n:I

.field public o:Z

.field public p:J

.field public q:Z

.field public r:Z

.field public s:Lko/j0;


# direct methods
.method public constructor <init>(Lrm/k0;Ld1/j;Lrm/p;Lvm/h;Lg73/d;I)V
    .locals 1

    invoke-direct {p0}, Lsn/a;-><init>()V

    iget-object v0, p1, Lrm/k0;->x:Lrm/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, p0, Lsn/n0;->i:Lrm/i0;

    iput-object p1, p0, Lsn/n0;->h:Lrm/k0;

    iput-object p2, p0, Lsn/n0;->j:Lko/k;

    iput-object p3, p0, Lsn/n0;->k:Lrm/p;

    iput-object p4, p0, Lsn/n0;->l:Lvm/h;

    iput-object p5, p0, Lsn/n0;->m:Lg73/d;

    iput p6, p0, Lsn/n0;->n:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lsn/n0;->o:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lsn/n0;->p:J

    return-void
.end method


# virtual methods
.method public final a(Lsn/v;Lko/o;J)Lsn/s;
    .locals 11

    iget-object p3, p0, Lsn/n0;->j:Lko/k;

    invoke-interface {p3}, Lko/k;->createDataSource()Lko/l;

    move-result-object v2

    iget-object p3, p0, Lsn/n0;->s:Lko/j0;

    if-eqz p3, :cond_0

    invoke-interface {v2, p3}, Lko/l;->y(Lko/j0;)V

    :cond_0
    new-instance v0, Lsn/k0;

    iget-object p3, p0, Lsn/n0;->i:Lrm/i0;

    iget-object v1, p3, Lrm/i0;->a:Landroid/net/Uri;

    iget-object p3, p0, Lsn/a;->g:Lsm/f;

    invoke-static {p3}, Llo/a;->j(Ljava/lang/Object;)V

    iget-object p3, p0, Lsn/n0;->k:Lrm/p;

    iget-object p3, p3, Lrm/p;->x:Ljava/lang/Object;

    check-cast p3, Lwm/g;

    new-instance v3, Lq30/w0;

    invoke-direct {v3, p3}, Lq30/w0;-><init>(Lwm/g;)V

    new-instance v5, Lsn/z;

    iget-object p3, p0, Lsn/a;->d:Lsn/z;

    iget-object p3, p3, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 p4, 0x0

    invoke-direct {v5, p3, p4, p1}, Lsn/z;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILsn/v;)V

    new-instance v7, Lsn/z;

    iget-object p3, p0, Lsn/a;->c:Lsn/z;

    iget-object p3, p3, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v7, p3, p4, p1}, Lsn/z;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILsn/v;)V

    iget v10, p0, Lsn/n0;->n:I

    iget-object v4, p0, Lsn/n0;->l:Lvm/h;

    iget-object v6, p0, Lsn/n0;->m:Lg73/d;

    move-object v8, p0

    move-object v9, p2

    invoke-direct/range {v0 .. v10}, Lsn/k0;-><init>(Landroid/net/Uri;Lko/l;Lq30/w0;Lvm/h;Lsn/z;Lg73/d;Lsn/z;Lsn/n0;Lko/o;I)V

    return-object v0
.end method

.method public final f()Lrm/k0;
    .locals 1

    iget-object v0, p0, Lsn/n0;->h:Lrm/k0;

    return-object v0
.end method

.method public final g()V
    .locals 0

    return-void
.end method

.method public final i(Lko/j0;)V
    .locals 2

    iput-object p1, p0, Lsn/n0;->s:Lko/j0;

    iget-object p1, p0, Lsn/n0;->l:Lvm/h;

    invoke-interface {p1}, Lvm/h;->prepare()V

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lsn/a;->g:Lsm/f;

    invoke-static {v1}, Llo/a;->j(Ljava/lang/Object;)V

    invoke-interface {p1, v0, v1}, Lvm/h;->c(Landroid/os/Looper;Lsm/f;)V

    invoke-virtual {p0}, Lsn/n0;->p()V

    return-void
.end method

.method public final k(Lsn/s;)V
    .locals 7

    check-cast p1, Lsn/k0;

    iget-boolean v0, p1, Lsn/k0;->U:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lsn/k0;->R:[Lsn/q0;

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    invoke-virtual {v4}, Lsn/q0;->g()V

    iget-object v5, v4, Lsn/q0;->h:Lty/c;

    if-eqz v5, :cond_0

    iget-object v6, v4, Lsn/q0;->e:Lsn/z;

    invoke-virtual {v5, v6}, Lty/c;->u(Lsn/z;)V

    iput-object v1, v4, Lsn/q0;->h:Lty/c;

    iput-object v1, v4, Lsn/q0;->g:Lrm/c0;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p1, Lsn/k0;->J:Lko/c0;

    invoke-virtual {v0, p1}, Lko/c0;->c(Lko/b0;)V

    iget-object v0, p1, Lsn/k0;->O:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p1, Lsn/k0;->P:Lsn/r;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lsn/k0;->k0:Z

    return-void
.end method

.method public final m()V
    .locals 1

    iget-object v0, p0, Lsn/n0;->l:Lvm/h;

    invoke-interface {v0}, Lvm/h;->release()V

    return-void
.end method

.method public final p()V
    .locals 20

    move-object/from16 v0, p0

    new-instance v1, Lsn/v0;

    iget-wide v6, v0, Lsn/n0;->p:J

    iget-boolean v14, v0, Lsn/n0;->q:Z

    iget-boolean v2, v0, Lsn/n0;->r:Z

    iget-object v3, v0, Lsn/n0;->h:Lrm/k0;

    if-eqz v2, :cond_0

    iget-object v2, v3, Lrm/k0;->y:Lrm/h0;

    :goto_0
    move-object/from16 v19, v2

    move-object/from16 v18, v3

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :goto_1
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-wide v8, v6

    invoke-direct/range {v1 .. v19}, Lsn/v0;-><init>(JJJJJJZZZLvn/c;Lrm/k0;Lrm/h0;)V

    iget-boolean v2, v0, Lsn/n0;->o:Z

    if-eqz v2, :cond_1

    new-instance v2, Lsn/l0;

    invoke-direct {v2, v1}, Lsn/k;-><init>(Lrm/o1;)V

    move-object v1, v2

    :cond_1
    invoke-virtual {v0, v1}, Lsn/a;->j(Lrm/o1;)V

    return-void
.end method

.method public final q(JZZ)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    iget-wide p1, p0, Lsn/n0;->p:J

    :cond_0
    iget-boolean v0, p0, Lsn/n0;->o:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Lsn/n0;->p:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lsn/n0;->q:Z

    if-ne v0, p3, :cond_1

    iget-boolean v0, p0, Lsn/n0;->r:Z

    if-ne v0, p4, :cond_1

    return-void

    :cond_1
    iput-wide p1, p0, Lsn/n0;->p:J

    iput-boolean p3, p0, Lsn/n0;->q:Z

    iput-boolean p4, p0, Lsn/n0;->r:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lsn/n0;->o:Z

    invoke-virtual {p0}, Lsn/n0;->p()V

    return-void
.end method
