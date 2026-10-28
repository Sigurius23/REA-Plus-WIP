.class public final Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0006\n\u0002\u0008\u0013\u0018\u00002\u00020\u0001B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u0011\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u000f\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\n\u0010\u0008J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u0008J\u000f\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\u0008R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u000f\u001a\u0004\u0008\u0015\u0010\u0011\"\u0004\u0008\u0016\u0010\u0013R$\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u000f\u001a\u0004\u0008\u0018\u0010\u0011\"\u0004\u0008\u0019\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u000f\u001a\u0004\u0008\u001b\u0010\u0011\"\u0004\u0008\u001c\u0010\u0013R$\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u000f\u001a\u0004\u0008\u001e\u0010\u0011\"\u0004\u0008\u001f\u0010\u0013\u00a8\u0006 "
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;",
        "",
        "<init>",
        "()V",
        "sleepNeedBreakdown",
        "(Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;)V",
        "Lor2/z1;",
        "getBaselineDuration",
        "()Lor2/z1;",
        "getDebtDuration",
        "getNapsDuration",
        "getStrainDuration",
        "getTotalDuration",
        "",
        "baseline",
        "Ljava/lang/Double;",
        "getBaseline",
        "()Ljava/lang/Double;",
        "setBaseline",
        "(Ljava/lang/Double;)V",
        "debt",
        "getDebt",
        "setDebt",
        "naps",
        "getNaps",
        "setNaps",
        "strain",
        "getStrain",
        "setStrain",
        "total",
        "getTotal",
        "setTotal",
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
.field private baseline:Ljava/lang/Double;

.field private debt:Ljava/lang/Double;

.field private naps:Ljava/lang/Double;

.field private strain:Ljava/lang/Double;

.field private total:Ljava/lang/Double;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;)V
    .locals 1

    const-string v0, "sleepNeedBreakdown"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget-object v0, p1, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->baseline:Ljava/lang/Double;

    iput-object v0, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->baseline:Ljava/lang/Double;

    .line 4
    iget-object v0, p1, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->debt:Ljava/lang/Double;

    iput-object v0, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->debt:Ljava/lang/Double;

    .line 5
    iget-object v0, p1, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->naps:Ljava/lang/Double;

    iput-object v0, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->naps:Ljava/lang/Double;

    .line 6
    iget-object v0, p1, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->strain:Ljava/lang/Double;

    iput-object v0, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->strain:Ljava/lang/Double;

    .line 7
    iget-object p1, p1, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->total:Ljava/lang/Double;

    iput-object p1, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->total:Ljava/lang/Double;

    return-void
.end method


# virtual methods
.method public final getBaseline()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->baseline:Ljava/lang/Double;

    return-object v0
.end method

.method public final getBaselineDuration()Lor2/z1;
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->baseline:Ljava/lang/Double;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    new-instance v2, Lor2/z1;

    invoke-direct {v2, v0, v1}, Lor2/z1;-><init>(D)V

    invoke-virtual {v2}, Lor2/z1;->a()Lor2/z1;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getDebt()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->debt:Ljava/lang/Double;

    return-object v0
.end method

.method public final getDebtDuration()Lor2/z1;
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->debt:Ljava/lang/Double;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    new-instance v2, Lor2/z1;

    invoke-direct {v2, v0, v1}, Lor2/z1;-><init>(D)V

    invoke-virtual {v2}, Lor2/z1;->a()Lor2/z1;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getNaps()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->naps:Ljava/lang/Double;

    return-object v0
.end method

.method public final getNapsDuration()Lor2/z1;
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->naps:Ljava/lang/Double;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    new-instance v2, Lor2/z1;

    invoke-direct {v2, v0, v1}, Lor2/z1;-><init>(D)V

    invoke-virtual {v2}, Lor2/z1;->a()Lor2/z1;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getStrain()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->strain:Ljava/lang/Double;

    return-object v0
.end method

.method public final getStrainDuration()Lor2/z1;
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->strain:Ljava/lang/Double;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    new-instance v2, Lor2/z1;

    invoke-direct {v2, v0, v1}, Lor2/z1;-><init>(D)V

    invoke-virtual {v2}, Lor2/z1;->a()Lor2/z1;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTotal()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->total:Ljava/lang/Double;

    return-object v0
.end method

.method public final getTotalDuration()Lor2/z1;
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->total:Ljava/lang/Double;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    new-instance v2, Lor2/z1;

    invoke-direct {v2, v0, v1}, Lor2/z1;-><init>(D)V

    invoke-virtual {v2}, Lor2/z1;->a()Lor2/z1;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final setBaseline(Ljava/lang/Double;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->baseline:Ljava/lang/Double;

    return-void
.end method

.method public final setDebt(Ljava/lang/Double;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->debt:Ljava/lang/Double;

    return-void
.end method

.method public final setNaps(Ljava/lang/Double;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->naps:Ljava/lang/Double;

    return-void
.end method

.method public final setStrain(Ljava/lang/Double;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->strain:Ljava/lang/Double;

    return-void
.end method

.method public final setTotal(Ljava/lang/Double;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;->total:Ljava/lang/Double;

    return-void
.end method
