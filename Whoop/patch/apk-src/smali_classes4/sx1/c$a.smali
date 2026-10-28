.class final Lsx1/c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsx1/c;->d()V
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
    c = "com.whoop.membership.reactivationmodal.ReactivationModalCoordinator$initializeStateFlow$1"
    f = "ReactivationModalCoordinator.kt"
    l = {
        0x35,
        0x34,
        0x38
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Lsx1/c;


# direct methods
.method public constructor <init>(Lsx1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsx1/c;",
            "Lq83/d<",
            "-",
            "Lsx1/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsx1/c$a;->z:Lsx1/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lsx1/c$a;

    iget-object v0, p0, Lsx1/c$a;->z:Lsx1/c;

    invoke-direct {p1, v0, p2}, Lsx1/c$a;-><init>(Lsx1/c;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsx1/c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsx1/c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsx1/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsx1/c$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsx1/c$a;->y:I

    const/4 v2, 0x0

    sget-object v3, Lm83/y;->w:Lm83/y;

    const/4 v4, 0x3

    const/4 v5, 0x2

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v7, :cond_2

    if-eq v1, v5, :cond_1

    if-ne v1, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_2
    iget v1, p0, Lsx1/c$a;->w:I

    iget-object v4, p0, Lsx1/c$a;->x:Ljava/lang/Object;

    check-cast v4, Lec3/p1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsx1/c$a;->z:Lsx1/c;

    invoke-static {p1}, Lsx1/c;->a(Lsx1/c;)Lrv1/a;

    move-result-object p1

    invoke-virtual {p1}, Lrv1/a;->G()Landroidx/lifecycle/p0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->CANCELED:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    if-ne p1, v1, :cond_4

    move v1, v7

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    move v1, p1

    :goto_1
    if-eqz v1, :cond_6

    iget-object p1, p0, Lsx1/c$a;->z:Lsx1/c;

    invoke-static {p1}, Lsx1/c;->b(Lsx1/c;)Lec3/p1;

    move-result-object v4

    iget-object p1, p0, Lsx1/c$a;->z:Lsx1/c;

    invoke-static {p1}, Lsx1/c;->a(Lsx1/c;)Lrv1/a;

    move-result-object p1

    iput-object v4, p0, Lsx1/c$a;->x:Ljava/lang/Object;

    iput v1, p0, Lsx1/c$a;->w:I

    iput v7, p0, Lsx1/c$a;->y:I

    invoke-virtual {p1, p0}, Lrv1/a;->z(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    check-cast p1, Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;

    new-instance v7, Lsx1/e;

    invoke-direct {v7, p1, v3}, Lsx1/e;-><init>(Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;Ljava/util/List;)V

    iput-object v2, p0, Lsx1/c$a;->x:Ljava/lang/Object;

    iput v1, p0, Lsx1/c$a;->w:I

    iput v5, p0, Lsx1/c$a;->y:I

    check-cast v4, Lec3/h2;

    invoke-virtual {v4, v7, p0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v6, v0, :cond_7

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lsx1/c$a;->z:Lsx1/c;

    invoke-static {p1}, Lsx1/c;->b(Lsx1/c;)Lec3/p1;

    move-result-object p1

    new-instance v5, Lsx1/e;

    invoke-direct {v5, v2, v3}, Lsx1/e;-><init>(Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;Ljava/util/List;)V

    iput v1, p0, Lsx1/c$a;->w:I

    iput v4, p0, Lsx1/c$a;->y:I

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v5, p0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v6, v0, :cond_7

    :goto_3
    return-object v0

    :cond_7
    :goto_4
    return-object v6
.end method
