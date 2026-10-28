.class public abstract Lyz1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001b\u0010\u0008\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;",
        "Lh02/i0;",
        "h",
        "(Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;)Lh02/i0;",
        "Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;",
        "Lcom/whoop/nativestore/pdp/domain/model/SelectorType;",
        "type",
        "Lh02/l0;",
        "i",
        "(Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;)Lh02/l0;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "d",
        "()Ljb1/a;",
        "productVariantSelectorReducer",
        "native-store_release"
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
.field private static final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyv0/h;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lyv0/h;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lyz1/f;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyz1/f;->e(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyz1/f;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;)Lh02/i0;
    .locals 0

    invoke-static {p0}, Lyz1/f;->g(Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;)Lh02/i0;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Ljb1/a;
    .locals 1

    sget-object v0, Lyz1/f;->a:Ljb1/a;

    return-object v0
.end method

.method private static final e(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyv0/h;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lyv0/h;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyv0/h;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lyv0/h;-><init>(I)V

    const-class v1, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lyz1/f$a;

    invoke-direct {v2, v0}, Lyz1/f$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;)Lh02/i0;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyz1/f;->h(Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;)Lh02/i0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;)Lh02/i0;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->getLevel()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->getType()Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->getOptions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->getType()Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    move-result-object v6

    invoke-static {v1, v6}, Lyz1/f;->i(Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;)Lh02/l0;

    move-result-object v1

    invoke-interface {v5, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->getSizeChart()Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->getSelectedOption()Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->getType()Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    move-result-object v1

    invoke-static {v0, v1}, Lyz1/f;->i(Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;)Lh02/l0;

    move-result-object v0

    :goto_1
    move-object v7, v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->getVariantSelectorIndex()I

    move-result v8

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->getPackItemId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;->getPackItemProductKey()Ljava/lang/String;

    move-result-object v10

    new-instance v1, Lh02/i0;

    invoke-direct/range {v1 .. v10}, Lh02/i0;-><init>(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lh02/l0;ILjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method private static final i(Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;)Lh02/l0;
    .locals 6

    new-instance v0, Lh02/l0;

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;->getKey()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/whoop/nativestore/pdp/domain/model/SelectorType;->TEXT:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    if-ne p1, v2, :cond_0

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;->getContent()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, ""

    :goto_0
    sget-object v3, Lcom/whoop/nativestore/pdp/domain/model/SelectorType;->IMAGE:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    if-ne p1, v3, :cond_1

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;->getContent()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object p1

    :goto_1
    move-object v3, p1

    goto :goto_2

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;->getLabel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;->getHasStock()Z

    move-result v5

    invoke-direct/range {v0 .. v5}, Lh02/l0;-><init>(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Z)V

    return-object v0
.end method
