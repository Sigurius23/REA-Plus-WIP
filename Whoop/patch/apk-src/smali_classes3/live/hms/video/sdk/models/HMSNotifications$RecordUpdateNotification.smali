.class public final Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;
.super Llive/hms/video/sdk/models/HMSNotifications;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/models/HMSNotifications;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RecordUpdateNotification"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JT\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\u0008\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0014\u0010\u0011R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006)"
    }
    d2 = {
        "Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;",
        "Llive/hms/video/sdk/models/HMSNotifications;",
        "type",
        "Llive/hms/video/sdk/models/RecordingType;",
        "startedAt",
        "",
        "updatedAt",
        "stoppedAt",
        "state",
        "Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;",
        "error",
        "Llive/hms/video/sdk/models/HMSNotifications$ServerError;",
        "<init>",
        "(Llive/hms/video/sdk/models/RecordingType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;)V",
        "getType",
        "()Llive/hms/video/sdk/models/RecordingType;",
        "getStartedAt",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getUpdatedAt",
        "getStoppedAt",
        "getState",
        "()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;",
        "getError",
        "()Llive/hms/video/sdk/models/HMSNotifications$ServerError;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "(Llive/hms/video/sdk/models/RecordingType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;)Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;",
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
.field private final error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "error"
    .end annotation
.end field

.field private final startedAt:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "started_at"
    .end annotation
.end field

.field private final state:Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "state"
    .end annotation
.end field

.field private final stoppedAt:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "stopped_at"
    .end annotation
.end field

.field private final type:Llive/hms/video/sdk/models/RecordingType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "type"
    .end annotation
.end field

.field private final updatedAt:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/models/RecordingType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llive/hms/video/sdk/models/HMSNotifications;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->type:Llive/hms/video/sdk/models/RecordingType;

    iput-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->startedAt:Ljava/lang/Long;

    iput-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->updatedAt:Ljava/lang/Long;

    iput-object p4, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->stoppedAt:Ljava/lang/Long;

    iput-object p5, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->state:Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    iput-object p6, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;Llive/hms/video/sdk/models/RecordingType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;ILjava/lang/Object;)Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->type:Llive/hms/video/sdk/models/RecordingType;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->startedAt:Ljava/lang/Long;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->updatedAt:Ljava/lang/Long;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->stoppedAt:Ljava/lang/Long;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->state:Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->copy(Llive/hms/video/sdk/models/RecordingType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;)Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Llive/hms/video/sdk/models/RecordingType;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->type:Llive/hms/video/sdk/models/RecordingType;

    return-object v0
.end method

.method public final component2()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->startedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->updatedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->stoppedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component5()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->state:Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    return-object v0
.end method

.method public final component6()Llive/hms/video/sdk/models/HMSNotifications$ServerError;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;

    return-object v0
.end method

.method public final copy(Llive/hms/video/sdk/models/RecordingType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;)Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;
    .locals 8

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;-><init>(Llive/hms/video/sdk/models/RecordingType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;Llive/hms/video/sdk/models/HMSNotifications$ServerError;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->type:Llive/hms/video/sdk/models/RecordingType;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->type:Llive/hms/video/sdk/models/RecordingType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->startedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->startedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->updatedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->updatedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->stoppedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->stoppedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->state:Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->state:Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;

    iget-object p1, p1, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getError()Llive/hms/video/sdk/models/HMSNotifications$ServerError;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;

    return-object v0
.end method

.method public final getStartedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->startedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final getState()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->state:Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    return-object v0
.end method

.method public final getStoppedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->stoppedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final getType()Llive/hms/video/sdk/models/RecordingType;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->type:Llive/hms/video/sdk/models/RecordingType;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->updatedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->type:Llive/hms/video/sdk/models/RecordingType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->startedAt:Ljava/lang/Long;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->updatedAt:Ljava/lang/Long;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->stoppedAt:Ljava/lang/Long;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->state:Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$ServerError;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RecordUpdateNotification(type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->type:Llive/hms/video/sdk/models/RecordingType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", startedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->startedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->updatedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stoppedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->stoppedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->state:Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;->error:Llive/hms/video/sdk/models/HMSNotifications$ServerError;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
