.class final Liq1/d$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liq1/d;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Liq1/f;",
        "previousState",
        "Liq1/g;",
        "internalAction",
        "<anonymous>",
        "(Liq1/f;Liq1/g;)Liq1/f;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.impacts.details.domain.journaltrends.BehaviorDetailsImpactJournalTrendsInteractor$interact$3"
    f = "BehaviorDetailsImpactJournalTrendsInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Liq1/d$f;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Liq1/f;Liq1/g;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liq1/f;",
            "Liq1/g;",
            "Lq83/d<",
            "-",
            "Liq1/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Liq1/d$f;

    invoke-direct {v0, p3}, Liq1/d$f;-><init>(Lq83/d;)V

    iput-object p1, v0, Liq1/d$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Liq1/d$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Liq1/d$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Liq1/f;

    check-cast p2, Liq1/g;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Liq1/d$f;->f(Liq1/f;Liq1/g;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Liq1/d$f;->x:Ljava/lang/Object;

    check-cast v0, Liq1/f;

    iget-object v1, p0, Liq1/d$f;->y:Ljava/lang/Object;

    check-cast v1, Liq1/g;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Liq1/d$f;->w:I

    if-nez v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Liq1/g$b;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of p1, v1, Liq1/g$a;

    if-eqz p1, :cond_2

    check-cast v1, Liq1/g$a;

    invoke-virtual {v1}, Liq1/g$a;->a()Liq1/f;

    move-result-object p1

    invoke-virtual {p1}, Liq1/f;->c()Liq1/e;

    move-result-object v1

    instance-of v1, v1, Liq1/e$a;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Liq1/f;->d()Lcom/whoop/impacts/details/domain/requests/JournalTrendsMiniArchResponse;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Liq1/f;->d()Lcom/whoop/impacts/details/domain/requests/JournalTrendsMiniArchResponse;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, Liq1/f;->b(Liq1/f;Liq1/e;Lcom/whoop/impacts/details/domain/requests/JournalTrendsMiniArchResponse;ILjava/lang/Object;)Liq1/f;

    move-result-object p1

    :cond_1
    return-object p1

    :cond_2
    instance-of p1, v1, Liq1/g$c;

    if-eqz p1, :cond_3

    :goto_0
    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
