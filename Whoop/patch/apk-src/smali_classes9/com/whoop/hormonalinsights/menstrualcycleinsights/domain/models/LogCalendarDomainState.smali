.class public final Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J3\u0010\u0013\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u0014\u001a\u00020\u00052\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u00d6\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0004H\u00d6\u0081\u0004R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u000f\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;",
        "",
        "periodOverrides",
        "",
        "",
        "",
        "networkState",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;",
        "isSaveEnabled",
        "<init>",
        "(Ljava/util/Map;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;Z)V",
        "getPeriodOverrides",
        "()Ljava/util/Map;",
        "getNetworkState",
        "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;",
        "()Z",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "hormonal-insights_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final isSaveEnabled:Z

.field private final networkState:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;

.field private final periodOverrides:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;",
            "Z)V"
        }
    .end annotation

    const-string v0, "periodOverrides"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->periodOverrides:Ljava/util/Map;

    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->networkState:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;

    iput-boolean p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->isSaveEnabled:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;Ljava/util/Map;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;ZILjava/lang/Object;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->periodOverrides:Ljava/util/Map;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->networkState:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->isSaveEnabled:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->copy(Ljava/util/Map;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;Z)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->periodOverrides:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->networkState:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->isSaveEnabled:Z

    return v0
.end method

.method public final copy(Ljava/util/Map;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;Z)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;",
            "Z)",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;"
        }
    .end annotation

    const-string v0, "periodOverrides"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;-><init>(Ljava/util/Map;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->periodOverrides:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->periodOverrides:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->networkState:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->networkState:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->isSaveEnabled:Z

    iget-boolean p1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->isSaveEnabled:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getNetworkState()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->networkState:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;

    return-object v0
.end method

.method public final getPeriodOverrides()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->periodOverrides:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->periodOverrides:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->networkState:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->isSaveEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final isSaveEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->isSaveEnabled:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->periodOverrides:Ljava/util/Map;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->networkState:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;

    iget-boolean v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;->isSaveEnabled:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "LogCalendarDomainState(periodOverrides="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", networkState="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isSaveEnabled="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
