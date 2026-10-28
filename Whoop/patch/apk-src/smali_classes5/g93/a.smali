.class public abstract Lg93/a;
.super Lg93/d;
.source "SourceFile"


# virtual methods
.method public final a(I)I
    .locals 1

    invoke-virtual {p0}, Lg93/a;->i()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    invoke-static {v0, p1}, Lo73/a;->a0(II)I

    move-result p1

    return p1
.end method

.method public final b()D
    .locals 2

    invoke-virtual {p0}, Lg93/a;->i()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextDouble()D

    move-result-wide v0

    return-wide v0
.end method

.method public final e()F
    .locals 1

    invoke-virtual {p0}, Lg93/a;->i()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F

    move-result v0

    return v0
.end method

.method public final f()I
    .locals 1

    invoke-virtual {p0}, Lg93/a;->i()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    return v0
.end method

.method public final g(I)I
    .locals 1

    invoke-virtual {p0}, Lg93/a;->i()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    return p1
.end method

.method public abstract i()Ljava/util/Random;
.end method
