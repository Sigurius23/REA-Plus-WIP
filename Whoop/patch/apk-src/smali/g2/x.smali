.class public final Lg2/x;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/m;
.implements La3/w1;
.implements Lz2/e;
.implements La3/n;


# instance fields
.field public final O:Lc93/m;

.field public P:Z

.field public Q:Z

.field public final R:I


# direct methods
.method public constructor <init>(Lc93/m;II)V
    .locals 1

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    const/4 p2, 0x1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p1, 0x0

    :cond_1
    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p1, p0, Lg2/x;->O:Lc93/m;

    iput p2, p0, Lg2/x;->R:I

    return-void
.end method

.method public static synthetic c1(Lg2/x;)Z
    .locals 1

    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Lg2/x;->b1(I)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final C()V
    .locals 0

    invoke-virtual {p0}, Lg2/x;->a1()V

    return-void
.end method

.method public final M0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final Q0()V
    .locals 4

    invoke-virtual {p0}, Lg2/x;->Z0()Lg2/w;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    :goto_0
    return-void

    :cond_2
    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Lg2/k;

    move-result-object v0

    check-cast v0, Lg2/l;

    const/16 v2, 0x8

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lg2/l;->d(IZZ)Z

    iget-object v0, v0, Lg2/l;->d:Lg2/h;

    invoke-virtual {v0}, Lg2/h;->a()V

    return-void
.end method

.method public final R0()V
    .locals 3

    invoke-virtual {p0}, Lg2/x;->Z0()Lg2/w;

    move-result-object v0

    invoke-virtual {v0}, Lg2/w;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Lg2/k;

    move-result-object v0

    const/16 v1, 0x8

    check-cast v0, Lg2/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v2}, Lg2/l;->d(IZZ)Z

    :cond_0
    return-void
.end method

