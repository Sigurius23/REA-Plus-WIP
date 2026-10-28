.class public abstract Ly11/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aM\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0016\u0008\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "percent",
        "Li2/x;",
        "fillColor",
        "",
        "showAverage",
        "Ll83/k;",
        "averageRange",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;FJZLl83/k;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;FJZLl83/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Ly11/g;->c(Landroidx/compose/ui/Modifier;FJZLl83/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;FJZLl83/k;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "FJZ",
            "Ll83/k;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v7, p7

    move-object/from16 v15, p6

    check-cast v15, Lp1/q;

    const v0, 0x36c047bd

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v7, 0x6

    move v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v7, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v7

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v2, v7

    :goto_1
    and-int/lit8 v3, v7, 0x30

    if-nez v3, :cond_4

    move/from16 v3, p1

    invoke-virtual {v15, v3}, Lp1/q;->d(F)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    goto :goto_3

    :cond_4
    move/from16 v3, p1

    :goto_3
    and-int/lit16 v4, v7, 0x180

    if-nez v4, :cond_7

    and-int/lit8 v4, p8, 0x4

    if-nez v4, :cond_5

    move-wide/from16 v4, p2

    invoke-virtual {v15, v4, v5}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    move-wide/from16 v4, p2

    :cond_6
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v2, v6

    goto :goto_5

    :cond_7
    move-wide/from16 v4, p2

    :goto_5
    and-int/lit8 v6, p8, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v2, v2, 0xc00

    :cond_8
    move/from16 v8, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v7, 0xc00

    if-nez v8, :cond_8

    move/from16 v8, p4

    invoke-virtual {v15, v8}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v2, v9

    :goto_7
    and-int/lit8 v9, p8, 0x10

    if-eqz v9, :cond_c

    or-int/lit16 v2, v2, 0x6000

    :cond_b
    move-object/from16 v10, p5

    goto :goto_9

    :cond_c
    and-int/lit16 v10, v7, 0x6000

    if-nez v10, :cond_b

    move-object/from16 v10, p5

    invoke-virtual {v15, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    const/16 v11, 0x4000

    goto :goto_8

    :cond_d
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v2, v11

    :goto_9
    and-int/lit16 v11, v2, 0x2493

    const/16 v12, 0x2492

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v11, v12, :cond_e

    move v11, v14

    goto :goto_a

    :cond_e
    move v11, v13

    :goto_a
    and-int/lit8 v12, v2, 0x1

    invoke-virtual {v15, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_16

    invoke-virtual {v15}, Lp1/q;->Z()V

    and-int/lit8 v11, v7, 0x1

    if-eqz v11, :cond_11

    invoke-virtual {v15}, Lp1/q;->C()Z

    move-result v11

    if-eqz v11, :cond_f

    goto :goto_c

    :cond_f
    invoke-virtual {v15}, Lp1/q;->X()V

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_10

    and-int/lit16 v2, v2, -0x381

    :cond_10
    move-object v9, v1

    :goto_b
    move-wide v11, v4

    move-object v14, v10

    goto :goto_e

    :cond_11
    :goto_c
    if-eqz v0, :cond_12

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_d

    :cond_12
    move-object v0, v1

    :goto_d
    and-int/lit8 v1, p8, 0x4

    if-eqz v1, :cond_13

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v1, v15, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v4

    and-int/lit16 v2, v2, -0x381

    :cond_13
    if-eqz v6, :cond_14

    move v8, v14

    :cond_14
    if-eqz v9, :cond_15

    const/4 v1, 0x0

    move-object v9, v0

    move-object v14, v1

    move-wide v11, v4

    goto :goto_e

    :cond_15
    move-object v9, v0

    goto :goto_b

    :goto_e
    invoke-virtual {v15}, Lp1/q;->r()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v1, "Horizontal Bar Graph"

    const/16 v4, 0x36

    invoke-static {v0, v1, v15, v4, v13}, Ld0/d2;->f(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/z1;

    move-result-object v0

    new-instance v1, Ll83/k;

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-direct {v1, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v10

    shl-int/lit8 v1, v2, 0x3

    const v2, 0x7fc70

    and-int v16, v1, v2

    const/16 v17, 0x0

    move v13, v8

    move-object v8, v0

    invoke-static/range {v8 .. v17}, Lb21/d;->j(Ld0/z1;Landroidx/compose/ui/Modifier;Ljava/util/List;JZLl83/k;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v9

    move-wide v3, v11

    move v5, v13

    move-object v6, v14

    goto :goto_f

    :cond_16
    invoke-virtual {v15}, Lp1/q;->X()V

    move-wide v3, v4

    move v5, v8

    move-object v6, v10

    :goto_f
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_17

    new-instance v0, Lt81/j;

    move/from16 v2, p1

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lt81/j;-><init>(Landroidx/compose/ui/Modifier;FJZLl83/k;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;FJZLl83/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move v2, p1

    move-wide v3, p2

    move v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Ly11/g;->b(Landroidx/compose/ui/Modifier;FJZLl83/k;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
