.class public final Ltp/e0;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ltp/e0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltp/a0;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ltp/a0;-><init>(I)V

    sput-object v0, Ltp/e0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x17

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ltz p1, :cond_0

    if-gt p1, v0, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    const-string v4, "Start hour must be in range [0, 23]."

    invoke-static {v4, v3}, Luo/w;->h(Ljava/lang/String;Z)V

    const/16 v3, 0x3b

    if-ltz p2, :cond_1

    if-gt p2, v3, :cond_1

    move v4, v1

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    const-string v5, "Start minute must be in range [0, 59]."

    invoke-static {v5, v4}, Luo/w;->h(Ljava/lang/String;Z)V

    if-ltz p3, :cond_2

    if-gt p3, v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    const-string v4, "End hour must be in range [0, 23]."

    invoke-static {v4, v0}, Luo/w;->h(Ljava/lang/String;Z)V

    if-ltz p4, :cond_3

    if-gt p4, v3, :cond_3

    move v0, v1

    goto :goto_3

    :cond_3
    move v0, v2

    :goto_3
    const-string v3, "End minute must be in range [0, 59]."

    invoke-static {v3, v0}, Luo/w;->h(Ljava/lang/String;Z)V

    add-int v0, p1, p2

    add-int/2addr v0, p3

    add-int/2addr v0, p4

    if-lez v0, :cond_4

    goto :goto_4

    :cond_4
    move v1, v2

    :goto_4
    const-string v0, "Parameters can\'t be all 0."

    invoke-static {v0, v1}, Luo/w;->h(Ljava/lang/String;Z)V

    iput p1, p0, Ltp/e0;->w:I

    iput p2, p0, Ltp/e0;->x:I

    iput p3, p0, Ltp/e0;->y:I

    iput p4, p0, Ltp/e0;->z:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltp/e0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ltp/e0;

    iget v1, p0, Ltp/e0;->w:I

    iget v3, p1, Ltp/e0;->w:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ltp/e0;->x:I

    iget v3, p1, Ltp/e0;->x:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ltp/e0;->y:I

    iget v3, p1, Ltp/e0;->y:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ltp/e0;->z:I

    iget p1, p1, Ltp/e0;->z:I

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 4

    iget v0, p0, Ltp/e0;->w:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ltp/e0;->x:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Ltp/e0;->y:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Ltp/e0;->z:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x75

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "UserPreferredSleepWindow [startHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ltp/e0;->w:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", startMinute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ltp/e0;->x:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", endHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ltp/e0;->y:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", endMinute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ltp/e0;->z:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Luo/w;->f(Ljava/lang/Object;)V

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v0, p0, Ltp/e0;->w:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x2

    invoke-static {p1, v0, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v0, p0, Ltp/e0;->x:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x3

    invoke-static {p1, v0, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v0, p0, Ltp/e0;->y:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, v1, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v0, p0, Ltp/e0;->z:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
