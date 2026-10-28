.class public abstract Ll1/u4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:Ll0/l1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x4

    int-to-float v0, v0

    sput v0, Ll1/u4;->a:F

    const/16 v1, 0x18

    int-to-float v1, v1

    sput v1, Ll1/u4;->b:F

    const/16 v1, 0x28

    int-to-float v1, v1

    sput v1, Ll1/u4;->c:F

    const/16 v1, 0x8

    int-to-float v1, v1

    new-instance v2, Ll0/l1;

    invoke-direct {v2, v1, v0, v1, v0}, Ll0/l1;-><init>(FFFF)V

    sput-object v2, Ll1/u4;->d:Ll0/l1;

    return-void
.end method

.method public static final a(Ll1/w4;Landroidx/compose/ui/Modifier;FLi2/a1;JJFFLx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v11, p10

    move/from16 v12, p12

    move-object/from16 v0, p11

    check-cast v0, Lp1/q;

    const v2, -0x147d586e

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v12, 0x6

    if-nez v2, :cond_2

    and-int/lit8 v2, v12, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_1

    :cond_1
    const/4 v2, 0x2

    :goto_1
    or-int/2addr v2, v12

    goto :goto_2

    :cond_2
    move v2, v12

    :goto_2
    or-int/lit16 v3, v2, 0xdb0

    and-int/lit16 v4, v12, 0x6000

    if-nez v4, :cond_3

    or-int/lit16 v3, v2, 0x2db0

    :cond_3
    const/high16 v2, 0x30000

    and-int/2addr v2, v12

    if-nez v2, :cond_4

    const/high16 v2, 0x10000

    or-int/2addr v3, v2

    :cond_4
    const/high16 v2, 0x180000

    and-int/2addr v2, v12

    if-nez v2, :cond_5

    const/high16 v2, 0x80000

    or-int/2addr v3, v2

    :cond_5
    const/high16 v2, 0x6c00000

    or-int/2addr v2, v3

    const/high16 v3, 0x30000000

    and-int/2addr v3, v12

    if-nez v3, :cond_7

    invoke-virtual {v0, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/high16 v3, 0x20000000

    goto :goto_3

    :cond_6
    const/high16 v3, 0x10000000

    :goto_3
    or-int/2addr v2, v3

    :cond_7
    const v3, 0x12492493

    and-int/2addr v3, v2

    const v4, 0x12492492

    const/4 v5, 0x0

    if-eq v3, v4, :cond_8

    const/4 v3, 0x1

    goto :goto_4

    :cond_8
    move v3, v5

    :goto_4
    and-int/lit8 v4, v2, 0x1

    invoke-virtual {v0, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v3, v12, 0x1

    const v4, -0x3fe001

    if-eqz v3, :cond_a

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/2addr v2, v4

    move-object/from16 v13, p1

    move/from16 v3, p2

    move-object/from16 v14, p3

    move-wide/from16 v7, p4

    move-wide/from16 v15, p6

    move/from16 v19, p8

    move/from16 v20, p9

    goto :goto_6

    :cond_a
    :goto_5
    sget v3, Ll1/r4;->a:F

    sget-object v6, Lo1/r;->b:Lo1/t;

    invoke-static {v6, v0}, Ll1/q3;->b(Lo1/t;Landroidx/compose/runtime/Composer;)Li2/a1;

    move-result-object v6

    sget-object v7, Lo1/r;->c:Lo1/f;

    invoke-static {v7, v0}, Ll1/n;->d(Lo1/f;Landroidx/compose/runtime/Composer;)J

    move-result-wide v7

    sget-object v9, Lo1/r;->a:Lo1/f;

    invoke-static {v9, v0}, Ll1/n;->d(Lo1/f;Landroidx/compose/runtime/Composer;)J

    move-result-wide v9

    and-int/2addr v2, v4

    int-to-float v4, v5

    int-to-float v13, v5

    sget-object v14, Lb2/t;->w:Lb2/t;

    move/from16 v19, v4

    move-wide v15, v9

    move/from16 v20, v13

    move-object v13, v14

    move-object v14, v6

    :goto_6
    invoke-virtual {v0}, Lp1/q;->r()V

    const v4, -0x66828db7

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    new-instance v4, Ll1/t4;

    invoke-direct {v4, v3, v7, v8, v11}, Ll1/t4;-><init>(FJLx1/b;)V

    const v5, -0x5dd15193

    invoke-static {v5, v0, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v22

    shr-int/lit8 v2, v2, 0x9

    const v4, 0xe000

    and-int/2addr v4, v2

    const/high16 v5, 0xc00000

    or-int/2addr v4, v5

    const/high16 v5, 0x70000

    and-int/2addr v2, v5

    or-int v24, v4, v2

    const/16 v25, 0x48

    const-wide/16 v17, 0x0

    const/16 v21, 0x0

    move-object/from16 v23, v0

    invoke-static/range {v13 .. v25}, Ll1/c4;->a(Landroidx/compose/ui/Modifier;Li2/a1;JJFFLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-wide v5, v7

    move-object v2, v13

    move-object v4, v14

    move-wide v7, v15

    move/from16 v9, v19

    move/from16 v10, v20

    goto :goto_7

    :cond_b
    move-object/from16 v23, v0

    invoke-virtual/range {v23 .. v23}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move/from16 v9, p8

    move/from16 v10, p9

    :goto_7
    invoke-virtual/range {v23 .. v23}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_c

    new-instance v0, Ll1/s4;

    invoke-direct/range {v0 .. v12}, Ll1/s4;-><init>(Ll1/w4;Landroidx/compose/ui/Modifier;FLi2/a1;JJFFLx1/b;I)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final b(Lc4/i0;Lx1/b;Ll1/x4;Landroidx/compose/ui/Modifier;ZLx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    move-object v4, p6

    check-cast v4, Lp1/q;

    const p6, -0x11825480

    invoke-virtual {v4, p6}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p6, p7, 0x6

    if-nez p6, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_0

    const/4 p6, 0x4

    goto :goto_0

    :cond_0
    const/4 p6, 0x2

    :goto_0
    or-int/2addr p6, p7

    goto :goto_1

    :cond_1
    move p6, p7

    :goto_1
    and-int/lit8 v0, p7, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p6, v0

    :cond_3
    and-int/lit16 v0, p7, 0x180

    if-nez v0, :cond_6

    and-int/lit16 v0, p7, 0x200

    if-nez v0, :cond_4

    invoke-virtual {v4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_3

    :cond_4
    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_3
    if-eqz v0, :cond_5

    const/16 v0, 0x100

    goto :goto_4

    :cond_5
    const/16 v0, 0x80

    :goto_4
    or-int/2addr p6, v0

    :cond_6
    const v0, 0xdb6c00

    or-int/2addr p6, v0

    const/high16 v0, 0x6000000

    and-int/2addr v0, p7

    if-nez v0, :cond_8

    invoke-virtual {v4, p5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const/high16 v0, 0x4000000

    goto :goto_5

    :cond_7
    const/high16 v0, 0x2000000

    :goto_5
    or-int/2addr p6, v0

    :cond_8
    const v0, 0x2492493

    and-int/2addr v0, p6

    const v1, 0x2492492

    const/4 v6, 0x1

    if-eq v0, v1, :cond_9

    move v0, v6

    goto :goto_6

    :cond_9
    const/4 v0, 0x0

    :goto_6
    and-int/lit8 v1, p6, 0x1

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object p3, p2, Ll1/x4;->b:Ld0/q0;

    const-string p4, "tooltip transition"

    const/16 v0, 0x30

    invoke-static {p3, p4, v4, v0}, Ld0/d2;->e(Lal/a;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/z1;

    move-result-object p3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p4, v0, :cond_a

    const/4 p4, 0x0

    invoke-static {p4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p4

    invoke-virtual {v4, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast p4, Lp1/c1;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_b

    new-instance v1, Ll1/w4;

    new-instance v0, Ljt1/b;

    const/16 v2, 0x9

    invoke-direct {v0, v2, p4}, Ljt1/b;-><init>(ILp1/c1;)V

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v1, Ll1/w4;

    new-instance v0, Lb30/w2;

    const/16 v2, 0x15

    invoke-direct {v0, v2, p4, p5}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p4, -0x16cb6ae

    invoke-static {p4, v4, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    new-instance p4, Lg1/f;

    invoke-direct {p4, p3, p1, v1}, Lg1/f;-><init>(Ld0/z1;Lx1/b;Ll1/w4;)V

    const p3, -0x1f6f824a

    invoke-static {p3, v4, p4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    and-int/lit8 p3, p6, 0xe

    const p4, 0x6000030

    or-int/2addr p3, p4

    and-int/lit16 p4, p6, 0x380

    or-int/2addr p3, p4

    and-int/lit16 p4, p6, 0x1c00

    or-int/2addr p3, p4

    const p4, 0xe000

    and-int/2addr p4, p6

    or-int/2addr p3, p4

    const/high16 p4, 0x70000

    and-int/2addr p4, p6

    or-int/2addr p3, p4

    const/high16 p4, 0x380000

    and-int/2addr p4, p6

    or-int/2addr p3, p4

    const/high16 p4, 0x1c00000

    and-int/2addr p4, p6

    or-int v5, p3, p4

    move-object v0, p0

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lm1/e0;->a(Lc4/i0;Lx1/b;Ll1/x4;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p3, Lb2/t;->w:Lb2/t;

    move-object p6, p5

    move p5, v6

    :goto_7
    move-object p4, p3

    goto :goto_8

    :cond_c
    move-object v0, p0

    move-object v2, p2

    invoke-virtual {v4}, Lp1/q;->X()V

    move-object p6, p5

    move p5, p4

    goto :goto_7

    :goto_8
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_d

    new-instance p0, Ld30/l0;

    move-object p2, p1

    move-object p1, v0

    move-object p3, v2

    invoke-direct/range {p0 .. p7}, Ld30/l0;-><init>(Lc4/i0;Lx1/b;Ll1/x4;Landroidx/compose/ui/Modifier;ZLx1/b;I)V

    iput-object p0, v1, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method public static final c(Landroidx/compose/runtime/Composer;)Ll1/x4;
    .locals 3

    sget-object v0, Lm1/i;->a:Lf0/c1;

    move-object v1, p0

    check-cast v1, Lp1/q;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp1/q;->h(Z)Z

    move-result v1

    move-object v2, p0

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    check-cast p0, Lp1/q;

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_1

    :cond_0
    new-instance v2, Ll1/x4;

    invoke-direct {v2, v0}, Ll1/x4;-><init>(Lf0/c1;)V

    invoke-virtual {p0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v2, Ll1/x4;

    return-object v2
.end method
