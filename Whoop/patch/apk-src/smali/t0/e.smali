.class public final Lt0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt0/b;
.implements Lb3/j2;


# instance fields
.field public final w:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lt0/e;->w:F

    return-void
.end method


# virtual methods
.method public final a(JLy3/c;)F
    .locals 0

    iget p1, p0, Lt0/e;->w:F

    invoke-interface {p3, p1}, Ly3/c;->q0(F)F

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lt0/e;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lt0/e;

    iget v0, p0, Lt0/e;->w:F

    iget p1, p1, Lt0/e;->w:F

    invoke-static {v0, p1}, Ly3/f;->b(FF)Z

    move-result p1

    if-nez p1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lt0/e;->w:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CornerSize(size = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lt0/e;->w:F

    const-string v2, ".dp)"

    invoke-static {v1, v2, v0}, Lq63/c;->g(FLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
