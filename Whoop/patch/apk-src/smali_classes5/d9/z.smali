.class public final Ld9/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld9/o;


# direct methods
.method public static b(Lu8/d;Z)Landroid/media/AudioAttributes;
    .locals 0

    if-eqz p1, :cond_0

    new-instance p0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {p0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 p1, 0x3

    invoke-virtual {p0, p1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p0

    const/16 p1, 0x10

    invoke-virtual {p0, p1}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lu8/d;->a()Lty/c;

    move-result-object p0

    iget-object p0, p0, Lty/c;->x:Ljava/lang/Object;

    check-cast p0, Landroid/media/AudioAttributes;

    return-object p0
.end method


# virtual methods
.method public final a(Ld9/j;Lu8/d;I)Landroid/media/AudioTrack;
    .locals 6

    iget-boolean v0, p1, Ld9/j;->a:Z

    iget v1, p1, Ld9/j;->b:I

    iget v2, p1, Ld9/j;->e:I

    iget v3, p1, Ld9/j;->c:I

    sget v4, Lx8/t;->a:I

    const/16 v5, 0x17

    if-lt v4, v5, :cond_1

    invoke-static {v3, v2, v1}, Lx8/t;->p(III)Landroid/media/AudioFormat;

    move-result-object v1

    invoke-static {p2, v0}, Ld9/z;->b(Lu8/d;Z)Landroid/media/AudioAttributes;

    move-result-object p2

    new-instance v0, Landroid/media/AudioTrack$Builder;

    invoke-direct {v0}, Landroid/media/AudioTrack$Builder;-><init>()V

    invoke-virtual {v0, p2}, Landroid/media/AudioTrack$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioTrack$Builder;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroid/media/AudioTrack$Builder;->setAudioFormat(Landroid/media/AudioFormat;)Landroid/media/AudioTrack$Builder;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/media/AudioTrack$Builder;->setTransferMode(I)Landroid/media/AudioTrack$Builder;

    move-result-object p2

    iget v0, p1, Ld9/j;->f:I

    invoke-virtual {p2, v0}, Landroid/media/AudioTrack$Builder;->setBufferSizeInBytes(I)Landroid/media/AudioTrack$Builder;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/media/AudioTrack$Builder;->setSessionId(I)Landroid/media/AudioTrack$Builder;

    move-result-object p2

    const/16 p3, 0x1d

    if-lt v4, p3, :cond_0

    iget-boolean p1, p1, Ld9/j;->d:Z

    invoke-virtual {p2, p1}, Landroid/media/AudioTrack$Builder;->setOffloadedPlayback(Z)Landroid/media/AudioTrack$Builder;

    :cond_0
    invoke-virtual {p2}, Landroid/media/AudioTrack$Builder;->build()Landroid/media/AudioTrack;

    move-result-object p1

    return-object p1

    :cond_1
    move v4, v0

    new-instance v0, Landroid/media/AudioTrack;

    invoke-static {p2, v4}, Ld9/z;->b(Lu8/d;Z)Landroid/media/AudioAttributes;

    move-result-object p2

    invoke-static {v3, v2, v1}, Lx8/t;->p(III)Landroid/media/AudioFormat;

    move-result-object v2

    iget v3, p1, Ld9/j;->f:I

    const/4 v4, 0x1

    move-object v1, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Landroid/media/AudioTrack;-><init>(Landroid/media/AudioAttributes;Landroid/media/AudioFormat;III)V

    return-object v0
.end method
