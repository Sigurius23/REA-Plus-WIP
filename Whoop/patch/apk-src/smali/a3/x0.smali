.class public abstract La3/x0;
.super La3/w0;
.source "SourceFile"

# interfaces
.implements Ly2/q0;


# instance fields
.field public final O:Landroidx/compose/ui/node/NodeCoordinator;

.field public P:J

.field public Q:Ljava/util/LinkedHashMap;

.field public final R:Ly2/p0;

.field public S:Ly2/s0;

.field public final T:La0/m0;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 2

    invoke-direct {p0}, La3/w0;-><init>()V

    iput-object p1, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, La3/x0;->P:J

    new-instance p1, Ly2/p0;

    invoke-direct {p1, p0}, Ly2/p0;-><init>(La3/x0;)V

    iput-object p1, p0, La3/x0;->R:Ly2/p0;

    sget-object p1, La0/z0;->a:La0/m0;

    new-instance p1, La0/m0;

    invoke-direct {p1}, La0/m0;-><init>()V

    iput-object p1, p0, La3/x0;->T:La0/m0;

    return-void
.end method

.method public static final V0(La3/x0;Ly2/s0;)V
    .locals 6

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ly2/s0;->getWidth()I

    move-result v0

    invoke-interface {p1}, Ly2/s0;->getHeight()I

    move-result v1

    int-to-long v2, v0

    const/16 v0, 0x20

    shl-long/2addr v2, v0

    int-to-long v0, v1

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Ly2/j1;->r0(J)V

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ly2/j1;->r0(J)V

    :goto_0
    iget-object v0, p0, La3/x0;->S:Ly2/s0;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz p1, :cond_4

    iget-object v0, p0, La3/x0;->Q:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    invoke-interface {p1}, Ly2/s0;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_2
    invoke-interface {p1}, Ly2/s0;->a()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, La3/x0;->Q:Ljava/util/LinkedHashMap;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v0}, La3/n0;->t()La3/r0;

    move-result-object v0

    iget-object v0, v0, La3/r0;->q:La3/c1;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, La3/c1;->S:La3/s0;

    invoke-virtual {v0}, La3/a;->g()V

    iget-object v0, p0, La3/x0;->Q:Ljava/util/LinkedHashMap;

    if-nez v0, :cond_3

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, La3/x0;->Q:Ljava/util/LinkedHashMap;

    :cond_3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    invoke-interface {p1}, Ly2/s0;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_4
    iput-object p1, p0, La3/x0;->S:Ly2/s0;

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final I0()La3/w0;
    .locals 1

    iget-object v0, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final L0()Ly2/y;
    .locals 1

    iget-object v0, p0, La3/x0;->R:Ly2/p0;

    return-object v0
.end method

.method public final M0()Z
    .locals 1

    iget-object v0, p0, La3/x0;->S:Ly2/s0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final N0()La3/n0;
    .locals 1

    iget-object v0, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    return-object v0
.end method

.method public final O0()Ly2/s0;
    .locals 1

    iget-object v0, p0, La3/x0;->S:Ly2/s0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "LookaheadDelegate has not been measured yet when measureResult is requested."

    invoke-static {v0}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object v0

    throw v0
.end method

.method public final P0()La3/w0;
    .locals 1

    iget-object v0, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final Q0()J
    .locals 2

    iget-wide v0, p0, La3/x0;->P:J

    return-wide v0
.end method

.method public final U0()V
    .locals 4

    iget-wide v0, p0, La3/x0;->P:J

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, La3/x0;->o0(JFLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public W0()V
    .locals 1

    invoke-virtual {p0}, La3/x0;->O0()Ly2/s0;

    move-result-object v0

    invoke-interface {v0}, Ly2/s0;->b()V

    return-void
.end method

.method public final X0(J)V
    .locals 2

    iget-wide v0, p0, La3/x0;->P:J

    invoke-static {v0, v1, p1, p2}, Ly3/j;->b(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    iput-wide p1, p0, La3/x0;->P:J

    iget-object p1, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object p2, p1, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {p2}, La3/n0;->t()La3/r0;

    move-result-object p2

    iget-object p2, p2, La3/r0;->q:La3/c1;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, La3/c1;->G0()V

    :cond_0
    invoke-static {p1}, La3/w0;->S0(Landroidx/compose/ui/node/NodeCoordinator;)V

    :cond_1
    iget-boolean p1, p0, La3/w0;->K:Z

    if-nez p1, :cond_2

    invoke-virtual {p0}, La3/x0;->O0()Ly2/s0;

    move-result-object p1

    invoke-virtual {p0, p1}, La3/w0;->H0(Ly2/s0;)V

    :cond_2
    return-void
.end method

.method public final Y0(La3/x0;Z)J
    .locals 5

    const-wide/16 v0, 0x0

    move-object v2, p0

    :goto_0
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-boolean v3, v2, La3/w0;->I:Z

    if-eqz v3, :cond_0

    if-nez p2, :cond_1

    :cond_0
    iget-wide v3, v2, La3/x0;->P:J

    invoke-static {v0, v1, v3, v4}, Ly3/j;->d(JJ)J

    move-result-wide v0

    :cond_1
    iget-object v2, v2, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v2, v2, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-wide v0
.end method

.method public final getDensity()F
    .locals 1

    iget-object v0, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->getDensity()F

    move-result v0

    return v0
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    iget-object v0, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    iget-object v0, v0, La3/n0;->Y:Ly3/m;

    return-object v0
.end method

.method public final m0()F
    .locals 1

    iget-object v0, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->m0()F

    move-result v0

    return v0
.end method

.method public final o0(JFLkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, La3/x0;->X0(J)V

    iget-boolean p1, p0, La3/w0;->J:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, La3/x0;->W0()V

    return-void
.end method

.method public final p()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->p()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
