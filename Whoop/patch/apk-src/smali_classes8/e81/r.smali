.class public final Le81/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le81/r$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0019\u001a\u0004\u0008\u001c\u0010\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Le81/r;",
        "",
        "",
        "sliceCount",
        "",
        "gapAngle",
        "<init>",
        "(IF)V",
        "index",
        "b",
        "(I)F",
        "startDegrees",
        "degrees",
        "e",
        "(FF)F",
        "",
        "Le81/x;",
        "d",
        "()Ljava/util/List;",
        "angleDegrees",
        "c",
        "(F)Ljava/lang/Integer;",
        "a",
        "I",
        "()I",
        "F",
        "getGapAngle",
        "()F",
        "getSegmentAngle",
        "segmentAngle",
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


# static fields
.field private static final d:Le81/r$a;


# instance fields
.field private final a:I

.field private final b:F

.field private final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le81/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le81/r$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Le81/r;->d:Le81/r$a;

    return-void
.end method

.method public constructor <init>(IF)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Le81/r;->a:I

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpg-float v0, v0, v1

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    iput p2, p0, Le81/r;->b:F

    if-gtz p1, :cond_1

    goto :goto_1

    :cond_1
    const/high16 p2, 0x43b40000    # 360.0f

    int-to-float p1, p1

    div-float v1, p2, p1

    :goto_1
    iput v1, p0, Le81/r;->c:F

    return-void
.end method

.method private final b(I)F
    .locals 1

    iget v0, p0, Le81/r;->c:F

    int-to-float p1, p1

    mul-float/2addr v0, p1

    const/high16 p1, -0x3d4c0000    # -90.0f

    add-float/2addr v0, p1

    return v0
.end method

.method private final e(FF)F
    .locals 1

    sub-float/2addr p2, p1

    const/high16 p1, 0x43b40000    # 360.0f

    rem-float/2addr p2, p1

    const/4 v0, 0x0

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    add-float/2addr p2, p1

    :cond_0
    return p2
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Le81/r;->a:I

    return v0
.end method

.method public final c(F)Ljava/lang/Integer;
    .locals 2

    iget v0, p0, Le81/r;->a:I

    if-lez v0, :cond_1

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v0, -0x3d4c0000    # -90.0f

    invoke-direct {p0, v0, p1}, Le81/r;->e(FF)F

    move-result p1

    iget v0, p0, Le81/r;->c:F

    div-float/2addr p1, v0

    float-to-int p1, p1

    iget v0, p0, Le81/r;->a:I

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Le93/b;->n(III)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final d()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le81/x;",
            ">;"
        }
    .end annotation

    iget v0, p0, Le81/r;->a:I

    if-gtz v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0

    :cond_0
    iget v0, p0, Le81/r;->c:F

    iget v1, p0, Le81/r;->b:F

    sub-float v1, v0, v1

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Le93/b;->m(FFF)F

    move-result v0

    iget v1, p0, Le81/r;->c:F

    sub-float/2addr v1, v0

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget v2, p0, Le81/r;->a:I

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    new-instance v5, Le81/x;

    invoke-direct {p0, v4}, Le81/r;->b(I)F

    move-result v6

    add-float/2addr v6, v1

    invoke-direct {p0, v4}, Le81/r;->b(I)F

    move-result v7

    iget v8, p0, Le81/r;->c:F

    invoke-direct {v5, v6, v0, v7, v8}, Le81/x;-><init>(FFFF)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-object v3
.end method
