.class public final Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final w:Lu8/p;


# direct methods
.method public constructor <init>(Landroidx/media3/common/audio/AudioProcessor$UnhandledAudioFormatException;Lu8/p;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 2
    iput-object p2, p0, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;->w:Lu8/p;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lu8/p;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p2, p0, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;->w:Lu8/p;

    return-void
.end method
