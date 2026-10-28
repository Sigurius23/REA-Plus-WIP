.class public final Lcom/whoop/analytics/strain/model/State;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/analytics/strain/model/StateIF;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/analytics/strain/model/State$Builder;,
        Lcom/whoop/analytics/strain/model/State$Json;
    }
.end annotation

.annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
.end annotation


# instance fields
.field private final anaState:Lcom/whoop/analytics/strain/model/AnalyticsState;

.field private final prevMaxTime:J

.field private final userId:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Ljava/lang/Integer;Lcom/whoop/analytics/strain/model/AnalyticsState;J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/analytics/strain/model/State;->userId:Ljava/lang/Integer;

    .line 4
    iput-object p2, p0, Lcom/whoop/analytics/strain/model/State;->anaState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    .line 5
    iput-wide p3, p0, Lcom/whoop/analytics/strain/model/State;->prevMaxTime:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;Lcom/whoop/analytics/strain/model/AnalyticsState;JLcom/whoop/analytics/strain/model/State$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/analytics/strain/model/State;-><init>(Ljava/lang/Integer;Lcom/whoop/analytics/strain/model/AnalyticsState;J)V

    return-void
.end method

.method public static builder()Lcom/whoop/analytics/strain/model/State$Builder;
    .locals 2

    new-instance v0, Lcom/whoop/analytics/strain/model/State$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/analytics/strain/model/State$Builder;-><init>(Lcom/whoop/analytics/strain/model/State$1;)V

    return-object v0
.end method

.method public static copyOf(Lcom/whoop/analytics/strain/model/StateIF;)Lcom/whoop/analytics/strain/model/State;
    .locals 1

    instance-of v0, p0, Lcom/whoop/analytics/strain/model/State;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/analytics/strain/model/State;

    return-object p0

    :cond_0
    invoke-static {}, Lcom/whoop/analytics/strain/model/State;->builder()Lcom/whoop/analytics/strain/model/State$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/whoop/analytics/strain/model/State$Builder;->from(Lcom/whoop/analytics/strain/model/StateIF;)Lcom/whoop/analytics/strain/model/State$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/State$Builder;->build()Lcom/whoop/analytics/strain/model/State;

    move-result-object p0

    return-object p0
.end method

