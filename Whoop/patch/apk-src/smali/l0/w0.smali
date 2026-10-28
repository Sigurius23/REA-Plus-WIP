.class public final Ll0/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c0;
.implements Lz2/c;
.implements Lz2/f;


# instance fields
.field public final w:Ll0/b2;

.field public final x:Lp1/k1;

.field public final y:Lp1/k1;


# direct methods
.method public constructor <init>(Ll0/b2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/w0;->w:Ll0/b2;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Ll0/w0;->x:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Ll0/w0;->y:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 6

    iget-object v0, p0, Ll0/w0;->x:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll0/b2;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ll0/b2;->a(Ly3/c;Ly3/m;)I

    move-result v1

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll0/b2;

    invoke-interface {v2, p1}, Ll0/b2;->d(Ly3/c;)I

    move-result v2

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll0/b2;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v4

    invoke-interface {v3, p1, v4}, Ll0/b2;->b(Ly3/c;Ly3/m;)I

    move-result v3

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/b2;

    invoke-interface {v0, p1}, Ll0/b2;->c(Ly3/c;)I

    move-result v0

    add-int/2addr v3, v1

    add-int/2addr v0, v2

    neg-int v4, v3

    neg-int v5, v0

    invoke-static {v4, p3, p4, v5}, Ly3/b;->i(IJI)J

    move-result-wide v4

    invoke-interface {p2, v4, v5}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget v4, p2, Ly2/j1;->w:I

    add-int/2addr v4, v3

    invoke-static {v4, p3, p4}, Ly3/b;->g(IJ)I

    move-result v3

    iget v4, p2, Ly2/j1;->x:I

    add-int/2addr v4, v0

    invoke-static {v4, p3, p4}, Ly3/b;->f(IJ)I

    move-result p3

    new-instance p4, Lg1/p3;

    const/4 v0, 0x1

    invoke-direct {p4, p2, v1, v2, v0}, Lg1/p3;-><init>(Ly2/j1;III)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, v3, p3, p2, p4}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ll0/b2;
    .locals 1

    iget-object v0, p0, Ll0/w0;->y:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/b2;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ll0/w0;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Ll0/w0;

    iget-object p1, p1, Ll0/w0;->w:Ll0/b2;

    iget-object v0, p0, Ll0/w0;->w:Ll0/b2;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getKey()Lz2/h;
    .locals 1

    sget-object v0, Ll0/f;->d:Lz2/h;

    return-object v0
.end method

.method public final h(Lz2/g;)V
    .locals 3

    sget-object v0, Ll0/f;->d:Lz2/h;

    invoke-interface {p1, v0}, Lz2/g;->a(Lz2/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll0/b2;

    new-instance v0, Ll0/g0;

    iget-object v1, p0, Ll0/w0;->w:Ll0/b2;

    invoke-direct {v0, v1, p1}, Ll0/g0;-><init>(Ll0/b2;Ll0/b2;)V

    iget-object v2, p0, Ll0/w0;->x:Lp1/k1;

    invoke-virtual {v2, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    new-instance v0, Ll0/w1;

    invoke-direct {v0, p1, v1}, Ll0/w1;-><init>(Ll0/b2;Ll0/b2;)V

    iget-object p1, p0, Ll0/w0;->y:Lp1/k1;

    invoke-virtual {p1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ll0/w0;->w:Ll0/b2;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
