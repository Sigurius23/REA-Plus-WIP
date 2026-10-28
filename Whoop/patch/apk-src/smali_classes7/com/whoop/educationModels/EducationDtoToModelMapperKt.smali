.class public final Lcom/whoop/educationModels/EducationDtoToModelMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/educationModels/EducationDtoToModelMapperKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0010\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u000c\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002\u001a\u000c\u0010\u0008\u001a\u0004\u0018\u00010\t*\u00020\n\u00a8\u0006\u000b"
    }
    d2 = {
        "toStressEducationSections",
        "",
        "Lcom/whoop/design/model/FeatureEducationParagraph;",
        "Lcom/whoop/educationModels/FeatureEducationDto;",
        "toEducationSections",
        "toEducationCtaButton",
        "Lcom/whoop/design/model/FeatureEducationCtaButton;",
        "Lcom/whoop/educationModels/FeatureEducationButtonDto;",
        "toIcon",
        "Lcom/whoop/design/model/FeatureEducationInlineIcon;",
        "Lcom/whoop/educationModels/InlineIcon;",
        "education-models_release"
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
.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/educationModels/EducationDtoToModelMapperKt;->toEducationSections$lambda$0$0$0(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final toEducationCtaButton(Lcom/whoop/educationModels/FeatureEducationButtonDto;)Lcom/whoop/design/model/FeatureEducationCtaButton;
    .locals 7

    sget-object v0, Lkd1/j;->a:Lkd1/j;

    invoke-virtual {p0}, Lcom/whoop/educationModels/FeatureEducationButtonDto;->getColor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkd1/j;->e(Ljava/lang/String;)Ly81/f;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/educationModels/FeatureEducationButtonDto;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/educationModels/FeatureEducationButtonDto;->getClickAction()Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Lcom/whoop/design/model/CtaNavigationDestination;->values()[Lcom/whoop/design/model/CtaNavigationDestination;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_1
    new-instance p0, Lcom/whoop/design/model/FeatureEducationCtaButton;

    invoke-direct {p0, v0, v1, v5}, Lcom/whoop/design/model/FeatureEducationCtaButton;-><init>(Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/model/CtaNavigationDestination;)V

    return-object p0
.end method

.method public static final toEducationSections(Lcom/whoop/educationModels/FeatureEducationDto;)Ljava/util/List;
    .locals 57
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/educationModels/FeatureEducationDto;",
            ")",
            "Ljava/util/List<",
            "Lcom/whoop/design/model/FeatureEducationParagraph;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/educationModels/FeatureEducationDto;->getScreens()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/educationModels/FeatureEducationScreenDto;

    invoke-virtual {v2}, Lcom/whoop/educationModels/FeatureEducationScreenDto;->getSections()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v7, 0x0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_16

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v9, v7, 0x1

    if-ltz v7, :cond_15

    check-cast v8, Lcom/whoop/educationModels/FeatureEducationParagraphDto;

    new-instance v11, Lve0/d;

    const/4 v12, 0x1

    invoke-direct {v11, v12}, Lve0/d;-><init>(I)V

    invoke-static {v11}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v11

    invoke-virtual {v8}, Lcom/whoop/educationModels/FeatureEducationParagraphDto;->getSentences()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v12, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v14, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/educationModels/SentenceDto;

    new-instance v15, Lcom/whoop/design/model/ScreenTextStyle;

    sget-object v6, Lkd1/j;->a:Lkd1/j;

    invoke-virtual {v13}, Lcom/whoop/educationModels/SentenceDto;->getStyle()Lcom/whoop/educationModels/ScreenTextStyleDto;

    move-result-object v16

    const/16 v21, 0x0

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/educationModels/ScreenTextStyleDto;->getStyleName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10}, Lkd1/j;->f(Ljava/lang/String;)Lb91/a;

    move-result-object v10

    invoke-virtual {v13}, Lcom/whoop/educationModels/SentenceDto;->getStyle()Lcom/whoop/educationModels/ScreenTextStyleDto;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/educationModels/ScreenTextStyleDto;->getColor()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Lkd1/j;->e(Ljava/lang/String;)Ly81/f;

    move-result-object v5

    invoke-direct {v15, v10, v5}, Lcom/whoop/design/model/ScreenTextStyle;-><init>(Lb91/a;Ly81/f;)V

    invoke-virtual {v13}, Lcom/whoop/educationModels/SentenceDto;->getText()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v13}, Lcom/whoop/educationModels/SentenceDto;->getDivider()Lcom/whoop/educationModels/Divider;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-static {}, Lhy0/g;->values()[Lhy0/g;

    move-result-object v5

    array-length v6, v5

    const/4 v10, 0x0

    :goto_3
    if-ge v10, v6, :cond_2

    aget-object v16, v5, v10

    move-object/from16 v22, v0

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13}, Lcom/whoop/educationModels/SentenceDto;->getDivider()Lcom/whoop/educationModels/Divider;

    move-result-object v18

    if-eqz v18, :cond_0

    invoke-virtual/range {v18 .. v18}, Lcom/whoop/educationModels/Divider;->getDividerType()Ljava/lang/String;

    move-result-object v18

    move-object/from16 v23, v2

    move-object/from16 v2, v18

    goto :goto_4

    :cond_0
    move-object/from16 v23, v2

    move-object/from16 v2, v21

    :goto_4
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_5

    :cond_1
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, v22

    move-object/from16 v2, v23

    goto :goto_3

    :cond_2
    move-object/from16 v22, v0

    move-object/from16 v23, v2

    move-object/from16 v16, v21

    :goto_5
    if-nez v16, :cond_3

    sget-object v16, Lhy0/g;->SOLID:Lhy0/g;

    :cond_3
    move-object/from16 v25, v16

    invoke-virtual {v13}, Lcom/whoop/educationModels/SentenceDto;->getDivider()Lcom/whoop/educationModels/Divider;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/whoop/educationModels/Divider;->getTitle()Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    :cond_4
    move-object/from16 v0, v21

    :goto_6
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v27

    new-instance v24, Lhy0/e;

    const/16 v26, 0x0

    const/16 v28, 0x2

    const/16 v29, 0x0

    invoke-direct/range {v24 .. v29}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v24

    goto :goto_7

    :cond_5
    move-object/from16 v22, v0

    move-object/from16 v23, v2

    move-object/from16 v18, v21

    :goto_7
    invoke-virtual {v13}, Lcom/whoop/educationModels/SentenceDto;->getClickableTextUrl()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v13}, Lcom/whoop/educationModels/SentenceDto;->getInlineIcon()Lcom/whoop/educationModels/InlineIcon;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Lcom/whoop/educationModels/EducationDtoToModelMapperKt;->toIcon(Lcom/whoop/educationModels/InlineIcon;)Lcom/whoop/design/model/FeatureEducationInlineIcon;

    move-result-object v0

    move-object/from16 v20, v0

    :goto_8
    move-object/from16 v16, v15

    goto :goto_9

    :cond_6
    move-object/from16 v20, v21

    goto :goto_8

    :goto_9
    new-instance v15, Lcom/whoop/design/model/FeatureEducationSentence;

    invoke-direct/range {v15 .. v20}, Lcom/whoop/design/model/FeatureEducationSentence;-><init>(Lcom/whoop/design/model/ScreenTextStyle;Ljava/lang/String;Lhy0/e;Ljava/lang/String;Lcom/whoop/design/model/FeatureEducationInlineIcon;)V

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v22

    move-object/from16 v2, v23

    const/16 v5, 0xa

    goto/16 :goto_2

    :cond_7
    move-object/from16 v22, v0

    move-object/from16 v23, v2

    const/16 v21, 0x0

    invoke-virtual {v8}, Lcom/whoop/educationModels/FeatureEducationParagraphDto;->getAlignment()Ljava/lang/String;

    move-result-object v15

    new-instance v16, Lcom/whoop/design/model/ParagraphInsets;

    invoke-virtual {v8}, Lcom/whoop/educationModels/FeatureEducationParagraphDto;->getInset()Lcom/whoop/educationModels/InsetDto;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/educationModels/InsetDto;->getTop()D

    move-result-wide v25

    invoke-virtual {v8}, Lcom/whoop/educationModels/FeatureEducationParagraphDto;->getInset()Lcom/whoop/educationModels/InsetDto;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/educationModels/InsetDto;->getLeading()D

    move-result-wide v27

    invoke-virtual {v8}, Lcom/whoop/educationModels/FeatureEducationParagraphDto;->getInset()Lcom/whoop/educationModels/InsetDto;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/educationModels/InsetDto;->getBottom()D

    move-result-wide v29

    invoke-virtual {v8}, Lcom/whoop/educationModels/FeatureEducationParagraphDto;->getInset()Lcom/whoop/educationModels/InsetDto;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/educationModels/InsetDto;->getTrailing()D

    move-result-wide v31

    move-object/from16 v24, v16

    invoke-direct/range {v24 .. v32}, Lcom/whoop/design/model/ParagraphInsets;-><init>(DDDD)V

    invoke-virtual {v8}, Lcom/whoop/educationModels/FeatureEducationParagraphDto;->getImage()Lcom/whoop/educationModels/ImageDto;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/whoop/educationModels/ImageDto;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/whoop/educationModels/ImageDto;->getMediaType()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    const-string v0, ""

    :cond_8
    sget-object v5, Lcom/whoop/design/model/MediaType;->IMAGE:Lcom/whoop/design/model/MediaType;

    invoke-static {}, Lcom/whoop/design/model/MediaType;->values()[Lcom/whoop/design/model/MediaType;

    move-result-object v6

    array-length v10, v6

    const/4 v12, 0x0

    :goto_a
    if-ge v12, v10, :cond_a

    aget-object v13, v6, v12

    move-object/from16 v24, v3

    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_b

    :cond_9
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v3, v24

    goto :goto_a

    :cond_a
    move-object/from16 v24, v3

    move-object/from16 v13, v21

    :goto_b
    if-nez v13, :cond_b

    goto :goto_c

    :cond_b
    move-object v5, v13

    :goto_c
    new-instance v0, Lcom/whoop/design/model/FeatureEducationImage;

    invoke-direct {v0, v2, v5}, Lcom/whoop/design/model/FeatureEducationImage;-><init>(Ljava/lang/String;Lcom/whoop/design/model/MediaType;)V

    move-object/from16 v17, v0

    goto :goto_d

    :cond_c
    move-object/from16 v24, v3

    move-object/from16 v17, v21

    :goto_d
    invoke-virtual {v8}, Lcom/whoop/educationModels/FeatureEducationParagraphDto;->getVideo()Lcom/whoop/educationModels/FeatureEducationVideoDto;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lcom/whoop/educationModels/FeatureEducationVideoDto;->getId()I

    move-result v26

    invoke-virtual {v0}, Lcom/whoop/educationModels/FeatureEducationVideoDto;->getThumbnail()Lcom/whoop/educationModels/FeatureEducationThumbnailDto;

    move-result-object v2

    new-instance v27, Lcom/whoop/design/model/FeatureEducationThumbnail;

    invoke-virtual {v2}, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->getId()I

    move-result v28

    invoke-virtual {v2}, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->getCreatedAt()Ljava/lang/String;

    move-result-object v29

    invoke-virtual {v2}, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->getUpdatedAt()Ljava/lang/String;

    move-result-object v30

    invoke-virtual {v2}, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->getUrl()Ljava/lang/String;

    move-result-object v31

    invoke-virtual {v2}, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->getScrim()Ljava/lang/String;

    move-result-object v32

    invoke-virtual {v2}, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->getAlignment()Ljava/lang/String;

    move-result-object v33

    invoke-virtual {v2}, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->getBackgroundImage()Z

    move-result v34

    invoke-direct/range {v27 .. v34}, Lcom/whoop/design/model/FeatureEducationThumbnail;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0}, Lcom/whoop/educationModels/FeatureEducationVideoDto;->getCreatedAt()Ljava/lang/String;

    move-result-object v28

    invoke-virtual {v0}, Lcom/whoop/educationModels/FeatureEducationVideoDto;->getUpdatedAt()Ljava/lang/String;

    move-result-object v29

    invoke-virtual {v0}, Lcom/whoop/educationModels/FeatureEducationVideoDto;->getTitle()Ljava/lang/String;

    move-result-object v30

    invoke-virtual {v0}, Lcom/whoop/educationModels/FeatureEducationVideoDto;->getPlaytime()Ljava/lang/String;

    move-result-object v31

    invoke-virtual {v0}, Lcom/whoop/educationModels/FeatureEducationVideoDto;->getUrl()Ljava/lang/String;

    move-result-object v32

    invoke-static {}, Lcom/whoop/design/model/EducationVideoType;->values()[Lcom/whoop/design/model/EducationVideoType;

    move-result-object v2

    array-length v3, v2

    const/4 v5, 0x0

    :goto_e
    if-ge v5, v3, :cond_f

    aget-object v6, v2, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lcom/whoop/educationModels/FeatureEducationVideoDto;->getType()Lcom/whoop/educationModels/EducationVideoTypeDto;

    move-result-object v10

    if-eqz v10, :cond_d

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    goto :goto_f

    :cond_d
    move-object/from16 v10, v21

    :goto_f
    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    move-object/from16 v33, v6

    goto :goto_10

    :cond_e
    add-int/lit8 v5, v5, 0x1

    goto :goto_e

    :cond_f
    move-object/from16 v33, v21

    :goto_10
    new-instance v25, Lcom/whoop/design/model/FeatureEducationVideo;

    invoke-direct/range {v25 .. v33}, Lcom/whoop/design/model/FeatureEducationVideo;-><init>(ILcom/whoop/design/model/FeatureEducationThumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/model/EducationVideoType;)V

    move-object/from16 v18, v25

    goto :goto_11

    :cond_10
    move-object/from16 v18, v21

    :goto_11
    invoke-virtual/range {v23 .. v23}, Lcom/whoop/educationModels/FeatureEducationScreenDto;->getSections()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    if-ne v7, v0, :cond_11

    invoke-virtual/range {v23 .. v23}, Lcom/whoop/educationModels/FeatureEducationScreenDto;->getCtaButton()Lcom/whoop/educationModels/FeatureEducationButtonDto;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-static {v0}, Lcom/whoop/educationModels/EducationDtoToModelMapperKt;->toEducationCtaButton(Lcom/whoop/educationModels/FeatureEducationButtonDto;)Lcom/whoop/design/model/FeatureEducationCtaButton;

    move-result-object v0

    move-object/from16 v19, v0

    goto :goto_12

    :cond_11
    move-object/from16 v19, v21

    :goto_12
    invoke-virtual/range {v23 .. v23}, Lcom/whoop/educationModels/FeatureEducationScreenDto;->getSections()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    if-ne v7, v0, :cond_14

    invoke-virtual/range {v23 .. v23}, Lcom/whoop/educationModels/FeatureEducationScreenDto;->getCtas()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_14

    check-cast v0, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v10, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/CtaTileModel;

    invoke-virtual {v11, v3}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v3

    instance-of v5, v3, Ld11/i;

    if-eqz v5, :cond_12

    move-object/from16 v25, v3

    check-cast v25, Ld11/i;

    const v55, 0x1bffffff

    const/16 v56, 0x0

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

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/high16 v52, 0x7fc00000    # Float.NaN

    const/16 v53, 0x0

    const/16 v54, 0x0

    invoke-static/range {v25 .. v56}, Ld11/i;->f(Ld11/i;Ljava/lang/Object;Lkd1/l;Ll3/v0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll3/v0;Ly71/g;Lkd1/o;Lkd1/o;Lkd1/o;Lkotlin/jvm/functions/Function1;ZZLd11/a;Lk91/a;Ld11/b;ZZLd11/c;Li91/a;Lj91/b;Li2/t;FFFFFLjava/lang/Object;Lcom/whoop/navigation/e;ILjava/lang/Object;)Ld11/i;

    move-result-object v3

    :cond_12
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_13
    move-object/from16 v20, v10

    goto :goto_14

    :cond_14
    const/16 v2, 0xa

    move-object/from16 v20, v21

    :goto_14
    new-instance v13, Lcom/whoop/design/model/FeatureEducationParagraph;

    invoke-direct/range {v13 .. v20}, Lcom/whoop/design/model/FeatureEducationParagraph;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/model/ParagraphInsets;Lcom/whoop/design/model/FeatureEducationImage;Lcom/whoop/design/model/FeatureEducationVideo;Lcom/whoop/design/model/FeatureEducationCtaButton;Ljava/util/List;)V

    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v5, v2

    move v7, v9

    move-object/from16 v0, v22

    move-object/from16 v2, v23

    move-object/from16 v3, v24

    goto/16 :goto_1

    :cond_15
    const/16 v21, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw v21

    :cond_16
    move-object/from16 v22, v0

    invoke-static {v1, v4}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto/16 :goto_0

    :cond_17
    return-object v1
