.class final Lyg2/e$n;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyg2/e;->s(ZLjava/lang/String;Lyg2/a;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.state.LiveHrStateCombiner$toggleHrStream$1"
    f = "LiveHrStateCombiner.kt"
    l = {
        0x9a,
        0x9f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Z

.field final synthetic y:Lyg2/e;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLyg2/e;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lyg2/e;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lyg2/e$n;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lyg2/e$n;->x:Z

    iput-object p2, p0, Lyg2/e$n;->y:Lyg2/e;

    iput-object p3, p0, Lyg2/e$n;->z:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lyg2/e$n;

    iget-boolean v0, p0, Lyg2/e$n;->x:Z

    iget-object v1, p0, Lyg2/e$n;->y:Lyg2/e;

    iget-object v2, p0, Lyg2/e$n;->z:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lyg2/e$n;-><init>(ZLyg2/e;Ljava/lang/String;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lyg2/e$n;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lyg2/e$n;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lyg2/e$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lyg2/e$n;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lyg2/e$n;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

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

    iget-boolean p1, p0, Lyg2/e$n;->x:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lyg2/e$n;->y:Lyg2/e;

    iget-object v1, p0, Lyg2/e$n;->z:Ljava/lang/String;

    invoke-static {p1, v1}, Lyg2/e;->h(Lyg2/e;Ljava/lang/String;)V

    iget-object p1, p0, Lyg2/e$n;->y:Lyg2/e;

    invoke-static {p1}, Lyg2/e;->i(Lyg2/e;)V

    iget-object p1, p0, Lyg2/e$n;->y:Lyg2/e;

    invoke-static {p1}, Lyg2/e;->c(Lyg2/e;)Lec3/o1;

    move-result-object p1

    sget-object v1, Lyg2/b$b;->a:Lyg2/b$b;

    iput v3, p0, Lyg2/e$n;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lyg2/e$n;->y:Lyg2/e;

    invoke-static {p1}, Lyg2/e;->b(Lyg2/e;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v1, p0, Lyg2/e$n;->y:Lyg2/e;

    invoke-static {v1}, Lyg2/e;->d(Lyg2/e;)Lus0/g;

    move-result-object v1

    invoke-interface {v1, p1}, Lus0/g;->b(Ljava/lang/String;)V

    :cond_4
    iget-object p1, p0, Lyg2/e$n;->y:Lyg2/e;

    invoke-static {p1}, Lyg2/e;->j(Lyg2/e;)V

    iget-object p1, p0, Lyg2/e$n;->y:Lyg2/e;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lyg2/e;->h(Lyg2/e;Ljava/lang/String;)V

    iget-object p1, p0, Lyg2/e$n;->y:Lyg2/e;

    invoke-static {p1}, Lyg2/e;->c(Lyg2/e;)Lec3/o1;

    move-result-object p1

    sget-object v1, Lyg2/b$a;->a:Lyg2/b$a;

    iput v2, p0, Lyg2/e$n;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
