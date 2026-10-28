.class public final Lsn/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/o;


# instance fields
.field public final a:Lio/o;

.field public final b:Lsn/w0;


# direct methods
.method public constructor <init>(Lio/o;Lsn/w0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/b0;->a:Lio/o;

    iput-object p2, p0, Lsn/b0;->b:Lsn/w0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0}, Lio/o;->a()V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0}, Lio/o;->b()V

    return-void
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0}, Lio/o;->c()I

    move-result v0

    return v0
.end method

.method public final d(I)Lrm/c0;
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0, p1}, Lio/o;->d(I)Lrm/c0;

    move-result-object p1

    return-object p1
.end method

.method public final e(I)I
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0, p1}, Lio/o;->e(I)I

    move-result p1

    return p1
.end method

.method public final f(F)V
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0, p1}, Lio/o;->f(F)V

    return-void
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0}, Lio/o;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0}, Lio/o;->h()V

    return-void
.end method

.method public final i(I)I
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0, p1}, Lio/o;->i(I)I

    move-result p1

    return p1
.end method

.method public final j()Lsn/w0;
    .locals 1

    iget-object v0, p0, Lsn/b0;->b:Lsn/w0;

    return-object v0
.end method

.method public final k(Z)V
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0, p1}, Lio/o;->k(Z)V

    return-void
.end method

.method public final l(JLjava/util/List;)I
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0, p1, p2, p3}, Lio/o;->l(JLjava/util/List;)I

    move-result p1

    return p1
.end method

.method public final length()I
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0}, Lio/o;->length()I

    move-result v0

    return v0
.end method

.method public final m()I
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0}, Lio/o;->m()I

    move-result v0

    return v0
.end method

.method public final n()Lrm/c0;
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0}, Lio/o;->n()Lrm/c0;

    move-result-object v0

    return-object v0
.end method

.method public final o()I
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0}, Lio/o;->o()I

    move-result v0

    return v0
.end method

.method public final p()V
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0}, Lio/o;->p()V

    return-void
.end method

.method public final q(JJJLjava/util/List;[Lun/c;)V
    .locals 9

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-interface/range {v0 .. v8}, Lio/o;->q(JJJLjava/util/List;[Lun/c;)V

    return-void
.end method

.method public final r(IJ)Z
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0, p1, p2, p3}, Lio/o;->r(IJ)Z

    move-result p1

    return p1
.end method

.method public final s(IJ)Z
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0, p1, p2, p3}, Lio/o;->s(IJ)Z

    move-result p1

    return p1
.end method

.method public final t(JLun/a;Ljava/util/List;)Z
    .locals 1

    iget-object v0, p0, Lsn/b0;->a:Lio/o;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/o;->t(JLun/a;Ljava/util/List;)Z

    move-result p1

    return p1
.end method
