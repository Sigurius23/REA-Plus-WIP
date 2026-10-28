.class public final Lio/getstream/android/video/generated/models/CallIngressResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallIngressResponse;",
        "",
        "rtmp",
        "Lio/getstream/android/video/generated/models/RTMPIngress;",
        "srt",
        "Lio/getstream/android/video/generated/models/SRTIngress;",
        "whip",
        "Lio/getstream/android/video/generated/models/WHIPIngress;",
        "(Lio/getstream/android/video/generated/models/RTMPIngress;Lio/getstream/android/video/generated/models/SRTIngress;Lio/getstream/android/video/generated/models/WHIPIngress;)V",
        "getRtmp",
        "()Lio/getstream/android/video/generated/models/RTMPIngress;",
        "getSrt",
        "()Lio/getstream/android/video/generated/models/SRTIngress;",
        "getWhip",
        "()Lio/getstream/android/video/generated/models/WHIPIngress;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
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
.field private final rtmp:Lio/getstream/android/video/generated/models/RTMPIngress;

.field private final srt:Lio/getstream/android/video/generated/models/SRTIngress;

.field private final whip:Lio/getstream/android/video/generated/models/WHIPIngress;


# direct methods
.method public constructor <init>(Lio/getstream/android/video/generated/models/RTMPIngress;Lio/getstream/android/video/generated/models/SRTIngress;Lio/getstream/android/video/generated/models/WHIPIngress;)V
    .locals 1
    .param p1    # Lio/getstream/android/video/generated/models/RTMPIngress;
        .annotation runtime Lqx/q;
            name = "rtmp"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/SRTIngress;
        .annotation runtime Lqx/q;
            name = "srt"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/WHIPIngress;
        .annotation runtime Lqx/q;
            name = "whip"
        .end annotation
    .end param

    const-string v0, "rtmp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "srt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whip"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->rtmp:Lio/getstream/android/video/generated/models/RTMPIngress;

    iput-object p2, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->srt:Lio/getstream/android/video/generated/models/SRTIngress;

    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->whip:Lio/getstream/android/video/generated/models/WHIPIngress;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallIngressResponse;Lio/getstream/android/video/generated/models/RTMPIngress;Lio/getstream/android/video/generated/models/SRTIngress;Lio/getstream/android/video/generated/models/WHIPIngress;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallIngressResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->rtmp:Lio/getstream/android/video/generated/models/RTMPIngress;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->srt:Lio/getstream/android/video/generated/models/SRTIngress;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->whip:Lio/getstream/android/video/generated/models/WHIPIngress;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/CallIngressResponse;->copy(Lio/getstream/android/video/generated/models/RTMPIngress;Lio/getstream/android/video/generated/models/SRTIngress;Lio/getstream/android/video/generated/models/WHIPIngress;)Lio/getstream/android/video/generated/models/CallIngressResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/android/video/generated/models/RTMPIngress;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->rtmp:Lio/getstream/android/video/generated/models/RTMPIngress;

    return-object v0
.end method

.method public final component2()Lio/getstream/android/video/generated/models/SRTIngress;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->srt:Lio/getstream/android/video/generated/models/SRTIngress;

    return-object v0
.end method

.method public final component3()Lio/getstream/android/video/generated/models/WHIPIngress;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->whip:Lio/getstream/android/video/generated/models/WHIPIngress;

    return-object v0
.end method

.method public final copy(Lio/getstream/android/video/generated/models/RTMPIngress;Lio/getstream/android/video/generated/models/SRTIngress;Lio/getstream/android/video/generated/models/WHIPIngress;)Lio/getstream/android/video/generated/models/CallIngressResponse;
    .locals 1
    .param p1    # Lio/getstream/android/video/generated/models/RTMPIngress;
        .annotation runtime Lqx/q;
            name = "rtmp"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/SRTIngress;
        .annotation runtime Lqx/q;
            name = "srt"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/WHIPIngress;
        .annotation runtime Lqx/q;
            name = "whip"
        .end annotation
    .end param

    const-string v0, "rtmp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "srt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whip"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/android/video/generated/models/CallIngressResponse;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/android/video/generated/models/CallIngressResponse;-><init>(Lio/getstream/android/video/generated/models/RTMPIngress;Lio/getstream/android/video/generated/models/SRTIngress;Lio/getstream/android/video/generated/models/WHIPIngress;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallIngressResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallIngressResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->rtmp:Lio/getstream/android/video/generated/models/RTMPIngress;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallIngressResponse;->rtmp:Lio/getstream/android/video/generated/models/RTMPIngress;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->srt:Lio/getstream/android/video/generated/models/SRTIngress;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallIngressResponse;->srt:Lio/getstream/android/video/generated/models/SRTIngress;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->whip:Lio/getstream/android/video/generated/models/WHIPIngress;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallIngressResponse;->whip:Lio/getstream/android/video/generated/models/WHIPIngress;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getRtmp()Lio/getstream/android/video/generated/models/RTMPIngress;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->rtmp:Lio/getstream/android/video/generated/models/RTMPIngress;

    return-object v0
.end method

.method public final getSrt()Lio/getstream/android/video/generated/models/SRTIngress;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->srt:Lio/getstream/android/video/generated/models/SRTIngress;

    return-object v0
.end method

.method public final getWhip()Lio/getstream/android/video/generated/models/WHIPIngress;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->whip:Lio/getstream/android/video/generated/models/WHIPIngress;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->rtmp:Lio/getstream/android/video/generated/models/RTMPIngress;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/RTMPIngress;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->srt:Lio/getstream/android/video/generated/models/SRTIngress;

    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/SRTIngress;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->whip:Lio/getstream/android/video/generated/models/WHIPIngress;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/WHIPIngress;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->rtmp:Lio/getstream/android/video/generated/models/RTMPIngress;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->srt:Lio/getstream/android/video/generated/models/SRTIngress;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallIngressResponse;->whip:Lio/getstream/android/video/generated/models/WHIPIngress;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CallIngressResponse(rtmp="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", srt="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", whip="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
