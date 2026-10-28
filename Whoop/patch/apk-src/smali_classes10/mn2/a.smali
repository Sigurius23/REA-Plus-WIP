.class public abstract Lmn2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\"\u001a\u0010\u0017\u001a\u00020\u00108\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0012\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;",
        "Lio2/d0;",
        "v",
        "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;)Lio2/d0;",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel;",
        "Lio2/p0;",
        "w",
        "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel;)Lio2/p0;",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;",
        "Lio2/k;",
        "u",
        "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;)Lio2/k;",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;",
        "Lio2/h;",
        "t",
        "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;)Lio2/h;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "nestedDesignItemReducer",
        "b",
        "o",
        "()Ljb1/a;",
        "universalCheckoutDesignItemReducer",
        "universal-checkout_release"
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

.field private static final b:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmm1/h;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lmm1/h;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lmn2/a;->a:Ljb1/a;

    new-instance v0, Lmm1/h;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lmm1/h;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lmn2/a;->b:Ljb1/a;

    return-void
.end method

.method private static final A(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;)Lio2/k;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lmn2/a;->u(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;)Lio2/k;

    move-result-object p0

    return-object p0
.end method

.method private static final B(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;)Lio2/d0;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lmn2/a;->v(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;)Lio2/d0;

    move-result-object p0

    return-object p0
.end method

