.class public final Lmw0/g$f;
.super Lmw0/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmw0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0008\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0014\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lmw0/g$f;",
        "Lmw0/g;",
        "",
        "sleepMetricTitleDisplay",
        "Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;",
        "toSleepDetailsKeyMetricTileType",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "b",
        "Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;",
        "()Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;",
        "core-details_release"
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
.field private final a:Ljava/lang/String;

.field private final b:Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;)V
    .locals 1

    const-string v0, "sleepMetricTitleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toSleepDetailsKeyMetricTileType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lmw0/g;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lmw0/g$f;->a:Ljava/lang/String;

    iput-object p2, p0, Lmw0/g$f;->b:Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmw0/g$f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;
    .locals 1

    iget-object v0, p0, Lmw0/g$f;->b:Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lmw0/g$f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lmw0/g$f;

    iget-object v1, p0, Lmw0/g$f;->a:Ljava/lang/String;

    iget-object v3, p1, Lmw0/g$f;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lmw0/g$f;->b:Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;

    iget-object p1, p1, Lmw0/g$f;->b:Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lmw0/g$f;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lmw0/g$f;->b:Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lmw0/g$f;->a:Ljava/lang/String;

    iget-object v1, p0, Lmw0/g$f;->b:Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "KeyMetricTile(sleepMetricTitleDisplay="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", toSleepDetailsKeyMetricTileType="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
