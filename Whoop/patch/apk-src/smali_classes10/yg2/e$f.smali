.class final Lyg2/e$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyg2/e;-><init>(Lci2/b;Lwu0/b;Lgt0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Lrt0/c;Leq1/a;Lbc3/c0;Lfi0/a;Lus0/g;Ljt0/a;)V
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
        "Lyg2/d;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lyg2/d;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.state.LiveHrStateCombiner$liveHrCombinedFlow$3"
    f = "LiveHrStateCombiner.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lyg2/e;


# direct methods
.method public constructor <init>(Lyg2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyg2/e;",
            "Lq83/d<",
            "-",
            "Lyg2/e$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyg2/e$f;->y:Lyg2/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Lyg2/e$f;

    iget-object v1, p0, Lyg2/e$f;->y:Lyg2/e;

    invoke-direct {v0, v1, p2}, Lyg2/e$f;-><init>(Lyg2/e;Lq83/d;)V

    iput-object p1, v0, Lyg2/e$f;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lyg2/d;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyg2/d;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lyg2/e$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lyg2/e$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lyg2/e$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lyg2/d;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lyg2/e$f;->f(Lyg2/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lyg2/e$f;->x:Ljava/lang/Object;

    check-cast v0, Lyg2/d;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lyg2/e$f;->w:I

    if-nez v1, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lyg2/d$a;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lyg2/e$f;->y:Lyg2/e;

    invoke-static {p1}, Lyg2/e;->d(Lyg2/e;)Lus0/g;

    move-result-object p1

    check-cast v0, Lyg2/d$a;

    invoke-virtual {v0}, Lyg2/d$a;->a()I

    move-result v0

    iget-object v1, p0, Lyg2/e$f;->y:Lyg2/e;

    invoke-static {v1}, Lyg2/e;->b(Lyg2/e;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "unknown"

    :cond_0
    invoke-interface {p1, v0, v1}, Lus0/g;->a(ILjava/lang/String;)V

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
