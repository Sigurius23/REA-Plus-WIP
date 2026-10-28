.class public final Lah/f;
.super Lah/k;
.source "SourceFile"


# instance fields
.field public final e:F


# direct methods
.method public constructor <init>(Lah/l;F)V
    .locals 0

    invoke-direct {p0, p1}, Lah/k;-><init>(Lah/l;)V

    iput p2, p0, Lah/f;->e:F

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lah/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lah/f;

    invoke-super {p0, p1}, Lah/k;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p0, Lah/f;->e:F

    iget v0, v0, Lah/f;->e:F

    cmpl-float p1, p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    invoke-super {p0}, Lah/k;->hashCode()I

    move-result v0

    iget v1, p0, Lah/f;->e:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method
