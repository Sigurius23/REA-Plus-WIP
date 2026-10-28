.class public final Llive/hms/video/sdk/models/TrackForLayerUpdate;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/sdk/models/TrackForLayerUpdate$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0080\u0008\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0008H\u00c6\u0003J;\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\u00082\u0008\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012\u00a8\u0006$"
    }
    d2 = {
        "Llive/hms/video/sdk/models/TrackForLayerUpdate;",
        "",
        "expectedLayer",
        "Llive/hms/video/sdk/models/Layer;",
        "currentLayer",
        "trackId",
        "",
        "subscriberDegraded",
        "",
        "publisherDegraded",
        "<init>",
        "(Llive/hms/video/sdk/models/Layer;Llive/hms/video/sdk/models/Layer;Ljava/lang/String;ZZ)V",
        "getExpectedLayer",
        "()Llive/hms/video/sdk/models/Layer;",
        "getCurrentLayer",
        "getTrackId",
        "()Ljava/lang/String;",
        "getSubscriberDegraded",
        "()Z",
        "getPublisherDegraded",
        "getExpectedSimulcastLayer",
        "Llive/hms/video/media/settings/HMSSimulcastLayer;",
        "getCurrentSimulcastLayer",
        "getSimulcastLayer",
        "layer",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
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
.field private final currentLayer:Llive/hms/video/sdk/models/Layer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "current_layer"
    .end annotation
.end field

.field private final expectedLayer:Llive/hms/video/sdk/models/Layer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "expected_layer"
    .end annotation
.end field

.field private final publisherDegraded:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "publisher_degraded"
    .end annotation
.end field

.field private final subscriberDegraded:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subscriber_degraded"
    .end annotation
.end field

.field private final trackId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "track_id"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/models/Layer;Llive/hms/video/sdk/models/Layer;Ljava/lang/String;ZZ)V
    .locals 1

    const-string v0, "expectedLayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentLayer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->expectedLayer:Llive/hms/video/sdk/models/Layer;

    .line 3
    iput-object p2, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->currentLayer:Llive/hms/video/sdk/models/Layer;

    .line 4
    iput-object p3, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->trackId:Ljava/lang/String;

    .line 5
    iput-boolean p4, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->subscriberDegraded:Z

    .line 6
    iput-boolean p5, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->publisherDegraded:Z

    return-void
.end method

.method public synthetic constructor <init>(Llive/hms/video/sdk/models/Layer;Llive/hms/video/sdk/models/Layer;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p4, v0

    :cond_0
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_1

    move p6, v0

    :goto_0
    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move p6, p5

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p6}, Llive/hms/video/sdk/models/TrackForLayerUpdate;-><init>(Llive/hms/video/sdk/models/Layer;Llive/hms/video/sdk/models/Layer;Ljava/lang/String;ZZ)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/TrackForLayerUpdate;Llive/hms/video/sdk/models/Layer;Llive/hms/video/sdk/models/Layer;Ljava/lang/String;ZZILjava/lang/Object;)Llive/hms/video/sdk/models/TrackForLayerUpdate;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->expectedLayer:Llive/hms/video/sdk/models/Layer;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->currentLayer:Llive/hms/video/sdk/models/Layer;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->trackId:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-boolean p4, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->subscriberDegraded:Z

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->publisherDegraded:Z

    :cond_4
    move p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Llive/hms/video/sdk/models/TrackForLayerUpdate;->copy(Llive/hms/video/sdk/models/Layer;Llive/hms/video/sdk/models/Layer;Ljava/lang/String;ZZ)Llive/hms/video/sdk/models/TrackForLayerUpdate;

    move-result-object p0

    return-object p0
.end method

.method private final getSimulcastLayer(Llive/hms/video/sdk/models/Layer;)Llive/hms/video/media/settings/HMSSimulcastLayer;
    .locals 1

    sget-object v0, Llive/hms/video/sdk/models/TrackForLayerUpdate$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    sget-object p1, Llive/hms/video/media/settings/HMSSimulcastLayer;->HIGH:Llive/hms/video/media/settings/HMSSimulcastLayer;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Llive/hms/video/media/settings/HMSSimulcastLayer;->MEDIUM:Llive/hms/video/media/settings/HMSSimulcastLayer;

    return-object p1

    :cond_2
    sget-object p1, Llive/hms/video/media/settings/HMSSimulcastLayer;->LOW:Llive/hms/video/media/settings/HMSSimulcastLayer;

    return-object p1

    :cond_3
    sget-object p1, Llive/hms/video/media/settings/HMSSimulcastLayer;->NONE:Llive/hms/video/media/settings/HMSSimulcastLayer;

    return-object p1
