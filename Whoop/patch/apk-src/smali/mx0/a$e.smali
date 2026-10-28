.class final Lmx0/a$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmx0/a;-><init>(Llx0/d;Lkx0/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V
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
        "Lkx0/e;",
        "result",
        "Ll83/a0;",
        "<anonymous>",
        "(Lkx0/e;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.dataSyncService.workmanager.DataFlowController$strapSyncDomainState$3"
    f = "DataFlowController.kt"
    l = {
        0x35,
        0x40,
        0x43
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lmx0/a;

.field final synthetic z:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lmx0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmx0/a;",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;",
            "Lq83/d<",
            "-",
            "Lmx0/a$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmx0/a$e;->y:Lmx0/a;

    iput-object p2, p0, Lmx0/a$e;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

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

    new-instance v0, Lmx0/a$e;

    iget-object v1, p0, Lmx0/a$e;->y:Lmx0/a;

    iget-object v2, p0, Lmx0/a$e;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {v0, v1, v2, p2}, Lmx0/a$e;-><init>(Lmx0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/d;)V

    iput-object p1, v0, Lmx0/a$e;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lkx0/e;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkx0/e;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lmx0/a$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmx0/a$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmx0/a$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkx0/e;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmx0/a$e;->f(Lkx0/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lmx0/a$e;->x:Ljava/lang/Object;

    check-cast v0, Lkx0/e;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lmx0/a$e;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_0

    const/4 v0, 0x2

    if-eq v2, v0, :cond_0

    const/4 v0, 0x3

    if-ne v2, v0, :cond_1

    :cond_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lkx0/e$a;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lmx0/a$e;->y:Lmx0/a;

    invoke-static {p1}, Lmx0/a;->b(Lmx0/a;)Lec3/o1;

    move-result-object p1

    new-instance v2, Llx0/c$b;

    check-cast v0, Lkx0/e$a;

    invoke-virtual {v0}, Lkx0/e$a;->a()Ldt0/c;

    move-result-object v0

    invoke-direct {v2, v0}, Llx0/c$b;-><init>(Ldt0/c;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lmx0/a$e;->x:Ljava/lang/Object;

    iput v3, p0, Lmx0/a$e;->w:I

    invoke-interface {p1, v2, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_3
    instance-of p1, v0, Lkx0/e$b;

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Lmx0/a$e;->y:Lmx0/a;

    invoke-static {p1}, Lmx0/a;->a(Lmx0/a;)Ltr2/n;

    move-result-object p1

    const-string v1, "StrapSyncResult erred"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lmx0/a$e;->y:Lmx0/a;

    invoke-static {p1}, Lmx0/a;->a(Lmx0/a;)Ltr2/n;

    move-result-object p1

    const-string v1, "No known result for StrapSyncResult"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_5
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
