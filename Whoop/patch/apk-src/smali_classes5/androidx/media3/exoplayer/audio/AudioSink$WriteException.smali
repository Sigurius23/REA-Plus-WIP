.class public final Landroidx/media3/exoplayer/audio/AudioSink$WriteException;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final w:I

.field public final x:Z

.field public final y:Lu8/p;


# direct methods
.method public constructor <init>(ILu8/p;Z)V
    .locals 1

    const-string v0, "AudioTrack write failed: "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-boolean p3, p0, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->x:Z

    iput p1, p0, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->w:I

    iput-object p2, p0, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->y:Lu8/p;

    return-void
.end method
