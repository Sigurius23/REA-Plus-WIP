.class public final Ln20/j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Ln20/j;->w:I

    .line 1
    iput-object p1, p0, Ln20/j;->y:Ljava/lang/Object;

    iput-object p2, p0, Ln20/j;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Lec3/l;Lq83/d;Landroid/view/View;I)V
    .locals 0

    .line 2
    iput p4, p0, Ln20/j;->w:I

    iput-object p1, p0, Ln20/j;->y:Ljava/lang/Object;

    iput-object p3, p0, Ln20/j;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 3
    iput p4, p0, Ln20/j;->w:I

    iput-object p1, p0, Ln20/j;->y:Ljava/lang/Object;

    iput-object p2, p0, Ln20/j;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 4
    iput p3, p0, Ln20/j;->w:I

    iput-object p1, p0, Ln20/j;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lq83/d;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Ln20/j;->w:I

    .line 5
    iput-object p2, p0, Ln20/j;->z:Ljava/lang/Object;

    const/4 p2, 0x2

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method private final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ln20/j;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast p1, Lq30/u0;

    iget-object p1, p1, Lq30/u0;->x:Ljava/lang/Object;

    check-cast p1, Lbg/g;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iput v2, p0, Ln20/j;->x:I

    check-cast p1, Lbg/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    sget-object p1, Lkc3/d;->w:Lkc3/d;

    new-instance v2, Lbg/a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v2, v4, v1, v3}, Lbg/a;-><init>(ILjava/lang/String;Lq83/d;)V

    invoke-static {p1, v2, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbg/f;

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lbg/f;->a:Ljava/lang/String;

    iget-object v1, v1, Lbg/f;->b:Landroidx/room/c1;

    invoke-virtual {v1}, Landroidx/room/c1;->y()[B

    move-result-object v1

    invoke-static {v2, v1}, Ljava/net/InetAddress;->getByAddress(Ljava/lang/String;[B)Ljava/net/InetAddress;

    move-result-object v1

    const-string v2, "getByAddress(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ln20/j;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast p1, Lec3/l;

    new-instance v1, Lrv/d;

    iget-object v3, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v3, Lrv/m;

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lrv/d;-><init>(Lrv/m;I)V

    iput v2, p0, Ln20/j;->x:I

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ln20/j;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast p1, Ldc3/u;

    new-instance v2, Lrv/h;

    invoke-direct {v2, p1}, Lrv/h;-><init>(Ldc3/u;)V

    iget-object v4, v0, Lm63/d;->x:Ljava/lang/Object;

    check-cast v4, Lrv/j;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v4, Lrv/j;->c:Ljava/util/LinkedHashSet;

    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_3

    iget-object v6, v4, Lrv/j;->b:Landroid/hardware/SensorManager;

    iget-object v7, v4, Lrv/j;->e:Landroid/hardware/Sensor;

    const v8, 0x186a0

    if-eqz v7, :cond_2

    invoke-virtual {v6, v4, v7, v8}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    goto :goto_0

    :cond_2
    iget-object v7, v4, Lrv/j;->f:Landroid/hardware/Sensor;

    invoke-virtual {v6, v4, v7, v8}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    iget-object v7, v4, Lrv/j;->g:Landroid/hardware/Sensor;

    invoke-virtual {v6, v4, v7, v8}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    :cond_3
    :goto_0
    invoke-interface {v5, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v4, Lr5/c;

    const/4 v5, 0x3

    invoke-direct {v4, v5, v0, v2}, Lr5/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v3, p0, Ln20/j;->x:I

    invoke-static {p1, v4, p0}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ln20/j;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast p1, Lec3/l;

    new-instance v1, Lu;

    iget-object v3, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/view/CardMultilineWidget;

    const/16 v4, 0x15

    invoke-direct {v1, v3, v4}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v2, p0, Ln20/j;->x:I

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Ln20/j;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lec3/l;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/view/CardNumberEditText;

    const/16 v2, 0x1d

    invoke-direct {p1, v0, p2, v1, v2}, Ln20/j;-><init>(Lec3/l;Lq83/d;Landroid/view/View;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lec3/l;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/view/CardMultilineWidget;

    const/16 v2, 0x1c

    invoke-direct {p1, v0, p2, v1, v2}, Ln20/j;-><init>(Lec3/l;Lq83/d;Landroid/view/View;I)V

    return-object p1

    :pswitch_1
    new-instance v0, Ln20/j;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lm63/d;

    const/16 v2, 0x1b

    invoke-direct {v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ln20/j;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_2
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lec3/l;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lrv/m;

    const/16 v2, 0x1a

    invoke-direct {p1, v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lrf/x;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lne3/i;

    const/16 v2, 0x19

    invoke-direct {p1, v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_4
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lq30/u0;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x18

    invoke-direct {p1, v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_5
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lr23/c;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lo23/a;

    const/16 v2, 0x17

    invoke-direct {p1, v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_6
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lo23/a;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    const/16 v2, 0x16

    invoke-direct {p1, v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_7
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lr0/f;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Ln0/j;

    const/16 v2, 0x15

    invoke-direct {p1, v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_8
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lec3/f2;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lp1/r1;

    const/16 v2, 0x14

    invoke-direct {p1, v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_9
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lq30/j;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lq30/h;

    const/16 v2, 0x13

    invoke-direct {p1, v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_a
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Ljz/o;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lq00/p0;

    const/16 v2, 0x12

    invoke-direct {p1, v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_b
    new-instance v0, Ln20/j;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lq00/p0;

    const/16 v2, 0x11

    invoke-direct {v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ln20/j;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_c
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lu2/v;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lq0/y;

    const/16 v2, 0x10

    invoke-direct {p1, v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_d
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lcom/amplitude/android/engagement/a;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lcom/amplitude/android/engagement/types/Nudge;

    const/16 v2, 0xf

    invoke-direct {p1, v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_e
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lp6/s0;

    const/16 v2, 0xe

    invoke-direct {p1, v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_f
    new-instance v0, Ln20/j;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lp6/b;

    const/16 v2, 0xd

    invoke-direct {v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ln20/j;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_10
    new-instance v0, Ln20/j;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/glance/appwidget/AsyncRequestWorker;

    const/16 v2, 0xc

    invoke-direct {v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ln20/j;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_11
    new-instance v0, Ln20/j;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lp00/o;

    const/16 v2, 0xb

    invoke-direct {v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ln20/j;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_12
    new-instance v0, Ln20/j;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, p2, v1}, Ln20/j;-><init>(Lq83/d;Lkotlin/jvm/functions/Function1;)V

    iput-object p1, v0, Ln20/j;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_13
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/room/z0;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p1, v0, v1, p2}, Ln20/j;-><init>(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    return-object p1

    :pswitch_14
    new-instance v0, Ln20/j;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lo23/o;

    const/16 v2, 0x8

    invoke-direct {v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ln20/j;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_15
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lo23/k;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lo23/a;

    const/4 v2, 0x7

    invoke-direct {p1, v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_16
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v0, Lo23/q;

    const/4 v1, 0x6

    invoke-direct {p1, v0, p2, v1}, Ln20/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_17
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lo23/k;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lo23/a;

    const/4 v2, 0x5

    invoke-direct {p1, v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_18
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v0, Lo23/k;

    const/4 v1, 0x4

    invoke-direct {p1, v0, p2, v1}, Ln20/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_19
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lo23/j;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lo23/a;

    const/4 v2, 0x3

    invoke-direct {p1, v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1a
    new-instance v0, Ln20/j;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lo23/h;

    const/4 v2, 0x2

    invoke-direct {v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ln20/j;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_1b
    new-instance p1, Ln20/j;

    iget-object v0, p0, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, La00/g;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Lj43/b;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1c
    new-instance v0, Ln20/j;

    iget-object v1, p0, Ln20/j;->z:Ljava/lang/Object;

    check-cast v1, Ln20/k;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, Ln20/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ln20/j;->y:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ln20/j;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_9
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lwz/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lx6/k;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lwz/w1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Landroidx/room/v1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_1c
    check-cast p1, Le10/b0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln20/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln20/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln20/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v5, p0

    iget v0, v5, Ln20/j;->w:I

    const-string v1, "The call was canceled before complete its execution."

    const/4 v2, 0x3

    const/4 v3, 0x4

    const/4 v4, 0x5

    const/4 v7, 0x2

    const/4 v8, 0x0

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    iget-object v10, v5, Ln20/j;->z:Ljava/lang/Object;

    const-string v11, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v12, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    if-eqz v1, :cond_1

    if-ne v1, v12, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v1, Lec3/l;

    new-instance v2, Ls40/w;

    check-cast v10, Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {v2, v10, v12}, Ls40/w;-><init>(Lcom/stripe/android/view/CardNumberEditText;I)V

    iput v12, v5, Ln20/j;->x:I

    invoke-interface {v1, v2, v5}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    move-object v9, v0

    :cond_2
    :goto_0
    return-object v9

    :pswitch_0
    invoke-direct/range {p0 .. p1}, Ln20/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-direct/range {p0 .. p1}, Ln20/j;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-direct/range {p0 .. p1}, Ln20/j;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    if-eqz v1, :cond_4

    if-ne v1, v12, :cond_3

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v1, Lrf/x;

    check-cast v10, Lne3/i;

    iput v12, v5, Ln20/j;->x:I

    invoke-static {v1, v10, v5}, Lrf/x;->a(Lrf/x;Lne3/i;Ls83/i;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    move-object v9, v0

    :cond_5
    :goto_1
    return-object v9

    :pswitch_4
    invoke-direct/range {p0 .. p1}, Ln20/j;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    if-eqz v1, :cond_8

    if-eq v1, v12, :cond_7

    if-ne v1, v7, :cond_6

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_2

    :cond_8
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v1, Lr23/c;

    iput v12, v5, Ln20/j;->x:I

    invoke-virtual {v1, v5}, Lr23/c;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_9

    goto :goto_3

    :cond_9
    :goto_2
    check-cast v1, Ln23/h;

    sget-object v2, Lp23/a;->a:Lbc3/w1;

    new-instance v3, Ln20/j;

    check-cast v10, Lo23/a;

    const/16 v4, 0x16

    invoke-direct {v3, v10, v1, v8, v4}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v7, v5, Ln20/j;->x:I

    invoke-static {v2, v3, v5}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_a

    :goto_3
    move-object v9, v0

    :cond_a
    :goto_4
    return-object v9

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    if-eqz v1, :cond_c

    if-ne v1, v12, :cond_b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v12, v5, Ln20/j;->x:I

    invoke-static {v5}, Lbc3/f0;->L(Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_d

    move-object v9, v0

    goto :goto_6

    :cond_d
    :goto_5
    iget-object v0, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lo23/a;

    check-cast v10, Ln23/h;

    invoke-interface {v0, v10}, Lo23/a;->onResult(Ln23/h;)V

    :goto_6
    return-object v9

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    if-eqz v1, :cond_f

    if-ne v1, v12, :cond_e

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v1, Lr0/f;

    check-cast v10, Ln0/j;

    iput v12, v5, Ln20/j;->x:I

    invoke-static {v1, v10, v5}, Lds/q;->m(La3/n;Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_10

    move-object v9, v0

    :cond_10
    :goto_7
    return-object v9

    :pswitch_8
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    if-eqz v1, :cond_12

    if-eq v1, v12, :cond_11

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_8

    :cond_12
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v1, Lec3/f2;

    new-instance v2, Lj8/a;

    check-cast v10, Lp1/r1;

    invoke-direct {v2, v10, v3}, Lj8/a;-><init>(Lp1/r1;I)V

    iput v12, v5, Ln20/j;->x:I

    invoke-interface {v1, v2, v5}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_13

    return-object v0

    :cond_13
    :goto_8
    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :pswitch_9
    iget-object v0, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lq30/j;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, Ln20/j;->x:I

    if-eqz v2, :cond_15

    if-ne v2, v12, :cond_14

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_a

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lq30/j;->a:Lr30/b;

    iget-object v14, v2, Lr30/b;->w:Ljava/lang/String;

    iget-object v15, v2, Lr30/b;->x:Ljava/lang/String;

    iget-object v3, v2, Lr30/b;->y:Ljava/lang/String;

    iget-object v4, v2, Lr30/b;->z:Lq30/q0;

    iget-object v6, v2, Lr30/b;->I:Ljava/util/List;

    iget-object v2, v2, Lr30/b;->E:Ljava/lang/String;

    new-instance v13, Lr30/b;

    const/16 v20, 0xee0

    move-object/from16 v18, v2

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    move-object/from16 v19, v6

    invoke-direct/range {v13 .. v20}, Lr30/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq30/q0;Ljava/lang/String;Ljava/util/List;I)V

    check-cast v10, Lq30/h;

    instance-of v2, v10, Lq30/e;

    if-eqz v2, :cond_16

    check-cast v10, Lq30/e;

    iget-object v2, v10, Lq30/e;->w:Ljava/lang/String;

    iget-object v3, v10, Lq30/e;->x:Ljava/lang/Boolean;

    const/16 v4, 0x7df

    invoke-static {v13, v2, v8, v3, v4}, Lr30/b;->b(Lr30/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;I)Lr30/b;

    move-result-object v2

    goto :goto_9

    :cond_16
    instance-of v2, v10, Lq30/d;

    if-eqz v2, :cond_17

    check-cast v10, Lq30/d;

    iget-object v2, v10, Lq30/d;->w:Ljava/lang/String;

    const/16 v3, 0xf7f

    invoke-static {v13, v8, v2, v8, v3}, Lr30/b;->b(Lr30/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;I)Lr30/b;

    move-result-object v2

    goto :goto_9

    :cond_17
    instance-of v2, v10, Lq30/f;

    if-eqz v2, :cond_18

    check-cast v10, Lq30/f;

    iget-object v2, v10, Lq30/f;->w:Ljava/lang/Boolean;

    const/16 v3, 0x5ff

    invoke-static {v13, v8, v8, v2, v3}, Lr30/b;->b(Lr30/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;I)Lr30/b;

    move-result-object v2

    goto :goto_9

    :cond_18
    instance-of v2, v10, Lq30/g;

    if-eqz v2, :cond_19

    const/16 v2, 0xbff

    invoke-static {v13, v8, v8, v8, v2}, Lr30/b;->b(Lr30/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;I)Lr30/b;

    move-result-object v2

    goto :goto_9

    :cond_19
    instance-of v2, v10, Lq30/c;

    if-eqz v2, :cond_1b

    sget-object v2, Lr30/a;->x:Lr30/a;

    const/16 v2, 0xfbf

    invoke-static {v13, v8, v8, v8, v2}, Lr30/b;->b(Lr30/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;I)Lr30/b;

    move-result-object v2

    :goto_9
    iput v12, v5, Ln20/j;->x:I

    invoke-static {v0, v2, v5}, Lq30/j;->a(Lq30/j;Lr30/b;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_1a

    move-object v0, v1

    :cond_1a
    :goto_a
    return-object v0

    :cond_1b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_a
    iget-object v0, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Ljz/o;

    check-cast v10, Lq00/p0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, Ln20/j;->x:I

    if-eqz v2, :cond_1e

    if-eq v2, v12, :cond_1d

    if-ne v2, v7, :cond_1c

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_d

    :catchall_0
    move-exception v0

    goto :goto_e

    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_b

    :cond_1e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v2, v0, Ljz/m;

    sget-object v22, Lq00/a;->a:Lq00/a;

    if-eqz v2, :cond_25

    check-cast v0, Ljz/m;

    iget-object v0, v0, Ljz/m;->w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getAccounts()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getData()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->getId()Ljava/lang/String;

    move-result-object v8

    :cond_1f
    if-eqz v8, :cond_23

    iget-object v0, v10, Lq00/p0;->y:Lxz/x;

    iput v12, v5, Ln20/j;->x:I

    invoke-virtual {v0, v8, v5}, Lxz/x;->b(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_20

    goto :goto_c

    :cond_20
    :goto_b
    instance-of v2, v0, Ll83/m;

    if-nez v2, :cond_22

    :try_start_1
    check-cast v0, Ly00/c0;

    invoke-virtual {v0}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v0

    iput v7, v5, Ln20/j;->x:I

    invoke-virtual {v10, v0, v12, v5}, Lq00/p0;->o(Ljava/lang/String;ZLs83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v0, v1, :cond_21

    :goto_c
    move-object v9, v1

    goto/16 :goto_10

    :cond_21
    :goto_d
    move-object v0, v9

    goto :goto_f

    :goto_e
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :cond_22
    :goto_f
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_28

    const-string v1, "Failed to create/load bank account"

    invoke-static {v10, v0, v1}, Lq00/p0;->j(Lq00/p0;Ljava/lang/Throwable;Ljava/lang/String;)V

    goto/16 :goto_10

    :cond_23
    iget-object v1, v10, Lq00/p0;->M:Lec3/h2;

    :cond_24
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lq00/i0;

    const/16 v23, 0x0

    const v24, 0xfefffff

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v13 .. v24}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_24

    goto :goto_10

    :cond_25
    sget-object v1, Ljz/l;->w:Ljz/l;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    iget-object v1, v10, Lq00/p0;->M:Lec3/h2;

    :cond_26
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lq00/i0;

    const/16 v23, 0x0

    const v24, 0xfefffff

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v13 .. v24}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_26

    iget-object v0, v10, Lq00/p0;->N:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq00/i0;

    iget-object v0, v0, Lq00/i0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_28

    iget-object v0, v10, Lq00/p0;->K:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lwz/m;

    iget-object v2, v10, Lq00/p0;->y:Lxz/x;

    invoke-static {v2}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v2

    invoke-direct {v1, v2}, Lwz/m;-><init>(Lwz/e;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_10

    :cond_27
    instance-of v1, v0, Ljz/n;

    if-eqz v1, :cond_29

    check-cast v0, Ljz/n;

    iget-object v0, v0, Ljz/n;->w:Ljava/lang/Throwable;

    const-string v1, "Failed to get Financial Connections result"

    invoke-static {v10, v0, v1}, Lq00/p0;->j(Lq00/p0;Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_28
    :goto_10
    return-object v9

    :cond_29
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_b
    move-object v0, v10

    check-cast v0, Lq00/p0;

    iget-object v1, v0, Lq00/p0;->w:Lwz/g0;

    iget-object v2, v0, Lq00/p0;->M:Lec3/h2;

    iget-object v3, v0, Lq00/p0;->H:Lwz/n0;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v4, v5, Ln20/j;->x:I

    if-eqz v4, :cond_2b

    if-ne v4, v12, :cond_2a

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_25

    :cond_2a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v4, Lwz/a;

    iget-object v4, v4, Lwz/a;->a:Ljava/util/ArrayList;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2c
    :goto_11
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_31

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v13, v11

    check-cast v13, Lwz/s0;

    instance-of v14, v3, Lwz/m0;

    if-eqz v14, :cond_2d

    move-object v14, v3

    check-cast v14, Lwz/m0;

    goto :goto_12

    :cond_2d
    move-object v14, v8

    :goto_12
    if-eqz v14, :cond_2e

    iget-object v14, v14, Lwz/m0;->x:Lwz/v0;

    goto :goto_13

    :cond_2e
    move-object v14, v8

    :goto_13
    if-eqz v14, :cond_30

    iget-object v13, v13, Lwz/s0;->x:Ly00/c0;

    const-string v15, "details"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v15, v13, Ly00/x;

    if-eqz v15, :cond_2f

    sget-object v13, Lwz/v0;->x:Lwz/v0;

    if-ne v14, v13, :cond_2c

    goto :goto_14

    :cond_2f
    instance-of v13, v13, Ly00/a0;

    if-eqz v13, :cond_2c

    sget-object v13, Lwz/v0;->w:Lwz/v0;

    if-ne v14, v13, :cond_2c

    :cond_30
    :goto_14
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_31
    invoke-static {v10}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v13

    :goto_15
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Lq00/i0;

    iget-object v10, v14, Lq00/i0;->f:Ljava/lang/String;

    move-object v11, v13

    check-cast v11, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v11, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v15, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_16
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_32

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v8, v16

    check-cast v8, Lwz/s0;

    iget-object v8, v8, Lwz/s0;->x:Ly00/c0;

    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v8, 0x0

    goto :goto_16

    :cond_32
    if-eqz v10, :cond_35

    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_17
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_34

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v16, v8

    check-cast v16, Ly00/c0;

    move/from16 v26, v12

    invoke-virtual/range {v16 .. v16}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_33

    goto :goto_18

    :cond_33
    move/from16 v12, v26

    goto :goto_17

    :cond_34
    move/from16 v26, v12

    const/4 v8, 0x0

    :goto_18
    check-cast v8, Ly00/c0;

    goto :goto_1a

    :cond_35
    move/from16 v26, v12

    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_36
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_37

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Ly00/c0;

    invoke-virtual {v10}, Ly00/c0;->h()Z

    move-result v10

    if-eqz v10, :cond_36

    goto :goto_19

    :cond_37
    const/4 v8, 0x0

    :goto_19
    check-cast v8, Ly00/c0;

    if-nez v8, :cond_38

    invoke-static {v15}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Ly00/c0;

    :cond_38
    :goto_1a
    iget-object v6, v14, Lq00/i0;->o:Ljava/lang/Boolean;

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3a

    if-eqz v8, :cond_39

    invoke-virtual {v14, v8}, Lq00/i0;->e(Ly00/c0;)Z

    move-result v6

    xor-int/lit8 v6, v6, 0x1

    move/from16 v8, v26

    if-ne v6, v8, :cond_39

    goto :goto_1b

    :cond_39
    const/4 v6, 0x0

    goto :goto_1c

    :cond_3a
    :goto_1b
    const/4 v6, 0x1

    :goto_1c
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v18

    const/16 v24, 0x0

    const v25, 0xffe7fbe

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v14 .. v25}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v6

    invoke-virtual {v2, v4, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4d

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3f

    iget-object v1, v0, Lq00/p0;->E:Lla/b;

    iget-object v1, v1, Lla/b;->x:Ljava/lang/Object;

    check-cast v1, Ln83/c;

    invoke-virtual {v1}, Ln83/c;->a()I

    move-result v2

    const/4 v8, 0x1

    if-le v2, v8, :cond_3b

    sget-object v1, Lq00/e;->c:Lq00/e;

    goto :goto_1d

    :cond_3b
    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq00/f;

    :goto_1d
    sget-object v2, Lq00/e;->c:Lq00/e;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3c

    iget-object v0, v0, Lq00/p0;->J:Lkotlin/jvm/functions/Function1;

    sget-object v1, Lwz/y0;->d:Lwz/y0;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_25

    :cond_3c
    instance-of v2, v1, Lq00/d;

    if-eqz v2, :cond_3d

    invoke-virtual {v0}, Lq00/p0;->r()V

    goto/16 :goto_25

    :cond_3d
    if-nez v1, :cond_3e

    iget-object v1, v0, Lq00/p0;->K:Lkotlin/jvm/functions/Function1;

    new-instance v2, Lwz/o;

    new-instance v3, Lcom/stripe/android/link/NoPaymentMethodOptionsAvailable;

    invoke-direct {v3}, Lcom/stripe/android/link/NoPaymentMethodOptionsAvailable;-><init>()V

    iget-object v0, v0, Lq00/p0;->y:Lxz/x;

    invoke-static {v0}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lwz/o;-><init>(Ljava/lang/Throwable;Lwz/e;)V

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_25

    :cond_3e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3f
    instance-of v4, v3, Lwz/m0;

    if-eqz v4, :cond_4c

    check-cast v3, Lwz/m0;

    iget-object v3, v3, Lwz/m0;->w:Ly00/c0;

    if-nez v3, :cond_4c

    iget-boolean v3, v1, Lwz/g0;->a0:Z

    if-eqz v3, :cond_4c

    iget-boolean v3, v6, Lq00/i0;->x:Z

    if-nez v3, :cond_4c

    const/4 v8, 0x1

    iput v8, v5, Ln20/j;->x:I

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_40
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_41

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lwz/s0;

    iget-object v6, v6, Lwz/s0;->x:Ly00/c0;

    invoke-virtual {v6}, Ly00/c0;->h()Z

    move-result v6

    if-eqz v6, :cond_40

    goto :goto_1e

    :cond_41
    const/4 v4, 0x0

    :goto_1e
    check-cast v4, Lwz/s0;

    if-nez v4, :cond_42

    invoke-static {v13}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lwz/s0;

    :cond_42
    if-eqz v4, :cond_43

    iget-object v3, v4, Lwz/s0;->x:Ly00/c0;

    goto :goto_1f

    :cond_43
    const/4 v3, 0x0

    :cond_44
    :goto_1f
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lq00/i0;

    const/16 v20, 0x0

    const v21, 0xeffffff

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v10 .. v21}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v6

    invoke-virtual {v2, v4, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_44

    if-eqz v3, :cond_4a

    instance-of v4, v3, Ly00/a0;

    if-eqz v4, :cond_45

    move-object v8, v3

    check-cast v8, Ly00/a0;

    goto :goto_20

    :cond_45
    const/4 v8, 0x0

    :goto_20
    if-eqz v8, :cond_46

    invoke-virtual {v8}, Ly00/a0;->k()Z

    move-result v4

    if-nez v4, :cond_47

    iget-object v4, v8, Ly00/a0;->M:Ly00/v0;

    invoke-virtual {v4}, Ly00/v0;->a()Z

    move-result v4

    if-eqz v4, :cond_46

    goto :goto_21

    :cond_46
    const/4 v4, 0x0

    goto :goto_22

    :cond_47
    :goto_21
    const/4 v4, 0x1

    :goto_22
    iget-object v1, v1, Lwz/g0;->N:Lh20/l1;

    iget-object v6, v0, Lq00/p0;->x:Ld00/l;

    invoke-static {v3, v1, v6}, Lvd/e;->h0(Ly00/c0;Lh20/l1;Ld00/l;)Z

    move-result v1

    if-nez v1, :cond_48

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq00/i0;

    iget-boolean v1, v1, Lq00/i0;->n:Z

    if-eqz v1, :cond_48

    const/4 v6, 0x1

    goto :goto_23

    :cond_48
    const/4 v6, 0x0

    :goto_23
    if-nez v4, :cond_4a

    if-nez v6, :cond_4a

    :cond_49
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lq00/i0;

    invoke-virtual {v3}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v12

    const/16 v20, 0x0

    const v21, 0xfffffdf

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v10 .. v21}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v4

    invoke-virtual {v2, v1, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_49

    invoke-virtual {v0, v3, v5}, Lq00/p0;->q(Ly00/c0;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne v0, v1, :cond_4b

    goto :goto_24

    :cond_4a
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lq00/i0;

    const/16 v20, 0x0

    const v21, 0xf7fffff

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v10 .. v21}, Lq00/i0;->a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4a

    :cond_4b
    move-object v0, v9

    :goto_24
    if-ne v0, v7, :cond_4c

    move-object v9, v7

    :cond_4c
    :goto_25
    return-object v9

    :cond_4d
    const/4 v8, 0x0

    const/4 v12, 0x1

    goto/16 :goto_15

    :pswitch_c
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    if-eqz v1, :cond_4f

    const/4 v8, 0x1

    if-ne v1, v8, :cond_4e

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_26

    :cond_4e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v1, Lu2/v;

    new-instance v2, Lbc3/r1;

    check-cast v10, Lq0/y;

    const/4 v3, 0x0

    invoke-direct {v2, v10, v3, v4}, Lbc3/r1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v8, 0x1

    iput v8, v5, Ln20/j;->x:I

    invoke-static {v1, v2, v5}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_50

    move-object v9, v0

    :cond_50
    :goto_26
    return-object v9

    :pswitch_d
    move v8, v12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    if-eqz v1, :cond_52

    if-ne v1, v8, :cond_51

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_27

    :cond_51
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_52
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v8, v5, Ln20/j;->x:I

    const-wide/16 v1, 0x3e8

    invoke-static {v1, v2, v5}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_53

    move-object v9, v0

    goto :goto_29

    :cond_53
    :goto_27
    iget-object v0, v5, Ln20/j;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/amplitude/android/engagement/a;

    check-cast v10, Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v0, Lhj/j;

    const/4 v3, 0x0

    invoke-direct {v0, v10, v3}, Lhj/j;-><init>(Lcom/amplitude/android/engagement/types/Nudge;I)V

    invoke-virtual {v2, v0}, Lcom/google/crypto/tink/internal/l0;->H(Lc93/a;)V

    :try_start_2
    sget-object v0, Lwj/b;->a:Lad3/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lcom/amplitude/android/engagement/types/Nudge;->Companion:Lcom/amplitude/android/engagement/types/q0;

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/q0;->serializer()Lwc3/c;

    move-result-object v3

    check-cast v3, Lwc3/j;

    invoke-virtual {v0, v3, v10}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_28

    :catch_0
    move-exception v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to serialize to JSON string: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v3}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_28
    if-nez v0, :cond_54

    goto :goto_29

    :cond_54
    iget-object v1, v1, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "globalThis.nudgeActions.closeNudge("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    :goto_29
    return-object v9

    :pswitch_e
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    if-eqz v1, :cond_56

    const/4 v8, 0x1

    if-ne v1, v8, :cond_55

    :try_start_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2b

    :catchall_1
    move-exception v0

    goto :goto_2a

    :cond_55
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_56
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    check-cast v10, Lp6/s0;

    :try_start_4
    new-instance v2, Lp6/n0;

    invoke-direct {v2, v1}, Lp6/n0;-><init>(Landroid/content/Context;)V

    invoke-virtual {v10}, Lp6/s0;->f()Lp6/g0;

    move-result-object v1

    const/4 v8, 0x1

    iput v8, v5, Ln20/j;->x:I

    invoke-virtual {v2, v10, v1, v5}, Lp6/n0;->d(Lp6/s0;Lp6/g0;Ln20/j;)Ljava/lang/Object;

    move-result-object v1
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-ne v1, v0, :cond_57

    move-object v9, v0

    goto :goto_2b

    :goto_2a
    const-string v1, "GlanceAppWidget"

    const-string v2, "Error in Glance App Widget"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :catch_1
    :cond_57
    :goto_2b
    return-object v9

    :pswitch_f
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    if-eqz v1, :cond_59

    const/4 v8, 0x1

    if-ne v1, v8, :cond_58

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2c

    :cond_58
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_59
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v1, Lx6/k;

    check-cast v10, Lp6/b;

    iget v2, v10, Lp6/b;->a:I

    invoke-static {v2}, Lvd/e;->l(I)Ljava/lang/String;

    move-result-object v2

    const/4 v8, 0x1

    iput v8, v5, Ln20/j;->x:I

    iget-object v1, v1, Lx6/k;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp6/l;

    if-eqz v1, :cond_5a

    iget-object v2, v1, Lp6/l;->d:Ldc3/h;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ldc3/h;->r(Ljava/lang/Throwable;)Z

    iget-object v2, v1, Lp6/l;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v1, v1, Lp6/l;->m:Lbc3/l1;

    invoke-virtual {v1, v3}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_5a
    if-ne v9, v0, :cond_5b

    move-object v9, v0

    :cond_5b
    :goto_2c
    return-object v9

    :pswitch_10
    check-cast v10, Landroidx/glance/appwidget/AsyncRequestWorker;

    iget-object v0, v10, Landroidx/glance/appwidget/AsyncRequestWorker;->x:Lr6/n;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    packed-switch v1, :pswitch_data_1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_11
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2e

    :pswitch_12
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    invoke-virtual {v0}, Lr6/n;->D()Z

    move-result v8

    if-eqz v8, :cond_5c

    invoke-virtual {v0}, Lr6/n;->x()Lr6/m;

    move-result-object v0

    invoke-virtual {v0}, Lr6/m;->r()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lp6/t;->a(Ljava/lang/String;)Lp6/s0;

    move-result-object v2

    if-eqz v2, :cond_61

    invoke-virtual {v10}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0}, Lr6/m;->p()Landroidx/glance/appwidget/protobuf/d0;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->C1(Ljava/util/Collection;)[I

    move-result-object v0

    const/4 v8, 0x1

    iput v8, v5, Ln20/j;->x:I

    invoke-virtual {v2, v1, v3, v0, v5}, Lp6/s0;->d(Lbc3/c0;Landroid/content/Context;[ILq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_61

    goto/16 :goto_2f

    :cond_5c
    invoke-virtual {v0}, Lr6/n;->y()Z

    move-result v8

    if-eqz v8, :cond_5d

    invoke-virtual {v0}, Lr6/n;->t()Lr6/c;

    move-result-object v0

    invoke-virtual {v0}, Lr6/c;->r()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lp6/t;->a(Ljava/lang/String;)Lp6/s0;

    move-result-object v2

    if-eqz v2, :cond_61

    invoke-virtual {v10}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0}, Lr6/c;->p()Landroidx/glance/appwidget/protobuf/d0;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->C1(Ljava/util/Collection;)[I

    move-result-object v0

    iput v7, v5, Ln20/j;->x:I

    invoke-virtual {v2, v1, v3, v0, v5}, Lp6/s0;->a(Lbc3/c0;Landroid/content/Context;[ILq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_61

    goto/16 :goto_2f

    :cond_5d
    invoke-virtual {v0}, Lr6/n;->z()Z

    move-result v7

    if-eqz v7, :cond_5e

    invoke-virtual {v0}, Lr6/n;->u()Lr6/e;

    move-result-object v0

    invoke-virtual {v0}, Lr6/e;->t()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lp6/t;->a(Ljava/lang/String;)Lp6/s0;

    move-result-object v3

    if-eqz v3, :cond_61

    invoke-virtual {v10}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    move-object v7, v0

    move-object v0, v3

    invoke-virtual {v7}, Lr6/e;->r()I

    move-result v3

    invoke-virtual {v7}, Lr6/e;->q()Ljava/lang/String;

    move-result-object v7

    iput v2, v5, Ln20/j;->x:I

    move-object v2, v4

    move-object v4, v7

    invoke-virtual/range {v0 .. v5}, Lp6/s0;->b(Lbc3/c0;Landroid/content/Context;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_61

    goto/16 :goto_2f

    :cond_5e
    invoke-virtual {v0}, Lr6/n;->C()Z

    move-result v2

    if-nez v2, :cond_62

    invoke-virtual {v0}, Lr6/n;->A()Z

    move-result v2

    if-eqz v2, :cond_5f

    new-instance v0, Lp6/n0;

    invoke-virtual {v10}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lp6/n0;-><init>(Landroid/content/Context;)V

    iput v4, v5, Ln20/j;->x:I

    invoke-virtual {v0, v5}, Lp6/n0;->a(Ls83/i;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_61

    goto :goto_2f

    :cond_5f
    invoke-virtual {v0}, Lr6/n;->B()Z

    move-result v2

    if-eqz v2, :cond_61

    invoke-virtual {v0}, Lr6/n;->v()Lr6/i;

    move-result-object v0

    invoke-virtual {v0}, Lr6/i;->t()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lp6/t;->a(Ljava/lang/String;)Lp6/s0;

    move-result-object v2

    if-eqz v2, :cond_61

    move-object v3, v0

    move-object v0, v2

    invoke-virtual {v10}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    move-object v4, v3

    invoke-virtual {v4}, Lr6/i;->q()I

    move-result v3

    invoke-virtual {v4}, Lr6/i;->r()Landroidx/glance/appwidget/protobuf/i;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/glance/appwidget/protobuf/i;->size()I

    move-result v7

    if-nez v7, :cond_60

    sget-object v4, Landroidx/glance/appwidget/protobuf/f0;->b:[B

    goto :goto_2d

    :cond_60
    new-array v8, v7, [B

    invoke-virtual {v4, v7, v8}, Landroidx/glance/appwidget/protobuf/i;->e(I[B)V

    move-object v4, v8

    :goto_2d
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v7

    array-length v8, v4

    const/4 v9, 0x0

    invoke-virtual {v7, v4, v9, v8}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {v7, v9}, Landroid/os/Parcel;->setDataPosition(I)V

    sget-object v4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, v7}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Bundle;

    invoke-virtual {v7}, Landroid/os/Parcel;->recycle()V

    const/4 v7, 0x6

    iput v7, v5, Ln20/j;->x:I

    invoke-virtual/range {v0 .. v5}, Lp6/s0;->c(Lbc3/c0;Landroid/content/Context;ILandroid/os/Bundle;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_61

    goto :goto_2f

    :cond_61
    :goto_2e
    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object v6

    :goto_2f
    return-object v6

    :cond_62
    invoke-virtual {v0}, Lr6/n;->w()Lr6/k;

    move-result-object v0

    invoke-virtual {v10}, Lic/v;->getApplicationContext()Landroid/content/Context;

    invoke-virtual {v0}, Lr6/k;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lr6/k;->q()Landroidx/glance/appwidget/protobuf/i;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/i;->size()I

    move-result v2

    if-nez v2, :cond_63

    sget-object v0, Landroidx/glance/appwidget/protobuf/f0;->b:[B

    goto :goto_30

    :cond_63
    new-array v4, v2, [B

    invoke-virtual {v0, v2, v4}, Landroidx/glance/appwidget/protobuf/i;->e(I[B)V

    move-object v0, v4

    :goto_30
    sget v2, Landroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver;->a:I

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v2

    array-length v4, v0

    const/4 v9, 0x0

    invoke-virtual {v2, v0, v9, v4}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {v2, v9}, Landroid/os/Parcel;->setDataPosition(I)V

    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    invoke-static {v0}, Lq6/e;->c(Landroid/os/Bundle;)Lo6/f;

    iput v3, v5, Ln20/j;->x:I

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lq6/a;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_64

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Provided class must implement ActionCallback."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_64
    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.glance.appwidget.action.ActionCallback"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lnh3/a;->o(Ljava/lang/Object;)V

    throw v3

    :pswitch_13
    check-cast v10, Lp00/o;

    iget-object v0, v10, Lp00/o;->K:Lkotlin/jvm/functions/Function1;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, Ln20/j;->x:I

    sget-object v3, Lwz/b;->w:Lwz/b;

    if-eqz v2, :cond_66

    const/4 v8, 0x1

    if-ne v2, v8, :cond_65

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    check-cast v1, Ll83/n;

    iget-object v1, v1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_31

    :cond_65
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_66
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v2, Lwz/w1;

    sget-object v4, Lwz/u1;->a:Lwz/u1;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_69

    iget-object v2, v10, Lp00/o;->y:Lxz/x;

    const/4 v8, 0x1

    iput v8, v5, Ln20/j;->x:I

    invoke-virtual {v2, v5}, Lxz/x;->n(Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_67

    move-object v9, v1

    goto :goto_32

    :cond_67
    move-object v1, v2

    :goto_31
    iget-object v2, v10, Lp00/o;->H:Lm7/l0;

    invoke-static {v1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_68

    invoke-virtual {v2, v1}, Lm7/l0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_32

    :cond_68
    new-instance v1, Lwz/o;

    invoke-direct {v1, v4, v3}, Lwz/o;-><init>(Ljava/lang/Throwable;Lwz/e;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_32

    :cond_69
    sget-object v1, Lwz/t1;->a:Lwz/t1;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6a

    iget-object v0, v10, Lp00/o;->J:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_32

    :cond_6a
    instance-of v1, v2, Lwz/v1;

    if-eqz v1, :cond_6b

    new-instance v1, Lwz/o;

    check-cast v2, Lwz/v1;

    iget-object v2, v2, Lwz/v1;->a:Ljava/lang/Exception;

    invoke-direct {v1, v2, v3}, Lwz/o;-><init>(Ljava/lang/Throwable;Lwz/e;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_32
    return-object v9

    :cond_6b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_14
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    const/4 v8, 0x1

    if-eqz v1, :cond_6d

    if-ne v1, v8, :cond_6c

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_33

    :cond_6c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/room/v1;

    check-cast v10, Lkotlin/jvm/functions/Function1;

    iput v8, v5, Ln20/j;->x:I

    invoke-interface {v10, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6e

    goto :goto_33

    :cond_6e
    move-object v0, v1

    :goto_33
    return-object v0

    :pswitch_15
    move v8, v12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    if-eqz v1, :cond_70

    if-ne v1, v8, :cond_6f

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_34

    :cond_6f
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_70
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/room/z0;

    new-instance v2, Lb2/y;

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v10, v3}, Lb2/y;-><init>(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    const/4 v8, 0x1

    iput v8, v5, Ln20/j;->x:I

    const/4 v9, 0x0

    invoke-virtual {v1, v9, v2, v5}, Landroidx/room/z0;->useConnection(ZLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_71

    goto :goto_34

    :cond_71
    move-object v0, v1

    :goto_34
    return-object v0

    :pswitch_16
    move v8, v12

    check-cast v10, Lo23/o;

    iget-object v0, v10, Lo23/o;->c:Lac3/a;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v5, Ln20/j;->x:I

    if-eqz v4, :cond_74

    if-eq v4, v8, :cond_73

    if-ne v4, v7, :cond_72

    iget-object v2, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v2, Ln23/h;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v4, v2

    move-object/from16 v2, p1

    goto :goto_36

    :cond_72
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_73
    iget-object v2, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/i0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto :goto_35

    :cond_74
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v4, Lbc3/c0;

    new-instance v6, Lo23/t;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct {v6, v10, v8, v9}, Lo23/t;-><init>(Lo23/o;Lq83/d;I)V

    invoke-static {v4, v8, v6, v2}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v6

    new-instance v9, Lo23/t;

    const/4 v11, 0x1

    invoke-direct {v9, v10, v8, v11}, Lo23/t;-><init>(Lo23/o;Lq83/d;I)V

    invoke-static {v4, v8, v9, v2}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v2

    iput-object v2, v5, Ln20/j;->y:Ljava/lang/Object;

    iput v11, v5, Ln20/j;->x:I

    invoke-virtual {v6, v5}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_75

    goto :goto_37

    :cond_75
    :goto_35
    check-cast v4, Ln23/h;

    invoke-virtual {v0}, Lac3/a;->a()Z

    move-result v6

    if-eqz v6, :cond_76

    new-instance v3, Ln23/f;

    new-instance v0, Ln23/a;

    invoke-direct {v0, v1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v0}, Ln23/f;-><init>(Ln23/e;)V

    goto :goto_37

    :cond_76
    instance-of v6, v4, Ln23/f;

    if-eqz v6, :cond_77

    check-cast v2, Lbc3/t1;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    check-cast v4, Ln23/f;

    new-instance v3, Ln23/f;

    iget-object v0, v4, Ln23/f;->a:Ln23/e;

    invoke-direct {v3, v0}, Ln23/f;-><init>(Ln23/e;)V

    goto :goto_37

    :cond_77
    iput-object v4, v5, Ln20/j;->y:Ljava/lang/Object;

    iput v7, v5, Ln20/j;->x:I

    invoke-interface {v2, v5}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_78

    goto :goto_37

    :cond_78
    :goto_36
    check-cast v2, Ln23/h;

    invoke-virtual {v0}, Lac3/a;->a()Z

    move-result v0

    if-eqz v0, :cond_79

    new-instance v3, Ln23/f;

    new-instance v0, Ln23/a;

    invoke-direct {v0, v1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v0}, Ln23/f;-><init>(Ln23/e;)V

    goto :goto_37

    :cond_79
    instance-of v0, v2, Ln23/f;

    if-eqz v0, :cond_7a

    check-cast v2, Ln23/f;

    new-instance v3, Ln23/f;

    iget-object v0, v2, Ln23/f;->a:Ln23/e;

    invoke-direct {v3, v0}, Ln23/f;-><init>(Ln23/e;)V

    goto :goto_37

    :cond_7a
    invoke-static {v4, v2}, Lo23/o;->a(Ln23/h;Ln23/h;)Ln23/h;

    move-result-object v3

    :goto_37
    return-object v3

    :pswitch_17
    check-cast v10, Lo23/a;

    iget-object v0, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lo23/k;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, Ln20/j;->x:I

    const/4 v8, 0x1

    if-eqz v2, :cond_7d

    if-eq v2, v8, :cond_7c

    if-ne v2, v7, :cond_7b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3c

    :cond_7b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_38

    :cond_7d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lo23/k;->c:Ls83/i;

    iput v8, v5, Ln20/j;->x:I

    invoke-interface {v2, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7e

    goto :goto_3b

    :cond_7e
    :goto_38
    check-cast v2, Ln23/h;

    instance-of v3, v2, Ln23/g;

    if-eqz v3, :cond_7f

    move-object v6, v2

    check-cast v6, Ln23/g;

    iget-object v6, v6, Ln23/g;->a:Ljava/lang/Object;

    check-cast v6, Ll83/a0;

    iget-object v6, v0, Lo23/k;->b:Lo23/d;

    new-instance v8, Lqg3/d;

    const/16 v11, 0x1a

    invoke-direct {v8, v11, v0, v10}, Lqg3/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v6, v8}, Lo23/d;->enqueue(Lo23/a;)V

    goto :goto_39

    :cond_7f
    instance-of v0, v2, Ln23/f;

    if-eqz v0, :cond_83

    :goto_39
    if-nez v3, :cond_82

    instance-of v0, v2, Ln23/f;

    if-eqz v0, :cond_81

    check-cast v2, Ln23/f;

    iget-object v0, v2, Ln23/f;->a:Ln23/e;

    new-instance v2, Ln23/f;

    invoke-direct {v2, v0}, Ln23/f;-><init>(Ln23/e;)V

    iput v7, v5, Ln20/j;->x:I

    sget-object v0, Lp23/a;->a:Lbc3/w1;

    new-instance v3, Lo23/g;

    const/4 v8, 0x0

    invoke-direct {v3, v10, v2, v8, v4}, Lo23/g;-><init>(Lo23/a;Ln23/h;Lq83/d;I)V

    invoke-static {v0, v3, v5}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_80

    goto :goto_3a

    :cond_80
    move-object v0, v9

    :goto_3a
    if-ne v0, v1, :cond_82

    :goto_3b
    move-object v9, v1

    goto :goto_3c

    :cond_81
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_82
    :goto_3c
    return-object v9

    :cond_83
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_18
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    if-eqz v1, :cond_86

    const/4 v8, 0x1

    if-eq v1, v8, :cond_85

    if-ne v1, v7, :cond_84

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_3e

    :cond_84
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_85
    iget-object v1, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v1, Lo23/q;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_3d

    :cond_86
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, v10

    check-cast v1, Lo23/q;

    iget-object v2, v1, Lo23/q;->a:Lo23/d;

    iput-object v1, v5, Ln20/j;->y:Ljava/lang/Object;

    const/4 v8, 0x1

    iput v8, v5, Ln20/j;->x:I

    invoke-interface {v2, v5}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_87

    goto :goto_3e

    :cond_87
    :goto_3d
    check-cast v2, Ln23/h;

    const/4 v3, 0x0

    iput-object v3, v5, Ln20/j;->y:Ljava/lang/Object;

    iput v7, v5, Ln20/j;->x:I

    invoke-static {v1, v2, v5}, Lo23/q;->a(Lo23/q;Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_88

    goto :goto_3e

    :cond_88
    move-object v0, v1

    :goto_3e
    return-object v0

    :pswitch_19
    iget-object v0, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lo23/k;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, Ln20/j;->x:I

    const/4 v8, 0x1

    if-eqz v2, :cond_8a

    if-ne v2, v8, :cond_89

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3f

    :cond_89
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lo23/k;->c:Ls83/i;

    iput v8, v5, Ln20/j;->x:I

    invoke-interface {v2, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8b

    move-object v9, v1

    goto :goto_40

    :cond_8b
    :goto_3f
    iget-object v1, v0, Lo23/k;->b:Lo23/d;

    check-cast v10, Lo23/a;

    new-instance v2, Lc9/c;

    const/16 v3, 0x19

    invoke-direct {v2, v3, v0, v10}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Lo23/d;->enqueue(Lo23/a;)V

    :goto_40
    return-object v9

    :pswitch_1a
    check-cast v10, Lo23/k;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    if-eqz v1, :cond_8e

    const/4 v8, 0x1

    if-eq v1, v8, :cond_8d

    if-ne v1, v7, :cond_8c

    iget-object v0, v5, Ln20/j;->y:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_42

    :cond_8c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_41

    :cond_8e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v10, Lo23/k;->b:Lo23/d;

    const/4 v8, 0x1

    iput v8, v5, Ln20/j;->x:I

    invoke-interface {v1, v5}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_8f

    goto :goto_42

    :cond_8f
    :goto_41
    move-object v2, v1

    check-cast v2, Ln23/h;

    iget-object v3, v10, Lo23/k;->c:Ls83/i;

    iput-object v1, v5, Ln20/j;->y:Ljava/lang/Object;

    iput v7, v5, Ln20/j;->x:I

    invoke-interface {v3, v2, v5}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_90

    goto :goto_42

    :cond_90
    move-object v0, v1

    :goto_42
    return-object v0

    :pswitch_1b
    iget-object v0, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v0, Lo23/j;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v5, Ln20/j;->x:I

    const/4 v8, 0x1

    if-eqz v3, :cond_93

    if-eq v3, v8, :cond_92

    if-ne v3, v7, :cond_91

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_46

    :cond_91
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_92
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_43

    :cond_93
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v8, v5, Ln20/j;->x:I

    invoke-virtual {v0, v5}, Lo23/j;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_94

    goto :goto_45

    :cond_94
    :goto_43
    move-object v3, v0

    check-cast v3, Ln23/h;

    new-instance v4, Ln23/f;

    new-instance v6, Ln23/a;

    invoke-direct {v6, v1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, v6}, Ln23/f;-><init>(Ln23/e;)V

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_95

    move-object v3, v0

    goto :goto_44

    :cond_95
    const/4 v3, 0x0

    :goto_44
    check-cast v3, Ln23/h;

    if-eqz v3, :cond_96

    check-cast v10, Lo23/a;

    sget-object v0, Lp23/a;->a:Lbc3/w1;

    new-instance v1, Lo23/g;

    const/4 v8, 0x0

    const/4 v11, 0x1

    invoke-direct {v1, v10, v3, v8, v11}, Lo23/g;-><init>(Lo23/a;Ln23/h;Lq83/d;I)V

    iput v7, v5, Ln20/j;->x:I

    invoke-static {v0, v1, v5}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_96

    :goto_45
    move-object v9, v2

    :cond_96
    :goto_46
    return-object v9

    :pswitch_1c
    check-cast v10, Lo23/h;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    if-eqz v1, :cond_98

    const/4 v8, 0x1

    if-ne v1, v8, :cond_97

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_47

    :cond_97
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_98
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    iget-object v2, v10, Lo23/h;->e:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashSet;

    invoke-interface {v1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v3

    sget-object v4, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v3, v4}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v3

    check-cast v3, Lbc3/k1;

    if-eqz v3, :cond_99

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_99
    iget-object v2, v10, Lo23/h;->c:Ll83/e;

    check-cast v2, Ls83/i;

    const/4 v8, 0x1

    iput v8, v5, Ln20/j;->x:I

    invoke-interface {v2, v1, v5}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_9a

    goto :goto_47

    :cond_9a
    move-object v0, v1

    :goto_47
    return-object v0

    :pswitch_1d
    move v8, v12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    if-eqz v1, :cond_9c

    if-eq v1, v8, :cond_9b

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9b
    invoke-static/range {p1 .. p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object v0

    throw v0

    :cond_9c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v1, La00/g;

    iget-object v2, v1, La00/g;->x:Ljava/lang/Object;

    check-cast v2, Lt23/c0;

    iget-object v2, v2, Lt23/c0;->p:Lt23/s0;

    iget-object v2, v2, Lt23/s0;->G:Lec3/h2;

    new-instance v3, Landroidx/room/x;

    check-cast v10, Lj43/b;

    const/16 v4, 0xc

    invoke-direct {v3, v4, v1, v10}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v8, 0x1

    iput v8, v5, Ln20/j;->x:I

    invoke-virtual {v2, v3, v5}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v0

    :pswitch_1e
    move v8, v12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ln20/j;->x:I

    if-eqz v1, :cond_9e

    if-ne v1, v8, :cond_9d

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_48

    :cond_9d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Ln20/j;->y:Ljava/lang/Object;

    check-cast v1, Le10/b0;

    check-cast v10, Ln20/k;

    iget-object v2, v10, Ln20/k;->c:Ldc3/h;

    iput v8, v5, Ln20/j;->x:I

    invoke-interface {v2, v1, v5}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_9f

    move-object v9, v0

    :cond_9f
    :goto_48
    return-object v9

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
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

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
    .end packed-switch
.end method
