.class final Lfw1/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfw1/d;->m(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Lcom/whoop/payments/domain/models/Card;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "Lcom/whoop/membership/extensions/domain/models/ProgressContent;"
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
    c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$dynamicCheckout$response$1"
    f = "ExtensionsInteractor.kt"
    l = {
        0x17b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lfw1/d;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Lkotlinx/serialization/json/JsonObject;


# direct methods
.method public constructor <init>(Lfw1/d;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfw1/d;",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/json/JsonObject;",
            "Lq83/d<",
            "-",
            "Lfw1/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfw1/d$c;->x:Lfw1/d;

    iput-object p2, p0, Lfw1/d$c;->y:Ljava/lang/String;

    iput-object p3, p0, Lfw1/d$c;->z:Lkotlinx/serialization/json/JsonObject;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lfw1/d$c;

    iget-object v1, p0, Lfw1/d$c;->x:Lfw1/d;

    iget-object v2, p0, Lfw1/d$c;->y:Ljava/lang/String;

    iget-object v3, p0, Lfw1/d$c;->z:Lkotlinx/serialization/json/JsonObject;

    invoke-direct {v0, v1, v2, v3, p1}, Lfw1/d$c;-><init>(Lfw1/d;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lfw1/d$c;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lfw1/d$c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfw1/d$c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lfw1/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lfw1/d$c;->w:I

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

    iget-object p1, p0, Lfw1/d$c;->x:Lfw1/d;

    invoke-static {p1}, Lfw1/d;->j(Lfw1/d;)Lcom/whoop/membership/extensions/domain/MembershipExtensionApi;

    move-result-object p1

    iget-object v1, p0, Lfw1/d$c;->y:Ljava/lang/String;

    sget-object v3, Lad3/c;->d:Lad3/b;

    iget-object v4, p0, Lfw1/d$c;->z:Lkotlinx/serialization/json/JsonObject;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lkotlinx/serialization/json/JsonObject;->Companion:Lad3/y;

    invoke-virtual {v5}, Lad3/y;->serializer()Lwc3/c;

    move-result-object v5

    check-cast v5, Lwc3/b;

    invoke-virtual {v3, v5, v4}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonObject;

    iput v2, p0, Lfw1/d$c;->w:I

    invoke-interface {p1, v1, v3, p0}, Lcom/whoop/membership/extensions/domain/MembershipExtensionApi;->placeDynamicCheckoutOrder(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
