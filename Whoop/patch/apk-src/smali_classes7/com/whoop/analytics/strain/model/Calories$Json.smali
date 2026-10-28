.class final Lcom/whoop/analytics/strain/model/Calories$Json;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/analytics/strain/model/CaloriesIF;


# annotations
.annotation runtime Lcom/fasterxml/jackson/annotation/JsonAutoDetect;
    fieldVisibility = .enum Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->NONE:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/analytics/strain/model/Calories;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Json"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field totalKilocalories:D

.field totalKilocaloriesIsSet:Z

.field totalKilojoules:D

.field totalKilojoulesIsSet:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getTotalKilocalories()D
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getTotalKilojoules()D
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public setTotalKilocalories(D)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/Calories$Json;->totalKilocalories:D

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/analytics/strain/model/Calories$Json;->totalKilocaloriesIsSet:Z

    return-void
.end method

.method public setTotalKilojoules(D)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/Calories$Json;->totalKilojoules:D

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/analytics/strain/model/Calories$Json;->totalKilojoulesIsSet:Z

    return-void
.end method
