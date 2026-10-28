.class public Lorg/webrtc/NativeExternalAudioProcessingFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/AudioProcessingFactory;


# instance fields
.field private final libname:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lorg/webrtc/NativeExternalAudioProcessingFactory;->libname:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "libname must not be empty."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "libname must not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static native nativeCreateAudioProcessingModule(Ljava/lang/String;)J
.end method

.method private static native nativeDestroyAudioProcessingModule()V
.end method


# virtual methods
.method public createNative(J)J
    .locals 0

    iget-object p1, p0, Lorg/webrtc/NativeExternalAudioProcessingFactory;->libname:Ljava/lang/String;

    invoke-static {p1}, Lorg/webrtc/NativeExternalAudioProcessingFactory;->nativeCreateAudioProcessingModule(Ljava/lang/String;)J

    move-result-wide p1

    return-wide p1
.end method

.method public destroyNative()V
    .locals 0

    invoke-static {}, Lorg/webrtc/NativeExternalAudioProcessingFactory;->nativeDestroyAudioProcessingModule()V

    return-void
.end method
