.class public final Lkn/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lin/b;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lkn/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final G:Lrm/c0;

.field public static final H:Lrm/c0;


# instance fields
.field public final E:[B

.field public F:I

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:J

.field public final z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrm/b0;

    invoke-direct {v0}, Lrm/b0;-><init>()V

    const-string v1, "application/id3"

    iput-object v1, v0, Lrm/b0;->k:Ljava/lang/String;

    new-instance v1, Lrm/c0;

    invoke-direct {v1, v0}, Lrm/c0;-><init>(Lrm/b0;)V

    sput-object v1, Lkn/a;->G:Lrm/c0;

    new-instance v0, Lrm/b0;

    invoke-direct {v0}, Lrm/b0;-><init>()V

    const-string v1, "application/x-scte35"

    iput-object v1, v0, Lrm/b0;->k:Ljava/lang/String;

    new-instance v1, Lrm/c0;

    invoke-direct {v1, v0}, Lrm/c0;-><init>(Lrm/b0;)V

    sput-object v1, Lkn/a;->H:Lrm/c0;

    new-instance v0, Ljz/h;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ljz/h;-><init>(I)V

    sput-object v0, Lkn/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    sget v1, Llo/y;->a:I

    iput-object v0, p0, Lkn/a;->w:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkn/a;->x:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lkn/a;->y:J

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lkn/a;->z:J

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    iput-object p1, p0, Lkn/a;->E:[B

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lkn/a;->w:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lkn/a;->x:Ljava/lang/String;

    .line 4
    iput-wide p3, p0, Lkn/a;->y:J

    .line 5
    iput-wide p5, p0, Lkn/a;->z:J

    .line 6
    iput-object p7, p0, Lkn/a;->E:[B

    return-void
.end method


# virtual methods
.method public final d()Lrm/c0;
    .locals 3

    iget-object v0, p0, Lkn/a;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "https://developer.apple.com/streaming/emsg-id3"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_1
    const-string v1, "https://aomedia.org/emsg/ID3"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "urn:scte:scte35:2014:bin"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    sget-object v0, Lkn/a;->G:Lrm/c0;

    return-object v0

    :pswitch_1
    sget-object v0, Lkn/a;->H:Lrm/c0;

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x578730ab -> :sswitch_2
        -0x2f712a89 -> :sswitch_1
        0x4db418c9 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Lkn/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lkn/a;

    iget-wide v2, p0, Lkn/a;->y:J

    iget-wide v4, p1, Lkn/a;->y:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lkn/a;->z:J

    iget-wide v4, p1, Lkn/a;->z:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-object v2, p0, Lkn/a;->w:Ljava/lang/String;

    iget-object v3, p1, Lkn/a;->w:Ljava/lang/String;

    invoke-static {v2, v3}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lkn/a;->x:Ljava/lang/String;

    iget-object v3, p1, Lkn/a;->x:Ljava/lang/String;

    invoke-static {v2, v3}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lkn/a;->E:[B

    iget-object p1, p1, Lkn/a;->E:[B

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 6

    iget v0, p0, Lkn/a;->F:I

    if-nez v0, :cond_2

    const/4 v0, 0x0

    iget-object v1, p0, Lkn/a;->w:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    const/16 v2, 0x20f

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-object v1, p0, Lkn/a;->x:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v0

    :cond_1
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-wide v0, p0, Lkn/a;->y:J

    const/16 v3, 0x20

    ushr-long v4, v0, v3

    xor-long/2addr v0, v4

    long-to-int v0, v0

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-wide v0, p0, Lkn/a;->z:J

    ushr-long v3, v0, v3

    xor-long/2addr v0, v3

    long-to-int v0, v0

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lkn/a;->E:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    add-int/2addr v0, v2

    iput v0, p0, Lkn/a;->F:I

    :cond_2
    iget v0, p0, Lkn/a;->F:I

    return v0
.end method

.method public final j()[B
    .locals 1

    invoke-virtual {p0}, Lkn/a;->d()Lrm/c0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkn/a;->E:[B

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    const/16 v0, 0x4f

    iget-object v1, p0, Lkn/a;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lkn/a;->x:Ljava/lang/String;

    invoke-static {v0, v2}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "EMSG: scheme="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", id="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lkn/a;->z:J

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", durationMs="

    const-string v1, ", value="

    iget-wide v4, p0, Lkn/a;->y:J

    invoke-static {v3, v0, v4, v5, v1}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-object p2, p0, Lkn/a;->w:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lkn/a;->x:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lkn/a;->y:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lkn/a;->z:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lkn/a;->E:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method
