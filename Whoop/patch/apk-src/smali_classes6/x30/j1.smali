.class public final synthetic Lx30/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lx30/j1;->w:I

    iput-object p2, p0, Lx30/j1;->y:Ljava/lang/Object;

    iput-object p3, p0, Lx30/j1;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lx30/j1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Le11/d;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    invoke-static {v0, v1, p1}, Lzt2/j;->b(Le11/d;Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Landroid/view/Window;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Ll83/h;

    check-cast p1, Lp1/i0;

    invoke-static {v0, v1, p1}, Lzq0/f;->f(Landroid/view/Window;Ll83/h;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Lal1/c;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lzk1/c;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lzk1/a;->b(Lal1/c;Lzk1/c;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Lyi1/d$c;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lzi1/g;->c(Lyi1/d$c;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Lzc1/f4;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1, p1}, Lzc1/e4;->f(Lzc1/f4;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1, p1}, Lzc1/v2;->e(Ljava/lang/String;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Lx22/c$d;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lz22/h;->d(Lx22/c$d;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Landroid/os/Parcel;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/ClassLoader;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Lyz0/c;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {v0, v1, p1}, Lyz0/b;->a(Lyz0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Luw1/d$c;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lyw1/m;->a(Luw1/d$c;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lwn2/i;

    invoke-static {v0, v1, p1}, Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;->C(Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;Lwn2/i;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Lwn2/i;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lyn2/b;->d(Lwn2/i;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Ltk2/l;

    check-cast p1, Ltk2/j;

    invoke-static {v0, v1, p1}, Lyk2/l;->y(Lkotlin/jvm/functions/Function1;Ltk2/l;Ltk2/j;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/models/ProgressButtonModel;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lc31/c;

    invoke-static {v0, v1, p1}, Lyi0/d;->l(Lcom/whoop/design/models/ProgressButtonModel;Lkotlin/jvm/functions/Function1;Lc31/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Lp1/i0;

    invoke-static {v0, v1, p1}, Lyi0/d;->d(Ljava/util/Map;Lp1/c1;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Lwf1/c$d;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lyf1/g;->a(Lwf1/c$d;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Lwb0/f;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lyb0/k;->V(Lwb0/f;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Ldp0/g;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ly31/a;

    invoke-static {v0, v1, p1}, Ly31/b;->b(Ldp0/g;Lkotlin/jvm/functions/Function1;Ly31/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Lvp2/c$c;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lxp2/f;->h(Lvp2/c$c;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Lxd3/f;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lb9/b;

    check-cast p1, Ljava/io/IOException;

    const-string v2, "it"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter v0

    :try_start_0
    invoke-virtual {v1}, Lb9/b;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :pswitch_13
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Lx90/b;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lx90/c;

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lx90/b;->c(Lx90/b;Lx90/c;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object p1, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v0, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v0, Ldc3/h;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {v0, v1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1

    :pswitch_15
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Lx31/c;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Ll3/r0;

    invoke-static {v0, v1, p1}, Lx31/f;->g(Lx31/c;Lp1/c1;Ll3/r0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Lx30/l1;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iget-object v0, v0, Lx30/l1;->b:Lec3/h2;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lev/n;->B(ZLec3/h2;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lx30/j1;->y:Ljava/lang/Object;

    check-cast v0, Lg40/u2;

    iget-object v1, p0, Lx30/j1;->x:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iget-object v0, v0, Lg40/u2;->e:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lev/n;->B(ZLec3/h2;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
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
