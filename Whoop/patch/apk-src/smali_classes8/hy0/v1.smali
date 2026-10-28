.class public abstract Lhy0/v1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a?\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lhy0/a2;",
        "trendType",
        "Li2/a1;",
        "shape",
        "Ly3/f;",
        "padding",
        "size",
        "shrinkIcon",
        "Ll83/a0;",
        "b",
        "(Lhy0/a2;Li2/a1;FFFLandroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lhy0/a2;Li2/a1;FFFIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lhy0/v1;->c(Lhy0/a2;Li2/a1;FFFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lhy0/a2;Li2/a1;FFFLandroidx/compose/runtime/Composer;II)V
    .locals 16

    move-object/from16 v1, p0

    move/from16 v6, p6

    const-string v0, "trendType"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x2d4f0cee    # -3.7999614E11f

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v3, v6, 0x30

    if-nez v3, :cond_4

    and-int/lit8 v3, p7, 0x2

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    move-object/from16 v3, p1

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    goto :goto_3

    :cond_4
    move-object/from16 v3, p1

    :goto_3
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move/from16 v5, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_5

    move/from16 v5, p2

    invoke-virtual {v12, v5}, Lp1/q;->d(F)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :goto_5
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move/from16 v8, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v6, 0xc00

    if-nez v8, :cond_8

    move/from16 v8, p3

    invoke-virtual {v12, v8}, Lp1/q;->d(F)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v0, v9

    :goto_7
    and-int/lit8 v9, p7, 0x10

    if-eqz v9, :cond_c

    or-int/lit16 v0, v0, 0x6000

    :cond_b
    move/from16 v10, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v10, v6, 0x6000

    if-nez v10, :cond_b

    move/from16 v10, p4

    invoke-virtual {v12, v10}, Lp1/q;->d(F)Z

    move-result v11

    if-eqz v11, :cond_d

    const/16 v11, 0x4000

    goto :goto_8

    :cond_d
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v0, v11

    :goto_9
    and-int/lit16 v11, v0, 0x2493

    const/16 v13, 0x2492

    const/4 v15, 0x0

    const/4 v14, 0x1

    if-eq v11, v13, :cond_e

    move v11, v14

    goto :goto_a

    :cond_e
    move v11, v15

    :goto_a
    and-int/2addr v0, v14

    invoke-virtual {v12, v0, v11}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v0, v6, 0x1

    if-eqz v0, :cond_11

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_b

    :cond_f
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v0, v3

    move v3, v5

    :cond_10
    move v2, v8

    move v4, v10

    goto :goto_e

    :cond_11
    :goto_b
    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_12

    sget-object v0, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v0}, Lkd1/w;->c()Lk91/a;

    move-result-object v0

    invoke-virtual {v0}, Lk91/a;->c()Lt0/i;

    move-result-object v0

    goto :goto_c

    :cond_12
    move-object v0, v3

    :goto_c
    if-eqz v4, :cond_13

    int-to-float v3, v14

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    goto :goto_d

    :cond_13
    move v3, v5

    :goto_d
    if-eqz v7, :cond_14

    const/4 v4, 0x3

    int-to-float v4, v4

    int-to-float v2, v2

    mul-float/2addr v2, v4

    move v8, v2

    :cond_14
    if-eqz v9, :cond_10

    const/high16 v2, 0x7fc00000    # Float.NaN

    move v4, v2

    move v2, v8

    :goto_e
    invoke-virtual {v12}, Lp1/q;->r()V

    invoke-virtual {v1}, Lhy0/a2;->f()Ljava/lang/Integer;

    move-result-object v5

    if-nez v5, :cond_15

    const v5, 0x5dd2079d

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_15
    const v7, 0x5dd2079e

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-virtual {v1}, Lhy0/a2;->c()J

    move-result-wide v7

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v7, v8, v0}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v8

    if-nez v8, :cond_16

    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    :cond_16
    invoke-interface {v7, v9}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v7, 0x6

    invoke-static {v5, v12, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v7

    invoke-static {v5, v12, v15}, Lhy0/z1;->h(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lhy0/a2;->e()J

    move-result-wide v10

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    :goto_f
    move v5, v4

    move v4, v2

    move-object v2, v0

    goto :goto_10

    :cond_17
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v2, v3

    move v3, v5

    move v4, v8

    move v5, v10

    :goto_10
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_18

    new-instance v0, Lhy0/u1;

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lhy0/u1;-><init>(Lhy0/a2;Li2/a1;FFFII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final c(Lhy0/a2;Li2/a1;FFFIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lhy0/v1;->b(Lhy0/a2;Li2/a1;FFFLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
