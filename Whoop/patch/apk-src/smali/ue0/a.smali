.class public final Lue0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000e2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lue0/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lre0/b$e;",
        "Lte0/h$e;",
        "d",
        "(Lre0/b$e;)Lte0/h$e;",
        "Lcom/whoop/design/models/modal/DialogModel;",
        "Lte0/e;",
        "c",
        "(Lcom/whoop/design/models/modal/DialogModel;)Lte0/e;",
        "Lec3/l;",
        "Lre0/b;",
        "upstream",
        "Lte0/h;",
        "b",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Ljb1/a;",
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


# static fields
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lue0/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lue0/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lmd0/c;->z0()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lue0/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method public static final synthetic a(Lue0/a;Lre0/b$e;)Lte0/h$e;
    .locals 0

    invoke-direct {p0, p1}, Lue0/a;->d(Lre0/b$e;)Lte0/h$e;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/design/models/modal/DialogModel;)Lte0/e;
    .locals 11

    new-instance v0, Lte0/e;

    invoke-virtual {p1}, Lcom/whoop/design/models/modal/DialogModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/design/models/modal/DialogModel;->getDescription()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/design/models/modal/DialogModel;->getPrimaryButton()Lcom/whoop/design/models/modal/DialogButton;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/whoop/design/models/modal/DialogButton;->getTitle()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    :cond_3
    sget-object v4, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-virtual {p1}, Lcom/whoop/design/models/modal/DialogModel;->getSecondaryButton()Lcom/whoop/design/models/modal/DialogButton;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lcom/whoop/design/models/modal/DialogButton;->getTitle()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-nez v5, :cond_5

    :cond_4
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    :cond_5
    sget-object v8, Lj11/p;->DEFAULT:Lj11/p;

    invoke-virtual {p1}, Lcom/whoop/design/models/modal/DialogModel;->getPrimaryButton()Lcom/whoop/design/models/modal/DialogButton;

    move-result-object v6

    const/4 v7, 0x0

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lcom/whoop/design/models/modal/DialogButton;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v6

    move-object v9, v6

    goto :goto_0

    :cond_6
    move-object v9, v7

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/design/models/modal/DialogModel;->getSecondaryButton()Lcom/whoop/design/models/modal/DialogButton;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/whoop/design/models/modal/DialogButton;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v7

    :cond_7
    move-object v10, v7

    const/4 v6, 0x1

    const/4 v7, 0x1

    invoke-direct/range {v0 .. v10}, Lte0/e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/navigation/e;Lcom/whoop/navigation/e;)V

    return-object v0
.end method

