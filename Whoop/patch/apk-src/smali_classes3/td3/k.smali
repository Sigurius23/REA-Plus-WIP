.class public final Ltd3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ltd3/k;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Landroid/os/ParcelUuid;

.field public final F:[B

.field public final G:[B

.field public final H:I

.field public final I:[B

.field public final J:[B

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Landroid/os/ParcelUuid;

.field public final z:Landroid/os/ParcelUuid;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsp/e;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lsp/e;-><init>(I)V

    sput-object v0, Ltd3/k;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;[B[BI[B[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltd3/k;->w:Ljava/lang/String;

    iput-object p3, p0, Ltd3/k;->y:Landroid/os/ParcelUuid;

    iput-object p4, p0, Ltd3/k;->z:Landroid/os/ParcelUuid;

    iput-object p2, p0, Ltd3/k;->x:Ljava/lang/String;

    iput-object p5, p0, Ltd3/k;->E:Landroid/os/ParcelUuid;

    iput-object p6, p0, Ltd3/k;->F:[B

    iput-object p7, p0, Ltd3/k;->G:[B

    iput p8, p0, Ltd3/k;->H:I

    iput-object p9, p0, Ltd3/k;->I:[B

    iput-object p10, p0, Ltd3/k;->J:[B

    return-void
.end method

.method public static b([B[B[B)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p0, :cond_0

    if-eqz p2, :cond_6

    return v0

    :cond_0
    if-eqz p2, :cond_6

    array-length v2, p2

    array-length v3, p0

    if-ge v2, v3, :cond_1

    goto :goto_2

    :cond_1
    if-nez p1, :cond_3

    move p1, v1

    :goto_0
    array-length v2, p0

    if-ge p1, v2, :cond_5

    aget-byte v2, p2, p1

    aget-byte v3, p0, p1

    if-eq v2, v3, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_3
    move v2, v1

    :goto_1
    array-length v3, p0

    if-ge v2, v3, :cond_5

    aget-byte v3, p1, v2

    aget-byte v4, p2, v2

    and-int/2addr v4, v3

    aget-byte v5, p0, v2

    and-int/2addr v3, v5

    if-eq v4, v3, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    return v0

    :cond_6
    :goto_2
    return v1
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
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Ltd3/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ltd3/k;

    iget-object v2, p0, Ltd3/k;->w:Ljava/lang/String;

    iget-object v3, p1, Ltd3/k;->w:Ljava/lang/String;

    invoke-static {v2, v3}, Ls/s;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ltd3/k;->x:Ljava/lang/String;

    iget-object v3, p1, Ltd3/k;->x:Ljava/lang/String;

    invoke-static {v2, v3}, Ls/s;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Ltd3/k;->H:I

    iget v3, p1, Ltd3/k;->H:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ltd3/k;->I:[B

    iget-object v3, p1, Ltd3/k;->I:[B

    invoke-static {v2, v3}, Ls/s;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ltd3/k;->J:[B

    iget-object v3, p1, Ltd3/k;->J:[B

    invoke-static {v2, v3}, Ls/s;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ltd3/k;->E:Landroid/os/ParcelUuid;

    iget-object v3, p1, Ltd3/k;->E:Landroid/os/ParcelUuid;

    invoke-static {v2, v3}, Ls/s;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ltd3/k;->F:[B

    iget-object v3, p1, Ltd3/k;->F:[B

    invoke-static {v2, v3}, Ls/s;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ltd3/k;->G:[B

    iget-object v3, p1, Ltd3/k;->G:[B

    invoke-static {v2, v3}, Ls/s;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ltd3/k;->y:Landroid/os/ParcelUuid;

    iget-object v3, p1, Ltd3/k;->y:Landroid/os/ParcelUuid;

    invoke-static {v2, v3}, Ls/s;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ltd3/k;->z:Landroid/os/ParcelUuid;

    iget-object p1, p1, Ltd3/k;->z:Landroid/os/ParcelUuid;

    invoke-static {v2, p1}, Ls/s;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 11

    iget v0, p0, Ltd3/k;->H:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v0, p0, Ltd3/k;->I:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v0, p0, Ltd3/k;->J:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v0, p0, Ltd3/k;->F:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget-object v0, p0, Ltd3/k;->G:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget-object v9, p0, Ltd3/k;->y:Landroid/os/ParcelUuid;

    iget-object v10, p0, Ltd3/k;->z:Landroid/os/ParcelUuid;

    iget-object v1, p0, Ltd3/k;->w:Ljava/lang/String;

    iget-object v2, p0, Ltd3/k;->x:Ljava/lang/String;

    iget-object v6, p0, Ltd3/k;->E:Landroid/os/ParcelUuid;

    filled-new-array/range {v1 .. v10}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BluetoothLeScanFilter [deviceName="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ltd3/k;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ltd3/k;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mUuid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ltd3/k;->y:Landroid/os/ParcelUuid;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", uuidMask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ltd3/k;->z:Landroid/os/ParcelUuid;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", serviceDataUuid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ltd3/k;->E:Landroid/os/ParcelUuid;

    if-nez v1, :cond_0

    const-string v1, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", serviceData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ltd3/k;->F:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", serviceDataMask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ltd3/k;->G:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", manufacturerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ltd3/k;->H:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", manufacturerData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ltd3/k;->I:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", manufacturerDataMask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ltd3/k;->J:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Ltd3/k;->w:Ljava/lang/String;

    if-nez v2, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v0

    :goto_0
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    if-eqz v2, :cond_1

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :cond_1
    iget-object v2, p0, Ltd3/k;->x:Ljava/lang/String;

    if-nez v2, :cond_2

    move v3, v1

    goto :goto_1

    :cond_2
    move v3, v0

    :goto_1
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    if-eqz v2, :cond_3

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :cond_3
    iget-object v2, p0, Ltd3/k;->y:Landroid/os/ParcelUuid;

    if-nez v2, :cond_4

    move v3, v1

    goto :goto_2

    :cond_4
    move v3, v0

    :goto_2
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    if-eqz v2, :cond_6

    invoke-virtual {p1, v2, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v2, p0, Ltd3/k;->z:Landroid/os/ParcelUuid;

    if-nez v2, :cond_5

    move v3, v1

    goto :goto_3

    :cond_5
    move v3, v0

    :goto_3
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    if-eqz v2, :cond_6

    invoke-virtual {p1, v2, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    :cond_6
    iget-object v2, p0, Ltd3/k;->E:Landroid/os/ParcelUuid;

    if-nez v2, :cond_7

    move v3, v1

    goto :goto_4

    :cond_7
    move v3, v0

    :goto_4
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    if-eqz v2, :cond_a

    invoke-virtual {p1, v2, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Ltd3/k;->F:[B

    if-nez p2, :cond_8

    move v2, v1

    goto :goto_5

    :cond_8
    move v2, v0

    :goto_5
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    if-eqz p2, :cond_a

    array-length v2, p2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    iget-object p2, p0, Ltd3/k;->G:[B

    if-nez p2, :cond_9

    move v2, v1

    goto :goto_6

    :cond_9
    move v2, v0

    :goto_6
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    if-eqz p2, :cond_a

    array-length v2, p2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    :cond_a
    iget p2, p0, Ltd3/k;->H:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Ltd3/k;->I:[B

    if-nez p2, :cond_b

    move v2, v1

    goto :goto_7

    :cond_b
    move v2, v0

    :goto_7
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    if-eqz p2, :cond_d

    array-length v2, p2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    iget-object p2, p0, Ltd3/k;->J:[B

    if-nez p2, :cond_c

    move v0, v1

    :cond_c
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    if-eqz p2, :cond_d

    array-length v0, p2

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    :cond_d
    return-void
.end method
