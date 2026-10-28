.class public final synthetic Lg1/w5;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Li93/f;

.field public final synthetic x:Lkotlin/jvm/internal/d0;

.field public final synthetic y:Lkotlin/jvm/internal/d0;


# direct methods
.method public constructor <init>(Li93/f;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/d0;)V
    .locals 6

    iput-object p1, p0, Lg1/w5;->w:Li93/f;

    iput-object p2, p0, Lg1/w5;->x:Lkotlin/jvm/internal/d0;

    iput-object p3, p0, Lg1/w5;->y:Lkotlin/jvm/internal/d0;

    const-string v4, "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Lkotlin/jvm/internal/j;

    const-string v3, "scaleToOffset"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object v0, p0, Lg1/w5;->w:Li93/f;

    invoke-interface {v0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-interface {v0}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object v2, p0, Lg1/w5;->x:Lkotlin/jvm/internal/d0;

    iget v2, v2, Lkotlin/jvm/internal/d0;->w:F

    iget-object v3, p0, Lg1/w5;->y:Lkotlin/jvm/internal/d0;

    iget v3, v3, Lkotlin/jvm/internal/d0;->w:F

    sget v4, Lg1/g6;->a:F

    sub-float/2addr v0, v1

    const/4 v4, 0x0

    cmpg-float v5, v0, v4

    if-nez v5, :cond_0

    move p1, v4

    goto :goto_0

    :cond_0
    sub-float/2addr p1, v1

    div-float/2addr p1, v0

    :goto_0
    cmpg-float v0, p1, v4

    if-gez v0, :cond_1

    goto :goto_1

    :cond_1
    move v4, p1

    :goto_1
    const/high16 p1, 0x3f800000    # 1.0f

    cmpl-float v0, v4, p1

    if-lez v0, :cond_2

    move v4, p1

    :cond_2
    invoke-static {v2, v3, v4}, Le93/b;->O(FFF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
