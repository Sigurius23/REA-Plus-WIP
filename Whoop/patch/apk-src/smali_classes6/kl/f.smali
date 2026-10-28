.class public final Lkl/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lkl/f;->w:I

    iput-object p1, p0, Lkl/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 3

    iget v0, p0, Lkl/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p1, Landroid/os/Message;->what:I

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lkl/f;->x:Ljava/lang/Object;

    check-cast v0, La00/g;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lmr/o;

    iget-object v1, v0, La00/g;->x:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, La00/g;->z:Ljava/lang/Object;

    check-cast v2, Lmr/o;

    if-eq v2, p1, :cond_1

    iget-object v2, v0, La00/g;->E:Ljava/lang/Object;

    check-cast v2, Lmr/o;

    if-ne v2, p1, :cond_2

    :cond_1
    const/4 v2, 0x2

    invoke-virtual {v0, p1, v2}, La00/g;->h(Lmr/o;I)Z

    :cond_2
    monitor-exit v1

    const/4 p1, 0x1

    :goto_0
    return p1

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :pswitch_0
    iget-object v0, p0, Lkl/f;->x:Ljava/lang/Object;

    check-cast v0, Lkl/g;

    iget v1, p1, Landroid/os/Message;->what:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lkl/d;

    invoke-virtual {v0, p1}, Lkl/g;->h(Lkl/d;)V

    goto :goto_1

    :cond_3
    const/4 v2, 0x2

    if-ne v1, v2, :cond_4

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lkl/d;

    iget-object v0, v0, Lkl/g;->d:Lcom/bumptech/glide/h;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/h;->k(Lql/i;)V

    :cond_4
    const/4 v2, 0x0

    :goto_1
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
