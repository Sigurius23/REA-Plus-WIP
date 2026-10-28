.class public final Landroidx/room/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;
.implements Lud3/k;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Landroidx/room/d;->w:I

    iput-object p2, p0, Landroidx/room/d;->x:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/room/d;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Landroidx/room/d;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x4

    const/4 v4, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lr93/c;

    iget-object v0, p0, Landroidx/room/d;->x:Ljava/lang/Object;

    check-cast v0, Lya3/p;

    iget-object v1, p0, Landroidx/room/d;->y:Ljava/lang/Object;

    check-cast v1, Lr93/c;

    const-string v2, "second"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lya3/p;->c(Lr93/c;Lr93/c;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ls2/c;

    iget-object p1, p1, Ls2/c;->a:Landroid/view/KeyEvent;

    iget-object v0, p0, Landroidx/room/d;->x:Ljava/lang/Object;

    check-cast v0, Lg2/i;

    invoke-virtual {p1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    move v2, v4

    goto/16 :goto_1

    :cond_1
    const/16 v5, 0x201

    invoke-virtual {v1, v5}, Landroid/view/InputDevice;->supportsSource(I)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Landroid/view/InputDevice;->isVirtual()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {p1}, Ls2/e;->L(Landroid/view/KeyEvent;)I

    move-result v1

    const/4 v5, 0x2

    if-ne v1, v5, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getSource()I

    move-result v1

    const/16 v5, 0x101

    if-ne v1, v5, :cond_4

    goto :goto_0

    :cond_4
    const/16 v1, 0x13

    invoke-static {v1, p1}, Lu0/n0;->i(ILandroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 p1, 0x5

    check-cast v0, Lg2/l;

    invoke-virtual {v0, p1}, Lg2/l;->h(I)Z

    move-result v2

    goto :goto_1

    :cond_5
    const/16 v1, 0x14

    invoke-static {v1, p1}, Lu0/n0;->i(ILandroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 p1, 0x6

    check-cast v0, Lg2/l;

    invoke-virtual {v0, p1}, Lg2/l;->h(I)Z

    move-result v2

    goto :goto_1

    :cond_6
    const/16 v1, 0x15

    invoke-static {v1, p1}, Lu0/n0;->i(ILandroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 p1, 0x3

    check-cast v0, Lg2/l;

    invoke-virtual {v0, p1}, Lg2/l;->h(I)Z

    move-result v2

    goto :goto_1

    :cond_7
    const/16 v1, 0x16

    invoke-static {v1, p1}, Lu0/n0;->i(ILandroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_8

    check-cast v0, Lg2/l;

    invoke-virtual {v0, v3}, Lg2/l;->h(I)Z

    move-result v2

    goto :goto_1

    :cond_8
    const/16 v0, 0x17

    invoke-static {v0, p1}, Lu0/n0;->i(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/room/d;->y:Ljava/lang/Object;

    check-cast p1, Lu0/s0;

    iget-object p1, p1, Lu0/s0;->c:Lb3/x2;

    if-eqz p1, :cond_9

    check-cast p1, Lb3/x1;

    invoke-virtual {p1}, Lb3/x1;->b()V

    :cond_9
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ls2/c;

    iget-object p1, p1, Ls2/c;->a:Landroid/view/KeyEvent;

    iget-object v0, p0, Landroidx/room/d;->x:Ljava/lang/Object;

    check-cast v0, Lu0/s0;

    invoke-virtual {v0}, Lu0/s0;->a()Lu0/g0;

    move-result-object v0

    sget-object v5, Lu0/g0;->x:Lu0/g0;

    if-ne v0, v5, :cond_a

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    if-ne v0, v3, :cond_a

    invoke-static {p1}, Ls2/e;->L(Landroid/view/KeyEvent;)I

    move-result p1

    if-ne p1, v2, :cond_a

    iget-object p1, p0, Landroidx/room/d;->y:Ljava/lang/Object;

    check-cast p1, Lf1/s1;

    invoke-virtual {p1, v1}, Lf1/s1;->g(Lh2/b;)V

    goto :goto_2

    :cond_a
    move v2, v4

    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Landroidx/room/d;->x:Ljava/lang/Object;

    check-cast p1, Leh/a;

    iget-object v1, p1, Leh/a;->b:Ljava/lang/Object;

    iget-object v0, p0, Landroidx/room/d;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/m;

    monitor-enter v1

    :try_start_0
    iget-object p1, p1, Leh/a;->c:Ljava/io/Serializable;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    monitor-exit v1

    throw p1

    :pswitch_3
    iget-object v0, p0, Landroidx/room/d;->x:Ljava/lang/Object;

    check-cast v0, Lna3/q;

    iget-object v1, p0, Landroidx/room/d;->y:Ljava/lang/Object;

    check-cast v1, [Lna3/d;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-eqz v0, :cond_b

    iget-object v0, v0, Lna3/q;->a:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lna3/d;

    if-nez v0, :cond_d

    :cond_b
    if-ltz p1, :cond_c

    array-length v0, v1

    if-ge p1, v0, :cond_c

    aget-object v0, v1, p1

    goto :goto_3

    :cond_c
    sget-object v0, Lna3/d;->e:Lna3/d;

    :cond_d
    :goto_3
    return-object v0

    :pswitch_4
    iget-object v0, p0, Landroidx/room/d;->x:Ljava/lang/Object;

    check-cast v0, Llg3/q;

    iget-object v1, v0, Llg3/q;->e:Ljava/lang/Object;

    check-cast v1, Lzt/q;

    iget-object v3, p0, Landroidx/room/d;->y:Ljava/lang/Object;

    check-cast v3, Lna3/b;

    const-string v5, "$this$extractNullability"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v3, Lna3/b;->a:Lob3/g;

    check-cast p1, Ls93/b;

    instance-of v5, p1, Lja3/f;

    if-eqz v5, :cond_e

    iget-object v5, v1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v5, Lia3/a;

    iget-object v5, v5, Lia3/a;->t:Lia3/b;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v5, p1

    check-cast v5, Lja3/f;

    iget-boolean v5, v5, Lja3/f;->g:Z

    if-nez v5, :cond_13

    iget-object v0, v0, Llg3/q;->f:Ljava/io/Serializable;

    check-cast v0, Lfa3/a;

    sget-object v5, Lfa3/a;->F:Lfa3/a;

    if-eq v0, v5, :cond_13

    :cond_e
    if-eqz v3, :cond_12

    check-cast v3, Llb3/y;

    sget-object v0, Lo93/h;->e:Lva3/h;

    invoke-virtual {v3}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-static {v0}, Lo93/h;->s(Lr93/h;)Lo93/j;

    move-result-object v0

    if-eqz v0, :cond_12

    iget-object v0, v1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->q:Lfa3/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lo93/m;->t:Lva3/e;

    invoke-static {p1, v0}, Lfa3/b;->c(Ljava/lang/Object;Lva3/e;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_f

    goto :goto_4

    :cond_f
    invoke-static {p1, v4}, Lfa3/b;->a(Ljava/lang/Object;Z)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_4

    :cond_10
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_11
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v3, "TYPE"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object p1, v1, Lzt/q;->x:Ljava/lang/Object;

    check-cast p1, Lia3/a;

    iget-object p1, p1, Lia3/a;->t:Lia3/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_5

    :cond_12
    :goto_4
    move v2, v4

    :cond_13
    :goto_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ls2/c;

    iget-object p1, p1, Ls2/c;->a:Landroid/view/KeyEvent;

    iget-object p1, p0, Landroidx/room/d;->y:Ljava/lang/Object;

    check-cast p1, Lp1/c1;

    iget-object v0, p0, Landroidx/room/d;->x:Ljava/lang/Object;

    check-cast v0, Ll1/x4;

    invoke-virtual {v0}, Ll1/x4;->b()Z

    move-result v0

    if-nez v0, :cond_14

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_14
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_6
    iget-object v0, p0, Landroidx/room/d;->x:Ljava/lang/Object;

    check-cast v0, La00/g;

    iget-object v2, p0, Landroidx/room/d;->y:Ljava/lang/Object;

    move-object v5, v2

    check-cast v5, Ljb3/h;

    iget-object v2, v5, Ljb3/h;->L:Lhb3/k;

    move-object v6, p1

    check-cast v6, Lva3/h;

    const-string p1, "name"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v0, La00/g;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/LinkedHashMap;

    invoke-virtual {p1, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqa3/x;

    if-eqz p1, :cond_15

    iget-object v1, v2, Lhb3/k;->a:Lhb3/i;

    iget-object v4, v1, Lhb3/i;->a:Lkb3/k;

    iget-object v0, v0, La00/g;->z:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lkb3/i;

    new-instance v8, Ljb3/a;

    iget-object v0, v2, Lhb3/k;->a:Lhb3/i;

    iget-object v0, v0, Lhb3/i;->a:Lkb3/k;

    new-instance v1, Lce/d;

    invoke-direct {v1, v3, v5, p1}, Lce/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v8, v0, v1}, Ljb3/a;-><init>(Lkb3/n;Lc93/a;)V

    sget-object v9, Lr93/s0;->q:Lr93/v0;

    invoke-static/range {v4 .. v9}, Lu93/u;->X(Lkb3/n;Lr93/e;Lva3/h;Lkb3/i;Ls93/i;Lr93/s0;)Lu93/u;

    move-result-object v1

    :cond_15
    return-object v1

    :pswitch_7
    iget-object v0, p0, Landroidx/room/d;->x:Ljava/lang/Object;

    check-cast v0, Lu93/q0;

    iget-object v1, p0, Landroidx/room/d;->y:Ljava/lang/Object;

    check-cast v1, Lja3/o;

    check-cast p1, Lva3/h;

    const-string v2, "accessorName"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lu93/n;->getName()Lva3/h;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    goto :goto_6

    :cond_16
    invoke-virtual {v1, p1}, Lja3/o;->E(Lva3/h;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v1, p1}, Lja3/o;->F(Lva3/h;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {v0, p1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    :goto_6
    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/Throwable;

    :try_start_1
    iget-object p1, p0, Landroidx/room/d;->x:Ljava/lang/Object;

    check-cast p1, Lzd3/o;

    invoke-virtual {p1}, Lzd3/o;->cancel()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_9
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Landroidx/room/d;->x:Ljava/lang/Object;

    check-cast p1, Landroid/os/CancellationSignal;

    if-eqz p1, :cond_17

    invoke-virtual {p1}, Landroid/os/CancellationSignal;->cancel()V

    :cond_17
    iget-object p1, p0, Landroidx/room/d;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c2;

    invoke-virtual {p1, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

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

.method public onFailure(Lud3/j;Ljava/io/IOException;)V
    .locals 0

    check-cast p1, Lzd3/o;

    iget-boolean p1, p1, Lzd3/o;->R:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/room/d;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/m;

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-virtual {p1, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onResponse(Lud3/j;Lud3/x0;)V
    .locals 0

    iget-object p1, p0, Landroidx/room/d;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/m;

    invoke-virtual {p1, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
