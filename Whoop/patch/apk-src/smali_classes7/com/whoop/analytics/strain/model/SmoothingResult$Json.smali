.class final Lcom/whoop/analytics/strain/model/SmoothingResult$Json;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/analytics/strain/model/SmoothingResultIF;


# annotations
.annotation runtime Lcom/fasterxml/jackson/annotation/JsonAutoDetect;
    fieldVisibility = .enum Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->NONE:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/analytics/strain/model/SmoothingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Json"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field lastUsedIndex:I

.field lastUsedIndexIsSet:Z

.field lastUsedTime:J

.field lastUsedTimeIsSet:Z

.field smoothedHrs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Json;->smoothedHrs:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getLastUsedIndex()I
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getLastUsedTime()J
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getSmoothedHrs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public setLastUsedIndex(I)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iput p1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Json;->lastUsedIndex:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Json;->lastUsedIndexIsSet:Z

    return-void
.end method

.method public setLastUsedTime(J)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Json;->lastUsedTime:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Json;->lastUsedTimeIsSet:Z

    return-void
.end method

.method public setSmoothedHrs(Ljava/util/List;)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/SmoothingResult$Json;->smoothedHrs:Ljava/util/List;

    return-void
.end method
