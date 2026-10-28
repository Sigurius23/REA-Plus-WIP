.class public abstract Ld51/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001f\u0010\u0008\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\u0006\u001a\u0019\u0010\u000c\u001a\u00020\u000b*\u00020\t2\u0006\u0010\u0004\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Li93/f;",
        "",
        "d",
        "(Li93/f;)F",
        "t",
        "b",
        "(Li93/f;F)F",
        "value",
        "a",
        "Li93/j;",
        "",
        "",
        "c",
        "(Li93/j;D)I",
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


# direct methods
.method public static final a(Li93/f;F)F
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li93/f;",
            "F)F"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    sub-float/2addr p1, v0

    invoke-interface {p0}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-interface {p0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    sub-float/2addr v0, p0

    div-float/2addr p1, v0

    const/4 p0, 0x0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, p0, v0}, Le93/b;->m(FFF)F

    move-result p0

    return p0
.end method

.method public static final b(Li93/f;F)F
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li93/f;",
            "F)F"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-interface {p0}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-interface {p0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    sub-float/2addr v1, p0

    mul-float/2addr v1, p1

    add-float/2addr v1, v0

    return v1
.end method

.method public static final c(Li93/j;D)I
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Li93/h;->w:I

    iget p0, p0, Li93/h;->x:I

    sub-int/2addr p0, v0

    int-to-double v1, p0

    mul-double/2addr p1, v1

    double-to-int p0, p1

    add-int/2addr v0, p0

    return v0
.end method

.method public static final d(Li93/f;)F
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li93/f;",
            ")F"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    sget-object v1, Lg93/d;->x:Lg93/a;

    invoke-virtual {v1}, Lg93/a;->e()F

    move-result v1

    invoke-interface {p0}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-interface {p0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    sub-float/2addr v2, p0

    mul-float/2addr v2, v1

    add-float/2addr v2, v0

    return v2
.end method
