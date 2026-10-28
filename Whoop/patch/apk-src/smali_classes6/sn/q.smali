.class public final Lsn/q;
.super Lsn/h;
.source "SourceFile"


# instance fields
.field public final k:Lsn/a;

.field public final l:Z

.field public final m:Lrm/n1;

.field public final n:Lrm/m1;

.field public o:Lsn/o;

.field public p:Lsn/n;

.field public q:Z

.field public r:Z

.field public s:Z


# direct methods
.method public constructor <init>(Lsn/a;Z)V
    .locals 2

    invoke-direct {p0}, Lsn/h;-><init>()V

    iput-object p1, p0, Lsn/q;->k:Lsn/a;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lsn/q;->l:Z

    new-instance p2, Lrm/n1;

    invoke-direct {p2}, Lrm/n1;-><init>()V

    iput-object p2, p0, Lsn/q;->m:Lrm/n1;

    new-instance p2, Lrm/m1;

    invoke-direct {p2}, Lrm/m1;-><init>()V

    iput-object p2, p0, Lsn/q;->n:Lrm/m1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lsn/a;->f()Lrm/k0;

    move-result-object p1

    new-instance p2, Lsn/o;

    new-instance v0, Lsn/p;

    invoke-direct {v0, p1}, Lsn/p;-><init>(Lrm/k0;)V

    sget-object p1, Lrm/n1;->R:Ljava/lang/Object;

    sget-object v1, Lsn/o;->E:Ljava/lang/Object;

    invoke-direct {p2, v0, p1, v1}, Lsn/o;-><init>(Lrm/o1;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lsn/q;->o:Lsn/o;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lsn/v;Lko/o;J)Lsn/s;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lsn/q;->s(Lsn/v;Lko/o;J)Lsn/n;

    move-result-object p1

    return-object p1
.end method

.method public final f()Lrm/k0;
    .locals 1

    iget-object v0, p0, Lsn/q;->k:Lsn/a;

    invoke-virtual {v0}, Lsn/a;->f()Lrm/k0;

    move-result-object v0

    return-object v0
.end method

.method public final g()V
    .locals 0

    return-void
.end method

.method public final i(Lko/j0;)V
    .locals 1

    iput-object p1, p0, Lsn/h;->j:Lko/j0;

    const/4 p1, 0x0

    invoke-static {p1}, Llo/y;->k(Lmo/h;)Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Lsn/h;->i:Landroid/os/Handler;

    iget-boolean v0, p0, Lsn/q;->l:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lsn/q;->q:Z

    iget-object v0, p0, Lsn/q;->k:Lsn/a;

    invoke-virtual {p0, p1, v0}, Lsn/h;->r(Ljava/lang/Object;Lsn/a;)V

    :cond_0
    return-void
.end method

.method public final k(Lsn/s;)V
    .locals 2

    move-object v0, p1

    check-cast v0, Lsn/n;

    iget-object v1, v0, Lsn/n;->E:Lsn/s;

    if-eqz v1, :cond_0

    iget-object v1, v0, Lsn/n;->z:Lsn/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lsn/n;->E:Lsn/s;

    invoke-virtual {v1, v0}, Lsn/a;->k(Lsn/s;)V

    :cond_0
    iget-object v0, p0, Lsn/q;->p:Lsn/n;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lsn/q;->p:Lsn/n;

    :cond_1
    return-void
.end method

.method public final m()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lsn/q;->r:Z

    iput-boolean v0, p0, Lsn/q;->q:Z

    invoke-super {p0}, Lsn/h;->m()V

    return-void
.end method

.method public final p(Ljava/lang/Object;Lsn/v;)Lsn/v;
    .locals 1

    check-cast p1, Ljava/lang/Void;

    iget-object p1, p2, Lsn/t;->a:Ljava/lang/Object;

    iget-object v0, p0, Lsn/q;->o:Lsn/o;

    iget-object v0, v0, Lsn/o;->z:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lsn/o;->E:Ljava/lang/Object;

    :cond_0
    invoke-virtual {p2, p1}, Lsn/v;->b(Ljava/lang/Object;)Lsn/v;

    move-result-object p1

    return-object p1
.end method

