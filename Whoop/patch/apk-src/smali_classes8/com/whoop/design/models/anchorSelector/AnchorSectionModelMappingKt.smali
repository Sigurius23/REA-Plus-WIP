.class public final Lcom/whoop/design/models/anchorSelector/AnchorSectionModelMappingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0011\u0010\u0008\u001a\u00020\u0007*\u00020\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0007*\u00020\u0000\u00a2\u0006\u0004\u0008\n\u0010\t\u001a\u0015\u0010\u000c\u001a\u00020\u0007*\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0011\u0010\u000f\u001a\u00020\u0007*\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;",
        "Lb91/c;",
        "resolveTitleTypography",
        "(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Lb91/c;",
        "Lp31/p$a;",
        "resolveAnchorSectionHeaderState",
        "(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Lp31/p$a;",
        "Ly3/f;",
        "resolveLeadingPadding",
        "(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)F",
        "resolveTrailingPadding",
        "",
        "toSectionPadding",
        "(Ljava/lang/Double;)F",
        "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;",
        "resolveTagsHorizontalInset",
        "(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;)F",
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
.method public static final resolveAnchorSectionHeaderState(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Lp31/p$a;
    .locals 20

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getStyle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/whoop/design/models/anchorSelector/AnchorSectionDividerStyle;->values()[Lcom/whoop/design/models/anchorSelector/AnchorSectionDividerStyle;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    move-object v6, v2

    :goto_1
    sget-object v0, Lcom/whoop/design/models/anchorSelector/AnchorSectionDividerStyle;->TITLE_STYLE_NONE:Lcom/whoop/design/models/anchorSelector/AnchorSectionDividerStyle;

    if-ne v6, v0, :cond_3

    new-instance v7, Lp31/p$a;

    invoke-virtual {v1}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v1}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelMappingKt;->resolveTitleTypography(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Lb91/c;

    move-result-object v11

    const/16 v18, 0x3f6

    const/16 v19, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v7 .. v19}, Lp31/p$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lp31/r;Lb91/c;Lb91/c;Lp31/i;ZZLjava/util/List;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_3
    return-object v2
.end method

.method public static final resolveLeadingPadding(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)F
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getLeadingPadding()Ljava/lang/Double;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelMappingKt;->toSectionPadding(Ljava/lang/Double;)F

    move-result p0

    return p0
.end method

.method public static final resolveTagsHorizontalInset(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;)F
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getTagsHorizontalInset()Ljava/lang/Double;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpg-double p0, v0, v2

    if-gez p0, :cond_0

    move-wide v0, v2

    :cond_0
    double-to-float p0, v0

    return p0

    :cond_1
    invoke-static {}, Le51/o;->a()F

    move-result p0

    return p0
.end method

.method public static final resolveTitleTypography(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Lb91/c;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getTitleTypography()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-static {}, Lb91/c;->values()[Lb91/c;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    return-object v3

    :cond_3
    :goto_2
    sget-object p0, Lb91/c;->H5:Lb91/c;

    return-object p0
.end method

.method public static final resolveTrailingPadding(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)F
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getTrailingPadding()Ljava/lang/Double;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelMappingKt;->toSectionPadding(Ljava/lang/Double;)F

    move-result p0

    return p0
.end method

.method private static final toSectionPadding(Ljava/lang/Double;)F
    .locals 4

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpg-double p0, v0, v2

    if-gez p0, :cond_0

    move-wide v0, v2

    :cond_0
    double-to-float p0, v0

    return p0

    :cond_1
    invoke-static {}, Le51/f;->a()F

    move-result p0

    return p0
.end method
