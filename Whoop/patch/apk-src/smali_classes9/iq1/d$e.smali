.class final Liq1/d$e;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Ll83/k;",
        "Liq1/b;",
        "",
        "<destruct>",
        "action",
        "<anonymous>",
        "(Ll83/k;Liq1/b;)Ll83/k;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.impacts.details.domain.journaltrends.BehaviorDetailsImpactJournalTrendsInteractor$interact$1"
    f = "BehaviorDetailsImpactJournalTrendsInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Liq1/d;


# direct methods
.method public constructor <init>(Liq1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liq1/d;",
            "Lq83/d<",
            "-",
            "Liq1/d$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liq1/d$e;->z:Liq1/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ll83/k;Liq1/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/k;",
            "Liq1/b;",
            "Lq83/d<",
            "-",
            "Ll83/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Liq1/d$e;

    iget-object v1, p0, Liq1/d$e;->z:Liq1/d;

    invoke-direct {v0, v1, p3}, Liq1/d$e;-><init>(Liq1/d;Lq83/d;)V

    iput-object p1, v0, Liq1/d$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Liq1/d$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Liq1/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll83/k;

    check-cast p2, Liq1/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Liq1/d$e;->f(Ll83/k;Liq1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Liq1/d$e;->x:Ljava/lang/Object;

    check-cast v0, Ll83/k;

    iget-object v1, p0, Liq1/d$e;->y:Ljava/lang/Object;

    check-cast v1, Liq1/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Liq1/d$e;->w:I

    if-nez v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    instance-of v0, v1, Liq1/b$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, Liq1/d$e;->z:Liq1/d;

    move-object v0, v1

    check-cast v0, Liq1/b$a;

    invoke-virtual {v0}, Liq1/b$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Liq1/d;->c(Liq1/d;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    new-instance v0, Ll83/k;

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
