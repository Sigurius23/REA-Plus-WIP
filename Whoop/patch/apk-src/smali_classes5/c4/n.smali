.class public final Lc4/n;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc4/f0;


# direct methods
.method public synthetic constructor <init>(Lc4/f0;I)V
    .locals 0

    iput p2, p0, Lc4/n;->w:I

    iput-object p1, p0, Lc4/n;->x:Lc4/f0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lc4/n;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc93/a;

    iget-object v0, p0, Lc4/n;->x:Lc4/f0;

    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v1, v2, :cond_1

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Lb4/a;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lb4/a;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ly3/l;

    iget-wide v0, p1, Ly3/l;->a:J

    new-instance p1, Ly3/l;

    invoke-direct {p1, v0, v1}, Ly3/l;-><init>(J)V

    iget-object v0, p0, Lc4/n;->x:Lc4/f0;

    invoke-virtual {v0, p1}, Lc4/f0;->setPopupContentSize-fhxjrPA(Ly3/l;)V

    invoke-virtual {v0}, Lc4/f0;->n()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Ly2/y;

    invoke-interface {p1}, Ly2/y;->V()Ly2/y;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Lc4/n;->x:Lc4/f0;

    invoke-virtual {v0, p1}, Lc4/f0;->m(Ly2/y;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
