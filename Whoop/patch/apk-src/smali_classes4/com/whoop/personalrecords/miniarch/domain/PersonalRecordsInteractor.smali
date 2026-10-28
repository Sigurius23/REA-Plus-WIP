.class public final Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction;",
        "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ3\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J-\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J/\u0010\u001e\u001a\u00020\u00032\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ#\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;",
        "Lod1/g;",
        "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction;",
        "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;",
        "Lu02/c;",
        "apiClient",
        "Ln32/a;",
        "analytics",
        "<init>",
        "(Lu02/c;Ln32/a;)V",
        "La12/a;",
        "parsedPath",
        "Lec3/l;",
        "fetchData",
        "(La12/a;)Lec3/l;",
        "",
        "startDate",
        "endDate",
        "",
        "nextExerciseOffset",
        "loadMoreData",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lec3/l;",
        "",
        "isValidLoadMoreParameters",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Z",
        "Lu02/g;",
        "Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;",
        "apiResult",
        "path",
        "isLoadingMore",
        "handleApiResult",
        "(Lu02/g;Ljava/lang/String;Z)Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "Lu02/c;",
        "Ln32/a;",
        "accumulatedResponse",
        "Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;",
        "personal-records-mini-arch_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private accumulatedResponse:Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

.field private final analytics:Ln32/a;

.field private final apiClient:Lu02/c;


# direct methods
.method public constructor <init>(Lu02/c;Ln32/a;)V
    .locals 1

    const-string v0, "apiClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->apiClient:Lu02/c;

    iput-object p2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->analytics:Ln32/a;

    return-void
.end method

.method public static final synthetic access$fetchData(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;La12/a;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->fetchData(La12/a;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAccumulatedResponse$p(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;)Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;
    .locals 0

    iget-object p0, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->accumulatedResponse:Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    return-object p0
.end method

.method public static final synthetic access$getAnalytics$p(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;)Ln32/a;
    .locals 0

    iget-object p0, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->analytics:Ln32/a;

    return-object p0
.end method

.method public static final synthetic access$getApiClient$p(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;)Lu02/c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->apiClient:Lu02/c;

    return-object p0
.end method

.method public static final synthetic access$handleApiResult(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;Lu02/g;Ljava/lang/String;Z)Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->handleApiResult(Lu02/g;Ljava/lang/String;Z)Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$loadMoreData(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->loadMoreData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final fetchData(La12/a;)Lec3/l;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La12/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/personalrecords/miniarch/domain/GetPersonalRecordsRequest;

    invoke-virtual {p1}, La12/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, La12/a;->b()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/whoop/personalrecords/miniarch/domain/GetPersonalRecordsRequest;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->apiClient:Lu02/c;

    const-class v2, Ll83/a0;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->b(Ljava/lang/Class;)Lj93/a0;

    move-result-object v3

    invoke-static {v3}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v4

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v2, v3, v4}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v2

    const-class v3, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    invoke-static {v3}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v4

    invoke-static {v4}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-virtual {v5, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v3, v4, v6}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v3

    invoke-static {v1, v0, v2, v3}, Lu02/f;->b(Lec3/l;Lu02/c;Ls63/a;Ls63/a;)Lec3/l;

    move-result-object v0

    new-instance v1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1;

    invoke-direct {v1, v0, p0, p1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1;-><init>(Lec3/l;Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;La12/a;)V

    return-object v1
.end method

.method private final handleApiResult(Lu02/g;Ljava/lang/String;Z)Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu02/g<",
            "Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;",
            ">;",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;"
        }
    .end annotation

    instance-of v0, p1, Lu02/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    new-instance p1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;

    new-instance v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$RequestFailed;

    invoke-direct {v0, p2}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$RequestFailed;-><init>(Ljava/lang/String;)V

    if-eqz p3, :cond_0

    iget-object v2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->accumulatedResponse:Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    :cond_0
    invoke-direct {p1, v0, v2, v1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;-><init>(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType;Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;Z)V

    return-object p1

    :cond_1
    instance-of p2, p1, Lu02/h;

    if-eqz p2, :cond_6

    if-eqz p3, :cond_5

    iget-object p2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->accumulatedResponse:Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->getTiles()Ljava/util/List;

    move-result-object p3

    if-eqz p3, :cond_2

    check-cast p3, Ljava/util/Collection;

    move-object v0, p1

    check-cast v0, Lu02/h;

    invoke-virtual {v0}, Lu02/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    invoke-virtual {v0}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->getTiles()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p3, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p3

    :goto_0
    move-object v4, p3

    goto :goto_1

    :cond_2
    move-object p3, p1

    check-cast p3, Lu02/h;

    invoke-virtual {p3}, Lu02/h;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    invoke-virtual {p3}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->getTiles()Ljava/util/List;

    move-result-object p3

    goto :goto_0

    :goto_1
    check-cast p1, Lu02/h;

    invoke-virtual {p1}, Lu02/h;->a()Ljava/lang/Object;

    move-result-object p3

    move-object v3, p3

    check-cast v3, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->getAnalyticsAction()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_3

    goto :goto_3

    :cond_3
    :goto_2
    move-object v9, p2

    goto :goto_4

    :cond_4
    :goto_3
    invoke-virtual {p1}, Lu02/h;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    invoke-virtual {p1}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->getAnalyticsAction()Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :goto_4
    const/16 v10, 0x1e

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->copy$default(Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->accumulatedResponse:Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    new-instance p2, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;

    invoke-direct {p2, v2, p1, v1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;-><init>(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType;Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;Z)V

    return-object p2

    :cond_5
    check-cast p1, Lu02/h;

    invoke-virtual {p1}, Lu02/h;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    iput-object p1, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->accumulatedResponse:Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    new-instance p2, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;

    invoke-direct {p2, v2, p1, v1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;-><init>(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType;Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;Z)V

    return-object p2

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static synthetic handleApiResult$default(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;Lu02/g;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->handleApiResult(Lu02/g;Ljava/lang/String;Z)Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;

    move-result-object p0

    return-object p0
.end method

.method private final isValidLoadMoreParameters(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Z
    .locals 0

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method private final loadMoreData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lec3/l;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->isValidLoadMoreParameters(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;-><init>(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v1}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1

    :cond_0
    new-instance v2, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;-><init>(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType;Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, La6/u;

    const/4 p2, 0x1

    invoke-direct {p1, v2, p2}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
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

    new-instance v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$interact$$inlined$flatMapLatest$1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$interact$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
