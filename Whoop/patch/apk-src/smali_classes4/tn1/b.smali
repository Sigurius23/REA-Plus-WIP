.class public final Ltn1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0008\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ-\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000c\u001a\u00020\n2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Ltn1/b;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/design/models/NotificationCardModel;",
        "",
        "index",
        "Lh01/w;",
        "e",
        "(Lcom/whoop/design/models/NotificationCardModel;I)Lh01/w;",
        "",
        "imageUrl",
        "title",
        "Lcom/whoop/navigation/e;",
        "navigation",
        "b",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/navigation/e;",
        "Lh01/a;",
        "cardType",
        "backgroundStyle",
        "d",
        "(Lh01/a;Ljava/lang/String;)Lh01/a;",
        "Lpn1/b;",
        "domainResult",
        "Lvn1/g;",
        "c",
        "(Lpn1/b;)Lvn1/g;",
        "home-notifications-center_release"
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

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ltn1/b;->f(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final b(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/navigation/e;
    .locals 24

    const/4 v0, 0x0

    if-eqz p3, :cond_3

    invoke-virtual/range {p3 .. p3}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/navigation/CoachScreenModel;

    if-eqz v2, :cond_0

    move-object v0, v1

    check-cast v0, Lcom/whoop/navigation/CoachScreenModel;

    :cond_0
    move-object v1, v0

    if-eqz v1, :cond_2

    new-instance v0, Ltn1/a;

    invoke-direct {v0}, Ltn1/a;-><init>()V

    move-object/from16 v2, p1

    invoke-virtual {v0, v2}, Ltn1/a;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    const/16 v16, 0x3fe7

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v17}, Lcom/whoop/navigation/CoachScreenModel;->copy$default(Lcom/whoop/navigation/CoachScreenModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/navigation/CoachScreenModel;

    move-result-object v20

    const/16 v22, 0x5

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v18, p3

    invoke-static/range {v18 .. v23}, Lcom/whoop/navigation/e;->b(Lcom/whoop/navigation/e;Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILjava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_0
    return-object p3

    :cond_3
    return-object v0
.end method

.method private final d(Lh01/a;Ljava/lang/String;)Lh01/a;
    .locals 1

    if-eqz p2, :cond_0

    const-string v0, "ONBOARDING"

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lh01/a;->ONBOARDING:Lh01/a;

    if-ne p1, p2, :cond_0

    sget-object p1, Lh01/a;->ONBOARDING_BG_GRADIENT:Lh01/a;

    :cond_0
    return-object p1
.end method

.method private final e(Lcom/whoop/design/models/NotificationCardModel;I)Lh01/w;
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcom/whoop/design/models/cards/TextOnlyCardModel;

    const/16 v3, 0x8

    const-wide/high16 v4, 0x4004000000000000L    # 2.5

    const/4 v7, 0x0

    if-eqz v2, :cond_2

    check-cast v1, Lcom/whoop/design/models/cards/TextOnlyCardModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getAppNotificationType()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getTemplateName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getBody()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    if-nez p2, :cond_0

    const/4 v13, 0x1

    goto :goto_0

    :cond_0
    move v13, v7

    :goto_0
    double-to-float v2, v4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    const/16 v4, 0x9

    int-to-float v4, v4

    mul-float/2addr v4, v3

    new-instance v14, Ll0/l1;

    invoke-direct {v14, v2, v2, v4, v2}, Ll0/l1;-><init>(FFFF)V

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getCardType()Lh01/a;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getBackgroundStyle()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Ltn1/b;->d(Lh01/a;Ljava/lang/String;)Lh01/a;

    move-result-object v15

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getShowHighlight()Z

    move-result v1

    if-eqz v1, :cond_1

    if-nez p2, :cond_1

    const/16 v17, 0x1

    goto :goto_1

    :cond_1
    move/from16 v17, v7

    :goto_1
    new-instance v8, Lh01/a0;

    const/16 v20, 0x600

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v8 .. v21}, Lh01/a0;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lcom/whoop/design/util/TextResource;ZLgz0/m0;Lkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8

    :cond_2
    instance-of v2, v1, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;

    const/16 v8, 0x14

    const-wide/high16 v9, 0x4016000000000000L    # 5.5

    if-eqz v2, :cond_8

    check-cast v1, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getAppNotificationType()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getTemplateName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getCta()Lkd1/l;

    move-result-object v2

    if-nez v2, :cond_3

    sget-object v2, Lkd1/l;->NONE:Lkd1/l;

    :cond_3
    move-object/from16 v19, v2

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getCtaText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    new-instance v21, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v22

    const/16 v26, 0xe

    const/16 v27, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v21 .. v27}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getBody()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getCardType()Lh01/a;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getBackgroundStyle()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v0, v2, v11}, Ltn1/b;->d(Lh01/a;Ljava/lang/String;)Lh01/a;

    move-result-object v18

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getShowHighlight()Z

    move-result v2

    if-eqz v2, :cond_4

    if-nez p2, :cond_4

    const/16 v24, 0x1

    goto :goto_2

    :cond_4
    move/from16 v24, v7

    :goto_2
    if-nez p2, :cond_5

    const/16 v16, 0x1

    goto :goto_3

    :cond_5
    move/from16 v16, v7

    :goto_3
    double-to-float v2, v4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    double-to-float v4, v9

    mul-float/2addr v4, v3

    new-instance v3, Ll0/l1;

    invoke-direct {v3, v2, v2, v4, v2}, Ll0/l1;-><init>(FFFF)V

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v5

    invoke-direct {v0, v2, v4, v5}, Ltn1/b;->b(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/navigation/e;

    move-result-object v27

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->getCtaText()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    goto :goto_4

    :cond_6
    move v1, v7

    :goto_4
    if-le v1, v8, :cond_7

    const/16 v28, 0x1

    goto :goto_5

    :cond_7
    move/from16 v28, v7

    :goto_5
    new-instance v11, Lh01/q;

    const v33, 0x1e6800

    const/16 v34, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object/from16 v17, v3

    invoke-direct/range {v11 .. v34}, Lh01/q;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZZZLcom/whoop/navigation/e;ZLgz0/m0;Lkd1/o;Lb91/a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v11

    :cond_8
    instance-of v2, v1, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;

    if-eqz v2, :cond_f

    new-instance v2, Lqc1/a;

    const/16 v11, 0x1d

    invoke-direct {v2, v11}, Lqc1/a;-><init>(I)V

    invoke-static {v2}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v2

    check-cast v1, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getAppNotificationType()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getTemplateName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getCta()Lkd1/l;

    move-result-object v11

    if-nez v11, :cond_9

    sget-object v11, Lkd1/l;->NONE:Lkd1/l;

    :cond_9
    move-object/from16 v19, v11

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getCtaText()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    new-instance v21, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v22

    const/16 v26, 0xe

    const/16 v27, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v21 .. v27}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getBody()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getTitle()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getCardType()Lh01/a;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getBackgroundStyle()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v11, v6}, Ltn1/b;->d(Lh01/a;Ljava/lang/String;)Lh01/a;

    move-result-object v18

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getShowHighlight()Z

    move-result v6

    if-eqz v6, :cond_a

    if-nez p2, :cond_a

    const/16 v24, 0x1

    goto :goto_6

    :cond_a
    move/from16 v24, v7

    :goto_6
    if-nez p2, :cond_b

    const/16 v16, 0x1

    :goto_7
    const/4 v6, 0x1

    goto :goto_8

    :cond_b
    move/from16 v16, v7

    goto :goto_7

    :goto_8
    double-to-float v4, v4

    int-to-float v3, v3

    mul-float/2addr v4, v3

    double-to-float v5, v9

    mul-float/2addr v5, v3

    new-instance v3, Ll0/l1;

    invoke-direct {v3, v4, v4, v5, v4}, Ll0/l1;-><init>(FFFF)V

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v9

    invoke-direct {v0, v4, v5, v9}, Ltn1/b;->b(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/navigation/e;

    move-result-object v27

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getCtaText()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_c

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    goto :goto_9

    :cond_c
    move v4, v7

    :goto_9
    if-le v4, v8, :cond_d

    move/from16 v28, v6

    goto :goto_a

    :cond_d
    move/from16 v28, v7

    :goto_a
    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;->getRightItem()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v2, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    :goto_b
    move-object/from16 v32, v1

    goto :goto_c

    :cond_e
    const/4 v1, 0x0

    goto :goto_b

    :goto_c
    new-instance v11, Lh01/q;

    const v33, 0xe6800

    const/16 v34, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v17, v3

    invoke-direct/range {v11 .. v34}, Lh01/q;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZZZLcom/whoop/navigation/e;ZLgz0/m0;Lkd1/o;Lb91/a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v11

    :cond_f
    const/4 v6, 0x1

    instance-of v2, v1, Lcom/whoop/design/models/cards/TextAndImageCardModel;

    if-eqz v2, :cond_12

    check-cast v1, Lcom/whoop/design/models/cards/TextAndImageCardModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getAppNotificationType()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getTemplateName()Ljava/lang/String;

    move-result-object v15

    new-instance v16, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v17

    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v22}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getBody()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    move-object/from16 v19, v16

    if-nez p2, :cond_10

    move/from16 v16, v6

    goto :goto_d

    :cond_10
    move/from16 v16, v7

    :goto_d
    double-to-float v2, v4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    double-to-float v4, v9

    mul-float/2addr v4, v3

    new-instance v3, Ll0/l1;

    invoke-direct {v3, v2, v2, v4, v2}, Ll0/l1;-><init>(FFFF)V

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getCardType()Lh01/a;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getBackgroundStyle()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v2, v4}, Ltn1/b;->d(Lh01/a;Ljava/lang/String;)Lh01/a;

    move-result-object v18

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getShowHighlight()Z

    move-result v1

    if-eqz v1, :cond_11

    if-nez p2, :cond_11

    move/from16 v22, v6

    goto :goto_e

    :cond_11
    move/from16 v22, v7

    :goto_e
    new-instance v11, Lh01/t;

    const/16 v25, 0x1a00

    const/16 v26, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v17, v3

    invoke-direct/range {v11 .. v26}, Lh01/t;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZLgz0/m0;Lkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v11

    :cond_12
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "No mapper exists for: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method private static final f(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final c(Lpn1/b;)Lvn1/g;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "domainResult"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lpn1/b$c;

    const/4 v3, 0x0

    const/16 v4, 0xa

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    check-cast v1, Lpn1/b$c;

    invoke-virtual {v1}, Lpn1/b$c;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v9

    invoke-virtual {v1}, Lpn1/b$c;->c()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v15, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v4, v6

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v4, 0x1

    if-ltz v4, :cond_0

    check-cast v7, Lcom/whoop/design/models/NotificationCardModel;

    invoke-direct {v0, v7, v4}, Ltn1/b;->e(Lcom/whoop/design/models/NotificationCardModel;I)Lh01/w;

    move-result-object v4

    invoke-interface {v15, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v4, v8

    goto :goto_0

    :cond_0
    invoke-static {}, Lwb3/f;->d0()V

    throw v3

    :cond_1
    invoke-static {v6, v15}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lh01/w;

    invoke-static {v5, v15}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lh01/w;

    invoke-virtual {v1}, Lpn1/b$c;->g()Z

    move-result v11

    invoke-virtual {v1}, Lpn1/b$c;->e()Z

    move-result v12

    invoke-virtual {v1}, Lpn1/b$c;->f()Lvn1/i;

    move-result-object v14

    new-instance v7, Lvn1/g$c;

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v17}, Lvn1/g$c;-><init>(Lh01/w;IZZZLh01/w;Lvn1/i;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_2
    instance-of v2, v1, Lpn1/b$d;

    if-eqz v2, :cond_5

    check-cast v1, Lpn1/b$d;

    invoke-virtual {v1}, Lpn1/b$d;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v9

    invoke-virtual {v1}, Lpn1/b$d;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v15, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v2, v6

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v7, v2, 0x1

    if-ltz v2, :cond_3

    check-cast v4, Lcom/whoop/design/models/NotificationCardModel;

    invoke-direct {v0, v4, v2}, Ltn1/b;->e(Lcom/whoop/design/models/NotificationCardModel;I)Lh01/w;

    move-result-object v2

    invoke-interface {v15, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v7

    goto :goto_1

    :cond_3
    invoke-static {}, Lwb3/f;->d0()V

    throw v3

    :cond_4
    new-instance v7, Lvn1/g$c;

    invoke-static {v6, v15}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lh01/w;

    invoke-static {v5, v15}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lh01/w;

    const/16 v16, 0x58

    const/16 v17, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v7 .. v17}, Lvn1/g$c;-><init>(Lh01/w;IZZZLh01/w;Lvn1/i;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_5
    instance-of v1, v1, Lpn1/b$b;

    if-eqz v1, :cond_6

    sget-object v1, Lvn1/g$b;->b:Lvn1/g$b;

    return-object v1

    :cond_6
    sget-object v1, Lvn1/g$a;->b:Lvn1/g$a;

    return-object v1
.end method
