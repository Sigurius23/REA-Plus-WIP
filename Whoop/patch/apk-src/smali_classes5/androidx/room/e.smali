.class public final Landroidx/room/e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 1
    iput p4, p0, Landroidx/room/e;->w:I

    iput-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p3, p0, Landroidx/room/e;->w:I

    iput-object p1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Landroidx/room/e;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, Lo23/k;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Lo23/a;

    const/16 v2, 0x1d

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, Lnk/m;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Lyb3/k;

    const/16 v2, 0x1c

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, Landroid/app/Activity;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x1b

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance v0, Landroidx/room/e;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Lgm/r;

    const/16 v2, 0x1a

    invoke-direct {v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Landroidx/room/e;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_3
    new-instance v0, Landroidx/room/e;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Ln20/u;

    const/16 v2, 0x19

    invoke-direct {v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Landroidx/room/e;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_4
    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, Ln20/i;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Lg20/v;

    const/16 v2, 0x18

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_5
    new-instance v0, Landroidx/room/e;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Ln00/k;

    const/16 v2, 0x17

    invoke-direct {v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Landroidx/room/e;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_6
    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, Lkj/b;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    const/16 v2, 0x16

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_7
    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, Lkj/b;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Ljk/a;

    const/16 v2, 0x15

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_8
    new-instance v0, Landroidx/room/e;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Lio/ktor/utils/io/q;

    const/16 v2, 0x14

    invoke-direct {v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Landroidx/room/e;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_9
    new-instance v0, Landroidx/room/e;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Lk20/d;

    const/16 v2, 0x13

    invoke-direct {v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Landroidx/room/e;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_a
    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, Lk20/a;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Lyy/a;

    const/16 v2, 0x12

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_b
    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, Lk20/a;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Lx30/s0;

    const/16 v2, 0x11

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_c
    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, Lj20/c;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Ldz/i;

    const/16 v2, 0x10

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_d
    new-instance v0, Landroidx/room/e;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Li20/j1;

    const/16 v2, 0xf

    invoke-direct {v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Landroidx/room/e;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_e
    new-instance v0, Landroidx/room/e;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Li20/k1;

    const/16 v2, 0xe

    invoke-direct {v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Landroidx/room/e;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_f
    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, Lh20/z4;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Ly00/o4;

    const/16 v2, 0xd

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_10
    new-instance v0, Landroidx/room/e;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Lh20/k4;

    const/16 v2, 0xc

    invoke-direct {v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Landroidx/room/e;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_11
    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, Lh20/k4;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/IllegalStateException;

    const/16 v2, 0xb

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_12
    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, Lh00/b0;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Lf0/r1;

    const/16 v2, 0xa

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_13
    new-instance v0, Landroidx/room/e;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Lg2/s;

    const/16 v2, 0x9

    invoke-direct {v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Landroidx/room/e;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_14
    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, Lg20/r;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    const/16 v2, 0x8

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_15
    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, Lg20/r;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Lux/m0;

    const/4 v2, 0x7

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_16
    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, Lg20/r;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Ly00/c8;

    const/4 v2, 0x6

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_17
    new-instance v0, Landroidx/room/e;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Lf53/k;

    const/4 v2, 0x5

    invoke-direct {v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Landroidx/room/e;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_18
    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, La33/d;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Ldz/i;

    const/4 v2, 0x4

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_19
    new-instance v0, Landroidx/room/e;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Ld1/f;

    const/4 v2, 0x3

    invoke-direct {v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Landroidx/room/e;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_1a
    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, Lc33/e;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Lz40/e;

    const/4 v2, 0x2

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1b
    new-instance v0, Landroidx/room/e;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Landroidx/room/e;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_1c
    new-instance p1, Landroidx/room/e;

    iget-object v0, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Callable;

    iget-object v1, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/m;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, p2, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Landroidx/room/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lt23/q2;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_3
    check-cast p1, Ln20/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_5
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_6
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_7
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_8
    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lr20/s;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_d
    check-cast p1, Ljava/util/Map;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_e
    check-cast p1, Li20/t0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_f
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_10
    check-cast p1, Le10/b0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_11
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_12
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_13
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_14
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_15
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_16
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_17
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_18
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_19
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_1b
    check-cast p1, Lb30/n;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_1c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Landroidx/room/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

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
    .locals 12

    iget v0, p0, Landroidx/room/e;->w:I

    const/4 v1, 0x3

    const/16 v2, 0x16

    const/4 v3, 0x4

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    iget-object v8, p0, Landroidx/room/e;->y:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lo23/k;

    iget-object v0, p1, Lo23/k;->b:Lo23/d;

    check-cast v8, Lo23/a;

    new-instance v1, Lc9/c;

    const/16 v2, 0x18

    invoke-direct {v1, v2, p1, v8}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lo23/d;->enqueue(Lo23/a;)V

    return-object v7

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lnk/m;

    iget-object p1, p1, Lnk/m;->a:Ldk/f;

    check-cast v8, Lyb3/k;

    check-cast v8, Lyb3/n;

    invoke-virtual {v8}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    invoke-virtual {v0, v5}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "insertId"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Ldk/f;->d:Ljava/util/LinkedHashMap;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v7

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Landroid/app/Activity;

    const v0, 0x1020002

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "this@findViewsWithSelector.applicationContext"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Ljava/lang/String;

    invoke-static {v0, v2, v1, v8}, Lnj/c;->a(Landroid/view/View;Landroid/content/Context;Landroid/graphics/Rect;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v8}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lnj/b;

    invoke-direct {v0, v4, v2}, Lnj/b;-><init>(ILandroid/graphics/Rect;)V

    new-instance v1, Lvj/b;

    invoke-direct {v1, p1}, Lvj/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lnj/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :cond_0
    return-object v0

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lt23/q2;

    instance-of p1, p1, Lt23/j2;

    if-eqz p1, :cond_2

    check-cast v8, Lgm/r;

    iget-object p1, v8, Lgm/r;->x:Ljava/lang/Object;

    check-cast p1, Lt23/c0;

    iget-object v0, p1, Lt23/c0;->c:Ljava/lang/String;

    iget-object v1, v8, Lgm/r;->y:Ljava/lang/Object;

    check-cast v1, Lt23/b4;

    iget-object v2, v1, Lt23/b4;->U:Lt23/g1;

    iget-object v3, v2, Lt23/g1;->g:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt23/c0;

    if-eqz v3, :cond_1

    iget-object v6, v3, Lt23/c0;->c:Ljava/lang/String;

    :cond_1
    invoke-virtual {v0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2, p1}, Lt23/g1;->d(Lt23/c0;)V

    invoke-virtual {v1, p1}, Lt23/b4;->t(Lt23/c0;)V

    :cond_2
    return-object v7

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Ln20/h;

    check-cast v8, Ln20/u;

    iget-object v0, v8, Ln20/u;->y:Ln20/b;

    iget-object v0, v0, Ln20/b;->Y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/x;

    if-eqz p1, :cond_3

    iget-object p1, p1, Ln20/h;->w:La30/f1;

    if-eqz p1, :cond_3

    iget-object p1, p1, La30/f1;->E:Lv00/c0;

    if-eqz p1, :cond_3

    iget-object v6, p1, Lv00/c0;->l0:La30/l0;

    :cond_3
    invoke-virtual {v0, v6}, Lh20/x;->c(La30/l0;)V

    return-object v7

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Ln20/i;

    iget-object p1, p1, Ln20/i;->e:Lh20/c4;

    check-cast v8, Lg20/v;

    instance-of v0, v8, Lg20/t;

    if-eqz v0, :cond_4

    new-instance v0, Lh20/z3;

    invoke-direct {v0, v5}, Lh20/z3;-><init>(Z)V

    goto :goto_0

    :cond_4
    instance-of v0, v8, Lg20/s;

    if-eqz v0, :cond_5

    new-instance v0, Lh20/y3;

    invoke-direct {v0, v5}, Lh20/y3;-><init>(Z)V

    goto :goto_0

    :cond_5
    instance-of v0, v8, Lg20/u;

    if-eqz v0, :cond_6

    new-instance v0, Lh20/a4;

    check-cast v8, Lg20/u;

    iget-object v1, v8, Lg20/u;->w:Ljava/lang/Throwable;

    invoke-direct {v0, v1}, Lh20/a4;-><init>(Ljava/lang/Throwable;)V

    :goto_0
    invoke-interface {p1, v0}, Lh20/c4;->a(Lh20/b4;)V

    return-object v7

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    check-cast v8, Ln00/k;

    sget p1, Ln00/k;->R:I

    iget-object v9, v8, Ln00/k;->N:Lec3/h2;

    :cond_7
    invoke-virtual {v9}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ln00/c;

    const/4 v4, 0x0

    const/16 v6, 0x7f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Ln00/c;->a(Ln00/c;ZLn00/d;ZLzy/c;Ljava/lang/String;I)Ln00/c;

    move-result-object v0

    invoke-virtual {v9, p1, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    return-object v7

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lkj/b;

    iget-object p1, p1, Lkj/b;->w:Lcom/amplitude/android/engagement/a;

    check-cast v8, Ljava/lang/String;

    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v1, Lav/b;

    invoke-direct {v1, v8, v2}, Lav/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/l0;->H(Lc93/a;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "href"

    invoke-virtual {v0, v1, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "pathname"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "search"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JSONObject()\n           \u2026              .toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lhj/e;

    invoke-direct {v2, p1, v0, v4}, Lhj/e;-><init>(Lcom/amplitude/android/engagement/a;Ljava/lang/String;I)V

    const-wide/16 v3, 0x3e8

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-object v7

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lkj/b;

    iget-object v0, p1, Lkj/b;->w:Lcom/amplitude/android/engagement/a;

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/a;->h()V

    iget-object v0, p1, Lkj/b;->H:Lhj/b;

    if-eqz v0, :cond_8

    iget-object p1, p1, Lkj/b;->w:Lcom/amplitude/android/engagement/a;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lcom/amplitude/android/engagement/a;->a(Lhj/b;)V

    goto :goto_1

    :cond_8
    check-cast v8, Ljk/a;

    iget-object v0, v8, Ljk/a;->a:Ljava/lang/String;

    iget-object v1, v8, Ljk/a;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkj/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-object v7

    :pswitch_8
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    if-nez p1, :cond_9

    check-cast v8, Lio/ktor/utils/io/q;

    check-cast v8, Lio/ktor/utils/io/m;

    invoke-virtual {v8}, Lio/ktor/utils/io/m;->n()Z

    move-result p1

    if-eqz p1, :cond_a

    :cond_9
    move v4, v5

    :cond_a
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_9
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lr20/s;

    check-cast v8, Lk20/d;

    iget-object v0, v8, Lk20/d;->a:Landroidx/lifecycle/k1;

    iget-object v1, v8, Lk20/d;->b:Lk20/a;

    instance-of v2, p1, Lr20/j;

    if-nez v2, :cond_13

    instance-of v2, p1, Lr20/r;

    if-nez v2, :cond_13

    instance-of v2, p1, Lr20/i;

    if-eqz v2, :cond_b

    goto :goto_3

    :cond_b
    instance-of v2, p1, Lr20/k;

    if-eqz v2, :cond_c

    new-instance p1, Lk20/i;

    iget-object v0, v1, Lk20/a;->a:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    invoke-direct {p1, v0, v3}, Lk20/i;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;I)V

    invoke-static {v1, p1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    goto :goto_3

    :cond_c
    instance-of v2, p1, Lr20/p;

    if-eqz v2, :cond_d

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lk20/k;

    invoke-direct {p1, v3}, Lk20/k;-><init>(I)V

    invoke-static {v1, p1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    goto :goto_3

    :cond_d
    instance-of v2, p1, Lr20/o;

    const-string v3, "previously_shown_payment_form"

    if-eqz v2, :cond_e

    invoke-virtual {v8, v5}, Lk20/d;->c(Z)V

    invoke-virtual {v0, v6, v3}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "previously_interacted_payment_form"

    invoke-virtual {v0, v6, p1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_e
    instance-of v2, p1, Lr20/q;

    if-eqz v2, :cond_f

    invoke-virtual {v8, v4}, Lk20/d;->c(Z)V

    goto :goto_3

    :cond_f
    instance-of v2, p1, Lr20/g;

    if-nez v2, :cond_11

    instance-of p1, p1, Lr20/f;

    if-eqz p1, :cond_10

    goto :goto_2

    :cond_10
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_11
    :goto_2
    iget-object p1, v8, Lk20/d;->c:Le30/a;

    iget-object p1, p1, Le30/a;->x:Le30/c;

    invoke-virtual {p1}, Le30/c;->l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v3}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    invoke-virtual {v1, p1}, Lk20/a;->o(Ljava/lang/String;)V

    invoke-virtual {v0, p1, v3}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_12
    invoke-virtual {v8, v4}, Lk20/d;->c(Z)V

    :cond_13
    :goto_3
    return-object v7

    :pswitch_a
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lk20/a;

    iget-object v0, p1, Lk20/a;->b:Lyy/j;

    iget-object v1, p1, Lk20/a;->d:Lb10/b;

    check-cast v8, Lyy/a;

    iget-object p1, p1, Lk20/a;->i:Lk83/a;

    invoke-interface {p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv00/c0;

    if-eqz p1, :cond_14

    iget-object p1, p1, Lv00/c0;->i0:Lv00/n;

    if-eqz p1, :cond_14

    iget-object p1, p1, Lv00/n;->x:Ljava/util/Map;

    if-nez p1, :cond_15

    :cond_14
    sget-object p1, Lm83/z;->w:Lm83/z;

    :cond_15
    invoke-virtual {v1, v8, p1}, Lb10/b;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lyy/j;->a(Lyy/b;)V

    return-object v7

    :pswitch_b
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lk20/a;

    iget-object p1, p1, Lk20/a;->f:Lv03/d;

    invoke-interface {p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_16

    return-object v7

    :cond_16
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_c
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lj20/c;

    iget-object v0, p1, Lj20/c;->a:Lyy/j;

    iget-object p1, p1, Lj20/c;->b:Lyy/c;

    check-cast v8, Ldz/i;

    invoke-virtual {v8}, Ldz/i;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1, v8, v1}, Lyy/c;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lyy/j;->a(Lyy/b;)V

    return-object v7

    :pswitch_d
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    check-cast v8, Li20/j1;

    iget-object v0, v8, Li20/j1;->F:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li20/i1;

    instance-of v1, v1, Li20/h1;

    if-eqz v1, :cond_19

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll40/a;

    iget-object v2, v2, Ll40/a;->a:Ljava/lang/String;

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_17
    iget-object p1, v8, Li20/j1;->E:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_18

    iput-object v1, v8, Li20/j1;->G:Ljava/util/LinkedHashMap;

    :cond_18
    new-instance v1, Li20/h1;

    invoke-direct {v1, p1}, Li20/h1;-><init>(Z)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v6, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_19
    return-object v7

    :pswitch_e
    check-cast v8, Li20/k1;

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Li20/t0;

    instance-of v0, p1, Li20/s0;

    const-string v1, "AutocompleteEvent"

    if-eqz v0, :cond_1a

    new-instance v0, Li20/k;

    check-cast p1, Li20/s0;

    iget-object p1, p1, Li20/s0;->a:Lh20/x0;

    invoke-direct {v0, p1}, Li20/k;-><init>(Lh20/x0;)V

    iget-object p1, v8, Li20/k1;->a:Leb/u0;

    if-eqz p1, :cond_1b

    invoke-virtual {p1}, Leb/a0;->m()Leb/q;

    move-result-object p1

    if-eqz p1, :cond_1b

    invoke-virtual {p1}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object p1

    if-eqz p1, :cond_1b

    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_5

    :cond_1a
    instance-of v0, p1, Li20/r0;

    if-eqz v0, :cond_1d

    new-instance v0, Li20/l;

    check-cast p1, Li20/r0;

    iget-object p1, p1, Li20/r0;->a:Lh20/x0;

    invoke-direct {v0, p1}, Li20/l;-><init>(Lh20/x0;)V

    iget-object p1, v8, Li20/k1;->a:Leb/u0;

    if-eqz p1, :cond_1b

    invoke-virtual {p1}, Leb/a0;->m()Leb/q;

    move-result-object p1

    if-eqz p1, :cond_1b

    invoke-virtual {p1}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object p1

    if-eqz p1, :cond_1b

    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1b
    :goto_5
    iget-object p1, v8, Li20/k1;->a:Leb/u0;

    if-eqz p1, :cond_1c

    invoke-virtual {p1}, Leb/a0;->z()Z

    move-result p1

    if-nez p1, :cond_1c

    invoke-static {v8}, Li20/l1;->k(Li20/k1;)V

    :cond_1c
    return-object v7

    :cond_1d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_f
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lh20/z4;

    iget-object v0, p1, Lh20/z4;->i:Lh20/f;

    check-cast v8, Ly00/o4;

    iget-object v1, v0, Lh20/f;->b:Lec3/r1;

    iget-object v1, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La30/a;

    if-eqz v1, :cond_1f

    if-eqz v8, :cond_1e

    iget-object v2, v8, Ly00/o4;->w:Ljava/lang/String;

    goto :goto_6

    :cond_1e
    move-object v2, v6

    :goto_6
    invoke-static {v1, v6, v2, v5}, La30/a;->b(La30/a;Ljava/util/List;Ljava/lang/String;I)La30/a;

    move-result-object v1

    goto :goto_7

    :cond_1f
    move-object v1, v6

    :goto_7
    iget-object v0, v0, Lh20/f;->a:Landroidx/lifecycle/k1;

    const-string v2, "customer_info"

    invoke-virtual {v0, v1, v2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lh20/z4;->h:Lkotlin/jvm/internal/i;

    new-instance v0, Lq20/w;

    invoke-direct {v0, v8, v6, v6}, Lq20/w;-><init>(Ly00/o4;Lq20/u;Ly00/u5;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v7

    :pswitch_10
    check-cast v8, Lh20/k4;

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Le10/b0;

    instance-of v0, p1, Le10/a0;

    if-nez v0, :cond_23

    instance-of v0, p1, Le10/z;

    if-eqz v0, :cond_20

    iget-object p1, v8, Lh20/k4;->l0:Lh20/f4;

    iget-object v0, v8, Le30/c;->z:Landroidx/lifecycle/k1;

    iget-object v1, v8, Lh20/k4;->k0:Lec3/h2;

    iput-object p1, v8, Lh20/k4;->l0:Lh20/f4;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v2, "processing"

    invoke-virtual {v0, p1, v2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lq20/c0;->b:Lq20/c0;

    invoke-virtual {v1, v6, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    instance-of v4, v4, Lq20/c0;

    if-nez v4, :cond_23

    iget-object v4, v8, Lh20/k4;->l0:Lh20/f4;

    iput-object v4, v8, Lh20/k4;->l0:Lh20/f4;

    invoke-virtual {v0, p1, v2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v6, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_8

    :cond_20
    instance-of v0, p1, Le10/y;

    if-eqz v0, :cond_22

    iget-object v0, v8, Le30/c;->L:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv00/c0;

    if-eqz v0, :cond_21

    invoke-virtual {v8, v0, v6}, Lh20/k4;->F(Lv00/c0;Lzy/c;)V

    :cond_21
    check-cast p1, Le10/y;

    iget-object p1, p1, Le10/y;->a:Le10/x;

    invoke-static {v8, p1}, Lh20/k4;->B(Lh20/k4;Le10/x;)V

    goto :goto_8

    :cond_22
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_23
    :goto_8
    return-object v7

    :pswitch_11
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lh20/k4;

    new-instance v0, Le10/v;

    check-cast v8, Ljava/lang/IllegalStateException;

    invoke-static {v8}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object v1

    sget-object v2, Le10/r;->a:Le10/r;

    invoke-direct {v0, v8, v1, v2}, Le10/v;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    invoke-static {p1, v0}, Lh20/k4;->B(Lh20/k4;Le10/x;)V

    return-object v7

    :pswitch_12
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lh00/b0;

    if-eqz p1, :cond_24

    check-cast v8, Lf0/r1;

    invoke-virtual {v8}, Lf0/r1;->c()Z

    move-result v0

    iget-object p1, p1, Lh00/b0;->a:Lv20/g;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lv20/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_24
    return-object v7

    :pswitch_13
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    invoke-interface {p1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object p1

    check-cast v8, Lg2/s;

    new-instance v0, Leg/j;

    invoke-direct {v0, v8, v2}, Leg/j;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v0}, Lbc3/k1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    return-object v7

    :pswitch_14
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lg20/r;

    new-instance v0, Lg20/c;

    check-cast v8, Ljava/lang/Throwable;

    invoke-direct {v0, v8}, Lg20/c;-><init>(Ljava/lang/Throwable;)V

    const/4 v1, 0x6

    invoke-static {p1, v0, v6, v6, v1}, Lg20/r;->l(Lg20/r;Lg20/d;Ly00/c8;Ljava/util/Map;I)V

    return-object v7

    :pswitch_15
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lg20/r;

    check-cast v8, Lux/m0;

    sget-object v0, Lg20/r;->O:Ljava/util/List;

    invoke-virtual {v8}, Lux/m0;->f()Ly00/c8;

    move-result-object v0

    iget v2, v8, Lux/m0;->w:I

    const/4 v9, 0x2

    if-eqz v2, :cond_25

    move v4, v2

    goto :goto_c

    :cond_25
    invoke-interface {v0}, Ly00/c8;->c()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v2

    const/4 v10, -0x1

    if-nez v2, :cond_26

    move v2, v10

    goto :goto_9

    :cond_26
    sget-object v11, Lux/l0;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v11, v2

    :goto_9
    packed-switch v2, :pswitch_data_1

    goto :goto_c

    :pswitch_16
    invoke-virtual {v8}, Lux/m0;->f()Ly00/c8;

    move-result-object v0

    invoke-interface {v0}, Ly00/c8;->Y()Ly00/o4;

    move-result-object v0

    if-eqz v0, :cond_29

    iget-object v0, v0, Ly00/o4;->E:Ly00/f4;

    if-eqz v0, :cond_29

    iget-boolean v0, v0, Ly00/f4;->E:Z

    if-ne v0, v5, :cond_29

    goto :goto_b

    :pswitch_17
    invoke-interface {v0}, Ly00/c8;->m()Ly00/b8;

    move-result-object v0

    if-nez v0, :cond_27

    :pswitch_18
    move v4, v9

    goto :goto_c

    :cond_27
    invoke-virtual {v8}, Lux/m0;->f()Ly00/c8;

    move-result-object v0

    invoke-interface {v0}, Ly00/c8;->O()Lcom/stripe/android/model/StripeIntent$NextActionType;

    move-result-object v0

    if-nez v0, :cond_28

    goto :goto_a

    :cond_28
    sget-object v2, Lux/l0;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v10, v2, v0

    :goto_a
    packed-switch v10, :pswitch_data_2

    :pswitch_19
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :goto_b
    :pswitch_1a
    move v4, v5

    goto :goto_c

    :pswitch_1b
    move v4, v1

    :cond_29
    :goto_c
    if-eq v4, v5, :cond_2d

    if-eq v4, v9, :cond_2c

    if-eq v4, v1, :cond_2b

    if-eq v4, v3, :cond_2a

    new-instance v0, Lg20/c;

    new-instance v1, Lcom/stripe/android/core/exception/LocalStripeException;

    invoke-virtual {v8}, Lux/m0;->b()Ljava/lang/String;

    move-result-object v2

    const-string v4, "Payment fails due to unknown error. \n"

    invoke-static {v4, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "unknownIntentOutcomeError"

    invoke-direct {v1, v2, v4}, Lcom/stripe/android/core/exception/LocalStripeException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lg20/c;-><init>(Ljava/lang/Throwable;)V

    goto :goto_d

    :cond_2a
    new-instance v0, Lg20/c;

    new-instance v1, Lcom/stripe/android/core/exception/LocalStripeException;

    invoke-virtual {v8}, Lux/m0;->b()Ljava/lang/String;

    move-result-object v2

    const-string v4, "Payment fails due to time out. \n"

    invoke-static {v4, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "timedOutIntentOutcomeError"

    invoke-direct {v1, v2, v4}, Lcom/stripe/android/core/exception/LocalStripeException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lg20/c;-><init>(Ljava/lang/Throwable;)V

    goto :goto_d

    :cond_2b
    sget-object v0, Lg20/a;->w:Lg20/a;

    goto :goto_d

    :cond_2c
    new-instance v0, Lg20/c;

    new-instance v1, Lcom/stripe/android/core/exception/LocalStripeException;

    invoke-virtual {v8}, Lux/m0;->b()Ljava/lang/String;

    move-result-object v2

    const-string v4, "failedIntentOutcomeError"

    invoke-direct {v1, v2, v4}, Lcom/stripe/android/core/exception/LocalStripeException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lg20/c;-><init>(Ljava/lang/Throwable;)V

    goto :goto_d

    :cond_2d
    new-instance v0, Lg20/b;

    invoke-virtual {v8}, Lux/m0;->f()Ly00/c8;

    move-result-object v1

    invoke-direct {v0, v1}, Lg20/b;-><init>(Ly00/c8;)V

    :goto_d
    invoke-virtual {v8}, Lux/m0;->f()Ly00/c8;

    move-result-object v1

    invoke-static {p1, v0, v1, v6, v3}, Lg20/r;->l(Lg20/r;Lg20/d;Ly00/c8;Ljava/util/Map;I)V

    return-object v7

    :pswitch_1c
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lg20/r;

    new-instance v0, Lg20/b;

    check-cast v8, Ly00/c8;

    invoke-direct {v0, v8}, Lg20/b;-><init>(Ly00/c8;)V

    invoke-static {p1, v0, v8, v6, v3}, Lg20/r;->l(Lg20/r;Lg20/d;Ly00/c8;Ljava/util/Map;I)V

    return-object v7

    :pswitch_1d
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    check-cast v8, Lf53/k;

    iget-object v0, v8, Lf53/k;->h:Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-object v7

    :pswitch_1e
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, La33/d;

    iget-object v0, p1, La33/d;->x:Ljava/lang/Object;

    check-cast v0, Lyy/j;

    iget-object p1, p1, La33/d;->y:Ljava/lang/Object;

    check-cast p1, Lyy/c;

    check-cast v8, Ldz/i;

    invoke-virtual {v8}, Ldz/i;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1, v8, v1}, Lyy/c;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lyy/j;->a(Lyy/b;)V

    return-object v7

    :pswitch_1f
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    check-cast v8, Ld1/f;

    iget-object v0, v8, Ld1/f;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    iget-object v2, v8, Ld1/f;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v3, Le;

    const/16 v7, 0x1c

    invoke-direct {v3, v0, v8, v6, v7}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, v6, v6, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    :cond_2e
    invoke-virtual {v2, v6, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2f

    move v4, v5

    goto :goto_e

    :cond_2f
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2e

    :goto_e
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_20
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lc33/e;

    iget-object p1, p1, Lc33/e;->a:Lc33/c;

    check-cast v8, Lz40/e;

    iget-object v0, p1, Lc33/c;->e:Ljava/lang/Object;

    check-cast v0, Lz40/l;

    if-nez v0, :cond_30

    goto :goto_f

    :cond_30
    iget-object v1, v0, Lz40/l;->e:Lz40/e;

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_31

    iget-object v1, v0, Lz40/l;->a:Lkr/e;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Selected AudioDevice = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "message"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v8, v0, Lz40/l;->f:Lz40/e;

    invoke-virtual {v0, v6}, Lz40/l;->d(Ljava/lang/String;)V

    :cond_31
    iget-boolean v1, p1, Lc33/c;->a:Z

    if-nez v1, :cond_32

    invoke-virtual {v0}, Lz40/l;->a()V

    iput-boolean v5, p1, Lc33/c;->a:Z

    :cond_32
    :goto_f
    return-object v7

    :pswitch_21
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Lb30/n;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-interface {v8, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v7

    :pswitch_22
    check-cast v8, Lbc3/m;

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_0
    iget-object p1, p0, Landroidx/room/e;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/Callable;

    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v8, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_10

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {v8, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :goto_10
    return-object v7

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
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

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_17
        :pswitch_1b
        :pswitch_18
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_16
    .end packed-switch

    :pswitch_data_2
    .packed-switch -0x1
        :pswitch_1b
        :pswitch_19
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
    .end packed-switch
.end method
