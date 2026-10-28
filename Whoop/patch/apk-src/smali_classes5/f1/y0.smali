.class public abstract Lf1/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh2/c;

.field public static b:Li2/g;

.field public static c:Li2/c;

.field public static d:Lk2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh2/c;

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    const/high16 v2, -0x800000    # Float.NEGATIVE_INFINITY

    invoke-direct {v0, v1, v1, v2, v2}, Lh2/c;-><init>(FFFF)V

    sput-object v0, Lf1/y0;->a:Lh2/c;

    return-void
.end method

.method public static final a(Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 2

    check-cast p1, Lp1/q;

    const v0, -0x454c691d

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    invoke-virtual {p1, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lf1/c1;->a:Lp1/b0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {v0, p0, p1, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v0, Lf1/z;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, v1}, Lf1/z;-><init>(Lx1/b;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method public static final b(Lf1/m;Lb2/h;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, -0x40fab302

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v3, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v5, v4, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_4

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :cond_4
    and-int/lit16 v5, v4, 0x180

    move-object/from16 v8, p2

    if-nez v5, :cond_6

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_4

    :cond_5
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v0, v5

    :cond_6
    and-int/lit16 v5, v0, 0x93

    const/16 v7, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v5, v7, :cond_7

    move v5, v11

    goto :goto_5

    :cond_7
    move v5, v10

    :goto_5
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v9, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_d

    and-int/lit8 v5, v0, 0x70

    if-ne v5, v6, :cond_8

    move v5, v11

    goto :goto_6

    :cond_8
    move v5, v10

    :goto_6
    and-int/lit8 v6, v0, 0xe

    if-eq v6, v3, :cond_9

    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_a

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    :cond_9
    move v10, v11

    :cond_a
    or-int v3, v5, v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_b

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v5, v3, :cond_c

    :cond_b
    new-instance v5, Lf1/i;

    invoke-direct {v5, v2, v1}, Lf1/i;-><init>(Lb2/h;Lf1/m;)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v5, Lf1/i;

    new-instance v7, Lc4/j0;

    sget-object v14, Lc4/k0;->w:Lc4/k0;

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x1

    move-object v10, v7

    invoke-direct/range {v10 .. v15}, Lc4/j0;-><init>(ZZZLc4/k0;Z)V

    shl-int/lit8 v0, v0, 0x3

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit16 v10, v0, 0x180

    const/4 v11, 0x2

    const/4 v6, 0x0

    invoke-static/range {v5 .. v11}, Lc4/r;->a(Lc4/i0;Lc93/a;Lc4/j0;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_d
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lcy1/b;

    const/16 v5, 0xc

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v5}, Lcy1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lf1/u;Lkotlin/jvm/functions/Function1;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v6, -0x36b68b90    # -825159.0f

    invoke-virtual {v0, v6}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v6, v5, 0x6

    const/4 v7, 0x2

    if-nez v6, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    move v6, v7

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_1
    move v6, v5

    :goto_1
    and-int/lit8 v9, v5, 0x30

    if-nez v9, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v6, v9

    :cond_3
    and-int/lit16 v9, v5, 0x180

    if-nez v9, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_3

    :cond_4
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v6, v9

    :cond_5
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_7

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x800

    goto :goto_4

    :cond_6
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v6, v9

    :cond_7
    and-int/lit16 v9, v6, 0x493

    const/16 v10, 0x492

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v9, v10, :cond_8

    move v9, v12

    goto :goto_5

    :cond_8
    move v9, v11

    :goto_5
    and-int/2addr v6, v12

    invoke-virtual {v0, v6, v9}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_12

    new-array v6, v11, [Ljava/lang/Object;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v9, v10, :cond_9

    new-instance v9, Lej1/a;

    const/16 v13, 0x1d

    invoke-direct {v9, v13}, Lej1/a;-><init>(I)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v9, Lc93/a;

    sget-object v13, Lf1/b1;->l:Lp0/n0;

    const/16 v14, 0x180

    invoke-static {v6, v13, v9, v0, v14}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf1/b1;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v10, :cond_a

    new-instance v9, Lf1/w0;

    invoke-direct {v9, v6}, Lf1/w0;-><init>(Lf1/b1;)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v9, Lf1/w0;

    sget-object v13, Lb3/v1;->f:Lp1/u2;

    invoke-virtual {v0, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lb3/r1;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v10, :cond_b

    invoke-static {v0}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v14

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v14, Lbc3/c0;

    sget-object v15, Lb3/v1;->l:Lp1/u2;

    invoke-virtual {v0, v15}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lq2/a;

    iput-object v15, v9, Lf1/w0;->e:Lq2/a;

    invoke-virtual {v0, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    invoke-virtual {v0, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v15, v15, v16

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v15, :cond_c

    if-ne v8, v10, :cond_d

    :cond_c
    new-instance v8, Lcom/whoop/profile/view/edit/n;

    const/16 v15, 0x1b

    invoke-direct {v8, v15, v14, v13}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v8, Lkotlin/jvm/functions/Function1;

    iput-object v8, v9, Lf1/w0;->f:Lkotlin/jvm/functions/Function1;

    sget-object v8, Lb3/v1;->q:Lp1/u2;

    invoke-virtual {v0, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lb3/z2;

    new-instance v8, Lcom/whoop/profile/view/edit/n;

    const/16 v13, 0x1c

    invoke-direct {v8, v13, v9, v3}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v8, v9, Lf1/w0;->d:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, v2}, Lf1/w0;->m(Lf1/u;)V

    const v8, -0x4e7e5c4

    invoke-virtual {v0, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lf1/s;->x:Lf1/s;

    const/4 v13, 0x0

    const/16 v15, 0x36

    invoke-static {v8, v13, v0, v15}, Lf1/q;->b(Lf1/s;Ls3/b;Landroidx/compose/runtime/Composer;I)Lf1/p;

    move-result-object v8

    iput-object v8, v9, Lf1/w0;->w:Lf1/p;

    iput-object v14, v9, Lf1/w0;->v:Lbc3/c0;

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    new-instance v8, Lf1/d0;

    invoke-direct {v8, v9, v7}, Lf1/d0;-><init>(Lf1/w0;I)V

    new-instance v7, Lf1/k0;

    invoke-direct {v7, v12, v9, v8}, Lf1/k0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object v8, Lb2/t;->w:Lb2/t;

    sget-object v14, Ll83/a0;->a:Ll83/a0;

    invoke-static {v8, v14, v7}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v14, Lf1/c0;

    const/4 v15, 0x4

    invoke-direct {v14, v9, v15}, Lf1/c0;-><init>(Lf1/w0;I)V

    invoke-static {v7, v14}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    iget-object v14, v9, Lf1/w0;->h:Lg2/s;

    invoke-static {v7, v14}, Landroidx/compose/ui/focus/a;->b(Landroidx/compose/ui/Modifier;Lg2/s;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v14, Lf1/c0;

    const/4 v15, 0x5

    invoke-direct {v14, v9, v15}, Lf1/c0;-><init>(Lf1/w0;I)V

    invoke-static {v7, v14}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7, v12, v13}, Landroidx/compose/foundation/c;->a(Landroidx/compose/ui/Modifier;ZLj0/i;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v13, Lf1/c0;

    const/4 v14, 0x6

    invoke-direct {v13, v9, v14}, Lf1/c0;-><init>(Lf1/w0;I)V

    const v14, 0x845fed

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, La1/f;

    const/4 v12, 0x3

    invoke-direct {v15, v13, v12}, La1/f;-><init>(Ljava/lang/Object;I)V

    invoke-static {v7, v14, v15}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v13, Ls;

    invoke-direct {v13, v9, v12}, Ls;-><init>(Ljava/lang/Object;I)V

    invoke-static {v7, v13}, Landroidx/compose/ui/input/key/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v9}, Lf1/w0;->f()Lu0/f0;

    move-result-object v12

    if-eqz v12, :cond_f

    invoke-virtual {v9}, Lf1/w0;->h()Z

    move-result v12

    if-eqz v12, :cond_f

    invoke-virtual {v9}, Lf1/w0;->g()Lf1/u;

    move-result-object v12

    if-nez v12, :cond_e

    const/4 v12, 0x1

    goto :goto_6

    :cond_e
    iget-object v13, v12, Lf1/u;->a:Lf1/t;

    iget-object v12, v12, Lf1/u;->b:Lf1/t;

    invoke-static {v13, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    :goto_6
    if-nez v12, :cond_f

    sget-object v12, Lf0/y0;->a:Li3/y;

    new-instance v12, Lb30/o4;

    const/4 v15, 0x4

    invoke-direct {v12, v9, v15}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    invoke-static {v8, v12}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    :cond_f
    invoke-interface {v7, v8}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v8, Lej1/h;

    const/16 v12, 0xb

    invoke-direct {v8, v9, v12}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    invoke-static {v7, v8}, Landroidx/compose/foundation/text/contextmenu/modifier/a;->a(Landroidx/compose/ui/Modifier;Lc93/m;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-interface {v1, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v8, Lf1/f0;

    invoke-direct {v8, v9, v6, v4}, Lf1/f0;-><init>(Lf1/w0;Lf1/b1;Lx1/b;)V

    const v6, -0x6b43299a

    invoke-static {v6, v0, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const/16 v8, 0x30

    invoke-static {v7, v6, v0, v8}, Lf1/y0;->g(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_10

    if-ne v7, v10, :cond_11

    :cond_10
    new-instance v7, Lf1/c0;

    invoke-direct {v7, v9, v11}, Lf1/c0;-><init>(Lf1/w0;I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v7, v0}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    goto :goto_7

    :cond_12
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_13

    new-instance v0, Lf01/h1;

    invoke-direct/range {v0 .. v5}, Lf01/h1;-><init>(Landroidx/compose/ui/Modifier;Lf1/u;Lkotlin/jvm/functions/Function1;Lx1/b;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, 0x742e8cdd

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    or-int/lit8 p2, p3, 0x6

    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    invoke-virtual {v4, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p0, p2, :cond_1

    const/4 p0, 0x0

    invoke-static {p0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p0

    invoke-virtual {v4, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p0, Lp1/c1;

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lf1/u;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p2, :cond_2

    new-instance v0, Lf1/a0;

    const/4 p2, 0x0

    invoke-direct {v0, p2, p0}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/16 v5, 0xd86

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Lf1/y0;->c(Landroidx/compose/ui/Modifier;Lf1/u;Lkotlin/jvm/functions/Function1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    move-object p0, v0

    goto :goto_1

    :cond_3
    move-object v3, p1

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance p2, Lf1/b0;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v3, p3, v0}, Lf1/b0;-><init>(Landroidx/compose/ui/Modifier;Lx1/b;II)V

    iput-object p2, p1, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public static final e(Lf1/m;ZLw3/j;ZJFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v6, p0

    move/from16 v7, p1

    move-object/from16 v8, p2

    move/from16 v9, p3

    move-object/from16 v10, p7

    move/from16 v11, p9

    move-object/from16 v12, p8

    check-cast v12, Lp1/q;

    const v0, -0x1bcadee8

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v11, 0x6

    const/4 v1, 0x2

    const/4 v2, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, v11, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    or-int/2addr v0, v11

    goto :goto_2

    :cond_2
    move v0, v11

    :goto_2
    and-int/lit8 v3, v11, 0x30

    const/16 v4, 0x20

    if-nez v3, :cond_4

    invoke-virtual {v12, v7}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_3

    move v3, v4

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v0, v3

    :cond_4
    and-int/lit16 v3, v11, 0x180

    if-nez v3, :cond_6

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-virtual {v12, v3}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_5

    const/16 v3, 0x100

    goto :goto_4

    :cond_5
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v0, v3

    :cond_6
    and-int/lit16 v3, v11, 0xc00

    if-nez v3, :cond_8

    invoke-virtual {v12, v9}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 v3, 0x800

    goto :goto_5

    :cond_7
    const/16 v3, 0x400

    :goto_5
    or-int/2addr v0, v3

    :cond_8
    and-int/lit16 v3, v11, 0x6000

    if-nez v3, :cond_9

    or-int/lit16 v0, v0, 0x2000

    :cond_9
    const/high16 v3, 0x180000

    and-int/2addr v3, v11

    if-nez v3, :cond_b

    invoke-virtual {v12, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    const/high16 v3, 0x100000

    goto :goto_6

    :cond_a
    const/high16 v3, 0x80000

    :goto_6
    or-int/2addr v0, v3

    :cond_b
    const v3, 0x82493

    and-int/2addr v3, v0

    const v5, 0x82492

    const/4 v13, 0x0

    if-eq v3, v5, :cond_c

    const/4 v3, 0x1

    goto :goto_7

    :cond_c
    move v3, v13

    :goto_7
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v12, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v3, v11, 0x1

    const v5, -0xe001

    if-eqz v3, :cond_e

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_d

    goto :goto_8

    :cond_d
    invoke-virtual {v12}, Lp1/q;->X()V

    and-int/2addr v0, v5

    move-wide/from16 v15, p4

    goto :goto_9

    :cond_e
    :goto_8
    and-int/2addr v0, v5

    const-wide v15, 0x7fc000007fc00000L    # 2.247117487993712E307

    :goto_9
    invoke-virtual {v12}, Lp1/q;->r()V

    if-eqz v7, :cond_10

    sget v3, Lf1/p0;->a:F

    sget-object v3, Lw3/j;->w:Lw3/j;

    if-ne v8, v3, :cond_f

    if-eqz v9, :cond_14

    :cond_f
    sget-object v3, Lw3/j;->x:Lw3/j;

    if-ne v8, v3, :cond_15

    if-eqz v9, :cond_15

    goto :goto_b

    :cond_10
    sget v3, Lf1/p0;->a:F

    sget-object v3, Lw3/j;->w:Lw3/j;

    if-ne v8, v3, :cond_11

    if-eqz v9, :cond_12

    :cond_11
    sget-object v3, Lw3/j;->x:Lw3/j;

    if-ne v8, v3, :cond_13

    if-eqz v9, :cond_13

    :cond_12
    const/4 v3, 0x1

    goto :goto_a

    :cond_13
    move v3, v13

    :goto_a
    if-nez v3, :cond_15

    :cond_14
    :goto_b
    const/4 v3, 0x1

    goto :goto_c

    :cond_15
    move v3, v13

    :goto_c
    if-eqz v3, :cond_16

    sget-object v5, Lb2/a;->b:Lb2/j;

    goto :goto_d

    :cond_16
    sget-object v5, Lb2/a;->a:Lb2/j;

    :goto_d
    and-int/lit8 v14, v0, 0xe

    if-eq v14, v2, :cond_18

    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_17

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    goto :goto_e

    :cond_17
    move v2, v13

    goto :goto_f

    :cond_18
    :goto_e
    const/4 v2, 0x1

    :goto_f
    and-int/lit8 v0, v0, 0x70

    if-ne v0, v4, :cond_19

    const/4 v0, 0x1

    goto :goto_10

    :cond_19
    move v0, v13

    :goto_10
    or-int/2addr v0, v2

    invoke-virtual {v12, v3}, Lp1/q;->h(Z)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1a

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_1b

    :cond_1a
    new-instance v2, Las1/g;

    invoke-direct {v2, v7, v3, v1, v6}, Las1/g;-><init>(ZZILjava/lang/Object;)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v10, v13, v2}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb3/v1;->s:Lp1/u2;

    invoke-virtual {v12, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb3/j3;

    move-object v2, v5

    move-object v5, v0

    new-instance v0, Lf1/d;

    move-object v13, v2

    move v4, v3

    move-wide v2, v15

    invoke-direct/range {v0 .. v6}, Lf1/d;-><init>(Lb3/j3;JZLandroidx/compose/ui/Modifier;Lf1/m;)V

    const v1, 0x515e2041

    invoke-static {v1, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    or-int/lit16 v1, v14, 0x180

    invoke-static {v6, v13, v0, v12, v1}, Lf1/y0;->b(Lf1/m;Lb2/h;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_11

    :cond_1c
    invoke-virtual {v12}, Lp1/q;->X()V

    move-wide/from16 v2, p4

    :goto_11
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_1d

    new-instance v0, Lf1/a;

    move-object v1, v6

    move v4, v9

    move v9, v11

    move-wide v5, v2

    move v2, v7

    move-object v3, v8

    move-object v8, v10

    move/from16 v7, p6

    invoke-direct/range {v0 .. v9}, Lf1/a;-><init>(Lf1/m;ZLw3/j;ZJFLandroidx/compose/ui/Modifier;I)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lc93/a;ZLandroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p3, Lp1/q;

    const v0, 0x7ddd909a

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    invoke-virtual {p3, p2}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x100

    goto :goto_3

    :cond_3
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x93

    const/16 v2, 0x92

    const/4 v3, 0x1

    if-eq v1, v2, :cond_4

    move v1, v3

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    :goto_4
    and-int/2addr v0, v3

    invoke-virtual {p3, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    sget v0, Lf1/p0;->a:F

    sget v1, Lf1/p0;->b:F

    invoke-static {p0, v0, v1}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v1, Lb30/i;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p1, p2}, Lb30/i;-><init>(ILc93/a;Z)V

    invoke-static {v0, v1}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {p3, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    goto :goto_5

    :cond_5
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_6

    new-instance v0, Lar2/f;

    const/16 v5, 0xc

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lar2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZII)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    check-cast p2, Lp1/q;

    const v0, -0x6e8e8303

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    and-int/2addr v0, v3

    invoke-virtual {p2, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_2

    sget-object v0, Lf1/d1;->a:Lf1/d1;

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Ly2/r0;

    iget-wide v1, p2, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {p2, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p2}, Lp1/q;->i0()V

    iget-boolean v6, p2, Lp1/q;->S:Z

    if-eqz v6, :cond_3

    invoke-virtual {p2, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p2}, Lp1/q;->s0()V

    :goto_2
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p2, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p2, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v2, p2, Lp1/q;->S:Z

    if-nez v2, :cond_4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :cond_4
    invoke-static {v1, p2, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p2, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x6

    invoke-static {v0, p1, p2, v3}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    goto :goto_3

    :cond_6
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Lf1/b0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lf1/b0;-><init>(Landroidx/compose/ui/Modifier;Lx1/b;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final h(ZLw3/j;Lf1/s1;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move/from16 v10, p4

    move-object v8, p3

    check-cast v8, Lp1/q;

    const v0, -0x50245748

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v10, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v8, p0}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v10

    goto :goto_1

    :cond_1
    move v0, v10

    :goto_1
    and-int/lit8 v3, v10, 0x30

    const/16 v4, 0x20

    if-nez v3, :cond_3

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-virtual {v8, v3}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v10, 0x180

    if-nez v3, :cond_5

    invoke-virtual {v8, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v0, v3

    :cond_5
    and-int/lit16 v3, v0, 0x93

    const/16 v5, 0x92

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v3, v5, :cond_6

    move v3, v7

    goto :goto_4

    :cond_6
    move v3, v6

    :goto_4
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v8, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_11

    and-int/lit8 v3, v0, 0xe

    if-ne v3, v2, :cond_7

    move v5, v7

    goto :goto_5

    :cond_7
    move v5, v6

    :goto_5
    invoke-virtual {v8, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v5, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_8

    if-ne v9, v11, :cond_9

    :cond_8
    new-instance v9, Lf1/n1;

    invoke-direct {v9, p2, p0}, Lf1/n1;-><init>(Lf1/s1;Z)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v9, Lu0/d1;

    invoke-virtual {v8, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-ne v3, v2, :cond_a

    move v6, v7

    :cond_a
    or-int v2, v5, v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_b

    if-ne v3, v11, :cond_c

    :cond_b
    new-instance v3, Lf1/t1;

    invoke-direct {v3, p2, p0}, Lf1/t1;-><init>(Lf1/s1;Z)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v3, Lf1/m;

    invoke-virtual {p2}, Lf1/s1;->m()Lq3/y;

    move-result-object v2

    iget-wide v5, v2, Lq3/y;->b:J

    invoke-static {v5, v6}, Ll3/u0;->g(J)Z

    move-result v2

    if-eqz p0, :cond_d

    invoke-virtual {p2}, Lf1/s1;->m()Lq3/y;

    move-result-object v5

    iget-wide v5, v5, Lq3/y;->b:J

    shr-long v4, v5, v4

    :goto_6
    long-to-int v4, v4

    goto :goto_7

    :cond_d
    invoke-virtual {p2}, Lf1/s1;->m()Lq3/y;

    move-result-object v4

    iget-wide v4, v4, Lq3/y;->b:J

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    goto :goto_6

    :goto_7
    iget-object v5, p2, Lf1/s1;->d:Lu0/s0;

    if-eqz v5, :cond_e

    invoke-virtual {v5}, Lu0/s0;->d()Lu0/p1;

    move-result-object v5

    if-eqz v5, :cond_e

    iget-object v5, v5, Lu0/p1;->a:Ll3/r0;

    invoke-static {v5, v4}, Lu0/n0;->r(Ll3/r0;I)F

    move-result v4

    :goto_8
    move v6, v4

    goto :goto_9

    :cond_e
    const/4 v4, 0x0

    goto :goto_8

    :goto_9
    invoke-virtual {v8, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_f

    if-ne v5, v11, :cond_10

    :cond_f
    new-instance v5, Lf1/e0;

    const/4 v4, 0x1

    invoke-direct {v5, v9, v4}, Lf1/e0;-><init>(Lu0/d1;I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v5, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v9, v5}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    shl-int/lit8 v0, v0, 0x3

    and-int/lit16 v9, v0, 0x3f0

    const-wide/16 v4, 0x0

    move v1, p0

    move-object v0, v3

    move v3, v2

    move-object v2, p1

    invoke-static/range {v0 .. v9}, Lf1/y0;->e(Lf1/m;ZLw3/j;ZJFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_a

    :cond_11
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_12

    new-instance v0, Lar2/f;

    const/16 v5, 0xd

    move v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, v10

    invoke-direct/range {v0 .. v5}, Lar2/f;-><init>(ZLjava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static final i(Lf1/q0;Lf1/f;)Lf1/u;
    .locals 6

    invoke-interface {p0}, Lf1/q0;->e()Lf1/g;

    move-result-object v0

    sget-object v1, Lf1/g;->w:Lf1/g;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    new-instance v1, Lf1/u;

    invoke-interface {p0}, Lf1/q0;->k()Lf1/r;

    move-result-object v4

    invoke-interface {p0}, Lf1/q0;->l()I

    move-result v5

    invoke-static {v4, v0, v3, v5, p1}, Lf1/y0;->n(Lf1/r;ZZILf1/f;)Lf1/t;

    move-result-object v3

    invoke-interface {p0}, Lf1/q0;->j()Lf1/r;

    move-result-object v4

    invoke-interface {p0}, Lf1/q0;->d()I

    move-result p0

    invoke-static {v4, v0, v2, p0, p1}, Lf1/y0;->n(Lf1/r;ZZILf1/f;)Lf1/t;

    move-result-object p0

    invoke-direct {v1, v3, p0, v0}, Lf1/u;-><init>(Lf1/t;Lf1/t;Z)V

    return-object v1
.end method

.method public static final j(Lu2/b;Ls83/a;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lf1/i0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf1/i0;

    iget v1, v0, Lf1/i0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf1/i0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf1/i0;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lf1/i0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf1/i0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lf1/i0;->w:Lu2/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_1
    sget-object p1, Lu2/l;->x:Lu2/l;

    iput-object p0, v0, Lf1/i0;->w:Lu2/b;

    iput v3, v0, Lf1/i0;->y:I

    check-cast p0, Lu2/g0;

    invoke-virtual {p0, p1, v0}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    check-cast p1, Lu2/k;

    iget-object v2, p1, Lu2/k;->a:Ljava/lang/Object;

    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v4, :cond_5

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu2/r;

    invoke-static {v6}, Lu2/d0;->c(Lu2/r;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_1

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_5
    return-object p1
.end method

.method public static final k(Lu2/b;Lf1/j;Lab/h0;Lu2/k;Ls83/a;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    sget-object v5, Lf1/w;->d:Lf1/v;

    instance-of v6, v4, Lf1/j0;

    if-eqz v6, :cond_0

    move-object v6, v4

    check-cast v6, Lf1/j0;

    iget v7, v6, Lf1/j0;->E:I

    const/high16 v8, -0x80000000

    and-int v9, v7, v8

    if-eqz v9, :cond_0

    sub-int/2addr v7, v8

    iput v7, v6, Lf1/j0;->E:I

    goto :goto_0

    :cond_0
    new-instance v6, Lf1/j0;

    invoke-direct {v6, v4}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v4, v6, Lf1/j0;->z:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v8, v6, Lf1/j0;->E:I

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eqz v8, :cond_5

    if-eq v8, v11, :cond_2

    if-ne v8, v9, :cond_1

    iget-object v0, v6, Lf1/j0;->y:Lkotlin/jvm/internal/b0;

    iget-object v1, v6, Lf1/j0;->x:Lf1/j;

    iget-object v2, v6, Lf1/j0;->w:Lu2/b;

    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v15, v2

    move-object v2, v0

    move-object v0, v15

    move v15, v10

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v6, Lf1/j0;->x:Lf1/j;

    iget-object v1, v6, Lf1/j0;->w:Lu2/b;

    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4

    check-cast v1, Lu2/g0;

    iget-object v1, v1, Lu2/g0;->F:Lu2/h0;

    iget-object v1, v1, Lu2/h0;->T:Lu2/k;

    iget-object v1, v1, Lu2/k;->a:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    :goto_1
    if-ge v10, v2, :cond_4

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu2/r;

    invoke-static {v3}, Lu2/d0;->d(Lu2/r;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Lu2/r;->a()V

    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_4
    invoke-interface {v0}, Lf1/j;->g()V

    goto/16 :goto_6

    :cond_5
    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, v2, Lab/h0;->y:Ljava/lang/Object;

    check-cast v4, Lb3/j3;

    iget-object v8, v2, Lab/h0;->z:Ljava/lang/Object;

    check-cast v8, Lu2/r;

    iget-object v12, v3, Lu2/k;->a:Ljava/lang/Object;

    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lu2/r;

    if-eqz v8, :cond_6

    iget-wide v13, v12, Lu2/r;->b:J

    iget-wide v9, v8, Lu2/r;->b:J

    sub-long/2addr v13, v9

    invoke-interface {v4}, Lb3/j3;->a()J

    move-result-wide v9

    cmp-long v9, v13, v9

    if-gez v9, :cond_6

    iget v9, v8, Lu2/r;->i:I

    invoke-static {v4, v9}, Lh0/z0;->m(Lb3/j3;I)F

    move-result v4

    iget-wide v8, v8, Lu2/r;->c:J

    iget-wide v13, v12, Lu2/r;->c:J

    invoke-static {v8, v9, v13, v14}, Lh2/b;->g(JJ)J

    move-result-wide v8

    invoke-static {v8, v9}, Lh2/b;->d(J)F

    move-result v8

    cmpg-float v4, v8, v4

    if-gez v4, :cond_6

    iget v4, v2, Lab/h0;->x:I

    add-int/2addr v4, v11

    iput v4, v2, Lab/h0;->x:I

    goto :goto_2

    :cond_6
    iput v11, v2, Lab/h0;->x:I

    :goto_2
    iput-object v12, v2, Lab/h0;->z:Ljava/lang/Object;

    iget-object v3, v3, Lu2/k;->a:Ljava/lang/Object;

    const/4 v15, 0x0

    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu2/r;

    iget v2, v2, Lab/h0;->x:I

    if-eq v2, v11, :cond_8

    const/4 v4, 0x2

    if-eq v2, v4, :cond_7

    sget-object v4, Lf1/w;->f:Lf1/v;

    goto :goto_3

    :cond_7
    sget-object v4, Lf1/w;->e:Lf1/v;

    goto :goto_3

    :cond_8
    move-object v4, v5

    :goto_3
    iget-wide v8, v3, Lu2/r;->c:J

    invoke-interface {v1, v8, v9, v4, v2}, Lf1/j;->b(JLf1/v;I)Z

    move-result v2

    if-eqz v2, :cond_c

    new-instance v2, Lkotlin/jvm/internal/b0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    xor-int/2addr v5, v11

    iput-boolean v5, v2, Lkotlin/jvm/internal/b0;->w:Z

    iget-wide v8, v3, Lu2/r;->a:J

    new-instance v3, Lep1/g;

    const/4 v5, 0x5

    invoke-direct {v3, v1, v4, v2, v5}, Lep1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v0, v6, Lf1/j0;->w:Lu2/b;

    iput-object v1, v6, Lf1/j0;->x:Lf1/j;

    iput-object v2, v6, Lf1/j0;->y:Lkotlin/jvm/internal/b0;

    const/4 v4, 0x2

    iput v4, v6, Lf1/j0;->E:I

    invoke-static {v0, v8, v9, v3, v6}, Lh0/z0;->j(Lu2/b;JLkotlin/jvm/functions/Function1;Ls83/a;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_9

    return-object v7

    :cond_9
    :goto_4
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_b

    iget-boolean v2, v2, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz v2, :cond_b

    check-cast v0, Lu2/g0;

    iget-object v0, v0, Lu2/g0;->F:Lu2/h0;

    iget-object v0, v0, Lu2/h0;->T:Lu2/k;

    iget-object v0, v0, Lu2/k;->a:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    move v10, v15

    :goto_5
    if-ge v10, v2, :cond_b

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu2/r;

    invoke-static {v3}, Lu2/d0;->d(Lu2/r;)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v3}, Lu2/r;->a()V

    :cond_a
    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    :cond_b
    invoke-interface {v1}, Lf1/j;->g()V

    :cond_c
    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static final l(Lu2/b;Lu0/d1;Lu2/k;Ls83/a;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p3, Lf1/l0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lf1/l0;

    iget v1, v0, Lf1/l0;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf1/l0;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf1/l0;

    invoke-direct {v0, p3}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lf1/l0;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf1/l0;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lf1/l0;->x:Lu0/d1;

    iget-object p0, v0, Lf1/l0;->w:Lu2/b;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    :catch_0
    move-exception p0

    goto/16 :goto_7

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lf1/l0;->y:Lu2/r;

    iget-object p1, v0, Lf1/l0;->x:Lu0/d1;

    iget-object p2, v0, Lf1/l0;->w:Lu2/b;

    :try_start_1
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v10, p2

    move-object p2, p0

    move-object p0, v10

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p2, p2, Lu2/k;->a:Ljava/lang/Object;

    invoke-static {p2}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lu2/r;

    iget-wide v6, p2, Lu2/r;->a:J

    iput-object p0, v0, Lf1/l0;->w:Lu2/b;

    iput-object p1, v0, Lf1/l0;->x:Lu0/d1;

    iput-object p2, v0, Lf1/l0;->y:Lu2/r;

    iput v5, v0, Lf1/l0;->E:I

    invoke-static {p0, v6, v7, v0}, Lh0/z0;->d(Lu2/b;JLs83/a;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p3, Lu2/r;

    if-eqz p3, :cond_a

    iget-wide v6, p3, Lu2/r;->c:J

    check-cast p0, Lu2/g0;

    invoke-virtual {p0}, Lu2/g0;->f()Lb3/j3;

    move-result-object v2

    iget v8, p2, Lu2/r;->i:I

    invoke-static {v2, v8}, Lh0/z0;->m(Lb3/j3;I)F

    move-result v2

    iget-wide v8, p2, Lu2/r;->c:J

    invoke-static {v8, v9, v6, v7}, Lh2/b;->g(JJ)J

    move-result-wide v8

    invoke-static {v8, v9}, Lh2/b;->d(J)F

    move-result p2

    cmpg-float p2, p2, v2

    if-gez p2, :cond_5

    goto :goto_2

    :cond_5
    move v5, v3

    :goto_2
    if-eqz v5, :cond_a

    invoke-interface {p1, v6, v7}, Lu0/d1;->b(J)V

    iget-wide p2, p3, Lu2/r;->a:J

    new-instance v2, Lf1/h0;

    const/4 v5, 0x0

    invoke-direct {v2, p1, v5}, Lf1/h0;-><init>(Lu0/d1;I)V

    iput-object p0, v0, Lf1/l0;->w:Lu2/b;

    iput-object p1, v0, Lf1/l0;->x:Lu0/d1;

    const/4 v5, 0x0

    iput-object v5, v0, Lf1/l0;->y:Lu2/r;

    iput v4, v0, Lf1/l0;->E:I

    invoke-static {p0, p2, p3, v2, v0}, Lh0/z0;->j(Lu2/b;JLkotlin/jvm/functions/Function1;Ls83/a;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    :goto_4
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_9

    check-cast p0, Lu2/g0;

    iget-object p0, p0, Lu2/g0;->F:Lu2/h0;

    iget-object p0, p0, Lu2/h0;->T:Lu2/k;

    iget-object p0, p0, Lu2/k;->a:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    :goto_5
    if-ge v3, p2, :cond_8

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lu2/r;

    invoke-static {p3}, Lu2/d0;->d(Lu2/r;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p3}, Lu2/r;->a()V

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_8
    invoke-interface {p1}, Lu0/d1;->onStop()V

    goto :goto_6

    :cond_9
    invoke-interface {p1}, Lu0/d1;->onCancel()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_a
    :goto_6
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :goto_7
    invoke-interface {p1}, Lu0/d1;->onCancel()V

    throw p0
.end method

.method public static final m(Lf1/q0;Lf1/r;Lf1/t;)Lf1/t;
    .locals 12

    invoke-interface {p0}, Lf1/q0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p1, Lf1/r;->c:I

    :goto_0
    move v3, v0

    goto :goto_1

    :cond_0
    iget v0, p1, Lf1/r;->d:I

    goto :goto_0

    :goto_1
    invoke-interface {p0}, Lf1/q0;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lf1/q0;->l()I

    move-result v0

    goto :goto_2

    :cond_1
    invoke-interface {p0}, Lf1/q0;->d()I

    move-result v0

    :goto_2
    iget v1, p1, Lf1/r;->b:I

    iget-object v7, p1, Lf1/r;->f:Ll3/r0;

    iget v8, p1, Lf1/r;->e:I

    if-eq v0, v1, :cond_2

    invoke-virtual {p1, v3}, Lf1/r;->a(I)Lf1/t;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object v0, Ll83/i;->y:Ll83/i;

    new-instance v1, Lf1/x;

    const/4 v9, 0x0

    invoke-direct {v1, p1, v3, v9}, Lf1/x;-><init>(Ljava/lang/Object;II)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    invoke-interface {p0}, Lf1/q0;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    iget v1, p1, Lf1/r;->d:I

    :goto_3
    move v4, v1

    goto :goto_4

    :cond_3
    iget v1, p1, Lf1/r;->c:I

    goto :goto_3

    :goto_4
    new-instance v1, Lf1/y;

    move-object v5, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lf1/y;-><init>(Lf1/r;IILf1/q0;Ll83/h;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p0

    iget-wide v0, v2, Lf1/r;->a:J

    iget-wide v10, p2, Lf1/t;->c:J

    cmp-long p1, v0, v10

    if-eqz p1, :cond_4

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lf1/t;

    return-object p0

    :cond_4
    if-ne v3, v8, :cond_5

    return-object p2

    :cond_5
    iget-object p1, v7, Ll3/r0;->b:Ll3/w;

    invoke-virtual {p1, v8}, Ll3/w;->d(I)I

    move-result p1

    invoke-interface {v6}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-eq v0, p1, :cond_6

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lf1/t;

    return-object p0

    :cond_6
    iget p1, p2, Lf1/t;->b:I

    invoke-virtual {v7, p1}, Ll3/r0;->k(I)J

    move-result-wide v0

    invoke-interface {v5}, Lf1/q0;->a()Z

    move-result p2

    const/4 v4, -0x1

    if-ne v8, v4, :cond_7

    goto :goto_5

    :cond_7
    if-ne v3, v8, :cond_8

    goto :goto_7

    :cond_8
    invoke-virtual {v2}, Lf1/r;->b()Lf1/g;

    move-result-object v4

    sget-object v5, Lf1/g;->w:Lf1/g;

    if-ne v4, v5, :cond_9

    const/4 v9, 0x1

    :cond_9
    xor-int/2addr p2, v9

    if-eqz p2, :cond_a

    if-ge v3, v8, :cond_d

    goto :goto_5

    :cond_a
    if-le v3, v8, :cond_d

    :goto_5
    sget p2, Ll3/u0;->c:I

    const/16 p2, 0x20

    shr-long v4, v0, p2

    long-to-int p2, v4

    if-eq p1, p2, :cond_c

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    long-to-int p2, v0

    if-ne p1, p2, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual {v2, v3}, Lf1/r;->a(I)Lf1/t;

    move-result-object p0

    return-object p0

    :cond_c
    :goto_6
    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lf1/t;

    return-object p0

    :cond_d
    :goto_7
    invoke-virtual {v2, v3}, Lf1/r;->a(I)Lf1/t;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lf1/r;ZZILf1/f;)Lf1/t;
    .locals 2

    if-eqz p2, :cond_0

    iget v0, p0, Lf1/r;->c:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lf1/r;->d:I

    :goto_0
    iget v1, p0, Lf1/r;->b:I

    if-eq p3, v1, :cond_1

    invoke-virtual {p0, v0}, Lf1/r;->a(I)Lf1/t;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-interface {p4, p0, v0}, Lf1/f;->a(Lf1/r;I)J

    move-result-wide p3

    xor-int/2addr p1, p2

    if-eqz p1, :cond_2

    sget p1, Ll3/u0;->c:I

    const/16 p1, 0x20

    shr-long p1, p3, p1

    :goto_1
    long-to-int p1, p1

    goto :goto_2

    :cond_2
    sget p1, Ll3/u0;->c:I

    const-wide p1, 0xffffffffL

    and-long/2addr p1, p3

    goto :goto_1

    :goto_2
    invoke-virtual {p0, p1}, Lf1/r;->a(I)Lf1/t;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Lf1/h;Lf1/h;Lf1/r0;JLf1/t;)Lf1/h;
    .locals 0

    if-eqz p5, :cond_2

    iget-wide p0, p5, Lf1/t;->c:J

    iget-object p2, p2, Lf1/r0;->f:Lf1/u0;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p2, p0, p1}, Lf1/u0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    if-gez p0, :cond_0

    sget-object p0, Lf1/h;->w:Lf1/h;

    return-object p0

    :cond_0
    if-lez p0, :cond_1

    sget-object p0, Lf1/h;->y:Lf1/h;

    return-object p0

    :cond_1
    sget-object p0, Lf1/h;->x:Lf1/h;

    return-object p0

    :cond_2
    invoke-static {p0, p1}, Lf1/y0;->y(Lf1/h;Lf1/h;)Lf1/h;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Lf1/t;Lf1/r;I)Lf1/t;
    .locals 2

    iget-object p1, p1, Lf1/r;->f:Ll3/r0;

    invoke-virtual {p1, p2}, Ll3/r0;->a(I)Lw3/j;

    move-result-object p1

    iget-wide v0, p0, Lf1/t;->c:J

    new-instance p0, Lf1/t;

    invoke-direct {p0, p1, p2, v0, v1}, Lf1/t;-><init>(Lw3/j;IJ)V

    return-object p0
.end method

.method public static final q(Lh2/c;J)Z
    .locals 4

    iget v0, p0, Lh2/c;->a:F

    iget v1, p0, Lh2/c;->c:F

    const/16 v2, 0x20

    shr-long v2, p1, v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    cmpg-float v0, v2, v1

    if-gtz v0, :cond_0

    iget v0, p0, Lh2/c;->b:F

    iget p0, p0, Lh2/c;->d:F

    const-wide v1, 0xffffffffL

    and-long/2addr p1, v1

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    cmpg-float p2, v0, p1

    if-gtz p2, :cond_0

    cmpg-float p0, p1, p0

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final r(Lf2/d;F)Li2/g;
    .locals 31

    move-object/from16 v0, p0

    move/from16 v3, p1

    float-to-double v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-float v1, v1

    float-to-int v1, v1

    mul-int/lit8 v1, v1, 0x2

    sget-object v2, Lf1/y0;->b:Li2/g;

    sget-object v4, Lf1/y0;->c:Li2/c;

    sget-object v5, Lf1/y0;->d:Lk2/b;

    if-eqz v2, :cond_1

    if-eqz v4, :cond_1

    iget-object v6, v2, Li2/g;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    if-gt v1, v7, :cond_1

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    if-le v1, v6, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v9, v2

    move-object v10, v4

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v2, 0x1

    invoke-static {v1, v1, v2}, Li2/w0;->h(III)Li2/g;

    move-result-object v2

    sput-object v2, Lf1/y0;->b:Li2/g;

    invoke-static {v2}, Li2/w0;->a(Li2/g;)Li2/c;

    move-result-object v4

    sput-object v4, Lf1/y0;->c:Li2/c;

    goto :goto_0

    :goto_2
    if-nez v5, :cond_2

    new-instance v5, Lk2/b;

    invoke-direct {v5}, Lk2/b;-><init>()V

    sput-object v5, Lf1/y0;->d:Lk2/b;

    :cond_2
    move-object v11, v5

    iget-object v1, v11, Lk2/b;->w:Lk2/a;

    iget-object v2, v0, Lf2/d;->w:Lf2/b;

    invoke-interface {v2}, Lf2/b;->getLayoutDirection()Ly3/m;

    move-result-object v2

    iget-object v4, v9, Li2/g;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v7, v4

    const/16 v4, 0x20

    shl-long/2addr v5, v4

    const-wide v22, 0xffffffffL

    and-long v7, v7, v22

    or-long/2addr v5, v7

    iget-object v7, v1, Lk2/a;->a:Ly3/c;

    iget-object v8, v1, Lk2/a;->b:Ly3/m;

    iget-object v12, v1, Lk2/a;->c:Li2/v;

    iget-wide v13, v1, Lk2/a;->d:J

    iput-object v0, v1, Lk2/a;->a:Ly3/c;

    iput-object v2, v1, Lk2/a;->b:Ly3/m;

    iput-object v10, v1, Lk2/a;->c:Li2/v;

    iput-wide v5, v1, Lk2/a;->d:J

    invoke-virtual {v10}, Li2/c;->q()V

    move-object v0, v12

    move-wide v5, v13

    sget-wide v12, Li2/x;->b:J

    invoke-interface {v11}, Lk2/e;->d()J

    move-result-wide v16

    const/16 v20, 0x0

    const/16 v21, 0x3a

    const-wide/16 v14, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v11 .. v21}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    const-wide v24, 0xff000000L

    invoke-static/range {v24 .. v25}, Li2/w0;->e(J)J

    move-result-wide v12

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v14, v2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    move/from16 v26, v4

    move-wide/from16 v27, v5

    int-to-long v4, v2

    shl-long v14, v14, v26

    and-long v4, v4, v22

    or-long v16, v14, v4

    const/16 v21, 0x78

    const-wide/16 v14, 0x0

    invoke-static/range {v11 .. v21}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    invoke-static/range {v24 .. v25}, Li2/w0;->e(J)J

    move-result-wide v4

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v12, v2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v14, v2

    shl-long v12, v12, v26

    and-long v14, v14, v22

    or-long/2addr v12, v14

    move-object v2, v7

    const/4 v7, 0x0

    move-object v6, v8

    const/16 v8, 0x78

    move-object v14, v6

    const/4 v6, 0x0

    move-object v15, v9

    move-object/from16 v16, v10

    move-wide/from16 v9, v27

    move-wide/from16 v29, v12

    move-object v13, v0

    move-object v12, v2

    move-object v0, v11

    move-object v11, v1

    move-wide v1, v4

    move-wide/from16 v4, v29

    invoke-static/range {v0 .. v8}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    invoke-virtual/range {v16 .. v16}, Li2/c;->g()V

    iput-object v12, v11, Lk2/a;->a:Ly3/c;

    iput-object v14, v11, Lk2/a;->b:Ly3/m;

    iput-object v13, v11, Lk2/a;->c:Li2/v;

    iput-wide v9, v11, Lk2/a;->d:J

    return-object v15
.end method

.method public static final s(Lf1/w0;JLf1/t;)J
    .locals 15

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    invoke-virtual {p0, v3}, Lf1/w0;->d(Lf1/t;)Lf1/l;

    move-result-object v4

    if-nez v4, :cond_0

    goto/16 :goto_a

    :cond_0
    iget-object v5, p0, Lf1/w0;->l:Ly2/y;

    if-nez v5, :cond_1

    goto/16 :goto_a

    :cond_1
    iget-object v6, v4, Lf1/l;->c:Le1/i;

    invoke-virtual {v4}, Lf1/l;->d()Ly2/y;

    move-result-object v7

    if-nez v7, :cond_2

    goto/16 :goto_a

    :cond_2
    iget v3, v3, Lf1/t;->b:I

    invoke-virtual {v4}, Lf1/l;->b()I

    move-result v8

    if-le v3, v8, :cond_3

    goto/16 :goto_a

    :cond_3
    iget-object v0, p0, Lf1/w0;->s:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/b;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v8, v0, Lh2/b;->a:J

    invoke-interface {v7, v5, v8, v9}, Ly2/y;->k(Ly2/y;J)J

    move-result-wide v8

    const/16 v0, 0x20

    shr-long/2addr v8, v0

    long-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    invoke-virtual {v6}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll3/r0;

    const/4 v10, 0x1

    if-nez v9, :cond_4

    sget-wide v11, Ll3/u0;->b:J

    goto :goto_0

    :cond_4
    iget-object v11, v9, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v4, v9}, Lf1/l;->c(Ll3/r0;)I

    move-result v4

    if-ge v4, v10, :cond_5

    sget-wide v11, Ll3/u0;->b:J

    goto :goto_0

    :cond_5
    const/4 v12, 0x0

    sub-int/2addr v4, v10

    invoke-static {v3, v12, v4}, Le93/b;->n(III)I

    move-result v4

    invoke-virtual {v11, v4}, Ll3/w;->d(I)I

    move-result v4

    invoke-virtual {v9, v4}, Ll3/r0;->h(I)I

    move-result v9

    invoke-virtual {v11, v4, v10}, Ll3/w;->c(IZ)I

    move-result v4

    invoke-static {v9, v4}, Lj93/l0;->f(II)J

    move-result-wide v11

    :goto_0
    invoke-static {v11, v12}, Ll3/u0;->c(J)Z

    move-result v4

    const-wide v13, 0xffffffffL

    if-eqz v4, :cond_8

    invoke-virtual {v6}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll3/r0;

    if-nez v4, :cond_6

    goto :goto_1

    :cond_6
    iget-object v10, v4, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v10, v3}, Ll3/w;->d(I)I

    move-result v11

    iget v10, v10, Ll3/w;->f:I

    if-lt v11, v10, :cond_7

    :goto_1
    const/high16 v4, -0x40800000    # -1.0f

    goto :goto_2

    :cond_7
    invoke-virtual {v4, v11}, Ll3/r0;->f(I)F

    move-result v4

    :goto_2
    const/high16 p0, -0x40800000    # -1.0f

    goto :goto_7

    :cond_8
    move/from16 p3, v10

    const/high16 p0, -0x40800000    # -1.0f

    shr-long v9, v11, v0

    long-to-int v4, v9

    invoke-virtual {v6}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll3/r0;

    if-nez v9, :cond_9

    goto :goto_3

    :cond_9
    iget-object v10, v9, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v10, v4}, Ll3/w;->d(I)I

    move-result v4

    iget v10, v10, Ll3/w;->f:I

    if-lt v4, v10, :cond_a

    :goto_3
    move v4, p0

    goto :goto_4

    :cond_a
    invoke-virtual {v9, v4}, Ll3/r0;->f(I)F

    move-result v4

    :goto_4
    and-long v9, v11, v13

    long-to-int v9, v9

    add-int/lit8 v9, v9, -0x1

    invoke-virtual {v6}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll3/r0;

    if-nez v10, :cond_b

    :goto_5
    move v9, p0

    goto :goto_6

    :cond_b
    iget-object v11, v10, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v11, v9}, Ll3/w;->d(I)I

    move-result v9

    iget v11, v11, Ll3/w;->f:I

    if-lt v9, v11, :cond_c

    goto :goto_5

    :cond_c
    invoke-virtual {v10, v9}, Ll3/r0;->g(I)F

    move-result v9

    :goto_6
    invoke-static {v4, v9}, Ljava/lang/Math;->min(FF)F

    move-result v10

    invoke-static {v4, v9}, Ljava/lang/Math;->max(FF)F

    move-result v4

    invoke-static {v8, v10, v4}, Le93/b;->m(FFF)F

    move-result v4

    :goto_7
    cmpg-float v9, v4, p0

    if-nez v9, :cond_d

    goto :goto_a

    :cond_d
    const-wide/16 v9, 0x0

    invoke-static {v1, v2, v9, v10}, Ly3/l;->a(JJ)Z

    move-result v9

    const/4 v10, 0x2

    if-nez v9, :cond_e

    sub-float/2addr v8, v4

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    shr-long/2addr v1, v0

    long-to-int v1, v1

    div-int/2addr v1, v10

    int-to-float v1, v1

    cmpl-float v1, v8, v1

    if-lez v1, :cond_e

    goto :goto_a

    :cond_e
    invoke-virtual {v6}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll3/r0;

    if-nez v1, :cond_f

    :goto_8
    move v1, p0

    goto :goto_9

    :cond_f
    iget-object v1, v1, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v1, v3}, Ll3/w;->d(I)I

    move-result v2

    iget v3, v1, Ll3/w;->f:I

    if-lt v2, v3, :cond_10

    goto :goto_8

    :cond_10
    invoke-virtual {v1, v2}, Ll3/w;->f(I)F

    move-result v3

    invoke-virtual {v1, v2}, Ll3/w;->b(I)F

    move-result v1

    sub-float/2addr v1, v3

    int-to-float v2, v10

    div-float/2addr v1, v2

    add-float/2addr v1, v3

    :goto_9
    cmpg-float v2, v1, p0

    if-nez v2, :cond_11

    :goto_a
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    return-wide v0

    :cond_11
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v8, v1

    shl-long v0, v2, v0

    and-long v2, v8, v13

    or-long/2addr v0, v2

    invoke-interface {v5, v7, v0, v1}, Ly2/y;->k(Ly2/y;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final t(JLl3/r0;)I
    .locals 3

    const-wide v0, 0xffffffffL

    and-long/2addr v0, p0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    iget-object v1, p2, Ll3/r0;->b:Ll3/w;

    iget v2, v1, Ll3/w;->e:F

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_1

    iget-object p0, p2, Ll3/r0;->a:Ll3/q0;

    iget-object p0, p0, Ll3/q0;->a:Ll3/g;

    iget-object p0, p0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    return p0

    :cond_1
    invoke-virtual {v1, p0, p1}, Ll3/w;->g(J)I

    move-result p0

    return p0
.end method

.method public static final u(Ll3/r0;IZZ)J
    .locals 5

    iget-object v0, p0, Ll3/r0;->b:Ll3/w;

    iget-wide v1, p0, Ll3/r0;->c:J

    invoke-virtual {v0, p1}, Ll3/w;->d(I)I

    move-result v3

    iget v4, v0, Ll3/w;->f:I

    if-lt v3, v4, :cond_0

    const-wide p0, 0x7fc000007fc00000L    # 2.247117487993712E307

    return-wide p0

    :cond_0
    const/4 v4, 0x0

    if-eqz p2, :cond_1

    if-eqz p3, :cond_2

    :cond_1
    if-nez p2, :cond_3

    if-eqz p3, :cond_3

    :cond_2
    move p2, p1

    goto :goto_0

    :cond_3
    add-int/lit8 p2, p1, -0x1

    invoke-static {p2, v4}, Ljava/lang/Math;->max(II)I

    move-result p2

    :goto_0
    invoke-virtual {p0, p2}, Ll3/r0;->a(I)Lw3/j;

    move-result-object p2

    invoke-virtual {p0, p1}, Ll3/r0;->i(I)Lw3/j;

    move-result-object p0

    if-ne p2, p0, :cond_4

    const/4 p0, 0x1

    goto :goto_1

    :cond_4
    move p0, v4

    :goto_1
    iget-object p2, v0, Ll3/w;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ll3/w;->l(I)V

    iget-object p3, v0, Ll3/w;->a:Laa3/i1;

    iget-object p3, p3, Laa3/i1;->b:Ljava/lang/Object;

    check-cast p3, Ll3/g;

    iget-object p3, p3, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    if-ne p1, p3, :cond_5

    invoke-static {p2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result p3

    goto :goto_2

    :cond_5
    invoke-static {p1, p2}, Ll3/s;->c(ILjava/util/List;)I

    move-result p3

    :goto_2
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll3/y;

    iget-object p3, p2, Ll3/y;->a:Ll3/a;

    invoke-virtual {p2, p1}, Ll3/y;->d(I)I

    move-result p1

    iget-object p2, p3, Ll3/a;->d:Lm3/m;

    if-eqz p0, :cond_6

    invoke-virtual {p2, p1, v4}, Lm3/m;->h(IZ)F

    move-result p0

    goto :goto_3

    :cond_6
    invoke-virtual {p2, p1, v4}, Lm3/m;->i(IZ)F

    move-result p0

    :goto_3
    const/16 p1, 0x20

    shr-long p2, v1, p1

    long-to-int p2, p2

    int-to-float p2, p2

    const/4 p3, 0x0

    invoke-static {p0, p3, p2}, Le93/b;->m(FFF)F

    move-result p0

    invoke-virtual {v0, v3}, Ll3/w;->b(I)F

    move-result p2

    const-wide v3, 0xffffffffL

    and-long v0, v1, v3

    long-to-int v0, v0

    int-to-float v0, v0

    invoke-static {p2, p3, v0}, Le93/b;->m(FFF)F

    move-result p2

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v0, p0

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p2, p0

    shl-long p0, v0, p1

    and-long/2addr p2, v3

    or-long/2addr p0, p2

    return-wide p0
.end method

.method public static final v(Ll3/r0;I)Lw3/j;
    .locals 4

    iget-object v0, p0, Ll3/r0;->a:Ll3/q0;

    iget-object v1, p0, Ll3/r0;->b:Ll3/w;

    iget-object v2, v0, Ll3/q0;->a:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1}, Ll3/w;->d(I)I

    move-result v2

    if-eqz p1, :cond_1

    add-int/lit8 v3, p1, -0x1

    invoke-virtual {v1, v3}, Ll3/w;->d(I)I

    move-result v3

    if-eq v2, v3, :cond_2

    :cond_1
    iget-object v0, v0, Ll3/q0;->a:Ll3/g;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eq p1, v0, :cond_3

    add-int/lit8 v0, p1, 0x1

    invoke-virtual {v1, v0}, Ll3/w;->d(I)I

    move-result v0

    if-eq v2, v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, Ll3/r0;->a(I)Lw3/j;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    invoke-virtual {p0, p1}, Ll3/r0;->i(I)Lw3/j;

    move-result-object p0

    return-object p0
.end method

.method public static final w(Lu2/k;)Z
    .locals 5

    iget-object p0, p0, Lu2/k;->a:Ljava/lang/Object;

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu2/r;

    iget v3, v3, Lu2/r;->i:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final x(Lf1/s1;Z)Z
    .locals 1

    iget-object v0, p0, Lf1/s1;->d:Lu0/s0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lu0/s0;->c()Ly2/y;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lf1/y0;->z(Ly2/y;)Lh2/c;

    move-result-object v0

    invoke-virtual {p0, p1}, Lf1/s1;->k(Z)J

    move-result-wide p0

    invoke-static {v0, p0, p1}, Lf1/y0;->q(Lh2/c;J)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final y(Lf1/h;Lf1/h;)Lf1/h;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_5

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    if-ne p1, v0, :cond_0

    sget-object p0, Lf1/h;->y:Lf1/h;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_4

    if-eq p0, v1, :cond_3

    if-ne p0, v0, :cond_2

    sget-object p0, Lf1/h;->y:Lf1/h;

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    sget-object p0, Lf1/h;->x:Lf1/h;

    return-object p0

    :cond_4
    sget-object p0, Lf1/h;->w:Lf1/h;

    return-object p0

    :cond_5
    sget-object p0, Lf1/h;->w:Lf1/h;

    return-object p0
.end method

.method public static final z(Ly2/y;)Lh2/c;
    .locals 5

    invoke-static {p0}, Ly2/q1;->f(Ly2/y;)Lh2/c;

    move-result-object v0

    invoke-virtual {v0}, Lh2/c;->f()J

    move-result-wide v1

    invoke-interface {p0, v1, v2}, Ly2/y;->o(J)J

    move-result-wide v1

    invoke-virtual {v0}, Lh2/c;->c()J

    move-result-wide v3

    invoke-interface {p0, v3, v4}, Ly2/y;->o(J)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Lhg3/i;->h(JJ)Lh2/c;

    move-result-object p0

    return-object p0
.end method
