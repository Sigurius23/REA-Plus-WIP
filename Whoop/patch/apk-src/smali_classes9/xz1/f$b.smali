.class final Lxz1/f$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxz1/f;->g(Lxz1/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;"
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
    c = "com.whoop.nativestore.pdp.domain.PdpInteractor$fetchAndReduce$response$1"
    f = "PdpInteractor.kt"
    l = {
        0x3d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:I

.field final synthetic x:Lxz1/f;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lxz1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxz1/f;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lxz1/f$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxz1/f$b;->x:Lxz1/f;

    iput-object p2, p0, Lxz1/f$b;->y:Ljava/lang/String;

    iput-object p3, p0, Lxz1/f$b;->z:Ljava/lang/String;

    iput-object p4, p0, Lxz1/f$b;->E:Ljava/lang/String;

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

    new-instance v0, Lxz1/f$b;

    iget-object v1, p0, Lxz1/f$b;->x:Lxz1/f;

    iget-object v2, p0, Lxz1/f$b;->y:Ljava/lang/String;

    iget-object v3, p0, Lxz1/f$b;->z:Ljava/lang/String;

    iget-object v4, p0, Lxz1/f$b;->E:Ljava/lang/String;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lxz1/f$b;-><init>(Lxz1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lxz1/f$b;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lxz1/f$b;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lxz1/f$b;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lxz1/f$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lxz1/f$b;->w:I

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

    iget-object p1, p0, Lxz1/f$b;->x:Lxz1/f;

    invoke-static {p1}, Lxz1/f;->d(Lxz1/f;)Lcom/whoop/nativestore/pdp/domain/api/PdpApi;

    move-result-object p1

    iget-object v1, p0, Lxz1/f$b;->y:Ljava/lang/String;

    iget-object v3, p0, Lxz1/f$b;->z:Ljava/lang/String;

    iget-object v4, p0, Lxz1/f$b;->E:Ljava/lang/String;

    iput v2, p0, Lxz1/f$b;->w:I

    invoke-interface {p1, v1, v3, v4, p0}, Lcom/whoop/nativestore/pdp/domain/api/PdpApi;->getProductDescriptionPage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