.method private static final C(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;)Lio2/b0;
    .locals 14

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmn2/a;->a:Ljb1/a;

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->getHeader()Lcom/whoop/design/models/items/HeaderModel;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.sectionheader.HomeSectionHeaderItemState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lp31/l;

    invoke-virtual {v1}, Lp31/l;->a()Lp31/p;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->getPaymentMethodTile()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.whoop.design.atomic.organism.menuitem.MenuItemState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v1

    check-cast v4, Ly71/o;

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->getTruemedPaymentMenuItem()Lcom/whoop/design/models/items/MenuItemModel;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->getTruemedPaymentMenuItem()Lcom/whoop/design/models/items/MenuItemModel;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    instance-of v1, v0, Ly71/o;

    if-eqz v1, :cond_0

    move-object v2, v0

    check-cast v2, Ly71/o;

    :cond_0
    move-object v5, v2

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;->getAcceptedPaymentMethods()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    new-instance v7, Lkd1/o$c;

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v2, Lio2/b0;

    const-string v7, ""

    const-string v8, ""

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v9}, Lio2/b0;-><init>(Lp31/p;Ly71/o;Ly71/o;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object v2
.end method

.method private static final D(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;)Lio2/h;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lmn2/a;->t(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;)Lio2/h;

    move-result-object p0

    return-object p0
.end method

.method private static final E(Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReceiptHeaderModel;)Lhp2/c;
    .locals 8

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhp2/c;

    new-instance v1, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReceiptHeaderModel;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReceiptHeaderModel;->getImageSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReceiptHeaderModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReceiptHeaderModel;->getSubtitle()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lhp2/c;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method private static final F(Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTileModel;)Lhp2/g;
    .locals 30

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhp2/g;

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTileModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTileModel;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v4, Ly71/o;->p:Ly71/o$c;

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTileModel;->getTile()Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTile;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTile;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTileModel;->getTile()Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTile;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTile;->getSupportText()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v12, Ly71/g;

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTileModel;->getTile()Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTile;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTile;->getIcon()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lgz0/m0;->COPY:Lgz0/m0;

    invoke-static {v6, v7}, Lgz0/n0;->e(Ljava/lang/String;Lgz0/m0;)I

    move-result v6

    const/4 v7, 0x0

    const/4 v9, 0x2

    invoke-direct {v12, v6, v7, v9, v7}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v28, 0x7fff76

    const/16 v29, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

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

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v4 .. v29}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTileModel;->getTile()Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTile;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTile;->getTextToCopy()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v3, v4, v1}, Lhp2/g;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/o;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final G(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;)Lio2/o0;
    .locals 9

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->getPlaceholder()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->getExpandedTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :cond_0
    move-object v3, v0

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->getCta()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;->getTextDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->getPromoCodeApplied()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lio2/n0$c;->a:Lio2/n0$c;

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->getPromoCodeTags()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel;

    invoke-static {v0}, Lmn2/a;->w(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel;)Lio2/p0;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    new-instance v1, Lio2/o0;

    const/4 v7, 0x0

    const-string v8, ""

    invoke-direct/range {v1 .. v8}, Lio2/o0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lio2/n0;Ljava/util/List;ZLjava/lang/String;)V

    return-object v1
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmn2/a;->y(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;)Lio2/b0;
    .locals 0

    invoke-static {p0}, Lmn2/a;->C(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;)Lio2/b0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;)Lio2/k;
    .locals 0

    invoke-static {p0}, Lmn2/a;->A(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;)Lio2/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsModel;)Lio2/u;
    .locals 0

    invoke-static {p0}, Lmn2/a;->z(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsModel;)Lio2/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;)Lio2/d0;
    .locals 0

    invoke-static {p0}, Lmn2/a;->B(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;)Lio2/d0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;)Lio2/h;
    .locals 0

    invoke-static {p0}, Lmn2/a;->D(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;)Lio2/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;)Lio2/o0;
    .locals 0

    invoke-static {p0}, Lmn2/a;->G(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;)Lio2/o0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmn2/a;->q(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmn2/a;->x(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;)Ly71/o;
    .locals 0

    invoke-static {p0}, Lmn2/a;->r(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;)Ly71/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReceiptHeaderModel;)Lhp2/c;
    .locals 0

    invoke-static {p0}, Lmn2/a;->E(Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReceiptHeaderModel;)Lhp2/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;)Ly71/o;
    .locals 0

    invoke-static {p0}, Lmn2/a;->s(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;)Ly71/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTileModel;)Lhp2/g;
    .locals 0

    invoke-static {p0}, Lmn2/a;->F(Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTileModel;)Lhp2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmn2/a;->p(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final o()Ljb1/a;
    .locals 1

    sget-object v0, Lmn2/a;->b:Ljb1/a;

    return-object v0
.end method

.method private static final p(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmm1/h;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lmm1/h;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmm1/h;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lmm1/h;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lmn2/a$c;

    invoke-direct {v3, v0}, Lmn2/a$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lmm1/h;

    const/16 v2, 0xa

    invoke-direct {v0, v2}, Lmm1/h;-><init>(I)V

    const-class v2, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lmn2/a$d;

    invoke-direct {v2, v0}, Lmn2/a$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;)Ly71/o;
    .locals 28

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->getPaymentMethodImageUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ly71/o;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v4, Ly71/l$c;

    new-instance v5, Lkd1/o$c;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->getPaymentMethodImageUrl()Ljava/lang/String;

    move-result-object v6

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Li2/x;->o:I

    sget-wide v6, Li2/x;->n:J

    invoke-static {v6, v7}, Ly81/g;->b(J)Ly81/e;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->getSuffixTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v17, 0xef3

    const/16 v18, 0x0

    move-object v7, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v4 .. v18}, Ly71/l$c;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;Lkd1/o;Ly81/e;Lkd1/o;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v17, 0x7fdd

    const/4 v2, 0x0

    move-object v7, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v1 .. v18}, Ly71/o;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLy71/l;ZLy81/e;Lf0/t;Lcom/whoop/navigation/e;ZLy71/q;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    :goto_0
    sget-object v2, Ly71/o;->p:Ly71/o$c;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->getLeftIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    new-instance v4, Ly71/g;

    sget-object v5, Lgz0/m0;->CREDIT_CARD:Lgz0/m0;

    invoke-static {v0, v5}, Lgz0/n0;->e(Ljava/lang/String;Lgz0/m0;)I

    move-result v0

    const/4 v5, 0x2

    invoke-direct {v4, v0, v1, v5, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v4

    goto :goto_1

    :cond_2
    move-object v8, v1

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->getSuffixTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->getSuffixTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_2
    move/from16 v20, v0

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v0, 0x1

    goto :goto_2

    :goto_4
    const v26, 0x7df7de

    const/16 v27, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v2 .. v27}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v0

    return-object v0
.end method

