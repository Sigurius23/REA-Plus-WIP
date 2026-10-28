.class final Lcom/whoop/universalcheckout/features/cart/domain/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/universalcheckout/features/cart/domain/d;->j(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.universalcheckout.features.cart.domain.CartInteractor$addWyw$2"
    f = "CartInteractor.kt"
    l = {
        0xa9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:I

.field final synthetic x:Lcom/whoop/universalcheckout/features/cart/domain/d;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;


# direct methods
.method public constructor <init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Ljava/lang/String;Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/universalcheckout/features/cart/domain/d;",
            "Ljava/lang/String;",
            "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/cart/domain/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->x:Lcom/whoop/universalcheckout/features/cart/domain/d;

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->y:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->z:Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;

    iput-object p4, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->E:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->x:Lcom/whoop/universalcheckout/features/cart/domain/d;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->y:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->z:Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;

    iget-object v4, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->E:Ljava/lang/String;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/whoop/universalcheckout/features/cart/domain/d$c;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/d;Ljava/lang/String;Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;Ljava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/universalcheckout/features/cart/domain/d$c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->x:Lcom/whoop/universalcheckout/features/cart/domain/d;

    invoke-static {p1}, Lcom/whoop/universalcheckout/features/cart/domain/d;->c(Lcom/whoop/universalcheckout/features/cart/domain/d;)Lcom/whoop/universalcheckout/features/cart/domain/CartApi;

    move-result-object p1

    new-instance v3, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;

    iget-object v4, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->y:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->z:Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;->getWywSku()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->z:Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;->getBandSku()Ljava/lang/String;

    move-result-object v6

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->z:Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;->getClaspSku()Ljava/lang/String;

    move-result-object v7

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->z:Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;->getHookSku()Ljava/lang/String;

    move-result-object v8

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->z:Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;->getFastLinkSku()Ljava/lang/String;

    move-result-object v9

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->E:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string v1, "SHOP"

    :cond_2
    move-object v10, v1

    invoke-direct/range {v3 .. v10}, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/d$c;->w:I

    invoke-interface {p1, v3, p0}, Lcom/whoop/universalcheckout/features/cart/domain/CartApi;->addWyw(Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    return-object p1
.end method
