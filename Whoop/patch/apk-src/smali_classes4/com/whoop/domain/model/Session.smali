.class public final Lcom/whoop/domain/model/Session;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\n\u0010\u000c\u001a\u00020\rH\u0096\u0080\u0004J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/whoop/domain/model/Session;",
        "",
        "authToken",
        "Lcom/whoop/domain/model/AuthToken;",
        "user",
        "Lcom/whoop/domain/model/User;",
        "<init>",
        "(Lcom/whoop/domain/model/AuthToken;Lcom/whoop/domain/model/User;)V",
        "getAuthToken",
        "()Lcom/whoop/domain/model/AuthToken;",
        "getUser",
        "()Lcom/whoop/domain/model/User;",
        "toString",
        "",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
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


# instance fields
.field private final authToken:Lcom/whoop/domain/model/AuthToken;

.field private final user:Lcom/whoop/domain/model/User;


# direct methods
.method public constructor <init>(Lcom/whoop/domain/model/AuthToken;Lcom/whoop/domain/model/User;)V
    .locals 1

    const-string v0, "authToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/domain/model/Session;->authToken:Lcom/whoop/domain/model/AuthToken;

    iput-object p2, p0, Lcom/whoop/domain/model/Session;->user:Lcom/whoop/domain/model/User;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/Session;Lcom/whoop/domain/model/AuthToken;Lcom/whoop/domain/model/User;ILjava/lang/Object;)Lcom/whoop/domain/model/Session;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/domain/model/Session;->authToken:Lcom/whoop/domain/model/AuthToken;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/whoop/domain/model/Session;->user:Lcom/whoop/domain/model/User;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/domain/model/Session;->copy(Lcom/whoop/domain/model/AuthToken;Lcom/whoop/domain/model/User;)Lcom/whoop/domain/model/Session;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/domain/model/AuthToken;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/Session;->authToken:Lcom/whoop/domain/model/AuthToken;

    return-object v0
.end method

.method public final component2()Lcom/whoop/domain/model/User;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/Session;->user:Lcom/whoop/domain/model/User;

    return-object v0
.end method

.method public final copy(Lcom/whoop/domain/model/AuthToken;Lcom/whoop/domain/model/User;)Lcom/whoop/domain/model/Session;
    .locals 1

    const-string v0, "authToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/domain/model/Session;

    invoke-direct {v0, p1, p2}, Lcom/whoop/domain/model/Session;-><init>(Lcom/whoop/domain/model/AuthToken;Lcom/whoop/domain/model/User;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/Session;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/Session;

    iget-object v1, p0, Lcom/whoop/domain/model/Session;->authToken:Lcom/whoop/domain/model/AuthToken;

    iget-object v3, p1, Lcom/whoop/domain/model/Session;->authToken:Lcom/whoop/domain/model/AuthToken;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/domain/model/Session;->user:Lcom/whoop/domain/model/User;

    iget-object p1, p1, Lcom/whoop/domain/model/Session;->user:Lcom/whoop/domain/model/User;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getAuthToken()Lcom/whoop/domain/model/AuthToken;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/Session;->authToken:Lcom/whoop/domain/model/AuthToken;

    return-object v0
.end method

.method public final getUser()Lcom/whoop/domain/model/User;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/Session;->user:Lcom/whoop/domain/model/User;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/domain/model/Session;->authToken:Lcom/whoop/domain/model/AuthToken;

    invoke-virtual {v0}, Lcom/whoop/domain/model/AuthToken;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/domain/model/Session;->user:Lcom/whoop/domain/model/User;

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/domain/model/Session;->user:Lcom/whoop/domain/model/User;

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getId()I

    move-result v0

    const-string v1, "Session ("

    const-string v2, ")"

    invoke-static {v0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
