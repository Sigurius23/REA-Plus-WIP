.class public abstract Lwb1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwb1/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0006\u001a#\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a/\u0010\t\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;",
        "axis",
        "Lwb1/c;",
        "axisPosition",
        "Lg61/b;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lwb1/c;)Lg61/b;",
        "",
        "axisSize",
        "c",
        "(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lwb1/c;Ljava/lang/Float;)Lg61/b;",
        "b",
        "(Lwb1/c;)F",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lwb1/c;)Lg61/b;
    .locals 10

    const-string v0, "axisPosition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-static {p1}, Lwb1/f;->b(Lwb1/c;)F

    move-result v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getLabels()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getType()Lg61/d;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getTheme()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;->getLabelColor()Ly81/f;

    move-result-object v6

    goto :goto_1

    :cond_1
    move-object v6, v0

    :goto_1
    invoke-static {v4, p1, v5, v6}, Lwb1/e;->b(Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;Lwb1/c;Lg61/d;Ly81/e;)Lyy0/c;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getType()Lg61/d;

    move-result-object p1

    sget-object v1, Lg61/d;->TIME_MARKER:Lg61/d;

    if-eq p1, v1, :cond_4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getType()Lg61/d;

    move-result-object p1

    sget-object v1, Lg61/d;->TIME_MARKER_WITHOUT_BULB:Lg61/d;

    if-ne p1, v1, :cond_3

    goto :goto_3

    :cond_3
    const/4 p1, 0x0

    :goto_2
    move v4, p1

    goto :goto_4

    :cond_4
    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getOffset()D

    move-result-wide v4

    double-to-float p1, v4

    goto :goto_2

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getType()Lg61/d;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getAxisDescription()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_6

    :cond_5
    :goto_5
    move-object v6, p1

    goto :goto_7

    :cond_6
    :goto_6
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    goto :goto_5

    :goto_7
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getScrimPresent()Z

    move-result v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getStyle()Lg61/c;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getTheme()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    move-result-object p0

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;->getAxisColor()Ly81/f;

    move-result-object v0

    :cond_7
    move-object v9, v0

    new-instance v1, Lg61/b;

    invoke-direct/range {v1 .. v9}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;)V

    return-object v1
.end method

.method private static final b(Lwb1/c;)F
    .locals 1

    sget-object v0, Lwb1/f$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    const p0, 0x3d4ccccd    # 0.05f

    return p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const p0, 0x3e19999a    # 0.15f

    return p0

    :cond_2
    const p0, 0x3dcccccd    # 0.1f

    return p0
.end method

.method public static final c(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lwb1/c;Ljava/lang/Float;)Lg61/b;
    .locals 10

    const-string v0, "axisPosition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    :goto_0
    move v2, p2

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lwb1/f;->b(Lwb1/c;)F

    move-result p2

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getLabels()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getType()Lg61/d;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getTheme()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;->getLabelColor()Ly81/f;

    move-result-object v5

    goto :goto_3

    :cond_2
    move-object v5, v0

    :goto_3
    invoke-static {v1, p1, v4, v5}, Lwb1/e;->b(Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;Lwb1/c;Lg61/d;Ly81/e;)Lyy0/c;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getType()Lg61/d;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getAxisDescription()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_5

    :cond_4
    :goto_4
    move-object v6, p1

    goto :goto_6

    :cond_5
    :goto_5
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    goto :goto_4

    :goto_6
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getScrimPresent()Z

    move-result v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getStyle()Lg61/c;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->getTheme()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;->getAxisColor()Ly81/f;

    move-result-object v0

    :cond_6
    move-object v9, v0

    new-instance v1, Lg61/b;

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v9}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;)V

    return-object v1
.end method
