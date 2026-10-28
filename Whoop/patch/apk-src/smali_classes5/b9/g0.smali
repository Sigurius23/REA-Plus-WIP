.class public final synthetic Lb9/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lb9/l0;IZ)V
    .locals 0

    .line 1
    const/4 p3, 0x0

    iput p3, p0, Lb9/g0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/g0;->y:Ljava/lang/Object;

    iput p2, p0, Lb9/g0;->x:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p3, p0, Lb9/g0;->w:I

    iput-object p1, p0, Lb9/g0;->y:Ljava/lang/Object;

    iput p2, p0, Lb9/g0;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget v0, p0, Lb9/g0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb9/g0;->y:Ljava/lang/Object;

    check-cast v0, Lrm/b;

    iget-object v0, v0, Lrm/b;->c:Ljava/lang/Object;

    check-cast v0, Landroid/media/AudioManager$OnAudioFocusChangeListener;

    iget v1, p0, Lb9/g0;->x:I

    invoke-interface {v0, v1}, Landroid/media/AudioManager$OnAudioFocusChangeListener;->onAudioFocusChange(I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lb9/g0;->y:Ljava/lang/Object;

    check-cast v0, Lu4/b;

    iget v1, p0, Lb9/g0;->x:I

    invoke-virtual {v0, v1}, Lu4/b;->j(I)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lb9/g0;->y:Ljava/lang/Object;

    check-cast v0, Ltd3/c;

    iget-object v0, v0, Ltd3/c;->b:Ltd3/d;

    iget-object v1, v0, Ltd3/a;->g:Ltd3/n;

    iget-object v2, v0, Ltd3/a;->h:Ltd3/i;

    iget-boolean v3, v1, Ltd3/n;->J:Z

    if-eqz v3, :cond_0

    iget v3, v1, Ltd3/n;->z:I

    const/4 v4, 0x1

    if-eq v3, v4, :cond_0

    const/4 v3, 0x0

    iput-boolean v3, v1, Ltd3/n;->J:Z

    invoke-static {}, Ltd3/b;->a()Ltd3/b;

    move-result-object v3

    :try_start_0
    invoke-virtual {v3, v2}, Ltd3/b;->d(Ltd3/i;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    iget-object v4, v0, Ltd3/a;->f:Ljava/util/List;

    iget-object v0, v0, Ltd3/a;->i:Landroid/os/Handler;

    invoke-virtual {v3, v4, v1, v2, v0}, Ltd3/b;->c(Ljava/util/List;Ltd3/n;Ltd3/i;Landroid/os/Handler;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :cond_0
    iget v0, p0, Lb9/g0;->x:I

    invoke-virtual {v2, v0}, Ltd3/i;->b(I)V

    :catch_1
    :goto_0
    return-void

    :pswitch_2
    iget-object v0, p0, Lb9/g0;->y:Ljava/lang/Object;

    check-cast v0, Lsc2/y;

    iget v1, p0, Lb9/g0;->x:I

    invoke-static {v0, v1}, Lsc2/y;->E(Lsc2/y;I)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lb9/g0;->y:Ljava/lang/Object;

    check-cast v0, Lrm/b;

    iget-object v0, v0, Lrm/b;->c:Ljava/lang/Object;

    check-cast v0, Lrm/c;

    const/4 v1, -0x3

    const/4 v2, 0x2

    iget v3, p0, Lb9/g0;->x:I

    const/4 v4, -0x2

    const/4 v5, 0x1

    if-eq v3, v1, :cond_5

    if-eq v3, v4, :cond_5

    const/4 v1, -0x1

    if-eq v3, v1, :cond_2

    if-eq v3, v5, :cond_1

    const/16 v0, 0x26

    const-string v1, "Unknown focus change type: "

    const-string v2, "AudioFocusManager"

    invoke-static {v0, v3, v1, v2}, Lq63/c;->t(IILjava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    invoke-virtual {v0, v5}, Lrm/c;->b(I)V

    iget-object v0, v0, Lrm/c;->c:Lrm/r;

    if-eqz v0, :cond_9

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    invoke-virtual {v0}, Lrm/u;->d0()Z

    move-result v1

    invoke-virtual {v0, v5, v5, v1}, Lrm/u;->y0(IIZ)V

    goto :goto_2

    :cond_2
    iget-object v3, v0, Lrm/c;->c:Lrm/r;

    if-eqz v3, :cond_4

    iget-object v3, v3, Lrm/r;->w:Lrm/u;

    invoke-virtual {v3}, Lrm/u;->d0()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    move v2, v5

    :goto_1
    invoke-virtual {v3, v1, v2, v4}, Lrm/u;->y0(IIZ)V

    :cond_4
    invoke-virtual {v0}, Lrm/c;->a()V

    goto :goto_2

    :cond_5
    if-eq v3, v4, :cond_6

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lrm/c;->b(I)V

    goto :goto_2

    :cond_6
    iget-object v1, v0, Lrm/c;->c:Lrm/r;

    if-eqz v1, :cond_8

    iget-object v1, v1, Lrm/r;->w:Lrm/u;

    invoke-virtual {v1}, Lrm/u;->d0()Z

    move-result v3

    if-eqz v3, :cond_7

    move v5, v2

    :cond_7
    const/4 v4, 0x0

    invoke-virtual {v1, v4, v5, v3}, Lrm/u;->y0(IIZ)V

    :cond_8
    invoke-virtual {v0, v2}, Lrm/c;->b(I)V

    :cond_9
    :goto_2
    return-void

    :pswitch_4
    iget-object v0, p0, Lb9/g0;->y:Ljava/lang/Object;

    check-cast v0, Lod1/t;

    iget v1, p0, Lb9/g0;->x:I

    invoke-static {v0, v1}, Lod1/t;->a(Lod1/t;I)V

    return-void

    :pswitch_5
    iget-object v0, p0, Lb9/g0;->y:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-object v1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_a

    const/4 v2, 0x0

    iget v3, p0, Lb9/g0;->x:I

    invoke-virtual {v0, v1, v3, v2}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->L(Landroid/view/View;IZ)V

    :cond_a
    return-void

    :pswitch_6
    iget-object v0, p0, Lb9/g0;->y:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/media/capturers/camera/CameraControl;

    iget v1, p0, Lb9/g0;->x:I

    invoke-static {v0, v1}, Llive/hms/video/media/capturers/camera/CameraControl;->f(Llive/hms/video/media/capturers/camera/CameraControl;I)V

    return-void

    :pswitch_7
    iget-object v0, p0, Lb9/g0;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iget v1, p0, Lb9/g0;->x:I

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->b(Landroidx/recyclerview/widget/RecyclerView;I)V

    return-void

    :pswitch_8
    iget-object v0, p0, Lb9/g0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/IntConsumer;

    iget v1, p0, Lb9/g0;->x:I

    invoke-interface {v0, v1}, Ljava/util/function/IntConsumer;->accept(I)V

    return-void

    :pswitch_9
    iget-object v0, p0, Lb9/g0;->y:Ljava/lang/Object;

    check-cast v0, Lb9/l0;

    iget-object v1, v0, Lb9/l0;->W:Lc9/h;

    iget-object v0, v0, Lb9/l0;->w:[Lb9/j1;

    iget v2, p0, Lb9/g0;->x:I

    aget-object v0, v0, v2

    iget-object v0, v0, Lb9/j1;->e:Ljava/lang/Object;

    check-cast v0, Lb9/f;

    iget v0, v0, Lb9/f;->x:I

    invoke-virtual {v1}, Lc9/h;->k()Lc9/a;

    move-result-object v0

    new-instance v2, Lab/a;

    const/16 v3, 0x18

    invoke-direct {v2, v3}, Lab/a;-><init>(I)V

    const/16 v3, 0x409

    invoke-virtual {v1, v0, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
