.class public final enum Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/audio/JavaAudioDeviceModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AudioTrackStartErrorCode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;

.field public static final enum AUDIO_TRACK_START_EXCEPTION:Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;

.field public static final enum AUDIO_TRACK_START_STATE_MISMATCH:Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;

    const-string v1, "AUDIO_TRACK_START_EXCEPTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;->AUDIO_TRACK_START_EXCEPTION:Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;

    new-instance v1, Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;

    const-string v2, "AUDIO_TRACK_START_STATE_MISMATCH"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;->AUDIO_TRACK_START_STATE_MISMATCH:Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;

    filled-new-array {v0, v1}, [Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;

    move-result-object v0

    sput-object v0, Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;->$VALUES:[Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;
    .locals 1

    const-class v0, Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;

    return-object p0
.end method

.method public static values()[Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;
    .locals 1

    sget-object v0, Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;->$VALUES:[Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;

    invoke-virtual {v0}, [Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;

    return-object v0
.end method
