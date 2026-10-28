.class public final Lxd2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\u000c\u001a\u00020\u000b*\u00020\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ+\u0010\u0010\u001a\u00020\u000b2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\'\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J!\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00182\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lxd2/k;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lvd2/b;",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;",
        "settingsResponse",
        "",
        "isLoadingMoreHistory",
        "Lxd2/j;",
        "f",
        "(Lvd2/b;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Z)Lxd2/j;",
        "Lxd2/b;",
        "dialogState",
        "e",
        "(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Lxd2/b;Z)Lxd2/j;",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;",
        "clearHistoryDialogResponse",
        "",
        "historyDate",
        "c",
        "(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Ljava/lang/String;)Lxd2/b;",
        "Lec3/l;",
        "domainStateFlow",
        "b",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Ljb1/a;",
        "shepherd_release"
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

    sput v0, Lxd2/k;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lxd2/k;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lxd2/l;->d()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lxd2/k;-><init>(Ljb1/a;)V

    return-void
.end method

.method public static final synthetic a(Lxd2/k;Lvd2/b;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Z)Lxd2/j;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lxd2/k;->f(Lvd2/b;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Z)Lxd2/j;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Ljava/lang/String;)Lxd2/b;
    .locals 6

    if-eqz p1, :cond_0

    new-instance v0, Lxd2/b;

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;->getPageTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;->getWarningMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;->getClearHistoryDialogButtons()Ljava/util/List;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryDialogButtonResponse;

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryDialogButtonResponse;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;->getClearHistoryDialogButtons()Ljava/util/List;

    move-result-object p1

    const/4 v1, 0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryDialogButtonResponse;

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryDialogButtonResponse;->getLabel()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lxd2/b;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public static synthetic d(Lxd2/k;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Ljava/lang/String;ILjava/lang/Object;)Lxd2/b;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lxd2/k;->c(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Ljava/lang/String;)Lxd2/b;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Lxd2/b;Z)Lxd2/j;
    .locals 23

    if-eqz p1, :cond_19

    move-object/from16 v0, p0

    iget-object v1, v0, Lxd2/k;->a:Ljb1/a;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->getSettingsCta()Lcom/whoop/design/models/items/CtaTileModel;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->getPageHeader()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;->getIcon()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lgz0/m0;->EDUCATION:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    move v9, v7

    :goto_0
    if-ge v9, v6, :cond_1

    aget-object v11, v5, v9

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_1
    const/4 v11, 0x0

    :goto_1
    if-nez v11, :cond_2

    goto :goto_2

    :cond_2
    move-object v4, v11

    :goto_2
    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v4

    sget-object v5, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :goto_3
    move v4, v7

    goto :goto_4

    :cond_3
    const/4 v1, 0x0

    goto :goto_3

    :goto_4
    new-instance v7, Lxd2/a;

    invoke-direct {v7, v2, v3, v1}, Lxd2/a;-><init>(Lcom/whoop/design/util/TextResource;ILcom/whoop/navigation/e;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->getShepherdHistory()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->getShepherdHistoryClearAll()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;->getIcon()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lgz0/m0;->CROSS:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v6, v5

    move v9, v4

    :goto_5
    if-ge v9, v6, :cond_5

    aget-object v11, v5, v9

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    goto :goto_6

    :cond_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_5
    const/4 v11, 0x0

    :goto_6
    if-nez v11, :cond_6

    goto :goto_7

    :cond_6
    move-object v3, v11

    :goto_7
    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v3, Lxd2/d;

    invoke-direct {v3, v2, v1}, Lxd2/d;-><init>(ILcom/whoop/design/util/TextResource;)V

    move-object v14, v3

    goto :goto_8

    :cond_7
    const/4 v14, 0x0

    :goto_8
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->getShepherdHistory()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->getShepherdEmptyHistory()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;->getIcon()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lgz0/m0;->SHEPHERD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v6, v5

    move v9, v4

    :goto_9
    if-ge v9, v6, :cond_9

    aget-object v11, v5, v9

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    goto :goto_a

    :cond_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_9

    :cond_9
    const/4 v11, 0x0

    :goto_a
    if-nez v11, :cond_a

    goto :goto_b

    :cond_a
    move-object v3, v11

    :goto_b
    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v5, Lxd2/c;

    invoke-direct {v5, v2, v3, v1}, Lxd2/c;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    move-object v15, v5

    goto :goto_c

    :cond_b
    const/4 v15, 0x0

    :goto_c
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->getShepherdHistory()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->getShepherdPaginatedHistory()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;

    move-result-object v1

    if-eqz v1, :cond_14

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;->getRecords()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryRecordSectionResponse;

    invoke-virtual {v6}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryRecordSectionResponse;->getTitle()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v6}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryRecordSectionResponse;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryRecordSectionResponse;->getItems()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v6, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_12

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryRecordResponse;

    invoke-virtual {v13}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryRecordResponse;->getHistoryDate()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v13}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryRecordResponse;->getRecordDate()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v13}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryRecordResponse;->getIcon()Ljava/lang/String;

    move-result-object v4

    sget-object v16, Lgz0/m0;->TINY_ATTENTION:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v10, v5

    const/4 v0, 0x0

    :goto_f
    if-ge v0, v10, :cond_d

    aget-object v19, v5, v0

    move/from16 v20, v0

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_10

    :cond_c
    add-int/lit8 v0, v20, 0x1

    goto :goto_f

    :cond_d
    const/16 v19, 0x0

    :goto_10
    if-nez v19, :cond_e

    goto :goto_11

    :cond_e
    move-object/from16 v16, v19

    :goto_11
    invoke-virtual/range {v16 .. v16}, Lgz0/m0;->toWhoopIcon()I

    move-result v19

    invoke-virtual {v13}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryRecordResponse;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-virtual {v13}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryRecordResponse;->getActionIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v4, Lgz0/m0;->TINY_CARET_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v10, v5

    const/4 v13, 0x0

    :goto_12
    if-ge v13, v10, :cond_10

    aget-object v16, v5, v13

    move-object/from16 v22, v1

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    goto :goto_13

    :cond_f
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v1, v22

    goto :goto_12

    :cond_10
    move-object/from16 v22, v1

    const/16 v16, 0x0

    :goto_13
    if-nez v16, :cond_11

    goto :goto_14

    :cond_11
    move-object/from16 v4, v16

    :goto_14
    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v21

    new-instance v16, Lxd2/e;

    invoke-direct/range {v16 .. v21}, Lxd2/e;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/design/util/TextResource;I)V

    move-object/from16 v0, v16

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    const/4 v4, 0x0

    const/16 v5, 0xa

    goto/16 :goto_e

    :cond_12
    move-object/from16 v22, v1

    new-instance v0, Lxd2/f;

    invoke-direct {v0, v9, v11, v12}, Lxd2/f;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    const/4 v4, 0x0

    const/16 v5, 0xa

    goto/16 :goto_d

    :cond_13
    move-object/from16 v22, v1

    invoke-virtual/range {v22 .. v22}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;->getNextToken()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lxd2/m;

    invoke-direct {v1, v3, v0}, Lxd2/m;-><init>(Ljava/util/List;Ljava/lang/String;)V

    move-object/from16 v16, v1

    goto :goto_15

    :cond_14
    const/16 v16, 0x0

    :goto_15
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->getShepherdHistory()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    if-nez v15, :cond_15

    const/4 v0, 0x1

    move v12, v0

    goto :goto_16

    :cond_15
    const/4 v12, 0x0

    :goto_16
    new-instance v10, Lxd2/g;

    move-object v11, v10

    invoke-direct/range {v11 .. v16}, Lxd2/g;-><init>(ZLcom/whoop/design/util/TextResource;Lxd2/d;Lxd2/c;Lxd2/m;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->getIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->CROSS:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_17
    if-ge v4, v3, :cond_17

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_16

    goto :goto_18

    :cond_16
    add-int/lit8 v4, v4, 0x1

    goto :goto_17

    :cond_17
    const/4 v5, 0x0

    :goto_18
    if-nez v5, :cond_18

    goto :goto_19

    :cond_18
    move-object v1, v5

    :goto_19
    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->getPageTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->getBody()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->getDetectionOn()Z

    move-result v9

    new-instance v3, Lxd2/j$b;

    move-object/from16 v11, p2

    move/from16 v12, p3

    invoke-direct/range {v3 .. v12}, Lxd2/j$b;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lxd2/a;Lm91/u;ZLxd2/g;Lxd2/b;Z)V

    return-object v3

    :cond_19
    sget-object v0, Lxd2/j$a;->h:Lxd2/j$a$a;

    invoke-virtual {v0}, Lxd2/j$a$a;->c()Lxd2/j$a;

    move-result-object v0

    return-object v0
