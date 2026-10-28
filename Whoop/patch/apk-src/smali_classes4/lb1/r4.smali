.class public abstract Llb1/r4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a1\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\"\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/design/models/items/TagSelectorModel;",
        "model",
        "Ljb1/a;",
        "reducer",
        "Ln81/d;",
        "style",
        "Ltr2/n;",
        "logger",
        "Ln81/f;",
        "f",
        "(Lcom/whoop/design/models/items/TagSelectorModel;Ljb1/a;Ln81/d;Ltr2/n;)Ln81/f;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "tagSelectorMapper",
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

    new-instance v0, Llb1/m4;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Llb1/m4;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/r4;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/TagSelectorModel;)Ln81/f;
    .locals 0

    invoke-static {p0}, Llb1/r4;->e(Lcom/whoop/design/models/items/TagSelectorModel;)Ln81/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/r4;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/r4;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/m4;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Llb1/m4;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/TagSelectorModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/r4$a;

    invoke-direct {v2, v0}, Llb1/r4$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/TagSelectorModel;)Ln81/f;
    .locals 8

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Llb1/r4;->g(Lcom/whoop/design/models/items/TagSelectorModel;Ljb1/a;Ln81/d;Ltr2/n;ILjava/lang/Object;)Ln81/f;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/whoop/design/models/items/TagSelectorModel;Ljb1/a;Ln81/d;Ltr2/n;)Ln81/f;
    .locals 9

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TagSelectorModel;->getTags()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/items/SelectorModel;

    new-instance v3, Ln81/a;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectorModel;->getNameDisplay()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectorModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectorModel;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v1

    invoke-direct {v3, v4, v5, v1}, Ln81/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TagSelectorModel;->getHorizontalPadding()Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TagSelectorModel;->getDefaultTag()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TagSelectorModel;->getSelectedTag()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TagSelectorModel;->getTagMaps()Ljava/util/Map;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v7, v1, Lcom/whoop/design/models/items/TagSelectorModel;

    const/4 v8, 0x0

    if-eqz v7, :cond_2

    const-string v1, "Nested TagSelectorModel in tagMaps is not supported; skipping \'"

    const-string v7, "\' to prevent infinite recursion."

    invoke-static {v1, v6, v7}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x0

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {p3, v1, v6}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v8, Ll83/k;

    invoke-direct {v8, v6, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    :goto_2
    if-eqz v8, :cond_1

    invoke-interface {v0, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v7

    new-instance v1, Ln81/f;

    move-object v6, p2

    invoke-direct/range {v1 .. v7}, Ln81/f;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ln81/d;Ljava/util/Map;)V

    return-object v1
.end method

.method public static synthetic g(Lcom/whoop/design/models/items/TagSelectorModel;Ljb1/a;Ln81/d;Ltr2/n;ILjava/lang/Object;)Ln81/f;
    .locals 6

    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_0

    new-instance v0, Ln81/d;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Ln81/d;-><init>(Lm81/f;Lm81/f;Lb91/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_1

    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "TagSelectorMapper"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    :cond_1
    invoke-static {p0, p1, p2, p3}, Llb1/r4;->f(Lcom/whoop/design/models/items/TagSelectorModel;Ljb1/a;Ln81/d;Ltr2/n;)Ln81/f;

    move-result-object p0

    return-object p0
.end method
