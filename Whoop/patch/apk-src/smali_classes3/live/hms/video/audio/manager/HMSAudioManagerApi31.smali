.class public final Llive/hms/video/audio/manager/HMSAudioManagerApi31;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/audio/HMSAudioManager;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00bd\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001n\u0008\u0007\u0018\u00002\u00020\u0001B5\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020!0 H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008(\u0010\u0015J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008-\u0010.J\u000f\u0010/\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008/\u0010\u0015J\u000f\u00100\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u00080\u0010\u0015J\u000f\u00101\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u00081\u0010\u0015J\u0017\u00104\u001a\u00020\u00102\u0006\u00103\u001a\u000202H\u0002\u00a2\u0006\u0004\u00084\u00105J\u0015\u00106\u001a\u0008\u0012\u0004\u0012\u00020!0 H\u0002\u00a2\u0006\u0004\u00086\u0010#J\u0017\u00108\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u00088\u00109J\u0017\u0010:\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008:\u00109J\u000f\u0010;\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008;\u0010\u0015J\u001d\u0010>\u001a\u00020\u00102\u000c\u0010=\u001a\u0008\u0012\u0004\u0012\u00020<0 H\u0002\u00a2\u0006\u0004\u0008>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010@\u001a\u0004\u0008A\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010CR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010D\u001a\u0004\u0008E\u0010FR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010G\u001a\u0004\u0008H\u0010IR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010J\u001a\u0004\u0008K\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008N\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008T\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008V\u0010WR\u0016\u0010X\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u0016\u0010Z\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Z\u0010[R\u0016\u0010\\\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\\\u0010[R\u0016\u0010]\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008]\u0010[R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008_\u0010`R\u001b\u0010f\u001a\u00020a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008b\u0010c\u001a\u0004\u0008d\u0010eR\"\u0010h\u001a\u00020g8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008h\u0010i\u001a\u0004\u0008j\u0010k\"\u0004\u0008l\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008o\u0010pR\u0018\u0010r\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008r\u0010sR\u001a\u0010u\u001a\u0008\u0012\u0004\u0012\u00020\u000e0t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008u\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008x\u0010y\u00a8\u0006z"
    }
    d2 = {
        "Llive/hms/video/audio/manager/HMSAudioManagerApi31;",
        "Llive/hms/video/audio/HMSAudioManager;",
        "Landroid/content/Context;",
        "context",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "analytics",
        "Llive/hms/video/media/settings/HMSAudioTrackSettings;",
        "hmsAudioTrackSettings",
        "Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;",
        "audioManagerDeviceChangeListener",
        "Llive/hms/video/sdk/IErrorListener;",
        "errorListener",
        "<init>",
        "(Landroid/content/Context;Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/media/settings/HMSAudioTrackSettings;Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;Llive/hms/video/sdk/IErrorListener;)V",
        "Llive/hms/video/audio/AudioManagerFocusChangeCallbacks;",
        "callback",
        "Ll83/a0;",
        "addAudioFocusChangeCallback",
        "(Llive/hms/video/audio/AudioManagerFocusChangeCallbacks;)V",
        "removeAudioFocusChangeCallback",
        "initialize",
        "()V",
        "start",
        "",
        "isStarted",
        "()Z",
        "",
        "Llive/hms/video/audio/HMSAudioManager$AudioDevice;",
        "getAudioDevices",
        "()Ljava/util/Set;",
        "getSelectedAudioDevice",
        "()Llive/hms/video/audio/HMSAudioManager$AudioDevice;",
        "",
        "Llive/hms/video/audio/HMSAudioDeviceInfo;",
        "getAudioDevicesInfoList",
        "()Ljava/util/List;",
        "",
        "audioMode",
        "setAudioMode",
        "(I)V",
        "stop",
        "device",
        "selectAudioDevice",
        "(Llive/hms/video/audio/HMSAudioManager$AudioDevice;)V",
        "onErrorListener",
        "initTelephony",
        "(Llive/hms/video/sdk/IErrorListener;)V",
        "deInitTelephony",
        "createAudioFocusChangeListener",
        "requestAudioFocus",
        "Llive/hms/video/audio/AudioChangeEvent;",
        "event",
        "sendAudioChangeEvent",
        "(Llive/hms/video/audio/AudioChangeEvent;)V",
        "groupAudioDevices",
        "on",
        "setSpeakerphoneOn",
        "(Z)V",
        "setMicrophoneMute",
        "updateAudioDeviceState",
        "Landroid/media/AudioDeviceInfo;",
        "availableCommunicationDevices",
        "setAutomaticSelection",
        "(Ljava/util/List;)V",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "Llive/hms/video/media/settings/HMSAudioTrackSettings;",
        "getHmsAudioTrackSettings",
        "()Llive/hms/video/media/settings/HMSAudioTrackSettings;",
        "Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;",
        "getAudioManagerDeviceChangeListener",
        "()Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;",
        "Llive/hms/video/sdk/IErrorListener;",
        "getErrorListener",
        "()Llive/hms/video/sdk/IErrorListener;",
        "",
        "TAG",
        "Ljava/lang/String;",
        "Llive/hms/video/audio/manager/AudioManagerCompat;",
        "androidAudioManager",
        "Llive/hms/video/audio/manager/AudioManagerCompat;",
        "Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;",
        "defaultAudioDevice",
        "Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;",
        "userSelectedAudioDevice",
        "Landroid/media/AudioDeviceInfo;",
        "savedAudioMode",
        "I",
        "savedIsSpeakerPhoneOn",
        "Z",
        "savedIsMicrophoneMute",
        "hasWiredHeadset",
        "",
        "TELEPHONY_LOCK",
        "Ljava/lang/Object;",
        "Landroid/os/Handler;",
        "mainHandler$delegate",
        "Ll83/h;",
        "getMainHandler",
        "()Landroid/os/Handler;",
        "mainHandler",
        "Llive/hms/video/audio/HMSAudioManager$AudioManagerState;",
        "state",
        "Llive/hms/video/audio/HMSAudioManager$AudioManagerState;",
        "getState",
        "()Llive/hms/video/audio/HMSAudioManager$AudioManagerState;",
        "setState",
        "(Llive/hms/video/audio/HMSAudioManager$AudioManagerState;)V",
        "live/hms/video/audio/manager/HMSAudioManagerApi31$deviceCallback$1",
        "deviceCallback",
        "Llive/hms/video/audio/manager/HMSAudioManagerApi31$deviceCallback$1;",
        "Landroid/media/AudioManager$OnAudioFocusChangeListener;",
        "audioFocusChangeListener",
        "Landroid/media/AudioManager$OnAudioFocusChangeListener;",
        "",
        "focusChangeCallbacks",
        "Ljava/util/List;",
        "Landroid/telephony/PhoneStateListener;",
        "phoneStateChangeListener",
        "Landroid/telephony/PhoneStateListener;",
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


# instance fields
.field private final TAG:Ljava/lang/String;

.field private final TELEPHONY_LOCK:Ljava/lang/Object;

.field private final analytics:Llive/hms/video/events/AnalyticsEventsService;

.field private final androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

.field private audioFocusChangeListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field private final audioManagerDeviceChangeListener:Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;

.field private final context:Landroid/content/Context;

.field private defaultAudioDevice:Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

.field private final deviceCallback:Llive/hms/video/audio/manager/HMSAudioManagerApi31$deviceCallback$1;

.field private final errorListener:Llive/hms/video/sdk/IErrorListener;

.field private final focusChangeCallbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/audio/AudioManagerFocusChangeCallbacks;",
            ">;"
        }
    .end annotation
