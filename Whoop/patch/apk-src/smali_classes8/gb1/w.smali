.class public abstract Lgb1/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a9\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a9\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0015\"\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e\u00b2\u0006\u000c\u0010\r\u001a\u00020\u00048\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Ly3/f;",
        "cornerRadius",
        "lineWidth",
        "",
        "animationSpeed",
        "alpha",
        "d",
        "(Landroidx/compose/ui/Modifier;FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;",
        "Lkotlin/Function0;",
        "progressProvider",
        "e",
        "(Landroidx/compose/ui/Modifier;Lc93/a;FFF)Landroidx/compose/ui/Modifier;",
        "progress",
        "Lh2/e;",
        "size",
        "Lh2/b;",
        "j",
        "(FJF)J",
        "Li2/x;",
        "a",
        "J",
        "glowStartColor",
        "b",
        "glowEndColor",
        "",
        "Lgb1/j;",
        "c",
        "Ljava/util/List;",
        "glowLayers",
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
.field private static final a:J

.field private static final b:J

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgb1/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    invoke-static {}, Lgb1/b0;->m()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    sput-wide v0, Lgb1/w;->a:J

    invoke-static {}, Lgb1/b0;->m()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    sput-wide v0, Lgb1/w;->b:J

    new-instance v0, Lgb1/j;

    const/16 v1, 0x23

    int-to-float v1, v1

    const/16 v2, 0x12

    int-to-float v2, v2

    const v3, 0x3f333333    # 0.7f

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lgb1/j;-><init>(FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lgb1/j;

    const/16 v2, 0x19

    int-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    const v5, 0x3f19999a    # 0.6f

    invoke-direct {v1, v2, v3, v5, v4}, Lgb1/j;-><init>(FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lgb1/j;

    const/16 v3, 0xf

    int-to-float v3, v3

    const/4 v5, 0x3

    int-to-float v5, v5

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-direct {v2, v3, v5, v6, v4}, Lgb1/j;-><init>(FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v0, v1, v2}, [Lgb1/j;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lgb1/w;->c:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(FFFLc93/a;Lf2/d;)Lf2/g;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lgb1/w;->f(FFFLc93/a;Lf2/d;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FLc93/a;FLi2/j;Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lgb1/w;->g(FLc93/a;FLi2/s0;Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/t2;)F
    .locals 0

    invoke-static {p0}, Lgb1/w;->i(Lp1/t2;)F

    move-result p0

    return p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
    .locals 8

    const-string v0, "$this$orbitingGlowBorder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p7, 0x2

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    int-to-float p2, v1

    :cond_0
    and-int/lit8 v0, p7, 0x4

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v0, :cond_1

    move p3, v2

    :cond_1
    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_2

    move p4, v2

    :cond_2
    const/16 v0, 0x7d0

    int-to-float v0, v0

    const v2, 0x3dcccccd    # 0.1f

    cmpg-float v3, p3, v2

    if-gez v3, :cond_3

    move p3, v2

    :cond_3
    div-float/2addr v0, p3

    invoke-static {v0}, Le93/b;->X(F)I

    move-result p3

    const-string v0, "OrbitingGlowBorder"

    const/4 v2, 0x0

    invoke-static {v0, p5, v2}, Ld0/f;->s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/l0;

    move-result-object v0

    sget-object v3, Ld0/b0;->c:Lb23/h;

    invoke-static {p3, v2, v3, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p3

    sget-object v1, Ld0/v0;->w:Ld0/v0;

    const/4 v2, 0x4

    invoke-static {p3, v1, v2}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v3

    const/16 v6, 0x71b8

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const-string v4, "OrbitingGlowBorderProgress"

    move-object v5, p5

    invoke-static/range {v0 .. v7}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object p3

    move-object v0, p5

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_4

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_5

    :cond_4
    new-instance v2, Lgb1/s;

    const/4 v1, 0x1

    invoke-direct {v2, p3, v1}, Lgb1/s;-><init>(Lp1/t2;I)V

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v2, Lc93/a;

    invoke-static {p0, v2, p1, p2, p4}, Lgb1/w;->e(Landroidx/compose/ui/Modifier;Lc93/a;FFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lc93/a;FFF)Landroidx/compose/ui/Modifier;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc93/a;",
            "FFF)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    const-string v0, "$this$orbitingGlowBorderLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lc31/a;

    const/4 v6, 0x2

    move-object v5, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v1 .. v6}, Lc31/a;-><init>(FFFLjava/lang/Object;I)V

    invoke-static {p0, v1}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final f(FFFLc93/a;Lf2/d;)Lf2/g;
    .locals 18

    move-object/from16 v0, p4

    const-string v1, "$this$drawWithCache"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lf2/d;->getDensity()F

    move-result v1

    mul-float v1, v1, p0

    invoke-virtual {v0}, Lf2/d;->getDensity()F

    move-result v2

    mul-float v2, v2, p1

    iget-object v3, v0, Lf2/d;->w:Lf2/b;

    invoke-interface {v3}, Lf2/b;->d()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    invoke-static {v5, v6, v3, v4}, Lhg3/i;->j(JJ)Lh2/c;

    move-result-object v3

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    const/16 v9, 0x20

    shl-long/2addr v5, v9

    const-wide v10, 0xffffffffL

    and-long/2addr v7, v10

    or-long/2addr v5, v7

    shr-long v7, v5, v9

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v16

    and-long/2addr v5, v10

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v17

    iget v12, v3, Lh2/c;->a:F

    iget v13, v3, Lh2/c;->b:F

    iget v14, v3, Lh2/c;->c:F

    iget v15, v3, Lh2/c;->d:F

    invoke-static/range {v12 .. v17}, Lj93/l0;->b(FFFFFF)Lh2/d;

    move-result-object v5

    invoke-static {v4, v5}, Li2/s0;->b(Li2/s0;Lh2/d;)V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v5

    neg-float v6, v2

    iget v7, v3, Lh2/c;->a:F

    sub-float v12, v7, v6

    iget v7, v3, Lh2/c;->b:F

    sub-float v13, v7, v6

    iget v7, v3, Lh2/c;->c:F

    add-float v14, v7, v6

    iget v3, v3, Lh2/c;->d:F

    add-float v15, v3, v6

    sub-float v2, v1, v2

    const/4 v3, 0x0

    cmpg-float v6, v2, v3

    if-gez v6, :cond_0

    move v2, v3

    :cond_0
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v6, v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long/2addr v6, v9

    and-long/2addr v2, v10

    or-long/2addr v2, v6

    shr-long v6, v2, v9

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v16

    and-long/2addr v2, v10

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v17

    invoke-static/range {v12 .. v17}, Lj93/l0;->b(FFFFFF)Lh2/d;

    move-result-object v2

    invoke-static {v5, v2}, Li2/s0;->b(Li2/s0;Lh2/d;)V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v4, v5, v3}, Li2/j;->j(Li2/s0;Li2/s0;I)Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v3, Lgb1/v;

    move/from16 v4, p2

    move-object/from16 v5, p3

    invoke-direct {v3, v4, v5, v1, v2}, Lgb1/v;-><init>(FLc93/a;FLi2/j;)V

    invoke-virtual {v0, v3}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final g(FLc93/a;FLi2/s0;Lk2/c;)Ll83/a0;
    .locals 19

    move-object/from16 v0, p4

    const-string v1, "$this$onDrawWithContent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, La3/p0;

    iget-object v2, v1, La3/p0;->w:Lk2/b;

    invoke-virtual {v1}, La3/p0;->a()V

    const/4 v8, 0x0

    cmpg-float v1, p0, v8

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    if-gtz v1, :cond_0

    return-object v9

    :cond_0
    invoke-interface/range {p1 .. p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v3

    move/from16 v5, p2

    invoke-static {v1, v3, v4, v5}, Lgb1/w;->j(FJF)J

    move-result-wide v12

    iget-object v1, v2, Lk2/b;->x:La3/p;

    invoke-virtual {v1}, La3/p;->A()J

    move-result-wide v2

    invoke-virtual {v1}, La3/p;->w()Li2/v;

    move-result-object v4

    invoke-interface {v4}, Li2/v;->q()V

    :try_start_0
    iget-object v4, v1, La3/p;->x:Ljava/lang/Object;

    check-cast v4, Laj/d;

    const/4 v5, 0x1

    move-object/from16 v6, p3

    invoke-virtual {v4, v6, v5}, Laj/d;->b(Li2/s0;I)V

    sget-object v4, Lgb1/w;->c:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lgb1/j;

    invoke-virtual {v4}, Lgb1/j;->b()F

    move-result v5

    move-object v6, v0

    check-cast v6, La3/p0;

    invoke-virtual {v6, v5}, La3/p0;->q0(F)F

    move-result v14

    invoke-virtual {v4}, Lgb1/j;->a()F

    move-result v4

    mul-float v4, v4, p0

    sget-object v10, Li2/t;->b:Li2/s;

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    sget-wide v6, Lgb1/w;->a:J

    invoke-static {v4, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v6

    new-instance v11, Li2/x;

    invoke-direct {v11, v6, v7}, Li2/x;-><init>(J)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v5, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    move-object/from16 v18, v9

    sget-wide v8, Lgb1/w;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const v7, 0x3f19999a    # 0.6f

    mul-float/2addr v4, v7

    move-object v7, v1

    :try_start_1
    invoke-static {v4, v8, v9}, Li2/x;->c(FJ)J

    move-result-wide v0

    new-instance v4, Li2/x;

    invoke-direct {v4, v0, v1}, Li2/x;-><init>(J)V

    new-instance v0, Ll83/k;

    invoke-direct {v0, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v4, v8, v9}, Li2/x;->c(FJ)J

    move-result-wide v8

    new-instance v5, Li2/x;

    invoke-direct {v5, v8, v9}, Li2/x;-><init>(J)V

    new-instance v8, Ll83/k;

    invoke-direct {v8, v1, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v6, v0, v8}, [Ll83/k;

    move-result-object v11

    const/16 v15, 0x8

    invoke-static/range {v10 .. v15}, Li2/s;->h(Li2/s;[Ll83/k;JFI)Li2/u0;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v6, 0x0

    move-object v5, v7

    const/16 v7, 0x78

    move-object v8, v5

    const/4 v5, 0x0

    move-object/from16 v0, p4

    move-wide v9, v2

    move/from16 v17, v4

    move-wide v3, v12

    move v2, v14

    :try_start_2
    invoke-static/range {v0 .. v7}, Lk2/e;->G(Lk2/e;Li2/t;FJFLk2/f;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object/from16 v0, p4

    move-object v1, v8

    move-wide v2, v9

    move/from16 v8, v17

    move-object/from16 v9, v18

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-wide v9, v2

    move-object v8, v7

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v8, v1

    move-wide v9, v2

    goto :goto_1

    :cond_1
    move-object v8, v1

    move-object/from16 v18, v9

    move-wide v9, v2

    invoke-static {v8, v9, v10}, Ld;->z(La3/p;J)V

    return-object v18

    :goto_1
    invoke-static {v8, v9, v10}, Ld;->z(La3/p;J)V

    throw v0
.end method

.method private static final h(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final i(Lp1/t2;)F
    .locals 0

    invoke-static {p0}, Lgb1/w;->h(Lp1/t2;)F

    move-result p0

    return p0
.end method

.method public static final j(FJF)J
    .locals 18

    const/16 v0, 0x20

    shr-long v1, p1, v0

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const-wide v2, 0xffffffffL

    and-long v4, p1, v2

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-static {v1, v4}, Ljava/lang/Math;->min(FF)F

    move-result v5

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    const/high16 v7, 0x3f800000    # 1.0f

    sub-float/2addr v5, v7

    move/from16 v8, p3

    invoke-static {v8, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    const/4 v8, 0x0

    cmpg-float v9, v5, v8

    if-gez v9, :cond_0

    move v5, v8

    :cond_0
    const/4 v9, 0x2

    int-to-float v9, v9

    mul-float v10, v9, v5

    sub-float v11, v1, v10

    cmpg-float v12, v11, v8

    if-gez v12, :cond_1

    move v11, v8

    :cond_1
    sub-float v10, v4, v10

    cmpg-float v12, v10, v8

    if-gez v12, :cond_2

    move v10, v8

    :cond_2
    const v12, 0x40490fdb    # (float)Math.PI

    mul-float v13, v5, v12

    div-float/2addr v13, v6

    add-float v6, v11, v10

    mul-float/2addr v6, v9

    const/4 v9, 0x4

    int-to-float v9, v9

    mul-float/2addr v9, v13

    add-float/2addr v9, v6

    cmpg-float v6, v9, v8

    const-wide/16 v14, 0x0

    if-gtz v6, :cond_3

    return-wide v14

    :cond_3
    rem-float v6, p0, v7

    cmpg-float v16, v6, v8

    if-nez v16, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {v6}, Ljava/lang/Math;->signum(F)F

    move-result v16

    invoke-static {v7}, Ljava/lang/Math;->signum(F)F

    move-result v17

    cmpg-float v16, v16, v17

    if-nez v16, :cond_5

    goto :goto_0

    :cond_5
    add-float/2addr v6, v7

    :goto_0
    mul-float/2addr v6, v9

    cmpg-float v7, v6, v11

    if-gez v7, :cond_6

    add-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v4, v1

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    :goto_1
    int-to-long v6, v1

    shl-long v0, v4, v0

    and-long/2addr v2, v6

    :goto_2
    or-long/2addr v0, v2

    return-wide v0

    :cond_6
    sub-float/2addr v6, v11

    cmpg-float v7, v6, v13

    if-gez v7, :cond_7

    const v4, -0x4036f025

    div-float/2addr v6, v5

    add-float/2addr v6, v4

    sub-float/2addr v1, v5

    float-to-double v6, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    double-to-float v4, v8

    mul-float/2addr v4, v5

    add-float/2addr v4, v1

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    double-to-float v1, v6

    mul-float/2addr v1, v5

    add-float/2addr v1, v5

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    goto :goto_1

    :cond_7
    sub-float/2addr v6, v13

    cmpg-float v7, v6, v10

    if-gez v7, :cond_8

    add-float/2addr v5, v6

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v6, v1

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    :goto_3
    int-to-long v4, v1

    shl-long v0, v6, v0

    and-long/2addr v2, v4

    goto :goto_2

    :cond_8
    sub-float/2addr v6, v10

    cmpg-float v7, v6, v13

    if-gez v7, :cond_9

    div-float/2addr v6, v5

    sub-float/2addr v1, v5

    float-to-double v6, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    double-to-float v8, v8

    mul-float/2addr v8, v5

    add-float/2addr v8, v1

    sub-float/2addr v4, v5

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    double-to-float v1, v6

    mul-float/2addr v5, v1

    add-float/2addr v5, v4

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v6, v1

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    goto :goto_3

    :cond_9
    sub-float/2addr v6, v13

    cmpg-float v7, v6, v11

    if-gez v7, :cond_a

    sub-float/2addr v1, v5

    sub-float/2addr v1, v6

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v5, v1

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    :goto_4
    int-to-long v7, v1

    shl-long v0, v5, v0

    and-long/2addr v2, v7

    goto :goto_2

    :cond_a
    sub-float/2addr v6, v11

    cmpg-float v1, v6, v13

    if-gez v1, :cond_b

    const v1, 0x3fc90fdb

    div-float/2addr v6, v5

    add-float/2addr v6, v1

    float-to-double v6, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    double-to-float v1, v8

    mul-float/2addr v1, v5

    add-float/2addr v1, v5

    sub-float/2addr v4, v5

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    double-to-float v6, v6

    mul-float/2addr v5, v6

    add-float/2addr v5, v4

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v6, v1

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    goto :goto_3

    :cond_b
    sub-float/2addr v6, v13

    cmpg-float v1, v6, v10

    if-gez v1, :cond_c

    sub-float/2addr v4, v5

    sub-float/2addr v4, v6

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v5, v1

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    goto :goto_4

    :cond_c
    sub-float/2addr v6, v10

    cmpg-float v1, v5, v8

    if-gtz v1, :cond_d

    return-wide v14

    :cond_d
    div-float/2addr v6, v5

    add-float/2addr v6, v12

    float-to-double v6, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    double-to-float v1, v8

    mul-float/2addr v1, v5

    add-float/2addr v1, v5

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    double-to-float v4, v6

    mul-float/2addr v4, v5

    add-float/2addr v4, v5

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v5, v1

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    goto :goto_4
.end method
