.class public Lhms/webrtc/BuiltinAudioDecoderFactoryFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/AudioDecoderFactoryFactory;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native nativeCreateBuiltinAudioDecoderFactory()J
.end method


# virtual methods
.method public createNativeAudioDecoderFactory()J
    .locals 2

    invoke-static {}, Lhms/webrtc/BuiltinAudioDecoderFactoryFactory;->nativeCreateBuiltinAudioDecoderFactory()J

    move-result-wide v0

    return-wide v0
.end method
