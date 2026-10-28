.class public final Ly2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/t0;
.implements Ly2/r;


# instance fields
.field public final synthetic w:Ly2/r;

.field public final x:Ly3/m;


# direct methods
.method public constructor <init>(Ly2/r;Ly3/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/v;->w:Ly2/r;

    iput-object p2, p0, Ly2/v;->x:Ly3/m;

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    iget-object v0, p0, Ly2/v;->w:Ly2/r;

    invoke-interface {v0}, Ly2/r;->A()Z

    move-result v0

    return v0
.end method

.method public final D0(J)J
    .locals 1

    iget-object v0, p0, Ly2/v;->w:Ly2/r;

    invoke-interface {v0, p1, p2}, Ly3/c;->D0(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final F(F)I
    .locals 1

    iget-object v0, p0, Ly2/v;->w:Ly2/r;

    invoke-interface {v0, p1}, Ly3/c;->F(F)I

    move-result p1

    return p1
.end method

.method public final K(J)F
    .locals 1

    iget-object v0, p0, Ly2/v;->w:Ly2/r;

    invoke-interface {v0, p1, p2}, Ly3/c;->K(J)F

    move-result p1

    return p1
.end method

.method public final e0(I)F
    .locals 1

    iget-object v0, p0, Ly2/v;->w:Ly2/r;

    invoke-interface {v0, p1}, Ly3/c;->e0(I)F

    move-result p1

    return p1
.end method

.method public final f0(F)F
    .locals 1

    iget-object v0, p0, Ly2/v;->w:Ly2/r;

    invoke-interface {v0, p1}, Ly3/c;->f0(F)F

    move-result p1

    return p1
.end method

.method public final getDensity()F
    .locals 1

    iget-object v0, p0, Ly2/v;->w:Ly2/r;

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v0

    return v0
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    iget-object v0, p0, Ly2/v;->x:Ly3/m;

    return-object v0
.end method

.method public final h(F)J
    .locals 2

    iget-object v0, p0, Ly2/v;->w:Ly2/r;

    invoke-interface {v0, p1}, Ly3/c;->h(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final i(J)J
    .locals 1

    iget-object v0, p0, Ly2/v;->w:Ly2/r;

    invoke-interface {v0, p1, p2}, Ly3/c;->i(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final l(J)F
    .locals 1

    iget-object v0, p0, Ly2/v;->w:Ly2/r;

    invoke-interface {v0, p1, p2}, Ly3/c;->l(J)F

    move-result p1

    return p1
.end method

.method public final m0()F
    .locals 1

    iget-object v0, p0, Ly2/v;->w:Ly2/r;

    invoke-interface {v0}, Ly3/c;->m0()F

    move-result v0

    return v0
.end method

.method public final q(F)J
    .locals 2

    iget-object v0, p0, Ly2/v;->w:Ly2/r;

    invoke-interface {v0, p1}, Ly3/c;->q(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final q0(F)F
    .locals 1

    iget-object v0, p0, Ly2/v;->w:Ly2/r;

    invoke-interface {v0, p1}, Ly3/c;->q0(F)F

    move-result p1

    return p1
.end method

.method public final w0(J)I
    .locals 1

    iget-object v0, p0, Ly2/v;->w:Ly2/r;

    invoke-interface {v0, p1, p2}, Ly3/c;->w0(J)I

    move-result p1

    return p1
.end method

.method public final x0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ly2/s0;
    .locals 1

    const/4 p5, 0x0

    if-gez p1, :cond_0

    move p1, p5

    :cond_0
    if-gez p2, :cond_1

    move p2, p5

    :cond_1
    const/high16 p5, -0x1000000

    and-int v0, p1, p5

    if-nez v0, :cond_2

    and-int/2addr p5, p2

    if-nez p5, :cond_2

    goto :goto_0

    :cond_2
    new-instance p5, Ljava/lang/StringBuilder;

    const-string v0, "Size("

    invoke-direct {p5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " x "

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ") is out of range. Each dimension must be between 0 and 16777215."

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_0
    new-instance p5, Ly2/u;

    invoke-direct {p5, p1, p2, p3, p4}, Ly2/u;-><init>(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)V

    return-object p5
.end method
