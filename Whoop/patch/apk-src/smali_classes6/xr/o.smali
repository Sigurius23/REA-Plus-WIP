.class public final Lxr/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:J


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lxr/o;->a:I

    iput-wide p2, p0, Lxr/o;->b:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lxr/o;

    if-eqz v0, :cond_1

    check-cast p1, Lxr/o;

    iget v0, p0, Lxr/o;->a:I

    iget v1, p1, Lxr/o;->a:I

    if-ne v0, v1, :cond_1

    iget-wide v0, p0, Lxr/o;->b:J

    iget-wide v2, p1, Lxr/o;->b:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 5

    const/16 v0, 0x20

    iget-wide v1, p0, Lxr/o;->b:J

    ushr-long v3, v1, v0

    xor-long v0, v3, v1

    iget v2, p0, Lxr/o;->a:I

    const v3, 0xf4243

    xor-int/2addr v2, v3

    mul-int/2addr v2, v3

    long-to-int v0, v0

    xor-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EventRecord{eventType="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lxr/o;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", eventTimestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lxr/o;->b:J

    const-string v3, "}"

    invoke-static {v1, v2, v3, v0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
