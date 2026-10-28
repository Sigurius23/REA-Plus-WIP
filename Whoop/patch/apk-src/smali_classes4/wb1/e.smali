.class public abstract Lwb1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwb1/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u001a3\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a+\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a+\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;",
        "axis",
        "Lwb1/c;",
        "axisPosition",
        "Lg61/d;",
        "axisType",
        "Ly81/e;",
        "labelColorOverride",
        "Lyy0/c;",
        "b",
        "(Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;Lwb1/c;Lg61/d;Ly81/e;)Lyy0/c;",
        "",
        "position",
        "Ll83/k;",
        "",
        "d",
        "(DLg61/d;)Ll83/k;",
        "a",
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
.method private static final a(DLg61/d;)Ll83/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D",
            "Lg61/d;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    sget-object v0, Lwb1/e$a;->b:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    :goto_0
    new-instance p2, Ll83/k;

    const v0, 0x3dcccccd    # 0.1f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    double-to-float p0, p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-direct {p2, v0, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2

    :cond_2
    new-instance p2, Ll83/k;

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    double-to-float p0, p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-direct {p2, v0, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method

.method public static final b(Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;Lwb1/c;Lg61/d;Ly81/e;)Lyy0/c;
    .locals 7

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const-string v1, "axis"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "axisPosition"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "axisType"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lwb1/e$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 p2, 0x3

    if-eq p1, p2, :cond_1

    const/4 p2, 0x4

    if-ne p1, p2, :cond_0

    new-instance p1, Ll83/k;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->getPosition()D

    move-result-wide v1

    double-to-float p2, v1

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-direct {p1, p2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance p1, Ll83/k;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->getPosition()D

    move-result-wide v1

    double-to-float p2, v1

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-direct {p1, p2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->getPosition()D

    move-result-wide v0

    invoke-static {v0, v1, p2}, Lwb1/e;->a(DLg61/d;)Ll83/k;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->getPosition()D

    move-result-wide v0

    invoke-static {v0, v1, p2}, Lwb1/e;->d(DLg61/d;)Ll83/k;

    move-result-object p1

    :goto_0
    new-instance v0, Lyy0/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->getLabel()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->getSubLabel()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-static {p2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p2

    :goto_1
    move-object v2, p2

    goto :goto_2

    :cond_4
    const/4 p2, 0x0

    goto :goto_1

    :goto_2
    if-nez p3, :cond_5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->getStyle()Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;

    move-result-object p2

    invoke-static {p2}, Lwb1/b;->a(Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;)Ly81/e;

    move-result-object p3

    :cond_5
    move-object v3, p3

    iget-object p2, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result v4

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->getIcon()Lgz0/m0;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;)V

    return-object v0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;Lwb1/c;Lg61/d;Ly81/e;ILjava/lang/Object;)Lyy0/c;
    .locals 0

    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lwb1/e;->b(Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;Lwb1/c;Lg61/d;Ly81/e;)Lyy0/c;

    move-result-object p0

    return-object p0
.end method

.method private static final d(DLg61/d;)Ll83/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D",
            "Lg61/d;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    sget-object v0, Lwb1/e$a;->b:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    :goto_0
    new-instance p2, Ll83/k;

    const v0, 0x3f666666    # 0.9f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    double-to-float p0, p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-direct {p2, v0, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2

    :cond_2
    new-instance p2, Ll83/k;

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    double-to-float p0, p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-direct {p2, v0, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method
