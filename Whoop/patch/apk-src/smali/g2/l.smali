.class public final Lg2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/k;


# instance fields
.field public final a:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final b:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final c:Lg2/x;

.field public final d:Lg2/h;

.field public final e:Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;

.field public f:La0/l0;

.field public final g:La0/q0;

.field public h:Lg2/x;

.field public i:Z


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/l;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    iput-object p2, p0, Lg2/l;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    new-instance p1, Lg2/x;

    const/4 v0, 0x0

    const/4 v1, 0x6

    const/4 v2, 0x2

    invoke-direct {p1, v0, v2, v1}, Lg2/x;-><init>(Lc93/m;II)V

    iput-object p1, p0, Lg2/l;->c:Lg2/x;

    new-instance p1, Lg2/h;

    invoke-direct {p1, p0, p2}, Lg2/h;-><init>(Lg2/l;Landroidx/compose/ui/platform/AndroidComposeView;)V

    iput-object p1, p0, Lg2/l;->d:Lg2/h;

    new-instance p1, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;

    invoke-direct {p1, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;-><init>(Lg2/l;)V

    iput-object p1, p0, Lg2/l;->e:Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;

    new-instance p1, La0/q0;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, La0/q0;-><init>(I)V

    iput-object p1, p0, Lg2/l;->g:La0/q0;

    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 2

    const/4 v0, 0x1

    const/16 v1, 0x8

    invoke-virtual {p0, v1, p1, v0}, Lg2/l;->d(IZZ)Z

    return-void
.end method

.method public final c(Z)Z
    .locals 9

    iget-object v0, p0, Lg2/l;->h:Lg2/x;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    goto/16 :goto_7

    :cond_0
    iget-boolean v2, p0, Lg2/l;->i:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    if-nez p1, :cond_1

    return v3

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lg2/l;->i(Lg2/x;)V

    iget-boolean v2, p0, Lg2/l;->i:Z

    if-eqz v2, :cond_2

    sget-object v2, Lg2/w;->y:Lg2/w;

    goto :goto_0

    :cond_2
    sget-object v2, Lg2/w;->w:Lg2/w;

    :goto_0
    sget-object v4, Lg2/w;->z:Lg2/w;

    invoke-virtual {v0, v2, v4}, Lg2/x;->X0(Lg2/w;Lg2/w;)V

    iget-object v2, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v2, v2, Lb2/v;->N:Z

    if-nez v2, :cond_3

    const-string v2, "visitAncestors called on an unattached node"

    invoke-static {v2}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_3
    iget-object v2, v0, Lb2/v;->w:Lb2/v;

    iget-object v2, v2, Lb2/v;->E:Lb2/v;

    invoke-static {v0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_e

    iget-object v4, v0, La3/n0;->e0:La3/l1;

    iget-object v4, v4, La3/l1;->g:Ljava/lang/Object;

    check-cast v4, Lb2/v;

    iget v4, v4, Lb2/v;->z:I

    and-int/lit16 v4, v4, 0x400

    if-eqz v4, :cond_c

    :goto_2
    if-eqz v2, :cond_c

    iget v4, v2, Lb2/v;->y:I

    and-int/lit16 v4, v4, 0x400

    if-eqz v4, :cond_b

    move-object v5, p1

    move-object v4, v2

    :goto_3
    if-eqz v4, :cond_b

    instance-of v6, v4, Lg2/x;

    if-eqz v6, :cond_4

    check-cast v4, Lg2/x;

    sget-object v6, Lg2/w;->x:Lg2/w;

    sget-object v7, Lg2/w;->z:Lg2/w;

    invoke-virtual {v4, v6, v7}, Lg2/x;->X0(Lg2/w;Lg2/w;)V

    goto :goto_6

    :cond_4
    iget v6, v4, Lb2/v;->y:I

    and-int/lit16 v6, v6, 0x400

    if-eqz v6, :cond_a

    instance-of v6, v4, La3/o;

    if-eqz v6, :cond_a

    move-object v6, v4

    check-cast v6, La3/o;

    iget-object v6, v6, La3/o;->P:Lb2/v;

    move v7, v3

    :goto_4
    if-eqz v6, :cond_9

    iget v8, v6, Lb2/v;->y:I

    and-int/lit16 v8, v8, 0x400

    if-eqz v8, :cond_8

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v1, :cond_5

    move-object v4, v6

    goto :goto_5

    :cond_5
    if-nez v5, :cond_6

    new-instance v5, Lr1/c;

    const/16 v8, 0x10

    new-array v8, v8, [Lb2/v;

    invoke-direct {v5, v8}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_6
    if-eqz v4, :cond_7

    invoke-virtual {v5, v4}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v4, p1

    :cond_7
    invoke-virtual {v5, v6}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_8
    :goto_5
    iget-object v6, v6, Lb2/v;->F:Lb2/v;

    goto :goto_4

    :cond_9
    if-ne v7, v1, :cond_a

    goto :goto_3

    :cond_a
    :goto_6
    invoke-static {v5}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v4

    goto :goto_3

    :cond_b
    iget-object v2, v2, Lb2/v;->E:Lb2/v;

    goto :goto_2

    :cond_c
    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_d

    iget-object v2, v0, La3/n0;->e0:La3/l1;

    if-eqz v2, :cond_d

    iget-object v2, v2, La3/l1;->f:Ljava/lang/Object;

    check-cast v2, La3/l2;

    goto :goto_1

    :cond_d
    move-object v2, p1

    goto :goto_1

    :cond_e
    :goto_7
    return v1
.end method

.method public final d(IZZ)Z
    .locals 1

    if-nez p2, :cond_3

    iget-object v0, p0, Lg2/l;->c:Lg2/x;

    invoke-static {v0, p1}, Lg2/g;->A(Lg2/x;I)Lg2/b;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_1

    const/4 p2, 0x3

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p2}, Lg2/l;->c(Z)Z

    move-result p1

    goto :goto_1

    :cond_3
    invoke-virtual {p0, p2}, Lg2/l;->c(Z)Z

    move-result p1

    :goto_1
    if-eqz p1, :cond_4

    if-eqz p3, :cond_4

    invoke-virtual {p0}, Lg2/l;->e()V

    :cond_4
    return p1
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lg2/l;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    :cond_1
    invoke-virtual {v0}, Landroid/view/ViewGroup;->clearFocus()V

    :cond_2
    return-void

    :cond_3
    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->clearFocus()V

    return-void
.end method

.method public final f(Landroid/view/KeyEvent;Lc93/a;)Z
    .locals 13

    iget-object v0, p0, Lg2/l;->c:Lg2/x;

    const-string v1, "FocusOwnerImpl:dispatchKeyEvent"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    iget-object v1, p0, Lg2/l;->d:Lg2/h;

    iget-boolean v1, v1, Lg2/h;->e:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const-string p1, "FocusRelatedWarning: Dispatching key event while focus system is invalidated."

    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return v2

    :catchall_0
    move-exception p1

    goto/16 :goto_1e

    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lg2/l;->j(Landroid/view/KeyEvent;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return v2

    :cond_1
    :try_start_2
    invoke-static {v0}, Lg2/g;->h(Lg2/x;)Lg2/x;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v3, "visitAncestors called on an unattached node"

    const/16 v4, 0x10

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v1, :cond_7

    :try_start_3
    iget-object v7, v1, Lb2/v;->w:Lb2/v;

    iget-boolean v7, v7, Lb2/v;->N:Z

    if-nez v7, :cond_2

    const-string v7, "visitLocalDescendants called on an unattached node"

    invoke-static {v7}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_2
    iget-object v7, v1, Lb2/v;->w:Lb2/v;

    iget v8, v7, Lb2/v;->z:I

    and-int/lit16 v8, v8, 0x2400

    if-eqz v8, :cond_5

    iget-object v7, v7, Lb2/v;->F:Lb2/v;

    move-object v8, v5

    :goto_0
    if-eqz v7, :cond_6

    iget v9, v7, Lb2/v;->y:I

    and-int/lit16 v10, v9, 0x2400

    if-eqz v10, :cond_4

    and-int/lit16 v9, v9, 0x400

    if-eqz v9, :cond_3

    goto :goto_1

    :cond_3
    move-object v8, v7

    :cond_4
    iget-object v7, v7, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_5
    move-object v8, v5

    :cond_6
    :goto_1
    if-nez v8, :cond_22

    :cond_7
    if-eqz v1, :cond_14

    iget-object v7, v1, Lb2/v;->w:Lb2/v;

    iget-boolean v7, v7, Lb2/v;->N:Z

    if-nez v7, :cond_8

    invoke-static {v3}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_8
    iget-object v7, v1, Lb2/v;->w:Lb2/v;

    invoke-static {v1}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v1

    :goto_2
    if-eqz v1, :cond_13

    iget-object v8, v1, La3/n0;->e0:La3/l1;

    iget-object v8, v8, La3/l1;->g:Ljava/lang/Object;

    check-cast v8, Lb2/v;

    iget v8, v8, Lb2/v;->z:I

    and-int/lit16 v8, v8, 0x2000

    if-eqz v8, :cond_11

    :goto_3
    if-eqz v7, :cond_11

    iget v8, v7, Lb2/v;->y:I

    and-int/lit16 v8, v8, 0x2000

    if-eqz v8, :cond_10

    move-object v9, v5

    move-object v8, v7

    :goto_4
    if-eqz v8, :cond_10

    instance-of v10, v8, Ls2/f;

    if-eqz v10, :cond_9

    goto :goto_7

    :cond_9
    iget v10, v8, Lb2/v;->y:I

    and-int/lit16 v10, v10, 0x2000

    if-eqz v10, :cond_f

    instance-of v10, v8, La3/o;

    if-eqz v10, :cond_f

    move-object v10, v8

    check-cast v10, La3/o;

    iget-object v10, v10, La3/o;->P:Lb2/v;

    move v11, v2

    :goto_5
    if-eqz v10, :cond_e

    iget v12, v10, Lb2/v;->y:I

    and-int/lit16 v12, v12, 0x2000

    if-eqz v12, :cond_d

    add-int/lit8 v11, v11, 0x1

    if-ne v11, v6, :cond_a

    move-object v8, v10

    goto :goto_6

    :cond_a
    if-nez v9, :cond_b

    new-instance v9, Lr1/c;

    new-array v12, v4, [Lb2/v;

    invoke-direct {v9, v12}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_b
    if-eqz v8, :cond_c

    invoke-virtual {v9, v8}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v8, v5

    :cond_c
    invoke-virtual {v9, v10}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_d
    :goto_6
    iget-object v10, v10, Lb2/v;->F:Lb2/v;

    goto :goto_5

    :cond_e
    if-ne v11, v6, :cond_f

    goto :goto_4

    :cond_f
    invoke-static {v9}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v8

    goto :goto_4

    :cond_10
    iget-object v7, v7, Lb2/v;->E:Lb2/v;

    goto :goto_3

    :cond_11
    invoke-virtual {v1}, La3/n0;->G()La3/n0;

    move-result-object v1

    if-eqz v1, :cond_12

    iget-object v7, v1, La3/n0;->e0:La3/l1;

    if-eqz v7, :cond_12

    iget-object v7, v7, La3/l1;->f:Ljava/lang/Object;

    check-cast v7, La3/l2;

    goto :goto_2

    :cond_12
    move-object v7, v5

    goto :goto_2

    :cond_13
    move-object v8, v5

    :goto_7
    check-cast v8, Ls2/f;

    if-eqz v8, :cond_14

    check-cast v8, Lb2/v;

    iget-object v8, v8, Lb2/v;->w:Lb2/v;

    goto/16 :goto_e

    :cond_14
    iget-object v1, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-nez v1, :cond_15

    invoke-static {v3}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_15
    iget-object v1, v0, Lb2/v;->w:Lb2/v;

    iget-object v1, v1, Lb2/v;->E:Lb2/v;

    invoke-static {v0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    :goto_8
    if-eqz v0, :cond_20

    iget-object v7, v0, La3/n0;->e0:La3/l1;

    iget-object v7, v7, La3/l1;->g:Ljava/lang/Object;

    check-cast v7, Lb2/v;

    iget v7, v7, Lb2/v;->z:I

    and-int/lit16 v7, v7, 0x2000

    if-eqz v7, :cond_1e

    :goto_9
    if-eqz v1, :cond_1e

    iget v7, v1, Lb2/v;->y:I

    and-int/lit16 v7, v7, 0x2000

    if-eqz v7, :cond_1d

    move-object v7, v1

    move-object v8, v5

    :goto_a
    if-eqz v7, :cond_1d

    instance-of v9, v7, Ls2/f;

    if-eqz v9, :cond_16

    goto :goto_d

    :cond_16
    iget v9, v7, Lb2/v;->y:I

    and-int/lit16 v9, v9, 0x2000

    if-eqz v9, :cond_1c

    instance-of v9, v7, La3/o;

    if-eqz v9, :cond_1c

    move-object v9, v7

    check-cast v9, La3/o;

    iget-object v9, v9, La3/o;->P:Lb2/v;

    move v10, v2

    :goto_b
    if-eqz v9, :cond_1b

    iget v11, v9, Lb2/v;->y:I

    and-int/lit16 v11, v11, 0x2000

    if-eqz v11, :cond_1a

    add-int/lit8 v10, v10, 0x1

    if-ne v10, v6, :cond_17

    move-object v7, v9

    goto :goto_c

    :cond_17
    if-nez v8, :cond_18

    new-instance v8, Lr1/c;

    new-array v11, v4, [Lb2/v;

    invoke-direct {v8, v11}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_18
    if-eqz v7, :cond_19

    invoke-virtual {v8, v7}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v7, v5

    :cond_19
    invoke-virtual {v8, v9}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_1a
    :goto_c
    iget-object v9, v9, Lb2/v;->F:Lb2/v;

    goto :goto_b

    :cond_1b
    if-ne v10, v6, :cond_1c

    goto :goto_a

    :cond_1c
    invoke-static {v8}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v7

    goto :goto_a

    :cond_1d
    iget-object v1, v1, Lb2/v;->E:Lb2/v;

    goto :goto_9

    :cond_1e
    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_1f

    iget-object v1, v0, La3/n0;->e0:La3/l1;

    if-eqz v1, :cond_1f

    iget-object v1, v1, La3/l1;->f:Ljava/lang/Object;

    check-cast v1, La3/l2;

    goto :goto_8

    :cond_1f
    move-object v1, v5

    goto :goto_8

    :cond_20
    move-object v7, v5

    :goto_d
    check-cast v7, Ls2/f;

    if-eqz v7, :cond_21

    check-cast v7, Lb2/v;

    iget-object v8, v7, Lb2/v;->w:Lb2/v;

    goto :goto_e

    :cond_21
    move-object v8, v5

    :cond_22
    :goto_e
    if-eqz v8, :cond_45

    iget-object v0, v8, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_23

    invoke-static {v3}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_23
    iget-object v0, v8, Lb2/v;->w:Lb2/v;

    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    invoke-static {v8}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v1

    move-object v3, v5

    :goto_f
    if-eqz v1, :cond_2f

    iget-object v7, v1, La3/n0;->e0:La3/l1;

    iget-object v7, v7, La3/l1;->g:Ljava/lang/Object;

    check-cast v7, Lb2/v;

    iget v7, v7, Lb2/v;->z:I

    and-int/lit16 v7, v7, 0x2000

    if-eqz v7, :cond_2d

    :goto_10
    if-eqz v0, :cond_2d

    iget v7, v0, Lb2/v;->y:I

    and-int/lit16 v7, v7, 0x2000

    if-eqz v7, :cond_2c

    move-object v7, v0

    move-object v9, v5

    :goto_11
    if-eqz v7, :cond_2c

    instance-of v10, v7, Ls2/f;

    if-eqz v10, :cond_25

    if-nez v3, :cond_24

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_24
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_25
    iget v10, v7, Lb2/v;->y:I

    and-int/lit16 v10, v10, 0x2000

    if-eqz v10, :cond_2b

    instance-of v10, v7, La3/o;

    if-eqz v10, :cond_2b

    move-object v10, v7

    check-cast v10, La3/o;

    iget-object v10, v10, La3/o;->P:Lb2/v;

    move v11, v2

    :goto_12
    if-eqz v10, :cond_2a

    iget v12, v10, Lb2/v;->y:I

    and-int/lit16 v12, v12, 0x2000

    if-eqz v12, :cond_29

    add-int/lit8 v11, v11, 0x1

    if-ne v11, v6, :cond_26

    move-object v7, v10

    goto :goto_13

    :cond_26
    if-nez v9, :cond_27

    new-instance v9, Lr1/c;

    new-array v12, v4, [Lb2/v;

    invoke-direct {v9, v12}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_27
    if-eqz v7, :cond_28

    invoke-virtual {v9, v7}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v7, v5

    :cond_28
    invoke-virtual {v9, v10}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_29
    :goto_13
    iget-object v10, v10, Lb2/v;->F:Lb2/v;

    goto :goto_12

    :cond_2a
    if-ne v11, v6, :cond_2b

    goto :goto_11

    :cond_2b
    :goto_14
    invoke-static {v9}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v7

    goto :goto_11

    :cond_2c
    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    goto :goto_10

    :cond_2d
    invoke-virtual {v1}, La3/n0;->G()La3/n0;

    move-result-object v1

    if-eqz v1, :cond_2e

    iget-object v0, v1, La3/n0;->e0:La3/l1;

    if-eqz v0, :cond_2e

    iget-object v0, v0, La3/l1;->f:Ljava/lang/Object;

    check-cast v0, La3/l2;

    goto :goto_f

    :cond_2e
    move-object v0, v5

    goto :goto_f

    :cond_2f
    if-eqz v3, :cond_32

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_32

    :goto_15
    add-int/lit8 v1, v0, -0x1

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls2/f;

    invoke-interface {v0, p1}, Ls2/f;->Q(Landroid/view/KeyEvent;)Z

    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v0, :cond_30

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return v6

    :cond_30
    if-gez v1, :cond_31

    goto :goto_16

    :cond_31
    move v0, v1

    goto :goto_15

    :cond_32
    :goto_16
    :try_start_4
    iget-object v0, v8, Lb2/v;->w:Lb2/v;

    move-object v1, v5

    :goto_17
    if-eqz v0, :cond_3a

    instance-of v7, v0, Ls2/f;

    if-eqz v7, :cond_33

    check-cast v0, Ls2/f;

    invoke-interface {v0, p1}, Ls2/f;->Q(Landroid/view/KeyEvent;)Z

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v0, :cond_39

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return v6

    :cond_33
    :try_start_5
    iget v7, v0, Lb2/v;->y:I

    and-int/lit16 v7, v7, 0x2000

    if-eqz v7, :cond_39

    instance-of v7, v0, La3/o;

    if-eqz v7, :cond_39

    move-object v7, v0

    check-cast v7, La3/o;

    iget-object v7, v7, La3/o;->P:Lb2/v;

    move v9, v2

    :goto_18
    if-eqz v7, :cond_38

    iget v10, v7, Lb2/v;->y:I

    and-int/lit16 v10, v10, 0x2000

    if-eqz v10, :cond_37

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v6, :cond_34

    move-object v0, v7

    goto :goto_19

    :cond_34
    if-nez v1, :cond_35

    new-instance v1, Lr1/c;

    new-array v10, v4, [Lb2/v;

    invoke-direct {v1, v10}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_35
    if-eqz v0, :cond_36

    invoke-virtual {v1, v0}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v0, v5

    :cond_36
    invoke-virtual {v1, v7}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_37
    :goto_19
    iget-object v7, v7, Lb2/v;->F:Lb2/v;

    goto :goto_18

    :cond_38
    if-ne v9, v6, :cond_39

    goto :goto_17

    :cond_39
    invoke-static {v1}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v0

    goto :goto_17

    :cond_3a
    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz p2, :cond_3b

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return v6

    :cond_3b
    :try_start_6
    iget-object p2, v8, Lb2/v;->w:Lb2/v;

    move-object v0, v5

    :goto_1a
    if-eqz p2, :cond_43

    instance-of v1, p2, Ls2/f;

    if-eqz v1, :cond_3c

    check-cast p2, Ls2/f;

    invoke-interface {p2, p1}, Ls2/f;->Z(Landroid/view/KeyEvent;)Z

    move-result p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz p2, :cond_42

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return v6

    :cond_3c
    :try_start_7
    iget v1, p2, Lb2/v;->y:I

    and-int/lit16 v1, v1, 0x2000

    if-eqz v1, :cond_42

    instance-of v1, p2, La3/o;

    if-eqz v1, :cond_42

    move-object v1, p2

    check-cast v1, La3/o;

    iget-object v1, v1, La3/o;->P:Lb2/v;

    move v7, v2

    :goto_1b
    if-eqz v1, :cond_41

    iget v8, v1, Lb2/v;->y:I

    and-int/lit16 v8, v8, 0x2000

    if-eqz v8, :cond_40

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v6, :cond_3d

    move-object p2, v1

    goto :goto_1c

    :cond_3d
    if-nez v0, :cond_3e

    new-instance v0, Lr1/c;

    new-array v8, v4, [Lb2/v;

    invoke-direct {v0, v8}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_3e
    if-eqz p2, :cond_3f

    invoke-virtual {v0, p2}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object p2, v5

    :cond_3f
    invoke-virtual {v0, v1}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_40
    :goto_1c
    iget-object v1, v1, Lb2/v;->F:Lb2/v;

    goto :goto_1b

    :cond_41
    if-ne v7, v6, :cond_42

    goto :goto_1a

    :cond_42
    invoke-static {v0}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object p2

    goto :goto_1a

    :cond_43
    if-eqz v3, :cond_45

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result p2

    move v0, v2

    :goto_1d
    if-ge v0, p2, :cond_45

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls2/f;

    invoke-interface {v1, p1}, Ls2/f;->Z(Landroid/view/KeyEvent;)Z

    move-result v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-eqz v1, :cond_44

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return v6

    :cond_44
    add-int/lit8 v0, v0, 0x1

    goto :goto_1d

    :cond_45
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return v2

    :goto_1e
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public final g(ILh2/c;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;
    .locals 6

    iget-object v0, p0, Lg2/l;->c:Lg2/x;

    invoke-static {v0}, Lg2/g;->h(Lg2/x;)Lg2/x;

    move-result-object v1

    iget-object v2, p0, Lg2/l;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    invoke-interface {v2}, Landroidx/compose/ui/node/Owner;->getLayoutDirection()Ly3/m;

    move-result-object v4

    invoke-static {v1, p1, v4}, Lg2/g;->g(Lg2/x;ILy3/m;)Lg2/s;

    move-result-object v4

    sget-object v5, Lg2/s;->b:Lg2/s;

    invoke-static {}, Lg2/g;->r()Lg2/s;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lg2/g;->t()Lg2/s;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {v0}, Lg2/g;->h(Lg2/x;)Lg2/x;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    return-object p1

    :cond_1
    :goto_0
    return-object v3

    :cond_2
    invoke-static {}, Lg2/g;->s()Lg2/s;

    move-result-object v3

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v4, p3}, Lg2/s;->a(Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_3
    move-object v1, v3

    :cond_4
    invoke-interface {v2}, Landroidx/compose/ui/node/Owner;->getLayoutDirection()Ly3/m;

    move-result-object v2

    new-instance v3, Lb4/g;

    invoke-direct {v3, v1, p0, p3}, Lb4/g;-><init>(Lg2/x;Lg2/l;Lkotlin/jvm/functions/Function1;)V

    invoke-static {v0, p1, v2, p2, v3}, Lg2/g;->l(Lg2/x;ILy3/m;Lh2/c;Lb4/g;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final h(I)Z
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v1, p0, Lg2/l;->h:Lg2/x;

    iget-object v2, p0, Lg2/l;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-interface {v2}, Lg2/a0;->getEmbeddedViewFocusRect()Lh2/c;

    move-result-object v3

    new-instance v4, Lp5/e;

    const/4 v5, 0x4

    invoke-direct {v4, v0, p1, v5}, Lp5/e;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {p0, p1, v3, v4}, Lg2/l;->g(ILh2/c;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lg2/l;->h:Lg2/x;

    if-eq v1, v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v1, 0x0

    if-eqz v3, :cond_a

    iget-object v4, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez v4, :cond_1

    goto/16 :goto_5

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_4

    :cond_2
    invoke-static {p1}, Lg2/g;->v(I)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {p0, p1, v1, v1}, Lg2/l;->d(IZZ)Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance v0, Lb3/y;

    const/4 v2, 0x2

    invoke-direct {v0, p1, v2}, Lb3/y;-><init>(II)V

    invoke-virtual {p0, p1, v3, v0}, Lg2/l;->g(ILh2/c;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_3
    move p1, v1

    :goto_0
    if-eqz p1, :cond_a

    goto :goto_4

    :cond_4
    const/4 v0, 0x7

    invoke-static {p1, v0}, Lg2/d;->b(II)Z

    move-result v0

    if-nez v0, :cond_9

    const/16 v0, 0x8

    invoke-static {p1, v0}, Lg2/d;->b(II)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    invoke-static {p1}, Ljc/x;->u0(I)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getEmbeddedViewFocusRect()Lh2/c;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Li2/w0;->D(Lh2/c;)Landroid/graphics/Rect;

    move-result-object v3

    :cond_6
    sget-object v0, Lb3/d2;->f:Lat/b;

    invoke-static {}, Ldc/a;->A()Lb3/d2;

    move-result-object v0

    if-nez v3, :cond_7

    invoke-virtual {v2}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v0, p1, v4, v2}, Lb3/d2;->b(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_1

    :cond_7
    invoke-virtual {v0, v2, v3, p1}, Lb3/d2;->c(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/graphics/Rect;I)Landroid/view/View;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_9

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1, v3}, Ljc/x;->o0(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z

    move-result p1

    goto :goto_3

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid focus direction"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    :goto_2
    move p1, v1

    :goto_3
    if-eqz p1, :cond_a

    :goto_4
    const/4 p1, 0x1

    return p1

    :cond_a
    :goto_5
    return v1
.end method

.method public final i(Lg2/x;)V
    .locals 9

    iget-object v0, p0, Lg2/l;->h:Lg2/x;

    iput-object p1, p0, Lg2/l;->h:Lg2/x;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    if-eq v0, p1, :cond_1

    :cond_0
    iput-boolean v1, p0, Lg2/l;->i:Z

    :cond_1
    iget-object v2, p0, Lg2/l;->g:La0/q0;

    iget-object v3, v2, La0/q0;->a:[Ljava/lang/Object;

    iget v2, v2, La0/q0;->b:I

    :goto_0
    if-ge v1, v2, :cond_4

    aget-object v4, v3, v1

    check-cast v4, Lc2/d;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x1

    if-eqz v0, :cond_2

    invoke-static {v0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, La3/n0;->I()Li3/l;

    move-result-object v7

    if-eqz v7, :cond_2

    iget-object v7, v7, Li3/l;->w:La0/v0;

    sget-object v8, Li3/k;->g:Li3/y;

    invoke-virtual {v7, v8}, La0/v0;->b(Ljava/lang/Object;)Z

    move-result v7

    if-ne v7, v5, :cond_2

    iget-object v7, v4, Lc2/d;->a:Lad3/z;

    iget-object v8, v4, Lc2/d;->c:Landroidx/compose/ui/platform/AndroidComposeView;

    iget v6, v6, La3/n0;->x:I

    iget-object v7, v7, Lad3/z;->x:Ljava/lang/Object;

    check-cast v7, Landroid/view/autofill/AutofillManager;

    invoke-virtual {v7, v8, v6}, Landroid/view/autofill/AutofillManager;->notifyViewExited(Landroid/view/View;I)V

    :cond_2
    if-eqz p1, :cond_3

    invoke-static {p1}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, La3/n0;->I()Li3/l;

    move-result-object v7

    if-eqz v7, :cond_3

    iget-object v7, v7, Li3/l;->w:La0/v0;

    sget-object v8, Li3/k;->g:Li3/y;

    invoke-virtual {v7, v8}, La0/v0;->b(Ljava/lang/Object;)Z

    move-result v7

    if-ne v7, v5, :cond_3

    iget v5, v6, La3/n0;->x:I

    iget-object v6, v4, Lc2/d;->d:Lj3/b;

    iget-object v6, v6, Lj3/b;->a:Lae3/k;

    new-instance v7, Lc2/b;

    invoke-direct {v7, v4, v5}, Lc2/b;-><init>(Lc2/d;I)V

    invoke-virtual {v6, v5, v7}, Lae3/k;->g(ILc93/n;)V

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final j(Landroid/view/KeyEvent;)Z
    .locals 40

    move-object/from16 v0, p0

    invoke-static/range {p1 .. p1}, Ls2/e;->D(Landroid/view/KeyEvent;)J

    move-result-wide v1

    invoke-static/range {p1 .. p1}, Ls2/e;->L(Landroid/view/KeyEvent;)I

    move-result v3

    const/4 v4, 0x2

    invoke-static {v3, v4}, Ls2/d;->j(II)Z

    move-result v4

    const v10, -0x3361d2af    # -8.293031E7f

    const-wide/16 v15, 0x0

    const-wide v17, 0x101010101010101L

    const-wide/16 v19, 0xfe

    const/16 p1, 0x6

    const/16 v5, 0x8

    const/16 v21, 0x0

    const-wide/16 v22, 0x1

    const/4 v6, 0x3

    const/4 v7, 0x1

    if-eqz v4, :cond_11

    iget-object v3, v0, Lg2/l;->f:La0/l0;

    if-nez v3, :cond_0

    new-instance v3, La0/l0;

    invoke-direct {v3, v6}, La0/l0;-><init>(I)V

    iput-object v3, v0, Lg2/l;->f:La0/l0;

    :cond_0
    move-object v4, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    mul-int/2addr v3, v10

    shl-int/lit8 v24, v3, 0x10

    xor-int v3, v3, v24

    move/from16 v24, v6

    ushr-int/lit8 v6, v3, 0x7

    and-int/lit8 v3, v3, 0x7f

    const/16 v25, 0x3f

    iget v8, v4, La0/l0;->c:I

    and-int v26, v6, v8

    move/from16 v27, v21

    const/16 v28, 0x7

    :goto_0
    iget-object v9, v4, La0/l0;->a:[J

    shr-int/lit8 v29, v26, 0x3

    and-int/lit8 v30, v26, 0x7

    move/from16 v31, v10

    shl-int/lit8 v10, v30, 0x3

    aget-wide v32, v9, v29

    ushr-long v32, v32, v10

    add-int/lit8 v29, v29, 0x1

    aget-wide v29, v9, v29

    rsub-int/lit8 v9, v10, 0x40

    shl-long v29, v29, v9

    int-to-long v9, v10

    neg-long v9, v9

    shr-long v9, v9, v25

    and-long v9, v29, v9

    or-long v9, v32, v9

    const-wide/16 v29, 0xff

    int-to-long v11, v3

    mul-long v32, v11, v17

    const-wide v34, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    xor-long v13, v9, v32

    sub-long v32, v13, v17

    not-long v13, v13

    and-long v13, v32, v13

    and-long v13, v13, v34

    :goto_1
    cmp-long v32, v13, v15

    if-eqz v32, :cond_2

    invoke-static {v13, v14}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v32

    shr-int/lit8 v32, v32, 0x3

    add-int v32, v26, v32

    and-int v32, v32, v8

    move-wide/from16 v36, v15

    iget-object v15, v4, La0/l0;->b:[J

    aget-wide v15, v15, v32

    cmp-long v15, v15, v1

    if-nez v15, :cond_1

    move/from16 v33, v7

    goto/16 :goto_d

    :cond_1
    sub-long v15, v13, v22

    and-long/2addr v13, v15

    move-wide/from16 v15, v36

    goto :goto_1

    :cond_2
    move-wide/from16 v36, v15

    not-long v13, v9

    shl-long v13, v13, p1

    and-long/2addr v9, v13

    and-long v9, v9, v34

    cmp-long v9, v9, v36

    if-eqz v9, :cond_10

    invoke-virtual {v4, v6}, La0/l0;->b(I)I

    move-result v3

    iget v8, v4, La0/l0;->e:I

    if-nez v8, :cond_3

    iget-object v8, v4, La0/l0;->a:[J

    shr-int/lit8 v13, v3, 0x3

    aget-wide v13, v8, v13

    and-int/lit8 v8, v3, 0x7

    shl-int/lit8 v8, v8, 0x3

    shr-long/2addr v13, v8

    and-long v13, v13, v29

    cmp-long v8, v13, v19

    if-nez v8, :cond_4

    :cond_3
    move/from16 v33, v7

    const-wide/16 v17, 0x80

    goto/16 :goto_c

    :cond_4
    iget v3, v4, La0/l0;->c:I

    if-le v3, v5, :cond_d

    iget v8, v4, La0/l0;->d:I

    int-to-long v13, v8

    const-wide/16 v15, 0x20

    mul-long/2addr v13, v15

    const-wide/16 v15, 0x80

    int-to-long v9, v3

    const-wide/16 v17, 0x19

    mul-long v9, v9, v17

    invoke-static {v13, v14, v9, v10}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v3

    if-gtz v3, :cond_c

    iget-object v3, v4, La0/l0;->a:[J

    iget v8, v4, La0/l0;->c:I

    iget-object v9, v4, La0/l0;->b:[J

    add-int/lit8 v10, v8, 0x7

    shr-int/lit8 v10, v10, 0x3

    move/from16 v13, v21

    :goto_2
    if-ge v13, v10, :cond_5

    aget-wide v17, v3, v13

    move v14, v5

    move/from16 v32, v6

    and-long v5, v17, v34

    move-wide/from16 v17, v15

    move/from16 v16, v14

    not-long v14, v5

    ushr-long v5, v5, v28

    add-long/2addr v14, v5

    const-wide v5, -0x101010101010102L

    and-long/2addr v5, v14

    aput-wide v5, v3, v13

    add-int/lit8 v13, v13, 0x1

    move/from16 v5, v16

    move-wide/from16 v15, v17

    move/from16 v6, v32

    goto :goto_2

    :cond_5
    move/from16 v32, v6

    move-wide/from16 v17, v15

    move/from16 v16, v5

    invoke-static {v3}, Lm83/n;->v0([J)I

    move-result v5

    add-int/lit8 v6, v5, -0x1

    aget-wide v13, v3, v6

    const-wide v22, 0xffffffffffffffL

    and-long v13, v13, v22

    const-wide/high16 v25, -0x100000000000000L

    or-long v13, v13, v25

    aput-wide v13, v3, v6

    aget-wide v13, v3, v21

    aput-wide v13, v3, v5

    move/from16 v5, v21

    :goto_3
    if-eq v5, v8, :cond_a

    shr-int/lit8 v6, v5, 0x3

    aget-wide v13, v3, v6

    and-int/lit8 v10, v5, 0x7

    shl-int/lit8 v10, v10, 0x3

    shr-long/2addr v13, v10

    and-long v13, v13, v29

    cmp-long v15, v13, v17

    if-nez v15, :cond_6

    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_6
    cmp-long v13, v13, v19

    if-eqz v13, :cond_7

    goto :goto_4

    :cond_7
    aget-wide v13, v9, v5

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    mul-int v13, v13, v31

    shl-int/lit8 v14, v13, 0x10

    xor-int/2addr v13, v14

    ushr-int/lit8 v14, v13, 0x7

    invoke-virtual {v4, v14}, La0/l0;->b(I)I

    move-result v15

    and-int/2addr v14, v8

    sub-int v25, v15, v14

    and-int v25, v25, v8

    move/from16 v33, v7

    div-int/lit8 v7, v25, 0x8

    sub-int v14, v5, v14

    and-int/2addr v14, v8

    div-int/lit8 v14, v14, 0x8

    const-wide/high16 v25, -0x8000000000000000L

    if-ne v7, v14, :cond_8

    and-int/lit8 v7, v13, 0x7f

    int-to-long v13, v7

    aget-wide v34, v3, v6

    move v7, v5

    move/from16 p1, v6

    shl-long v5, v29, v10

    not-long v5, v5

    and-long v5, v34, v5

    shl-long/2addr v13, v10

    or-long/2addr v5, v13

    aput-wide v5, v3, p1

    array-length v5, v3

    add-int/lit8 v5, v5, -0x1

    aget-wide v13, v3, v21

    and-long v13, v13, v22

    or-long v13, v13, v25

    aput-wide v13, v3, v5

    add-int/lit8 v5, v7, 0x1

    :goto_5
    move/from16 v7, v33

    goto :goto_3

    :cond_8
    move v7, v5

    move/from16 p1, v6

    shr-int/lit8 v5, v15, 0x3

    aget-wide v34, v3, v5

    and-int/lit8 v6, v15, 0x7

    shl-int/lit8 v6, v6, 0x3

    shr-long v38, v34, v6

    and-long v38, v38, v29

    cmp-long v14, v38, v17

    if-nez v14, :cond_9

    and-int/lit8 v13, v13, 0x7f

    int-to-long v13, v13

    move/from16 v27, v5

    move/from16 v38, v6

    shl-long v5, v29, v38

    not-long v5, v5

    and-long v5, v34, v5

    shl-long v13, v13, v38

    or-long/2addr v5, v13

    aput-wide v5, v3, v27

    aget-wide v5, v3, p1

    shl-long v13, v29, v10

    not-long v13, v13

    and-long/2addr v5, v13

    shl-long v13, v17, v10

    or-long/2addr v5, v13

    aput-wide v5, v3, p1

    aget-wide v5, v9, v7

    aput-wide v5, v9, v15

    aput-wide v36, v9, v7

    move v5, v7

    goto :goto_6

    :cond_9
    move/from16 v27, v5

    move/from16 v38, v6

    and-int/lit8 v5, v13, 0x7f

    int-to-long v5, v5

    shl-long v13, v29, v38

    not-long v13, v13

    and-long v13, v34, v13

    shl-long v5, v5, v38

    or-long/2addr v5, v13

    aput-wide v5, v3, v27

    aget-wide v5, v9, v15

    aget-wide v13, v9, v7

    aput-wide v13, v9, v15

    aput-wide v5, v9, v7

    add-int/lit8 v5, v7, -0x1

    :goto_6
    array-length v6, v3

    add-int/lit8 v6, v6, -0x1

    aget-wide v13, v3, v21

    and-long v13, v13, v22

    or-long v13, v13, v25

    aput-wide v13, v3, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_a
    move/from16 v33, v7

    iget v3, v4, La0/l0;->c:I

    invoke-static {v3}, La0/d1;->a(I)I

    move-result v3

    iget v5, v4, La0/l0;->d:I

    sub-int/2addr v3, v5

    iput v3, v4, La0/l0;->e:I

    :cond_b
    move/from16 v5, v32

    goto/16 :goto_b

    :cond_c
    move-wide/from16 v17, v15

    :goto_7
    move/from16 v32, v6

    move/from16 v33, v7

    goto :goto_8

    :cond_d
    const-wide/16 v17, 0x80

    goto :goto_7

    :goto_8
    iget v3, v4, La0/l0;->c:I

    invoke-static {v3}, La0/d1;->b(I)I

    move-result v3

    iget-object v5, v4, La0/l0;->a:[J

    iget-object v6, v4, La0/l0;->b:[J

    iget v7, v4, La0/l0;->c:I

    invoke-virtual {v4, v3}, La0/l0;->c(I)V

    iget-object v3, v4, La0/l0;->a:[J

    iget-object v8, v4, La0/l0;->b:[J

    iget v9, v4, La0/l0;->c:I

    move/from16 v10, v21

    :goto_9
    if-ge v10, v7, :cond_b

    shr-int/lit8 v13, v10, 0x3

    aget-wide v13, v5, v13

    and-int/lit8 v15, v10, 0x7

    shl-int/lit8 v15, v15, 0x3

    shr-long/2addr v13, v15

    and-long v13, v13, v29

    cmp-long v13, v13, v17

    if-gez v13, :cond_e

    aget-wide v13, v6, v10

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v15

    mul-int v15, v15, v31

    shl-int/lit8 v16, v15, 0x10

    xor-int v15, v15, v16

    move-object/from16 v16, v3

    ushr-int/lit8 v3, v15, 0x7

    invoke-virtual {v4, v3}, La0/l0;->b(I)I

    move-result v3

    and-int/lit8 v15, v15, 0x7f

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    int-to-long v5, v15

    shr-int/lit8 v15, v3, 0x3

    and-int/lit8 v22, v3, 0x7

    shl-int/lit8 v22, v22, 0x3

    aget-wide v25, v16, v15

    move-wide/from16 v34, v5

    shl-long v5, v29, v22

    not-long v5, v5

    and-long v5, v25, v5

    shl-long v22, v34, v22

    or-long v5, v5, v22

    aput-wide v5, v16, v15

    add-int/lit8 v15, v3, -0x7

    and-int/2addr v15, v9

    and-int/lit8 v22, v9, 0x7

    add-int v15, v15, v22

    shr-int/lit8 v15, v15, 0x3

    aput-wide v5, v16, v15

    aput-wide v13, v8, v3

    goto :goto_a

    :cond_e
    move-object/from16 v16, v3

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    :goto_a
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v3, v16

    move-object/from16 v5, v19

    move-object/from16 v6, v20

    goto :goto_9

    :goto_b
    invoke-virtual {v4, v5}, La0/l0;->b(I)I

    move-result v3

    :goto_c
    move/from16 v32, v3

    iget v3, v4, La0/l0;->d:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v4, La0/l0;->d:I

    iget v3, v4, La0/l0;->e:I

    iget-object v5, v4, La0/l0;->a:[J

    shr-int/lit8 v6, v32, 0x3

    aget-wide v7, v5, v6

    and-int/lit8 v9, v32, 0x7

    shl-int/lit8 v9, v9, 0x3

    shr-long v13, v7, v9

    and-long v13, v13, v29

    cmp-long v10, v13, v17

    if-nez v10, :cond_f

    move/from16 v21, v33

    :cond_f
    sub-int v3, v3, v21

    iput v3, v4, La0/l0;->e:I

    iget v3, v4, La0/l0;->c:I

    shl-long v13, v29, v9

    not-long v13, v13

    and-long/2addr v7, v13

    shl-long v9, v11, v9

    or-long/2addr v7, v9

    aput-wide v7, v5, v6

    add-int/lit8 v6, v32, -0x7

    and-int/2addr v6, v3

    and-int/lit8 v3, v3, 0x7

    add-int/2addr v6, v3

    shr-int/lit8 v3, v6, 0x3

    aput-wide v7, v5, v3

    :goto_d
    iget-object v3, v4, La0/l0;->b:[J

    aput-wide v1, v3, v32

    return v33

    :cond_10
    move/from16 v16, v5

    move v5, v6

    move/from16 v33, v7

    add-int/lit8 v27, v27, 0x8

    add-int v26, v26, v27

    and-int v26, v26, v8

    move/from16 v5, v16

    move/from16 v10, v31

    move-wide/from16 v15, v36

    goto/16 :goto_0

    :cond_11
    move/from16 v24, v6

    move/from16 v31, v10

    move-wide/from16 v36, v15

    const/16 v25, 0x3f

    const/16 v28, 0x7

    const-wide/16 v29, 0xff

    const-wide v34, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    move/from16 v16, v5

    invoke-static {v3, v7}, Ls2/d;->j(II)Z

    move-result v3

    if-eqz v3, :cond_17

    iget-object v3, v0, Lg2/l;->f:La0/l0;

    if-eqz v3, :cond_16

    invoke-virtual {v3, v1, v2}, La0/l0;->a(J)Z

    move-result v3

    if-ne v3, v7, :cond_16

    iget-object v3, v0, Lg2/l;->f:La0/l0;

    if-eqz v3, :cond_14

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    mul-int v4, v4, v31

    shl-int/lit8 v5, v4, 0x10

    xor-int/2addr v4, v5

    and-int/lit8 v5, v4, 0x7f

    iget v6, v3, La0/l0;->c:I

    ushr-int/lit8 v4, v4, 0x7

    :goto_e
    and-int/2addr v4, v6

    iget-object v7, v3, La0/l0;->a:[J

    shr-int/lit8 v8, v4, 0x3

    and-int/lit8 v9, v4, 0x7

    shl-int/lit8 v9, v9, 0x3

    aget-wide v10, v7, v8

    ushr-long/2addr v10, v9

    const/16 v33, 0x1

    add-int/lit8 v8, v8, 0x1

    aget-wide v7, v7, v8

    rsub-int/lit8 v12, v9, 0x40

    shl-long/2addr v7, v12

    int-to-long v12, v9

    neg-long v12, v12

    shr-long v12, v12, v25

    and-long/2addr v7, v12

    or-long/2addr v7, v10

    int-to-long v9, v5

    mul-long v9, v9, v17

    xor-long/2addr v9, v7

    sub-long v11, v9, v17

    not-long v9, v9

    and-long/2addr v9, v11

    and-long v9, v9, v34

    :goto_f
    cmp-long v11, v9, v36

    if-eqz v11, :cond_13

    invoke-static {v9, v10}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v11

    shr-int/lit8 v11, v11, 0x3

    add-int/2addr v11, v4

    and-int/2addr v11, v6

    iget-object v12, v3, La0/l0;->b:[J

    aget-wide v12, v12, v11

    cmp-long v12, v12, v1

    if-nez v12, :cond_12

    goto :goto_10

    :cond_12
    sub-long v11, v9, v22

    and-long/2addr v9, v11

    goto :goto_f

    :cond_13
    not-long v9, v7

    shl-long v9, v9, p1

    and-long/2addr v7, v9

    and-long v7, v7, v34

    cmp-long v7, v7, v36

    if-eqz v7, :cond_15

    const/4 v11, -0x1

    :goto_10
    if-ltz v11, :cond_14

    iget v1, v3, La0/l0;->d:I

    const/16 v33, 0x1

    add-int/lit8 v1, v1, -0x1

    iput v1, v3, La0/l0;->d:I

    iget-object v1, v3, La0/l0;->a:[J

    iget v2, v3, La0/l0;->c:I

    shr-int/lit8 v3, v11, 0x3

    and-int/lit8 v4, v11, 0x7

    shl-int/lit8 v4, v4, 0x3

    aget-wide v5, v1, v3

    shl-long v7, v29, v4

    not-long v7, v7

    and-long/2addr v5, v7

    shl-long v7, v19, v4

    or-long v4, v5, v7

    aput-wide v4, v1, v3

    add-int/lit8 v11, v11, -0x7

    and-int v3, v11, v2

    and-int/lit8 v2, v2, 0x7

    add-int/2addr v3, v2

    shr-int/lit8 v2, v3, 0x3

    aput-wide v4, v1, v2

    const/16 v33, 0x1

    return v33

    :cond_14
    const/16 v33, 0x1

    goto :goto_11

    :cond_15
    const/16 v33, 0x1

    add-int/lit8 v21, v21, 0x8

    add-int v4, v4, v21

    goto/16 :goto_e

    :cond_16
    return v21

    :cond_17
    move/from16 v33, v7

    :goto_11
    return v33
.end method
