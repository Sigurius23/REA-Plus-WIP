.class final Loq0/e$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loq0/e;->R(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loq0/e$d$a;
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
    c = "com.whoop.community.presentation.login.InviteCodeViewModel$processLegacyInvite$1"
    f = "InviteCodeViewModel.kt"
    l = {
        0xaf,
        0xb0
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:J

.field x:I

.field y:I

.field final synthetic z:Loq0/e;


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
            "Loq0/e$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loq0/e$d;->z:Loq0/e;

    iput-object p2, p0, Loq0/e$d;->E:Ljava/lang/String;

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

    new-instance p1, Loq0/e$d;

    iget-object v0, p0, Loq0/e$d;->z:Loq0/e;

    iget-object v1, p0, Loq0/e$d;->E:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Loq0/e$d;-><init>(Loq0/e;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Loq0/e$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loq0/e$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loq0/e$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loq0/e$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Loq0/e$d;->y:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

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

    iget-object p1, p0, Loq0/e$d;->z:Loq0/e;

    invoke-static {p1}, Loq0/e;->q(Loq0/e;)Loq0/g;

    move-result-object v4

    const/16 v11, 0x3e

    const/4 v12, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, Loq0/g;->b(Loq0/g;ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;IILjava/lang/Object;)Loq0/g;

    move-result-object v1

    invoke-static {p1, v1}, Loq0/e;->t(Loq0/e;Loq0/g;)V

    iget-object p1, p0, Loq0/e$d;->z:Loq0/e;

    invoke-static {p1}, Loq0/e;->o(Loq0/e;)Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    iput-wide v4, p0, Loq0/e$d;->w:J

    const/4 p1, 0x0

    iput p1, p0, Loq0/e$d;->x:I

    iput v3, p0, Loq0/e$d;->y:I

    invoke-static {v4, v5, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Loq0/e$d;->z:Loq0/e;

    invoke-static {p1}, Loq0/e;->j(Loq0/e;)Lcq0/b;

    move-result-object p1

    iget-object v1, p0, Loq0/e$d;->E:Ljava/lang/String;

    iput v2, p0, Loq0/e$d;->y:I

    invoke-virtual {p1, v1, p0}, Lcq0/b;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    iget-object v0, p0, Loq0/e$d;->z:Loq0/e;

    invoke-static {v0}, Loq0/e;->q(Loq0/e;)Loq0/g;

    move-result-object v4

    const/16 v11, 0x3e

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, Loq0/g;->b(Loq0/g;ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;IILjava/lang/Object;)Loq0/g;

    move-result-object v1

    invoke-static {v0, v1}, Loq0/e;->t(Loq0/e;Loq0/g;)V

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getStatus()Lcom/whoop/data/remote/commons/Status;

    move-result-object v0

    sget-object v1, Loq0/e$d$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v3, :cond_8

    if-eq v0, v2, :cond_6

    const/4 p1, 0x3

    if-ne v0, p1, :cond_5

    goto :goto_4

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    iget-object v0, p0, Loq0/e$d;->z:Loq0/e;

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getException()Lcom/whoop/network/exception/DomainException;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/whoop/network/exception/DomainException;->a()Lcom/whoop/network/exception/DomainException$b;

    move-result-object p1

    goto :goto_3

    :cond_7
    const/4 p1, 0x0

    :goto_3
    invoke-static {v0, p1}, Loq0/e;->r(Loq0/e;Lcom/whoop/network/exception/DomainException$b;)I

    move-result p1

    invoke-static {v0, p1}, Loq0/e;->u(Loq0/e;I)V

    iget-object p1, p0, Loq0/e$d;->z:Loq0/e;

    invoke-static {p1}, Loq0/e;->n(Loq0/e;)Li92/e;

    move-result-object p1

    invoke-interface {p1}, Li92/e;->isConnected()Z

    move-result p1

    if-nez p1, :cond_9

    iget-object p1, p0, Loq0/e$d;->z:Loq0/e;

    invoke-virtual {p1}, Loq0/e;->D()Lor2/s0;

    move-result-object p1

    sget v0, Lxp0/d0;->H:I

    new-instance v1, Ljava/lang/Integer;

    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {p1, v1}, Lor2/s0;->e(Ljava/lang/Object;)V

    goto :goto_4

    :cond_8
    iget-object v0, p0, Loq0/e$d;->z:Loq0/e;

    invoke-static {v0}, Loq0/e;->g(Loq0/e;)Lz82/e;

    move-result-object v0

    invoke-virtual {v0}, Lz82/e;->B()V

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lcom/whoop/domain/model/Invitation;

    iget-object v0, p0, Loq0/e$d;->z:Loq0/e;

    invoke-virtual {v0}, Loq0/e;->B()Lor2/s0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lor2/s0;->e(Ljava/lang/Object;)V

    :cond_9
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
