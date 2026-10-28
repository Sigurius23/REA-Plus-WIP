.class public abstract Lsb1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a%\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u001a\u0010\u000c\u001a\u00020\u00078\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "",
        "subtitle",
        "Lcom/whoop/design/models/MarkdownTextModel;",
        "description",
        "Lp51/a;",
        "h",
        "(Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;)Lp51/a;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "g",
        "()Llb1/y0;",
        "contextHubMapper",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqc1/a;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lqc1/a;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lsb1/a;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/ContextCardModel;)Lp51/e;
    .locals 0

    invoke-static {p0}, Lsb1/a;->e(Lcom/whoop/design/models/items/ContextCardModel;)Lp51/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/ContextHubHeaderModel;)Lq51/d;
    .locals 0

    invoke-static {p0}, Lsb1/a;->f(Lcom/whoop/design/models/items/ContextHubHeaderModel;)Lq51/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsb1/a;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqc1/a;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lqc1/a;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/items/ContextCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lsb1/a$a;

    invoke-direct {v3, v0}, Lsb1/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lqc1/a;

    const/16 v2, 0xf

    invoke-direct {v0, v2}, Lqc1/a;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/ContextHubHeaderModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lsb1/a$b;

    invoke-direct {v2, v0}, Lsb1/a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/ContextCardModel;)Lp51/e;
    .locals 25

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ContextCardModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ContextCardModel;->isNewText()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ContextCardModel;->getStatus()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lp51/d;->UNKNOWN:Lp51/d;

    invoke-static {}, Lp51/d;->values()[Lp51/d;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x0

    move v9, v8

    :goto_1
    if-ge v9, v7, :cond_2

    aget-object v10, v6, v9

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    move-object v10, v3

    :goto_2
    if-nez v10, :cond_3

    move-object v4, v5

    goto :goto_3

    :cond_3
    move-object v4, v10

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ContextCardModel;->getTags()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v5, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/design/models/items/ContextCardTagModel;

    invoke-virtual {v7}, Lcom/whoop/design/models/items/ContextCardTagModel;->getTitle()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7}, Lcom/whoop/design/models/items/ContextCardTagModel;->getTagStyle()Ljava/lang/String;

    move-result-object v7

    sget-object v9, Lcom/whoop/design/models/items/TagBackgroundStyle;->DEFAULT:Lcom/whoop/design/models/items/TagBackgroundStyle;

    invoke-static {}, Lcom/whoop/design/models/items/TagBackgroundStyle;->values()[Lcom/whoop/design/models/items/TagBackgroundStyle;

    move-result-object v10

    array-length v12, v10

    move v13, v8

    :goto_5
    if-ge v13, v12, :cond_5

    aget-object v14, v10, v13

    invoke-virtual {v14}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_4

    goto :goto_6

    :cond_4
    add-int/lit8 v13, v13, 0x1

    goto :goto_5

    :cond_5
    move-object v14, v3

    :goto_6
    if-nez v14, :cond_6

    move-object v13, v9

    goto :goto_7

    :cond_6
    move-object v13, v14

    :goto_7
    new-instance v9, Lcom/whoop/design/models/items/TagModel;

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x1ff5

    const/16 v24, 0x0

    invoke-direct/range {v9 .. v24}, Lcom/whoop/design/models/items/TagModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagBackgroundStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/IconSize;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v9}, Llb1/q4;->d(Lcom/whoop/design/models/items/TagModel;)Lhy0/h1;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ContextCardModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ContextCardModel;->getSubtitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ContextCardModel;->getDescription()Lcom/whoop/design/models/MarkdownTextModel;

    move-result-object v8

    invoke-static {v7, v8}, Lsb1/a;->h(Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;)Lp51/a;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ContextCardModel;->getLastUpdatedAtText()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    goto :goto_8

    :cond_8
    move-object v8, v3

    :goto_8
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ContextCardModel;->getExpiresAtText()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    :cond_9
    move-object v9, v3

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ContextCardModel;->isUpdateSeen()Ljava/lang/Boolean;

    move-result-object v10

    new-instance v1, Lp51/e;

    move-object v3, v6

    move-object v6, v5

    move-object v5, v3

    move-object v3, v0

    invoke-direct/range {v1 .. v10}, Lp51/e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lp51/d;Ljava/util/List;Lcom/whoop/navigation/e;Lp51/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method private static final f(Lcom/whoop/design/models/items/ContextHubHeaderModel;)Lq51/d;
    .locals 3

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq51/d;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContextHubHeaderModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContextHubHeaderModel;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContextHubHeaderModel;->getProfileImageUrl()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lq51/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;)V

    return-object v0
.end method

.method public static final g()Llb1/y0;
    .locals 1

    sget-object v0, Lsb1/a;->a:Llb1/y0;

    return-object v0
.end method

.method private static final h(Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;)Lp51/a;
    .locals 0

    if-eqz p1, :cond_0

    new-instance p0, Lp51/a$a;

    invoke-static {p1}, Llb1/u4;->f(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;

    move-result-object p1

    invoke-direct {p0, p1}, Lp51/a$a;-><init>(Lsz0/c0;)V

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    new-instance p1, Lp51/a$b;

    invoke-direct {p1, p0}, Lp51/a$b;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
