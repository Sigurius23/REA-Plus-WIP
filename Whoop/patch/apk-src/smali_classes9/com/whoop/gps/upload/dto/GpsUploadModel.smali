.class public final Lcom/whoop/gps/upload/dto/GpsUploadModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/gps/upload/dto/GpsUploadModel$$serializer;,
        Lcom/whoop/gps/upload/dto/GpsUploadModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 ?2\u00020\u0001:\u0002@ABO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB_\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0010\u0010#\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010!J\u0010\u0010$\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010!J\u0010\u0010%\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)Jd\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010)J\u0010\u0010-\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00101\u001a\u0002002\u0008\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00086\u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00105\u001a\u0004\u00087\u0010!R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00105\u001a\u0004\u00088\u0010!R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00105\u001a\u0004\u00089\u0010!R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00105\u001a\u0004\u0008:\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010;\u001a\u0004\u0008<\u0010\'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010=\u001a\u0004\u0008>\u0010)\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/gps/upload/dto/GpsUploadModel;",
        "",
        "",
        "timestamp",
        "",
        "latitude",
        "longitude",
        "altitude",
        "horizontalAccuracyMeters",
        "verticalAccuracyMeters",
        "Lcom/whoop/gps/upload/dto/SpeedDataModel;",
        "speed",
        "",
        "trigger",
        "<init>",
        "(JDDDDDLcom/whoop/gps/upload/dto/SpeedDataModel;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IJDDDDDLcom/whoop/gps/upload/dto/SpeedDataModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$gps_tracking_release",
        "(Lcom/whoop/gps/upload/dto/GpsUploadModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()J",
        "component2",
        "()D",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/gps/upload/dto/SpeedDataModel;",
        "component8",
        "()Ljava/lang/String;",
        "copy",
        "(JDDDDDLcom/whoop/gps/upload/dto/SpeedDataModel;Ljava/lang/String;)Lcom/whoop/gps/upload/dto/GpsUploadModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "J",
        "getTimestamp",
        "D",
        "getLatitude",
        "getLongitude",
        "getAltitude",
        "getHorizontalAccuracyMeters",
        "getVerticalAccuracyMeters",
        "Lcom/whoop/gps/upload/dto/SpeedDataModel;",
        "getSpeed",
        "Ljava/lang/String;",
        "getTrigger",
        "Companion",
        "$serializer",
        "a",
        "gps-tracking_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/gps/upload/dto/GpsUploadModel$a;


# instance fields
.field private final altitude:D

.field private final horizontalAccuracyMeters:D

.field private final latitude:D

.field private final longitude:D

.field private final speed:Lcom/whoop/gps/upload/dto/SpeedDataModel;

.field private final timestamp:J

.field private final trigger:Ljava/lang/String;

.field private final verticalAccuracyMeters:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/gps/upload/dto/GpsUploadModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/gps/upload/dto/GpsUploadModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->Companion:Lcom/whoop/gps/upload/dto/GpsUploadModel$a;

    return-void
.end method

