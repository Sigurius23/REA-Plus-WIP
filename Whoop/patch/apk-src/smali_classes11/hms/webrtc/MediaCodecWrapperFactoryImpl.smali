.class Lhms/webrtc/MediaCodecWrapperFactoryImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/MediaCodecWrapperFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhms/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createByCodecName(Ljava/lang/String;)Lhms/webrtc/MediaCodecWrapper;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lhms/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;

    invoke-static {p1}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object p1

    invoke-direct {v0, p1}, Lhms/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl;-><init>(Landroid/media/MediaCodec;)V

    return-object v0
.end method
