.class public final Lh20/e1;
.super Lh20/f1;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lh20/e1;",
            ">;"
        }
    .end annotation
.end field

.field public static final y:Lh20/e1;


# instance fields
.field public final w:F

.field public final x:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh20/n;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lh20/n;-><init>(I)V

    sput-object v0, Lh20/e1;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lh20/e1;

    sget-object v1, Ld40/q;->n:Ld40/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ld40/q;->m:Ld40/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    const/high16 v2, 0x41400000    # 12.0f

    invoke-direct {v0, v2, v1}, Lh20/e1;-><init>(FF)V

    sput-object v0, Lh20/e1;->y:Lh20/e1;

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh20/e1;->w:F

    iput p2, p0, Lh20/e1;->x:F

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
    instance-of v1, p1, Lh20/e1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh20/e1;

    iget v1, p0, Lh20/e1;->w:F

    iget v3, p1, Lh20/e1;->w:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lh20/e1;->x:F

    iget p1, p1, Lh20/e1;->x:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lh20/e1;->w:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh20/e1;->x:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", additionalInsetsDp="

    const-string v1, ")"

    const-string v2, "FloatingButton(spacingDp="

    iget v3, p0, Lh20/e1;->w:F

    iget v4, p0, Lh20/e1;->x:F

    invoke-static {v2, v3, v0, v4, v1}, Lr80/c;->n(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lh20/e1;->w:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lh20/e1;->x:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method
