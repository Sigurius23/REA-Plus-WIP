.class final Lyg2/e$j;
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lrt0/a;",
        "Lrt0/b$a;",
        "realTimeStreamResult",
        "Ll83/a0;",
        "<anonymous>",
        "(Lrt0/a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.state.LiveHrStateCombiner$toggleHrFlow$1$1"
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
            "Lyg2/e$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyg2/e$j;->y:Lyg2/e;

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

    new-instance v0, Lyg2/e$j;

    iget-object v1, p0, Lyg2/e$j;->y:Lyg2/e;

    invoke-direct {v0, v1, p2}, Lyg2/e$j;-><init>(Lyg2/e;Lq83/d;)V

    iput-object p1, v0, Lyg2/e$j;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lrt0/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrt0/a<",
            "+",
            "Lrt0/b$a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lyg2/e$j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lyg2/e$j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lyg2/e$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lrt0/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lyg2/e$j;->f(Lrt0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lyg2/e$j;->x:Ljava/lang/Object;

    check-cast v0, Lrt0/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lyg2/e$j;->w:I

    if-nez v1, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lrt0/a$b;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lyg2/e$j;->y:Lyg2/e;

    invoke-static {p1}, Lyg2/e;->f(Lyg2/e;)V

    goto :goto_0

    :cond_0
    instance-of p1, v0, Lrt0/a$c;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lyg2/e$j;->y:Lyg2/e;

    invoke-static {p1}, Lyg2/e;->g(Lyg2/e;)V

    goto :goto_0

    :cond_1
    instance-of p1, v0, Lrt0/a$d;

    if-nez p1, :cond_3

    sget-object p1, Lrt0/a$a;->a:Lrt0/a$a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
