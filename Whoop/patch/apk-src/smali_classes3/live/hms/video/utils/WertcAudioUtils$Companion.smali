.class public final Llive/hms/video/utils/WertcAudioUtils$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/utils/WertcAudioUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\n \u0008*\u0004\u0018\u00010\u00070\u0007\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\u0008\t\u0010\nR\u0018\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000f\u00a8\u0006\u001c"
    }
    d2 = {
        "Llive/hms/video/utils/WertcAudioUtils$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "AOSP_ACOUSTIC_ECHO_CANCELER",
        "Ljava/util/UUID;",
        "kotlin.jvm.PlatformType",
        "getAOSP_ACOUSTIC_ECHO_CANCELER",
        "()Ljava/util/UUID;",
        "Ljava/util/UUID;",
        "cachedEffects",
        "",
        "Landroid/media/audiofx/AudioEffect$Descriptor;",
        "[Landroid/media/audiofx/AudioEffect$Descriptor;",
        "getAvailableEffects",
        "()[Landroid/media/audiofx/AudioEffect$Descriptor;",
        "isEffectTypeAvailable",
        "",
        "effectType",
        "blockListedUuid",
        "getSampleRateForApiLevel",
        "",
        "audioManager",
        "Landroid/media/AudioManager;",
        "getSampleRate",
        "runningOnEmulator",
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
    invoke-direct {p0}, Llive/hms/video/utils/WertcAudioUtils$Companion;-><init>()V

    return-void
.end method

.method private final getAvailableEffects()[Landroid/media/audiofx/AudioEffect$Descriptor;
    .locals 1

    invoke-static {}, Llive/hms/video/utils/WertcAudioUtils;->access$getCachedEffects$cp()[Landroid/media/audiofx/AudioEffect$Descriptor;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Llive/hms/video/utils/WertcAudioUtils;->access$getCachedEffects$cp()[Landroid/media/audiofx/AudioEffect$Descriptor;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Landroid/media/audiofx/AudioEffect;->queryEffects()[Landroid/media/audiofx/AudioEffect$Descriptor;

    move-result-object v0

    invoke-static {v0}, Llive/hms/video/utils/WertcAudioUtils;->access$setCachedEffects$cp([Landroid/media/audiofx/AudioEffect$Descriptor;)V

    invoke-static {}, Llive/hms/video/utils/WertcAudioUtils;->access$getCachedEffects$cp()[Landroid/media/audiofx/AudioEffect$Descriptor;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final getAOSP_ACOUSTIC_ECHO_CANCELER()Ljava/util/UUID;
    .locals 1

    invoke-static {}, Llive/hms/video/utils/WertcAudioUtils;->access$getAOSP_ACOUSTIC_ECHO_CANCELER$cp()Ljava/util/UUID;

    move-result-object v0

    return-object v0
.end method

.method public final getSampleRate(Landroid/media/AudioManager;)I
    .locals 3

    const-string v0, "audioManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/utils/WertcAudioUtils$Companion;->runningOnEmulator()Z

    move-result v0

    const-string v1, "WertcAudioUtils"

    if-eqz v0, :cond_0

    const-string p1, "Running emulator, overriding sample rate to 8 kHz."

    invoke-static {v1, p1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x1f40

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Llive/hms/video/utils/WertcAudioUtils$Companion;->getSampleRateForApiLevel(Landroid/media/AudioManager;)I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Sample rate is set to "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " Hz"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return p1
.end method

.method public final getSampleRateForApiLevel(Landroid/media/AudioManager;)I
    .locals 1

    const-string v0, "audioManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.media.property.OUTPUT_SAMPLE_RATE"

    invoke-virtual {p1, v0}, Landroid/media/AudioManager;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    const/16 p1, 0x3e80

    return p1
.end method

.method public final isEffectTypeAvailable(Ljava/util/UUID;Ljava/util/UUID;)Z
    .locals 6

    const-string v0, "effectType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "blockListedUuid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/video/utils/WertcAudioUtils$Companion;->getAvailableEffects()[Landroid/media/audiofx/AudioEffect$Descriptor;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    array-length v2, v0

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v0, v3

    iget-object v5, v4, Landroid/media/audiofx/AudioEffect$Descriptor;->type:Ljava/util/UUID;

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object p1, v4, Landroid/media/audiofx/AudioEffect$Descriptor;->uuid:Ljava/util/UUID;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final runningOnEmulator()Z
    .locals 3

    sget-object v0, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    const-string v1, "goldfish"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const-string v2, "BRAND"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "generic_"

    invoke-static {v0, v2, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method
