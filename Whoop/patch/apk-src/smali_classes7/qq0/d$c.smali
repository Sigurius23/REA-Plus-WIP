.class final Lqq0/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqq0/d;->D(I)V
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
    c = "com.whoop.community.presentation.share.selectteam.SelectTeamViewModel$getCommunity$1"
    f = "SelectTeamViewModel.kt"
    l = {
        0x2d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lqq0/d;

.field final synthetic y:I


# direct methods
.method public constructor <init>(Lqq0/d;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqq0/d;",
            "I",
            "Lq83/d<",
            "-",
            "Lqq0/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqq0/d$c;->x:Lqq0/d;

    iput p2, p0, Lqq0/d$c;->y:I

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

    new-instance p1, Lqq0/d$c;

    iget-object v0, p0, Lqq0/d$c;->x:Lqq0/d;

    iget v1, p0, Lqq0/d$c;->y:I

    invoke-direct {p1, v0, v1, p2}, Lqq0/d$c;-><init>(Lqq0/d;ILq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lqq0/d$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lqq0/d$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lqq0/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lqq0/d$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lqq0/d$c;->w:I

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

    iget-object p1, p0, Lqq0/d$c;->x:Lqq0/d;

    invoke-static {p1}, Lqq0/d;->y(Lqq0/d;)Lcq0/g;

    move-result-object p1

    iget v1, p0, Lqq0/d$c;->y:I

    iget-object v3, p0, Lqq0/d$c;->x:Lqq0/d;

    invoke-static {v3}, Lqq0/d;->z(Lqq0/d;)Lod1/u;

    move-result-object v3

    invoke-virtual {v3}, Lod1/u;->g()I

    move-result v3

    sget-object v4, Lcom/whoop/domain/model/teams/TeamType;->COMMUNITY:Lcom/whoop/domain/model/teams/TeamType;

    iput v2, p0, Lqq0/d$c;->w:I

    invoke-virtual {p1, v1, v3, v4, p0}, Lcq0/g;->w(IILcom/whoop/domain/model/teams/TeamType;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    move-object v2, p1

    check-cast v2, Lcom/whoop/domain/model/teams/Team;

    if-eqz v2, :cond_3

    iget-object p1, p0, Lqq0/d$c;->x:Lqq0/d;

    invoke-virtual {p1}, Lqq0/d;->E()Landroidx/lifecycle/p0;

    move-result-object v6

    new-instance v0, Lqq0/e;

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lqq0/e;-><init>(Ljava/util/List;Lcom/whoop/domain/model/teams/Team;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1, v6, v0}, Lqq0/d;->B(Lqq0/d;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lqq0/d$c;->x:Lqq0/d;

    invoke-static {p1}, Lqq0/d;->w(Lqq0/d;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "get community returned a null"

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
