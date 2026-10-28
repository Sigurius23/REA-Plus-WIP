.class final Lrq0/k$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq0/k;->d0(Lc93/m;Lc93/a;)V
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
    c = "com.whoop.community.presentation.teams.TeamAddMembersViewModel$startInviteFriend$1"
    f = "TeamAddMembersViewModel.kt"
    l = {
        0xc2
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field final synthetic G:Lrq0/k;

.field final synthetic H:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field final synthetic I:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lrq0/k;Lc93/m;Lc93/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrq0/k;",
            "Lc93/m;",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "Lrq0/k$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrq0/k$g;->G:Lrq0/k;

    iput-object p2, p0, Lrq0/k$g;->H:Lc93/m;

    iput-object p3, p0, Lrq0/k$g;->I:Lc93/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lrq0/k$g;

    iget-object v0, p0, Lrq0/k$g;->G:Lrq0/k;

    iget-object v1, p0, Lrq0/k$g;->H:Lc93/m;

    iget-object v2, p0, Lrq0/k$g;->I:Lc93/a;

    invoke-direct {p1, v0, v1, v2, p2}, Lrq0/k$g;-><init>(Lrq0/k;Lc93/m;Lc93/a;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lrq0/k$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrq0/k$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrq0/k$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrq0/k$g;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lrq0/k$g;->F:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget v0, p0, Lrq0/k$g;->z:I

    iget-object v1, p0, Lrq0/k$g;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    iget-object v2, p0, Lrq0/k$g;->x:Ljava/lang/Object;

    check-cast v2, Lc93/m;

    iget-object v3, p0, Lrq0/k$g;->w:Ljava/lang/Object;

    check-cast v3, Lrq0/k;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lrq0/k$g;->G:Lrq0/k;

    invoke-static {p1}, Lrq0/k;->z(Lrq0/k;)Lrq0/l;

    move-result-object p1

    invoke-virtual {p1}, Lrq0/l;->j()Lcom/whoop/domain/model/teams/Team;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/Team;->getId()I

    move-result v4

    iget-object p1, p0, Lrq0/k$g;->G:Lrq0/k;

    iget-object v1, p0, Lrq0/k$g;->H:Lc93/m;

    iget-object v9, p0, Lrq0/k$g;->I:Lc93/a;

    invoke-static {p1}, Lrq0/k;->A(Lrq0/k;)Lrv1/a;

    move-result-object v3

    iput-object p1, p0, Lrq0/k$g;->w:Ljava/lang/Object;

    iput-object v1, p0, Lrq0/k$g;->x:Ljava/lang/Object;

    iput-object v9, p0, Lrq0/k$g;->y:Ljava/lang/Object;

    iput v4, p0, Lrq0/k$g;->z:I

    const/4 v5, 0x0

    iput v5, p0, Lrq0/k$g;->E:I

    iput v2, p0, Lrq0/k$g;->F:I

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v6, p0

    invoke-static/range {v3 .. v8}, Lrv1/a;->C(Lrv1/a;ILjava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    return-object v0

    :cond_2
    move-object v3, p1

    move-object p1, v2

    move v0, v4

    move-object v2, v1

    move-object v1, v9

    :goto_0
    check-cast p1, Lcom/whoop/service/network/model/WhoopOffer;

    if-eqz p1, :cond_3

    invoke-static {v3}, Lrq0/k;->y(Lrq0/k;)Lz82/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lz82/e;->M0(I)V

    const-string v0, ""

    invoke-virtual {p1}, Lcom/whoop/service/network/model/WhoopOffer;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, v0, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_4
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
