.class public final Llive/hms/video/media/streams/HMSStreamFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018JG\u0010\"\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00132\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\u0004\u0008\"\u0010#JG\u0010)\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020$2\u0006\u0010&\u001a\u00020%2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0008\u0010\'\u001a\u0004\u0018\u00010\u001c2\u000c\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e\u00a2\u0006\u0004\u0008)\u0010*J\r\u0010+\u001a\u00020\u001f\u00a2\u0006\u0004\u0008+\u0010\u0003JE\u00106\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u00082\u0006\u00105\u001a\u000204\u00a2\u0006\u0004\u00086\u00107J\u0015\u00108\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020,\u00a2\u0006\u0004\u00088\u00109J\u0015\u0010;\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010:\u00a2\u0006\u0004\u0008;\u0010<J\r\u0010=\u001a\u00020\u001f\u00a2\u0006\u0004\u0008=\u0010\u0003R\u0014\u0010>\u001a\u0002048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR$\u0010D\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008D\u0010E\u001a\u0004\u0008F\u0010G\"\u0004\u0008H\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010BR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008L\u0010M\u00a8\u0006N"
    }
    d2 = {
        "Llive/hms/video/media/streams/HMSStreamFactory;",
        "",
        "<init>",
        "()V",
        "Lhms/webrtc/PeerConnectionFactory;",
        "peerConnectionFactory",
        "Llive/hms/video/media/settings/HMSAudioTrackSettings;",
        "settings",
        "",
        "enableWebrtcNoiseSuppressor",
        "Lhms/webrtc/AudioTrack;",
        "makeLocalAudioTrack",
        "(Lhms/webrtc/PeerConnectionFactory;Llive/hms/video/media/settings/HMSAudioTrackSettings;Z)Lhms/webrtc/AudioTrack;",
        "isScreenShare",
        "Lhms/webrtc/VideoTrack;",
        "makeLocalVideoTrack",
        "(Lhms/webrtc/PeerConnectionFactory;Z)Lhms/webrtc/VideoTrack;",
        "Landroid/content/Context;",
        "context",
        "Llive/hms/video/media/settings/HMSVideoTrackSettings;",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "analyticsEventsService",
        "Llive/hms/video/media/capturers/HMSCameraCapturer;",
        "makeLocalVideoCapturer",
        "(Landroid/content/Context;Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/events/AnalyticsEventsService;)Llive/hms/video/media/capturers/HMSCameraCapturer;",
        "Landroid/content/Intent;",
        "mediaProjectionPermissionResultData",
        "hmsVideoTrackSettings",
        "Landroid/app/Notification;",
        "screenShareNotification",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "endScreenShare",
        "Llive/hms/video/media/capturers/HMSCapturer;",
        "makeScreenShareCapturer",
        "(Landroid/content/Context;Lhms/webrtc/PeerConnectionFactory;Landroid/content/Intent;Llive/hms/video/media/settings/HMSVideoTrackSettings;Landroid/app/Notification;Lc93/a;)Llive/hms/video/media/capturers/HMSCapturer;",
        "Llive/hms/video/factories/HMSPeerConnectionFactory;",
        "Llive/hms/video/sdk/models/enums/AudioMixingMode;",
        "audioMixingMode",
        "audioShareNotification",
        "endAudioShare",
        "makeAudioShareCapturer",
        "(Landroid/content/Context;Llive/hms/video/factories/HMSPeerConnectionFactory;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/content/Intent;Landroid/app/Notification;Lc93/a;)Llive/hms/video/media/capturers/HMSCapturer;",
        "updatePluginCameraSource",
        "Llive/hms/video/plugin/video/HMSVideoPlugin;",
        "plugin",
        "Llive/hms/video/sdk/HMSActionResultListener;",
        "resultListener",
        "",
        "inputFrameRate",
        "pluginFrameRate",
        "isEffectsSdkEnabled",
        "",
        "effectsKey",
        "addPlugin",
        "(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;IILlive/hms/video/events/AnalyticsEventsService;ZLjava/lang/String;)V",
        "removePlugin",
        "(Llive/hms/video/plugin/video/HMSVideoPlugin;)V",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "getPlugins",
        "()Ljava/util/concurrent/CopyOnWriteArrayList;",
        "clean",
        "TAG",
        "Ljava/lang/String;",
        "Lhms/webrtc/VideoSource;",
        "videoSource",
        "Lhms/webrtc/VideoSource;",
        "Lhms/webrtc/AudioSource;",
        "audioSource",
        "Lhms/webrtc/AudioSource;",
        "getAudioSource",
        "()Lhms/webrtc/AudioSource;",
        "setAudioSource",
        "(Lhms/webrtc/AudioSource;)V",
        "localCameraVideoSource",
        "Llive/hms/video/plugin/video/HMSVideoPluginsManager;",
        "pluginsManager",
        "Llive/hms/video/plugin/video/HMSVideoPluginsManager;",
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
.field public static final INSTANCE:Llive/hms/video/media/streams/HMSStreamFactory;

.field private static final TAG:Ljava/lang/String; = "HMSStreamHelper"

.field private static audioSource:Lhms/webrtc/AudioSource;

.field private static localCameraVideoSource:Lhms/webrtc/VideoSource;

.field private static pluginsManager:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

.field private static videoSource:Lhms/webrtc/VideoSource;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/media/streams/HMSStreamFactory;

    invoke-direct {v0}, Llive/hms/video/media/streams/HMSStreamFactory;-><init>()V

    sput-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->INSTANCE:Llive/hms/video/media/streams/HMSStreamFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic makeLocalVideoTrack$default(Llive/hms/video/media/streams/HMSStreamFactory;Lhms/webrtc/PeerConnectionFactory;ZILjava/lang/Object;)Lhms/webrtc/VideoTrack;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/streams/HMSStreamFactory;->makeLocalVideoTrack(Lhms/webrtc/PeerConnectionFactory;Z)Lhms/webrtc/VideoTrack;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final addPlugin(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;IILlive/hms/video/events/AnalyticsEventsService;ZLjava/lang/String;)V
    .locals 8

    const-string v0, "plugin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsEventsService"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "effectsKey"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "@100mslive/hms-virtual-background"

    if-eqz p6, :cond_0

    invoke-interface {p7}, Ljava/lang/CharSequence;->length()I

    move-result p6

    if-nez p6, :cond_1

    :cond_0
    invoke-interface {p1}, Llive/hms/video/plugin/video/HMSVideoPlugin;->getName()Ljava/lang/String;

    move-result-object p6

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_1

    sget-object v1, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v2, Llive/hms/video/error/ErrorFactory$Action;->PLUGIN:Llive/hms/video/error/ErrorFactory$Action;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v3, "Effects SDK plugin needs to be enabled from dashboard. Please contact sales `sales@100ms.live` "

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Llive/hms/video/error/ErrorFactory$GenericErrors;->Unknown$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    invoke-interface {p2, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-void

    :cond_1
    invoke-interface {p1}, Llive/hms/video/plugin/video/HMSVideoPlugin;->getName()Ljava/lang/String;

    move-result-object p6

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_2

    invoke-interface {p1, p7}, Llive/hms/video/plugin/video/HMSVideoPlugin;->setKey(Ljava/lang/String;)V

    :cond_2
    sget-object p6, Llive/hms/video/media/streams/HMSStreamFactory;->pluginsManager:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    const-string p7, "HMSVideoPluginsManager"

    if-nez p6, :cond_4

    sget-object p6, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v0, "initializing plugin manager"

    invoke-virtual {p6, p7, v0}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p6, Llive/hms/video/media/streams/HMSStreamFactory;->localCameraVideoSource:Lhms/webrtc/VideoSource;

    if-eqz p6, :cond_3

    new-instance v0, Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    invoke-direct {v0, p6, p5}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;-><init>(Lhms/webrtc/VideoSource;Llive/hms/video/events/AnalyticsEventsService;)V

    sput-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->pluginsManager:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    invoke-virtual {v0, p3}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->setInputFps(I)V

    goto :goto_0

    :cond_3
    const-string p1, "HMSStreamHelper"

    const-string p3, "localCameraVideoSource is null. Not adding plugin"

    invoke-static {p1, p3}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v1, Llive/hms/video/error/ErrorFactory$Action;->PLUGIN:Llive/hms/video/error/ErrorFactory$Action;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const-string v2, "localCameraVideoSource is null"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Llive/hms/video/error/ErrorFactory$GenericErrors;->Unknown$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    invoke-interface {p2, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-void

    :cond_4
    :goto_0
    :try_start_0
    sget-object p3, Llive/hms/video/media/streams/HMSStreamFactory;->pluginsManager:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    if-eqz p3, :cond_5

    invoke-virtual {p3, p1, p2, p4}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->addPlugin(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;I)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p2, v0

    goto :goto_1

    :cond_5
    return-void

    :goto_1
    sget-object p3, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string p5, " Adding plugin "

    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " getting error:"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p7, p1}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    throw p2
.end method

.method public final clean()V
    .locals 1

    sget-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->pluginsManager:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->clean()V

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->pluginsManager:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    sput-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->localCameraVideoSource:Lhms/webrtc/VideoSource;

    sput-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->videoSource:Lhms/webrtc/VideoSource;

    sput-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->audioSource:Lhms/webrtc/AudioSource;

    return-void
.end method

.method public final getAudioSource()Lhms/webrtc/AudioSource;
    .locals 1

    sget-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->audioSource:Lhms/webrtc/AudioSource;

    return-object v0
.end method

.method public final getPlugins()Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Llive/hms/video/plugin/video/HMSVideoPlugin;",
            ">;"
        }
    .end annotation

    :try_start_0
    sget-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->pluginsManager:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->getPlugins()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :goto_0
    sget-object v1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " List of plugins call giving error: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "HMSVideoPluginsManager"

    invoke-virtual {v1, v3, v2}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    throw v0
.end method

.method public final makeAudioShareCapturer(Landroid/content/Context;Llive/hms/video/factories/HMSPeerConnectionFactory;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/content/Intent;Landroid/app/Notification;Lc93/a;)Llive/hms/video/media/capturers/HMSCapturer;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Llive/hms/video/factories/HMSPeerConnectionFactory;",
            "Llive/hms/video/sdk/models/enums/AudioMixingMode;",
            "Landroid/content/Intent;",
            "Landroid/app/Notification;",
            "Lc93/a;",
            ")",
            "Llive/hms/video/media/capturers/HMSCapturer;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerConnectionFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioMixingMode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endAudioShare"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/media/capturers/HMSAudioCapturer;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Llive/hms/video/media/capturers/HMSAudioCapturer;-><init>(Landroid/content/Context;Llive/hms/video/factories/HMSPeerConnectionFactory;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/content/Intent;Landroid/app/Notification;Lc93/a;)V

    return-object v1
.end method

.method public final makeLocalAudioTrack(Lhms/webrtc/PeerConnectionFactory;Llive/hms/video/media/settings/HMSAudioTrackSettings;Z)Lhms/webrtc/AudioTrack;
    .locals 2

    const-string v0, "peerConnectionFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->getEnableEchoCancellation()Z

    move-result v0

    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioUtils;->setWebRtcBasedAcousticEchoCanceler(Z)V

    invoke-virtual {p2}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->getEnableAutomaticGainControl()Z

    move-result v0

    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioUtils;->setWebRtcBasedAutomaticGainControl(Z)V

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->getEnableNoiseSupression()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioUtils;->setWebRtcBasedNoiseSuppressor(Z)V

    sget-object v0, Llive/hms/video/factories/MediaConstraintsFactory;->INSTANCE:Llive/hms/video/factories/MediaConstraintsFactory;

    invoke-virtual {v0, p2, p3}, Llive/hms/video/factories/MediaConstraintsFactory;->makeLocalAudioTrackConstraints(Llive/hms/video/media/settings/HMSAudioTrackSettings;Z)Lhms/webrtc/MediaConstraints;

    move-result-object p3

    invoke-virtual {p1, p3}, Lhms/webrtc/PeerConnectionFactory;->createAudioSource(Lhms/webrtc/MediaConstraints;)Lhms/webrtc/AudioSource;

    move-result-object p3

    sput-object p3, Llive/hms/video/media/streams/HMSStreamFactory;->audioSource:Lhms/webrtc/AudioSource;

    sget-object p3, Llive/hms/video/utils/IdHelper;->INSTANCE:Llive/hms/video/utils/IdHelper;

    invoke-virtual {p3}, Llive/hms/video/utils/IdHelper;->makeAudioMediaStreamTrackId()Ljava/lang/String;

    move-result-object p3

    sget-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->audioSource:Lhms/webrtc/AudioSource;

    invoke-virtual {p1, p3, v0}, Lhms/webrtc/PeerConnectionFactory;->createAudioTrack(Ljava/lang/String;Lhms/webrtc/AudioSource;)Lhms/webrtc/AudioTrack;

    move-result-object p1

    invoke-virtual {p2}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->getVolume()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lhms/webrtc/AudioTrack;->setVolume(D)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Initialized local AudioTrack with id="

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "HMSStreamHelper"

    invoke-static {p3, p2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public final makeLocalVideoCapturer(Landroid/content/Context;Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/events/AnalyticsEventsService;)Llive/hms/video/media/capturers/HMSCameraCapturer;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsEventsService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/media/capturers/HMSCameraCapturer;

    sget-object v1, Llive/hms/video/media/streams/HMSStreamFactory;->videoSource:Lhms/webrtc/VideoSource;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v0, p1, v1, p2, p3}, Llive/hms/video/media/capturers/HMSCameraCapturer;-><init>(Landroid/content/Context;Lhms/webrtc/VideoSource;Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/events/AnalyticsEventsService;)V

    return-object v0
.end method

.method public final makeLocalVideoTrack(Lhms/webrtc/PeerConnectionFactory;Z)Lhms/webrtc/VideoTrack;
    .locals 2

    const-string v0, "peerConnectionFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lhms/webrtc/PeerConnectionFactory;->createVideoSource(Z)Lhms/webrtc/VideoSource;

    move-result-object v0

    sput-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->videoSource:Lhms/webrtc/VideoSource;

    if-nez p2, :cond_0

    sput-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->localCameraVideoSource:Lhms/webrtc/VideoSource;

    :cond_0
    sget-object p2, Llive/hms/video/utils/IdHelper;->INSTANCE:Llive/hms/video/utils/IdHelper;

    invoke-virtual {p2}, Llive/hms/video/utils/IdHelper;->makeVideoMediaStreamTrackId()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->videoSource:Lhms/webrtc/VideoSource;

    invoke-virtual {p1, p2, v0}, Lhms/webrtc/PeerConnectionFactory;->createVideoTrack(Ljava/lang/String;Lhms/webrtc/VideoSource;)Lhms/webrtc/VideoTrack;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Initialized local VideoTrack with id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "HMSStreamHelper"

    invoke-static {v0, p2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final makeScreenShareCapturer(Landroid/content/Context;Lhms/webrtc/PeerConnectionFactory;Landroid/content/Intent;Llive/hms/video/media/settings/HMSVideoTrackSettings;Landroid/app/Notification;Lc93/a;)Llive/hms/video/media/capturers/HMSCapturer;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lhms/webrtc/PeerConnectionFactory;",
            "Landroid/content/Intent;",
            "Llive/hms/video/media/settings/HMSVideoTrackSettings;",
            "Landroid/app/Notification;",
            "Lc93/a;",
            ")",
            "Llive/hms/video/media/capturers/HMSCapturer;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerConnectionFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsVideoTrackSettings"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endScreenShare"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->videoSource:Lhms/webrtc/VideoSource;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lhms/webrtc/PeerConnectionFactory;->createVideoSource(Z)Lhms/webrtc/VideoSource;

    move-result-object p2

    sput-object p2, Llive/hms/video/media/streams/HMSStreamFactory;->videoSource:Lhms/webrtc/VideoSource;

    :cond_0
    new-instance v0, Llive/hms/video/media/capturers/HMSScreenCapturer;

    sget-object v2, Llive/hms/video/media/streams/HMSStreamFactory;->videoSource:Lhms/webrtc/VideoSource;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Llive/hms/video/media/capturers/HMSScreenCapturer;-><init>(Landroid/content/Context;Lhms/webrtc/VideoSource;Landroid/content/Intent;Llive/hms/video/media/settings/HMSVideoTrackSettings;Landroid/app/Notification;Lc93/a;)V

    return-object v0
.end method

.method public final removePlugin(Llive/hms/video/plugin/video/HMSVideoPlugin;)V
    .locals 4

    const-string v0, "plugin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->pluginsManager:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->removePlugin(Llive/hms/video/plugin/video/HMSVideoPlugin;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    sget-object v1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " Removing plugin "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " getting error: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "HMSVideoPluginsManager"

    invoke-virtual {v1, v2, p1}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    throw v0
.end method

.method public final setAudioSource(Lhms/webrtc/AudioSource;)V
    .locals 0

    sput-object p1, Llive/hms/video/media/streams/HMSStreamFactory;->audioSource:Lhms/webrtc/AudioSource;

    return-void
.end method

.method public final updatePluginCameraSource()V
    .locals 2

    sget-object v0, Llive/hms/video/media/streams/HMSStreamFactory;->localCameraVideoSource:Lhms/webrtc/VideoSource;

    if-eqz v0, :cond_0

    sget-object v1, Llive/hms/video/media/streams/HMSStreamFactory;->pluginsManager:Llive/hms/video/plugin/video/HMSVideoPluginsManager;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Llive/hms/video/plugin/video/HMSVideoPluginsManager;->updateCameraSource(Lhms/webrtc/VideoSource;)V

    :cond_0
    return-void
.end method
