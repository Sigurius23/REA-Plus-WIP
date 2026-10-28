.class public final Llive/hms/video/media/tracks/HMSTrackType$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/media/tracks/HMSTrackType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\u0008\u0008J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0000\u00a2\u0006\u0002\u0008\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Llive/hms/video/media/tracks/HMSTrackType$Companion;",
        "",
        "<init>",
        "()V",
        "from",
        "Llive/hms/video/media/tracks/HMSTrackType;",
        "track",
        "Lhms/webrtc/MediaStreamTrack;",
        "from$lib_release",
        "stringTrackType",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llive/hms/video/media/tracks/HMSTrackType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from$lib_release(Lhms/webrtc/MediaStreamTrack;)Llive/hms/video/media/tracks/HMSTrackType;
    .locals 1

    const-string v0, "track"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lhms/webrtc/MediaStreamTrack;->kind()Ljava/lang/String;

    move-result-object p1

    .line 2
    const-string v0, "audio"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Llive/hms/video/media/tracks/HMSTrackType;->AUDIO:Llive/hms/video/media/tracks/HMSTrackType;

    return-object p1

    .line 3
    :cond_0
    const-string v0, "video"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Llive/hms/video/media/tracks/HMSTrackType;->VIDEO:Llive/hms/video/media/tracks/HMSTrackType;

    return-object p1

    .line 4
    :cond_1
    sget-object p1, Llive/hms/video/media/tracks/HMSTrackType;->VIDEO:Llive/hms/video/media/tracks/HMSTrackType;

    return-object p1
.end method

.method public final from$lib_release(Ljava/lang/String;)Llive/hms/video/media/tracks/HMSTrackType;
    .locals 1

    .line 5
    const-string v0, "audio"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Llive/hms/video/media/tracks/HMSTrackType;->AUDIO:Llive/hms/video/media/tracks/HMSTrackType;

    return-object p1

    .line 6
    :cond_0
    const-string v0, "video"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Llive/hms/video/media/tracks/HMSTrackType;->VIDEO:Llive/hms/video/media/tracks/HMSTrackType;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
