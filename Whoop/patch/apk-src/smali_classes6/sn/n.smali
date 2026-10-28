.class public final Lsn/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/s;
.implements Lsn/r;


# instance fields
.field public E:Lsn/s;

.field public F:Lsn/r;

.field public G:J

.field public final w:Lsn/v;

.field public final x:J

.field public final y:Lko/o;

.field public z:Lsn/a;


# direct methods
.method public constructor <init>(Lsn/v;Lko/o;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/n;->w:Lsn/v;

    iput-object p2, p0, Lsn/n;->y:Lko/o;

    iput-wide p3, p0, Lsn/n;->x:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lsn/n;->G:J

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lsn/n;->E:Lsn/s;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lsn/t0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b(Lsn/r;J)V
    .locals 2

    iput-object p1, p0, Lsn/n;->F:Lsn/r;

    iget-object p1, p0, Lsn/n;->E:Lsn/s;

    if-eqz p1, :cond_1

    iget-wide p2, p0, Lsn/n;->G:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p2, v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide p2, p0, Lsn/n;->x:J

    :goto_0
    invoke-interface {p1, p0, p2, p3}, Lsn/s;->b(Lsn/r;J)V

    :cond_1
    return-void
.end method

.method public final c(Lsn/t0;)V
    .locals 1

    check-cast p1, Lsn/s;

    iget-object p1, p0, Lsn/n;->F:Lsn/r;

    sget v0, Llo/y;->a:I

    invoke-interface {p1, p0}, Lsn/s0;->c(Lsn/t0;)V

    return-void
.end method

.method public final d()J
    .locals 2

    iget-object v0, p0, Lsn/n;->E:Lsn/s;

    sget v1, Llo/y;->a:I

    invoke-interface {v0}, Lsn/t0;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e(J)J
    .locals 2

    iget-object v0, p0, Lsn/n;->E:Lsn/s;

    sget v1, Llo/y;->a:I

    invoke-interface {v0, p1, p2}, Lsn/s;->e(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final f()J
    .locals 2

    iget-object v0, p0, Lsn/n;->E:Lsn/s;

    sget v1, Llo/y;->a:I

    invoke-interface {v0}, Lsn/s;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public final g(Lsn/s;)V
    .locals 1

    iget-object p1, p0, Lsn/n;->F:Lsn/r;

    sget v0, Llo/y;->a:I

    invoke-interface {p1, p0}, Lsn/r;->g(Lsn/s;)V

    return-void
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Lsn/n;->E:Lsn/s;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lsn/s;->h()V

    return-void

    :cond_0
    iget-object v0, p0, Lsn/n;->z:Lsn/a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lsn/a;->g()V

    :cond_1
    return-void
.end method

.method public final i(J)V
    .locals 2

    iget-object v0, p0, Lsn/n;->E:Lsn/s;

    sget v1, Llo/y;->a:I

    invoke-interface {v0, p1, p2}, Lsn/s;->i(J)V

    return-void
.end method

.method public final j([Lio/o;[Z[Lsn/r0;[ZJ)J
    .locals 12

    iget-wide v0, p0, Lsn/n;->G:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-wide v4, p0, Lsn/n;->x:J

    cmp-long v4, p5, v4

    if-nez v4, :cond_0

    iput-wide v2, p0, Lsn/n;->G:J

    move-wide v10, v0

    goto :goto_0

    :cond_0
    move-wide/from16 v10, p5

    :goto_0
    iget-object v5, p0, Lsn/n;->E:Lsn/s;

    sget v0, Llo/y;->a:I

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    move-object/from16 v9, p4

    invoke-interface/range {v5 .. v11}, Lsn/s;->j([Lio/o;[Z[Lsn/r0;[ZJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final k()Lsn/x0;
    .locals 2

    iget-object v0, p0, Lsn/n;->E:Lsn/s;

    sget v1, Llo/y;->a:I

    invoke-interface {v0}, Lsn/s;->k()Lsn/x0;

    move-result-object v0

    return-object v0
.end method

.method public final l(Lsn/v;)V
    .locals 4

    iget-wide v0, p0, Lsn/n;->G:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lsn/n;->x:J

    :goto_0
    iget-object v2, p0, Lsn/n;->z:Lsn/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lsn/n;->y:Lko/o;

    invoke-virtual {v2, p1, v3, v0, v1}, Lsn/a;->a(Lsn/v;Lko/o;J)Lsn/s;

    move-result-object p1

    iput-object p1, p0, Lsn/n;->E:Lsn/s;

    iget-object v2, p0, Lsn/n;->F:Lsn/r;

    if-eqz v2, :cond_1

    invoke-interface {p1, p0, v0, v1}, Lsn/s;->b(Lsn/r;J)V

    :cond_1
    return-void
.end method

.method public final m()J
    .locals 2

    iget-object v0, p0, Lsn/n;->E:Lsn/s;

    sget v1, Llo/y;->a:I

    invoke-interface {v0}, Lsn/t0;->m()J

    move-result-wide v0

    return-wide v0
.end method

.method public final n(J)V
    .locals 2

    iget-object v0, p0, Lsn/n;->E:Lsn/s;

    sget v1, Llo/y;->a:I

    invoke-interface {v0, p1, p2}, Lsn/t0;->n(J)V

    return-void
.end method

.method public final u(J)Z
    .locals 1

    iget-object v0, p0, Lsn/n;->E:Lsn/s;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lsn/t0;->u(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final v(JLrm/h1;)J
    .locals 2

    iget-object v0, p0, Lsn/n;->E:Lsn/s;

    sget v1, Llo/y;->a:I

    invoke-interface {v0, p1, p2, p3}, Lsn/s;->v(JLrm/h1;)J

    move-result-wide p1

    return-wide p1
.end method
