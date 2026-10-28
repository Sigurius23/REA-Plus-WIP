.class final Lfs0/b$a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfs0/b$a;->a(Lfs0/a$a;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lds0/e;",
        "result",
        "Ll83/a0;",
        "<anonymous>",
        "(Lds0/e;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.communityreactions.domain.send.ReactionsSendInteractor$SendQueue$accept$2"
    f = "ReactionsSendInteractor.kt"
    l = {
        0x61
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lfs0/b;

.field final synthetic z:Lfs0/b$a;


# direct methods
.method public constructor <init>(Lfs0/b;Lfs0/b$a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfs0/b;",
            "Lfs0/b$a;",
            "Lq83/d<",
            "-",
            "Lfs0/b$a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfs0/b$a$b;->y:Lfs0/b;

    iput-object p2, p0, Lfs0/b$a$b;->z:Lfs0/b$a;

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

    new-instance v0, Lfs0/b$a$b;

    iget-object v1, p0, Lfs0/b$a$b;->y:Lfs0/b;

    iget-object v2, p0, Lfs0/b$a$b;->z:Lfs0/b$a;

    invoke-direct {v0, v1, v2, p2}, Lfs0/b$a$b;-><init>(Lfs0/b;Lfs0/b$a;Lq83/d;)V

    iput-object p1, v0, Lfs0/b$a$b;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lds0/e;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lds0/e;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lfs0/b$a$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfs0/b$a$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfs0/b$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lds0/e;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfs0/b$a$b;->f(Lds0/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lfs0/b$a$b;->x:Ljava/lang/Object;

    check-cast v0, Lds0/e;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lfs0/b$a$b;->w:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lds0/e$g;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lfs0/b$a$b;->y:Lfs0/b;

    check-cast v0, Lds0/e$g;

    invoke-static {p1, v0}, Lfs0/b;->f(Lfs0/b;Lds0/e$g;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lfs0/b$a$b;->z:Lfs0/b$a;

    invoke-static {p1}, Lfs0/b$a;->e(Lfs0/b$a;)Lec3/o1;

    move-result-object p1

    const/4 v0, 0x0

    iput-object v0, p0, Lfs0/b$a$b;->x:Ljava/lang/Object;

    iput v4, p0, Lfs0/b$a$b;->w:I

    invoke-interface {p1, v3, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    return-object v3
.end method
