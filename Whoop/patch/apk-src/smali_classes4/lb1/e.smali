.class public abstract Llb1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "advancedLabsSubscriptionCardMapper",
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

    new-instance v0, Llb1/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/e;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;)Lf01/h;
    .locals 0

    invoke-static {p0}, Llb1/e;->d(Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;)Lf01/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/e;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/a;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/e$a;

    invoke-direct {v2, v0}, Llb1/e$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;)Lf01/h;
    .locals 8

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    new-instance v2, Lf01/r0;

    new-instance v3, Lf01/i0;

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->getHeader()Lcom/whoop/design/models/cards/Header;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/design/models/cards/Header;->getLeadingContent()Lcom/whoop/design/models/cards/HeaderContent;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/design/models/cards/HeaderContent;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->getHeader()Lcom/whoop/design/models/cards/Header;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/design/models/cards/Header;->getLeadingContent()Lcom/whoop/design/models/cards/HeaderContent;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/design/models/cards/HeaderContent;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lf01/i0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v4, Lf01/i0;

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->getHeader()Lcom/whoop/design/models/cards/Header;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/design/models/cards/Header;->getTrailingContent()Lcom/whoop/design/models/cards/HeaderContent;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/design/models/cards/HeaderContent;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->getHeader()Lcom/whoop/design/models/cards/Header;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/design/models/cards/Header;->getTrailingContent()Lcom/whoop/design/models/cards/HeaderContent;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/design/models/cards/HeaderContent;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lf01/i0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-direct {v2, v3, v4}, Lf01/r0;-><init>(Lf01/i0;Lf01/i0;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->getLineItems()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/cards/LineItem;

    new-instance v6, Lf01/e1;

    invoke-virtual {v5}, Lcom/whoop/design/models/cards/LineItem;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v5}, Lcom/whoop/design/models/cards/LineItem;->getLabel()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-direct {v6, v7, v5}, Lf01/e1;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->getFooter()Lcom/whoop/design/models/cards/Footer;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->getStatus()Ljava/lang/String;

    move-result-object p0

    const-string v1, "CANCELED"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    goto :goto_1

    :cond_1
    sget-object p0, Ly81/f;->BRAND_WHITE:Ly81/f;

    :goto_1
    new-instance v1, Lf01/j0;

    invoke-virtual {v3}, Lcom/whoop/design/models/cards/Footer;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v3}, Lcom/whoop/design/models/cards/Footer;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v3}, Lcom/whoop/design/models/cards/Footer;->getCardButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    const-string v3, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.CardButtonState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lny0/h;

    invoke-direct {v1, v5, v6, v0, p0}, Lf01/j0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lny0/h;Ly81/f;)V

    :cond_2
    new-instance p0, Lf01/h;

    invoke-direct {p0, v2, v4, v1}, Lf01/h;-><init>(Lf01/r0;Ljava/util/List;Lf01/j0;)V

    return-object p0
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/e;->a:Llb1/y0;

    return-object v0
.end method
