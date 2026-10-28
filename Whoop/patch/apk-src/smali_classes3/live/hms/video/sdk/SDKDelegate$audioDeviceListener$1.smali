.class public final Llive/hms/video/sdk/SDKDelegate$audioDeviceListener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/SDKDelegate;-><init>(Landroid/content/Context;Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/media/settings/HMSLogSettings;Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/sdk/models/FrameworkInfo;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J%\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "live/hms/video/sdk/SDKDelegate$audioDeviceListener$1",
        "Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;",
        "Llive/hms/video/audio/HMSAudioManager$AudioDevice;",
        "selectedAudioDevice",
        "",
        "availableAudioDevices",
        "Ll83/a0;",
        "onAudioDeviceChanged",
        "(Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/util/Set;)V",
        "",
        "Llive/hms/video/audio/HMSAudioDeviceInfo;",
        "groupedAudioDevice",
        "onAudioDeviceInfoChanged",
        "(Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/util/List;)V",
        "Llive/hms/video/error/HMSException;",
        "e",
        "onError",
        "(Llive/hms/video/error/HMSException;)V",
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
.field final synthetic this$0:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKDelegate;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/SDKDelegate$audioDeviceListener$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAudioDeviceChanged(Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/util/Set;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/audio/HMSAudioManager$AudioDevice;",
            "Ljava/util/Set<",
            "+",
            "Llive/hms/video/audio/HMSAudioManager$AudioDevice;",
            ">;)V"
        }
    .end annotation

    const-string v0, "selectedAudioDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "availableAudioDevices"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onAudioManagerDevicesChanged: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selected: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SDKDelegate"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    sget-object v1, Lbc3/q0;->a:Lkc3/e;

    sget-object v1, Lhc3/o;->a:Lbc3/w1;

    new-instance v2, Llive/hms/video/sdk/SDKDelegate$audioDeviceListener$1$onAudioDeviceChanged$1;

    iget-object v3, p0, Llive/hms/video/sdk/SDKDelegate$audioDeviceListener$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    const/4 v4, 0x0

    invoke-direct {v2, v3, p1, p2, v4}, Llive/hms/video/sdk/SDKDelegate$audioDeviceListener$1$onAudioDeviceChanged$1;-><init>(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/util/Set;Lq83/d;)V

    const/4 p1, 0x2

    invoke-static {v0, v1, v4, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public onAudioDeviceInfoChanged(Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/audio/HMSAudioManager$AudioDevice;",
            "Ljava/util/List<",
            "Llive/hms/video/audio/HMSAudioDeviceInfo;",
            ">;)V"
        }
    .end annotation

    const-string v0, "selectedAudioDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "groupedAudioDevice"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    sget-object v1, Lbc3/q0;->a:Lkc3/e;

    sget-object v1, Lhc3/o;->a:Lbc3/w1;

    new-instance v2, Llive/hms/video/sdk/SDKDelegate$audioDeviceListener$1$onAudioDeviceInfoChanged$1;

    iget-object v3, p0, Llive/hms/video/sdk/SDKDelegate$audioDeviceListener$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    const/4 v4, 0x0

    invoke-direct {v2, v3, p1, p2, v4}, Llive/hms/video/sdk/SDKDelegate$audioDeviceListener$1$onAudioDeviceInfoChanged$1;-><init>(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/util/List;Lq83/d;)V

    const/4 p1, 0x2

    invoke-static {v0, v1, v4, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public onError(Llive/hms/video/error/HMSException;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
