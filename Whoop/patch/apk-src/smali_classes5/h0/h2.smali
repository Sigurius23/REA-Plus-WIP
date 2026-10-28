.class public final Lh0/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly3/c;


# instance fields
.field public final synthetic w:Ly3/c;

.field public x:Z

.field public y:Z

.field public final z:Lmc3/c;


# direct methods
.method public constructor <init>(Ly3/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/h2;->w:Ly3/c;

    new-instance p1, Lmc3/c;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lmc3/c;-><init>(Z)V

    iput-object p1, p0, Lh0/h2;->z:Lmc3/c;

    return-void
.end method


# virtual methods
.method public final D0(J)J
    .locals 1

    iget-object v0, p0, Lh0/h2;->w:Ly3/c;

    invoke-interface {v0, p1, p2}, Ly3/c;->D0(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final F(F)I
    .locals 1

    iget-object v0, p0, Lh0/h2;->w:Ly3/c;

    invoke-interface {v0, p1}, Ly3/c;->F(F)I

    move-result p1

    return p1
.end method

.method public final K(J)F
    .locals 1

    iget-object v0, p0, Lh0/h2;->w:Ly3/c;

    invoke-interface {v0, p1, p2}, Ly3/c;->K(J)F

    move-result p1

    return p1
.end method

.method public final a(Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lh0/e2;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lh0/e2;

    iget v1, v0, Lh0/e2;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/e2;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/e2;

    invoke-direct {v0, p0, p1}, Lh0/e2;-><init>(Lh0/h2;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lh0/e2;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/e2;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lh0/e2;->y:I

    invoke-virtual {p0, v0}, Lh0/h2;->f(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Landroidx/compose/foundation/gestures/GestureCancellationException;

    const-string v0, "The press gesture was canceled."

    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh0/h2;->y:Z

    iget-object v0, p0, Lh0/h2;->z:Lmc3/c;

    invoke-virtual {v0}, Lmc3/c;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lmc3/c;->i(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh0/h2;->x:Z

    iget-object v0, p0, Lh0/h2;->z:Lmc3/c;

    invoke-virtual {v0}, Lmc3/c;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lmc3/c;->i(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final e(Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lh0/f2;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lh0/f2;

    iget v1, v0, Lh0/f2;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/f2;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/f2;

    invoke-direct {v0, p0, p1}, Lh0/f2;-><init>(Lh0/h2;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lh0/f2;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/f2;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lh0/f2;->y:I

    iget-object p1, p0, Lh0/h2;->z:Lmc3/c;

    invoke-virtual {p1, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lh0/h2;->x:Z

    iput-boolean p1, p0, Lh0/h2;->y:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final e0(I)F
    .locals 1

    iget-object v0, p0, Lh0/h2;->w:Ly3/c;

    invoke-interface {v0, p1}, Ly3/c;->e0(I)F

    move-result p1

    return p1
.end method

.method public final f(Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lh0/g2;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lh0/g2;

    iget v1, v0, Lh0/g2;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/g2;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/g2;

    invoke-direct {v0, p0, p1}, Lh0/g2;-><init>(Lh0/h2;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lh0/g2;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/g2;->y:I

    iget-object v3, p0, Lh0/h2;->z:Lmc3/c;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lh0/h2;->x:Z

    if-nez p1, :cond_4

    iget-boolean p1, p0, Lh0/h2;->y:Z

    if-nez p1, :cond_4

    iput v4, v0, Lh0/g2;->y:I

    invoke-virtual {v3, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    invoke-virtual {v3, p1}, Lmc3/c;->i(Ljava/lang/Object;)V

    :cond_4
    iget-boolean p1, p0, Lh0/h2;->x:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final f0(F)F
    .locals 1

    iget-object v0, p0, Lh0/h2;->w:Ly3/c;

    invoke-interface {v0, p1}, Ly3/c;->f0(F)F

    move-result p1

    return p1
.end method

.method public final getDensity()F
    .locals 1

    iget-object v0, p0, Lh0/h2;->w:Ly3/c;

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v0

    return v0
.end method

.method public final h(F)J
    .locals 2

    iget-object v0, p0, Lh0/h2;->w:Ly3/c;

    invoke-interface {v0, p1}, Ly3/c;->h(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final i(J)J
    .locals 1

    iget-object v0, p0, Lh0/h2;->w:Ly3/c;

    invoke-interface {v0, p1, p2}, Ly3/c;->i(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final l(J)F
    .locals 1

    iget-object v0, p0, Lh0/h2;->w:Ly3/c;

    invoke-interface {v0, p1, p2}, Ly3/c;->l(J)F

    move-result p1

    return p1
.end method

.method public final m0()F
    .locals 1

    iget-object v0, p0, Lh0/h2;->w:Ly3/c;

    invoke-interface {v0}, Ly3/c;->m0()F

    move-result v0

    return v0
.end method

.method public final q(F)J
    .locals 2

    iget-object v0, p0, Lh0/h2;->w:Ly3/c;

    invoke-interface {v0, p1}, Ly3/c;->q(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final q0(F)F
    .locals 1

    iget-object v0, p0, Lh0/h2;->w:Ly3/c;

    invoke-interface {v0, p1}, Ly3/c;->q0(F)F

    move-result p1

    return p1
.end method