.method private final d(Lre0/b$e;)Lte0/h$e;
    .locals 17

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lre0/b$e;->a()Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;->getTestResultBottomSheet()Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheet;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheet;->getItems()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v4, 0x1

    if-ne v1, v4, :cond_4

    invoke-virtual/range {p1 .. p1}, Lre0/b$e;->a()Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;->getTestResultBottomSheet()Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheet;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheet;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;->getIcon()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_1

    aget-object v10, v7, v9

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    move-object v7, v10

    goto :goto_1

    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_1
    move-object v7, v3

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;->getDescription()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;->getDialog()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/whoop/design/models/modal/AnyModal;->getModal()Lcom/whoop/design/models/modal/Modal;

    move-result-object v1

    instance-of v4, v1, Lcom/whoop/design/models/modal/DialogModel;

    if-eqz v4, :cond_2

    check-cast v1, Lcom/whoop/design/models/modal/DialogModel;

    invoke-direct {v0, v1}, Lue0/a;->c(Lcom/whoop/design/models/modal/DialogModel;)Lte0/e;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v3

    :goto_2
    move-object v10, v1

    goto :goto_3

    :cond_3
    move-object v10, v3

    :goto_3
    new-instance v4, Lte0/b;

    invoke-direct/range {v4 .. v10}, Lte0/b;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Lte0/e;)V

    move-object v9, v4

    goto :goto_4

    :cond_4
    move-object v9, v3

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lre0/b$e;->a()Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getNavigationTitle()Ljava/lang/String;

    move-result-object v1

    if-eqz v9, :cond_5

    invoke-virtual {v9}, Lte0/b;->d()Lgz0/m0;

    move-result-object v4

    if-nez v4, :cond_a

    sget-object v4, Lgz0/m0;->DOWNLOAD:Lgz0/m0;

    goto :goto_7

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lre0/b$e;->a()Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getNavigationRightButton()Lcom/whoop/advancedlabs/domain/models/NavigationButtonModel;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/NavigationButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lgz0/m0;->DOT_MENU:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x0

    :goto_5
    if-ge v8, v7, :cond_7

    aget-object v10, v6, v8

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    goto :goto_6

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_7
    move-object v10, v3

    :goto_6
    if-nez v10, :cond_8

    move-object v4, v5

    goto :goto_7

    :cond_8
    move-object v4, v10

    goto :goto_7

    :cond_9
    move-object v4, v3

    :cond_a
    :goto_7
    invoke-virtual/range {p1 .. p1}, Lre0/b$e;->a()Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getNavigationRightButton()Lcom/whoop/advancedlabs/domain/models/NavigationButtonModel;

    move-result-object v5

    if-eqz v5, :cond_b

    invoke-virtual {v5}, Lcom/whoop/advancedlabs/domain/models/NavigationButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v5

    goto :goto_8

    :cond_b
    move-object v5, v3

    :goto_8
    new-instance v6, Lte0/a;

    invoke-direct {v6, v1, v4, v5}, Lte0/a;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;)V

    invoke-virtual/range {p1 .. p1}, Lre0/b$e;->a()Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;->getSections()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;

    iget-object v8, v0, Lue0/a;->a:Ljb1/a;

    invoke-virtual {v8, v5}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_c
    invoke-virtual/range {p1 .. p1}, Lre0/b$e;->a()Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;->getTestResultBottomSheet()Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheet;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheet;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v11

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;->getTitle()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;->getIcon()Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v10

    array-length v13, v10

    const/4 v14, 0x0

    :goto_b
    if-ge v14, v13, :cond_e

    aget-object v15, v10, v14

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    move-object v13, v15

    goto :goto_c

    :cond_d
    add-int/lit8 v14, v14, 0x1

    goto :goto_b

    :cond_e
    move-object v13, v3

    :goto_c
    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v14

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;->getDescription()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/TestResultBottomSheetItem;->getDialog()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v2

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Lcom/whoop/design/models/modal/AnyModal;->getModal()Lcom/whoop/design/models/modal/Modal;

    move-result-object v2

    instance-of v4, v2, Lcom/whoop/design/models/modal/DialogModel;

    if-eqz v4, :cond_f

    check-cast v2, Lcom/whoop/design/models/modal/DialogModel;

    invoke-direct {v0, v2}, Lue0/a;->c(Lcom/whoop/design/models/modal/DialogModel;)Lte0/e;

    move-result-object v2

    goto :goto_d

    :cond_f
    move-object v2, v3

    :goto_d
    move-object/from16 v16, v2

    goto :goto_e

    :cond_10
    move-object/from16 v16, v3

    :goto_e
    new-instance v10, Lte0/b;

    invoke-direct/range {v10 .. v16}, Lte0/b;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Lte0/e;)V

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_11
    new-instance v3, Lte0/c;

    invoke-direct {v3, v5}, Lte0/c;-><init>(Ljava/util/List;)V

    :cond_12
    move-object v8, v3

    invoke-virtual/range {p1 .. p1}, Lre0/b$e;->a()Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;->getAnalytics()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lre0/b$e;->a()Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;->getTestType()Ljava/lang/String;

    move-result-object v11

    new-instance v5, Lte0/h$e;

    const/4 v12, 0x0

    invoke-direct/range {v5 .. v12}, Lte0/h$e;-><init>(Lte0/a;Ljava/util/List;Lte0/c;Lte0/b;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Lte0/e;)V

    return-object v5
.end method


# virtual methods
.method public final b(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lue0/a$a;

    invoke-direct {v0, p1, p0}, Lue0/a$a;-><init>(Lec3/l;Lue0/a;)V

    return-object v0
.end method
