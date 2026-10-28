.class public final Ltd2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\u000f\u001a\u00020\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J!\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00152\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Ltd2/j;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lrd2/b;",
        "domainState",
        "Ltd2/i;",
        "e",
        "(Lrd2/b;)Ltd2/i;",
        "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;",
        "historyDetailResponse",
        "Lxd2/b;",
        "dialogState",
        "d",
        "(Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;Lxd2/b;)Ltd2/i;",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;",
        "clearHistoryDialogResponse",
        "c",
        "(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)Lxd2/b;",
        "Lec3/l;",
        "upstream",
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

    sput v0, Ltd2/j;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ltd2/j;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Ltd2/k;->d()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Ltd2/j;-><init>(Ljb1/a;)V

    return-void
.end method

.method public static final synthetic a(Ltd2/j;Lrd2/b;)Ltd2/i;
    .locals 0

    invoke-direct {p0, p1}, Ltd2/j;->e(Lrd2/b;)Ltd2/i;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)Lxd2/b;
    .locals 8

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

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v1, 0x0

    invoke-direct/range {v0 .. v7}, Lxd2/b;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final d(Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;Lxd2/b;)Ltd2/i;
    .locals 19

    if-eqz p1, :cond_d

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->getPossibleShepherdTile()Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;->getTileTile()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->getPossibleShepherdTile()Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;->getTileSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->getPossibleShepherdTile()Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/detail/domain/models/PossibleShepherdTileResponse;->getTileIcon()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lgz0/m0;->TINY_ATTENTION:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    const/4 v7, 0x0

    :goto_0
    const/4 v8, 0x0

    if-ge v7, v5, :cond_1

    aget-object v9, v4, v7

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    move-object v3, v9

    :goto_2
    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    new-instance v10, Ltd2/b;

    invoke-direct {v10, v0, v1, v2}, Ltd2/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;I)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->getLabradorItemInfo()Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v1, Ltd2/a;

    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;->getUpsellDescription()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    const-string v2, ""

    :cond_3
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v4, v3, Ltd2/j;->a:Ljb1/a;

    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/detail/domain/models/LabradorItemInfo;->getLabradorNewRecordingCta()Lcom/whoop/design/models/items/CtaTileModel;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ltd2/a;-><init>(Lcom/whoop/design/util/TextResource;Lm91/u;)V

    move-object v15, v1

    goto :goto_3

    :cond_4
    move-object/from16 v3, p0

    move-object v15, v8

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->getHistoryDetailBox()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;->getHistoryDetailByDate()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailByDate;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->getHistoryDetailBox()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;->getHistoryDetailByDate()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailByDate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailByDate;->getHistoryDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->getHistoryDetailBox()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;->getHistoryDetailByDate()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailByDate;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailByDate;->getRecordDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->getHistoryDetailBox()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;->getHistoryDetailByDate()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailByDate;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailByDate;->getRecords()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailRecord;

    invoke-virtual {v5}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailRecord;->getIcon()Ljava/lang/String;

    move-result-object v7

    sget-object v9, Lgz0/m0;->TINY_ATTENTION:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v11

    array-length v12, v11

    const/4 v13, 0x0

    :goto_5
    if-ge v13, v12, :cond_6

    aget-object v14, v11, v13

    invoke-virtual {v14}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_6

    :cond_5
    add-int/lit8 v13, v13, 0x1

    goto :goto_5

    :cond_6
    move-object v14, v8

    :goto_6
    if-nez v14, :cond_7

    goto :goto_7

    :cond_7
    move-object v9, v14

    :goto_7
    invoke-virtual {v9}, Lgz0/m0;->toWhoopIcon()I

    move-result v6

    new-instance v7, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v5}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailRecord;->getLabel()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v7, v9}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v9, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v5}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailRecord;->getTimeRange()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v9, v5}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v5, Ltd2/g;

    invoke-direct {v5, v6, v7, v9}, Ltd2/g;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->getHistoryDetailBox()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;->getHistoryDetailByDate()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailByDate;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailByDate;->getNextToken()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ltd2/d;

    invoke-direct {v5, v0, v1, v4, v2}, Ltd2/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_8

    :cond_9
    move-object v5, v8

    :goto_8
    new-instance v0, Ltd2/c;

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->getHistoryDetailBox()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v0, v1, v5}, Ltd2/c;-><init>(Lcom/whoop/design/util/TextResource;Ltd2/d;)V

    new-instance v1, Ltd2/e;

    new-instance v2, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->getClearButton()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;->getLabel()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->getClearButton()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailClearButton;->getHasFocus()Z

    move-result v4

    invoke-direct {v1, v2, v4}, Ltd2/e;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->getIcon()Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lgz0/m0;->CROSS:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_9
    if-ge v7, v6, :cond_b

    aget-object v9, v5, v7

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    move-object v8, v9

    goto :goto_a

    :cond_a
    add-int/lit8 v7, v7, 0x1

    goto :goto_9

    :cond_b
    :goto_a
    if-nez v8, :cond_c

    goto :goto_b

    :cond_c
    move-object v4, v8

    :goto_b
    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v11

    new-instance v12, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->getPageTitle()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v12, v2}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v13, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v13, v2}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v14, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->getAdvise()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v14, v2}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v9, Ltd2/i$b;

    move-object/from16 v18, p2

    move-object/from16 v16, v0

    move-object/from16 v17, v1

    invoke-direct/range {v9 .. v18}, Ltd2/i$b;-><init>(Ltd2/b;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ltd2/a;Ltd2/c;Ltd2/e;Lxd2/b;)V

    return-object v9

    :cond_d
    move-object/from16 v3, p0

    sget-object v0, Ltd2/i$a;->h:Ltd2/i$a$a;

    invoke-virtual {v0}, Ltd2/i$a$a;->c()Ltd2/i$a;

    move-result-object v0

    return-object v0
.end method

.method private final e(Lrd2/b;)Ltd2/i;
    .locals 2

    invoke-virtual {p1}, Lrd2/b;->c()Lrd2/e;

    move-result-object v0

    instance-of v0, v0, Lrd2/e$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lrd2/b;->d()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;

    move-result-object v0

    invoke-virtual {p1}, Lrd2/b;->d()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;->getClearHistoryDialog()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    move-result-object v1

    :cond_0
    invoke-direct {p0, v1}, Ltd2/j;->c(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)Lxd2/b;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Ltd2/j;->d(Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;Lxd2/b;)Ltd2/i;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lrd2/b;->d()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;

    move-result-object p1

    invoke-direct {p0, p1, v1}, Ltd2/j;->d(Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;Lxd2/b;)Ltd2/i;

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

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltd2/j$a;

    invoke-direct {v0, p1, p0}, Ltd2/j$a;-><init>(Lec3/l;Ltd2/j;)V

    return-object v0
.end method
