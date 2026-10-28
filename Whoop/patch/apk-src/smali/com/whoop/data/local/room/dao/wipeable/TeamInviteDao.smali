.class public interface abstract Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008g\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\'\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0004H\'\u00a2\u0006\u0004\u0008\t\u0010\nJ%\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0017\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J&\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u00102\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0097@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00082\u0006\u0010\u0018\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;",
        "",
        "Landroidx/lifecycle/p0;",
        "",
        "Lcom/whoop/domain/model/teams/TeamInviteDto;",
        "getLiveTeamInviteData",
        "()Landroidx/lifecycle/p0;",
        "teamInviteDto",
        "Ll83/a0;",
        "saveTeamInvite",
        "(Lcom/whoop/domain/model/teams/TeamInviteDto;)V",
        "",
        "userId",
        "invites",
        "addInvites",
        "(ILjava/util/List;)V",
        "",
        "showBadge",
        "teamId",
        "updateBadgeStatus",
        "(ZILq83/d;)Ljava/lang/Object;",
        "teams",
        "updateAllBadgeStatus",
        "(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;",
        "inviteId",
        "removeInvite",
        "(ILq83/d;)Ljava/lang/Object;",
        "removeAllInvites",
        "(Lq83/d;)Ljava/lang/Object;",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic access$addInvites$jd(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;ILjava/util/List;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;->addInvites(ILjava/util/List;)V

    return-void
.end method

.method public static synthetic access$updateAllBadgeStatus$jd(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;ZLjava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;->updateAllBadgeStatus(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static updateAllBadgeStatus$suspendImpl(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;ZLjava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;",
            "Z",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/TeamInviteDto;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;

    iget v1, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;

    invoke-direct {v0, p0, p3}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;-><init>(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget p0, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->I$0:I

    iget-boolean p1, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->Z$0:Z

    iget-object p2, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->L$5:Ljava/lang/Object;

    check-cast p2, Lcom/whoop/domain/model/teams/TeamInviteDto;

    iget-object p2, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->L$3:Ljava/lang/Object;

    check-cast p2, Ljava/util/Iterator;

    iget-object v2, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Iterable;

    iget-object v2, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v2, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p3, p2

    move p2, p1

    move p1, p0

    move-object p0, v2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object p3, p2

    move p2, p1

    move p1, v3

    :cond_3
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/domain/model/teams/TeamInviteDto;

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/TeamInviteDto;->getId()I

    move-result v2

    iput-object p0, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->L$3:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->L$4:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->L$5:Ljava/lang/Object;

    iput-boolean p2, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->Z$0:Z

    iput p1, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->I$0:I

    iput v3, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->I$1:I

    iput v4, v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao$updateAllBadgeStatus$1;->label:I

    invoke-interface {p0, p2, v2, v0}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;->updateBadgeStatus(ZILq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public addInvites(ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/TeamInviteDto;",
            ">;)V"
        }
    .end annotation

    const-string p1, "invites"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/domain/model/teams/TeamInviteDto;

    invoke-interface {p0, p2}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;->saveTeamInvite(Lcom/whoop/domain/model/teams/TeamInviteDto;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract getLiveTeamInviteData()Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end method

.method public abstract removeAllInvites(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract removeInvite(ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract saveTeamInvite(Lcom/whoop/domain/model/teams/TeamInviteDto;)V
.end method

.method public updateAllBadgeStatus(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/TeamInviteDto;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;->updateAllBadgeStatus$suspendImpl(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;ZLjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract updateBadgeStatus(ZILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
