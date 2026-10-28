.class public final Lc1/a;
.super La3/o;
.source "SourceFile"

# interfaces
.implements La3/f2;
.implements Lg2/e;
.implements Lg2/t;


# instance fields
.field public Q:Lc93/a;

.field public R:Z

.field public final S:Lu2/h0;


# direct methods
.method public constructor <init>(Lc93/a;)V
    .locals 1

    invoke-direct {p0}, La3/o;-><init>()V

    iput-object p1, p0, Lc1/a;->Q:Lc93/a;

    new-instance p1, La1/f;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, La1/f;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lu2/c0;->a(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lu2/h0;

    move-result-object p1

    invoke-virtual {p0, p1}, La3/o;->X0(La3/n;)La3/n;

    iput-object p1, p0, Lc1/a;->S:Lu2/h0;

    return-void
.end method


# virtual methods
.method public final S()J
    .locals 5

    sget-object v0, Landroidx/compose/foundation/text/handwriting/a;->a:La3/q;

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v1

    iget-object v1, v1, La3/n0;->X:Ly3/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, La3/n2;->b:I

    iget v2, v0, La3/q;->a:F

    invoke-interface {v1, v2}, Ly3/c;->F(F)I

    move-result v2

    iget v3, v0, La3/q;->b:F

    invoke-interface {v1, v3}, Ly3/c;->F(F)I

    move-result v3

    iget v4, v0, La3/q;->c:F

    invoke-interface {v1, v4}, Ly3/c;->F(F)I

    move-result v4

    iget v0, v0, La3/q;->d:F

    invoke-interface {v1, v0}, Ly3/c;->F(F)I

    move-result v0

    invoke-static {v2, v3, v4, v0}, La3/m2;->c(IIII)J

    move-result-wide v0

    return-wide v0
.end method

.method public final b0()V
    .locals 1

    iget-object v0, p0, Lc1/a;->S:Lu2/h0;

    invoke-virtual {v0}, Lu2/h0;->b0()V

    return-void
.end method

.method public final k(Lg2/w;)V
    .locals 0

    invoke-virtual {p1}, Lg2/w;->b()Z

    move-result p1

    iput-boolean p1, p0, Lc1/a;->R:Z

    return-void
.end method

.method public final r0(Lu2/k;Lu2/l;J)V
    .locals 1

    iget-object v0, p0, Lc1/a;->S:Lu2/h0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lu2/h0;->r0(Lu2/k;Lu2/l;J)V

    return-void
.end method
