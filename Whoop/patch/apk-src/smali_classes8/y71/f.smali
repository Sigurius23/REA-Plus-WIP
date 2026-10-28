.class public abstract Ly71/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a5\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000e\u00b2\u0006\u000c\u0010\u000c\u001a\u00020\u000b8\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\r\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ly71/o;",
        "state",
        "Ly71/l$a;",
        "alignment",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "d",
        "(Ly71/o;Ly71/l$a;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "",
        "isPressed",
        "isSelected",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ly71/f;->h(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly71/o;Ly71/l$a;Landroidx/compose/ui/Modifier;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ly71/f;->j(Ly71/o;Ly71/l$a;Landroidx/compose/ui/Modifier;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ly71/o;JLy71/l$a;JLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ly71/f;->i(Ly71/o;JLy71/l$a;JLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ly71/o;Ly71/l$a;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly71/o;",
            "Ly71/l$a;",
            "Landroidx/compose/ui/Modifier;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v10, p3

    move/from16 v11, p5

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alignment"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modifier"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v0, -0x4a0f9192

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v11, 0x6

    const/4 v13, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v13

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v11

    goto :goto_1

    :cond_1
    move v0, v11

    :goto_1
    and-int/lit8 v4, v11, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit16 v4, v11, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v0, v4

    :cond_5
    and-int/lit16 v4, v11, 0xc00

    const/16 v5, 0x800

    if-nez v4, :cond_7

    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    move v4, v5

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v0, v4

    :cond_7
    and-int/lit16 v4, v0, 0x493

    const/16 v6, 0x492

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v4, v6, :cond_8

    move v4, v14

    goto :goto_5

    :cond_8
    move v4, v15

    :goto_5
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v12, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v4, v6, :cond_9

    invoke-static {v12}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v4

    :cond_9
    check-cast v4, Lj0/i;

    const/4 v7, 0x6

    invoke-static {v4, v12, v7}, Lge3/g;->m(Lj0/i;Lp1/q;I)Lp1/c1;

    move-result-object v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v6, :cond_a

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v9

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v9, Lp1/c1;

    invoke-static {v8}, Ly71/f;->e(Lp1/t2;)Z

    move-result v8

    if-nez v8, :cond_c

    invoke-virtual {v1}, Ly71/o;->l()Z

    move-result v8

    if-eqz v8, :cond_b

    goto :goto_6

    :cond_b
    move v8, v15

    goto :goto_7

    :cond_c
    :goto_6
    move v8, v14

    :goto_7
    invoke-static {v9, v8}, Ly71/f;->g(Lp1/c1;Z)V

    invoke-static {v9}, Ly71/f;->f(Lp1/c1;)Z

    move-result v8

    if-eqz v8, :cond_d

    const v8, -0x4713e28

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-static {v8, v12, v7, v15}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    goto :goto_8

    :cond_d
    const v8, -0x47139eb

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-static {v8, v12, v7, v15}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    :goto_8
    invoke-static {v9}, Ly71/f;->f(Lp1/c1;)Z

    move-result v8

    if-eqz v8, :cond_e

    const v8, -0x4713208

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-static {v8, v12, v7, v15}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v18

    goto :goto_9

    :cond_e
    const v8, -0x4712dc8

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-static {v8, v12, v7, v15}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v18

    :goto_9
    invoke-static {v9}, Ly71/f;->f(Lp1/c1;)Z

    move-result v8

    if-eqz v8, :cond_f

    const v8, -0x47124c8

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-static {v8, v12, v7, v15}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v7

    :goto_a
    move-wide/from16 v20, v7

    goto :goto_b

    :cond_f
    const v8, -0x471208b

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-static {v8, v12, v7, v15}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v7

    goto :goto_a

    :goto_b
    invoke-virtual {v1}, Ly71/o;->i()Z

    move-result v7

    if-eqz v7, :cond_10

    const/high16 v7, 0x3f800000    # 1.0f

    goto :goto_c

    :cond_10
    const v7, 0x3e4ccccd    # 0.2f

    :goto_c
    invoke-virtual {v1}, Ly71/o;->i()Z

    move-result v8

    move v9, v7

    new-instance v7, Li3/i;

    invoke-direct {v7, v15}, Li3/i;-><init>(I)V

    and-int/lit16 v0, v0, 0x1c00

    if-ne v0, v5, :cond_11

    move v0, v14

    goto :goto_d

    :cond_11
    move v0, v15

    :goto_d
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_12

    if-ne v5, v6, :cond_13

    :cond_12
    new-instance v5, Ly71/e;

    const/4 v0, 0x0

    invoke-direct {v5, v10, v0}, Ly71/e;-><init>(Lc93/a;I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v5, Lc93/a;

    move v0, v9

    const/16 v9, 0x8

    move v6, v8

    move-object v8, v5

    const/4 v5, 0x0

    invoke-static/range {v3 .. v9}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v0, v4}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v0, v14

    int-to-float v3, v13

    mul-float/2addr v0, v3

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v13

    int-to-float v8, v15

    new-instance v0, Lhy0/z0;

    move-object v4, v2

    move-wide/from16 v2, v18

    move-wide/from16 v5, v20

    invoke-direct/range {v0 .. v6}, Lhy0/z0;-><init>(Ly71/o;JLy71/l$a;J)V

    const v1, -0x798b8115

    invoke-static {v1, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v18

    const/high16 v20, 0x1b0000

    const/16 v21, 0x18

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    move/from16 v17, v8

    move-object/from16 v19, v12

    move-object v12, v7

    invoke-static/range {v12 .. v21}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_e

    :cond_14
    move-object/from16 v19, v12

    invoke-virtual/range {v19 .. v19}, Lp1/q;->X()V

    :goto_e
    invoke-virtual/range {v19 .. v19}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_15

    new-instance v0, Lxn2/d;

    const/16 v6, 0x1b

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v4, v10

    move v5, v11

    invoke-direct/range {v0 .. v6}, Lxn2/d;-><init>(Ly71/o;Ly71/l;Landroidx/compose/ui/Modifier;Lc93/a;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final e(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final f(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final g(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final h(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ly71/o;JLy71/l$a;JLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    and-int/lit8 v0, p7, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p7, 0x1

    move-object/from16 v4, p6

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    const-wide/high16 v0, 0x4004000000000000L    # 2.5

    double-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->N:Lb2/k;

    sget-object v5, Ll0/m;->c:Ll0/g;

    const/16 v6, 0x30

    invoke-static {v5, v1, v4, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v4, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v4, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, v4, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v4, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Ly71/o;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v4, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lw3/k;

    const/4 v5, 0x3

    invoke-direct {v1, v5}, Lw3/k;-><init>(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v7, 0x6

    invoke-virtual {v6, v4, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->r()Lb91/a;

    move-result-object v24

    const/16 v28, 0x0

    const v29, 0x2fdfa

    move v8, v5

    const/4 v5, 0x0

    move v10, v8

    const-wide/16 v8, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const-wide/16 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v4

    move/from16 v3, v16

    move-object v4, v0

    move-object/from16 v16, v1

    move-object v0, v6

    move v1, v7

    move-wide/from16 v6, p1

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual/range {p3 .. p3}, Ly71/l$a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v4, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    new-instance v5, Lw3/k;

    invoke-direct {v5, v3}, Lw3/k;-><init>(I)V

    invoke-virtual {v0, v4, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->d()Lb91/a;

    move-result-object v24

    move-object/from16 v16, v5

    const/4 v5, 0x0

    move-wide/from16 v6, p4

    move-object v4, v2

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Ly71/o;Ly71/l$a;Landroidx/compose/ui/Modifier;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Ly71/f;->d(Ly71/o;Ly71/l$a;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
