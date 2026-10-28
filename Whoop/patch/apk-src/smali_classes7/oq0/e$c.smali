.class final Loq0/e$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loq0/e;->Q(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loq0/e$c$a;
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
    c = "com.whoop.community.presentation.login.InviteCodeViewModel$processCommunityInvite$1"
    f = "InviteCodeViewModel.kt"
    l = {
        0xcb
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Loq0/e;

.field final synthetic y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Loq0/e;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loq0/e;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Loq0/e$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loq0/e$c;->x:Loq0/e;

    iput-object p2, p0, Loq0/e$c;->y:Ljava/lang/String;

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

    new-instance p1, Loq0/e$c;

    iget-object v0, p0, Loq0/e$c;->x:Loq0/e;

    iget-object v1, p0, Loq0/e$c;->y:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Loq0/e$c;-><init>(Loq0/e;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Loq0/e$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loq0/e$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loq0/e$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loq0/e$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Loq0/e$c;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Loq0/e$c;->x:Loq0/e;

    invoke-static {p1}, Loq0/e;->q(Loq0/e;)Loq0/g;

    move-result-object v3

    const/16 v10, 0x3e

    const/4 v11, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Loq0/g;->b(Loq0/g;ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;IILjava/lang/Object;)Loq0/g;

    move-result-object v1

    invoke-static {p1, v1}, Loq0/e;->t(Loq0/e;Loq0/g;)V

    iget-object p1, p0, Loq0/e$c;->x:Loq0/e;

    invoke-static {p1}, Loq0/e;->p(Loq0/e;)Lcq0/g;

    move-result-object p1

    iget-object v1, p0, Loq0/e$c;->y:Ljava/lang/String;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    const-string v4, "getDefault(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "toUpperCase(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput v2, p0, Loq0/e$c;->w:I

    invoke-virtual {p1, v1, p0}, Lcq0/g;->x(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    iget-object v0, p0, Loq0/e$c;->x:Loq0/e;

    invoke-static {v0}, Loq0/e;->q(Loq0/e;)Loq0/g;

    move-result-object v3

    const/16 v10, 0x3e

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Loq0/g;->b(Loq0/g;ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;IILjava/lang/Object;)Loq0/g;

    move-result-object v1

    invoke-static {v0, v1}, Loq0/e;->t(Loq0/e;Loq0/g;)V

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getStatus()Lcom/whoop/data/remote/commons/Status;

    move-result-object v0

    sget-object v1, Loq0/e$c$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v2, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 p1, 0x3

    if-ne v0, p1, :cond_3

    goto/16 :goto_1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    iget-object v0, p0, Loq0/e$c;->x:Loq0/e;

    invoke-static {v0}, Loq0/e;->l(Loq0/e;)Ltr2/n;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getException()Lcom/whoop/network/exception/DomainException;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "Community_InviteCode_Create"

    const-string v4, "Failed to verify invite code"

    invoke-interface {v0, v3, v4, v1, v2}, Ltr2/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object v0, p0, Loq0/e$c;->x:Loq0/e;

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getException()Lcom/whoop/network/exception/DomainException;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/whoop/network/exception/DomainException;->a()Lcom/whoop/network/exception/DomainException$b;

    move-result-object p1

    invoke-static {v0, p1}, Loq0/e;->r(Loq0/e;Lcom/whoop/network/exception/DomainException$b;)I

    move-result p1

    invoke-static {v0, p1}, Loq0/e;->u(Loq0/e;I)V

    iget-object p1, p0, Loq0/e$c;->x:Loq0/e;

    invoke-static {p1}, Loq0/e;->n(Loq0/e;)Li92/e;

    move-result-object p1

    invoke-interface {p1}, Li92/e;->isConnected()Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Loq0/e$c;->x:Loq0/e;

    invoke-virtual {p1}, Loq0/e;->D()Lor2/s0;

    move-result-object p1

    sget v0, Lxp0/d0;->H:I

    new-instance v1, Ljava/lang/Integer;

    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {p1, v1}, Lor2/s0;->e(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lcom/whoop/domain/model/teams/Team;

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/Team;->getIconUrl()Ljava/lang/String;

    move-result-object v5

    new-instance v0, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/Team;->getId()I

    move-result v3

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/Team;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/Team;->getAdminId()I

    move-result v6

    const-string v7, ""

    iget-object v8, p0, Loq0/e$c;->y:Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, ""

    invoke-direct/range {v0 .. v8}, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Loq0/e$c;->x:Loq0/e;

    invoke-virtual {p1}, Loq0/e;->L()Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Loq0/e$c;->x:Loq0/e;

    invoke-virtual {p1}, Loq0/e;->A()Lor2/s0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lor2/s0;->e(Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    iget-object p1, p0, Loq0/e$c;->x:Loq0/e;

    invoke-virtual {p1}, Loq0/e;->C()Lor2/s0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lor2/s0;->e(Ljava/lang/Object;)V

    :cond_7
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
