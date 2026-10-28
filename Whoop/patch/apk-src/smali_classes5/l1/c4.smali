.class public abstract Ll1/c4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll1/f0;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ll1/f0;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Ll1/c4;->a:Lp1/b0;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/Modifier;Li2/a1;JJFFLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 11

    move-object/from16 v0, p10

    and-int/lit8 v1, p12, 0x8

    if-eqz v1, :cond_0

    invoke-static {p2, p3, v0}, Ll1/n;->b(JLandroidx/compose/runtime/Composer;)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    move-wide v1, p4

    :goto_0
    and-int/lit8 v3, p12, 0x10

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    int-to-float v3, v4

    goto :goto_1

    :cond_1
    move/from16 v3, p6

    :goto_1
    and-int/lit8 v7, p12, 0x20

    if-eqz v7, :cond_2

    int-to-float v4, v4

    move v9, v4

    goto :goto_2

    :cond_2
    move/from16 v9, p7

    :goto_2
    and-int/lit8 v4, p12, 0x40

    if-eqz v4, :cond_3

    const/4 v4, 0x0

    move-object v8, v4

    goto :goto_3

    :cond_3
    move-object/from16 v8, p8

    :goto_3
    check-cast v0, Lp1/q;

    sget-object v4, Ll1/c4;->a:Lp1/b0;

    invoke-virtual {v0, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly3/f;

    iget v7, v7, Ly3/f;->w:F

    add-float/2addr v7, v3

    sget-object v3, Ll1/s;->a:Lp1/b0;

    new-instance v10, Li2/x;

    invoke-direct {v10, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {v3, v10}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    new-instance v2, Ly3/f;

    invoke-direct {v2, v7}, Ly3/f;-><init>(F)V

    invoke-virtual {v4, v2}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v2

    filled-new-array {v1, v2}, [Lp1/u1;

    move-result-object v1

    new-instance v2, Ll1/z3;

    move-object v3, p0

    move-object v4, p1

    move-wide v5, p2

    move-object/from16 v10, p9

    invoke-direct/range {v2 .. v10}, Ll1/z3;-><init>(Landroidx/compose/ui/Modifier;Li2/a1;JFLf0/t;FLx1/b;)V

    const v3, 0x1923bae6

    invoke-static {v3, v0, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v3, 0x38

    invoke-static {v1, v2, v0, v3}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final b(ZLc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;JLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 15

    move-object/from16 v0, p9

    move-wide/from16 v3, p5

    invoke-static {v3, v4, v0}, Ll1/n;->b(JLandroidx/compose/runtime/Composer;)J

    move-result-wide v1

    const/4 v5, 0x0

    int-to-float v6, v5

    int-to-float v11, v5

    move-object v7, v0

    check-cast v7, Lp1/q;

    const v8, 0x5b159de8

    invoke-virtual {v7, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v8, v9, :cond_0

    invoke-static {v7}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v8

    :cond_0
    check-cast v8, Lj0/i;

    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    move-object v13, v0

    check-cast v13, Lp1/q;

    sget-object v0, Ll1/c4;->a:Lp1/b0;

    invoke-virtual {v13, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/f;

    iget v5, v5, Ly3/f;->w:F

    add-float/2addr v5, v6

    sget-object v6, Ll1/s;->a:Lp1/b0;

    new-instance v7, Li2/x;

    invoke-direct {v7, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {v6, v7}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    new-instance v2, Ly3/f;

    invoke-direct {v2, v5}, Ly3/f;-><init>(F)V

    invoke-virtual {v0, v2}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    filled-new-array {v1, v0}, [Lp1/u1;

    move-result-object v14

    new-instance v0, Ll1/b4;

    move v7, p0

    move-object/from16 v10, p1

    move-object/from16 v1, p2

    move/from16 v9, p3

    move-object/from16 v2, p4

    move-object/from16 v6, p7

    move-object/from16 v12, p8

    invoke-direct/range {v0 .. v12}, Ll1/b4;-><init>(Landroidx/compose/ui/Modifier;Li2/a1;JFLf0/t;ZLj0/i;ZLc93/a;FLx1/b;)V

    const p0, 0x59ed78f3

    invoke-static {p0, v13, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p0

    const/16 v0, 0x38

    invoke-static {v14, p0, v13, v0}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;F)Landroidx/compose/ui/Modifier;
    .locals 8

    const/4 v0, 0x0

    cmpl-float v0, p5, v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    if-lez v0, :cond_0

    const/4 v4, 0x0

    const v7, 0x1e7df

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p1

    move v5, p5

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/graphics/a;->b(Landroidx/compose/ui/Modifier;FFFFLi2/a1;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object v6, p1

    move-object p1, v1

    :goto_0
    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    if-eqz p4, :cond_1

    iget p1, p4, Lf0/t;->a:F

    iget-object p4, p4, Lf0/t;->b:Li2/t;

    invoke-static {p1, v1, p4, v6}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    :cond_1
    invoke-interface {p0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p0, p2, p3, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p0, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final d(JFLp1/q;)J
    .locals 4

    sget-object v0, Ll1/n;->a:Lp1/u2;

    invoke-virtual {p3, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/m;

    sget-object v1, Ll1/n;->b:Lp1/u2;

    invoke-virtual {p3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    iget-wide v1, v0, Ll1/m;->p:J

    invoke-static {p0, p1, v1, v2}, Li2/x;->d(JJ)Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz p3, :cond_1

    const/4 p0, 0x0

    int-to-float p0, p0

    invoke-static {p2, p0}, Ly3/f;->b(FF)Z

    move-result p0

    if-eqz p0, :cond_0

    return-wide v1

    :cond_0
    const/4 p0, 0x1

    int-to-float p0, p0

    add-float/2addr p2, p0

    float-to-double p0, p2

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    double-to-float p0, p0

    const/high16 p1, 0x40900000    # 4.5f

    mul-float/2addr p0, p1

    const/high16 p1, 0x40000000    # 2.0f

    add-float/2addr p0, p1

    const/high16 p1, 0x42c80000    # 100.0f

    div-float/2addr p0, p1

    iget-wide p1, v0, Ll1/m;->t:J

    invoke-static {p0, p1, p2}, Li2/x;->c(FJ)J

    move-result-wide p0

    invoke-static {p0, p1, v1, v2}, Li2/w0;->p(JJ)J

    move-result-wide p0

    :cond_1
    return-wide p0
.end method
