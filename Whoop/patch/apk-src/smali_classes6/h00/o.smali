.class public abstract Lh00/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    int-to-float v0, v0

    sput v0, Lh00/o;->a:F

    const/16 v0, 0x19

    int-to-float v0, v0

    sput v0, Lh00/o;->b:F

    return-void
.end method

.method public static final a(Lse/h;ZLc93/a;Landroidx/compose/ui/Modifier;Lh20/n1;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p5, Lp1/q;

    const v0, 0xc86dcbc

    invoke-virtual {p5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p5, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p6

    goto :goto_1

    :cond_1
    move v0, p6

    :goto_1
    and-int/lit8 v1, p6, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p5, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p6, 0x180

    if-nez v1, :cond_5

    invoke-virtual {p5, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    or-int/lit16 v0, v0, 0x6c00

    and-int/lit16 v0, v0, 0x2493

    const/16 v1, 0x2492

    if-ne v0, v1, :cond_7

    invoke-virtual {p5}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {p5}, Lp1/q;->X()V

    :goto_4
    move-object v4, p3

    move-object v5, p4

    goto :goto_8

    :cond_7
    :goto_5
    sget-object p4, Lh20/n1;->w:Lh20/n1;

    const p3, 0x317fb54f

    invoke-virtual {p5, p3}, Lp1/q;->e0(I)V

    if-eqz p1, :cond_8

    const/high16 p3, 0x3f800000    # 1.0f

    goto :goto_7

    :cond_8
    sget-object p3, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {p5, p3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Li2/x;

    iget-wide v0, p3, Li2/x;->a:J

    sget-object p3, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {p5, p3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lg1/c1;

    invoke-virtual {p3}, Lg1/c1;->i()Z

    move-result p3

    if-eqz p3, :cond_9

    invoke-static {v0, v1}, Li2/w0;->x(J)F

    goto :goto_6

    :cond_9
    invoke-static {v0, v1}, Li2/w0;->x(J)F

    :goto_6
    const p3, 0x3ec28f5c    # 0.38f

    :goto_7
    const/4 v0, 0x0

    invoke-virtual {p5, v0}, Lp1/q;->q(Z)V

    sget-object v0, Lg1/j1;->a:Lp1/b0;

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {v0, p3}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p3

    new-instance v0, Lh00/m;

    const/4 v1, 0x1

    invoke-direct {v0, p2, p1, p0, v1}, Lh00/m;-><init>(Lc93/a;ZLse/h;I)V

    const v1, 0x40fd0ffc

    invoke-static {v1, p5, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {p3, v0, p5, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p3, Lb2/t;->w:Lb2/t;

    goto :goto_4

    :goto_8
    invoke-virtual {p5}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_a

    new-instance v0, Lb30/j2;

    const/4 v7, 0x6

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v6, p6

    invoke-direct/range {v0 .. v7}, Lb30/j2;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method public static final b(ILandroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, -0x2a69ad09

    invoke-virtual {v5, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v5, p0}, Lp1/q;->e(I)Z

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 v1, p1, 0x3

    if-ne v1, v0, :cond_2

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    goto :goto_2

    :cond_2
    :goto_1
    const v0, 0x40313b14

    const/4 v1, 0x0

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v1, v0}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lg1/j1;->a:Lp1/b0;

    invoke-virtual {v5, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1, v0}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    and-int/lit8 p1, p1, 0xe

    invoke-static {p0, v5, p1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    const p1, 0x7f14102c

    invoke-static {v5, p1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-wide v3, Li2/x;->n:J

    const/16 v6, 0xc00

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    :goto_2
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v0, Lf01/c0;

    invoke-direct {v0, p0, p2}, Lf01/c0;-><init>(II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public static final c(JLandroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v5, p2

    check-cast v5, Lp1/q;

    const p2, 0x1c25fac5

    invoke-virtual {v5, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v5, p0, p1}, Lp1/q;->f(J)Z

    move-result p2

    const/4 v0, 0x2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    or-int/2addr p2, p3

    and-int/lit8 v1, p2, 0x3

    if-ne v1, v0, :cond_2

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    move-wide v1, p0

    goto :goto_2

    :cond_2
    :goto_1
    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 v1, 0x1

    int-to-float v1, v1

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    shl-int/lit8 p2, p2, 0x3

    and-int/lit8 p2, p2, 0x70

    or-int/lit8 v6, p2, 0x6

    const/16 v7, 0xc

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-wide v1, p0

    invoke-static/range {v0 .. v7}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    :goto_2
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_3

    new-instance p1, Lh00/k;

    invoke-direct {p1, v1, v2, p3}, Lh00/k;-><init>(JI)V

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public static final d(Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move/from16 v0, p1

    sget-object v1, Lh20/n1;->w:Lh20/n1;

    move-object/from16 v2, p0

    check-cast v2, Lp1/q;

    const v3, 0x7bfafc79

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    or-int/2addr v1, v0

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    const/4 v3, 0x3

    and-int/2addr v1, v3

    if-ne v1, v4, :cond_3

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    move-object/from16 v24, v2

    goto/16 :goto_3

    :cond_3
    :goto_2
    const v1, -0x3dc7113f

    invoke-virtual {v2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v1, v4, :cond_4

    new-instance v1, Ll3/d;

    invoke-direct {v1}, Ll3/d;-><init>()V

    const-string v5, "LinkIcon"

    const-string v6, "[icon]"

    invoke-static {v1, v5, v6}, Lu0/n0;->j(Ll3/d;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "LinkDividerSpacer"

    const-string v6, "[divider_spacer]"

    invoke-static {v1, v5, v6}, Lu0/n0;->j(Ll3/d;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "LinkDivider"

    const-string v8, "[divider]"

    invoke-static {v1, v7, v8}, Lu0/n0;->j(Ll3/d;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1, v5, v6}, Lu0/n0;->j(Ll3/d;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ll3/d;->k()Ll3/g;

    move-result-object v1

    invoke-virtual {v2, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Ll3/g;

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Lp1/q;->q(Z)V

    const/16 v6, 0x10

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v6

    const v8, -0x548d6062

    invoke-virtual {v2, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v2, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg00/e;

    invoke-virtual {v2, v5}, Lp1/q;->q(Z)V

    iget-object v8, v8, Lg00/e;->c:Ll3/v0;

    const v9, -0x3dc6a68f

    invoke-virtual {v2, v9}, Lp1/q;->e0(I)V

    new-instance v10, Lbi/p;

    const/4 v9, 0x3

    invoke-direct {v10, v9}, Lbi/p;-><init>(I)V

    int-to-float v3, v3

    const-wide v11, 0x200000000L

    invoke-static {v3, v11, v12}, Lv63/c;->j(FJ)J

    move-result-wide v13

    const-wide v15, 0x3ff199999999999aL    # 1.1

    invoke-static/range {v15 .. v16}, Lv63/c;->f(D)J

    move-result-wide v15

    new-instance v3, Lh00/n;

    const/4 v9, 0x0

    invoke-direct {v3, v9}, Lh00/n;-><init>(I)V

    const v9, 0x711fa9bc

    invoke-static {v9, v2, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    move-wide/from16 v17, v11

    const-string v11, "LinkIcon"

    move-wide v12, v13

    move-wide v14, v15

    move-object/from16 v16, v3

    invoke-virtual/range {v10 .. v16}, Lbi/p;->a(Ljava/lang/String;JJLx1/b;)V

    const-wide v11, 0x3fb999999999999aL    # 0.1

    invoke-static {v11, v12}, Lv63/c;->f(D)J

    move-result-wide v12

    const-wide v14, 0x3ff4cccccccccccdL    # 1.3

    invoke-static {v14, v15}, Lv63/c;->f(D)J

    move-result-wide v14

    new-instance v3, Lh00/n;

    const/4 v9, 0x1

    invoke-direct {v3, v9}, Lh00/n;-><init>(I)V

    const v9, 0x6a24fbf3

    invoke-static {v9, v2, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    const-string v11, "LinkDivider"

    invoke-virtual/range {v10 .. v16}, Lbi/p;->a(Ljava/lang/String;JJLx1/b;)V

    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    invoke-static {v11, v12}, Lv63/c;->f(D)J

    move-result-wide v12

    int-to-float v3, v5

    const-wide v14, 0x200000000L

    invoke-static {v3, v14, v15}, Lv63/c;->j(FJ)J

    move-result-wide v14

    sget-object v16, Loy/b;->a:Lx1/b;

    const-string v11, "LinkDividerSpacer"

    invoke-virtual/range {v10 .. v16}, Lbi/p;->a(Ljava/lang/String;JJLx1/b;)V

    invoke-virtual {v2, v5}, Lp1/q;->q(Z)V

    const v3, -0x3dc67d38

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_5

    new-instance v3, Lgo1/a;

    const/16 v4, 0x19

    invoke-direct {v3, v4}, Lgo1/a;-><init>(I)V

    invoke-virtual {v2, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2, v5}, Lp1/q;->q(Z)V

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5, v3}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v26, 0xc30

    const v27, 0x157f4

    const-wide/16 v4, 0x0

    move-object/from16 v23, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v13, v11

    const-wide/16 v11, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const-wide/16 v15, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x2

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x1

    move-object/from16 v21, v20

    const/16 v20, 0x0

    iget-object v10, v10, Lbi/p;->a:Ljava/util/LinkedHashMap;

    const/16 v22, 0x0

    const/16 v25, 0xc06

    move-object/from16 v24, v21

    move-object/from16 v21, v10

    move-object/from16 v10, v24

    move-object/from16 v24, v2

    move-object v2, v1

    invoke-static/range {v2 .. v27}, Lg1/f9;->c(Ll3/g;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_3
    invoke-virtual/range {v24 .. v24}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v2, Lf01/c0;

    invoke-direct {v2, v0}, Lf01/c0;-><init>(I)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final e(Lq00/o;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p2

    sget-object v2, Lh20/n1;->w:Lh20/n1;

    move-object/from16 v3, p1

    check-cast v3, Lp1/q;

    const v4, 0x1d8bc07c

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v1

    invoke-virtual {v3, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    const/16 v6, 0x10

    if-eqz v2, :cond_1

    const/16 v2, 0x20

    goto :goto_1

    :cond_1
    move v2, v6

    :goto_1
    or-int/2addr v2, v4

    and-int/lit8 v4, v2, 0x13

    const/16 v7, 0x12

    if-ne v4, v7, :cond_3

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v2, v3

    goto/16 :goto_6

    :cond_3
    :goto_2
    shr-int/lit8 v4, v2, 0x3

    and-int/lit8 v4, v4, 0xe

    invoke-static {v3}, Lh00/o;->j(Landroidx/compose/runtime/Composer;)J

    move-result-wide v7

    sget-object v9, Lg1/j1;->a:Lp1/b0;

    invoke-virtual {v3, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    move-result v9

    invoke-static {v9, v7, v8}, Li2/x;->c(FJ)J

    move-result-wide v7

    sget-object v9, Lb2/e;->K:Lb2/l;

    sget-object v10, Ll0/m;->a:Ll0/e;

    const/16 v11, 0x30

    invoke-static {v10, v9, v3, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v10, v3, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v15, v3, Lp1/q;->S:Z

    if-eqz v15, :cond_4

    invoke-virtual {v3, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_3
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v3, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v3, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v11, v3, Lp1/q;->S:Z

    if-nez v11, :cond_5

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    :cond_5
    invoke-static {v10, v3, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v3, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v4}, Lh00/o;->d(Landroidx/compose/runtime/Composer;I)V

    and-int/lit8 v2, v2, 0xe

    invoke-static {v0, v3, v2}, Lh00/o;->f(Lq00/o;Landroidx/compose/runtime/Composer;I)V

    int-to-float v2, v5

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v3, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    iget-object v2, v0, Lq00/o;->x:Ljava/lang/String;

    const v4, -0x548d6062

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v3, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg00/e;

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Lp1/q;->q(Z)V

    iget-object v4, v4, Lg00/e;->c:Ll3/v0;

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v9

    const/high16 v6, 0x3f000000    # 0.5f

    float-to-double v11, v6

    const-wide/16 v13, 0x0

    cmpl-double v11, v11, v13

    if-lez v11, :cond_7

    :goto_4
    move-object/from16 v23, v4

    goto :goto_5

    :cond_7
    const-string v11, "invalid weight; must be greater than zero"

    invoke-static {v11}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_4

    :goto_5
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v4, v6, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v26, 0xc30

    const v27, 0xd7f0

    move-wide v5, v7

    move-wide v7, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x2

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0xc00

    move-object/from16 v24, v3

    move-object v3, v2

    invoke-static/range {v3 .. v27}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_8

    new-instance v3, Lh00/l;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v4}, Lh00/l;-><init>(Lq00/o;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final f(Lq00/o;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v7, p1

    check-cast v7, Lp1/q;

    const p1, -0x64e70378

    invoke-virtual {v7, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 p1, p1, 0x3

    if-ne p1, v0, :cond_2

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_2
    :goto_1
    const/16 p1, 0x18

    int-to-float p1, p1

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v1, Lb2/e;->w:Lb2/m;

    const/4 v10, 0x0

    invoke-static {v1, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v2, v7, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v7, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-eqz v5, :cond_3

    invoke-virtual {v7, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_2
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v7, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v7, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    invoke-static {v2, v7, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v7, v1, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object p1, p0, Lq00/o;->w:Lq00/n;

    instance-of v1, p1, Lq00/m;

    if-eqz v1, :cond_6

    const v1, 0x3bb99159

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    check-cast p1, Lq00/m;

    iget p1, p1, Lq00/m;->w:I

    invoke-static {p1, v7, v10}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object p1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v8, 0x61b0

    const/16 v9, 0x68

    const/4 v1, 0x0

    const/4 v3, 0x0

    sget-object v4, Ly2/j;->b:Ly2/b1;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_6
    instance-of v0, p1, Lq00/l;

    if-eqz v0, :cond_8

    const v0, 0x3bb9b5e5

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    check-cast p1, Lq00/l;

    iget-object p1, p1, Lq00/l;->w:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p1, v0, v7, v10}, Lkotlin/jvm/internal/j;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    :goto_3
    const/4 p1, 0x1

    invoke-virtual {v7, p1}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v0, Lh00/l;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p2, v1}, Lh00/l;-><init>(Lq00/o;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void

    :cond_8
    const p0, 0x3bb987eb

    invoke-static {p0, v7, v10}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0
.end method

.method public static final g(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v0, p0

    move/from16 v1, p2

    sget-object v2, Lh20/n1;->w:Lh20/n1;

    move-object/from16 v3, p1

    check-cast v3, Lp1/q;

    const v4, 0x6d75bdf

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v1

    invoke-virtual {v3, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    const/16 v6, 0x10

    if-eqz v2, :cond_1

    const/16 v2, 0x20

    goto :goto_1

    :cond_1
    move v2, v6

    :goto_1
    or-int/2addr v2, v4

    and-int/lit8 v4, v2, 0x13

    const/16 v7, 0x12

    if-ne v4, v7, :cond_3

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lp1/q;->X()V

    goto/16 :goto_7

    :cond_3
    :goto_2
    const v4, -0xbb5d279

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    and-int/lit8 v4, v2, 0xe

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-ne v4, v5, :cond_4

    move v4, v7

    goto :goto_3

    :cond_4
    move v4, v8

    :goto_3
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_5

    if-ne v5, v9, :cond_7

    :cond_5
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v12

    move v13, v8

    :goto_4
    if-ge v13, v12, :cond_6

    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll3/c;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v15

    invoke-virtual {v14, v15}, Ll3/c;->a(I)Ll3/e;

    move-result-object v14

    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    :cond_6
    new-instance v5, Ll3/g;

    invoke-direct {v5, v10, v11}, Ll3/g;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Ll3/g;

    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    shr-int/lit8 v2, v2, 0x3

    and-int/lit8 v2, v2, 0xe

    invoke-static {v3}, Lh00/o;->j(Landroidx/compose/runtime/Composer;)J

    move-result-wide v10

    sget-object v4, Lg1/j1;->a:Lp1/b0;

    invoke-virtual {v3, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4, v10, v11}, Li2/x;->c(FJ)J

    move-result-wide v10

    new-array v4, v8, [Ljava/lang/Object;

    sget-object v12, Lm83/y;->w:Lm83/y;

    const v13, 0x7f14104e

    invoke-static {v13, v4, v12}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v4

    sget-object v12, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v3, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/content/Context;

    invoke-virtual {v4, v12}, Lzy/b;->M(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const v12, -0xbb5a532

    invoke-virtual {v3, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_8

    if-ne v13, v9, :cond_9

    :cond_8
    new-instance v13, Lb30/y4;

    const/16 v9, 0x1a

    invoke-direct {v13, v4, v9}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v3, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v7, v13}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, Ll0/m;->a:Ll0/e;

    sget-object v12, Lb2/e;->J:Lb2/l;

    invoke-static {v9, v12, v3, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v12, v3, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v15, v3, Lp1/q;->S:Z

    if-eqz v15, :cond_a

    invoke-virtual {v3, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_a
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_5
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v3, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v3, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v13, v3, Lp1/q;->S:Z

    if-nez v13, :cond_b

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_c

    :cond_b
    invoke-static {v12, v3, v12, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v3, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v2}, Lh00/o;->d(Landroidx/compose/runtime/Composer;I)V

    const v2, -0x548d6062

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v3, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg00/e;

    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    iget-object v2, v2, Lg00/e;->c:Ll3/v0;

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v12

    const/high16 v4, 0x3f000000    # 0.5f

    float-to-double v14, v4

    const-wide/16 v16, 0x0

    cmpl-double v6, v14, v16

    if-lez v6, :cond_d

    goto :goto_6

    :cond_d
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v6, v4, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v27, 0xc30

    const v28, 0x1d7f0

    const/4 v9, 0x0

    move-object/from16 v25, v3

    move-object v3, v5

    move-object v4, v6

    move-wide v5, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v14, v7

    move-wide v7, v12

    const-wide/16 v12, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v19, v18

    const/16 v18, 0x2

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x1

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    const/16 v26, 0xc00

    move/from16 v29, v24

    move-object/from16 v24, v2

    move/from16 v2, v29

    invoke-static/range {v3 .. v28}, Lg1/f9;->c(Ll3/g;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_e

    new-instance v3, Lb30/z;

    invoke-direct {v3, v0, v1}, Lb30/z;-><init>(Ljava/lang/String;I)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final h(Ll0/s1;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move/from16 v0, p2

    sget-object v1, Lh20/n1;->w:Lh20/n1;

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x529f451f

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x30

    const/16 v4, 0x10

    if-nez v3, :cond_1

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    or-int/2addr v1, v0

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    and-int/lit8 v1, v1, 0x11

    if-ne v1, v4, :cond_3

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    move-object/from16 v24, v2

    goto/16 :goto_3

    :cond_3
    :goto_2
    const v1, 0x7f14104e

    invoke-static {v2, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ll3/d;

    invoke-direct {v3}, Ll3/d;-><init>()V

    const-string v4, "Link"

    invoke-static {v1, v4}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll3/d;->b(Ljava/lang/String;)V

    const-string v5, "[icon]"

    const-string v6, "LinkIcon"

    invoke-static {v3, v6, v5}, Lu0/n0;->j(Ll3/d;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1, v4, v1}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll3/d;->b(Ljava/lang/String;)V

    invoke-virtual {v3}, Ll3/d;->k()Ll3/g;

    move-result-object v3

    const v4, -0x65c60fb

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    const-wide v7, 0x4004cccccccccccdL    # 2.6

    invoke-static {v7, v8}, Lv63/c;->f(D)J

    move-result-wide v10

    const-wide v7, 0x3feccccccccccccdL    # 0.9

    invoke-static {v7, v8}, Lv63/c;->f(D)J

    move-result-wide v12

    new-instance v5, Lh00/n;

    const/4 v7, 0x2

    invoke-direct {v5, v7}, Lh00/n;-><init>(I)V

    const v7, -0x54c04bc0

    invoke-static {v7, v2, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    new-instance v7, Lu0/j0;

    new-instance v9, Ll3/d0;

    const/4 v14, 0x4

    invoke-direct/range {v9 .. v14}, Ll3/d0;-><init>(JJI)V

    new-instance v8, Lb30/k2;

    const/16 v10, 0x8

    invoke-direct {v8, v5, v10}, Lb30/k2;-><init>(Lx1/b;I)V

    new-instance v5, Lx1/b;

    const/4 v10, 0x1

    const v11, -0x35f71b98    # -2242842.0f

    invoke-direct {v5, v8, v10, v11}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-direct {v7, v9, v5}, Lu0/j0;-><init>(Ll3/d0;Lx1/b;)V

    invoke-interface {v4, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Lp1/q;->q(Z)V

    const/4 v6, 0x6

    int-to-float v8, v6

    const/4 v11, 0x0

    const/16 v12, 0xe

    sget-object v7, Lb2/t;->w:Lb2/t;

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v7, -0x65c42d4

    invoke-virtual {v2, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_4

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v8, v7, :cond_5

    :cond_4
    new-instance v8, Lb30/y4;

    const/16 v7, 0x19

    invoke-direct {v8, v1, v7}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2, v5}, Lp1/q;->q(Z)V

    invoke-static {v6, v5, v8}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v2}, Lh00/o;->j(Landroidx/compose/runtime/Composer;)J

    move-result-wide v6

    sget-object v8, Lg1/j1;->a:Lp1/b0;

    invoke-virtual {v2, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    invoke-static {v8, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v6

    const v8, -0x548d6062

    invoke-virtual {v2, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v2, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg00/e;

    invoke-virtual {v2, v5}, Lp1/q;->q(Z)V

    iget-object v5, v8, Lg00/e;->c:Ll3/v0;

    const/16 v8, 0x15

    invoke-static {v8}, Lv63/c;->h(I)J

    move-result-wide v8

    new-instance v14, Lw3/k;

    const/4 v10, 0x3

    invoke-direct {v14, v10}, Lw3/k;-><init>(I)V

    const/16 v26, 0xc30

    const v27, 0x155f0

    move-object/from16 v21, v4

    move-object/from16 v23, v5

    move-wide v4, v6

    move-wide v6, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x2

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v25, 0xc00

    move-object/from16 v24, v2

    move-object v2, v3

    move-object v3, v1

    invoke-static/range {v2 .. v27}, Lg1/f9;->c(Ll3/g;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_3
    invoke-virtual/range {v24 .. v24}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v2, Ld71/c;

    move-object/from16 v3, p0

    invoke-direct {v2, v3, v0}, Ld71/c;-><init>(Ll0/s1;I)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final i(Landroidx/compose/runtime/Composer;)I
    .locals 1

    sget-object v0, Lh20/n1;->w:Lh20/n1;

    check-cast p0, Lp1/q;

    const v0, 0x62c62c28

    invoke-virtual {p0, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    const p0, 0x7f08085f

    return p0
.end method

.method public static final j(Landroidx/compose/runtime/Composer;)J
    .locals 4

    sget-object v0, Lh20/n1;->w:Lh20/n1;

    check-cast p0, Lp1/q;

    const v0, 0x75d2269e

    invoke-virtual {p0, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lh20/n1;->w:Lh20/n1;

    sget-object v0, Lg00/d;->a:Lg00/b;

    const v0, -0x1a6f7841

    invoke-virtual {p0, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lg00/g;->c:Lp1/u2;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg00/b;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    const-string v2, "$this$contentOnPrimaryButton"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-wide v2, Lg00/a;->a:J

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    return-wide v2
.end method