.end method


# virtual methods
.method public final component1()Llive/hms/video/sdk/models/Layer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->expectedLayer:Llive/hms/video/sdk/models/Layer;

    return-object v0
.end method

.method public final component2()Llive/hms/video/sdk/models/Layer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->currentLayer:Llive/hms/video/sdk/models/Layer;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->trackId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->subscriberDegraded:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->publisherDegraded:Z

    return v0
.end method

.method public final copy(Llive/hms/video/sdk/models/Layer;Llive/hms/video/sdk/models/Layer;Ljava/lang/String;ZZ)Llive/hms/video/sdk/models/TrackForLayerUpdate;
    .locals 7

    const-string v0, "expectedLayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentLayer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/sdk/models/TrackForLayerUpdate;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Llive/hms/video/sdk/models/TrackForLayerUpdate;-><init>(Llive/hms/video/sdk/models/Layer;Llive/hms/video/sdk/models/Layer;Ljava/lang/String;ZZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/TrackForLayerUpdate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/TrackForLayerUpdate;

    iget-object v1, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->expectedLayer:Llive/hms/video/sdk/models/Layer;

    iget-object v3, p1, Llive/hms/video/sdk/models/TrackForLayerUpdate;->expectedLayer:Llive/hms/video/sdk/models/Layer;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->currentLayer:Llive/hms/video/sdk/models/Layer;

    iget-object v3, p1, Llive/hms/video/sdk/models/TrackForLayerUpdate;->currentLayer:Llive/hms/video/sdk/models/Layer;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->trackId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/TrackForLayerUpdate;->trackId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->subscriberDegraded:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/TrackForLayerUpdate;->subscriberDegraded:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->publisherDegraded:Z

    iget-boolean p1, p1, Llive/hms/video/sdk/models/TrackForLayerUpdate;->publisherDegraded:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCurrentLayer()Llive/hms/video/sdk/models/Layer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->currentLayer:Llive/hms/video/sdk/models/Layer;

    return-object v0
.end method

.method public final getCurrentSimulcastLayer()Llive/hms/video/media/settings/HMSSimulcastLayer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->currentLayer:Llive/hms/video/sdk/models/Layer;

    invoke-direct {p0, v0}, Llive/hms/video/sdk/models/TrackForLayerUpdate;->getSimulcastLayer(Llive/hms/video/sdk/models/Layer;)Llive/hms/video/media/settings/HMSSimulcastLayer;

    move-result-object v0

    return-object v0
.end method

.method public final getExpectedLayer()Llive/hms/video/sdk/models/Layer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->expectedLayer:Llive/hms/video/sdk/models/Layer;

    return-object v0
.end method

.method public final getExpectedSimulcastLayer()Llive/hms/video/media/settings/HMSSimulcastLayer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->expectedLayer:Llive/hms/video/sdk/models/Layer;

    invoke-direct {p0, v0}, Llive/hms/video/sdk/models/TrackForLayerUpdate;->getSimulcastLayer(Llive/hms/video/sdk/models/Layer;)Llive/hms/video/media/settings/HMSSimulcastLayer;

    move-result-object v0

    return-object v0
.end method

.method public final getPublisherDegraded()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->publisherDegraded:Z

    return v0
.end method

.method public final getSubscriberDegraded()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->subscriberDegraded:Z

    return v0
.end method

.method public final getTrackId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->trackId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->expectedLayer:Llive/hms/video/sdk/models/Layer;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->currentLayer:Llive/hms/video/sdk/models/Layer;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->trackId:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->subscriberDegraded:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->publisherDegraded:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TrackForLayerUpdate(expectedLayer="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->expectedLayer:Llive/hms/video/sdk/models/Layer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentLayer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->currentLayer:Llive/hms/video/sdk/models/Layer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trackId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->trackId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", subscriberDegraded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->subscriberDegraded:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", publisherDegraded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/TrackForLayerUpdate;->publisherDegraded:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
