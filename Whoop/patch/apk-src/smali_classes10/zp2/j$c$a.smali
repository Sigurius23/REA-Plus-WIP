.class final Lzp2/j$c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzp2/j$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lpg3/v0;",
        "Ll83/a0;",
        "<anonymous>",
        "()Lpg3/v0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.user.journey.domain.UserJourneyProgressInteractor$sendUserJourneySeen$1$1"
    f = "UserJourneyProgressInteractor.kt"
    l = {
        0x4f,
        0x51
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:I

.field final synthetic y:Lzp2/j;


# direct methods
.method public constructor <init>(ILzp2/j;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lzp2/j;",
            "Lq83/d<",
            "-",
            "Lzp2/j$c$a;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lzp2/j$c$a;->x:I

    iput-object p2, p0, Lzp2/j$c$a;->y:Lzp2/j;

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

    new-instance v0, Lzp2/j$c$a;

    iget v1, p0, Lzp2/j$c$a;->x:I

    iget-object v2, p0, Lzp2/j$c$a;->y:Lzp2/j;

    invoke-direct {v0, v1, v2, p1}, Lzp2/j$c$a;-><init>(ILzp2/j;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lzp2/j$c$a;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lzp2/j$c$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lzp2/j$c$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lzp2/j$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lzp2/j$c$a;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

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

    iget p1, p0, Lzp2/j$c$a;->x:I

    const/4 v1, -0x1

    if-ne p1, v1, :cond_4

    iget-object p1, p0, Lzp2/j$c$a;->y:Lzp2/j;

    invoke-static {p1}, Lzp2/j;->b(Lzp2/j;)Lcom/whoop/user/journey/sources/data/UserJourneyApi;

    move-result-object p1

    iput v3, p0, Lzp2/j$c$a;->w:I

    invoke-interface {p1, p0}, Lcom/whoop/user/journey/sources/data/UserJourneyApi;->sendWirSeen(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lpg3/v0;

    return-object p1

    :cond_4
    iget-object p1, p0, Lzp2/j$c$a;->y:Lzp2/j;

    invoke-static {p1}, Lzp2/j;->b(Lzp2/j;)Lcom/whoop/user/journey/sources/data/UserJourneyApi;

    move-result-object p1

    iget v1, p0, Lzp2/j$c$a;->x:I

    iput v2, p0, Lzp2/j$c$a;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/user/journey/sources/data/UserJourneyApi;->sendYirSeen(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Lpg3/v0;

    return-object p1
.end method
