.class final Lfh0/a$c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfh0/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lf63/c;",
        "<anonymous>",
        "()Lf63/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.view.contextstatustoggle.ContextStatusToggleInteractor$interact$1$1$apiResult$1"
    f = "ContextStatusToggleInteractor.kt"
    l = {
        0x21
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lfh0/a;

.field final synthetic y:Lfh0/f;


# direct methods
.method public constructor <init>(Lfh0/a;Lfh0/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfh0/a;",
            "Lfh0/f;",
            "Lq83/d<",
            "-",
            "Lfh0/a$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfh0/a$c$a;->x:Lfh0/a;

    iput-object p2, p0, Lfh0/a$c$a;->y:Lfh0/f;

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

    new-instance v0, Lfh0/a$c$a;

    iget-object v1, p0, Lfh0/a$c$a;->x:Lfh0/a;

    iget-object v2, p0, Lfh0/a$c$a;->y:Lfh0/f;

    invoke-direct {v0, v1, v2, p1}, Lfh0/a$c$a;-><init>(Lfh0/a;Lfh0/f;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lfh0/a$c$a;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lf63/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lfh0/a$c$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfh0/a$c$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lfh0/a$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lfh0/a$c$a;->w:I

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

    iget-object p1, p0, Lfh0/a$c$a;->x:Lfh0/a;

    invoke-static {p1}, Lfh0/a;->c(Lfh0/a;)Lu02/c;

    move-result-object p1

    iget-object v1, p0, Lfh0/a$c$a;->y:Lfh0/f;

    check-cast v1, Lfh0/f$b;

    invoke-virtual {v1}, Lfh0/f$b;->a()Lcom/whoop/whoopaction/domain/models/UpdateAction;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/whoopaction/domain/models/UpdateAction;->getRequest()Lcom/whoop/whoopaction/domain/models/Request;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3}, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt;->toActionApiRequest$default(Lcom/whoop/whoopaction/domain/models/Request;Ljava/lang/String;ILjava/lang/Object;)Lz02/a;

    move-result-object v1

    const-class v3, Ljava/lang/String;

    invoke-static {v3}, Lkotlin/jvm/internal/h0;->b(Ljava/lang/Class;)Lj93/a0;

    move-result-object v4

    invoke-static {v4}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v5

    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v6, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v3, v4, v5}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v3

    iput v2, p0, Lfh0/a$c$a;->w:I

    invoke-virtual {p1, v1, v3, p0}, Lu02/c;->d(Lz02/a;Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
