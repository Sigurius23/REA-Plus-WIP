.class public final Llive/hms/video/audio/manager/HMSAudioManagerApi31$deviceCallback$1;
.super Landroid/media/AudioDeviceCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/audio/manager/HMSAudioManagerApi31;-><init>(Landroid/content/Context;Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/media/settings/HMSAudioTrackSettings;Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;Llive/hms/video/sdk/IErrorListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00052\u000e\u0010\u0008\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0007\u00a8\u0006\n"
    }
    d2 = {
        "live/hms/video/audio/manager/HMSAudioManagerApi31$deviceCallback$1",
        "Landroid/media/AudioDeviceCallback;",
        "",
        "Landroid/media/AudioDeviceInfo;",
        "addedDevices",
        "Ll83/a0;",
        "onAudioDevicesAdded",
        "([Landroid/media/AudioDeviceInfo;)V",
        "removedDevices",
        "onAudioDevicesRemoved",
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
.field final synthetic this$0:Llive/hms/video/audio/manager/HMSAudioManagerApi31;


# direct methods
.method public constructor <init>(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31$deviceCallback$1;->this$0:Llive/hms/video/audio/manager/HMSAudioManagerApi31;

    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .locals 6

    const-string v0, "addedDevices"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/media/AudioDeviceCallback;->onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31$deviceCallback$1;->this$0:Llive/hms/video/audio/manager/HMSAudioManagerApi31;

    invoke-static {v0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->access$getTAG$p(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onAudioDevicesAdded :: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    array-length v3, p1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, p1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, p1, v4

    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v5

    invoke-static {v5}, Llive/hms/video/audio/manager/AudioDeviceMapping;->fromPlatformType(I)Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31$deviceCallback$1;->this$0:Llive/hms/video/audio/manager/HMSAudioManagerApi31;

    invoke-static {p1}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->access$updateAudioDeviceState(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)V

    return-void
.end method

.method public onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .locals 6

    const-string v0, "removedDevices"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/media/AudioDeviceCallback;->onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V

    iget-object v0, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31$deviceCallback$1;->this$0:Llive/hms/video/audio/manager/HMSAudioManagerApi31;

    invoke-static {v0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->access$getTAG$p(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onAudioDevicesRemoved :: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    array-length v3, p1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, p1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, p1, v4

    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v5

    invoke-static {v5}, Llive/hms/video/audio/manager/AudioDeviceMapping;->fromPlatformType(I)Llive/hms/video/audio/manager/AudioManagerUtil$AudioDevice;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/audio/manager/HMSAudioManagerApi31$deviceCallback$1;->this$0:Llive/hms/video/audio/manager/HMSAudioManagerApi31;

    invoke-static {p1}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->access$updateAudioDeviceState(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)V

    return-void
.end method
