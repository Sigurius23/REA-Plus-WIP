.class public final Lkd1/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkd1/t$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lkd1/t;",
        "",
        "<init>",
        "()V",
        "",
        "color1",
        "color2",
        "",
        "ratio",
        "e",
        "(IIF)I",
        "Ll83/k;",
        "intPair",
        "Li93/h;",
        "b",
        "(Ll83/k;)Li93/h;",
        "progression",
        "a",
        "(Li93/h;)I",
        "t",
        "c",
        "(Li93/h;F)F",
        "",
        "name",
        "",
        "ignoreCurrent",
        "Ly81/f;",
        "f",
        "(Ljava/lang/String;Z)Ly81/f;",
        "range",
        "value",
        "d",
        "(Li93/h;I)F",
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Li93/h;)I
    .locals 1

    const-string v0, "progression"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p1, Li93/h;->x:I

    iget p1, p1, Li93/h;->w:I

    sub-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result p1

    return p1
.end method

.method public final b(Ll83/k;)Li93/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/k;",
            ")",
            "Li93/h;"
        }
    .end annotation

    const-string v0, "intPair"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-ge v1, v2, :cond_0

    new-instance v1, Li93/j;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    const/4 v2, 0x1

    invoke-direct {v1, v0, p1, v2}, Li93/h;-><init>(III)V

    return-object v1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v1, Li93/h;

    const/4 v2, -0x1

    invoke-direct {v1, v0, p1, v2}, Li93/h;-><init>(III)V

    return-object v1
.end method

.method public final c(Li93/h;F)F
    .locals 2

    const-string v0, "progression"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p1, Li93/h;->w:I

    int-to-float v1, v0

    iget p1, p1, Li93/h;->x:I

    int-to-float p1, p1

    int-to-float v0, v0

    invoke-static {p1, v0, p2, v1}, Lb9/y;->a(FFFF)F

    move-result p1

    return p1
.end method

.method public final d(Li93/h;I)F
    .locals 1

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p1, Li93/h;->w:I

    sub-int/2addr p2, v0

    int-to-float p2, p2

    iget p1, p1, Li93/h;->x:I

    sub-int/2addr p1, v0

    int-to-float p1, p1

    div-float/2addr p2, p1

    const/4 p1, 0x0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p2, p1, v0}, Le93/b;->m(FFF)F

    move-result p1

    return p1
.end method

.method public final e(IIF)I
    .locals 8

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p3

    invoke-static {p2}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p3

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v0

    add-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const v3, 0x7f7fffff    # Float.MAX_VALUE

    cmpg-float v2, v2, v3

    const/4 v4, 0x0

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v4

    :goto_0
    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v5, p3

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v6, v0

    add-float/2addr v6, v5

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v6, v6, v3

    if-gtz v6, :cond_2

    goto :goto_2

    :cond_2
    move-object v5, v4

    :goto_2
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    goto :goto_3

    :cond_3
    move v5, v2

    :goto_3
    invoke-static {p2}, Landroid/graphics/Color;->green(I)I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v6, p3

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v7

    int-to-float v7, v7

    mul-float/2addr v7, v0

    add-float/2addr v7, v6

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v7

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    cmpg-float v7, v7, v3

    if-gtz v7, :cond_4

    goto :goto_4

    :cond_4
    move-object v6, v4

    :goto_4
    if-eqz v6, :cond_5

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    goto :goto_5

    :cond_5
    move v6, v2

    :goto_5
    invoke-static {p2}, Landroid/graphics/Color;->blue(I)I

    move-result p2

    int-to-float p2, p2

    mul-float/2addr p2, p3

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    int-to-float p1, p1

    mul-float/2addr p1, v0

    add-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpg-float p2, p2, v3

    if-gtz p2, :cond_6

    move-object v4, p1

    :cond_6
    if-eqz v4, :cond_7

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v2

    :cond_7
    invoke-static {v1}, Le93/b;->X(F)I

    move-result p1

    invoke-static {v5}, Le93/b;->X(F)I

    move-result p2

    invoke-static {v6}, Le93/b;->X(F)I

    move-result p3

    invoke-static {v2}, Le93/b;->X(F)I

    move-result v0

    invoke-static {p1, p2, p3, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1
.end method

.method public final f(Ljava/lang/String;Z)Ly81/f;
    .locals 6

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc81/f;->NEUTRAL:Lc81/f;

    invoke-static {}, Lc81/f;->values()[Lc81/f;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v4

    :goto_2
    sget-object p1, Lkd1/t$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p1, p1, v0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_6

    const/4 v0, 0x2

    if-eq p1, v0, :cond_4

    const/4 p2, 0x3

    if-ne p1, p2, :cond_3

    sget-object p1, Ly81/f;->WHITE_30:Ly81/f;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    if-eqz p2, :cond_5

    sget-object p1, Ly81/f;->WHITE_10:Ly81/f;

    return-object p1

    :cond_5
    sget-object p1, Ly81/f;->WHITE_90:Ly81/f;

    return-object p1

    :cond_6
    sget-object p1, Ly81/f;->WHITE_10:Ly81/f;

    return-object p1
.end method
