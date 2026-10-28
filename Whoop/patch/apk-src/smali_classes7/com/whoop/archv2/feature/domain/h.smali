.class public abstract Lcom/whoop/archv2/feature/domain/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a%\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a%\u0010\u000c\u001a\u0004\u0018\u00010\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a9\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f\"\u0004\u0008\u0000\u0010\u000e*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u0015\u0010\u0015\u001a\u00020\u0014*\u0004\u0018\u00010\u0013H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u0015\u0010\u0017\u001a\u00020\u0014*\u0004\u0018\u00010\u0013H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0016\u001a+\u0010\u001d\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u001a?\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020 0\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008$\u0010%\u001a?\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020 0\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0002\u00a2\u0006\u0004\u0008\'\u0010(\u001a+\u0010+\u001a\u0008\u0012\u0004\u0012\u00020)0\u000f2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020)0\u000f2\u0006\u0010#\u001a\u00020\"H\u0002\u00a2\u0006\u0004\u0008+\u0010,\u001a\u001b\u0010.\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u001a\u001a\u00020-H\u0002\u00a2\u0006\u0004\u0008.\u0010/\u001a\u001b\u00101\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u001a\u001a\u000200H\u0002\u00a2\u0006\u0004\u00081\u00102\u001a\u001b\u00104\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u001a\u001a\u000203H\u0002\u00a2\u0006\u0004\u00084\u00105\u00a8\u00066"
    }
    d2 = {
        "",
        "screenCacheKey",
        "requestPath",
        "p",
        "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
        "Lcom/whoop/whoopaction/domain/models/ReloadAction;",
        "reloadAction",
        "n",
        "(Lcom/whoop/whoopaction/domain/models/ReloadAction;)Ljava/lang/String;",
        "Lcom/whoop/archv2/feature/domain/a;",
        "previous",
        "incoming",
        "k",
        "(Lcom/whoop/archv2/feature/domain/a;Lcom/whoop/archv2/feature/domain/a;)Lcom/whoop/archv2/feature/domain/a;",
        "T",
        "",
        "fallback",
        "l",
        "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;",
        "Lcom/whoop/archv2/feature/domain/b;",
        "",
        "j",
        "(Lcom/whoop/archv2/feature/domain/b;)Z",
        "r",
        "Lcom/whoop/archv2/feature/domain/f;",
        "Lcom/whoop/archv2/feature/domain/i$m;",
        "action",
        "preserveActiveDialog",
        "reconcileFlowSteps",
        "i",
        "(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$m;ZZ)Lcom/whoop/archv2/feature/domain/f;",
        "",
        "",
        "accumulatedState",
        "Lcom/whoop/archv2/model/template/FlowTemplate;",
        "template",
        "q",
        "(Ljava/util/Map;Lcom/whoop/archv2/model/template/FlowTemplate;Z)Ljava/util/Map;",
        "key",
        "m",
        "(Ljava/util/Map;Ljava/lang/String;Lcom/whoop/archv2/model/template/FlowTemplate;)Ljava/util/Map;",
        "Lkotlinx/serialization/json/JsonElement;",
        "stack",
        "o",
        "(Ljava/util/List;Lcom/whoop/archv2/model/template/FlowTemplate;)Ljava/util/List;",
        "Lcom/whoop/archv2/feature/domain/i$h;",
        "h",
        "(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$h;)Lcom/whoop/archv2/feature/domain/f;",
        "Lcom/whoop/archv2/feature/domain/i$g;",
        "g",
        "(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$g;)Lcom/whoop/archv2/feature/domain/f;",
        "Lcom/whoop/archv2/feature/domain/i$a;",
        "f",
        "(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$a;)Lcom/whoop/archv2/feature/domain/f;",
        "arch-v2_release"
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
.method public static final synthetic a(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$a;)Lcom/whoop/archv2/feature/domain/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/archv2/feature/domain/h;->f(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$a;)Lcom/whoop/archv2/feature/domain/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$g;)Lcom/whoop/archv2/feature/domain/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/archv2/feature/domain/h;->g(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$g;)Lcom/whoop/archv2/feature/domain/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$h;)Lcom/whoop/archv2/feature/domain/f;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/archv2/feature/domain/h;->h(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$h;)Lcom/whoop/archv2/feature/domain/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$m;ZZ)Lcom/whoop/archv2/feature/domain/f;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/archv2/feature/domain/h;->i(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$m;ZZ)Lcom/whoop/archv2/feature/domain/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lcom/whoop/archv2/feature/domain/b;)Z
    .locals 0

    invoke-static {p0}, Lcom/whoop/archv2/feature/domain/h;->j(Lcom/whoop/archv2/feature/domain/b;)Z

    move-result p0

    return p0
