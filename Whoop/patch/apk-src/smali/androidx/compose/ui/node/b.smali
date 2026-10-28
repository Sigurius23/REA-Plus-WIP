.class public final Landroidx/compose/ui/node/b;
.super Landroidx/compose/ui/node/NodeCoordinator;
.source "SourceFile"


# static fields
.field public static final r0:Li2/h;


# instance fields
.field public p0:La3/c0;

.field public q0:La3/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Li2/w0;->j()Li2/h;

    move-result-object v0

    sget-wide v1, Li2/x;->i:J

    invoke-virtual {v0, v1, v2}, Li2/h;->e(J)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Li2/h;->l(F)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Li2/h;->m(I)V

    sput-object v0, Landroidx/compose/ui/node/b;->r0:Li2/h;

    return-void
.end method

.method public constructor <init>(La3/n0;La3/c0;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/node/NodeCoordinator;-><init>(La3/n0;)V

    iput-object p2, p0, Landroidx/compose/ui/node/b;->p0:La3/c0;

    iget-object p1, p1, La3/n0;->G:La3/n0;

    if-eqz p1, :cond_0

    new-instance p1, La3/d0;

    invoke-direct {p1, p0}, La3/d0;-><init>(Landroidx/compose/ui/node/b;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Landroidx/compose/ui/node/b;->q0:La3/d0;

    check-cast p2, Lb2/v;

    iget-object p1, p2, Lb2/v;->w:Lb2/v;

    iget p1, p1, Lb2/v;->y:I

    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final C(I)I
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/node/b;->p0:La3/c0;

    iget-object v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, La3/c0;->y(La3/w0;Ly2/q0;I)I

    move-result p1

    return p1
.end method

.method public final F0(Ly2/a;)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/b;->q0:La3/d0;

    if-eqz v0, :cond_1

    iget-object v0, v0, La3/x0;->T:La0/m0;

    invoke-virtual {v0, p1}, La0/m0;->d(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    iget-object v0, v0, La0/m0;->c:[I

    aget p1, v0, p1

    return p1

    :cond_0
    const/high16 p1, -0x80000000

    return p1

    :cond_1
    invoke-static {p0, p1}, Le4/a;->m(La3/w0;Ly2/a;)I

    move-result p1

    return p1
.end method

.method public final I1()V
    .locals 1

    iget-boolean v0, p0, La3/w0;->J:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->s1()V

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->O0()Ly2/s0;

    move-result-object v0

    invoke-interface {v0}, Ly2/s0;->b()V

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public final J1(La3/c0;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/b;->p0:La3/c0;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, Lb2/v;

    iget-object v0, v0, Lb2/v;->w:Lb2/v;

    iget v0, v0, Lb2/v;->y:I

    and-int/lit16 v0, v0, 0x200

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Landroidx/compose/ui/node/b;->p0:La3/c0;

    return-void
.end method

.method public final O(I)I
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/node/b;->p0:La3/c0;

    iget-object v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, La3/c0;->g0(La3/w0;Ly2/q0;I)I

    move-result p1

    return p1
.end method

.method public final Q(I)I
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/node/b;->p0:La3/c0;

    iget-object v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, La3/c0;->o(La3/w0;Ly2/q0;I)I

    move-result p1

    return p1
.end method

.method public final T(J)Ly2/j1;
    .locals 2

    invoke-virtual {p0, p1, p2}, Ly2/j1;->v0(J)V

    iget-object v0, p0, Landroidx/compose/ui/node/b;->p0:La3/c0;

    iget-object v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1, p2}, La3/c0;->b(Ly2/t0;Ly2/q0;J)Ly2/s0;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/NodeCoordinator;->z1(Ly2/s0;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->r1()V

    return-object p0
.end method

.method public final b(I)I
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/node/b;->p0:La3/c0;

    iget-object v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, La3/c0;->E(La3/w0;Ly2/q0;I)I

    move-result p1

    return p1
.end method

.method public final b1()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/b;->q0:La3/d0;

    if-nez v0, :cond_0

    new-instance v0, La3/d0;

    invoke-direct {v0, p0}, La3/d0;-><init>(Landroidx/compose/ui/node/b;)V

    iput-object v0, p0, Landroidx/compose/ui/node/b;->q0:La3/d0;

    :cond_0
    return-void
.end method

.method public final e1()La3/x0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/b;->q0:La3/d0;

    return-object v0
.end method

.method public final g1()Lb2/v;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/b;->p0:La3/c0;

    check-cast v0, Lb2/v;

    iget-object v0, v0, Lb2/v;->w:Lb2/v;

    return-object v0
.end method

.method public final o0(JFLkotlin/jvm/functions/Function1;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/ui/node/NodeCoordinator;->w1(JFLkotlin/jvm/functions/Function1;Ll2/c;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/b;->I1()V

    return-void
.end method

.method public final p0(JFLl2/c;)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/ui/node/NodeCoordinator;->w1(JFLkotlin/jvm/functions/Function1;Ll2/c;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/b;->I1()V

    return-void
.end method

.method public final v1(Li2/v;Ll2/c;)V
    .locals 9

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->Z0(Li2/v;Ll2/c;)V

    iget-object p2, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-static {p2}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object p2

    invoke-interface {p2}, Landroidx/compose/ui/node/Owner;->getShowLayoutBounds()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz p2, :cond_1

    iget-wide v0, p0, Ly2/j1;->y:J

    iget-wide v2, p2, Ly2/j1;->y:J

    invoke-static {v0, v1, v2, v3}, Ly3/l;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p2, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Ly3/j;->b(JJ)Z

    move-result p2

    if-nez p2, :cond_1

    :cond_0
    iget-wide v0, p0, Ly2/j1;->y:J

    const/16 p2, 0x20

    shr-long v2, v0, p2

    long-to-int p2, v2

    int-to-float p2, p2

    const/high16 v2, 0x3f000000    # 0.5f

    sub-float v6, p2, v2

    const-wide v3, 0xffffffffL

    and-long/2addr v0, v3

    long-to-int p2, v0

    int-to-float p2, p2

    sub-float v7, p2, v2

    const/high16 v4, 0x3f000000    # 0.5f

    const/high16 v5, 0x3f000000    # 0.5f

    sget-object v8, Landroidx/compose/ui/node/b;->r0:Li2/h;

    move-object v3, p1

    invoke-interface/range {v3 .. v8}, Li2/v;->b(FFFFLi2/q0;)V

    :cond_1
    return-void
.end method
