.class public final synthetic Lb9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lb9/c;->a:I

    iput-object p1, p0, Lb9/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAudioFocusChange(I)V
    .locals 4

    iget v0, p0, Lb9/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb9/c;->b:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;

    invoke-static {v0, p1}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->c(Llive/hms/video/audio/manager/HMSAudioManagerApi31;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lb9/c;->b:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/audio/manager/AudioManagerCompat;

    invoke-static {v0, p1}, Llive/hms/video/audio/manager/AudioManagerCompat;->c(Llive/hms/video/audio/manager/AudioManagerCompat;I)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lb9/c;->b:Ljava/lang/Object;

    check-cast v0, Lb9/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, -0x3

    const/4 v2, -0x2

    const/4 v3, 0x1

    if-eq p1, v1, :cond_2

    if-eq p1, v2, :cond_2

    const/4 v1, -0x1

    if-eq p1, v1, :cond_1

    if-eq p1, v3, :cond_0

    const-string v0, "AudioFocusManager"

    const-string v1, "Unknown focus change type: "

    invoke-static {p1, v1, v0}, Ly00/t7;->r(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const/4 p1, 0x2

    invoke-virtual {v0, p1}, Lb9/e;->c(I)V

    invoke-virtual {v0, v3}, Lb9/e;->b(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lb9/e;->b(I)V

    invoke-virtual {v0}, Lb9/e;->a()V

    invoke-virtual {v0, v3}, Lb9/e;->c(I)V

    goto :goto_1

    :cond_2
    if-eq p1, v2, :cond_4

    iget-object p1, v0, Lb9/e;->d:Lu8/d;

    if-eqz p1, :cond_3

    iget p1, p1, Lu8/d;->a:I

    if-ne p1, v3, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x4

    invoke-virtual {v0, p1}, Lb9/e;->c(I)V

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lb9/e;->b(I)V

    const/4 p1, 0x3

    invoke-virtual {v0, p1}, Lb9/e;->c(I)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