.end method

.method private static final f(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$a;)Lcom/whoop/archv2/feature/domain/f;
    .locals 23

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/archv2/feature/domain/f;->r()Lcom/whoop/archv2/model/template/ScreenTemplate;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/archv2/model/template/ListTemplate;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/whoop/archv2/model/template/ListTemplate;

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/whoop/archv2/model/template/ListTemplate;->getItems()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_2
    check-cast v0, Ljava/util/Collection;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/archv2/feature/domain/i$a;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v4

    if-eqz v1, :cond_3

    const/16 v12, 0x3fb

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v1 .. v13}, Lcom/whoop/archv2/model/template/ListTemplate;->copy$default(Lcom/whoop/archv2/model/template/ListTemplate;Lcom/whoop/archv2/model/template/MetaData;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;Ljava/lang/String;Lcom/whoop/design/models/modal/LifecycleInteractions;Lcom/whoop/archv2/model/template/ListPagination;Lcom/whoop/archv2/model/template/PullToRefreshBehavior;Lcom/whoop/archv2/model/template/TemplatePadding;ILjava/lang/Object;)Lcom/whoop/archv2/model/template/ListTemplate;

    move-result-object v0

    if-eqz v0, :cond_3

    :goto_2
    move-object v3, v0

    goto :goto_3

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/archv2/feature/domain/f;->r()Lcom/whoop/archv2/model/template/ScreenTemplate;

    move-result-object v0

    goto :goto_2

    :goto_3
    sget-object v15, Lcom/whoop/archv2/feature/domain/o;->IDLE:Lcom/whoop/archv2/feature/domain/o;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/archv2/feature/domain/i$a;->b()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/archv2/feature/domain/f;->l()Lcom/whoop/archv2/model/template/PaginationErrorState;

    move-result-object v16

    const v21, 0x78ffd

    const/16 v22, 0x0

    const/4 v2, 0x0

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

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v22}, Lcom/whoop/archv2/feature/domain/f;->b(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;ILjava/lang/Object;)Lcom/whoop/archv2/feature/domain/f;

    move-result-object v0

    return-object v0
.end method

.method private static final g(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$g;)Lcom/whoop/archv2/feature/domain/f;
    .locals 26

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/archv2/feature/domain/f;->c()Ljava/util/Map;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/archv2/feature/domain/i$g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lkotlinx/serialization/json/JsonArray;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/serialization/json/JsonArray;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    :cond_1
    if-nez v2, :cond_2

    sget-object v2, Lm83/y;->w:Lm83/y;

    :cond_2
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    return-object p0

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/archv2/feature/domain/f;->c()Ljava/util/Map;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/archv2/feature/domain/i$g;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lkotlinx/serialization/json/JsonArray;

    const/4 v4, 0x1

    invoke-static {v4, v2}, Lm83/s;->A0(ILjava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v3, v2}, Lkotlinx/serialization/json/JsonArray;-><init>(Ljava/util/List;)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v2}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v15

    const v24, 0x7fbff

    const/16 v25, 0x0

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v4, p0

    invoke-static/range {v4 .. v25}, Lcom/whoop/archv2/feature/domain/f;->b(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;ILjava/lang/Object;)Lcom/whoop/archv2/feature/domain/f;

    move-result-object v0

    return-object v0
