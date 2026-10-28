.class public final Lio/getstream/android/video/generated/models/StopLiveResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/StopLiveResponse;",
        "",
        "duration",
        "",
        "call",
        "Lio/getstream/android/video/generated/models/CallResponse;",
        "(Ljava/lang/String;Lio/getstream/android/video/generated/models/CallResponse;)V",
        "getCall",
        "()Lio/getstream/android/video/generated/models/CallResponse;",
        "getDuration",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final call:Lio/getstream/android/video/generated/models/CallResponse;

.field private final duration:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/getstream/android/video/generated/models/CallResponse;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "duration"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/CallResponse;
        .annotation runtime Lqx/q;
            name = "call"
        .end annotation
    .end param

    const-string v0, "duration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/android/video/generated/models/StopLiveResponse;->duration:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/android/video/generated/models/StopLiveResponse;->call:Lio/getstream/android/video/generated/models/CallResponse;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/StopLiveResponse;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallResponse;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/StopLiveResponse;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/StopLiveResponse;->duration:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/StopLiveResponse;->call:Lio/getstream/android/video/generated/models/CallResponse;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/android/video/generated/models/StopLiveResponse;->copy(Ljava/lang/String;Lio/getstream/android/video/generated/models/CallResponse;)Lio/getstream/android/video/generated/models/StopLiveResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveResponse;->duration:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lio/getstream/android/video/generated/models/CallResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveResponse;->call:Lio/getstream/android/video/generated/models/CallResponse;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lio/getstream/android/video/generated/models/CallResponse;)Lio/getstream/android/video/generated/models/StopLiveResponse;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "duration"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/CallResponse;
        .annotation runtime Lqx/q;
            name = "call"
        .end annotation
    .end param

    const-string v0, "duration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/android/video/generated/models/StopLiveResponse;

    invoke-direct {v0, p1, p2}, Lio/getstream/android/video/generated/models/StopLiveResponse;-><init>(Ljava/lang/String;Lio/getstream/android/video/generated/models/CallResponse;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/StopLiveResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/StopLiveResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/StopLiveResponse;->duration:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/StopLiveResponse;->duration:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/StopLiveResponse;->call:Lio/getstream/android/video/generated/models/CallResponse;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/StopLiveResponse;->call:Lio/getstream/android/video/generated/models/CallResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getCall()Lio/getstream/android/video/generated/models/CallResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveResponse;->call:Lio/getstream/android/video/generated/models/CallResponse;

    return-object v0
.end method

.method public final getDuration()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveResponse;->duration:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveResponse;->duration:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/StopLiveResponse;->call:Lio/getstream/android/video/generated/models/CallResponse;

    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/CallResponse;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/StopLiveResponse;->duration:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/StopLiveResponse;->call:Lio/getstream/android/video/generated/models/CallResponse;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "StopLiveResponse(duration="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", call="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
