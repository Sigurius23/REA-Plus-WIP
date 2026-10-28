.class public abstract Lf71/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\"\u0017\u0010\u0013\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lj71/b$l;",
        "state",
        "Ll83/a0;",
        "l",
        "(Landroidx/compose/ui/Modifier;Lj71/b$l;Landroidx/compose/runtime/Composer;II)V",
        "Lf71/e;",
        "markerState",
        "j",
        "(Lf71/e;Landroidx/compose/runtime/Composer;I)V",
        "Li2/x;",
        "color",
        "f",
        "(JLandroidx/compose/runtime/Composer;I)V",
        "a",
        "Lj71/b$l;",
        "n",
        "()Lj71/b$l;",
        "verticalMarkerStateExample",
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
.field private static final a:Lj71/b$l;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lf71/e;

    sget-object v1, Lf71/f;->RECOVERY_MEDIUM:Lf71/f;

    const-string v2, "Recovery"

    const-string v3, "54%"

    const/high16 v4, 0x3e800000    # 0.25f

    invoke-direct {v0, v4, v1, v2, v3}, Lf71/e;-><init>(FLf71/f;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lf71/e;

    sget-object v2, Lf71/f;->STRAIN:Lf71/f;

    const-string v3, "Strain"

    const-string v4, "12.2"

    const/high16 v5, 0x3f400000    # 0.75f

    invoke-direct {v1, v5, v2, v3, v4}, Lf71/e;-><init>(FLf71/f;Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v0, v1}, [Lf71/e;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v1, Lj71/b$l;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v3, "verticalMarker"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lj71/b$l;-><init>(Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lf71/d;->a:Lj71/b$l;

    return-void
.end method

.method public static synthetic a(Lf71/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lf71/d;->k(Lf71/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FFJFLk2/e;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lf71/d;->h(FFJFLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lj71/b$l;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lf71/d;->m(Landroidx/compose/ui/Modifier;Lj71/b$l;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lf71/d;->g(Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(IJLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p1, p2, p0, p3, p4}, Lf71/d;->i(JILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(JLandroidx/compose/runtime/Composer;I)V
    .locals 16

    move-wide/from16 v3, p0

    move/from16 v6, p3

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v0, 0x5e26da93

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v1, 0x4

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v7, v3, v4}, Lp1/q;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v5, v0, 0x3

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v5, v2, :cond_2

    move v5, v9

    goto :goto_2

    :cond_2
    move v5, v8

    :goto_2
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v7, v10, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_a

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v10, v7, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-eqz v15, :cond_3

    invoke-virtual {v7, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v7, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v7, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-nez v11, :cond_4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    :cond_4
    invoke-static {v10, v7, v10, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v7, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v7, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly3/c;

    const/4 v11, 0x3

    int-to-float v11, v11

    invoke-interface {v10, v11}, Ly3/c;->q0(F)F

    move-result v10

    invoke-virtual {v7, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ly3/c;

    int-to-float v2, v2

    invoke-interface {v13, v2}, Ly3/c;->q0(F)F

    move-result v2

    invoke-virtual {v7, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/c;

    int-to-float v13, v9

    invoke-interface {v5, v13}, Ly3/c;->q0(F)F

    move-result v5

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v12}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v12, v13, :cond_6

    new-instance v12, Lf41/f;

    const/4 v14, 0x5

    invoke-direct {v12, v14}, Lf41/f;-><init>(I)V

    invoke-virtual {v7, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-static {v11, v12}, Li3/n;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v7, v10}, Lp1/q;->d(F)Z

    move-result v12

    invoke-virtual {v7, v2}, Lp1/q;->d(F)Z

    move-result v14

    or-int/2addr v12, v14

    and-int/lit8 v0, v0, 0xe

    if-ne v0, v1, :cond_7

    move v0, v9

    goto :goto_4

    :cond_7
    move v0, v8

    :goto_4
    or-int/2addr v0, v12

    invoke-virtual {v7, v5}, Lp1/q;->d(F)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_8

    if-ne v1, v13, :cond_9

    :cond_8
    new-instance v0, Lf71/b;

    move v1, v10

    invoke-direct/range {v0 .. v5}, Lf71/b;-><init>(FFJF)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_9
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v11, v1, v7, v8}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_a
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v1, Lf71/c;

    const/4 v2, 0x0

    invoke-direct {v1, v6, v3, v4, v2}, Lf71/c;-><init>(IJI)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final g(Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$clearAndSetSemantics"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(FFJFLk2/e;)Ll83/a0;
    .locals 12

    const-string v0, "$this$Canvas"

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v2

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int v0, v2

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput p0, v2, v3

    const/4 p0, 0x1

    aput p1, v2, p0

    new-instance v10, Li2/k;

    new-instance p0, Landroid/graphics/DashPathEffect;

    const/4 p1, 0x0

    invoke-direct {p0, v2, p1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v10, p0}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v2, v0

    const/16 v0, 0x20

    shl-long/2addr p0, v0

    and-long/2addr v2, v4

    or-long v6, p0, v2

    const/4 v9, 0x0

    const/16 v11, 0x1d0

    const-wide/16 v4, 0x0

    move-wide v2, p2

    move/from16 v8, p4

    invoke-static/range {v1 .. v11}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(JILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lf71/d;->f(JLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lf71/e;Landroidx/compose/runtime/Composer;I)V
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x7c64990f

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int v3, p2, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v3, 0x3

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v5, v4, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    move v5, v7

    :goto_2
    and-int/2addr v3, v6

    invoke-virtual {v2, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v0}, Lf71/e;->d()F

    move-result v3

    const/high16 v5, 0x3f800000    # 1.0f

    cmpg-float v3, v3, v5

    const/4 v5, 0x6

    if-nez v3, :cond_3

    invoke-virtual {v0}, Lf71/e;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-le v3, v5, :cond_3

    const v3, 0x41563372

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lf71/e;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v5

    mul-int/lit8 v3, v3, 0xa

    int-to-float v3, v3

    sget-object v8, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v2, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly3/c;

    invoke-interface {v8}, Ly3/c;->m0()F

    move-result v8

    mul-float/2addr v8, v3

    invoke-virtual {v2, v7}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_3
    const v3, 0x415829dd

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v7}, Lp1/q;->q(Z)V

    int-to-float v8, v7

    :goto_3
    new-instance v9, Lp91/a;

    const/16 v14, 0xc

    const/4 v15, 0x0

    const/high16 v10, 0x3f000000    # 0.5f

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v13, 0x1

    const/4 v14, 0x0

    move-object v12, v9

    sget-object v9, Lb2/t;->w:Lb2/t;

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, Lp91/e;->k(Landroidx/compose/ui/Modifier;FFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, Lb2/e;->N:Lb2/k;

    sget-object v11, Ll0/m;->d:Ll0/g;

    const/16 v12, 0x36

    invoke-static {v11, v10, v2, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v11, v2, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v14, v2, Lp1/q;->S:Z

    if-eqz v14, :cond_4

    invoke-virtual {v2, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v2, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v2, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v12, v2, Lp1/q;->S:Z

    if-nez v12, :cond_5

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_6

    :cond_5
    invoke-static {v11, v2, v11, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v2, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    neg-float v3, v8

    const/4 v8, 0x0

    invoke-static {v9, v3, v8, v4}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v0}, Lf71/e;->a()Ljava/lang/String;

    move-result-object v4

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-virtual {v8, v2, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->t()Lb91/a;

    move-result-object v22

    invoke-virtual {v0}, Lf71/e;->b()Lf71/f;

    move-result-object v10

    invoke-virtual {v10}, Lf71/f;->mapToWhoopColor()Ly81/e;

    move-result-object v10

    invoke-interface {v10, v2, v7}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    const/16 v26, 0x0

    const v27, 0x2fff8

    move v12, v6

    move v13, v7

    const-wide/16 v6, 0x0

    move-object v14, v8

    const/4 v8, 0x0

    move-object v15, v9

    const/4 v9, 0x0

    move-object/from16 v24, v2

    move-object v2, v4

    move-wide/from16 v34, v10

    move v11, v5

    move-wide/from16 v4, v34

    const/4 v10, 0x0

    move/from16 v17, v11

    move/from16 v16, v12

    const-wide/16 v11, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move-object/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v21, v15

    move/from16 v20, v16

    const-wide/16 v15, 0x0

    move/from16 v23, v17

    const/16 v17, 0x0

    move/from16 v25, v18

    const/16 v18, 0x0

    move-object/from16 v28, v19

    const/16 v19, 0x0

    move/from16 v29, v20

    const/16 v20, 0x0

    move-object/from16 v30, v21

    const/16 v21, 0x0

    move/from16 v31, v23

    const/16 v23, 0x0

    move/from16 v32, v25

    const/16 v25, 0x0

    move-object/from16 v0, v28

    move-object/from16 v33, v30

    move/from16 v1, v31

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual/range {p0 .. p0}, Lf71/e;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->D()Lb91/a;

    move-result-object v22

    invoke-virtual/range {p0 .. p0}, Lf71/e;->b()Lf71/f;

    move-result-object v0

    invoke-virtual {v0}, Lf71/f;->mapToWhoopColor()Ly81/e;

    move-result-object v0

    const/4 v13, 0x0

    invoke-interface {v0, v2, v13}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    const v27, 0x2fffa

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    const/4 v12, 0x1

    int-to-float v0, v12

    const/16 v1, 0x8

    int-to-float v1, v1

    move-object/from16 v9, v33

    invoke-static {v0, v1, v9, v2, v12}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_5

    :cond_7
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v1, Ld71/c;

    const/16 v2, 0x8

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Ld71/c;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final k(Lf71/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lf71/d;->j(Lf71/e;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final l(Landroidx/compose/ui/Modifier;Lj71/b$l;Landroidx/compose/runtime/Composer;II)V
    .locals 16

    move-object/from16 v3, p1

    sget-object v0, Lb2/e;->w:Lb2/m;

    const-string v1, "state"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p2

    check-cast v1, Lp1/q;

    const v2, -0x331e35cb    # -1.1837892E8f

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p4, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v4, p3, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

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

    if-nez v6, :cond_4

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit8 v6, v5, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_5

    move v6, v9

    goto :goto_3

    :cond_5
    move v6, v8

    :goto_3
    and-int/2addr v5, v9

    invoke-virtual {v1, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_e

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_6

    move-object v4, v10

    :cond_6
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v0, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v1, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v12, v1, Lp1/q;->S:Z

    if-eqz v12, :cond_7

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_4
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v1, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v1, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-nez v7, :cond_8

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static {v6, v1, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v1, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x1eef2e32

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lj71/b$l;->e()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf71/e;

    invoke-virtual {v5}, Lf71/e;->d()F

    move-result v11

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lp91/e;->k(Landroidx/compose/ui/Modifier;FFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v0, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v11, v1, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v1, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v14, v1, Lp1/q;->S:Z

    if-eqz v14, :cond_a

    invoke-virtual {v1, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_6
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v1, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v1, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v12, v1, Lp1/q;->S:Z

    if-nez v12, :cond_b

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_c

    :cond_b
    invoke-static {v11, v1, v11, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v1, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v1, v8}, Lf71/d;->j(Lf71/e;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5}, Lf71/e;->b()Lf71/f;

    move-result-object v5

    invoke-virtual {v5}, Lf71/f;->mapToWhoopColor()Ly81/e;

    move-result-object v5

    invoke-interface {v5, v1, v8}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    invoke-static {v5, v6, v1, v8}, Lf71/d;->f(JLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_d
    invoke-virtual {v1, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_e
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Ld62/b;

    const/16 v5, 0x1c

    move/from16 v2, p3

    move-object v1, v4

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ld62/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final m(Landroidx/compose/ui/Modifier;Lj71/b$l;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lf71/d;->l(Landroidx/compose/ui/Modifier;Lj71/b$l;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final n()Lj71/b$l;
    .locals 1

    sget-object v0, Lf71/d;->a:Lj71/b$l;

    return-object v0
.end method
