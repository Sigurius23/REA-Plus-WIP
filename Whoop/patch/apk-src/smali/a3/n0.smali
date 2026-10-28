.class public final La3/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/i;
.implements La3/b2;
.implements La3/l;


# static fields
.field public static final p0:La3/g0;

.field public static final q0:La3/f0;

.field public static final r0:La3/e0;


# instance fields
.field public E:J

.field public F:Z

.field public G:La3/n0;

.field public H:I

.field public final I:Lwe/o;

.field public J:Lr1/c;

.field public K:Z

.field public L:La3/n0;

.field public M:Landroidx/compose/ui/node/Owner;

.field public N:Lb4/l;

.field public O:I

.field public P:Z

.field public Q:Z

.field public R:Li3/l;

.field public S:Z

.field public final T:Lr1/c;

.field public U:Z

.field public V:Ly2/r0;

.field public W:Lcom/google/crypto/tink/internal/l0;

.field public X:Ly3/c;

.field public Y:Ly3/m;

.field public Z:Lb3/j3;

.field public a0:Lp1/z;

.field public b0:La3/j0;

.field public c0:La3/j0;

.field public d0:Z

.field public final e0:La3/l1;

.field public f0:Ly2/n0;

.field public g0:Landroidx/compose/ui/node/NodeCoordinator;

.field public h0:Z

.field public i0:Landroidx/compose/ui/Modifier;

.field public j0:Landroidx/compose/ui/Modifier;

.field public k0:Lb4/d;

.field public l0:Lb4/e;

.field private final layoutDelegate:La3/r0;

.field public m0:Z

.field public n0:I

.field public o0:Z

.field public final w:Z

.field public x:I

.field public y:J

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La3/g0;

    const-string v1, "Undefined intrinsics block and it is required"

    invoke-direct {v0, v1}, La3/i0;-><init>(Ljava/lang/String;)V

    sput-object v0, La3/n0;->p0:La3/g0;

    new-instance v0, La3/f0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La3/n0;->q0:La3/f0;

    new-instance v0, La3/e0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La3/e0;-><init>(I)V

    sput-object v0, La3/n0;->r0:La3/e0;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    move p1, v0

    .line 1
    :goto_0
    sget-object v1, Li3/n;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    .line 2
    invoke-direct {p0, p1, v0}, La3/n0;-><init>(ZI)V

    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 4

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-boolean p1, p0, La3/n0;->w:Z

    .line 5
    iput p2, p0, La3/n0;->x:I

    const-wide p1, 0x7fffffff7fffffffL

    .line 6
    iput-wide p1, p0, La3/n0;->y:J

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p0, La3/n0;->z:J

    .line 8
    iput-wide p1, p0, La3/n0;->E:J

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, La3/n0;->F:Z

    .line 10
    new-instance p2, Lwe/o;

    .line 11
    new-instance v0, Lr1/c;

    const/16 v1, 0x10

    new-array v2, v1, [La3/n0;

    invoke-direct {v0, v2}, Lr1/c;-><init>([Ljava/lang/Object;)V

    .line 12
    new-instance v2, La3/l0;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p2, v0, v2}, Lwe/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, La3/n0;->I:Lwe/o;

    .line 13
    new-instance p2, Lr1/c;

    new-array v0, v1, [La3/n0;

    invoke-direct {p2, v0}, Lr1/c;-><init>([Ljava/lang/Object;)V

    .line 14
    iput-object p2, p0, La3/n0;->T:Lr1/c;

    .line 15
    iput-boolean p1, p0, La3/n0;->U:Z

    .line 16
    sget-object p2, La3/n0;->p0:La3/g0;

    iput-object p2, p0, La3/n0;->V:Ly2/r0;

    .line 17
    sget-object p2, La3/q0;->a:Ly3/d;

    .line 18
    iput-object p2, p0, La3/n0;->X:Ly3/c;

    .line 19
    sget-object p2, Ly3/m;->w:Ly3/m;

    iput-object p2, p0, La3/n0;->Y:Ly3/m;

    .line 20
    sget-object p2, La3/n0;->q0:La3/f0;

    iput-object p2, p0, La3/n0;->Z:Lb3/j3;

    .line 21
    sget-object p2, Lp1/z;->o:Lp1/y;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    sget-object p2, Lp1/y;->b:Lx1/g;

    .line 23
    iput-object p2, p0, La3/n0;->a0:Lp1/z;

    .line 24
    sget-object p2, La3/j0;->y:La3/j0;

    iput-object p2, p0, La3/n0;->b0:La3/j0;

    .line 25
    iput-object p2, p0, La3/n0;->c0:La3/j0;

    .line 26
    new-instance p2, La3/l1;

    invoke-direct {p2, p0}, La3/l1;-><init>(La3/n0;)V

    iput-object p2, p0, La3/n0;->e0:La3/l1;

    .line 27
    new-instance p2, La3/r0;

    invoke-direct {p2, p0}, La3/r0;-><init>(La3/n0;)V

    iput-object p2, p0, La3/n0;->layoutDelegate:La3/r0;

    .line 28
    iput-boolean p1, p0, La3/n0;->h0:Z

    .line 29
    sget-object p1, Lb2/t;->w:Lb2/t;

    iput-object p1, p0, La3/n0;->i0:Landroidx/compose/ui/Modifier;

    return-void
.end method

.method public static F()Landroidx/compose/ui/node/NodeCoordinator;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public static c0(La3/n0;)Z
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->q:La3/c1;

    if-eqz v0, :cond_0

    iget-object v0, v0, La3/c1;->N:Ly3/a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, La3/n0;->b0(Ly3/a;)Z

    move-result p0

    return p0
.end method

.method private final l(La3/n0;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot insert "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " because it already has a parent or an owner. This tree: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, La3/n0;->h(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " Other tree: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, La3/n0;->L:La3/n0;

    if-eqz p1, :cond_0

    invoke-virtual {p1, v1}, La3/n0;->h(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static o0(La3/n0;)Z
    .locals 3

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->p:La3/g1;

    iget-boolean v1, v0, La3/g1;->J:Z

    if-eqz v1, :cond_0

    iget-wide v0, v0, Ly2/j1;->z:J

    new-instance v2, Ly3/a;

    invoke-direct {v2, v0, v1}, Ly3/a;-><init>(J)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0, v2}, La3/n0;->n0(Ly3/a;)Z

    move-result p0

    return p0
.end method

.method public static t0(La3/n0;ZI)V
    .locals 4

    and-int/lit8 v0, p2, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p1, v1

    :cond_0
    and-int/lit8 v0, p2, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_2

    move v1, v2

    :cond_2
    iget-object p2, p0, La3/n0;->G:La3/n0;

    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    const-string p2, "Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope"

    invoke-static {p2}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_1
    iget-object p2, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-nez p2, :cond_4

    goto :goto_4

    :cond_4
    iget-boolean v3, p0, La3/n0;->P:Z

    if-nez v3, :cond_b

    iget-boolean v3, p0, La3/n0;->w:Z

    if-nez v3, :cond_b

    check-cast p2, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p2, p0, v2, p1, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->C(La3/n0;ZZZ)V

    if-eqz v1, :cond_b

    iget-object p0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object p0, p0, La3/r0;->q:La3/c1;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p0, p0, La3/c1;->F:La3/r0;

    iget-object p2, p0, La3/r0;->a:La3/n0;

    invoke-virtual {p2}, La3/n0;->G()La3/n0;

    move-result-object p2

    iget-object p0, p0, La3/r0;->a:La3/n0;

    iget-object p0, p0, La3/n0;->b0:La3/j0;

    if-eqz p2, :cond_b

    sget-object v0, La3/j0;->y:La3/j0;

    if-eq p0, v0, :cond_b

    :goto_2
    iget-object v0, p2, La3/n0;->b0:La3/j0;

    if-ne v0, p0, :cond_6

    invoke-virtual {p2}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    move-object p2, v0

    goto :goto_2

    :cond_6
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_9

    if-ne p0, v2, :cond_8

    iget-object p0, p2, La3/n0;->G:La3/n0;

    if-eqz p0, :cond_7

    invoke-virtual {p2, p1}, La3/n0;->s0(Z)V

    return-void

    :cond_7
    invoke-virtual {p2, p1}, La3/n0;->u0(Z)V

    return-void

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Intrinsics isn\'t used by the parent"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    iget-object p0, p2, La3/n0;->G:La3/n0;

    const/4 v0, 0x6

    if-eqz p0, :cond_a

    invoke-static {p2, p1, v0}, La3/n0;->t0(La3/n0;ZI)V

    return-void

    :cond_a
    invoke-static {p2, p1, v0}, La3/n0;->v0(La3/n0;ZI)V

    :cond_b
    :goto_4
    return-void
.end method

.method public static v0(La3/n0;ZI)V
    .locals 4

    and-int/lit8 v0, p2, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p1, v1

    :cond_0
    and-int/lit8 v0, p2, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_2

    move p2, v2

    goto :goto_1

    :cond_2
    move p2, v1

    :goto_1
    iget-boolean v3, p0, La3/n0;->P:Z

    if-nez v3, :cond_8

    iget-boolean v3, p0, La3/n0;->w:Z

    if-nez v3, :cond_8

    iget-object v3, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-nez v3, :cond_3

    goto :goto_4

    :cond_3
    check-cast v3, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v3, p0, v1, p1, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->C(La3/n0;ZZZ)V

    if-eqz p2, :cond_8

    iget-object p0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object p0, p0, La3/r0;->p:La3/g1;

    iget-object p0, p0, La3/g1;->F:La3/r0;

    iget-object p2, p0, La3/r0;->a:La3/n0;

    invoke-virtual {p2}, La3/n0;->G()La3/n0;

    move-result-object p2

    iget-object p0, p0, La3/r0;->a:La3/n0;

    iget-object p0, p0, La3/n0;->b0:La3/j0;

    if-eqz p2, :cond_8

    sget-object v0, La3/j0;->y:La3/j0;

    if-eq p0, v0, :cond_8

    :goto_2
    iget-object v0, p2, La3/n0;->b0:La3/j0;

    if-ne v0, p0, :cond_5

    invoke-virtual {p2}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    move-object p2, v0

    goto :goto_2

    :cond_5
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_7

    if-ne p0, v2, :cond_6

    invoke-virtual {p2, p1}, La3/n0;->u0(Z)V

    return-void

    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Intrinsics isn\'t used by the parent"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    const/4 p0, 0x6

    invoke-static {p2, p1, p0}, La3/n0;->v0(La3/n0;ZI)V

    :cond_8
    :goto_4
    return-void
.end method

.method public static w0(La3/n0;)V
    .locals 4

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->d:La3/h0;

    sget-object v1, La3/k0;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-boolean v2, v0, La3/r0;->e:Z

    const/4 v3, 0x6

    if-eqz v2, :cond_0

    invoke-static {p0, v1, v3}, La3/n0;->t0(La3/n0;ZI)V

    return-void

    :cond_0
    iget-boolean v0, v0, La3/r0;->f:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1}, La3/n0;->s0(Z)V

    :cond_1
    invoke-virtual {p0}, La3/n0;->A()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0, v1, v3}, La3/n0;->v0(La3/n0;ZI)V

    return-void

    :cond_2
    invoke-virtual {p0}, La3/n0;->u()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v1}, La3/n0;->u0(Z)V

    :cond_3
    return-void

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected state "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object p0, p0, La3/r0;->d:La3/h0;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final A()Z
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->p:La3/g1;

    iget-boolean v0, v0, La3/g1;->V:Z

    return v0
.end method

.method public final A0(Ly3/c;)V
    .locals 1

    iget-object v0, p0, La3/n0;->X:Ly3/c;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, La3/n0;->X:Ly3/c;

    invoke-virtual {p0}, La3/n0;->R()V

    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, La3/n0;->P()V

    :cond_0
    invoke-virtual {p0}, La3/n0;->Q()V

    iget-object p1, p0, La3/n0;->e0:La3/l1;

    iget-object p1, p1, La3/l1;->g:Ljava/lang/Object;

    check-cast p1, Lb2/v;

    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, La3/n;->c()V

    iget-object p1, p1, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final B()La3/j0;
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->p:La3/g1;

    iget-object v0, v0, La3/g1;->L:La3/j0;

    return-object v0
.end method

.method public final B0(I)V
    .locals 2

    iget v0, p0, La3/n0;->n0:I

    if-eq v0, p1, :cond_2

    if-lez p1, :cond_0

    if-nez v0, :cond_0

    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v1, v0, La3/n0;->n0:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, La3/n0;->B0(I)V

    :cond_0
    if-nez p1, :cond_1

    iget v0, p0, La3/n0;->n0:I

    if-lez v0, :cond_1

    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v1, v0, La3/n0;->n0:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, La3/n0;->B0(I)V

    :cond_1
    iput p1, p0, La3/n0;->n0:I

    :cond_2
    return-void
.end method

.method public final C()La3/j0;
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->q:La3/c1;

    if-eqz v0, :cond_1

    iget-object v0, v0, La3/c1;->J:La3/j0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    sget-object v0, La3/j0;->y:La3/j0;

    return-object v0
.end method

.method public final C0(La3/n0;)V
    .locals 2

    iget-object v0, p0, La3/n0;->G:La3/n0;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iput-object p1, p0, La3/n0;->G:La3/n0;

    if-eqz p1, :cond_1

    iget-object p1, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, p1, La3/r0;->q:La3/c1;

    if-nez v0, :cond_0

    new-instance v0, La3/c1;

    invoke-direct {v0, p1}, La3/c1;-><init>(La3/r0;)V

    iput-object v0, p1, La3/r0;->q:La3/c1;

    :cond_0
    iget-object p1, p0, La3/n0;->e0:La3/l1;

    iget-object v0, p1, La3/l1;->e:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/NodeCoordinator;

    iget-object p1, p1, La3/l1;->d:Ljava/lang/Object;

    check-cast p1, Landroidx/compose/ui/node/a;

    iget-object p1, p1, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->b1()V

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    goto :goto_0

    :cond_1
    iget-object p1, p0, La3/n0;->layoutDelegate:La3/r0;

    const/4 v0, 0x0

    iput-object v0, p1, La3/r0;->q:La3/c1;

    const/4 v0, 0x0

    iput-boolean v0, p1, La3/r0;->f:Z

    iput-boolean v0, p1, La3/r0;->e:Z

    :cond_2
    invoke-virtual {p0}, La3/n0;->R()V

    :cond_3
    return-void
.end method

.method public final D()Ljava/util/List;
    .locals 10

    iget-object v0, p0, La3/n0;->e0:La3/l1;

    iget-object v1, v0, La3/l1;->h:Ljava/lang/Object;

    check-cast v1, Lr1/c;

    if-nez v1, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0

    :cond_0
    iget v2, v1, Lr1/c;->y:I

    new-instance v3, Lr1/c;

    new-array v2, v2, [Ly2/y0;

    invoke-direct {v3, v2}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iget-object v2, v0, La3/l1;->g:Ljava/lang/Object;

    check-cast v2, Lb2/v;

    const/4 v4, 0x0

    :goto_0
    if-eqz v2, :cond_4

    iget-object v5, v0, La3/l1;->f:Ljava/lang/Object;

    check-cast v5, La3/l2;

    if-eq v2, v5, :cond_4

    iget-object v6, v2, Lb2/v;->H:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v6, :cond_3

    iget-object v7, v6, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    iget-object v8, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v8, Landroidx/compose/ui/node/a;

    iget-object v8, v8, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    iget-object v9, v2, Lb2/v;->F:Lb2/v;

    if-ne v9, v5, :cond_1

    iget-object v5, v9, Lb2/v;->H:Landroidx/compose/ui/node/NodeCoordinator;

    if-eq v6, v5, :cond_1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_1
    if-nez v7, :cond_2

    move-object v7, v8

    :cond_2
    new-instance v5, Ly2/y0;

    add-int/lit8 v8, v4, 0x1

    iget-object v9, v1, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v4, v9, v4

    check-cast v4, Landroidx/compose/ui/Modifier;

    invoke-direct {v5, v4, v6, v7}, Ly2/y0;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/node/NodeCoordinator;La3/a2;)V

    invoke-virtual {v3, v5}, Lr1/c;->b(Ljava/lang/Object;)V

    iget-object v2, v2, Lb2/v;->F:Lb2/v;

    move v4, v8

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "getModifierInfo called on node with no coordinator"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-virtual {v3}, Lr1/c;->f()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final D0(Ly2/r0;)V
    .locals 1

    iget-object v0, p0, La3/n0;->V:Ly2/r0;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, La3/n0;->V:Ly2/r0;

    iget-object v0, p0, La3/n0;->W:Lcom/google/crypto/tink/internal/l0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, La3/n0;->R()V

    :cond_1
    return-void
.end method

.method public final E()Lcom/google/crypto/tink/internal/l0;
    .locals 2

    iget-object v0, p0, La3/n0;->W:Lcom/google/crypto/tink/internal/l0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/crypto/tink/internal/l0;

    iget-object v1, p0, La3/n0;->V:Ly2/r0;

    invoke-direct {v0, p0, v1}, Lcom/google/crypto/tink/internal/l0;-><init>(La3/n0;Ly2/r0;)V

    iput-object v0, p0, La3/n0;->W:Lcom/google/crypto/tink/internal/l0;

    :cond_0
    return-object v0
.end method

.method public final E0(Landroidx/compose/ui/Modifier;)V
    .locals 2

    iget-boolean v0, p0, La3/n0;->w:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, La3/n0;->i0:Landroidx/compose/ui/Modifier;

    sget-object v1, Lb2/t;->w:Lb2/t;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Modifiers are not supported on virtual LayoutNodes"

    invoke-static {v0}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_1
    :goto_0
    iget-boolean v0, p0, La3/n0;->o0:Z

    if-eqz v0, :cond_2

    const-string v0, "modifier is updated when deactivated"

    invoke-static {v0}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0}, La3/n0;->X()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0, p1}, La3/n0;->b(Landroidx/compose/ui/Modifier;)V

    iget-boolean p1, p0, La3/n0;->Q:Z

    if-eqz p1, :cond_3

    invoke-virtual {p0}, La3/n0;->V()V

    :cond_3
    return-void

    :cond_4
    iput-object p1, p0, La3/n0;->j0:Landroidx/compose/ui/Modifier;

    return-void
