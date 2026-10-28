.class public final Lp33/m;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 1
    iput p6, p0, Lp33/m;->w:I

    iput-object p1, p0, Lp33/m;->y:Ljava/lang/Object;

    iput-object p2, p0, Lp33/m;->z:Ljava/lang/Object;

    iput-object p3, p0, Lp33/m;->E:Ljava/lang/Object;

    iput-object p4, p0, Lp33/m;->F:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p5, p0, Lp33/m;->w:I

    iput-object p1, p0, Lp33/m;->z:Ljava/lang/Object;

    iput-object p2, p0, Lp33/m;->E:Ljava/lang/Object;

    iput-object p3, p0, Lp33/m;->F:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 3
    iput p4, p0, Lp33/m;->w:I

    iput-object p1, p0, Lp33/m;->E:Ljava/lang/Object;

    iput-object p2, p0, Lp33/m;->F:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/g0;Lp33/o;Lq83/d;Lp33/o;Lstream/video/sfu/signal/UpdateSubscriptionsRequest;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lp33/m;->w:I

    .line 4
    iput-object p1, p0, Lp33/m;->y:Ljava/lang/Object;

    iput-object p2, p0, Lp33/m;->z:Ljava/lang/Object;

    iput-object p4, p0, Lp33/m;->E:Ljava/lang/Object;

    iput-object p5, p0, Lp33/m;->F:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9

    iget v0, p0, Lp33/m;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Lp33/m;

    iget-object p1, p0, Lp33/m;->y:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Landroid/view/View;

    iget-object p1, p0, Lp33/m;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lfk/a;

    iget-object p1, p0, Lp33/m;->E:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ll83/k;

    iget-object p1, p0, Lp33/m;->F:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/util/List;

    const/16 v7, 0xf

    move-object v6, p2

    invoke-direct/range {v1 .. v7}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v1

    :pswitch_0
    move-object v6, p2

    new-instance v2, Lp33/m;

    iget-object p1, p0, Lp33/m;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lx6/v;

    iget-object p1, p0, Lp33/m;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lux/f0;

    iget-object p1, p0, Lp33/m;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lbc3/c0;

    iget-object p1, p0, Lp33/m;->F:Ljava/lang/Object;

    check-cast p1, Lc93/m;

    const/16 v8, 0xe

    move-object v7, v6

    move-object v6, p1

    invoke-direct/range {v2 .. v8}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_1
    move-object v6, p2

    new-instance v2, Lp33/m;

    iget-object p1, p0, Lp33/m;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lp6/l;

    iget-object p1, p0, Lp33/m;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Landroid/content/Context;

    iget-object p1, p0, Lp33/m;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/lang/Throwable;

    iget-object p1, p0, Lp33/m;->F:Ljava/lang/Object;

    check-cast p1, Lx6/u;

    const/16 v8, 0xd

    move-object v7, v6

    move-object v6, p1

    invoke-direct/range {v2 .. v8}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_2
    move-object v6, p2

    new-instance v2, Lp33/m;

    iget-object p2, p0, Lp33/m;->z:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Landroid/content/Context;

    iget-object p2, p0, Lp33/m;->E:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, La00/f;

    iget-object p2, p0, Lp33/m;->F:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Lx6/p;

    const/16 v7, 0xc

    invoke-direct/range {v2 .. v7}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v2, Lp33/m;->y:Ljava/lang/Object;

    return-object v2

    :pswitch_3
    move-object v6, p2

    new-instance v2, Lp33/m;

    iget-object p2, p0, Lp33/m;->z:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Lp1/c1;

    iget-object p2, p0, Lp33/m;->E:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Ll3/g;

    iget-object p2, p0, Lp33/m;->F:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Lb3/b3;

    const/16 v7, 0xb

    invoke-direct/range {v2 .. v7}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v2, Lp33/m;->y:Ljava/lang/Object;

    return-object v2

    :pswitch_4
    move-object v6, p2

    new-instance v2, Lp33/m;

    iget-object p1, p0, Lp33/m;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lx30/p0;

    iget-object p1, p0, Lp33/m;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, La40/e;

    iget-object p1, p0, Lp33/m;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, La40/c;

    iget-object p1, p0, Lp33/m;->F:Ljava/lang/Object;

    check-cast p1, Lp1/c1;

    const/16 v8, 0xa

    move-object v7, v6

    move-object v6, p1

    invoke-direct/range {v2 .. v8}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_5
    move-object v6, p2

    new-instance v2, Lp33/m;

    iget-object p1, p0, Lp33/m;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;

    iget-object p1, p0, Lp33/m;->E:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lh40/k;

    iget-object p1, p0, Lp33/m;->F:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lp1/c1;

    const/16 v7, 0x9

    invoke-direct/range {v2 .. v7}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_6
    move-object v6, p2

    new-instance v2, Lp33/m;

    iget-object p1, p0, Lp33/m;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Luz/o;

    iget-object p1, p0, Lp33/m;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Landroidx/fragment/app/r0;

    iget-object p1, p0, Lp33/m;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    iget-object p1, p0, Lp33/m;->F:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    const/16 v8, 0x8

    move-object v7, v6

    move-object v6, p1

    invoke-direct/range {v2 .. v8}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_7
    move-object v6, p2

    new-instance p1, Lp33/m;

    iget-object p2, p0, Lp33/m;->E:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lp33/m;->F:Ljava/lang/Object;

    check-cast v0, Lq30/w0;

    const/4 v1, 0x7

    invoke-direct {p1, p2, v0, v6, v1}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_8
    move-object v6, p2

    new-instance p1, Lp33/m;

    iget-object p2, p0, Lp33/m;->E:Ljava/lang/Object;

    check-cast p2, Lt23/i0;

    iget-object v0, p0, Lp33/m;->F:Ljava/lang/Object;

    check-cast v0, Lt23/c0;

    const/4 v1, 0x6

    invoke-direct {p1, p2, v0, v6, v1}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_9
    move-object v6, p2

    new-instance v2, Lp33/m;

    iget-object p1, p0, Lp33/m;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lic/v;

    iget-object p1, p0, Lp33/m;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lqc/q;

    iget-object p1, p0, Lp33/m;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lrc/m;

    iget-object p1, p0, Lp33/m;->F:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    const/4 v8, 0x5

    move-object v7, v6

    move-object v6, p1

    invoke-direct/range {v2 .. v8}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_a
    move-object v6, p2

    new-instance v2, Lp33/m;

    iget-object p1, p0, Lp33/m;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Landroid/content/Context;

    iget-object p1, p0, Lp33/m;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    iget-object p1, p0, Lp33/m;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lp6/b;

    iget-object p1, p0, Lp33/m;->F:Ljava/lang/Object;

    check-cast p1, Lo6/f;

    const/4 v8, 0x4

    move-object v7, v6

    move-object v6, p1

    invoke-direct/range {v2 .. v8}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_b
    move-object v6, p2

    new-instance v2, Lp33/m;

    iget-object p1, p0, Lp33/m;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    iget-object p1, p0, Lp33/m;->E:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lmj/p;

    iget-object p1, p0, Lp33/m;->F:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lp1/c1;

    const/4 v7, 0x3

    invoke-direct/range {v2 .. v7}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_c
    move-object v6, p2

    new-instance v2, Lp33/m;

    iget-object p2, p0, Lp33/m;->z:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Lp6/g0;

    iget-object p2, p0, Lp33/m;->E:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Landroid/content/Context;

    iget-object p2, p0, Lp33/m;->F:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Ln6/l;

    const/4 v7, 0x2

    invoke-direct/range {v2 .. v7}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v2, Lp33/m;->y:Ljava/lang/Object;

    return-object v2

    :pswitch_d
    move-object v6, p2

    new-instance v2, Lp33/m;

    iget-object p2, p0, Lp33/m;->z:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Lp6/l;

    iget-object p2, p0, Lp33/m;->E:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Landroid/content/Context;

    iget-object p2, p0, Lp33/m;->F:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Lp1/c1;

    const/4 v7, 0x1

    invoke-direct/range {v2 .. v7}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v2, Lp33/m;->y:Ljava/lang/Object;

    return-object v2

    :pswitch_e
    move-object v6, p2

    new-instance v2, Lp33/m;

    iget-object p1, p0, Lp33/m;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/internal/g0;

    iget-object p1, p0, Lp33/m;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lp33/o;

    iget-object p1, p0, Lp33/m;->E:Ljava/lang/Object;

    check-cast p1, Lp33/o;

    iget-object p2, p0, Lp33/m;->F:Ljava/lang/Object;

    move-object v7, p2

    check-cast v7, Lstream/video/sfu/signal/UpdateSubscriptionsRequest;

    move-object v5, v6

    move-object v6, p1

    invoke-direct/range {v2 .. v7}, Lp33/m;-><init>(Lkotlin/jvm/internal/g0;Lp33/o;Lq83/d;Lp33/o;Lstream/video/sfu/signal/UpdateSubscriptionsRequest;)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

    iget v0, p0, Lp33/m;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp33/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp33/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp33/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp33/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp33/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp33/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp33/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp33/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp33/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp33/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp33/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp33/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lu2/v;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp33/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp33/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp33/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp33/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp33/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp33/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp33/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp33/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp33/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp33/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp33/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp33/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp33/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp33/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp33/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp33/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp33/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp33/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp33/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp33/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp33/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp33/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp33/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp33/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp33/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp33/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp33/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp33/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp33/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp33/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lp1/r1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp33/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp33/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp33/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lw43/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp33/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp33/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp33/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
    .locals 43

    move-object/from16 v4, p0

    iget v0, v4, Lp33/m;->w:I

    const/4 v1, -0x1

    const/4 v7, 0x3

    const/4 v8, 0x6

    const/4 v9, 0x2

    const/4 v11, 0x1

    packed-switch v0, :pswitch_data_0

    iget-object v0, v4, Lp33/m;->E:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Ll83/k;

    iget-object v0, v4, Lp33/m;->z:Ljava/lang/Object;

    check-cast v0, Lfk/a;

    iget-object v1, v4, Lp33/m;->y:Ljava/lang/Object;

    move-object v13, v1

    check-cast v13, Landroid/view/View;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v4, Lp33/m;->x:I

    if-eqz v2, :cond_1

    if-ne v2, v11, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v13}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    if-nez v2, :cond_3

    :cond_2
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-nez v2, :cond_3

    const-string v1, "Unable to get main looper"

    invoke-interface {v0, v1}, Lfk/a;->error(Ljava/lang/String;)V

    const/4 v10, 0x0

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v1, v4, Lp33/m;->F:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v13, v14, v1, v0}, Lxj/a;->a(Landroid/view/View;Ll83/k;Ljava/util/List;Lfk/a;)Lxj/b;

    move-result-object v10

    goto :goto_1

    :cond_4
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    new-instance v12, Ld0;

    iget-object v2, v4, Lp33/m;->F:Ljava/lang/Object;

    move-object v15, v2

    check-cast v15, Ljava/util/List;

    iget-object v2, v4, Lp33/m;->z:Ljava/lang/Object;

    move-object/from16 v16, v2

    check-cast v16, Lfk/a;

    const/16 v17, 0x0

    const/16 v18, 0xa

    invoke-direct/range {v12 .. v18}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v11, v4, Lp33/m;->x:I

    invoke-static {v0, v12, v4}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    move-object v10, v1

    goto :goto_1

    :cond_5
    :goto_0
    move-object v10, v0

    check-cast v10, Lxj/b;

    :goto_1
    return-object v10

    :pswitch_0
    iget-object v0, v4, Lp33/m;->y:Ljava/lang/Object;

    check-cast v0, Lx6/v;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v4, Lp33/m;->x:I

    if-eqz v2, :cond_7

    if-ne v2, v11, :cond_6

    goto :goto_2

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_8
    iget-object v2, v0, Lx6/v;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    iget-object v5, v4, Lp33/m;->z:Ljava/lang/Object;

    check-cast v5, Lux/f0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    cmp-long v2, v2, v5

    if-lez v2, :cond_9

    invoke-virtual {v0}, Lx6/v;->a()J

    move-result-wide v2

    iput v11, v4, Lp33/m;->x:I

    invoke-static {v2, v3, v4}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    goto :goto_3

    :cond_9
    iget-object v0, v4, Lp33/m;->E:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    new-instance v1, Landroidx/glance/session/TimeoutCancellationException;

    const-string v2, "Timed out of executing block."

    iget-object v3, v4, Lp33/m;->F:Ljava/lang/Object;

    check-cast v3, Lc93/m;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroidx/glance/session/TimeoutCancellationException;-><init>(Ljava/lang/String;I)V

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v1

    :pswitch_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    iget-object v1, v4, Lp33/m;->E:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v4, Lp33/m;->x:I

    if-eqz v3, :cond_b

    if-ne v3, v11, :cond_a

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v4, Lp33/m;->y:Ljava/lang/Object;

    check-cast v3, Lp6/l;

    iget-object v5, v4, Lp33/m;->z:Ljava/lang/Object;

    check-cast v5, Landroid/content/Context;

    iput v11, v4, Lp33/m;->x:I

    iget-object v6, v3, Lp6/l;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v6, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const-string v6, "GlanceAppWidget"

    const-string v7, "Error in Glance App Widget"

    invoke-static {v6, v7, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-boolean v6, v3, Lp6/l;->i:Z

    if-eqz v6, :cond_d

    iget-object v6, v3, Lp6/l;->e:Lp6/g0;

    iget-object v3, v3, Lp6/l;->f:Lp6/b;

    iget v7, v3, Lp6/b;->a:I

    invoke-virtual {v6, v5, v3, v7, v1}, Lp6/g0;->i(Landroid/content/Context;Ln6/l;ILjava/lang/Throwable;)V

    if-ne v0, v2, :cond_c

    move-object v0, v2

    goto :goto_5

    :cond_c
    :goto_4
    iget-object v2, v4, Lp33/m;->F:Ljava/lang/Object;

    check-cast v2, Lx6/u;

    const-string v3, "Error in composition effect coroutine"

    invoke-static {v3, v1}, Ldc/a;->d(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v1

    invoke-static {v2, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    :goto_5
    return-object v0

    :cond_d
    throw v1

    :pswitch_2
    iget-object v0, v4, Lp33/m;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v4, Lp33/m;->x:I

    if-eqz v2, :cond_f

    if-ne v2, v11, :cond_e

    iget-object v0, v4, Lp33/m;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lx6/b;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, v2

    move-object/from16 v2, p1

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_8

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v4, Lp33/m;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    new-instance v3, Lx6/b;

    iget-object v5, v4, Lp33/m;->F:Ljava/lang/Object;

    check-cast v5, Lx6/p;

    new-instance v6, Lwr0/r;

    const/16 v7, 0x8

    invoke-direct {v6, v7, v2, v5}, Lwr0/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v3, v6}, Lx6/b;-><init>(Lwr0/r;)V

    sget-object v2, Lx6/b;->c:Landroid/content/IntentFilter;

    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :try_start_1
    invoke-virtual {v3, v1}, Lx6/b;->a(Landroid/content/Context;)V

    iget-object v2, v4, Lp33/m;->E:Ljava/lang/Object;

    check-cast v2, La00/f;

    iput-object v3, v4, Lp33/m;->y:Ljava/lang/Object;

    iput v11, v4, Lp33/m;->x:I

    invoke-virtual {v2, v4}, La00/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v2, v0, :cond_10

    goto :goto_7

    :cond_10
    :goto_6
    invoke-virtual {v1, v3}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    move-object v0, v2

    :goto_7
    return-object v0

    :catchall_1
    move-exception v0

    move-object v2, v3

    :goto_8
    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    throw v0

    :pswitch_3
    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v0, v4, Lp33/m;->x:I

    if-eqz v0, :cond_12

    if-ne v0, v11, :cond_11

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_9

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v4, Lp33/m;->y:Ljava/lang/Object;

    check-cast v0, Lu2/v;

    iget-object v1, v4, Lp33/m;->z:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, v4, Lp33/m;->E:Ljava/lang/Object;

    check-cast v2, Ll3/g;

    iget-object v3, v4, Lp33/m;->F:Ljava/lang/Object;

    check-cast v3, Lb3/b3;

    new-instance v5, Lwc/e1;

    invoke-direct {v5, v1, v2, v3, v8}, Lwc/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput v11, v4, Lp33/m;->x:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x7

    move-object/from16 v42, v5

    move-object v5, v4

    move-object/from16 v4, v42

    invoke-static/range {v0 .. v6}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v5

    if-ne v0, v7, :cond_13

    goto :goto_a

    :cond_13
    :goto_9
    sget-object v7, Ll83/a0;->a:Ll83/a0;

    :goto_a
    return-object v7

    :pswitch_4
    iget-object v0, v4, Lp33/m;->y:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Lx30/p0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lp33/m;->x:I

    if-eqz v1, :cond_15

    if-ne v1, v11, :cond_14

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_b

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v14, Lx30/p0;->w:Lec3/r1;

    invoke-static {v1, v11}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object v1

    new-instance v12, Ll1/v;

    iget-object v2, v4, Lp33/m;->z:Ljava/lang/Object;

    move-object v13, v2

    check-cast v13, La40/e;

    iget-object v2, v4, Lp33/m;->E:Ljava/lang/Object;

    move-object v15, v2

    check-cast v15, La40/c;

    iget-object v2, v4, Lp33/m;->F:Ljava/lang/Object;

    move-object/from16 v16, v2

    check-cast v16, Lp1/c1;

    const/16 v17, 0x0

    const/16 v18, 0x2

    invoke-direct/range {v12 .. v18}, Ll1/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v11, v4, Lp33/m;->x:I

    invoke-static {v1, v12, v4}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_16

    goto :goto_c

    :cond_16
    :goto_b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_c
    return-object v0

    :pswitch_5
    iget-object v0, v4, Lp33/m;->z:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v4, Lp33/m;->x:I

    if-eqz v3, :cond_18

    if-ne v3, v11, :cond_17

    iget-object v2, v4, Lp33/m;->y:Ljava/lang/Object;

    check-cast v2, Lv10/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_f

    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v4, Lp33/m;->F:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx20/p;

    iget-object v3, v3, Lx20/p;->c:Lx20/o;

    sget v5, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->z:I

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->o()Lx20/k;

    move-result-object v5

    const-string v6, "<this>"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "args"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-eqz v3, :cond_1a

    if-eq v3, v11, :cond_1b

    if-eq v3, v9, :cond_1a

    if-ne v3, v7, :cond_19

    new-instance v12, Lv10/b;

    iget-object v13, v5, Lx20/k;->w:Ljava/lang/String;

    iget-object v3, v5, Lx20/k;->F:Ljava/lang/String;

    const/16 v19, 0x34

    const/4 v14, 0x3

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v3

    invoke-direct/range {v12 .. v19}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ljava/lang/String;I)V

    :goto_d
    move-object v10, v12

    goto :goto_e

    :cond_19
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1a
    const/4 v10, 0x0

    goto :goto_e

    :cond_1b
    new-instance v12, Lv10/b;

    iget-object v13, v5, Lx20/k;->w:Ljava/lang/String;

    iget-object v3, v5, Lx20/k;->F:Ljava/lang/String;

    const/16 v19, 0x3c

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v3

    invoke-direct/range {v12 .. v19}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ljava/lang/String;I)V

    goto :goto_d

    :goto_e
    if-eqz v10, :cond_1d

    iget-object v3, v4, Lp33/m;->E:Ljava/lang/Object;

    check-cast v3, Lh40/k;

    iput-object v10, v4, Lp33/m;->y:Ljava/lang/Object;

    iput v11, v4, Lp33/m;->x:I

    invoke-virtual {v3, v4}, Lh40/k;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1c

    goto :goto_10

    :cond_1c
    move-object v2, v10

    :goto_f
    sget v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->z:I

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v2}, Lv10/b;->b()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->finish()V

    :cond_1d
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_10
    return-object v2

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lp33/m;->x:I

    if-eqz v1, :cond_1f

    if-ne v1, v11, :cond_1e

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_11

    :cond_1e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, Lp33/m;->y:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Luz/o;

    iget-object v1, v4, Lp33/m;->z:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Landroidx/fragment/app/r0;

    iget-object v1, v4, Lp33/m;->E:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Ljava/lang/String;

    iget-object v1, v4, Lp33/m;->F:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Ljava/lang/String;

    iput v11, v4, Lp33/m;->x:I

    iget-object v6, v7, Luz/o;->b:Lec3/h2;

    new-instance v5, Luz/m;

    invoke-direct/range {v5 .. v10}, Luz/m;-><init>(Lec3/h2;Luz/o;Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v5, v4}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_20

    goto :goto_11

    :cond_20
    move-object v0, v1

    :goto_11
    return-object v0

    :pswitch_7
    const-string v0, "key"

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v4, Lp33/m;->x:I

    if-eqz v2, :cond_22

    if-ne v2, v11, :cond_21

    iget-object v1, v4, Lp33/m;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, v4, Lp33/m;->y:Ljava/lang/Object;

    check-cast v2, Lq30/w0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v5, p1

    goto :goto_12

    :cond_21
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v4, Lp33/m;->E:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_25

    iget-object v3, v4, Lp33/m;->F:Ljava/lang/Object;

    check-cast v3, Lq30/w0;

    iget-object v5, v3, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v5, Ls30/c;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Ls30/c;->b:Lm40/d;

    invoke-virtual {v5, v2}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Landroid/graphics/Bitmap;

    if-nez v10, :cond_26

    iput-object v3, v4, Lp33/m;->y:Ljava/lang/Object;

    iput-object v2, v4, Lp33/m;->z:Ljava/lang/Object;

    iput v11, v4, Lp33/m;->x:I

    iget-object v5, v3, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v5, Lso/q;

    invoke-virtual {v5, v2, v4}, Lso/q;->c(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_23

    move-object v10, v1

    goto :goto_13

    :cond_23
    move-object v1, v2

    move-object v2, v3

    :goto_12
    move-object v10, v5

    check-cast v10, Landroid/graphics/Bitmap;

    if-eqz v10, :cond_24

    iget-object v2, v2, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v2, Ls30/c;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ls30/c;->b:Lm40/d;

    invoke-virtual {v0, v1, v10}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_13

    :cond_24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_13

    :cond_25
    const/4 v10, 0x0

    :cond_26
    :goto_13
    return-object v10

    :pswitch_8
    sget-object v12, Lr83/a;->w:Lr83/a;

    iget v0, v4, Lp33/m;->x:I

    if-eqz v0, :cond_2a

    if-eq v0, v11, :cond_29

    if-eq v0, v9, :cond_28

    if-ne v0, v7, :cond_27

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const/16 v36, 0x0

    goto/16 :goto_22

    :catch_0
    move-exception v0

    const/16 v36, 0x0

    goto/16 :goto_21

    :cond_27
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_28
    iget-object v0, v4, Lp33/m;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    :try_start_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    const/16 v36, 0x0

    goto/16 :goto_20

    :catch_1
    move-exception v0

    const/16 v36, 0x0

    goto/16 :goto_1f

    :cond_29
    iget-object v0, v4, Lp33/m;->z:Ljava/lang/Object;

    check-cast v0, Lt23/c0;

    iget-object v1, v4, Lp33/m;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    :try_start_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    move-object v6, v1

    const/16 v36, 0x0

    move-object/from16 v1, p1

    goto/16 :goto_1e

    :cond_2a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v4, Lp33/m;->E:Ljava/lang/Object;

    check-cast v0, Lt23/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iget-object v2, v4, Lp33/m;->E:Ljava/lang/Object;

    check-cast v2, Lt23/i0;

    invoke-interface {v2}, Lt23/i0;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "[reason="

    const-string v5, ", message="

    const-string v13, "]"

    invoke-static {v3, v0, v5, v2, v13}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, v4, Lp33/m;->F:Ljava/lang/Object;

    check-cast v0, Lt23/c0;

    iget-object v3, v0, Lt23/c0;->K:Lv23/a;

    iget-object v0, v0, Lt23/c0;->C:Lec3/h2;

    iget-object v5, v4, Lp33/m;->E:Ljava/lang/Object;

    check-cast v5, Lt23/i0;

    iget-object v13, v3, Lv23/a;->d:Lw23/p;

    const-string v14, "session"

    invoke-static {v0, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v14, v3, Lv23/a;->b:Lb30/m;

    iget-object v14, v14, Lb30/m;->E:Ljava/lang/Object;

    check-cast v14, Lso/q;

    iget-object v14, v14, Lso/q;->x:Ljava/lang/Object;

    check-cast v14, Lec3/r1;

    iget-object v14, v14, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v14}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lw23/h;

    iget-object v14, v14, Lw23/h;->d:Lx23/f;

    sget-object v15, Lx23/f;->x:Lx23/f;

    if-eq v14, v15, :cond_2c

    iget-object v14, v3, Lv23/a;->c:Lb30/m;

    iget-object v14, v14, Lb30/m;->F:Ljava/lang/Object;

    check-cast v14, La30/w0;

    iget-object v14, v14, La30/w0;->E:Ljava/lang/Object;

    check-cast v14, Lec3/r1;

    iget-object v14, v14, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v14}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v14

    if-eq v14, v15, :cond_2c

    iget-object v14, v13, Lw23/p;->g:Lw23/r;

    iget-object v14, v14, Lw23/r;->b:Lec3/r1;

    iget-object v14, v14, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v14}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lw23/q;

    iget-object v14, v14, Lw23/q;->d:Lx23/f;

    if-eq v14, v15, :cond_2c

    iget-object v13, v13, Lw23/p;->g:Lw23/r;

    iget-object v13, v13, Lw23/r;->b:Lec3/r1;

    iget-object v13, v13, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v13}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lw23/q;

    iget-object v13, v13, Lw23/q;->e:Lx23/f;

    if-ne v13, v15, :cond_2b

    goto :goto_14

    :cond_2b
    const/16 v36, 0x0

    goto/16 :goto_1c

    :cond_2c
    :goto_14
    instance-of v13, v5, Lt23/d0;

    if-eqz v13, :cond_2e

    check-cast v5, Lt23/d0;

    iget-object v13, v5, Lt23/d0;->a:Lt23/g;

    sget-object v14, Lt23/g;->x:Lt23/g;

    if-ne v13, v14, :cond_2d

    new-instance v13, Ll83/k;

    sget-object v14, Lb33/a;->y:Lb33/a;

    iget-object v5, v5, Lt23/d0;->b:Ljava/lang/String;

    invoke-direct {v13, v14, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_15

    :cond_2d
    new-instance v13, Ll83/k;

    sget-object v14, Lb33/a;->x:Lb33/a;

    iget-object v5, v5, Lt23/d0;->b:Ljava/lang/String;

    invoke-direct {v13, v14, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_15

    :cond_2e
    instance-of v13, v5, Lt23/h0;

    if-eqz v13, :cond_2f

    new-instance v13, Ll83/k;

    sget-object v14, Lb33/a;->w:Lb33/a;

    check-cast v5, Lt23/h0;

    iget-object v5, v5, Lt23/h0;->b:Ljava/lang/String;

    invoke-direct {v13, v14, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_15

    :cond_2f
    instance-of v13, v5, Lt23/f0;

    if-eqz v13, :cond_30

    new-instance v13, Ll83/k;

    sget-object v14, Lb33/a;->z:Lb33/a;

    check-cast v5, Lt23/f0;

    iget-object v5, v5, Lt23/f0;->b:Ljava/lang/String;

    invoke-direct {v13, v14, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_15

    :cond_30
    instance-of v13, v5, Lt23/g0;

    if-eqz v13, :cond_31

    new-instance v13, Ll83/k;

    sget-object v14, Lb33/a;->E:Lb33/a;

    check-cast v5, Lt23/g0;

    iget-object v5, v5, Lt23/g0;->b:Ljava/lang/String;

    invoke-direct {v13, v14, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_15

    :cond_31
    instance-of v13, v5, Lt23/e0;

    if-eqz v13, :cond_4e

    new-instance v13, Ll83/k;

    sget-object v14, Lb33/a;->F:Lb33/a;

    check-cast v5, Lt23/e0;

    iget-object v5, v5, Lt23/e0;->a:Ljava/lang/String;

    invoke-direct {v13, v14, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_15
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ld33/h1;

    if-eqz v5, :cond_32

    iget-object v5, v5, Ld33/h1;->A:Lec3/h2;

    if-eqz v5, :cond_32

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le33/n;

    if-eqz v5, :cond_32

    iget-object v5, v5, Le33/u;->s:Lec3/h2;

    if-eqz v5, :cond_32

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/webrtc/PeerConnection$IceConnectionState;

    if-eqz v5, :cond_32

    invoke-static {v5}, Lw23/v;->a(Lorg/webrtc/PeerConnection$IceConnectionState;)Lw23/t;

    move-result-object v5

    goto :goto_16

    :cond_32
    sget-object v5, Lw23/t;->z:Lw23/t;

    :goto_16
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld33/h1;

    if-eqz v0, :cond_33

    iget-object v0, v0, Ld33/h1;->z:Lec3/h2;

    if-eqz v0, :cond_33

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le33/v0;

    if-eqz v0, :cond_33

    iget-object v0, v0, Le33/u;->s:Lec3/h2;

    if-eqz v0, :cond_33

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/webrtc/PeerConnection$IceConnectionState;

    if-eqz v0, :cond_33

    invoke-static {v0}, Lw23/v;->a(Lorg/webrtc/PeerConnection$IceConnectionState;)Lw23/t;

    move-result-object v0

    goto :goto_17

    :cond_33
    sget-object v0, Lw23/t;->z:Lw23/t;

    :goto_17
    iget-object v3, v3, Lv23/a;->a:Lz23/c;

    iget-object v14, v13, Ll83/k;->w:Ljava/lang/Object;

    check-cast v14, Lb33/a;

    invoke-virtual {v14}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    iget-object v13, v13, Ll83/k;->x:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v15, "failCode"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "failMessage"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, v3, Lz23/c;->d:Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v36, 0x0

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v6

    const-string v8, "<get-entries>(...)"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_18
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_35

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v7, v16

    check-cast v7, Ljava/lang/String;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lb33/h;

    instance-of v10, v8, Lb33/j;

    if-eqz v10, :cond_34

    invoke-virtual {v1, v7, v8}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_34

    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_34
    const/4 v7, 0x3

    goto :goto_18

    :cond_35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    new-instance v1, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v15, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v1, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_19
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_39

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lb33/j;

    iget-object v15, v10, Lb33/j;->j:Lb33/i;

    if-nez v15, :cond_36

    const/4 v15, -0x1

    goto :goto_1a

    :cond_36
    sget-object v16, Lz23/b;->b:[I

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aget v15, v16, v15

    :goto_1a
    if-eq v15, v11, :cond_38

    if-eq v15, v9, :cond_37

    const/16 v32, 0x0

    goto :goto_1b

    :cond_37
    move-object/from16 v32, v0

    goto :goto_1b

    :cond_38
    move-object/from16 v32, v5

    :goto_1b
    iget-object v15, v3, Lz23/c;->c:Lz23/a;

    iget-object v9, v10, Lb33/j;->a:Ljava/lang/String;

    iget-object v11, v10, Lb33/j;->b:Ljava/lang/String;

    move-object/from16 p1, v0

    iget-object v0, v10, Lb33/j;->d:Lb33/d;

    sget-object v19, Lb33/g;->y:Lb33/g;

    move-object/from16 v18, v0

    iget-object v0, v10, Lb33/j;->c:Ljava/lang/String;

    move-object/from16 v39, v5

    move-wide/from16 v40, v6

    iget-wide v5, v10, Lb33/j;->e:J

    sub-long v6, v40, v5

    sget-object v24, Lb33/c;->y:Lb33/c;

    iget-object v5, v10, Lb33/j;->h:Ljava/lang/String;

    move-object/from16 v20, v0

    iget-object v0, v10, Lb33/j;->i:Ljava/lang/String;

    move-object/from16 v28, v0

    iget-object v0, v10, Lb33/j;->j:Lb33/i;

    move-object/from16 v30, v0

    iget-boolean v0, v10, Lb33/j;->k:Z

    move/from16 v16, v0

    iget-object v0, v10, Lb33/j;->f:Ljava/lang/String;

    iget-object v10, v10, Lb33/j;->g:Ls93/k;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v23

    invoke-static/range {v36 .. v36}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v25

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v31

    const/16 v34, 0x0

    const/high16 v35, 0x7a0000

    const/16 v33, 0x0

    move-object/from16 v22, v0

    move-object/from16 v29, v5

    move-object/from16 v16, v9

    move-object/from16 v21, v10

    move-object/from16 v17, v11

    move-object/from16 v26, v13

    move-object/from16 v27, v14

    invoke-static/range {v15 .. v35}, Lz23/a;->a(Lz23/a;Ljava/lang/String;Ljava/lang/String;Lb33/f;Lb33/g;Ljava/lang/String;Ls93/k;Ljava/lang/String;Ljava/lang/Long;Lb33/c;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb33/i;Ljava/lang/Boolean;Lw23/t;Ljava/lang/Boolean;Ljava/lang/Boolean;I)Lio/getstream/android/video/generated/models/ClientEvent;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p1

    move-object/from16 v5, v39

    move-wide/from16 v6, v40

    const/4 v9, 0x2

    const/4 v11, 0x1

    goto/16 :goto_19

    :cond_39
    iget-object v0, v3, Lz23/c;->a:La33/d;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3a

    goto :goto_1c

    :cond_3a
    iget-object v3, v0, La33/d;->y:Ljava/lang/Object;

    check-cast v3, Lhc3/d;

    new-instance v5, Le;

    const/4 v6, 0x5

    const/4 v7, 0x0

    invoke-direct {v5, v0, v1, v7, v6}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {v3, v7, v7, v5, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_1c
    iget-object v0, v4, Lp33/m;->F:Ljava/lang/Object;

    check-cast v0, Lt23/c0;

    :try_start_5
    iget-object v1, v0, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld33/h1;

    if-eqz v1, :cond_3b

    iget-object v1, v1, Ld33/h1;->n:Ll53/m;

    if-eqz v1, :cond_3b

    const-string v3, "leave-call"

    invoke-virtual {v1, v2, v3}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1d

    :catch_2
    move-exception v0

    move-object v1, v2

    goto :goto_1f

    :cond_3b
    :goto_1d
    iput-object v2, v4, Lp33/m;->y:Ljava/lang/Object;

    iput-object v0, v4, Lp33/m;->z:Ljava/lang/Object;

    const/4 v1, 0x1

    iput v1, v4, Lp33/m;->x:I

    invoke-virtual {v0, v4}, Lt23/c0;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    if-ne v1, v12, :cond_3c

    goto/16 :goto_27

    :cond_3c
    move-object v6, v2

    :goto_1e
    :try_start_6
    check-cast v1, Lt23/u0;

    iget-object v0, v0, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld33/h1;

    if-eqz v0, :cond_3f

    iput-object v6, v4, Lp33/m;->y:Ljava/lang/Object;

    const/4 v7, 0x0

    iput-object v7, v4, Lp33/m;->z:Ljava/lang/Object;

    const/4 v2, 0x2

    iput v2, v4, Lp33/m;->x:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x6

    invoke-static/range {v0 .. v5}, Ld33/h1;->B(Ld33/h1;Lt23/u0;Ljava/lang/Float;Ll83/k;Ls83/c;I)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    if-ne v0, v12, :cond_3d

    goto/16 :goto_27

    :cond_3d
    move-object v1, v6

    goto :goto_20

    :catch_3
    move-exception v0

    move-object v1, v6

    :goto_1f
    const-string v2, "SafeCall"

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v5, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3e

    sget-object v3, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    const-string v7, "Exception occurred: "

    invoke-static {v7, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v5, v2, v6, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3e
    :goto_20
    move-object v6, v1

    :cond_3f
    iget-object v0, v4, Lp33/m;->F:Ljava/lang/Object;

    check-cast v0, Lt23/c0;

    :try_start_7
    iget-object v0, v0, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld33/h1;

    if-eqz v0, :cond_40

    const/4 v7, 0x0

    iput-object v7, v4, Lp33/m;->y:Ljava/lang/Object;

    iput-object v7, v4, Lp33/m;->z:Ljava/lang/Object;

    const/4 v1, 0x3

    iput v1, v4, Lp33/m;->x:I

    invoke-virtual {v0, v6}, Ld33/h1;->D(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    if-ne v0, v12, :cond_40

    goto/16 :goto_27

    :catch_4
    move-exception v0

    :goto_21
    const-string v1, "SafeCall"

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-interface {v2, v3, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_40

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    const-string v6, "Exception occurred: "

    invoke-static {v6, v5}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v3, v1, v5, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_40
    :goto_22
    iget-object v0, v4, Lp33/m;->F:Ljava/lang/Object;

    check-cast v0, Lt23/c0;

    iget-object v1, v0, Lt23/c0;->p:Lt23/s0;

    iget-object v2, v1, Lt23/s0;->H:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->clear()V

    iget-object v2, v1, Lt23/s0;->z0:Lt23/f;

    invoke-virtual {v2}, Lt23/f;->c()V

    invoke-virtual {v1}, Lt23/s0;->a()V

    iget-object v1, v0, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld33/h1;

    if-eqz v1, :cond_41

    iget-object v2, v1, Ld33/h1;->L:Lc6/a;

    new-instance v3, Ld33/r;

    const/4 v5, 0x1

    invoke-direct {v3, v1, v5}, Ld33/r;-><init>(Ld33/h1;I)V

    invoke-virtual {v2, v3}, Lc6/a;->a(Lc93/a;)V

    :cond_41
    invoke-static {}, Lc53/c;->a()Lc53/a;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v7, 0x0

    invoke-static {v1, v7, v2}, Lup/d;->h(Lc53/a;Lq83/j;I)Lc53/a;

    move-result-object v1

    new-instance v2, Ls40/c0;

    const/4 v3, 0x6

    invoke-direct {v2, v0, v7, v3}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v3, 0x3

    invoke-static {v1, v7, v7, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v1, v0, Lt23/c0;->n:Lhc3/d;

    invoke-static {v1, v7}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    iget-object v1, v0, Lt23/c0;->l:Lbc3/c2;

    if-eqz v1, :cond_42

    invoke-virtual {v1, v7}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_42
    invoke-virtual {v0}, Lt23/c0;->h()Lt23/x1;

    move-result-object v1

    iget-object v2, v1, Lt23/x1;->p:Ljava/lang/Object;

    monitor-enter v2

    const/4 v5, 0x1

    :try_start_8
    iput-boolean v5, v1, Lt23/x1;->q:Z

    invoke-virtual {v1}, Lt23/x1;->a()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    monitor-exit v2

    iget-object v2, v1, Lt23/x1;->e:Lt23/e1;

    invoke-virtual {v2}, Lt23/e1;->k()V

    iget-object v3, v2, Lt23/e1;->f:Lorg/webrtc/Camera2Capturer;

    if-eqz v3, :cond_43

    invoke-virtual {v3}, Lorg/webrtc/Camera2Capturer;->dispose()V

    :cond_43
    iget-object v3, v2, Lt23/e1;->c:Lorg/webrtc/SurfaceTextureHelper;

    if-eqz v3, :cond_45

    if-eqz v3, :cond_44

    invoke-virtual {v3}, Lorg/webrtc/SurfaceTextureHelper;->dispose()V

    move/from16 v3, v36

    const/4 v7, 0x0

    goto :goto_23

    :cond_44
    const-string v0, "surfaceTextureHelper"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v7, 0x0

    throw v7

    :cond_45
    const/4 v7, 0x0

    move/from16 v3, v36

    :goto_23
    iput-boolean v3, v2, Lt23/e1;->u:Z

    iget-object v1, v1, Lt23/x1;->f:Lt23/a2;

    iget-object v2, v1, Lt23/a2;->d:Lc33/e;

    if-eqz v2, :cond_47

    invoke-virtual {v2}, Lc33/e;->a()Lbc3/c0;

    move-result-object v3

    if-nez v3, :cond_46

    goto :goto_24

    :cond_46
    new-instance v5, Lc33/d;

    const/4 v6, 0x1

    invoke-direct {v5, v2, v7, v6}, Lc33/d;-><init>(Lc33/e;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v3, v7, v7, v5, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_24

    :cond_47
    invoke-virtual {v1}, Lt23/a2;->c()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_48

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v3, "Audio handler not initialized. Ensure calling setup(), before using the handler."

    invoke-interface {v2, v6, v5, v3, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_48
    :goto_24
    iget-object v2, v1, Lt23/a2;->g:Ld9/c;

    if-eqz v2, :cond_4a

    iget-object v3, v1, Lt23/a2;->f:Landroid/media/AudioManager;

    if-eqz v3, :cond_49

    invoke-virtual {v3, v2}, Landroid/media/AudioManager;->unregisterAudioDeviceCallback(Landroid/media/AudioDeviceCallback;)V

    :cond_49
    iput-object v7, v1, Lt23/a2;->g:Ld9/c;

    invoke-virtual {v1}, Lt23/a2;->c()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->z:Lb23/g;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4a

    iget-object v3, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    const-string v6, "[cleanupUsbDeviceDetection] Unregistered AudioDeviceCallback"

    invoke-interface {v3, v5, v2, v6, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4a
    iget-object v1, v1, Lt23/a2;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v1, v0, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v1, v7}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, v0, Lt23/c0;->h:Lb9/b;

    iget-boolean v1, v0, Lb9/b;->x:Z

    if-eqz v1, :cond_4b

    goto :goto_26

    :cond_4b
    const/4 v5, 0x1

    iput-boolean v5, v0, Lb9/b;->x:Z

    invoke-virtual {v0}, Lb9/b;->p()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v5, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4c

    iget-object v2, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    const-string v5, "Cleaning up ScopeProvider and shutting down executor"

    const/4 v7, 0x0

    invoke-interface {v2, v3, v1, v5, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_25

    :cond_4c
    const/4 v7, 0x0

    :goto_25
    iget-object v1, v0, Lb9/b;->E:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/ExecutorService;

    if-eqz v1, :cond_4d

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    :cond_4d
    iput-object v7, v0, Lb9/b;->E:Ljava/lang/Object;

    :goto_26
    sget-object v12, Ll83/a0;->a:Ll83/a0;

    :goto_27
    return-object v12

    :catchall_2
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_4e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_9
    iget-object v0, v4, Lp33/m;->z:Ljava/lang/Object;

    check-cast v0, Lqc/q;

    iget-object v0, v0, Lqc/q;->c:Ljava/lang/String;

    iget-object v1, v4, Lp33/m;->y:Ljava/lang/Object;

    check-cast v1, Lic/v;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v4, Lp33/m;->x:I

    if-eqz v3, :cond_51

    const/4 v5, 0x1

    if-eq v3, v5, :cond_50

    const/4 v5, 0x2

    if-ne v3, v5, :cond_4f

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_2a

    :cond_4f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_50
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_28

    :cond_51
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lic/v;->getForegroundInfoAsync()Lds/v;

    move-result-object v3

    const-string v5, "getForegroundInfoAsync(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x1

    iput v5, v4, Lp33/m;->x:I

    invoke-static {v3, v1, v4}, Ljc/j0;->a(Lds/v;Lic/v;Ls83/i;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_52

    goto :goto_29

    :cond_52
    :goto_28
    move-object v8, v3

    check-cast v8, Lic/m;

    if-eqz v8, :cond_54

    sget-object v3, Lrc/l;->a:Ljava/lang/String;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Updating notification for "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v3, v0}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v4, Lp33/m;->E:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lrc/m;

    iget-object v0, v4, Lp33/m;->F:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Landroid/content/Context;

    invoke-virtual {v1}, Lic/v;->getId()Ljava/util/UUID;

    move-result-object v7

    iget-object v0, v6, Lrc/m;->a:Lsc/b;

    iget-object v0, v0, Lsc/b;->a:Landroidx/room/u1;

    const-string v1, "setForegroundAsync"

    new-instance v5, Lnw0/e;

    const/16 v10, 0xa

    invoke-direct/range {v5 .. v10}, Lnw0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v0, v1, v5}, Lq83/g;->t(Landroidx/room/u1;Ljava/lang/String;Lc93/a;)Ld4/l;

    move-result-object v0

    const/4 v5, 0x2

    iput v5, v4, Lp33/m;->x:I

    invoke-static {v0, v4}, Ltx/f;->x(Lds/v;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_53

    :goto_29
    move-object v0, v2

    :cond_53
    :goto_2a
    return-object v0

    :cond_54
    const-string v1, "Worker was marked important ("

    const-string v2, ") but did not provide ForegroundInfo"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_a
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, v4, Lp33/m;->x:I

    const/4 v5, 0x1

    if-eqz v0, :cond_56

    if-ne v0, v5, :cond_55

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_55
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_56
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v4, Lp33/m;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput v5, v4, Lp33/m;->x:I

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lq6/a;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_57

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Provided class must implement ActionCallback."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_57
    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.glance.appwidget.action.ActionCallback"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lnh3/a;->o(Ljava/lang/Object;)V

    throw v7

    :pswitch_b
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lp33/m;->x:I

    if-eqz v1, :cond_59

    const/4 v5, 0x1

    if-ne v1, v5, :cond_58

    iget-object v0, v4, Lp33/m;->y:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_2b

    :cond_58
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_59
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, Lp33/m;->F:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, v4, Lp33/m;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_5b

    iget-object v3, v4, Lp33/m;->E:Ljava/lang/Object;

    check-cast v3, Lmj/p;

    iput-object v1, v4, Lp33/m;->y:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, v4, Lp33/m;->x:I

    invoke-virtual {v3, v2, v4}, Lmj/p;->b(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_5a

    goto :goto_2d

    :cond_5a
    move-object v0, v1

    :goto_2b
    check-cast v2, Ljava/util/List;

    const/4 v3, 0x0

    invoke-static {v3, v2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/graphics/Rect;

    move-object v1, v0

    goto :goto_2c

    :cond_5b
    const/4 v10, 0x0

    :goto_2c
    invoke-interface {v1, v10}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_2d
    return-object v0

    :pswitch_c
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lp33/m;->x:I

    if-eqz v1, :cond_5d

    const/4 v5, 0x1

    if-ne v1, v5, :cond_5c

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2e

    :cond_5c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, Lp33/m;->y:Ljava/lang/Object;

    check-cast v1, Ldc3/u;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v9, 0x0

    invoke-direct {v2, v9}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    new-instance v3, Lp6/n;

    invoke-direct {v3, v2, v1}, Lp6/n;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Ldc3/u;)V

    new-instance v5, Ln43/a;

    iget-object v1, v4, Lp33/m;->z:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lp6/g0;

    iget-object v1, v4, Lp33/m;->E:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Landroid/content/Context;

    iget-object v1, v4, Lp33/m;->F:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Ln6/l;

    const/16 v10, 0x9

    invoke-direct/range {v5 .. v10}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x1

    iput v1, v4, Lp33/m;->x:I

    invoke-static {v3, v5, v4}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5e

    goto :goto_2f

    :cond_5e
    :goto_2e
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_2f
    return-object v0

    :pswitch_d
    iget-object v0, v4, Lp33/m;->E:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, v4, Lp33/m;->z:Ljava/lang/Object;

    check-cast v1, Lp6/l;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v4, Lp33/m;->x:I

    if-eqz v3, :cond_60

    const/4 v5, 0x1

    if-ne v3, v5, :cond_5f

    iget-object v2, v4, Lp33/m;->y:Ljava/lang/Object;

    check-cast v2, Lp1/r1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v5, p1

    goto :goto_30

    :cond_5f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_60
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v4, Lp33/m;->y:Ljava/lang/Object;

    check-cast v3, Lp1/r1;

    iget-object v5, v1, Lp6/l;->j:Lp1/k1;

    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_62

    iget-object v5, v1, Lp6/l;->e:Lp6/g0;

    invoke-virtual {v5}, Lp6/g0;->h()Ly6/g;

    move-result-object v5

    if-eqz v5, :cond_62

    iget-object v6, v1, Lp6/l;->g:Ly6/a;

    iget-object v7, v1, Lp6/l;->a:Ljava/lang/String;

    iput-object v3, v4, Lp33/m;->y:Ljava/lang/Object;

    const/4 v8, 0x1

    iput v8, v4, Lp33/m;->x:I

    check-cast v6, Ly6/f;

    invoke-virtual {v6, v0, v5, v7, v4}, Ly6/f;->c(Landroid/content/Context;Ly6/g;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_61

    goto/16 :goto_36

    :cond_61
    move-object v2, v3

    :goto_30
    move-object v3, v2

    move-object v7, v5

    goto :goto_31

    :cond_62
    const/4 v7, 0x0

    :goto_31
    iget-object v2, v4, Lp33/m;->F:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v5

    instance-of v6, v5, Lz1/b;

    if-eqz v6, :cond_63

    check-cast v5, Lz1/b;

    goto :goto_32

    :cond_63
    const/4 v5, 0x0

    :goto_32
    if-eqz v5, :cond_69

    const/4 v6, 0x0

    invoke-virtual {v5, v6, v6}, Lz1/b;->C(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lz1/b;

    move-result-object v5

    if-eqz v5, :cond_69

    :try_start_9
    invoke-virtual {v5}, Lz1/f;->j()Lz1/f;

    move-result-object v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :try_start_a
    iget-object v8, v1, Lp6/l;->f:Lp6/b;

    iget-object v9, v1, Lp6/l;->k:Lp1/k1;

    invoke-static {v8}, Lvd/e;->J(Lp6/b;)Z

    move-result v10

    if-eqz v10, :cond_67

    const-string v10, "appwidget"

    invoke-virtual {v0, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    const-string v11, "null cannot be cast to non-null type android.appwidget.AppWidgetManager"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Landroid/appwidget/AppWidgetManager;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v11, v8, Lp6/b;->a:I

    invoke-virtual {v10, v11}, Landroid/appwidget/AppWidgetManager;->getAppWidgetInfo(I)Landroid/appwidget/AppWidgetProviderInfo;

    move-result-object v11

    if-nez v11, :cond_64

    const-wide/16 v11, 0x0

    goto :goto_34

    :cond_64
    iget v12, v11, Landroid/appwidget/AppWidgetProviderInfo;->minWidth:I

    iget v13, v11, Landroid/appwidget/AppWidgetProviderInfo;->resizeMode:I

    const/16 v38, 0x1

    and-int/lit8 v13, v13, 0x1

    const v14, 0x7fffffff

    if-eqz v13, :cond_65

    iget v13, v11, Landroid/appwidget/AppWidgetProviderInfo;->minResizeWidth:I

    goto :goto_33

    :cond_65
    move v13, v14

    :goto_33
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    move-result v12

    iget v13, v11, Landroid/appwidget/AppWidgetProviderInfo;->minHeight:I

    iget v15, v11, Landroid/appwidget/AppWidgetProviderInfo;->resizeMode:I

    const/16 v37, 0x2

    and-int/lit8 v15, v15, 0x2

    if-eqz v15, :cond_66

    iget v14, v11, Landroid/appwidget/AppWidgetProviderInfo;->minResizeHeight:I

    :cond_66
    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    move-result v11

    int-to-float v12, v12

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v12, v0

    int-to-float v11, v11

    div-float/2addr v11, v0

    invoke-static {v12, v11}, Lvf3/b;->a(FF)J

    move-result-wide v11

    :goto_34
    new-instance v0, Ly3/h;

    invoke-direct {v0, v11, v12}, Ly3/h;-><init>(J)V

    invoke-interface {v2, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v9}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    if-nez v0, :cond_67

    iget v0, v8, Lp6/b;->a:I

    invoke-virtual {v10, v0}, Landroid/appwidget/AppWidgetManager;->getAppWidgetOptions(I)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v9, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    goto :goto_35

    :catchall_3
    move-exception v0

    goto :goto_37

    :cond_67
    :goto_35
    if-eqz v7, :cond_68

    iget-object v0, v1, Lp6/l;->j:Lp1/k1;

    invoke-virtual {v0, v7}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_68
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v3, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :try_start_b
    invoke-static {v6}, Lz1/f;->q(Lz1/f;)V

    invoke-virtual {v5}, Lz1/b;->w()Lz1/q;

    move-result-object v0

    invoke-virtual {v0}, Lz1/q;->d()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    invoke-virtual {v5}, Lz1/b;->c()V

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_36
    return-object v2

    :catchall_4
    move-exception v0

    goto :goto_38

    :goto_37
    :try_start_c
    invoke-static {v6}, Lz1/f;->q(Lz1/f;)V

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    :goto_38
    invoke-virtual {v5}, Lz1/b;->c()V

    throw v0

    :cond_69
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot create a mutable snapshot of an read-only snapshot"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_e
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lp33/m;->x:I

    if-eqz v1, :cond_6b

    const/4 v5, 0x1

    if-ne v1, v5, :cond_6a

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_39

    :cond_6a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, Lp33/m;->E:Ljava/lang/Object;

    check-cast v1, Lp33/o;

    iget-object v1, v1, Lp33/o;->a:Ll53/j;

    iget-object v2, v4, Lp33/m;->F:Ljava/lang/Object;

    check-cast v2, Lstream/video/sfu/signal/UpdateSubscriptionsRequest;

    const/4 v5, 0x1

    iput v5, v4, Lp33/m;->x:I

    invoke-virtual {v1, v2, v4}, Ll53/j;->updateSubscriptions(Lstream/video/sfu/signal/UpdateSubscriptionsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6c

    goto :goto_3b

    :cond_6c
    :goto_39
    iget-object v0, v4, Lp33/m;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iput-object v1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v0, v1

    check-cast v0, Lstream/video/sfu/signal/UpdateSubscriptionsResponse;

    invoke-virtual {v0}, Lstream/video/sfu/signal/UpdateSubscriptionsResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object v0

    if-eqz v0, :cond_6e

    invoke-virtual {v0}, Lstream/video/sfu/models/Error;->getShould_retry()Z

    move-result v2

    if-eqz v2, :cond_6e

    invoke-static {v0}, Lp33/o;->a(Lstream/video/sfu/models/Error;)Z

    move-result v2

    if-eqz v2, :cond_6d

    goto :goto_3a

    :cond_6d
    new-instance v1, Lio/getstream/video/android/core/call/utils/SfuRetryableException;

    invoke-virtual {v0}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6e
    :goto_3a
    move-object v0, v1

    :goto_3b
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
