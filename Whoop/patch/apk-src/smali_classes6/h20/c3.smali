.class public final Lh20/c3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lh20/c3;",
            ">;"
        }
    .end annotation
.end field

.field public static final z:Lh20/c3;


# instance fields
.field public final w:F

.field public final x:F

.field public final y:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh20/f2;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lh20/f2;-><init>(I)V

    sput-object v0, Lh20/c3;->CREATOR:Landroid/os/Parcelable$Creator;

    sget-object v0, Ld40/q;->c:Ld40/o;

    iget v1, v0, Ld40/o;->a:F

    iget v0, v0, Ld40/o;->c:F

    new-instance v2, Lh20/c3;

    invoke-direct {v2, v1, v0, v1}, Lh20/c3;-><init>(FFF)V

    sput-object v2, Lh20/c3;->z:Lh20/c3;

    return-void
.end method

.method public constructor <init>(F)V
    .locals 1

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0, p1}, Lh20/c3;-><init>(FFF)V

    return-void
.end method

.method public constructor <init>(FFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lh20/c3;->w:F

    .line 3
    iput p2, p0, Lh20/c3;->x:F

    .line 4
    iput p3, p0, Lh20/c3;->y:F

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
    instance-of v1, p1, Lh20/c3;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh20/c3;

    iget v1, p0, Lh20/c3;->w:F

    iget v3, p1, Lh20/c3;->w:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lh20/c3;->x:F

    iget v3, p1, Lh20/c3;->x:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lh20/c3;->y:F

    iget p1, p1, Lh20/c3;->y:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lh20/c3;->w:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lh20/c3;->x:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v1, p0, Lh20/c3;->y:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", borderStrokeWidthDp="

    const-string v1, ", bottomSheetCornerRadiusDp="

    const-string v2, "Shapes(cornerRadiusDp="

    iget v3, p0, Lh20/c3;->w:F

    iget v4, p0, Lh20/c3;->x:F

    invoke-static {v2, v3, v0, v4, v1}, Lb9/y;->t(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    iget v2, p0, Lh20/c3;->y:F

    invoke-static {v2, v1, v0}, Lq63/c;->g(FLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lh20/c3;->w:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lh20/c3;->x:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lh20/c3;->y:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method