.method private static final s(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;)Ly71/o;
    .locals 20

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;->getPreviewTileContent()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileContent;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileContent;->getPreviewText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v8, Ly71/g;

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileContent;->getStartIcon()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v2}, Lgz0/n0;->f(Ljava/lang/String;Lgz0/m0;ILjava/lang/Object;)I

    move-result v1

    const/4 v5, 0x2

    invoke-direct {v8, v1, v2, v5, v2}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, Lmn2/a$a;->w:Lmn2/a$a;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v9

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileContent;->getEndIcon()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Ly71/g;

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileContent;->getEndIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2, v3, v2}, Lgz0/n0;->f(Ljava/lang/String;Lgz0/m0;ILjava/lang/Object;)I

    move-result v0

    invoke-direct {v1, v0, v2, v5, v2}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v1

    goto :goto_0

    :cond_0
    move-object v10, v2

    :goto_0
    sget-object v0, Lmn2/a$b;->w:Lmn2/a$b;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v11

    new-instance v5, Ly71/l$b;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0xfc3

    const/16 v19, 0x0

    invoke-direct/range {v5 .. v19}, Ly71/l$b;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Ly71/o;

    const/4 v3, 0x0

    move-object v8, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x7fdd

    invoke-direct/range {v2 .. v19}, Ly71/o;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLy71/l;ZLy81/e;Lf0/t;Lcom/whoop/navigation/e;ZLy71/q;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public static final t(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;)Lio2/h;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio2/h;

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;->getDisclaimer()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;->getCtaText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;->getCheckoutPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;->getCartId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;->isEnabled()Z

    move-result v6

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;->getSkipStripeCheckout()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    :goto_0
    move v7, p0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    :goto_1
    invoke-direct/range {v1 .. v7}, Lio2/h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-object v1
.end method

.method public static final u(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;)Lio2/k;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;->getDetails()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutDetailModel;

    new-instance v4, Lio2/a;

    invoke-virtual {v2}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutDetailModel;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v2}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutDetailModel;->getValue()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutDetailModel;->getStyle()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v2, "toUpperCase(...)"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    const-string v2, "REGULAR"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Lio2/b;->REGULAR:Lio2/b;

    goto :goto_1

    :cond_1
    const-string v2, "HIGHLIGHT_GREEN"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Lio2/b;->HIGHLIGHT_GREEN:Lio2/b;

    goto :goto_1

    :cond_2
    sget-object v2, Lio2/b;->REGULAR:Lio2/b;

    :goto_1
    invoke-direct {v4, v5, v6, v2}, Lio2/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lio2/b;)V

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;->getTotal()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutTotalModel;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v3, Lio2/m;

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutTotalModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutTotalModel;->getValue()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v3, v0, p0}, Lio2/m;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    :cond_4
    new-instance p0, Lio2/k;

    invoke-direct {p0, v1, v3}, Lio2/k;-><init>(Ljava/util/List;Lio2/m;)V

    return-object p0
.end method

.method public static final v(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;)Lio2/d0;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio2/d0;

    sget-object v0, Lmn2/a;->a:Ljb1/a;

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;->getHeader()Lcom/whoop/design/models/items/HeaderModel;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    instance-of v3, v2, Lp31/l;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast v2, Lp31/l;

    goto :goto_0

    :cond_0
    move-object v2, v4

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lp31/l;->a()Lp31/p;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v4

    :goto_1
    invoke-virtual {v0, p0}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    instance-of v3, v0, Ly71/o;

    if-eqz v3, :cond_2

    move-object v4, v0

    check-cast v4, Ly71/o;

    :cond_2
    move-object v3, v4

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;->getPreviewTileContent()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileContent;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileContent;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lio2/d0;-><init>(Lp31/p;Ly71/o;Lcom/whoop/navigation/e;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final w(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel;)Lio2/p0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio2/p0;

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel;->getIcon()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-direct {v0, v1, v2, p0}, Lio2/p0;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lgz0/m0;)V

    return-object v0
.end method