.method public final q(Ljava/lang/Object;Lsn/a;Lrm/o1;)V
    .locals 12

    move-object v0, p3

    move-object v1, p1

    check-cast v1, Ljava/lang/Void;

    iget-boolean v1, p0, Lsn/q;->r:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lsn/q;->o:Lsn/o;

    new-instance v2, Lsn/o;

    iget-object v3, v1, Lsn/o;->y:Ljava/lang/Object;

    iget-object v1, v1, Lsn/o;->z:Ljava/lang/Object;

    invoke-direct {v2, p3, v3, v1}, Lsn/o;-><init>(Lrm/o1;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, p0, Lsn/q;->o:Lsn/o;

    iget-object v0, p0, Lsn/q;->p:Lsn/n;

    if-eqz v0, :cond_6

    iget-wide v0, v0, Lsn/n;->G:J

    invoke-virtual {p0, v0, v1}, Lsn/q;->t(J)V

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p3}, Lrm/o1;->p()Z

    move-result v1

    sget-object v6, Lsn/o;->E:Ljava/lang/Object;

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lsn/q;->s:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lsn/q;->o:Lsn/o;

    new-instance v2, Lsn/o;

    iget-object v3, v1, Lsn/o;->y:Ljava/lang/Object;

    iget-object v1, v1, Lsn/o;->z:Ljava/lang/Object;

    invoke-direct {v2, p3, v3, v1}, Lsn/o;-><init>(Lrm/o1;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object v1, Lrm/n1;->R:Ljava/lang/Object;

    new-instance v2, Lsn/o;

    invoke-direct {v2, p3, v1, v6}, Lsn/o;-><init>(Lrm/o1;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    iput-object v2, p0, Lsn/q;->o:Lsn/o;

    goto/16 :goto_3

    :cond_2
    const/4 v1, 0x0

    iget-object v2, p0, Lsn/q;->m:Lrm/n1;

    invoke-virtual {p3, v1, v2}, Lrm/o1;->n(ILrm/n1;)V

    iget-wide v3, v2, Lrm/n1;->M:J

    iget-object v7, v2, Lrm/n1;->w:Ljava/lang/Object;

    iget-object v5, p0, Lsn/q;->p:Lsn/n;

    if-eqz v5, :cond_3

    iget-wide v8, v5, Lsn/n;->x:J

    iget-object v10, p0, Lsn/q;->o:Lsn/o;

    iget-object v5, v5, Lsn/n;->w:Lsn/v;

    iget-object v5, v5, Lsn/t;->a:Ljava/lang/Object;

    iget-object v11, p0, Lsn/q;->n:Lrm/m1;

    invoke-virtual {v10, v5, v11}, Lrm/o1;->g(Ljava/lang/Object;Lrm/m1;)Lrm/m1;

    iget-wide v10, v11, Lrm/m1;->E:J

    add-long/2addr v10, v8

    iget-object v5, p0, Lsn/q;->o:Lsn/o;

    const-wide/16 v8, 0x0

    invoke-virtual {v5, v1, v2, v8, v9}, Lsn/o;->m(ILrm/n1;J)Lrm/n1;

    iget-wide v1, v2, Lrm/n1;->M:J

    cmp-long v1, v10, v1

    if-eqz v1, :cond_3

    move-wide v4, v10

    goto :goto_1

    :cond_3
    move-wide v4, v3

    :goto_1
    iget-object v2, p0, Lsn/q;->n:Lrm/m1;

    const/4 v3, 0x0

    iget-object v1, p0, Lsn/q;->m:Lrm/n1;

    invoke-virtual/range {v0 .. v5}, Lrm/o1;->i(Lrm/n1;Lrm/m1;IJ)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-boolean v1, p0, Lsn/q;->s:Z

    if-eqz v1, :cond_4

    iget-object v1, p0, Lsn/q;->o:Lsn/o;

    new-instance v2, Lsn/o;

    iget-object v5, v1, Lsn/o;->y:Ljava/lang/Object;

    iget-object v1, v1, Lsn/o;->z:Ljava/lang/Object;

    invoke-direct {v2, p3, v5, v1}, Lsn/o;-><init>(Lrm/o1;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    new-instance v1, Lsn/o;

    invoke-direct {v1, p3, v7, v2}, Lsn/o;-><init>(Lrm/o1;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v2, v1

    :goto_2
    iput-object v2, p0, Lsn/q;->o:Lsn/o;

    iget-object v0, p0, Lsn/q;->p:Lsn/n;

    if-eqz v0, :cond_6

    invoke-virtual {p0, v3, v4}, Lsn/q;->t(J)V

    iget-object v0, v0, Lsn/n;->w:Lsn/v;

    iget-object v1, v0, Lsn/t;->a:Ljava/lang/Object;

    iget-object v2, p0, Lsn/q;->o:Lsn/o;

    iget-object v2, v2, Lsn/o;->z:Ljava/lang/Object;

    if-eqz v2, :cond_5

    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v1, p0, Lsn/q;->o:Lsn/o;

    iget-object v1, v1, Lsn/o;->z:Ljava/lang/Object;

    :cond_5
    invoke-virtual {v0, v1}, Lsn/v;->b(Ljava/lang/Object;)Lsn/v;

    move-result-object v0

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v0, 0x0

    :goto_4
    const/4 v1, 0x1

    iput-boolean v1, p0, Lsn/q;->s:Z

    iput-boolean v1, p0, Lsn/q;->r:Z

    iget-object v1, p0, Lsn/q;->o:Lsn/o;

    invoke-virtual {p0, v1}, Lsn/a;->j(Lrm/o1;)V

    if-eqz v0, :cond_7

    iget-object v1, p0, Lsn/q;->p:Lsn/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v0}, Lsn/n;->l(Lsn/v;)V

    :cond_7
    return-void
.end method

.method public final s(Lsn/v;Lko/o;J)Lsn/n;
    .locals 1

    new-instance v0, Lsn/n;

    invoke-direct {v0, p1, p2, p3, p4}, Lsn/n;-><init>(Lsn/v;Lko/o;J)V

    iget-object p2, v0, Lsn/n;->z:Lsn/a;

    const/4 p3, 0x1

    if-nez p2, :cond_0

    move p2, p3

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Llo/a;->i(Z)V

    iget-object p2, p0, Lsn/q;->k:Lsn/a;

    iput-object p2, v0, Lsn/n;->z:Lsn/a;

    iget-boolean p4, p0, Lsn/q;->r:Z

    if-eqz p4, :cond_2

    iget-object p2, p1, Lsn/t;->a:Ljava/lang/Object;

    iget-object p3, p0, Lsn/q;->o:Lsn/o;

    iget-object p3, p3, Lsn/o;->z:Ljava/lang/Object;

    if-eqz p3, :cond_1

    sget-object p3, Lsn/o;->E:Ljava/lang/Object;

    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    iget-object p2, p0, Lsn/q;->o:Lsn/o;

    iget-object p2, p2, Lsn/o;->z:Ljava/lang/Object;

    :cond_1
    invoke-virtual {p1, p2}, Lsn/v;->b(Ljava/lang/Object;)Lsn/v;

    move-result-object p1

    invoke-virtual {v0, p1}, Lsn/n;->l(Lsn/v;)V

    return-object v0

    :cond_2
    iput-object v0, p0, Lsn/q;->p:Lsn/n;

    iget-boolean p1, p0, Lsn/q;->q:Z

    if-nez p1, :cond_3

    iput-boolean p3, p0, Lsn/q;->q:Z

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p2}, Lsn/h;->r(Ljava/lang/Object;Lsn/a;)V

    :cond_3
    return-object v0
.end method

.method public final t(J)V
    .locals 5

    iget-object v0, p0, Lsn/q;->p:Lsn/n;

    iget-object v1, p0, Lsn/q;->o:Lsn/o;

    iget-object v2, v0, Lsn/n;->w:Lsn/v;

    iget-object v2, v2, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lsn/o;->b(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Lsn/q;->o:Lsn/o;

    const/4 v3, 0x0

    iget-object v4, p0, Lsn/q;->n:Lrm/m1;

    invoke-virtual {v2, v1, v4, v3}, Lsn/o;->f(ILrm/m1;Z)Lrm/m1;

    iget-wide v1, v4, Lrm/m1;->z:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    if-eqz v3, :cond_1

    cmp-long v3, p1, v1

    if-ltz v3, :cond_1

    const-wide/16 p1, 0x1

    sub-long/2addr v1, p1

    const-wide/16 p1, 0x0

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    :cond_1
    iput-wide p1, v0, Lsn/n;->G:J

    return-void
.end method
