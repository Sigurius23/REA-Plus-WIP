.class public final Lkd/f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 1
    iput p3, p0, Lkd/f;->w:I

    iput-object p1, p0, Lkd/f;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lo0/y;ILq83/d;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Lkd/f;->w:I

    .line 2
    iput-object p1, p0, Lkd/f;->y:Ljava/lang/Object;

    iput p2, p0, Lkd/f;->x:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lkd/f;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/view/CardNumberEditText;

    const/16 v1, 0x1d

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Ls23/d;

    const/16 v1, 0x1c

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lqd/e;

    const/16 v1, 0x1b

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    const/16 v1, 0x1a

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lp6/v0;

    const/16 v1, 0x19

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_4
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lp3/c;

    const/16 v1, 0x18

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_5
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lp0/n0;

    const/16 v1, 0x17

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_6
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lo23/q;

    const/16 v1, 0x16

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_7
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lo23/h;

    const/16 v1, 0x15

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_8
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lo23/k;

    const/16 v1, 0x14

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_9
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lo23/h;

    const/16 v1, 0x13

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_a
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lo23/d;

    const/16 v1, 0x12

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_b
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lo20/e;

    const/16 v1, 0x11

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_c
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lo0/y;

    iget v1, p0, Lkd/f;->x:I

    invoke-direct {p1, v0, v1, p2}, Lkd/f;-><init>(Lo0/y;ILq83/d;)V

    return-object p1

    :pswitch_d
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lb30/m;

    const/16 v1, 0xf

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_e
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lne/a;

    const/16 v1, 0xe

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_f
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, La00/g;

    const/16 v1, 0xd

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_10
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lgm/r;

    const/16 v1, 0xc

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_11
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Ln20/u;

    const/16 v1, 0xb

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_12
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Ln20/k;

    const/16 v1, 0xa

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_13
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Ln20/i;

    const/16 v1, 0x9

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_14
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;

    const/16 v1, 0x8

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_15
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Llz/i;

    const/4 v1, 0x7

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_16
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lai/j;

    const/4 v1, 0x6

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_17
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, La6/e;

    const/4 v1, 0x5

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_18
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Ll1/q4;

    const/4 v1, 0x4

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_19
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Ld0/e;

    const/4 v1, 0x3

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1a
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Ll1/d2;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1b
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lg2/s;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1c
    new-instance p1, Lkd/f;

    iget-object v0, p0, Lkd/f;->y:Ljava/lang/Object;

    check-cast v0, Lkd/e;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

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

    iget v0, p0, Lkd/f;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lh0/k2;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_d
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_15
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

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

    iget v0, p0, Lkd/f;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    iget-object v8, p0, Lkd/f;->y:Ljava/lang/Object;

    const-string v9, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v10, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_1

    if-eq v1, v10, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-static {p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object v0

    throw v0

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, Lcom/stripe/android/view/CardNumberEditText;

    iget-object v1, v8, Lcom/stripe/android/view/CardNumberEditText;->W:Lzx/n;

    iget-object v1, v1, Lzx/n;->e:Ln53/e;

    new-instance v2, Ls40/w;

    invoke-direct {v2, v8, v3}, Ls40/w;-><init>(Lcom/stripe/android/view/CardNumberEditText;I)V

    iput v10, p0, Lkd/f;->x:I

    invoke-virtual {v1, v2, p0}, Ln53/e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v0

    :pswitch_0
    check-cast v8, Ls23/d;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_3

    if-ne v1, v10, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_4
    iget-object v1, v8, Ls23/d;->c:Ls23/e;

    sget-object v2, Ls23/e;->y:Ls23/e;

    if-ne v1, v2, :cond_7

    iget-object v1, v8, Ls23/d;->j:Ljava/lang/Long;

    if-eqz v1, :cond_5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    sub-long/2addr v2, v5

    goto :goto_1

    :cond_5
    const-wide/16 v2, 0x0

    :goto_1
    iget-object v1, v8, Ls23/d;->p:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    if-eqz v1, :cond_6

    iget-object v1, v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;->a:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-static {v1, v2, v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->c(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;J)V

    :cond_6
    iput v10, p0, Lkd/f;->x:I

    const-wide/16 v1, 0x3e8

    invoke-static {v1, v2, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    move-object v7, v0

    :cond_7
    return-object v7

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_b

    if-eq v1, v10, :cond_9

    if-ne v1, v5, :cond_8

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_3

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_a

    goto :goto_2

    :cond_a
    move-object v0, v1

    goto :goto_4

    :cond_b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_2
    iput v5, p0, Lkd/f;->x:I

    invoke-static {v6, v6, p0, v2}, Lvd/f;->J(Lvg/n;Ls/m2;Ls83/i;I)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_c

    goto :goto_4

    :cond_c
    :goto_3
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    :goto_4
    return-object v0

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_e

    if-ne v1, v10, :cond_d

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Lp6/n0;

    check-cast v8, Landroid/content/Context;

    invoke-direct {v1, v8}, Lp6/n0;-><init>(Landroid/content/Context;)V

    iput v10, p0, Lkd/f;->x:I

    invoke-virtual {v1, p0}, Lp6/n0;->a(Ls83/i;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_f

    move-object v7, v0

    :cond_f
    :goto_5
    return-object v7

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_11

    if-ne v1, v10, :cond_10

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_7

    :catchall_0
    move-exception v0

    goto :goto_6

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Lp6/b;

    check-cast v8, Lp6/v0;

    iget v2, v8, Lp6/v0;->b:I

    invoke-direct {v1, v2}, Lp6/b;-><init>(I)V

    :try_start_1
    iput v10, p0, Lkd/f;->x:I

    invoke-static {v8, v1, p0}, Lp6/v0;->a(Lp6/v0;Lp6/b;Ls83/c;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v1, v0, :cond_12

    move-object v7, v0

    goto :goto_7

    :goto_6
    const-string v1, "GlanceRemoteViewService"

    const-string v2, "Error when trying to start session for list items"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-result v0

    new-instance v7, Ljava/lang/Integer;

    invoke-direct {v7, v0}, Ljava/lang/Integer;-><init>(I)V

    :cond_12
    :goto_7
    return-object v7

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_14

    if-ne v1, v10, :cond_13

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_8

    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, Lp3/c;

    iput v10, p0, Lkd/f;->x:I

    invoke-virtual {v8, p0}, Lp3/c;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_15

    move-object v7, v0

    :cond_15
    :goto_8
    return-object v7

    :pswitch_5
    sget-object v11, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lkd/f;->x:I

    if-eqz v0, :cond_17

    if-ne v0, v10, :cond_16

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_9

    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, Lp0/n0;

    iget-object v0, v8, Lp0/n0;->y:Ljava/lang/Object;

    check-cast v0, Ld0/m;

    new-instance v2, Ljava/lang/Float;

    invoke-direct {v2, v1}, Ljava/lang/Float;-><init>(F)V

    new-instance v3, Ljava/lang/Float;

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-direct {v3, v5}, Ljava/lang/Float;-><init>(F)V

    const/high16 v5, 0x43c80000    # 400.0f

    invoke-static {v1, v5, v10, v3}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v1

    iput v10, p0, Lkd/f;->x:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/16 v6, 0x8

    move-object v5, v2

    move-object v2, v1

    move-object v1, v5

    move-object v5, p0

    invoke-static/range {v0 .. v6}, Ld0/f;->i(Ld0/m;Ljava/lang/Float;Ld0/l;ZLkotlin/jvm/functions/Function1;Ls83/c;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_18

    move-object v7, v11

    :cond_18
    :goto_9
    return-object v7

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_1a

    if-ne v1, v10, :cond_19

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_a

    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, Lo23/q;

    iput v10, p0, Lkd/f;->x:I

    invoke-virtual {v8, p0}, Lo23/q;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_1b

    goto :goto_a

    :cond_1b
    move-object v0, v1

    :goto_a
    return-object v0

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_1d

    if-ne v1, v10, :cond_1c

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_b

    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, Lo23/h;

    iput v10, p0, Lkd/f;->x:I

    invoke-virtual {v8, p0}, Lo23/h;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_1e

    goto :goto_b

    :cond_1e
    move-object v0, v1

    :goto_b
    return-object v0

    :pswitch_8
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_20

    if-ne v1, v10, :cond_1f

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_c

    :cond_1f
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_20
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, Lo23/k;

    iput v10, p0, Lkd/f;->x:I

    invoke-virtual {v8, p0}, Lo23/k;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_21

    goto :goto_c

    :cond_21
    move-object v0, v1

    :goto_c
    return-object v0

    :pswitch_9
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_23

    if-ne v1, v10, :cond_22

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_d

    :cond_22
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_23
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, Lo23/h;

    iput v10, p0, Lkd/f;->x:I

    invoke-virtual {v8, p0}, Lo23/h;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_24

    goto :goto_d

    :cond_24
    move-object v0, v1

    :goto_d
    return-object v0

    :pswitch_a
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_26

    if-ne v1, v10, :cond_25

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_e

    :cond_25
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_26
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, Lo23/d;

    iput v10, p0, Lkd/f;->x:I

    invoke-interface {v8, p0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_27

    move-object v7, v0

    :cond_27
    :goto_e
    return-object v7

    :pswitch_b
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_29

    if-ne v1, v10, :cond_28

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_19

    :cond_28
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_29
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, Lo20/e;

    iget-object v1, v8, Lo20/e;->w:Ljava/util/List;

    iput v10, p0, Lkd/f;->x:I

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2a
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Lg40/w2;

    if-eqz v9, :cond_2a

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_2b
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg40/w2;

    iget-object v8, v8, Lg40/w2;->b:Ljava/util/List;

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {v3, v8}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_10

    :cond_2c
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2d
    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Lg40/a2;

    if-eqz v9, :cond_2d

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_2e
    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg40/a2;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_2f
    :goto_12
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_30

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Lg40/w2;

    if-eqz v10, :cond_2f

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_30
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_31

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg40/w2;

    iget-object v9, v9, Lg40/w2;->b:Ljava/util/List;

    check-cast v9, Ljava/lang/Iterable;

    invoke-static {v8, v9}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_13

    :cond_31
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_32
    :goto_14
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_33

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Lg40/i0;

    if-eqz v10, :cond_32

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_33
    invoke-static {v3}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg40/i0;

    if-nez v3, :cond_3a

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_34
    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_35

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Lg40/w2;

    if-eqz v9, :cond_34

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_15

    :cond_35
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_36

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg40/w2;

    iget-object v8, v8, Lg40/w2;->b:Ljava/util/List;

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {v1, v8}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_16

    :cond_36
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_37
    :goto_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_38

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Lg40/h;

    if-eqz v9, :cond_37

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :cond_38
    invoke-static {v3}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg40/h;

    if-eqz v1, :cond_39

    invoke-interface {v1}, Lg40/h;->j()Lg40/i0;

    move-result-object v6

    :cond_39
    move-object v3, v6

    :cond_3a
    if-eqz v3, :cond_3b

    iget-object v1, v3, Lg40/i0;->c:Lg40/r0;

    if-eqz v1, :cond_3b

    iget-object v1, v1, Lg40/r0;->i:Ln53/e;

    if-eqz v1, :cond_3b

    new-instance v3, Lu;

    const/16 v6, 0x13

    invoke-direct {v3, v2, v6}, Lu;-><init>(Ljava/lang/Object;I)V

    new-instance v2, La6/t;

    invoke-direct {v2, v3, v5}, La6/t;-><init>(Lec3/m;I)V

    invoke-virtual {v1, v2, p0}, Ln53/e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    goto :goto_18

    :cond_3b
    move-object v1, v7

    :goto_18
    if-ne v1, v0, :cond_3c

    move-object v7, v0

    :cond_3c
    :goto_19
    return-object v7

    :pswitch_c
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, Lo0/y;

    iget v0, p0, Lkd/f;->x:I

    iget-object v1, v8, Lo0/y;->d:Lc33/c;

    iget-object v2, v1, Lc33/c;->c:Ljava/lang/Object;

    check-cast v2, Lp1/h1;

    invoke-virtual {v2}, Lp1/h1;->x()I

    move-result v2

    if-ne v2, v0, :cond_3d

    iget-object v2, v1, Lc33/c;->b:Ljava/lang/Object;

    check-cast v2, Lp1/h1;

    invoke-virtual {v2}, Lp1/h1;->x()I

    move-result v2

    if-eqz v2, :cond_3e

    :cond_3d
    iget-object v2, v8, Lo0/y;->m:Landroidx/compose/foundation/lazy/layout/b;

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/layout/b;->e()V

    iput-object v6, v2, Landroidx/compose/foundation/lazy/layout/b;->b:Lab/h0;

    const/4 v5, -0x1

    iput v5, v2, Landroidx/compose/foundation/lazy/layout/b;->c:I

    :cond_3e
    invoke-virtual {v1, v0, v3}, Lc33/c;->g(II)V

    iput-object v6, v1, Lc33/c;->d:Ljava/lang/Object;

    iget-object v0, v8, Lo0/y;->j:La3/n0;

    if-eqz v0, :cond_3f

    invoke-virtual {v0}, La3/n0;->m()V

    :cond_3f
    return-object v7

    :pswitch_d
    check-cast v8, Lb30/m;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_41

    if-ne v1, v10, :cond_40

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_1a

    :cond_40
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_41
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v8, Lb30/m;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v8, Lb30/m;->y:Ljava/lang/Object;

    check-cast v1, Lny/d;

    iput v10, p0, Lkd/f;->x:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lny/e;

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Not handled!"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2, v6}, Lny/e;-><init>(Ljava/lang/Throwable;Lzy/c;)V

    if-ne v1, v0, :cond_42

    move-object v7, v0

    goto :goto_1b

    :cond_42
    :goto_1a
    check-cast v1, Lny/e;

    instance-of v0, v1, Lny/e;

    if-eqz v0, :cond_44

    iget-object v0, v8, Lb30/m;->E:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v2, v1, Lny/e;->b:Lzy/c;

    if-nez v2, :cond_43

    iget-object v1, v1, Lny/e;->a:Ljava/lang/Throwable;

    invoke-static {v1}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object v2

    :cond_43
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v8, Lb30/m;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1b
    return-object v7

    :cond_44
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_e
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_48

    if-eq v1, v10, :cond_46

    if-ne v1, v5, :cond_45

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_1d

    :cond_45
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_46
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_47

    goto :goto_1c

    :cond_47
    move-object v0, v1

    goto :goto_1e

    :cond_48
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_1c
    iput v5, p0, Lkd/f;->x:I

    invoke-static {v6, v6, p0, v2}, Lvd/f;->J(Lvg/n;Ls/m2;Ls83/i;I)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_49

    goto :goto_1e

    :cond_49
    :goto_1d
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    :goto_1e
    return-object v0

    :pswitch_f
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_4b

    if-ne v1, v10, :cond_4a

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1f

    :cond_4a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, La00/g;

    iget-object v1, v8, La00/g;->x:Ljava/lang/Object;

    check-cast v1, Lt23/c0;

    iput v10, p0, Lkd/f;->x:I

    const-string v2, "RingingState.RejectedByAll"

    sget-object v3, Lc43/s;->a:Lc43/s;

    invoke-virtual {v1, v2, v3, p0}, Lt23/c0;->x(Ljava/lang/String;Ltx/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4c

    move-object v7, v0

    :cond_4c
    :goto_1f
    return-object v7

    :pswitch_10
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_4e

    if-ne v1, v10, :cond_4d

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_20

    :cond_4d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4e
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, Lgm/r;

    iget-object v1, v8, Lgm/r;->x:Ljava/lang/Object;

    check-cast v1, Lt23/c0;

    iget-object v1, v1, Lt23/c0;->p:Lt23/s0;

    iget-object v1, v1, Lt23/s0;->h:Lec3/h2;

    new-instance v2, Landroidx/room/e;

    const/16 v3, 0x1a

    invoke-direct {v2, v8, v6, v3}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput v10, p0, Lkd/f;->x:I

    invoke-static {v1, v2, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4f

    move-object v7, v0

    :cond_4f
    :goto_20
    return-object v7

    :pswitch_11
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_51

    if-ne v1, v10, :cond_50

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_21

    :cond_50
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_51
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, Ln20/u;

    iget-object v1, v8, Ln20/u;->H:Lec3/r1;

    new-instance v2, Landroidx/room/e;

    const/16 v3, 0x19

    invoke-direct {v2, v8, v6, v3}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput v10, p0, Lkd/f;->x:I

    invoke-static {v1, v2, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_52

    move-object v7, v0

    :cond_52
    :goto_21
    return-object v7

    :pswitch_12
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_54

    if-ne v1, v10, :cond_53

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_22

    :cond_53
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_54
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, Ln20/k;

    iget-object v1, v8, Ln20/k;->b:Le10/r0;

    iget-object v1, v1, Le10/r0;->k:Lec3/r1;

    new-instance v2, Ln20/j;

    invoke-direct {v2, v8, v6, v3}, Ln20/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput v10, p0, Lkd/f;->x:I

    invoke-static {v1, v2, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_55

    move-object v7, v0

    :cond_55
    :goto_22
    return-object v7

    :pswitch_13
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_57

    if-ne v1, v10, :cond_56

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_23

    :cond_56
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_57
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, Ln20/i;

    iget-object v1, v8, Ln20/i;->i:Ln20/k;

    iget-object v1, v1, Ln20/k;->d:Lec3/g;

    new-instance v2, Lu;

    const/16 v3, 0x12

    invoke-direct {v2, v8, v3}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v10, p0, Lkd/f;->x:I

    invoke-virtual {v1, v2, p0}, Lec3/g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_58

    move-object v7, v0

    :cond_58
    :goto_23
    return-object v7

    :pswitch_14
    check-cast v8, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_5a

    if-eq v1, v10, :cond_59

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_59
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_24

    :cond_5a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget v1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->z:I

    iget-object v1, v8, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->y:Landroidx/lifecycle/y1;

    invoke-virtual {v1}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llz/i;

    iget-object v1, v1, Llz/i;->F:Lec3/q1;

    new-instance v2, Lu;

    const/16 v3, 0x11

    invoke-direct {v2, v8, v3}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v10, p0, Lkd/f;->x:I

    iget-object v1, v1, Lec3/q1;->w:Lec3/t1;

    invoke-interface {v1, v2, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5b

    return-object v0

    :cond_5b
    :goto_24
    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :pswitch_15
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_5d

    if-ne v1, v10, :cond_5c

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_25

    :cond_5c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5d
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, Llz/i;

    iget-object v1, v8, Llz/i;->E:Lec3/w1;

    new-instance v2, Llz/d;

    sget-object v3, Lkz/e;->w:Lkz/e;

    invoke-direct {v2, v3}, Llz/d;-><init>(Lkz/h;)V

    iput v10, p0, Lkd/f;->x:I

    invoke-virtual {v1, v2, p0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5e

    move-object v7, v0

    :cond_5e
    :goto_25
    return-object v7

    :pswitch_16
    check-cast v8, Lai/j;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_60

    if-ne v1, v10, :cond_5f

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_26

    :cond_5f
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_60
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v8, Lai/j;->x:Ljava/lang/Object;

    check-cast v1, Lab/h0;

    iput v10, p0, Lkd/f;->x:I

    iget-object v2, v1, Lab/h0;->y:Ljava/lang/Object;

    check-cast v2, Lq83/j;

    new-instance v3, La13/h;

    const/16 v5, 0xe

    invoke-direct {v3, v1, v6, v5}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v2, v3, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_61

    move-object v7, v0

    goto :goto_27

    :cond_61
    :goto_26
    check-cast v1, Ll30/a;

    if-eqz v1, :cond_62

    iget v0, v8, Lai/j;->w:I

    iget v1, v1, Ll30/a;->x:I

    if-ne v0, v1, :cond_62

    goto :goto_27

    :cond_62
    invoke-virtual {v8}, Lai/j;->k()Ll30/a;

    :goto_27
    return-object v7

    :pswitch_17
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_64

    if-ne v1, v10, :cond_63

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_28

    :cond_63
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_64
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, La6/e;

    iput v10, p0, Lkd/f;->x:I

    invoke-virtual {v8, p0}, La6/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_65

    move-object v7, v0

    :cond_65
    :goto_28
    return-object v7

    :pswitch_18
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_67

    if-ne v1, v10, :cond_66

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_29

    :cond_66
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_67
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Lkotlin/jvm/internal/e0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    check-cast v8, Ll1/q4;

    iget-object v2, v8, Ll1/q4;->O:Lj0/i;

    check-cast v2, Lj0/j;

    iget-object v2, v2, Lj0/j;->a:Lec3/w1;

    new-instance v3, Landroidx/room/x;

    const/16 v5, 0xa

    invoke-direct {v3, v5, v1, v8}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v10, p0, Lkd/f;->x:I

    invoke-virtual {v2, v3, p0}, Lec3/w1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-object v7, v0

    :goto_29
    return-object v7

    :pswitch_19
    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lkd/f;->x:I

    if-eqz v0, :cond_69

    if-ne v0, v10, :cond_68

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2a

    :cond_68
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_69
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, v8

    check-cast v0, Ld0/e;

    new-instance v2, Ljava/lang/Float;

    invoke-direct {v2, v1}, Ljava/lang/Float;-><init>(F)V

    iput v10, p0, Lkd/f;->x:I

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v5, 0xe

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_6a

    move-object v7, v6

    :cond_6a
    :goto_2a
    return-object v7

    :pswitch_1a
    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lkd/f;->x:I

    if-eqz v0, :cond_6c

    if-ne v0, v10, :cond_6b

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2b

    :cond_6b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6c
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v8, Ll1/d2;

    iget-object v0, v8, Ll1/d2;->e:Ld0/e;

    new-instance v2, Ljava/lang/Float;

    invoke-direct {v2, v1}, Ljava/lang/Float;-><init>(F)V

    iput v10, p0, Lkd/f;->x:I

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v5, 0xe

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_6d

    move-object v7, v6

    :cond_6d
    :goto_2b
    return-object v7

    :pswitch_1b
    check-cast v8, Lg2/s;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_6f

    if-ne v1, v10, :cond_6e

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2c

    :cond_6e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6f
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz v8, :cond_71

    iput v10, p0, Lkd/f;->x:I

    const-wide/16 v1, 0x12c

    invoke-static {v1, v2, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_70

    move-object v7, v0

    goto :goto_2d

    :cond_70
    :goto_2c
    invoke-static {v8}, Lg2/s;->c(Lg2/s;)V

    :cond_71
    :goto_2d
    return-object v7

    :pswitch_1c
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkd/f;->x:I

    if-eqz v1, :cond_75

    if-eq v1, v10, :cond_73

    if-ne v1, v5, :cond_72

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_2f

    :cond_72
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_73
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_74

    goto :goto_2e

    :cond_74
    move-object v0, v1

    goto :goto_30

    :cond_75
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_2e
    iput v5, p0, Lkd/f;->x:I

    invoke-static {v6, v6, p0, v2}, Lvd/f;->J(Lvg/n;Ls/m2;Ls83/i;I)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_76

    goto :goto_30

    :cond_76
    :goto_2f
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    :goto_30
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
