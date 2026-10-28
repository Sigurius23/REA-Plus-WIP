.class public final Lsi0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J-\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJa\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00112\u0014\u0008\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00142\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lsi0/h;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lcom/whoop/navigation/models/ApiRequest;",
        "nextPageRequest",
        "Lcom/whoop/archv2/feature/domain/o;",
        "paginationStatus",
        "Lcom/whoop/archv2/model/template/PaginationErrorState;",
        "paginationErrorState",
        "Lti0/g;",
        "c",
        "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;)Lti0/g;",
        "Lcom/whoop/archv2/model/template/ListTemplate;",
        "template",
        "",
        "manualRefresh",
        "displayRefreshingSpinner",
        "",
        "",
        "accumulatedState",
        "Lti0/e;",
        "a",
        "(Lcom/whoop/archv2/model/template/ListTemplate;ZZLjava/util/Map;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;)Lti0/e;",
        "Ljb1/a;",
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


# static fields
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lsi0/h;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsi0/h;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic b(Lsi0/h;Lcom/whoop/archv2/model/template/ListTemplate;ZZLjava/util/Map;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;ILjava/lang/Object;)Lti0/e;
    .locals 1

    and-int/lit8 p9, p8, 0x2

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_2

    sget-object p4, Lm83/z;->w:Lm83/z;

    :cond_2
    and-int/lit8 p9, p8, 0x10

    const/4 v0, 0x0

    if-eqz p9, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_4

    sget-object p6, Lcom/whoop/archv2/feature/domain/o;->IDLE:Lcom/whoop/archv2/feature/domain/o;

    :cond_4
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_5

    move-object p7, v0

    :cond_5
    invoke-virtual/range {p0 .. p7}, Lsi0/h;->a(Lcom/whoop/archv2/model/template/ListTemplate;ZZLjava/util/Map;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;)Lti0/e;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;)Lti0/g;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lti0/g;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lcom/whoop/archv2/model/template/PaginationErrorState;->getErrorMessageText()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    if-nez v2, :cond_2

    const-string v2, ""

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p3}, Lcom/whoop/archv2/model/template/PaginationErrorState;->getRetryActionText()Ljava/lang/String;

    move-result-object v0

    :cond_3
    invoke-direct {v1, p2, p1, v2, v0}, Lti0/g;-><init>(Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/navigation/models/ApiRequest;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public final a(Lcom/whoop/archv2/model/template/ListTemplate;ZZLjava/util/Map;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;)Lti0/e;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/model/template/ListTemplate;",
            "ZZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/whoop/navigation/models/ApiRequest;",
            "Lcom/whoop/archv2/feature/domain/o;",
            "Lcom/whoop/archv2/model/template/PaginationErrorState;",
            ")",
            "Lti0/e;"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p6

    const-string v5, "template"

    move-object/from16 v6, p1

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "accumulatedState"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "paginationStatus"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/whoop/archv2/model/template/ListTemplate;->getItems()Ljava/util/List;

    move-result-object v5

    const/4 v7, 0x0

    if-eqz v5, :cond_1

    move-object v8, v5

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_0

    goto :goto_0

    :cond_0
    move-object v5, v7

    :goto_0
    if-eqz v5, :cond_1

    new-instance v8, Lri0/e$a;

    iget-object v9, v0, Lsi0/h;->a:Ljb1/a;

    invoke-virtual {v9, v5, v3}, Ljb1/a;->j(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object v5

    sget-object v9, Lpi0/b;->COMPACT:Lpi0/b;

    invoke-direct {v8, v5, v9}, Lri0/e$a;-><init>(Ljava/util/List;Lpi0/b;)V

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    goto :goto_1

    :cond_1
    move-object v5, v7

    :goto_1
    if-nez v5, :cond_2

    sget-object v5, Lm83/y;->w:Lm83/y;

    :cond_2
    move-object v11, v5

    invoke-virtual {v6}, Lcom/whoop/archv2/model/template/ListTemplate;->getFooter()Lcom/whoop/design/models/items/FooterModel;

    move-result-object v5

    if-eqz v5, :cond_3

    iget-object v8, v0, Lsi0/h;->a:Ljb1/a;

    invoke-static {v5, v3, v8}, Lsi0/d;->a(Lcom/whoop/design/models/items/FooterModel;Ljava/util/Map;Ljb1/a;)Lri0/a;

    move-result-object v5

    move-object v12, v5

    goto :goto_2

    :cond_3
    move-object v12, v7

    :goto_2
    invoke-virtual {v6}, Lcom/whoop/archv2/model/template/ListTemplate;->getBackgroundTheme()Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;

    move-result-object v5

    invoke-static {v5}, Lsi0/b;->a(Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;)Lti0/l;

    move-result-object v13

    invoke-virtual {v6}, Lcom/whoop/archv2/model/template/ListTemplate;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-static {v5}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v5

    goto :goto_3

    :cond_4
    move-object v5, v7

    :goto_3
    sget-object v8, Lti0/l;->DEFAULT:Lti0/l;

    if-ne v13, v8, :cond_5

    move-object v14, v5

    goto :goto_4

    :cond_5
    move-object v14, v7

    :goto_4
    new-instance v8, Lti0/e;

    invoke-virtual {v6}, Lcom/whoop/archv2/model/template/ListTemplate;->getScreenMetadata()Lcom/whoop/archv2/model/template/MetaData;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v5, v3}, Lcom/whoop/archv2/model/template/MetaData;->bind(Ljava/util/Map;)Lcom/whoop/archv2/model/template/MetaData;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/whoop/archv2/model/template/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-static {v3}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object v3

    move-object v9, v3

    goto :goto_5

    :cond_6
    move-object v9, v7

    :goto_5
    invoke-virtual {v6}, Lcom/whoop/archv2/model/template/ListTemplate;->getNavigationBar()Lcom/whoop/design/models/items/NavigationBarModel;

    move-result-object v3

    if-eqz v3, :cond_7

    iget-object v5, v0, Lsi0/h;->a:Ljb1/a;

    invoke-static {v3, v1, v2, v5}, Lsi0/i;->a(Lcom/whoop/design/models/items/NavigationBarModel;ZZLjb1/a;)Lri0/f;

    move-result-object v3

    move-object v10, v3

    move-object/from16 v5, p7

    move-object/from16 v3, p5

    goto :goto_6

    :cond_7
    move-object v10, v7

    move-object/from16 v3, p5

    move-object/from16 v5, p7

    :goto_6
    invoke-direct {v0, v3, v4, v5}, Lsi0/h;->c(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;)Lti0/g;

    move-result-object v15

    sget-object v3, Lti0/h;->a:Lti0/h$a;

    invoke-virtual {v6}, Lcom/whoop/archv2/model/template/ListTemplate;->getPullToRefreshBehavior()Lcom/whoop/archv2/model/template/PullToRefreshBehavior;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Lcom/whoop/archv2/model/template/PullToRefreshBehavior;->getEnabled()Z

    move-result v4

    goto :goto_7

    :cond_8
    move v4, v5

    :goto_7
    if-eqz v1, :cond_9

    if-eqz v2, :cond_9

    const/4 v5, 0x1

    :cond_9
    invoke-virtual {v3, v4, v5}, Lti0/h$a;->a(ZZ)Lti0/h;

    move-result-object v16

    invoke-virtual {v6}, Lcom/whoop/archv2/model/template/ListTemplate;->getPullToRefreshBehavior()Lcom/whoop/archv2/model/template/PullToRefreshBehavior;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lcom/whoop/archv2/model/template/PullToRefreshBehavior;->getScopeToUpdate()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v17, v1

    goto :goto_8

    :cond_a
    move-object/from16 v17, v7

    :goto_8
    invoke-virtual {v6}, Lcom/whoop/archv2/model/template/ListTemplate;->getPadding()Lcom/whoop/archv2/model/template/TemplatePadding;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-static {v1}, Lsi0/l;->a(Lcom/whoop/archv2/model/template/TemplatePadding;)Ll0/k1;

    move-result-object v7

    :cond_b
    move-object/from16 v18, v7

    invoke-direct/range {v8 .. v18}, Lti0/e;-><init>(Lep0/j;Lri0/f;Ljava/util/List;Lri0/a;Lti0/l;Lkd1/o;Lti0/g;Lti0/h;Ljava/lang/String;Ll0/k1;)V

    return-object v8
.end method
