.class public final Lph/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lph/e;


# virtual methods
.method public final a(Lch/j;Lmh/k;)Lph/f;
    .locals 1

    new-instance v0, Lph/d;

    invoke-direct {v0, p1, p2}, Lph/d;-><init>(Lch/j;Lmh/k;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Lph/c;

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const-class v0, Lph/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
