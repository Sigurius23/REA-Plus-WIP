.class public abstract La3/r1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La0/m0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, La0/z0;->a:La0/m0;

    new-instance v0, La0/m0;

    invoke-direct {v0}, La0/m0;-><init>()V

    sput-object v0, La3/r1;->a:La0/m0;

    return-void
.end method

.method public static final a(Lb2/v;II)V
    .locals 3

    instance-of v0, p0, La3/o;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, La3/o;

    iget v1, v0, La3/o;->O:I

    and-int v2, v1, p1

    invoke-static {p0, v2, p2}, La3/r1;->b(Lb2/v;II)V

    not-int p0, v1

    and-int/2addr p0, p1

    iget-object p1, v0, La3/o;->P:Lb2/v;

    :goto_0
    if-eqz p1, :cond_0

    invoke-static {p1, p0, p2}, La3/r1;->a(Lb2/v;II)V

    iget-object p1, p1, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    iget v0, p0, Lb2/v;->y:I

    and-int/2addr p1, v0

    invoke-static {p0, p1, p2}, La3/r1;->b(Lb2/v;II)V

    return-void
.end method

.method public static final b(Lb2/v;II)V
    .locals 8

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lb2/v;->M0()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_8

    :cond_0
    and-int/lit8 v0, p1, 0x2

    const/4 v1, 0x2

    if-eqz v0, :cond_1

    instance-of v0, p0, La3/c0;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, La3/c0;

    invoke-static {v0}, La3/g;->i(La3/c0;)V

    if-ne p2, v1, :cond_1

    invoke-static {p0, v1}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->t1()V

    :cond_1
    and-int/lit16 v0, p1, 0x80

    if-eqz v0, :cond_2

    instance-of v0, p0, La3/a0;

    if-eqz v0, :cond_2

    if-eq p2, v1, :cond_2

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    invoke-virtual {v0}, La3/n0;->R()V

    :cond_2
    and-int/lit16 v0, p1, 0x100

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_7

    instance-of v0, p0, La3/s;

    if-eqz v0, :cond_7

    if-eq p2, v3, :cond_4

    if-eq p2, v1, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget v4, v0, La3/n0;->n0:I

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v0, v4}, La3/n0;->B0(I)V

    goto :goto_0

    :cond_4
    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget v4, v0, La3/n0;->n0:I

    add-int/2addr v4, v3

    invoke-virtual {v0, v4}, La3/n0;->B0(I)V

    :goto_0
    if-eq p2, v1, :cond_7

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p2

    iget v0, p2, La3/n0;->n0:I

    if-eqz v0, :cond_7

    invoke-virtual {p2}, La3/n0;->u()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p2}, La3/n0;->A()Z

    move-result v0

    if-nez v0, :cond_7

    iget-boolean v0, p2, La3/n0;->m0:Z

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    invoke-static {p2}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->r0:La3/e1;

    iget-object v1, v1, La3/e1;->e:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, p2, La3/n0;->n0:I

    if-lez v4, :cond_6

    iget-object v1, v1, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v1, Lr1/c;

    invoke-virtual {v1, p2}, Lr1/c;->b(Ljava/lang/Object;)V

    iput-boolean v3, p2, La3/n0;->m0:Z

    :cond_6
    invoke-virtual {v0, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->I(La3/n0;)V

    :cond_7
    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-eqz p2, :cond_8

    instance-of p2, p0, La3/r;

    if-eqz p2, :cond_8

    move-object p2, p0

    check-cast p2, La3/r;

    invoke-static {p2}, La3/g;->h(La3/r;)V

    :cond_8
    and-int/lit8 p2, p1, 0x8

    if-eqz p2, :cond_9

    instance-of p2, p0, La3/j2;

    if-eqz p2, :cond_9

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p2

    iput-boolean v3, p2, La3/n0;->Q:Z

    :cond_9
    and-int/lit8 p2, p1, 0x40

    if-eqz p2, :cond_a

    instance-of p2, p0, La3/d2;

    if-eqz p2, :cond_a

    move-object p2, p0

    check-cast p2, La3/d2;

    invoke-static {p2}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p2

    invoke-virtual {p2}, La3/n0;->T()V

    :cond_a
    and-int/lit16 p2, p1, 0x800

    if-eqz p2, :cond_17

    instance-of p2, p0, Lg2/q;

    if-eqz p2, :cond_17

    move-object p2, p0

    check-cast p2, Lg2/q;

    invoke-static {}, La3/h;->f()V

    sget-object v0, La3/h;->a:La3/h;

    invoke-interface {p2, v0}, Lg2/q;->j0(Lg2/m;)V

    invoke-static {}, La3/h;->e()Z

    move-result v0

    if-eqz v0, :cond_17

    check-cast p2, Lb2/v;

    iget-object v0, p2, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_b

    const-string v0, "visitChildren called on an unattached node"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_b
    new-instance v0, Lr1/c;

    const/16 v1, 0x10

    new-array v4, v1, [Lb2/v;

    invoke-direct {v0, v4}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iget-object p2, p2, Lb2/v;->w:Lb2/v;

    iget-object v4, p2, Lb2/v;->F:Lb2/v;

    if-nez v4, :cond_c

    invoke-static {v0, p2}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto :goto_2

    :cond_c
    invoke-virtual {v0, v4}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_d
    :goto_2
    iget p2, v0, Lr1/c;->y:I

    if-eqz p2, :cond_17

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {v0, p2}, Lr1/c;->l(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lb2/v;

    iget v4, p2, Lb2/v;->z:I

    and-int/lit16 v4, v4, 0x400

    if-nez v4, :cond_e

    invoke-static {v0, p2}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto :goto_2

    :cond_e
    :goto_3
    if-eqz p2, :cond_d

    iget v4, p2, Lb2/v;->y:I

    and-int/lit16 v4, v4, 0x400

    if-eqz v4, :cond_16

    move-object v4, v2

    :goto_4
    if-eqz p2, :cond_d

    instance-of v5, p2, Lg2/x;

    if-eqz v5, :cond_f

    check-cast p2, Lg2/x;

    invoke-static {p2}, Lg2/g;->u(Lg2/x;)V

    goto :goto_7

    :cond_f
    iget v5, p2, Lb2/v;->y:I

    and-int/lit16 v5, v5, 0x400

    if-eqz v5, :cond_15

    instance-of v5, p2, La3/o;

    if-eqz v5, :cond_15

    move-object v5, p2

    check-cast v5, La3/o;

    iget-object v5, v5, La3/o;->P:Lb2/v;

    const/4 v6, 0x0

    :goto_5
    if-eqz v5, :cond_14

    iget v7, v5, Lb2/v;->y:I

    and-int/lit16 v7, v7, 0x400

    if-eqz v7, :cond_13

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v3, :cond_10

    move-object p2, v5

    goto :goto_6

    :cond_10
    if-nez v4, :cond_11

    new-instance v4, Lr1/c;

    new-array v7, v1, [Lb2/v;

    invoke-direct {v4, v7}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_11
    if-eqz p2, :cond_12

    invoke-virtual {v4, p2}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object p2, v2

    :cond_12
    invoke-virtual {v4, v5}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_13
    :goto_6
    iget-object v5, v5, Lb2/v;->F:Lb2/v;

    goto :goto_5

    :cond_14
    if-ne v6, v3, :cond_15

    goto :goto_4

    :cond_15
    :goto_7
    invoke-static {v4}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object p2

    goto :goto_4

    :cond_16
    iget-object p2, p2, Lb2/v;->F:Lb2/v;

    goto :goto_3

    :cond_17
    and-int/lit16 p1, p1, 0x1000

    if-eqz p1, :cond_18

    instance-of p1, p0, Lg2/e;

    if-eqz p1, :cond_18

    check-cast p0, Lg2/e;

    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object p1

    invoke-interface {p1}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Lg2/k;

    move-result-object p1

    check-cast p1, Lg2/l;

    iget-object p1, p1, Lg2/l;->d:Lg2/h;

    iget-object p2, p1, Lg2/h;->d:La0/w0;

    invoke-virtual {p2, p0}, La0/w0;->a(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_18

    invoke-virtual {p1}, Lg2/h;->a()V

    :cond_18
    :goto_8
    return-void
.end method

.method public static final c(Lb2/v;)V
    .locals 2

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    const-string v0, "autoInvalidateUpdatedNode called on unattached node"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, La3/r1;->a(Lb2/v;II)V

    return-void
.end method

.method public static final d(Lb2/u;)I
    .locals 2

    instance-of v0, p0, Ly2/c0;

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    instance-of v1, p0, Lf2/f;

    if-eqz v1, :cond_1

    or-int/lit8 v0, v0, 0x4

    :cond_1
    instance-of v1, p0, Li3/m;

    if-eqz v1, :cond_2

    or-int/lit8 v0, v0, 0x8

    :cond_2
    instance-of v1, p0, Lu2/u;

    if-eqz v1, :cond_3

    or-int/lit8 v0, v0, 0x10

    :cond_3
    instance-of v1, p0, Lz2/c;

    if-nez v1, :cond_4

    instance-of v1, p0, Lz2/f;

    if-eqz v1, :cond_5

    :cond_4
    or-int/lit8 v0, v0, 0x20

    :cond_5
    instance-of v1, p0, Lp0/d;

    if-eqz v1, :cond_6

    or-int/lit16 v0, v0, 0x100

    :cond_6
    instance-of v1, p0, Ly2/g1;

    if-eqz v1, :cond_7

    or-int/lit8 v0, v0, 0x40

    :cond_7
    instance-of p0, p0, Lf3/a;

    if-eqz p0, :cond_8

    const/high16 p0, 0x80000

    or-int/2addr p0, v0

    return p0

    :cond_8
    return v0
.end method

.method public static final e(Lb2/v;)I
    .locals 4

    iget v0, p0, Lb2/v;->y:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, La3/r1;->a:La0/m0;

    invoke-virtual {v1, v0}, La0/m0;->d(Ljava/lang/Object;)I

    move-result v2

    if-ltz v2, :cond_1

    iget-object p0, v1, La0/m0;->c:[I

    aget p0, p0, v2

    return p0

    :cond_1
    instance-of v2, p0, La3/c0;

    if-eqz v2, :cond_2

    const/4 v2, 0x3

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    :goto_0
    instance-of v3, p0, La3/r;

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x4

    :cond_3
    instance-of v3, p0, La3/j2;

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x8

    :cond_4
    instance-of v3, p0, La3/f2;

    if-eqz v3, :cond_5

    or-int/lit8 v2, v2, 0x10

    :cond_5
    instance-of v3, p0, Lz2/e;

    if-eqz v3, :cond_6

    or-int/lit8 v2, v2, 0x20

    :cond_6
    instance-of v3, p0, La3/d2;

    if-eqz v3, :cond_7

    or-int/lit8 v2, v2, 0x40

    :cond_7
    instance-of v3, p0, La3/a0;

    if-eqz v3, :cond_8

    or-int/lit16 v2, v2, 0x80

    :cond_8
    instance-of v3, p0, La3/s;

    if-eqz v3, :cond_9

    or-int/lit16 v2, v2, 0x100

    :cond_9
    instance-of v3, p0, Lg2/x;

    if-eqz v3, :cond_a

    or-int/lit16 v2, v2, 0x400

    :cond_a
    instance-of v3, p0, Lg2/q;

    if-eqz v3, :cond_b

    or-int/lit16 v2, v2, 0x800

    :cond_b
    instance-of v3, p0, Lg2/e;

    if-eqz v3, :cond_c

    or-int/lit16 v2, v2, 0x1000

    :cond_c
    instance-of v3, p0, Ls2/f;

    if-eqz v3, :cond_d

    or-int/lit16 v2, v2, 0x2000

    :cond_d
    instance-of v3, p0, Lw2/a;

    if-eqz v3, :cond_e

    or-int/lit16 v2, v2, 0x4000

    :cond_e
    instance-of v3, p0, La3/m;

    if-eqz v3, :cond_f

    const v3, 0x8000

    or-int/2addr v2, v3

    :cond_f
    instance-of v3, p0, La3/p2;

    if-eqz v3, :cond_10

    const/high16 v3, 0x40000

    or-int/2addr v2, v3

    :cond_10
    instance-of p0, p0, Lf3/a;

    if-eqz p0, :cond_11

    const/high16 p0, 0x80000

    or-int/2addr v2, p0

    :cond_11
    invoke-virtual {v1, v0, v2}, La0/m0;->h(Ljava/lang/Object;I)V

    return v2
.end method

.method public static final f(Lb2/v;)I
    .locals 2

    instance-of v0, p0, La3/o;

    if-eqz v0, :cond_1

    check-cast p0, La3/o;

    iget v0, p0, La3/o;->O:I

    iget-object p0, p0, La3/o;->P:Lb2/v;

    :goto_0
    if-eqz p0, :cond_0

    invoke-static {p0}, La3/r1;->f(Lb2/v;)I

    move-result v1

    or-int/2addr v0, v1

    iget-object p0, p0, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    invoke-static {p0}, La3/r1;->e(Lb2/v;)I

    move-result p0

    return p0
.end method

.method public static final g(I)Z
    .locals 0

    and-int/lit16 p0, p0, 0x80

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
