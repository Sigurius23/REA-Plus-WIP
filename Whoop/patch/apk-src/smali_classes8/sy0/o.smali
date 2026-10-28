.class public abstract Lsy0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a[\u0010\r\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\n\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "",
        "initialToggle",
        "Lcom/whoop/design/util/TextResource;",
        "contentDescription",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onToggle",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "isEnabled",
        "localMinimumInteractiveComponentEnforcement",
        "Li2/x;",
        "checkedColor",
        "d",
        "(ZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZJLandroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsy0/o;->f(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ljava/lang/String;JZLkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lsy0/o;->e(Landroidx/compose/ui/Modifier;Ljava/lang/String;JZLkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZJIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lsy0/o;->g(ZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(ZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZJLandroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/whoop/design/util/TextResource;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "ZZJ",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v9, p2

    move/from16 v0, p9

    const-string v1, "contentDescription"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onToggle"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p8

    check-cast v1, Lp1/q;

    const v3, 0x5e68e0d3

    invoke-virtual {v1, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    move/from16 v8, p0

    if-nez v3, :cond_1

    invoke-virtual {v1, v8}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v0

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    and-int/lit8 v4, v0, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit16 v4, v0, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v1, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v3, v4

    :cond_5
    and-int/lit8 v4, p10, 0x8

    if-eqz v4, :cond_7

    or-int/lit16 v3, v3, 0xc00

    :cond_6
    move-object/from16 v5, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v5, v0, 0xc00

    if-nez v5, :cond_6

    move-object/from16 v5, p3

    invoke-virtual {v1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x800

    goto :goto_4

    :cond_8
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v3, v6

    :goto_5
    and-int/lit8 v6, p10, 0x10

    if-eqz v6, :cond_a

    or-int/lit16 v3, v3, 0x6000

    :cond_9
    move/from16 v7, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v7, v0, 0x6000

    if-nez v7, :cond_9

    move/from16 v7, p4

    invoke-virtual {v1, v7}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x4000

    goto :goto_6

    :cond_b
    const/16 v10, 0x2000

    :goto_6
    or-int/2addr v3, v10

    :goto_7
    and-int/lit8 v10, p10, 0x20

    const/high16 v11, 0x30000

    if-eqz v10, :cond_d

    or-int/2addr v3, v11

    :cond_c
    move/from16 v11, p5

    goto :goto_9

    :cond_d
    and-int/2addr v11, v0

    if-nez v11, :cond_c

    move/from16 v11, p5

    invoke-virtual {v1, v11}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_e

    const/high16 v12, 0x20000

    goto :goto_8

    :cond_e
    const/high16 v12, 0x10000

    :goto_8
    or-int/2addr v3, v12

    :goto_9
    const/high16 v12, 0x180000

    and-int/2addr v12, v0

    if-nez v12, :cond_11

    and-int/lit8 v12, p10, 0x40

    if-nez v12, :cond_f

    move-wide/from16 v12, p6

    invoke-virtual {v1, v12, v13}, Lp1/q;->f(J)Z

    move-result v14

    if-eqz v14, :cond_10

    const/high16 v14, 0x100000

    goto :goto_a

    :cond_f
    move-wide/from16 v12, p6

    :cond_10
    const/high16 v14, 0x80000

    :goto_a
    or-int/2addr v3, v14

    goto :goto_b

    :cond_11
    move-wide/from16 v12, p6

    :goto_b
    const v14, 0x92493

    and-int/2addr v14, v3

    const v15, 0x92492

    const/16 v16, 0x0

    const/16 v17, 0x1

    if-eq v14, v15, :cond_12

    move/from16 v14, v17

    goto :goto_c

    :cond_12
    move/from16 v14, v16

    :goto_c
    and-int/lit8 v15, v3, 0x1

    invoke-virtual {v1, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_19

    invoke-virtual {v1}, Lp1/q;->Z()V

    and-int/lit8 v14, v0, 0x1

    const v15, -0x380001

    if-eqz v14, :cond_15

    invoke-virtual {v1}, Lp1/q;->C()Z

    move-result v14

    if-eqz v14, :cond_13

    goto :goto_e

    :cond_13
    invoke-virtual {v1}, Lp1/q;->X()V

    and-int/lit8 v4, p10, 0x40

    if-eqz v4, :cond_14

    :goto_d
    and-int/2addr v3, v15

    :cond_14
    move-object v4, v5

    move v10, v7

    move-wide v6, v12

    goto :goto_f

    :cond_15
    :goto_e
    if-eqz v4, :cond_16

    sget-object v4, Lb2/t;->w:Lb2/t;

    move-object v5, v4

    :cond_16
    if-eqz v6, :cond_17

    move/from16 v7, v17

    :cond_17
    if-eqz v10, :cond_18

    move/from16 v11, v16

    :cond_18
    and-int/lit8 v4, p10, 0x40

    if-eqz v4, :cond_14

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v4, v1, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v12

    goto :goto_d

    :goto_f
    invoke-virtual {v1}, Lp1/q;->r()V

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v2, v1, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v3, Lg1/h3;->a:Lp1/u2;

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-virtual {v3, v12}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v12

    new-instance v3, Lg40/j3;

    invoke-direct/range {v3 .. v10}, Lg40/j3;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;JZLkotlin/jvm/functions/Function1;Z)V

    const v5, -0x263dbbed

    invoke-static {v5, v1, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v5, 0x38

    invoke-static {v12, v3, v1, v5}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-wide v7, v6

    move v5, v10

    :goto_10
    move v6, v11

    goto :goto_11

    :cond_19
    invoke-virtual {v1}, Lp1/q;->X()V

    move-object v4, v5

    move v5, v7

    move-wide v7, v12

    goto :goto_10

    :goto_11
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_1a

    new-instance v0, Lsy0/n;

    move/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lsy0/n;-><init>(ZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZJII)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Ljava/lang/String;JZLkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 15

    move-object/from16 v0, p1

    and-int/lit8 v1, p8, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    and-int/lit8 v2, p8, 0x1

    move-object/from16 v9, p7

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, Lr51/d;

    const/4 v1, 0x4

    invoke-direct {v2, v0, v1}, Lr51/d;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, v3, v2}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v1, 0x6

    invoke-virtual {v0, v9, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->w()J

    move-result-wide v2

    invoke-virtual {v0, v9, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v6

    const/4 v13, 0x0

    const/16 v14, 0x18

    const-wide/16 v10, 0x0

    move-wide/from16 v4, p2

    move-object v12, v9

    move-wide v8, v2

    invoke-static/range {v4 .. v14}, Ldp/d;->r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;

    move-result-object v8

    move-object v9, v12

    const/4 v10, 0x0

    const/16 v11, 0x10

    move-object v6, p0

    move/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v7, p6

    invoke-static/range {v4 .. v11}, Lg1/b1;->a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLg1/a1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(ZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZJIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-wide/from16 v7, p6

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lsy0/o;->d(ZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZJLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
