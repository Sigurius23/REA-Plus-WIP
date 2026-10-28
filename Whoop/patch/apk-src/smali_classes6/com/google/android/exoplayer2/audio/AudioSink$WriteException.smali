.class public final Lcom/google/android/exoplayer2/audio/AudioSink$WriteException;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final w:Z

.field public final x:Lrm/c0;


# direct methods
.method public constructor <init>(ILrm/c0;Z)V
    .locals 2

    const/16 v0, 0x24

    const-string v1, "AudioTrack write failed: "

    invoke-static {v0, p1, v1}, Lr80/c;->j(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-boolean p3, p0, Lcom/google/android/exoplayer2/audio/AudioSink$WriteException;->w:Z

    iput-object p2, p0, Lcom/google/android/exoplayer2/audio/AudioSink$WriteException;->x:Lrm/c0;

    return-void
.end method
