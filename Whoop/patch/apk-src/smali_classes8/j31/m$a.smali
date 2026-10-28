.class public final Lj31/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj31/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u00088\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lj31/m$a;",
        "",
        "<init>",
        "()V",
        "",
        "viewSize",
        "",
        "viewSizeOutOfBounds",
        "",
        "time",
        "maxScroll",
        "b",
        "(IFJF)F",
        "ACCELERATION_LIMIT_TIME_MS",
        "J",
        "Lkotlin/Function1;",
        "EaseOutQuadInterpolator",
        "Lkotlin/jvm/functions/Function1;",
        "EaseInQuintInterpolator",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lj31/m$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lj31/m$a;IFJF)F
    .locals 0

    invoke-direct/range {p0 .. p5}, Lj31/m$a;->b(IFJF)F

    move-result p0

    return p0
.end method

.method private final b(IFJF)F
    .locals 5

    const/4 v0, 0x0

    cmpg-float v1, p2, v0

    if-nez v1, :cond_0

    return v0

    :cond_0
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    int-to-float p1, p1

    div-float/2addr v1, p1

    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    move-result v1

    mul-float/2addr v1, p5

    invoke-static {}, Lj31/m;->j()Lkotlin/jvm/functions/Function1;

    move-result-object p5

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    mul-float/2addr p1, v1

    const-wide/16 v3, 0x5dc

    cmp-long p5, p3, v3

    if-lez p5, :cond_1

    move p3, v2

    goto :goto_0

    :cond_1
    long-to-float p3, p3

    long-to-float p4, v3

    div-float/2addr p3, p4

    :goto_0
    invoke-static {}, Lj31/m;->i()Lkotlin/jvm/functions/Function1;

    move-result-object p4

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-interface {p4, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p3

    mul-float/2addr p3, p1

    cmpg-float p1, p3, v0

    if-nez p1, :cond_3

    cmpl-float p1, p2, v0

    if-lez p1, :cond_2

    return v2

    :cond_2
    const/high16 p1, -0x40800000    # -1.0f

    return p1

    :cond_3
    return p3
.end method
