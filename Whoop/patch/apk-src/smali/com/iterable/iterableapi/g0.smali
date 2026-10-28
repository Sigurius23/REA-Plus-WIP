.class public final Lcom/iterable/iterableapi/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/iterable/iterableapi/g0;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    const/16 v0, 0x20

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "IterableIdentityResolution(replayOnVisitorToKnown=true, mergeOnUnknownToKnown=true)"

    return-object v0
.end method
