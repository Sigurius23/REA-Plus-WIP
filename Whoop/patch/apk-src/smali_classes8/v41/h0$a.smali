.class final Lv41/h0$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv41/h0;->a(Lqi/i;Ljava/util/Map;Ljava/util/List;FIILjava/util/Map;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Landroid/graphics/Bitmap;",
        "<anonymous>",
        "(Lbc3/c0;)Landroid/graphics/Bitmap;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.StaticLottieFrameKt$renderStaticLottieFrame$2"
    f = "StaticLottieFrame.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ll83/k;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic F:F

.field final synthetic G:I

.field final synthetic H:I

.field w:I

.field final synthetic x:Lqi/i;

.field final synthetic y:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic z:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lqi/i;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;FIILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqi/i;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Landroid/graphics/Typeface;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ll83/k;",
            ">;FII",
            "Lq83/d<",
            "-",
            "Lv41/h0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lv41/h0$a;->x:Lqi/i;

    iput-object p2, p0, Lv41/h0$a;->y:Ljava/util/Map;

    iput-object p3, p0, Lv41/h0$a;->z:Ljava/util/Map;

    iput-object p4, p0, Lv41/h0$a;->E:Ljava/util/List;

    iput p5, p0, Lv41/h0$a;->F:F

    iput p6, p0, Lv41/h0$a;->G:I

    iput p7, p0, Lv41/h0$a;->H:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lv41/h0$a;

    iget-object v1, p0, Lv41/h0$a;->x:Lqi/i;

    iget-object v2, p0, Lv41/h0$a;->y:Ljava/util/Map;

    iget-object v3, p0, Lv41/h0$a;->z:Ljava/util/Map;

    iget-object v4, p0, Lv41/h0$a;->E:Ljava/util/List;

    iget v5, p0, Lv41/h0$a;->F:F

    iget v6, p0, Lv41/h0$a;->G:I

    iget v7, p0, Lv41/h0$a;->H:I

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lv41/h0$a;-><init>(Lqi/i;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;FIILq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lv41/h0$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lv41/h0$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lv41/h0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lv41/h0$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lv41/h0$a;->w:I

    if-nez v0, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lqi/w;

    invoke-direct {p1}, Lqi/w;-><init>()V

    iget-object v0, p0, Lv41/h0$a;->x:Lqi/i;

    invoke-virtual {p1, v0}, Lqi/w;->p(Lqi/i;)Z

    iget-object v0, p0, Lv41/h0$a;->y:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lv41/h0$a;->y:Ljava/util/Map;

    iget-object v1, p1, Lqi/w;->J:Ljava/util/Map;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iput-object v0, p1, Lqi/w;->J:Ljava/util/Map;

    invoke-virtual {p1}, Lqi/w;->invalidateSelf()V

    :cond_1
    :goto_0
    iget-object v0, p0, Lv41/h0$a;->z:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, "**"

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    new-instance v4, Lwi/e;

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2}, Lwi/e;-><init>([Ljava/lang/String;)V

    sget-object v2, Lqi/a0;->a:Landroid/graphics/PointF;

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Ld1/j;

    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-direct {v3, v5}, Ld1/j;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v4, v2, v3}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lv41/h0$a;->E:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll83/k;

    iget-object v3, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap;

    new-instance v4, Lwi/e;

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3}, Lwi/e;-><init>([Ljava/lang/String;)V

    sget-object v3, Lqi/a0;->I:Landroid/graphics/Bitmap;

    new-instance v5, Ld1/j;

    invoke-direct {v5, v1}, Ld1/j;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v4, v3, v5}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_2

    :cond_3
    iget v0, p0, Lv41/h0$a;->F:F

    invoke-virtual {p1, v0}, Lqi/w;->w(F)V

    iget v0, p0, Lv41/h0$a;->G:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_4

    move v0, v1

    :cond_4
    iget v2, p0, Lv41/h0$a;->H:I

    if-ge v2, v1, :cond_5

    goto :goto_3

    :cond_5
    move v1, v2

    :goto_3
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    const-string v3, "createBitmap(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iget-object v4, p0, Lv41/h0$a;->x:Lqi/i;

    iget-object v4, v4, Lqi/i;->k:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    iget-object v5, p0, Lv41/h0$a;->x:Lqi/i;

    iget-object v5, v5, Lqi/i;->k:Landroid/graphics/Rect;

    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    move-result v5

    int-to-float v0, v0

    int-to-float v6, v4

    div-float v7, v0, v6

    int-to-float v1, v1

    int-to-float v8, v5

    div-float v9, v1, v8

    invoke-static {v7, v9}, Ljava/lang/Math;->min(FF)F

    move-result v7

    new-instance v9, Landroid/graphics/Matrix;

    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    mul-float/2addr v6, v7

    sub-float/2addr v0, v6

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v0, v6

    mul-float/2addr v8, v7

    sub-float/2addr v1, v8

    div-float/2addr v1, v6

    invoke-virtual {v9, v0, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    invoke-virtual {v9, v7, v7}, Landroid/graphics/Matrix;->preScale(FF)Z

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {p1, v3, v9}, Lqi/w;->g(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    return-object v2

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
