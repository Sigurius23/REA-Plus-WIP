.class public final Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0008\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u00032\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;",
        "",
        "stopTranscription",
        "",
        "(Ljava/lang/Boolean;)V",
        "getStopTranscription",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "component1",
        "copy",
        "(Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final stopTranscription:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;-><init>(Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;)V
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "stop_transcription"
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;->stopTranscription:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;-><init>(Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;Ljava/lang/Boolean;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;->stopTranscription:Ljava/lang/Boolean;

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;->copy(Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;->stopTranscription:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;
    .locals 1
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Lqx/q;
            name = "stop_transcription"
        .end annotation
    .end param

    new-instance v0, Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;

    invoke-direct {v0, p1}, Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;-><init>(Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;->stopTranscription:Ljava/lang/Boolean;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;->stopTranscription:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getStopTranscription()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;->stopTranscription:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;->stopTranscription:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;->stopTranscription:Ljava/lang/Boolean;

    const-string v1, "StopClosedCaptionsRequest(stopTranscription="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Lte0/d;->j(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
