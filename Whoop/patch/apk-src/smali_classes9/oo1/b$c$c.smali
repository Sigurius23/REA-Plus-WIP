.class public final Loo1/b$c$c;
.super Loo1/b$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loo1/b$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Loo1/b$c$c;",
        "Loo1/b$c;",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;",
        "networkState",
        "<init>",
        "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;)V",
        "",
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
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;",
        "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;",
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


# instance fields
.field private final a:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;


# direct methods
.method public constructor <init>(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;)V
    .locals 1

    const-string v0, "networkState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Loo1/b$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Loo1/b$c$c;->a:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;
    .locals 1

    iget-object v0, p0, Loo1/b$c$c;->a:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Loo1/b$c$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Loo1/b$c$c;

    iget-object v1, p0, Loo1/b$c$c;->a:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;

    iget-object p1, p1, Loo1/b$c$c;->a:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Loo1/b$c$c;->a:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Loo1/b$c$c;->a:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarNetworkState;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "UpdateDomainState(networkState="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
