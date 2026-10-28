.class public abstract Lor2/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a9\u0010\u000e\u001a\u00020\u00042\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001aA\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "",
        "interval",
        "e",
        "(DD)D",
        "",
        "f",
        "(FF)F",
        "",
        "decimals",
        "d",
        "(FI)F",
        "Ll83/k;",
        "startPoint",
        "endPoint",
        "a",
        "(Ll83/k;Ll83/k;)F",
        "",
        "b",
        "(Ll83/k;Ll83/k;)Ljava/util/List;",
        "Li93/h;",
        "c",
        "(II)Li93/h;",
        "core_release"
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
.method public static final a(Ll83/k;Ll83/k;)F
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/k;",
            "Ll83/k;",
            ")F"
        }
    .end annotation

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object v1, p0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    sub-float/2addr v0, v1

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object p0, p0, Ll83/k;->x:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    sub-float/2addr p1, p0

    float-to-double p0, p1

    float-to-double v0, v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p0

    double-to-float p0, p0

    const/16 p1, 0x64

    int-to-float p1, p1

    mul-float/2addr p0, p1

    const/16 p1, 0x168

    int-to-float p1, p1

    sub-float/2addr p1, p0

    const/4 p0, 0x2

    invoke-static {p1, p0}, Lor2/a1;->d(FI)F

    move-result p0

    const/high16 p1, 0x42b40000    # 90.0f

    sub-float/2addr p0, p1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final b(Ll83/k;Ll83/k;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/k;",
            "Ll83/k;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p0, Ll83/k;->x:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    add-float/2addr p1, p0

    const/4 p0, 0x2

    int-to-float p0, p0

    div-float/2addr p1, p0

    const/4 p0, 0x0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    const/4 v0, 0x1

    int-to-float v0, v0

    sub-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    filled-new-array {p0, p1, v0}, [Ljava/lang/Float;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final c(II)Li93/h;
    .locals 2

    if-le p0, p1, :cond_0

    new-instance v0, Li93/h;

    const/4 v1, -0x1

    invoke-direct {v0, p0, p1, v1}, Li93/h;-><init>(III)V

    return-object v0

    :cond_0
    new-instance v0, Li93/j;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Li93/h;-><init>(III)V

    return-object v0
.end method

.method public static final d(FI)F
    .locals 4

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    return p0

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, 0x0

    :cond_1
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    int-to-double v2, p1

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    float-to-double p0, p0

    mul-double/2addr p0, v0

    invoke-static {p0, p1}, Le93/b;->W(D)I

    move-result p0

    int-to-double p0, p0

    div-double/2addr p0, v0

    double-to-float p0, p0

    return p0
.end method

.method public static final e(DD)D
    .locals 0

    div-double/2addr p0, p2

    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide p0

    long-to-double p0, p0

    mul-double/2addr p0, p2

    return-wide p0
.end method

.method public static final f(FF)F
    .locals 0

    div-float/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    int-to-float p0, p0

    mul-float/2addr p0, p1

    return p0
.end method
