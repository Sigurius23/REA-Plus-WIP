.class public abstract Landroidx/compose/ui/node/NodeCoordinator;
.super La3/w0;
.source "SourceFile"

# interfaces
.implements Ly2/q0;
.implements Ly2/y;
.implements La3/b2;


# static fields
.field public static final k0:Li2/x0;

.field public static final l0:La3/z;

.field public static final m0:[F

.field public static final n0:La3/e;

.field public static final o0:La3/e;


# instance fields
.field public final O:La3/n0;

.field public P:Landroidx/compose/ui/node/NodeCoordinator;

.field public Q:Landroidx/compose/ui/node/NodeCoordinator;

.field public R:Z

.field public S:Z

.field public T:Lkotlin/jvm/functions/Function1;

.field public U:Ly3/c;

.field public V:Ly3/m;

.field public W:F

.field public X:Ly2/s0;

.field public Y:La0/m0;

.field public Z:J

.field public a0:F

.field public b0:Lh2/a;

.field public c0:La3/z;

.field public d0:Ll2/c;

.field public e0:Li2/v;

.field public f0:La3/n1;

.field public final g0:La3/o1;

.field public h0:Z

.field public i0:La3/a2;

.field public j0:Ll2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li2/x0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Li2/x0;->x:F

    iput v1, v0, Li2/x0;->y:F

    iput v1, v0, Li2/x0;->z:F

    sget-wide v1, Li2/h0;->a:J

    iput-wide v1, v0, Li2/x0;->H:J

    iput-wide v1, v0, Li2/x0;->I:J

    const/high16 v1, 0x41000000    # 8.0f

    iput v1, v0, Li2/x0;->M:F

    sget-wide v1, Li2/e1;->b:J

    iput-wide v1, v0, Li2/x0;->N:J

    sget-object v1, Li2/w0;->a:Li2/v0;

    iput-object v1, v0, Li2/x0;->O:Li2/a1;

    const/4 v1, 0x0

    iput v1, v0, Li2/x0;->Q:I

    const-wide v1, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v1, v0, Li2/x0;->R:J

    invoke-static {}, Lvb/g;->a()Ly3/d;

    move-result-object v1

    iput-object v1, v0, Li2/x0;->S:Ly3/c;

    sget-object v1, Ly3/m;->w:Ly3/m;

    iput-object v1, v0, Li2/x0;->T:Ly3/m;

    const/4 v1, 0x3

    iput v1, v0, Li2/x0;->V:I

    sput-object v0, Landroidx/compose/ui/node/NodeCoordinator;->k0:Li2/x0;

    new-instance v0, La3/z;

    invoke-direct {v0}, La3/z;-><init>()V

    sput-object v0, Landroidx/compose/ui/node/NodeCoordinator;->l0:La3/z;

    invoke-static {}, Li2/l0;->a()[F

    move-result-object v0

    sput-object v0, Landroidx/compose/ui/node/NodeCoordinator;->m0:[F

    new-instance v0, La3/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, La3/e;-><init>(I)V

    sput-object v0, Landroidx/compose/ui/node/NodeCoordinator;->n0:La3/e;

    new-instance v0, La3/e;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, La3/e;-><init>(I)V

    sput-object v0, Landroidx/compose/ui/node/NodeCoordinator;->o0:La3/e;

    return-void
.end method

.method public constructor <init>(La3/n0;)V
    .locals 2

    invoke-direct {p0}, La3/w0;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    iget-object v0, p1, La3/n0;->X:Ly3/c;

    iput-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->U:Ly3/c;

    iget-object p1, p1, La3/n0;->Y:Ly3/m;

    iput-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->V:Ly3/m;

    const p1, 0x3f4ccccd    # 0.8f

    iput p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->W:F

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    new-instance p1, La3/o1;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, La3/o1;-><init>(Landroidx/compose/ui/node/NodeCoordinator;I)V

    iput-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->g0:La3/o1;

    return-void
.end method

.method public static A1(Ly2/y;)Landroidx/compose/ui/node/NodeCoordinator;
    .locals 1

    instance-of v0, p0, Ly2/p0;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ly2/p0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, Ly2/p0;->w:La3/x0;

    iget-object v0, v0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroidx/compose/ui/node/NodeCoordinator;

    return-object p0
.end method


# virtual methods
.method public final B1(J)J
    .locals 6

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    check-cast v0, Lb3/f2;

    invoke-virtual {v0, p1, p2, v1}, Lb3/f2;->d(JZ)J

    move-result-wide p1

    :cond_0
    iget-wide v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    const/16 v2, 0x20

    shr-long v3, p1, v2

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    shr-long v4, v0, v2

    long-to-int v4, v4

    int-to-float v4, v4

    add-float/2addr v3, v4

    const-wide v4, 0xffffffffL

    and-long/2addr p1, v4

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    and-long/2addr v0, v4

    long-to-int p2, v0

    int-to-float p2, p2

    add-float/2addr p1, p2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v0, p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    shl-long/2addr v0, v2

    and-long/2addr p1, v4

    or-long/2addr p1, v0

    return-wide p1
.end method

.method public final C1()Lh2/c;
    .locals 7

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v0

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0}, Ly2/q1;->h(Ly2/y;)Ly2/y;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->b0:Lh2/a;

    if-nez v1, :cond_1

    new-instance v1, Lh2/a;

    invoke-direct {v1}, Lh2/a;-><init>()V

    iput-object v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->b0:Lh2/a;

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->f1()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Landroidx/compose/ui/node/NodeCoordinator;->X0(J)J

    move-result-wide v2

    const/16 v4, 0x20

    shr-long v4, v2, v4

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    neg-float v5, v5

    iput v5, v1, Lh2/a;->a:F

    const-wide v5, 0xffffffffL

    and-long/2addr v2, v5

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    neg-float v3, v3

    iput v3, v1, Lh2/a;->b:F

    invoke-virtual {p0}, Ly2/j1;->j0()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    add-float/2addr v4, v3

    iput v4, v1, Lh2/a;->c:F

    invoke-virtual {p0}, Ly2/j1;->g0()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    add-float/2addr v2, v3

    iput v2, v1, Lh2/a;->d:F

    move-object v2, p0

    :goto_0
    if-eq v2, v0, :cond_3

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-virtual {v2, v1, v3, v4}, Landroidx/compose/ui/node/NodeCoordinator;->x1(Lh2/a;ZZ)V

    invoke-virtual {v1}, Lh2/a;->b()Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    sget-object v0, Lh2/c;->e:Lh2/c;

    return-object v0

    :cond_2
    iget-object v2, v2, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    new-instance v0, Lh2/c;

    iget v2, v1, Lh2/a;->a:F

    iget v3, v1, Lh2/a;->b:F

    iget v4, v1, Lh2/a;->c:F

    iget v1, v1, Lh2/a;->d:F

    invoke-direct {v0, v2, v3, v4, v1}, Lh2/c;-><init>(FFFF)V

    return-object v0
.end method

.method public final D1(Landroidx/compose/ui/node/NodeCoordinator;[F)V
    .locals 5

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->D1(Landroidx/compose/ui/node/NodeCoordinator;[F)V

    iget-wide v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Ly3/j;->b(JJ)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Landroidx/compose/ui/node/NodeCoordinator;->m0:[F

    invoke-static {p1}, Li2/l0;->d([F)V

    iget-wide v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    const/16 v2, 0x20

    shr-long v2, v0, v2

    long-to-int v2, v2

    int-to-float v2, v2

    neg-float v2, v2

    const-wide v3, 0xffffffffL

    and-long/2addr v0, v3

    long-to-int v0, v0

    int-to-float v0, v0

    neg-float v0, v0

    invoke-static {p1, v2, v0}, Li2/l0;->g([FFF)V

    invoke-static {p2, p1}, Li2/l0;->f([F[F)V

    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz p1, :cond_1

    check-cast p1, Lb3/f2;

    invoke-virtual {p1}, Lb3/f2;->a()[F

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p2, p1}, Li2/l0;->f([F[F)V

    :cond_1
    return-void
.end method

.method public final E(J)J
    .locals 1

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->Z(J)J

    move-result-wide p1

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-static {v0}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->F()V

    iget-object v0, v0, Landroidx/compose/ui/platform/AndroidComposeView;->v0:[F

    invoke-static {p1, p2, v0}, Li2/l0;->b(J[F)J

    move-result-wide p1

    return-wide p1
.end method

.method public final E1(Landroidx/compose/ui/node/NodeCoordinator;[F)V
    .locals 7

    move-object v0, p0

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, v0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz v1, :cond_0

    check-cast v1, Lb3/f2;

    invoke-virtual {v1}, Lb3/f2;->b()[F

    move-result-object v1

    invoke-static {p2, v1}, Li2/l0;->f([F[F)V

    :cond_0
    iget-wide v1, v0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    const-wide/16 v3, 0x0

    invoke-static {v1, v2, v3, v4}, Ly3/j;->b(JJ)Z

    move-result v3

    if-nez v3, :cond_1

    sget-object v3, Landroidx/compose/ui/node/NodeCoordinator;->m0:[F

    invoke-static {v3}, Li2/l0;->d([F)V

    const/16 v4, 0x20

    shr-long v4, v1, v4

    long-to-int v4, v4

    int-to-float v4, v4

    const-wide v5, 0xffffffffL

    and-long/2addr v1, v5

    long-to-int v1, v1

    int-to-float v1, v1

    invoke-static {v3, v4, v1}, Li2/l0;->g([FFF)V

    invoke-static {p2, v3}, Li2/l0;->f([F[F)V

    :cond_1
    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final F1(Lkotlin/jvm/functions/Function1;Z)V
    .locals 8

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->j0:Ll2/c;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "layerBlock can\'t be provided when explicitLayer is provided"

    invoke-static {v0}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_1
    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    if-nez p2, :cond_3

    iget-object p2, p0, Landroidx/compose/ui/node/NodeCoordinator;->T:Lkotlin/jvm/functions/Function1;

    if-ne p2, p1, :cond_3

    iget-object p2, p0, Landroidx/compose/ui/node/NodeCoordinator;->U:Ly3/c;

    iget-object v3, v2, La3/n0;->X:Ly3/c;

    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Landroidx/compose/ui/node/NodeCoordinator;->V:Ly3/m;

    iget-object v3, v2, La3/n0;->Y:Ly3/m;

    if-eq p2, v3, :cond_2

    goto :goto_1

    :cond_2
    move p2, v0

    goto :goto_2

    :cond_3
    :goto_1
    move p2, v1

    :goto_2
    iget-object v3, v2, La3/n0;->X:Ly3/c;

    iput-object v3, p0, Landroidx/compose/ui/node/NodeCoordinator;->U:Ly3/c;

    iget-object v3, v2, La3/n0;->Y:Ly3/m;

    iput-object v3, p0, Landroidx/compose/ui/node/NodeCoordinator;->V:Ly3/m;

    invoke-virtual {v2}, La3/n0;->X()Z

    move-result v3

    iget-object v4, p0, Landroidx/compose/ui/node/NodeCoordinator;->g0:La3/o1;

    const/4 v5, 0x0

    if-eqz v3, :cond_7

    if-eqz p1, :cond_7

    iput-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->T:Lkotlin/jvm/functions/Function1;

    iget-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-nez p1, :cond_5

    invoke-static {v2}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object p1

    iget-object p2, p0, Landroidx/compose/ui/node/NodeCoordinator;->f0:La3/n1;

    if-nez p2, :cond_4

    new-instance p2, La3/o1;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, La3/o1;-><init>(Landroidx/compose/ui/node/NodeCoordinator;I)V

    new-instance v0, La3/n1;

    const/4 v3, 0x0

    invoke-direct {v0, v3, p0, p2}, La3/n1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->f0:La3/n1;

    move-object p2, v0

    :cond_4
    check-cast p1, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p1, p2, v4, v5}, Landroidx/compose/ui/platform/AndroidComposeView;->g(Lc93/m;La3/o1;Ll2/c;)La3/a2;

    move-result-object p1

    iget-wide v5, p0, Ly2/j1;->y:J

    move-object p2, p1

    check-cast p2, Lb3/f2;

    invoke-virtual {p2, v5, v6}, Lb3/f2;->f(J)V

    iget-wide v5, p0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    invoke-virtual {p2, v5, v6}, Lb3/f2;->e(J)V

    iput-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    invoke-virtual {p0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->G1(Z)Z

    iput-boolean v1, v2, La3/n0;->h0:Z

    invoke-virtual {v4}, La3/o1;->invoke()Ljava/lang/Object;

    return-void

    :cond_5
    if-eqz p2, :cond_6

    invoke-virtual {p0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->G1(Z)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v2}, La3/n0;->k0()V

    invoke-static {v2}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object p1

    invoke-interface {p1}, Landroidx/compose/ui/node/Owner;->getRectManager()Lj3/b;

    move-result-object p1

    invoke-virtual {p1, v2}, Lj3/b;->f(La3/n0;)V

    :cond_6
    return-void

    :cond_7
    iput-object v5, p0, Landroidx/compose/ui/node/NodeCoordinator;->T:Lkotlin/jvm/functions/Function1;

    iget-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz p1, :cond_d

    check-cast p1, Lb3/f2;

    iget-object p2, p1, Lb3/f2;->y:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p1}, Lb3/f2;->b()[F

    move-result-object v3

    invoke-static {v3}, Li2/w0;->v([F)Z

    move-result v3

    if-nez v3, :cond_8

    invoke-virtual {v2}, La3/n0;->k0()V

    :cond_8
    iput-object v5, p1, Lb3/f2;->z:Lc93/m;

    iput-object v5, p1, Lb3/f2;->E:Lc93/a;

    iput-boolean v1, p1, Lb3/f2;->G:Z

    iget-boolean v3, p1, Lb3/f2;->J:Z

    if-eqz v3, :cond_9

    iput-boolean v0, p1, Lb3/f2;->J:Z

    invoke-virtual {p2, p1, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->z(La3/a2;Z)V

    :cond_9
    iget-object v3, p1, Lb3/f2;->x:Li2/f0;

    if-eqz v3, :cond_c

    iget-object v6, p1, Lb3/f2;->w:Ll2/c;

    invoke-interface {v3, v6}, Li2/f0;->b(Ll2/c;)V

    iget-object v3, p2, Landroidx/compose/ui/platform/AndroidComposeView;->U0:Lwe/o;

    :cond_a
    iget-object v6, v3, Lwe/o;->x:Ljava/lang/Object;

    check-cast v6, Ljava/lang/ref/ReferenceQueue;

    iget-object v7, v3, Lwe/o;->w:Ljava/lang/Object;

    check-cast v7, Lr1/c;

    invoke-virtual {v6}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v6

    if-eqz v6, :cond_b

    invoke-virtual {v7, v6}, Lr1/c;->k(Ljava/lang/Object;)Z

    :cond_b
    if-nez v6, :cond_a

    new-instance v6, Ljava/lang/ref/WeakReference;

    iget-object v3, v3, Lwe/o;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v6, p1, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    invoke-virtual {v7, v6}, Lr1/c;->b(Ljava/lang/Object;)V

    iget-object p2, p2, Landroidx/compose/ui/platform/AndroidComposeView;->a0:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_c
    iput-boolean v1, v2, La3/n0;->h0:Z

    invoke-virtual {v4}, La3/o1;->invoke()Ljava/lang/Object;

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object p1

    iget-boolean p1, p1, Lb2/v;->N:Z

    if-eqz p1, :cond_d

    invoke-virtual {v2}, La3/n0;->Y()Z

    move-result p1

    if-eqz p1, :cond_d

    iget-object p1, v2, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz p1, :cond_d

    check-cast p1, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p1, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->B(La3/n0;)V

    :cond_d
    iput-object v5, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    iput-boolean v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->h0:Z

    return-void
.end method

.method public final G1(Z)Z
    .locals 27

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/ui/node/NodeCoordinator;->j0:Ll2/c;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move/from16 v17, v2

    goto/16 :goto_12

    :cond_0
    iget-object v1, v0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz v1, :cond_34

    iget-object v3, v0, Landroidx/compose/ui/node/NodeCoordinator;->T:Lkotlin/jvm/functions/Function1;

    if-eqz v3, :cond_33

    sget-object v4, Landroidx/compose/ui/node/NodeCoordinator;->k0:Li2/x0;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v4, v5}, Li2/x0;->p(F)V

    invoke-virtual {v4, v5}, Li2/x0;->r(F)V

    invoke-virtual {v4, v5}, Li2/x0;->a(F)V

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Li2/x0;->C(F)V

    invoke-virtual {v4, v5}, Li2/x0;->E(F)V

    invoke-virtual {v4, v5}, Li2/x0;->s(F)V

    sget-wide v6, Li2/h0;->a:J

    invoke-virtual {v4, v6, v7}, Li2/x0;->b(J)V

    invoke-virtual {v4, v6, v7}, Li2/x0;->v(J)V

    invoke-virtual {v4, v5}, Li2/x0;->k(F)V

    invoke-virtual {v4, v5}, Li2/x0;->n(F)V

    invoke-virtual {v4, v5}, Li2/x0;->o(F)V

    const/high16 v6, 0x41000000    # 8.0f

    invoke-virtual {v4, v6}, Li2/x0;->c(F)V

    sget-wide v6, Li2/e1;->b:J

    invoke-virtual {v4, v6, v7}, Li2/x0;->y(J)V

    sget-object v8, Li2/w0;->a:Li2/v0;

    invoke-virtual {v4, v8}, Li2/x0;->t(Li2/a1;)V

    invoke-virtual {v4, v2}, Li2/x0;->e(Z)V

    const/4 v8, 0x0

    invoke-virtual {v4, v8}, Li2/x0;->g(Lal/a;)V

    iget v9, v4, Li2/x0;->V:I

    const/high16 v10, 0x80000

    const/4 v11, 0x3

    if-ne v9, v11, :cond_1

    goto :goto_0

    :cond_1
    iget v9, v4, Li2/x0;->w:I

    or-int/2addr v9, v10

    iput v9, v4, Li2/x0;->w:I

    iput v11, v4, Li2/x0;->V:I

    :goto_0
    invoke-virtual {v4, v2}, Li2/x0;->f(I)V

    const-wide v11, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v11, v4, Li2/x0;->R:J

    iput-object v8, v4, Li2/x0;->W:Li2/p0;

    iput v2, v4, Li2/x0;->w:I

    iget-object v9, v0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    iget-object v13, v9, La3/n0;->X:Ly3/c;

    iput-object v13, v4, Li2/x0;->S:Ly3/c;

    iget-object v13, v9, La3/n0;->Y:Ly3/m;

    iput-object v13, v4, Li2/x0;->T:Ly3/m;

    iget-wide v13, v0, Ly2/j1;->y:J

    invoke-static {v13, v14}, Lv63/b;->l(J)J

    move-result-wide v13

    iput-wide v13, v4, Li2/x0;->R:J

    invoke-static {v9}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v13

    invoke-interface {v13}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()La3/c2;

    move-result-object v13

    sget-object v14, La3/f;->E:La3/f;

    new-instance v15, La3/l0;

    move/from16 v16, v10

    const/4 v10, 0x1

    invoke-direct {v15, v3, v10}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v13, v0, v14, v15}, La3/c2;->a(La3/b2;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    iget-object v3, v0, Landroidx/compose/ui/node/NodeCoordinator;->c0:La3/z;

    if-nez v3, :cond_2

    new-instance v3, La3/z;

    invoke-direct {v3}, La3/z;-><init>()V

    iput-object v3, v0, Landroidx/compose/ui/node/NodeCoordinator;->c0:La3/z;

    :cond_2
    sget-object v10, Landroidx/compose/ui/node/NodeCoordinator;->l0:La3/z;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v13, v3, La3/z;->a:F

    iput v13, v10, La3/z;->a:F

    iget v13, v3, La3/z;->b:F

    iput v13, v10, La3/z;->b:F

    iget v13, v3, La3/z;->c:F

    iput v13, v10, La3/z;->c:F

    iget v13, v3, La3/z;->d:F

    iput v13, v10, La3/z;->d:F

    iget v13, v3, La3/z;->e:F

    iput v13, v10, La3/z;->e:F

    iget v13, v3, La3/z;->f:F

    iput v13, v10, La3/z;->f:F

    iget v13, v3, La3/z;->g:F

    iput v13, v10, La3/z;->g:F

    iget v13, v3, La3/z;->h:F

    iput v13, v10, La3/z;->h:F

    iget-wide v13, v3, La3/z;->i:J

    iput-wide v13, v10, La3/z;->i:J

    iget v13, v4, Li2/x0;->x:F

    iput v13, v3, La3/z;->a:F

    iget v14, v4, Li2/x0;->y:F

    iput v14, v3, La3/z;->b:F

    iget v14, v4, Li2/x0;->E:F

    iput v14, v3, La3/z;->c:F

    iget v14, v4, Li2/x0;->F:F

    iput v14, v3, La3/z;->d:F

    iget v14, v4, Li2/x0;->J:F

    iput v14, v3, La3/z;->e:F

    iget v14, v4, Li2/x0;->K:F

    iput v14, v3, La3/z;->f:F

    iget v14, v4, Li2/x0;->L:F

    iput v14, v3, La3/z;->g:F

    iget v14, v4, Li2/x0;->M:F

    iput v14, v3, La3/z;->h:F

    iget-wide v14, v4, Li2/x0;->N:J

    iput-wide v14, v3, La3/z;->i:J

    check-cast v1, Lb3/f2;

    iget-object v2, v1, Lb3/f2;->y:Landroidx/compose/ui/platform/AndroidComposeView;

    move/from16 v18, v5

    iget v5, v4, Li2/x0;->w:I

    iget v8, v1, Lb3/f2;->N:I

    or-int/2addr v5, v8

    iget-object v8, v4, Li2/x0;->T:Ly3/m;

    iput-object v8, v1, Lb3/f2;->L:Ly3/m;

    iget-object v8, v4, Li2/x0;->S:Ly3/c;

    iput-object v8, v1, Lb3/f2;->K:Ly3/c;

    and-int/lit16 v8, v5, 0x1000

    if-eqz v8, :cond_3

    iput-wide v14, v1, Lb3/f2;->O:J

    :cond_3
    and-int/lit8 v14, v5, 0x1

    if-eqz v14, :cond_5

    iget-object v14, v1, Lb3/f2;->w:Ll2/c;

    iget-object v14, v14, Ll2/c;->a:Ll2/e;

    invoke-interface {v14}, Ll2/e;->z()F

    move-result v15

    cmpg-float v15, v15, v13

    if-nez v15, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v14, v13}, Ll2/e;->q(F)V

    :cond_5
    :goto_1
    and-int/lit8 v13, v5, 0x2

    if-eqz v13, :cond_7

    iget-object v13, v1, Lb3/f2;->w:Ll2/c;

    iget v14, v4, Li2/x0;->y:F

    iget-object v13, v13, Ll2/c;->a:Ll2/e;

    invoke-interface {v13}, Ll2/e;->O()F

    move-result v15

    cmpg-float v15, v15, v14

    if-nez v15, :cond_6

    goto :goto_2

    :cond_6
    invoke-interface {v13, v14}, Ll2/e;->F(F)V

    :cond_7
    :goto_2
    and-int/lit8 v13, v5, 0x4

    if-eqz v13, :cond_8

    iget-object v13, v1, Lb3/f2;->w:Ll2/c;

    iget v14, v4, Li2/x0;->z:F

    invoke-virtual {v13, v14}, Ll2/c;->e(F)V

    :cond_8
    and-int/lit8 v13, v5, 0x8

    if-eqz v13, :cond_a

    iget-object v13, v1, Lb3/f2;->w:Ll2/c;

    iget v14, v4, Li2/x0;->E:F

    iget-object v13, v13, Ll2/c;->a:Ll2/e;

    invoke-interface {v13}, Ll2/e;->J()F

    move-result v15

    cmpg-float v15, v15, v14

    if-nez v15, :cond_9

    goto :goto_3

    :cond_9
    invoke-interface {v13, v14}, Ll2/e;->M(F)V

    :cond_a
    :goto_3
    and-int/lit8 v13, v5, 0x10

    if-eqz v13, :cond_c

    iget-object v13, v1, Lb3/f2;->w:Ll2/c;

    iget v14, v4, Li2/x0;->F:F

    iget-object v13, v13, Ll2/c;->a:Ll2/e;

    invoke-interface {v13}, Ll2/e;->I()F

    move-result v15

    cmpg-float v15, v15, v14

    if-nez v15, :cond_b

    goto :goto_4

    :cond_b
    invoke-interface {v13, v14}, Ll2/e;->c(F)V

    :cond_c
    :goto_4
    and-int/lit8 v13, v5, 0x20

    const/4 v14, 0x1

    if-eqz v13, :cond_e

    iget-object v13, v1, Lb3/f2;->w:Ll2/c;

    iget v15, v4, Li2/x0;->G:F

    iget-object v11, v13, Ll2/c;->a:Ll2/e;

    invoke-interface {v11}, Ll2/e;->N()F

    move-result v12

    cmpg-float v12, v12, v15

    if-nez v12, :cond_d

    goto :goto_5

    :cond_d
    invoke-interface {v11, v15}, Ll2/e;->B(F)V

    iput-boolean v14, v13, Ll2/c;->g:Z

    invoke-virtual {v13}, Ll2/c;->a()V

    :goto_5
    iget v11, v4, Li2/x0;->G:F

    cmpl-float v11, v11, v18

    if-lez v11, :cond_e

    iget-boolean v11, v1, Lb3/f2;->T:Z

    if-nez v11, :cond_e

    iget-object v11, v1, Lb3/f2;->E:Lc93/a;

    if-eqz v11, :cond_e

    invoke-interface {v11}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_e
    and-int/lit8 v11, v5, 0x40

    if-eqz v11, :cond_f

    iget-object v11, v1, Lb3/f2;->w:Ll2/c;

    iget-wide v12, v4, Li2/x0;->H:J

    iget-object v11, v11, Ll2/c;->a:Ll2/e;

    invoke-interface {v11}, Ll2/e;->l()J

    move-result-wide v14

    invoke-static {v12, v13, v14, v15}, Li2/x;->d(JJ)Z

    move-result v14

    if-nez v14, :cond_f

    invoke-interface {v11, v12, v13}, Ll2/e;->o(J)V

    :cond_f
    and-int/lit16 v11, v5, 0x80

    if-eqz v11, :cond_10

    iget-object v11, v1, Lb3/f2;->w:Ll2/c;

    iget-wide v12, v4, Li2/x0;->I:J

    iget-object v11, v11, Ll2/c;->a:Ll2/e;

    invoke-interface {v11}, Ll2/e;->n()J

    move-result-wide v14

    invoke-static {v12, v13, v14, v15}, Li2/x;->d(JJ)Z

    move-result v14

    if-nez v14, :cond_10

    invoke-interface {v11, v12, v13}, Ll2/e;->t(J)V

    :cond_10
    and-int/lit16 v11, v5, 0x400

    if-eqz v11, :cond_12

    iget-object v11, v1, Lb3/f2;->w:Ll2/c;

    iget v12, v4, Li2/x0;->L:F

    iget-object v11, v11, Ll2/c;->a:Ll2/e;

    invoke-interface {v11}, Ll2/e;->k()F

    move-result v13

    cmpg-float v13, v13, v12

    if-nez v13, :cond_11

    goto :goto_6

    :cond_11
    invoke-interface {v11, v12}, Ll2/e;->C(F)V

    :cond_12
    :goto_6
    and-int/lit16 v11, v5, 0x100

    if-eqz v11, :cond_14

    iget-object v11, v1, Lb3/f2;->w:Ll2/c;

    iget v12, v4, Li2/x0;->J:F

    iget-object v11, v11, Ll2/c;->a:Ll2/e;

    invoke-interface {v11}, Ll2/e;->K()F

    move-result v13

    cmpg-float v13, v13, v12

    if-nez v13, :cond_13

    goto :goto_7

    :cond_13
    invoke-interface {v11, v12}, Ll2/e;->w(F)V

    :cond_14
    :goto_7
    and-int/lit16 v11, v5, 0x200

    if-eqz v11, :cond_16

    iget-object v11, v1, Lb3/f2;->w:Ll2/c;

    iget v12, v4, Li2/x0;->K:F

    iget-object v11, v11, Ll2/c;->a:Ll2/e;

    invoke-interface {v11}, Ll2/e;->i()F

    move-result v13

    cmpg-float v13, v13, v12

    if-nez v13, :cond_15

    goto :goto_8

    :cond_15
    invoke-interface {v11, v12}, Ll2/e;->y(F)V

    :cond_16
    :goto_8
    and-int/lit16 v11, v5, 0x800

    if-eqz v11, :cond_18

    iget-object v11, v1, Lb3/f2;->w:Ll2/c;

    iget v12, v4, Li2/x0;->M:F

    iget-object v11, v11, Ll2/c;->a:Ll2/e;

    invoke-interface {v11}, Ll2/e;->r()F

    move-result v13

    cmpg-float v13, v13, v12

    if-nez v13, :cond_17

    goto :goto_9

    :cond_17
    invoke-interface {v11, v12}, Ll2/e;->v(F)V

    :cond_18
    :goto_9
    const-wide v11, 0xffffffffL

    const/16 v13, 0x20

    if-eqz v8, :cond_1a

    iget-wide v14, v1, Lb3/f2;->O:J

    invoke-static {v14, v15, v6, v7}, Li2/e1;->a(JJ)Z

    move-result v6

    if-eqz v6, :cond_19

    iget-object v6, v1, Lb3/f2;->w:Ll2/c;

    iget-wide v7, v6, Ll2/c;->v:J

    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-static {v7, v8, v14, v15}, Lh2/b;->c(JJ)Z

    move-result v7

    if-nez v7, :cond_1a

    iput-wide v14, v6, Ll2/c;->v:J

    iget-object v6, v6, Ll2/c;->a:Ll2/e;

    invoke-interface {v6, v14, v15}, Ll2/e;->G(J)V

    goto :goto_a

    :cond_19
    iget-object v6, v1, Lb3/f2;->w:Ll2/c;

    iget-wide v7, v1, Lb3/f2;->O:J

    invoke-static {v7, v8}, Li2/e1;->b(J)F

    move-result v7

    iget-wide v14, v1, Lb3/f2;->F:J

    shr-long/2addr v14, v13

    long-to-int v8, v14

    int-to-float v8, v8

    mul-float/2addr v7, v8

    iget-wide v14, v1, Lb3/f2;->O:J

    invoke-static {v14, v15}, Li2/e1;->c(J)F

    move-result v8

    iget-wide v14, v1, Lb3/f2;->F:J

    and-long/2addr v14, v11

    long-to-int v14, v14

    int-to-float v14, v14

    mul-float/2addr v8, v14

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v14, v7

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    shl-long/2addr v14, v13

    and-long/2addr v7, v11

    or-long/2addr v7, v14

    iget-wide v14, v6, Ll2/c;->v:J

    invoke-static {v14, v15, v7, v8}, Lh2/b;->c(JJ)Z

    move-result v14

    if-nez v14, :cond_1a

    iput-wide v7, v6, Ll2/c;->v:J

    iget-object v6, v6, Ll2/c;->a:Ll2/e;

    invoke-interface {v6, v7, v8}, Ll2/e;->G(J)V

    :cond_1a
    :goto_a
    and-int/lit16 v6, v5, 0x4000

    if-eqz v6, :cond_1b

    iget-object v6, v1, Lb3/f2;->w:Ll2/c;

    iget-boolean v7, v4, Li2/x0;->P:Z

    iget-boolean v8, v6, Ll2/c;->w:Z

    if-eq v8, v7, :cond_1b

    iput-boolean v7, v6, Ll2/c;->w:Z

    const/4 v7, 0x1

    iput-boolean v7, v6, Ll2/c;->g:Z

    invoke-virtual {v6}, Ll2/c;->a()V

    :cond_1b
    const/high16 v6, 0x20000

    and-int/2addr v6, v5

    if-eqz v6, :cond_1c

    iget-object v6, v1, Lb3/f2;->w:Ll2/c;

    iget-object v7, v4, Li2/x0;->U:Lal/a;

    iget-object v6, v6, Ll2/c;->a:Ll2/e;

    invoke-interface {v6}, Ll2/e;->b()Lal/a;

    move-result-object v8

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1c

    invoke-interface {v6, v7}, Ll2/e;->m(Lal/a;)V

    :cond_1c
    const/high16 v6, 0x40000

    and-int/2addr v6, v5

    if-eqz v6, :cond_1d

    iget-object v6, v1, Lb3/f2;->w:Ll2/c;

    iget-object v6, v6, Ll2/c;->a:Ll2/e;

    invoke-interface {v6}, Ll2/e;->h()Li2/y;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1d

    invoke-interface {v6}, Ll2/e;->p()V

    :cond_1d
    and-int v6, v5, v16

    if-eqz v6, :cond_1f

    iget-object v6, v1, Lb3/f2;->w:Ll2/c;

    iget v7, v4, Li2/x0;->V:I

    iget-object v6, v6, Ll2/c;->a:Ll2/e;

    invoke-interface {v6}, Ll2/e;->x()I

    move-result v8

    if-ne v8, v7, :cond_1e

    goto :goto_b

    :cond_1e
    invoke-interface {v6, v7}, Ll2/e;->d(I)V

    :cond_1f
    :goto_b
    const v6, 0x8000

    and-int/2addr v6, v5

    if-eqz v6, :cond_24

    iget-object v6, v1, Lb3/f2;->w:Ll2/c;

    iget v7, v4, Li2/x0;->Q:I

    if-nez v7, :cond_20

    const/4 v8, 0x0

    goto :goto_c

    :cond_20
    const/4 v8, 0x1

    if-ne v7, v8, :cond_21

    const/4 v8, 0x1

    goto :goto_c

    :cond_21
    const/4 v8, 0x2

    if-ne v7, v8, :cond_23

    :goto_c
    iget-object v6, v6, Ll2/c;->a:Ll2/e;

    invoke-interface {v6}, Ll2/e;->g()I

    move-result v7

    if-ne v7, v8, :cond_22

    goto :goto_d

    :cond_22
    invoke-interface {v6, v8}, Ll2/e;->L(I)V

    goto :goto_d

    :cond_23
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Not supported composition strategy"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_24
    :goto_d
    and-int/lit16 v6, v5, 0x1f1b

    if-eqz v6, :cond_25

    const/4 v7, 0x1

    iput-boolean v7, v1, Lb3/f2;->Q:Z

    iput-boolean v7, v1, Lb3/f2;->R:Z

    :cond_25
    iget-object v6, v1, Lb3/f2;->P:Li2/p0;

    iget-object v7, v4, Li2/x0;->W:Li2/p0;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2c

    iget-object v6, v4, Li2/x0;->W:Li2/p0;

    iput-object v6, v1, Lb3/f2;->P:Li2/p0;

    if-nez v6, :cond_26

    goto/16 :goto_f

    :cond_26
    iget-object v7, v1, Lb3/f2;->w:Ll2/c;

    instance-of v8, v6, Li2/n0;

    if-eqz v8, :cond_27

    move-object v8, v6

    check-cast v8, Li2/n0;

    iget-object v8, v8, Li2/n0;->a:Lh2/c;

    iget v14, v8, Lh2/c;->a:F

    iget v15, v8, Lh2/c;->b:F

    move-wide/from16 v21, v11

    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v11

    int-to-long v11, v11

    move/from16 v16, v13

    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v13

    move-wide/from16 v19, v11

    int-to-long v11, v13

    shl-long v19, v19, v16

    and-long v11, v11, v21

    or-long v11, v19, v11

    iget v13, v8, Lh2/c;->c:F

    sub-float/2addr v13, v14

    iget v8, v8, Lh2/c;->d:F

    sub-float/2addr v8, v15

    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v13

    int-to-long v13, v13

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    move-object v15, v7

    int-to-long v7, v8

    shl-long v13, v13, v16

    and-long v7, v7, v21

    or-long v24, v13, v7

    const/16 v26, 0x0

    move-wide/from16 v22, v11

    move-object/from16 v21, v15

    invoke-virtual/range {v21 .. v26}, Ll2/c;->f(JJF)V

    goto/16 :goto_e

    :cond_27
    move-object v15, v7

    move-wide/from16 v21, v11

    move/from16 v16, v13

    instance-of v7, v6, Li2/m0;

    const-wide/16 v11, 0x0

    if-eqz v7, :cond_28

    move-object v7, v6

    check-cast v7, Li2/m0;

    iget-object v7, v7, Li2/m0;->a:Li2/s0;

    const/4 v8, 0x0

    iput-object v8, v15, Ll2/c;->k:Li2/p0;

    const-wide v13, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v13, v15, Ll2/c;->i:J

    iput-wide v11, v15, Ll2/c;->h:J

    move/from16 v8, v18

    iput v8, v15, Ll2/c;->j:F

    const/4 v8, 0x1

    iput-boolean v8, v15, Ll2/c;->g:Z

    const/4 v8, 0x0

    iput-boolean v8, v15, Ll2/c;->n:Z

    iput-object v7, v15, Ll2/c;->l:Li2/s0;

    invoke-virtual {v15}, Ll2/c;->a()V

    goto :goto_e

    :cond_28
    instance-of v7, v6, Li2/o0;

    if-eqz v7, :cond_2b

    move-object v7, v6

    check-cast v7, Li2/o0;

    iget-object v8, v7, Li2/o0;->b:Li2/j;

    if-eqz v8, :cond_29

    const/4 v13, 0x0

    iput-object v13, v15, Ll2/c;->k:Li2/p0;

    const-wide v13, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v13, v15, Ll2/c;->i:J

    iput-wide v11, v15, Ll2/c;->h:J

    const/4 v7, 0x0

    iput v7, v15, Ll2/c;->j:F

    const/4 v11, 0x1

    iput-boolean v11, v15, Ll2/c;->g:Z

    const/4 v7, 0x0

    iput-boolean v7, v15, Ll2/c;->n:Z

    iput-object v8, v15, Ll2/c;->l:Li2/s0;

    invoke-virtual {v15}, Ll2/c;->a()V

    goto :goto_e

    :cond_29
    const/4 v11, 0x1

    iget-object v7, v7, Li2/o0;->a:Lh2/d;

    iget v8, v7, Lh2/d;->a:F

    iget v12, v7, Lh2/d;->b:F

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v13, v8

    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v11, v8

    shl-long v13, v13, v16

    and-long v11, v11, v21

    or-long/2addr v11, v13

    invoke-virtual {v7}, Lh2/d;->b()F

    move-result v8

    invoke-virtual {v7}, Lh2/d;->a()F

    move-result v13

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    move-wide/from16 v19, v11

    int-to-long v11, v8

    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v13, v8

    shl-long v11, v11, v16

    and-long v13, v13, v21

    or-long v24, v11, v13

    iget-wide v7, v7, Lh2/d;->h:J

    shr-long v7, v7, v16

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v26

    move-object/from16 v21, v15

    move-wide/from16 v22, v19

    invoke-virtual/range {v21 .. v26}, Ll2/c;->f(JJF)V

    :goto_e
    instance-of v6, v6, Li2/m0;

    if-eqz v6, :cond_2a

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x21

    if-ge v6, v7, :cond_2a

    iget-object v6, v1, Lb3/f2;->E:Lc93/a;

    if-eqz v6, :cond_2a

    invoke-interface {v6}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_2a
    :goto_f
    const/4 v7, 0x1

    goto :goto_10

    :cond_2b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_2c
    const/4 v7, 0x0

    :goto_10
    iget v6, v4, Li2/x0;->w:I

    iput v6, v1, Lb3/f2;->N:I

    if-nez v5, :cond_2d

    if-eqz v7, :cond_2f

    :cond_2d
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_2e

    invoke-interface {v1, v2, v2}, Landroid/view/ViewParent;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    :cond_2e
    iget-boolean v1, v2, Landroidx/compose/ui/platform/AndroidComposeView;->F:Z

    if-eqz v1, :cond_2f

    const/4 v7, 0x0

    invoke-virtual {v2, v7}, Landroidx/compose/ui/platform/AndroidComposeView;->P(F)V

    :cond_2f
    iget-boolean v1, v0, Landroidx/compose/ui/node/NodeCoordinator;->S:Z

    iget-boolean v2, v4, Li2/x0;->P:Z

    iput-boolean v2, v0, Landroidx/compose/ui/node/NodeCoordinator;->S:Z

    iget v2, v4, Li2/x0;->z:F

    iput v2, v0, Landroidx/compose/ui/node/NodeCoordinator;->W:F

    iget v2, v10, La3/z;->a:F

    iget v4, v3, La3/z;->a:F

    cmpg-float v2, v2, v4

    if-nez v2, :cond_30

    iget v2, v10, La3/z;->b:F

    iget v4, v3, La3/z;->b:F

    cmpg-float v2, v2, v4

    if-nez v2, :cond_30

    iget v2, v10, La3/z;->c:F

    iget v4, v3, La3/z;->c:F

    cmpg-float v2, v2, v4

    if-nez v2, :cond_30

    iget v2, v10, La3/z;->d:F

    iget v4, v3, La3/z;->d:F

    cmpg-float v2, v2, v4

    if-nez v2, :cond_30

    iget v2, v10, La3/z;->e:F

    iget v4, v3, La3/z;->e:F

    cmpg-float v2, v2, v4

    if-nez v2, :cond_30

    iget v2, v10, La3/z;->f:F

    iget v4, v3, La3/z;->f:F

    cmpg-float v2, v2, v4

    if-nez v2, :cond_30

    iget v2, v10, La3/z;->g:F

    iget v4, v3, La3/z;->g:F

    cmpg-float v2, v2, v4

    if-nez v2, :cond_30

    iget v2, v10, La3/z;->h:F

    iget v4, v3, La3/z;->h:F

    cmpg-float v2, v2, v4

    if-nez v2, :cond_30

    iget-wide v4, v10, La3/z;->i:J

    iget-wide v2, v3, La3/z;->i:J

    invoke-static {v4, v5, v2, v3}, Li2/e1;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_30

    const/4 v2, 0x1

    goto :goto_11

    :cond_30
    const/4 v2, 0x0

    :goto_11
    xor-int/lit8 v3, v2, 0x1

    if-eqz p1, :cond_32

    if-eqz v2, :cond_31

    iget-boolean v2, v0, Landroidx/compose/ui/node/NodeCoordinator;->S:Z

    if-eq v1, v2, :cond_32

    :cond_31
    iget-object v1, v9, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz v1, :cond_32

    check-cast v1, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v1, v9}, Landroidx/compose/ui/platform/AndroidComposeView;->B(La3/n0;)V

    :cond_32
    return v3

    :cond_33
    const-string v1, "updateLayerParameters requires a non-null layerBlock"

    invoke-static {v1}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object v1

    throw v1

    :cond_34
    iget-object v1, v0, Landroidx/compose/ui/node/NodeCoordinator;->T:Lkotlin/jvm/functions/Function1;

    const/16 v17, 0x0

    if-nez v1, :cond_35

    :goto_12
    return v17

    :cond_35
    const-string v1, "null layer with a non-null layerBlock"

    invoke-static {v1}, Lx2/a;->b(Ljava/lang/String;)V

    return v17
.end method

.method public final H1(J)Z
    .locals 5

    const-wide v0, 0x7f8000007f800000L    # 1.404448428688076E306

    and-long v2, p1, v0

    xor-long/2addr v0, v2

    const-wide v2, 0x100000001L

    sub-long/2addr v0, v2

    const-wide v2, -0x7fffffff80000000L    # -1.0609978955E-314

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-boolean v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->S:Z

    if-eqz v2, :cond_1

    check-cast v0, Lb3/f2;

    const/16 v2, 0x20

    shr-long v2, p1, v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const-wide v3, 0xffffffffL

    and-long/2addr p1, v3

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    iget-object p2, v0, Lb3/f2;->w:Ll2/c;

    iget-boolean v0, p2, Ll2/c;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Ll2/c;->d()Li2/p0;

    move-result-object p2

    invoke-static {p2, v2, p1}, Le4/a;->E(Li2/p0;FF)Z

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    if-eqz p1, :cond_2

    :cond_1
    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final I0()La3/w0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    return-object v0
.end method

.method public final L0()Ly2/y;
    .locals 0

    return-object p0
.end method

.method public final M0()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->X:Ly2/s0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final N([F)V
    .locals 6

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-static {v0}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    invoke-static {p0}, Ly2/q1;->h(Ly2/y;)Ly2/y;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/node/NodeCoordinator;->A1(Ly2/y;)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v1

    invoke-virtual {p0, v1, p1}, Landroidx/compose/ui/node/NodeCoordinator;->E1(Landroidx/compose/ui/node/NodeCoordinator;[F)V

    instance-of v2, v0, Lu2/f;

    if-eqz v2, :cond_0

    check-cast v0, Lu2/f;

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->u([F)V

    return-void

    :cond_0
    const-wide/16 v2, 0x0

    invoke-virtual {v1, v2, v3}, Landroidx/compose/ui/node/NodeCoordinator;->S(J)J

    move-result-wide v0

    const-wide v2, 0x7fffffff7fffffffL

    and-long/2addr v2, v0

    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v2, v2, v4

    if-eqz v2, :cond_1

    const/16 v2, 0x20

    shr-long v2, v0, v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const-wide v3, 0xffffffffL

    and-long/2addr v0, v3

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {p1, v2, v0}, Li2/l0;->g([FFF)V

    :cond_1
    return-void
.end method

.method public final N0()La3/n0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    return-object v0
.end method

.method public final O0()Ly2/s0;
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->X:Ly2/s0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Asking for measurement result of unmeasured layout modifier"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final P0()La3/w0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    return-object v0
.end method

.method public final Q0()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    return-wide v0
.end method

.method public final S(J)J
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v0

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->Z(J)J

    move-result-wide p1

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-static {v0}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/platform/AndroidComposeView;->v(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final U()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->R:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v0}, La3/n0;->X()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final U0()V
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->j0:Ll2/c;

    if-eqz v0, :cond_0

    iget-wide v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    iget v3, p0, Landroidx/compose/ui/node/NodeCoordinator;->a0:F

    invoke-virtual {p0, v1, v2, v3, v0}, Landroidx/compose/ui/node/NodeCoordinator;->p0(JFLl2/c;)V

    return-void

    :cond_0
    iget-wide v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    iget v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->a0:F

    iget-object v3, p0, Landroidx/compose/ui/node/NodeCoordinator;->T:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0, v0, v1, v2, v3}, Ly2/j1;->o0(JFLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final V()Ly2/y;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v0

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->q1()V

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    iget-object v0, v0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->e:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    return-object v0
.end method

.method public final V0(Landroidx/compose/ui/node/NodeCoordinator;Lh2/a;Z)V
    .locals 6

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/ui/node/NodeCoordinator;->V0(Landroidx/compose/ui/node/NodeCoordinator;Lh2/a;Z)V

    :cond_1
    iget-wide v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    const/16 p1, 0x20

    shr-long v2, v0, p1

    long-to-int v2, v2

    iget v3, p2, Lh2/a;->a:F

    int-to-float v2, v2

    sub-float/2addr v3, v2

    iput v3, p2, Lh2/a;->a:F

    iget v3, p2, Lh2/a;->c:F

    sub-float/2addr v3, v2

    iput v3, p2, Lh2/a;->c:F

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    iget v1, p2, Lh2/a;->b:F

    int-to-float v0, v0

    sub-float/2addr v1, v0

    iput v1, p2, Lh2/a;->b:F

    iget v1, p2, Lh2/a;->d:F

    sub-float/2addr v1, v0

    iput v1, p2, Lh2/a;->d:F

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    check-cast v0, Lb3/f2;

    invoke-virtual {v0, p2, v1}, Lb3/f2;->c(Lh2/a;Z)V

    iget-boolean v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->S:Z

    if-eqz v0, :cond_2

    if-eqz p3, :cond_2

    iget-wide v0, p0, Ly2/j1;->y:J

    shr-long v4, v0, p1

    long-to-int p1, v4

    int-to-float p1, p1

    and-long/2addr v0, v2

    long-to-int p3, v0

    int-to-float p3, p3

    const/4 v0, 0x0

    invoke-virtual {p2, v0, v0, p1, p3}, Lh2/a;->a(FFFF)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final W0(Landroidx/compose/ui/node/NodeCoordinator;J)J
    .locals 2

    if-ne p1, p0, :cond_0

    return-wide p2

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v0, :cond_2

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/ui/node/NodeCoordinator;->W0(Landroidx/compose/ui/node/NodeCoordinator;J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->d1(J)J

    move-result-wide p1

    return-wide p1

    :cond_2
    :goto_0
    invoke-virtual {p0, p2, p3}, Landroidx/compose/ui/node/NodeCoordinator;->d1(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final X0(J)J
    .locals 6

    const/16 v0, 0x20

    shr-long v1, p1, v0

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {p0}, Ly2/j1;->j0()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-virtual {p0}, Ly2/j1;->g0()I

    move-result p2

    int-to-float p2, p2

    sub-float/2addr p1, p2

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr v1, p2

    const/4 v4, 0x0

    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    div-float/2addr p1, p2

    invoke-static {v4, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v4, p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    shl-long v0, v4, v0

    and-long/2addr p1, v2

    or-long/2addr p1, v0

    return-wide p1
.end method

.method public final Y(Ly2/y;[F)V
    .locals 1

    invoke-static {p1}, Landroidx/compose/ui/node/NodeCoordinator;->A1(Ly2/y;)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->q1()V

    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/NodeCoordinator;->c1(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-static {p2}, Li2/l0;->d([F)V

    invoke-virtual {p1, v0, p2}, Landroidx/compose/ui/node/NodeCoordinator;->E1(Landroidx/compose/ui/node/NodeCoordinator;[F)V

    invoke-virtual {p0, v0, p2}, Landroidx/compose/ui/node/NodeCoordinator;->D1(Landroidx/compose/ui/node/NodeCoordinator;[F)V

    return-void
.end method

.method public final Y0(JJ)F
    .locals 8

    invoke-virtual {p0}, Ly2/j1;->j0()I

    move-result v0

    int-to-float v0, v0

    const/16 v1, 0x20

    shr-long v2, p3, v1

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    cmpl-float v0, v0, v2

    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    const-wide v3, 0xffffffffL

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Ly2/j1;->g0()I

    move-result v0

    int-to-float v0, v0

    and-long v5, p3, v3

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    cmpl-float v0, v0, v5

    if-ltz v0, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0, p3, p4}, Landroidx/compose/ui/node/NodeCoordinator;->X0(J)J

    move-result-wide p3

    shr-long v5, p3, v1

    long-to-int v0, v5

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    and-long/2addr p3, v3

    long-to-int p3, p3

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    shr-long v5, p1, v1

    long-to-int p4, v5

    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p4

    const/4 v5, 0x0

    cmpg-float v6, p4, v5

    if-gez v6, :cond_1

    neg-float p4, p4

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ly2/j1;->j0()I

    move-result v6

    int-to-float v6, v6

    sub-float/2addr p4, v6

    :goto_0
    invoke-static {v5, p4}, Ljava/lang/Math;->max(FF)F

    move-result p4

    and-long/2addr p1, v3

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    cmpg-float p2, p1, v5

    if-gez p2, :cond_2

    neg-float p1, p1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ly2/j1;->g0()I

    move-result p2

    int-to-float p2, p2

    sub-float/2addr p1, p2

    :goto_1
    invoke-static {v5, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v6, p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    shl-long/2addr v6, v1

    and-long/2addr p1, v3

    or-long/2addr p1, v6

    cmpl-float p4, v0, v5

    if-gtz p4, :cond_3

    cmpl-float p4, p3, v5

    if-lez p4, :cond_4

    :cond_3
    shr-long v5, p1, v1

    long-to-int p4, v5

    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    cmpg-float v0, v1, v0

    if-gtz v0, :cond_4

    and-long/2addr p1, v3

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    cmpg-float p2, p2, p3

    if-gtz p2, :cond_4

    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    mul-float/2addr p2, p2

    mul-float/2addr p1, p1

    add-float/2addr p1, p2

    return p1

    :cond_4
    return v2
.end method

.method public final Z(J)J
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v0

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->q1()V

    move-object v0, p0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->B1(J)J

    move-result-wide p1

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    goto :goto_0

    :cond_1
    return-wide p1
.end method

.method public final Z0(Li2/v;Ll2/c;)V
    .locals 5

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz v0, :cond_1

    check-cast v0, Lb3/f2;

    iget-object v1, v0, Lb3/f2;->M:Lk2/b;

    invoke-virtual {v0}, Lb3/f2;->g()V

    iget-object v2, v0, Lb3/f2;->w:Ll2/c;

    iget-object v2, v2, Ll2/c;->a:Ll2/e;

    invoke-interface {v2}, Ll2/e;->N()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, v0, Lb3/f2;->T:Z

    iget-object v2, v1, Lk2/b;->x:La3/p;

    invoke-virtual {v2, p1}, La3/p;->P(Li2/v;)V

    iput-object p2, v2, La3/p;->y:Ljava/lang/Object;

    iget-object p1, v0, Lb3/f2;->w:Ll2/c;

    invoke-static {v1, p1}, Lge3/g;->t(Lk2/e;Ll2/c;)V

    return-void

    :cond_1
    iget-wide v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    const/16 v2, 0x20

    shr-long v2, v0, v2

    long-to-int v2, v2

    int-to-float v2, v2

    const-wide v3, 0xffffffffL

    and-long/2addr v0, v3

    long-to-int v0, v0

    int-to-float v0, v0

    invoke-interface {p1, v2, v0}, Li2/v;->f(FF)V

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->a1(Li2/v;Ll2/c;)V

    neg-float p2, v2

    neg-float v0, v0

    invoke-interface {p1, p2, v0}, Li2/v;->f(FF)V

    return-void
.end method

.method public final a1(Li2/v;Ll2/c;)V
    .locals 11

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/NodeCoordinator;->h1(I)Lb2/v;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->v1(Li2/v;Ll2/c;)V

    return-void

    :cond_0
    iget-object v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/node/Owner;->getSharedDrawScope()La3/p0;

    move-result-object v3

    iget-wide v4, p0, Ly2/j1;->y:J

    invoke-static {v4, v5}, Lv63/b;->l(J)J

    move-result-wide v5

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    move-object v10, v2

    :goto_0
    if-eqz v1, :cond_8

    instance-of v4, v1, La3/r;

    if-eqz v4, :cond_1

    move-object v8, v1

    check-cast v8, La3/r;

    move-object v7, p0

    move-object v4, p1

    move-object v9, p2

    invoke-virtual/range {v3 .. v9}, La3/p0;->b(Li2/v;JLandroidx/compose/ui/node/NodeCoordinator;La3/r;Ll2/c;)V

    goto :goto_4

    :cond_1
    move-object v4, p1

    move-object v9, p2

    iget p1, v1, Lb2/v;->y:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_7

    instance-of p1, v1, La3/o;

    if-eqz p1, :cond_7

    move-object p1, v1

    check-cast p1, La3/o;

    iget-object p1, p1, La3/o;->P:Lb2/v;

    const/4 p2, 0x0

    :goto_1
    const/4 v7, 0x1

    if-eqz p1, :cond_6

    iget v8, p1, Lb2/v;->y:I

    and-int/2addr v8, v0

    if-eqz v8, :cond_5

    add-int/lit8 p2, p2, 0x1

    if-ne p2, v7, :cond_2

    move-object v1, p1

    goto :goto_2

    :cond_2
    if-nez v10, :cond_3

    new-instance v10, Lr1/c;

    const/16 v7, 0x10

    new-array v7, v7, [Lb2/v;

    invoke-direct {v10, v7}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v10, v1}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v1, v2

    :cond_4
    invoke-virtual {v10, p1}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_5
    :goto_2
    iget-object p1, p1, Lb2/v;->F:Lb2/v;

    goto :goto_1

    :cond_6
    if-ne p2, v7, :cond_7

    :goto_3
    move-object p1, v4

    move-object p2, v9

    goto :goto_0

    :cond_7
    :goto_4
    invoke-static {v10}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v1

    goto :goto_3

    :cond_8
    return-void
.end method

.method public abstract b1()V
.end method

.method public final c()Ly2/y;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v0

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->q1()V

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    return-object v0
.end method

.method public final c1(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;
    .locals 5

    iget-object v0, p1, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    iget-object v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v1

    iget-object v2, v1, Lb2/v;->w:Lb2/v;

    iget-boolean v2, v2, Lb2/v;->N:Z

    if-nez v2, :cond_0

    const-string v2, "visitLocalAncestors called on an unattached node"

    invoke-static {v2}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v1, v1, Lb2/v;->w:Lb2/v;

    iget-object v1, v1, Lb2/v;->E:Lb2/v;

    :goto_0
    if-eqz v1, :cond_7

    iget v2, v1, Lb2/v;->y:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_1

    if-ne v1, v0, :cond_1

    goto :goto_4

    :cond_1
    iget-object v1, v1, Lb2/v;->E:Lb2/v;

    goto :goto_0

    :cond_2
    :goto_1
    iget v2, v0, La3/n0;->O:I

    iget v3, v1, La3/n0;->O:I

    if-le v2, v3, :cond_3

    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    move-object v2, v1

    :goto_2
    iget v3, v2, La3/n0;->O:I

    iget v4, v0, La3/n0;->O:I

    if-le v3, v4, :cond_4

    invoke-virtual {v2}, La3/n0;->G()La3/n0;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    :goto_3
    if-eq v0, v2, :cond_6

    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v0

    invoke-virtual {v2}, La3/n0;->G()La3/n0;

    move-result-object v2

    if-eqz v0, :cond_5

    if-eqz v2, :cond_5

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "layouts are not part of the same hierarchy"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    if-ne v2, v1, :cond_8

    :cond_7
    return-object p0

    :cond_8
    iget-object v1, p1, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    if-ne v0, v1, :cond_9

    :goto_4
    return-object p1

    :cond_9
    iget-object p1, v0, La3/n0;->e0:La3/l1;

    iget-object p1, p1, La3/l1;->d:Ljava/lang/Object;

    check-cast p1, Landroidx/compose/ui/node/a;

    return-object p1
.end method

.method public final d1(J)J
    .locals 6

    iget-wide v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    const/16 v2, 0x20

    shr-long v3, p1, v2

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    shr-long v4, v0, v2

    long-to-int v4, v4

    int-to-float v4, v4

    sub-float/2addr v3, v4

    const-wide v4, 0xffffffffL

    and-long/2addr p1, v4

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    and-long/2addr v0, v4

    long-to-int p2, v0

    int-to-float p2, p2

    sub-float/2addr p1, p2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v0, p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    shl-long/2addr v0, v2

    and-long/2addr p1, v4

    or-long/2addr p1, v0

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    check-cast v0, Lb3/f2;

    invoke-virtual {v0, p1, p2, v1}, Lb3/f2;->d(JZ)J

    move-result-wide p1

    :cond_0
    return-wide p1
.end method

.method public abstract e1()La3/x0;
.end method

.method public final f1()J
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->U:Ly3/c;

    iget-object v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    iget-object v1, v1, La3/n0;->Z:Lb3/j3;

    invoke-interface {v1}, Lb3/j3;->e()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Ly3/c;->D0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final g()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v0

    iget-boolean v0, v0, Lb2/v;->N:Z

    return v0
.end method

.method public abstract g1()Lb2/v;
.end method

.method public final getDensity()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    iget-object v0, v0, La3/n0;->X:Ly3/c;

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v0

    return v0
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    iget-object v0, v0, La3/n0;->Y:Ly3/m;

    return-object v0
.end method

.method public final h1(I)Lb2/v;
    .locals 3

    invoke-static {p1}, La3/r1;->g(I)Z

    move-result v0

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v1, Lb2/v;->E:Lb2/v;

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/NodeCoordinator;->i1(Z)Lb2/v;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_3

    iget v2, v0, Lb2/v;->z:I

    and-int/2addr v2, p1

    if-eqz v2, :cond_3

    iget v2, v0, Lb2/v;->y:I

    and-int/2addr v2, p1

    if-eqz v2, :cond_2

    return-object v0

    :cond_2
    if-eq v0, v1, :cond_3

    iget-object v0, v0, Lb2/v;->F:Lb2/v;

    goto :goto_1

    :cond_3
    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final i1(Z)Lb2/v;
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    iget-object v0, v0, La3/n0;->e0:La3/l1;

    iget-object v1, v0, La3/l1;->e:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/node/NodeCoordinator;

    if-ne v1, p0, :cond_0

    iget-object p1, v0, La3/l1;->g:Ljava/lang/Object;

    check-cast p1, Lb2/v;

    return-object p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p1, Lb2/v;->F:Lb2/v;

    return-object p1

    :cond_1
    return-object v0

    :cond_2
    iget-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v0
.end method

.method public final j1(Lb2/v;La3/e;JLa3/v;IZ)V
    .locals 8

    if-nez p1, :cond_0

    move-object v0, p0

    move-object v1, p2

    move-wide v2, p3

    move-object v4, p5

    move v5, p6

    move v6, p7

    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/node/NodeCoordinator;->m1(La3/e;JLa3/v;IZ)V

    return-void

    :cond_0
    move-object v1, p2

    move-wide v2, p3

    move-object v4, p5

    move v5, p6

    move v6, p7

    iget p2, v4, La3/v;->y:I

    iget-object p3, v4, La3/v;->w:La0/q0;

    add-int/lit8 p4, p2, 0x1

    iget p5, p3, La0/q0;->b:I

    invoke-virtual {v4, p4, p5}, La3/v;->c(II)V

    iget p4, v4, La3/v;->y:I

    add-int/lit8 p4, p4, 0x1

    iput p4, v4, La3/v;->y:I

    invoke-virtual {p3, p1}, La0/q0;->a(Ljava/lang/Object;)V

    iget-object p3, v4, La3/v;->x:La0/j0;

    const/high16 p4, -0x40800000    # -1.0f

    const/4 p5, 0x0

    invoke-static {p4, v6, p5}, Lds/q;->k(FZZ)J

    move-result-wide p4

    invoke-virtual {p3, p4, p5}, La0/j0;->a(J)V

    invoke-virtual {v1}, La3/e;->b()I

    move-result p3

    invoke-static {p1, p3}, La3/g;->c(La3/n;I)Lb2/v;

    move-result-object p1

    move-object v0, p0

    move v7, v6

    move v6, v5

    move-object v5, v4

    move-wide v3, v2

    move-object v2, v1

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, Landroidx/compose/ui/node/NodeCoordinator;->j1(Lb2/v;La3/e;JLa3/v;IZ)V

    move-object v4, v5

    iput p2, v4, La3/v;->y:I

    return-void
.end method

.method public final k(Ly2/y;J)J
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/ui/node/NodeCoordinator;->p1(Ly2/y;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final k1(Lb2/v;La3/e;JLa3/v;IZF)V
    .locals 11

    if-nez p1, :cond_0

    move-object v0, p0

    move-object v1, p2

    move-wide v2, p3

    move-object/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/node/NodeCoordinator;->m1(La3/e;JLa3/v;IZ)V

    return-void

    :cond_0
    move-object/from16 v4, p5

    iget v10, v4, La3/v;->y:I

    iget-object v0, v4, La3/v;->w:La0/q0;

    add-int/lit8 v1, v10, 0x1

    iget v2, v0, La0/q0;->b:I

    invoke-virtual {v4, v1, v2}, La3/v;->c(II)V

    iget v1, v4, La3/v;->y:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v4, La3/v;->y:I

    invoke-virtual {v0, p1}, La0/q0;->a(Ljava/lang/Object;)V

    iget-object v0, v4, La3/v;->x:La0/j0;

    const/4 v1, 0x0

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-static {v8, v7, v1}, Lds/q;->k(FZZ)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, La0/j0;->a(J)V

    invoke-virtual {p2}, La3/e;->b()I

    move-result v0

    invoke-static {p1, v0}, La3/g;->c(La3/n;I)Lb2/v;

    move-result-object v1

    const/4 v9, 0x1

    move-object v0, p0

    move-object v2, p2

    move/from16 v6, p6

    move-object v5, v4

    move-wide v3, p3

    invoke-virtual/range {v0 .. v9}, Landroidx/compose/ui/node/NodeCoordinator;->u1(Lb2/v;La3/e;JLa3/v;IZFZ)V

    move-object v4, v5

    iput v10, v4, La3/v;->y:I

    return-void
.end method

.method public final l1(La3/e;JLa3/v;IZ)V
    .locals 14

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    invoke-virtual {p1}, La3/e;->b()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/NodeCoordinator;->h1(I)Lb2/v;

    move-result-object v1

    invoke-virtual {p0, v3, v4}, Landroidx/compose/ui/node/NodeCoordinator;->H1(J)Z

    move-result v0

    const/4 v8, 0x0

    const/high16 v9, 0x7f800000    # Float.POSITIVE_INFINITY

    const v10, 0x7fffffff

    const/4 v11, 0x1

    if-nez v0, :cond_2

    invoke-static {v6, v11}, Lu2/d0;->f(II)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->f1()J

    move-result-wide v11

    invoke-virtual {p0, v3, v4, v11, v12}, Landroidx/compose/ui/node/NodeCoordinator;->Y0(JJ)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    and-int/2addr v2, v10

    if-ge v2, v9, :cond_1

    iget v2, v5, La3/v;->y:I

    invoke-static {v5}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v7

    if-ne v2, v7, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0, v8}, Lds/q;->c(FZ)J

    move-result-wide v7

    invoke-virtual {v5}, La3/v;->a()J

    move-result-wide v9

    invoke-static {v9, v10, v7, v8}, Lds/p;->x(JJ)I

    move-result v2

    if-lez v2, :cond_1

    :goto_0
    const/4 v7, 0x0

    move-object v2, p1

    move v8, v0

    move-object v0, p0

    invoke-virtual/range {v0 .. v8}, Landroidx/compose/ui/node/NodeCoordinator;->k1(Lb2/v;La3/e;JLa3/v;IZF)V

    :cond_1
    return-void

    :cond_2
    if-nez v1, :cond_3

    invoke-virtual/range {p0 .. p6}, Landroidx/compose/ui/node/NodeCoordinator;->m1(La3/e;JLa3/v;IZ)V

    return-void

    :cond_3
    const/16 v0, 0x20

    shr-long v2, p2, v0

    long-to-int v0, v2

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const-wide v2, 0xffffffffL

    and-long v2, p2, v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v4, v0, v3

    if-ltz v4, :cond_4

    cmpl-float v3, v2, v3

    if-ltz v3, :cond_4

    invoke-virtual {p0}, Ly2/j1;->j0()I

    move-result v3

    int-to-float v3, v3

    cmpg-float v0, v0, v3

    if-gez v0, :cond_4

    invoke-virtual {p0}, Ly2/j1;->g0()I

    move-result v0

    int-to-float v0, v0

    cmpg-float v0, v2, v0

    if-gez v0, :cond_4

    move-object v0, p0

    move-object v2, p1

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    invoke-virtual/range {v0 .. v7}, Landroidx/compose/ui/node/NodeCoordinator;->j1(Lb2/v;La3/e;JLa3/v;IZ)V

    return-void

    :cond_4
    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    invoke-static {v6, v11}, Lu2/d0;->f(II)Z

    move-result v2

    if-nez v2, :cond_5

    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->f1()J

    move-result-wide v12

    invoke-virtual {p0, v3, v4, v12, v13}, Landroidx/compose/ui/node/NodeCoordinator;->Y0(JJ)F

    move-result v2

    :goto_1
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    and-int/2addr v7, v10

    if-ge v7, v9, :cond_7

    iget v7, v5, La3/v;->y:I

    invoke-static {v5}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v9

    if-ne v7, v9, :cond_6

    move/from16 v7, p6

    goto :goto_2

    :cond_6
    move/from16 v7, p6

    invoke-static {v2, v7}, Lds/q;->c(FZ)J

    move-result-wide v9

    invoke-virtual {v5}, La3/v;->a()J

    move-result-wide v12

    invoke-static {v12, v13, v9, v10}, Lds/p;->x(JJ)I

    move-result v9

    if-lez v9, :cond_8

    :goto_2
    move v9, v11

    :goto_3
    move-object v0, p0

    move v8, v2

    move-object v2, p1

    goto :goto_4

    :cond_7
    move/from16 v7, p6

    :cond_8
    move v9, v8

    goto :goto_3

    :goto_4
    invoke-virtual/range {v0 .. v9}, Landroidx/compose/ui/node/NodeCoordinator;->u1(Lb2/v;La3/e;JLa3/v;IZFZ)V

    return-void
.end method

.method public final m0()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    iget-object v0, v0, La3/n0;->X:Ly3/c;

    invoke-interface {v0}, Ly3/c;->m0()F

    move-result v0

    return v0
.end method

.method public m1(La3/e;JLa3/v;IZ)V
    .locals 7

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2, p3}, Landroidx/compose/ui/node/NodeCoordinator;->d1(J)J

    move-result-wide v2

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/node/NodeCoordinator;->l1(La3/e;JLa3/v;IZ)V

    :cond_0
    return-void
.end method

.method public final n()J
    .locals 2

    iget-wide v0, p0, Ly2/j1;->y:J

    return-wide v0
.end method

.method public final n1()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, La3/a2;->invalidate()V

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->n1()V

    :cond_1
    return-void
.end method

.method public final o(J)J
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v0

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-static {p0}, Ly2/q1;->h(Ly2/y;)Ly2/y;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-static {v1}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->F()V

    iget-object v1, v1, Landroidx/compose/ui/platform/AndroidComposeView;->w0:[F

    invoke-static {p1, p2, v1}, Li2/l0;->b(J[F)J

    move-result-wide p1

    const-wide/16 v1, 0x0

    invoke-interface {v0, v1, v2}, Ly2/y;->Z(J)J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Lh2/b;->g(JJ)J

    move-result-wide p1

    invoke-virtual {p0, v0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->p1(Ly2/y;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final o1()Z
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz v0, :cond_0

    iget v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->W:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->o1()Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final p()Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    iget-object v1, v0, La3/n0;->e0:La3/l1;

    const/16 v2, 0x40

    invoke-virtual {v1, v2}, La3/l1;->j(I)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_9

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    iget-object v1, v0, La3/n0;->e0:La3/l1;

    iget-object v1, v1, La3/l1;->f:Ljava/lang/Object;

    check-cast v1, La3/l2;

    move-object v4, v3

    :goto_0
    if-eqz v1, :cond_8

    iget v5, v1, Lb2/v;->y:I

    and-int/2addr v5, v2

    if-eqz v5, :cond_7

    move-object v5, v1

    move-object v6, v3

    :goto_1
    if-eqz v5, :cond_7

    instance-of v7, v5, La3/d2;

    if-eqz v7, :cond_0

    check-cast v5, La3/d2;

    iget-object v7, v0, La3/n0;->X:Ly3/c;

    invoke-interface {v5, v7, v4}, La3/d2;->Y(Ly3/c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_4

    :cond_0
    iget v7, v5, Lb2/v;->y:I

    and-int/2addr v7, v2

    if-eqz v7, :cond_6

    instance-of v7, v5, La3/o;

    if-eqz v7, :cond_6

    move-object v7, v5

    check-cast v7, La3/o;

    iget-object v7, v7, La3/o;->P:Lb2/v;

    const/4 v8, 0x0

    :goto_2
    const/4 v9, 0x1

    if-eqz v7, :cond_5

    iget v10, v7, Lb2/v;->y:I

    and-int/2addr v10, v2

    if-eqz v10, :cond_4

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v9, :cond_1

    move-object v5, v7

    goto :goto_3

    :cond_1
    if-nez v6, :cond_2

    new-instance v6, Lr1/c;

    const/16 v9, 0x10

    new-array v9, v9, [Lb2/v;

    invoke-direct {v6, v9}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v5, :cond_3

    invoke-virtual {v6, v5}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v5, v3

    :cond_3
    invoke-virtual {v6, v7}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_4
    :goto_3
    iget-object v7, v7, Lb2/v;->F:Lb2/v;

    goto :goto_2

    :cond_5
    if-ne v8, v9, :cond_6

    goto :goto_1

    :cond_6
    :goto_4
    invoke-static {v6}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v5

    goto :goto_1

    :cond_7
    iget-object v1, v1, Lb2/v;->E:Lb2/v;

    goto :goto_0

    :cond_8
    return-object v4

    :cond_9
    return-object v3
.end method

.method public abstract p0(JFLl2/c;)V
.end method

.method public final p1(Ly2/y;J)J
    .locals 2

    instance-of v0, p1, Ly2/p0;

    if-eqz v0, :cond_0

    check-cast p1, Ly2/p0;

    iget-object v0, p1, Ly2/p0;->w:La3/x0;

    iget-object v0, v0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->q1()V

    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    xor-long/2addr p2, v0

    invoke-virtual {p1, p0, p2, p3}, Ly2/p0;->b(Ly2/y;J)J

    move-result-wide p1

    xor-long/2addr p1, v0

    return-wide p1

    :cond_0
    invoke-static {p1}, Landroidx/compose/ui/node/NodeCoordinator;->A1(Ly2/y;)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->q1()V

    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/NodeCoordinator;->c1(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    :goto_0
    if-eq p1, v0, :cond_1

    invoke-virtual {p1, p2, p3}, Landroidx/compose/ui/node/NodeCoordinator;->B1(J)J

    move-result-wide p2

    iget-object p1, p1, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0, p2, p3}, Landroidx/compose/ui/node/NodeCoordinator;->W0(Landroidx/compose/ui/node/NodeCoordinator;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final q1()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v0}, La3/n0;->t()La3/r0;

    move-result-object v0

    invoke-virtual {v0}, La3/r0;->b()V

    return-void
.end method

.method public final r(Ly2/y;Z)Lh2/c;
    .locals 7

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v0

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-interface {p1}, Ly2/y;->g()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LayoutCoordinates "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is not attached!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_1
    invoke-static {p1}, Landroidx/compose/ui/node/NodeCoordinator;->A1(Ly2/y;)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->q1()V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/NodeCoordinator;->c1(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->b0:Lh2/a;

    if-nez v2, :cond_2

    new-instance v2, Lh2/a;

    invoke-direct {v2}, Lh2/a;-><init>()V

    iput-object v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->b0:Lh2/a;

    :cond_2
    const/4 v3, 0x0

    iput v3, v2, Lh2/a;->a:F

    iput v3, v2, Lh2/a;->b:F

    invoke-interface {p1}, Ly2/y;->n()J

    move-result-wide v3

    const/16 v5, 0x20

    shr-long/2addr v3, v5

    long-to-int v3, v3

    int-to-float v3, v3

    iput v3, v2, Lh2/a;->c:F

    invoke-interface {p1}, Ly2/y;->n()J

    move-result-wide v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int p1, v3

    int-to-float p1, p1

    iput p1, v2, Lh2/a;->d:F

    :goto_0
    if-eq v0, v1, :cond_4

    const/4 p1, 0x0

    invoke-virtual {v0, v2, p2, p1}, Landroidx/compose/ui/node/NodeCoordinator;->x1(Lh2/a;ZZ)V

    invoke-virtual {v2}, Lh2/a;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lh2/c;->e:Lh2/c;

    return-object p1

    :cond_3
    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p0, v1, v2, p2}, Landroidx/compose/ui/node/NodeCoordinator;->V0(Landroidx/compose/ui/node/NodeCoordinator;Lh2/a;Z)V

    new-instance p1, Lh2/c;

    iget p2, v2, Lh2/a;->a:F

    iget v0, v2, Lh2/a;->b:F

    iget v1, v2, Lh2/a;->c:F

    iget v2, v2, Lh2/a;->d:F

    invoke-direct {p1, p2, v0, v1, v2}, Lh2/c;-><init>(FFFF)V

    return-object p1
.end method

.method public final r1()V
    .locals 13

    const/16 v0, 0x80

    invoke-static {v0}, La3/r1;->g(I)Z

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->i1(Z)Lb2/v;

    move-result-object v2

    if-eqz v2, :cond_c

    iget-object v2, v2, Lb2/v;->w:Lb2/v;

    iget v2, v2, Lb2/v;->z:I

    and-int/2addr v2, v0

    if-eqz v2, :cond_c

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    invoke-static {v2}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v5

    if-eqz v1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v6

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v6

    iget-object v6, v6, Lb2/v;->E:Lb2/v;

    if-nez v6, :cond_2

    goto/16 :goto_7

    :cond_2
    :goto_1
    invoke-virtual {p0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->i1(Z)Lb2/v;

    move-result-object v1

    :goto_2
    if-eqz v1, :cond_b

    iget v7, v1, Lb2/v;->z:I

    and-int/2addr v7, v0

    if-eqz v7, :cond_b

    iget v7, v1, Lb2/v;->y:I

    and-int/2addr v7, v0

    if-eqz v7, :cond_a

    move-object v7, v1

    move-object v8, v3

    :goto_3
    if-eqz v7, :cond_a

    instance-of v9, v7, La3/a0;

    if-eqz v9, :cond_3

    check-cast v7, La3/a0;

    iget-wide v9, p0, Ly2/j1;->y:J

    invoke-interface {v7, v9, v10}, La3/a0;->g(J)V

    goto :goto_6

    :cond_3
    iget v9, v7, Lb2/v;->y:I

    and-int/2addr v9, v0

    if-eqz v9, :cond_9

    instance-of v9, v7, La3/o;

    if-eqz v9, :cond_9

    move-object v9, v7

    check-cast v9, La3/o;

    iget-object v9, v9, La3/o;->P:Lb2/v;

    const/4 v10, 0x0

    :goto_4
    const/4 v11, 0x1

    if-eqz v9, :cond_8

    iget v12, v9, Lb2/v;->y:I

    and-int/2addr v12, v0

    if-eqz v12, :cond_7

    add-int/lit8 v10, v10, 0x1

    if-ne v10, v11, :cond_4

    move-object v7, v9

    goto :goto_5

    :cond_4
    if-nez v8, :cond_5

    new-instance v8, Lr1/c;

    const/16 v11, 0x10

    new-array v11, v11, [Lb2/v;

    invoke-direct {v8, v11}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_5
    if-eqz v7, :cond_6

    invoke-virtual {v8, v7}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v7, v3

    :cond_6
    invoke-virtual {v8, v9}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_7
    :goto_5
    iget-object v9, v9, Lb2/v;->F:Lb2/v;

    goto :goto_4

    :cond_8
    if-ne v10, v11, :cond_9

    goto :goto_3

    :cond_9
    :goto_6
    invoke-static {v8}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v7

    goto :goto_3

    :cond_a
    if-eq v1, v6, :cond_b

    iget-object v1, v1, Lb2/v;->F:Lb2/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_b
    :goto_7
    invoke-static {v2, v5, v4}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    return-void

    :goto_8
    invoke-static {v2, v5, v4}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw v0

    :cond_c
    return-void
.end method

.method public final s1()V
    .locals 10

    const/16 v0, 0x80

    invoke-static {v0}, La3/r1;->g(I)Z

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v2

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, v2, Lb2/v;->E:Lb2/v;

    if-nez v2, :cond_1

    goto/16 :goto_6

    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->i1(Z)Lb2/v;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_a

    iget v3, v1, Lb2/v;->z:I

    and-int/2addr v3, v0

    if-eqz v3, :cond_a

    iget v3, v1, Lb2/v;->y:I

    and-int/2addr v3, v0

    if-eqz v3, :cond_9

    const/4 v3, 0x0

    move-object v4, v1

    move-object v5, v3

    :goto_2
    if-eqz v4, :cond_9

    instance-of v6, v4, La3/a0;

    if-eqz v6, :cond_2

    check-cast v4, La3/a0;

    invoke-interface {v4, p0}, La3/a0;->N(Ly2/y;)V

    goto :goto_5

    :cond_2
    iget v6, v4, Lb2/v;->y:I

    and-int/2addr v6, v0

    if-eqz v6, :cond_8

    instance-of v6, v4, La3/o;

    if-eqz v6, :cond_8

    move-object v6, v4

    check-cast v6, La3/o;

    iget-object v6, v6, La3/o;->P:Lb2/v;

    const/4 v7, 0x0

    :goto_3
    const/4 v8, 0x1

    if-eqz v6, :cond_7

    iget v9, v6, Lb2/v;->y:I

    and-int/2addr v9, v0

    if-eqz v9, :cond_6

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_3

    move-object v4, v6

    goto :goto_4

    :cond_3
    if-nez v5, :cond_4

    new-instance v5, Lr1/c;

    const/16 v8, 0x10

    new-array v8, v8, [Lb2/v;

    invoke-direct {v5, v8}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v5, v4}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v4, v3

    :cond_5
    invoke-virtual {v5, v6}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_6
    :goto_4
    iget-object v6, v6, Lb2/v;->F:Lb2/v;

    goto :goto_3

    :cond_7
    if-ne v7, v8, :cond_8

    goto :goto_2

    :cond_8
    :goto_5
    invoke-static {v5}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v4

    goto :goto_2

    :cond_9
    if-eq v1, v2, :cond_a

    iget-object v1, v1, Lb2/v;->F:Lb2/v;

    goto :goto_1

    :cond_a
    :goto_6
    return-void
.end method

.method public final t1()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->R:Z

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->g0:La3/o1;

    invoke-virtual {v0}, La3/o1;->invoke()Ljava/lang/Object;

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->y1()V

    iget-wide v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Ly3/j;->b(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v0}, La3/n0;->k0()V

    :cond_0
    return-void
.end method

.method public final u1(Lb2/v;La3/e;JLa3/v;IZFZ)V
    .locals 15

    if-nez p1, :cond_0

    move-object v0, p0

    move-object/from16 v1, p2

    move-wide/from16 v2, p3

    move-object/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/node/NodeCoordinator;->m1(La3/e;JLa3/v;IZ)V

    return-void

    :cond_0
    move/from16 v7, p6

    const/4 v1, 0x3

    invoke-static {v7, v1}, Lu2/d0;->f(II)Z

    move-result v1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-nez v1, :cond_2

    const/4 v1, 0x4

    invoke-static {v7, v1}, Lu2/d0;->f(II)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    move-object/from16 v0, p1

    move-object/from16 v6, p5

    move/from16 v8, p7

    goto/16 :goto_4

    :cond_2
    move-object/from16 v1, p1

    move-object v2, v11

    :goto_0
    if-eqz v1, :cond_1

    instance-of v3, v1, La3/f2;

    if-eqz v3, :cond_6

    check-cast v1, La3/f2;

    invoke-interface {v1}, La3/f2;->S()J

    move-result-wide v1

    const/16 v3, 0x20

    shr-long v3, p3, v3

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    iget-object v5, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    iget-object v6, v5, La3/n0;->Y:Ly3/m;

    invoke-static {v1, v2, v6}, La3/n2;->a(JLy3/m;)I

    move-result v6

    neg-int v6, v6

    int-to-float v6, v6

    cmpl-float v4, v4, v6

    if-ltz v4, :cond_1

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-virtual {p0}, Ly2/j1;->j0()I

    move-result v4

    iget-object v5, v5, La3/n0;->Y:Ly3/m;

    invoke-static {v1, v2, v5}, La3/n2;->b(JLy3/m;)I

    move-result v5

    add-int/2addr v5, v4

    int-to-float v4, v5

    cmpg-float v3, v3, v4

    if-gez v3, :cond_1

    const-wide v3, 0xffffffffL

    and-long v3, p3, v3

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-static {v1, v2}, La3/n2;->d(J)I

    move-result v5

    neg-int v5, v5

    int-to-float v5, v5

    cmpl-float v4, v4, v5

    if-ltz v4, :cond_1

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-virtual {p0}, Ly2/j1;->g0()I

    move-result v4

    invoke-static {v1, v2}, La3/n2;->c(J)I

    move-result v1

    add-int/2addr v1, v4

    int-to-float v1, v1

    cmpg-float v1, v3, v1

    if-gez v1, :cond_1

    new-instance v0, La3/p1;

    move-object v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v0 .. v10}, La3/p1;-><init>(Landroidx/compose/ui/node/NodeCoordinator;Lb2/v;La3/e;JLa3/v;IZFZ)V

    move-object v1, v0

    move-object v0, v2

    iget-object v2, v6, La3/v;->x:La0/j0;

    iget-object v3, v6, La3/v;->w:La0/q0;

    iget v4, v6, La3/v;->y:I

    invoke-static {v6}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v5

    const/4 v7, 0x0

    if-ne v4, v5, :cond_3

    iget v4, v6, La3/v;->y:I

    add-int/lit8 v5, v4, 0x1

    iget v9, v3, La0/q0;->b:I

    invoke-virtual {v6, v5, v9}, La3/v;->c(II)V

    iget v5, v6, La3/v;->y:I

    add-int/2addr v5, v12

    iput v5, v6, La3/v;->y:I

    invoke-virtual {v3, v0}, La0/q0;->a(Ljava/lang/Object;)V

    invoke-static {v7, v8, v12}, Lds/q;->k(FZZ)J

    move-result-wide v7

    invoke-virtual {v2, v7, v8}, La0/j0;->a(J)V

    invoke-virtual {v1}, La3/p1;->invoke()Ljava/lang/Object;

    iput v4, v6, La3/v;->y:I

    return-void

    :cond_3
    invoke-virtual {v6}, La3/v;->a()J

    move-result-wide v4

    iget v9, v6, La3/v;->y:I

    invoke-static {v4, v5}, Lds/p;->K(J)Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-static {v6}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v4

    iput v4, v6, La3/v;->y:I

    add-int/lit8 v5, v4, 0x1

    iget v10, v3, La0/q0;->b:I

    invoke-virtual {v6, v5, v10}, La3/v;->c(II)V

    iget v5, v6, La3/v;->y:I

    add-int/2addr v5, v12

    iput v5, v6, La3/v;->y:I

    invoke-virtual {v3, v0}, La0/q0;->a(Ljava/lang/Object;)V

    invoke-static {v7, v8, v12}, Lds/q;->k(FZZ)J

    move-result-wide v10

    invoke-virtual {v2, v10, v11}, La0/j0;->a(J)V

    invoke-virtual {v1}, La3/p1;->invoke()Ljava/lang/Object;

    iput v4, v6, La3/v;->y:I

    invoke-virtual {v6}, La3/v;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Lds/p;->H(J)F

    move-result v0

    cmpg-float v0, v0, v7

    if-gez v0, :cond_4

    add-int/lit8 v0, v9, 0x1

    iget v1, v6, La3/v;->y:I

    add-int/2addr v1, v12

    invoke-virtual {v6, v0, v1}, La3/v;->c(II)V

    :cond_4
    iput v9, v6, La3/v;->y:I

    return-void

    :cond_5
    invoke-static {v4, v5}, Lds/p;->H(J)F

    move-result v4

    cmpl-float v4, v4, v7

    if-lez v4, :cond_16

    iget v4, v6, La3/v;->y:I

    add-int/lit8 v5, v4, 0x1

    iget v9, v3, La0/q0;->b:I

    invoke-virtual {v6, v5, v9}, La3/v;->c(II)V

    iget v5, v6, La3/v;->y:I

    add-int/2addr v5, v12

    iput v5, v6, La3/v;->y:I

    invoke-virtual {v3, v0}, La0/q0;->a(Ljava/lang/Object;)V

    invoke-static {v7, v8, v12}, Lds/q;->k(FZZ)J

    move-result-wide v7

    invoke-virtual {v2, v7, v8}, La0/j0;->a(J)V

    invoke-virtual {v1}, La3/p1;->invoke()Ljava/lang/Object;

    iput v4, v6, La3/v;->y:I

    return-void

    :cond_6
    move-object/from16 v0, p1

    move-object/from16 v6, p5

    move/from16 v8, p7

    iget v3, v1, Lb2/v;->y:I

    const/16 v4, 0x10

    and-int/2addr v3, v4

    if-eqz v3, :cond_c

    instance-of v3, v1, La3/o;

    if-eqz v3, :cond_c

    move-object v3, v1

    check-cast v3, La3/o;

    iget-object v3, v3, La3/o;->P:Lb2/v;

    move v5, v10

    :goto_1
    if-eqz v3, :cond_b

    iget v7, v3, Lb2/v;->y:I

    and-int/2addr v7, v4

    if-eqz v7, :cond_a

    add-int/lit8 v5, v5, 0x1

    if-ne v5, v12, :cond_7

    move-object v1, v3

    goto :goto_2

    :cond_7
    if-nez v2, :cond_8

    new-instance v2, Lr1/c;

    new-array v7, v4, [Lb2/v;

    invoke-direct {v2, v7}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_8
    if-eqz v1, :cond_9

    invoke-virtual {v2, v1}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v1, v11

    :cond_9
    invoke-virtual {v2, v3}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_a
    :goto_2
    iget-object v3, v3, Lb2/v;->F:Lb2/v;

    goto :goto_1

    :cond_b
    if-ne v5, v12, :cond_c

    :goto_3
    move/from16 v7, p6

    goto/16 :goto_0

    :cond_c
    invoke-static {v2}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v1

    goto :goto_3

    :goto_4
    if-eqz p9, :cond_d

    invoke-virtual/range {p0 .. p8}, Landroidx/compose/ui/node/NodeCoordinator;->k1(Lb2/v;La3/e;JLa3/v;IZF)V

    return-void

    :cond_d
    move-object/from16 v3, p2

    iget v1, v3, La3/e;->w:I

    packed-switch v1, :pswitch_data_0

    const/4 v1, 0x0

    goto :goto_9

    :pswitch_0
    const/4 v1, 0x0

    move-object v2, v0

    move-object v4, v1

    :goto_5
    const/4 v5, 0x0

    if-eqz v2, :cond_15

    instance-of v7, v2, La3/f2;

    if-eqz v7, :cond_e

    check-cast v2, La3/f2;

    invoke-interface {v2}, La3/f2;->r()V

    goto :goto_8

    :cond_e
    iget v7, v2, Lb2/v;->y:I

    const/16 v9, 0x10

    and-int/2addr v7, v9

    if-eqz v7, :cond_14

    instance-of v7, v2, La3/o;

    if-eqz v7, :cond_14

    move-object v7, v2

    check-cast v7, La3/o;

    iget-object v7, v7, La3/o;->P:Lb2/v;

    :goto_6
    const/4 v13, 0x1

    if-eqz v7, :cond_13

    iget v14, v7, Lb2/v;->y:I

    and-int/2addr v14, v9

    if-eqz v14, :cond_12

    add-int/lit8 v5, v5, 0x1

    if-ne v5, v13, :cond_f

    move-object v2, v7

    goto :goto_7

    :cond_f
    if-nez v4, :cond_10

    new-instance v4, Lr1/c;

    new-array v13, v9, [Lb2/v;

    invoke-direct {v4, v13}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_10
    if-eqz v2, :cond_11

    invoke-virtual {v4, v2}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v2, v1

    :cond_11
    invoke-virtual {v4, v7}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_12
    :goto_7
    iget-object v7, v7, Lb2/v;->F:Lb2/v;

    goto :goto_6

    :cond_13
    if-ne v5, v13, :cond_14

    goto :goto_5

    :cond_14
    :goto_8
    invoke-static {v4}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v2

    goto :goto_5

    :cond_15
    move v1, v5

    :goto_9
    if-eqz v1, :cond_1d

    new-instance v0, La3/q1;

    move-object v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v4, p3

    move/from16 v7, p6

    move/from16 v9, p8

    invoke-direct/range {v0 .. v9}, La3/q1;-><init>(Landroidx/compose/ui/node/NodeCoordinator;Lb2/v;La3/e;JLa3/v;IZF)V

    iget-object v1, v6, La3/v;->x:La0/j0;

    iget-object v3, v6, La3/v;->w:La0/q0;

    iget v4, v6, La3/v;->y:I

    invoke-static {v6}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v5

    if-ne v4, v5, :cond_1a

    iget v4, v6, La3/v;->y:I

    add-int/lit8 v5, v4, 0x1

    iget v7, v3, La0/q0;->b:I

    invoke-virtual {v6, v5, v7}, La3/v;->c(II)V

    iget v7, v6, La3/v;->y:I

    add-int/2addr v7, v12

    iput v7, v6, La3/v;->y:I

    invoke-virtual {v3, v2}, La0/q0;->a(Ljava/lang/Object;)V

    invoke-static {v9, v8, v10}, Lds/q;->k(FZZ)J

    move-result-wide v7

    invoke-virtual {v1, v7, v8}, La0/j0;->a(J)V

    invoke-virtual {v0}, La3/q1;->invoke()Ljava/lang/Object;

    iput v4, v6, La3/v;->y:I

    invoke-static {v6}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    if-eq v5, v0, :cond_17

    invoke-virtual {v6}, La3/v;->a()J

    move-result-wide v4

    invoke-static {v4, v5}, Lds/p;->K(J)Z

    move-result v0

    if-eqz v0, :cond_16

    goto :goto_a

    :cond_16
    return-void

    :cond_17
    :goto_a
    iget v0, v6, La3/v;->y:I

    add-int/lit8 v2, v0, 0x1

    invoke-virtual {v3, v2}, La0/q0;->j(I)Ljava/lang/Object;

    if-ltz v2, :cond_19

    iget v3, v1, La0/j0;->b:I

    if-ge v2, v3, :cond_19

    iget-object v4, v1, La0/j0;->a:[J

    aget-wide v5, v4, v2

    add-int/lit8 v5, v3, -0x1

    if-eq v2, v5, :cond_18

    add-int/lit8 v0, v0, 0x2

    invoke-static {v4, v4, v2, v0, v3}, Lm83/n;->g0([J[JIII)V

    :cond_18
    iget v0, v1, La0/j0;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, v1, La0/j0;->b:I

    return-void

    :cond_19
    const-string v0, "Index must be between 0 and size"

    invoke-static {v0}, Lug/m;->Q(Ljava/lang/String;)V

    throw v11

    :cond_1a
    invoke-virtual {v6}, La3/v;->a()J

    move-result-wide v4

    iget v7, v6, La3/v;->y:I

    invoke-static {v6}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v11

    iput v11, v6, La3/v;->y:I

    add-int/lit8 v13, v11, 0x1

    iget v14, v3, La0/q0;->b:I

    invoke-virtual {v6, v13, v14}, La3/v;->c(II)V

    iget v13, v6, La3/v;->y:I

    add-int/2addr v13, v12

    iput v13, v6, La3/v;->y:I

    invoke-virtual {v3, v2}, La0/q0;->a(Ljava/lang/Object;)V

    invoke-static {v9, v8, v10}, Lds/q;->k(FZZ)J

    move-result-wide v8

    invoke-virtual {v1, v8, v9}, La0/j0;->a(J)V

    invoke-virtual {v0}, La3/q1;->invoke()Ljava/lang/Object;

    iput v11, v6, La3/v;->y:I

    invoke-virtual {v6}, La3/v;->a()J

    move-result-wide v0

    iget v2, v6, La3/v;->y:I

    add-int/2addr v2, v12

    invoke-static {v6}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v8

    if-ge v2, v8, :cond_1c

    invoke-static {v4, v5, v0, v1}, Lds/p;->x(JJ)I

    move-result v2

    if-lez v2, :cond_1c

    add-int/lit8 v2, v7, 0x1

    invoke-static {v0, v1}, Lds/p;->K(J)Z

    move-result v0

    if-eqz v0, :cond_1b

    iget v0, v6, La3/v;->y:I

    add-int/lit8 v0, v0, 0x2

    goto :goto_b

    :cond_1b
    iget v0, v6, La3/v;->y:I

    add-int/2addr v0, v12

    :goto_b
    invoke-virtual {v6, v2, v0}, La3/v;->c(II)V

    goto :goto_c

    :cond_1c
    iget v0, v6, La3/v;->y:I

    add-int/2addr v0, v12

    iget v1, v3, La0/q0;->b:I

    invoke-virtual {v6, v0, v1}, La3/v;->c(II)V

    :goto_c
    iput v7, v6, La3/v;->y:I

    return-void

    :cond_1d
    move/from16 v9, p8

    move-object v2, v0

    invoke-virtual/range {p2 .. p2}, La3/e;->b()I

    move-result v0

    invoke-static {v2, v0}, La3/g;->c(La3/n;I)Lb2/v;

    move-result-object v1

    const/4 v9, 0x0

    move-object v0, p0

    move-object/from16 v2, p2

    move-wide/from16 v3, p3

    move-object v5, v6

    move v7, v8

    move/from16 v6, p6

    move/from16 v8, p8

    invoke-virtual/range {v0 .. v9}, Landroidx/compose/ui/node/NodeCoordinator;->u1(Lb2/v;La3/e;JLa3/v;IZFZ)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public abstract v1(Li2/v;Ll2/c;)V
.end method

.method public final w1(JFLkotlin/jvm/functions/Function1;Ll2/c;)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v3, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    if-eqz p5, :cond_3

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    const-string p4, "both ways to create layers shouldn\'t be used together"

    invoke-static {p4}, Lx2/a;->a(Ljava/lang/String;)V

    :goto_0
    iget-object p4, p0, Landroidx/compose/ui/node/NodeCoordinator;->j0:Ll2/c;

    if-eq p4, p5, :cond_1

    iput-object v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->j0:Ll2/c;

    invoke-virtual {p0, v2, v0}, Landroidx/compose/ui/node/NodeCoordinator;->F1(Lkotlin/jvm/functions/Function1;Z)V

    iput-object p5, p0, Landroidx/compose/ui/node/NodeCoordinator;->j0:Ll2/c;

    :cond_1
    iget-object p4, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-nez p4, :cond_5

    invoke-static {v3}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object p4

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->f0:La3/n1;

    if-nez v0, :cond_2

    new-instance v0, La3/o1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, La3/o1;-><init>(Landroidx/compose/ui/node/NodeCoordinator;I)V

    new-instance v2, La3/n1;

    const/4 v4, 0x0

    invoke-direct {v2, v4, p0, v0}, La3/n1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->f0:La3/n1;

    move-object v0, v2

    :cond_2
    check-cast p4, Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->g0:La3/o1;

    invoke-virtual {p4, v0, v2, p5}, Landroidx/compose/ui/platform/AndroidComposeView;->g(Lc93/m;La3/o1;Ll2/c;)La3/a2;

    move-result-object p4

    iget-wide v4, p0, Ly2/j1;->y:J

    move-object p5, p4

    check-cast p5, Lb3/f2;

    invoke-virtual {p5, v4, v5}, Lb3/f2;->f(J)V

    invoke-virtual {p5, p1, p2}, Lb3/f2;->e(J)V

    iput-object p4, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    iput-boolean v1, v3, La3/n0;->h0:Z

    invoke-virtual {v2}, La3/o1;->invoke()Ljava/lang/Object;

    goto :goto_1

    :cond_3
    iget-object p5, p0, Landroidx/compose/ui/node/NodeCoordinator;->j0:Ll2/c;

    if-eqz p5, :cond_4

    iput-object v2, p0, Landroidx/compose/ui/node/NodeCoordinator;->j0:Ll2/c;

    invoke-virtual {p0, v2, v0}, Landroidx/compose/ui/node/NodeCoordinator;->F1(Lkotlin/jvm/functions/Function1;Z)V

    :cond_4
    invoke-virtual {p0, p4, v0}, Landroidx/compose/ui/node/NodeCoordinator;->F1(Lkotlin/jvm/functions/Function1;Z)V

    :cond_5
    :goto_1
    iget-wide p4, p0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    invoke-static {p4, p5, p1, p2}, Ly3/j;->b(JJ)Z

    move-result p4

    if-nez p4, :cond_8

    invoke-static {v3}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object p4

    const/high16 p5, -0x3f800000    # -4.0f

    check-cast p4, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p4, p5}, Landroidx/compose/ui/platform/AndroidComposeView;->P(F)V

    iput-wide p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    invoke-virtual {v3}, La3/n0;->t()La3/r0;

    move-result-object p4

    iget-object p4, p4, La3/r0;->p:La3/g1;

    invoke-virtual {p4}, La3/g1;->H0()V

    iget-object p4, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz p4, :cond_6

    check-cast p4, Lb3/f2;

    invoke-virtual {p4, p1, p2}, Lb3/f2;->e(J)V

    goto :goto_2

    :cond_6
    iget-object p1, p0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->n1()V

    :cond_7
    :goto_2
    invoke-virtual {v3}, La3/n0;->k0()V

    invoke-static {p0}, La3/w0;->S0(Landroidx/compose/ui/node/NodeCoordinator;)V

    iget-object p1, v3, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz p1, :cond_8

    check-cast p1, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p1, v3}, Landroidx/compose/ui/platform/AndroidComposeView;->B(La3/n0;)V

    :cond_8
    iput p3, p0, Landroidx/compose/ui/node/NodeCoordinator;->a0:F

    iget-boolean p1, p0, La3/w0;->K:Z

    if-nez p1, :cond_9

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->O0()Ly2/s0;

    move-result-object p1

    invoke-virtual {p0, p1}, La3/w0;->H0(Ly2/s0;)V

    :cond_9
    iget-object p1, v3, La3/n0;->e0:La3/l1;

    iget-object p1, p1, La3/l1;->e:Ljava/lang/Object;

    check-cast p1, Landroidx/compose/ui/node/NodeCoordinator;

    if-ne p0, p1, :cond_a

    invoke-static {v3}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object p1

    invoke-interface {p1}, Landroidx/compose/ui/node/Owner;->getRectManager()Lj3/b;

    move-result-object p1

    invoke-virtual {v3}, La3/n0;->z()La3/g1;

    move-result-object p2

    iget-boolean p2, p2, La3/g1;->K:Z

    xor-int/2addr p2, v1

    invoke-virtual {p1, v3, p2}, Lj3/b;->g(La3/n0;Z)V

    :cond_a
    return-void
.end method

.method public final x1(Lh2/a;ZZ)V
    .locals 10

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    const-wide v1, 0xffffffffL

    const/16 v3, 0x20

    if-eqz v0, :cond_3

    iget-boolean v4, p0, Landroidx/compose/ui/node/NodeCoordinator;->S:Z

    if-eqz v4, :cond_2

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->f1()J

    move-result-wide p2

    shr-long v4, p2, v3

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    and-long/2addr p2, v1

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    div-float/2addr p2, v5

    neg-float p3, v4

    neg-float v5, p2

    iget-wide v6, p0, Ly2/j1;->y:J

    shr-long v8, v6, v3

    long-to-int v8, v8

    int-to-float v8, v8

    add-float/2addr v8, v4

    and-long/2addr v6, v1

    long-to-int v4, v6

    int-to-float v4, v4

    add-float/2addr v4, p2

    invoke-virtual {p1, p3, v5, v8, v4}, Lh2/a;->a(FFFF)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    iget-wide p2, p0, Ly2/j1;->y:J

    shr-long v4, p2, v3

    long-to-int v4, v4

    int-to-float v4, v4

    and-long/2addr p2, v1

    long-to-int p2, p2

    int-to-float p2, p2

    const/4 p3, 0x0

    invoke-virtual {p1, p3, p3, v4, p2}, Lh2/a;->a(FFFF)V

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lh2/a;->b()Z

    move-result p2

    if-eqz p2, :cond_2

    return-void

    :cond_2
    const/4 p2, 0x0

    check-cast v0, Lb3/f2;

    invoke-virtual {v0, p1, p2}, Lb3/f2;->c(Lh2/a;Z)V

    :cond_3
    iget-wide p2, p0, Landroidx/compose/ui/node/NodeCoordinator;->Z:J

    shr-long v3, p2, v3

    long-to-int v0, v3

    iget v3, p1, Lh2/a;->a:F

    int-to-float v0, v0

    add-float/2addr v3, v0

    iput v3, p1, Lh2/a;->a:F

    iget v3, p1, Lh2/a;->c:F

    add-float/2addr v3, v0

    iput v3, p1, Lh2/a;->c:F

    and-long/2addr p2, v1

    long-to-int p2, p2

    iget p3, p1, Lh2/a;->b:F

    int-to-float p2, p2

    add-float/2addr p3, p2

    iput p3, p1, Lh2/a;->b:F

    iget p3, p1, Lh2/a;->d:F

    add-float/2addr p3, p2

    iput p3, p1, Lh2/a;->d:F

    return-void
.end method

.method public final y(J)J
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v0

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-static {v0}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/platform/AndroidComposeView;->K(J)J

    move-result-wide p1

    invoke-static {p0}, Ly2/q1;->h(Ly2/y;)Ly2/y;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->p1(Ly2/y;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final y1()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/node/NodeCoordinator;->j0:Ll2/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-object v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->j0:Ll2/c;

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v1, v0}, Landroidx/compose/ui/node/NodeCoordinator;->F1(Lkotlin/jvm/functions/Function1;Z)V

    iget-object v1, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v1, v0}, La3/n0;->u0(Z)V

    :cond_1
    return-void
.end method

.method public final z1(Ly2/s0;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/compose/ui/node/NodeCoordinator;->X:Ly2/s0;

    if-eq v1, v2, :cond_18

    iput-object v1, v0, Landroidx/compose/ui/node/NodeCoordinator;->X:Ly2/s0;

    iget-object v3, v0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ly2/s0;->getWidth()I

    move-result v5

    invoke-interface {v2}, Ly2/s0;->getWidth()I

    move-result v6

    if-ne v5, v6, :cond_0

    invoke-interface {v1}, Ly2/s0;->getHeight()I

    move-result v5

    invoke-interface {v2}, Ly2/s0;->getHeight()I

    move-result v2

    if-eq v5, v2, :cond_f

    :cond_0
    invoke-interface {v1}, Ly2/s0;->getWidth()I

    move-result v2

    invoke-interface {v1}, Ly2/s0;->getHeight()I

    move-result v5

    iget-object v6, v0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    const-wide v7, 0xffffffffL

    const/16 v9, 0x20

    if-eqz v6, :cond_1

    int-to-long v10, v2

    shl-long/2addr v10, v9

    int-to-long v12, v5

    and-long/2addr v12, v7

    or-long/2addr v10, v12

    check-cast v6, Lb3/f2;

    invoke-virtual {v6, v10, v11}, Lb3/f2;->f(J)V

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, La3/n0;->Y()Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v6, v0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Landroidx/compose/ui/node/NodeCoordinator;->n1()V

    :cond_2
    :goto_0
    int-to-long v10, v2

    shl-long v9, v10, v9

    int-to-long v5, v5

    and-long/2addr v5, v7

    or-long/2addr v5, v9

    invoke-virtual {v0, v5, v6}, Ly2/j1;->r0(J)V

    iget-object v2, v0, Landroidx/compose/ui/node/NodeCoordinator;->T:Lkotlin/jvm/functions/Function1;

    if-eqz v2, :cond_3

    invoke-virtual {v0, v4}, Landroidx/compose/ui/node/NodeCoordinator;->G1(Z)Z

    :cond_3
    const/4 v2, 0x4

    invoke-static {v2}, La3/r1;->g(I)Z

    move-result v5

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v6

    if-eqz v5, :cond_4

    goto :goto_1

    :cond_4
    iget-object v6, v6, Lb2/v;->E:Lb2/v;

    if-nez v6, :cond_5

    goto/16 :goto_7

    :cond_5
    :goto_1
    invoke-virtual {v0, v5}, Landroidx/compose/ui/node/NodeCoordinator;->i1(Z)Lb2/v;

    move-result-object v5

    :goto_2
    if-eqz v5, :cond_e

    iget v7, v5, Lb2/v;->z:I

    and-int/2addr v7, v2

    if-eqz v7, :cond_e

    iget v7, v5, Lb2/v;->y:I

    and-int/2addr v7, v2

    if-eqz v7, :cond_d

    const/4 v7, 0x0

    move-object v8, v5

    move-object v9, v7

    :goto_3
    if-eqz v8, :cond_d

    instance-of v10, v8, La3/r;

    if-eqz v10, :cond_6

    check-cast v8, La3/r;

    invoke-interface {v8}, La3/r;->c0()V

    goto :goto_6

    :cond_6
    iget v10, v8, Lb2/v;->y:I

    and-int/2addr v10, v2

    if-eqz v10, :cond_c

    instance-of v10, v8, La3/o;

    if-eqz v10, :cond_c

    move-object v10, v8

    check-cast v10, La3/o;

    iget-object v10, v10, La3/o;->P:Lb2/v;

    move v11, v4

    :goto_4
    const/4 v12, 0x1

    if-eqz v10, :cond_b

    iget v13, v10, Lb2/v;->y:I

    and-int/2addr v13, v2

    if-eqz v13, :cond_a

    add-int/lit8 v11, v11, 0x1

    if-ne v11, v12, :cond_7

    move-object v8, v10

    goto :goto_5

    :cond_7
    if-nez v9, :cond_8

    new-instance v9, Lr1/c;

    const/16 v12, 0x10

    new-array v12, v12, [Lb2/v;

    invoke-direct {v9, v12}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_8
    if-eqz v8, :cond_9

    invoke-virtual {v9, v8}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v8, v7

    :cond_9
    invoke-virtual {v9, v10}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_a
    :goto_5
    iget-object v10, v10, Lb2/v;->F:Lb2/v;

    goto :goto_4

    :cond_b
    if-ne v11, v12, :cond_c

    goto :goto_3

    :cond_c
    :goto_6
    invoke-static {v9}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v8

    goto :goto_3

    :cond_d
    if-eq v5, v6, :cond_e

    iget-object v5, v5, Lb2/v;->F:Lb2/v;

    goto :goto_2

    :cond_e
    :goto_7
    iget-object v2, v3, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz v2, :cond_f

    check-cast v2, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v2, v3}, Landroidx/compose/ui/platform/AndroidComposeView;->B(La3/n0;)V

    :cond_f
    iget-object v2, v0, Landroidx/compose/ui/node/NodeCoordinator;->Y:La0/m0;

    if-eqz v2, :cond_10

    iget v2, v2, La0/m0;->e:I

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    invoke-interface {v1}, Ly2/s0;->a()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_18

    :goto_8
    iget-object v2, v0, Landroidx/compose/ui/node/NodeCoordinator;->Y:La0/m0;

    invoke-interface {v1}, Ly2/s0;->a()Ljava/util/Map;

    move-result-object v5

    if-nez v2, :cond_11

    goto :goto_b

    :cond_11
    iget v6, v2, La0/m0;->e:I

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v7

    if-eq v6, v7, :cond_12

    goto :goto_b

    :cond_12
    iget-object v6, v2, La0/m0;->b:[Ljava/lang/Object;

    iget-object v7, v2, La0/m0;->c:[I

    iget-object v2, v2, La0/m0;->a:[J

    array-length v8, v2

    add-int/lit8 v8, v8, -0x2

    if-ltz v8, :cond_18

    move v9, v4

    :goto_9
    aget-wide v10, v2, v9

    not-long v12, v10

    const/4 v14, 0x7

    shl-long/2addr v12, v14

    and-long/2addr v12, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v12, v14

    cmp-long v12, v12, v14

    if-eqz v12, :cond_17

    sub-int v12, v9, v8

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    move v14, v4

    :goto_a
    if-ge v14, v12, :cond_16

    const-wide/16 v15, 0xff

    and-long/2addr v15, v10

    const-wide/16 v17, 0x80

    cmp-long v15, v15, v17

    if-gez v15, :cond_15

    shl-int/lit8 v15, v9, 0x3

    add-int/2addr v15, v14

    aget-object v16, v6, v15

    aget v15, v7, v15

    move-object/from16 v4, v16

    check-cast v4, Ly2/a;

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-nez v4, :cond_13

    goto :goto_b

    :cond_13
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eq v4, v15, :cond_15

    :goto_b
    invoke-virtual {v3}, La3/n0;->t()La3/r0;

    move-result-object v2

    iget-object v2, v2, La3/r0;->p:La3/g1;

    iget-object v2, v2, La3/g1;->Y:La3/o0;

    invoke-virtual {v2}, La3/a;->g()V

    iget-object v2, v0, Landroidx/compose/ui/node/NodeCoordinator;->Y:La0/m0;

    if-nez v2, :cond_14

    sget-object v2, La0/z0;->a:La0/m0;

    new-instance v2, La0/m0;

    invoke-direct {v2}, La0/m0;-><init>()V

    iput-object v2, v0, Landroidx/compose/ui/node/NodeCoordinator;->Y:La0/m0;

    :cond_14
    invoke-virtual {v2}, La0/m0;->a()V

    invoke-interface {v1}, Ly2/s0;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v2, v4, v3}, La0/m0;->h(Ljava/lang/Object;I)V

    goto :goto_c

    :cond_15
    shr-long/2addr v10, v13

    add-int/lit8 v14, v14, 0x1

    const/4 v4, 0x0

    goto :goto_a

    :cond_16
    if-ne v12, v13, :cond_18

    :cond_17
    if-eq v9, v8, :cond_18

    add-int/lit8 v9, v9, 0x1

    const/4 v4, 0x0

    goto/16 :goto_9

    :cond_18
    return-void
.end method
