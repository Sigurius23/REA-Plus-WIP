.class public final Ld9/c;
.super Landroid/media/AudioDeviceCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ld9/c;->a:I

    iput-object p1, p0, Ld9/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .locals 6

    iget v0, p0, Ld9/c;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "addedDevices"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld9/c;->b:Ljava/lang/Object;

    check-cast v0, Lt23/a2;

    invoke-virtual {v0}, Lt23/a2;->c()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->z:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    array-length p1, p1

    const-string v2, "[onAudioDevicesAdded] "

    const-string v5, " devices added"

    invoke-static {p1, v2, v5}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, p1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {v0}, Lt23/a2;->f()V

    return-void

    :pswitch_0
    iget-object p1, p0, Ld9/c;->b:Ljava/lang/Object;

    check-cast p1, Ld30/h;

    iget-object v0, p1, Ld30/h;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p1, Ld30/h;->j:Ljava/lang/Object;

    check-cast v1, Lu8/d;

    iget-object v2, p1, Ld30/h;->i:Ljava/lang/Object;

    check-cast v2, Lro/i;

    invoke-static {v0, v1, v2}, Ld9/b;->c(Landroid/content/Context;Lu8/d;Lro/i;)Ld9/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Ld30/h;->b(Ld9/b;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .locals 10

    iget v0, p0, Ld9/c;->a:I

    const/4 v1, 0x0

    iget-object v2, p0, Ld9/c;->b:Ljava/lang/Object;

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    const-string v0, "removedDevices"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lt23/a2;

    iget-object v0, v2, Lt23/a2;->i:Lec3/h2;

    invoke-virtual {v2}, Lt23/a2;->c()Lb23/k;

    move-result-object v4

    iget-object v5, v4, Lb23/k;->c:Lb23/e;

    sget-object v6, Lb23/g;->z:Lb23/g;

    iget-object v7, v4, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v5, v6, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    array-length v5, p1

    const-string v8, "[onAudioDevicesRemoved] "

    const-string v9, " devices removed"

    invoke-static {v5, v8, v9}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v6, v7, v5, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {v2}, Lt23/a2;->f()V

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc33/m;

    if-eqz v4, :cond_1

    iget-object v4, v4, Lc33/m;->a:Landroid/media/AudioDeviceInfo;

    invoke-virtual {v4}, Landroid/media/AudioDeviceInfo;->getId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v3

    :goto_0
    if-eqz v4, :cond_5

    array-length v5, p1

    :goto_1
    if-ge v1, v5, :cond_5

    aget-object v6, p1, v1

    invoke-virtual {v6}, Landroid/media/AudioDeviceInfo;->getId()I

    move-result v6

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v6, v7, :cond_4

    invoke-virtual {v2}, Lt23/a2;->c()Lb23/k;

    move-result-object p1

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v4, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {v1, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v1, "[onAudioDevicesRemoved] Selected USB device was removed, clearing selection"

    invoke-interface {p1, v5, v4, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-virtual {v2}, Lt23/a2;->c()Lb23/k;

    move-result-object p1

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v5, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v1, "[clearUsbDeviceSelection] Clearing USB device selection"

    invoke-interface {p1, v5, v2, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    invoke-virtual {v0, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    return-void

    :pswitch_0
    check-cast v2, Ld30/h;

    iget-object v0, v2, Ld30/h;->i:Ljava/lang/Object;

    check-cast v0, Lro/i;

    sget v4, Lx8/t;->a:I

    array-length v4, p1

    :goto_3
    if-ge v1, v4, :cond_7

    aget-object v5, p1, v1

    invoke-static {v5, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    iput-object v3, v2, Ld30/h;->i:Ljava/lang/Object;

    goto :goto_4

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    iget-object p1, v2, Ld30/h;->b:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    iget-object v0, v2, Ld30/h;->j:Ljava/lang/Object;

    check-cast v0, Lu8/d;

    iget-object v1, v2, Ld30/h;->i:Ljava/lang/Object;

    check-cast v1, Lro/i;

    invoke-static {p1, v0, v1}, Ld9/b;->c(Landroid/content/Context;Lu8/d;Lro/i;)Ld9/b;

    move-result-object p1

    invoke-virtual {v2, p1}, Ld30/h;->b(Ld9/b;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
