.class public final Ll0/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/b2;


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll0/i0;->a:F

    iput p2, p0, Ll0/i0;->b:F

    iput p3, p0, Ll0/i0;->c:F

    iput p4, p0, Ll0/i0;->d:F

    return-void
.end method


# virtual methods
.method public final a(Ly3/c;Ly3/m;)I
    .locals 0

    iget p2, p0, Ll0/i0;->a:F

    invoke-interface {p1, p2}, Ly3/c;->F(F)I

    move-result p1

    return p1
.end method

.method public final b(Ly3/c;Ly3/m;)I
    .locals 0

    iget p2, p0, Ll0/i0;->c:F

    invoke-interface {p1, p2}, Ly3/c;->F(F)I

    move-result p1

    return p1
.end method

.method public final c(Ly3/c;)I
    .locals 1

    iget v0, p0, Ll0/i0;->d:F

    invoke-interface {p1, v0}, Ly3/c;->F(F)I

    move-result p1

    return p1
.end method

.method public final d(Ly3/c;)I
    .locals 1

    iget v0, p0, Ll0/i0;->b:F

    invoke-interface {p1, v0}, Ly3/c;->F(F)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ll0/i0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ll0/i0;

    iget v0, p1, Ll0/i0;->a:F

    iget v1, p0, Ll0/i0;->a:F

    invoke-static {v1, v0}, Ly3/f;->b(FF)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Ll0/i0;->b:F

    iget v1, p1, Ll0/i0;->b:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Ll0/i0;->c:F

    iget v1, p1, Ll0/i0;->c:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Ll0/i0;->d:F

    iget p1, p1, Ll0/i0;->d:F

    invoke-static {v0, p1}, Ly3/f;->b(FF)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Ll0/i0;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Ll0/i0;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Ll0/i0;->c:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v1, p0, Ll0/i0;->d:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Insets(left="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll0/i0;->a:F

    const-string v2, ", top="

    invoke-static {v1, v2, v0}, Lev/n;->s(FLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget v1, p0, Ll0/i0;->b:F

    const-string v2, ", right="

    invoke-static {v1, v2, v0}, Lev/n;->s(FLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget v1, p0, Ll0/i0;->c:F

    const-string v2, ", bottom="

    invoke-static {v1, v2, v0}, Lev/n;->s(FLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget v1, p0, Ll0/i0;->d:F

    invoke-static {v1}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
