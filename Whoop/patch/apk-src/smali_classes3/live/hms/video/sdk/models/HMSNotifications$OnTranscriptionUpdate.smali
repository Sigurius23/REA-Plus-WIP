.class public final Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;
.super Llive/hms/video/sdk/models/HMSNotifications;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/models/HMSNotifications;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OnTranscriptionUpdate"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001BW\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003Jn\u0010\'\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\u0008\u0010+\u001a\u0004\u0018\u00010,H\u00d6\u0003J\t\u0010-\u001a\u00020.H\u00d6\u0001J\t\u0010/\u001a\u000200H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u0017\u0010\u0014R\u001a\u0010\u0008\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u0018\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u00061"
    }
    d2 = {
        "Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;",
        "Llive/hms/video/sdk/models/HMSNotifications;",
        "error",
        "Llive/hms/video/sdk/models/OnTranscriptionError;",
        "startedAt",
        "",
        "stoppedAt",
        "updatedAt",
        "initialisedAt",
        "state",
        "Llive/hms/video/sdk/models/TranscriptionState;",
        "mode",
        "Llive/hms/video/sdk/models/TranscriptionsMode;",
        "peer",
        "Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;",
        "<init>",
        "(Llive/hms/video/sdk/models/OnTranscriptionError;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;)V",
        "getError",
        "()Llive/hms/video/sdk/models/OnTranscriptionError;",
        "getStartedAt",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getStoppedAt",
        "getUpdatedAt",
        "getInitialisedAt",
        "getState",
        "()Llive/hms/video/sdk/models/TranscriptionState;",
        "getMode",
        "()Llive/hms/video/sdk/models/TranscriptionsMode;",
        "getPeer",
        "()Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "(Llive/hms/video/sdk/models/OnTranscriptionError;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;)Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;",
        "equals",
        "",
        "other",
        "",
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
.field private final error:Llive/hms/video/sdk/models/OnTranscriptionError;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "error"
    .end annotation
.end field

.field private final initialisedAt:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "initialised_at"
    .end annotation
.end field

.field private final mode:Llive/hms/video/sdk/models/TranscriptionsMode;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "mode"
    .end annotation
.end field

.field private final peer:Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "peer"
    .end annotation
.end field

.field private final startedAt:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "started_at"
    .end annotation
.end field

.field private final state:Llive/hms/video/sdk/models/TranscriptionState;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "state"
    .end annotation
.end field

.field private final stoppedAt:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "stopped_at"
    .end annotation
.end field

.field private final updatedAt:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/models/OnTranscriptionError;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llive/hms/video/sdk/models/HMSNotifications;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->error:Llive/hms/video/sdk/models/OnTranscriptionError;

    iput-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->startedAt:Ljava/lang/Long;

    iput-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->stoppedAt:Ljava/lang/Long;

    iput-object p4, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->updatedAt:Ljava/lang/Long;

    iput-object p5, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->initialisedAt:Ljava/lang/Long;

    iput-object p6, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->state:Llive/hms/video/sdk/models/TranscriptionState;

    iput-object p7, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    iput-object p8, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->peer:Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;Llive/hms/video/sdk/models/OnTranscriptionError;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;ILjava/lang/Object;)Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->error:Llive/hms/video/sdk/models/OnTranscriptionError;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->startedAt:Ljava/lang/Long;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->stoppedAt:Ljava/lang/Long;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->updatedAt:Ljava/lang/Long;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->initialisedAt:Ljava/lang/Long;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->state:Llive/hms/video/sdk/models/TranscriptionState;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->peer:Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->copy(Llive/hms/video/sdk/models/OnTranscriptionError;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;)Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Llive/hms/video/sdk/models/OnTranscriptionError;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->error:Llive/hms/video/sdk/models/OnTranscriptionError;

    return-object v0
.end method

.method public final component2()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->startedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->stoppedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->updatedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component5()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->initialisedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component6()Llive/hms/video/sdk/models/TranscriptionState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->state:Llive/hms/video/sdk/models/TranscriptionState;

    return-object v0
.end method

.method public final component7()Llive/hms/video/sdk/models/TranscriptionsMode;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    return-object v0
.end method

.method public final component8()Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->peer:Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;

    return-object v0
.end method

.method public final copy(Llive/hms/video/sdk/models/OnTranscriptionError;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;)Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;
    .locals 9

    new-instance v0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;-><init>(Llive/hms/video/sdk/models/OnTranscriptionError;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->error:Llive/hms/video/sdk/models/OnTranscriptionError;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->error:Llive/hms/video/sdk/models/OnTranscriptionError;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->startedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->startedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->stoppedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->stoppedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->updatedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->updatedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->initialisedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->initialisedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->state:Llive/hms/video/sdk/models/TranscriptionState;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->state:Llive/hms/video/sdk/models/TranscriptionState;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->peer:Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;

    iget-object p1, p1, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->peer:Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getError()Llive/hms/video/sdk/models/OnTranscriptionError;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->error:Llive/hms/video/sdk/models/OnTranscriptionError;

    return-object v0
.end method

.method public final getInitialisedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->initialisedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final getMode()Llive/hms/video/sdk/models/TranscriptionsMode;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    return-object v0
.end method

.method public final getPeer()Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->peer:Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;

    return-object v0
.end method

.method public final getStartedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->startedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final getState()Llive/hms/video/sdk/models/TranscriptionState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->state:Llive/hms/video/sdk/models/TranscriptionState;

    return-object v0
.end method

.method public final getStoppedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->stoppedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->updatedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->error:Llive/hms/video/sdk/models/OnTranscriptionError;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Llive/hms/video/sdk/models/OnTranscriptionError;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->startedAt:Ljava/lang/Long;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->stoppedAt:Ljava/lang/Long;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->updatedAt:Ljava/lang/Long;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->initialisedAt:Ljava/lang/Long;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->state:Llive/hms/video/sdk/models/TranscriptionState;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->peer:Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;

    if-nez v2, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "OnTranscriptionUpdate(error="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->error:Llive/hms/video/sdk/models/OnTranscriptionError;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", startedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->startedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stoppedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->stoppedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->updatedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", initialisedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->initialisedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->state:Llive/hms/video/sdk/models/TranscriptionState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", peer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->peer:Llive/hms/video/sdk/models/HMSNotifications$TranscriptionPeer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
