.class public Lcom/whoop/service/network/model/cycles/Cycle;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final EPOCH:Lorg/joda/time/DateTime;


# instance fields
.field private transient daysList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/joda/time/LocalDate;",
            ">;"
        }
    .end annotation
.end field

.field private daysStringArray:[Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "days"
    .end annotation
.end field

.field private during:Lcom/whoop/service/network/model/cycles/Period;

.field private id:J

.field private lastUpdatedAt:Ljava/lang/String;

.field private transient lastUpdatedAtDateTime:Lorg/joda/time/DateTime;

.field private predictedEnd:Ljava/lang/String;

.field private transient predictedEndDateTime:Lorg/joda/time/DateTime;

.field private recovery:Lcom/whoop/service/network/model/cycles/Recovery;

.field private sleep:Lcom/whoop/service/network/model/cycles/Sleep;

.field private strain:Lcom/whoop/service/network/model/cycles/Strain;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lorg/joda/time/DateTime;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v1, 0x7de

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct/range {v0 .. v5}, Lorg/joda/time/DateTime;-><init>(IIIII)V

    sput-object v0, Lcom/whoop/service/network/model/cycles/Cycle;->EPOCH:Lorg/joda/time/DateTime;

    return-void
.end method

.method public constructor <init>(J[Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Strain;Lcom/whoop/service/network/model/cycles/Sleep;Lcom/whoop/service/network/model/cycles/Recovery;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/whoop/service/network/model/cycles/Cycle;->id:J

    iput-object p3, p0, Lcom/whoop/service/network/model/cycles/Cycle;->daysStringArray:[Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/service/network/model/cycles/Cycle;->during:Lcom/whoop/service/network/model/cycles/Period;

    iput-object p5, p0, Lcom/whoop/service/network/model/cycles/Cycle;->predictedEnd:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/service/network/model/cycles/Cycle;->lastUpdatedAt:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/service/network/model/cycles/Cycle;->strain:Lcom/whoop/service/network/model/cycles/Strain;

    iput-object p8, p0, Lcom/whoop/service/network/model/cycles/Cycle;->sleep:Lcom/whoop/service/network/model/cycles/Sleep;

    iput-object p9, p0, Lcom/whoop/service/network/model/cycles/Cycle;->recovery:Lcom/whoop/service/network/model/cycles/Recovery;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lcom/whoop/service/network/model/cycles/Cycle;

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->id:J

    check-cast p1, Lcom/whoop/service/network/model/cycles/Cycle;

    iget-wide v2, p1, Lcom/whoop/service/network/model/cycles/Cycle;->id:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getDays()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/joda/time/LocalDate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->daysList:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Cycle;->daysStringArray:[Ljava/lang/String;

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->daysList:Ljava/util/List;

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->daysStringArray:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    iget-object v4, p0, Lcom/whoop/service/network/model/cycles/Cycle;->daysList:Ljava/util/List;

    invoke-static {v3}, Lcom/whoop/ui/f;->m(Ljava/lang/String;)Lorg/joda/time/LocalDate;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->daysList:Ljava/util/List;

    return-object v0
.end method

.method public getDuring()Lcom/whoop/service/network/model/cycles/Period;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->during:Lcom/whoop/service/network/model/cycles/Period;

    return-object v0
.end method

.method public getFirstDate()Lorg/joda/time/LocalDate;
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Cycle;->getDays()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lce/w;->W(Ljava/util/List;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/joda/time/LocalDate;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getId()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->id:J

    return-wide v0
.end method

.method public getLastDate()Lorg/joda/time/LocalDate;
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Cycle;->getDays()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lce/w;->W(Ljava/util/List;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ld;->i(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/joda/time/LocalDate;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getLastUpdatedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->lastUpdatedAtDateTime:Lorg/joda/time/DateTime;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->lastUpdatedAt:Ljava/lang/String;

    invoke-static {v0}, Lorg/joda/time/DateTime;->parse(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->lastUpdatedAtDateTime:Lorg/joda/time/DateTime;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->lastUpdatedAtDateTime:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public getPredictedEnd()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->predictedEndDateTime:Lorg/joda/time/DateTime;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->predictedEnd:Ljava/lang/String;

    invoke-static {v0}, Lorg/joda/time/DateTime;->parse(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->predictedEndDateTime:Lorg/joda/time/DateTime;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->predictedEndDateTime:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public getRecovery()Lcom/whoop/service/network/model/cycles/Recovery;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->recovery:Lcom/whoop/service/network/model/cycles/Recovery;

    return-object v0
.end method

.method public getSignificantSleep()Lcom/whoop/service/network/model/cycles/SleepActivity;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->sleep:Lcom/whoop/service/network/model/cycles/Sleep;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/service/network/model/cycles/Sleep;->getSignificantSleep()Lcom/whoop/service/network/model/cycles/SleepActivity;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSleep()Lcom/whoop/service/network/model/cycles/Sleep;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->sleep:Lcom/whoop/service/network/model/cycles/Sleep;

    return-object v0
.end method

.method public getStrain()Lcom/whoop/service/network/model/cycles/Strain;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->strain:Lcom/whoop/service/network/model/cycles/Strain;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/cycles/Cycle;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cycle("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Cycle;->getFirstDate()Lorg/joda/time/LocalDate;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Cycle;->daysStringArray:[Ljava/lang/String;

    array-length v1, v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "{"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/Cycle;->daysStringArray:[Ljava/lang/String;

    array-length v2, v2

    const-string v3, "}"

    invoke-static {v1, v2, v3}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ") lastUpdatedAtDateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Cycle;->getLastUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Cycle;->recovery:Lcom/whoop/service/network/model/cycles/Recovery;

    if-nez v1, :cond_1

    const-string v1, " no recovery"

    goto :goto_1

    :cond_1
    const-string v1, " has recovery"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
