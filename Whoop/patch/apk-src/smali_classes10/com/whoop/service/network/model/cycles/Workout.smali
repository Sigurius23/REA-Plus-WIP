.class public Lcom/whoop/service/network/model/cycles/Workout;
.super Lcom/whoop/service/network/model/cycles/Activity;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/service/network/model/cycles/Workout;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private averageHeartRate:I

.field private gpsEnabled:Z

.field private kilocalories:I

.field private kilojoules:D

.field private maxHeartRate:I

.field private sportId:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/service/network/model/cycles/Workout$1;

    invoke-direct {v0}, Lcom/whoop/service/network/model/cycles/Workout$1;-><init>()V

    sput-object v0, Lcom/whoop/service/network/model/cycles/Workout;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/service/network/model/cycles/Activity;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 11
    invoke-direct {p0}, Lcom/whoop/service/network/model/cycles/Activity;-><init>()V

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/whoop/service/network/model/cycles/Workout;->sportId:I

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/whoop/service/network/model/cycles/Workout;->kilojoules:D

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/whoop/service/network/model/cycles/Workout;->kilocalories:I

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/whoop/service/network/model/cycles/Workout;->maxHeartRate:I

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/whoop/service/network/model/cycles/Workout;->averageHeartRate:I

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/whoop/service/network/model/cycles/Workout;->gpsEnabled:Z

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/whoop/service/network/model/cycles/Period;

    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/Activity;->during:Lcom/whoop/service/network/model/cycles/Period;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;DLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;ZLjava/lang/Integer;IDIIZ)V
    .locals 9

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    move-object/from16 v8, p7

    .line 2
    invoke-direct/range {v0 .. v8}, Lcom/whoop/service/network/model/cycles/Activity;-><init>(ILjava/lang/String;DLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;ZLjava/lang/Integer;)V

    move/from16 p1, p8

    .line 3
    iput p1, p0, Lcom/whoop/service/network/model/cycles/Workout;->sportId:I

    move-wide/from16 p1, p9

    .line 4
    iput-wide p1, p0, Lcom/whoop/service/network/model/cycles/Workout;->kilojoules:D

    move/from16 p1, p11

    .line 5
    iput p1, p0, Lcom/whoop/service/network/model/cycles/Workout;->maxHeartRate:I

    move/from16 p1, p12

    .line 6
    iput p1, p0, Lcom/whoop/service/network/model/cycles/Workout;->averageHeartRate:I

    move/from16 p1, p13

    .line 7
    iput-boolean p1, p0, Lcom/whoop/service/network/model/cycles/Workout;->gpsEnabled:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;IZ)V
    .locals 1

    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/whoop/service/network/model/cycles/Activity;-><init>(ILjava/lang/String;Lcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;)V

    .line 9
    iput p4, p0, Lcom/whoop/service/network/model/cycles/Workout;->sportId:I

    .line 10
    iput-boolean p5, p0, Lcom/whoop/service/network/model/cycles/Workout;->gpsEnabled:Z

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAverageHeartRate()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Workout;->averageHeartRate:I

    return v0
.end method

.method public getDisplayNameResource()I
    .locals 1

    sget v0, Luv0/c;->c:I

    return v0
.end method

.method public getKilocalories()I
    .locals 2

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Workout;->kilocalories:I

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/whoop/service/network/model/cycles/Workout;->kilojoules:D

    invoke-static {v0, v1}, Lor2/l;->d(D)I

    move-result v0

    iput v0, p0, Lcom/whoop/service/network/model/cycles/Workout;->kilocalories:I

    :cond_0
    iget v0, p0, Lcom/whoop/service/network/model/cycles/Workout;->kilocalories:I

    return v0
.end method

.method public getKilojoules()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/cycles/Workout;->kilojoules:D

    return-wide v0
.end method

.method public getMaxHeartRate()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Workout;->maxHeartRate:I

    return v0
.end method

.method public getNameKey()Ljava/lang/String;
    .locals 1

    const-string v0, "Workout"

    return-object v0
.end method

.method public getSportId()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Workout;->sportId:I

    return v0
.end method

.method public isGpsEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/service/network/model/cycles/Workout;->gpsEnabled:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Workout{sportId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/whoop/service/network/model/cycles/Workout;->sportId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", kilojoules="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/whoop/service/network/model/cycles/Workout;->kilojoules:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", kilocalories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/whoop/service/network/model/cycles/Workout;->kilocalories:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/whoop/service/network/model/cycles/Workout;->maxHeartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", averageHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/whoop/service/network/model/cycles/Workout;->averageHeartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", super="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/whoop/service/network/model/cycles/Activity;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget p2, p0, Lcom/whoop/service/network/model/cycles/Workout;->sportId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lcom/whoop/service/network/model/cycles/Workout;->kilojoules:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget p2, p0, Lcom/whoop/service/network/model/cycles/Workout;->kilocalories:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/whoop/service/network/model/cycles/Workout;->maxHeartRate:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/whoop/service/network/model/cycles/Workout;->averageHeartRate:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/whoop/service/network/model/cycles/Workout;->gpsEnabled:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Activity;->getDuring()Lcom/whoop/service/network/model/cycles/Period;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    return-void
.end method
