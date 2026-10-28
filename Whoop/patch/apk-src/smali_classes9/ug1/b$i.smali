.class final Lug1/b$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/b;->interact(Lec3/l;)Lec3/l;
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
        "Lug1/j;",
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
    c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy$interact$2"
    f = "DefaultUpdateStrategy.kt"
    l = {
        0xa6,
        0xa9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lug1/b;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lec3/l;Lug1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lug1/b;",
            "Lq83/d<",
            "-",
            "Lug1/b$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug1/b$i;->z:Lec3/l;

    iput-object p2, p0, Lug1/b$i;->E:Lug1/b;

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

    new-instance p1, Lug1/b$i;

    iget-object v0, p0, Lug1/b$i;->z:Lec3/l;

    iget-object v1, p0, Lug1/b$i;->E:Lug1/b;

    invoke-direct {p1, v0, v1, p2}, Lug1/b$i;-><init>(Lec3/l;Lug1/b;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lug1/b$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lug1/b$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lug1/b$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lug1/b$i;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lug1/b$i;->y:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lug1/b$i;->x:Ljava/lang/Object;

    check-cast v0, Lug1/b;

    iget-object v1, p0, Lug1/b$i;->w:Ljava/lang/Object;

    check-cast v1, Lug1/i$a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

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

    iget-object p1, p0, Lug1/b$i;->z:Lec3/l;

    iput v3, p0, Lug1/b$i;->y:I

    invoke-static {p1, p0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    const-string v1, "null cannot be cast to non-null type com.whoop.firmwareUpdateService.strategy.StrategyAction.Start"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lug1/i$a;

    iget-object v1, p0, Lug1/b$i;->E:Lug1/b;

    invoke-virtual {p1}, Lug1/i$a;->b()Z

    move-result v3

    invoke-static {v1, v3}, Lug1/b;->O(Lug1/b;Z)V

    iget-object v1, p0, Lug1/b$i;->E:Lug1/b;

    invoke-virtual {p1}, Lug1/i$a;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object p1

    invoke-static {v1, p1}, Lug1/b;->P(Lug1/b;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V

    iget-object p1, p0, Lug1/b$i;->E:Lug1/b;

    invoke-static {p1}, Lug1/b;->n(Lug1/b;)Lsg1/a;

    move-result-object v1

    iget-object v3, p0, Lug1/b$i;->E:Lug1/b;

    invoke-static {v3}, Lug1/b;->y(Lug1/b;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_4
    move-object v3, v4

    :goto_1
    if-nez v3, :cond_5

    const-string v3, ""

    :cond_5
    iput-object v4, p0, Lug1/b$i;->w:Ljava/lang/Object;

    iput-object p1, p0, Lug1/b$i;->x:Ljava/lang/Object;

    iput v2, p0, Lug1/b$i;->y:I

    invoke-interface {v1, v3, p0}, Lsg1/a;->j(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    move-object v0, p1

    move-object p1, v1

    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lug1/b;->M(Lug1/b;Z)V

    iget-object p1, p0, Lug1/b$i;->E:Lug1/b;

    invoke-virtual {p1}, Lug1/b;->h()Ltr2/n;

    move-result-object p1

    iget-object v0, p0, Lug1/b$i;->E:Lug1/b;

    invoke-static {v0}, Lug1/b;->A(Lug1/b;)Z

    move-result v0

    const-string v1, "isForcedFwUpdate from onStart is "

    invoke-static {v1, v0}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lug1/b$i;->E:Lug1/b;

    invoke-static {p1}, Lug1/b;->w(Lug1/b;)Z

    move-result v0

    invoke-static {p1, v0}, Lug1/b;->e(Lug1/b;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