.end method

.method public final F0(Lb3/j3;)V
    .locals 8

    iget-object v0, p0, La3/n0;->Z:Lb3/j3;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    iput-object p1, p0, La3/n0;->Z:Lb3/j3;

    iget-object p1, p0, La3/n0;->e0:La3/l1;

    iget-object p1, p1, La3/l1;->g:Ljava/lang/Object;

    check-cast p1, Lb2/v;

    iget v0, p1, Lb2/v;->z:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-eqz v0, :cond_8

    :goto_0
    if-eqz p1, :cond_8

    iget v0, p1, Lb2/v;->y:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_7

    const/4 v0, 0x0

    move-object v2, p1

    move-object v3, v0

    :goto_1
    if-eqz v2, :cond_7

    instance-of v4, v2, La3/f2;

    if-eqz v4, :cond_0

    check-cast v2, La3/f2;

    invoke-interface {v2}, La3/f2;->F0()V

    goto :goto_4

    :cond_0
    iget v4, v2, Lb2/v;->y:I

    and-int/2addr v4, v1

    if-eqz v4, :cond_6

    instance-of v4, v2, La3/o;

    if-eqz v4, :cond_6

    move-object v4, v2

    check-cast v4, La3/o;

    iget-object v4, v4, La3/o;->P:Lb2/v;

    const/4 v5, 0x0

    :goto_2
    const/4 v6, 0x1

    if-eqz v4, :cond_5

    iget v7, v4, Lb2/v;->y:I

    and-int/2addr v7, v1

    if-eqz v7, :cond_4

    add-int/lit8 v5, v5, 0x1

    if-ne v5, v6, :cond_1

    move-object v2, v4

    goto :goto_3

    :cond_1
    if-nez v3, :cond_2

    new-instance v3, Lr1/c;

    new-array v6, v1, [Lb2/v;

    invoke-direct {v3, v6}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v3, v2}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v2, v0

    :cond_3
    invoke-virtual {v3, v4}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_4
    :goto_3
    iget-object v4, v4, Lb2/v;->F:Lb2/v;

    goto :goto_2

    :cond_5
    if-ne v5, v6, :cond_6

    goto :goto_1

    :cond_6
    :goto_4
    invoke-static {v3}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v2

    goto :goto_1

    :cond_7
    iget v0, p1, Lb2/v;->z:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_8

    iget-object p1, p1, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_8
    return-void
.end method

