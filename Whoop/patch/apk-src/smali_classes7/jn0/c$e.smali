.class final Ljn0/c$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljn0/c;->j(Lec3/l;)Lec3/l;
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
        "Ljn0/b;",
        "prevDomainResult",
        "Ljn0/c$a;",
        "challengeAcc",
        "<anonymous>",
        "(Ljn0/b;Ljn0/c$a;)Ljn0/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.challengedetails.domain.ChallengeDetailsInteractor$interact$2"
    f = "ChallengeDetailsInteractor.kt"
    l = {
        0x27
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ljn0/c;


# direct methods
.method public constructor <init>(Ljn0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljn0/c;",
            "Lq83/d<",
            "-",
            "Ljn0/c$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljn0/c$e;->z:Ljn0/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ljn0/b;Ljn0/c$a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljn0/b;",
            "Ljn0/c$a;",
            "Lq83/d<",
            "-",
            "Ljn0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljn0/c$e;

    iget-object v1, p0, Ljn0/c$e;->z:Ljn0/c;

    invoke-direct {v0, v1, p3}, Ljn0/c$e;-><init>(Ljn0/c;Lq83/d;)V

    iput-object p1, v0, Ljn0/c$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Ljn0/c$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ljn0/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljn0/b;

    check-cast p2, Ljn0/c$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ljn0/c$e;->f(Ljn0/b;Ljn0/c$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Ljn0/c$e;->x:Ljava/lang/Object;

    check-cast v0, Ljn0/b;

    iget-object v1, p0, Ljn0/c$e;->y:Ljava/lang/Object;

    check-cast v1, Ljn0/c$a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Ljn0/c$e;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljn0/c$a;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ljn0/c$e;->z:Ljn0/c;

    invoke-static {p1, v0}, Ljn0/c;->f(Ljn0/c;Ljn0/b;)Ljn0/b;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object p1, p0, Ljn0/c$e;->z:Ljn0/c;

    const/4 v3, 0x0

    iput-object v3, p0, Ljn0/c$e;->x:Ljava/lang/Object;

    iput-object v3, p0, Ljn0/c$e;->y:Ljava/lang/Object;

    iput v4, p0, Ljn0/c$e;->w:I

    invoke-static {p1, v1, v0, p0}, Ljn0/c;->d(Ljn0/c;Ljn0/c$a;Ljn0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_0
    check-cast p1, Ljn0/b;

    return-object p1
.end method
