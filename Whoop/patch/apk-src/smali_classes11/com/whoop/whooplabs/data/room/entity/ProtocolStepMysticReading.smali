.class public final Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0015J@\u0010\u0018\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u000bJ\u001a\u0010!\u001a\u00020 2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003\u00a2\u0006\u0004\u0008!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010#\u001a\u0004\u0008$\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010%\u001a\u0004\u0008&\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010%\u001a\u0004\u0008\'\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010%\u001a\u0004\u0008(\u0010\u0015\u00a8\u0006)"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;",
        "Landroid/os/Parcelable;",
        "Lorg/joda/time/Instant;",
        "timestamp",
        "",
        "systolic",
        "diastolic",
        "heartRate",
        "<init>",
        "(Lorg/joda/time/Instant;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "()Lorg/joda/time/Instant;",
        "component2",
        "()Ljava/lang/Integer;",
        "component3",
        "component4",
        "copy",
        "(Lorg/joda/time/Instant;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lorg/joda/time/Instant;",
        "getTimestamp",
        "Ljava/lang/Integer;",
        "getSystolic",
        "getDiastolic",
        "getHeartRate",
        "whooplabs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final diastolic:Ljava/lang/Integer;

.field private final heartRate:Ljava/lang/Integer;

.field private final systolic:Ljava/lang/Integer;

.field private final timestamp:Lorg/joda/time/Instant;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading$Creator;

    invoke-direct {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading$Creator;-><init>()V

    sput-object v0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;-><init>(Lorg/joda/time/Instant;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lorg/joda/time/Instant;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->timestamp:Lorg/joda/time/Instant;

    .line 4
    iput-object p2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->systolic:Ljava/lang/Integer;

    .line 5
    iput-object p3, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->diastolic:Ljava/lang/Integer;

    .line 6
    iput-object p4, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->heartRate:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/joda/time/Instant;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;-><init>(Lorg/joda/time/Instant;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;Lorg/joda/time/Instant;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->timestamp:Lorg/joda/time/Instant;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->systolic:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->diastolic:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->heartRate:Ljava/lang/Integer;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->copy(Lorg/joda/time/Instant;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lorg/joda/time/Instant;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->timestamp:Lorg/joda/time/Instant;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->systolic:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->diastolic:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->heartRate:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Lorg/joda/time/Instant;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;
    .locals 1

    new-instance v0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;-><init>(Lorg/joda/time/Instant;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->timestamp:Lorg/joda/time/Instant;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->timestamp:Lorg/joda/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->systolic:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->systolic:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->diastolic:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->diastolic:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->heartRate:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->heartRate:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDiastolic()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->diastolic:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getHeartRate()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->heartRate:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getSystolic()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->systolic:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTimestamp()Lorg/joda/time/Instant;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->timestamp:Lorg/joda/time/Instant;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->timestamp:Lorg/joda/time/Instant;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->systolic:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->diastolic:Ljava/lang/Integer;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->heartRate:Ljava/lang/Integer;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->timestamp:Lorg/joda/time/Instant;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->systolic:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->diastolic:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->heartRate:Ljava/lang/Integer;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ProtocolStepMysticReading(timestamp="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", systolic="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", diastolic="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", heartRate="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->timestamp:Lorg/joda/time/Instant;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->systolic:Ljava/lang/Integer;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_0
    iget-object p2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->diastolic:Ljava/lang/Integer;

    if-nez p2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_1
    iget-object p2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->heartRate:Ljava/lang/Integer;

    if-nez p2, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_2
    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    return-void
.end method
