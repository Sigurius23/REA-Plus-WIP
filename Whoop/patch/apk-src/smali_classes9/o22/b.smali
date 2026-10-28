.class public abstract Lo22/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\n\"\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\n\u00a8\u0006\u000f\u00b2\u0006\u000c\u0010\u000e\u001a\u00020\u00008\nX\u008a\u0084\u0002"
    }
    d2 = {
        "",
        "dragPercentage",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "c",
        "(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "",
        "Li2/x;",
        "a",
        "Ljava/util/List;",
        "firstCircleGradientColors",
        "b",
        "secondCircleGradientColors",
        "circleAlpha",
        "pairing-ui_release"
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
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/x;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    sget v0, Li2/x;->o:I

    sget-wide v0, Li2/x;->m:J

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    const/16 v0, 0x19

    const/16 v1, 0xff

    invoke-static {v1, v1, v1, v0}, Li2/w0;->d(IIII)J

    move-result-wide v3

    new-instance v0, Li2/x;

    invoke-direct {v0, v3, v4}, Li2/x;-><init>(J)V

    filled-new-array {v2, v0}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lo22/b;->a:Ljava/util/List;

    const/16 v0, 0x66

    const/16 v2, 0xbc

    const/16 v3, 0x33

    invoke-static {v0, v2, v1, v3}, Li2/w0;->d(IIII)J

    move-result-wide v0

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    const/16 v0, 0x9b

    const/16 v1, 0xd9

    const/16 v4, 0x4c

    invoke-static {v4, v0, v1, v3}, Li2/w0;->d(IIII)J

    move-result-wide v0

    new-instance v4, Li2/x;

    invoke-direct {v4, v0, v1}, Li2/x;-><init>(J)V

    const/16 v0, 0x93

    const/16 v1, 0xe7

    const/4 v5, 0x0

    invoke-static {v5, v0, v1, v3}, Li2/w0;->d(IIII)J

    move-result-wide v0

    new-instance v3, Li2/x;

    invoke-direct {v3, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v2, v4, v3}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lo22/b;->b:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(FLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lo22/b;->f(FLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/t2;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lo22/b;->e(Lp1/t2;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 11

    move-object v6, p2

    check-cast v6, Lp1/q;

    const v0, -0x3e7c9153

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->d(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_4
    :goto_3
    and-int/lit8 v4, v0, 0x13

    const/16 v5, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v4, v5, :cond_5

    move v4, v10

    goto :goto_4

    :cond_5
    move v4, v9

    :goto_4
    and-int/2addr v0, v10

    invoke-virtual {v6, v0, v4}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    if-eqz v2, :cond_6

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_6
    move-object v0, p1

    :goto_5
    const/high16 v2, 0x42c80000    # 100.0f

    div-float v2, p0, v2

    const/16 v7, 0xc00

    const/16 v8, 0x16

    const/4 v3, 0x0

    const-string v4, "circleAlpha"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v2

    const/16 v3, 0x1f6

    int-to-float v3, v3

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0xfb

    int-to-float v4, v4

    sub-float/2addr v4, p0

    const/4 v5, 0x0

    invoke-static {v3, v5, v4, v10}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_7

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_8

    :cond_7
    new-instance v5, Lb;

    const/16 v4, 0x9

    invoke-direct {v5, v2, v4}, Lb;-><init>(Lp1/t2;I)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v5, v6, v9}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v2, v0

    goto :goto_6

    :cond_9
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v2, p1

    :goto_6
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v0, Lm22/o;

    const/4 v5, 0x1

    move v1, p0

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lm22/o;-><init>(FLandroidx/compose/ui/Modifier;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final d(Lp1/t2;)F
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

.method private static final e(Lp1/t2;Lk2/e;)Ll83/a0;
    .locals 25

    move-object/from16 v0, p1

    const-string v1, "$this$Canvas"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v1

    const/16 v3, 0x20

    shr-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const/high16 v2, 0x3fc00000    # 1.5f

    mul-float/2addr v1, v2

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v4

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    long-to-int v2, v4

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    sget-object v8, Li2/t;->b:Li2/s;

    sget-object v9, Lo22/b;->a:Ljava/util/List;

    invoke-interface {v0}, Lk2/e;->B0()J

    move-result-wide v10

    const/4 v15, 0x2

    int-to-float v2, v15

    div-float v2, v1, v2

    const/16 v13, 0x8

    move v12, v2

    invoke-static/range {v8 .. v13}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object v1

    sget-object v9, Lo22/b;->b:Ljava/util/List;

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v4

    shr-long/2addr v4, v3

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v10

    and-long/2addr v10, v6

    long-to-int v5, v10

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v10, v4

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    shl-long/2addr v10, v3

    and-long v3, v4, v6

    or-long v12, v10, v3

    const/16 v14, 0xa

    const-wide/16 v10, 0x0

    invoke-static/range {v8 .. v14}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v9

    invoke-interface {v0}, Lk2/e;->B0()J

    move-result-wide v3

    invoke-static/range {p0 .. p0}, Lo22/b;->d(Lp1/t2;)F

    move-result v5

    const/high16 v8, 0x3f800000    # 1.0f

    sub-float v5, v8, v5

    const/4 v6, 0x0

    const/16 v7, 0x70

    invoke-static/range {v0 .. v7}, Lk2/e;->G(Lk2/e;Li2/t;FJFLk2/f;I)V

    sget-wide v3, Li2/x;->f:J

    invoke-static/range {p0 .. p0}, Lo22/b;->d(Lp1/t2;)F

    move-result v1

    sub-float v1, v8, v1

    const v5, 0x3e99999a    # 0.3f

    mul-float/2addr v1, v5

    invoke-static {v1, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    move-wide/from16 v23, v3

    move v3, v2

    move-wide/from16 v1, v23

    invoke-interface {v0}, Lk2/e;->B0()J

    move-result-wide v4

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v10, v6

    invoke-interface {v0, v10}, Ly3/c;->q0(F)F

    move-result v17

    new-array v6, v15, [F

    fill-array-data v6, :array_0

    invoke-static/range {p0 .. p0}, Lo22/b;->d(Lp1/t2;)F

    move-result v7

    sub-float/2addr v8, v7

    const/high16 v7, 0x41200000    # 10.0f

    mul-float/2addr v8, v7

    new-instance v7, Li2/k;

    new-instance v11, Landroid/graphics/DashPathEffect;

    invoke-direct {v11, v6, v8}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v7, v11}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    new-instance v16, Lk2/i;

    const/16 v18, 0x0

    const/16 v22, 0x2

    const/16 v19, 0x1

    const/16 v20, 0x1

    move-object/from16 v21, v7

    invoke-direct/range {v16 .. v22}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/16 v8, 0x68

    const/4 v6, 0x0

    move-object/from16 v7, v16

    invoke-static/range {v0 .. v8}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    move v2, v3

    const/16 v1, 0xe6

    const/16 v3, 0xff

    const/16 v4, 0x67

    const/16 v5, 0xae

    invoke-static {v4, v5, v1, v3}, Li2/w0;->d(IIII)J

    move-result-wide v3

    invoke-static/range {p0 .. p0}, Lo22/b;->d(Lp1/t2;)F

    move-result v1

    const v11, 0x3f333333    # 0.7f

    mul-float/2addr v1, v11

    invoke-static {v1, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    move-wide/from16 v23, v3

    move v3, v2

    move-wide/from16 v1, v23

    invoke-interface {v0}, Lk2/e;->B0()J

    move-result-wide v4

    new-instance v7, Lk2/i;

    invoke-interface {v0, v10}, Ly3/c;->q0(F)F

    move-result v13

    const/16 v17, 0x0

    const/16 v18, 0x12

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x1

    move-object v12, v7

    invoke-direct/range {v12 .. v18}, Lk2/i;-><init>(FFIILi2/t0;I)V

    invoke-static/range {v0 .. v8}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    move v2, v3

    invoke-interface/range {p1 .. p1}, Lk2/e;->B0()J

    move-result-wide v3

    invoke-static/range {p0 .. p0}, Lo22/b;->d(Lp1/t2;)F

    move-result v0

    mul-float v5, v0, v11

    const/4 v6, 0x0

    const/16 v7, 0x70

    move-object/from16 v0, p1

    move-object v1, v9

    invoke-static/range {v0 .. v7}, Lk2/e;->G(Lk2/e;Li2/t;FJFLk2/f;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x41200000    # 10.0f
    .end array-data
.end method

.method private static final f(FLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lo22/b;->c(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
