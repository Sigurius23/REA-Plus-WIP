.class public final Lcom/whoop/analytics/strain/model/State$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/analytics/strain/model/State;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# static fields
.field private static final INIT_BIT_PREV_MAX_TIME:J = 0x1L


# instance fields
.field private anaState:Lcom/whoop/analytics/strain/model/AnalyticsState;

.field private initBits:J

.field private prevMaxTime:J

.field private userId:Ljava/lang/Integer;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x1

    .line 3
    iput-wide v0, p0, Lcom/whoop/analytics/strain/model/State$Builder;->initBits:J

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/analytics/strain/model/State$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/State$Builder;-><init>()V

    return-void
.end method

.method private checkRequiredAttributes()V
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/State$Builder;->initBits:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/hubspot/immutables/validation/InvalidImmutableStateException;

    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/State$Builder;->formatRequiredAttributesMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private formatRequiredAttributesMessage()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/State$Builder;->prevMaxTimeIsSet()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "prevMaxTime"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot build State, some of required attributes are not set "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private prevMaxTimeIsSet()Z
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/State$Builder;->initBits:J

    const-wide/16 v2, 0x1

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public build()Lcom/whoop/analytics/strain/model/State;
    .locals 6

    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/State$Builder;->checkRequiredAttributes()V

    new-instance v0, Lcom/whoop/analytics/strain/model/State;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/State$Builder;->userId:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/State$Builder;->anaState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    iget-wide v3, p0, Lcom/whoop/analytics/strain/model/State$Builder;->prevMaxTime:J

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/analytics/strain/model/State;-><init>(Ljava/lang/Integer;Lcom/whoop/analytics/strain/model/AnalyticsState;JLcom/whoop/analytics/strain/model/State$1;)V

    return-object v0
.end method

.method public final from(Lcom/whoop/analytics/strain/model/StateIF;)Lcom/whoop/analytics/strain/model/State$Builder;
    .locals 2

    const-string v0, "instance"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/StateIF;->getUserId()Ljava/util/Optional;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/State$Builder;->setUserId(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/State$Builder;

    :cond_0
    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/StateIF;->getAnaState()Ljava/util/Optional;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/State$Builder;->setAnaState(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/State$Builder;

    :cond_1
    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/StateIF;->getPrevMaxTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/whoop/analytics/strain/model/State$Builder;->setPrevMaxTime(J)Lcom/whoop/analytics/strain/model/State$Builder;

    return-object p0
.end method

.method public final setAnaState(Lcom/whoop/analytics/strain/model/AnalyticsState;)Lcom/whoop/analytics/strain/model/State$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/whoop/analytics/strain/model/State$Builder;->anaState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    return-object p0
.end method

.method public final setAnaState(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/State$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "+",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/State$Builder;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/analytics/strain/model/AnalyticsState;

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/State$Builder;->anaState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    return-object p0
.end method

.method public final setPrevMaxTime(J)Lcom/whoop/analytics/strain/model/State$Builder;
    .locals 2

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/State$Builder;->prevMaxTime:J

    iget-wide p1, p0, Lcom/whoop/analytics/strain/model/State$Builder;->initBits:J

    const-wide/16 v0, -0x2

    and-long/2addr p1, v0

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/State$Builder;->initBits:J

    return-object p0
.end method

.method public final setUserId(Ljava/lang/Integer;)Lcom/whoop/analytics/strain/model/State$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/whoop/analytics/strain/model/State$Builder;->userId:Ljava/lang/Integer;

    return-object p0
.end method

.method public final setUserId(Ljava/util/Optional;)Lcom/whoop/analytics/strain/model/State$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Optional<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/State$Builder;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/State$Builder;->userId:Ljava/lang/Integer;

    return-object p0
.end method
