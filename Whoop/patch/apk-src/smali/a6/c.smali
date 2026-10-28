.class public final La6/c;
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
.method public constructor <init>(Lc93/m;Lq83/d;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, La6/c;->w:I

    .line 1
    check-cast p1, Ls83/i;

    iput-object p1, p0, La6/c;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p4, p0, La6/c;->w:I

    iput-object p1, p0, La6/c;->y:Ljava/lang/Object;

    iput-object p2, p0, La6/c;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 3
    iput p3, p0, La6/c;->w:I

    iput-object p1, p0, La6/c;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, La6/c;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, La6/c;

    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Ly53/b;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Le63/e;

    const/16 v2, 0x1b

    invoke-direct {p1, v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance v0, La6/c;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lnc/b;

    const/16 v2, 0x1a

    invoke-direct {v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La6/c;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_1
    new-instance p1, La6/c;

    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Lmk/a;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Ljk/a;

    const/16 v2, 0x19

    invoke-direct {p1, v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, La6/c;

    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Llb/n;

    const/16 v2, 0x18

    invoke-direct {p1, v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance v0, La6/c;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lkk/b;

    const/16 v2, 0x17

    invoke-direct {v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La6/c;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_4
    new-instance v0, La6/c;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/material/ripple/RippleNode;

    const/16 v2, 0x16

    invoke-direct {v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La6/c;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_5
    new-instance v0, La6/c;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lw73/l;

    const/16 v2, 0x15

    invoke-direct {v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La6/c;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_6
    new-instance p1, La6/c;

    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Lj0/i;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    const/16 v2, 0x14

    invoke-direct {p1, v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_7
    new-instance p1, La6/c;

    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Lgj/d;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x13

    invoke-direct {p1, v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_8
    new-instance p1, La6/c;

    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Lgj/d;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lgj/d;

    const/16 v2, 0x12

    invoke-direct {p1, v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_9
    new-instance p1, La6/c;

    iget-object v0, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v0, Lgj/m;

    const/16 v1, 0x11

    invoke-direct {p1, v0, p2, v1}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_a
    new-instance p1, La6/c;

    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Lec3/l;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lfc3/w;

    const/16 v2, 0x10

    invoke-direct {p1, v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_b
    new-instance v0, La6/c;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lfc3/d;

    const/16 v2, 0xf

    invoke-direct {v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La6/c;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_c
    new-instance v0, La6/c;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    invoke-direct {v0, v1, p2}, La6/c;-><init>(Lc93/m;Lq83/d;)V

    iput-object p1, v0, La6/c;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_d
    new-instance v0, La6/c;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    const/16 v2, 0xd

    invoke-direct {v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La6/c;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_e
    new-instance v0, La6/c;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lec3/l;

    const/16 v2, 0xc

    invoke-direct {v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La6/c;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_f
    new-instance p1, La6/c;

    iget-object v0, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v0, Lck/e;

    const/16 v1, 0xb

    invoke-direct {p1, v0, p2, v1}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_10
    new-instance v0, La6/c;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lcoil/compose/AsyncImagePainter;

    const/16 v2, 0xa

    invoke-direct {v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La6/c;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_11
    new-instance p1, La6/c;

    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Lbh/j;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lmh/j;

    const/16 v2, 0x9

    invoke-direct {p1, v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_12
    new-instance p1, La6/c;

    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Lec3/f2;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lb3/o2;

    const/16 v2, 0x8

    invoke-direct {p1, v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_13
    new-instance p1, La6/c;

    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Lp1/y1;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    const/4 v2, 0x7

    invoke-direct {p1, v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_14
    new-instance p1, La6/c;

    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/room/i2;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    const/4 v2, 0x6

    invoke-direct {p1, v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_15
    new-instance v0, La6/c;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/p0;

    const/4 v2, 0x5

    invoke-direct {v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La6/c;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_16
    new-instance p1, La6/c;

    iget-object v0, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v0, Lzt/q;

    const/4 v1, 0x4

    invoke-direct {p1, v0, p2, v1}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_17
    new-instance v0, La6/c;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, La6/i0;

    const/4 v2, 0x3

    invoke-direct {v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La6/c;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_18
    new-instance p1, La6/c;

    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, La6/b;

    const/4 v2, 0x2

    invoke-direct {p1, v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_19
    new-instance p1, La6/c;

    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, La6/i0;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, La6/t0;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1a
    new-instance v0, La6/c;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, La6/c;->y:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

    iget v0, p0, La6/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lf6/f;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ldc3/o;

    iget-object p1, p1, Ldc3/o;->a:Ljava/lang/Object;

    check-cast p2, Lq83/d;

    new-instance v0, Ldc3/o;

    invoke-direct {v0, p1}, Ldc3/o;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v0, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lmh/j;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_13
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_16
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, La6/t0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, La6/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
    .locals 14

    iget v0, p0, La6/c;->w:I

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Ly53/b;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v3, p0, La6/c;->x:I

    if-eqz v3, :cond_1

    if-ne v3, v6, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    sget-object v3, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p1, v3}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    check-cast p1, Lbc3/k1;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lbc3/k1;->isActive()Z

    move-result p1

    goto :goto_0

    :cond_2
    move p1, v2

    :goto_0
    if-eqz p1, :cond_4

    iget-object p1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast p1, Le63/e;

    iput v6, p0, La6/c;->x:I

    check-cast v0, Lz53/g;

    invoke-virtual {v0, p1, p0}, Lz53/g;->b(Le63/e;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    move-object p1, v1

    :cond_3
    :goto_1
    return-object p1

    :cond_4
    new-instance p1, Lio/ktor/client/engine/ClientEngineClosedException;

    invoke-direct {p1, v2}, Lio/ktor/client/engine/ClientEngineClosedException;-><init>(I)V

    throw p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/c;->x:I

    if-eqz v1, :cond_6

    if-ne v1, v6, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, Ldc3/u;

    new-instance v1, Lnc/a;

    iget-object v2, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v2, Lnc/b;

    invoke-direct {v1, v2, p1}, Lnc/a;-><init>(Lnc/b;Ldc3/u;)V

    iget-object v2, v2, Lnc/b;->a:Leb/o0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v2, Leb/o0;->c:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-object v5, v2, Leb/o0;->d:Ljava/lang/Object;

    check-cast v5, Ljava/util/LinkedHashSet;

    invoke-virtual {v5, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    iget-object v5, v2, Leb/o0;->d:Ljava/lang/Object;

    check-cast v5, Ljava/util/LinkedHashSet;

    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    move-result v5

    if-ne v5, v6, :cond_7

    invoke-virtual {v2}, Leb/o0;->c()Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v2, Leb/o0;->e:Ljava/lang/Object;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v5

    sget-object v7, Loc/e;->a:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ": initial state = "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, v2, Leb/o0;->e:Ljava/lang/Object;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v7, v8}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Leb/o0;->e()V

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :cond_7
    :goto_2
    iget-object v2, v2, Leb/o0;->e:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lnc/a;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_8
    monitor-exit v4

    iget-object v2, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v2, Lnc/b;

    new-instance v4, Lk80/d;

    invoke-direct {v4, v3, v2, v1}, Lk80/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v6, p0, La6/c;->x:I

    invoke-static {p1, v4, p0}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto :goto_4

    :cond_9
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v0

    :goto_5
    monitor-exit v4

    throw p1

    :pswitch_1
    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Lmk/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, La6/c;->x:I

    if-eqz v2, :cond_b

    if-ne v2, v6, :cond_a

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Lmk/a;->E:Llk/g;

    if-eqz p1, :cond_f

    iget-object v2, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v2, Ljk/a;

    iput v6, p0, La6/c;->x:I

    invoke-virtual {p1, v2, p0}, Llk/g;->a(Ljk/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_c

    goto :goto_8

    :cond_c
    :goto_6
    check-cast p1, Ljk/a;

    if-eqz p1, :cond_e

    iget-object v0, v0, Lmk/a;->z:Lkk/b;

    if-eqz v0, :cond_d

    invoke-virtual {v0, p1}, Lkk/b;->a(Ljk/a;)V

    goto :goto_7

    :cond_d
    const-string p1, "pipeline"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_e
    :goto_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_8
    return-object v1

    :cond_f
    const-string p1, "identifyInterceptor"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/c;->x:I

    if-eqz v1, :cond_11

    if-ne v1, v6, :cond_10

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_9

    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, Lc93/m;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Llb/n;

    iput v6, p0, La6/c;->x:I

    invoke-interface {p1, v1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    move-object p1, v0

    :cond_12
    :goto_9
    return-object p1

    :pswitch_3
    iget-object v0, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v0, Lkk/b;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v3, p0, La6/c;->x:I

    if-eqz v3, :cond_14

    if-ne v3, v6, :cond_13

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_a

    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_14
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    invoke-static {p1}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result p1

    if-eqz p1, :cond_16

    iget-boolean p1, v0, Lkk/b;->i:Z

    if-eqz p1, :cond_16

    iget-boolean p1, v0, Lkk/b;->j:Z

    if-nez p1, :cond_16

    iput-boolean v6, v0, Lkk/b;->j:Z

    iget-object p1, v0, Lkk/b;->a:Lgj/d;

    iget-object p1, p1, Lgj/d;->a:Lgj/g;

    iget p1, p1, Lgj/g;->d:I

    int-to-long v7, p1

    iput v6, p0, La6/c;->x:I

    invoke-static {v7, v8, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_15

    goto :goto_b

    :cond_15
    :goto_a
    iget-object p1, v0, Lkk/b;->g:Ldc3/l;

    new-instance v1, Lkk/f;

    invoke-direct {v1, v5, v4}, Lkk/f;-><init>(ILjk/a;)V

    invoke-interface {p1, v1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    iput-boolean v2, v0, Lkk/b;->j:Z

    :cond_16
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_b
    return-object v1

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, p0, La6/c;->x:I

    if-eqz v2, :cond_18

    if-ne v2, v6, :cond_17

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_c

    :cond_17
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_18
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-object v2, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/material/ripple/RippleNode;

    iget-object v3, v2, Landroidx/compose/material/ripple/RippleNode;->O:Lj0/i;

    check-cast v3, Lj0/j;

    iget-object v3, v3, Lj0/j;->a:Lec3/w1;

    new-instance v4, Lec3/e0;

    invoke-direct {v4, v1, v2, p1}, Lec3/e0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v6, p0, La6/c;->x:I

    invoke-virtual {v3, v4, p0}, Lec3/w1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    :goto_c
    return-object v0

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/c;->x:I

    if-eqz v1, :cond_1a

    if-ne v1, v6, :cond_19

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_d

    :cond_19
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, Ldc3/u;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v2, Lwe/o;

    invoke-direct {v2, p1, v1}, Lwe/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v3, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v3, Lw73/l;

    invoke-virtual {v3, v2}, Ll73/c;->c(Ll73/d;)V

    new-instance v2, La6/l0;

    const/16 v3, 0x1b

    invoke-direct {v2, v1, v3}, La6/l0;-><init>(Ljava/lang/Object;I)V

    iput v6, p0, La6/c;->x:I

    invoke-static {p1, v2, p0}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1b

    goto :goto_e

    :cond_1b
    :goto_d
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_e
    return-object v0

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/c;->x:I

    if-eqz v1, :cond_1d

    if-ne v1, v6, :cond_1c

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_f

    :cond_1c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1d
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v1, Lj0/i;

    check-cast v1, Lj0/j;

    iget-object v1, v1, Lj0/j;->a:Lec3/w1;

    new-instance v2, Lec3/e0;

    iget-object v4, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v4, Lp1/c1;

    invoke-direct {v2, v3, p1, v4}, Lec3/e0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v6, p0, La6/c;->x:I

    invoke-virtual {v1, v2, p0}, Lec3/w1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    :goto_f
    return-object v0

    :pswitch_7
    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Lgj/d;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, La6/c;->x:I

    if-eqz v2, :cond_1f

    if-ne v2, v6, :cond_1e

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_10

    :cond_1e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1f
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Lgj/d;->m:Lbc3/j0;

    iput v6, p0, La6/c;->x:I

    invoke-virtual {p1, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_20

    goto :goto_11

    :cond_20
    :goto_10
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_21

    invoke-virtual {v0}, Lgj/d;->c()Lqk/c;

    move-result-object p1

    iget-object p1, p1, Lqk/c;->a:Lcd3/g;

    invoke-virtual {p1}, Lcd3/g;->y()Lqk/a;

    move-result-object v0

    iget-object v1, v0, Lqk/a;->a:Ljava/lang/String;

    iget-object v0, v0, Lqk/a;->b:Ljava/lang/String;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    new-instance v2, Lqk/a;

    invoke-direct {v2, v1, v0}, Lqk/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v2, v5}, Lcd3/g;->I(Lqk/a;I)V

    :cond_21
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_11
    return-object v1

    :pswitch_8
    iget-object v0, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v0, Lgj/d;

    iget-object v1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v1, Lgj/d;

    iget-object v2, v1, Lgj/d;->a:Lgj/g;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, p0, La6/c;->x:I

    if-eqz v4, :cond_23

    if-ne v4, v6, :cond_22

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_12

    :cond_22
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_23
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v2, Lgj/g;->f:Lik/c;

    invoke-interface {p1, v0}, Lik/c;->l(Lgj/d;)Lik/b;

    move-result-object p1

    iput-object p1, v1, Lgj/d;->h:Lik/b;

    iget-object p1, v2, Lgj/g;->m:Lik/c;

    invoke-interface {p1, v0}, Lik/c;->l(Lgj/d;)Lik/b;

    move-result-object p1

    iput-object p1, v1, Lgj/d;->i:Lik/b;

    iget-object v8, v2, Lgj/g;->e:Ljava/lang/String;

    iget-object v9, v2, Lgj/g;->a:Ljava/lang/String;

    iget-object v10, v2, Lgj/g;->n:Ljc/a;

    invoke-virtual {v2}, Lgj/g;->a()Ljava/io/File;

    move-result-object v11

    iget-object p1, v2, Lgj/g;->g:Lbu/c;

    invoke-virtual {p1, v1}, Lbu/c;->E(Lgj/d;)Lfk/a;

    move-result-object v13

    const-string v12, "identity"

    new-instance v7, Lqk/b;

    invoke-direct/range {v7 .. v13}, Lqk/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljc/a;Ljava/io/File;Ljava/lang/String;Lfk/a;)V

    iget-object p1, v2, Lgj/g;->n:Ljc/a;

    invoke-virtual {p1, v7}, Ljc/a;->m(Lqk/b;)Lp0/n0;

    move-result-object p1

    iput-object p1, v1, Lgj/d;->j:Lp0/n0;

    iput v6, p0, La6/c;->x:I

    invoke-static {v0, v7, p0}, Lgj/d;->b(Lgj/d;Lqk/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_24

    goto :goto_13

    :cond_24
    :goto_12
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_13
    return-object v3

    :pswitch_9
    iget-object v0, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v0, Lgj/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, La6/c;->x:I

    if-eqz v2, :cond_28

    if-eq v2, v6, :cond_27

    if-eq v2, v5, :cond_26

    if-ne v2, v3, :cond_25

    iget-object v2, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v2, Ldc3/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_17

    :cond_25
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_26
    iget-object v2, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v2, Ldc3/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_18

    :cond_27
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_14

    :cond_28
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lwe/o;->G()Lgj/d;

    move-result-object p1

    iget-object p1, p1, Lgj/d;->m:Lbc3/j0;

    iput v6, p0, La6/c;->x:I

    invoke-virtual {p1, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_29

    goto/16 :goto_19

    :cond_29
    :goto_14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, v0, Lgj/m;->z:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Lwe/o;->G()Lgj/d;

    move-result-object v2

    invoke-virtual {v2}, Lgj/d;->f()Lik/b;

    move-result-object v2

    sget-object v4, Lik/a;->y:Lik/a;

    invoke-interface {v2, v4}, Lik/b;->c(Lik/a;)Ljava/lang/String;

    move-result-object v2

    const-wide/16 v6, -0x1

    if-eqz v2, :cond_2a

    invoke-static {v2}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_2a

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    goto :goto_15

    :cond_2a
    move-wide v8, v6

    :goto_15
    invoke-virtual {p1, v8, v9}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    invoke-virtual {v0}, Lwe/o;->G()Lgj/d;

    move-result-object p1

    invoke-virtual {p1}, Lgj/d;->f()Lik/b;

    move-result-object p1

    sget-object v2, Lik/a;->x:Lik/a;

    invoke-interface {p1, v2}, Lik/b;->c(Lik/a;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2b

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_2b

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    goto :goto_16

    :cond_2b
    const-wide/16 v8, 0x0

    :goto_16
    iput-wide v8, v0, Lgj/m;->F:J

    invoke-virtual {v0}, Lwe/o;->G()Lgj/d;

    move-result-object p1

    invoke-virtual {p1}, Lgj/d;->f()Lik/b;

    move-result-object p1

    sget-object v2, Lik/a;->z:Lik/a;

    invoke-interface {p1, v2}, Lik/b;->c(Lik/a;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2c

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_2c

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    :cond_2c
    iput-wide v6, v0, Lgj/m;->G:J

    iget-object p1, v0, Lgj/m;->y:Ldc3/h;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ldc3/c;

    invoke-direct {v2, p1}, Ldc3/c;-><init>(Ldc3/h;)V

    :cond_2d
    :goto_17
    iput-object v2, p0, La6/c;->y:Ljava/lang/Object;

    iput v5, p0, La6/c;->x:I

    invoke-virtual {v2, p0}, Ldc3/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2e

    goto :goto_19

    :cond_2e
    :goto_18
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2f

    invoke-virtual {v2}, Ldc3/c;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgj/i;

    iput-object v2, p0, La6/c;->y:Ljava/lang/Object;

    iput v3, p0, La6/c;->x:I

    invoke-static {v0, p1, p0}, Lgj/m;->d0(Lgj/m;Lgj/i;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2d

    goto :goto_19

    :cond_2f
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_19
    return-object v1

    :pswitch_a
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/c;->x:I

    if-eqz v1, :cond_31

    if-ne v1, v6, :cond_30

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1a

    :cond_30
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_31
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, Lec3/l;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lfc3/w;

    iput v6, p0, La6/c;->x:I

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_32

    goto :goto_1b

    :cond_32
    :goto_1a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1b
    return-object v0

    :pswitch_b
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/c;->x:I

    if-eqz v1, :cond_34

    if-ne v1, v6, :cond_33

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1c

    :cond_33
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_34
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, Ldc3/u;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lfc3/d;

    iput v6, p0, La6/c;->x:I

    invoke-virtual {v1, p1, p0}, Lfc3/d;->e(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_35

    goto :goto_1d

    :cond_35
    :goto_1c
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1d
    return-object v0

    :pswitch_c
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/c;->x:I

    if-eqz v1, :cond_37

    if-ne v1, v6, :cond_36

    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Lf6/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1e

    :cond_36
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_37
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, Lf6/f;

    invoke-virtual {p1}, Lf6/f;->c()Lf6/a;

    move-result-object p1

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    iput-object p1, p0, La6/c;->y:Ljava/lang/Object;

    iput v6, p0, La6/c;->x:I

    invoke-interface {v1, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_38

    goto :goto_1e

    :cond_38
    move-object v0, p1

    :goto_1e
    return-object v0

    :pswitch_d
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/c;->x:I

    if-eqz v1, :cond_3a

    if-ne v1, v6, :cond_39

    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1f

    :cond_39
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, Ldc3/o;

    iget-object p1, p1, Ldc3/o;->a:Ljava/lang/Object;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    instance-of v2, p1, Ldc3/n;

    if-nez v2, :cond_3c

    iput-object p1, p0, La6/c;->y:Ljava/lang/Object;

    iput v6, p0, La6/c;->x:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3b

    goto :goto_20

    :cond_3b
    move-object v0, p1

    :goto_1f
    move-object p1, v0

    :cond_3c
    nop

    instance-of v0, p1, Ldc3/m;

    if-eqz v0, :cond_3e

    check-cast p1, Ldc3/m;

    iget-object p1, p1, Ldc3/m;->a:Ljava/lang/Throwable;

    if-nez p1, :cond_3d

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_20

    :cond_3d
    throw p1

    :cond_3e
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_20
    return-object v0

    :pswitch_e
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/c;->x:I

    if-eqz v1, :cond_40

    if-ne v1, v6, :cond_3f

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_21

    :cond_3f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_40
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, Ldc3/u;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lec3/l;

    new-instance v2, La6/z;

    invoke-direct {v2, p1, v5}, La6/z;-><init>(Ljava/lang/Object;I)V

    iput v6, p0, La6/c;->x:I

    invoke-interface {v1, v2, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_41

    goto :goto_22

    :cond_41
    :goto_21
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_22
    return-object v0

    :pswitch_f
    iget-object v0, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v0, Lck/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v7, p0, La6/c;->x:I

    if-eqz v7, :cond_43

    if-ne v7, v6, :cond_42

    iget-object v7, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v7, Ldc3/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_24

    :cond_42
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_43
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Lck/e;->w:Lcom/iterable/iterableapi/e;

    iget-object p1, p1, Lcom/iterable/iterableapi/e;->x:Ljava/lang/Object;

    check-cast p1, Ldc3/h;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Ldc3/c;

    invoke-direct {v7, p1}, Ldc3/c;-><init>(Ldc3/h;)V

    :cond_44
    :goto_23
    iput-object v7, p0, La6/c;->y:Ljava/lang/Object;

    iput v6, p0, La6/c;->x:I

    invoke-virtual {v7, p0}, Ldc3/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_45

    goto :goto_26

    :cond_45
    :goto_24
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4d

    invoke-virtual {v7}, Ldc3/c;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lek/a;

    iget-object v8, p1, Lek/a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v8}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/app/Activity;

    if-eqz v8, :cond_44

    iget p1, p1, Lek/a;->b:I

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    if-eqz p1, :cond_4b

    if-eq p1, v6, :cond_4a

    if-eq p1, v5, :cond_49

    if-eq p1, v3, :cond_48

    if-eq p1, v1, :cond_47

    const/4 v9, 0x5

    if-eq p1, v9, :cond_46

    goto :goto_23

    :cond_46
    invoke-virtual {v0, v8}, Lck/e;->onActivityDestroyed(Landroid/app/Activity;)V

    goto :goto_23

    :cond_47
    invoke-virtual {v0, v8}, Lck/e;->onActivityStopped(Landroid/app/Activity;)V

    goto :goto_23

    :cond_48
    invoke-virtual {v0, v8}, Lck/e;->onActivityPaused(Landroid/app/Activity;)V

    goto :goto_23

    :cond_49
    invoke-virtual {v0, v8}, Lck/e;->onActivityResumed(Landroid/app/Activity;)V

    goto :goto_23

    :cond_4a
    invoke-virtual {v0, v8}, Lck/e;->onActivityStarted(Landroid/app/Activity;)V

    goto :goto_23

    :cond_4b
    invoke-virtual {v8}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_4c

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    goto :goto_25

    :cond_4c
    move-object p1, v4

    :goto_25
    invoke-virtual {v0, v8, p1}, Lck/e;->onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_23

    :cond_4d
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_26
    return-object v2

    :pswitch_10
    iget-object v0, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v0, Lcoil/compose/AsyncImagePainter;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, La6/c;->x:I

    if-eqz v3, :cond_4f

    if-ne v3, v6, :cond_4e

    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Lcoil/compose/AsyncImagePainter;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_29

    :cond_4e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4f
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, Lmh/j;

    iget-object v3, v0, Lcoil/compose/AsyncImagePainter;->S:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbh/e;

    invoke-static {p1}, Lmh/j;->a(Lmh/j;)Lmh/h;

    move-result-object v5

    new-instance v7, Lbu/c;

    invoke-direct {v7, v0}, Lbu/c;-><init>(Ljava/lang/Object;)V

    iput-object v7, v5, Lmh/h;->d:Loh/a;

    iput-object v4, v5, Lmh/h;->w:Landroidx/lifecycle/x;

    iput-object v4, v5, Lmh/h;->x:Lnh/i;

    iput-object v4, v5, Lmh/h;->y:Lnh/g;

    iget-object p1, p1, Lmh/j;->E:Lmh/d;

    iget-object v7, p1, Lmh/d;->a:Lnh/i;

    if-nez v7, :cond_50

    new-instance v7, Lad3/z;

    invoke-direct {v7, v0, v1}, Lad3/z;-><init>(Ljava/lang/Object;I)V

    iput-object v7, v5, Lmh/h;->u:Lnh/i;

    iput-object v4, v5, Lmh/h;->w:Landroidx/lifecycle/x;

    iput-object v4, v5, Lmh/h;->x:Lnh/i;

    iput-object v4, v5, Lmh/h;->y:Lnh/g;

    :cond_50
    iget-object v1, p1, Lmh/d;->b:Lnh/g;

    if-nez v1, :cond_53

    iget-object v1, v0, Lcoil/compose/AsyncImagePainter;->N:Ly2/k;

    sget-object v7, Lch/v;->b:Lnh/e;

    sget-object v7, Ly2/j;->b:Ly2/b1;

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_52

    sget-object v7, Ly2/j;->e:Ly2/b1;

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_51

    goto :goto_27

    :cond_51
    sget-object v1, Lnh/g;->w:Lnh/g;

    goto :goto_28

    :cond_52
    :goto_27
    sget-object v1, Lnh/g;->x:Lnh/g;

    :goto_28
    iput-object v1, v5, Lmh/h;->v:Lnh/g;

    :cond_53
    iget-object p1, p1, Lmh/d;->d:Lnh/d;

    sget-object v1, Lnh/d;->w:Lnh/d;

    if-eq p1, v1, :cond_54

    sget-object p1, Lnh/d;->x:Lnh/d;

    iput-object p1, v5, Lmh/h;->g:Lnh/d;

    :cond_54
    invoke-virtual {v5}, Lmh/h;->a()Lmh/j;

    move-result-object p1

    iput-object v0, p0, La6/c;->y:Ljava/lang/Object;

    iput v6, p0, La6/c;->x:I

    check-cast v3, Lbh/j;

    invoke-virtual {v3, p1, p0}, Lbh/j;->b(Lmh/j;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_55

    goto :goto_2a

    :cond_55
    :goto_29
    check-cast p1, Lmh/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v1, p1, Lmh/o;

    if-eqz v1, :cond_56

    new-instance v2, Lcoil/compose/AsyncImagePainter$State$Success;

    check-cast p1, Lmh/o;

    iget-object v1, p1, Lmh/o;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Lcoil/compose/AsyncImagePainter;->j(Landroid/graphics/drawable/Drawable;)Ln2/a;

    move-result-object v0

    invoke-direct {v2, v0, p1}, Lcoil/compose/AsyncImagePainter$State$Success;-><init>(Ln2/a;Lmh/o;)V

    goto :goto_2a

    :cond_56
    instance-of v1, p1, Lmh/e;

    if-eqz v1, :cond_58

    new-instance v2, Lcoil/compose/AsyncImagePainter$State$Error;

    check-cast p1, Lmh/e;

    invoke-virtual {p1}, Lmh/e;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_57

    invoke-virtual {v0, v1}, Lcoil/compose/AsyncImagePainter;->j(Landroid/graphics/drawable/Drawable;)Ln2/a;

    move-result-object v4

    :cond_57
    invoke-direct {v2, v4, p1}, Lcoil/compose/AsyncImagePainter$State$Error;-><init>(Ln2/a;Lmh/e;)V

    :goto_2a
    return-object v2

    :cond_58
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_11
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/c;->x:I

    if-eqz v1, :cond_5a

    if-ne v1, v6, :cond_59

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2b

    :cond_59
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, Lbh/j;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Lmh/j;

    iput v6, p0, La6/c;->x:I

    invoke-static {p1, v1, v6, p0}, Lbh/j;->a(Lbh/j;Lmh/j;ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5b

    move-object p1, v0

    :cond_5b
    :goto_2b
    return-object p1

    :pswitch_12
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/c;->x:I

    if-eqz v1, :cond_5d

    if-eq v1, v6, :cond_5c

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5c
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2c

    :cond_5d
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, Lec3/f2;

    new-instance v1, La6/z;

    iget-object v2, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v2, Lb3/o2;

    invoke-direct {v1, v2, v6}, La6/z;-><init>(Ljava/lang/Object;I)V

    iput v6, p0, La6/c;->x:I

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5e

    return-object v0

    :cond_5e
    :goto_2c
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :pswitch_13
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    iget-object v1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v1, Lp1/y1;

    iget-object v2, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v7, p0, La6/c;->x:I

    const v8, 0x7f0a015f

    if-eqz v7, :cond_60

    if-ne v7, v6, :cond_5f

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2e

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto :goto_30

    :cond_5f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_60
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iput v6, p0, La6/c;->x:I

    iget-object p1, v1, Lp1/y1;->u:Lec3/h2;

    new-instance v6, La6/p;

    invoke-direct {v6, v5, v5, v4}, La6/p;-><init>(IILq83/d;)V

    invoke-static {p1, v6, p0}, Lec3/v;->z(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p1, v3, :cond_61

    goto :goto_2d

    :cond_61
    move-object p1, v0

    :goto_2d
    if-ne p1, v3, :cond_62

    move-object v0, v3

    goto :goto_2f

    :cond_62
    :goto_2e
    invoke-static {v2}, Lb3/t3;->b(Landroid/view/View;)Lp1/t;

    move-result-object p1

    if-ne p1, v1, :cond_63

    invoke-virtual {v2, v8, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_63
    :goto_2f
    return-object v0

    :goto_30
    invoke-static {v2}, Lb3/t3;->b(Landroid/view/View;)Lp1/t;

    move-result-object v0

    if-ne v0, v1, :cond_64

    invoke-virtual {v2, v8, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_64
    throw p1

    :pswitch_14
    iget-object v0, p0, La6/c;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc93/a;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, p0, La6/c;->x:I

    if-eqz v2, :cond_66

    if-ne v2, v6, :cond_65

    :try_start_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_31

    :catchall_2
    move-exception v0

    move-object p1, v0

    goto :goto_33

    :cond_65
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_66
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_4
    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, Landroidx/room/i2;

    iput v6, p0, La6/c;->x:I

    invoke-static {p1, p0}, Landroidx/room/i2;->b(Landroidx/room/i2;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_67

    goto :goto_32

    :cond_67
    :goto_31
    check-cast p1, Ljava/util/Set;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_32
    return-object v0

    :goto_33
    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    throw p1

    :pswitch_15
    iget-object v0, p0, La6/c;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/lifecycle/p0;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v0, p0, La6/c;->x:I

    if-eqz v0, :cond_6b

    if-eq v0, v6, :cond_6a

    if-eq v0, v5, :cond_69

    if-eq v0, v3, :cond_68

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_68
    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_38

    :cond_69
    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/lifecycle/v0;

    :try_start_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v0

    move-object p1, v0

    goto :goto_36

    :cond_6a
    iget-object v0, p0, La6/c;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/lifecycle/v0;

    :try_start_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_34

    :cond_6b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, Ldc3/u;

    new-instance v8, Landroidx/lifecycle/p;

    invoke-direct {v8, p1, v2}, Landroidx/lifecycle/p;-><init>(Ljava/lang/Object;I)V

    :try_start_7
    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    sget-object p1, Lhc3/o;->a:Lbc3/w1;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    :try_start_8
    invoke-virtual {p1}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object p1

    new-instance v0, La6/q;

    invoke-direct {v0, v1, v8, v4, v6}, La6/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object v8, p0, La6/c;->y:Ljava/lang/Object;

    iput v6, p0, La6/c;->x:I

    invoke-static {p1, v0, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    if-ne p1, v7, :cond_6c

    goto :goto_37

    :cond_6c
    move-object v2, v8

    :goto_34
    :try_start_9
    iput-object v2, p0, La6/c;->y:Ljava/lang/Object;

    iput v5, p0, La6/c;->x:I

    invoke-static {p0}, Lbc3/m0;->a(Ls83/c;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_37

    :catchall_4
    move-exception v0

    move-object p1, v0

    :goto_35
    move-object v2, v8

    goto :goto_36

    :catchall_5
    move-exception v0

    move-object p1, v0

    move-object v0, p1

    goto :goto_35

    :goto_36
    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    sget-object p1, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {p1}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object p1

    sget-object v6, Lbc3/y1;->w:Lbc3/y1;

    invoke-virtual {p1, v6}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    new-instance v6, La6/q;

    invoke-direct {v6, v1, v2, v4, v5}, La6/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object v0, p0, La6/c;->y:Ljava/lang/Object;

    iput v3, p0, La6/c;->x:I

    invoke-static {p1, v6, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_6d

    :goto_37
    return-object v7

    :cond_6d
    :goto_38
    throw v0

    :pswitch_16
    iget-object v0, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v0, Lzt/q;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, La6/c;->x:I

    if-eqz v2, :cond_70

    if-eq v2, v6, :cond_6f

    if-ne v2, v5, :cond_6e

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3a

    :cond_6e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6f
    iget-object v2, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v2, La6/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_39

    :cond_70
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Lzt/q;->E:Ljava/lang/Object;

    check-cast p1, Laj/d;

    iget-object p1, p1, Laj/d;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-lez p1, :cond_74

    :cond_71
    iget-object p1, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    invoke-static {p1}, Lbc3/f0;->n(Lbc3/c0;)V

    iget-object p1, v0, Lzt/q;->y:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, La6/c;

    iget-object p1, v0, Lzt/q;->z:Ljava/lang/Object;

    check-cast p1, Ldc3/h;

    iput-object v2, p0, La6/c;->y:Ljava/lang/Object;

    iput v6, p0, La6/c;->x:I

    invoke-virtual {p1, p0}, Ldc3/h;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_72

    goto :goto_3b

    :cond_72
    :goto_39
    iput-object v4, p0, La6/c;->y:Ljava/lang/Object;

    iput v5, p0, La6/c;->x:I

    invoke-interface {v2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_73

    goto :goto_3b

    :cond_73
    :goto_3a
    iget-object p1, v0, Lzt/q;->E:Ljava/lang/Object;

    check-cast p1, Laj/d;

    iget-object p1, p1, Laj/d;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_71

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_3b
    return-object v1

    :cond_74
    const-string p1, "Check failed."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_17
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/c;->x:I

    if-eqz v1, :cond_76

    if-ne v1, v6, :cond_75

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3c

    :cond_75
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_76
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, La6/t0;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, La6/i0;

    iput v6, p0, La6/c;->x:I

    invoke-static {v1, p1, p0}, La6/i0;->c(La6/i0;La6/t0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_77

    goto :goto_3d

    :cond_77
    :goto_3c
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3d
    return-object v0

    :pswitch_18
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/c;->x:I

    if-eqz v1, :cond_79

    if-ne v1, v6, :cond_78

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3e

    :cond_78
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_79
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, Lc93/m;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, La6/b;

    iget-object v1, v1, La6/b;->b:Ljava/lang/Object;

    iput v6, p0, La6/c;->x:I

    invoke-interface {p1, v1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7a

    move-object p1, v0

    :cond_7a
    :goto_3e
    return-object p1

    :pswitch_19
    iget-object v0, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v0, La6/t0;

    iget-object v1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast v1, La6/i0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v7, p0, La6/c;->x:I

    if-eqz v7, :cond_7e

    if-eq v7, v6, :cond_7b

    if-eq v7, v5, :cond_7d

    if-ne v7, v3, :cond_7c

    :cond_7b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_42

    :cond_7c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7d
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_40

    :cond_7e
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v1, La6/i0;->g:Lbu/c;

    invoke-virtual {p1}, Lbu/c;->C()La6/e1;

    move-result-object p1

    instance-of v7, p1, La6/b;

    if-eqz v7, :cond_7f

    iget-object p1, v0, La6/t0;->a:Lc93/m;

    iget-object v0, v0, La6/t0;->d:Lq83/j;

    iput v6, p0, La6/c;->x:I

    invoke-virtual {v1}, La6/i0;->h()La6/d1;

    move-result-object v3

    new-instance v5, La6/f0;

    invoke-direct {v5, v1, v0, p1, v4}, La6/f0;-><init>(La6/i0;Lq83/j;Lc93/m;Lq83/d;)V

    invoke-virtual {v3, v5, p0}, La6/d1;->b(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_85

    goto :goto_41

    :cond_7f
    instance-of v6, p1, La6/v0;

    if-nez v6, :cond_83

    instance-of v6, p1, La6/h1;

    if-eqz v6, :cond_80

    goto :goto_3f

    :cond_80
    instance-of v0, p1, La6/s0;

    if-nez v0, :cond_82

    instance-of p1, p1, La6/u0;

    if-eqz p1, :cond_81

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_81
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_82
    check-cast p1, La6/s0;

    iget-object p1, p1, La6/s0;->b:Ljava/lang/Throwable;

    throw p1

    :cond_83
    :goto_3f
    iget-object v6, v0, La6/t0;->c:La6/e1;

    if-ne p1, v6, :cond_86

    iput v5, p0, La6/c;->x:I

    invoke-static {v1, p0}, La6/i0;->e(La6/i0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_84

    goto :goto_41

    :cond_84
    :goto_40
    iget-object p1, v0, La6/t0;->a:Lc93/m;

    iget-object v0, v0, La6/t0;->d:Lq83/j;

    iput v3, p0, La6/c;->x:I

    invoke-virtual {v1}, La6/i0;->h()La6/d1;

    move-result-object v3

    new-instance v5, La6/f0;

    invoke-direct {v5, v1, v0, p1, v4}, La6/f0;-><init>(La6/i0;Lq83/j;Lc93/m;Lq83/d;)V

    invoke-virtual {v3, v5, p0}, La6/d1;->b(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_85

    :goto_41
    move-object p1, v2

    :cond_85
    :goto_42
    return-object p1

    :cond_86
    check-cast p1, La6/v0;

    iget-object p1, p1, La6/v0;->b:Ljava/lang/Throwable;

    throw p1

    :pswitch_1a
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/c;->x:I

    if-eqz v1, :cond_88

    if-ne v1, v6, :cond_87

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_43

    :cond_87
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_88
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/c;->y:Ljava/lang/Object;

    check-cast p1, La6/m;

    iget-object v1, p0, La6/c;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iput v6, p0, La6/c;->x:I

    invoke-static {v1, p1, p0}, Lge3/g;->e(Ljava/util/List;La6/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_89

    goto :goto_44

    :cond_89
    :goto_43
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_44
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
