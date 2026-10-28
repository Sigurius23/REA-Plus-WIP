.class public final Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/models/HMSNotifications;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TranscriptionsPeerList"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001BC\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nH\u00c6\u0003JV\u0010\u001d\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020%H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\u0008\u0011\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\u0008\u0012\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006&"
    }
    d2 = {
        "Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;",
        "",
        "startedAt",
        "",
        "stoppedAt",
        "updatedAt",
        "initialisedAt",
        "state",
        "Llive/hms/video/sdk/models/TranscriptionState;",
        "mode",
        "Llive/hms/video/sdk/models/TranscriptionsMode;",
        "<init>",
        "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;)V",
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
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;)Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;",
        "equals",
        "",
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
.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->startedAt:Ljava/lang/Long;

    iput-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->stoppedAt:Ljava/lang/Long;

    iput-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->updatedAt:Ljava/lang/Long;

    iput-object p4, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->initialisedAt:Ljava/lang/Long;

    iput-object p5, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->state:Llive/hms/video/sdk/models/TranscriptionState;

    iput-object p6, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;ILjava/lang/Object;)Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->startedAt:Ljava/lang/Long;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->stoppedAt:Ljava/lang/Long;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->updatedAt:Ljava/lang/Long;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->initialisedAt:Ljava/lang/Long;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->state:Llive/hms/video/sdk/models/TranscriptionState;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->copy(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;)Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->startedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component2()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->stoppedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->updatedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->initialisedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final component5()Llive/hms/video/sdk/models/TranscriptionState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->state:Llive/hms/video/sdk/models/TranscriptionState;

    return-object v0
.end method

.method public final component6()Llive/hms/video/sdk/models/TranscriptionsMode;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    return-object v0
.end method

.method public final copy(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;)Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;
    .locals 7

    new-instance v0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/TranscriptionState;Llive/hms/video/sdk/models/TranscriptionsMode;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->startedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->startedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->stoppedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->stoppedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->updatedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->updatedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->initialisedAt:Ljava/lang/Long;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->initialisedAt:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->state:Llive/hms/video/sdk/models/TranscriptionState;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->state:Llive/hms/video/sdk/models/TranscriptionState;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    iget-object p1, p1, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getInitialisedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->initialisedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final getMode()Llive/hms/video/sdk/models/TranscriptionsMode;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    return-object v0
.end method

.method public final getStartedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->startedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final getState()Llive/hms/video/sdk/models/TranscriptionState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->state:Llive/hms/video/sdk/models/TranscriptionState;

    return-object v0
.end method

.method public final getStoppedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->stoppedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->updatedAt:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->startedAt:Ljava/lang/Long;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->stoppedAt:Ljava/lang/Long;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->updatedAt:Ljava/lang/Long;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->initialisedAt:Ljava/lang/Long;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->state:Llive/hms/video/sdk/models/TranscriptionState;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TranscriptionsPeerList(startedAt="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->startedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stoppedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->stoppedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->updatedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", initialisedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->initialisedAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->state:Llive/hms/video/sdk/models/TranscriptionState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TranscriptionsPeerList;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