.end field

.field private hasWiredHeadset:Z

.field private final hmsAudioTrackSettings:Llive/hms/video/media/settings/HMSAudioTrackSettings;

.field private final mainHandler$delegate:Ll83/h;

.field private phoneStateChangeListener:Landroid/telephony/PhoneStateListener;

.field private savedAudioMode:I

.field private savedIsMicrophoneMute:Z

.field private savedIsSpeakerPhoneOn:Z

.field private state:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

.field private userSelectedAudioDevice:Landroid/media/AudioDeviceInfo;


# direct methods
.method public constructor <init>(Landroid/content/Context;Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/media/settings/HMSAudioTrackSettings;Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;Llive/hms/video/sdk/IErrorListener;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioManagerDeviceChangeListener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->context:Landroid/content/Context;

    iput-object p2, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->analytics:Llive/hms/video/events/AnalyticsEventsService;

    iput-object p3, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->hmsAudioTrackSettings:Llive/hms/video/media/settings/HMSAudioTrackSettings;

    iput-object p4, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->audioManagerDeviceChangeListener:Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;

    iput-object p5, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->errorListener:Llive/hms/video/sdk/IErrorListener;

    const-string p2, "HMSAudioManagerApi31"

    iput-object p2, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TAG:Ljava/lang/String;

    invoke-static {p1}, Llive/hms/video/audio/manager/AudioManagerCompat;->create(Landroid/content/Context;)Llive/hms/video/audio/manager/AudioManagerCompat;

    move-result-object p1

    const-string p2, "create(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    sget-object p1, Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;->SPEAKER_PHONE:Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    iput-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->defaultAudioDevice:Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    const/4 p1, -0x2

    iput p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->savedAudioMode:I

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TELEPHONY_LOCK:Ljava/lang/Object;

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/16 p2, 0x1c

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->mainHandler$delegate:Ll83/h;

    sget-object p1, Llive/hms/video/audio/HMSAudioManager$AudioManagerState;->UNINITIALIZED:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

    iput-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->state:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

    invoke-virtual {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->initialize()V

    new-instance p1, Llive/hms/video/audio/manager/HMSAudioManagerApi31$deviceCallback$1;

    invoke-direct {p1, p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31$deviceCallback$1;-><init>(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)V

    iput-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->deviceCallback:Llive/hms/video/audio/manager/HMSAudioManagerApi31$deviceCallback$1;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->focusChangeCallbacks:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Llive/hms/video/audio/manager/HMSAudioManagerApi31;Llive/hms/video/sdk/IErrorListener;)V
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->initTelephony$lambda$2$lambda$1(Llive/hms/video/audio/manager/HMSAudioManagerApi31;Llive/hms/video/sdk/IErrorListener;)V

    return-void
.end method

.method public static final synthetic access$getTAG$p(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$sendAudioChangeEvent(Llive/hms/video/audio/manager/HMSAudioManagerApi31;Llive/hms/video/audio/AudioChangeEvent;)V
    .locals 0

    invoke-direct {p0, p1}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->sendAudioChangeEvent(Llive/hms/video/audio/AudioChangeEvent;)V

    return-void
.end method

.method public static final synthetic access$updateAudioDeviceState(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)V
    .locals 0

    invoke-direct {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->updateAudioDeviceState()V

    return-void
.end method

.method public static synthetic b(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)Landroid/os/Handler;
    .locals 0

    invoke-static {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->mainHandler_delegate$lambda$0(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)Landroid/os/Handler;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llive/hms/video/audio/manager/HMSAudioManagerApi31;I)V
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->createAudioFocusChangeListener$lambda$5(Llive/hms/video/audio/manager/HMSAudioManagerApi31;I)V

    return-void
.end method

.method private final createAudioFocusChangeListener()V
    .locals 2

    new-instance v0, Lb9/c;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lb9/c;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->audioFocusChangeListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    return-void
.end method

.method private static final createAudioFocusChangeListener$lambda$5(Llive/hms/video/audio/manager/HMSAudioManagerApi31;I)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onAudioFocusChange: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, -0x3

    if-eq p1, v0, :cond_6

    const/4 v0, -0x2

    if-eq p1, v0, :cond_5

    const/4 v0, -0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    sget-object p1, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_INVALID:Llive/hms/video/audio/AudioChangeEvent;

    invoke-direct {p0, p1}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->sendAudioChangeEvent(Llive/hms/video/audio/AudioChangeEvent;)V

    return-void

    :cond_0
    sget-object p1, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_AUDIOFOCUS_GAIN_EXCLUSIVE:Llive/hms/video/audio/AudioChangeEvent;

    invoke-direct {p0, p1}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->sendAudioChangeEvent(Llive/hms/video/audio/AudioChangeEvent;)V

    return-void

    :cond_1
    sget-object p1, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK:Llive/hms/video/audio/AudioChangeEvent;

    invoke-direct {p0, p1}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->sendAudioChangeEvent(Llive/hms/video/audio/AudioChangeEvent;)V

    return-void

    :cond_2
    sget-object p1, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_AUDIOFOCUS_GAIN_TRANSIENT:Llive/hms/video/audio/AudioChangeEvent;

    invoke-direct {p0, p1}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->sendAudioChangeEvent(Llive/hms/video/audio/AudioChangeEvent;)V

    return-void

    :cond_3
    sget-object p1, Llive/hms/video/audio/AudioChangeEvent;->AUDIOFOCUS_GAIN:Llive/hms/video/audio/AudioChangeEvent;

    invoke-direct {p0, p1}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->sendAudioChangeEvent(Llive/hms/video/audio/AudioChangeEvent;)V

    iget-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {p1}, Llive/hms/video/audio/manager/AudioManagerCompat;->clearCommunicationDevice()V

    invoke-direct {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->updateAudioDeviceState()V

    return-void

    :cond_4
    sget-object p1, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_AUDIOFOCUS_LOSS:Llive/hms/video/audio/AudioChangeEvent;

    invoke-direct {p0, p1}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->sendAudioChangeEvent(Llive/hms/video/audio/AudioChangeEvent;)V

    return-void

    :cond_5
    sget-object p1, Llive/hms/video/audio/AudioChangeEvent;->AUDIOFOCUS_LOSS_TRANSIENT:Llive/hms/video/audio/AudioChangeEvent;

    invoke-direct {p0, p1}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->sendAudioChangeEvent(Llive/hms/video/audio/AudioChangeEvent;)V

    return-void

    :cond_6
    sget-object p1, Llive/hms/video/audio/AudioChangeEvent;->DEBUG_AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK:Llive/hms/video/audio/AudioChangeEvent;

    invoke-direct {p0, p1}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->sendAudioChangeEvent(Llive/hms/video/audio/AudioChangeEvent;)V

    return-void
.end method

.method public static synthetic d(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)V
    .locals 0

    invoke-static {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->deInitTelephony$lambda$4$lambda$3(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)V

    return-void
.end method

.method private final deInitTelephony()V
    .locals 4

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->hmsAudioTrackSettings:Llive/hms/video/media/settings/HMSAudioTrackSettings;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->getMainHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->phoneStateChangeListener:Landroid/telephony/PhoneStateListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->hmsAudioTrackSettings:Llive/hms/video/media/settings/HMSAudioTrackSettings;

    invoke-virtual {v0}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->getPhoneCallState()Llive/hms/video/media/settings/PhoneCallState;

    move-result-object v0

    sget-object v1, Llive/hms/video/media/settings/PhoneCallState;->DISABLE_MUTE_ON_VOIP_PHONE_CALL_RING:Llive/hms/video/media/settings/PhoneCallState;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TELEPHONY_LOCK:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->getMainHandler()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lio/sentry/c7;

    const/16 v3, 0x1a

    invoke-direct {v2, p0, v3}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_0
    return-void
.end method

.method private static final deInitTelephony$lambda$4$lambda$3(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->context:Landroid/content/Context;

    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.telephony.TelephonyManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/telephony/TelephonyManager;

    iget-object v1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->context:Landroid/content/Context;

    const-string v2, "android.permission.READ_PHONE_STATE"

    invoke-static {v1, v2}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    iget-object p0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->phoneStateChangeListener:Landroid/telephony/PhoneStateListener;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    :cond_0
    return-void
.end method

.method private final getMainHandler()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->mainHandler$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    return-object v0
.end method

.method private final groupAudioDevices()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/audio/HMSAudioDeviceInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v0}, Llive/hms/video/audio/manager/AudioManagerCompat;->getAvailableCommunicationDevices()Ljava/util/List;

    move-result-object v0

    const-string v1, "getAvailableCommunicationDevices(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/AudioDeviceInfo;

    invoke-virtual {v2}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v3

    invoke-static {v3}, Llive/hms/video/audio/manager/AudioDeviceMapping;->fromPlatformType(I)Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v3

    invoke-static {v3}, Llive/hms/video/audio/manager/AudioDeviceMapping;->toHMSMapping(Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;)Llive/hms/video/audio/HMSAudioManager$AudioDevice;

    move-result-object v3

    invoke-virtual {v2}, Landroid/media/AudioDeviceInfo;->getProductName()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Llive/hms/video/audio/HMSAudioDeviceInfo;

    invoke-direct {v4, v3, v2}, Llive/hms/video/audio/HMSAudioDeviceInfo;-><init>(Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/lang/String;)V

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private final initTelephony(Llive/hms/video/sdk/IErrorListener;)V
    .locals 4

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->hmsAudioTrackSettings:Llive/hms/video/media/settings/HMSAudioTrackSettings;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->getMainHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->hmsAudioTrackSettings:Llive/hms/video/media/settings/HMSAudioTrackSettings;

    invoke-virtual {v0}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->getPhoneCallState()Llive/hms/video/media/settings/PhoneCallState;

    move-result-object v0

    sget-object v1, Llive/hms/video/media/settings/PhoneCallState;->DISABLE_MUTE_ON_VOIP_PHONE_CALL_RING:Llive/hms/video/media/settings/PhoneCallState;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TELEPHONY_LOCK:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->getMainHandler()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lio/sentry/android/core/r0;

    const/16 v3, 0xe

    invoke-direct {v2, v3, p0, p1}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_0
    return-void
.end method

.method private static final initTelephony$lambda$2$lambda$1(Llive/hms/video/audio/manager/HMSAudioManagerApi31;Llive/hms/video/sdk/IErrorListener;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$onErrorListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->phoneStateChangeListener:Landroid/telephony/PhoneStateListener;

    if-nez v0, :cond_0

    new-instance v0, Llive/hms/video/audio/manager/HMSAudioManagerApi31$initTelephony$1$1$1;

    invoke-direct {v0, p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31$initTelephony$1$1$1;-><init>(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)V

    iput-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->phoneStateChangeListener:Landroid/telephony/PhoneStateListener;

    :cond_0
    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->context:Landroid/content/Context;

    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.telephony.TelephonyManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/telephony/TelephonyManager;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    const/16 v3, 0x20

    if-lt v1, v2, :cond_2

    iget-object v1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->context:Landroid/content/Context;

    const-string v2, "android.permission.READ_PHONE_STATE"

    invoke-static {v1, v2}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_1

    iget-object p0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->phoneStateChangeListener:Landroid/telephony/PhoneStateListener;

    invoke-virtual {v0, p0, v3}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    return-void

    :cond_1
    invoke-static {}, Llive/hms/video/error/ErrorFactory;->ReadPhoneStateError()Llive/hms/video/error/HMSException;

    move-result-object p0

    invoke-interface {p1, p0}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-void

    :cond_2
    iget-object p0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->phoneStateChangeListener:Landroid/telephony/PhoneStateListener;

    invoke-virtual {v0, p0, v3}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    return-void
.end method

.method private static final mainHandler_delegate$lambda$0(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)Landroid/os/Handler;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    iget-object p0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->context:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v0
.end method

.method private final requestAudioFocus()V
    .locals 4

    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v0

    new-instance v3, Landroid/media/AudioFocusRequest$Builder;

    invoke-direct {v3, v1}, Landroid/media/AudioFocusRequest$Builder;-><init>(I)V

    invoke-virtual {v3, v2}, Landroid/media/AudioFocusRequest$Builder;->setAcceptsDelayedFocusGain(Z)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/media/AudioFocusRequest$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->audioFocusChangeListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/media/AudioFocusRequest$Builder;->setOnAudioFocusChangeListener(Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioFocusRequest$Builder;->build()Landroid/media/AudioFocusRequest;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    iget-object v1, v1, Llive/hms/video/audio/manager/AudioManagerCompat;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioFocusRequest;)I

    return-void
.end method

.method private final sendAudioChangeEvent(Llive/hms/video/audio/AudioChangeEvent;)V
    .locals 2

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->focusChangeCallbacks:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/audio/AudioManagerFocusChangeCallbacks;

    invoke-interface {v1, p1}, Llive/hms/video/audio/AudioManagerFocusChangeCallbacks;->onAudioFocusChange(Llive/hms/video/audio/AudioChangeEvent;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final setAutomaticSelection(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/media/AudioDeviceInfo;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TAG:Ljava/lang/String;

    const-string v1, "Automatic selection"

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;->BLUETOOTH:Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    sget-object v1, Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;->WIRED_HEADSET:Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    sget-object v2, Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;->SPEAKER_PHONE:Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    sget-object v3, Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;->EARPIECE:Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    sget-object v4, Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;->NONE:Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    filled-new-array {v0, v1, v2, v3, v4}, [Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object v2, v1

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Landroid/media/AudioDeviceInfo;

    invoke-virtual {v6}, Landroid/media/AudioDeviceInfo;->getProductName()Ljava/lang/CharSequence;

    move-result-object v6

    const-string v7, "getProductName(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, " Watch"

    const/4 v8, 0x1

    invoke-static {v6, v7, v8}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Landroid/media/AudioDeviceInfo;

    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v5

    invoke-static {v5}, Llive/hms/video/audio/manager/AudioDeviceMapping;->fromPlatformType(I)Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v5

    if-ne v5, v2, :cond_3

    goto :goto_1

    :cond_4
    move-object v4, v1

    :goto_1
    move-object v2, v4

    check-cast v2, Landroid/media/AudioDeviceInfo;

    if-eqz v2, :cond_0

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Automatically selected -> "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v3

    invoke-static {v3}, Llive/hms/video/audio/manager/AudioDeviceMapping;->fromPlatformType(I)Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    const/16 v0, 0xa

    if-nez v2, :cond_7

    iget-object v1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Tried to switch audio devices but could not find suitable device in list of types: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioDeviceInfo;

    invoke-virtual {v0}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v0

    invoke-static {v0}, Llive/hms/video/audio/manager/AudioDeviceMapping;->fromPlatformType(I)Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    const/4 v7, 0x0

    const/16 v8, 0x3f

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {p1}, Llive/hms/video/audio/manager/AudioManagerCompat;->clearCommunicationDevice()V

    return-void

    :cond_7
    iget-object v1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Switching to new device of type "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v4

    invoke-static {v4}, Llive/hms/video/audio/manager/AudioDeviceMapping;->fromPlatformType(I)Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v1, v2}, Llive/hms/video/audio/manager/AudioManagerCompat;->setCommunicationDevice(Landroid/media/AudioDeviceInfo;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {v2}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v1

    invoke-static {v1}, Llive/hms/video/audio/manager/AudioDeviceMapping;->fromPlatformType(I)Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v1

    invoke-static {v1}, Llive/hms/video/audio/manager/AudioDeviceMapping;->toHMSMapping(Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;)Llive/hms/video/audio/HMSAudioManager$AudioDevice;

    move-result-object v1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioDeviceInfo;

    invoke-virtual {v0}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v0

    invoke-static {v0}, Llive/hms/video/audio/manager/AudioDeviceMapping;->fromPlatformType(I)Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v0

    invoke-static {v0}, Llive/hms/video/audio/manager/AudioDeviceMapping;->toHMSMapping(Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;)Llive/hms/video/audio/HMSAudioManager$AudioDevice;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    invoke-static {v2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    sget-object v0, Llive/hms/video/audio/HMSAudioManager$AudioDevice;->AUTOMATIC:Llive/hms/video/audio/HMSAudioManager$AudioDevice;

    invoke-static {v0, p1}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->audioManagerDeviceChangeListener:Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;

    invoke-interface {v0, v1, p1}, Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;->onAudioDeviceChanged(Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/util/Set;)V

    iget-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->audioManagerDeviceChangeListener:Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;

    invoke-direct {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->groupAudioDevices()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;->onAudioDeviceInfoChanged(Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/util/List;)V

    iget-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->analytics:Llive/hms/video/events/AnalyticsEventsService;

    sget-object v0, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    invoke-virtual {v0, v1}, Llive/hms/video/events/AnalyticsEventFactory;->selectedAudioDevice(Llive/hms/video/audio/HMSAudioManager$AudioDevice;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object v0

    invoke-virtual {p1, v0}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    return-void

    :cond_9
    iget-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to set "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/media/AudioDeviceInfo;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " as communication device."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final setMicrophoneMute(Z)V
    .locals 1

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v0}, Llive/hms/video/audio/manager/AudioManagerCompat;->isMicrophoneMute()Z

    move-result v0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v0, p1}, Llive/hms/video/audio/manager/AudioManagerCompat;->setMicrophoneMute(Z)V

    :cond_0
    return-void
.end method

.method private final setSpeakerphoneOn(Z)V
    .locals 1

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v0}, Llive/hms/video/audio/manager/AudioManagerCompat;->isSpeakerphoneOn()Z

    move-result v0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v0, p1}, Llive/hms/video/audio/manager/AudioManagerCompat;->setSpeakerphoneOn(Z)V

    :cond_0
    return-void
.end method

.method private final updateAudioDeviceState()V
    .locals 5

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v0}, Llive/hms/video/audio/manager/AudioManagerCompat;->getAvailableCommunicationDevices()Ljava/util/List;

    move-result-object v0

    const-string v1, "getAvailableCommunicationDevices(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->userSelectedAudioDevice:Landroid/media/AudioDeviceInfo;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/media/AudioDeviceInfo;->getId()I

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Candidate found :: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v4

    invoke-static {v4}, Llive/hms/video/audio/manager/AudioDeviceMapping;->fromPlatformType(I)Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v2, v1}, Llive/hms/video/audio/manager/AudioManagerCompat;->setCommunicationDevice(Landroid/media/AudioDeviceInfo;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v1

    invoke-static {v1}, Llive/hms/video/audio/manager/AudioDeviceMapping;->fromPlatformType(I)Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v1

    invoke-static {v1}, Llive/hms/video/audio/manager/AudioDeviceMapping;->toHMSMapping(Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;)Llive/hms/video/audio/HMSAudioManager$AudioDevice;

    move-result-object v1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/media/AudioDeviceInfo;

    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v3

    invoke-static {v3}, Llive/hms/video/audio/manager/AudioDeviceMapping;->fromPlatformType(I)Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v3

    invoke-static {v3}, Llive/hms/video/audio/manager/AudioDeviceMapping;->toHMSMapping(Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;)Llive/hms/video/audio/HMSAudioManager$AudioDevice;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sget-object v2, Llive/hms/video/audio/HMSAudioManager$AudioDevice;->AUTOMATIC:Llive/hms/video/audio/HMSAudioManager$AudioDevice;

    invoke-static {v2, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v0

    iget-object v2, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->state:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

    sget-object v3, Llive/hms/video/audio/HMSAudioManager$AudioManagerState;->UNINITIALIZED:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

    if-ne v2, v3, :cond_1

    return-void

    :cond_1
    iget-object v2, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->audioManagerDeviceChangeListener:Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;

    invoke-interface {v2, v1, v0}, Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;->onAudioDeviceChanged(Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/util/Set;)V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->audioManagerDeviceChangeListener:Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;

    invoke-direct {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->groupAudioDevices()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;->onAudioDeviceInfoChanged(Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/util/List;)V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->analytics:Llive/hms/video/events/AnalyticsEventsService;

    sget-object v2, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    invoke-virtual {v2, v1}, Llive/hms/video/events/AnalyticsEventFactory;->selectedAudioDevice(Llive/hms/video/audio/HMSAudioManager$AudioDevice;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    return-void

    :cond_2
    iget-object v2, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to set "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/media/AudioDeviceInfo;->getId()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " of type "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "as communication device. switching to automatic selection"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0, v0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->setAutomaticSelection(Ljava/util/List;)V

    const/4 v0, 0x0

    iput-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->userSelectedAudioDevice:Landroid/media/AudioDeviceInfo;

    return-void

    :cond_3
    invoke-direct {p0, v0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->setAutomaticSelection(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public addAudioFocusChangeCallback(Llive/hms/video/audio/AudioManagerFocusChangeCallbacks;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->focusChangeCallbacks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getAudioDevices()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llive/hms/video/audio/HMSAudioManager$AudioDevice;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v0}, Llive/hms/video/audio/manager/AudioManagerCompat;->getAvailableCommunicationDevices()Ljava/util/List;

    move-result-object v0

    const-string v1, "getAvailableCommunicationDevices(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/AudioDeviceInfo;

    invoke-virtual {v2}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v2

    invoke-static {v2}, Llive/hms/video/audio/manager/AudioDeviceMapping;->fromPlatformType(I)Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v2

    invoke-static {v2}, Llive/hms/video/audio/manager/AudioDeviceMapping;->toHMSMapping(Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;)Llive/hms/video/audio/HMSAudioManager$AudioDevice;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sget-object v1, Llive/hms/video/audio/HMSAudioManager$AudioDevice;->AUTOMATIC:Llive/hms/video/audio/HMSAudioManager$AudioDevice;

    invoke-static {v1, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v0

    return-object v0
.end method

.method public getAudioDevicesInfoList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/audio/HMSAudioDeviceInfo;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->groupAudioDevices()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getAudioManagerDeviceChangeListener()Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;
    .locals 1

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->audioManagerDeviceChangeListener:Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final getErrorListener()Llive/hms/video/sdk/IErrorListener;
    .locals 1

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->errorListener:Llive/hms/video/sdk/IErrorListener;

    return-object v0
.end method

.method public final getHmsAudioTrackSettings()Llive/hms/video/media/settings/HMSAudioTrackSettings;
    .locals 1

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->hmsAudioTrackSettings:Llive/hms/video/media/settings/HMSAudioTrackSettings;

    return-object v0
.end method

.method public getSelectedAudioDevice()Llive/hms/video/audio/HMSAudioManager$AudioDevice;
    .locals 1

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v0}, Llive/hms/video/audio/manager/AudioManagerCompat;->getCommunicationDevice()Landroid/media/AudioDeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    invoke-static {v0}, Llive/hms/video/audio/manager/AudioDeviceMapping;->fromPlatformType(I)Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v0

    invoke-static {v0}, Llive/hms/video/audio/manager/AudioDeviceMapping;->toHMSMapping(Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;)Llive/hms/video/audio/HMSAudioManager$AudioDevice;

    move-result-object v0

    return-object v0
.end method

.method public final getState()Llive/hms/video/audio/HMSAudioManager$AudioManagerState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->state:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

    return-object v0
.end method

.method public final initialize()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->state:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

    sget-object v1, Llive/hms/video/audio/HMSAudioManager$AudioManagerState;->UNINITIALIZED:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TAG:Ljava/lang/String;

    const-string v1, "Initialized HMSAudioManagerApi31"

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v0}, Llive/hms/video/audio/manager/AudioManagerCompat;->getMode()I

    move-result v0

    iput v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->savedAudioMode:I

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v0}, Llive/hms/video/audio/manager/AudioManagerCompat;->isSpeakerphoneOn()Z

    move-result v0

    iput-boolean v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->savedIsSpeakerPhoneOn:Z

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v0}, Llive/hms/video/audio/manager/AudioManagerCompat;->isMicrophoneMute()Z

    move-result v0

    iput-boolean v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->savedIsMicrophoneMute:Z

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v0}, Llive/hms/video/audio/manager/AudioManagerCompat;->isWiredHeadsetOn()Z

    move-result v0

    iput-boolean v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->hasWiredHeadset:Z

    sget-object v0, Llive/hms/video/audio/HMSAudioManager$AudioManagerState;->PREINITIALIZED:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

    iput-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->state:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

    :cond_0
    return-void
.end method

.method public isStarted()Z
    .locals 2

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->state:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

    sget-object v1, Llive/hms/video/audio/HMSAudioManager$AudioManagerState;->RUNNING:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public removeAudioFocusChangeCallback(Llive/hms/video/audio/AudioManagerFocusChangeCallbacks;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->focusChangeCallbacks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public selectAudioDevice(Llive/hms/video/audio/HMSAudioManager$AudioDevice;)V
    .locals 5

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Manually Selecting "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v0}, Llive/hms/video/audio/manager/AudioManagerCompat;->getAvailableCommunicationDevices()Ljava/util/List;

    move-result-object v0

    const-string v1, "getAvailableCommunicationDevices(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/media/AudioDeviceInfo;

    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v3

    invoke-static {v3}, Llive/hms/video/audio/manager/AudioDeviceMapping;->fromPlatformType(I)Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v3

    invoke-static {v3}, Llive/hms/video/audio/manager/AudioDeviceMapping;->toHMSMapping(Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;)Llive/hms/video/audio/HMSAudioManager$AudioDevice;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    sget-object v0, Llive/hms/video/audio/HMSAudioManager$AudioDevice;->AUTOMATIC:Llive/hms/video/audio/HMSAudioManager$AudioDevice;

    const/4 v2, 0x0

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v0}, Llive/hms/video/audio/manager/AudioManagerCompat;->getAvailableCommunicationDevices()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/media/AudioDeviceInfo;

    invoke-virtual {v3}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v3

    invoke-static {v3}, Llive/hms/video/audio/manager/AudioDeviceMapping;->fromPlatformType(I)Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v3

    invoke-static {p1}, Llive/hms/video/audio/manager/AudioDeviceMapping;->toSignalMapping(Llive/hms/video/audio/HMSAudioManager$AudioDevice;)Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v4

    if-ne v3, v4, :cond_2

    move-object v2, v1

    :cond_3
    check-cast v2, Landroid/media/AudioDeviceInfo;

    :goto_1
    iput-object v2, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->userSelectedAudioDevice:Landroid/media/AudioDeviceInfo;

    invoke-direct {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->updateAudioDeviceState()V

    return-void
.end method

.method public setAudioMode(I)V
    .locals 1

    invoke-virtual {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->isStarted()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v0, p1}, Llive/hms/video/audio/manager/AudioManagerCompat;->setMode(I)V

    :cond_0
    return-void
.end method

.method public final setState(Llive/hms/video/audio/HMSAudioManager$AudioManagerState;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->state:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

    return-void
.end method

.method public start()V
    .locals 3

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TAG:Ljava/lang/String;

    const-string v1, "Started"

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->createAudioFocusChangeListener()V

    invoke-direct {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->requestAudioFocus()V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->errorListener:Llive/hms/video/sdk/IErrorListener;

    if-eqz v0, :cond_0

    new-instance v0, Llive/hms/video/audio/manager/HMSAudioManagerApi31$start$1;

    invoke-direct {v0, p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31$start$1;-><init>(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)V

    invoke-direct {p0, v0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->initTelephony(Llive/hms/video/sdk/IErrorListener;)V

    :cond_0
    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    iget-object v1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->deviceCallback:Llive/hms/video/audio/manager/HMSAudioManagerApi31$deviceCallback$1;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Llive/hms/video/audio/manager/AudioManagerCompat;->registerAudioDeviceCallback(Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Llive/hms/video/audio/manager/AudioManagerCompat;->setMicrophoneMute(Z)V

    sget-object v0, Llive/hms/video/audio/HMSAudioManager$AudioManagerState;->RUNNING:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

    iput-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->state:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->setAudioMode(I)V

    invoke-direct {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->updateAudioDeviceState()V

    return-void
.end method

.method public stop()V
    .locals 3

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    iget-object v1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->deviceCallback:Llive/hms/video/audio/manager/HMSAudioManagerApi31$deviceCallback$1;

    invoke-virtual {v0, v1}, Llive/hms/video/audio/manager/AudioManagerCompat;->unregisterAudioDeviceCallback(Landroid/media/AudioDeviceCallback;)V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->state:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

    sget-object v1, Llive/hms/video/audio/HMSAudioManager$AudioManagerState;->UNINITIALIZED:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->userSelectedAudioDevice:Landroid/media/AudioDeviceInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TAG:Ljava/lang/String;

    const-string v2, "Stopping audio manager after selecting audio device but never initializing. This indicates a service spun up solely to set audio device. Therefore skipping audio device reset."

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v0}, Llive/hms/video/audio/manager/AudioManagerCompat;->clearCommunicationDevice()V

    iget-boolean v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->savedIsSpeakerPhoneOn:Z

    invoke-direct {p0, v0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->setSpeakerphoneOn(Z)V

    iget-boolean v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->savedIsMicrophoneMute:Z

    invoke-direct {p0, v0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->setMicrophoneMute(Z)V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    iget v2, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->savedAudioMode:I

    invoke-virtual {v0, v2}, Llive/hms/video/audio/manager/AudioManagerCompat;->setMode(I)V

    :goto_0
    invoke-direct {p0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->deInitTelephony()V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->androidAudioManager:Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-virtual {v0}, Llive/hms/video/audio/manager/AudioManagerCompat;->abandonCallAudioFocus()V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TAG:Ljava/lang/String;

    const-string v2, "Abandoned audio focus for VOICE_CALL streams"

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput-object v1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->state:Llive/hms/video/audio/HMSAudioManager$AudioManagerState;

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->TAG:Ljava/lang/String;

    const-string v1, "Stopped"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
