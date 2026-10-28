.class public final Lln/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lin/b;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lln/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:I

.field public final F:I

.field public final G:I

.field public final H:[B

.field public final w:I

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljz/h;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Ljz/h;-><init>(I)V

    sput-object v0, Lln/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;IIII[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lln/a;->w:I

    .line 3
    iput-object p2, p0, Lln/a;->x:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lln/a;->y:Ljava/lang/String;

    .line 5
    iput p4, p0, Lln/a;->z:I

    .line 6
    iput p5, p0, Lln/a;->E:I

    .line 7
    iput p6, p0, Lln/a;->F:I

    .line 8
    iput p7, p0, Lln/a;->G:I

    .line 9
    iput-object p8, p0, Lln/a;->H:[B

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lln/a;->w:I

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    sget v1, Llo/y;->a:I

    iput-object v0, p0, Lln/a;->x:Ljava/lang/String;

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lln/a;->y:Ljava/lang/String;

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lln/a;->z:I

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lln/a;->E:I

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lln/a;->F:I

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lln/a;->G:I

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    iput-object p1, p0, Lln/a;->H:[B

    return-void
.end method

.method public static b(Led3/a;)Lln/a;
    .locals 10

    invoke-virtual {p0}, Led3/a;->i()I

    move-result v1

    invoke-virtual {p0}, Led3/a;->i()I

    move-result v0

    sget-object v2, Lyr/d;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0, v2}, Led3/a;->v(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Led3/a;->i()I

    move-result v0

    sget-object v3, Lyr/d;->c:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0, v3}, Led3/a;->v(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Led3/a;->i()I

    move-result v4

    invoke-virtual {p0}, Led3/a;->i()I

    move-result v5

    invoke-virtual {p0}, Led3/a;->i()I

    move-result v6

    invoke-virtual {p0}, Led3/a;->i()I

    move-result v7

    invoke-virtual {p0}, Led3/a;->i()I

    move-result v0

    new-array v8, v0, [B

    const/4 v9, 0x0

    invoke-virtual {p0, v8, v9, v0}, Led3/a;->g([BII)V

    new-instance v0, Lln/a;

    invoke-direct/range {v0 .. v8}, Lln/a;-><init>(ILjava/lang/String;Ljava/lang/String;IIII[B)V

    return-object v0
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

    const-class v2, Lln/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lln/a;

    iget v2, p0, Lln/a;->w:I

    iget v3, p1, Lln/a;->w:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lln/a;->x:Ljava/lang/String;

    iget-object v3, p1, Lln/a;->x:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lln/a;->y:Ljava/lang/String;

    iget-object v3, p1, Lln/a;->y:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lln/a;->z:I

    iget v3, p1, Lln/a;->z:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lln/a;->E:I

    iget v3, p1, Lln/a;->E:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lln/a;->F:I

    iget v3, p1, Lln/a;->F:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lln/a;->G:I

    iget v3, p1, Lln/a;->G:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lln/a;->H:[B

    iget-object p1, p1, Lln/a;->H:[B

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/16 v0, 0x20f

    iget v1, p0, Lln/a;->w:I

    add-int/2addr v0, v1

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lln/a;->x:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lln/a;->y:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lln/a;->z:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lln/a;->E:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lln/a;->F:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lln/a;->G:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lln/a;->H:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    const/16 v0, 0x20

    iget-object v1, p0, Lln/a;->x:Ljava/lang/String;

    invoke-static {v0, v1}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lln/a;->y:Ljava/lang/String;

    invoke-static {v0, v2}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Picture: mimeType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", description="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final w(Lrm/l0;)V
    .locals 2

    iget-object v0, p0, Lln/a;->H:[B

    iget v1, p0, Lln/a;->w:I

    invoke-virtual {p1, v1, v0}, Lrm/l0;->a(I[B)V

    return-void
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lln/a;->w:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lln/a;->x:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lln/a;->y:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lln/a;->z:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lln/a;->E:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lln/a;->F:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lln/a;->G:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lln/a;->H:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method
