.class public final Lh20/j2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lh20/j2;",
            ">;"
        }
    .end annotation
.end field

.field public static final E:Lh20/j2;

.field public static final F:Lh20/j2;


# instance fields
.field public final w:F

.field public final x:F

.field public final y:F

.field public final z:F


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lh20/f2;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lh20/f2;-><init>(I)V

    sput-object v0, Lh20/j2;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lh20/j2;

    const/4 v1, 0x0

    const/high16 v2, 0x42200000    # 40.0f

    const/high16 v3, 0x41a00000    # 20.0f

    invoke-direct {v0, v3, v1, v3, v2}, Lh20/j2;-><init>(FFFF)V

    sput-object v0, Lh20/j2;->E:Lh20/j2;

    new-instance v0, Lh20/j2;

    sget-object v1, Ld40/q;->p:Ld40/g;

    iget v2, v1, Ld40/g;->a:F

    iget v3, v1, Ld40/g;->b:F

    iget v4, v1, Ld40/g;->c:F

    iget v1, v1, Ld40/g;->d:F

    invoke-direct {v0, v2, v3, v4, v1}, Lh20/j2;-><init>(FFFF)V

    sput-object v0, Lh20/j2;->F:Lh20/j2;

    return-void
.end method

.method public constructor <init>(FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh20/j2;->w:F

    iput p2, p0, Lh20/j2;->x:F

    iput p3, p0, Lh20/j2;->y:F

    iput p4, p0, Lh20/j2;->z:F

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lh20/j2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh20/j2;

    iget v1, p0, Lh20/j2;->w:F

    iget v3, p1, Lh20/j2;->w:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lh20/j2;->x:F

    iget v3, p1, Lh20/j2;->x:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lh20/j2;->y:F

    iget v3, p1, Lh20/j2;->y:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lh20/j2;->z:F

    iget p1, p1, Lh20/j2;->z:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lh20/j2;->w:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lh20/j2;->x:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lh20/j2;->y:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v1, p0, Lh20/j2;->z:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", topDp="

    const-string v1, ", endDp="

    const-string v2, "Insets(startDp="

    iget v3, p0, Lh20/j2;->w:F

    iget v4, p0, Lh20/j2;->x:F

    invoke-static {v2, v3, v0, v4, v1}, Lb9/y;->t(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lh20/j2;->y:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", bottomDp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lh20/j2;->z:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lh20/j2;->w:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lh20/j2;->x:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lh20/j2;->y:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lh20/j2;->z:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method
