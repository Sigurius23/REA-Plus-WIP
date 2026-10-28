.class public final Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/models/HMSNotifications;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "InitialRoom"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0080\u0008\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u00c6\u0003J[\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\u0008\u0002\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020)H\u00d6\u0001J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u001e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006+"
    }
    d2 = {
        "Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;",
        "",
        "roomId",
        "",
        "sessionId",
        "name",
        "startedAt",
        "",
        "recording",
        "Llive/hms/video/sdk/peerlist/models/Recording;",
        "streaming",
        "Llive/hms/video/sdk/models/HMSNotifications$Streaming;",
        "transcriptions",
        "",
        "Llive/hms/video/sdk/models/Transcriptions;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLlive/hms/video/sdk/peerlist/models/Recording;Llive/hms/video/sdk/models/HMSNotifications$Streaming;Ljava/util/List;)V",
        "getRoomId",
        "()Ljava/lang/String;",
        "getSessionId",
        "getName",
        "getStartedAt",
        "()J",
        "getRecording",
        "()Llive/hms/video/sdk/peerlist/models/Recording;",
        "getStreaming",
        "()Llive/hms/video/sdk/models/HMSNotifications$Streaming;",
        "getTranscriptions",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "name"
    .end annotation
.end field

.field private final recording:Llive/hms/video/sdk/peerlist/models/Recording;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "recording"
    .end annotation
.end field

.field private final roomId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "room_id"
    .end annotation
.end field

.field private final sessionId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "session_id"
    .end annotation
.end field

.field private final startedAt:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "started_at"
    .end annotation
.end field

.field private final streaming:Llive/hms/video/sdk/models/HMSNotifications$Streaming;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "streaming"
    .end annotation
.end field

.field private final transcriptions:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "transcriptions"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/Transcriptions;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLlive/hms/video/sdk/peerlist/models/Recording;Llive/hms/video/sdk/models/HMSNotifications$Streaming;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Llive/hms/video/sdk/peerlist/models/Recording;",
            "Llive/hms/video/sdk/models/HMSNotifications$Streaming;",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/Transcriptions;",
            ">;)V"
        }
    .end annotation

    const-string v0, "roomId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->roomId:Ljava/lang/String;

    iput-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->sessionId:Ljava/lang/String;

    iput-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->name:Ljava/lang/String;

    iput-wide p4, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->startedAt:J

    iput-object p6, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->recording:Llive/hms/video/sdk/peerlist/models/Recording;

    iput-object p7, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->streaming:Llive/hms/video/sdk/models/HMSNotifications$Streaming;

    iput-object p8, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->transcriptions:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLlive/hms/video/sdk/peerlist/models/Recording;Llive/hms/video/sdk/models/HMSNotifications$Streaming;Ljava/util/List;ILjava/lang/Object;)Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->roomId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->sessionId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->name:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-wide p4, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->startedAt:J

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p6, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->recording:Llive/hms/video/sdk/peerlist/models/Recording;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p7, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->streaming:Llive/hms/video/sdk/models/HMSNotifications$Streaming;

    :cond_5
    and-int/lit8 p9, p9, 0x40

    if-eqz p9, :cond_6

    iget-object p8, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->transcriptions:Ljava/util/List;

    :cond_6
    move-object p9, p7

    move-object p10, p8

    move-object p8, p6

    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p10}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLlive/hms/video/sdk/peerlist/models/Recording;Llive/hms/video/sdk/models/HMSNotifications$Streaming;Ljava/util/List;)Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->roomId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->startedAt:J

    return-wide v0
.end method

.method public final component5()Llive/hms/video/sdk/peerlist/models/Recording;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->recording:Llive/hms/video/sdk/peerlist/models/Recording;

    return-object v0
.end method

.method public final component6()Llive/hms/video/sdk/models/HMSNotifications$Streaming;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->streaming:Llive/hms/video/sdk/models/HMSNotifications$Streaming;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/Transcriptions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->transcriptions:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLlive/hms/video/sdk/peerlist/models/Recording;Llive/hms/video/sdk/models/HMSNotifications$Streaming;Ljava/util/List;)Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Llive/hms/video/sdk/peerlist/models/Recording;",
            "Llive/hms/video/sdk/models/HMSNotifications$Streaming;",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/Transcriptions;",
            ">;)",
            "Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;"
        }
    .end annotation

    const-string v0, "roomId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLlive/hms/video/sdk/peerlist/models/Recording;Llive/hms/video/sdk/models/HMSNotifications$Streaming;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->roomId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->roomId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->sessionId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->sessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->name:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->startedAt:J

    iget-wide v5, p1, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->startedAt:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->recording:Llive/hms/video/sdk/peerlist/models/Recording;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->recording:Llive/hms/video/sdk/peerlist/models/Recording;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->streaming:Llive/hms/video/sdk/models/HMSNotifications$Streaming;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->streaming:Llive/hms/video/sdk/models/HMSNotifications$Streaming;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->transcriptions:Ljava/util/List;

    iget-object p1, p1, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->transcriptions:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecording()Llive/hms/video/sdk/peerlist/models/Recording;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->recording:Llive/hms/video/sdk/peerlist/models/Recording;

    return-object v0
.end method

.method public final getRoomId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->roomId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->sessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartedAt()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->startedAt:J

    return-wide v0
.end method

.method public final getStreaming()Llive/hms/video/sdk/models/HMSNotifications$Streaming;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->streaming:Llive/hms/video/sdk/models/HMSNotifications$Streaming;

    return-object v0
.end method

.method public final getTranscriptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/Transcriptions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->transcriptions:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->roomId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->sessionId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v2, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->startedAt:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->recording:Llive/hms/video/sdk/peerlist/models/Recording;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Llive/hms/video/sdk/peerlist/models/Recording;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->streaming:Llive/hms/video/sdk/models/HMSNotifications$Streaming;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$Streaming;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->transcriptions:Ljava/util/List;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "InitialRoom(roomId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->roomId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sessionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->sessionId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", startedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->startedAt:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", recording="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->recording:Llive/hms/video/sdk/peerlist/models/Recording;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", streaming="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->streaming:Llive/hms/video/sdk/models/HMSNotifications$Streaming;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transcriptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->transcriptions:Ljava/util/List;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lhc3/i;->h(Ljava/lang/StringBuilder;Ljava/util/List;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
