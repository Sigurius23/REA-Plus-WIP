.class public final Ll9/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/a0;
.implements Ll9/z;


# instance fields
.field public E:Ll9/a0;

.field public F:Ll9/z;

.field public G:J

.field public final w:Ll9/c0;

.field public final x:J

.field public final y:Lko/o;

.field public z:Ll9/a;


# direct methods
.method public constructor <init>(Ll9/c0;Lko/o;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/u;->w:Ll9/c0;

    iput-object p2, p0, Ll9/u;->y:Lko/o;

    iput-wide p3, p0, Ll9/u;->x:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Ll9/u;->G:J

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Ll9/u;->E:Ll9/a0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll9/b1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b(Ll9/b1;)V
    .locals 1

    check-cast p1, Ll9/a0;

    iget-object p1, p0, Ll9/u;->F:Ll9/z;

    sget v0, Lx8/t;->a:I

    invoke-interface {p1, p0}, Ll9/a1;->b(Ll9/b1;)V

    return-void
.end method

.method public final c(Ll9/a0;)V
    .locals 1

    iget-object p1, p0, Ll9/u;->F:Ll9/z;

    sget v0, Lx8/t;->a:I

    invoke-interface {p1, p0}, Ll9/z;->c(Ll9/a0;)V

    return-void
.end method

.method public final d()J
    .locals 2

    iget-object v0, p0, Ll9/u;->E:Ll9/a0;

    sget v1, Lx8/t;->a:I

    invoke-interface {v0}, Ll9/b1;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e(J)J
    .locals 2

    iget-object v0, p0, Ll9/u;->E:Ll9/a0;

    sget v1, Lx8/t;->a:I

    invoke-interface {v0, p1, p2}, Ll9/a0;->e(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final f()J
    .locals 2

    iget-object v0, p0, Ll9/u;->E:Ll9/a0;

    sget v1, Lx8/t;->a:I

    invoke-interface {v0}, Ll9/a0;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public final g(Ll9/c0;)V
    .locals 4

    iget-wide v0, p0, Ll9/u;->G:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Ll9/u;->x:J

    :goto_0
    iget-object v2, p0, Ll9/u;->z:Ll9/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Ll9/u;->y:Lko/o;

    invoke-virtual {v2, p1, v3, v0, v1}, Ll9/a;->a(Ll9/c0;Lko/o;J)Ll9/a0;

    move-result-object p1

    iput-object p1, p0, Ll9/u;->E:Ll9/a0;

    iget-object v2, p0, Ll9/u;->F:Ll9/z;

    if-eqz v2, :cond_1

    invoke-interface {p1, p0, v0, v1}, Ll9/a0;->t(Ll9/z;J)V

    :cond_1
    return-void
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Ll9/u;->E:Ll9/a0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll9/a0;->h()V

    return-void

    :cond_0
    iget-object v0, p0, Ll9/u;->z:Ll9/a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll9/a;->i()V

    :cond_1
    return-void
.end method

.method public final i(J)V
    .locals 2

    iget-object v0, p0, Ll9/u;->E:Ll9/a0;

    sget v1, Lx8/t;->a:I

    invoke-interface {v0, p1, p2}, Ll9/a0;->i(J)V

    return-void
.end method

.method public final k()Ll9/g1;
    .locals 2

    iget-object v0, p0, Ll9/u;->E:Ll9/a0;

    sget v1, Lx8/t;->a:I

    invoke-interface {v0}, Ll9/a0;->k()Ll9/g1;

    move-result-object v0

    return-object v0
.end method

.method public final m()J
    .locals 2

    iget-object v0, p0, Ll9/u;->E:Ll9/a0;

    sget v1, Lx8/t;->a:I

    invoke-interface {v0}, Ll9/b1;->m()J

    move-result-wide v0

    return-wide v0
.end method

.method public final n(J)V
    .locals 2

    iget-object v0, p0, Ll9/u;->E:Ll9/a0;

    sget v1, Lx8/t;->a:I

    invoke-interface {v0, p1, p2}, Ll9/b1;->n(J)V

    return-void
.end method

.method public final s(JLb9/k1;)J
    .locals 2

    iget-object v0, p0, Ll9/u;->E:Ll9/a0;

    sget v1, Lx8/t;->a:I

    invoke-interface {v0, p1, p2, p3}, Ll9/a0;->s(JLb9/k1;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final t(Ll9/z;J)V
    .locals 2

    iput-object p1, p0, Ll9/u;->F:Ll9/z;

    iget-object p1, p0, Ll9/u;->E:Ll9/a0;

    if-eqz p1, :cond_1

    iget-wide p2, p0, Ll9/u;->G:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p2, v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide p2, p0, Ll9/u;->x:J

    :goto_0
    invoke-interface {p1, p0, p2, p3}, Ll9/a0;->t(Ll9/z;J)V

    :cond_1
    return-void
.end method

.method public final u([Lo9/s;[Z[Ll9/z0;[ZJ)J
    .locals 12

    iget-wide v0, p0, Ll9/u;->G:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-wide v4, p0, Ll9/u;->x:J

    cmp-long v4, p5, v4

    if-nez v4, :cond_0

    move-wide v10, v0

    goto :goto_0

    :cond_0
    move-wide/from16 v10, p5

    :goto_0
    iput-wide v2, p0, Ll9/u;->G:J

    iget-object v5, p0, Ll9/u;->E:Ll9/a0;

    sget v0, Lx8/t;->a:I

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    move-object/from16 v9, p4

    invoke-interface/range {v5 .. v11}, Ll9/a0;->u([Lo9/s;[Z[Ll9/z0;[ZJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final x(Lb9/o0;)Z
    .locals 1

    iget-object v0, p0, Ll9/u;->E:Ll9/a0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ll9/b1;->x(Lb9/o0;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
