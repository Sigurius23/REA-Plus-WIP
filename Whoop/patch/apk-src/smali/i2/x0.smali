.class public final Li2/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/g0;


# instance fields
.field public E:F

.field public F:F

.field public G:F

.field public H:J

.field public I:J

.field public J:F

.field public K:F

.field public L:F

.field public M:F

.field public N:J

.field public O:Li2/a1;

.field public P:Z

.field public Q:I

.field public R:J

.field public S:Ly3/c;

.field public T:Ly3/m;

.field public U:Lal/a;

.field public V:I

.field public W:Li2/p0;

.field public w:I

.field public x:F

.field public y:F

.field public z:F


# virtual methods
.method public final C(F)V
    .locals 1

    iget v0, p0, Li2/x0;->E:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Li2/x0;->w:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Li2/x0;->w:I

    iput p1, p0, Li2/x0;->E:F

    return-void
.end method

.method public final E(F)V
    .locals 1

    iget v0, p0, Li2/x0;->F:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Li2/x0;->w:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Li2/x0;->w:I

    iput p1, p0, Li2/x0;->F:F

    return-void
.end method

.method public final a(F)V
    .locals 1

    iget v0, p0, Li2/x0;->z:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Li2/x0;->w:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Li2/x0;->w:I

    iput p1, p0, Li2/x0;->z:F

    return-void
.end method

.method public final b(J)V
    .locals 2

    iget-wide v0, p0, Li2/x0;->H:J

    invoke-static {v0, v1, p1, p2}, Li2/x;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Li2/x0;->w:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Li2/x0;->w:I

    iput-wide p1, p0, Li2/x0;->H:J

    :cond_0
    return-void
.end method

.method public final c(F)V
    .locals 1

    iget v0, p0, Li2/x0;->M:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Li2/x0;->w:I

    or-int/lit16 v0, v0, 0x800

    iput v0, p0, Li2/x0;->w:I

    iput p1, p0, Li2/x0;->M:F

    return-void
.end method

.method public final e(Z)V
    .locals 1

    iget-boolean v0, p0, Li2/x0;->P:Z

    if-eq v0, p1, :cond_0

    iget v0, p0, Li2/x0;->w:I

    or-int/lit16 v0, v0, 0x4000

    iput v0, p0, Li2/x0;->w:I

    iput-boolean p1, p0, Li2/x0;->P:Z

    :cond_0
    return-void
.end method

.method public final f(I)V
    .locals 2

    iget v0, p0, Li2/x0;->Q:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget v0, p0, Li2/x0;->w:I

    const v1, 0x8000

    or-int/2addr v0, v1

    iput v0, p0, Li2/x0;->w:I

    iput p1, p0, Li2/x0;->Q:I

    return-void
.end method

.method public final g(Lal/a;)V
    .locals 2

    iget-object v0, p0, Li2/x0;->U:Lal/a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Li2/x0;->w:I

    const/high16 v1, 0x20000

    or-int/2addr v0, v1

    iput v0, p0, Li2/x0;->w:I

    iput-object p1, p0, Li2/x0;->U:Lal/a;

    :cond_0
    return-void
.end method

.method public final getDensity()F
    .locals 1

    iget-object v0, p0, Li2/x0;->S:Ly3/c;

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v0

    return v0
.end method

.method public final k(F)V
    .locals 1

    iget v0, p0, Li2/x0;->J:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Li2/x0;->w:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Li2/x0;->w:I

    iput p1, p0, Li2/x0;->J:F

    return-void
.end method

.method public final m0()F
    .locals 1

    iget-object v0, p0, Li2/x0;->S:Ly3/c;

    invoke-interface {v0}, Ly3/c;->m0()F

    move-result v0

    return v0
.end method

.method public final n(F)V
    .locals 1

    iget v0, p0, Li2/x0;->K:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Li2/x0;->w:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Li2/x0;->w:I

    iput p1, p0, Li2/x0;->K:F

    return-void
.end method

.method public final o(F)V
    .locals 1

    iget v0, p0, Li2/x0;->L:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Li2/x0;->w:I

    or-int/lit16 v0, v0, 0x400

    iput v0, p0, Li2/x0;->w:I

    iput p1, p0, Li2/x0;->L:F

    return-void
.end method

.method public final p(F)V
    .locals 1

    iget v0, p0, Li2/x0;->x:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Li2/x0;->w:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Li2/x0;->w:I

    iput p1, p0, Li2/x0;->x:F

    return-void
.end method

.method public final r(F)V
    .locals 1

    iget v0, p0, Li2/x0;->y:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Li2/x0;->w:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Li2/x0;->w:I

    iput p1, p0, Li2/x0;->y:F

    return-void
.end method

.method public final s(F)V
    .locals 1

    iget v0, p0, Li2/x0;->G:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Li2/x0;->w:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Li2/x0;->w:I

    iput p1, p0, Li2/x0;->G:F

    return-void
.end method

.method public final t(Li2/a1;)V
    .locals 1

    iget-object v0, p0, Li2/x0;->O:Li2/a1;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Li2/x0;->w:I

    or-int/lit16 v0, v0, 0x2000

    iput v0, p0, Li2/x0;->w:I

    iput-object p1, p0, Li2/x0;->O:Li2/a1;

    :cond_0
    return-void
.end method

.method public final v(J)V
    .locals 2

    iget-wide v0, p0, Li2/x0;->I:J

    invoke-static {v0, v1, p1, p2}, Li2/x;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Li2/x0;->w:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Li2/x0;->w:I

    iput-wide p1, p0, Li2/x0;->I:J

    :cond_0
    return-void
.end method

.method public final y(J)V
    .locals 2

    iget-wide v0, p0, Li2/x0;->N:J

    invoke-static {v0, v1, p1, p2}, Li2/e1;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Li2/x0;->w:I

    or-int/lit16 v0, v0, 0x1000

    iput v0, p0, Li2/x0;->w:I

    iput-wide p1, p0, Li2/x0;->N:J

    :cond_0
    return-void
.end method
