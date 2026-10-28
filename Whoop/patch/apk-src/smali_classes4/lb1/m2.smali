.class public abstract Llb1/m2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/m2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0001\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ItemsCardModel;",
        "model",
        "Ljb1/a;",
        "reducer",
        "Lv71/i;",
        "d",
        "(Lcom/whoop/design/models/items/ItemsCardModel;Ljb1/a;)Lv71/i;",
        "Lcom/whoop/design/models/items/ItemsCardHeaderModel;",
        "Lv71/e;",
        "c",
        "(Lcom/whoop/design/models/items/ItemsCardHeaderModel;)Lv71/e;",
        "Lcom/whoop/design/models/items/ItemsCardFooterModel;",
        "Lv71/c;",
        "b",
        "(Lcom/whoop/design/models/items/ItemsCardFooterModel;)Lv71/c;",
        "Lcom/whoop/design/models/items/ItemsCardFooterAlignment;",
        "alignment",
        "Ll0/i;",
        "a",
        "(Lcom/whoop/design/models/items/ItemsCardFooterAlignment;)Ll0/i;",
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
.method public static final a(Lcom/whoop/design/models/items/ItemsCardFooterAlignment;)Ll0/i;
    .locals 1

    const-string v0, "alignment"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/m2$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Ll0/m;->a:Ll0/e;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Ll0/m;->b:Ll0/e;

    return-object p0
.end method

.method public static final b(Lcom/whoop/design/models/items/ItemsCardFooterModel;)Lv71/c;
    .locals 9

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ItemsCardFooterModel;->getAlignment()Lcom/whoop/design/models/items/ItemsCardFooterAlignment;

    move-result-object v0

    invoke-static {v0}, Llb1/m2;->a(Lcom/whoop/design/models/items/ItemsCardFooterAlignment;)Ll0/i;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ItemsCardFooterModel;->getCtaDestination()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ItemsCardFooterModel;->getCtaIcon()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lgz0/m0;->ARROW_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    :goto_1
    if-nez v7, :cond_2

    goto :goto_2

    :cond_2
    move-object v3, v7

    :goto_2
    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ItemsCardFooterModel;->getCtaTitle()Ljava/lang/String;

    move-result-object p0

    new-instance v3, Lv71/c;

    invoke-direct {v3, v0, v1, v2, p0}, Lv71/c;-><init>(Ll0/i;Lcom/whoop/navigation/e;ILjava/lang/String;)V

    return-object v3
.end method

.method public static final c(Lcom/whoop/design/models/items/ItemsCardHeaderModel;)Lv71/e;
    .locals 12

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ItemsCardHeaderModel;->getCtaDestination()Lcom/whoop/navigation/e;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ItemsCardHeaderModel;->getCtaInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ItemsCardHeaderModel;->getCtaIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->TINY_EXPAND:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/4 v8, 0x0

    if-ge v7, v5, :cond_1

    aget-object v9, v4, v7

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    move-object v9, v8

    :goto_1
    if-nez v9, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v9

    :goto_2
    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ItemsCardHeaderModel;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ItemsCardHeaderModel;->getTitleIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    sget-object v1, Lgz0/m0;->HEART_RATE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v7

    array-length v9, v7

    :goto_3
    if-ge v6, v9, :cond_4

    aget-object v10, v7, v6

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    move-object v8, v10

    goto :goto_4

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_4
    :goto_4
    if-nez v8, :cond_5

    goto :goto_5

    :cond_5
    move-object v1, v8

    :goto_5
    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    :cond_6
    move-object v6, v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ItemsCardHeaderModel;->getAndroidCtaFeatureFlags()Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_7

    sget-object p0, Lm83/y;->w:Lm83/y;

    :cond_7
    move-object v7, p0

    new-instance v1, Lv71/e;

    invoke-direct/range {v1 .. v7}, Lv71/e;-><init>(Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V

    return-object v1
.end method

.method public static final d(Lcom/whoop/design/models/items/ItemsCardModel;Ljb1/a;)Lv71/i;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ItemsCardModel;->getHeader()Lcom/whoop/design/models/items/ItemsCardHeaderModel;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Llb1/m2;->c(Lcom/whoop/design/models/items/ItemsCardHeaderModel;)Lv71/e;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ItemsCardModel;->getFooter()Lcom/whoop/design/models/items/ItemsCardFooterModel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Llb1/m2;->b(Lcom/whoop/design/models/items/ItemsCardFooterModel;)Lv71/c;

    move-result-object v1

    :cond_1
    move-object v4, v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ItemsCardModel;->getBackgroundStyle()Lv71/a;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Lv71/a;->STANDARD:Lv71/a;

    :cond_2
    move-object v5, v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ItemsCardModel;->getItems()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ItemsCardModel;->getFooterItems()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p1, p0}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move-object v7, p0

    goto :goto_3

    :cond_4
    :goto_2
    sget-object p0, Lm83/y;->w:Lm83/y;

    goto :goto_1

    :goto_3
    new-instance v2, Lv71/i;

    const/4 v8, 0x0

    const/16 v9, 0x20

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v10}, Lv71/i;-><init>(Lv71/e;Lv71/c;Lv71/a;Ljava/util/List;Ljava/util/List;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method
