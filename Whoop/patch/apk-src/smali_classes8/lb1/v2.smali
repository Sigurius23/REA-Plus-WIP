.class public abstract Llb1/v2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/v2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a%\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a-\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "",
        "value",
        "c",
        "(D)D",
        "",
        "decimalPlaces",
        "Llb1/w2;",
        "rule",
        "d",
        "(DILlb1/w2;)D",
        "",
        "b",
        "(DI)Z",
        "lowerBound",
        "upperBound",
        "Li93/f;",
        "a",
        "(DDI)Li93/f;",
        "design-models_release"
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
.method public static final a(DDI)Li93/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDI)",
            "Li93/f;"
        }
    .end annotation

    sget-object v0, Llb1/w2;->UP:Llb1/w2;

    invoke-static {p0, p1, p4, v0}, Llb1/v2;->d(DILlb1/w2;)D

    move-result-wide p0

    sget-object v0, Llb1/w2;->DOWN:Llb1/w2;

    invoke-static {p2, p3, p4, v0}, Llb1/v2;->d(DILlb1/w2;)D

    move-result-wide p2

    cmpg-double p4, p0, p2

    if-gtz p4, :cond_0

    new-instance p4, Li93/d;

    invoke-direct {p4, p0, p1, p2, p3}, Li93/d;-><init>(DD)V

    return-object p4

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final b(DI)Z
    .locals 2

    sget-object v0, Llb1/w2;->NEAREST:Llb1/w2;

    invoke-static {p0, p1, p2, v0}, Llb1/v2;->d(DILlb1/w2;)D

    move-result-wide v0

    cmpg-double p0, v0, p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final c(D)D
    .locals 3

    const-wide/16 v0, 0x0

    cmpg-double v0, p0, v0

    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    if-gez v0, :cond_0

    neg-double p0, p0

    add-double/2addr p0, v1

    invoke-static {p0, p1}, Ljava/lang/Math;->floor(D)D

    move-result-wide p0

    neg-double p0, p0

    return-wide p0

    :cond_0
    add-double/2addr p0, v1

    invoke-static {p0, p1}, Ljava/lang/Math;->floor(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final d(DILlb1/w2;)D
    .locals 10

    const-string v0, "rule"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    int-to-double v2, p2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    const-wide v4, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpg-double p2, v2, v4

    if-gtz p2, :cond_4

    mul-double v2, p0, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    cmpg-double p2, v6, v4

    if-gtz p2, :cond_4

    invoke-static {v2, v3}, Llb1/v2;->c(D)D

    move-result-wide p0

    sub-double v4, v2, p0

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    invoke-static {v2, v3}, Ljava/lang/Math;->ulp(D)D

    move-result-wide v6

    const/4 p2, 0x2

    int-to-double v8, p2

    mul-double/2addr v6, v8

    cmpg-double v4, v4, v6

    if-gtz v4, :cond_0

    move-wide v2, p0

    :cond_0
    sget-object p0, Llb1/v2$a;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p0, p0, p1

    const/4 p1, 0x1

    if-eq p0, p1, :cond_3

    if-eq p0, p2, :cond_2

    const/4 p1, 0x3

    if-ne p0, p1, :cond_1

    invoke-static {v2, v3}, Llb1/v2;->c(D)D

    move-result-wide p0

    goto :goto_0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide p0

    goto :goto_0

    :cond_3
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p0

    :goto_0
    div-double/2addr p0, v0

    :cond_4
    return-wide p0
.end method
