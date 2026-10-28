.class final Lcom/whoop/analytics/strain/model/State$Json;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/analytics/strain/model/StateIF;


# annotations
.annotation runtime Lcom/fasterxml/jackson/annotation/JsonAutoDetect;
    fieldVisibility = .enum Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->NONE:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/analytics/strain/model/State;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Json"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field anaState:Ljava/util/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Optional<",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;",
            ">;"
        }
    .end annotation
.end field

.field prevMaxTime:J

.field prevMaxTimeIsSet:Z

.field userId:Ljava/util/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Optional<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/analytics/strain/model/State$Json;->userId:Ljava/util/Optional;

    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/analytics/strain/model/State$Json;->anaState:Ljava/util/Optional;

    return-void
.end method


# virtual methods
.method public getAnaState()Ljava/util/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Optional<",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getPrevMaxTime()J
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getUserId()Ljava/util/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Optional<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public setAnaState(Ljava/util/Optional;)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/State$Json;->anaState:Ljava/util/Optional;

    return-void
.end method

.method public setPrevMaxTime(J)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/State$Json;->prevMaxTime:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/analytics/strain/model/State$Json;->prevMaxTimeIsSet:Z

    return-void
.end method

.method public setUserId(Ljava/util/Optional;)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/State$Json;->userId:Ljava/util/Optional;

    return-void
.end method
