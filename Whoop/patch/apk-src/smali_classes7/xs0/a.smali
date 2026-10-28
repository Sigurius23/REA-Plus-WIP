.class public final Lxs0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0015\u001a\u0004\u0008\u0011\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lxs0/a;",
        "",
        "",
        "isChargingStrap",
        "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;",
        "batteryPackType",
        "<init>",
        "(ZLcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;)V",
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
        "Z",
        "b",
        "()Z",
        "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;",
        "()Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;",
        "connectivity-core_release"
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
.field private final a:Z

.field private final b:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;


# direct methods
.method public constructor <init>(ZLcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lxs0/a;->a:Z

    .line 3
    iput-object p2, p0, Lxs0/a;->b:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    return-void
.end method

.method public synthetic constructor <init>(ZLcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lxs0/a;-><init>(ZLcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;
    .locals 1

    iget-object v0, p0, Lxs0/a;->b:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lxs0/a;->a:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lxs0/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lxs0/a;

    iget-boolean v1, p0, Lxs0/a;->a:Z

    iget-boolean v3, p1, Lxs0/a;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lxs0/a;->b:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    iget-object p1, p1, Lxs0/a;->b:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lxs0/a;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lxs0/a;->b:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, Lxs0/a;->a:Z

    iget-object v1, p0, Lxs0/a;->b:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "BatteryPackChargingStatus(isChargingStrap="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", batteryPackType="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
