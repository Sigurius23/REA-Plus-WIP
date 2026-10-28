.class public abstract Llb1/j2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/j2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u0005H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0015\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "model",
        "Lc41/p2;",
        "b",
        "(Lcom/whoop/design/models/InfoCalloutTileModel;)Lc41/p2;",
        "Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;",
        "Lc41/o2;",
        "d",
        "(Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;)Lc41/o2;",
        "Lcom/whoop/design/models/IconGradient;",
        "Lc41/n2;",
        "c",
        "(Lcom/whoop/design/models/IconGradient;)Lc41/n2;",
        "Llb1/i2;",
        "a",
        "(Lcom/whoop/design/models/InfoCalloutTileModel;)Llb1/i2;",
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
.method public static final a(Lcom/whoop/design/models/InfoCalloutTileModel;)Llb1/i2;
    .locals 14

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/InfoCalloutTileModel;->getUseFallbackIcon()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p0}, Lcom/whoop/design/models/InfoCalloutTileModel;->getStyle()Lcom/whoop/design/models/items/InfoCalloutStyle;

    move-result-object v1

    sget-object v2, Llb1/j2$a;->c:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    new-instance v0, Llb1/i2;

    invoke-virtual {p0}, Lcom/whoop/design/models/InfoCalloutTileModel;->getIcon()Lgz0/m0;

    move-result-object v1

    sget-object v2, Ly81/f;->WHITE_10:Ly81/f;

    sget-object v3, Ly81/f;->WHITE_70:Ly81/f;

    sget-object v4, Lrz0/f;->AI_GRADIENT:Lrz0/f;

    sget-object v5, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-direct/range {v0 .. v5}, Llb1/i2;-><init>(Lgz0/m0;Ly81/f;Ly81/f;Lrz0/f;Ly81/f;)V

    return-object v0

    :pswitch_1
    new-instance v1, Llb1/i2;

    invoke-virtual {p0}, Lcom/whoop/design/models/InfoCalloutTileModel;->getIcon()Lgz0/m0;

    move-result-object v2

    sget-object v3, Ly81/f;->BLACK_10:Ly81/f;

    sget-object v4, Ly81/f;->BLACK_70:Ly81/f;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Llb1/i2;-><init>(Lgz0/m0;Ly81/f;Ly81/f;Lrz0/f;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_2
    move-object v1, v2

    new-instance v2, Llb1/i2;

    invoke-virtual {p0}, Lcom/whoop/design/models/InfoCalloutTileModel;->getIcon()Lgz0/m0;

    move-result-object p0

    if-nez p0, :cond_0

    if-nez v0, :cond_1

    sget-object p0, Lgz0/m0;->TINY_INFORMATION:Lgz0/m0;

    :cond_0
    move-object v3, p0

    goto :goto_0

    :cond_1
    move-object v3, v1

    :goto_0
    sget-object v4, Ly81/f;->WHITE_5:Ly81/f;

    sget-object v5, Ly81/f;->WHITE_70:Ly81/f;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Llb1/i2;-><init>(Lgz0/m0;Ly81/f;Ly81/f;Lrz0/f;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :pswitch_3
    move-object v1, v2

    new-instance v3, Llb1/i2;

    invoke-virtual {p0}, Lcom/whoop/design/models/InfoCalloutTileModel;->getIcon()Lgz0/m0;

    move-result-object p0

    if-nez p0, :cond_3

    if-nez v0, :cond_2

    sget-object v2, Lgz0/m0;->TINY_CHECKMARK:Lgz0/m0;

    move-object v4, v2

    goto :goto_1

    :cond_2
    move-object v4, v1

    goto :goto_1

    :cond_3
    move-object v4, p0

    :goto_1
    sget-object v5, Ly81/f;->ACCENT_POSITIVE_TREND_15:Ly81/f;

    sget-object v6, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Llb1/i2;-><init>(Lgz0/m0;Ly81/f;Ly81/f;Lrz0/f;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :pswitch_4
    move-object v1, v2

    new-instance v4, Llb1/i2;

    invoke-virtual {p0}, Lcom/whoop/design/models/InfoCalloutTileModel;->getIcon()Lgz0/m0;

    move-result-object p0

    if-nez p0, :cond_5

    if-nez v0, :cond_4

    sget-object v2, Lgz0/m0;->TINY_ATTENTION:Lgz0/m0;

    move-object v5, v2

    goto :goto_2

    :cond_4
    move-object v5, v1

    goto :goto_2

    :cond_5
    move-object v5, p0

    :goto_2
    sget-object v6, Ly81/f;->ACCENT_ALERT_TREND_15:Ly81/f;

    sget-object v7, Ly81/f;->ACCENT_ALERT:Ly81/f;

    const/16 v10, 0x18

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Llb1/i2;-><init>(Lgz0/m0;Ly81/f;Ly81/f;Lrz0/f;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :pswitch_5
    move-object v1, v2

    new-instance v5, Llb1/i2;

    invoke-virtual {p0}, Lcom/whoop/design/models/InfoCalloutTileModel;->getIcon()Lgz0/m0;

    move-result-object p0

    if-nez p0, :cond_7

    if-nez v0, :cond_6

    sget-object v2, Lgz0/m0;->TINY_ATTENTION:Lgz0/m0;

    move-object v6, v2

    goto :goto_3

    :cond_6
    move-object v6, v1

    goto :goto_3

    :cond_7
    move-object v6, p0

    :goto_3
    sget-object v7, Ly81/f;->ACCENT_NEGATIVE_TREND_15:Ly81/f;

    sget-object v8, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    const/16 v11, 0x18

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v12}, Llb1/i2;-><init>(Lgz0/m0;Ly81/f;Ly81/f;Lrz0/f;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :pswitch_6
    move-object v1, v2

    new-instance v6, Llb1/i2;

    invoke-virtual {p0}, Lcom/whoop/design/models/InfoCalloutTileModel;->getIcon()Lgz0/m0;

    move-result-object p0

    if-nez p0, :cond_9

    if-nez v0, :cond_8

    sget-object v2, Lgz0/m0;->TINY_INFORMATION:Lgz0/m0;

    move-object v7, v2

    goto :goto_4

    :cond_8
    move-object v7, v1

    goto :goto_4

    :cond_9
    move-object v7, p0

    :goto_4
    sget-object v8, Ly81/f;->NEUTRAL_15:Ly81/f;

    sget-object v9, Ly81/f;->RECOVERY:Ly81/f;

    const/16 v12, 0x18

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v13}, Llb1/i2;-><init>(Lgz0/m0;Ly81/f;Ly81/f;Lrz0/f;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final b(Lcom/whoop/design/models/InfoCalloutTileModel;)Lc41/p2;
    .locals 40

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Llb1/j2;->a(Lcom/whoop/design/models/InfoCalloutTileModel;)Llb1/i2;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v3, v2}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v4

    invoke-virtual {v0}, Llb1/i2;->d()Lgz0/m0;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->getIconSize()Lcom/whoop/design/models/IconSize;

    move-result-object v5

    if-nez v5, :cond_0

    sget-object v5, Lcom/whoop/design/models/IconSize;->MEDIUM:Lcom/whoop/design/models/IconSize;

    :cond_0
    invoke-static {v5}, Llb1/d2;->a(Lcom/whoop/design/models/IconSize;)F

    move-result v7

    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->getIconGradient()Lcom/whoop/design/models/IconGradient;

    move-result-object v5

    invoke-static {v5}, Llb1/j2;->c(Lcom/whoop/design/models/IconGradient;)Lc41/n2;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->getDescription()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->getDescriptionTypography()Lb91/c;

    move-result-object v5

    if-nez v5, :cond_1

    sget-object v5, Lb91/c;->B2:Lb91/c;

    :cond_1
    move-object v11, v5

    invoke-virtual {v0}, Llb1/i2;->a()Ly81/f;

    move-result-object v12

    invoke-virtual {v0}, Llb1/i2;->b()Ly81/f;

    move-result-object v14

    invoke-virtual {v0}, Llb1/i2;->e()Lrz0/f;

    move-result-object v17

    invoke-virtual {v0}, Llb1/i2;->c()Ly81/f;

    move-result-object v18

    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->getComponentDismissalId()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->getDismissAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v21

    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->getAnalyticEvents()Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;->getDismiss()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v0

    move-object/from16 v22, v0

    goto :goto_0

    :cond_2
    move-object/from16 v22, v2

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->getComponentDismissalId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->getDismissAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    if-eqz v0, :cond_5

    :cond_4
    :goto_1
    move/from16 v19, v3

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    goto :goto_1

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->getItems()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_6

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_6
    const/4 v3, 0x2

    invoke-static {v4, v0, v2, v3, v2}, Ljb1/a;->k(Ljb1/a;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm91/o;

    invoke-virtual {v5}, Lm91/o;->e()Lm91/u;

    move-result-object v13

    instance-of v13, v13, Lny0/p0;

    if-eqz v13, :cond_7

    invoke-virtual {v5}, Lm91/o;->e()Lm91/u;

    move-result-object v13

    const-string v15, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.SecondaryButtonViewState"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v23, v13

    check-cast v23, Lny0/p0;

    const/16 v38, 0x3fbf

    const/16 v39, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-static/range {v23 .. v39}, Lny0/p0;->b(Lny0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly71/g;Ly71/g;Ly81/e;Lj91/b;ZLjava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lj02/s;Lk81/a;ZLny0/m0;ZILjava/lang/Object;)Lny0/p0;

    move-result-object v13

    invoke-static {v5, v13, v2, v3, v2}, Lm91/o;->b(Lm91/o;Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Lm91/o;

    move-result-object v5

    :cond_7
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->getItemsAlignment()Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;

    move-result-object v0

    invoke-static {v0}, Llb1/j2;->d(Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;)Lc41/o2;

    move-result-object v24

    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->getAnalyticsProperties()Ljava/util/Map;

    move-result-object v25

    new-instance v5, Lc41/p2;

    const/16 v26, 0x680

    const/16 v27, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v23, v4

    invoke-direct/range {v5 .. v27}, Lc41/p2;-><init>(Lgz0/m0;FLc41/n2;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Lrz0/f;Ly81/e;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lc41/o2;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method

.method private static final c(Lcom/whoop/design/models/IconGradient;)Lc41/n2;
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_0

    move p0, v0

    goto :goto_0

    :cond_0
    sget-object v1, Llb1/j2$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v1, p0

    :goto_0
    if-eq p0, v0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    sget-object p0, Lc41/n2;->AI_COACH:Lc41/n2;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    sget-object p0, Lc41/n2;->NONE:Lc41/n2;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;)Lc41/o2;
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_0

    move p0, v0

    goto :goto_0

    :cond_0
    sget-object v1, Llb1/j2$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v1, p0

    :goto_0
    if-eq p0, v0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    sget-object p0, Lc41/o2;->LEADING:Lc41/o2;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    sget-object p0, Lc41/o2;->TEXT:Lc41/o2;

    return-object p0
.end method
