.class public final Lio/getstream/android/video/generated/models/RingSettingsRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ.\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/RingSettingsRequest;",
        "",
        "autoCancelTimeoutMs",
        "",
        "incomingCallTimeoutMs",
        "missedCallTimeoutMs",
        "(IILjava/lang/Integer;)V",
        "getAutoCancelTimeoutMs",
        "()I",
        "getIncomingCallTimeoutMs",
        "getMissedCallTimeoutMs",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(IILjava/lang/Integer;)Lio/getstream/android/video/generated/models/RingSettingsRequest;",
        "equals",
        "",
        "other",
        "hashCode",
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
.field private final autoCancelTimeoutMs:I

.field private final incomingCallTimeoutMs:I

.field private final missedCallTimeoutMs:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(IILjava/lang/Integer;)V
    .locals 0
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "auto_cancel_timeout_ms"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lqx/q;
            name = "incoming_call_timeout_ms"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "missed_call_timeout_ms"
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->autoCancelTimeoutMs:I

    .line 3
    iput p2, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->incomingCallTimeoutMs:I

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->missedCallTimeoutMs:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/RingSettingsRequest;-><init>(IILjava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/RingSettingsRequest;IILjava/lang/Integer;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/RingSettingsRequest;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->autoCancelTimeoutMs:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->incomingCallTimeoutMs:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->missedCallTimeoutMs:Ljava/lang/Integer;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/RingSettingsRequest;->copy(IILjava/lang/Integer;)Lio/getstream/android/video/generated/models/RingSettingsRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->autoCancelTimeoutMs:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->incomingCallTimeoutMs:I

    return v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->missedCallTimeoutMs:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(IILjava/lang/Integer;)Lio/getstream/android/video/generated/models/RingSettingsRequest;
    .locals 1
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "auto_cancel_timeout_ms"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lqx/q;
            name = "incoming_call_timeout_ms"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "missed_call_timeout_ms"
        .end annotation
    .end param

    new-instance v0, Lio/getstream/android/video/generated/models/RingSettingsRequest;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/android/video/generated/models/RingSettingsRequest;-><init>(IILjava/lang/Integer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/RingSettingsRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/RingSettingsRequest;

    iget v1, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->autoCancelTimeoutMs:I

    iget v3, p1, Lio/getstream/android/video/generated/models/RingSettingsRequest;->autoCancelTimeoutMs:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->incomingCallTimeoutMs:I

    iget v3, p1, Lio/getstream/android/video/generated/models/RingSettingsRequest;->incomingCallTimeoutMs:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->missedCallTimeoutMs:Ljava/lang/Integer;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/RingSettingsRequest;->missedCallTimeoutMs:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAutoCancelTimeoutMs()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->autoCancelTimeoutMs:I

    return v0
.end method

.method public final getIncomingCallTimeoutMs()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->incomingCallTimeoutMs:I

    return v0
.end method

.method public final getMissedCallTimeoutMs()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->missedCallTimeoutMs:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->autoCancelTimeoutMs:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->incomingCallTimeoutMs:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->missedCallTimeoutMs:Ljava/lang/Integer;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->autoCancelTimeoutMs:I

    iget v1, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->incomingCallTimeoutMs:I

    iget-object v2, p0, Lio/getstream/android/video/generated/models/RingSettingsRequest;->missedCallTimeoutMs:Ljava/lang/Integer;

    const-string v3, ", incomingCallTimeoutMs="

    const-string v4, ", missedCallTimeoutMs="

    const-string v5, "RingSettingsRequest(autoCancelTimeoutMs="

    invoke-static {v0, v1, v5, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Ld13/a;->k(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
