.class final Lcom/whoop/archv2/feature/domain/g$h0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/archv2/feature/domain/g;->D(Lcom/whoop/navigation/models/ApiRequest;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lcom/whoop/archv2/feature/domain/i;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.archv2.feature.domain.GenericInteractor$loadMoreData$1"
    f = "GenericInteractor.kt"
    l = {
        0x113,
        0x114,
        0x116,
        0x11d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/navigation/models/ApiRequest;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/archv2/feature/domain/g;


# direct methods
.method public constructor <init>(Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/navigation/models/ApiRequest;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/feature/domain/g;",
            "Lcom/whoop/navigation/models/ApiRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/archv2/feature/domain/g$h0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/g$h0;->z:Lcom/whoop/archv2/feature/domain/g;

    iput-object p2, p0, Lcom/whoop/archv2/feature/domain/g$h0;->E:Lcom/whoop/navigation/models/ApiRequest;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/archv2/feature/domain/g$h0;

    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/g$h0;->z:Lcom/whoop/archv2/feature/domain/g;

    iget-object v2, p0, Lcom/whoop/archv2/feature/domain/g$h0;->E:Lcom/whoop/navigation/models/ApiRequest;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/archv2/feature/domain/g$h0;-><init>(Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/navigation/models/ApiRequest;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/archv2/feature/domain/g$h0;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/archv2/feature/domain/g$h0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/archv2/feature/domain/g$h0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/archv2/feature/domain/g$h0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/archv2/feature/domain/g$h0;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/g$h0;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/archv2/feature/domain/g$h0;->x:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/g$h0;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lcom/whoop/archv2/feature/domain/i$f;->a:Lcom/whoop/archv2/feature/domain/i$f;

    iput-object v0, p0, Lcom/whoop/archv2/feature/domain/g$h0;->y:Ljava/lang/Object;

    iput v6, p0, Lcom/whoop/archv2/feature/domain/g$h0;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_4

    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/whoop/archv2/feature/domain/g$h0;->z:Lcom/whoop/archv2/feature/domain/g;

    invoke-static {p1}, Lcom/whoop/archv2/feature/domain/g;->d(Lcom/whoop/archv2/feature/domain/g;)Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor;

    move-result-object p1

    iget-object v2, p0, Lcom/whoop/archv2/feature/domain/g$h0;->E:Lcom/whoop/navigation/models/ApiRequest;

    iput-object v0, p0, Lcom/whoop/archv2/feature/domain/g$h0;->y:Ljava/lang/Object;

    iput v5, p0, Lcom/whoop/archv2/feature/domain/g$h0;->x:I

    invoke-virtual {p1, v2, p0}, Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor;->c(Lcom/whoop/navigation/models/ApiRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v2, p1, Lu02/a$c;

    const/4 v5, 0x0

    if-eqz v2, :cond_9

    new-instance v2, Lcom/whoop/archv2/feature/domain/i$a;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/archv2/model/template/PaginatedListResponse;

    invoke-virtual {v3}, Lcom/whoop/archv2/model/template/PaginatedListResponse;->getItems()Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_7

    sget-object v3, Lm83/y;->w:Lm83/y;

    :cond_7
    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/archv2/model/template/PaginatedListResponse;

    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/PaginatedListResponse;->getPagination()Lcom/whoop/archv2/model/template/NextPagePagination;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/NextPagePagination;->getNextPageRequest()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object p1

    goto :goto_3

    :cond_8
    move-object p1, v5

    :goto_3
    invoke-direct {v2, v3, p1}, Lcom/whoop/archv2/feature/domain/i$a;-><init>(Ljava/util/List;Lcom/whoop/navigation/models/ApiRequest;)V

    iput-object v5, p0, Lcom/whoop/archv2/feature/domain/g$h0;->y:Ljava/lang/Object;

    iput-object v5, p0, Lcom/whoop/archv2/feature/domain/g$h0;->w:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/archv2/feature/domain/g$h0;->x:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_4

    :cond_9
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_b

    sget-object p1, Lcom/whoop/archv2/feature/domain/i$e;->a:Lcom/whoop/archv2/feature/domain/i$e;

    iput-object v5, p0, Lcom/whoop/archv2/feature/domain/g$h0;->y:Ljava/lang/Object;

    iput-object v5, p0, Lcom/whoop/archv2/feature/domain/g$h0;->w:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/archv2/feature/domain/g$h0;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_4
    return-object v1

    :cond_a
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
