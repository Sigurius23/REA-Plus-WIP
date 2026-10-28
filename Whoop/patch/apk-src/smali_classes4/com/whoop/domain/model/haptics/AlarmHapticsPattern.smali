.class public final Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\n\n\u0002\u0008!\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u000cH\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\u0081\u0001\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010-\u001a\u00020.2\u0008\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u00100\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u00101\u001a\u000202H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0013R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0013\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;",
        "",
        "waveFormEffect1",
        "",
        "waveFormEffect2",
        "waveFormEffect3",
        "waveFormEffect4",
        "waveFormEffect5",
        "waveFormEffect6",
        "waveFormEffect7",
        "waveFormEffect8",
        "loopControlForEffects",
        "",
        "overallWaveformLoopControl",
        "alarmDurationInSeconds",
        "alarmType",
        "<init>",
        "(IIIIIIIISIII)V",
        "getWaveFormEffect1",
        "()I",
        "getWaveFormEffect2",
        "getWaveFormEffect3",
        "getWaveFormEffect4",
        "getWaveFormEffect5",
        "getWaveFormEffect6",
        "getWaveFormEffect7",
        "getWaveFormEffect8",
        "getLoopControlForEffects",
        "()S",
        "getOverallWaveformLoopControl",
        "getAlarmDurationInSeconds",
        "getAlarmType",
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
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "connectivity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final alarmDurationInSeconds:I

.field private final alarmType:I

.field private final loopControlForEffects:S

.field private final overallWaveformLoopControl:I

.field private final waveFormEffect1:I

.field private final waveFormEffect2:I

.field private final waveFormEffect3:I

.field private final waveFormEffect4:I

.field private final waveFormEffect5:I

.field private final waveFormEffect6:I

.field private final waveFormEffect7:I

.field private final waveFormEffect8:I


# direct methods
.method public constructor <init>(IIIIIIIISIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect1:I

    iput p2, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect2:I

    iput p3, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect3:I

    iput p4, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect4:I

    iput p5, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect5:I

    iput p6, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect6:I

    iput p7, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect7:I

    iput p8, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect8:I

    iput-short p9, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->loopControlForEffects:S

    iput p10, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->overallWaveformLoopControl:I

    iput p11, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->alarmDurationInSeconds:I

    iput p12, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->alarmType:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;IIIIIIIISIIIILjava/lang/Object;)Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget p1, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect1:I

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget p2, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect2:I

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget p3, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect3:I

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget p4, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect4:I

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget p5, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect5:I

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget p6, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect6:I

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget p7, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect7:I

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget p8, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect8:I

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-short p9, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->loopControlForEffects:S

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget p10, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->overallWaveformLoopControl:I

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget p11, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->alarmDurationInSeconds:I

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget p12, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->alarmType:I

    :cond_b
    move p13, p11

    move p14, p12

    move p11, p9

    move p12, p10

    move p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->copy(IIIIIIIISIII)Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect1:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->overallWaveformLoopControl:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->alarmDurationInSeconds:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->alarmType:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect2:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect3:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect4:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect5:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect6:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect7:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect8:I

    return v0
.end method

.method public final component9()S
    .locals 1

    iget-short v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->loopControlForEffects:S

    return v0
.end method

.method public final copy(IIIIIIIISIII)Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;
    .locals 13

    new-instance v0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;

    move v1, p1

    move v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;-><init>(IIIIIIIISIII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;

    iget v1, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect1:I

    iget v3, p1, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect1:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect2:I

    iget v3, p1, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect2:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect3:I

    iget v3, p1, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect3:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect4:I

    iget v3, p1, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect4:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect5:I

    iget v3, p1, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect5:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect6:I

    iget v3, p1, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect6:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect7:I

    iget v3, p1, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect7:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect8:I

    iget v3, p1, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect8:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-short v1, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->loopControlForEffects:S

    iget-short v3, p1, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->loopControlForEffects:S

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->overallWaveformLoopControl:I

    iget v3, p1, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->overallWaveformLoopControl:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->alarmDurationInSeconds:I

    iget v3, p1, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->alarmDurationInSeconds:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->alarmType:I

    iget p1, p1, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->alarmType:I

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAlarmDurationInSeconds()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->alarmDurationInSeconds:I

    return v0
.end method

.method public final getAlarmType()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->alarmType:I

    return v0
.end method

.method public final getLoopControlForEffects()S
    .locals 1

    iget-short v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->loopControlForEffects:S

    return v0
.end method

.method public final getOverallWaveformLoopControl()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->overallWaveformLoopControl:I

    return v0
.end method

.method public final getWaveFormEffect1()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect1:I

    return v0
.end method

.method public final getWaveFormEffect2()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect2:I

    return v0
.end method

.method public final getWaveFormEffect3()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect3:I

    return v0
.end method

.method public final getWaveFormEffect4()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect4:I

    return v0
.end method

.method public final getWaveFormEffect5()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect5:I

    return v0
.end method

.method public final getWaveFormEffect6()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect6:I

    return v0
.end method

.method public final getWaveFormEffect7()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect7:I

    return v0
.end method

.method public final getWaveFormEffect8()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect8:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect1:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect2:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect3:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect4:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect5:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect6:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect7:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect8:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-short v2, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->loopControlForEffects:S

    invoke-static {v2}, Ljava/lang/Short;->hashCode(S)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->overallWaveformLoopControl:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->alarmDurationInSeconds:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->alarmType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget v0, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect1:I

    iget v1, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect2:I

    iget v2, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect3:I

    iget v3, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect4:I

    iget v4, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect5:I

    iget v5, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect6:I

    iget v6, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect7:I

    iget v7, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->waveFormEffect8:I

    iget-short v8, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->loopControlForEffects:S

    iget v9, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->overallWaveformLoopControl:I

    iget v10, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->alarmDurationInSeconds:I

    iget v11, p0, Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;->alarmType:I

    const-string v12, ", waveFormEffect2="

    const-string v13, ", waveFormEffect3="

    const-string v14, "AlarmHapticsPattern(waveFormEffect1="

    invoke-static {v0, v1, v14, v12, v13}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", waveFormEffect4="

    const-string v12, ", waveFormEffect5="

    invoke-static {v0, v2, v1, v3, v12}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", waveFormEffect6="

    const-string v2, ", waveFormEffect7="

    invoke-static {v0, v4, v1, v5, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", waveFormEffect8="

    const-string v2, ", loopControlForEffects="

    invoke-static {v0, v6, v1, v7, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", overallWaveformLoopControl="

    const-string v2, ", alarmDurationInSeconds="

    invoke-static {v0, v8, v1, v9, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", alarmType="

    const-string v2, ")"

    invoke-static {v0, v10, v1, v11, v2}, Lnh3/a;->i(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
