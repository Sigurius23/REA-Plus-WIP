.class public final Lah/m;
.super Lah/d;
.source "SourceFile"


# instance fields
.field public final c:J


# direct methods
.method public constructor <init>(J)V
    .locals 1

    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lah/d;-><init>(I)V

    iput-wide p1, p0, Lah/m;->c:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Lah/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lah/m;

    invoke-super {p0, p1}, Lah/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-wide v2, p0, Lah/m;->c:J

    iget-wide v4, v0, Lah/m;->c:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    invoke-super {p0}, Lah/d;->hashCode()I

    move-result v0

    iget-wide v1, p0, Lah/m;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Tag("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lah/m;->c:J

    const-string v3, ")"

    invoke-static {v1, v2, v3, v0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
