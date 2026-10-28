.class final Ldd0/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldd0/c;->e(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;"
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
    c = "com.whoop.advancedlabs.multiconsentscreen.domain.MultiConsentInteractor$fetchData$response$1"
    f = "MultiConsentInteractor.kt"
    l = {
        0x35
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Ldd0/c;

.field final synthetic y:Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ldd0/c;Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldd0/c;",
            "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ldd0/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldd0/c$b;->x:Ldd0/c;

    iput-object p2, p0, Ldd0/c$b;->y:Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;

    iput-object p3, p0, Ldd0/c$b;->z:Ljava/lang/String;

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

    new-instance v0, Ldd0/c$b;

    iget-object v1, p0, Ldd0/c$b;->x:Ldd0/c;

    iget-object v2, p0, Ldd0/c$b;->y:Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;

    iget-object v3, p0, Ldd0/c$b;->z:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p1}, Ldd0/c$b;-><init>(Ldd0/c;Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;Ljava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Ldd0/c$b;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Ldd0/c$b;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldd0/c$b;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Ldd0/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ldd0/c$b;->w:I

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

    iget-object p1, p0, Ldd0/c$b;->x:Ldd0/c;

    invoke-static {p1}, Ldd0/c;->b(Ldd0/c;)Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

    move-result-object p1

    iget-object v1, p0, Ldd0/c$b;->y:Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;

    iget-object v3, p0, Ldd0/c$b;->z:Ljava/lang/String;

    iput v2, p0, Ldd0/c$b;->w:I

    invoke-interface {p1, v1, v3, p0}, Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;->getMultiConsent(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
