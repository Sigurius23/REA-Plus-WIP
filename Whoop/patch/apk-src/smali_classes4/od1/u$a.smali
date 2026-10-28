.class public final Lod1/u$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lod1/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0013\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u0017\u0010\u000bR\u0011\u0010\u001d\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u000bR\u0011\u0010\u001e\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u000bR\u0011\u0010\u001f\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u000bR\u0011\u0010!\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u000b\u00a8\u0006\""
    }
    d2 = {
        "Lod1/u$a;",
        "",
        "Lcom/whoop/domain/model/Session;",
        "oldSession",
        "newSession",
        "lastActiveSession",
        "",
        "isInitialSwitch",
        "<init>",
        "(Lcom/whoop/domain/model/Session;Lcom/whoop/domain/model/Session;Lcom/whoop/domain/model/Session;Z)V",
        "g",
        "()Z",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/domain/model/Session;",
        "b",
        "()Lcom/whoop/domain/model/Session;",
        "c",
        "d",
        "Z",
        "f",
        "isUserLogin",
        "isNewUser",
        "isLastActiveUser",
        "e",
        "isUserChange",
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
.field private final a:Lcom/whoop/domain/model/Session;

.field private final b:Lcom/whoop/domain/model/Session;

.field private final c:Lcom/whoop/domain/model/Session;

.field private final d:Z


# direct methods
.method public constructor <init>(Lcom/whoop/domain/model/Session;Lcom/whoop/domain/model/Session;Lcom/whoop/domain/model/Session;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lod1/u$a;->a:Lcom/whoop/domain/model/Session;

    iput-object p2, p0, Lod1/u$a;->b:Lcom/whoop/domain/model/Session;

    iput-object p3, p0, Lod1/u$a;->c:Lcom/whoop/domain/model/Session;

    iput-boolean p4, p0, Lod1/u$a;->d:Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/domain/model/Session;
    .locals 1

    iget-object v0, p0, Lod1/u$a;->b:Lcom/whoop/domain/model/Session;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lod1/u$a;->d:Z

    return v0
.end method

.method public final c()Z
    .locals 2

    iget-object v0, p0, Lod1/u$a;->b:Lcom/whoop/domain/model/Session;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lod1/u$a;->c:Lcom/whoop/domain/model/Session;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getId()I

    move-result v0

    iget-object v1, p0, Lod1/u$a;->b:Lcom/whoop/domain/model/Session;

    invoke-virtual {v1}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lod1/u$a;->b:Lcom/whoop/domain/model/Session;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lod1/u$a;->a:Lcom/whoop/domain/model/Session;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getId()I

    move-result v0

    iget-object v1, p0, Lod1/u$a;->b:Lcom/whoop/domain/model/Session;

    invoke-virtual {v1}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getId()I

    move-result v1

    if-eq v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final e()Z
    .locals 1

    invoke-virtual {p0}, Lod1/u$a;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lod1/u$a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lod1/u$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lod1/u$a;

    iget-object v1, p0, Lod1/u$a;->a:Lcom/whoop/domain/model/Session;

    iget-object v3, p1, Lod1/u$a;->a:Lcom/whoop/domain/model/Session;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lod1/u$a;->b:Lcom/whoop/domain/model/Session;

    iget-object v3, p1, Lod1/u$a;->b:Lcom/whoop/domain/model/Session;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lod1/u$a;->c:Lcom/whoop/domain/model/Session;

    iget-object v3, p1, Lod1/u$a;->c:Lcom/whoop/domain/model/Session;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lod1/u$a;->d:Z

    iget-boolean p1, p1, Lod1/u$a;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lod1/u$a;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lod1/u$a;->b:Lcom/whoop/domain/model/Session;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lod1/u$a;->a:Lcom/whoop/domain/model/Session;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g()Z
    .locals 3

    iget-object v0, p0, Lod1/u$a;->b:Lcom/whoop/domain/model/Session;

    if-eqz v0, :cond_0

    new-instance v1, Lz92/e;

    invoke-virtual {v0}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object v0

    invoke-direct {v1, v0}, Lz92/e;-><init>(Lcom/whoop/domain/model/User;)V

    iget-object v0, p0, Lod1/u$a;->c:Lcom/whoop/domain/model/Session;

    if-eqz v0, :cond_0

    new-instance v2, Lz92/e;

    invoke-virtual {v0}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object v0

    invoke-direct {v2, v0}, Lz92/e;-><init>(Lcom/whoop/domain/model/User;)V

    invoke-virtual {v1, v2}, Lz92/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lod1/u$a;->a:Lcom/whoop/domain/model/Session;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/domain/model/Session;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lod1/u$a;->b:Lcom/whoop/domain/model/Session;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/domain/model/Session;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lod1/u$a;->c:Lcom/whoop/domain/model/Session;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/domain/model/Session;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lod1/u$a;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lod1/u$a;->a:Lcom/whoop/domain/model/Session;

    iget-object v1, p0, Lod1/u$a;->b:Lcom/whoop/domain/model/Session;

    iget-object v2, p0, Lod1/u$a;->c:Lcom/whoop/domain/model/Session;

    iget-boolean v3, p0, Lod1/u$a;->d:Z

    invoke-virtual {p0}, Lod1/u$a;->f()Z

    move-result v4

    invoke-virtual {p0}, Lod1/u$a;->d()Z

    move-result v5

    invoke-virtual {p0}, Lod1/u$a;->c()Z

    move-result v6

    invoke-virtual {p0}, Lod1/u$a;->g()Z

    move-result v7

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "oldSession= "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " newSession= "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " lastActiveSession= "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " isInitialSwitch="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " isUserLogin= "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " isNewUser= "

    const-string v1, " isLastActiveUser="

    invoke-static {v8, v4, v0, v5, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " userInfoUpdated="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
