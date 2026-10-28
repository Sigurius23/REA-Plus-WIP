.class final Lvl1/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvl1/b;->interact(Lec3/l;)Lec3/l;
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
        "Lvl1/a;",
        "previousDomainState",
        "Lvl1/c;",
        "action",
        "<anonymous>",
        "(Lvl1/a;Lvl1/c;)Lvl1/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.hiderecovery.HideRecoveryInteractor$interact$2"
    f = "HideRecoveryInteractor.kt"
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
            "Lvl1/b$c;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lvl1/a;Lvl1/c;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvl1/a;",
            "Lvl1/c;",
            "Lq83/d<",
            "-",
            "Lvl1/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lvl1/b$c;

    invoke-direct {v0, p3}, Lvl1/b$c;-><init>(Lq83/d;)V

    iput-object p1, v0, Lvl1/b$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lvl1/b$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lvl1/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvl1/a;

    check-cast p2, Lvl1/c;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lvl1/b$c;->f(Lvl1/a;Lvl1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lvl1/b$c;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lvl1/a;

    iget-object v0, p0, Lvl1/b$c;->y:Ljava/lang/Object;

    check-cast v0, Lvl1/c;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lvl1/b$c;->w:I

    if-nez v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lvl1/c$c;->a:Lvl1/c$c;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lvl1/a;->b(Lvl1/a;ZZZILjava/lang/Object;)Lvl1/a;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lvl1/c$a;->a:Lvl1/c$a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lvl1/a;->b(Lvl1/a;ZZZILjava/lang/Object;)Lvl1/a;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v0, Lvl1/c$b;

    if-eqz p1, :cond_2

    new-instance v1, Lvl1/a;

    check-cast v0, Lvl1/c$b;

    invoke-virtual {v0}, Lvl1/c$b;->a()Z

    move-result v4

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lvl1/a;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
