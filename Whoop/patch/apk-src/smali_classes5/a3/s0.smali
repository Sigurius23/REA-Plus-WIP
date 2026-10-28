.class public final La3/s0;
.super La3/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(La3/c1;)V
    .locals 0

    invoke-direct {p0, p1}, La3/a;-><init>(La3/b;)V

    return-void
.end method


# virtual methods
.method public final b(Landroidx/compose/ui/node/NodeCoordinator;J)J
    .locals 7

    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v0, p1, La3/x0;->P:J

    const/16 p1, 0x20

    shr-long v2, v0, p1

    long-to-int v2, v2

    int-to-float v2, v2

    const-wide v3, 0xffffffffL

    and-long/2addr v0, v3

    long-to-int v0, v0

    int-to-float v0, v0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v5, v0

    shl-long v0, v1, p1

    and-long v2, v5, v3

    or-long/2addr v0, v2

    invoke-static {v0, v1, p2, p3}, Lh2/b;->h(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final c(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;
    .locals 0

    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, La3/x0;->O0()Ly2/s0;

    move-result-object p1

    invoke-interface {p1}, Ly2/s0;->a()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final d(Landroidx/compose/ui/node/NodeCoordinator;Ly2/a;)I
    .locals 0

    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, La3/w0;->c0(Ly2/a;)I

    move-result p1

    return p1
.end method
