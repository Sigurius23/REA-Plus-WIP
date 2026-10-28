.class public final Liq1/d$d;
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.impacts.details.domain.journaltrends.BehaviorDetailsImpactJournalTrendsInteractor$interact$$inlined$flatMapLatest$1"
    f = "BehaviorDetailsImpactJournalTrendsInteractor.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Liq1/d;


# direct methods
.method public constructor <init>(Lq83/d;Liq1/d;)V
    .locals 0

    iput-object p2, p0, Liq1/d$d;->z:Liq1/d;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ll83/k;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Liq1/d$d;

    iget-object v1, p0, Liq1/d$d;->z:Liq1/d;

    invoke-direct {v0, p3, v1}, Liq1/d$d;-><init>(Lq83/d;Liq1/d;)V

    iput-object p1, v0, Liq1/d$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Liq1/d$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Liq1/d$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Liq1/d$d;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Liq1/d$d;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Liq1/d$d;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Liq1/d$d;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Liq1/d$d;->y:Ljava/lang/Object;

    check-cast v1, Ll83/k;

    iget-object v3, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Liq1/b;

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-nez v3, :cond_2

    sget-object v1, Liq1/g$b;->a:Liq1/g$b;

    new-instance v3, La6/u;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_1

    :cond_2
    instance-of v4, v3, Liq1/b$a;

    if-nez v4, :cond_6

    instance-of v4, v3, Liq1/b$d;

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_3
    instance-of v4, v3, Liq1/b$c;

    const-string v5, "T"

    if-eqz v4, :cond_4

    check-cast v3, Liq1/b$c;

    invoke-virtual {v3}, Liq1/b$c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "?endDate="

    invoke-static {v1, v4, v3}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Liq1/d$d;->z:Liq1/d;

    invoke-static {v3, v1}, Liq1/d;->d(Liq1/d;Ljava/lang/String;)Lec3/l;

    move-result-object v3

    goto :goto_1

    :cond_4
    instance-of v4, v3, Liq1/b$b;

    if-eqz v4, :cond_5

    check-cast v3, Liq1/b$b;

    invoke-virtual {v3}, Liq1/b$b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "?startDate="

    invoke-static {v1, v4, v3}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Liq1/d$d;->z:Liq1/d;

    invoke-static {v3, v1}, Liq1/d;->d(Liq1/d;Ljava/lang/String;)Lec3/l;

    move-result-object v3

    goto :goto_1

    :cond_5
    new-instance v1, Liq1/g$c;

    invoke-direct {v1, v3}, Liq1/g$c;-><init>(Liq1/b;)V

    new-instance v3, La6/u;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_1

    :cond_6
    :goto_0
    iget-object v3, p0, Liq1/d$d;->z:Liq1/d;

    invoke-static {v1}, La12/b;->e(Ljava/lang/String;)La12/a;

    move-result-object v1

    invoke-static {v3, v1, v2}, Liq1/d;->e(Liq1/d;La12/a;Z)Lec3/l;

    move-result-object v1

    new-instance v3, Liq1/d$g;

    invoke-direct {v3, v1}, Liq1/d$g;-><init>(Lec3/l;)V

    :goto_1
    const/4 v1, 0x0

    iput-object v1, p0, Liq1/d$d;->x:Ljava/lang/Object;

    iput-object v1, p0, Liq1/d$d;->y:Ljava/lang/Object;

    iput v2, p0, Liq1/d$d;->w:I

    invoke-static {p1, v3, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