.method public final G()La3/n0;
    .locals 3

    iget-object v0, p0, La3/n0;->L:La3/n0;

    :goto_0
    if-eqz v0, :cond_0

    iget-boolean v1, v0, La3/n0;->w:Z

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v0, v0, La3/n0;->L:La3/n0;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final G0()V
    .locals 6

    iget v0, p0, La3/n0;->H:I

    if-lez v0, :cond_3

    iget-boolean v0, p0, La3/n0;->K:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    iput-boolean v0, p0, La3/n0;->K:Z

    iget-object v1, p0, La3/n0;->J:Lr1/c;

    if-nez v1, :cond_0

    new-instance v1, Lr1/c;

    const/16 v2, 0x10

    new-array v2, v2, [La3/n0;

    invoke-direct {v1, v2}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object v1, p0, La3/n0;->J:Lr1/c;

    :cond_0
    invoke-virtual {v1}, Lr1/c;->g()V

    iget-object v2, p0, La3/n0;->I:Lwe/o;

    iget-object v2, v2, Lwe/o;->w:Ljava/lang/Object;

    check-cast v2, Lr1/c;

    iget-object v3, v2, Lr1/c;->w:[Ljava/lang/Object;

    iget v2, v2, Lr1/c;->y:I

    :goto_0
    if-ge v0, v2, :cond_2

    aget-object v4, v3, v0

    check-cast v4, La3/n0;

    iget-boolean v5, v4, La3/n0;->w:Z

    if-eqz v5, :cond_1

    invoke-virtual {v4}, La3/n0;->M()Lr1/c;

    move-result-object v4

    iget v5, v1, Lr1/c;->y:I

    invoke-virtual {v1, v5, v4}, Lr1/c;->d(ILr1/c;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v4}, Lr1/c;->b(Ljava/lang/Object;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v1, v0, La3/r0;->p:La3/g1;

    const/4 v2, 0x1

    iput-boolean v2, v1, La3/g1;->a0:Z

    iget-object v0, v0, La3/r0;->q:La3/c1;

    if-eqz v0, :cond_3

    iput-boolean v2, v0, La3/c1;->U:Z

    :cond_3
    return-void
.end method

.method public final H()I
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->p:La3/g1;

    iget v0, v0, La3/g1;->I:I

    return v0
.end method

.method public final I()Li3/l;
    .locals 2

    invoke-virtual {p0}, La3/n0;->X()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, La3/n0;->o0:Z

    if-nez v0, :cond_1

    iget-object v0, p0, La3/n0;->e0:La3/l1;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, La3/l1;->j(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, La3/n0;->R:Li3/l;

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final J()I
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->p:La3/g1;

    iget v0, v0, Ly2/j1;->w:I

    return v0
.end method

.method public final K()F
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->p:La3/g1;

    iget v0, v0, La3/g1;->f0:F

    return v0
.end method

.method public final L()Lr1/c;
    .locals 5

    iget-boolean v0, p0, La3/n0;->U:Z

    iget-object v1, p0, La3/n0;->T:Lr1/c;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lr1/c;->g()V

    invoke-virtual {p0}, La3/n0;->M()Lr1/c;

    move-result-object v0

    iget v2, v1, Lr1/c;->y:I

    invoke-virtual {v1, v2, v0}, Lr1/c;->d(ILr1/c;)V

    iget-object v0, v1, Lr1/c;->w:[Ljava/lang/Object;

    iget v2, v1, Lr1/c;->y:I

    sget-object v3, La3/n0;->r0:La3/e0;

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v2}, Lm83/n;->P0([Ljava/lang/Object;Ljava/util/Comparator;II)V

    iput-boolean v4, p0, La3/n0;->U:Z

    :cond_0
    return-object v1
.end method

.method public final M()Lr1/c;
    .locals 1

    invoke-virtual {p0}, La3/n0;->G0()V

    iget v0, p0, La3/n0;->H:I

    if-nez v0, :cond_0

    iget-object v0, p0, La3/n0;->I:Lwe/o;

    iget-object v0, v0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lr1/c;

    return-object v0

    :cond_0
    iget-object v0, p0, La3/n0;->J:Lr1/c;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final N(JLa3/v;IZ)V
    .locals 10

    iget-object v0, p0, La3/n0;->e0:La3/l1;

    iget-object v1, v0, La3/l1;->e:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/node/NodeCoordinator;

    sget-object v2, Landroidx/compose/ui/node/NodeCoordinator;->k0:Li2/x0;

    invoke-virtual {v1, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->d1(J)J

    move-result-wide v5

    iget-object p1, v0, La3/l1;->e:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Landroidx/compose/ui/node/NodeCoordinator;

    sget-object v4, Landroidx/compose/ui/node/NodeCoordinator;->n0:La3/e;

    move-object v7, p3

    move v8, p4

    move v9, p5

    invoke-virtual/range {v3 .. v9}, Landroidx/compose/ui/node/NodeCoordinator;->l1(La3/e;JLa3/v;IZ)V

    return-void
.end method

.method public final O(ILa3/n0;)V
    .locals 2

    iget-object v0, p2, La3/n0;->L:La3/n0;

    if-eqz v0, :cond_1

    iget-object v0, p2, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2}, La3/n0;->l(La3/n0;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_1
    :goto_0
    iput-object p0, p2, La3/n0;->L:La3/n0;

    iget-object v0, p0, La3/n0;->I:Lwe/o;

    iget-object v1, v0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v1, Lr1/c;

    invoke-virtual {v1, p1, p2}, Lr1/c;->a(ILjava/lang/Object;)V

    iget-object p1, v0, Lwe/o;->x:Ljava/lang/Object;

    check-cast p1, La3/l0;

    invoke-virtual {p1}, La3/l0;->invoke()Ljava/lang/Object;

    invoke-virtual {p0}, La3/n0;->l0()V

    iget-boolean p1, p2, La3/n0;->w:Z

    if-eqz p1, :cond_2

    iget p1, p0, La3/n0;->H:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, La3/n0;->H:I

    :cond_2
    invoke-virtual {p0}, La3/n0;->W()V

    iget-object p1, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz p1, :cond_3

    invoke-virtual {p2, p1}, La3/n0;->c(Landroidx/compose/ui/node/Owner;)V

    :cond_3
    iget-object p1, p2, La3/n0;->layoutDelegate:La3/r0;

    iget p1, p1, La3/r0;->l:I

    if-lez p1, :cond_4

    iget-object p1, p0, La3/n0;->layoutDelegate:La3/r0;

    iget v0, p1, La3/r0;->l:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, La3/r0;->d(I)V

    :cond_4
    iget p1, p2, La3/n0;->n0:I

    if-lez p1, :cond_5

    iget p1, p0, La3/n0;->n0:I

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, La3/n0;->B0(I)V

    :cond_5
    return-void
.end method

.method public final P()V
    .locals 4

    iget-boolean v0, p0, La3/n0;->h0:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, La3/n0;->e0:La3/l1;

    iget-object v1, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/node/a;

    iget-object v0, v0, La3/l1;->e:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    const/4 v2, 0x0

    iput-object v2, p0, La3/n0;->g0:Landroidx/compose/ui/node/NodeCoordinator;

    :goto_0
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    if-eqz v1, :cond_0

    iget-object v3, v1, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    goto :goto_1

    :cond_0
    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_1

    iput-object v1, p0, La3/n0;->g0:Landroidx/compose/ui/node/NodeCoordinator;

    goto :goto_2

    :cond_1
    if-eqz v1, :cond_2

    iget-object v1, v1, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    goto :goto_0

    :cond_2
    move-object v1, v2

    goto :goto_0

    :cond_3
    :goto_2
    iget-object v0, p0, La3/n0;->g0:Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v0, :cond_5

    iget-object v1, v0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    const-string v0, "layer was not set"

    invoke-static {v0}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object v0

    throw v0

    :cond_5
    :goto_3
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->n1()V

    return-void

    :cond_6
    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, La3/n0;->P()V

    :cond_7
    return-void
.end method

.method public final Q()V
    .locals 4

    iget-object v0, p0, La3/n0;->e0:La3/l1;

    iget-object v1, v0, La3/l1;->e:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v2, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/ui/node/a;

    :goto_0
    if-eq v1, v2, :cond_1

    const-string v3, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/compose/ui/node/b;

    iget-object v3, v1, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz v3, :cond_0

    invoke-interface {v3}, La3/a2;->invalidate()V

    :cond_0
    iget-object v1, v1, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    goto :goto_0

    :cond_1
    iget-object v0, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->i0:La3/a2;

    if-eqz v0, :cond_2

    invoke-interface {v0}, La3/a2;->invalidate()V

    :cond_2
    return-void
.end method

.method public final R()V
    .locals 3

    iget-boolean v0, p0, La3/n0;->w:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La3/n0;->R()V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, La3/n0;->G:La3/n0;

    const/4 v1, 0x7

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-static {p0, v2, v1}, La3/n0;->t0(La3/n0;ZI)V

    return-void

    :cond_2
    invoke-static {p0, v2, v1}, La3/n0;->v0(La3/n0;ZI)V

    return-void
.end method

.method public final S()V
    .locals 4

    iget-wide v0, p0, La3/n0;->y:J

    const-wide v2, 0x7fffffff7fffffffL

    invoke-static {v0, v1, v2, v3}, Ly3/j;->b(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iput-wide v2, p0, La3/n0;->y:J

    invoke-virtual {p0}, La3/n0;->M()Lr1/c;

    move-result-object v0

    iget-object v1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, v1, v2

    check-cast v3, La3/n0;

    invoke-virtual {v3}, La3/n0;->S()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final T()V
    .locals 3

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v1, v0, La3/r0;->p:La3/g1;

    const/4 v2, 0x1

    iput-boolean v2, v1, La3/g1;->R:Z

    iget-object v0, v0, La3/r0;->q:La3/c1;

    if-eqz v0, :cond_0

    iput-boolean v2, v0, La3/c1;->W:Z

    :cond_0
    return-void
.end method

.method public final U()Z
    .locals 1

    invoke-virtual {p0}, La3/n0;->X()Z

    move-result v0

    return v0
.end method

.method public final V()V
    .locals 5

    iget-boolean v0, p0, La3/n0;->S:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->c:Ljava/lang/Object;

    check-cast v0, La3/k1;

    iget-object v0, v0, Lb2/v;->F:Lb2/v;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, La3/n0;->j0:Landroidx/compose/ui/Modifier;

    if-eqz v0, :cond_2

    :goto_0
    iput-boolean v1, p0, La3/n0;->Q:Z

    return-void

    :cond_2
    iget-object v0, p0, La3/n0;->R:Li3/l;

    iput-boolean v1, p0, La3/n0;->S:Z

    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Li3/l;

    invoke-direct {v2}, Li3/l;-><init>()V

    iput-object v2, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {p0}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/node/Owner;->getSnapshotObserver()La3/c2;

    move-result-object v2

    new-instance v3, La3/m0;

    const/4 v4, 0x0

    invoke-direct {v3, v4, p0, v1}, La3/m0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v4, v2, La3/c2;->d:La3/f;

    invoke-virtual {v2, p0, v4, v3}, La3/c2;->a(La3/b2;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    const/4 v2, 0x0

    iput-boolean v2, p0, La3/n0;->S:Z

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Li3/l;

    iput-object v1, p0, La3/n0;->R:Li3/l;

    iput-boolean v2, p0, La3/n0;->Q:Z

    invoke-static {p0}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/ui/node/Owner;->getSemanticsOwner()Li3/r;

    move-result-object v2

    invoke-virtual {v2, p0, v0}, Li3/r;->b(La3/n0;Li3/l;)V

    check-cast v1, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->E()V

    return-void
.end method

.method public final W()V
    .locals 1

    iget v0, p0, La3/n0;->H:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, La3/n0;->K:Z

    :cond_0
    iget-boolean v0, p0, La3/n0;->w:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, La3/n0;->L:La3/n0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, La3/n0;->W()V

    :cond_1
    return-void
.end method

.method public final X()Z
    .locals 1

    iget-object v0, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Y()Z
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->p:La3/g1;

    iget-boolean v0, v0, La3/g1;->T:Z

    return v0
.end method

.method public final Z()Z
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->p:La3/g1;

    iget-boolean v0, v0, La3/g1;->U:Z

    return v0
.end method

.method public final a()V
    .locals 4

    iget-object v0, p0, La3/n0;->N:Lb4/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb4/l;->a()V

    :cond_0
    iget-object v0, p0, La3/n0;->f0:Ly2/n0;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Ly2/n0;->g(Z)V

    :cond_1
    iput-boolean v1, p0, La3/n0;->o0:Z

    iget-object v0, p0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->f:Ljava/lang/Object;

    check-cast v0, La3/l2;

    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_3

    iget-boolean v2, v1, Lb2/v;->N:Z

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lb2/v;->S0()V

    :cond_2
    iget-object v1, v1, Lb2/v;->E:Lb2/v;

    goto :goto_0

    :cond_3
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_5

    iget-boolean v2, v1, Lb2/v;->N:Z

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Lb2/v;->U0()V

    :cond_4
    iget-object v1, v1, Lb2/v;->E:Lb2/v;

    goto :goto_1

    :cond_5
    :goto_2
    if-eqz v0, :cond_7

    iget-boolean v1, v0, Lb2/v;->N:Z

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lb2/v;->O0()V

    :cond_6
    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    goto :goto_2

    :cond_7
    invoke-virtual {p0}, La3/n0;->X()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    iput-object v0, p0, La3/n0;->R:Li3/l;

    iput-boolean v1, p0, La3/n0;->Q:Z

    :cond_8
    iget-object v0, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz v0, :cond_9

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lj3/b;

    move-result-object v2

    invoke-virtual {v2, p0}, Lj3/b;->j(La3/n0;)V

    iget-object v0, v0, Landroidx/compose/ui/platform/AndroidComposeView;->i0:Lc2/d;

    if-eqz v0, :cond_9

    iget-object v2, v0, Lc2/d;->h:La0/h0;

    iget v3, p0, La3/n0;->x:I

    invoke-virtual {v2, v3}, La0/h0;->e(I)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, v0, Lc2/d;->a:Lad3/z;

    iget-object v0, v0, Lc2/d;->c:Landroidx/compose/ui/platform/AndroidComposeView;

    iget v3, p0, La3/n0;->x:I

    invoke-virtual {v2, v0, v3, v1}, Lad3/z;->p(Landroid/view/View;IZ)V

    :cond_9
    return-void
.end method

.method public final a0()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->q:La3/c1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La3/c1;->v()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b(Landroidx/compose/ui/Modifier;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, La3/n0;->e0:La3/l1;

    const/16 v7, 0x10

    invoke-virtual {v2, v7}, La3/l1;->j(I)Z

    move-result v8

    iget-object v3, v2, La3/l1;->f:Ljava/lang/Object;

    move-object v9, v3

    check-cast v9, La3/l2;

    const/16 v10, 0x400

    invoke-virtual {v2, v10}, La3/l1;->j(I)Z

    move-result v11

    iput-object v1, v0, La3/n0;->i0:Landroidx/compose/ui/Modifier;

    iget-object v3, v2, La3/l1;->d:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/ui/node/a;

    iget-object v4, v2, La3/l1;->b:Ljava/lang/Object;

    check-cast v4, La3/n0;

    iget-object v5, v2, La3/l1;->g:Ljava/lang/Object;

    check-cast v5, Lb2/v;

    iget-object v6, v2, La3/l1;->c:Ljava/lang/Object;

    move-object v12, v6

    check-cast v12, La3/k1;

    if-eq v5, v12, :cond_0

    goto :goto_0

    :cond_0
    const-string v5, "padChain called on already padded chain"

    invoke-static {v5}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_0
    iget-object v5, v2, La3/l1;->g:Ljava/lang/Object;

    check-cast v5, Lb2/v;

    iput-object v12, v5, Lb2/v;->E:Lb2/v;

    iput-object v5, v12, Lb2/v;->F:Lb2/v;

    iget-object v5, v2, La3/l1;->h:Ljava/lang/Object;

    check-cast v5, Lr1/c;

    if-eqz v5, :cond_1

    iget v6, v5, Lr1/c;->y:I

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    iget-object v14, v2, La3/l1;->i:Ljava/lang/Object;

    check-cast v14, Lr1/c;

    if-nez v14, :cond_2

    new-instance v14, Lr1/c;

    new-array v15, v7, [Lb2/u;

    invoke-direct {v14, v15}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_2
    iget-object v15, v2, La3/l1;->j:Ljava/lang/Object;

    check-cast v15, Lr1/c;

    invoke-virtual {v15, v1}, Lr1/c;->b(Ljava/lang/Object;)V

    const/16 v16, 0x0

    :goto_2
    iget v1, v15, Lr1/c;->y:I

    if-eqz v1, :cond_6

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v15, v1}, Lr1/c;->l(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/Modifier;

    instance-of v13, v1, Lb2/o;

    if-eqz v13, :cond_3

    check-cast v1, Lb2/o;

    iget-object v13, v1, Lb2/o;->x:Landroidx/compose/ui/Modifier;

    invoke-virtual {v15, v13}, Lr1/c;->b(Ljava/lang/Object;)V

    iget-object v1, v1, Lb2/o;->w:Landroidx/compose/ui/Modifier;

    invoke-virtual {v15, v1}, Lr1/c;->b(Ljava/lang/Object;)V

    goto :goto_4

    :cond_3
    instance-of v13, v1, Lb2/u;

    if-eqz v13, :cond_4

    invoke-virtual {v14, v1}, Lr1/c;->b(Ljava/lang/Object;)V

    goto :goto_4

    :cond_4
    if-nez v16, :cond_5

    new-instance v13, La3/m1;

    const/4 v10, 0x0

    invoke-direct {v13, v14, v10}, La3/m1;-><init>(Ljava/lang/Object;I)V

    move-object/from16 v16, v13

    goto :goto_3

    :cond_5
    move-object/from16 v13, v16

    :goto_3
    invoke-interface {v1, v13}, Landroidx/compose/ui/Modifier;->c(Lkotlin/jvm/functions/Function1;)Z

    :goto_4
    const/16 v10, 0x400

    goto :goto_2

    :cond_6
    iget v1, v14, Lr1/c;->y:I

    const-string v13, "expected prior modifier list to be non-empty"

    if-ne v1, v6, :cond_11

    iget-object v1, v12, Lb2/v;->F:Lb2/v;

    move-object v3, v2

    const/4 v2, 0x0

    :goto_5
    if-eqz v1, :cond_c

    if-ge v2, v6, :cond_c

    if-eqz v5, :cond_b

    const/16 v16, 0x2

    iget-object v10, v5, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v10, v10, v2

    check-cast v10, Lb2/u;

    iget-object v7, v14, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v7, v7, v2

    check-cast v7, Lb2/u;

    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_7

    move-object/from16 v18, v3

    move/from16 v3, v16

    goto :goto_6

    :cond_7
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v15

    move-object/from16 v18, v3

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v15, v3, :cond_8

    const/4 v3, 0x1

    goto :goto_6

    :cond_8
    const/4 v3, 0x0

    :goto_6
    if-eqz v3, :cond_a

    const/4 v15, 0x1

    if-eq v3, v15, :cond_9

    goto :goto_7

    :cond_9
    invoke-static {v10, v7, v1}, La3/l1;->p(Lb2/u;Lb2/u;Lb2/v;)V

    :goto_7
    iget-object v1, v1, Lb2/v;->F:Lb2/v;

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v3, v18

    const/16 v7, 0x10

    goto :goto_5

    :cond_a
    iget-object v1, v1, Lb2/v;->E:Lb2/v;

    goto :goto_8

    :cond_b
    invoke-static {v13}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object v1

    throw v1

    :cond_c
    move-object/from16 v18, v3

    const/16 v16, 0x2

    :goto_8
    if-ge v2, v6, :cond_10

    if-eqz v5, :cond_f

    if-eqz v1, :cond_e

    iget-object v3, v4, La3/n0;->j0:Landroidx/compose/ui/Modifier;

    if-eqz v3, :cond_d

    const/16 v17, 0x1

    :goto_9
    const/4 v15, 0x1

    goto :goto_a

    :cond_d
    const/16 v17, 0x0

    goto :goto_9

    :goto_a
    xor-int/lit8 v6, v17, 0x1

    move-object v3, v5

    move-object v4, v14

    const/4 v7, 0x0

    move-object v5, v1

    move-object/from16 v1, v18

    invoke-virtual/range {v1 .. v6}, La3/l1;->n(ILr1/c;Lr1/c;Lb2/v;Z)V

    move-object v5, v3

    move-object v5, v12

    :goto_b
    const/4 v15, 0x1

    goto/16 :goto_13

    :cond_e
    const-string v1, "structuralUpdate requires a non-null tail"

    invoke-static {v1}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object v1

    throw v1

    :cond_f
    invoke-static {v13}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object v1

    throw v1

    :cond_10
    move-object/from16 v2, v18

    const/4 v7, 0x0

    goto :goto_10

    :cond_11
    const/4 v7, 0x0

    const/16 v16, 0x2

    iget-object v10, v4, La3/n0;->j0:Landroidx/compose/ui/Modifier;

    if-eqz v10, :cond_14

    if-nez v6, :cond_14

    move-object v3, v12

    const/4 v1, 0x0

    :goto_c
    iget v4, v14, Lr1/c;->y:I

    if-ge v1, v4, :cond_12

    iget-object v4, v14, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v4, v4, v1

    check-cast v4, Lb2/u;

    invoke-static {v4, v3}, La3/l1;->f(Lb2/u;Lb2/v;)Lb2/v;

    move-result-object v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_c

    :cond_12
    iget-object v1, v9, Lb2/v;->E:Lb2/v;

    const/4 v3, 0x0

    :goto_d
    if-eqz v1, :cond_13

    if-eq v1, v12, :cond_13

    iget v4, v1, Lb2/v;->y:I

    or-int/2addr v3, v4

    iput v3, v1, Lb2/v;->z:I

    iget-object v1, v1, Lb2/v;->E:Lb2/v;

    goto :goto_d

    :cond_13
    move-object v1, v2

    move-object v3, v5

    move-object v5, v12

    move-object v4, v14

    goto :goto_b

    :cond_14
    if-nez v1, :cond_18

    if-eqz v5, :cond_17

    iget-object v1, v12, Lb2/v;->F:Lb2/v;

    const/4 v6, 0x0

    :goto_e
    if-eqz v1, :cond_15

    iget v10, v5, Lr1/c;->y:I

    if-ge v6, v10, :cond_15

    invoke-static {v1}, La3/l1;->g(Lb2/v;)Lb2/v;

    move-result-object v1

    iget-object v1, v1, Lb2/v;->F:Lb2/v;

    add-int/lit8 v6, v6, 0x1

    goto :goto_e

    :cond_15
    invoke-virtual {v4}, La3/n0;->G()La3/n0;

    move-result-object v1

    if-eqz v1, :cond_16

    iget-object v1, v1, La3/n0;->e0:La3/l1;

    iget-object v1, v1, La3/l1;->d:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/node/a;

    goto :goto_f

    :cond_16
    move-object v1, v7

    :goto_f
    iput-object v1, v3, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    iput-object v3, v2, La3/l1;->e:Ljava/lang/Object;

    :goto_10
    move-object v1, v2

    move-object v3, v5

    move-object v5, v12

    move-object v4, v14

    const/4 v15, 0x0

    goto :goto_13

    :cond_17
    invoke-static {v13}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object v1

    throw v1

    :cond_18
    if-nez v5, :cond_19

    new-instance v5, Lr1/c;

    const/16 v1, 0x10

    new-array v3, v1, [Lb2/u;

    invoke-direct {v5, v3}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_19
    move-object v3, v5

    if-eqz v10, :cond_1a

    const/4 v15, 0x1

    :goto_11
    const/16 v17, 0x1

    goto :goto_12

    :cond_1a
    const/4 v15, 0x0

    goto :goto_11

    :goto_12
    xor-int/lit8 v6, v15, 0x1

    move-object v1, v2

    const/4 v2, 0x0

    move-object v5, v12

    move-object v4, v14

    invoke-virtual/range {v1 .. v6}, La3/l1;->n(ILr1/c;Lr1/c;Lb2/v;Z)V

    move/from16 v15, v17

    :goto_13
    iput-object v4, v1, La3/l1;->h:Ljava/lang/Object;

    if-eqz v3, :cond_1b

    invoke-virtual {v3}, Lr1/c;->g()V

    goto :goto_14

    :cond_1b
    move-object v3, v7

    :goto_14
    iput-object v3, v1, La3/l1;->i:Ljava/lang/Object;

    iget-object v2, v5, Lb2/v;->F:Lb2/v;

    if-nez v2, :cond_1c

    goto :goto_15

    :cond_1c
    move-object v9, v2

    :goto_15
    iput-object v7, v9, Lb2/v;->E:Lb2/v;

    iput-object v7, v5, Lb2/v;->F:Lb2/v;

    const/4 v2, -0x1

    iput v2, v5, Lb2/v;->z:I

    iput-object v7, v5, Lb2/v;->H:Landroidx/compose/ui/node/NodeCoordinator;

    if-eq v9, v5, :cond_1d

    goto :goto_16

    :cond_1d
    const-string v2, "trimChain did not update the head"

    invoke-static {v2}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_16
    iput-object v9, v1, La3/l1;->g:Ljava/lang/Object;

    if-eqz v15, :cond_1e

    invoke-virtual {v1}, La3/l1;->o()V

    :cond_1e
    const/16 v2, 0x10

    invoke-virtual {v1, v2}, La3/l1;->j(I)Z

    move-result v2

    const/16 v3, 0x400

    invoke-virtual {v1, v3}, La3/l1;->j(I)Z

    move-result v3

    iget-object v4, v0, La3/n0;->layoutDelegate:La3/r0;

    invoke-virtual {v4}, La3/r0;->j()V

    iget-object v4, v0, La3/n0;->G:La3/n0;

    if-nez v4, :cond_1f

    const/16 v4, 0x200

    invoke-virtual {v1, v4}, La3/l1;->j(I)Z

    move-result v1

    if-eqz v1, :cond_1f

    invoke-virtual {v0, v0}, La3/n0;->C0(La3/n0;)V

    :cond_1f
    if-ne v8, v2, :cond_20

    if-eq v11, v3, :cond_22

    :cond_20
    invoke-static {v0}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/ui/node/Owner;->getRectManager()Lj3/b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, La3/n0;->X()Z

    move-result v4

    if-eqz v4, :cond_22

    iget-object v1, v1, Lj3/b;->a:Lae3/k;

    iget v4, v0, La3/n0;->x:I

    const v5, 0x3ffffff

    and-int/2addr v4, v5

    iget-object v6, v1, Lae3/k;->c:Ljava/lang/Object;

    check-cast v6, [J

    iget v1, v1, Lae3/k;->b:I

    const/4 v13, 0x0

    :goto_17
    array-length v7, v6

    add-int/lit8 v7, v7, -0x2

    if-ge v13, v7, :cond_22

    if-ge v13, v1, :cond_22

    add-int/lit8 v7, v13, 0x2

    aget-wide v8, v6, v7

    long-to-int v10, v8

    and-int/2addr v10, v5

    if-ne v10, v4, :cond_21

    const-wide v4, 0x3fffffffffffffffL    # 1.9999999999999998

    and-long/2addr v4, v8

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    int-to-long v10, v3

    mul-long/2addr v10, v8

    or-long v3, v4, v10

    const-wide/high16 v8, -0x8000000000000000L

    int-to-long v1, v2

    mul-long/2addr v1, v8

    or-long/2addr v1, v3

    aput-wide v1, v6, v7

    return-void

    :cond_21
    add-int/lit8 v13, v13, 0x3

    goto :goto_17

    :cond_22
    return-void
.end method

.method public final b0(Ly3/a;)Z
    .locals 3

    if-eqz p1, :cond_0

    iget-object v0, p0, La3/n0;->G:La3/n0;

    if-eqz v0, :cond_0

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->q:La3/c1;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v1, p1, Ly3/a;->a:J

    invoke-virtual {v0, v1, v2}, La3/c1;->M0(J)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c(Landroidx/compose/ui/node/Owner;)V
    .locals 8

    iget-object v0, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Cannot attach "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " as it already is attached.  Tree: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, La3/n0;->h(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, La3/n0;->L:La3/n0;

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    iget-object v0, v0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_3

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Attaching to a different owner("

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ") than the parent\'s owner("

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v3, v3, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    goto :goto_1

    :cond_2
    move-object v3, v2

    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "). This tree: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, La3/n0;->h(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " Parent tree: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, La3/n0;->L:La3/n0;

    if-eqz v3, :cond_3

    invoke-virtual {v3, v1}, La3/n0;->h(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_3
    move-object v3, v2

    :goto_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_4
    :goto_3
    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v0

    const/4 v3, 0x1

    if-nez v0, :cond_5

    iget-object v4, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v5, v4, La3/r0;->p:La3/g1;

    iput-boolean v3, v5, La3/g1;->T:Z

    iget-object v4, v4, La3/r0;->q:La3/c1;

    if-eqz v4, :cond_5

    sget-object v5, La3/y0;->w:La3/y0;

    iput-object v5, v4, La3/c1;->R:La3/y0;

    :cond_5
    iget-object v4, p0, La3/n0;->e0:La3/l1;

    iget-object v5, v4, La3/l1;->e:Ljava/lang/Object;

    check-cast v5, Landroidx/compose/ui/node/NodeCoordinator;

    if-eqz v0, :cond_6

    iget-object v6, v0, La3/n0;->e0:La3/l1;

    iget-object v6, v6, La3/l1;->d:Ljava/lang/Object;

    check-cast v6, Landroidx/compose/ui/node/a;

    goto :goto_4

    :cond_6
    move-object v6, v2

    :goto_4
    iput-object v6, v5, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    iput-object p1, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz v0, :cond_7

    iget v5, v0, La3/n0;->O:I

    goto :goto_5

    :cond_7
    const/4 v5, -0x1

    :goto_5
    add-int/2addr v5, v3

    iput v5, p0, La3/n0;->O:I

    iget-object v5, p0, La3/n0;->j0:Landroidx/compose/ui/Modifier;

    if-eqz v5, :cond_8

    invoke-virtual {p0, v5}, La3/n0;->b(Landroidx/compose/ui/Modifier;)V

    :cond_8
    iput-object v2, p0, La3/n0;->j0:Landroidx/compose/ui/Modifier;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()La0/g0;

    move-result-object v5

    iget v6, p0, La3/n0;->x:I

    invoke-virtual {v5, v6, p0}, La0/g0;->h(ILjava/lang/Object;)V

    iget-object v5, p0, La3/n0;->L:La3/n0;

    if-eqz v5, :cond_9

    iget-object v5, v5, La3/n0;->G:La3/n0;

    if-nez v5, :cond_a

    :cond_9
    iget-object v5, p0, La3/n0;->G:La3/n0;

    :cond_a
    invoke-virtual {p0, v5}, La3/n0;->C0(La3/n0;)V

    iget-object v5, p0, La3/n0;->G:La3/n0;

    if-nez v5, :cond_b

    const/16 v5, 0x200

    invoke-virtual {v4, v5}, La3/l1;->j(I)Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {p0, p0}, La3/n0;->C0(La3/n0;)V

    :cond_b
    iget-boolean v5, p0, La3/n0;->o0:Z

    if-nez v5, :cond_c

    iget-object v5, v4, La3/l1;->g:Ljava/lang/Object;

    check-cast v5, Lb2/v;

    :goto_6
    if-eqz v5, :cond_c

    invoke-virtual {v5}, Lb2/v;->N0()V

    iget-object v5, v5, Lb2/v;->F:Lb2/v;

    goto :goto_6

    :cond_c
    iget-object v5, p0, La3/n0;->I:Lwe/o;

    iget-object v5, v5, Lwe/o;->w:Ljava/lang/Object;

    check-cast v5, Lr1/c;

    iget-object v6, v5, Lr1/c;->w:[Ljava/lang/Object;

    iget v5, v5, Lr1/c;->y:I

    :goto_7
    if-ge v1, v5, :cond_d

    aget-object v7, v6, v1

    check-cast v7, La3/n0;

    invoke-virtual {v7, p1}, La3/n0;->c(Landroidx/compose/ui/node/Owner;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_d
    iget-boolean v1, p0, La3/n0;->o0:Z

    if-nez v1, :cond_e

    invoke-virtual {v4}, La3/l1;->m()V

    :cond_e
    invoke-virtual {p0}, La3/n0;->R()V

    if-eqz v0, :cond_f

    invoke-virtual {v0}, La3/n0;->R()V

    :cond_f
    iget-object v0, p0, La3/n0;->k0:Lb4/d;

    if-eqz v0, :cond_10

    invoke-virtual {v0, p1}, Lb4/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    iget-object p1, p0, La3/n0;->layoutDelegate:La3/r0;

    invoke-virtual {p1}, La3/r0;->j()V

    iget-boolean p1, p0, La3/n0;->o0:Z

    if-nez p1, :cond_11

    const/16 p1, 0x8

    invoke-virtual {v4, p1}, La3/l1;->j(I)Z

    move-result p1

    if-eqz p1, :cond_11

    invoke-virtual {p0}, La3/n0;->V()V

    :cond_11
    iget-object p1, v2, Landroidx/compose/ui/platform/AndroidComposeView;->i0:Lc2/d;

    if-eqz p1, :cond_12

    invoke-virtual {p0}, La3/n0;->I()Li3/l;

    move-result-object v0

    if-eqz v0, :cond_12

    iget-object v0, v0, Li3/l;->w:La0/v0;

    sget-object v1, Li3/u;->q:Li3/y;

    invoke-virtual {v0, v1}, La0/v0;->b(Ljava/lang/Object;)Z

    move-result v0

    if-ne v0, v3, :cond_12

    iget-object v0, p1, Lc2/d;->h:La0/h0;

    iget v1, p0, La3/n0;->x:I

    invoke-virtual {v0, v1}, La0/h0;->a(I)Z

    iget-object v0, p1, Lc2/d;->a:Lad3/z;

    iget-object p1, p1, Lc2/d;->c:Landroidx/compose/ui/platform/AndroidComposeView;

    iget v1, p0, La3/n0;->x:I

    invoke-virtual {v0, p1, v1, v3}, Lad3/z;->p(Landroid/view/View;IZ)V

    :cond_12
    return-void
.end method

.method public final d()V
    .locals 6

    iget-object v0, p0, La3/n0;->b0:La3/j0;

    iput-object v0, p0, La3/n0;->c0:La3/j0;

    sget-object v0, La3/j0;->y:La3/j0;

    iput-object v0, p0, La3/n0;->b0:La3/j0;

    invoke-virtual {p0}, La3/n0;->M()Lr1/c;

    move-result-object v0

    iget-object v1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, v1, v2

    check-cast v3, La3/n0;

    iget-object v4, v3, La3/n0;->b0:La3/j0;

    sget-object v5, La3/j0;->y:La3/j0;

    if-eq v4, v5, :cond_0

    invoke-virtual {v3}, La3/n0;->d()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final d0()V
    .locals 7

    iget-object v0, p0, La3/n0;->b0:La3/j0;

    sget-object v1, La3/j0;->y:La3/j0;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, La3/n0;->g()V

    :cond_0
    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->q:La3/c1;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_0
    iput-boolean v2, v0, La3/c1;->G:Z

    iget-boolean v2, v0, La3/c1;->L:Z

    if-nez v2, :cond_1

    const-string v2, "replace() called on item that was not placed"

    invoke-static {v2}, Lx2/a;->b(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v2

    goto :goto_1

    :cond_1
    :goto_0
    iput-boolean v1, v0, La3/c1;->Y:Z

    invoke-virtual {v0}, La3/c1;->v()Z

    move-result v2

    iget-wide v3, v0, La3/c1;->O:J

    iget-object v5, v0, La3/c1;->P:Lkotlin/jvm/functions/Function1;

    iget-object v6, v0, La3/c1;->Q:Ll2/c;

    invoke-virtual {v0, v3, v4, v5, v6}, La3/c1;->L0(JLkotlin/jvm/functions/Function1;Ll2/c;)V

    if-eqz v2, :cond_2

    iget-boolean v2, v0, La3/c1;->Y:Z

    if-nez v2, :cond_2

    iget-object v2, v0, La3/c1;->F:La3/r0;

    iget-object v2, v2, La3/r0;->a:La3/n0;

    invoke-virtual {v2}, La3/n0;->G()La3/n0;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2, v1}, La3/n0;->s0(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    iput-boolean v1, v0, La3/c1;->G:Z

    return-void

    :goto_1
    iput-boolean v1, v0, La3/c1;->G:Z

    throw v2
.end method

.method public final e()V
    .locals 8

    invoke-virtual {p0}, La3/n0;->X()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "onReuse is only expected on attached node"

    invoke-static {v0}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, La3/n0;->N:Lb4/l;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lb4/l;->e()V

    :cond_1
    iget-object v0, p0, La3/n0;->f0:Ly2/n0;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Ly2/n0;->g(Z)V

    :cond_2
    iput-boolean v1, p0, La3/n0;->S:Z

    iget-boolean v0, p0, La3/n0;->o0:Z

    iget-object v2, p0, La3/n0;->e0:La3/l1;

    if-eqz v0, :cond_3

    iput-boolean v1, p0, La3/n0;->o0:Z

    goto :goto_3

    :cond_3
    iget-object v0, v2, La3/l1;->f:Ljava/lang/Object;

    check-cast v0, La3/l2;

    move-object v3, v0

    :goto_0
    if-eqz v3, :cond_5

    iget-boolean v4, v3, Lb2/v;->N:Z

    if-eqz v4, :cond_4

    invoke-virtual {v3}, Lb2/v;->S0()V

    :cond_4
    iget-object v3, v3, Lb2/v;->E:Lb2/v;

    goto :goto_0

    :cond_5
    move-object v3, v0

    :goto_1
    if-eqz v3, :cond_7

    iget-boolean v4, v3, Lb2/v;->N:Z

    if-eqz v4, :cond_6

    invoke-virtual {v3}, Lb2/v;->U0()V

    :cond_6
    iget-object v3, v3, Lb2/v;->E:Lb2/v;

    goto :goto_1

    :cond_7
    :goto_2
    if-eqz v0, :cond_9

    iget-boolean v3, v0, Lb2/v;->N:Z

    if-eqz v3, :cond_8

    invoke-virtual {v0}, Lb2/v;->O0()V

    :cond_8
    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    goto :goto_2

    :cond_9
    :goto_3
    iget v0, p0, La3/n0;->x:I

    sget-object v3, Li3/n;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v3

    iput v3, p0, La3/n0;->x:I

    iget-object v3, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz v3, :cond_a

    check-cast v3, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v3}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()La0/g0;

    move-result-object v5

    invoke-virtual {v5, v0}, La0/g0;->g(I)Ljava/lang/Object;

    invoke-virtual {v3}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()La0/g0;

    move-result-object v3

    iget v5, p0, La3/n0;->x:I

    invoke-virtual {v3, v5, p0}, La0/g0;->h(ILjava/lang/Object;)V

    :cond_a
    iget-object v3, v2, La3/l1;->g:Ljava/lang/Object;

    check-cast v3, Lb2/v;

    :goto_4
    if-eqz v3, :cond_b

    invoke-virtual {v3}, Lb2/v;->N0()V

    iget-object v3, v3, Lb2/v;->F:Lb2/v;

    goto :goto_4

    :cond_b
    invoke-virtual {v2}, La3/l1;->m()V

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, La3/l1;->j(I)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {p0}, La3/n0;->V()V

    :cond_c
    invoke-static {p0}, La3/n0;->w0(La3/n0;)V

    iget-object v2, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz v2, :cond_f

    check-cast v2, Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v3, v2, Landroidx/compose/ui/platform/AndroidComposeView;->i0:Lc2/d;

    if-eqz v3, :cond_e

    iget-object v5, v3, Lc2/d;->c:Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v6, v3, Lc2/d;->a:Lad3/z;

    iget-object v3, v3, Lc2/d;->h:La0/h0;

    invoke-virtual {v3, v0}, La0/h0;->e(I)Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-virtual {v6, v5, v0, v1}, Lad3/z;->p(Landroid/view/View;IZ)V

    :cond_d
    invoke-virtual {p0}, La3/n0;->I()Li3/l;

    move-result-object v0

    if-eqz v0, :cond_e

    iget-object v0, v0, Li3/l;->w:La0/v0;

    sget-object v1, Li3/u;->q:Li3/y;

    invoke-virtual {v0, v1}, La0/v0;->b(Ljava/lang/Object;)Z

    move-result v0

    if-ne v0, v4, :cond_e

    iget v0, p0, La3/n0;->x:I

    invoke-virtual {v3, v0}, La0/h0;->a(I)Z

    iget v0, p0, La3/n0;->x:I

    invoke-virtual {v6, v5, v0, v4}, Lad3/z;->p(Landroid/view/View;IZ)V

    :cond_e
    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lj3/b;

    move-result-object v0

    invoke-virtual {v0, p0, v4}, Lj3/b;->g(La3/n0;Z)V

    :cond_f
    return-void
.end method

.method public final e0()V
    .locals 2

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->p:La3/g1;

    const/4 v1, 0x1

    iput-boolean v1, v0, La3/g1;->W:Z

    iput-boolean v1, v0, La3/g1;->X:Z

    return-void
.end method

.method public final f()V
    .locals 3

    iget-object v0, p0, La3/n0;->N:Lb4/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb4/l;->f()V

    :cond_0
    iget-object v0, p0, La3/n0;->f0:Ly2/n0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ly2/n0;->f()V

    :cond_1
    iget-object v0, p0, La3/n0;->e0:La3/l1;

    iget-object v1, v0, La3/l1;->e:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v0, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    :goto_0
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->t1()V

    iget-object v1, v1, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final f0()V
    .locals 2

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    const/4 v1, 0x1

    iput-boolean v1, v0, La3/r0;->f:Z

    iput-boolean v1, v0, La3/r0;->g:Z

    return-void
.end method

.method public final g()V
    .locals 6

    iget-object v0, p0, La3/n0;->b0:La3/j0;

    iput-object v0, p0, La3/n0;->c0:La3/j0;

    sget-object v0, La3/j0;->y:La3/j0;

    iput-object v0, p0, La3/n0;->b0:La3/j0;

    invoke-virtual {p0}, La3/n0;->M()Lr1/c;

    move-result-object v0

    iget-object v1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, v1, v2

    check-cast v3, La3/n0;

    iget-object v4, v3, La3/n0;->b0:La3/j0;

    sget-object v5, La3/j0;->x:La3/j0;

    if-ne v4, v5, :cond_0

    invoke-virtual {v3}, La3/n0;->g()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final g0()V
    .locals 2

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    const/4 v1, 0x1

    iput-boolean v1, v0, La3/r0;->e:Z

    return-void
.end method

.method public final h(I)Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p1, :cond_0

    const-string v3, "  "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-string v2, "|-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, La3/n0;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0xa

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, La3/n0;->M()Lr1/c;

    move-result-object v2

    iget-object v3, v2, Lr1/c;->w:[Ljava/lang/Object;

    iget v2, v2, Lr1/c;->y:I

    move v4, v1

    :goto_1
    if-ge v4, v2, :cond_1

    aget-object v5, v3, v4

    check-cast v5, La3/n0;

    add-int/lit8 v6, p1, 0x1

    invoke-virtual {v5, v6}, La3/n0;->h(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez p1, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v0, "substring(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_2
    return-object v0
.end method

.method public final h0()V
    .locals 2

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->p:La3/g1;

    const/4 v1, 0x1

    iput-boolean v1, v0, La3/g1;->V:Z

    return-void
.end method

.method public final i()V
    .locals 10

    iget-object v0, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Cannot detach node that is already detached!  Tree: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3, v2}, La3/n0;->h(I)Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx2/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_1
    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, La3/n0;->P()V

    invoke-virtual {v3}, La3/n0;->R()V

    iget-object v3, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v4, v3, La3/r0;->p:La3/g1;

    sget-object v5, La3/j0;->y:La3/j0;

    iput-object v5, v4, La3/g1;->L:La3/j0;

    iget-object v3, v3, La3/r0;->q:La3/c1;

    if-eqz v3, :cond_2

    iput-object v5, v3, La3/c1;->J:La3/j0;

    :cond_2
    iget-object v3, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v4, v3, La3/r0;->p:La3/g1;

    iget-object v4, v4, La3/g1;->Y:La3/o0;

    const/4 v5, 0x1

    iput-boolean v5, v4, La3/a;->b:Z

    iput-boolean v2, v4, La3/a;->c:Z

    iput-boolean v2, v4, La3/a;->e:Z

    iput-boolean v2, v4, La3/a;->d:Z

    iput-boolean v2, v4, La3/a;->f:Z

    iput-boolean v2, v4, La3/a;->g:Z

    iput-object v1, v4, La3/a;->h:La3/b;

    iget-object v3, v3, La3/r0;->q:La3/c1;

    if-eqz v3, :cond_3

    iget-object v3, v3, La3/c1;->S:La3/s0;

    if-eqz v3, :cond_3

    iput-boolean v5, v3, La3/a;->b:Z

    iput-boolean v2, v3, La3/a;->c:Z

    iput-boolean v2, v3, La3/a;->e:Z

    iput-boolean v2, v3, La3/a;->d:Z

    iput-boolean v2, v3, La3/a;->f:Z

    iput-boolean v2, v3, La3/a;->g:Z

    iput-object v1, v3, La3/a;->h:La3/b;

    :cond_3
    iget-object v3, p0, La3/n0;->e0:La3/l1;

    iget-object v4, v3, La3/l1;->e:Ljava/lang/Object;

    check-cast v4, Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v6, v3, La3/l1;->f:Ljava/lang/Object;

    check-cast v6, La3/l2;

    iget-object v7, v3, La3/l1;->d:Ljava/lang/Object;

    check-cast v7, Landroidx/compose/ui/node/a;

    iget-object v7, v7, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    :goto_0
    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Landroidx/compose/ui/node/NodeCoordinator;->y1()V

    iget-object v4, v4, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    goto :goto_0

    :cond_4
    iget-object v4, p0, La3/n0;->l0:Lb4/e;

    if-eqz v4, :cond_5

    invoke-virtual {v4, v0}, Lb4/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    move-object v4, v6

    :goto_1
    if-eqz v4, :cond_7

    iget-boolean v7, v4, Lb2/v;->N:Z

    if-eqz v7, :cond_6

    invoke-virtual {v4}, Lb2/v;->U0()V

    :cond_6
    iget-object v4, v4, Lb2/v;->E:Lb2/v;

    goto :goto_1

    :cond_7
    iput-boolean v5, p0, La3/n0;->P:Z

    iget-object v4, p0, La3/n0;->I:Lwe/o;

    iget-object v4, v4, Lwe/o;->w:Ljava/lang/Object;

    check-cast v4, Lr1/c;

    iget-object v7, v4, Lr1/c;->w:[Ljava/lang/Object;

    iget v4, v4, Lr1/c;->y:I

    move v8, v2

    :goto_2
    if-ge v8, v4, :cond_8

    aget-object v9, v7, v8

    check-cast v9, La3/n0;

    invoke-virtual {v9}, La3/n0;->i()V

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_8
    iput-boolean v2, p0, La3/n0;->P:Z

    :goto_3
    if-eqz v6, :cond_a

    iget-boolean v4, v6, Lb2/v;->N:Z

    if-eqz v4, :cond_9

    invoke-virtual {v6}, Lb2/v;->O0()V

    :cond_9
    iget-object v6, v6, Lb2/v;->E:Lb2/v;

    goto :goto_3

    :cond_a
    move-object v4, v0

    check-cast v4, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()La0/g0;

    move-result-object v6

    iget v7, p0, La3/n0;->x:I

    invoke-virtual {v6, v7}, La0/g0;->g(I)Ljava/lang/Object;

    iget-object v6, v4, Landroidx/compose/ui/platform/AndroidComposeView;->r0:La3/e1;

    iget-object v7, v6, La3/e1;->b:La3/p;

    iget-object v8, v7, La3/p;->x:Ljava/lang/Object;

    check-cast v8, Laj/c;

    invoke-virtual {v8, p0}, Laj/c;->R(La3/n0;)Z

    iget-object v8, v7, La3/p;->y:Ljava/lang/Object;

    check-cast v8, Laj/c;

    invoke-virtual {v8, p0}, Laj/c;->R(La3/n0;)Z

    iget-object v7, v7, La3/p;->z:Ljava/lang/Object;

    check-cast v7, Laj/c;

    invoke-virtual {v7, p0}, Laj/c;->R(La3/n0;)Z

    iget-object v6, v6, La3/e1;->e:Lcom/google/crypto/tink/internal/l0;

    iget-object v6, v6, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v6, Lr1/c;

    invoke-virtual {v6, p0}, Lr1/c;->k(Ljava/lang/Object;)Z

    iput-boolean v5, v4, Landroidx/compose/ui/platform/AndroidComposeView;->j0:Z

    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lj3/b;

    move-result-object v5

    invoke-virtual {v5, p0}, Lj3/b;->j(La3/n0;)V

    iget-object v5, v4, Landroidx/compose/ui/platform/AndroidComposeView;->i0:Lc2/d;

    if-eqz v5, :cond_b

    iget-object v6, v5, Lc2/d;->h:La0/h0;

    iget v7, p0, La3/n0;->x:I

    invoke-virtual {v6, v7}, La0/h0;->e(I)Z

    move-result v6

    if-eqz v6, :cond_b

    iget-object v6, v5, Lc2/d;->a:Lad3/z;

    iget-object v5, v5, Lc2/d;->c:Landroidx/compose/ui/platform/AndroidComposeView;

    iget v7, p0, La3/n0;->x:I

    invoke-virtual {v6, v5, v7, v2}, Lad3/z;->p(Landroid/view/View;IZ)V

    :cond_b
    iput-object v1, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    const-wide v5, 0x7fffffff7fffffffL

    iput-wide v5, p0, La3/n0;->y:J

    invoke-virtual {p0, v1}, La3/n0;->C0(La3/n0;)V

    iput v2, p0, La3/n0;->O:I

    iget-object v5, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v6, v5, La3/r0;->p:La3/g1;

    const v7, 0x7fffffff

    iput v7, v6, La3/g1;->I:I

    iput v7, v6, La3/g1;->H:I

    iput-boolean v2, v6, La3/g1;->T:Z

    iget-object v5, v5, La3/r0;->q:La3/c1;

    if-eqz v5, :cond_c

    iput v7, v5, La3/c1;->I:I

    iput v7, v5, La3/c1;->H:I

    sget-object v6, La3/y0;->y:La3/y0;

    iput-object v6, v5, La3/c1;->R:La3/y0;

    :cond_c
    const/16 v5, 0x8

    invoke-virtual {v3, v5}, La3/l1;->j(I)Z

    move-result v3

    if-eqz v3, :cond_d

    iget-object v3, p0, La3/n0;->R:Li3/l;

    iput-object v1, p0, La3/n0;->R:Li3/l;

    iput-boolean v2, p0, La3/n0;->Q:Z

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getSemanticsOwner()Li3/r;

    move-result-object v0

    invoke-virtual {v0, p0, v3}, Li3/r;->b(La3/n0;Li3/l;)V

    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->E()V

    :cond_d
    return-void
.end method

.method public final i0(III)V
    .locals 6

    if-ne p1, p2, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_3

    if-le p1, p2, :cond_1

    add-int v1, p1, v0

    goto :goto_1

    :cond_1
    move v1, p1

    :goto_1
    if-le p1, p2, :cond_2

    add-int v2, p2, v0

    goto :goto_2

    :cond_2
    add-int v2, p2, p3

    add-int/lit8 v2, v2, -0x2

    :goto_2
    iget-object v3, p0, La3/n0;->I:Lwe/o;

    iget-object v4, v3, Lwe/o;->w:Ljava/lang/Object;

    check-cast v4, Lr1/c;

    iget-object v5, v3, Lwe/o;->x:Ljava/lang/Object;

    check-cast v5, La3/l0;

    invoke-virtual {v4, v1}, Lr1/c;->l(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5}, La3/l0;->invoke()Ljava/lang/Object;

    check-cast v1, La3/n0;

    iget-object v3, v3, Lwe/o;->w:Ljava/lang/Object;

    check-cast v3, Lr1/c;

    invoke-virtual {v3, v2, v1}, Lr1/c;->a(ILjava/lang/Object;)V

    invoke-virtual {v5}, La3/l0;->invoke()Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, La3/n0;->l0()V

    invoke-virtual {p0}, La3/n0;->W()V

    invoke-virtual {p0}, La3/n0;->R()V

    return-void
.end method

.method public final j()V
    .locals 9

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->d:La3/h0;

    sget-object v1, La3/h0;->E:La3/h0;

    if-ne v0, v1, :cond_a

    invoke-virtual {p0}, La3/n0;->u()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p0}, La3/n0;->A()Z

    move-result v0

    if-nez v0, :cond_a

    iget-boolean v0, p0, La3/n0;->o0:Z

    if-eqz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {p0}, La3/n0;->Y()Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_5

    :cond_1
    iget-object v0, p0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->g:Ljava/lang/Object;

    check-cast v0, Lb2/v;

    iget v1, v0, Lb2/v;->z:I

    const/16 v2, 0x100

    and-int/2addr v1, v2

    if-eqz v1, :cond_a

    :goto_0
    if-eqz v0, :cond_a

    iget v1, v0, Lb2/v;->y:I

    and-int/2addr v1, v2

    if-eqz v1, :cond_9

    const/4 v1, 0x0

    move-object v3, v0

    move-object v4, v1

    :goto_1
    if-eqz v3, :cond_9

    instance-of v5, v3, La3/s;

    if-eqz v5, :cond_2

    check-cast v3, La3/s;

    invoke-static {v3, v2}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v5

    invoke-interface {v3, v5}, La3/s;->I0(Landroidx/compose/ui/node/NodeCoordinator;)V

    goto :goto_4

    :cond_2
    iget v5, v3, Lb2/v;->y:I

    and-int/2addr v5, v2

    if-eqz v5, :cond_8

    instance-of v5, v3, La3/o;

    if-eqz v5, :cond_8

    move-object v5, v3

    check-cast v5, La3/o;

    iget-object v5, v5, La3/o;->P:Lb2/v;

    const/4 v6, 0x0

    :goto_2
    const/4 v7, 0x1

    if-eqz v5, :cond_7

    iget v8, v5, Lb2/v;->y:I

    and-int/2addr v8, v2

    if-eqz v8, :cond_6

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v7, :cond_3

    move-object v3, v5

    goto :goto_3

    :cond_3
    if-nez v4, :cond_4

    new-instance v4, Lr1/c;

    const/16 v7, 0x10

    new-array v7, v7, [Lb2/v;

    invoke-direct {v4, v7}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {v4, v3}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v3, v1

    :cond_5
    invoke-virtual {v4, v5}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_6
    :goto_3
    iget-object v5, v5, Lb2/v;->F:Lb2/v;

    goto :goto_2

    :cond_7
    if-ne v6, v7, :cond_8

    goto :goto_1

    :cond_8
    :goto_4
    invoke-static {v4}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v3

    goto :goto_1

    :cond_9
    iget v1, v0, Lb2/v;->z:I

    and-int/2addr v1, v2

    if-eqz v1, :cond_a

    iget-object v0, v0, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_a
    :goto_5
    return-void
.end method

.method public final j0(La3/n0;)V
    .locals 4

    iget-object v0, p1, La3/n0;->layoutDelegate:La3/r0;

    iget v0, v0, La3/r0;->l:I

    if-lez v0, :cond_0

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget v1, v0, La3/r0;->l:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, La3/r0;->d(I)V

    :cond_0
    iget-object v0, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, La3/n0;->i()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p1, La3/n0;->L:La3/n0;

    iget v1, p1, La3/n0;->n0:I

    if-lez v1, :cond_2

    iget v1, p0, La3/n0;->n0:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, La3/n0;->B0(I)V

    :cond_2
    iget-object v1, p1, La3/n0;->e0:La3/l1;

    iget-object v1, v1, La3/l1;->e:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/node/NodeCoordinator;

    iput-object v0, v1, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    iget-boolean v1, p1, La3/n0;->w:Z

    if-eqz v1, :cond_3

    iget v1, p0, La3/n0;->H:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, La3/n0;->H:I

    iget-object p1, p1, La3/n0;->I:Lwe/o;

    iget-object p1, p1, Lwe/o;->w:Ljava/lang/Object;

    check-cast p1, Lr1/c;

    iget-object v1, p1, Lr1/c;->w:[Ljava/lang/Object;

    iget p1, p1, Lr1/c;->y:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_3

    aget-object v3, v1, v2

    check-cast v3, La3/n0;

    iget-object v3, v3, La3/n0;->e0:La3/l1;

    iget-object v3, v3, La3/l1;->e:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/ui/node/NodeCoordinator;

    iput-object v0, v3, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, La3/n0;->W()V

    invoke-virtual {p0}, La3/n0;->l0()V

    return-void
.end method

.method public final k(Li2/v;Ll2/c;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->e:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/node/NodeCoordinator;->Z0(Li2/v;Ll2/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0, p1}, La3/n0;->y0(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final k0()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, La3/n0;->F:Z

    invoke-virtual {p0}, La3/n0;->M()Lr1/c;

    move-result-object v0

    iget-object v1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v3, v1, v2

    check-cast v3, La3/n0;

    invoke-virtual {v3}, La3/n0;->S()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final l0()V
    .locals 1

    iget-boolean v0, p0, La3/n0;->w:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La3/n0;->l0()V

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, La3/n0;->U:Z

    return-void
.end method

.method public final m()V
    .locals 3

    iget-object v0, p0, La3/n0;->G:La3/n0;

    const/4 v1, 0x5

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-static {p0, v2, v1}, La3/n0;->t0(La3/n0;ZI)V

    goto :goto_0

    :cond_0
    invoke-static {p0, v2, v1}, La3/n0;->v0(La3/n0;ZI)V

    :goto_0
    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->p:La3/g1;

    iget-boolean v1, v0, La3/g1;->J:Z

    if-eqz v1, :cond_1

    iget-wide v0, v0, Ly2/j1;->z:J

    new-instance v2, Ly3/a;

    invoke-direct {v2, v0, v1}, Ly3/a;-><init>(J)V

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_2

    iget-object v0, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz v0, :cond_3

    iget-wide v1, v2, Ly3/a;->a:J

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0, p0, v1, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->y(La3/n0;J)V

    return-void

    :cond_2
    iget-object v0, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->w(Z)V

    :cond_3
    return-void
.end method

.method public final m0()V
    .locals 3

    iget-object v0, p0, La3/n0;->b0:La3/j0;

    sget-object v1, La3/j0;->y:La3/j0;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, La3/n0;->g()V

    :cond_0
    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, v0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/a;

    if-eqz v0, :cond_1

    iget-object v0, v0, La3/w0;->L:Ly2/o0;

    if-nez v0, :cond_2

    :cond_1
    invoke-static {p0}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getPlacementScope()Ly2/i1;

    move-result-object v0

    :cond_2
    iget-object v1, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v1, v1, La3/r0;->p:La3/g1;

    const/4 v2, 0x0

    invoke-static {v1, v2, v2, v0}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    return-void
.end method

.method public final n()Z
    .locals 3

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v1, v0, La3/r0;->p:La3/g1;

    iget-object v1, v1, La3/g1;->Y:La3/o0;

    invoke-virtual {v1}, La3/a;->f()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    iget-object v0, v0, La3/r0;->q:La3/c1;

    if-eqz v0, :cond_0

    iget-object v0, v0, La3/c1;->S:La3/s0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La3/a;->f()Z

    move-result v0

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    return v2
.end method

.method public final n0(Ly3/a;)Z
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p0, La3/n0;->b0:La3/j0;

    sget-object v1, La3/j0;->y:La3/j0;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, La3/n0;->d()V

    :cond_0
    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->p:La3/g1;

    iget-wide v1, p1, Ly3/a;->a:J

    invoke-virtual {v0, v1, v2}, La3/g1;->P0(J)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final o()Ljava/util/List;
    .locals 10

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->q:La3/c1;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, v0, La3/c1;->T:Lr1/c;

    iget-object v2, v0, La3/c1;->F:La3/r0;

    iget-object v3, v2, La3/r0;->a:La3/n0;

    invoke-virtual {v3}, La3/n0;->q()Ljava/util/List;

    iget-boolean v3, v0, La3/c1;->U:Z

    if-nez v3, :cond_0

    invoke-virtual {v1}, Lr1/c;->f()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v2, v2, La3/r0;->a:La3/n0;

    invoke-virtual {v2}, La3/n0;->M()Lr1/c;

    move-result-object v3

    iget-object v4, v3, Lr1/c;->w:[Ljava/lang/Object;

    iget v3, v3, Lr1/c;->y:I

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v3, :cond_2

    aget-object v7, v4, v6

    check-cast v7, La3/n0;

    iget v8, v1, Lr1/c;->y:I

    if-gt v8, v6, :cond_1

    iget-object v7, v7, La3/n0;->layoutDelegate:La3/r0;

    iget-object v7, v7, La3/r0;->q:La3/c1;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v7}, Lr1/c;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v7, v7, La3/n0;->layoutDelegate:La3/r0;

    iget-object v7, v7, La3/r0;->q:La3/c1;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v8, v1, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v9, v8, v6

    aput-object v7, v8, v6

    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, La3/n0;->q()Ljava/util/List;

    move-result-object v2

    check-cast v2, Lr1/b;

    iget-object v2, v2, Lr1/b;->w:Lr1/c;

    iget v2, v2, Lr1/c;->y:I

    iget v3, v1, Lr1/c;->y:I

    invoke-virtual {v1, v2, v3}, Lr1/c;->m(II)V

    iput-boolean v5, v0, La3/c1;->U:Z

    invoke-virtual {v1}, Lr1/c;->f()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final p()Ljava/util/List;
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->p:La3/g1;

    invoke-virtual {v0}, La3/g1;->C0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final p0()V
    .locals 4

    iget-object v0, p0, La3/n0;->I:Lwe/o;

    iget-object v1, v0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v1, Lr1/c;

    iget-object v2, v0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v2, Lr1/c;

    iget v1, v1, Lr1/c;->y:I

    add-int/lit8 v1, v1, -0x1

    :goto_0
    const/4 v3, -0x1

    if-ge v3, v1, :cond_0

    iget-object v3, v2, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v3, v3, v1

    check-cast v3, La3/n0;

    invoke-virtual {p0, v3}, La3/n0;->j0(La3/n0;)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lr1/c;->g()V

    iget-object v0, v0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v0, La3/l0;

    invoke-virtual {v0}, La3/l0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final q()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, La3/n0;->M()Lr1/c;

    move-result-object v0

    invoke-virtual {v0}, Lr1/c;->f()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final q0(II)V
    .locals 2

    if-ltz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "count ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") must be greater than 0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx2/a;->a(Ljava/lang/String;)V

    :goto_0
    add-int/2addr p2, p1

    add-int/lit8 p2, p2, -0x1

    if-gt p1, p2, :cond_1

    :goto_1
    iget-object v0, p0, La3/n0;->I:Lwe/o;

    iget-object v1, v0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v1, Lr1/c;

    iget-object v1, v1, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v1, v1, p2

    check-cast v1, La3/n0;

    invoke-virtual {p0, v1}, La3/n0;->j0(La3/n0;)V

    iget-object v1, v0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v1, Lr1/c;

    invoke-virtual {v1, p2}, Lr1/c;->l(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v0, v0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v0, La3/l0;

    invoke-virtual {v0}, La3/l0;->invoke()Ljava/lang/Object;

    check-cast v1, La3/n0;

    if-eq p2, p1, :cond_1

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final r()Ljava/util/List;
    .locals 1

    iget-object v0, p0, La3/n0;->I:Lwe/o;

    iget-object v0, v0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lr1/c;

    invoke-virtual {v0}, Lr1/c;->f()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final r0()V
    .locals 9

    iget-object v0, p0, La3/n0;->b0:La3/j0;

    sget-object v1, La3/j0;->y:La3/j0;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, La3/n0;->g()V

    :cond_0
    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v1, v0, La3/r0;->p:La3/g1;

    iget-object v7, v1, La3/g1;->F:La3/r0;

    const/4 v8, 0x0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, v1, La3/g1;->G:Z

    iget-boolean v0, v1, La3/g1;->K:Z

    if-nez v0, :cond_1

    const-string v0, "replace called on unplaced item"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-boolean v0, v1, La3/g1;->T:Z

    iget-wide v2, v1, La3/g1;->N:J

    iget v4, v1, La3/g1;->Q:F

    iget-object v5, v1, La3/g1;->O:Lkotlin/jvm/functions/Function1;

    iget-object v6, v1, La3/g1;->P:Ll2/c;

    invoke-virtual/range {v1 .. v6}, La3/g1;->N0(JFLkotlin/jvm/functions/Function1;Ll2/c;)V

    if-eqz v0, :cond_2

    iget-boolean v0, v1, La3/g1;->g0:Z

    if-nez v0, :cond_2

    iget-object v0, v7, La3/r0;->a:La3/n0;

    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, v8}, La3/n0;->u0(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    iput-boolean v8, v1, La3/g1;->G:Z

    return-void

    :goto_1
    :try_start_1
    iget-object v2, v7, La3/r0;->a:La3/n0;

    invoke-virtual {v2, v0}, La3/n0;->y0(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    iput-boolean v8, v1, La3/g1;->G:Z

    throw v0
.end method

.method public final s()I
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->p:La3/g1;

    iget v0, v0, Ly2/j1;->x:I

    return v0
.end method

.method public final s0(Z)V
    .locals 2

    iget-boolean v0, p0, La3/n0;->w:Z

    if-nez v0, :cond_0

    iget-object v0, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0, p0, v1, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->D(La3/n0;ZZ)V

    :cond_0
    return-void
.end method

.method public final t()La3/r0;
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lds/p;->R(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " children: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, La3/n0;->q()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lr1/b;

    iget-object v1, v1, Lr1/b;->w:Lr1/c;

    iget v1, v1, Lr1/c;->y:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " measurePolicy: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La3/n0;->V:Ly2/r0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " deactivated: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, La3/n0;->o0:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Z
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->p:La3/g1;

    iget-boolean v0, v0, La3/g1;->W:Z

    return v0
.end method

.method public final u0(Z)V
    .locals 2

    iget-boolean v0, p0, La3/n0;->w:Z

    if-nez v0, :cond_0

    iget-object v0, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0, p0, v1, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->D(La3/n0;ZZ)V

    :cond_0
    return-void
.end method

.method public final v()La3/h0;
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->d:La3/h0;

    return-object v0
.end method

.method public final w()Z
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-boolean v0, v0, La3/r0;->f:Z

    return v0
.end method

.method public final x()Z
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-boolean v0, v0, La3/r0;->e:Z

    return v0
.end method

.method public final x0()V
    .locals 6

    invoke-virtual {p0}, La3/n0;->M()Lr1/c;

    move-result-object v0

    iget-object v1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, v1, v2

    check-cast v3, La3/n0;

    iget-object v4, v3, La3/n0;->c0:La3/j0;

    iput-object v4, v3, La3/n0;->b0:La3/j0;

    sget-object v5, La3/j0;->y:La3/j0;

    if-eq v4, v5, :cond_0

    invoke-virtual {v3}, La3/n0;->x0()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final y()La3/c1;
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->q:La3/c1;

    return-object v0
.end method

.method public final y0(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, La3/n0;->a0:Lp1/z;

    sget-object v1, La2/e;->a:Lp1/u2;

    check-cast v0, Lx1/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1}, Lp1/x;->D(Lp1/p1;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La2/c;

    if-eqz v0, :cond_0

    new-instance v1, Li;

    const/4 v2, 0x2

    invoke-direct {v1, v2, v0, p0}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v1}, Ldt/b;->Y(Ljava/lang/Throwable;Lc93/a;)Z

    :cond_0
    throw p1
.end method

.method public final z()La3/g1;
    .locals 1

    iget-object v0, p0, La3/n0;->layoutDelegate:La3/r0;

    iget-object v0, v0, La3/r0;->p:La3/g1;

    return-object v0
.end method

.method public final z0(Lp1/z;)V
    .locals 8

    iput-object p1, p0, La3/n0;->a0:Lp1/z;

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    check-cast p1, Lx1/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v0}, Lp1/x;->D(Lp1/p1;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    invoke-virtual {p0, v0}, La3/n0;->A0(Ly3/c;)V

    sget-object v0, Lb3/v1;->n:Lp1/u2;

    invoke-static {p1, v0}, Lp1/x;->D(Lp1/p1;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/m;

    iget-object v1, p0, La3/n0;->Y:Ly3/m;

    iget-object v2, p0, La3/n0;->e0:La3/l1;

    if-eq v1, v0, :cond_1

    iput-object v0, p0, La3/n0;->Y:Ly3/m;

    invoke-virtual {p0}, La3/n0;->R()V

    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La3/n0;->P()V

    :cond_0
    invoke-virtual {p0}, La3/n0;->Q()V

    iget-object v0, v2, La3/l1;->g:Ljava/lang/Object;

    check-cast v0, Lb2/v;

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, La3/n;->t()V

    iget-object v0, v0, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_1
    sget-object v0, Lb3/v1;->s:Lp1/u2;

    invoke-static {p1, v0}, Lp1/x;->D(Lp1/p1;Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/j3;

    invoke-virtual {p0, p1}, La3/n0;->F0(Lb3/j3;)V

    iget-object p1, v2, La3/l1;->g:Ljava/lang/Object;

    check-cast p1, Lb2/v;

    iget v0, p1, Lb2/v;->z:I

    const v1, 0x8000

    and-int/2addr v0, v1

    if-eqz v0, :cond_b

    :goto_1
    if-eqz p1, :cond_b

    iget v0, p1, Lb2/v;->y:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_a

    const/4 v0, 0x0

    move-object v2, p1

    move-object v3, v0

    :goto_2
    if-eqz v2, :cond_a

    instance-of v4, v2, La3/m;

    const/4 v5, 0x1

    if-eqz v4, :cond_3

    check-cast v2, La3/m;

    check-cast v2, Lb2/v;

    iget-object v2, v2, Lb2/v;->w:Lb2/v;

    iget-boolean v4, v2, Lb2/v;->N:Z

    if-eqz v4, :cond_2

    invoke-static {v2}, La3/r1;->c(Lb2/v;)V

    goto :goto_5

    :cond_2
    iput-boolean v5, v2, Lb2/v;->J:Z

    goto :goto_5

    :cond_3
    iget v4, v2, Lb2/v;->y:I

    and-int/2addr v4, v1

    if-eqz v4, :cond_9

    instance-of v4, v2, La3/o;

    if-eqz v4, :cond_9

    move-object v4, v2

    check-cast v4, La3/o;

    iget-object v4, v4, La3/o;->P:Lb2/v;

    const/4 v6, 0x0

    :goto_3
    if-eqz v4, :cond_8

    iget v7, v4, Lb2/v;->y:I

    and-int/2addr v7, v1

    if-eqz v7, :cond_7

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v5, :cond_4

    move-object v2, v4

    goto :goto_4

    :cond_4
    if-nez v3, :cond_5

    new-instance v3, Lr1/c;

    const/16 v7, 0x10

    new-array v7, v7, [Lb2/v;

    invoke-direct {v3, v7}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_5
    if-eqz v2, :cond_6

    invoke-virtual {v3, v2}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v2, v0

    :cond_6
    invoke-virtual {v3, v4}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_7
    :goto_4
    iget-object v4, v4, Lb2/v;->F:Lb2/v;

    goto :goto_3

    :cond_8
    if-ne v6, v5, :cond_9

    goto :goto_2

    :cond_9
    :goto_5
    invoke-static {v3}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v2

    goto :goto_2

    :cond_a
    iget v0, p1, Lb2/v;->z:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_b

    iget-object p1, p1, Lb2/v;->F:Lb2/v;

    goto :goto_1

    :cond_b
    return-void
.end method