.end method

.method private static final h(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$h;)Lcom/whoop/archv2/feature/domain/f;
    .locals 26

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/archv2/feature/domain/f;->c()Ljava/util/Map;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/archv2/feature/domain/i$h;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lkotlinx/serialization/json/JsonArray;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/serialization/json/JsonArray;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    :cond_1
    if-nez v2, :cond_2

    sget-object v2, Lm83/y;->w:Lm83/y;

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/archv2/feature/domain/f;->c()Ljava/util/Map;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/archv2/feature/domain/i$h;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lkotlinx/serialization/json/JsonArray;

    check-cast v2, Ljava/util/Collection;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/archv2/feature/domain/i$h;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v4

    invoke-static {v4, v2}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {v3, v2}, Lkotlinx/serialization/json/JsonArray;-><init>(Ljava/util/List;)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v2}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v15

    const v24, 0x7fbff

    const/16 v25, 0x0

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v4, p0

    invoke-static/range {v4 .. v25}, Lcom/whoop/archv2/feature/domain/f;->b(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;ILjava/lang/Object;)Lcom/whoop/archv2/feature/domain/f;

    move-result-object v0

    return-object v0
.end method

.method private static final i(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i$m;ZZ)Lcom/whoop/archv2/feature/domain/f;
    .locals 45

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/archv2/feature/domain/i$m;->a()Lcom/whoop/archv2/feature/domain/f;

    move-result-object v1

    if-eqz p2, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/archv2/feature/domain/f;->d()Lcom/whoop/archv2/feature/domain/b;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/archv2/feature/domain/h;->j(Lcom/whoop/archv2/feature/domain/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/f;->d()Lcom/whoop/archv2/feature/domain/b;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/archv2/feature/domain/h;->r(Lcom/whoop/archv2/feature/domain/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/archv2/feature/domain/f;->d()Lcom/whoop/archv2/feature/domain/b;

    move-result-object v0

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/f;->d()Lcom/whoop/archv2/feature/domain/b;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/archv2/feature/domain/f;->c()Ljava/util/Map;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/archv2/feature/domain/f;->n()Lcom/whoop/archv2/feature/domain/p;

    move-result-object v19

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/f;->h()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/archv2/feature/domain/f;->h()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v0

    :cond_1
    move-object v8, v0

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/f;->i()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/archv2/feature/domain/f;->i()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v0

    :cond_2
    move-object v9, v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/archv2/feature/domain/f;->t()Lcom/whoop/archv2/feature/domain/a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/f;->t()Lcom/whoop/archv2/feature/domain/a;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/whoop/archv2/feature/domain/h;->k(Lcom/whoop/archv2/feature/domain/a;Lcom/whoop/archv2/feature/domain/a;)Lcom/whoop/archv2/feature/domain/a;

    move-result-object v20

    const v21, 0x1fb3e

    const/16 v22, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v1 .. v22}, Lcom/whoop/archv2/feature/domain/f;->b(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;ILjava/lang/Object;)Lcom/whoop/archv2/feature/domain/f;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Lcom/whoop/archv2/feature/domain/f;->r()Lcom/whoop/archv2/model/template/ScreenTemplate;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/archv2/model/template/ListTemplate;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast v0, Lcom/whoop/archv2/model/template/ListTemplate;

    goto :goto_2

    :cond_3
    move-object v0, v2

    :goto_2
    invoke-virtual/range {v23 .. v23}, Lcom/whoop/archv2/feature/domain/f;->r()Lcom/whoop/archv2/model/template/ScreenTemplate;

    move-result-object v1

    instance-of v3, v1, Lcom/whoop/archv2/model/template/FlowTemplate;

    if-eqz v3, :cond_4

    check-cast v1, Lcom/whoop/archv2/model/template/FlowTemplate;

    goto :goto_3

    :cond_4
    move-object v1, v2

    :goto_3
    if-eqz v1, :cond_6

    invoke-virtual/range {v23 .. v23}, Lcom/whoop/archv2/feature/domain/f;->c()Ljava/util/Map;

    move-result-object v3

    move/from16 v4, p3

    invoke-static {v3, v1, v4}, Lcom/whoop/archv2/feature/domain/h;->q(Ljava/util/Map;Lcom/whoop/archv2/model/template/FlowTemplate;Z)Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    :goto_4
    move-object/from16 v34, v1

    goto :goto_6

    :cond_6
    :goto_5
    invoke-virtual/range {v23 .. v23}, Lcom/whoop/archv2/feature/domain/f;->c()Ljava/util/Map;

    move-result-object v1

    goto :goto_4

    :goto_6
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/ListTemplate;->getPagination()Lcom/whoop/archv2/model/template/ListPagination;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/whoop/archv2/model/template/ListPagination;->getNextPageRequest()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v1

    move-object/from16 v36, v1

    goto :goto_7

    :cond_7
    move-object/from16 v36, v2

    :goto_7
    sget-object v37, Lcom/whoop/archv2/feature/domain/o;->IDLE:Lcom/whoop/archv2/feature/domain/o;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/ListTemplate;->getPagination()Lcom/whoop/archv2/model/template/ListPagination;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/ListPagination;->getStates()Lcom/whoop/archv2/model/template/PaginationStates;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/PaginationStates;->getErrorState()Lcom/whoop/archv2/model/template/PaginationErrorState;

    move-result-object v2

    :cond_8
    move-object/from16 v38, v2

    const v43, 0x78bff

    const/16 v44, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    invoke-static/range {v23 .. v44}, Lcom/whoop/archv2/feature/domain/f;->b(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;ILjava/lang/Object;)Lcom/whoop/archv2/feature/domain/f;

    move-result-object v0

    return-object v0
.end method

.method private static final j(Lcom/whoop/archv2/feature/domain/b;)Z
    .locals 1

    instance-of v0, p0, Lcom/whoop/archv2/feature/domain/b$b;

    if-nez v0, :cond_1

    sget-object v0, Lcom/whoop/archv2/feature/domain/b$e;->a:Lcom/whoop/archv2/feature/domain/b$e;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final k(Lcom/whoop/archv2/feature/domain/a;Lcom/whoop/archv2/feature/domain/a;)Lcom/whoop/archv2/feature/domain/a;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/archv2/feature/domain/a;->b()Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/archv2/feature/domain/a;->b()Ljava/util/List;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v0

    :goto_1
    invoke-static {v1, v2}, Lcom/whoop/archv2/feature/domain/h;->l(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/archv2/feature/domain/a;->a()Ljava/util/List;

    move-result-object p0

    goto :goto_2

    :cond_2
    move-object p0, v0

    :goto_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/whoop/archv2/feature/domain/a;->a()Ljava/util/List;

    move-result-object p1

    goto :goto_3

    :cond_3
    move-object p1, v0

    :goto_3
    invoke-static {p0, p1}, Lcom/whoop/archv2/feature/domain/h;->l(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    if-nez v1, :cond_4

    if-nez p0, :cond_4

    return-object v0

    :cond_4
    new-instance p1, Lcom/whoop/archv2/feature/domain/a;

    invoke-direct {p1, v1, p0}, Lcom/whoop/archv2/feature/domain/a;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method private static final l(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Ljava/util/List<",
            "+TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    return-object p1
.end method

.method private static final m(Ljava/util/Map;Ljava/lang/String;Lcom/whoop/archv2/model/template/FlowTemplate;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/archv2/model/template/FlowTemplate;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lkotlinx/serialization/json/JsonArray;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/serialization/json/JsonArray;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lkotlinx/serialization/json/JsonElement;

    instance-of v6, v5, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz v6, :cond_3

    check-cast v5, Lkotlinx/serialization/json/JsonPrimitive;

    goto :goto_2

    :cond_3
    move-object v5, v2

    :goto_2
    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {p2}, Lcom/whoop/archv2/model/template/FlowTemplate;->getSteps()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    :goto_3
    if-eqz v5, :cond_2

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {p2}, Lcom/whoop/archv2/model/template/FlowTemplate;->getCurrentStepList()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    move-object v1, v2

    :cond_7
    invoke-static {v1, p2}, Lcom/whoop/archv2/feature/domain/h;->o(Ljava/util/List;Lcom/whoop/archv2/model/template/FlowTemplate;)Ljava/util/List;

    move-result-object p2

    new-instance v1, Lkotlinx/serialization/json/JsonArray;

    invoke-direct {v1, p2}, Lkotlinx/serialization/json/JsonArray;-><init>(Ljava/util/List;)V

    invoke-virtual {v1, v0}, Lkotlinx/serialization/json/JsonArray;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    :goto_5
    return-object p0

    :cond_8
    new-instance p2, Ll83/k;

    invoke-direct {p2, p1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, p2}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lcom/whoop/whoopaction/domain/models/ReloadAction;)Ljava/lang/String;
    .locals 1

    const-string v0, "reloadAction"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/whoopaction/domain/models/ReloadAction;->getCachePolicy()Lcom/whoop/navigation/CachePolicyModel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/navigation/CachePolicyModel;->getCacheKey()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/whoop/whoopaction/domain/models/ReloadAction;->getRequest()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/navigation/models/ApiRequest;->getPath()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Ljava/util/List;Lcom/whoop/archv2/model/template/FlowTemplate;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;",
            "Lcom/whoop/archv2/model/template/FlowTemplate;",
            ")",
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/FlowTemplate;->getCurrentStepList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/FlowTemplate;->getSteps()Ljava/util/Map;

    move-result-object p1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    invoke-interface {p1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_3

    :cond_2
    move-object p1, p0

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    instance-of v3, v2, Lkotlinx/serialization/json/JsonPrimitive;

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    check-cast v2, Lkotlinx/serialization/json/JsonPrimitive;

    goto :goto_2

    :cond_4
    move-object v2, v4

    :goto_2
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object v4

    :cond_5
    if-eqz v4, :cond_3

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {v0, p1}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    :goto_3
    return-object p0

    :cond_7
    new-instance p0, Ljava/util/ArrayList;

    const/16 p1, 0xa

    invoke-static {v1, p1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p1

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    return-object p0
.end method

.method public static final p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    return-object p0
.end method

.method private static final q(Ljava/util/Map;Lcom/whoop/archv2/model/template/FlowTemplate;Z)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/whoop/archv2/model/template/FlowTemplate;",
            "Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcj0/c;->a(Lcom/whoop/archv2/model/template/FlowTemplate;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz p2, :cond_1

    invoke-static {p0, v0, p1}, Lcom/whoop/archv2/feature/domain/h;->m(Ljava/util/Map;Ljava/lang/String;Lcom/whoop/archv2/model/template/FlowTemplate;)Ljava/util/Map;

    move-result-object p0

    :cond_1
    return-object p0

    :cond_2
    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/FlowTemplate;->getCurrentStepList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance p1, Lkotlinx/serialization/json/JsonArray;

    invoke-direct {p1, p2}, Lkotlinx/serialization/json/JsonArray;-><init>(Ljava/util/List;)V

    new-instance p2, Ll83/k;

    invoke-direct {p2, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, p2}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final r(Lcom/whoop/archv2/feature/domain/b;)Z
    .locals 0

    if-eqz p0, :cond_1

    instance-of p0, p0, Lcom/whoop/archv2/feature/domain/b$b;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
