.class public final Llive/hms/video/utils/SDPUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/utils/SDPUtils$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J]\u0010\u000e\u001a:\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\nj\u0008\u0012\u0004\u0012\u00020\u0004`\u000b\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u000cj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007`\r0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ5\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\u0008\u0012\u0004\u0012\u00020\u0007`\u000b2\u0006\u0010\u0010\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J=\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\u0008\u0012\u0004\u0012\u00020\u0007`\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J=\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\u0008\u0012\u0004\u0012\u00020\u0007`\u000b2\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J#\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0008\u001a\u00020\u001a2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0006\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008!\u0010 R\u0014\u0010\"\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\"\u0010 R\u0014\u0010#\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008#\u0010 R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010\'\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\'\u0010 \u00a8\u0006("
    }
    d2 = {
        "Llive/hms/video/utils/SDPUtils;",
        "",
        "<init>",
        "()V",
        "",
        "startIndex",
        "",
        "",
        "sdp",
        "Ll83/k;",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "Ljava/util/HashMap;",
        "Lkotlin/collections/HashMap;",
        "getPayloadTypeToCodecMap",
        "(I[Ljava/lang/String;)Ll83/k;",
        "sdpStartIndex",
        "getMediaLines",
        "(I[Ljava/lang/String;)Ljava/util/ArrayList;",
        "Llive/hms/video/media/settings/HMSAudioTrackSettings;",
        "settings",
        "mungeAudioMedia",
        "(Llive/hms/video/media/settings/HMSAudioTrackSettings;I[Ljava/lang/String;)Ljava/util/ArrayList;",
        "Llive/hms/video/media/settings/HMSVideoTrackSettings;",
        "mungeVideoMedia",
        "(Llive/hms/video/media/settings/HMSVideoTrackSettings;I[Ljava/lang/String;)Ljava/util/ArrayList;",
        "Lhms/webrtc/SessionDescription;",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "tracks",
        "mungePublishSDP",
        "(Lhms/webrtc/SessionDescription;[Llive/hms/video/media/tracks/HMSTrack;)Lhms/webrtc/SessionDescription;",
        "TAG",
        "Ljava/lang/String;",
        "ATTRIBUTE_RTPMAP",
        "MEDIA_AUDIO",
        "MEDIA_VIDEO",
        "Lyb3/p;",
        "SDP_SEPARATOR_REGEX",
        "Lyb3/p;",
        "SDP_SEPARATOR",
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


# static fields
.field private static final ATTRIBUTE_RTPMAP:Ljava/lang/String; = "a=rtpmap"

.field public static final INSTANCE:Llive/hms/video/utils/SDPUtils;

.field private static final MEDIA_AUDIO:Ljava/lang/String; = "m=audio"

.field private static final MEDIA_VIDEO:Ljava/lang/String; = "m=video"

.field private static final SDP_SEPARATOR:Ljava/lang/String; = "\r\n"

.field private static final SDP_SEPARATOR_REGEX:Lyb3/p;

.field private static final TAG:Ljava/lang/String; = "SDPUtils"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/utils/SDPUtils;

    invoke-direct {v0}, Llive/hms/video/utils/SDPUtils;-><init>()V

    sput-object v0, Llive/hms/video/utils/SDPUtils;->INSTANCE:Llive/hms/video/utils/SDPUtils;

    new-instance v0, Lyb3/p;

    const-string v1, "(\r\n|\r|\n)"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Llive/hms/video/utils/SDPUtils;->SDP_SEPARATOR_REGEX:Lyb3/p;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getMediaLines(I[Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    aget-object v1, p2, p1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    array-length v1, p2

    if-ge p1, v1, :cond_1

    aget-object v1, p2, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x6d

    if-ne v1, v2, :cond_0

    :cond_1
    return-object v0
.end method

.method private final getPayloadTypeToCodecMap(I[Ljava/lang/String;)Ll83/k;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[",
            "Ljava/lang/String;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    aget-object v0, p2, p1

    const-string v1, "m=audio"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    aget-object v0, p2, p1

    const-string v1, "m=video"

    invoke-static {v0, v1, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Expected `startIndex="

    const-string v1, "` to be a audio/video media attribute in sdp"

    invoke-static {p1, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    aget-object v0, p2, p1

    const-string v1, " "

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v0, v3, v4}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x3

    :goto_1
    if-ge v6, v5, :cond_2

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :cond_3
    aget-object v5, p2, p1

    const-string v6, "a=rtpmap"

    invoke-static {v5, v6, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_4

    aget-object v5, p2, p1

    const/16 v6, 0x9

    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "substring(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v4}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const/4 v7, 0x1

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    add-int/lit8 p1, p1, 0x1

    array-length v5, p2

    if-ge p1, v5, :cond_5

    aget-object v5, p2, p1

    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x6d

    if-ne v5, v6, :cond_3

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "getPayloadTypeToCodecMap: payloadPriority="

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " payloadTypeToCodecMap="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "SDPUtils"

    invoke-static {p2, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Ll83/k;

    invoke-direct {p1, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method private final mungeAudioMedia(Llive/hms/video/media/settings/HMSAudioTrackSettings;I[Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/settings/HMSAudioTrackSettings;",
            "I[",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p2, p3}, Llive/hms/video/utils/SDPUtils;->getPayloadTypeToCodecMap(I[Ljava/lang/String;)Ll83/k;

    move-result-object v1

    iget-object v2, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {p1}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->getCodec()Llive/hms/video/media/codec/HMSAudioCodec;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v4}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/lang/Iterable;

    const/4 v9, 0x0

    const/16 v10, 0x3e

    const-string v6, " "

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    :cond_2
    aget-object v1, p3, p2

    const-string v2, "m=audio"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    aget-object v1, p3, p2

    const-string v2, " "

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    invoke-static {v1, v2, v5}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "m=audio "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x20

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v6, 0x2

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    aget-object v1, p3, p2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 p2, p2, 0x1

    array-length v1, p3

    if-ge p2, v1, :cond_4

    aget-object v1, p3, p2

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x6d

    if-ne v1, v2, :cond_2

    :cond_4
    return-object v0

    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Codec="

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->getCodec()Llive/hms/video/media/codec/HMSAudioCodec;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " not supported in this device"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final mungeVideoMedia(Llive/hms/video/media/settings/HMSVideoTrackSettings;I[Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/settings/HMSVideoTrackSettings;",
            "I[",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p2, p3}, Llive/hms/video/utils/SDPUtils;->getPayloadTypeToCodecMap(I[Ljava/lang/String;)Ll83/k;

    move-result-object v1

    iget-object v2, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {p1}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getCodec()Llive/hms/video/media/codec/HMSVideoCodec;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v4}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/lang/Iterable;

    const/4 v9, 0x0

    const/16 v10, 0x3e

    const-string v6, " "

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    :cond_2
    aget-object v1, p3, p2

    const-string v2, "m=video"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    aget-object v1, p3, p2

    const-string v2, " "

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    invoke-static {v1, v2, v5}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "m=video "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x20

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v6, 0x2

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    aget-object v1, p3, p2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 p2, p2, 0x1

    array-length v1, p3

    if-ge p2, v1, :cond_4

    aget-object v1, p3, p2

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x6d

    if-ne v1, v2, :cond_2

    :cond_4
    return-object v0

    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Codec="

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getCodec()Llive/hms/video/media/codec/HMSVideoCodec;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " not supported in this device"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final mungePublishSDP(Lhms/webrtc/SessionDescription;[Llive/hms/video/media/tracks/HMSTrack;)Lhms/webrtc/SessionDescription;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "sdp"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "tracks"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, v1, Lhms/webrtc/SessionDescription;->description:Ljava/lang/String;

    const-string v5, "description"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v5, Llive/hms/video/utils/SDPUtils;->SDP_SEPARATOR_REGEX:Lyb3/p;

    invoke-virtual {v5, v3}, Lyb3/p;->h(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    const/4 v5, 0x0

    new-array v6, v5, [Ljava/lang/String;

    invoke-interface {v3, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    move v6, v5

    :goto_0
    array-length v7, v3

    const/16 v8, 0x6d

    if-ge v6, v7, :cond_0

    aget-object v7, v3, v6

    invoke-virtual {v7, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-eq v7, v8, :cond_0

    aget-object v7, v3, v6

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    array-length v7, v3

    if-ge v6, v7, :cond_a

    aget-object v7, v3, v6

    const-string v9, "m=audio"

    invoke-static {v7, v9, v5}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    const-string v10, "m=video"

    const/4 v11, 0x1

    if-nez v7, :cond_2

    aget-object v7, v3, v6

    invoke-static {v7, v10, v5}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_2

    :cond_1
    invoke-direct {v0, v6, v3}, Llive/hms/video/utils/SDPUtils;->getMediaLines(I[Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_6

    :cond_2
    :goto_2
    array-length v7, v2

    move v12, v5

    :goto_3
    if-ge v12, v7, :cond_8

    aget-object v13, v2, v12

    invoke-virtual {v13}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v14

    sget-object v15, Llive/hms/video/utils/SDPUtils$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    aget v14, v15, v14

    const/4 v8, 0x2

    if-eq v14, v11, :cond_4

    if-ne v14, v8, :cond_3

    move-object v14, v10

    goto :goto_4

    :cond_3
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_4
    move-object v14, v9

    :goto_4
    aget-object v8, v3, v6

    invoke-static {v8, v14, v5}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v8

    if-nez v8, :cond_5

    add-int/lit8 v12, v12, 0x1

    const/16 v8, 0x6d

    goto :goto_3

    :cond_5
    invoke-virtual {v13}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v15, v7

    if-eq v7, v11, :cond_7

    const/4 v8, 0x2

    if-ne v7, v8, :cond_6

    check-cast v13, Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    invoke-virtual {v13}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->getSettings()Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object v7

    invoke-direct {v0, v7, v6, v3}, Llive/hms/video/utils/SDPUtils;->mungeVideoMedia(Llive/hms/video/media/settings/HMSVideoTrackSettings;I[Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    goto :goto_5

    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_7
    check-cast v13, Llive/hms/video/media/tracks/HMSLocalAudioTrack;

    invoke-virtual {v13}, Llive/hms/video/media/tracks/HMSLocalAudioTrack;->getSettings()Llive/hms/video/media/settings/HMSAudioTrackSettings;

    move-result-object v7

    invoke-direct {v0, v7, v6, v3}, Llive/hms/video/utils/SDPUtils;->mungeAudioMedia(Llive/hms/video/media/settings/HMSAudioTrackSettings;I[Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    :goto_5
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_8
    :goto_6
    add-int/2addr v6, v11

    array-length v7, v3

    if-ge v6, v7, :cond_9

    aget-object v7, v3, v6

    invoke-virtual {v7, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x6d

    if-ne v7, v8, :cond_8

    goto/16 :goto_1

    :cond_9
    const/16 v8, 0x6d

    goto/16 :goto_1

    :cond_a
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v8, 0x0

    const/16 v9, 0x3e

    const-string v5, "\r\n"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\r\n"

    invoke-static {v3, v4, v2}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "mungePublishSDP: modified sdp [size="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "] "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "SDPUtils"

    invoke-static {v4, v3}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lhms/webrtc/SessionDescription;

    iget-object v1, v1, Lhms/webrtc/SessionDescription;->type:Lhms/webrtc/SessionDescription$Type;

    invoke-direct {v3, v1, v2}, Lhms/webrtc/SessionDescription;-><init>(Lhms/webrtc/SessionDescription$Type;Ljava/lang/String;)V

    return-object v3
.end method
