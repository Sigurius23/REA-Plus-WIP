.class public final Lcom/whoop/analytics/strain/model/UserProfile$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/analytics/strain/model/UserProfile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# static fields
.field private static final INIT_BIT_BIOLOGICAL_SEX:J = 0x4L

.field private static final INIT_BIT_BIRTHDAY:J = 0x2L

.field private static final INIT_BIT_FITNESS_LEVEL:J = 0x8L

.field private static final INIT_BIT_HEIGHT:J = 0x10L

.field private static final INIT_BIT_ID:J = 0x1L

.field private static final INIT_BIT_MAX_HEART_RATE:J = 0x80L

.field private static final INIT_BIT_RESTING_HEART_RATE:J = 0x40L

.field private static final INIT_BIT_WEIGHT:J = 0x20L


# instance fields
.field private biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

.field private birthday:J

.field private fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

.field private height:D

.field private id:I

.field private initBits:J

.field private maxHeartRate:D

.field private restingHeartRate:D

.field private weight:D


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0xff

    .line 3
    iput-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/analytics/strain/model/UserProfile$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;-><init>()V

    return-void
.end method

.method private biologicalSexIsSet()Z
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    const-wide/16 v2, 0x4

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

.method private birthdayIsSet()Z
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    const-wide/16 v2, 0x2

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

.method private checkRequiredAttributes()V
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/hubspot/immutables/validation/InvalidImmutableStateException;

    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->formatRequiredAttributesMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private fitnessLevelIsSet()Z
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    const-wide/16 v2, 0x8

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

.method private formatRequiredAttributesMessage()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->idIsSet()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "id"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->birthdayIsSet()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "birthday"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->biologicalSexIsSet()Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "biologicalSex"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->fitnessLevelIsSet()Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "fitnessLevel"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->heightIsSet()Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "height"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->weightIsSet()Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "weight"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->restingHeartRateIsSet()Z

    move-result v1

    if-nez v1, :cond_6

    const-string v1, "restingHeartRate"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->maxHeartRateIsSet()Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "maxHeartRate"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot build UserProfile, some of required attributes are not set "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private heightIsSet()Z
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    const-wide/16 v2, 0x10

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

.method private idIsSet()Z
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

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

.method private maxHeartRateIsSet()Z
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    const-wide/16 v2, 0x80

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

.method private restingHeartRateIsSet()Z
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    const-wide/16 v2, 0x40

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

.method private weightIsSet()Z
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    const-wide/16 v2, 0x20

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
.method public build()Lcom/whoop/analytics/strain/model/UserProfile;
    .locals 15

    invoke-direct {p0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->checkRequiredAttributes()V

    new-instance v0, Lcom/whoop/analytics/strain/model/UserProfile;

    iget v1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->id:I

    iget-wide v2, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->birthday:J

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    iget-wide v6, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->height:D

    iget-wide v8, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->weight:D

    iget-wide v10, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->restingHeartRate:D

    iget-wide v12, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->maxHeartRate:D

    const/4 v14, 0x0

    invoke-direct/range {v0 .. v14}, Lcom/whoop/analytics/strain/model/UserProfile;-><init>(IJLcom/whoop/analytics/strain/model/BiologicalSex;Lcom/whoop/analytics/strain/model/FitnessLevel;DDDDLcom/whoop/analytics/strain/model/UserProfile$1;)V

    return-object v0
.end method

.method public final from(Lcom/whoop/analytics/strain/model/UserProfileIF;)Lcom/whoop/analytics/strain/model/UserProfile$Builder;
    .locals 2

    const-string v0, "instance"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/UserProfileIF;->getId()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setId(I)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/UserProfileIF;->getBirthday()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setBirthday(J)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/UserProfileIF;->getBiologicalSex()Lcom/whoop/analytics/strain/model/BiologicalSex;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setBiologicalSex(Lcom/whoop/analytics/strain/model/BiologicalSex;)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/UserProfileIF;->getFitnessLevel()Lcom/whoop/analytics/strain/model/FitnessLevel;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setFitnessLevel(Lcom/whoop/analytics/strain/model/FitnessLevel;)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/UserProfileIF;->getHeight()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setHeight(D)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/UserProfileIF;->getWeight()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setWeight(D)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/UserProfileIF;->getRestingHeartRate()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setRestingHeartRate(D)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    invoke-interface {p1}, Lcom/whoop/analytics/strain/model/UserProfileIF;->getMaxHeartRate()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setMaxHeartRate(D)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    return-object p0
.end method

.method public final setBiologicalSex(Lcom/whoop/analytics/strain/model/BiologicalSex;)Lcom/whoop/analytics/strain/model/UserProfile$Builder;
    .locals 4

    const-string v0, "biologicalSex"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    const-wide/16 v2, -0x5

    and-long/2addr v0, v2

    iput-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    return-object p0
.end method

.method public final setBirthday(J)Lcom/whoop/analytics/strain/model/UserProfile$Builder;
    .locals 2

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->birthday:J

    iget-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    const-wide/16 v0, -0x3

    and-long/2addr p1, v0

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    return-object p0
.end method

.method public final setFitnessLevel(Lcom/whoop/analytics/strain/model/FitnessLevel;)Lcom/whoop/analytics/strain/model/UserProfile$Builder;
    .locals 4

    const-string v0, "fitnessLevel"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    const-wide/16 v2, -0x9

    and-long/2addr v0, v2

    iput-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    return-object p0
.end method

.method public final setHeight(D)Lcom/whoop/analytics/strain/model/UserProfile$Builder;
    .locals 2

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->height:D

    iget-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    const-wide/16 v0, -0x11

    and-long/2addr p1, v0

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    return-object p0
.end method

.method public final setId(I)Lcom/whoop/analytics/strain/model/UserProfile$Builder;
    .locals 4

    iput p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->id:I

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    const-wide/16 v2, -0x2

    and-long/2addr v0, v2

    iput-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    return-object p0
.end method

.method public final setMaxHeartRate(D)Lcom/whoop/analytics/strain/model/UserProfile$Builder;
    .locals 2

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->maxHeartRate:D

    iget-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    const-wide/16 v0, -0x81

    and-long/2addr p1, v0

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    return-object p0
.end method

.method public final setRestingHeartRate(D)Lcom/whoop/analytics/strain/model/UserProfile$Builder;
    .locals 2

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->restingHeartRate:D

    iget-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    const-wide/16 v0, -0x41

    and-long/2addr p1, v0

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    return-object p0
.end method

.method public final setWeight(D)Lcom/whoop/analytics/strain/model/UserProfile$Builder;
    .locals 2

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->weight:D

    iget-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    const-wide/16 v0, -0x21

    and-long/2addr p1, v0

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->initBits:J

    return-object p0
.end method