.method public synthetic constructor <init>(IJDDDDDLcom/whoop/gps/upload/dto/SpeedDataModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 v0, p1, 0x3f

    const/16 v1, 0x3f

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/gps/upload/dto/GpsUploadModel$$serializer;->INSTANCE:Lcom/whoop/gps/upload/dto/GpsUploadModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/gps/upload/dto/GpsUploadModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->timestamp:J

    iput-wide p4, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->latitude:D

    iput-wide p6, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->longitude:D

    iput-wide p8, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->altitude:D

    iput-wide p10, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->horizontalAccuracyMeters:D

    iput-wide p12, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->verticalAccuracyMeters:D

    and-int/lit8 p2, p1, 0x40

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->speed:Lcom/whoop/gps/upload/dto/SpeedDataModel;

    goto :goto_0

    :cond_1
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->speed:Lcom/whoop/gps/upload/dto/SpeedDataModel;

    :goto_0
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_2

    iput-object p3, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->trigger:Ljava/lang/String;

    return-void

    :cond_2
    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->trigger:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(JDDDDDLcom/whoop/gps/upload/dto/SpeedDataModel;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->timestamp:J

    .line 4
    iput-wide p3, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->latitude:D

    .line 5
    iput-wide p5, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->longitude:D

    .line 6
    iput-wide p7, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->altitude:D

    .line 7
    iput-wide p9, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->horizontalAccuracyMeters:D

    .line 8
    iput-wide p11, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->verticalAccuracyMeters:D

    .line 9
    iput-object p13, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->speed:Lcom/whoop/gps/upload/dto/SpeedDataModel;

    .line 10
    iput-object p14, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->trigger:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(JDDDDDLcom/whoop/gps/upload/dto/SpeedDataModel;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object/from16 v16, v2

    goto :goto_0

    :cond_0
    move-object/from16 v16, p13

    :goto_0
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1

    move-object/from16 v17, v2

    :goto_1
    move-object/from16 v3, p0

    move-wide/from16 v4, p1

    move-wide/from16 v6, p3

    move-wide/from16 v8, p5

    move-wide/from16 v10, p7

    move-wide/from16 v12, p9

    move-wide/from16 v14, p11

    goto :goto_2

    :cond_1
    move-object/from16 v17, p14

    goto :goto_1

    .line 11
    :goto_2
    invoke-direct/range {v3 .. v17}, Lcom/whoop/gps/upload/dto/GpsUploadModel;-><init>(JDDDDDLcom/whoop/gps/upload/dto/SpeedDataModel;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/gps/upload/dto/GpsUploadModel;JDDDDDLcom/whoop/gps/upload/dto/SpeedDataModel;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/gps/upload/dto/GpsUploadModel;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide v1, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->timestamp:J

    goto :goto_0

    :cond_0
    move-wide v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->latitude:D

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p3

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    iget-wide v5, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->longitude:D

    goto :goto_2

    :cond_2
    move-wide/from16 v5, p5

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    iget-wide v7, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->altitude:D

    goto :goto_3

    :cond_3
    move-wide/from16 v7, p7

    :goto_3
    and-int/lit8 v9, v0, 0x10

    if-eqz v9, :cond_4

    iget-wide v9, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->horizontalAccuracyMeters:D

    goto :goto_4

    :cond_4
    move-wide/from16 v9, p9

    :goto_4
    and-int/lit8 v11, v0, 0x20

    if-eqz v11, :cond_5

    iget-wide v11, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->verticalAccuracyMeters:D

    goto :goto_5

    :cond_5
    move-wide/from16 v11, p11

    :goto_5
    and-int/lit8 v13, v0, 0x40

    if-eqz v13, :cond_6

    iget-object v13, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->speed:Lcom/whoop/gps/upload/dto/SpeedDataModel;

    goto :goto_6

    :cond_6
    move-object/from16 v13, p13

    :goto_6
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->trigger:Ljava/lang/String;

    move-object/from16 p15, v0

    :goto_7
    move-object p1, p0

    move-wide/from16 p2, v1

    move-wide/from16 p4, v3

    move-wide/from16 p6, v5

    move-wide/from16 p8, v7

    move-wide/from16 p10, v9

    move-wide/from16 p12, v11

    move-object/from16 p14, v13

    goto :goto_8

    :cond_7
    move-object/from16 p15, p14

    goto :goto_7

    :goto_8
    invoke-virtual/range {p1 .. p15}, Lcom/whoop/gps/upload/dto/GpsUploadModel;->copy(JDDDDDLcom/whoop/gps/upload/dto/SpeedDataModel;Ljava/lang/String;)Lcom/whoop/gps/upload/dto/GpsUploadModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$gps_tracking_release(Lcom/whoop/gps/upload/dto/GpsUploadModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-wide v1, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->timestamp:J

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    const/4 v0, 0x1

    iget-wide v1, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->latitude:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x2

    iget-wide v1, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->longitude:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x3

    iget-wide v1, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->altitude:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x4

    iget-wide v1, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->horizontalAccuracyMeters:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x5

    iget-wide v1, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->verticalAccuracyMeters:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->speed:Lcom/whoop/gps/upload/dto/SpeedDataModel;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/gps/upload/dto/SpeedDataModel$$serializer;->INSTANCE:Lcom/whoop/gps/upload/dto/SpeedDataModel$$serializer;

    iget-object v2, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->speed:Lcom/whoop/gps/upload/dto/SpeedDataModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->trigger:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->trigger:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->timestamp:J

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->latitude:D

    return-wide v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->longitude:D

    return-wide v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->altitude:D

    return-wide v0
.end method

.method public final component5()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->horizontalAccuracyMeters:D

    return-wide v0
.end method

.method public final component6()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->verticalAccuracyMeters:D

    return-wide v0
.end method

.method public final component7()Lcom/whoop/gps/upload/dto/SpeedDataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->speed:Lcom/whoop/gps/upload/dto/SpeedDataModel;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->trigger:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JDDDDDLcom/whoop/gps/upload/dto/SpeedDataModel;Ljava/lang/String;)Lcom/whoop/gps/upload/dto/GpsUploadModel;
    .locals 15

    new-instance v0, Lcom/whoop/gps/upload/dto/GpsUploadModel;

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-wide/from16 v9, p9

    move-wide/from16 v11, p11

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Lcom/whoop/gps/upload/dto/GpsUploadModel;-><init>(JDDDDDLcom/whoop/gps/upload/dto/SpeedDataModel;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/gps/upload/dto/GpsUploadModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/gps/upload/dto/GpsUploadModel;

    iget-wide v3, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->timestamp:J

    iget-wide v5, p1, Lcom/whoop/gps/upload/dto/GpsUploadModel;->timestamp:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->latitude:D

    iget-wide v5, p1, Lcom/whoop/gps/upload/dto/GpsUploadModel;->latitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->longitude:D

    iget-wide v5, p1, Lcom/whoop/gps/upload/dto/GpsUploadModel;->longitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->altitude:D

    iget-wide v5, p1, Lcom/whoop/gps/upload/dto/GpsUploadModel;->altitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->horizontalAccuracyMeters:D

    iget-wide v5, p1, Lcom/whoop/gps/upload/dto/GpsUploadModel;->horizontalAccuracyMeters:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->verticalAccuracyMeters:D

    iget-wide v5, p1, Lcom/whoop/gps/upload/dto/GpsUploadModel;->verticalAccuracyMeters:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->speed:Lcom/whoop/gps/upload/dto/SpeedDataModel;

    iget-object v3, p1, Lcom/whoop/gps/upload/dto/GpsUploadModel;->speed:Lcom/whoop/gps/upload/dto/SpeedDataModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->trigger:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/gps/upload/dto/GpsUploadModel;->trigger:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAltitude()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->altitude:D

    return-wide v0
.end method

.method public final getHorizontalAccuracyMeters()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->horizontalAccuracyMeters:D

    return-wide v0
.end method

.method public final getLatitude()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->latitude:D

    return-wide v0
.end method

.method public final getLongitude()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->longitude:D

    return-wide v0
.end method

.method public final getSpeed()Lcom/whoop/gps/upload/dto/SpeedDataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->speed:Lcom/whoop/gps/upload/dto/SpeedDataModel;

    return-object v0
.end method

.method public final getTimestamp()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->timestamp:J

    return-wide v0
.end method

.method public final getTrigger()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->trigger:Ljava/lang/String;

    return-object v0
.end method

.method public final getVerticalAccuracyMeters()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->verticalAccuracyMeters:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->timestamp:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->latitude:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->longitude:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->altitude:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->horizontalAccuracyMeters:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->verticalAccuracyMeters:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->speed:Lcom/whoop/gps/upload/dto/SpeedDataModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/gps/upload/dto/SpeedDataModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->trigger:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->timestamp:J

    iget-wide v3, v0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->latitude:D

    iget-wide v5, v0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->longitude:D

    iget-wide v7, v0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->altitude:D

    iget-wide v9, v0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->horizontalAccuracyMeters:D

    iget-wide v11, v0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->verticalAccuracyMeters:D

    iget-object v13, v0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->speed:Lcom/whoop/gps/upload/dto/SpeedDataModel;

    iget-object v14, v0, Lcom/whoop/gps/upload/dto/GpsUploadModel;->trigger:Ljava/lang/String;

    const-string v15, "GpsUploadModel(timestamp="

    const-string v0, ", latitude="

    invoke-static {v1, v2, v15, v0}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", longitude="

    const-string v2, ", altitude="

    invoke-static {v0, v1, v5, v6, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalAccuracyMeters="

    const-string v2, ", verticalAccuracyMeters="

    invoke-static {v0, v1, v9, v10, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", speed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trigger="

    const-string v2, ")"

    invoke-static {v0, v1, v14, v2}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