.method private static final x(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmm1/h;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lmm1/h;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmm1/h;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lmm1/h;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lmn2/a$e;

    invoke-direct {v3, v0}, Lmn2/a$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lmm1/h;

    const/16 v2, 0xf

    invoke-direct {v0, v2}, Lmm1/h;-><init>(I)V

    const-class v2, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lmn2/a$f;

    invoke-direct {v3, v0}, Lmn2/a$f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lmm1/h;

    const/16 v2, 0x10

    invoke-direct {v0, v2}, Lmm1/h;-><init>(I)V

    const-class v2, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lmn2/a$g;

    invoke-direct {v3, v0}, Lmn2/a$g;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lmm1/h;

    const/16 v2, 0x11

    invoke-direct {v0, v2}, Lmm1/h;-><init>(I)V

    const-class v2, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lmn2/a$h;

    invoke-direct {v3, v0}, Lmn2/a$h;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lmm1/h;

    const/16 v2, 0x12

    invoke-direct {v0, v2}, Lmm1/h;-><init>(I)V

    const-class v2, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lmn2/a$i;

    invoke-direct {v3, v0}, Lmn2/a$i;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lmm1/h;

    const/16 v2, 0x13

    invoke-direct {v0, v2}, Lmm1/h;-><init>(I)V

    const-class v2, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReceiptHeaderModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lmn2/a$j;

    invoke-direct {v3, v0}, Lmn2/a$j;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lmm1/h;

    const/4 v2, 0x7

    invoke-direct {v0, v2}, Lmm1/h;-><init>(I)V

    const-class v2, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTileModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lmn2/a$k;

    invoke-direct {v3, v0}, Lmn2/a$k;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lmm1/h;

    const/16 v2, 0x8

    invoke-direct {v0, v2}, Lmm1/h;-><init>(I)V

    const-class v2, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lmn2/a$l;

    invoke-direct {v2, v0}, Lmn2/a$l;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsModel;)Lio2/u;
    .locals 21

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsModel;->getCollapsedTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/whoop/design/util/b;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsModel;->getItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderItemDetailsModel;

    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderItemDetailsModel;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderItemDetailsModel;->getSubtitle()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    new-instance v12, Lkd1/o$c;

    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderItemDetailsModel;->getImage()Ljava/lang/String;

    move-result-object v13

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderItemDetailsModel;->getStackedImages()Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_1

    check-cast v8, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v8, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v9, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v15, v13

    check-cast v15, Ljava/lang/String;

    new-instance v14, Lkd1/o$c;

    const/16 v19, 0xe

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v14 .. v20}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v9, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    move-object v13, v9

    goto :goto_2

    :cond_1
    const/4 v13, 0x0

    :goto_2
    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderItemDetailsModel;->getPrice()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderItemDetailsModel;->getStrikethroughPrice()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderItemDetailsModel;->getStrikethroughPrice()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_2

    move-object v15, v8

    goto :goto_3

    :cond_2
    const/4 v15, 0x0

    :goto_3
    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderItemDetailsModel;->getQuantity()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderItemDetailsModel;->getStyle()Ljava/lang/String;

    move-result-object v6

    sget-object v8, Lio2/v;->TRANSPARENT:Lio2/v;

    invoke-static {}, Lio2/v;->values()[Lio2/v;

    move-result-object v9

    array-length v5, v9

    const/16 v17, 0x0

    move/from16 v7, v17

    :goto_4
    if-ge v7, v5, :cond_4

    aget-object v17, v9, v7

    move-object/from16 v20, v0

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move-object/from16 v7, v17

    goto :goto_5

    :cond_3
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, v20

    goto :goto_4

    :cond_4
    move-object/from16 v20, v0

    const/4 v7, 0x0

    :goto_5
    if-nez v7, :cond_5

    move-object/from16 v17, v8

    goto :goto_6

    :cond_5
    move-object/from16 v17, v7

    :goto_6
    new-instance v9, Lio2/w;

    invoke-direct/range {v9 .. v17}, Lio2/w;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lio2/v;)V

    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v20

    const/16 v5, 0xa

    goto/16 :goto_0

    :cond_6
    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsModel;->getCheckoutInfo()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {v0}, Lmn2/a;->u(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;)Lio2/k;

    move-result-object v0

    move-object v5, v0

    goto :goto_7

    :cond_7
    const/4 v5, 0x0

    :goto_7
    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsModel;->getSummary()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsSummaryModel;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v1, Lio2/t;

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsSummaryModel;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsSummaryModel;->getBody()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_8

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    goto :goto_8

    :cond_8
    const/4 v7, 0x0

    :goto_8
    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsSummaryModel;->getCta()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsSummaryCtaModel;

    move-result-object v8

    if-eqz v8, :cond_9

    invoke-virtual {v8}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsSummaryCtaModel;->getTextDisplay()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_9

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    goto :goto_9

    :cond_9
    const/4 v8, 0x0

    :goto_9
    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsSummaryModel;->getCta()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsSummaryCtaModel;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsSummaryCtaModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    goto :goto_a

    :cond_a
    const/4 v0, 0x0

    :goto_a
    invoke-direct {v1, v6, v7, v8, v0}, Lio2/t;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;)V

    move-object v6, v1

    goto :goto_b

    :cond_b
    const/4 v6, 0x0

    :goto_b
    new-instance v1, Lio2/u;

    const/4 v7, 0x1

    invoke-direct/range {v1 .. v7}, Lio2/u;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lio2/k;Lio2/t;Z)V

    return-object v1
.end method
