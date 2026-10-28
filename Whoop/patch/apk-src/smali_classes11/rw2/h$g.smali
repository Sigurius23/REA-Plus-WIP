.class final Lrw2/h$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrw2/h;->m(Lcom/whoop/whoopaction/domain/models/UpdateAction;Lq83/d;)Ljava/lang/Object;
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
        "Lrw2/h$b;",
        "<anonymous>",
        "()Lrw2/h$b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whoopaction.domain.handlers.UpdateActionHandler$executeUpdateAction$apiCall$1"
    f = "UpdateActionHandler.kt"
    l = {
        0x4d,
        0x4e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/whoopaction/domain/models/UpdateAction;

.field final synthetic F:Lrw2/h;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Lcom/whoop/whoopaction/domain/models/Request;


# direct methods
.method public constructor <init>(Lcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lrw2/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/Request;",
            "Lcom/whoop/whoopaction/domain/models/UpdateAction;",
            "Lrw2/h;",
            "Lq83/d<",
            "-",
            "Lrw2/h$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrw2/h$g;->z:Lcom/whoop/whoopaction/domain/models/Request;

    iput-object p2, p0, Lrw2/h$g;->E:Lcom/whoop/whoopaction/domain/models/UpdateAction;

    iput-object p3, p0, Lrw2/h$g;->F:Lrw2/h;

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

    new-instance v0, Lrw2/h$g;

    iget-object v1, p0, Lrw2/h$g;->z:Lcom/whoop/whoopaction/domain/models/Request;

    iget-object v2, p0, Lrw2/h$g;->E:Lcom/whoop/whoopaction/domain/models/UpdateAction;

    iget-object v3, p0, Lrw2/h$g;->F:Lrw2/h;

    invoke-direct {v0, v1, v2, v3, p1}, Lrw2/h$g;-><init>(Lcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lrw2/h;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lrw2/h$g;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lrw2/h$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lrw2/h$g;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrw2/h$g;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lrw2/h$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lrw2/h$g;->y:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lrw2/h$g;->x:Ljava/lang/Object;

    check-cast v0, Lf63/c;

    iget-object v0, p0, Lrw2/h$g;->w:Ljava/lang/Object;

    check-cast v0, Lz02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lrw2/h$g;->w:Ljava/lang/Object;

    check-cast v1, Lz02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lrw2/h$g;->z:Lcom/whoop/whoopaction/domain/models/Request;

    iget-object v1, p0, Lrw2/h$g;->E:Lcom/whoop/whoopaction/domain/models/UpdateAction;

    invoke-virtual {v1}, Lcom/whoop/whoopaction/domain/models/UpdateAction;->getMetricEvent()Lcom/whoop/analytics/MetricEventModel;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/whoop/analytics/MetricEventModel;->getRequestName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_3
    move-object v1, v4

    :goto_0
    invoke-static {p1, v1}, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt;->toActionApiRequest(Lcom/whoop/whoopaction/domain/models/Request;Ljava/lang/String;)Lz02/a;

    move-result-object p1

    iget-object v1, p0, Lrw2/h$g;->F:Lrw2/h;

    invoke-static {v1}, Lrw2/h;->g(Lrw2/h;)Lu02/c;

    move-result-object v1

    const-class v5, Ljava/lang/String;

    invoke-static {v5}, Lkotlin/jvm/internal/h0;->b(Ljava/lang/Class;)Lj93/a0;

    move-result-object v6

    invoke-static {v6}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v7

    sget-object v8, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v8, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v5, v6, v7}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v5

    iput-object v4, p0, Lrw2/h$g;->w:Ljava/lang/Object;

    iput v3, p0, Lrw2/h$g;->y:I

    invoke-virtual {v1, p1, v5, p0}, Lu02/c;->d(Lz02/a;Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lf63/c;

    iget-object v1, p0, Lrw2/h$g;->F:Lrw2/h;

    iput-object v4, p0, Lrw2/h$g;->w:Ljava/lang/Object;

    iput-object v4, p0, Lrw2/h$g;->x:Ljava/lang/Object;

    iput v2, p0, Lrw2/h$g;->y:I

    invoke-static {v1, p1, p0}, Lrw2/h;->d(Lrw2/h;Lf63/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    :cond_5
    return-object p1
.end method
