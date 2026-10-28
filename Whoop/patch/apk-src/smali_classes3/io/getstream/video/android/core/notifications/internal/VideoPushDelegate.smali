.class public final Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;
.super Lio/getstream/android/push/delegate/PushDelegate;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 72\u00020\u0001:\u00018B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ-\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000cJ-\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000cJ-\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000cJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J/\u0010\u0016\u001a\u0004\u0018\u00010\u0007\"\u0004\u0008\u0000\u0010\u0014*\u000e\u0012\u0006\u0008\u0001\u0012\u00028\u0000\u0012\u0002\u0008\u00030\u00062\u0006\u0010\u0015\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J/\u0010\u001b\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00062\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0018H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006H\u0002\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ!\u0010 \u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006H\u0002\u00a2\u0006\u0004\u0008 \u0010\u001eJ!\u0010!\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006H\u0002\u00a2\u0006\u0004\u0008!\u0010\u001eJ!\u0010\"\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006H\u0002\u00a2\u0006\u0004\u0008\"\u0010\u001eJ!\u0010#\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006H\u0002\u00a2\u0006\u0004\u0008#\u0010\u001eJ!\u0010$\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006H\u0002\u00a2\u0006\u0004\u0008$\u0010\u001eJ!\u0010%\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006H\u0002\u00a2\u0006\u0004\u0008%\u0010\u001eJ!\u0010&\u001a\u00020\u001a*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006H\u0002\u00a2\u0006\u0004\u0008&\u0010\u001eJ;\u0010(\u001a\u00020\u001a2\u0014\u0010\'\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006H\u0016\u00a2\u0006\u0004\u0008(\u0010)J%\u0010,\u001a\u00020\u00072\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006H\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105\u00a8\u00069"
    }
    d2 = {
        "Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;",
        "Lio/getstream/android/push/delegate/PushDelegate;",
        "<init>",
        "()V",
        "Lio/getstream/video/android/model/StreamCallId;",
        "callId",
        "",
        "",
        "",
        "payload",
        "Ll83/a0;",
        "handleRingType",
        "(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V",
        "handleMissedType",
        "handleNotificationType",
        "handleLiveStartedType",
        "requestReason",
        "Lt23/j3;",
        "getStreamVideo",
        "(Ljava/lang/String;)Lt23/j3;",
        "K",
        "key",
        "getStringValue",
        "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/String;",
        "Lkotlin/Function0;",
        "effect",
        "",
        "ifValid",
        "(Ljava/util/Map;Lc93/a;)Z",
        "isValid",
        "(Ljava/util/Map;)Z",
        "containsCallId",
        "containsKnownType",
        "isValidRingType",
        "isValidMissedType",
        "isValidNotificationType",
        "isValidLiveStarted",
        "isFromStreamServer",
        "isValidIncomingCall",
        "metadata",
        "handlePushMessage",
        "(Ljava/util/Map;Ljava/util/Map;)Z",
        "getCallDisplayName$stream_video_android_core_release",
        "(Ljava/util/Map;)Ljava/lang/String;",
        "getCallDisplayName",
        "Ly03/a;",
        "pushDevice",
        "registerPushDevice",
        "(Ly03/a;)V",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Companion",
        "h43/c",
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


# static fields
.field public static final Companion:Lh43/c;

.field private static final DEFAULT_CALL_TEXT:Ljava/lang/String; = "Unknown caller"

.field private static final KEY_CALL_CID:Ljava/lang/String; = "call_cid"

.field public static final KEY_CALL_DISPLAY_NAME:Ljava/lang/String; = "call_display_name"

.field public static final KEY_CREATED_BY_DISPLAY_NAME:Ljava/lang/String; = "created_by_display_name"

.field private static final KEY_SENDER:Ljava/lang/String; = "sender"

.field private static final KEY_TYPE:Ljava/lang/String; = "type"

.field private static final KEY_TYPE_LIVE_STARTED:Ljava/lang/String; = "call.live_started"

.field private static final KEY_TYPE_MISSED:Ljava/lang/String; = "call.missed"

.field private static final KEY_TYPE_NOTIFICATION:Ljava/lang/String; = "call.notification"

.field private static final KEY_TYPE_RING:Ljava/lang/String; = "call.ring"

.field private static final VALUE_STREAM_SENDER:Ljava/lang/String; = "stream.video"


# instance fields
.field private final logger$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh43/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->Companion:Lh43/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lio/getstream/android/push/delegate/PushDelegate;-><init>()V

    const-string v0, "Call:PushDelegate"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->logger$delegate:Ll83/h;

    return-void
.end method

.method public static final synthetic access$getDEFAULT_CALL_TEXT$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->DEFAULT_CALL_TEXT:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getStreamVideo(Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;Ljava/lang/String;)Lt23/j3;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->getStreamVideo(Ljava/lang/String;)Lt23/j3;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleLiveStartedType(Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->handleLiveStartedType(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V

    return-void
.end method

.method public static final synthetic access$handleMissedType(Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->handleMissedType(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V

    return-void
.end method

.method public static final synthetic access$handleNotificationType(Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->handleNotificationType(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V

    return-void
.end method

.method public static final synthetic access$handleRingType(Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->handleRingType(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V

    return-void
.end method

.method private final containsCallId(Ljava/util/Map;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "call_cid"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x1

    if-eqz p1, :cond_2

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    move p1, v0

    :goto_2
    xor-int/2addr p1, v0

    return p1
.end method

.method private final containsKnownType(Ljava/util/Map;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "type"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "call.ring"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->isValidRingType(Ljava/util/Map;)Z

    move-result p1

    return p1

    :cond_0
    const-string v1, "call.missed"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0, p1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->isValidMissedType(Ljava/util/Map;)Z

    move-result p1

    return p1

    :cond_1
    const-string v1, "call.notification"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0, p1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->isValidNotificationType(Ljava/util/Map;)Z

    move-result p1

    return p1

    :cond_2
    const-string v1, "call.live_started"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0, p1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->isValidLiveStarted(Ljava/util/Map;)Z

    move-result p1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final getStreamVideo(Ljava/lang/String;)Lt23/j3;
    .locals 6

    sget-object v0, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lt23/i3;->b:Lt23/j3;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    const-string v4, "Ignoring a push notification ("

    const-string v5, ") StreamVideo is not initialised. Handling notifications requires to initialise StreamVideo in Application.onCreate"

    invoke-static {v4, p1, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x0

    invoke-interface {v2, v3, v1, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-object v0
.end method

.method private final getStringValue(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "+TK;*>;TK;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "null cannot be cast to non-null type kotlin.collections.Map<K of io.getstream.video.android.core.notifications.internal.VideoPushDelegate.getStringValue, *>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_0

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    return-object v1
.end method

.method private final handleLiveStartedType(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/video/android/model/StreamCallId;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->getCallDisplayName$stream_video_android_core_release(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "live-started-notification"

    invoke-direct {p0, v1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->getStreamVideo(Ljava/lang/String;)Lt23/j3;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Lt23/b4;

    invoke-virtual {v1, p1, v0, p2}, Lt23/b4;->b(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method private final handleMissedType(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/video/android/model/StreamCallId;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->getCallDisplayName$stream_video_android_core_release(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "missed-type-notification"

    invoke-direct {p0, v1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->getStreamVideo(Ljava/lang/String;)Lt23/j3;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Lt23/b4;

    invoke-virtual {v1, p1, v0, p2}, Lt23/b4;->f(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method private final handleNotificationType(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/video/android/model/StreamCallId;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->getCallDisplayName$stream_video_android_core_release(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "generic-notification"

    invoke-direct {p0, v1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->getStreamVideo(Ljava/lang/String;)Lt23/j3;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Lt23/b4;

    invoke-virtual {v1, p1, v0, p2}, Lt23/b4;->h(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method private final handleRingType(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/video/android/model/StreamCallId;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->getCallDisplayName$stream_video_android_core_release(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ring-type-notification"

    invoke-direct {p0, v1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->getStreamVideo(Ljava/lang/String;)Lt23/j3;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Lt23/b4;

    invoke-virtual {v1, p1, v0, p2}, Lt23/b4;->i(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method private final ifValid(Ljava/util/Map;Lc93/a;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lc93/a;",
            ")Z"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->isValid(Ljava/util/Map;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_1
    return p1
.end method

.method private final isFromStreamServer(Ljava/util/Map;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "sender"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "stream.video"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final isValid(Ljava/util/Map;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->isFromStreamServer(Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->containsCallId(Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->containsKnownType(Ljava/util/Map;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final isValidIncomingCall(Ljava/util/Map;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "type"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_4

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "call_cid"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_2

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    :cond_2
    if-eqz v2, :cond_4

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method private final isValidLiveStarted(Ljava/util/Map;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const/4 p1, 0x1

    return p1
.end method

.method private final isValidMissedType(Ljava/util/Map;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const/4 p1, 0x1

    return p1
.end method

.method private final isValidNotificationType(Ljava/util/Map;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const/4 p1, 0x1

    return p1
.end method

.method private final isValidRingType(Ljava/util/Map;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final getCallDisplayName$stream_video_android_core_release(Ljava/util/Map;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call_display_name"

    invoke-direct {p0, p1, v0}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->getStringValue(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    const-string v0, "created_by_display_name"

    invoke-direct {p0, p1, v0}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->getStringValue(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    move-object v1, p1

    :cond_3
    if-nez v1, :cond_4

    sget-object p1, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->DEFAULT_CALL_TEXT:Ljava/lang/String;

    return-object p1

    :cond_4
    return-object v1
.end method

.method public handlePushMessage(Ljava/util/Map;Ljava/util/Map;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "metadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[handlePushMessage] payload: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", metadata: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance p1, La3/z0;

    const/16 v0, 0xb

    invoke-direct {p1, v0, p2, p0}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0, p2, p1}, Lio/getstream/video/android/core/notifications/internal/VideoPushDelegate;->ifValid(Ljava/util/Map;Lc93/a;)Z

    move-result p1

    return p1
.end method

.method public registerPushDevice(Ly03/a;)V
    .locals 1

    const-string v0, "pushDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
