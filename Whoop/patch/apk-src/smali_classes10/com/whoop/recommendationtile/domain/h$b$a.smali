.class final Lcom/whoop/recommendationtile/domain/h$b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/recommendationtile/domain/h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
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
    c = "com.whoop.recommendationtile.domain.RecommendationTileInteractor$commit$1$apiResult$1"
    f = "RecommendationTileInteractor.kt"
    l = {
        0x69,
        0x6a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lcom/whoop/recommendationtile/domain/h;

.field final synthetic z:Lcom/whoop/whoopaction/domain/models/UpdateAction;


# direct methods
.method public constructor <init>(Lcom/whoop/recommendationtile/domain/h;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/recommendationtile/domain/h;",
            "Lcom/whoop/whoopaction/domain/models/UpdateAction;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/recommendationtile/domain/h$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/recommendationtile/domain/h$b$a;->y:Lcom/whoop/recommendationtile/domain/h;

    iput-object p2, p0, Lcom/whoop/recommendationtile/domain/h$b$a;->z:Lcom/whoop/whoopaction/domain/models/UpdateAction;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lcom/whoop/recommendationtile/domain/h$b$a;

    iget-object v1, p0, Lcom/whoop/recommendationtile/domain/h$b$a;->y:Lcom/whoop/recommendationtile/domain/h;

    iget-object v2, p0, Lcom/whoop/recommendationtile/domain/h$b$a;->z:Lcom/whoop/whoopaction/domain/models/UpdateAction;

    invoke-direct {v0, v1, v2, p1}, Lcom/whoop/recommendationtile/domain/h$b$a;-><init>(Lcom/whoop/recommendationtile/domain/h;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lcom/whoop/recommendationtile/domain/h$b$a;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/recommendationtile/domain/h$b$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/recommendationtile/domain/h$b$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lcom/whoop/recommendationtile/domain/h$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/recommendationtile/domain/h$b$a;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/h$b$a;->w:Ljava/lang/Object;

    check-cast v0, Lf63/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/recommendationtile/domain/h$b$a;->y:Lcom/whoop/recommendationtile/domain/h;

    invoke-static {p1}, Lcom/whoop/recommendationtile/domain/h;->f(Lcom/whoop/recommendationtile/domain/h;)Lu02/c;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/recommendationtile/domain/h$b$a;->z:Lcom/whoop/whoopaction/domain/models/UpdateAction;

    invoke-virtual {v1}, Lcom/whoop/whoopaction/domain/models/UpdateAction;->getRequest()Lcom/whoop/whoopaction/domain/models/Request;

    move-result-object v1

    invoke-static {v1, v4, v3, v4}, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt;->toActionApiRequest$default(Lcom/whoop/whoopaction/domain/models/Request;Ljava/lang/String;ILjava/lang/Object;)Lz02/a;

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

    iput v3, p0, Lcom/whoop/recommendationtile/domain/h$b$a;->x:I

    invoke-virtual {p1, v1, v5, p0}, Lu02/c;->d(Lz02/a;Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lf63/c;

    iput-object v4, p0, Lcom/whoop/recommendationtile/domain/h$b$a;->w:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/recommendationtile/domain/h$b$a;->x:I

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-static {p1, v1, p0}, Lj93/l0;->k(Lf63/c;Ljava/nio/charset/Charset;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    return-object p1
.end method
