.class public final Lc33/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# virtual methods
.method public final onAudioFocusChange(I)V
    .locals 4

    const/4 v0, -0x3

    if-eq p1, v0, :cond_6

    const/4 v0, -0x2

    if-eq p1, v0, :cond_5

    const/4 v0, -0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const-string p1, "AUDIOFOCUS_INVALID"

    goto :goto_0

    :cond_0
    const-string p1, "AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE"

    goto :goto_0

    :cond_1
    const-string p1, "AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK"

    goto :goto_0

    :cond_2
    const-string p1, "AUDIOFOCUS_GAIN_TRANSIENT"

    goto :goto_0

    :cond_3
    const-string p1, "AUDIOFOCUS_GAIN"

    goto :goto_0

    :cond_4
    const-string p1, "AUDIOFOCUS_LOSS"

    goto :goto_0

    :cond_5
    const-string p1, "AUDIOFOCUS_LOSS_TRANSIENT"

    goto :goto_0

    :cond_6
    const-string p1, "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK"

    :goto_0
    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->z:Lb23/g;

    const-string v2, "AudioSwitchHandler"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Lb23/i;->c:Lb23/j;

    const-string v3, "[onAudioFocusChange] focusChange: "

    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, p1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    return-void
.end method
