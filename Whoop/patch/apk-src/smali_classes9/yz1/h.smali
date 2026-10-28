.class public abstract Lyz1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayPriceBreakdownAccordionModel;",
        "Lh02/p0;",
        "e",
        "(Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayPriceBreakdownAccordionModel;)Lh02/p0;",
        "Lcom/whoop/nativestore/pdp/domain/model/PriceBreakdownItemModel;",
        "Lh02/k;",
        "f",
        "(Lcom/whoop/nativestore/pdp/domain/model/PriceBreakdownItemModel;)Lh02/k;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "d",
        "()Ljb1/a;",
        "whoopYourWayPriceBreakdownAccordionReducer",
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

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lyv0/h;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lyz1/h;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayPriceBreakdownAccordionModel;)Lh02/p0;
    .locals 0

    invoke-static {p0}, Lyz1/h;->i(Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayPriceBreakdownAccordionModel;)Lh02/p0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyz1/h;->h(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyz1/h;->g(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Ljb1/a;
    .locals 1

    sget-object v0, Lyz1/h;->a:Ljb1/a;

    return-object v0
.end method

.method public static final e(Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayPriceBreakdownAccordionModel;)Lh02/p0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayPriceBreakdownAccordionModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayPriceBreakdownAccordionModel;->getItems()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/nativestore/pdp/domain/model/PriceBreakdownItemModel;

    invoke-static {v2}, Lyz1/h;->f(Lcom/whoop/nativestore/pdp/domain/model/PriceBreakdownItemModel;)Lh02/k;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lh02/p0;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lh02/p0;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    return-object p0
.end method

.method private static final f(Lcom/whoop/nativestore/pdp/domain/model/PriceBreakdownItemModel;)Lh02/k;
    .locals 4

    new-instance v0, Lh02/k;

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/PriceBreakdownItemModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/PriceBreakdownItemModel;->getLabel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/PriceBreakdownItemModel;->getCost()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/nativestore/pdp/domain/model/PriceBreakdownItemModel;->isStatic()Z

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Lh02/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method private static final g(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyz1/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lyz1/g;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyz1/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lyz1/g;-><init>(I)V

    const-class v1, Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayPriceBreakdownAccordionModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lyz1/h$a;

    invoke-direct {v2, v0}, Lyz1/h$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayPriceBreakdownAccordionModel;)Lh02/p0;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyz1/h;->e(Lcom/whoop/nativestore/pdp/domain/model/WhoopYourWayPriceBreakdownAccordionModel;)Lh02/p0;

    move-result-object p0

    return-object p0
.end method
