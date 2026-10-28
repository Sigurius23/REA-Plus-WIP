.class public abstract Loh1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\"\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/design/models/items/CountryModel;",
        "Lr51/g;",
        "l",
        "(Lcom/whoop/design/models/items/CountryModel;)Lr51/g;",
        "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;",
        "",
        "",
        "k",
        "(Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;)Ljava/util/Map;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "itemReducer",
        "gifting_release"
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

    new-instance v0, Lo72/e;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lo72/e;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Loh1/b;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Loh1/b;->h(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/CountrySelectorModel;)Lr51/f;
    .locals 0

    invoke-static {p0}, Loh1/b;->j(Lcom/whoop/design/models/items/CountrySelectorModel;)Lr51/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Loh1/b;->g(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;)Lnh1/d;
    .locals 0

    invoke-static {p0}, Loh1/b;->i(Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;)Lnh1/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e()Ljb1/a;
    .locals 1

    sget-object v0, Loh1/b;->a:Ljb1/a;

    return-object v0
.end method

.method public static final synthetic f(Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Loh1/b;->k(Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo72/e;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lo72/e;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo72/e;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lo72/e;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Loh1/b$a;

    invoke-direct {v3, v0}, Loh1/b$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lo72/e;

    const/16 v2, 0xe

    invoke-direct {v0, v2}, Lo72/e;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/CountrySelectorModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Loh1/b$b;

    invoke-direct {v2, v0}, Loh1/b$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;)Lnh1/d;
    .locals 7

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lnh1/d;

    invoke-virtual {p0}, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->getDescription()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->getNumericStepper()Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;

    move-result-object v0

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;->getMinimumStepperValue()I

    move-result v0

    goto :goto_2

    :cond_1
    move v0, v4

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->getNumericStepper()Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;->getMaximumStepperValue()I

    move-result v5

    goto :goto_3

    :cond_2
    move v5, v4

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->getNumericStepper()Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;->getStartingStepperValue()I

    move-result v4

    :cond_3
    move v6, v4

    move v4, v0

    invoke-direct/range {v1 .. v6}, Lnh1/d;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;III)V

    return-object v1
.end method

.method private static final j(Lcom/whoop/design/models/items/CountrySelectorModel;)Lr51/f;
    .locals 9

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountrySelectorModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountrySelectorModel;->getHeaderText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountrySelectorModel;->getSearchPlaceholderText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountrySelectorModel;->getSelectedCountry()Lcom/whoop/design/models/items/CountryModel;

    move-result-object v0

    invoke-static {v0}, Loh1/b;->l(Lcom/whoop/design/models/items/CountryModel;)Lr51/g;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountrySelectorModel;->getCountries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v8, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/items/CountryModel;

    invoke-static {v1}, Loh1/b;->l(Lcom/whoop/design/models/items/CountryModel;)Lr51/g;

    move-result-object v1

    invoke-interface {v8, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountrySelectorModel;->getConfirmButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Llb1/d4;->l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountrySelectorModel;->getCancelButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object p0

    invoke-static {p0, v1, v2, v1}, Llb1/d4;->l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;

    move-result-object v3

    new-instance v1, Lr51/f;

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Lr51/f;-><init>(Lny0/h;Lny0/h;Lr51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    return-object v1
.end method

.method private static final k(Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->getAnalytics()Ljava/util/Map;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    sget-object p0, Lm83/z;->w:Lm83/z;

    return-object p0
.end method

.method private static final l(Lcom/whoop/design/models/items/CountryModel;)Lr51/g;
    .locals 7

    new-instance v0, Lr51/g;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountryModel;->getAlpha2()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountryModel;->getAlpha3()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountryModel;->getRegion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountryModel;->getPhoneCountryCode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountryModel;->getCountryFlag()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CountryModel;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lr51/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method
