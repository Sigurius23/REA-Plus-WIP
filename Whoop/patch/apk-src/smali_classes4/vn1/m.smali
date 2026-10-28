.class public abstract Lvn1/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0003H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Ll83/a0;",
        "g",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lkotlin/Function0;",
        "content",
        "d",
        "(Lc93/m;Landroidx/compose/runtime/Composer;I)V",
        "home-notifications-center_release"
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
.method public static synthetic a(FFJLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lvn1/m;->e(FFJLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvn1/m;->f(Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvn1/m;->h(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "content"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x4bf054db    # 3.1500726E7f

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v6, v3, 0x3

    const/4 v7, 0x1

    if-eq v6, v5, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v2, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    const/16 v8, 0x8

    if-eqz v6, :cond_8

    sget-object v6, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v2, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly3/c;

    const/4 v10, 0x3

    int-to-float v10, v10

    int-to-float v4, v4

    mul-float/2addr v10, v4

    invoke-interface {v9, v10}, Ly3/c;->q0(F)F

    move-result v9

    invoke-virtual {v2, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly3/c;

    const-wide/high16 v10, 0x3ff8000000000000L    # 1.5

    double-to-float v10, v10

    invoke-interface {v6, v10}, Ly3/c;->q0(F)F

    move-result v6

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v10, v2, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->W0()J

    move-result-wide v10

    sget-object v12, Ll0/m;->a:Ll0/e;

    int-to-float v12, v7

    int-to-float v13, v8

    mul-float/2addr v12, v13

    sget-object v14, Lb2/e;->K:Lb2/l;

    invoke-static {v12, v14}, Ll0/m;->k(FLb2/g;)Ll0/k;

    move-result-object v12

    sget-object v14, Lb2/e;->N:Lb2/k;

    const/16 v15, 0x23

    int-to-float v15, v15

    mul-float/2addr v15, v4

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v15, v4}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v2, v6}, Lp1/q;->d(F)Z

    move-result v15

    invoke-virtual {v2, v9}, Lp1/q;->d(F)Z

    move-result v16

    or-int v15, v15, v16

    invoke-virtual {v2, v10, v11}, Lp1/q;->f(J)Z

    move-result v16

    or-int v15, v15, v16

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v15, :cond_3

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-ne v8, v15, :cond_4

    :cond_3
    new-instance v8, Lvn1/l;

    invoke-direct {v8, v6, v10, v11, v9}, Lvn1/l;-><init>(FJF)V

    invoke-virtual {v2, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v8}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const-wide/high16 v8, 0x401a000000000000L    # 6.5

    double-to-float v6, v8

    mul-float/2addr v6, v13

    const/4 v8, 0x0

    invoke-static {v4, v6, v8, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v5, 0x36

    invoke-static {v12, v14, v2, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v8, v2, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v2, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v10, v2, Lp1/q;->S:Z

    if-eqz v10, :cond_5

    invoke-virtual {v2, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_5
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v2, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v2, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v2, Lp1/q;->S:Z

    if-nez v8, :cond_6

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    :cond_6
    invoke-static {v6, v2, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v2, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v3, v3, 0xe

    invoke-static {v3, v0, v2, v7}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    goto :goto_4

    :cond_8
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_9

    new-instance v3, Lbp0/o;

    const/16 v4, 0x8

    invoke-direct {v3, v0, v1, v4}, Lbp0/o;-><init>(Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final e(FFJLk2/e;)Ll83/a0;
    .locals 13

    const-string v0, "$this$drawBehind"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lk2/i;

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    new-instance v7, Li2/k;

    new-instance v3, Landroid/graphics/DashPathEffect;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v7, v3}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v8, 0xe

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v3, p0

    invoke-direct/range {v2 .. v8}, Lk2/i;-><init>(FFIILi2/t0;I)V

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v3, p0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    const/16 v0, 0x20

    shl-long/2addr v3, v0

    const-wide v5, 0xffffffffL

    and-long/2addr p0, v5

    or-long v8, v3, p0

    const/4 v11, 0x0

    const/16 v12, 0xe6

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    move-object v10, v2

    move-wide v2, p2

    invoke-static/range {v1 .. v12}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x41200000    # 10.0f
    .end array-data
.end method

.method private static final f(Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lvn1/m;->d(Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Landroidx/compose/runtime/Composer;I)V
    .locals 2

    check-cast p0, Lp1/q;

    const v0, 0x432f0416

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lvn1/c;->a:Lvn1/c;

    invoke-virtual {v0}, Lvn1/c;->d()Lc93/m;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p0, v1}, Lvn1/m;->d(Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, La11/i;

    const/4 v1, 0x6

    invoke-direct {v0, p1, v1}, La11/i;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final h(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lvn1/m;->g(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
