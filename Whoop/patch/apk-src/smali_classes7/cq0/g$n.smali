.class public final Lcq0/g$n;
.super Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcq0/g;->G(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource<",
        "Ljava/util/List<",
        "+",
        "Lcom/whoop/domain/model/teams/MemberStory;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\t\u001a\u00020\u00082\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0016\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u001d\u0010\u000f\u001a\u00020\u00052\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "cq0/g$n",
        "Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;",
        "",
        "Lcom/whoop/domain/model/teams/MemberStory;",
        "data",
        "",
        "c",
        "(Ljava/util/List;)Z",
        "Ll83/a0;",
        "a",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "fetchFromDb",
        "(Lq83/d;)Ljava/lang/Object;",
        "fetchFromNetwork",
        "dataFromServer",
        "b",
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
.field final synthetic a:Lcq0/g;


# direct methods
.method public constructor <init>(Lcq0/g;)V
    .locals 0

    iput-object p1, p0, Lcq0/g$n;->a:Lcq0/g;

    invoke-direct {p0}, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/MemberStory;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcq0/g$n;->a:Lcq0/g;

    invoke-static {v0}, Lcq0/g;->p(Lcq0/g;)Lin2/d;

    move-result-object v0

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcq0/g$n$a;

    iget-object v2, p0, Lcq0/g$n;->a:Lcq0/g;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p1, v3}, Lcq0/g$n$a;-><init>(Lcq0/g;Ljava/util/List;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public b(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/MemberStory;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "dataFromServer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public c(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/MemberStory;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic cache(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcq0/g$n;->a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public fetchFromDb(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/MemberStory;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcq0/g$n;->a:Lcq0/g;

    invoke-static {v0}, Lcq0/g;->p(Lcq0/g;)Lin2/d;

    move-result-object v0

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcq0/g$n$b;

    iget-object v2, p0, Lcq0/g$n;->a:Lcq0/g;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcq0/g$n$b;-><init>(Lcq0/g;Lq83/d;)V

    invoke-static {v0, v1, p1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public fetchFromNetwork(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/MemberStory;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcq0/g$n$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcq0/g$n$c;

    iget v1, v0, Lcq0/g$n$c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcq0/g$n$c;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcq0/g$n$c;

    invoke-direct {v0, p0, p1}, Lcq0/g$n$c;-><init>(Lcq0/g$n;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcq0/g$n$c;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcq0/g$n$c;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcq0/g$n$c;->w:Ljava/lang/Object;

    check-cast v0, Lcq0/g;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcq0/g$n;->a:Lcq0/g;

    invoke-virtual {p1}, Lcq0/g;->K()Lcom/whoop/data/remote/RemoteDataSource;

    move-result-object v2

    iput-object p1, v0, Lcq0/g$n$c;->w:Ljava/lang/Object;

    iput v3, v0, Lcq0/g$n$c;->z:I

    invoke-interface {v2, v0}, Lcom/whoop/data/remote/RemoteDataSource;->getMemberStories(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v4, v0

    move-object v0, p1

    move-object p1, v4

    :goto_1
    check-cast p1, Lcom/whoop/domain/model/RecordsDto;

    invoke-virtual {v0, p1}, Lcq0/g;->H(Lcom/whoop/domain/model/RecordsDto;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic shouldCache(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcq0/g$n;->b(Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic shouldFetch(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcq0/g$n;->c(Ljava/util/List;)Z

    move-result p1

    return p1
.end method
