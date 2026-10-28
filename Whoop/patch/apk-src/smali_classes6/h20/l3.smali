.class public final Lh20/l3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lh20/l3;",
            ">;"
        }
    .end annotation
.end field

.field public static final z:Lh20/l3;


# instance fields
.field public final w:F

.field public final x:Ljava/lang/Integer;

.field public final y:Lh20/j3;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lh20/f2;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lh20/f2;-><init>(I)V

    sput-object v0, Lh20/l3;->CREATOR:Landroid/os/Parcelable$Creator;

    sget-object v0, Ld40/q;->d:Ld40/s;

    iget v1, v0, Ld40/s;->d:F

    iget-object v0, v0, Ld40/s;->k:Ljava/lang/Integer;

    new-instance v2, Lh20/j3;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lh20/j3;-><init>(Lh20/k3;)V

    new-instance v3, Lh20/l3;

    invoke-direct {v3, v1, v0, v2}, Lh20/l3;-><init>(FLjava/lang/Integer;Lh20/j3;)V

    sput-object v3, Lh20/l3;->z:Lh20/l3;

    return-void
.end method

.method public constructor <init>(FLjava/lang/Integer;Lh20/j3;)V
    .locals 1

    const-string v0, "custom"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lh20/l3;->w:F

    .line 3
    iput-object p2, p0, Lh20/l3;->x:Ljava/lang/Integer;

    .line 4
    iput-object p3, p0, Lh20/l3;->y:Lh20/j3;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;)V
    .locals 2

    .line 5
    new-instance v0, Lh20/j3;

    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, v1}, Lh20/j3;-><init>(Lh20/k3;)V

    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    invoke-direct {p0, v1, p1, v0}, Lh20/l3;-><init>(FLjava/lang/Integer;Lh20/j3;)V

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
    instance-of v1, p1, Lh20/l3;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh20/l3;

    iget v1, p0, Lh20/l3;->w:F

    iget v3, p1, Lh20/l3;->w:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lh20/l3;->x:Ljava/lang/Integer;

    iget-object v3, p1, Lh20/l3;->x:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lh20/l3;->y:Lh20/j3;

    iget-object p1, p1, Lh20/l3;->y:Lh20/j3;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lh20/l3;->w:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lh20/l3;->x:Ljava/lang/Integer;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lh20/l3;->y:Lh20/j3;

    invoke-virtual {v1}, Lh20/j3;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Typography(sizeScaleFactor="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lh20/l3;->w:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", fontResId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/l3;->x:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", custom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/l3;->y:Lh20/j3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lh20/l3;->w:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-object v0, p0, Lh20/l3;->x:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_0
    iget-object v0, p0, Lh20/l3;->y:Lh20/j3;

    invoke-virtual {v0, p1, p2}, Lh20/j3;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
