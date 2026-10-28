.class public abstract Lsi0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/design/models/items/NavigationBarModel;",
        "",
        "manualRefresh",
        "displayRefreshingSpinner",
        "Ljb1/a;",
        "reducer",
        "Lri0/f;",
        "a",
        "(Lcom/whoop/design/models/items/NavigationBarModel;ZZLjb1/a;)Lri0/f;",
        "Lcom/whoop/design/models/items/NavigationButtonModel;",
        "Lri0/h;",
        "c",
        "(Lcom/whoop/design/models/items/NavigationButtonModel;)Lri0/h;",
        "arch-v2_release"
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
.method public static final a(Lcom/whoop/design/models/items/NavigationBarModel;ZZLjb1/a;)Lri0/f;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationBarModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationBarModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_1
    move-object v3, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationBarModel;->getIcon()Lgz0/m0;

    move-result-object v4

    if-nez p1, :cond_2

    if-eqz p2, :cond_2

    const/4 p1, 0x1

    :goto_1
    move v7, p1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationBarModel;->getLeftButton()Lcom/whoop/design/models/items/NavigationButtonModel;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lsi0/i;->c(Lcom/whoop/design/models/items/NavigationButtonModel;)Lri0/h;

    move-result-object p1

    move-object v5, p1

    goto :goto_3

    :cond_3
    move-object v5, v1

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationBarModel;->getRightButton()Lcom/whoop/design/models/items/NavigationButtonModel;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-static {p1}, Lsi0/i;->c(Lcom/whoop/design/models/items/NavigationButtonModel;)Lri0/h;

    move-result-object p1

    move-object v6, p1

    goto :goto_4

    :cond_4
    move-object v6, v1

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationBarModel;->getStyle()Lcom/whoop/design/models/items/NavigationBarStyle;

    move-result-object p1

    if-nez p1, :cond_5

    sget-object p1, Lcom/whoop/design/models/items/NavigationBarStyle;->NONE:Lcom/whoop/design/models/items/NavigationBarStyle;

    :cond_5
    move-object v8, p1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationBarModel;->getHeader()Lcom/whoop/design/models/items/NavigationBarFixedHeader;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/whoop/design/models/items/NavigationBarFixedHeader;->getItems()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_7

    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_6

    goto :goto_5

    :cond_6
    move-object p1, v1

    :goto_5
    if-nez p1, :cond_8

    :cond_7
    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationBarModel;->getFixedHeader()Ljava/util/List;

    move-result-object p1

    :cond_8
    if-eqz p1, :cond_9

    const/4 p2, 0x2

    invoke-static {p3, p1, v1, p2, v1}, Ljb1/a;->k(Ljb1/a;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :cond_9
    if-nez v1, :cond_a

    sget-object v1, Lm83/y;->w:Lm83/y;

    :cond_a
    move-object v9, v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationBarModel;->getHeader()Lcom/whoop/design/models/items/NavigationBarFixedHeader;

    move-result-object p1

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Lcom/whoop/design/models/items/NavigationBarFixedHeader;->getAlignment()Lcom/whoop/design/models/items/FixedHeaderAlignment;

    move-result-object p1

    if-nez p1, :cond_b

    goto :goto_7

    :cond_b
    :goto_6
    move-object v10, p1

    goto :goto_8

    :cond_c
    :goto_7
    sget-object p1, Lcom/whoop/design/models/items/FixedHeaderAlignment;->LEADING:Lcom/whoop/design/models/items/FixedHeaderAlignment;

    goto :goto_6

    :goto_8
    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationBarModel;->getTag()Ljava/lang/String;

    move-result-object v11

    new-instance v1, Lri0/f;

    invoke-direct/range {v1 .. v11}, Lri0/f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lri0/h;Lri0/h;ZLcom/whoop/design/models/items/NavigationBarStyle;Ljava/util/List;Lcom/whoop/design/models/items/FixedHeaderAlignment;Ljava/lang/String;)V

    return-object v1
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/NavigationBarModel;ZZLjb1/a;ILjava/lang/Object;)Lri0/f;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    invoke-static {}, Lsi0/f;->b()Ljb1/a;

    move-result-object p3

    :cond_2
    invoke-static {p0, p1, p2, p3}, Lsi0/i;->a(Lcom/whoop/design/models/items/NavigationBarModel;ZZLjb1/a;)Lri0/f;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/models/items/NavigationButtonModel;)Lri0/h;
    .locals 14

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getText()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lri0/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getDismissEvent()Lcom/whoop/navigation/DismissEventModel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lj02/u;->a(Lcom/whoop/navigation/DismissEventModel;)Lj02/s;

    move-result-object v1

    :cond_1
    move-object v6, v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getDismissModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v8

    invoke-direct/range {v2 .. v8}, Lri0/j;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lj02/s;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object v2

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getIcon()Lgz0/m0;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getIconUrl()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    new-instance v5, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getIcon()Lgz0/m0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getIcon()Lgz0/m0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_3
    move-object v5, v1

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getContentDescription()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getGlow()Lcom/whoop/design/models/items/GlowModel;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/whoop/design/models/items/GlowModel;->getStyle()Lcom/whoop/design/atomic/atom/icon/GlowStyle;

    move-result-object v0

    move-object v7, v0

    goto :goto_2

    :cond_4
    move-object v7, v1

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getGlow()Lcom/whoop/design/models/items/GlowModel;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/whoop/design/models/items/GlowModel;->getDoesPulse()Z

    move-result v0

    :goto_3
    move v8, v0

    goto :goto_4

    :cond_5
    const/4 v0, 0x0

    goto :goto_3

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v9

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v10

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getDismissEvent()Lcom/whoop/navigation/DismissEventModel;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Lj02/u;->a(Lcom/whoop/navigation/DismissEventModel;)Lj02/s;

    move-result-object v1

    :cond_6
    move-object v11, v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getDismissModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v12

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NavigationButtonModel;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v13

    new-instance v3, Lri0/i;

    invoke-direct/range {v3 .. v13}, Lri0/i;-><init>(Lgz0/m0;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;ZLcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lj02/s;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object v3
.end method
