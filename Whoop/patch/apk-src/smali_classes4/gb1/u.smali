.class public abstract Lgb1/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aQ\u0010\u000c\u001a\u00020\u000b*\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0010\u0008\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a]\u0010\u0011\u001a\u00020\u000b*\u00020\u00002*\u0010\u0010\u001a\u0016\u0012\u0012\u0008\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u000f0\u000e\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u000f2\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Li2/s;",
        "",
        "Li2/x;",
        "colors",
        "",
        "stops",
        "Li2/w0;",
        "tileMode",
        "angleInDegrees",
        "",
        "useAsCssAngle",
        "Li2/t;",
        "a",
        "(Li2/s;Ljava/util/List;Ljava/util/List;IFZ)Li2/t;",
        "",
        "Ll83/k;",
        "colorStops",
        "c",
        "(Li2/s;[Ll83/k;IFZ)Li2/t;",
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
.method public static final a(Li2/s;Ljava/util/List;Ljava/util/List;IFZ)Li2/t;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li2/s;",
            "Ljava/util/List<",
            "Li2/x;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;IFZ)",
            "Li2/t;"
        }
    .end annotation

    const-string v0, "$this$angledLinearGradient"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "colors"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lgb1/t;

    const/4 v6, 0x0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lgb1/t;-><init>(Ljava/util/List;Ljava/util/List;IFZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic b(Li2/s;Ljava/util/List;Ljava/util/List;IFZILjava/lang/Object;)Li2/t;
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    const/4 p7, 0x0

    if-eqz p2, :cond_1

    move v3, p7

    goto :goto_0

    :cond_1
    move v3, p3

    :goto_0
    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    const/4 p4, 0x0

    :cond_2
    move v4, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    move v5, p7

    :goto_1
    move-object v0, p0

    move-object v1, p1

    goto :goto_2

    :cond_3
    move v5, p5

    goto :goto_1

    :goto_2
    invoke-static/range {v0 .. v5}, Lgb1/u;->a(Li2/s;Ljava/util/List;Ljava/util/List;IFZ)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Li2/s;[Ll83/k;IFZ)Li2/t;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li2/s;",
            "[",
            "Ll83/k;",
            "IFZ)",
            "Li2/t;"
        }
    .end annotation

    const-string v0, "$this$angledLinearGradient"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "colorStops"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p0, p1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-ge v2, p0, :cond_0

    aget-object v3, p1, v2

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v3, Li2/x;

    iget-wide v3, v3, Li2/x;->a:J

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    array-length p0, p1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, p0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v0, p0, :cond_1

    aget-object v3, p1, v0

    iget-object v3, v3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    new-instance v0, Lgb1/t;

    const/4 v6, 0x0

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v6}, Lgb1/t;-><init>(Ljava/util/List;Ljava/util/List;IFZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic d(Li2/s;[Ll83/k;IFZILjava/lang/Object;)Li2/t;
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move p4, v0

    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Lgb1/u;->c(Li2/s;[Ll83/k;IFZ)Li2/t;

    move-result-object p0

    return-object p0
.end method
