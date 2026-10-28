.class final Lf70/u$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf70/u;->d(Lf70/s;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lcom/whoop/navigation/e;",
        "<anonymous>",
        "()Lcom/whoop/navigation/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activation.domain.interactors.activation.AppDestinationRouter$resolve$response$1"
    f = "AppDestinationRouter.kt"
    l = {
        0x43
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lf70/u;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lf70/u;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/u;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lf70/u$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf70/u$c;->x:Lf70/u;

    iput-object p2, p0, Lf70/u$c;->y:Ljava/lang/String;

    iput-object p3, p0, Lf70/u$c;->z:Ljava/lang/String;

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

    new-instance v0, Lf70/u$c;

    iget-object v1, p0, Lf70/u$c;->x:Lf70/u;

    iget-object v2, p0, Lf70/u$c;->y:Ljava/lang/String;

    iget-object v3, p0, Lf70/u$c;->z:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p1}, Lf70/u$c;-><init>(Lf70/u;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lf70/u$c;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lcom/whoop/navigation/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lf70/u$c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf70/u$c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lf70/u$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lf70/u$c;->w:I

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

    iget-object p1, p0, Lf70/u$c;->x:Lf70/u;

    invoke-static {p1}, Lf70/u;->a(Lf70/u;)Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    move-result-object p1

    iget-object v1, p0, Lf70/u$c;->y:Ljava/lang/String;

    iget-object v3, p0, Lf70/u$c;->z:Ljava/lang/String;

    iput v2, p0, Lf70/u$c;->w:I

    invoke-interface {p1, v1, v3, p0}, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;->fetchAppDestination(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
