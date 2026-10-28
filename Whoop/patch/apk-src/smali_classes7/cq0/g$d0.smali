.class final Lcq0/g$d0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcq0/g;->s0(IZLq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.community.data.repository.TeamsRepository$updateTeamChatSettings$2"
    f = "TeamsRepository.kt"
    l = {
        0x3b9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcq0/g;

.field final synthetic y:I

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lcq0/g;IZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcq0/g;",
            "IZ",
            "Lq83/d<",
            "-",
            "Lcq0/g$d0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcq0/g$d0;->x:Lcq0/g;

    iput p2, p0, Lcq0/g$d0;->y:I

    iput-boolean p3, p0, Lcq0/g$d0;->z:Z

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

    new-instance p1, Lcq0/g$d0;

    iget-object v0, p0, Lcq0/g$d0;->x:Lcq0/g;

    iget v1, p0, Lcq0/g$d0;->y:I

    iget-boolean v2, p0, Lcq0/g$d0;->z:Z

    invoke-direct {p1, v0, v1, v2, p2}, Lcq0/g$d0;-><init>(Lcq0/g;IZLq83/d;)V

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
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcq0/g$d0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcq0/g$d0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcq0/g$d0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcq0/g$d0;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcq0/g$d0;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

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
    iget-object p1, p0, Lcq0/g$d0;->x:Lcq0/g;

    invoke-virtual {p1}, Lcq0/g;->B()Lcom/whoop/community/data/network/CommunityServiceApi;

    move-result-object p1

    iget v1, p0, Lcq0/g$d0;->y:I

    iget-boolean v3, p0, Lcq0/g$d0;->z:Z

    iput v2, p0, Lcq0/g$d0;->w:I

    invoke-interface {p1, v1, v3, p0}, Lcom/whoop/community/data/network/CommunityServiceApi;->updateTeamChatSettings(IZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lpg3/v0;

    iget-object p1, p1, Lpg3/v0;->a:Lud3/x0;

    iget-boolean p1, p1, Lud3/x0;->Q:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    iget-object v0, p0, Lcq0/g$d0;->x:Lcq0/g;

    invoke-virtual {v0}, Lcq0/g;->F()Ltr2/n;

    move-result-object v0

    iget-object v1, p0, Lcq0/g$d0;->x:Lcq0/g;

    invoke-static {v1}, Lcq0/g;->o(Lcq0/g;)Lrr2/c;

    move-result-object v1

    const-string v2, "Exception occurred while updating the team chat preference"

    invoke-static {p1, v2, v0, v1}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    const/4 p1, 0x0

    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
