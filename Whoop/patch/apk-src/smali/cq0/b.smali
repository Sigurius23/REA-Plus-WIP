.class public final Lcq0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ!\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u000c\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcq0/b;",
        "",
        "Lcom/whoop/data/remote/RemoteDataSource;",
        "remoteDataSource",
        "<init>",
        "(Lcom/whoop/data/remote/RemoteDataSource;)V",
        "",
        "inviteCode",
        "Lcom/whoop/data/remote/commons/Resource;",
        "Lcom/whoop/domain/model/Invitation;",
        "b",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "invitation",
        "Lxg3/g;",
        "Lpg3/v0;",
        "Lcom/whoop/service/network/model/ClaimInviteResponse;",
        "a",
        "(Lcom/whoop/domain/model/Invitation;)Lxg3/g;",
        "Lcom/whoop/data/remote/RemoteDataSource;",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/data/remote/RemoteDataSource;


# direct methods
.method public constructor <init>(Lcom/whoop/data/remote/RemoteDataSource;)V
    .locals 1

    const-string v0, "remoteDataSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcq0/b;->a:Lcom/whoop/data/remote/RemoteDataSource;

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/domain/model/Invitation;)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/Invitation;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/ClaimInviteResponse;",
            ">;>;"
        }
    .end annotation

    const-string v0, "invitation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcq0/b;->a:Lcom/whoop/data/remote/RemoteDataSource;

    invoke-virtual {p1}, Lcom/whoop/domain/model/Invitation;->getInviteCode()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/whoop/data/remote/RemoteDataSource;->joinTeam(Ljava/lang/String;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/commons/Resource<",
            "Lcom/whoop/domain/model/Invitation;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcq0/b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcq0/b$a;

    iget v1, v0, Lcq0/b$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcq0/b$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcq0/b$a;

    invoke-direct {v0, p0, p2}, Lcq0/b$a;-><init>(Lcq0/b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcq0/b$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcq0/b$a;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcq0/b$a;->x:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/data/remote/commons/Resource$Companion;

    iget-object v0, v0, Lcq0/b$a;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/whoop/network/exception/DomainException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v4, p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    sget-object p2, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    iget-object v2, p0, Lcq0/b;->a:Lcom/whoop/data/remote/RemoteDataSource;

    const/4 v4, 0x0

    iput-object v4, v0, Lcq0/b$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lcq0/b$a;->x:Ljava/lang/Object;

    iput v3, v0, Lcq0/b$a;->E:I

    invoke-interface {v2, p1, v0}, Lcom/whoop/data/remote/RemoteDataSource;->validateInviteCode(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_1
    invoke-virtual {p1, p2}, Lcom/whoop/data/remote/commons/Resource$Companion;->success(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1
    :try_end_1
    .catch Lcom/whoop/network/exception/DomainException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    sget-object v0, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v1, ""

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lcom/whoop/data/remote/commons/Resource$Companion;->error$default(Lcom/whoop/data/remote/commons/Resource$Companion;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;ILjava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1

    return-object p1
.end method
