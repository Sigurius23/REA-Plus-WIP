.class final Lnq0/i$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnq0/i;->g0()Landroidx/lifecycle/p0;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/lifecycle/q0;",
        "",
        "Ll83/a0;",
        "<anonymous>",
        "(Landroidx/lifecycle/q0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$declineAllInvites$1"
    f = "CommunityLandingViewModel.kt"
    l = {
        0xe7,
        0xe7,
        0xe7
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lnq0/i;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lnq0/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnq0/i;",
            "Lq83/d<",
            "-",
            "Lnq0/i$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnq0/i$e;->E:Lnq0/i;

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

    new-instance v0, Lnq0/i$e;

    iget-object v1, p0, Lnq0/i$e;->E:Lnq0/i;

    invoke-direct {v0, v1, p2}, Lnq0/i$e;-><init>(Lnq0/i;Lq83/d;)V

    iput-object p1, v0, Lnq0/i$e;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Landroidx/lifecycle/q0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/q0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lnq0/i$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lnq0/i$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lnq0/i$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/lifecycle/q0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lnq0/i$e;->f(Landroidx/lifecycle/q0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lnq0/i$e;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/q0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lnq0/i$e;->y:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lnq0/i$e;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/q0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lnq0/i$e;->x:Ljava/lang/Object;

    check-cast v0, Lcq0/g;

    iget-object v2, p0, Lnq0/i$e;->w:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/q0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lnq0/i$e;->E:Lnq0/i;

    invoke-static {p1}, Lnq0/i;->R(Lnq0/i;)Lcq0/g;

    move-result-object p1

    iget-object v2, p0, Lnq0/i$e;->E:Lnq0/i;

    iput-object v6, p0, Lnq0/i$e;->z:Ljava/lang/Object;

    iput-object v0, p0, Lnq0/i$e;->w:Ljava/lang/Object;

    iput-object p1, p0, Lnq0/i$e;->x:Ljava/lang/Object;

    iput v5, p0, Lnq0/i$e;->y:I

    invoke-virtual {v2, p0}, Lnq0/i;->y0(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_3

    :cond_4
    move-object v7, v0

    move-object v0, p1

    move-object p1, v2

    move-object v2, v7

    :goto_0
    check-cast p1, Lcom/whoop/domain/model/User;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getId()I

    move-result p1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    iput-object v6, p0, Lnq0/i$e;->z:Ljava/lang/Object;

    iput-object v2, p0, Lnq0/i$e;->w:Ljava/lang/Object;

    iput-object v6, p0, Lnq0/i$e;->x:Ljava/lang/Object;

    iput v4, p0, Lnq0/i$e;->y:I

    invoke-virtual {v0, p1, p0}, Lcq0/g;->r(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    move-object v0, v2

    :goto_2
    iput-object v6, p0, Lnq0/i$e;->z:Ljava/lang/Object;

    iput-object v6, p0, Lnq0/i$e;->w:Ljava/lang/Object;

    iput v3, p0, Lnq0/i$e;->y:I

    check-cast v0, Landroidx/lifecycle/r0;

    invoke-virtual {v0, p1, p0}, Landroidx/lifecycle/r0;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
