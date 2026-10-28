.class public final La20/b;
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
    iput p3, p0, La20/b;->w:I

    iput-object p1, p0, La20/b;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, La20/b;->w:I

    .line 2
    check-cast p1, Ls83/i;

    iput-object p1, p0, La20/b;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, La20/b;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lhm/d;

    const/16 v1, 0x1d

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/work/CoroutineWorker;

    const/16 v1, 0x1c

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lh20/w0;

    const/16 v1, 0x1b

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lh20/z;

    const/16 v1, 0x1a

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lh20/g;

    const/16 v1, 0x19

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_4
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Ld30/f0;

    const/16 v1, 0x18

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_5
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lgj/d;

    const/16 v1, 0x17

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_6
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;

    const/16 v1, 0x16

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_7
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lf53/k;

    const/16 v1, 0x15

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_8
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lf30/e;

    const/16 v1, 0x14

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_9
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lf10/b;

    const/16 v1, 0x13

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_a
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Ls83/i;

    invoke-direct {p1, v0, p2}, La20/b;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    return-object p1

    :pswitch_b
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lf0/x0;

    const/16 v1, 0x11

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_c
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lf0/i0;

    const/16 v1, 0x10

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_d
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lf0/c0;

    const/16 v1, 0xf

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_e
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Led/e;

    const/16 v1, 0xe

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_f
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Le33/n;

    const/16 v1, 0xd

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_10
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Ld0/f1;

    const/16 v1, 0xc

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_11
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    const/16 v1, 0xb

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_12
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lp1/z0;

    const/16 v1, 0xa

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_13
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lf0/r1;

    const/16 v1, 0x9

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_14
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, La30/k1;

    const/16 v1, 0x8

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_15
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Ld1/j;

    const/4 v1, 0x7

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_16
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lb30/m0;

    const/4 v1, 0x6

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_17
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lay/b0;

    const/4 v1, 0x5

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_18
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;

    const/4 v1, 0x4

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_19
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/room/v;

    const/4 v1, 0x3

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1a
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, La30/w0;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1b
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, La20/j;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1c
    new-instance p1, La20/b;

    iget-object v0, p0, La20/b;->y:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

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

    iget v0, p0, La20/b;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_7
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_c
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_11
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_12
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_14
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_15
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_16
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_17
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_18
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_19
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1a
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1b
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1c
    invoke-virtual {p0, p1, p2}, La20/b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La20/b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La20/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

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
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, La20/b;->w:I

    const/4 v2, 0x3

    const/16 v3, 0xd

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v8, 0x1

    packed-switch v1, :pswitch_data_0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La20/b;->x:I

    if-eqz v2, :cond_1

    if-ne v2, v8, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v2, Lhm/d;

    iput v8, v0, La20/b;->x:I

    invoke-virtual {v2, v0}, Lhm/d;->e(Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    goto :goto_0

    :cond_2
    move-object v1, v2

    :goto_0
    return-object v1

    :pswitch_0
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La20/b;->x:I

    if-eqz v2, :cond_4

    if-ne v2, v8, :cond_3

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_1

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v2, Landroidx/work/CoroutineWorker;

    iput v8, v0, La20/b;->x:I

    invoke-virtual {v2, v0}, Landroidx/work/CoroutineWorker;->getForegroundInfo(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto :goto_1

    :cond_5
    move-object v1, v2

    :goto_1
    return-object v1

    :pswitch_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, La20/b;->x:I

    if-eqz v3, :cond_7

    if-ne v3, v8, :cond_6

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v3, Lh20/w0;

    iget-object v3, v3, Le30/c;->O:Lec3/w1;

    iput v8, v0, La20/b;->x:I

    invoke-virtual {v3, v1, v0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_8

    move-object v1, v2

    :cond_8
    :goto_2
    return-object v1

    :pswitch_2
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La20/b;->x:I

    if-eqz v2, :cond_a

    if-eq v2, v8, :cond_9

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v2, Lh20/z;

    iget-object v3, v2, Lh20/z;->a:Lec3/r1;

    new-instance v4, Lu;

    const/16 v5, 0xb

    invoke-direct {v4, v2, v5}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v8, v0, La20/b;->x:I

    iget-object v2, v3, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2, v4, v0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_b

    return-object v1

    :cond_b
    :goto_3
    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1

    :pswitch_3
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La20/b;->x:I

    if-eqz v2, :cond_d

    if-ne v2, v8, :cond_c

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v2, Lh20/g;

    iget-object v3, v2, Lh20/g;->p:Lec3/j1;

    new-instance v4, Lu;

    const/16 v5, 0xa

    invoke-direct {v4, v2, v5}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v8, v0, La20/b;->x:I

    invoke-virtual {v3, v4, v0}, Lec3/j1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_e

    goto :goto_5

    :cond_e
    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object v1

    :pswitch_4
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La20/b;->x:I

    if-eqz v2, :cond_10

    if-ne v2, v8, :cond_f

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_6

    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v2, Ld30/f0;

    iget-object v2, v2, Ld30/f0;->g:Ljava/lang/Object;

    check-cast v2, Ldc3/h;

    iput v8, v0, La20/b;->x:I

    new-instance v3, Ld30/o;

    const/16 v4, 0x17

    invoke-direct {v3, v2, v6, v4}, Ld30/o;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v3, v0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_11

    goto :goto_6

    :cond_11
    move-object v1, v2

    :goto_6
    return-object v1

    :pswitch_5
    iget-object v1, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v1, Lgj/d;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, La20/b;->x:I

    if-eqz v3, :cond_13

    if-ne v3, v8, :cond_12

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_12
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_13
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Lgj/d;->m:Lbc3/j0;

    iput v8, v0, La20/b;->x:I

    invoke-virtual {v3, v0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_14

    goto :goto_8

    :cond_14
    :goto_7
    invoke-virtual {v1}, Lgj/d;->c()Lqk/c;

    move-result-object v2

    iget-object v2, v2, Lqk/c;->a:Lcd3/g;

    invoke-virtual {v2}, Lcd3/g;->y()Lqk/a;

    move-result-object v3

    iget-object v3, v3, Lqk/a;->a:Ljava/lang/String;

    new-instance v5, Lqk/a;

    invoke-direct {v5, v3, v6}, Lqk/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v5, v4}, Lcd3/g;->I(Lqk/a;I)V

    iget-object v2, v1, Lgj/d;->o:Lgj/b;

    if-eqz v2, :cond_15

    iget-object v1, v1, Lgj/d;->a:Lgj/g;

    invoke-virtual {v2, v1}, Lck/d;->d(Lgj/g;)V

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_8
    return-object v2

    :cond_15
    const-string v1, "androidContextPlugin"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :pswitch_6
    iget-object v1, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, La20/b;->x:I

    if-eqz v3, :cond_17

    if-eq v3, v8, :cond_16

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_16
    invoke-static/range {p1 .. p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object v1

    throw v1

    :cond_17
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->p()Lg20/r;

    move-result-object v3

    iget-object v3, v3, Lg20/r;->N:Lec3/h2;

    new-instance v4, Lu;

    const/16 v5, 0x9

    invoke-direct {v4, v1, v5}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v8, v0, La20/b;->x:I

    invoke-virtual {v3, v4, v0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v2

    :pswitch_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, La20/b;->x:I

    if-eqz v3, :cond_19

    if-ne v3, v8, :cond_18

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_e

    :cond_18
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_19
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v3, Lf53/k;

    iget-object v3, v3, Lf53/k;->a:Ld33/c;

    invoke-virtual {v3}, Ld33/c;->a()Lio/getstream/video/android/model/User;

    move-result-object v3

    iget-object v4, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v4, Lf53/k;

    invoke-virtual {v4}, Lf53/k;->j()Lb23/k;

    move-result-object v4

    iget-object v5, v4, Lb23/k;->c:Lb23/e;

    sget-object v7, Lb23/g;->y:Lb23/g;

    iget-object v9, v4, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v5, v7, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1a

    iget-object v5, v4, Lb23/k;->b:Lb23/j;

    iget-object v4, v4, Lb23/k;->a:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "[onConnected] Video socket created, user: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v5, v7, v4, v9, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1a
    iget-object v4, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v4, Lf53/k;

    iget-object v4, v4, Lf53/k;->d:Lqg3/d;

    iget-object v4, v4, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v4, Le53/d;

    iget-object v4, v4, Le53/d;->a:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_21

    iget-object v3, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v3, Lf53/k;

    invoke-virtual {v3}, Lf53/k;->j()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->F:Lb23/g;

    iget-object v9, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1b

    iget-object v4, v3, Lb23/k;->b:Lb23/j;

    iget-object v3, v3, Lb23/k;->a:Ljava/lang/String;

    const-string v9, "[onConnected] Token is empty. Disconnecting."

    invoke-interface {v4, v5, v3, v9, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1b
    iget-object v3, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v3, Lf53/k;

    iput v8, v0, La20/b;->x:I

    iget-object v3, v3, Lf53/k;->i:Lf53/j;

    invoke-virtual {v3}, Lf53/j;->f()Lb23/k;

    move-result-object v4

    iget-object v5, v4, Lb23/k;->c:Lb23/e;

    iget-object v8, v4, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v5, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1c

    iget-object v5, v4, Lb23/k;->b:Lb23/j;

    iget-object v4, v4, Lb23/k;->a:Ljava/lang/String;

    const-string v8, "[disconnect] no args"

    invoke-interface {v5, v7, v4, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1c
    iput-object v6, v3, Lf53/j;->j:Lrb3/g;

    iget-object v3, v3, Lf53/j;->l:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v3}, Lio/sentry/internal/debugmeta/c;->t()Lb23/k;

    move-result-object v4

    iget-object v5, v4, Lb23/k;->c:Lb23/e;

    sget-object v7, Lb23/g;->z:Lb23/g;

    iget-object v8, v4, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v5, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1d

    iget-object v5, v4, Lb23/k;->b:Lb23/j;

    iget-object v4, v4, Lb23/k;->a:Ljava/lang/String;

    const-string v8, "[onRequiredDisconnect] no args"

    invoke-interface {v5, v7, v4, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1d
    invoke-virtual {v3}, Lio/sentry/internal/debugmeta/c;->w()Ly43/b;

    move-result-object v3

    sget-object v4, Lg53/s;->a:Lg53/s;

    invoke-virtual {v3, v4, v0}, Ly43/b;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1e

    goto :goto_9

    :cond_1e
    move-object v3, v1

    :goto_9
    if-ne v3, v2, :cond_1f

    goto :goto_a

    :cond_1f
    move-object v3, v1

    :goto_a
    if-ne v3, v2, :cond_20

    goto :goto_b

    :cond_20
    move-object v3, v1

    :goto_b
    if-ne v3, v2, :cond_28

    move-object v1, v2

    goto/16 :goto_e

    :cond_21
    iget-object v2, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v2, Lf53/k;

    iget-object v2, v2, Lf53/k;->d:Lqg3/d;

    iget-object v2, v2, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v2, Le53/d;

    iget-object v2, v2, Le53/d;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v4, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v4, Lf53/k;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_22

    iget-object v2, v4, Lf53/k;->c:Le53/d;

    iget-object v2, v2, Le53/d;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    :cond_22
    invoke-virtual {v3}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3}, Lio/getstream/video/android/model/User;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lx43/j;->L(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_23

    move-object v13, v4

    goto :goto_c

    :cond_23
    move-object v13, v6

    :goto_c
    invoke-virtual {v3}, Lio/getstream/video/android/model/User;->getImage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lx43/j;->L(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_24

    move-object v10, v4

    goto :goto_d

    :cond_24
    move-object v10, v6

    :goto_d
    invoke-virtual {v3}, Lio/getstream/video/android/model/User;->getCustom()Ljava/util/Map;

    move-result-object v14

    new-instance v8, Lio/getstream/android/video/generated/models/ConnectUserDetailsRequest;

    const/16 v15, 0xc

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v16}, Lio/getstream/android/video/generated/models/ConnectUserDetailsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lio/getstream/android/video/generated/models/WSAuthMessageRequest;

    invoke-direct {v3, v2, v8}, Lio/getstream/android/video/generated/models/WSAuthMessageRequest;-><init>(Ljava/lang/String;Lio/getstream/android/video/generated/models/ConnectUserDetailsRequest;)V

    invoke-static {}, Lio/getstream/android/video/generated/infrastructure/Serializer;->getMoshi()Lqx/l0;

    move-result-object v2

    const-class v4, Lio/getstream/android/video/generated/models/WSAuthMessageRequest;

    invoke-virtual {v2, v4}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/squareup/moshi/JsonAdapter;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v4, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v4, Lf53/k;

    invoke-virtual {v4}, Lf53/k;->j()Lb23/k;

    move-result-object v4

    iget-object v5, v4, Lb23/k;->c:Lb23/e;

    iget-object v8, v4, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v5, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_25

    iget-object v5, v4, Lb23/k;->b:Lb23/j;

    iget-object v4, v4, Lb23/k;->a:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "[onConnected] Sending auth request: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v5, v7, v4, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_25
    iget-object v3, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v3, Lf53/k;

    invoke-virtual {v3}, Lf53/k;->j()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v7, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_26

    iget-object v4, v3, Lb23/k;->b:Lb23/j;

    iget-object v3, v3, Lb23/k;->a:Ljava/lang/String;

    const-string v5, "[onConnected#data] Data: "

    invoke-static {v5, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v7, v3, v5, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_26
    iget-object v3, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v3, Lf53/k;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v3, v3, Lf53/k;->i:Lf53/j;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v3, Lf53/j;->h:Lq/f;

    if-eqz v3, :cond_28

    invoke-virtual {v3}, Lq/f;->u0()Lb23/k;

    move-result-object v4

    iget-object v5, v4, Lb23/k;->c:Lb23/e;

    iget-object v8, v4, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v5, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_27

    iget-object v5, v4, Lb23/k;->b:Lb23/j;

    iget-object v4, v4, Lb23/k;->a:Ljava/lang/String;

    const-string v8, "[send#raw] event: `"

    const-string v9, "`"

    invoke-static {v8, v2, v9}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v7, v4, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_27
    iget-object v3, v3, Lq/f;->E:Ljava/lang/Object;

    check-cast v3, Lud3/e1;

    check-cast v3, Lle3/g;

    invoke-virtual {v3, v2}, Lle3/g;->h(Ljava/lang/String;)Z

    :cond_28
    :goto_e
    return-object v1

    :pswitch_8
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La20/b;->x:I

    if-eqz v2, :cond_2a

    if-ne v2, v8, :cond_29

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_f

    :cond_29
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v2, Lf30/e;

    iput v8, v0, La20/b;->x:I

    invoke-virtual {v2, v0}, Lf30/e;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2b

    goto :goto_10

    :cond_2b
    :goto_f
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_10
    return-object v1

    :pswitch_9
    iget-object v1, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v1, Lf10/b;

    iget-object v2, v1, Lf10/b;->e:Lq30/w0;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v0, La20/b;->x:I

    if-eqz v4, :cond_2d

    if-ne v4, v8, :cond_2c

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    check-cast v3, Ll83/n;

    iget-object v3, v3, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_11

    :cond_2c
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, v2, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v4, Lbz/c;

    sget-object v7, Lbz/b;->I:Lbz/b;

    invoke-static {v4, v7}, Lvd/e;->f0(Lbz/c;Lbz/b;)V

    sget-object v4, Lxx/a;->w:Lxx/a;

    invoke-virtual {v2, v4}, Lq30/w0;->p(Lxx/e;)V

    iget-object v4, v1, Lf10/b;->b:Lt40/f;

    iput v8, v0, La20/b;->x:I

    invoke-virtual {v4, v0}, Lt40/f;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_2e

    goto :goto_12

    :cond_2e
    move-object v3, v4

    :goto_11
    nop

    instance-of v4, v3, Ll83/m;

    if-nez v4, :cond_2f

    move-object v4, v3

    check-cast v4, Ll83/a0;

    iget-object v4, v2, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v4, Lbz/c;

    sget-object v7, Lbz/b;->I:Lbz/b;

    check-cast v4, Lbz/a;

    invoke-virtual {v4, v7}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v4

    new-instance v7, Lxx/c;

    invoke-static {v4}, Lq30/w0;->o(Lkotlin/time/Duration;)Ljava/lang/Float;

    move-result-object v4

    invoke-direct {v7, v5, v4}, Lxx/c;-><init>(ILjava/lang/Float;)V

    invoke-virtual {v2, v7}, Lq30/w0;->p(Lxx/e;)V

    :cond_2f
    invoke-static {v3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_30

    iget-object v4, v2, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v4, Lbz/c;

    sget-object v7, Lbz/b;->I:Lbz/b;

    check-cast v4, Lbz/a;

    invoke-virtual {v4, v7}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v4

    new-instance v7, Lxx/b;

    invoke-static {v4}, Lq30/w0;->o(Lkotlin/time/Duration;)Ljava/lang/Float;

    move-result-object v4

    invoke-direct {v7, v3, v4, v5}, Lxx/b;-><init>(Ljava/lang/Throwable;Ljava/lang/Float;I)V

    invoke-virtual {v2, v7}, Lq30/w0;->p(Lxx/e;)V

    iget-object v1, v1, Lf10/b;->a:Lb20/f;

    sget-object v2, Lb20/e;->Y:Lb20/e;

    sget v4, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v3}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v3

    const/4 v4, 0x4

    invoke-static {v1, v2, v3, v6, v4}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    :cond_30
    sget-object v3, Ll83/a0;->a:Ll83/a0;

    :goto_12
    return-object v3

    :pswitch_a
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La20/b;->x:I

    if-eqz v2, :cond_32

    if-ne v2, v8, :cond_31

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_13

    :cond_31
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_32
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v2, Ls83/i;

    iput v8, v0, La20/b;->x:I

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_33

    goto :goto_14

    :cond_33
    :goto_13
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_14
    return-object v1

    :pswitch_b
    iget-object v1, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v1, Lf0/x0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v5, v0, La20/b;->x:I

    if-eqz v5, :cond_36

    if-eq v5, v8, :cond_35

    if-ne v5, v4, :cond_34

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_18

    :cond_34
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_35
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_16

    :cond_36
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_37
    :goto_15
    iget-object v5, v1, Lf0/x0;->Y:Ldc3/h;

    if-eqz v5, :cond_38

    iput v8, v0, La20/b;->x:I

    invoke-virtual {v5, v0}, Ldc3/h;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_38

    goto :goto_17

    :cond_38
    :goto_16
    iget-object v5, v1, Lf0/x0;->T:Le10/k0;

    if-eqz v5, :cond_37

    new-instance v5, Lev2/b;

    invoke-direct {v5, v3}, Lev2/b;-><init>(I)V

    iput v4, v0, La20/b;->x:I

    invoke-static {v5, v0}, Lp1/x;->N(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_39

    :goto_17
    return-object v2

    :cond_39
    :goto_18
    iget-object v5, v1, Lf0/x0;->T:Le10/k0;

    if-eqz v5, :cond_37

    iget-object v5, v5, Le10/k0;->x:Ljava/lang/Object;

    check-cast v5, Landroid/widget/Magnifier;

    invoke-virtual {v5}, Landroid/widget/Magnifier;->update()V

    goto :goto_15

    :pswitch_c
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La20/b;->x:I

    if-eqz v2, :cond_3b

    if-ne v2, v8, :cond_3a

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_19

    :cond_3a
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v2, Lf0/i0;

    iput v8, v0, La20/b;->x:I

    invoke-static {v2, v6, v0}, Lds/q;->m(La3/n;Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3c

    goto :goto_1a

    :cond_3c
    :goto_19
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_1a
    return-object v1

    :pswitch_d
    iget-object v1, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v1, Lf0/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, La20/b;->x:I

    if-eqz v3, :cond_3e

    if-ne v3, v8, :cond_3d

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1b

    :cond_3d
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v3, Lb3/v1;->s:Lp1/u2;

    invoke-static {v1, v3}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb3/j3;

    invoke-interface {v3}, Lb3/j3;->c()J

    move-result-wide v3

    iput v8, v0, La20/b;->x:I

    invoke-static {v3, v4, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_3f

    goto :goto_1c

    :cond_3f
    :goto_1b
    iget-object v1, v1, Lf0/c0;->k0:Lc93/a;

    if-eqz v1, :cond_40

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_40
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_1c
    return-object v2

    :pswitch_e
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v3, v0, La20/b;->x:I

    if-eqz v3, :cond_44

    if-eq v3, v8, :cond_42

    if-ne v3, v4, :cond_41

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_1e

    :cond_41
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_42
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_43

    goto :goto_1d

    :cond_43
    move-object v1, v3

    goto :goto_1f

    :cond_44
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_1d
    iput v4, v0, La20/b;->x:I

    invoke-static {v6, v6, v0, v2}, Lvd/f;->J(Lvg/n;Ls/m2;Ls83/i;I)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_45

    goto :goto_1f

    :cond_45
    :goto_1e
    move-object v1, v2

    check-cast v1, Ljava/lang/String;

    :goto_1f
    return-object v1

    :pswitch_f
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La20/b;->x:I

    if-eqz v2, :cond_48

    if-eq v2, v8, :cond_47

    if-ne v2, v4, :cond_46

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    check-cast v1, Ll83/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_21

    :cond_46
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_47
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_20

    :cond_48
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v8, v0, La20/b;->x:I

    const-wide/16 v2, 0x1f4

    invoke-static {v2, v3, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_49

    goto :goto_22

    :cond_49
    :goto_20
    iget-object v2, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v2, Le33/n;

    iput v4, v0, La20/b;->x:I

    const-string v3, "[onRenegotiationNeeded]"

    invoke-virtual {v2, v3, v5, v0}, Le33/n;->t(Ljava/lang/String;ZLs83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4a

    goto :goto_22

    :cond_4a
    :goto_21
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_22
    return-object v1

    :pswitch_10
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La20/b;->x:I

    if-eqz v2, :cond_4c

    if-ne v2, v8, :cond_4b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_23

    :cond_4b
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v2, Ld0/f1;

    iput v8, v0, La20/b;->x:I

    invoke-static {v2, v0}, Ld0/f1;->I0(Ld0/f1;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4d

    goto :goto_24

    :cond_4d
    :goto_23
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_24
    return-object v1

    :pswitch_11
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La20/b;->x:I

    if-eqz v2, :cond_4f

    if-ne v2, v8, :cond_4e

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_25

    :cond_4e
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    const/16 v2, 0x190

    int-to-long v2, v2

    iput v8, v0, La20/b;->x:I

    invoke-static {v2, v3, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_50

    goto :goto_26

    :cond_50
    :goto_25
    iget-object v1, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    sget v2, Lb30/o5;->a:I

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v1, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_26
    return-object v1

    :pswitch_12
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La20/b;->x:I

    if-eqz v2, :cond_52

    if-ne v2, v8, :cond_51

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_27

    :cond_51
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_52
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v8, v0, La20/b;->x:I

    const-wide/16 v2, 0xfa

    invoke-static {v2, v3, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_53

    goto :goto_28

    :cond_53
    :goto_27
    iget-object v1, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v1, Lp1/z0;

    sget-object v2, Lb30/c4;->a:Lc0/l0;

    check-cast v1, Lp1/g1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp1/g1;->y(F)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_28
    return-object v1

    :pswitch_13
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La20/b;->x:I

    if-eqz v2, :cond_55

    if-ne v2, v8, :cond_54

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_29

    :cond_54
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_55
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v2, Lf0/r1;

    iput v8, v0, La20/b;->x:I

    invoke-virtual {v2, v5, v0}, Lf0/r1;->g(ILq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_56

    goto :goto_2a

    :cond_56
    :goto_29
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_2a
    return-object v1

    :pswitch_14
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La20/b;->x:I

    if-eqz v2, :cond_58

    if-ne v2, v8, :cond_57

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2b

    :cond_57
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_58
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v8, v0, La20/b;->x:I

    const-wide/16 v2, 0x5dc

    invoke-static {v2, v3, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_59

    goto :goto_2c

    :cond_59
    :goto_2b
    iget-object v1, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v1, La30/k1;

    check-cast v1, La30/h1;

    iget-object v1, v1, La30/h1;->a:Lh02/n0;

    invoke-virtual {v1}, Lh02/n0;->invoke()Ljava/lang/Object;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_2c
    return-object v1

    :pswitch_15
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v5, v0, La20/b;->x:I

    if-eqz v5, :cond_5b

    if-ne v5, v8, :cond_5a

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2d

    :cond_5a
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v1, Ld1/j;

    iget-object v5, v1, Ld1/j;->x:Ljava/lang/Object;

    check-cast v5, Ln53/e;

    new-instance v6, Lu;

    invoke-direct {v6, v1, v2}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v8, v0, La20/b;->x:I

    new-instance v1, La6/t;

    invoke-direct {v1, v6, v4}, La6/t;-><init>(Lec3/m;I)V

    invoke-virtual {v5, v1, v0}, Ln53/e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-object v1, v3

    :goto_2d
    return-object v1

    :pswitch_16
    iget-object v1, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v1, Lb30/m0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, La20/b;->x:I

    if-eqz v3, :cond_5d

    if-ne v3, v8, :cond_5c

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2e

    :cond_5c
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Lb30/m0;->h:Lec3/h2;

    iget-object v4, v1, Lb30/m0;->i:Lec3/h2;

    new-instance v7, Lb30/k0;

    invoke-direct {v7, v1, v6, v5}, Lb30/k0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v9, Lec3/l1;

    invoke-direct {v9, v3, v4, v7, v8}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    new-instance v3, Lb30/l0;

    invoke-direct {v3, v1, v6, v5}, Lb30/l0;-><init>(Lb30/m0;Lq83/d;I)V

    iput v8, v0, La20/b;->x:I

    invoke-static {v9, v3, v0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_5e

    goto :goto_2f

    :cond_5e
    :goto_2e
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_2f
    return-object v2

    :pswitch_17
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v4, v0, La20/b;->x:I

    if-eqz v4, :cond_60

    if-ne v4, v8, :cond_5f

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_31

    :cond_5f
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_60
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v4, Lay/b0;

    iput v8, v0, La20/b;->x:I

    iget-object v5, v4, Lay/b0;->w:Lay/j;

    iget-object v5, v5, Lay/j;->g:Lec3/w1;

    new-instance v7, Le;

    invoke-direct {v7, v4, v6, v3}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v5, v7, v0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_61

    goto :goto_30

    :cond_61
    move-object v3, v1

    :goto_30
    if-ne v3, v2, :cond_62

    move-object v1, v2

    :cond_62
    :goto_31
    return-object v1

    :pswitch_18
    iget-object v1, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, La20/b;->x:I

    if-eqz v3, :cond_64

    if-eq v3, v8, :cond_63

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_63
    invoke-static/range {p1 .. p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object v1

    throw v1

    :cond_64
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {v3}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lay/b0;

    iget-object v3, v3, Lay/b0;->F:Lec3/w1;

    new-instance v4, Lay/l;

    invoke-direct {v4, v1, v5}, Lay/l;-><init>(Ljava/lang/Object;I)V

    iput v8, v0, La20/b;->x:I

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v4, v0}, Lec3/w1;->k(Lec3/w1;Lec3/m;Lq83/d;)V

    return-object v2

    :pswitch_19
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La20/b;->x:I

    if-eqz v2, :cond_66

    if-ne v2, v8, :cond_65

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_32

    :cond_65
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_66
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v2, Landroidx/room/v;

    iget-object v2, v2, Landroidx/room/v;->c:Landroidx/room/i2;

    iput v8, v0, La20/b;->x:I

    invoke-virtual {v2, v0}, Landroidx/room/i2;->f(Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_67

    goto :goto_33

    :cond_67
    :goto_32
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_33
    return-object v1

    :pswitch_1a
    iget-object v1, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v1, La30/w0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, La20/b;->x:I

    if-eqz v3, :cond_69

    if-ne v3, v8, :cond_68

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_34

    :cond_68
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_69
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput v8, v0, La20/b;->x:I

    const-wide/16 v3, 0x1388

    invoke-static {v3, v4, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_6a

    goto :goto_35

    :cond_6a
    :goto_34
    iget-object v2, v1, La30/w0;->x:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/j;

    invoke-virtual {v2}, Landroidx/lifecycle/p0;->hasActiveObservers()Z

    move-result v2

    if-nez v2, :cond_6c

    iget-object v2, v1, La30/w0;->F:Ljava/lang/Object;

    check-cast v2, Lbc3/c2;

    if-eqz v2, :cond_6b

    invoke-virtual {v2, v6}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_6b
    iput-object v6, v1, La30/w0;->F:Ljava/lang/Object;

    :cond_6c
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_35
    return-object v2

    :pswitch_1b
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La20/b;->x:I

    if-eqz v2, :cond_6e

    if-ne v2, v8, :cond_6d

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_36

    :cond_6d
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v2, La20/j;

    iput v8, v0, La20/b;->x:I

    invoke-static {v2, v0}, La20/j;->g(La20/j;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6f

    goto :goto_37

    :cond_6f
    :goto_36
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_37
    return-object v1

    :pswitch_1c
    iget-object v1, v0, La20/b;->y:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, La20/b;->x:I

    if-eqz v3, :cond_71

    if-eq v3, v8, :cond_70

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_70
    invoke-static/range {p1 .. p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object v1

    throw v1

    :cond_71
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget v3, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->z:I

    iget-object v3, v1, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->y:Landroidx/lifecycle/y1;

    invoke-virtual {v3}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La20/j;

    iget-object v3, v3, La20/j;->H:Lec3/w1;

    new-instance v4, Lu;

    invoke-direct {v4, v1, v8}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v8, v0, La20/b;->x:I

    invoke-virtual {v3, v4, v0}, Lec3/w1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v2

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
