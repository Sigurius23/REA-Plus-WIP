.class public final Lnn/k;
.super Lnn/i;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lnn/k;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:[I

.field public final F:[I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmn/b;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lmn/b;-><init>(I)V

    sput-object v0, Lnn/k;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(II[I[II)V
    .locals 1

    .line 1
    const-string v0, "MLLT"

    invoke-direct {p0, v0}, Lnn/i;-><init>(Ljava/lang/String;)V

    .line 2
    iput p1, p0, Lnn/k;->x:I

    .line 3
    iput p2, p0, Lnn/k;->y:I

    .line 4
    iput p5, p0, Lnn/k;->z:I

    .line 5
    iput-object p3, p0, Lnn/k;->E:[I

    .line 6
    iput-object p4, p0, Lnn/k;->F:[I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 7
    const-string v0, "MLLT"

    invoke-direct {p0, v0}, Lnn/i;-><init>(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lnn/k;->x:I

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lnn/k;->y:I

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lnn/k;->z:I

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    sget v1, Llo/y;->a:I

    iput-object v0, p0, Lnn/k;->E:[I

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object p1

    iput-object p1, p0, Lnn/k;->F:[I

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
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Lnn/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lnn/k;

    iget v2, p0, Lnn/k;->x:I

    iget v3, p1, Lnn/k;->x:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lnn/k;->y:I

    iget v3, p1, Lnn/k;->y:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lnn/k;->z:I

    iget v3, p1, Lnn/k;->z:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lnn/k;->E:[I

    iget-object v3, p1, Lnn/k;->E:[I

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lnn/k;->F:[I

    iget-object p1, p1, Lnn/k;->F:[I

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    const/16 v0, 0x20f

    iget v1, p0, Lnn/k;->x:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lnn/k;->y:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lnn/k;->z:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnn/k;->E:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lnn/k;->F:[I

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([I)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lnn/k;->x:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lnn/k;->y:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lnn/k;->z:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lnn/k;->E:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    iget-object p2, p0, Lnn/k;->F:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    return-void
.end method
