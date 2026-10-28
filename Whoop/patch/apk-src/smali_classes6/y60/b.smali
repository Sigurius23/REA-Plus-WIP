.class public final Ly60/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\'\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Ly60/b;",
        "",
        "Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;",
        "response",
        "",
        "isLoading",
        "isError",
        "<init>",
        "(Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;ZZ)V",
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
        "Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;",
        "()Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;",
        "b",
        "Z",
        "c",
        "()Z",
        "activation_release"
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
.field private final a:Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;

.field private final b:Z

.field private final c:Z


# direct methods
.method public constructor <init>(Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly60/b;->a:Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;

    .line 3
    iput-boolean p2, p0, Ly60/b;->b:Z

    .line 4
    iput-boolean p3, p0, Ly60/b;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move p3, v0

    .line 5
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Ly60/b;-><init>(Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;ZZ)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;
    .locals 1

    iget-object v0, p0, Ly60/b;->a:Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Ly60/b;->c:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Ly60/b;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly60/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly60/b;

    iget-object v1, p0, Ly60/b;->a:Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;

    iget-object v3, p1, Ly60/b;->a:Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Ly60/b;->b:Z

    iget-boolean v3, p1, Ly60/b;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Ly60/b;->c:Z

    iget-boolean p1, p1, Ly60/b;->c:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ly60/b;->a:Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ly60/b;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Ly60/b;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Ly60/b;->a:Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;

    iget-boolean v1, p0, Ly60/b;->b:Z

    iget-boolean v2, p0, Ly60/b;->c:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "DayZeroSplashDomainResult(response="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isLoading="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isError="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