.method private equalTo(Lcom/whoop/analytics/strain/model/State;)Z
    .locals 4

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/State;->userId:Ljava/lang/Integer;

    iget-object v1, p1, Lcom/whoop/analytics/strain/model/State;->userId:Ljava/lang/Integer;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/State;->anaState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    iget-object v1, p1, Lcom/whoop/analytics/strain/model/State;->anaState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/State;->prevMaxTime:J

    iget-wide v2, p1, Lcom/whoop/analytics/strain/model/State;->prevMaxTime:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static fromJson(Lcom/whoop/analytics/strain/model/State$Json;)Lcom/whoop/analytics/strain/model/State;
    .locals 3
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
        mode = .enum Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;->DELEGATING:Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lcom/whoop/analytics/strain/model/State;->builder()Lcom/whoop/analytics/strain/model/State$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/State$Json;->userId:Ljava/util/Optional;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/State$Builder;->setUserId(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/State$Builder;

    :cond_0
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/State$Json;->anaState:Ljava/util/Optional;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/State$Builder;->setAnaState(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/State$Builder;

    :cond_1
    iget-boolean v1, p0, Lcom/whoop/analytics/strain/model/State$Json;->prevMaxTimeIsSet:Z

    if-eqz v1, :cond_2

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/State$Json;->prevMaxTime:J

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/State$Builder;->setPrevMaxTime(J)Lcom/whoop/analytics/strain/model/State$Builder;

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/analytics/strain/model/State$Builder;->build()Lcom/whoop/analytics/strain/model/State;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/analytics/strain/model/State;

    if-eqz v1, :cond_1

    check-cast p1, Lcom/whoop/analytics/strain/model/State;

    invoke-direct {p0, p1}, Lcom/whoop/analytics/strain/model/State;->equalTo(Lcom/whoop/analytics/strain/model/State;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public getAnaState()Ljava/util/Optional;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Optional<",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/State;->anaState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-static {v0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    return-object v0
.end method

.method public getPrevMaxTime()J
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/State;->prevMaxTime:J

    return-wide v0
.end method

.method public getUserId()Ljava/util/Optional;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Optional<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/State;->userId:Ljava/lang/Integer;

    invoke-static {v0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/State;->userId:Ljava/lang/Integer;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x2b5a5

    add-int/2addr v0, v1

    shl-int/lit8 v1, v0, 0x5

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/State;->anaState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-static {v2}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v2, v0

    shl-int/lit8 v0, v2, 0x5

    iget-wide v3, p0, Lcom/whoop/analytics/strain/model/State;->prevMaxTime:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "State{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/State;->userId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    const-string v1, "userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/State;->userId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/State;->anaState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    const-string v2, ", "

    const/4 v3, 0x6

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-le v1, v3, :cond_1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v1, "anaState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/State;->anaState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-le v1, v3, :cond_3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    const-string v1, "prevMaxTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/State;->prevMaxTime:J

    const-string v3, "}"

    invoke-static {v1, v2, v3, v0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final withAnaState(Lcom/whoop/analytics/strain/model/AnalyticsState;)Lcom/whoop/analytics/strain/model/State;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/State;->anaState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    if-ne v0, p1, :cond_0

    return-object p0

    .line 2
    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/State;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/State;->userId:Ljava/lang/Integer;

    iget-wide v2, p0, Lcom/whoop/analytics/strain/model/State;->prevMaxTime:J

    invoke-direct {v0, v1, p1, v2, v3}, Lcom/whoop/analytics/strain/model/State;-><init>(Ljava/lang/Integer;Lcom/whoop/analytics/strain/model/AnalyticsState;J)V

    return-object v0
.end method

.method public final withAnaState(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/State;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "+",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/State;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/analytics/strain/model/AnalyticsState;

    .line 4
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/State;->anaState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    if-ne v0, p1, :cond_0

    return-object p0

    .line 5
    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/State;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/State;->userId:Ljava/lang/Integer;

    iget-wide v2, p0, Lcom/whoop/analytics/strain/model/State;->prevMaxTime:J

    invoke-direct {v0, v1, p1, v2, v3}, Lcom/whoop/analytics/strain/model/State;-><init>(Ljava/lang/Integer;Lcom/whoop/analytics/strain/model/AnalyticsState;J)V

    return-object v0
.end method

.method public final withPrevMaxTime(J)Lcom/whoop/analytics/strain/model/State;
    .locals 3

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/State;->prevMaxTime:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/State;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/State;->userId:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/State;->anaState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/whoop/analytics/strain/model/State;-><init>(Ljava/lang/Integer;Lcom/whoop/analytics/strain/model/AnalyticsState;J)V

    return-object v0
.end method

.method public final withUserId(Ljava/lang/Integer;)Lcom/whoop/analytics/strain/model/State;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/State;->userId:Ljava/lang/Integer;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 2
    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/State;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/State;->anaState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    iget-wide v2, p0, Lcom/whoop/analytics/strain/model/State;->prevMaxTime:J

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/whoop/analytics/strain/model/State;-><init>(Ljava/lang/Integer;Lcom/whoop/analytics/strain/model/AnalyticsState;J)V

    return-object v0
.end method

.method public final withUserId(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/State;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/State;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    .line 4
    iget-object v0, p0, Lcom/whoop/analytics/strain/model/State;->userId:Ljava/lang/Integer;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 5
    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/State;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/State;->anaState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    iget-wide v2, p0, Lcom/whoop/analytics/strain/model/State;->prevMaxTime:J

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/whoop/analytics/strain/model/State;-><init>(Ljava/lang/Integer;Lcom/whoop/analytics/strain/model/AnalyticsState;J)V

    return-object v0
.end method
