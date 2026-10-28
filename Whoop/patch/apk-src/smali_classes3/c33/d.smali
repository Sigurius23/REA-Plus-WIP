.class public final Lc33/d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc33/e;


# direct methods
.method public synthetic constructor <init>(Lc33/e;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lc33/d;->w:I

    iput-object p1, p0, Lc33/d;->x:Lc33/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lc33/d;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lc33/d;

    iget-object v0, p0, Lc33/d;->x:Lc33/e;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lc33/d;-><init>(Lc33/e;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lc33/d;

    iget-object v0, p0, Lc33/d;->x:Lc33/e;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lc33/d;-><init>(Lc33/e;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lc33/d;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lc33/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lc33/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lc33/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lc33/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lc33/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lc33/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lc33/d;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, Lc33/d;->x:Lc33/e;

    const/4 v5, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v4, Lc33/e;->a:Lc33/c;

    iget-object v0, p1, Lc33/c;->e:Ljava/lang/Object;

    check-cast v0, Lz40/l;

    if-eqz v0, :cond_6

    iget v4, v0, Lz40/l;->k:I

    invoke-static {v4}, Le4/p;->e(I)I

    move-result v4

    if-eqz v4, :cond_5

    if-eq v4, v5, :cond_1

    const/4 v5, 0x2

    if-eq v4, v5, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, v0, Lz40/l;->a:Lkr/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :cond_1
    iget v4, v0, Lz40/l;->k:I

    invoke-static {v4}, Le4/p;->e(I)I

    move-result v4

    if-eq v4, v5, :cond_2

    goto :goto_0

    :cond_2
    iput v5, v0, Lz40/l;->k:I

    iget-object v4, v0, Lz40/l;->i:Lb50/c;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lb50/c;->a()V

    :cond_3
    iget-object v4, v0, Lz40/l;->b:Lz40/f;

    iget-object v5, v4, Lz40/f;->c:Landroid/media/AudioManager;

    iget v6, v4, Lz40/f;->e:I

    invoke-virtual {v5, v6}, Landroid/media/AudioManager;->setMode(I)V

    iget-boolean v6, v4, Lz40/f;->f:Z

    iget-object v7, v4, Lz40/f;->c:Landroid/media/AudioManager;

    invoke-virtual {v7, v6}, Landroid/media/AudioManager;->setMicrophoneMute(Z)V

    iget-boolean v6, v4, Lz40/f;->g:Z

    invoke-virtual {v4, v6}, Lz40/f;->a(Z)V

    iget-object v4, v4, Lz40/f;->h:Landroid/media/AudioFocusRequest;

    if-eqz v4, :cond_4

    invoke-virtual {v5, v4}, Landroid/media/AudioManager;->abandonAudioFocusRequest(Landroid/media/AudioFocusRequest;)I

    :cond_4
    :goto_0
    invoke-virtual {v0}, Lz40/l;->c()V

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Lz40/l;->c()V

    :cond_6
    :goto_1
    iput-object v3, p1, Lc33/c;->e:Ljava/lang/Object;

    iput-boolean v2, p1, Lc33/c;->a:Z

    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v4, Lc33/e;->a:Lc33/c;

    iget-object v0, p1, Lc33/c;->e:Ljava/lang/Object;

    check-cast v0, Lz40/l;

    if-eqz v0, :cond_7

    goto/16 :goto_2

    :cond_7
    new-instance v0, Lz40/l;

    iget-object v4, p1, Lc33/c;->c:Ljava/lang/Object;

    check-cast v4, Landroid/content/Context;

    sget-object v6, Lc33/g;->a:Ljava/lang/Object;

    invoke-interface {v6}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc33/f;

    iget-object v7, p1, Lc33/c;->b:Ljava/lang/Object;

    check-cast v7, Ljava/util/ArrayList;

    invoke-direct {v0, v4, v6, v7}, Lz40/l;-><init>(Landroid/content/Context;Lc33/f;Ljava/util/ArrayList;)V

    iput-object v0, p1, Lc33/c;->e:Ljava/lang/Object;

    iput-boolean v2, p1, Lc33/c;->a:Z

    iget-object p1, p1, Lc33/c;->d:Ljava/lang/Object;

    check-cast p1, Lc4/q;

    iput-object p1, v0, Lz40/l;->d:Lc4/q;

    iget p1, v0, Lz40/l;->k:I

    sget-object v2, Lz40/j;->a:[I

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    aget p1, v2, p1

    if-ne p1, v5, :cond_9

    iput v5, v0, Lz40/l;->k:I

    invoke-virtual {v0, v3}, Lz40/l;->d(Ljava/lang/String;)V

    iget-object p1, v0, Lz40/l;->i:Lb50/c;

    if-eqz p1, :cond_8

    const-string v2, "headsetListener"

    iget-object v3, v0, Lz40/l;->l:Lz40/k;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p1, Lb50/c;->z:Lz40/k;

    iget-object v2, p1, Lb50/c;->y:Landroid/bluetooth/BluetoothAdapter;

    iget-object v3, p1, Lb50/c;->w:Landroid/content/Context;

    invoke-virtual {v2, v3, p1, v5}, Landroid/bluetooth/BluetoothAdapter;->getProfileProxy(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z

    iget-boolean v2, p1, Lb50/c;->G:Z

    if-nez v2, :cond_8

    new-instance v2, Landroid/content/IntentFilter;

    const-string v4, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v2, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v4, "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED"

    invoke-direct {v2, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v4, "android.media.ACTION_SCO_AUDIO_STATE_UPDATED"

    invoke-direct {v2, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    iput-boolean v5, p1, Lb50/c;->G:Z

    :cond_8
    iget-object p1, v0, Lz40/l;->c:Lb9/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "deviceListener"

    iget-object v0, v0, Lz40/l;->m:Lz40/k;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p1, Lb9/a;->d:Ljava/lang/Object;

    iget-object v0, p1, Lb9/a;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.intent.action.HEADSET_PLUG"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    goto :goto_2

    :cond_9
    iget-object p1, v0, Lz40/l;->a:Lkr/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_2
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
