.class public final Le;
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
.method public constructor <init>(Landroidx/lifecycle/b0;Lc93/m;Lq83/d;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Le;->w:I

    .line 1
    iput-object p1, p0, Le;->y:Ljava/lang/Object;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Le;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p4, p0, Le;->w:I

    iput-object p1, p0, Le;->y:Ljava/lang/Object;

    iput-object p2, p0, Le;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 3
    iput p3, p0, Le;->w:I

    iput-object p1, p0, Le;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Lp1/t2;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 4
    iput p4, p0, Le;->w:I

    iput-object p1, p0, Le;->z:Ljava/lang/Object;

    iput-object p2, p0, Le;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Le;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Le;

    iget-object v0, p0, Le;->y:Ljava/lang/Object;

    check-cast v0, Ld1/k;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Lb2/y;

    const/16 v2, 0x1d

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Le;

    iget-object v0, p0, Le;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Ld1/f;

    const/16 v2, 0x1c

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Le;

    iget-object v0, p0, Le;->y:Ljava/lang/Object;

    check-cast v0, Ld1/b;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Ld1/j;

    const/16 v2, 0x1b

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Le;

    iget-object v0, p0, Le;->y:Ljava/lang/Object;

    check-cast v0, Lcz/n0;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    const/16 v2, 0x1a

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance v0, Le;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Lcz/n0;

    const/16 v2, 0x19

    invoke-direct {v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Le;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_4
    new-instance v0, Le;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Lc4/f0;

    const/16 v2, 0x18

    invoke-direct {v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Le;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_5
    new-instance v0, Le;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Lbi/o;

    const/16 v2, 0x17

    invoke-direct {v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Le;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_6
    new-instance p1, Le;

    iget-object v0, p0, Le;->y:Ljava/lang/Object;

    check-cast v0, Lbh/j;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Lmh/j;

    const/16 v2, 0x16

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_7
    new-instance p1, Le;

    iget-object v0, p0, Le;->z:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Le;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    const/16 v2, 0x15

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Lp1/t2;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_8
    new-instance p1, Le;

    iget-object v0, p0, Le;->y:Ljava/lang/Object;

    check-cast v0, Le30/c;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    const/16 v2, 0x14

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_9
    new-instance v0, Le;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    const/16 v2, 0x13

    invoke-direct {v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Le;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_a
    new-instance p1, Le;

    iget-object v0, p0, Le;->y:Ljava/lang/Object;

    check-cast v0, Lec3/l;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/16 v2, 0x12

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_b
    new-instance p1, Le;

    iget-object v0, p0, Le;->z:Ljava/lang/Object;

    check-cast v0, Lb30/y0;

    const/16 v1, 0x11

    invoke-direct {p1, v0, p2, v1}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_c
    new-instance p1, Le;

    iget-object v0, p0, Le;->z:Ljava/lang/Object;

    check-cast v0, Lb30/y0;

    const/16 v1, 0x10

    invoke-direct {p1, v0, p2, v1}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_d
    new-instance p1, Le;

    iget-object v0, p0, Le;->y:Ljava/lang/Object;

    check-cast v0, Lb30/m;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/16 v2, 0xf

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_e
    new-instance v0, Le;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Lb3/x0;

    const/16 v2, 0xe

    invoke-direct {v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Le;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_f
    new-instance v0, Le;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Lay/b0;

    const/16 v2, 0xd

    invoke-direct {v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Le;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_10
    new-instance p1, Le;

    iget-object v0, p0, Le;->y:Ljava/lang/Object;

    check-cast v0, Lay/b0;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Lay/a;

    const/16 v2, 0xc

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_11
    new-instance p1, Le;

    iget-object v0, p0, Le;->y:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    const/16 v2, 0xb

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_12
    new-instance p1, Le;

    iget-object v0, p0, Le;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/r0;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    const/16 v2, 0xa

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_13
    new-instance p1, Le;

    iget-object v0, p0, Le;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/b0;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    invoke-direct {p1, v0, v1, p2}, Le;-><init>(Landroidx/lifecycle/b0;Lc93/m;Lq83/d;)V

    return-object p1

    :pswitch_14
    new-instance v0, Le;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Lec3/l;

    const/16 v2, 0x8

    invoke-direct {v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Le;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_15
    new-instance v0, Le;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, La30/w0;

    const/4 v2, 0x7

    invoke-direct {v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Le;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_16
    new-instance p1, Le;

    iget-object v0, p0, Le;->z:Ljava/lang/Object;

    check-cast v0, La43/f;

    const/4 v1, 0x6

    invoke-direct {p1, v0, p2, v1}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_17
    new-instance p1, Le;

    iget-object v0, p0, Le;->y:Ljava/lang/Object;

    check-cast v0, La33/d;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x5

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_18
    new-instance p1, Le;

    iget-object v0, p0, Le;->y:Ljava/lang/Object;

    check-cast v0, La30/a0;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Lmy/a;

    const/4 v2, 0x4

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_19
    new-instance p1, Le;

    iget-object v0, p0, Le;->y:Ljava/lang/Object;

    check-cast v0, Lkz/n;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, La20/j;

    const/4 v2, 0x3

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1a
    new-instance p1, Le;

    iget-object v0, p0, Le;->y:Ljava/lang/Object;

    check-cast v0, Ljz/o;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, La20/j;

    const/4 v2, 0x2

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1b
    new-instance p1, Le;

    iget-object v0, p0, Le;->z:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    iget-object v1, p0, Le;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Lp1/t2;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1c
    new-instance p1, Le;

    iget-object v0, p0, Le;->y:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Le;->z:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, p2, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

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

    iget v0, p0, Le;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_3
    check-cast p1, Lcz/e0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lbi/s;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lu2/v;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lb3/i2;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_f
    check-cast p1, Lay/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Landroidx/lifecycle/q0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    move-object/from16 v5, p0

    iget v0, v5, Le;->w:I

    sget-object v1, Lz10/o;->w:Lz10/o;

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x2

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    iget-object v10, v5, Le;->z:Ljava/lang/Object;

    const-string v11, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v12, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_1

    if-eq v1, v12, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-static/range {p1 .. p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object v0

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Ld1/k;

    check-cast v10, Lb2/y;

    iput v12, v5, Le;->x:I

    invoke-static {v1, v10, v5}, Lb3/u2;->a(Ld1/k;Lb2/y;Ls83/c;)V

    return-object v0

    :pswitch_0
    check-cast v10, Ld1/f;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    const/4 v2, 0x0

    const-wide/16 v13, 0x1f4

    const/high16 v4, 0x3f800000    # 1.0f

    if-eqz v1, :cond_6

    if-eq v1, v12, :cond_5

    if-eq v1, v8, :cond_4

    if-eq v1, v7, :cond_3

    if-ne v1, v3, :cond_2

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/k1;

    if-eqz v1, :cond_7

    iput v12, v5, Le;->x:I

    invoke-static {v1, v5}, Lbc3/f0;->j(Lbc3/k1;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_7

    goto :goto_3

    :cond_7
    :goto_0
    :try_start_2
    iget-object v1, v10, Ld1/f;->c:Lp1/g1;

    invoke-virtual {v1, v4}, Lp1/g1;->y(F)V

    iget-boolean v1, v10, Ld1/f;->a:Z

    if-nez v1, :cond_8

    iput v8, v5, Le;->x:I

    invoke-static {v5}, Lbc3/m0;->a(Ls83/c;)V

    goto :goto_3

    :cond_8
    :goto_1
    iput v7, v5, Le;->x:I

    invoke-static {v13, v14, v5}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_9

    goto :goto_3

    :cond_9
    :goto_2
    iget-object v1, v10, Ld1/f;->c:Lp1/g1;

    invoke-virtual {v1, v2}, Lp1/g1;->y(F)V

    iput v3, v5, Le;->x:I

    invoke-static {v13, v14, v5}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_a

    :goto_3
    return-object v0

    :cond_a
    :goto_4
    iget-object v1, v10, Ld1/f;->c:Lp1/g1;

    invoke-virtual {v1, v4}, Lp1/g1;->y(F)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_5
    iget-object v1, v10, Ld1/f;->c:Lp1/g1;

    invoke-virtual {v1, v2}, Lp1/g1;->y(F)V

    throw v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_d

    if-eq v1, v12, :cond_c

    if-eq v1, v8, :cond_b

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    invoke-static/range {p1 .. p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object v0

    throw v0

    :cond_c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Lev2/b;

    const/16 v3, 0xd

    invoke-direct {v1, v3}, Lev2/b;-><init>(I)V

    iput v12, v5, Le;->x:I

    invoke-static {v1, v5}, Lp1/x;->N(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_e

    :goto_6
    move-object v9, v0

    goto :goto_8

    :cond_e
    :goto_7
    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Ld1/b;

    invoke-virtual {v1}, Ld1/b;->i()Lec3/o1;

    move-result-object v1

    if-eqz v1, :cond_f

    new-instance v3, Lu;

    check-cast v10, Ld1/j;

    invoke-direct {v3, v10, v2}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v8, v5, Le;->x:I

    check-cast v1, Lec3/w1;

    invoke-static {v1, v3, v5}, Lec3/w1;->k(Lec3/w1;Lec3/m;Lq83/d;)V

    goto :goto_6

    :cond_f
    :goto_8
    return-object v9

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_13

    if-eq v1, v12, :cond_12

    if-ne v1, v8, :cond_11

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez p1, :cond_10

    invoke-static {}, Lcom/squareup/wire/n;->x()V

    throw v6

    :cond_10
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_9

    :cond_13
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Lcz/n0;

    iput v12, v5, Le;->x:I

    iget-object v1, v1, Lcz/n0;->y:Lhm/d;

    invoke-virtual {v1, v5}, Lhm/d;->e(Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_14

    return-object v0

    :cond_14
    :goto_9
    if-nez v1, :cond_15

    iput v8, v5, Le;->x:I

    throw v6

    :cond_15
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :pswitch_3
    check-cast v10, Lcz/n0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_17

    if-ne v1, v12, :cond_16

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_a

    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Lcz/e0;

    iget-boolean v1, v1, Lcz/e0;->h:Z

    if-nez v1, :cond_19

    iget-object v1, v10, Lcz/n0;->M:Ln53/e;

    iget-object v1, v1, Ln53/e;->y:Ll83/e;

    check-cast v1, Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lcz/r0;

    if-eqz v1, :cond_19

    iput v12, v5, Le;->x:I

    const-wide/16 v1, 0x32

    invoke-static {v1, v2, v5}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_18

    move-object v9, v0

    goto :goto_b

    :cond_18
    :goto_a
    invoke-virtual {v10, v12}, Lcz/n0;->u(Z)V

    throw v6

    :cond_19
    :goto_b
    return-object v9

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_1b

    if-ne v1, v12, :cond_1a

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_d

    :cond_1a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    :cond_1c
    :goto_c
    invoke-static {v1}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result v2

    if-eqz v2, :cond_20

    sget-object v2, Lc4/d;->y:Lc4/d;

    iput-object v1, v5, Le;->y:Ljava/lang/Object;

    iput v12, v5, Le;->x:I

    invoke-interface {v5}, Lq83/d;->getContext()Lq83/j;

    move-result-object v3

    sget-object v6, Lb3/h2;->w:Lb3/h2;

    invoke-interface {v3, v6}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v3

    if-nez v3, :cond_1f

    invoke-interface {v5}, Lq83/d;->getContext()Lq83/j;

    move-result-object v3

    invoke-static {v3}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object v3

    invoke-interface {v3, v2, v5}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_1d

    move-object v9, v0

    goto :goto_e

    :cond_1d
    :goto_d
    move-object v2, v10

    check-cast v2, Lc4/f0;

    iget-object v3, v2, Lc4/f0;->e0:[I

    aget v6, v3, v4

    aget v7, v3, v12

    iget-object v8, v2, Lc4/f0;->M:Landroid/view/View;

    invoke-virtual {v8, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    aget v8, v3, v4

    if-ne v6, v8, :cond_1e

    aget v3, v3, v12

    if-eq v7, v3, :cond_1c

    :cond_1e
    invoke-virtual {v2}, Lc4/f0;->l()V

    goto :goto_c

    :cond_1f
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_20
    :goto_e
    return-object v9

    :pswitch_5
    check-cast v10, Lbi/o;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_22

    if-ne v1, v12, :cond_21

    iget-object v0, v5, Le;->y:Ljava/lang/Object;

    check-cast v0, Lbi/s;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_f

    :cond_21
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Lbi/s;

    iget-object v2, v1, Lbi/s;->e:Lbi/t;

    if-eqz v2, :cond_24

    iput-object v1, v5, Le;->y:Ljava/lang/Object;

    iput v12, v5, Le;->x:I

    invoke-static {v10, v2, v5}, Lbi/o;->b(Lbi/o;Lbi/t;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_23

    goto :goto_10

    :cond_23
    move-object v0, v1

    :goto_f
    check-cast v2, Lsh/q;

    iget-object v1, v10, Lbi/o;->a:Ljava/lang/String;

    iget-object v0, v0, Lbi/s;->d:Lbi/q;

    invoke-virtual {v0}, Lbi/q;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lbi/o;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lsh/h;->z:Lsh/h;

    new-instance v3, Luh/h;

    invoke-direct {v3, v2, v0, v1}, Luh/h;-><init>(Lsh/q;Ljava/lang/String;Lsh/h;)V

    move-object v0, v3

    :goto_10
    return-object v0

    :cond_24
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "body == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_6
    iget-object v0, v5, Le;->y:Ljava/lang/Object;

    check-cast v0, Lbh/j;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, Le;->x:I

    if-eqz v2, :cond_26

    if-ne v2, v12, :cond_25

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_11

    :cond_25
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_26
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v10, Lmh/j;

    iput v12, v5, Le;->x:I

    invoke-static {v0, v10, v4, v5}, Lbh/j;->a(Lbh/j;Lmh/j;ILs83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_27

    goto :goto_12

    :cond_27
    :goto_11
    move-object v1, v0

    check-cast v1, Lmh/k;

    move-object v1, v0

    :goto_12
    return-object v1

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_29

    if-ne v1, v12, :cond_28

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_13

    :cond_28
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_29
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v10, Lp1/c1;

    sget-object v1, Lb30/c4;->a:Lc0/l0;

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2b

    iput v12, v5, Le;->x:I

    const-wide/16 v1, 0x5dc

    invoke-static {v1, v2, v5}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2a

    move-object v9, v0

    goto :goto_14

    :cond_2a
    :goto_13
    iget-object v0, v5, Le;->y:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    sget-object v1, Lb30/c4;->a:Lc0/l0;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_2b
    :goto_14
    return-object v9

    :pswitch_8
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_2d

    if-eq v1, v12, :cond_2c

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2c
    invoke-static/range {p1 .. p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object v0

    throw v0

    :cond_2d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Le30/c;

    instance-of v2, v1, Lh20/k4;

    if-eqz v2, :cond_2e

    move-object v6, v1

    check-cast v6, Lh20/k4;

    :cond_2e
    if-eqz v6, :cond_2f

    iget-object v1, v6, Lh20/k4;->m0:Ln53/e;

    if-eqz v1, :cond_2f

    new-instance v2, Lay/m;

    check-cast v10, Lp1/c1;

    invoke-direct {v2, v12, v10}, Lay/m;-><init>(ILp1/c1;)V

    iput v12, v5, Le;->x:I

    invoke-virtual {v1, v2, v5}, Ln53/e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-object v9, v0

    :cond_2f
    return-object v9

    :pswitch_9
    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v0, v5, Le;->x:I

    if-eqz v0, :cond_31

    if-ne v0, v12, :cond_30

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_15

    :cond_30
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_31
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Le;->y:Ljava/lang/Object;

    check-cast v0, Lu2/v;

    check-cast v10, Lp1/c1;

    new-instance v4, Laq1/d;

    invoke-direct {v4, v3, v10}, Laq1/d;-><init>(ILp1/c1;)V

    iput v12, v5, Le;->x:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x7

    invoke-static/range {v0 .. v6}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_32

    move-object v9, v7

    :cond_32
    :goto_15
    return-object v9

    :pswitch_a
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_34

    if-ne v1, v12, :cond_33

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_16

    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Lec3/l;

    invoke-static {v1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object v1

    new-instance v2, Lu;

    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-direct {v2, v10, v3}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v12, v5, Le;->x:I

    invoke-interface {v1, v2, v5}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_35

    move-object v9, v0

    :cond_35
    :goto_16
    return-object v9

    :pswitch_b
    check-cast v10, Lb30/y0;

    iget-object v0, v10, Lb30/y0;->s:Lec3/h2;

    iget-object v1, v10, Lb30/y0;->r:Lec3/h2;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v13, v5, Le;->x:I

    packed-switch v13, :pswitch_data_1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1f

    :pswitch_d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1d

    :pswitch_e
    iget-object v3, v5, Le;->y:Ljava/lang/Object;

    check-cast v3, Ll83/n;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v3

    move-object/from16 v3, p1

    goto/16 :goto_1b

    :pswitch_f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    goto :goto_19

    :pswitch_10
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_18

    :pswitch_11
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_17

    :pswitch_12
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v10}, Lb30/y0;->b()Lzy/b;

    move-result-object v11

    iput v12, v5, Le;->x:I

    invoke-virtual {v1, v11, v5}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v9, v4, :cond_36

    goto/16 :goto_1e

    :cond_36
    :goto_17
    sget-object v11, Lb30/d6;->y:Lb30/d6;

    iput v8, v5, Le;->x:I

    invoke-virtual {v0, v11, v5}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v9, v4, :cond_37

    goto/16 :goto_1e

    :cond_37
    :goto_18
    iput v7, v5, Le;->x:I

    invoke-static {v10, v5}, Lb30/y0;->a(Lb30/y0;Ls83/c;)Ljava/io/Serializable;

    move-result-object v7

    if-ne v7, v4, :cond_38

    goto/16 :goto_1e

    :cond_38
    :goto_19
    check-cast v7, Ll83/n;

    iput-object v7, v5, Le;->y:Ljava/lang/Object;

    iput v3, v5, Le;->x:I

    iget-object v3, v10, Lb30/y0;->C:Ln53/e;

    iget-object v3, v3, Ln53/e;->y:Ll83/e;

    check-cast v3, Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_3a

    iget-object v3, v10, Lb30/y0;->u:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_3a

    iget-object v3, v10, Lb30/y0;->m:Lc93/m;

    iget-object v8, v10, Lb30/y0;->c:Lh20/l;

    iget-object v8, v8, Lh20/l;->b:Ly00/o4;

    invoke-interface {v3, v8, v5}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_39

    goto :goto_1a

    :cond_39
    check-cast v3, Ll83/n;

    goto :goto_1a

    :cond_3a
    move-object v3, v6

    :goto_1a
    if-ne v3, v4, :cond_3b

    goto/16 :goto_1e

    :cond_3b
    :goto_1b
    check-cast v3, Ll83/n;

    sget-object v8, Lb30/y0;->F:Lzy/b;

    sget-object v8, Lb30/w0;->w:Lb30/w0;

    sget-object v11, Lb30/v0;->w:Lb30/v0;

    if-nez v7, :cond_3c

    if-nez v3, :cond_3c

    move-object v3, v11

    goto :goto_1c

    :cond_3c
    if-eqz v7, :cond_3d

    iget-object v13, v7, Ll83/n;->w:Ljava/lang/Object;

    instance-of v13, v13, Ll83/m;

    if-ne v13, v12, :cond_3d

    if-eqz v3, :cond_3d

    iget-object v13, v3, Ll83/n;->w:Ljava/lang/Object;

    instance-of v13, v13, Ll83/m;

    if-ne v13, v12, :cond_3d

    new-instance v3, Lb30/u0;

    sget-object v7, Lb30/y0;->H:Lzy/b;

    invoke-direct {v3, v7}, Lb30/u0;-><init>(Lzy/c;)V

    goto :goto_1c

    :cond_3d
    if-eqz v7, :cond_3e

    iget-object v7, v7, Ll83/n;->w:Ljava/lang/Object;

    instance-of v7, v7, Ll83/m;

    if-ne v7, v12, :cond_3e

    new-instance v3, Lb30/u0;

    sget-object v7, Lb30/y0;->G:Lzy/b;

    invoke-direct {v3, v7}, Lb30/u0;-><init>(Lzy/c;)V

    goto :goto_1c

    :cond_3e
    if-eqz v3, :cond_3f

    iget-object v3, v3, Ll83/n;->w:Ljava/lang/Object;

    instance-of v3, v3, Ll83/m;

    if-ne v3, v12, :cond_3f

    new-instance v3, Lb30/u0;

    sget-object v7, Lb30/y0;->F:Lzy/b;

    invoke-direct {v3, v7}, Lb30/u0;-><init>(Lzy/c;)V

    goto :goto_1c

    :cond_3f
    move-object v3, v8

    :goto_1c
    instance-of v7, v3, Lb30/u0;

    if-eqz v7, :cond_40

    check-cast v3, Lb30/u0;

    iget-object v3, v3, Lb30/u0;->w:Lzy/c;

    iput-object v6, v5, Le;->y:Ljava/lang/Object;

    iput v2, v5, Le;->x:I

    invoke-virtual {v1, v3, v5}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v9, v4, :cond_42

    goto :goto_1e

    :cond_40
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_41

    iget-object v1, v10, Lb30/y0;->o:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_1d

    :cond_41
    invoke-virtual {v3, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_44

    :cond_42
    :goto_1d
    sget-object v1, Lb30/d6;->x:Lb30/d6;

    iput-object v6, v5, Le;->y:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v5, Le;->x:I

    invoke-virtual {v0, v1, v5}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v9, v4, :cond_43

    :goto_1e
    move-object v9, v4

    :cond_43
    :goto_1f
    return-object v9

    :cond_44
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_13
    check-cast v10, Lb30/y0;

    iget-object v0, v10, Lb30/y0;->s:Lec3/h2;

    iget-object v1, v10, Lb30/y0;->r:Lec3/h2;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v13, v5, Le;->x:I

    if-eqz v13, :cond_4a

    if-eq v13, v12, :cond_49

    if-eq v13, v8, :cond_48

    if-eq v13, v7, :cond_47

    if-eq v13, v3, :cond_46

    if-ne v13, v2, :cond_45

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_26

    :cond_45
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_46
    iget-object v0, v5, Le;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_23

    :cond_47
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    goto :goto_22

    :cond_48
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_21

    :cond_49
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_20

    :cond_4a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v10}, Lb30/y0;->b()Lzy/b;

    move-result-object v11

    iput v12, v5, Le;->x:I

    invoke-virtual {v1, v11, v5}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v9, v4, :cond_4b

    goto :goto_25

    :cond_4b
    :goto_20
    sget-object v11, Lb30/d6;->z:Lb30/d6;

    iput v8, v5, Le;->x:I

    invoke-virtual {v0, v11, v5}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v9, v4, :cond_4c

    goto :goto_25

    :cond_4c
    :goto_21
    iget-object v8, v10, Lb30/y0;->k:Ljava/lang/Object;

    iget-object v11, v10, Lb30/y0;->c:Lh20/l;

    iget-object v11, v11, Lh20/l;->b:Ly00/o4;

    iput v7, v5, Le;->x:I

    invoke-interface {v8, v11, v5}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_4d

    goto :goto_25

    :cond_4d
    :goto_22
    check-cast v7, Ljava/lang/Throwable;

    sget-object v8, Lb30/d6;->x:Lb30/d6;

    iput-object v7, v5, Le;->y:Ljava/lang/Object;

    iput v3, v5, Le;->x:I

    invoke-virtual {v0, v8, v5}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v9, v4, :cond_4e

    goto :goto_25

    :cond_4e
    move-object v0, v7

    :goto_23
    if-eqz v0, :cond_4f

    invoke-static {v0}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object v0

    goto :goto_24

    :cond_4f
    invoke-virtual {v10}, Lb30/y0;->b()Lzy/b;

    move-result-object v0

    :goto_24
    iput-object v6, v5, Le;->y:Ljava/lang/Object;

    iput v2, v5, Le;->x:I

    invoke-virtual {v1, v0, v5}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v9, v4, :cond_50

    :goto_25
    move-object v9, v4

    :cond_50
    :goto_26
    return-object v9

    :pswitch_14
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_52

    if-ne v1, v12, :cond_51

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_27

    :cond_51
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_52
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Lb30/m;

    iget-object v1, v1, Lb30/m;->F:Ljava/lang/Object;

    check-cast v1, Lec3/l;

    invoke-static {v1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object v1

    new-instance v2, Landroidx/room/e;

    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-direct {v2, v10, v6, v12}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput v12, v5, Le;->x:I

    invoke-static {v1, v2, v5}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_53

    move-object v9, v0

    :cond_53
    :goto_27
    return-object v9

    :pswitch_15
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_55

    if-eq v1, v12, :cond_54

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_54
    iget-object v0, v5, Le;->y:Ljava/lang/Object;

    check-cast v0, Lb3/i2;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_28

    :cond_55
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Lb3/i2;

    check-cast v10, Lb3/x0;

    iput-object v1, v5, Le;->y:Ljava/lang/Object;

    iput v12, v5, Le;->x:I

    new-instance v2, Lbc3/m;

    invoke-static {v5}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v3

    invoke-direct {v2, v12, v3}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v2}, Lbc3/m;->s()V

    iget-object v3, v10, Lb3/x0;->x:Lq3/z;

    iget-object v4, v3, Lq3/z;->a:Lq3/t;

    invoke-interface {v4}, Lq3/t;->a()V

    new-instance v6, Lq3/d0;

    invoke-direct {v6, v3, v4}, Lq3/d0;-><init>(Lq3/z;Lq3/t;)V

    iget-object v3, v3, Lq3/z;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    new-instance v3, Lb2/z;

    invoke-direct {v3, v8, v1, v10}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_56

    return-object v0

    :cond_56
    :goto_28
    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :pswitch_16
    check-cast v10, Lay/b0;

    iget-object v0, v10, Lay/b0;->E:Lec3/w1;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, Le;->x:I

    if-eqz v2, :cond_59

    if-eq v2, v12, :cond_57

    if-eq v2, v8, :cond_57

    if-ne v2, v7, :cond_58

    :cond_57
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2a

    :cond_58
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_59
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v5, Le;->y:Ljava/lang/Object;

    check-cast v2, Lay/h;

    instance-of v3, v2, Lay/f;

    if-eqz v3, :cond_5a

    iget-object v0, v10, Lay/b0;->y:Lec3/w1;

    iput v12, v5, Le;->x:I

    invoke-virtual {v0, v9, v5}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5c

    goto :goto_29

    :cond_5a
    instance-of v3, v2, Lay/g;

    if-eqz v3, :cond_5b

    new-instance v3, Lay/r;

    check-cast v2, Lay/g;

    iget-object v2, v2, Lay/g;->a:Ljava/lang/String;

    invoke-direct {v3, v2}, Lay/r;-><init>(Ljava/lang/String;)V

    iput v8, v5, Le;->x:I

    invoke-virtual {v0, v3, v5}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5c

    goto :goto_29

    :cond_5b
    instance-of v3, v2, Lay/e;

    if-eqz v3, :cond_5d

    new-instance v3, Lay/q;

    check-cast v2, Lay/e;

    iget-object v2, v2, Lay/e;->a:Ljava/lang/Throwable;

    invoke-direct {v3, v2}, Lay/q;-><init>(Ljava/lang/Throwable;)V

    iput v7, v5, Le;->x:I

    invoke-virtual {v0, v3, v5}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5c

    :goto_29
    move-object v9, v1

    :cond_5c
    :goto_2a
    return-object v9

    :cond_5d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_17
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_5f

    if-ne v1, v12, :cond_5e

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2b

    :cond_5e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Lay/b0;

    iget-object v1, v1, Lay/b0;->E:Lec3/w1;

    new-instance v2, Lay/q;

    check-cast v10, Lay/a;

    invoke-direct {v2, v10}, Lay/q;-><init>(Ljava/lang/Throwable;)V

    iput v12, v5, Le;->x:I

    invoke-virtual {v1, v2, v5}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_60

    move-object v9, v0

    :cond_60
    :goto_2b
    return-object v9

    :pswitch_18
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_62

    if-ne v1, v12, :cond_61

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2c

    :cond_61
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_62
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;

    iget-object v1, v1, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {v1}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lay/b0;

    iget-object v1, v1, Lay/b0;->z:Lec3/w1;

    new-instance v2, Lay/m;

    check-cast v10, Lp1/c1;

    invoke-direct {v2, v4, v10}, Lay/m;-><init>(ILp1/c1;)V

    iput v12, v5, Le;->x:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2, v5}, Lec3/w1;->k(Lec3/w1;Lec3/m;Lq83/d;)V

    move-object v9, v0

    :goto_2c
    return-object v9

    :pswitch_19
    iget-object v0, v5, Le;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/r0;

    iget-object v0, v0, Landroidx/lifecycle/r0;->a:Landroidx/lifecycle/j;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, Le;->x:I

    if-eqz v2, :cond_64

    if-ne v2, v12, :cond_63

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2d

    :cond_63
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_64
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v12, v5, Le;->x:I

    invoke-virtual {v0, v5}, Landroidx/lifecycle/j;->d(Ls83/c;)V

    if-ne v9, v1, :cond_65

    move-object v9, v1

    goto :goto_2e

    :cond_65
    :goto_2d
    invoke-virtual {v0, v10}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    :goto_2e
    return-object v9

    :pswitch_1a
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_67

    if-ne v1, v12, :cond_66

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2f

    :cond_66
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_67
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/b0;

    iget-object v1, v1, Landroidx/lifecycle/b0;->w:Landroidx/lifecycle/x;

    check-cast v10, Ls83/i;

    iput v12, v5, Le;->x:I

    sget-object v2, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-static {v1, v2, v10, v5}, Landroidx/lifecycle/o1;->r(Landroidx/lifecycle/x;Landroidx/lifecycle/w;Lc93/m;Ls83/i;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_68

    move-object v9, v0

    :cond_68
    :goto_2f
    return-object v9

    :pswitch_1b
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_6a

    if-ne v1, v12, :cond_69

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_30

    :cond_69
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/q0;

    check-cast v10, Lec3/l;

    new-instance v2, Lu;

    invoke-direct {v2, v1, v8}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v12, v5, Le;->x:I

    invoke-interface {v10, v2, v5}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6b

    move-object v9, v0

    :cond_6b
    :goto_30
    return-object v9

    :pswitch_1c
    check-cast v10, La30/w0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_6d

    if-ne v1, v12, :cond_6c

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_31

    :cond_6c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    new-instance v2, Landroidx/lifecycle/r0;

    iget-object v3, v10, La30/w0;->x:Ljava/lang/Object;

    check-cast v3, Landroidx/lifecycle/j;

    invoke-interface {v1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Landroidx/lifecycle/r0;-><init>(Landroidx/lifecycle/j;Lq83/j;)V

    iget-object v1, v10, La30/w0;->y:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    iput v12, v5, Le;->x:I

    invoke-interface {v1, v2, v5}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6e

    move-object v9, v0

    goto :goto_32

    :cond_6e
    :goto_31
    iget-object v0, v10, La30/w0;->E:Ljava/lang/Object;

    check-cast v0, La1/j;

    invoke-virtual {v0}, La1/j;->invoke()Ljava/lang/Object;

    :goto_32
    return-object v9

    :pswitch_1d
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_70

    if-ne v1, v12, :cond_6f

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_33

    :cond_6f
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_70
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v10, La43/f;

    iget-object v1, v10, La43/f;->E:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_71
    :goto_33
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_72

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La43/b;

    iput-object v1, v5, Le;->y:Ljava/lang/Object;

    iput v12, v5, Le;->x:I

    invoke-interface {v2, v5}, La43/b;->b(Le;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_71

    move-object v9, v0

    :cond_72
    return-object v9

    :pswitch_1e
    check-cast v10, Ljava/util/List;

    iget-object v0, v5, Le;->y:Ljava/lang/Object;

    check-cast v0, La33/d;

    iget-object v1, v0, La33/d;->z:Ljava/lang/Object;

    check-cast v1, Ll83/p;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v7, v5, Le;->x:I

    if-eqz v7, :cond_74

    if-ne v7, v12, :cond_73

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_34

    :cond_73
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_74
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v7, La33/c;

    invoke-direct {v7, v0, v10, v6, v4}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v12, v5, Le;->x:I

    invoke-virtual {v0, v2, v7, v5}, La33/d;->E(ILa33/c;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_75

    move-object v9, v3

    goto :goto_35

    :cond_75
    :goto_34
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_77

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb23/k;

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v7, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_76

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v8, "[sendAll] Failed \u2014 sending "

    const-string v11, " event(s) for retry: "

    invoke-static {v3, v8, v11, v0}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v7, v4, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_76
    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v7, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_77

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    move-object v11, v10

    check-cast v11, Ljava/lang/Iterable;

    sget-object v15, La33/b;->y:La33/b;

    const/16 v16, 0x1e

    const-string v12, ","

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v7, v2, v1, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_77
    :goto_35
    return-object v9

    :pswitch_1f
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_79

    if-ne v1, v12, :cond_78

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_36

    :cond_78
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_79
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Le;->y:Ljava/lang/Object;

    check-cast v1, La30/a0;

    check-cast v10, Lmy/a;

    iput v12, v5, Le;->x:I

    invoke-static {v1, v10, v5}, La30/a0;->b(La30/a0;Lmy/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_7a

    goto :goto_36

    :cond_7a
    move-object v0, v1

    :goto_36
    return-object v0

    :pswitch_20
    check-cast v10, La20/j;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v5, Le;->x:I

    if-eqz v2, :cond_7d

    if-eq v2, v12, :cond_7c

    if-ne v2, v8, :cond_7b

    goto :goto_37

    :cond_7b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7c
    :goto_37
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_39

    :cond_7d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v5, Le;->y:Ljava/lang/Object;

    check-cast v2, Lkz/n;

    instance-of v3, v2, Lkz/k;

    if-eqz v3, :cond_7e

    iput v12, v5, Le;->x:I

    invoke-virtual {v10, v1, v5}, La20/j;->l(Lz10/r;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_80

    goto :goto_38

    :cond_7e
    instance-of v1, v2, Lkz/m;

    if-eqz v1, :cond_7f

    check-cast v2, Lkz/m;

    iget-object v1, v2, Lkz/m;->w:Ljava/lang/Throwable;

    iput v8, v5, Le;->x:I

    invoke-virtual {v10, v1, v5}, La20/j;->j(Ljava/lang/Throwable;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_80

    :goto_38
    move-object v9, v0

    goto :goto_39

    :cond_7f
    instance-of v0, v2, Lkz/l;

    if-eqz v0, :cond_81

    check-cast v2, Lkz/l;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, La20/g;

    invoke-direct {v0, v4, v10, v2}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v10}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, La1/h;

    invoke-direct {v2, v10, v0, v6, v7}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v6, v6, v2, v7}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_80
    :goto_39
    return-object v9

    :cond_81
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_21
    iget-object v0, v5, Le;->y:Ljava/lang/Object;

    check-cast v0, Ljz/o;

    check-cast v10, La20/j;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v5, Le;->x:I

    if-eqz v3, :cond_84

    if-eq v3, v12, :cond_83

    if-ne v3, v8, :cond_82

    goto :goto_3a

    :cond_82
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_83
    :goto_3a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3c

    :cond_84
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v0, Ljz/l;

    if-eqz v3, :cond_85

    iput v12, v5, Le;->x:I

    invoke-virtual {v10, v1, v5}, La20/j;->l(Lz10/r;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_88

    goto :goto_3b

    :cond_85
    instance-of v1, v0, Ljz/n;

    if-eqz v1, :cond_86

    check-cast v0, Ljz/n;

    iget-object v0, v0, Ljz/n;->w:Ljava/lang/Throwable;

    iput v8, v5, Le;->x:I

    invoke-virtual {v10, v0, v5}, La20/j;->j(Ljava/lang/Throwable;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_88

    :goto_3b
    move-object v9, v2

    goto :goto_3c

    :cond_86
    instance-of v1, v0, Ljz/m;

    if-eqz v1, :cond_89

    iget-object v1, v10, La20/j;->w:Lz10/e;

    invoke-virtual {v1}, Lz10/e;->b()Z

    move-result v1

    if-eqz v1, :cond_87

    check-cast v0, Ljz/m;

    iget-object v0, v0, Ljz/m;->w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-static {v10}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, La1/h;

    invoke-direct {v2, v10, v0, v6, v8}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v6, v6, v2, v7}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_3c

    :cond_87
    check-cast v0, Ljz/m;

    iget-object v0, v0, Ljz/m;->w:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    new-instance v1, La1/b;

    invoke-direct {v1, v0, v7}, La1/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v10}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v2, La1/h;

    invoke-direct {v2, v10, v1, v6, v7}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v6, v6, v2, v7}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_88
    :goto_3c
    return-object v9

    :cond_89
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_22
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    if-eqz v1, :cond_8b

    if-ne v1, v12, :cond_8a

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3e

    :cond_8a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v10, Lp1/t2;

    new-instance v1, Lt;

    invoke-direct {v1, v10, v4}, Lt;-><init>(Lp1/t2;I)V

    invoke-static {v1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object v1

    new-instance v2, Lu;

    iget-object v3, v5, Le;->y:Ljava/lang/Object;

    check-cast v3, Lc93/a;

    invoke-direct {v2, v3, v4}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v12, v5, Le;->x:I

    new-instance v3, Lw;

    invoke-direct {v3, v2, v4}, Lw;-><init>(Lec3/m;I)V

    invoke-virtual {v1, v3, v5}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_8c

    goto :goto_3d

    :cond_8c
    move-object v1, v9

    :goto_3d
    if-ne v1, v0, :cond_8d

    move-object v9, v0

    :cond_8d
    :goto_3e
    return-object v9

    :pswitch_23
    check-cast v10, Lp1/c1;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Le;->x:I

    const/16 v2, 0x96

    if-eqz v1, :cond_90

    if-eq v1, v12, :cond_8f

    if-ne v1, v8, :cond_8e

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_41

    :cond_8e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3f

    :cond_90
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v10, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    int-to-long v3, v2

    iput v12, v5, Le;->x:I

    invoke-static {v3, v4, v5}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_91

    goto :goto_40

    :cond_91
    :goto_3f
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v10, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    int-to-long v1, v2

    iput v8, v5, Le;->x:I

    invoke-static {v1, v2, v5}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_92

    :goto_40
    move-object v9, v0

    goto :goto_42

    :cond_92
    :goto_41
    iget-object v0, v5, Le;->y:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :goto_42
    return-object v9

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
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
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch
.end method
