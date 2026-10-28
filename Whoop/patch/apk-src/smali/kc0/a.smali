.class public final Lkc0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lkc0/a;",
        "",
        "<init>",
        "()V",
        "Lgc0/c$f;",
        "Ljc0/d;",
        "f",
        "(Lgc0/c$f;)Ljc0/d;",
        "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;",
        "screen",
        "",
        "testId",
        "Lgc0/e;",
        "progressResult",
        "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;",
        "response",
        "Ljc0/d$e;",
        "c",
        "(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;Ljava/lang/String;Lgc0/e;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;)Ljc0/d$e;",
        "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;",
        "content",
        "d",
        "(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;Ljava/lang/String;Lgc0/e;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;)Ljc0/d$e;",
        "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextMultipleChoiceOption;",
        "option",
        "Ljc0/d$d;",
        "b",
        "(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextMultipleChoiceOption;)Ljc0/d$d;",
        "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;",
        "contextBottomSheet",
        "Ljc0/d$b;",
        "a",
        "(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;)Ljc0/d$b;",
        "Lgc0/c;",
        "domainResult",
        "e",
        "(Lgc0/c;)Ljc0/d;",
        "advanced-labs_release"
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

.method private final a(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;)Ljc0/d$b;
    .locals 31

    new-instance v0, Ljc0/d$b;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;->getContent()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lny0/h;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;->getPrimaryButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/design/models/items/CardButtonModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const v29, 0x1fffffe

    const/16 v30, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v3 .. v30}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1, v2, v3}, Ljc0/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;Lny0/h;)V

    return-object v0
.end method

.method private final b(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextMultipleChoiceOption;)Ljc0/d$d;
    .locals 9

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextMultipleChoiceOption;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextMultipleChoiceOption;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextMultipleChoiceOption;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextMultipleChoiceOption;->getNextScreenId()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;->values()[Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    move-object v3, v7

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    new-instance p1, Ljc0/d$d;

    invoke-direct {p1, v0, v1, v2, v3}, Ljc0/d$d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;)V

    return-object p1
.end method

.method private final c(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;Ljava/lang/String;Lgc0/e;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;)Ljc0/d$e;
    .locals 1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;->getContent()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenContent;

    move-result-object p1

    instance-of v0, p1, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;

    invoke-direct {p0, p1, p2, p3, p4}, Lkc0/a;->d(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;Ljava/lang/String;Lgc0/e;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;)Ljc0/d$e;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, p1, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/UnknownScreenContent;

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    new-instance p1, Ljc0/d$e;

    invoke-direct {p1, p2}, Ljc0/d$e;-><init>(Ljc0/d$c;)V

    return-object p1

    :cond_1
    new-instance p1, Ljc0/d$e;

    invoke-direct {p1, p2}, Ljc0/d$e;-><init>(Ljc0/d$c;)V

    return-object p1
.end method

.method private final d(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;Ljava/lang/String;Lgc0/e;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;)Ljc0/d$e;
    .locals 20

    move-object/from16 v0, p0

    invoke-virtual/range {p3 .. p3}, Lgc0/e;->a()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p4 .. p4}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;->getInitialScreen()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v19

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;->getSubtitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;->getImageUrl()Ljava/lang/String;

    move-result-object v7

    const/4 v1, 0x0

    if-eqz v7, :cond_0

    new-instance v6, Lkd1/o$c;

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object v6, v1

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;->getInfoCallout()Lcom/whoop/design/models/InfoCalloutTileModel;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2}, Llb1/j2;->b(Lcom/whoop/design/models/InfoCalloutTileModel;)Lc41/p2;

    move-result-object v2

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object v7, v1

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;->getBottomSheet()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-direct {v0, v2}, Lkc0/a;->a(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;)Ljc0/d$b;

    move-result-object v2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object v8, v1

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;->getFooterText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;->getOptionsHeader()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;->getOptionsHeaderIcon()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v3

    array-length v11, v3

    const/4 v12, 0x0

    move v13, v12

    :goto_3
    if-ge v13, v11, :cond_4

    aget-object v14, v3, v13

    invoke-virtual {v14}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3

    move-object v1, v14

    goto :goto_4

    :cond_3
    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    :cond_4
    :goto_4
    if-nez v1, :cond_5

    sget-object v1, Lgz0/m0;->EDUCATION:Lgz0/m0;

    :cond_5
    move-object v11, v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;->getOptions()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    move v2, v12

    new-instance v12, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v12, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextMultipleChoiceOption;

    invoke-direct {v0, v3}, Lkc0/a;->b(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextMultipleChoiceOption;)Ljc0/d$d;

    move-result-object v3

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;->getSelectedOptionId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;->getNextButtonTitle()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;->getSaveButtonTitle()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;->getSelectedOptionId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    const/4 v1, 0x1

    move/from16 v16, v1

    goto :goto_6

    :cond_7
    move/from16 v16, v2

    :goto_6
    invoke-virtual/range {p3 .. p3}, Lgc0/e;->a()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    move-result-object v18

    new-instance v3, Ljc0/d$c$a;

    move-object/from16 v17, p2

    invoke-direct/range {v3 .. v19}, Ljc0/d$c$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lc41/p2;Ljc0/d$b;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;Z)V

    new-instance v1, Ljc0/d$e;

    invoke-direct {v1, v3}, Ljc0/d$e;-><init>(Ljc0/d$c;)V

    return-object v1
