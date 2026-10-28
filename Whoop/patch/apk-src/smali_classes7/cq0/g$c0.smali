.class final Lcq0/g$c0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcq0/g;->r0(Lcom/whoop/domain/model/teams/Team;ILq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lcom/whoop/domain/model/teams/Team;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/domain/model/teams/Team;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.community.data.repository.TeamsRepository$updateTeam$2$1"
    f = "TeamsRepository.kt"
    l = {
        0x109
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:I

.field w:I

.field final synthetic x:Lcq0/g;

.field final synthetic y:Lcom/whoop/domain/model/teams/CommunityDto;

.field final synthetic z:Lcom/whoop/domain/model/teams/Team;


# direct methods
.method public constructor <init>(Lcq0/g;Lcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/Team;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcq0/g;",
            "Lcom/whoop/domain/model/teams/CommunityDto;",
            "Lcom/whoop/domain/model/teams/Team;",
            "I",
            "Lq83/d<",
            "-",
            "Lcq0/g$c0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcq0/g$c0;->x:Lcq0/g;

    iput-object p2, p0, Lcq0/g$c0;->y:Lcom/whoop/domain/model/teams/CommunityDto;

    iput-object p3, p0, Lcq0/g$c0;->z:Lcom/whoop/domain/model/teams/Team;

    iput p4, p0, Lcq0/g$c0;->E:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lcq0/g$c0;

    iget-object v1, p0, Lcq0/g$c0;->x:Lcq0/g;

    iget-object v2, p0, Lcq0/g$c0;->y:Lcom/whoop/domain/model/teams/CommunityDto;

    iget-object v3, p0, Lcq0/g$c0;->z:Lcom/whoop/domain/model/teams/Team;

    iget v4, p0, Lcq0/g$c0;->E:I

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcq0/g$c0;-><init>(Lcq0/g;Lcom/whoop/domain/model/teams/CommunityDto;Lcom/whoop/domain/model/teams/Team;ILq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/domain/model/teams/Team;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcq0/g$c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcq0/g$c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcq0/g$c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcq0/g$c0;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcq0/g$c0;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcq0/g$c0;->x:Lcq0/g;

    invoke-virtual {p1}, Lcq0/g;->y()Lcom/whoop/service/network/CommunityApi;

    move-result-object p1

    iget-object v1, p0, Lcq0/g$c0;->y:Lcom/whoop/domain/model/teams/CommunityDto;

    iget-object v4, p0, Lcq0/g$c0;->z:Lcom/whoop/domain/model/teams/Team;

    invoke-virtual {v4}, Lcom/whoop/domain/model/teams/Team;->getId()I

    move-result v4

    iget v5, p0, Lcq0/g$c0;->E:I

    iput v3, p0, Lcq0/g$c0;->w:I

    invoke-interface {p1, v1, v4, v5, p0}, Lcom/whoop/service/network/CommunityApi;->updateCommunity(Lcom/whoop/domain/model/teams/CommunityDto;IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lpg3/v0;

    iget-object p1, p1, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/domain/model/teams/CommunityDto;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/CommunityDto;->toTeam()Lcom/whoop/domain/model/teams/Team;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :cond_3
    return-object v2

    :goto_1
    iget-object v0, p0, Lcq0/g$c0;->x:Lcq0/g;

    invoke-virtual {v0}, Lcq0/g;->F()Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v3, "Error in updateTeam: "

    invoke-interface {v0, v3, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-object v2
.end method
