.class public final Llive/hms/video/sdk/models/role/PermissionsParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bu\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u000eH\u00c6\u0003Jw\u00101\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u00102\u001a\u00020\u00032\u0008\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u000205H\u00d6\u0001J\t\u00106\u001a\u000207H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0012R\u0016\u0010\u0008\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0012R\u0016\u0010\u000c\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR0\u0010!\u001a\u0008\u0012\u0004\u0012\u00020 0\u001f2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020 0\u001f@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%\u00a8\u00068"
    }
    d2 = {
        "Llive/hms/video/sdk/models/role/PermissionsParams;",
        "",
        "endRoom",
        "",
        "removeOthers",
        "unmute",
        "mute",
        "changeRole",
        "browserRecording",
        "rtmpStreaming",
        "hlsStreaming",
        "pollRead",
        "pollWrite",
        "whiteboard",
        "Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;",
        "<init>",
        "(ZZZZZZZZZZLlive/hms/video/sdk/models/role/HMSWhiteBoardPermission;)V",
        "getEndRoom",
        "()Z",
        "getRemoveOthers",
        "getUnmute",
        "getMute",
        "getChangeRole",
        "getBrowserRecording",
        "getRtmpStreaming",
        "getHlsStreaming",
        "getPollRead",
        "getPollWrite",
        "getWhiteboard",
        "()Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;",
        "value",
        "",
        "Llive/hms/video/sdk/models/role/HMSTranscriptionPermissions;",
        "transcriptions",
        "getTranscriptions",
        "()Ljava/util/List;",
        "setTranscriptions$lib_release",
        "(Ljava/util/List;)V",
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
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final browserRecording:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "browserRecording"
    .end annotation
.end field

.field private final changeRole:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "changeRole"
    .end annotation
.end field

.field private final endRoom:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "endRoom"
    .end annotation
.end field

.field private final hlsStreaming:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "hlsStreaming"
    .end annotation
.end field

.field private final mute:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "mute"
    .end annotation
.end field

.field private final pollRead:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "pollRead"
    .end annotation
.end field

.field private final pollWrite:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "pollWrite"
    .end annotation
.end field

.field private final removeOthers:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "removeOthers"
    .end annotation
.end field

.field private final rtmpStreaming:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "rtmpStreaming"
    .end annotation
.end field

.field private transcriptions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/role/HMSTranscriptionPermissions;",
            ">;"
        }
    .end annotation
.end field

.field private final unmute:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "unmute"
    .end annotation
.end field

.field private final whiteboard:Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;


# direct methods
.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x7ff

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Llive/hms/video/sdk/models/role/PermissionsParams;-><init>(ZZZZZZZZZZLlive/hms/video/sdk/models/role/HMSWhiteBoardPermission;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZZZZZZZZZLlive/hms/video/sdk/models/role/HMSWhiteBoardPermission;)V
    .locals 1

    const-string v0, "whiteboard"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->endRoom:Z

    .line 4
    iput-boolean p2, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->removeOthers:Z

    .line 5
    iput-boolean p3, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->unmute:Z

    .line 6
    iput-boolean p4, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->mute:Z

    .line 7
    iput-boolean p5, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->changeRole:Z

    .line 8
    iput-boolean p6, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->browserRecording:Z

    .line 9
    iput-boolean p7, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->rtmpStreaming:Z

    .line 10
    iput-boolean p8, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->hlsStreaming:Z

    .line 11
    iput-boolean p9, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->pollRead:Z

    .line 12
    iput-boolean p10, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->pollWrite:Z

    .line 13
    iput-object p11, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->whiteboard:Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;

    .line 14
    sget-object p1, Lm83/y;->w:Lm83/y;

    iput-object p1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->transcriptions:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ZZZZZZZZZZLlive/hms/video/sdk/models/role/HMSWhiteBoardPermission;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x1

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    move p9, v0

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    move p10, v0

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    .line 15
    new-instance p11, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;

    invoke-direct {p11, v0, v0, v0}, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;-><init>(ZZZ)V

    :cond_a
    move-object p12, p11

    move p11, p10

    move p10, p9

    move p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 16
    invoke-direct/range {p1 .. p12}, Llive/hms/video/sdk/models/role/PermissionsParams;-><init>(ZZZZZZZZZZLlive/hms/video/sdk/models/role/HMSWhiteBoardPermission;)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/role/PermissionsParams;ZZZZZZZZZZLlive/hms/video/sdk/models/role/HMSWhiteBoardPermission;ILjava/lang/Object;)Llive/hms/video/sdk/models/role/PermissionsParams;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-boolean p1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->endRoom:Z

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-boolean p2, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->removeOthers:Z

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-boolean p3, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->unmute:Z

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-boolean p4, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->mute:Z

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-boolean p5, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->changeRole:Z

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-boolean p6, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->browserRecording:Z

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-boolean p7, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->rtmpStreaming:Z

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-boolean p8, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->hlsStreaming:Z

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-boolean p9, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->pollRead:Z

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-boolean p10, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->pollWrite:Z

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->whiteboard:Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;

    :cond_a
    move p12, p10

    move-object p13, p11

    move p10, p8

    move p11, p9

    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p13}, Llive/hms/video/sdk/models/role/PermissionsParams;->copy(ZZZZZZZZZZLlive/hms/video/sdk/models/role/HMSWhiteBoardPermission;)Llive/hms/video/sdk/models/role/PermissionsParams;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->endRoom:Z

    return v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->pollWrite:Z

    return v0