.method public final X0(Lg2/w;Lg2/w;)V
    .locals 11

    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Lg2/k;

    move-result-object v0

    check-cast v0, Lg2/l;

    iget-object v1, v0, Lg2/l;->h:Lg2/x;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lg2/x;->O:Lc93/m;

    if-eqz v2, :cond_0

    invoke-interface {v2, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p1, p0, Lb2/v;->w:Lb2/v;

    iget-boolean v2, p1, Lb2/v;->N:Z

    if-nez v2, :cond_1

    const-string v2, "visitAncestors called on an unattached node"

    invoke-static {v2}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_1
    iget-object v2, p0, Lb2/v;->w:Lb2/v;

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v3

    :goto_0
    if-eqz v3, :cond_e

    iget-object v4, v3, La3/n0;->e0:La3/l1;

    iget-object v4, v4, La3/l1;->g:Ljava/lang/Object;

    check-cast v4, Lb2/v;

    iget v4, v4, Lb2/v;->z:I

    and-int/lit16 v4, v4, 0x1400

    const/4 v5, 0x0

    if-eqz v4, :cond_c

    :goto_1
    if-eqz v2, :cond_c

    iget v4, v2, Lb2/v;->y:I

    and-int/lit16 v6, v4, 0x1400

    if-eqz v6, :cond_b

    if-eq v2, p1, :cond_2

    and-int/lit16 v6, v4, 0x400

    if-eqz v6, :cond_2

    goto/16 :goto_6

    :cond_2
    and-int/lit16 v4, v4, 0x1000

    if-eqz v4, :cond_b

    move-object v4, v2

    move-object v6, v5

    :goto_2
    if-eqz v4, :cond_b

    instance-of v7, v4, Lg2/e;

    if-eqz v7, :cond_4

    check-cast v4, Lg2/e;

    iget-object v7, v0, Lg2/l;->h:Lg2/x;

    if-eq v1, v7, :cond_3

    goto :goto_5

    :cond_3
    invoke-interface {v4, p2}, Lg2/e;->k(Lg2/w;)V

    goto :goto_5

    :cond_4
    iget v7, v4, Lb2/v;->y:I

    and-int/lit16 v7, v7, 0x1000

    if-eqz v7, :cond_a

    instance-of v7, v4, La3/o;

    if-eqz v7, :cond_a

    move-object v7, v4

    check-cast v7, La3/o;

    iget-object v7, v7, La3/o;->P:Lb2/v;

    const/4 v8, 0x0

    :goto_3
    const/4 v9, 0x1

    if-eqz v7, :cond_9

    iget v10, v7, Lb2/v;->y:I

    and-int/lit16 v10, v10, 0x1000

    if-eqz v10, :cond_8

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v9, :cond_5

    move-object v4, v7

    goto :goto_4

    :cond_5
    if-nez v6, :cond_6

    new-instance v6, Lr1/c;

    const/16 v9, 0x10

    new-array v9, v9, [Lb2/v;

    invoke-direct {v6, v9}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_6
    if-eqz v4, :cond_7

    invoke-virtual {v6, v4}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v4, v5

    :cond_7
    invoke-virtual {v6, v7}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_8
    :goto_4
    iget-object v7, v7, Lb2/v;->F:Lb2/v;

    goto :goto_3

    :cond_9
    if-ne v8, v9, :cond_a

    goto :goto_2

    :cond_a
    :goto_5
    invoke-static {v6}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v4

    goto :goto_2

    :cond_b
    iget-object v2, v2, Lb2/v;->E:Lb2/v;

    goto :goto_1

    :cond_c
    invoke-virtual {v3}, La3/n0;->G()La3/n0;

    move-result-object v3

    if-eqz v3, :cond_d

    iget-object v2, v3, La3/n0;->e0:La3/l1;

    if-eqz v2, :cond_d

    iget-object v2, v2, La3/l1;->f:Ljava/lang/Object;

    check-cast v2, La3/l2;

    goto/16 :goto_0

    :cond_d
    move-object v2, v5

    goto/16 :goto_0

    :cond_e
    :goto_6
    return-void
.end method

.method public final Y0()Lg2/o;
    .locals 12

    new-instance v0, Lg2/o;

    invoke-direct {v0}, Lg2/o;-><init>()V

    iget v1, p0, Lg2/x;->R:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    move v1, v3

    goto :goto_1

    :cond_0
    if-nez v1, :cond_2

    sget-object v1, Lb3/v1;->m:Lp1/u2;

    invoke-static {p0, v1}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr2/b;

    check-cast v1, Lr2/c;

    iget-object v1, v1, Lr2/c;->a:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr2/a;

    iget v1, v1, Lr2/a;->a:I

    if-ne v1, v3, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    xor-int/2addr v1, v3

    goto :goto_1

    :cond_2
    const/4 v4, 0x2

    if-ne v1, v4, :cond_10

    move v1, v2

    :goto_1
    invoke-virtual {v0, v1}, Lg2/o;->b(Z)V

    iget-object v1, p0, Lb2/v;->w:Lb2/v;

    iget-boolean v4, v1, Lb2/v;->N:Z

    if-nez v4, :cond_3

    const-string v4, "visitAncestors called on an unattached node"

    invoke-static {v4}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_3
    iget-object v4, p0, Lb2/v;->w:Lb2/v;

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v5

    :goto_2
    if-eqz v5, :cond_f

    iget-object v6, v5, La3/n0;->e0:La3/l1;

    iget-object v6, v6, La3/l1;->g:Ljava/lang/Object;

    check-cast v6, Lb2/v;

    iget v6, v6, Lb2/v;->z:I

    and-int/lit16 v6, v6, 0xc00

    const/4 v7, 0x0

    if-eqz v6, :cond_d

    :goto_3
    if-eqz v4, :cond_d

    iget v6, v4, Lb2/v;->y:I

    and-int/lit16 v8, v6, 0xc00

    if-eqz v8, :cond_c

    if-eq v4, v1, :cond_4

    and-int/lit16 v8, v6, 0x400

    if-eqz v8, :cond_4

    goto/16 :goto_8

    :cond_4
    and-int/lit16 v6, v6, 0x800

    if-eqz v6, :cond_c

    move-object v6, v4

    move-object v8, v7

    :goto_4
    if-eqz v6, :cond_c

    instance-of v9, v6, Lg2/q;

    if-eqz v9, :cond_5

    check-cast v6, Lg2/q;

    invoke-interface {v6, v0}, Lg2/q;->j0(Lg2/m;)V

    goto :goto_7

    :cond_5
    iget v9, v6, Lb2/v;->y:I

    and-int/lit16 v9, v9, 0x800

    if-eqz v9, :cond_b

    instance-of v9, v6, La3/o;

    if-eqz v9, :cond_b

    move-object v9, v6

    check-cast v9, La3/o;

    iget-object v9, v9, La3/o;->P:Lb2/v;

    move v10, v2

    :goto_5
    if-eqz v9, :cond_a

    iget v11, v9, Lb2/v;->y:I

    and-int/lit16 v11, v11, 0x800

    if-eqz v11, :cond_9

    add-int/lit8 v10, v10, 0x1

    if-ne v10, v3, :cond_6

    move-object v6, v9

    goto :goto_6

    :cond_6
    if-nez v8, :cond_7

    new-instance v8, Lr1/c;

    const/16 v11, 0x10

    new-array v11, v11, [Lb2/v;

    invoke-direct {v8, v11}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_7
    if-eqz v6, :cond_8

    invoke-virtual {v8, v6}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v6, v7

    :cond_8
    invoke-virtual {v8, v9}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_9
    :goto_6
    iget-object v9, v9, Lb2/v;->F:Lb2/v;

    goto :goto_5

    :cond_a
    if-ne v10, v3, :cond_b

    goto :goto_4

    :cond_b
    :goto_7
    invoke-static {v8}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v6

    goto :goto_4

    :cond_c
    iget-object v4, v4, Lb2/v;->E:Lb2/v;

    goto :goto_3

    :cond_d
    invoke-virtual {v5}, La3/n0;->G()La3/n0;

    move-result-object v5

    if-eqz v5, :cond_e

    iget-object v4, v5, La3/n0;->e0:La3/l1;

    if-eqz v4, :cond_e

    iget-object v4, v4, La3/l1;->f:Ljava/lang/Object;

    check-cast v4, La3/l2;

    goto :goto_2

    :cond_e
    move-object v4, v7

    goto/16 :goto_2

    :cond_f
    :goto_8
    return-object v0

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown Focusability"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final Z0()Lg2/w;
    .locals 9

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    sget-object v0, Lg2/w;->z:Lg2/w;

    return-object v0

    :cond_0
    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Lg2/k;

    move-result-object v0

    check-cast v0, Lg2/l;

    iget-object v1, v0, Lg2/l;->h:Lg2/x;

    if-nez v1, :cond_1

    sget-object v0, Lg2/w;->z:Lg2/w;

    return-object v0

    :cond_1
    if-ne p0, v1, :cond_3

    iget-boolean v0, v0, Lg2/l;->i:Z

    if-eqz v0, :cond_2

    sget-object v0, Lg2/w;->y:Lg2/w;

    return-object v0

    :cond_2
    sget-object v0, Lg2/w;->w:Lg2/w;

    return-object v0

    :cond_3
    iget-boolean v0, v1, Lb2/v;->N:Z

    if-eqz v0, :cond_f

    iget-object v0, v1, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_4

    const-string v0, "visitAncestors called on an unattached node"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_4
    iget-object v0, v1, Lb2/v;->w:Lb2/v;

    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    invoke-static {v1}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_f

    iget-object v2, v1, La3/n0;->e0:La3/l1;

    iget-object v2, v2, La3/l1;->g:Ljava/lang/Object;

    check-cast v2, Lb2/v;

    iget v2, v2, Lb2/v;->z:I

    and-int/lit16 v2, v2, 0x400

    const/4 v3, 0x0

    if-eqz v2, :cond_d

    :goto_1
    if-eqz v0, :cond_d

    iget v2, v0, Lb2/v;->y:I

    and-int/lit16 v2, v2, 0x400

    if-eqz v2, :cond_c

    move-object v2, v0

    move-object v4, v3

    :goto_2
    if-eqz v2, :cond_c

    instance-of v5, v2, Lg2/x;

    if-eqz v5, :cond_5

    check-cast v2, Lg2/x;

    if-ne p0, v2, :cond_b

    sget-object v0, Lg2/w;->x:Lg2/w;

    return-object v0

    :cond_5
    iget v5, v2, Lb2/v;->y:I

    and-int/lit16 v5, v5, 0x400

    if-eqz v5, :cond_b

    instance-of v5, v2, La3/o;

    if-eqz v5, :cond_b

    move-object v5, v2

    check-cast v5, La3/o;

    iget-object v5, v5, La3/o;->P:Lb2/v;

    const/4 v6, 0x0

    :goto_3
    const/4 v7, 0x1

    if-eqz v5, :cond_a

    iget v8, v5, Lb2/v;->y:I

    and-int/lit16 v8, v8, 0x400

    if-eqz v8, :cond_9

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v7, :cond_6

    move-object v2, v5

    goto :goto_4

    :cond_6
    if-nez v4, :cond_7

    new-instance v4, Lr1/c;

    const/16 v7, 0x10

    new-array v7, v7, [Lb2/v;

    invoke-direct {v4, v7}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_7
    if-eqz v2, :cond_8

    invoke-virtual {v4, v2}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v2, v3

    :cond_8
    invoke-virtual {v4, v5}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_9
    :goto_4
    iget-object v5, v5, Lb2/v;->F:Lb2/v;

    goto :goto_3

    :cond_a
    if-ne v6, v7, :cond_b

    goto :goto_2

    :cond_b
    invoke-static {v4}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v2

    goto :goto_2

    :cond_c
    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    goto :goto_1

    :cond_d
    invoke-virtual {v1}, La3/n0;->G()La3/n0;

    move-result-object v1

    if-eqz v1, :cond_e

    iget-object v0, v1, La3/n0;->e0:La3/l1;

    if-eqz v0, :cond_e

    iget-object v0, v0, La3/l1;->f:Ljava/lang/Object;

    check-cast v0, La3/l2;

    goto :goto_0

    :cond_e
    move-object v0, v3

    goto :goto_0

    :cond_f
    sget-object v0, Lg2/w;->z:Lg2/w;

    return-object v0
.end method

.method public final a1()V
    .locals 4

    invoke-virtual {p0}, Lg2/x;->Z0()Lg2/w;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v2, La3/z0;

    const/16 v3, 0x9

    invoke-direct {v2, v3, v0, p0}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, v2}, La3/g;->l(Lb2/v;Lc93/a;)V

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v0, :cond_3

    check-cast v0, Lg2/m;

    invoke-interface {v0}, Lg2/m;->c()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p0}, La3/g;->q(La3/n;)Landroidx/compose/ui/node/Owner;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Lg2/k;

    move-result-object v0

    check-cast v0, Lg2/l;

    invoke-virtual {v0, v1}, Lg2/l;->b(Z)V

    :cond_2
    :goto_0
    return-void

    :cond_3
    const-string v0, "focusProperties"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final b1(I)Z
    .locals 3

    const-string v0, "FocusTransactions:requestFocus"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Lg2/x;->Y0()Lg2/o;

    move-result-object v0

    invoke-virtual {v0}, Lg2/o;->c()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return v1

    :cond_0
    :try_start_1
    invoke-static {p0, p1}, Lg2/g;->C(Lg2/x;I)Lg2/b;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v2, 0x2

    if-eq p1, v2, :cond_2

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    move v1, v0

    goto :goto_0

    :cond_3
    invoke-static {p0}, Lg2/g;->D(Lg2/x;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    :goto_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return v1

    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method
