.class public final Lg00/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lt0/i;

.field public final b:Lt0/i;

.field public final c:Lt0/i;

.field public final d:F


# direct methods
.method public constructor <init>(Lt0/i;Lt0/i;Lt0/i;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg00/c;->a:Lt0/i;

    iput-object p2, p0, Lg00/c;->b:Lt0/i;

    iput-object p3, p0, Lg00/c;->c:Lt0/i;

    iput p4, p0, Lg00/c;->d:F

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lg00/c;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lg00/c;

    iget-object v0, p0, Lg00/c;->a:Lt0/i;

    iget-object v1, p1, Lg00/c;->a:Lt0/i;

    invoke-virtual {v0, v1}, Lt0/i;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lg00/c;->b:Lt0/i;

    iget-object v1, p1, Lg00/c;->b:Lt0/i;

    invoke-virtual {v0, v1}, Lt0/i;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lg00/c;->c:Lt0/i;

    iget-object v1, p1, Lg00/c;->c:Lt0/i;

    invoke-virtual {v0, v1}, Lt0/i;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget v0, p0, Lg00/c;->d:F

    iget p1, p1, Lg00/c;->d:F

    invoke-static {v0, p1}, Ly3/f;->b(FF)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_5
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lg00/c;->a:Lt0/i;

    invoke-virtual {v0}, Lt0/i;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lg00/c;->b:Lt0/i;

    invoke-virtual {v1}, Lt0/i;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lg00/c;->c:Lt0/i;

    invoke-virtual {v0}, Lt0/i;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lg00/c;->d:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lg00/c;->d:F

    invoke-static {v0}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "LinkShapes(extraSmall="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lg00/c;->a:Lt0/i;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", default="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lg00/c;->b:Lt0/i;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", primaryButton="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lg00/c;->c:Lt0/i;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", primaryButtonHeight="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
