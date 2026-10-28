.class public final Lj92/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0013\u0008\u0080\u0008\u0018\u00002\u00020\u0001B7\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001a\u001a\u0004\u0008\u001d\u0010\u001cR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001e\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010!\u001a\u0004\u0008\u0016\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lj92/s;",
        "",
        "Lcom/whoop/domain/model/AuthMaterial;",
        "authMaterial",
        "",
        "differentOperationHandlesSuccessfulRefreshCall",
        "shouldSignUserOut",
        "Lj92/j;",
        "metric",
        "Lor2/d;",
        "analyticEvent",
        "<init>",
        "(Lcom/whoop/domain/model/AuthMaterial;ZZLj92/j;Lor2/d;)V",
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
        "Lcom/whoop/domain/model/AuthMaterial;",
        "b",
        "()Lcom/whoop/domain/model/AuthMaterial;",
        "Z",
        "c",
        "()Z",
        "e",
        "d",
        "Lj92/j;",
        "()Lj92/j;",
        "Lor2/d;",
        "()Lor2/d;",
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
.field private final a:Lcom/whoop/domain/model/AuthMaterial;

.field private final b:Z

.field private final c:Z

.field private final d:Lj92/j;

.field private final e:Lor2/d;


# direct methods
.method public constructor <init>(Lcom/whoop/domain/model/AuthMaterial;ZZLj92/j;Lor2/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj92/s;->a:Lcom/whoop/domain/model/AuthMaterial;

    iput-boolean p2, p0, Lj92/s;->b:Z

    iput-boolean p3, p0, Lj92/s;->c:Z

    iput-object p4, p0, Lj92/s;->d:Lj92/j;

    iput-object p5, p0, Lj92/s;->e:Lor2/d;

    return-void
.end method


# virtual methods
.method public final a()Lor2/d;
    .locals 1

    iget-object v0, p0, Lj92/s;->e:Lor2/d;

    return-object v0
.end method

.method public final b()Lcom/whoop/domain/model/AuthMaterial;
    .locals 1

    iget-object v0, p0, Lj92/s;->a:Lcom/whoop/domain/model/AuthMaterial;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lj92/s;->b:Z

    return v0
.end method

.method public final d()Lj92/j;
    .locals 1

    iget-object v0, p0, Lj92/s;->d:Lj92/j;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lj92/s;->c:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj92/s;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lj92/s;

    iget-object v1, p0, Lj92/s;->a:Lcom/whoop/domain/model/AuthMaterial;

    iget-object v3, p1, Lj92/s;->a:Lcom/whoop/domain/model/AuthMaterial;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lj92/s;->b:Z

    iget-boolean v3, p1, Lj92/s;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lj92/s;->c:Z

    iget-boolean v3, p1, Lj92/s;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lj92/s;->d:Lj92/j;

    iget-object v3, p1, Lj92/s;->d:Lj92/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lj92/s;->e:Lor2/d;

    iget-object p1, p1, Lj92/s;->e:Lor2/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lj92/s;->a:Lcom/whoop/domain/model/AuthMaterial;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/domain/model/AuthMaterial;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lj92/s;->b:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lj92/s;->c:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lj92/s;->d:Lj92/j;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lj92/s;->e:Lor2/d;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lj92/s;->a:Lcom/whoop/domain/model/AuthMaterial;

    iget-boolean v1, p0, Lj92/s;->b:Z

    iget-boolean v2, p0, Lj92/s;->c:Z

    iget-object v3, p0, Lj92/s;->d:Lj92/j;

    iget-object v4, p0, Lj92/s;->e:Lor2/d;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "TokenRefreshResult(authMaterial="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", differentOperationHandlesSuccessfulRefreshCall="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", shouldSignUserOut="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", metric="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", analyticEvent="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
