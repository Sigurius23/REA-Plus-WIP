.class Llive/hms/video/audio/manager/AudioManagerCompat$Api26AudioManagerCompat;
.super Llive/hms/video/audio/manager/AudioManagerCompat;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/audio/manager/AudioManagerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Api26AudioManagerCompat"
.end annotation


# static fields
.field private static AUDIO_ATTRIBUTES:Landroid/media/AudioAttributes;


# instance fields
.field private audioFocusRequest:Landroid/media/AudioFocusRequest;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v0

    sput-object v0, Llive/hms/video/audio/manager/AudioManagerCompat$Api26AudioManagerCompat;->AUDIO_ATTRIBUTES:Landroid/media/AudioAttributes;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Llive/hms/video/audio/manager/AudioManagerCompat;-><init>(Landroid/content/Context;Llive/hms/video/audio/manager/AudioManagerCompat$1;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Llive/hms/video/audio/manager/AudioManagerCompat$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llive/hms/video/audio/manager/AudioManagerCompat$Api26AudioManagerCompat;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public abandonCallAudioFocus()V
    .locals 3

    iget-object v0, p0, Llive/hms/video/audio/manager/AudioManagerCompat$Api26AudioManagerCompat;->audioFocusRequest:Landroid/media/AudioFocusRequest;

    const-string v1, "AudioManagerCompat"

    if-nez v0, :cond_0

    const-string v0, "Don\'t currently have audio focus. Ignoring..."

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v2, p0, Llive/hms/video/audio/manager/AudioManagerCompat;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v2, v0}, Landroid/media/AudioManager;->abandonAudioFocusRequest(Landroid/media/AudioFocusRequest;)I

    move-result v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const-string v2, "Audio focus abandon failed. Result code: "

    invoke-static {v0, v2, v1}, Lb9/y;->z(ILjava/lang/String;Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Llive/hms/video/audio/manager/AudioManagerCompat;->hasFocus:Z

    const/4 v0, 0x0

    iput-object v0, p0, Llive/hms/video/audio/manager/AudioManagerCompat$Api26AudioManagerCompat;->audioFocusRequest:Landroid/media/AudioFocusRequest;

    return-void
.end method

.method public createSoundPool()Landroid/media/SoundPool;
    .locals 2

    new-instance v0, Landroid/media/SoundPool$Builder;

    invoke-direct {v0}, Landroid/media/SoundPool$Builder;-><init>()V

    sget-object v1, Llive/hms/video/audio/manager/AudioManagerCompat$Api26AudioManagerCompat;->AUDIO_ATTRIBUTES:Landroid/media/AudioAttributes;

    invoke-virtual {v0, v1}, Landroid/media/SoundPool$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/SoundPool$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/SoundPool$Builder;->setMaxStreams(I)Landroid/media/SoundPool$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/SoundPool$Builder;->build()Landroid/media/SoundPool;

    move-result-object v0

    return-object v0
.end method

.method public requestCallAudioFocus()Z
    .locals 6

    const-string v0, "Audio focus not granted. Result code: "

    iget-object v1, p0, Llive/hms/video/audio/manager/AudioManagerCompat$Api26AudioManagerCompat;->audioFocusRequest:Landroid/media/AudioFocusRequest;

    const/4 v2, 0x1

    const-string v3, "AudioManagerCompat"

    if-eqz v1, :cond_0

    iget-boolean v4, p0, Llive/hms/video/audio/manager/AudioManagerCompat;->hasFocus:Z

    if-eqz v4, :cond_0

    const-string v0, "Already requested audio focus. Ignoring..."

    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_0
    if-nez v1, :cond_1

    new-instance v1, Landroid/media/AudioFocusRequest$Builder;

    const/4 v4, 0x4

    invoke-direct {v1, v4}, Landroid/media/AudioFocusRequest$Builder;-><init>(I)V

    sget-object v4, Llive/hms/video/audio/manager/AudioManagerCompat$Api26AudioManagerCompat;->AUDIO_ATTRIBUTES:Landroid/media/AudioAttributes;

    invoke-virtual {v1, v4}, Landroid/media/AudioFocusRequest$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v1

    iget-object v4, p0, Llive/hms/video/audio/manager/AudioManagerCompat;->onAudioFocusChangeListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v1, v4}, Landroid/media/AudioFocusRequest$Builder;->setOnAudioFocusChangeListener(Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/AudioFocusRequest$Builder;->build()Landroid/media/AudioFocusRequest;

    move-result-object v1

    iput-object v1, p0, Llive/hms/video/audio/manager/AudioManagerCompat$Api26AudioManagerCompat;->audioFocusRequest:Landroid/media/AudioFocusRequest;

    goto :goto_0

    :cond_1
    const-string v1, "Trying again to request audio focus"

    invoke-static {v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const/4 v1, 0x0

    :try_start_0
    iget-object v4, p0, Llive/hms/video/audio/manager/AudioManagerCompat;->audioManager:Landroid/media/AudioManager;

    iget-object v5, p0, Llive/hms/video/audio/manager/AudioManagerCompat$Api26AudioManagerCompat;->audioFocusRequest:Landroid/media/AudioFocusRequest;

    invoke-virtual {v4, v5}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioFocusRequest;)I

    move-result v4

    if-eq v4, v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :cond_2
    return v2

    :catch_0
    const-string v0, "Encountered security exception when requesting audio focus."

    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1
.end method
