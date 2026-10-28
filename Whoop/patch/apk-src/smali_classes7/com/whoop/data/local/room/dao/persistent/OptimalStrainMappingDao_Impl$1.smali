.class Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Ltb/c;Lcom/whoop/data/local/room/entity/OptimalStrainMapping;)V
    .locals 3

    .line 2
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->getRecovery()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->getLowerOptimalStrain()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    const/4 v0, 0x3

    .line 4
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->getOptimalStrain()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    const/4 v0, 0x4

    .line 5
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->getUpperOptimalStrain()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    const/4 v0, 0x5

    .line 6
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->getCycleId()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl$1;->bind(Ltb/c;Lcom/whoop/data/local/room/entity/OptimalStrainMapping;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `optimal_strain_mapping_table` (`recovery`,`lower_optimal_strain`,`optimal_strain`,`upper_optimal_strain`,`cycle_id`) VALUES (?,?,?,?,?)"

    return-object v0
.end method