.end method

.method private final f(Lgc0/c$f;)Ljc0/d;
    .locals 6

    invoke-virtual {p1}, Lgc0/c$f;->d()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;

    move-result-object v0

    invoke-virtual {p1}, Lgc0/c$f;->c()Lgc0/e;

    move-result-object v1

    invoke-virtual {v1}, Lgc0/e;->a()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;->getIntakeScreens()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    check-cast v2, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;

    const/4 v0, 0x1

    if-nez v2, :cond_2

    new-instance p1, Ljc0/d;

    invoke-direct {p1, v3, v3, v0, v3}, Ljc0/d;-><init>(Ljc0/d$a;Ljc0/d$e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_2
    new-instance v1, Ljc0/d;

    invoke-virtual {p1}, Lgc0/c$f;->e()Lgc0/b;

    move-result-object v4

    invoke-virtual {v4}, Lgc0/b;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lgc0/c$f;->c()Lgc0/e;

    move-result-object v5

    invoke-virtual {p1}, Lgc0/c$f;->d()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;

    move-result-object p1

    invoke-direct {p0, v2, v4, v5, p1}, Lkc0/a;->c(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;Ljava/lang/String;Lgc0/e;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;)Ljc0/d$e;

    move-result-object p1

    invoke-direct {v1, v3, p1, v0, v3}, Ljc0/d;-><init>(Ljc0/d$a;Ljc0/d$e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method


# virtual methods
.method public final e(Lgc0/c;)Ljc0/d;
    .locals 10

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lgc0/c$b;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Ljc0/d;

    new-instance v3, Ljc0/d$a;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v4

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Ljc0/d$a;-><init>(Lsz0/q0;Ljc0/a;Ljc0/a;Ljc0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v3, v2, v1, v2}, Ljc0/d;-><init>(Ljc0/d$a;Ljc0/d$e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_0
    instance-of v0, p1, Lgc0/c$d;

    if-eqz v0, :cond_1

    new-instance p1, Ljc0/d;

    new-instance v3, Ljc0/d$a;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->g()Lsz0/q0;

    move-result-object v4

    sget-object v5, Ljc0/a$c;->a:Ljc0/a$c;

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Ljc0/d$a;-><init>(Lsz0/q0;Ljc0/a;Ljc0/a;Ljc0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v3, v2, v1, v2}, Ljc0/d;-><init>(Ljc0/d$a;Ljc0/d$e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_1
    instance-of v0, p1, Lgc0/c$a;

    if-eqz v0, :cond_2

    new-instance p1, Ljc0/d;

    new-instance v3, Ljc0/d$a;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v4

    sget-object v7, Ljc0/a$c;->a:Ljc0/a$c;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v9}, Ljc0/d$a;-><init>(Lsz0/q0;Ljc0/a;Ljc0/a;Ljc0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v3, v2, v1, v2}, Ljc0/d;-><init>(Ljc0/d$a;Ljc0/d$e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_2
    instance-of v0, p1, Lgc0/c$f;

    if-eqz v0, :cond_4

    check-cast p1, Lgc0/c$f;

    invoke-virtual {p1}, Lgc0/c$f;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance p1, Ljc0/d;

    new-instance v3, Ljc0/d$a;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->g()Lsz0/q0;

    move-result-object v4

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Ljc0/d$a;-><init>(Lsz0/q0;Ljc0/a;Ljc0/a;Ljc0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v3, v2, v1, v2}, Ljc0/d;-><init>(Ljc0/d$a;Ljc0/d$e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_3
    invoke-direct {p0, p1}, Lkc0/a;->f(Lgc0/c$f;)Ljc0/d;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of v0, p1, Lgc0/c$e;

    if-eqz v0, :cond_5

    new-instance p1, Ljc0/d;

    new-instance v3, Ljc0/d$a;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v4

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Ljc0/d$a;-><init>(Lsz0/q0;Ljc0/a;Ljc0/a;Ljc0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v3, v2, v1, v2}, Ljc0/d;-><init>(Ljc0/d$a;Ljc0/d$e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_5
    instance-of p1, p1, Lgc0/c$c;

    if-eqz p1, :cond_6

    new-instance p1, Ljc0/d;

    new-instance v3, Ljc0/d$a;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v4

    sget-object v7, Ljc0/a$c;->a:Ljc0/a$c;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v9}, Ljc0/d$a;-><init>(Lsz0/q0;Ljc0/a;Ljc0/a;Ljc0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v3, v2, v1, v2}, Ljc0/d;-><init>(Ljc0/d$a;Ljc0/d$e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
