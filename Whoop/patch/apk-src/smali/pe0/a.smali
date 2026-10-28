.class public final Lpe0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00102\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpe0/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;",
        "",
        "isLoadingMore",
        "Loe0/e$c;",
        "d",
        "(Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;Z)Loe0/e$c;",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;",
        "Loe0/a;",
        "c",
        "(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)Loe0/a;",
        "Lec3/l;",
        "Lme0/b;",
        "upstream",
        "Loe0/e;",
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

    sput v0, Lpe0/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lpe0/a;->a:Ljb1/a;

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
    invoke-direct {p0, p1}, Lpe0/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method public static final synthetic a(Lpe0/a;Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;Z)Loe0/e$c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lpe0/a;->d(Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;Z)Loe0/e$c;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)Loe0/a;
    .locals 9

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;->getSections()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsTestHistorySection;

    invoke-virtual {v3}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsTestHistorySection;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsTestHistorySection;->getSectionHeader()Lcom/whoop/design/models/items/DividerModel;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    iget-object v7, p0, Lpe0/a;->a:Ljb1/a;

    invoke-virtual {v7, v5}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v5

    goto :goto_1

    :cond_0
    move-object v5, v6

    :goto_1
    instance-of v7, v5, Lhy0/e;

    if-eqz v7, :cond_1

    move-object v6, v5

    check-cast v6, Lhy0/e;

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsTestHistorySection;->getItems()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v3, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/design/models/DesignSystemModel;

    iget-object v8, p0, Lpe0/a;->a:Ljb1/a;

    invoke-virtual {v8, v7}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    new-instance v3, Loe0/b;

    invoke-direct {v3, v4, v6, v5}, Loe0/b;-><init>(Ljava/lang/String;Lhy0/e;Ljava/util/List;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;->getNextToken()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Loe0/a;

    invoke-direct {v0, v1, p1}, Loe0/a;-><init>(Ljava/util/List;Ljava/lang/String;)V

    return-object v0
.end method

.method private final d(Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;Z)Loe0/e$c;
    .locals 14

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getNavigationTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getNavigationRightButton()Lcom/whoop/advancedlabs/domain/models/NavigationButtonModel;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/NavigationButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    move-object v6, v2

    :goto_1
    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getNavigationRightButton()Lcom/whoop/advancedlabs/domain/models/NavigationButtonModel;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/NavigationButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v2

    :cond_2
    new-instance v8, Lte0/a;

    invoke-direct {v8, v0, v6, v2}, Lte0/a;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;)V

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->getTitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->getSubtitle()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->getPaginatedRecords()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;

    move-result-object v0

    invoke-direct {p0, v0}, Lpe0/a;->c(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)Loe0/a;

    move-result-object v11

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->getPaginatedRecords()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;->getAnalytics()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v13

    new-instance v7, Loe0/e$c;

    move/from16 v12, p2

    invoke-direct/range {v7 .. v13}, Loe0/e$c;-><init>(Lte0/a;Ljava/lang/String;Ljava/lang/String;Loe0/a;ZLcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)V

    return-object v7
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

    new-instance v0, Lpe0/a$a;

    invoke-direct {v0, p1, p0}, Lpe0/a$a;-><init>(Lec3/l;Lpe0/a;)V

    return-object v0
.end method
