.class public final Lcom/whoop/archv2/feature/domain/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lpi0/a;",
        "Lcom/whoop/archv2/feature/domain/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u000c\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u0003*\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00032\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0014H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J#\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\r2\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lcom/whoop/archv2/feature/domain/j;",
        "Lod1/g;",
        "Lpi0/a;",
        "Lcom/whoop/archv2/feature/domain/f;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lcom/whoop/navigation/CachePolicyModel;",
        "cachePolicyModel",
        "",
        "requestName",
        "<init>",
        "(Lnm0/e;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;)V",
        "request",
        "Lec3/l;",
        "e",
        "(Lpi0/a;)Lec3/l;",
        "Lpm0/a;",
        "Lcom/whoop/archv2/model/template/AnyScreenTemplate;",
        "g",
        "(Lpm0/a;)Lcom/whoop/archv2/feature/domain/f;",
        "Lpm0/a$c;",
        "cacheResult",
        "f",
        "(Lpm0/a$c;)Lcom/whoop/archv2/feature/domain/f;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Lcom/whoop/navigation/CachePolicyModel;",
        "c",
        "Ljava/lang/String;",
        "arch-v2_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lnm0/e;

.field private final b:Lcom/whoop/navigation/CachePolicyModel;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnm0/e;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cachePolicyModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/j;->a:Lnm0/e;

    iput-object p2, p0, Lcom/whoop/archv2/feature/domain/j;->b:Lcom/whoop/navigation/CachePolicyModel;

    iput-object p3, p0, Lcom/whoop/archv2/feature/domain/j;->c:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic c(Lcom/whoop/archv2/feature/domain/j;Lpi0/a;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/archv2/feature/domain/j;->e(Lpi0/a;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcom/whoop/archv2/feature/domain/j;Lpm0/a;)Lcom/whoop/archv2/feature/domain/f;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/archv2/feature/domain/j;->g(Lpm0/a;)Lcom/whoop/archv2/feature/domain/f;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lpi0/a;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpi0/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/j;->c:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/whoop/archv2/feature/domain/GenericScreenFetchInteractorKt;->a(Lpi0/a;Ljava/lang/String;)Lcom/whoop/network/request/GetApiRequest;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/j;->b:Lcom/whoop/navigation/CachePolicyModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/CachePolicyModel;->getScopes()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1}, Lpi0/a;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/whoop/archv2/feature/domain/j;->b:Lcom/whoop/navigation/CachePolicyModel;

    invoke-virtual {p1}, Lcom/whoop/navigation/CachePolicyModel;->getCacheKey()Ljava/lang/String;

    move-result-object p1

    :cond_0
    new-instance v2, La6/u;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, La6/u;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2, v1, p1}, Lsm0/a;->a(Lec3/l;Ljava/util/Set;Ljava/lang/String;)Lec3/l;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/j;->a:Lnm0/e;

    new-instance v1, Lcom/whoop/archv2/feature/domain/j$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lcom/whoop/archv2/feature/domain/j$a;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {p1, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lcom/whoop/archv2/feature/domain/j$b;

    invoke-direct {v0, p1, p0}, Lcom/whoop/archv2/feature/domain/j$b;-><init>(Lec3/l;Lcom/whoop/archv2/feature/domain/j;)V

    return-object v0
.end method

.method private final f(Lpm0/a$c;)Lcom/whoop/archv2/feature/domain/f;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a$c<",
            "Lcom/whoop/archv2/model/template/AnyScreenTemplate;",
            ">;)",
            "Lcom/whoop/archv2/feature/domain/f;"
        }
    .end annotation

    invoke-static/range {p1 .. p1}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/whoop/archv2/feature/domain/f;

    new-instance v2, Lcom/whoop/archv2/feature/domain/b$d;

    invoke-virtual/range {p1 .. p1}, Lpm0/a$c;->b()I

    move-result v0

    invoke-direct {v2, v0}, Lcom/whoop/archv2/feature/domain/b$d;-><init>(I)V

    const v21, 0x7fffe

    const/16 v22, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

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

    invoke-direct/range {v1 .. v22}, Lcom/whoop/archv2/feature/domain/f;-><init>(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    new-instance v2, Lcom/whoop/archv2/feature/domain/f;

    sget-object v3, Lcom/whoop/archv2/feature/domain/b$c;->a:Lcom/whoop/archv2/feature/domain/b$c;

    const v22, 0x7fffe

    const/16 v23, 0x0

    const/4 v4, 0x0

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

    invoke-direct/range {v2 .. v23}, Lcom/whoop/archv2/feature/domain/f;-><init>(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method private final g(Lpm0/a;)Lcom/whoop/archv2/feature/domain/f;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a<",
            "Lcom/whoop/archv2/model/template/AnyScreenTemplate;",
            ">;)",
            "Lcom/whoop/archv2/feature/domain/f;"
        }
    .end annotation

    move-object/from16 v0, p1

    instance-of v1, v0, Lpm0/a$e;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    new-instance v4, Lcom/whoop/archv2/feature/domain/f;

    new-instance v5, Lcom/whoop/archv2/feature/domain/b$b;

    invoke-direct {v5, v3, v2, v3}, Lcom/whoop/archv2/feature/domain/b$b;-><init>(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v24, 0x7fffe

    const/16 v25, 0x0

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

    invoke-direct/range {v4 .. v25}, Lcom/whoop/archv2/feature/domain/f;-><init>(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_0
    instance-of v1, v0, Lpm0/a$a$b;

    const/4 v4, 0x0

    if-eqz v1, :cond_4

    check-cast v0, Lpm0/a$a$b;

    invoke-virtual {v0}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    invoke-virtual {v1}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->getTemplate()Lcom/whoop/archv2/model/template/ScreenTemplate;

    move-result-object v7

    invoke-virtual {v0}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    invoke-virtual {v1}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->getLifecycleInteractions()Lcom/whoop/design/models/modal/LifecycleInteractions;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-interface {v7}, Lcom/whoop/archv2/model/template/ScreenTemplate;->getLifecycleInteractions()Lcom/whoop/design/models/modal/LifecycleInteractions;

    move-result-object v1

    :cond_1
    invoke-virtual {v0}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->getPrefetchList()Lcom/whoop/cache/api/prefetch/PrefetchList;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/whoop/cache/api/prefetch/PrefetchList;

    invoke-direct {v0, v3, v2, v3}, Lcom/whoop/cache/api/prefetch/PrefetchList;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_2
    move-object/from16 v17, v0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/whoop/design/models/modal/LifecycleInteractions;->getSystemBackDisabled()Z

    move-result v4

    :cond_3
    move v15, v4

    new-instance v5, Lcom/whoop/archv2/feature/domain/f;

    const v25, 0x7f5e5

    const/16 v26, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v5 .. v26}, Lcom/whoop/archv2/feature/domain/f;-><init>(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_4
    instance-of v1, v0, Lpm0/a$a$a;

    if-eqz v1, :cond_9

    check-cast v0, Lpm0/a$a$a;

    invoke-virtual {v0}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    invoke-virtual {v1}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->getTemplate()Lcom/whoop/archv2/model/template/ScreenTemplate;

    move-result-object v7

    invoke-virtual {v0}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    invoke-virtual {v1}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->getLifecycleInteractions()Lcom/whoop/design/models/modal/LifecycleInteractions;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-interface {v7}, Lcom/whoop/archv2/model/template/ScreenTemplate;->getLifecycleInteractions()Lcom/whoop/design/models/modal/LifecycleInteractions;

    move-result-object v1

    :cond_5
    invoke-virtual {v0}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->getPrefetchList()Lcom/whoop/cache/api/prefetch/PrefetchList;

    move-result-object v0

    if-nez v0, :cond_6

    new-instance v0, Lcom/whoop/cache/api/prefetch/PrefetchList;

    invoke-direct {v0, v3, v2, v3}, Lcom/whoop/cache/api/prefetch/PrefetchList;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_6
    move-object/from16 v17, v0

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/whoop/design/models/modal/LifecycleInteractions;->getOnStart()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v3

    :cond_7
    move-object v14, v3

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lcom/whoop/design/models/modal/LifecycleInteractions;->getSystemBackDisabled()Z

    move-result v4

    :cond_8
    move v15, v4

    new-instance v5, Lcom/whoop/archv2/feature/domain/f;

    const v25, 0x7f4fd

    const/16 v26, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v5 .. v26}, Lcom/whoop/archv2/feature/domain/f;-><init>(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_9
    instance-of v1, v0, Lpm0/a$d;

    if-eqz v1, :cond_b

    new-instance v4, Lcom/whoop/archv2/feature/domain/f;

    check-cast v0, Lpm0/a$d;

    invoke-virtual {v0}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    invoke-virtual {v1}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->getTemplate()Lcom/whoop/archv2/model/template/ScreenTemplate;

    move-result-object v6

    invoke-virtual {v0}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->getPrefetchList()Lcom/whoop/cache/api/prefetch/PrefetchList;

    move-result-object v0

    if-nez v0, :cond_a

    new-instance v0, Lcom/whoop/cache/api/prefetch/PrefetchList;

    invoke-direct {v0, v3, v2, v3}, Lcom/whoop/cache/api/prefetch/PrefetchList;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_a
    move-object/from16 v16, v0

    const v24, 0x7f7fd

    const/16 v25, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v4 .. v25}, Lcom/whoop/archv2/feature/domain/f;-><init>(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_b
    instance-of v1, v0, Lpm0/a$c;

    if-eqz v1, :cond_c

    check-cast v0, Lpm0/a$c;

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/whoop/archv2/feature/domain/j;->f(Lpm0/a$c;)Lcom/whoop/archv2/feature/domain/f;

    move-result-object v0

    return-object v0

    :cond_c
    move-object/from16 v1, p0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
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

    new-instance v0, Lcom/whoop/archv2/feature/domain/j$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcom/whoop/archv2/feature/domain/j$c;-><init>(Lq83/d;Lcom/whoop/archv2/feature/domain/j;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
