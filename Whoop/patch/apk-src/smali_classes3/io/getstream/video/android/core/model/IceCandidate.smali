.class public final Lio/getstream/video/android/core/model/IceCandidate;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/video/android/core/model/IceCandidate$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 /2\u00020\u0001:\u000201B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tBA\u0008\u0011\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0008\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u00c1\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c0\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0004H\u00c0\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c0\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c0\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0018J:\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008,\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010)\u001a\u0004\u0008-\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010)\u001a\u0004\u0008.\u0010\u0018\u00a8\u00062"
    }
    d2 = {
        "Lio/getstream/video/android/core/model/IceCandidate;",
        "",
        "",
        "sdpMid",
        "",
        "sdpMLineIndex",
        "candidate",
        "usernameFragment",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "seen1",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$stream_video_android_core_release",
        "(Lio/getstream/video/android/core/model/IceCandidate;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1$stream_video_android_core_release",
        "()Ljava/lang/String;",
        "component1",
        "component2$stream_video_android_core_release",
        "()I",
        "component2",
        "component3$stream_video_android_core_release",
        "component3",
        "component4$stream_video_android_core_release",
        "component4",
        "copy",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lio/getstream/video/android/core/model/IceCandidate;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getSdpMid$stream_video_android_core_release",
        "I",
        "getSdpMLineIndex$stream_video_android_core_release",
        "getCandidate$stream_video_android_core_release",
        "getUsernameFragment$stream_video_android_core_release",
        "Companion",
        "$serializer",
        "io/getstream/video/android/core/model/a",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final Companion:Lio/getstream/video/android/core/model/a;


# instance fields
.field private final candidate:Ljava/lang/String;

.field private final sdpMLineIndex:I

.field private final sdpMid:Ljava/lang/String;

.field private final usernameFragment:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/video/android/core/model/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/video/android/core/model/IceCandidate;->Companion:Lio/getstream/video/android/core/model/a;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lio/getstream/video/android/core/model/IceCandidate$$serializer;->INSTANCE:Lio/getstream/video/android/core/model/IceCandidate$$serializer;

    invoke-virtual {p6}, Lio/getstream/video/android/core/model/IceCandidate$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMid:Ljava/lang/String;

    iput p3, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMLineIndex:I

    iput-object p4, p0, Lio/getstream/video/android/core/model/IceCandidate;->candidate:Ljava/lang/String;

    iput-object p5, p0, Lio/getstream/video/android/core/model/IceCandidate;->usernameFragment:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "sdpMid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "candidate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMid:Ljava/lang/String;

    .line 4
    iput p2, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMLineIndex:I

    .line 5
    iput-object p3, p0, Lio/getstream/video/android/core/model/IceCandidate;->candidate:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lio/getstream/video/android/core/model/IceCandidate;->usernameFragment:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/video/android/core/model/IceCandidate;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/video/android/core/model/IceCandidate;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMid:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMLineIndex:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/getstream/video/android/core/model/IceCandidate;->candidate:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/video/android/core/model/IceCandidate;->usernameFragment:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/video/android/core/model/IceCandidate;->copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lio/getstream/video/android/core/model/IceCandidate;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$stream_video_android_core_release(Lio/getstream/video/android/core/model/IceCandidate;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMid:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget v1, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMLineIndex:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x2

    iget-object v1, p0, Lio/getstream/video/android/core/model/IceCandidate;->candidate:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lio/getstream/video/android/core/model/IceCandidate;->usernameFragment:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1$stream_video_android_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMid:Ljava/lang/String;

    return-object v0
.end method

.method public final component2$stream_video_android_core_release()I
    .locals 1

    iget v0, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMLineIndex:I

    return v0
.end method

.method public final component3$stream_video_android_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/core/model/IceCandidate;->candidate:Ljava/lang/String;

    return-object v0
.end method

.method public final component4$stream_video_android_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/core/model/IceCandidate;->usernameFragment:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lio/getstream/video/android/core/model/IceCandidate;
    .locals 1

    const-string v0, "sdpMid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "candidate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/video/android/core/model/IceCandidate;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/video/android/core/model/IceCandidate;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/video/android/core/model/IceCandidate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/video/android/core/model/IceCandidate;

    iget-object v1, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/video/android/core/model/IceCandidate;->sdpMid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMLineIndex:I

    iget v3, p1, Lio/getstream/video/android/core/model/IceCandidate;->sdpMLineIndex:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/video/android/core/model/IceCandidate;->candidate:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/video/android/core/model/IceCandidate;->candidate:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/video/android/core/model/IceCandidate;->usernameFragment:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/video/android/core/model/IceCandidate;->usernameFragment:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCandidate$stream_video_android_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/core/model/IceCandidate;->candidate:Ljava/lang/String;

    return-object v0
.end method

.method public final getSdpMLineIndex$stream_video_android_core_release()I
    .locals 1

    iget v0, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMLineIndex:I

    return v0
.end method

.method public final getSdpMid$stream_video_android_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMid:Ljava/lang/String;

    return-object v0
.end method

.method public final getUsernameFragment$stream_video_android_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/core/model/IceCandidate;->usernameFragment:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMLineIndex:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/video/android/core/model/IceCandidate;->candidate:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/video/android/core/model/IceCandidate;->usernameFragment:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMid:Ljava/lang/String;

    iget v1, p0, Lio/getstream/video/android/core/model/IceCandidate;->sdpMLineIndex:I

    iget-object v2, p0, Lio/getstream/video/android/core/model/IceCandidate;->candidate:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/video/android/core/model/IceCandidate;->usernameFragment:Ljava/lang/String;

    const-string v4, ", sdpMLineIndex="

    const-string v5, ", candidate="

    const-string v6, "IceCandidate(sdpMid="

    invoke-static {v1, v6, v0, v4, v5}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", usernameFragment="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
