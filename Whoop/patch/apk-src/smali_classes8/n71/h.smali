.class public abstract Ln71/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\"\u0014\u0010\u000c\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\t\u00a8\u0006\u000f\u00b2\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lfz0/d;",
        "itemState",
        "Ll83/a0;",
        "e",
        "(Landroidx/compose/ui/Modifier;Lfz0/d;Landroidx/compose/runtime/Composer;II)V",
        "Ly3/f;",
        "a",
        "F",
        "thumbRadius",
        "b",
        "shadowThumbRadius",
        "",
        "zoneWidthPx",
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


# static fields
.field private static final a:F

.field private static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-wide/high16 v0, 0x4004000000000000L    # 2.5

    double-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Ln71/h;->a:F

    const-wide/high16 v2, 0x400c000000000000L    # 3.5

    double-to-float v0, v2

    mul-float/2addr v0, v1

    sput v0, Ln71/h;->b:F

    return-void
.end method

.method public static synthetic a(Lfz0/d;Lp1/a1;Ly3/c;)Ly3/j;
    .locals 0

    invoke-static {p0, p1, p2}, Ln71/h;->j(Lfz0/d;Lp1/a1;Ly3/c;)Ly3/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/a1;Ly3/l;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ln71/h;->h(Lp1/a1;Ly3/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lfz0/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ln71/h;->k(Landroidx/compose/ui/Modifier;Lfz0/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lfz0/d;Lp1/a1;Ly3/c;)Ly3/j;
    .locals 0

    invoke-static {p0, p1, p2}, Ln71/h;->i(Lfz0/d;Lp1/a1;Ly3/c;)Ly3/j;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lfz0/d;Landroidx/compose/runtime/Composer;II)V
    .locals 30

    move-object/from16 v2, p1

    const-string v0, "itemState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, -0x3d4c852d

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v4, p3, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int v5, p3, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move/from16 v5, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_5

    and-int/lit8 v6, p3, 0x40

    if-nez v6, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_2
    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_3

    :cond_4
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit8 v6, v5, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    if-eq v6, v8, :cond_6

    const/4 v6, 0x1

    goto :goto_4

    :cond_6
    move v6, v9

    :goto_4
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v0, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_19

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_7

    move-object v1, v6

    goto :goto_5

    :cond_7
    move-object v1, v4

    :goto_5
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v4, v8, :cond_8

    invoke-static {v9, v0}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v4

    :cond_8
    check-cast v4, Lp1/a1;

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v8, :cond_9

    new-instance v13, Lfc0/f;

    const/4 v14, 0x5

    invoke-direct {v13, v4, v14}, Lfc0/f;-><init>(Lp1/a1;I)V

    invoke-virtual {v0, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v12, v13}, Landroidx/compose/ui/layout/b;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, Lb2/e;->N:Lb2/k;

    sget-object v14, Ll0/m;->c:Ll0/g;

    const/16 v15, 0x30

    invoke-static {v14, v13, v0, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v0, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-eqz v7, :cond_a

    invoke-virtual {v0, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v0, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v0, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-nez v11, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v11, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v14, v0, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v0, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, Lb2/e;->w:Lb2/m;

    invoke-static {v11, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    move-object v14, v10

    iget-wide v9, v0, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v0, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v0}, Lp1/q;->i0()V

    move-object/from16 v29, v1

    iget-boolean v1, v0, Lp1/q;->S:Z

    if-eqz v1, :cond_d

    invoke-virtual {v0, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v0, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v0, Lp1/q;->S:Z

    if-nez v1, :cond_e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    :cond_e
    invoke-static {v9, v0, v9, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v0, v14, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v1, Ln71/h;->b:F

    const/4 v3, 0x0

    const/4 v7, 0x1

    invoke-static {v6, v3, v1, v7}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v2}, Lfz0/d;->a()Ly81/e;

    move-result-object v7

    const/4 v12, 0x0

    invoke-interface {v7, v0, v12}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    invoke-virtual {v2}, Lfz0/d;->b()F

    move-result v7

    invoke-static {v7, v9, v10}, Li2/x;->c(FJ)J

    move-result-wide v9

    invoke-virtual {v2}, Lfz0/d;->h()Lfz0/e;

    move-result-object v7

    invoke-virtual {v7}, Lfz0/e;->getShape()Lt0/i;

    move-result-object v7

    invoke-static {v3, v9, v10, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v2}, Lfz0/d;->c()F

    move-result v7

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, Lb2/e;->E:Lb2/m;

    sget-object v9, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v9, v3, v7}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v12, 0x0

    invoke-static {v3, v0, v12}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v2}, Lfz0/d;->g()Z

    move-result v3

    const/4 v7, 0x6

    if-eqz v3, :cond_18

    const v3, 0x3e1cd875

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-static {v6, v1, v1}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->z:Lb2/m;

    invoke-virtual {v9, v1, v3}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    and-int/lit8 v10, v5, 0x70

    const/16 v11, 0x20

    if-eq v10, v11, :cond_11

    and-int/lit8 v11, v5, 0x40

    if-eqz v11, :cond_10

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_10

    goto :goto_8

    :cond_10
    const/4 v11, 0x0

    goto :goto_9

    :cond_11
    :goto_8
    const/4 v11, 0x1

    :goto_9
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_12

    if-ne v13, v8, :cond_13

    :cond_12
    new-instance v13, Ln71/g;

    const/4 v11, 0x0

    invoke-direct {v13, v2, v4, v11}, Ln71/g;-><init>(Lfz0/d;Lp1/a1;I)V

    invoke-virtual {v0, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v13}, Landroidx/compose/foundation/layout/a;->l(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v11, Lx81/d;->a:Lx81/d;

    invoke-virtual {v11, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->r()J

    move-result-wide v13

    sget-object v15, Lt0/j;->a:Lt0/i;

    invoke-static {v1, v13, v14, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v12, 0x0

    invoke-static {v1, v0, v12}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget v1, Ln71/h;->a:F

    invoke-static {v6, v1, v1}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v9, v1, v3}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v3, 0x20

    if-eq v10, v3, :cond_15

    and-int/lit8 v3, v5, 0x40

    if-eqz v3, :cond_14

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_14

    goto :goto_a

    :cond_14
    const/16 v18, 0x0

    goto :goto_b

    :cond_15
    :goto_a
    const/16 v18, 0x1

    :goto_b
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v18, :cond_16

    if-ne v3, v8, :cond_17

    :cond_16
    new-instance v3, Ln71/g;

    const/4 v5, 0x1

    invoke-direct {v3, v2, v4, v5}, Ln71/g;-><init>(Lfz0/d;Lp1/a1;I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/a;->l(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const/4 v1, 0x4

    int-to-float v1, v1

    const-wide/16 v24, 0x0

    const/16 v26, 0x1a

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    move/from16 v19, v1

    invoke-static/range {v18 .. v26}, Le93/b;->a0(Landroidx/compose/ui/Modifier;FLi2/a1;ZJJI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v11, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    invoke-static {v1, v3, v4, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v12, 0x0

    invoke-static {v1, v0, v12}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    :goto_c
    const/4 v1, 0x1

    goto :goto_d

    :cond_18
    const/4 v12, 0x0

    const v1, 0x3e2c4d13

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    goto :goto_c

    :goto_d
    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v2}, Lfz0/d;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v0, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v0, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->F()Lb91/a;

    move-result-object v23

    invoke-virtual {v2}, Lfz0/d;->a()Ly81/e;

    move-result-object v4

    invoke-interface {v4, v0, v12}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    invoke-virtual {v2}, Lfz0/d;->b()F

    move-result v6

    invoke-static {v6, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v5

    const/16 v27, 0xc30

    const v28, 0x2d7fa

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x3

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, v0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    move-object/from16 v1, v29

    goto :goto_e

    :cond_19
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v1, v4

    :goto_e
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1a

    new-instance v0, Lfz0/b;

    const/4 v5, 0x1

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lfz0/b;-><init>(Landroidx/compose/ui/Modifier;Lfz0/d;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final f(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final g(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final h(Lp1/a1;Ly3/l;)Ll83/a0;
    .locals 2

    iget-wide v0, p1, Ly3/l;->a:J

    const/16 p1, 0x20

    shr-long/2addr v0, p1

    long-to-int p1, v0

    invoke-static {p0, p1}, Ln71/h;->g(Lp1/a1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lfz0/d;Lp1/a1;Ly3/c;)Ly3/j;
    .locals 4

    const-string v0, "$this$offset"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ln71/h;->f(Lp1/a1;)I

    move-result p1

    int-to-float p1, p1

    sget v0, Ln71/h;->b:F

    invoke-interface {p2, v0}, Ly3/c;->q0(F)F

    move-result p2

    sub-float/2addr p1, p2

    invoke-virtual {p0}, Lfz0/d;->f()F

    move-result p0

    mul-float/2addr p0, p1

    float-to-int p0, p0

    int-to-long p0, p0

    const/16 p2, 0x20

    shl-long/2addr p0, p2

    const/4 p2, 0x0

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long/2addr p0, v0

    new-instance p2, Ly3/j;

    invoke-direct {p2, p0, p1}, Ly3/j;-><init>(J)V

    return-object p2
.end method

.method private static final j(Lfz0/d;Lp1/a1;Ly3/c;)Ly3/j;
    .locals 4

    const-string v0, "$this$offset"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ln71/h;->f(Lp1/a1;)I

    move-result p1

    int-to-float p1, p1

    sget v0, Ln71/h;->a:F

    invoke-interface {p2, v0}, Ly3/c;->q0(F)F

    move-result p2

    sub-float/2addr p1, p2

    invoke-virtual {p0}, Lfz0/d;->f()F

    move-result p0

    mul-float/2addr p0, p1

    float-to-int p0, p0

    int-to-long p0, p0

    const/16 p2, 0x20

    shl-long/2addr p0, p2

    const/4 p2, 0x0

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long/2addr p0, v0

    new-instance p2, Ly3/j;

    invoke-direct {p2, p0, p1}, Ly3/j;-><init>(J)V

    return-object p2
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Lfz0/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ln71/h;->e(Landroidx/compose/ui/Modifier;Lfz0/d;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
