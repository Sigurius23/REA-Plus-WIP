.class public final Ll82/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J+\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Ll82/a;",
        "",
        "Ljb1/a;",
        "designItemReducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "model",
        "",
        "",
        "Li82/b;",
        "stages",
        "a",
        "(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;",
        "Li82/g;",
        "domainState",
        "Ln31/e;",
        "b",
        "(Li82/g;)Ln31/e;",
        "Ljb1/a;",
        "search-arch-mini_release"
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

    sput v0, Ll82/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ll82/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 3
    invoke-static {p1, p3, p1}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Ll82/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final a(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Li82/b;",
            ">;)",
            "Lcom/whoop/design/models/DesignSystemModel;"
        }
    .end annotation

    invoke-static {p1}, Lcom/whoop/design/models/DesignSystemModelKt;->unwrap(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/design/models/items/FollowerRequestModel;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/whoop/design/models/items/FollowerRequestModel;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    return-object p1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/design/models/items/FollowerRequestModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li82/b;

    invoke-static {v0, p2}, Li82/c;->e(Lcom/whoop/design/models/items/FollowerRequestModel;Li82/b;)Lcom/whoop/design/models/items/FollowerRequestModel;

    move-result-object v2

    instance-of p2, p1, Lcom/whoop/design/models/DesignModelWrapper;

    if-eqz p2, :cond_2

    move-object v1, p1

    check-cast v1, Lcom/whoop/design/models/DesignModelWrapper;

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/DesignModelWrapper;->copy$default(Lcom/whoop/design/models/DesignModelWrapper;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/DesignModelWrapper;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v2
.end method


# virtual methods
.method public final b(Li82/g;)Ln31/e;
    .locals 19

    move-object/from16 v0, p0

    const-string v1, "domainState"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Li82/g;->d()Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;

    move-result-object v1

    invoke-virtual {v2}, Li82/g;->e()Z

    move-result v3

    invoke-virtual {v2}, Li82/g;->g()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    invoke-virtual {v2}, Li82/g;->k()Z

    move-result v7

    invoke-virtual {v2}, Li82/g;->j()Z

    move-result v8

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->getSearchPlaceHolderText()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_1
    move-object v6, v5

    :goto_1
    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->getSearchDebounceMs()Ljava/lang/Long;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    goto :goto_2

    :cond_2
    const-wide/16 v10, 0x12c

    :goto_2
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->getLoadingHintText()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-static {v6}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_3

    goto :goto_3

    :cond_3
    move-object v6, v5

    :goto_3
    if-eqz v6, :cond_4

    invoke-static {v6}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v6

    move-object v12, v6

    goto :goto_4

    :cond_4
    move-object v12, v5

    :goto_4
    invoke-virtual {v2}, Li82/g;->k()Z

    move-result v6

    if-nez v6, :cond_6

    invoke-virtual {v2}, Li82/g;->j()Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_5

    :cond_5
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v6

    move-object v13, v6

    goto :goto_6

    :cond_6
    :goto_5
    move-object v13, v5

    :goto_6
    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v1, v14}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v6, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2}, Li82/g;->f()Ljava/util/Map;

    move-result-object v15

    invoke-direct {v0, v14, v15}, Ll82/a;->a(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v14

    invoke-interface {v6, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_7
    iget-object v1, v0, Ll82/a;->a:Ljb1/a;

    sget-object v14, Lm83/z;->w:Lm83/z;

    invoke-virtual {v1, v6, v14}, Ljb1/a;->j(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object v1

    if-eqz v4, :cond_8

    invoke-static {v1, v4}, Ll82/b;->a(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    :cond_8
    if-nez v1, :cond_9

    goto :goto_9

    :cond_9
    :goto_8
    move-object v14, v1

    goto :goto_a

    :cond_a
    :goto_9
    sget-object v1, Lm83/y;->w:Lm83/y;

    goto :goto_8

    :goto_a
    invoke-virtual {v2}, Li82/g;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v2}, Li82/g;->i()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v6

    if-eqz v6, :cond_c

    :cond_b
    move-object v15, v5

    goto :goto_b

    :cond_c
    move-object v15, v1

    :goto_b
    if-eqz v3, :cond_d

    invoke-virtual {v2}, Li82/g;->h()Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, 0x1

    :goto_c
    move/from16 v16, v1

    goto :goto_d

    :cond_d
    const/4 v1, 0x0

    goto :goto_c

    :goto_d
    invoke-virtual {v2}, Li82/g;->i()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v18

    new-instance v6, Ln31/e;

    move-object/from16 v17, v4

    invoke-direct/range {v6 .. v18}, Ln31/e;-><init>(ZZLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v6
.end method
