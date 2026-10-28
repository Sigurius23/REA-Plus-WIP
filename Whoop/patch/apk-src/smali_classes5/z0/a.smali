.class public final synthetic Lz0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lz0/f;


# direct methods
.method public synthetic constructor <init>(Lz0/f;I)V
    .locals 0

    iput p2, p0, Lz0/a;->w:I

    iput-object p1, p0, Lz0/a;->x:Lz0/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lz0/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lp1/i0;

    iget-object p1, p0, Lz0/a;->x:Lz0/f;

    iget-object v0, p1, Lz0/f;->e:Lz1/v;

    invoke-virtual {v0}, Lz1/v;->e()V

    new-instance v0, Lb1/e;

    const/16 v1, 0xd

    invoke-direct {v0, p1, v1}, Lb1/e;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_0
    iget-object p1, p0, Lz0/a;->x:Lz0/f;

    iget-object p1, p1, Lz0/f;->h:Landroid/view/ActionMode;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/ActionMode;->invalidateContentRect()V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object p1, p0, Lz0/a;->x:Lz0/f;

    iget-object p1, p1, Lz0/f;->h:Landroid/view/ActionMode;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/ActionMode;->invalidate()V

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Lc93/a;

    iget-object v0, p0, Lz0/a;->x:Lz0/f;

    iget-object v0, v0, Lz0/f;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v1, v2, :cond_3

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v1, Lb4/a;

    const/16 v2, 0x9

    invoke-direct {v1, p1, v2}, Lb4/a;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_4
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
