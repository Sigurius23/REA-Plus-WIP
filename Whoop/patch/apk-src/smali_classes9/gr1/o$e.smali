.class final Lgr1/o$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgr1/o;->A(Lgr1/n;)V
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
    c = "com.whoop.integrations.presentation.IntegrationsViewModel$sendViewEvent$1"
    f = "IntegrationsViewModel.kt"
    l = {
        0x8a,
        0x8d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lgr1/n;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field final synthetic z:Lgr1/o;


# direct methods
.method public constructor <init>(Lgr1/o;Lgr1/n;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgr1/o;",
            "Lgr1/n;",
            "Lq83/d<",
            "-",
            "Lgr1/o$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgr1/o$e;->z:Lgr1/o;

    iput-object p2, p0, Lgr1/o$e;->E:Lgr1/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lgr1/o$e;

    iget-object v0, p0, Lgr1/o$e;->z:Lgr1/o;

    iget-object v1, p0, Lgr1/o$e;->E:Lgr1/n;

    invoke-direct {p1, v0, v1, p2}, Lgr1/o$e;-><init>(Lgr1/o;Lgr1/n;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lgr1/o$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lgr1/o$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lgr1/o$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lgr1/o$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lgr1/o$e;->y:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lgr1/o$e;->w:Ljava/lang/Object;

    check-cast v0, Lcr1/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lgr1/o$e;->z:Lgr1/o;

    iget-object v1, p0, Lgr1/o$e;->E:Lgr1/n;

    invoke-static {p1, v1}, Lgr1/o;->o(Lgr1/o;Lgr1/n;)V

    iget-object p1, p0, Lgr1/o$e;->E:Lgr1/n;

    instance-of v1, p1, Lgr1/n$l;

    if-eqz v1, :cond_4

    iget-object p1, p0, Lgr1/o$e;->z:Lgr1/o;

    invoke-static {p1}, Lgr1/o;->g(Lgr1/o;)Lec3/o1;

    move-result-object p1

    new-instance v1, Lqw2/f;

    iget-object v3, p0, Lgr1/o$e;->E:Lgr1/n;

    check-cast v3, Lgr1/n$l;

    invoke-virtual {v3}, Lgr1/n$l;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v3

    invoke-direct {v1, v3}, Lqw2/f;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    iput v4, p0, Lgr1/o$e;->y:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    return-object v2

    :cond_4
    iget-object v1, p0, Lgr1/o$e;->z:Lgr1/o;

    invoke-static {v1, p1}, Lgr1/o;->q(Lgr1/o;Lgr1/n;)Lcr1/a;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v1, p0, Lgr1/o$e;->z:Lgr1/o;

    invoke-static {v1}, Lgr1/o;->l(Lgr1/o;)Lec3/o1;

    move-result-object v1

    const/4 v4, 0x0

    iput-object v4, p0, Lgr1/o$e;->w:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, p0, Lgr1/o$e;->x:I

    iput v3, p0, Lgr1/o$e;->y:I

    invoke-interface {v1, p1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    return-object v2
.end method
