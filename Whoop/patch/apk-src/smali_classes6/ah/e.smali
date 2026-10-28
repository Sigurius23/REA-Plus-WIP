.class public final Lah/e;
.super Lah/k;
.source "SourceFile"


# instance fields
.field public final e:D


# direct methods
.method public constructor <init>(D)V
    .locals 1

    sget-object v0, Lah/l;->E:Lah/l;

    invoke-direct {p0, v0}, Lah/k;-><init>(Lah/l;)V

    iput-wide p1, p0, Lah/e;->e:D

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Lah/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lah/e;

    invoke-super {p0, p1}, Lah/k;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-wide v2, p0, Lah/e;->e:D

    iget-wide v4, v0, Lah/e;->e:D

    cmpl-double p1, v2, v4

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    invoke-super {p0}, Lah/k;->hashCode()I

    move-result v0

    iget-wide v1, p0, Lah/e;->e:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, Lah/e;->e:D

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
