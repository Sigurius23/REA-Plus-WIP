.class final Ljn0/c$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


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
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Ljn0/c$a;",
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
    c = "com.whoop.challengedetails.domain.ChallengeDetailsInteractor$interact$1$1"
    f = "ChallengeDetailsInteractor.kt"
    l = {
        0x1b,
        0x1c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Ljn0/a;

.field final synthetic z:Ljn0/c;


# direct methods
.method public constructor <init>(Ljn0/a;Ljn0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljn0/a;",
            "Ljn0/c;",
            "Lq83/d<",
            "-",
            "Ljn0/c$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljn0/c$d;->y:Ljn0/a;

    iput-object p2, p0, Ljn0/c$d;->z:Ljn0/c;

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

    new-instance v0, Ljn0/c$d;

    iget-object v1, p0, Ljn0/c$d;->y:Ljn0/a;

    iget-object v2, p0, Ljn0/c$d;->z:Ljn0/c;

    invoke-direct {v0, v1, v2, p2}, Ljn0/c$d;-><init>(Ljn0/a;Ljn0/c;Lq83/d;)V

    iput-object p1, v0, Ljn0/c$d;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ljn0/c$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ljn0/c$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ljn0/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ljn0/c$d;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Ljn0/c$d;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ljn0/c$d;->w:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    if-ne v2, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ljn0/c$d;->y:Ljn0/a;

    instance-of v2, p1, Ljn0/a$b;

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    iget-object v2, p0, Ljn0/c$d;->z:Ljn0/c;

    check-cast p1, Ljn0/a$b;

    iput-object v5, p0, Ljn0/c$d;->x:Ljava/lang/Object;

    iput v3, p0, Ljn0/c$d;->w:I

    invoke-static {v2, v0, p1, p0}, Ljn0/c;->a(Ljn0/c;Lec3/m;Ljn0/a$b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_1

    :cond_3
    new-instance v2, Ljn0/c$a;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3, v4, v5}, Ljn0/c$a;-><init>(Ljn0/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v5, p0, Ljn0/c$d;->x:Ljava/lang/Object;

    iput v4, p0, Ljn0/c$d;->w:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