.end method

.method private static final toEducationSections$lambda$0$0$0(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final toIcon(Lcom/whoop/educationModels/InlineIcon;)Lcom/whoop/design/model/FeatureEducationInlineIcon;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/educationModels/InlineIcon;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/model/IconType;->WHOOP_ICON:Lcom/whoop/design/model/IconType;

    invoke-static {}, Lcom/whoop/design/model/IconType;->values()[Lcom/whoop/design/model/IconType;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x0

    if-ge v4, v3, :cond_1

    aget-object v6, v2, v4

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move-object v6, v5

    :goto_1
    if-nez v6, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v6

    :goto_2
    sget-object v0, Lcom/whoop/educationModels/EducationDtoToModelMapperKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    new-instance v0, Lcom/whoop/design/model/FeatureEducationInlineIcon;

    sget v1, Lme1/a;->a:I

    sget-object v2, Lkd1/j;->a:Lkd1/j;

    invoke-virtual {p0}, Lcom/whoop/educationModels/InlineIcon;->getColor()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lkd1/j;->e(Ljava/lang/String;)Ly81/f;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lcom/whoop/design/model/FeatureEducationInlineIcon;-><init>(ILy81/f;)V

    return-object v0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_4
    :try_start_0
    new-instance v0, Lcom/whoop/design/model/FeatureEducationInlineIcon;

    invoke-virtual {p0}, Lcom/whoop/educationModels/InlineIcon;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    sget-object v2, Lkd1/j;->a:Lkd1/j;

    invoke-virtual {p0}, Lcom/whoop/educationModels/InlineIcon;->getColor()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Lkd1/j;->e(Ljava/lang/String;)Ly81/f;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lcom/whoop/design/model/FeatureEducationInlineIcon;-><init>(ILy81/f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v0

    :catch_0
    return-object v5
.end method

.method public static final toStressEducationSections(Lcom/whoop/educationModels/FeatureEducationDto;)Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/educationModels/FeatureEducationDto;",
            ")",
            "Ljava/util/List<",
            "Lcom/whoop/design/model/FeatureEducationParagraph;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Lcom/whoop/educationModels/FeatureEducationDto;->getScreens()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/educationModels/FeatureEducationScreenDto;

    invoke-virtual {v2}, Lcom/whoop/educationModels/FeatureEducationScreenDto;->getSections()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/educationModels/FeatureEducationParagraphDto;

    invoke-virtual {v3}, Lcom/whoop/educationModels/FeatureEducationParagraphDto;->getSentences()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v4, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/educationModels/SentenceDto;

    new-instance v7, Lcom/whoop/design/model/FeatureEducationSentence;

    new-instance v8, Lcom/whoop/design/model/ScreenTextStyle;

    sget-object v9, Lkd1/j;->a:Lkd1/j;

    invoke-virtual {v5}, Lcom/whoop/educationModels/SentenceDto;->getStyle()Lcom/whoop/educationModels/ScreenTextStyleDto;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/educationModels/ScreenTextStyleDto;->getStyleName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lkd1/j;->f(Ljava/lang/String;)Lb91/a;

    move-result-object v10

    invoke-virtual {v5}, Lcom/whoop/educationModels/SentenceDto;->getStyle()Lcom/whoop/educationModels/ScreenTextStyleDto;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/educationModels/ScreenTextStyleDto;->getColor()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Lkd1/j;->e(Ljava/lang/String;)Ly81/f;

    move-result-object v9

    invoke-direct {v8, v10, v9}, Lcom/whoop/design/model/ScreenTextStyle;-><init>(Lb91/a;Ly81/f;)V

    invoke-virtual {v5}, Lcom/whoop/educationModels/SentenceDto;->getText()Ljava/lang/String;

    move-result-object v9

    const/16 v13, 0x1c

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v7 .. v14}, Lcom/whoop/design/model/FeatureEducationSentence;-><init>(Lcom/whoop/design/model/ScreenTextStyle;Ljava/lang/String;Lhy0/e;Ljava/lang/String;Lcom/whoop/design/model/FeatureEducationInlineIcon;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/educationModels/FeatureEducationParagraphDto;->getAlignment()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lcom/whoop/design/model/ParagraphInsets;

    invoke-virtual {v3}, Lcom/whoop/educationModels/FeatureEducationParagraphDto;->getInset()Lcom/whoop/educationModels/InsetDto;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/educationModels/InsetDto;->getTop()D

    move-result-wide v9

    invoke-virtual {v3}, Lcom/whoop/educationModels/FeatureEducationParagraphDto;->getInset()Lcom/whoop/educationModels/InsetDto;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/educationModels/InsetDto;->getLeading()D

    move-result-wide v11

    invoke-virtual {v3}, Lcom/whoop/educationModels/FeatureEducationParagraphDto;->getInset()Lcom/whoop/educationModels/InsetDto;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/educationModels/InsetDto;->getBottom()D

    move-result-wide v13

    invoke-virtual {v3}, Lcom/whoop/educationModels/FeatureEducationParagraphDto;->getInset()Lcom/whoop/educationModels/InsetDto;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/educationModels/InsetDto;->getTrailing()D

    move-result-wide v15

    invoke-direct/range {v8 .. v16}, Lcom/whoop/design/model/ParagraphInsets;-><init>(DDDD)V

    invoke-virtual {v3}, Lcom/whoop/educationModels/FeatureEducationParagraphDto;->getImage()Lcom/whoop/educationModels/ImageDto;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/whoop/educationModels/ImageDto;->getUrl()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/whoop/educationModels/ImageDto;->getMediaType()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    const-string v3, ""

    :cond_2
    sget-object v9, Lcom/whoop/design/model/MediaType;->IMAGE:Lcom/whoop/design/model/MediaType;

    invoke-static {}, Lcom/whoop/design/model/MediaType;->values()[Lcom/whoop/design/model/MediaType;

    move-result-object v10

    array-length v11, v10

    const/4 v12, 0x0

    :goto_3
    if-ge v12, v11, :cond_4

    aget-object v13, v10, v12

    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_3

    move-object v4, v13

    goto :goto_4

    :cond_3
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    :cond_4
    :goto_4
    if-nez v4, :cond_5

    goto :goto_5

    :cond_5
    move-object v9, v4

    :goto_5
    new-instance v4, Lcom/whoop/design/model/FeatureEducationImage;

    invoke-direct {v4, v5, v9}, Lcom/whoop/design/model/FeatureEducationImage;-><init>(Ljava/lang/String;Lcom/whoop/design/model/MediaType;)V

    :cond_6
    move-object v9, v4

    new-instance v5, Lcom/whoop/design/model/FeatureEducationParagraph;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0x70

    const/4 v14, 0x0

    invoke-direct/range {v5 .. v14}, Lcom/whoop/design/model/FeatureEducationParagraph;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/model/ParagraphInsets;Lcom/whoop/design/model/FeatureEducationImage;Lcom/whoop/design/model/FeatureEducationVideo;Lcom/whoop/design/model/FeatureEducationCtaButton;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_7
    return-object v1
.end method
