.class public abstract Lzk2/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a5\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000cH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lw41/f;",
        "controller",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "h",
        "(Lw41/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "",
        "iconRes",
        "contentDescriptionRes",
        "",
        "automationTag",
        "Lkotlin/Function0;",
        "onClick",
        "f",
        "(IILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "track-activity_release"
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
.method public static synthetic a(Lbc3/c0;Lw41/f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzk2/o;->j(Lbc3/c0;Lw41/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(IILjava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lzk2/o;->g(IILjava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lw41/f;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzk2/o;->l(Lw41/f;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lbc3/c0;Lw41/f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzk2/o;->k(Lbc3/c0;Lw41/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lbc3/c0;Lw41/f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzk2/o;->i(Lbc3/c0;Lw41/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(IILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v2, p1

    move-object/from16 v5, p2

    move/from16 v3, p5

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, 0x7406285e

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v3, 0x6

    move/from16 v14, p0

    if-nez v0, :cond_1

    invoke-virtual {v11, v14}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v3

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    and-int/lit8 v1, v3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->e(I)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, v3, 0x180

    if-nez v1, :cond_5

    invoke-virtual {v11, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v3, 0xc00

    move-object/from16 v10, p3

    if-nez v1, :cond_7

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x800

    goto :goto_4

    :cond_6
    const/16 v1, 0x400

    :goto_4
    or-int/2addr v0, v1

    :cond_7
    and-int/lit16 v1, v0, 0x493

    const/16 v4, 0x492

    if-eq v1, v4, :cond_8

    const/4 v1, 0x1

    goto :goto_5

    :cond_8
    const/4 v1, 0x0

    :goto_5
    and-int/lit8 v4, v0, 0x1

    invoke-virtual {v11, v4, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v5}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v12, Lny0/o;

    sget-object v13, Lny0/q$a;->f:Lny0/q$a;

    sget-object v15, Ly81/f;->BRAND_WHITE:Ly81/f;

    const/16 v23, 0x1f8

    const/16 v24, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v12 .. v24}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    shr-int/lit8 v1, v0, 0x3

    and-int/lit8 v1, v1, 0xe

    invoke-static {v2, v11, v1}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget v1, Lny0/o;->k:I

    const v4, 0xe000

    shl-int/lit8 v0, v0, 0x3

    and-int/2addr v0, v4

    or-int/2addr v0, v1

    const/16 v13, 0x8

    const/4 v9, 0x0

    move-object v6, v12

    move v12, v0

    invoke-static/range {v6 .. v13}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_6

    :cond_9
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v0, Lph1/h;

    move/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v5}, Lph1/h;-><init>(IIILc93/a;Ljava/lang/String;)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final g(IILjava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lzk2/o;->f(IILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Lw41/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 15

    const-string v0, "controller"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    const v0, -0x13f3275e

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v8, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v8

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v6, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit8 v4, v0, 0x13

    const/16 v5, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v4, v5, :cond_5

    move v4, v10

    goto :goto_4

    :cond_5
    move v4, v9

    :goto_4
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v6, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_15

    if-eqz v2, :cond_6

    sget-object v2, Lb2/t;->w:Lb2/t;

    move-object v11, v2

    goto :goto_5

    :cond_6
    move-object v11, v3

    :goto_5
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v2, v12, :cond_7

    invoke-static {v6}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v2

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v13, v2

    check-cast v13, Lbc3/c0;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v12, :cond_8

    sget-object v2, Lzk2/o$a;->w:Lzk2/o$a;

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-static {v11, v3, v2}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v3, v10

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v3, v4, v6, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v14, v6, Lp1/q;->S:Z

    if-eqz v14, :cond_9

    invoke-virtual {v6, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_6
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v6, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v6, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-nez v5, :cond_a

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    :cond_a
    invoke-static {v4, v6, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v6, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-virtual {v14}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/k0;->I()I

    move-result v2

    sget v3, Lkk2/d;->v:I

    invoke-virtual {v6, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v0, v0, 0xe

    if-ne v0, v8, :cond_c

    move v5, v10

    goto :goto_7

    :cond_c
    move v5, v9

    :goto_7
    or-int/2addr v4, v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_d

    if-ne v5, v12, :cond_e

    :cond_d
    new-instance v5, Lzk2/m;

    const/4 v4, 0x0

    invoke-direct {v5, v13, p0, v4}, Lzk2/m;-><init>(Lbc3/c0;Lw41/f;I)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v5, Lc93/a;

    const/16 v7, 0x180

    const-string v4, "track_session_map_recenter_button"

    invoke-static/range {v2 .. v7}, Lzk2/o;->f(IILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/w;->A()I

    move-result v2

    sget v3, Lkk2/d;->w:I

    invoke-virtual {v6, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-ne v0, v8, :cond_f

    move v5, v10

    goto :goto_8

    :cond_f
    move v5, v9

    :goto_8
    or-int/2addr v4, v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_10

    if-ne v5, v12, :cond_11

    :cond_10
    new-instance v5, Lzk2/m;

    const/4 v4, 0x1

    invoke-direct {v5, v13, p0, v4}, Lzk2/m;-><init>(Lbc3/c0;Lw41/f;I)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v5, Lc93/a;

    const/16 v7, 0x180

    const-string v4, "track_session_map_zoom_in_button"

    invoke-static/range {v2 .. v7}, Lzk2/o;->f(IILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/w;->B()I

    move-result v2

    sget v3, Lkk2/d;->x:I

    invoke-virtual {v6, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-ne v0, v8, :cond_12

    move v9, v10

    :cond_12
    or-int v0, v4, v9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_13

    if-ne v4, v12, :cond_14

    :cond_13
    new-instance v4, Lzk2/m;

    const/4 v0, 0x2

    invoke-direct {v4, v13, p0, v0}, Lzk2/m;-><init>(Lbc3/c0;Lw41/f;I)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v5, v4

    check-cast v5, Lc93/a;

    const/16 v7, 0x180

    const-string v4, "track_session_map_zoom_out_button"

    invoke-static/range {v2 .. v7}, Lzk2/o;->f(IILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    move-object v3, v11

    goto :goto_9

    :cond_15
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v0, Lzi1/c0;

    const/4 v5, 0x3

    move-object v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lzi1/c0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final i(Lbc3/c0;Lw41/f;)Ll83/a0;
    .locals 2

    new-instance v0, Lzk2/o$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lzk2/o$b;-><init>(Lw41/f;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lbc3/c0;Lw41/f;)Ll83/a0;
    .locals 2

    new-instance v0, Lzk2/o$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lzk2/o$c;-><init>(Lw41/f;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lbc3/c0;Lw41/f;)Ll83/a0;
    .locals 2

    new-instance v0, Lzk2/o$d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lzk2/o$d;-><init>(Lw41/f;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lw41/f;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzk2/o;->h(Lw41/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
