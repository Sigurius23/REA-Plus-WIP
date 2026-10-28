.class public final Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008-\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0013\u0010\u0014B\u007f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0015J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010/\u001a\u00020\u000cH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u000b\u00102\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0096\u0001\u00105\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u00106J\u0014\u00107\u001a\u00020\u000c2\u0008\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u00109\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010:\u001a\u00020\u000eH\u00d6\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0018\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\u0008#\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\"R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\"\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;",
        "",
        "campaignId",
        "",
        "resultId",
        "order",
        "startTimestamp",
        "Lorg/joda/time/DateTime;",
        "endTimestamp",
        "mysticReading",
        "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;",
        "typeformSubmitted",
        "",
        "textOption",
        "",
        "numberInput",
        "textInput",
        "timestampInput",
        "stepType",
        "<init>",
        "(IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;)V",
        "(IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;)V",
        "getCampaignId",
        "()I",
        "getResultId",
        "getOrder",
        "getStartTimestamp",
        "()Lorg/joda/time/DateTime;",
        "getEndTimestamp",
        "getMysticReading",
        "()Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;",
        "getTypeformSubmitted",
        "()Z",
        "getTextOption",
        "()Ljava/lang/String;",
        "getNumberInput",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getTextInput",
        "getTimestampInput",
        "getStepType",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "copy",
        "(IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;",
        "equals",
        "other",
        "hashCode",
        "toString",
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


# instance fields
.field private final campaignId:I

.field private final endTimestamp:Lorg/joda/time/DateTime;

.field private final mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

.field private final numberInput:Ljava/lang/Integer;

.field private final order:I

.field private final resultId:I

.field private final startTimestamp:Lorg/joda/time/DateTime;

.field private final transient stepType:Ljava/lang/String;

.field private final textInput:Ljava/lang/String;

.field private final textOption:Ljava/lang/String;

.field private final timestampInput:Lorg/joda/time/DateTime;

.field private final typeformSubmitted:Z


# direct methods
.method public constructor <init>(IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;)V
    .locals 13

    const/4 v12, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    .line 16
    invoke-direct/range {v0 .. v12}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;-><init>(IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x8

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_1

    move-object p5, v0

    :cond_1
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_2

    move-object p6, v0

    :cond_2
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_3

    const/4 p7, 0x0

    :cond_3
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_4

    move-object p8, v0

    :cond_4
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_5

    move-object p9, v0

    :cond_5
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_6

    move-object p10, v0

    :cond_6
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_7

    move-object p12, v0

    :goto_0
    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_7
    move-object p12, p11

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {p1 .. p12}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;-><init>(IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;)V

    return-void
.end method

.method public constructor <init>(IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->campaignId:I

    .line 3
    iput p2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->resultId:I

    .line 4
    iput p3, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->order:I

    .line 5
    iput-object p4, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->startTimestamp:Lorg/joda/time/DateTime;

    .line 6
    iput-object p5, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->endTimestamp:Lorg/joda/time/DateTime;

    .line 7
    iput-object p6, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    .line 8
    iput-boolean p7, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->typeformSubmitted:Z

    .line 9
    iput-object p8, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->textOption:Ljava/lang/String;

    .line 10
    iput-object p9, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->numberInput:Ljava/lang/Integer;

    .line 11
    iput-object p10, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->textInput:Ljava/lang/String;

    .line 12
    iput-object p11, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->timestampInput:Lorg/joda/time/DateTime;

    .line 13
    iput-object p12, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->stepType:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p14, p13, 0x8

    const/4 v0, 0x0

    if-eqz p14, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_1

    move-object p5, v0

    :cond_1
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_2

    move-object p6, v0

    :cond_2
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_3

    const/4 p7, 0x0

    :cond_3
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_4

    move-object p8, v0

    :cond_4
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_5

    move-object p9, v0

    :cond_5
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_6

    move-object p10, v0

    :cond_6
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_7

    move-object p11, v0

    :cond_7
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_8

    move-object p13, v0

    :goto_0
    move-object p12, p11

    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_8
    move-object p13, p12

    goto :goto_0

    .line 14
    :goto_1
    invoke-direct/range {p1 .. p13}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;-><init>(IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget p1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->campaignId:I

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget p2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->resultId:I

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget p3, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->order:I

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->startTimestamp:Lorg/joda/time/DateTime;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->endTimestamp:Lorg/joda/time/DateTime;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-boolean p7, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->typeformSubmitted:Z

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->textOption:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->numberInput:Ljava/lang/Integer;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->textInput:Ljava/lang/String;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->timestampInput:Lorg/joda/time/DateTime;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->stepType:Ljava/lang/String;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->copy(IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->campaignId:I

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->textInput:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->timestampInput:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->stepType:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->resultId:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->order:I

    return v0
.end method

.method public final component4()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->startTimestamp:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component5()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->endTimestamp:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component6()Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->typeformSubmitted:Z

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->textOption:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->numberInput:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;
    .locals 13

    new-instance v0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    move v1, p1

    move v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;-><init>(IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    iget v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->campaignId:I

    iget v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->campaignId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->resultId:I

    iget v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->resultId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->order:I

    iget v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->order:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->startTimestamp:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->startTimestamp:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->endTimestamp:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->endTimestamp:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->typeformSubmitted:Z

    iget-boolean v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->typeformSubmitted:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->textOption:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->textOption:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->numberInput:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->numberInput:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->textInput:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->textInput:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->timestampInput:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->timestampInput:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->stepType:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->stepType:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getCampaignId()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->campaignId:I

    return v0
.end method

.method public final getEndTimestamp()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->endTimestamp:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getMysticReading()Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    return-object v0
.end method

.method public final getNumberInput()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->numberInput:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getOrder()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->order:I

    return v0
.end method

.method public final getResultId()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->resultId:I

    return v0
.end method

.method public final getStartTimestamp()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->startTimestamp:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getStepType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->stepType:Ljava/lang/String;

    return-object v0
.end method

.method public final getTextInput()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->textInput:Ljava/lang/String;

    return-object v0
.end method

.method public final getTextOption()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->textOption:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimestampInput()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->timestampInput:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getTypeformSubmitted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->typeformSubmitted:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->campaignId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->resultId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->order:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->startTimestamp:Lorg/joda/time/DateTime;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->endTimestamp:Lorg/joda/time/DateTime;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->typeformSubmitted:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->textOption:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->numberInput:Ljava/lang/Integer;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->textInput:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->timestampInput:Lorg/joda/time/DateTime;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->stepType:Ljava/lang/String;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget v0, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->campaignId:I

    iget v1, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->resultId:I

    iget v2, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->order:I

    iget-object v3, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->startTimestamp:Lorg/joda/time/DateTime;

    iget-object v4, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->endTimestamp:Lorg/joda/time/DateTime;

    iget-object v5, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->mysticReading:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    iget-boolean v6, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->typeformSubmitted:Z

    iget-object v7, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->textOption:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->numberInput:Ljava/lang/Integer;

    iget-object v9, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->textInput:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->timestampInput:Lorg/joda/time/DateTime;

    iget-object v11, p0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->stepType:Ljava/lang/String;

    const-string v12, ", resultId="

    const-string v13, ", order="

    const-string v14, "ProtocolStepResult(campaignId="

    invoke-static {v0, v1, v14, v12, v13}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", startTimestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", endTimestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mysticReading="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", typeformSubmitted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", textOption="

    const-string v2, ", numberInput="

    invoke-static {v0, v6, v1, v7, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", textInput="

    const-string v2, ", timestampInput="

    invoke-static {v8, v1, v9, v2, v0}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stepType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
