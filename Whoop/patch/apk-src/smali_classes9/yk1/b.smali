.class public abstract Lyk1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0015\u0010\u0008\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0015\u0010\u000f\u001a\u00020\u000e*\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;",
        "Ljb1/a;",
        "reducer",
        "Lxk1/e;",
        "b",
        "(Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;Ljb1/a;)Lxk1/e;",
        "Lcom/whoop/helpcenter/data/network/model/CallSectionDto;",
        "Lxk1/b;",
        "g",
        "(Lcom/whoop/helpcenter/data/network/model/CallSectionDto;)Lxk1/b;",
        "",
        "Lxk1/f;",
        "f",
        "(Ljava/lang/String;)Lxk1/f;",
        "",
        "e",
        "(Ljava/lang/String;)I",
        "help-center_release"
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

    invoke-static {p0}, Lyk1/b;->d(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;Ljb1/a;)Lxk1/e;
    .locals 19

    move-object/from16 v0, p1

    const-string v1, "<this>"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "reducer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->getLeftNavBarIcon()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyk1/b;->e(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->getRightNavBarIcon()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyk1/b;->e(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v2}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->getHeader()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->getPageTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->getCommonQuestionsSection()Lcom/whoop/helpcenter/data/network/model/CommonQuestionsSection;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/helpcenter/data/network/model/CommonQuestionsSection;->getCommonQuestionsTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->getCommonQuestionsSection()Lcom/whoop/helpcenter/data/network/model/CommonQuestionsSection;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/helpcenter/data/network/model/CommonQuestionsSection;->getCommonQuestionCards()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v7, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const-string v10, ""

    if-eqz v9, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/helpcenter/data/network/model/CommonQuestionCard;

    new-instance v11, Lxk1/c;

    invoke-virtual {v9}, Lcom/whoop/helpcenter/data/network/model/CommonQuestionCard;->getTitle()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9}, Lcom/whoop/helpcenter/data/network/model/CommonQuestionCard;->getSubTitle()Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_0

    move-object v13, v10

    :cond_0
    invoke-virtual {v9}, Lcom/whoop/helpcenter/data/network/model/CommonQuestionCard;->getQuestionType()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lyk1/b;->f(Ljava/lang/String;)Lxk1/f;

    move-result-object v14

    invoke-virtual {v9}, Lcom/whoop/helpcenter/data/network/model/CommonQuestionCard;->getLeftIconType()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lyk1/b;->e(Ljava/lang/String;)I

    move-result v15

    invoke-virtual {v9}, Lcom/whoop/helpcenter/data/network/model/CommonQuestionCard;->getRightIconType()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lyk1/b;->e(Ljava/lang/String;)I

    move-result v16

    invoke-virtual {v9}, Lcom/whoop/helpcenter/data/network/model/CommonQuestionCard;->getArticleUrl()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v9}, Lcom/whoop/helpcenter/data/network/model/CommonQuestionCard;->getPreviewText()Ljava/lang/String;

    move-result-object v18

    invoke-direct/range {v11 .. v18}, Lxk1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lxk1/f;IILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v7, Lxk1/d;

    invoke-direct {v7, v1, v8}, Lxk1/d;-><init>(Ljava/lang/String;Ljava/util/List;)V

    new-instance v8, Lxk1/a;

    invoke-virtual {v2}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->getBrowseAllSection()Lcom/whoop/helpcenter/data/network/model/BrowseAllSection;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/helpcenter/data/network/model/BrowseAllSection;->getSectionTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->getBrowseAllSection()Lcom/whoop/helpcenter/data/network/model/BrowseAllSection;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/helpcenter/data/network/model/BrowseAllSection;->getArticleUrl()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_2

    goto :goto_1

    :cond_2
    move-object v10, v9

    :goto_1
    invoke-virtual {v2}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->getBrowseAllSection()Lcom/whoop/helpcenter/data/network/model/BrowseAllSection;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/helpcenter/data/network/model/BrowseAllSection;->getTitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->getBrowseAllSection()Lcom/whoop/helpcenter/data/network/model/BrowseAllSection;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/helpcenter/data/network/model/BrowseAllSection;->getQuestionType()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lyk1/b;->f(Ljava/lang/String;)Lxk1/f;

    move-result-object v11

    invoke-direct {v8, v1, v10, v9, v11}, Lxk1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxk1/f;)V

    invoke-virtual {v2}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->getNeedMoreHelpSection()Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;->getTitle()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->getNeedMoreHelpSection()Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;->getMessageUsButtonTitle()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->getNeedMoreHelpSection()Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;->getWebFormUrl()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->getNeedMoreHelpSection()Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;->getSupportType()Ljava/lang/String;

    move-result-object v1

    sget-object v9, Lxk1/h;->WHOOP_COACH:Lxk1/h;

    invoke-static {}, Lxk1/h;->values()[Lxk1/h;

    move-result-object v13

    array-length v14, v13

    const/4 v15, 0x0

    :goto_2
    const/16 v16, 0x0

    if-ge v15, v14, :cond_4

    aget-object v17, v13, v15

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v2, p0

    goto :goto_2

    :cond_4
    move-object/from16 v17, v16

    :goto_3
    if-nez v17, :cond_5

    move-object v13, v9

    goto :goto_4

    :cond_5
    move-object/from16 v13, v17

    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->getNeedMoreHelpSection()Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/helpcenter/data/network/model/NeedMoreHelpSection;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v14

    new-instance v9, Lxk1/g;

    invoke-direct/range {v9 .. v14}, Lxk1/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxk1/h;Lcom/whoop/navigation/AiAction;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->getCallTile()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v0, v1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    instance-of v1, v0, Lc41/p2;

    if-eqz v1, :cond_6

    check-cast v0, Lc41/p2;

    goto :goto_5

    :cond_6
    move-object/from16 v0, v16

    :goto_5
    move-object v10, v0

    goto :goto_6

    :cond_7
    move-object/from16 v10, v16

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;->getCallSection()Lcom/whoop/helpcenter/data/network/model/CallSectionDto;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {v0}, Lyk1/b;->g(Lcom/whoop/helpcenter/data/network/model/CallSectionDto;)Lxk1/b;

    move-result-object v16

    :cond_8
    move-object/from16 v11, v16

    new-instance v2, Lxk1/e;

    invoke-direct/range {v2 .. v11}, Lxk1/e;-><init>(IILjava/lang/String;Ljava/lang/String;Lxk1/d;Lxk1/a;Lxk1/g;Lc41/p2;Lxk1/b;)V

    return-object v2
.end method

.method public static synthetic c(Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;Ljb1/a;ILjava/lang/Object;)Lxk1/e;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    new-instance p1, Lyb1/a;

    const/16 p2, 0x1c

    invoke-direct {p1, p2}, Lyb1/a;-><init>(I)V

    invoke-static {p1}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1}, Lyk1/b;->b(Lcom/whoop/helpcenter/data/network/model/HelpCenterLandingBffDto;Ljb1/a;)Lxk1/e;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Ljava/lang/String;)I
    .locals 5

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

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
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result p0

    return p0

    :cond_2
    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0}, Lx81/d;->d()Lgz0/o0;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/o0;->h()Lgz0/u;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/u;->c()I

    move-result p0

    return p0
.end method

.method private static final f(Ljava/lang/String;)Lxk1/f;
    .locals 5

    invoke-static {}, Lxk1/f;->values()[Lxk1/f;

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

    sget-object p0, Lxk1/f;->UNKNOWN:Lxk1/f;

    return-object p0

    :cond_2
    return-object v3
.end method

.method private static final g(Lcom/whoop/helpcenter/data/network/model/CallSectionDto;)Lxk1/b;
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/helpcenter/data/network/model/CallSectionDto;->getButtonTitle()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/helpcenter/data/network/model/CallSectionDto;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v1

    if-nez v1, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_1
    new-instance v2, Lxk1/b;

    invoke-virtual {p0}, Lcom/whoop/helpcenter/data/network/model/CallSectionDto;->getCaption()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, v0, p0, v1}, Lxk1/b;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object v2
.end method
