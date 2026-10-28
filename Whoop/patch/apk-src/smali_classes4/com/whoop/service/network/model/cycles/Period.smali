.class public Lcom/whoop/service/network/model/cycles/Period;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private lower:Ljava/lang/String;

.field private transient lowerDateTime:Lorg/joda/time/DateTime;

.field private upper:Ljava/lang/String;

.field private transient upperDateTime:Lorg/joda/time/DateTime;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/Period;->lower:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/service/network/model/cycles/Period;->upper:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/Period;->lowerDateTime:Lorg/joda/time/DateTime;

    .line 7
    iput-object p2, p0, Lcom/whoop/service/network/model/cycles/Period;->upperDateTime:Lorg/joda/time/DateTime;

    .line 8
    invoke-static {p1}, Lor2/n0;->b(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/Period;->lower:Ljava/lang/String;

    .line 9
    invoke-static {p2}, Lor2/n0;->b(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/Period;->upper:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/whoop/service/network/model/cycles/Period;

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Period;->getLower()Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/service/network/model/cycles/Period;->getLower()Lorg/joda/time/DateTime;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Period;->getUpper()Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/service/network/model/cycles/Period;->getUpper()Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public getLength()J
    .locals 4

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Period;->getUpper()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Period;->getLower()Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public getLower()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Period;->lowerDateTime:Lorg/joda/time/DateTime;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Period;->lower:Ljava/lang/String;

    invoke-static {v0}, Lorg/joda/time/DateTime;->parse(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/network/model/cycles/Period;->lowerDateTime:Lorg/joda/time/DateTime;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Period;->lowerDateTime:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public getUpper()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Period;->upperDateTime:Lorg/joda/time/DateTime;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Period;->upper:Ljava/lang/String;

    invoke-static {v0}, Lorg/joda/time/DateTime;->parse(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/network/model/cycles/Period;->upperDateTime:Lorg/joda/time/DateTime;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Period;->upperDateTime:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public getUpperNullable()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Period;->upperDateTime:Lorg/joda/time/DateTime;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Period;->upper:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Period;->getUpper()Lorg/joda/time/DateTime;

    move-result-object v0

    return-object v0
.end method

.method public hasValidLower()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Period;->lower:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasValidUpper()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Period;->upper:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Period;->getLower()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Period;->getUpper()Lorg/joda/time/DateTime;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Period{lower=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Period;->lower:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', lowerDateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Period;->lowerDateTime:Lorg/joda/time/DateTime;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", upper=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Period;->upper:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', upperDateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Period;->upperDateTime:Lorg/joda/time/DateTime;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
