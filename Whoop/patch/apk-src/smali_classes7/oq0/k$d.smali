.class final Loq0/k$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loq0/k;->K(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loq0/k$d$a;
    }
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
    c = "com.whoop.community.presentation.login.JoinTeamLandingViewModel$processLegacyInvite$1"
    f = "JoinTeamLandingViewModel.kt"
    l = {
        0x68,
        0x69
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:J

.field x:I

.field y:I

.field final synthetic z:Loq0/k;


# direct methods
.method public constructor <init>(Loq0/k;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loq0/k;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Loq0/k$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loq0/k$d;->z:Loq0/k;

    iput-object p2, p0, Loq0/k$d;->E:Ljava/lang/String;

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

    new-instance p1, Loq0/k$d;

    iget-object v0, p0, Loq0/k$d;->z:Loq0/k;

    iget-object v1, p0, Loq0/k$d;->E:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Loq0/k$d;-><init>(Loq0/k;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Loq0/k$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loq0/k$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loq0/k$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loq0/k$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Loq0/k$d;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Loq0/k$d;->z:Loq0/k;

    invoke-static {v2}, Loq0/k;->p(Loq0/k;)Loq0/m;

    move-result-object v6

    const/16 v14, 0x7e

    const/4 v15, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v6 .. v15}, Loq0/m;->b(Loq0/m;ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;ZILjava/lang/Object;)Loq0/m;

    move-result-object v6

    invoke-static {v2, v6}, Loq0/k;->r(Loq0/k;Loq0/m;)V

    iget-object v2, v0, Loq0/k$d;->z:Loq0/k;

    invoke-static {v2}, Loq0/k;->n(Loq0/k;)Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    iput-wide v6, v0, Loq0/k$d;->w:J

    iput v3, v0, Loq0/k$d;->x:I

    iput v5, v0, Loq0/k$d;->y:I

    invoke-static {v6, v7, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object v2, v0, Loq0/k$d;->z:Loq0/k;

    invoke-static {v2}, Loq0/k;->g(Loq0/k;)Lcq0/b;

    move-result-object v2

    iget-object v6, v0, Loq0/k$d;->E:Ljava/lang/String;

    iput v4, v0, Loq0/k$d;->y:I

    invoke-virtual {v2, v6, v0}, Lcq0/b;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    check-cast v2, Lcom/whoop/data/remote/commons/Resource;

    iget-object v1, v0, Loq0/k$d;->z:Loq0/k;

    invoke-static {v1}, Loq0/k;->p(Loq0/k;)Loq0/m;

    move-result-object v6

    const/16 v14, 0x7e

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v6 .. v15}, Loq0/m;->b(Loq0/m;ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;ZILjava/lang/Object;)Loq0/m;

    move-result-object v6

    invoke-static {v1, v6}, Loq0/k;->r(Loq0/k;Loq0/m;)V

    invoke-virtual {v2}, Lcom/whoop/data/remote/commons/Resource;->getStatus()Lcom/whoop/data/remote/commons/Status;

    move-result-object v1

    sget-object v6, Loq0/k$d$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v6, v1

    if-eq v1, v5, :cond_8

    if-eq v1, v4, :cond_6

    const/4 v2, 0x3

    if-ne v1, v2, :cond_5

    goto :goto_4

    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_6
    iget-object v1, v0, Loq0/k$d;->z:Loq0/k;

    invoke-virtual {v2}, Lcom/whoop/data/remote/commons/Resource;->getException()Lcom/whoop/network/exception/DomainException;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/whoop/network/exception/DomainException;->a()Lcom/whoop/network/exception/DomainException$b;

    move-result-object v2

    goto :goto_3

    :cond_7
    const/4 v2, 0x0

    :goto_3
    invoke-static {v1, v2}, Loq0/k;->q(Loq0/k;Lcom/whoop/network/exception/DomainException$b;)I

    move-result v2

    invoke-static {v1, v2}, Loq0/k;->t(Loq0/k;I)V

    iget-object v1, v0, Loq0/k$d;->z:Loq0/k;

    invoke-static {v1}, Loq0/k;->l(Loq0/k;)Li92/e;

    move-result-object v1

    invoke-interface {v1}, Li92/e;->isConnected()Z

    move-result v1

    if-nez v1, :cond_a

    iget-object v1, v0, Loq0/k$d;->z:Loq0/k;

    invoke-virtual {v1}, Loq0/k;->A()Lor2/s0;

    move-result-object v1

    sget v2, Lxp0/d0;->H:I

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, v2}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v1, v3}, Lor2/s0;->e(Ljava/lang/Object;)V

    goto :goto_4

    :cond_8
    invoke-virtual {v2}, Lcom/whoop/data/remote/commons/Resource;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/domain/model/Invitation;

    if-eqz v1, :cond_9

    iget-object v2, v0, Loq0/k$d;->z:Loq0/k;

    invoke-virtual {v2}, Loq0/k;->y()Lor2/s0;

    move-result-object v2

    invoke-virtual {v2, v1}, Lor2/s0;->e(Ljava/lang/Object;)V

    goto :goto_4

    :cond_9
    iget-object v1, v0, Loq0/k$d;->z:Loq0/k;

    invoke-static {v1}, Loq0/k;->j(Loq0/k;)Ltr2/n;

    move-result-object v1

    const-string v2, "invitation is null"

    new-array v3, v3, [Lqr2/a$a;

    const-string v4, "Community_InviteCode_Create"

    invoke-interface {v1, v4, v2, v3}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    :cond_a
    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
