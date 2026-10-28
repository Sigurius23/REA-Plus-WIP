.class public final Llive/hms/video/utils/HmsUtilities$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/utils/HmsUtilities;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000c0\rj\u0008\u0012\u0004\u0012\u00020\u000c`\u000b2\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J#\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00120\rj\u0008\u0012\u0004\u0012\u00020\u0012`\u000b2\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001cJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001dJ\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001dH\u0003R\u0019\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\""
    }
    d2 = {
        "Llive/hms/video/utils/HmsUtilities$Companion;",
        "",
        "<init>",
        "()V",
        "SOFTWARE_IMPLEMENTATION_PREFIXES",
        "",
        "",
        "getSOFTWARE_IMPLEMENTATION_PREFIXES",
        "()[Ljava/lang/String;",
        "[Ljava/lang/String;",
        "getAllVideoTracks",
        "Lkotlin/collections/ArrayList;",
        "Llive/hms/video/media/tracks/HMSVideoTrack;",
        "Ljava/util/ArrayList;",
        "room",
        "Llive/hms/video/sdk/models/HMSRoom;",
        "(Llive/hms/video/sdk/models/HMSRoom;)Ljava/util/ArrayList;",
        "getAllAudioTracks",
        "Llive/hms/video/media/tracks/HMSAudioTrack;",
        "getPeer",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "peerId",
        "getTrack",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "trackId",
        "getAudioTrack",
        "getVideoTrack",
        "getSupportedVp8CodecsList",
        "",
        "Landroid/media/MediaCodecInfo;",
        "isSoftwareOnly",
        "",
        "codecInfo",
        "isSoftwareOnlyQOrHigher",
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
    invoke-direct {p0}, Llive/hms/video/utils/HmsUtilities$Companion;-><init>()V

    return-void
.end method

.method private final isSoftwareOnlyQOrHigher(Landroid/media/MediaCodecInfo;)Z
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1d
    .end annotation

    invoke-virtual {p1}, Landroid/media/MediaCodecInfo;->isSoftwareOnly()Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final getAllAudioTracks(Llive/hms/video/sdk/models/HMSRoom;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSRoom;",
            ")",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/media/tracks/HMSAudioTrack;",
            ">;"
        }
    .end annotation

    const-string v0, "room"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSRoom;->getPeerList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/sdk/models/HMSPeer;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSPeer;->getAudioTrack()Llive/hms/video/media/tracks/HMSAudioTrack;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSPeer;->getAuxiliaryTracks()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/media/tracks/HMSTrack;

    instance-of v3, v2, Llive/hms/video/media/tracks/HMSAudioTrack;

    if-eqz v3, :cond_2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public final getAllVideoTracks(Llive/hms/video/sdk/models/HMSRoom;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSRoom;",
            ")",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/media/tracks/HMSVideoTrack;",
            ">;"
        }
    .end annotation

    const-string v0, "room"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSRoom;->getPeerList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/sdk/models/HMSPeer;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSPeer;->getVideoTrack()Llive/hms/video/media/tracks/HMSVideoTrack;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSPeer;->getAuxiliaryTracks()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/media/tracks/HMSTrack;

    instance-of v3, v2, Llive/hms/video/media/tracks/HMSVideoTrack;

    if-eqz v3, :cond_2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public final getAudioTrack(Ljava/lang/String;Llive/hms/video/sdk/models/HMSRoom;)Llive/hms/video/media/tracks/HMSAudioTrack;
    .locals 2

    const-string v0, "trackId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "room"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Llive/hms/video/utils/HmsUtilities$Companion;->getAllAudioTracks(Llive/hms/video/sdk/models/HMSRoom;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Llive/hms/video/media/tracks/HMSAudioTrack;

    invoke-virtual {v1}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Llive/hms/video/media/tracks/HMSAudioTrack;

    return-object v0
.end method

.method public final getPeer(Ljava/lang/String;Llive/hms/video/sdk/models/HMSRoom;)Llive/hms/video/sdk/models/HMSPeer;
    .locals 2

    const-string v0, "peerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "room"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Llive/hms/video/sdk/models/HMSRoom;->getPeerList()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Llive/hms/video/sdk/models/HMSPeer;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSPeer;->getPeerID()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Llive/hms/video/sdk/models/HMSPeer;

    return-object v0
.end method

.method public final getSOFTWARE_IMPLEMENTATION_PREFIXES()[Ljava/lang/String;
    .locals 1

    invoke-static {}, Llive/hms/video/utils/HmsUtilities;->access$getSOFTWARE_IMPLEMENTATION_PREFIXES$cp()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSupportedVp8CodecsList()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/media/MediaCodecInfo;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroid/media/MediaCodecList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/media/MediaCodecList;-><init>(I)V

    invoke-virtual {v0}, Landroid/media/MediaCodecList;->getCodecInfos()[Landroid/media/MediaCodecInfo;

    move-result-object v0

    const-string v1, "getCodecInfos(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v0, v4

    invoke-virtual {v5}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v5}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    move-result-object v6

    aget-object v6, v6, v3

    const-string v7, "get(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "video"

    invoke-static {v6, v7, v3}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v5}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "getName(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "vp8"

    invoke-static {v6, v7, v3}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final getTrack(Ljava/lang/String;Llive/hms/video/sdk/models/HMSRoom;)Llive/hms/video/media/tracks/HMSTrack;
    .locals 1

    const-string v0, "trackId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "room"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Llive/hms/video/utils/HmsUtilities$Companion;->getAudioTrack(Ljava/lang/String;Llive/hms/video/sdk/models/HMSRoom;)Llive/hms/video/media/tracks/HMSAudioTrack;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/utils/HmsUtilities$Companion;->getVideoTrack(Ljava/lang/String;Llive/hms/video/sdk/models/HMSRoom;)Llive/hms/video/media/tracks/HMSVideoTrack;

    move-result-object p1

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getVideoTrack(Ljava/lang/String;Llive/hms/video/sdk/models/HMSRoom;)Llive/hms/video/media/tracks/HMSVideoTrack;
    .locals 2

    const-string v0, "trackId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "room"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Llive/hms/video/utils/HmsUtilities$Companion;->getAllVideoTracks(Llive/hms/video/sdk/models/HMSRoom;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Llive/hms/video/media/tracks/HMSVideoTrack;

    invoke-virtual {v1}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Llive/hms/video/media/tracks/HMSVideoTrack;

    return-object v0
.end method

.method public final isSoftwareOnly(Landroid/media/MediaCodecInfo;)Z
    .locals 5

    const-string v0, "codecInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-direct {p0, p1}, Llive/hms/video/utils/HmsUtilities$Companion;->isSoftwareOnlyQOrHigher(Landroid/media/MediaCodecInfo;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getName(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/utils/HmsUtilities$Companion;->getSOFTWARE_IMPLEMENTATION_PREFIXES()[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    invoke-static {p1, v4, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method
