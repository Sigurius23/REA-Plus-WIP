.class public final Lb1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lb1/e;->a:I

    iput-object p1, p0, Lb1/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 3

    iget v0, p0, Lb1/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb1/e;->b:Ljava/lang/Object;

    check-cast v0, Lz0/f;

    iget-object v1, v0, Lz0/f;->e:Lz1/v;

    iget-object v2, v1, Lz1/v;->h:Lvd1/c;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lvd1/c;->a()V

    :cond_0
    invoke-virtual {v1}, Lz1/v;->a()V

    iget-object v1, v0, Lz0/f;->h:Landroid/view/ActionMode;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/ActionMode;->finish()V

    :cond_1
    const/4 v1, 0x0

    iput-object v1, v0, Lz0/f;->h:Landroid/view/ActionMode;

    return-void

    :pswitch_0
    iget-object v0, p0, Lb1/e;->b:Ljava/lang/Object;

    check-cast v0, Lf1/s1;

    invoke-virtual {v0}, Lf1/s1;->n()V

    return-void

    :pswitch_1
    iget-object v0, p0, Lb1/e;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/media3/exoplayer/ExoPlayer;

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->r0()V

    return-void

    :pswitch_2
    iget-object v0, p0, Lb1/e;->b:Ljava/lang/Object;

    check-cast v0, Lp0/g0;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lp0/g0;->f:Z

    return-void

    :pswitch_3
    iget-object v0, p0, Lb1/e;->b:Ljava/lang/Object;

    check-cast v0, Lp0/l0;

    iget-object v1, v0, Lp0/l0;->c:Lb9/b;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    iput-boolean v2, v1, Lb9/b;->x:Z

    :cond_2
    const/4 v1, 0x0

    iput-object v1, v0, Lp0/l0;->c:Lb9/b;

    return-void

    :pswitch_4
    iget-object v0, p0, Lb1/e;->b:Ljava/lang/Object;

    check-cast v0, Lp0/z;

    const/4 v1, 0x0

    iput-object v1, v0, Lp0/z;->d:Lx1/b;

    return-void

    :pswitch_5
    iget-object v0, p0, Lb1/e;->b:Ljava/lang/Object;

    check-cast v0, Ll1/x4;

    iget-object v0, v0, Ll1/x4;->c:Lbc3/m;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbc3/m;->cancel(Ljava/lang/Throwable;)Z

    :cond_3
    return-void

    :pswitch_6
    iget-object v0, p0, Lb1/e;->b:Ljava/lang/Object;

    check-cast v0, Ll1/e2;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    iget-object v0, v0, Ll1/e2;->H:Ll1/b2;

    invoke-virtual {v0}, Lb3/a;->d()V

    return-void

    :pswitch_7
    iget-object v0, p0, Lb1/e;->b:Ljava/lang/Object;

    check-cast v0, Lh/e;

    invoke-virtual {v0}, Lg/t;->h()V

    return-void

    :pswitch_8
    iget-object v0, p0, Lb1/e;->b:Ljava/lang/Object;

    check-cast v0, Lf1/w0;

    invoke-virtual {v0}, Lf1/w0;->j()V

    iget-object v0, v0, Lf1/w0;->i:Lp1/k1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_9
    iget-object v0, p0, Lb1/e;->b:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_a
    iget-object v0, p0, Lb1/e;->b:Ljava/lang/Object;

    check-cast v0, Lc4/f0;

    invoke-virtual {v0}, Lb3/a;->d()V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/lifecycle/o1;->n(Landroid/view/View;Landroidx/lifecycle/g0;)V

    iget-object v1, v0, Lc4/f0;->O:Landroid/view/WindowManager;

    invoke-interface {v1, v0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    return-void

    :pswitch_b
    iget-object v0, p0, Lb1/e;->b:Ljava/lang/Object;

    check-cast v0, Lc4/d0;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    iget-object v0, v0, Lc4/d0;->G:Lc4/z;

    invoke-virtual {v0}, Lb3/a;->d()V

    return-void

    :pswitch_c
    iget-object v0, p0, Lb1/e;->b:Ljava/lang/Object;

    check-cast v0, Lb1/c;

    iget-object v0, v0, Lb1/c;->c:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb1/b;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lb1/b;->close()V

    :cond_4
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