.end method

.method public final component11()Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->whiteboard:Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->removeOthers:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->unmute:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->mute:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->changeRole:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->browserRecording:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->rtmpStreaming:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->hlsStreaming:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->pollRead:Z

    return v0
.end method

.method public final copy(ZZZZZZZZZZLlive/hms/video/sdk/models/role/HMSWhiteBoardPermission;)Llive/hms/video/sdk/models/role/PermissionsParams;
    .locals 13

    const-string v0, "whiteboard"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/sdk/models/role/PermissionsParams;

    move v2, p1

    move v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    invoke-direct/range {v1 .. v12}, Llive/hms/video/sdk/models/role/PermissionsParams;-><init>(ZZZZZZZZZZLlive/hms/video/sdk/models/role/HMSWhiteBoardPermission;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/role/PermissionsParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/role/PermissionsParams;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->endRoom:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/role/PermissionsParams;->endRoom:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->removeOthers:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/role/PermissionsParams;->removeOthers:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->unmute:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/role/PermissionsParams;->unmute:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->mute:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/role/PermissionsParams;->mute:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->changeRole:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/role/PermissionsParams;->changeRole:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->browserRecording:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/role/PermissionsParams;->browserRecording:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->rtmpStreaming:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/role/PermissionsParams;->rtmpStreaming:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->hlsStreaming:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/role/PermissionsParams;->hlsStreaming:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->pollRead:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/role/PermissionsParams;->pollRead:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->pollWrite:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/role/PermissionsParams;->pollWrite:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->whiteboard:Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;

    iget-object p1, p1, Llive/hms/video/sdk/models/role/PermissionsParams;->whiteboard:Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getBrowserRecording()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->browserRecording:Z

    return v0
.end method

.method public final getChangeRole()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->changeRole:Z

    return v0
.end method

.method public final getEndRoom()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->endRoom:Z

    return v0
.end method

.method public final getHlsStreaming()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->hlsStreaming:Z

    return v0
.end method

.method public final getMute()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->mute:Z

    return v0
.end method

.method public final getPollRead()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->pollRead:Z

    return v0
.end method

.method public final getPollWrite()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->pollWrite:Z

    return v0
.end method

.method public final getRemoveOthers()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->removeOthers:Z

    return v0
.end method

.method public final getRtmpStreaming()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->rtmpStreaming:Z

    return v0
.end method

.method public final getTranscriptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/role/HMSTranscriptionPermissions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->transcriptions:Ljava/util/List;

    return-object v0
.end method

.method public final getUnmute()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->unmute:Z

    return v0
.end method

.method public final getWhiteboard()Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->whiteboard:Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->endRoom:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->removeOthers:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->unmute:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->mute:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->changeRole:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->browserRecording:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->rtmpStreaming:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->hlsStreaming:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->pollRead:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->pollWrite:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->whiteboard:Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setTranscriptions$lib_release(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/role/HMSTranscriptionPermissions;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->transcriptions:Ljava/util/List;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PermissionsParams(endRoom="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->endRoom:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", removeOthers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->removeOthers:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", unmute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->unmute:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->mute:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", changeRole="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->changeRole:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", browserRecording="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->browserRecording:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", rtmpStreaming="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->rtmpStreaming:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", hlsStreaming="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->hlsStreaming:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", pollRead="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->pollRead:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", pollWrite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->pollWrite:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", whiteboard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/role/PermissionsParams;->whiteboard:Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
