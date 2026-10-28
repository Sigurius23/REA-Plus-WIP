.class public final Ly2/k0;
.super La3/i0;
.source "SourceFile"


# instance fields
.field public final synthetic b:Ly2/n0;

.field public final synthetic c:Lc93/m;


# direct methods
.method public constructor <init>(Ly2/n0;Lc93/m;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ly2/k0;->b:Ly2/n0;

    iput-object p2, p0, Ly2/k0;->c:Lc93/m;

    invoke-direct {p0, p3}, La3/i0;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 3

    iget-object p2, p0, Ly2/k0;->b:Ly2/n0;

    iget-object v0, p2, Ly2/n0;->H:Ly2/h0;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v1

    iput-object v1, v0, Ly2/h0;->w:Ly3/m;

    invoke-interface {p1}, Ly3/c;->getDensity()F

    move-result v1

    iput v1, v0, Ly2/h0;->x:F

    invoke-interface {p1}, Ly3/c;->m0()F

    move-result v1

    iput v1, v0, Ly2/h0;->y:F

    invoke-interface {p1}, Ly2/r;->A()Z

    move-result p1

    iget-object v1, p0, Ly2/k0;->c:Lc93/m;

    const/4 v2, 0x0

    if-nez p1, :cond_0

    iget-object p1, p2, Ly2/n0;->w:La3/n0;

    iget-object p1, p1, La3/n0;->G:La3/n0;

    if-eqz p1, :cond_0

    iput v2, p2, Ly2/n0;->E:I

    iget-object p1, p2, Ly2/n0;->I:Ly2/e0;

    new-instance v0, Ly3/a;

    invoke-direct {v0, p3, p4}, Ly3/a;-><init>(J)V

    invoke-interface {v1, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly2/s0;

    iget p3, p2, Ly2/n0;->E:I

    new-instance p4, Ly2/i0;

    invoke-direct {p4, p1, p2, p3, p1}, Ly2/i0;-><init>(Ly2/s0;Ly2/n0;ILy2/s0;)V

    return-object p4

    :cond_0
    iput v2, p2, Ly2/n0;->z:I

    new-instance p1, Ly3/a;

    invoke-direct {p1, p3, p4}, Ly3/a;-><init>(J)V

    invoke-interface {v1, v0, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly2/s0;

    iget p3, p2, Ly2/n0;->z:I

    new-instance p4, Ly2/j0;

    invoke-direct {p4, p1, p2, p3, p1}, Ly2/j0;-><init>(Ly2/s0;Ly2/n0;ILy2/s0;)V

    return-object p4
.end method