.end method

.method private final f(Lvd2/b;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Z)Lxd2/j;
    .locals 3

    invoke-virtual {p1}, Lvd2/b;->c()Lvd2/d;

    move-result-object v0

    sget-object v1, Lvd2/d$a;->a:Lvd2/d$a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->getClearHistoryDialog()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    const/4 v0, 0x2

    invoke-static {p0, p1, v2, v0, v2}, Lxd2/k;->d(Lxd2/k;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Ljava/lang/String;ILjava/lang/Object;)Lxd2/b;

    move-result-object p1

    invoke-direct {p0, p2, p1, p3}, Lxd2/k;->e(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Lxd2/b;Z)Lxd2/j;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, v0, Lvd2/d$b;

    if-eqz v0, :cond_3

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->getClearRecordDialog()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    move-result-object v2

    :cond_2
    invoke-virtual {p1}, Lvd2/b;->c()Lvd2/d;

    move-result-object p1

    check-cast p1, Lvd2/d$b;

    invoke-virtual {p1}, Lvd2/d$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v2, p1}, Lxd2/k;->c(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Ljava/lang/String;)Lxd2/b;

    move-result-object p1

    invoke-direct {p0, p2, p1, p3}, Lxd2/k;->e(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Lxd2/b;Z)Lxd2/j;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-direct {p0, p2, v2, p3}, Lxd2/k;->e(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Lxd2/b;Z)Lxd2/j;

    move-result-object p1

    return-object p1
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

    const-string v0, "domainStateFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxd2/k$a;

    invoke-direct {v0, p1, p0}, Lxd2/k$a;-><init>(Lec3/l;Lxd2/k;)V

    return-object v0
.end method
