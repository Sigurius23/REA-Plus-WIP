.class public abstract Lkd1/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003\"\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lk2/e;",
        "Ll83/a0;",
        "c",
        "(Lk2/e;)V",
        "b",
        "a",
        "",
        "Li2/x;",
        "Ljava/util/List;",
        "panelGradientColors",
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
.field private static final a:Ljava/util/List;
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

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->W0()J

    move-result-wide v0

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->a1()J

    move-result-wide v0

    new-instance v3, Li2/x;

    invoke-direct {v3, v0, v1}, Li2/x;-><init>(J)V

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->V0()J

    move-result-wide v0

    new-instance v4, Li2/x;

    invoke-direct {v4, v0, v1}, Li2/x;-><init>(J)V

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->V0()J

    move-result-wide v0

    new-instance v5, Li2/x;

    invoke-direct {v5, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v2, v3, v4, v5}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lkd1/v;->a:Ljava/util/List;

    return-void
.end method

.method private static final a(Lk2/e;)V
    .locals 21

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v1

    invoke-interface/range {p0 .. p0}, Lk2/e;->d()J

    move-result-wide v2

    const/16 v0, 0x20

    shr-long/2addr v2, v0

    long-to-int v0, v2

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-interface/range {p0 .. p0}, Lk2/e;->d()J

    move-result-wide v2

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    iget-object v3, v1, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {v1}, Li2/j;->k()V

    const/high16 v4, 0x42500000    # 52.0f

    const/4 v5, 0x0

    invoke-virtual {v1, v5, v4}, Li2/j;->i(FF)V

    const/4 v4, 0x2

    int-to-float v4, v4

    const/high16 v6, 0x42000000    # 32.0f

    mul-float v7, v4, v6

    const/high16 v8, 0x41a00000    # 20.0f

    add-float v9, v7, v8

    iget-object v10, v1, Li2/j;->b:Landroid/graphics/RectF;

    if-nez v10, :cond_0

    new-instance v10, Landroid/graphics/RectF;

    invoke-direct {v10}, Landroid/graphics/RectF;-><init>()V

    iput-object v10, v1, Li2/j;->b:Landroid/graphics/RectF;

    :cond_0
    iget-object v10, v1, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v10, v5, v8, v7, v9}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v10, v1, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/high16 v11, 0x43340000    # 180.0f

    const/high16 v12, 0x42b40000    # 90.0f

    const/4 v13, 0x0

    invoke-virtual {v3, v10, v11, v12, v13}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    div-float v10, v0, v4

    const/high16 v11, 0x42200000    # 40.0f

    div-float/2addr v11, v4

    sub-float v4, v10, v11

    invoke-virtual {v1, v4, v8}, Li2/j;->h(FF)V

    invoke-virtual {v1, v10, v5}, Li2/j;->h(FF)V

    add-float/2addr v11, v10

    invoke-virtual {v1, v11, v8}, Li2/j;->h(FF)V

    sub-float v14, v0, v6

    invoke-virtual {v1, v14, v8}, Li2/j;->h(FF)V

    sub-float v14, v0, v7

    iget-object v15, v1, Li2/j;->b:Landroid/graphics/RectF;

    if-nez v15, :cond_1

    new-instance v15, Landroid/graphics/RectF;

    invoke-direct {v15}, Landroid/graphics/RectF;-><init>()V

    iput-object v15, v1, Li2/j;->b:Landroid/graphics/RectF;

    :cond_1
    iget-object v15, v1, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v15, v14, v8, v0, v9}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v9, v1, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/high16 v15, 0x43870000    # 270.0f

    invoke-virtual {v3, v9, v15, v12, v13}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    sub-float v9, v2, v6

    invoke-virtual {v1, v0, v9}, Li2/j;->h(FF)V

    sub-float v9, v2, v7

    iget-object v15, v1, Li2/j;->b:Landroid/graphics/RectF;

    if-nez v15, :cond_2

    new-instance v15, Landroid/graphics/RectF;

    invoke-direct {v15}, Landroid/graphics/RectF;-><init>()V

    iput-object v15, v1, Li2/j;->b:Landroid/graphics/RectF;

    :cond_2
    iget-object v15, v1, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v15, v14, v9, v0, v2}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, v1, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3, v0, v5, v12, v13}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    invoke-virtual {v1, v6, v2}, Li2/j;->h(FF)V

    iget-object v0, v1, Li2/j;->b:Landroid/graphics/RectF;

    if-nez v0, :cond_3

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, v1, Li2/j;->b:Landroid/graphics/RectF;

    :cond_3
    iget-object v0, v1, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v5, v9, v7, v2}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, v1, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3, v0, v12, v12, v13}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    invoke-virtual {v1}, Li2/j;->f()V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v15

    invoke-virtual {v15, v4, v8}, Li2/j;->i(FF)V

    invoke-virtual {v15, v10, v5}, Li2/j;->h(FF)V

    invoke-virtual {v15, v11, v8}, Li2/j;->h(FF)V

    invoke-virtual {v15}, Li2/j;->f()V

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->W0()J

    move-result-wide v16

    const/16 v19, 0x0

    const/16 v20, 0x3c

    const/16 v18, 0x0

    move-object/from16 v14, p0

    invoke-static/range {v14 .. v20}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V

    sget-object v0, Li2/t;->b:Li2/s;

    sget-object v2, Lkd1/v;->a:Ljava/util/List;

    const/16 v3, 0xe

    invoke-static {v0, v2, v5, v5, v3}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v2

    new-instance v3, Lk2/i;

    const/4 v0, 0x1

    int-to-float v0, v0

    invoke-interface {v14, v0}, Ly3/c;->q0(F)F

    move-result v4

    const/4 v8, 0x0

    const/16 v9, 0x1e

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/16 v5, 0x34

    move-object v4, v3

    const/4 v3, 0x0

    move-object v0, v14

    invoke-static/range {v0 .. v5}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V

    return-void
.end method

.method private static final b(Lk2/e;)V
    .locals 14

    const/4 v0, 0x3

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-interface {p0, v0}, Ly3/c;->q0(F)F

    move-result v0

    sget-object v2, Li2/t;->b:Li2/s;

    sget-object v3, Lkd1/v;->a:Ljava/util/List;

    const/16 v4, 0xe

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v5, v4}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v2

    move v3, v5

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v5

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    const/high16 v7, 0x41a00000    # 20.0f

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    const/16 v9, 0x20

    shl-long/2addr v3, v9

    const-wide v10, 0xffffffffL

    and-long/2addr v7, v10

    or-long/2addr v3, v7

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v12, v0

    shl-long/2addr v7, v9

    and-long v9, v12, v10

    or-long/2addr v7, v9

    const/4 v10, 0x0

    const/16 v11, 0xf0

    const/4 v9, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v11}, Lk2/e;->J0(Lk2/e;Li2/t;JJJFLk2/f;I)V

    return-void
.end method

.method public static final c(Lk2/e;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkd1/v;->b(Lk2/e;)V

    invoke-static {p0}, Lkd1/v;->a(Lk2/e;)V

    return-void
.end method
