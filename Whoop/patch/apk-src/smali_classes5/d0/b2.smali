.class public final Ld0/b2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Ld0/b2;->a:I

    iput-object p2, p0, Ld0/b2;->b:Ljava/lang/Object;

    iput-object p3, p0, Ld0/b2;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 4

    iget v0, p0, Ld0/b2;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld0/b2;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/g0;

    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    iget-object v1, p0, Ld0/b2;->c:Ljava/lang/Object;

    check-cast v1, Lx20/l;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ld0/b2;->b:Ljava/lang/Object;

    check-cast v0, Lu0/r1;

    iget-object v0, v0, Lu0/r1;->c:Lz1/p;

    iget-object v1, p0, Ld0/b2;->c:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_1
    iget-object v0, p0, Ld0/b2;->b:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj0/l;

    if-eqz v1, :cond_1

    new-instance v2, Lj0/k;

    invoke-direct {v2, v1}, Lj0/k;-><init>(Lj0/l;)V

    iget-object v1, p0, Ld0/b2;->c:Ljava/lang/Object;

    check-cast v1, Lj0/i;

    if-eqz v1, :cond_0

    check-cast v1, Lj0/j;

    invoke-virtual {v1, v2}, Lj0/j;->b(Lj0/h;)Z

    :cond_0
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_1
    return-void

    :pswitch_2
    iget-object v0, p0, Ld0/b2;->b:Ljava/lang/Object;

    check-cast v0, Lt20/n;

    iget-object v0, v0, Lt20/n;->q:Lkotlin/jvm/functions/Function1;

    sget-object v1, Lt20/m;->w:Lt20/m;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ld0/b2;->c:Ljava/lang/Object;

    check-cast v0, Lt20/w;

    iget-object v1, v0, Lt20/w;->z:Landroidx/lifecycle/k1;

    const-string v2, "should_reset"

    invoke-virtual {v1, v2}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v0, v2}, Lt20/w;->p(Lzy/b;)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lt20/w;->q(Z)V

    :goto_0
    iget-object v1, v0, Lt20/w;->e0:Lw10/e;

    if-eqz v1, :cond_3

    iget v3, v1, Lw10/e;->a:I

    packed-switch v3, :pswitch_data_1

    iget-object v1, v1, Lw10/e;->b:Lj/i;

    invoke-virtual {v1}, Lj/i;->b()V

    goto :goto_1

    :pswitch_3
    iget-object v1, v1, Lw10/e;->b:Lj/i;

    invoke-virtual {v1}, Lj/i;->b()V

    :cond_3
    :goto_1
    iput-object v2, v0, Lt20/w;->e0:Lw10/e;

    return-void

    :pswitch_4
    iget-object v0, p0, Ld0/b2;->b:Ljava/lang/Object;

    check-cast v0, Lp0/x0;

    iget-object v0, v0, Lp0/x0;->y:La0/w0;

    iget-object v1, p0, Ld0/b2;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, La0/w0;->k(Ljava/lang/Object;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Ld0/b2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Ld0/b2;->c:Ljava/lang/Object;

    check-cast v1, Ln40/a;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void

    :pswitch_6
    iget-object v0, p0, Ld0/b2;->b:Ljava/lang/Object;

    check-cast v0, Leb/q;

    iget-object v0, v0, Leb/q;->H:Landroidx/lifecycle/i0;

    iget-object v1, p0, Ld0/b2;->c:Ljava/lang/Object;

    check-cast v1, Lgb/n;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/i0;->d(Landroidx/lifecycle/f0;)V

    return-void

    :pswitch_7
    iget-object v0, p0, Ld0/b2;->b:Ljava/lang/Object;

    check-cast v0, Ld0/z1;

    iget-object v1, p0, Ld0/b2;->c:Ljava/lang/Object;

    check-cast v1, Ld0/s1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ld0/s1;->b()Ld0/r1;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v1, v1, Ld0/r1;->w:Ld0/v1;

    iget-object v0, v0, Ld0/z1;->i:Lz1/p;

    invoke-virtual {v0, v1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    :cond_4
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
    .end packed-switch
.end method
