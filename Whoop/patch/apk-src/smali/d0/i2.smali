.class public interface abstract Ld0/i2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/j2;


# virtual methods
.method public c(Ld0/r;Ld0/r;Ld0/r;)J
    .locals 2

    invoke-interface {p0}, Ld0/i2;->i()I

    move-result p1

    invoke-interface {p0}, Ld0/i2;->l()I

    move-result p2

    add-int/2addr p2, p1

    int-to-long p1, p2

    const-wide/32 v0, 0xf4240

    mul-long/2addr p1, v0

    return-wide p1
.end method

.method public abstract i()I
.end method

.method public abstract l()I
.end method
