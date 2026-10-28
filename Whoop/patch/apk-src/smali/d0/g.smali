.class public abstract Ld0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld0/i1;

.field public static final b:Ld0/i1;

.field public static final c:Ld0/i1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v2, v2, v1, v0}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    sput-object v0, Ld0/g;->a:Ld0/i1;

    sget-object v0, Ld0/p2;->a:Ljava/lang/Object;

    new-instance v0, Ly3/f;

    const v1, 0x3dcccccd    # 0.1f

    invoke-direct {v0, v1}, Ly3/f;-><init>(F)V

    const/4 v1, 0x3

    invoke-static {v2, v2, v1, v0}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    sput-object v0, Ld0/g;->b:Ld0/i1;

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2, v2, v1, v0}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    sput-object v0, Ld0/g;->c:Ld0/i1;

    return-void
.end method

.method public static final a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;
    .locals 9

    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_0

    sget-object p1, Ld0/g;->b:Ld0/i1;

    :cond_0
    move-object v2, p1

    and-int/lit8 p1, p5, 0x4

    if-eqz p1, :cond_1

    const-string p2, "DpAnimation"

    :cond_1
    move-object v4, p2

    new-instance v0, Ly3/f;

    invoke-direct {v0, p0}, Ly3/f;-><init>(F)V

    sget-object v1, Ld0/f;->k:Ld0/f2;

    shl-int/lit8 p0, p4, 0x3

    and-int/lit16 p0, p0, 0x380

    shl-int/lit8 p1, p4, 0x6

    const p2, 0xe000

    and-int/2addr p1, p2

    or-int v7, p0, p1

    const/16 v8, 0x8

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v6, p3

    invoke-static/range {v0 .. v8}, Ld0/g;->d(Ljava/lang/Object;Ld0/f2;Ld0/l;Ljava/lang/Float;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p0

    return-object p0
.end method

.method public static final b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;
    .locals 12

    move/from16 v0, p5

    and-int/lit8 v1, p6, 0x2

    sget-object v2, Ld0/g;->a:Ld0/i1;

    if-eqz v1, :cond_0

    move-object p1, v2

    :cond_0
    and-int/lit8 v1, p6, 0x8

    if-eqz v1, :cond_1

    const-string p2, "FloatAnimation"

    :cond_1
    move-object v7, p2

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_2

    const/4 p2, 0x0

    move-object v8, p2

    goto :goto_0

    :cond_2
    move-object v8, p3

    :goto_0
    const/4 p2, 0x3

    const/4 v1, 0x0

    const v3, 0x3c23d70a    # 0.01f

    if-ne p1, v2, :cond_8

    move-object/from16 p1, p4

    check-cast p1, Lp1/q;

    const v2, 0x4431b71f

    invoke-virtual {p1, v2}, Lp1/q;->e0(I)V

    and-int/lit16 v2, v0, 0x380

    xor-int/lit16 v2, v2, 0x180

    const/16 v4, 0x100

    if-le v2, v4, :cond_3

    invoke-virtual {p1, v3}, Lp1/q;->d(F)Z

    move-result v2

    if-nez v2, :cond_4

    :cond_3
    and-int/lit16 v2, v0, 0x180

    if-ne v2, v4, :cond_5

    :cond_4
    const/4 v2, 0x1

    goto :goto_1

    :cond_5
    move v2, v1

    :goto_1
    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_6

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v4, v2, :cond_7

    :cond_6
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v4, v4, p2, v2}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v4

    invoke-virtual {p1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v2, v4

    check-cast v2, Ld0/i1;

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    move-object v5, v2

    goto :goto_2

    :cond_8
    move-object/from16 v2, p4

    check-cast v2, Lp1/q;

    const v4, 0x44336485

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v1}, Lp1/q;->q(Z)V

    move-object v5, p1

    :goto_2
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    sget-object v4, Ld0/f;->i:Ld0/f2;

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    and-int/lit8 p1, v0, 0xe

    shl-int/lit8 p2, v0, 0x3

    and-int/lit16 v0, p2, 0x1c00

    or-int/2addr p1, v0

    const v0, 0xe000

    and-int/2addr v0, p2

    or-int/2addr p1, v0

    const/high16 v0, 0x70000

    and-int/2addr p2, v0

    or-int v10, p1, p2

    const/4 v11, 0x0

    move-object v3, p0

    move-object/from16 v9, p4

    invoke-static/range {v3 .. v11}, Ld0/g;->d(Ljava/lang/Object;Ld0/f2;Ld0/l;Ljava/lang/Float;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p0

    return-object p0
.end method

.method public static final c(ILp1/q;)Lp1/t2;
    .locals 9

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ld0/f;->j:Ld0/f2;

    const/16 v7, 0x6000

    const/16 v8, 0x8

    sget-object v2, Ld0/g;->c:Ld0/i1;

    const/4 v3, 0x0

    const-string v4, ""

    const/4 v5, 0x0

    move-object v6, p1

    invoke-static/range {v0 .. v8}, Ld0/g;->d(Ljava/lang/Object;Ld0/f2;Ld0/l;Ljava/lang/Float;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ljava/lang/Object;Ld0/f2;Ld0/l;Ljava/lang/Float;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;
    .locals 11

    and-int/lit8 v0, p8, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p3, v1

    :cond_0
    move-object/from16 v0, p6

    check-cast v0, Lp1/q;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_1

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v2, Lp1/c1;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_2

    new-instance v4, Ld0/e;

    invoke-direct {v4, p0, p1, p3}, Ld0/e;-><init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v7, v4

    check-cast v7, Ld0/e;

    move-object/from16 p1, p5

    invoke-static {p1, v0}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v9

    if-eqz p3, :cond_3

    instance-of p1, p2, Ld0/i1;

    if-eqz p1, :cond_3

    move-object p1, p2

    check-cast p1, Ld0/i1;

    iget-object v4, p1, Ld0/i1;->c:Ljava/lang/Object;

    invoke-static {v4, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    iget p2, p1, Ld0/i1;->a:F

    iget p1, p1, Ld0/i1;->b:F

    new-instance v4, Ld0/i1;

    invoke-direct {v4, p2, p1, p3}, Ld0/i1;-><init>(FFLjava/lang/Object;)V

    move-object p2, v4

    :cond_3
    invoke-static {p2, v0}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x6

    if-ne p1, v3, :cond_4

    const/4 p1, -0x1

    invoke-static {p1, p2, v1}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v6, p1

    check-cast v6, Ldc3/l;

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    and-int/lit8 p3, p7, 0xe

    xor-int/2addr p3, p2

    const/4 v1, 0x4

    if-le p3, v1, :cond_5

    invoke-virtual {v0, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_6

    :cond_5
    and-int/lit8 p2, p7, 0x6

    if-ne p2, v1, :cond_7

    :cond_6
    const/4 p2, 0x1

    goto :goto_0

    :cond_7
    const/4 p2, 0x0

    :goto_0
    or-int/2addr p1, p2

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_8

    if-ne p2, v3, :cond_9

    :cond_8
    new-instance p2, La11/l;

    const/16 p1, 0xe

    invoke-direct {p2, p1, v6, p0}, La11/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast p2, Lc93/a;

    invoke-static {p2, v0}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-virtual {v0, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_a

    if-ne p1, v3, :cond_b

    :cond_a
    new-instance v5, La6/f;

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v10}, La6/f;-><init>(Ldc3/l;Ld0/e;Lp1/c1;Lp1/c1;Lq83/d;)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p1, v5

    :cond_b
    check-cast p1, Lc93/m;

    invoke-static {v0, p1, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lp1/t2;

    if-nez p0, :cond_c

    iget-object p0, v7, Ld0/e;->c:Ld0/m;

    :cond_c
    return-object p0
.end method
