.class public final Ls40/c0;
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
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 1
    iput p4, p0, Ls40/c0;->w:I

    iput-object p1, p0, Ls40/c0;->y:Ljava/lang/Object;

    iput-object p2, p0, Ls40/c0;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p3, p0, Ls40/c0;->w:I

    iput-object p1, p0, Ls40/c0;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Lq83/d;Lyf/e;Luf/u;I)V
    .locals 0

    .line 3
    iput p4, p0, Ls40/c0;->w:I

    iput-object p2, p0, Ls40/c0;->y:Ljava/lang/Object;

    iput-object p3, p0, Ls40/c0;->z:Ljava/lang/Object;

    const/4 p2, 0x2

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Ls40/c0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v0, Lzz/a;

    const/16 v1, 0x1d

    invoke-direct {p1, v0, p2, v1}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lzx/g;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lzx/s;

    const/16 v2, 0x1c

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lec3/f2;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lb30/m;

    const/16 v2, 0x1b

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/glance/session/SessionWorker;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lp6/l;

    const/16 v2, 0x1a

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance v0, Ls40/c0;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lx20/w;

    const/16 v2, 0x19

    invoke-direct {v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ls40/c0;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_4
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lwz/y;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/model/ConsumerSessionRefresh;

    const/16 v2, 0x18

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_5
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lwz/y;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lwz/q;

    const/16 v2, 0x17

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_6
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lwz/y;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/link/LinkActivity;

    const/16 v2, 0x16

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_7
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lwe/g0;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lwe/g;

    const/16 v2, 0x15

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_8
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lw20/x;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x14

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_9
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionActivity;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lh40/k;

    const/16 v2, 0x13

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_a
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lh40/k;

    const/16 v2, 0x12

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_b
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lux/j0;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Ly00/d5;

    const/16 v2, 0x11

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_c
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lux/j0;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Ly00/m;

    const/16 v2, 0x10

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_d
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Luf/s;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Luf/u;

    const/16 v2, 0xf

    invoke-direct {p1, p2, v0, v1, v2}, Ls40/c0;-><init>(Lq83/d;Lyf/e;Luf/u;I)V

    return-object p1

    :pswitch_e
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    const/16 v2, 0xe

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_f
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lu2/v;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lf1/s1;

    const/16 v2, 0xd

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_10
    new-instance v0, Ls40/c0;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lty/a;

    const/16 v2, 0xc

    invoke-direct {v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ls40/c0;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_11
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lyf/e;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Luf/u;

    const/16 v2, 0xb

    invoke-direct {p1, p2, v0, v1, v2}, Ls40/c0;-><init>(Lq83/d;Lyf/e;Luf/u;I)V

    return-object p1

    :pswitch_12
    new-instance v0, Ls40/c0;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lt30/g;

    const/16 v2, 0xa

    invoke-direct {v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ls40/c0;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_13
    new-instance v0, Ls40/c0;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lt23/b4;

    const/16 v2, 0x9

    invoke-direct {v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ls40/c0;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_14
    new-instance v0, Ls40/c0;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lec3/s1;

    const/16 v2, 0x8

    invoke-direct {v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ls40/c0;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_15
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lt23/s0;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Ldc3/u;

    const/4 v2, 0x7

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_16
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v0, Lt23/c0;

    const/4 v1, 0x6

    invoke-direct {p1, v0, p2, v1}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_17
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lt23/f;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lt23/c0;

    const/4 v2, 0x5

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_18
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lt10/d;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Le10/k;

    const/4 v2, 0x4

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_19
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lsz/d;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Ldq/f;

    const/4 v2, 0x3

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1a
    new-instance v0, Ls40/c0;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lsz/d;

    const/4 v2, 0x2

    invoke-direct {v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ls40/c0;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_1b
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/view/PaymentAuthWebViewActivity;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, p2, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1c
    new-instance p1, Ls40/c0;

    iget-object v0, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v0, Ls40/d0;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

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

    iget v0, p0, Ls40/c0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_f
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Landroidx/lifecycle/q0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_16
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_1c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ls40/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ls40/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ls40/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 14

    iget v0, p0, Ls40/c0;->w:I

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x4

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v7, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lzz/e;->a:Lzz/e;

    iget-object v1, p0, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lzz/a;

    iget-object v8, v1, Lzz/a;->c:Lxz/x;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v9, p0, Ls40/c0;->x:I

    if-eqz v9, :cond_2

    if-eq v9, v7, :cond_1

    if-ne v9, v4, :cond_0

    iget-object v1, p0, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v1, Lzz/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    move-object v8, p0

    goto :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v1, Lzz/a;->b:Lt40/f;

    iput v7, p0, Ls40/c0;->x:I

    invoke-virtual {p1, p0}, Lt40/f;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    move-object v8, p0

    goto :goto_4

    :cond_3
    :goto_0
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-nez v6, :cond_d

    check-cast p1, Ll83/a0;

    iget-object p1, v1, Lzz/a;->d:Lwz/g0;

    iget-object v3, v8, Lxz/x;->a:Lxz/f0;

    iget-object v3, v3, Lxz/f0;->b:Lec3/r1;

    iget-object v3, v3, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwz/d;

    iget-object v3, v3, Lwz/d;->w:Ld00/l;

    if-eqz v3, :cond_5

    iget-object v3, v3, Ld00/l;->H:Ljava/lang/String;

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    move-object v9, v3

    goto :goto_3

    :cond_5
    :goto_2
    iget-object v3, p1, Lwz/g0;->F:Lwz/f0;

    iget-object v3, v3, Lwz/f0;->x:Ljava/lang/String;

    goto :goto_1

    :goto_3
    if-nez v9, :cond_6

    move-object v8, p0

    goto/16 :goto_6

    :cond_6
    sget-object v10, Ly00/c2;->y:Ly00/c2;

    invoke-virtual {p1}, Lwz/g0;->b()Ljava/lang/String;

    move-result-object v12

    iput-object v1, p0, Ls40/c0;->y:Ljava/lang/Object;

    iput v4, p0, Ls40/c0;->x:I

    const/4 v11, 0x0

    move-object v13, p0

    invoke-virtual/range {v8 .. v13}, Lxz/x;->k(Ljava/lang/String;Ly00/c2;ZLjava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    move-object v8, v13

    if-ne p1, v2, :cond_7

    :goto_4
    move-object v0, v2

    goto :goto_6

    :cond_7
    :goto_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ls30/b;->w(Ljava/lang/Object;)Lxz/m0;

    move-result-object p1

    instance-of v1, p1, Lxz/l0;

    if-eqz v1, :cond_8

    goto :goto_6

    :cond_8
    instance-of v1, p1, Lxz/k0;

    if-eqz v1, :cond_9

    goto :goto_6

    :cond_9
    instance-of v0, p1, Lxz/i0;

    if-eqz v0, :cond_a

    new-instance v0, Lzz/c;

    check-cast p1, Lxz/i0;

    iget-object p1, p1, Lxz/i0;->a:Ljava/lang/Throwable;

    invoke-direct {v0, p1}, Lzz/c;-><init>(Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_a
    instance-of v0, p1, Lxz/h0;

    if-eqz v0, :cond_b

    new-instance v0, Lzz/b;

    check-cast p1, Lxz/h0;

    iget-object p1, p1, Lxz/h0;->a:Ljava/lang/Throwable;

    invoke-direct {v0, p1}, Lzz/b;-><init>(Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_b
    instance-of v0, p1, Lxz/j0;

    if-eqz v0, :cond_c

    new-instance v0, Lzz/d;

    check-cast p1, Lxz/j0;

    iget-object p1, p1, Lxz/j0;->a:Ljava/lang/Throwable;

    invoke-direct {v0, p1}, Lzz/d;-><init>(Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_d
    move-object v8, p0

    iget-object p1, v1, Lzz/a;->e:Lb20/f;

    sget-object v0, Lb20/c;->O:Lb20/c;

    sget v1, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v6}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v1

    invoke-static {p1, v0, v1, v5, v3}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    new-instance v0, Lzz/c;

    invoke-direct {v0, v6}, Lzz/c;-><init>(Ljava/lang/Throwable;)V

    :goto_6
    return-object v0

    :pswitch_0
    move-object v8, p0

    iget-object v0, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v0, Lzx/s;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v8, Ls40/c0;->x:I

    if-eqz v2, :cond_10

    if-eq v2, v7, :cond_f

    if-ne v2, v4, :cond_e

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_9

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_10
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lzx/g;

    iget-object v2, p1, Lzx/g;->g:Lzx/a;

    if-eqz v2, :cond_12

    iget-object v2, v0, Lzx/s;->a:Lzx/n;

    iput v7, v8, Ls40/c0;->x:I

    invoke-virtual {v2, p1, p0}, Lzx/n;->a(Lzx/g;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_11

    goto :goto_a

    :cond_11
    :goto_7
    check-cast p1, Ljava/util/List;

    goto :goto_8

    :cond_12
    move-object p1, v5

    :goto_8
    iget-object v2, v0, Lzx/s;->b:Lq83/j;

    new-instance v3, Lo23/p;

    const/16 v6, 0x15

    invoke-direct {v3, v0, p1, v5, v6}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v4, v8, Ls40/c0;->x:I

    invoke-static {v2, v3, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_13

    goto :goto_a

    :cond_13
    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_a
    return-object v1

    :pswitch_1
    move-object v8, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_15

    if-eq v1, v7, :cond_14

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_14
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_b

    :cond_15
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lec3/f2;

    new-instance v1, Lx30/h0;

    iget-object v2, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v2, Lb30/m;

    invoke-direct {v1, v2, v7}, Lx30/h0;-><init>(Ljava/lang/Object;I)V

    iput v7, v8, Ls40/c0;->x:I

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_16

    return-object v0

    :cond_16
    :goto_b
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :pswitch_2
    move-object v8, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_18

    if-ne v1, v7, :cond_17

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_c

    :cond_17
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_18
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Landroidx/glance/session/SessionWorker;

    iget-object p1, p1, Landroidx/glance/session/SessionWorker;->x:Lx6/f;

    new-instance v1, Lx6/o;

    iget-object v2, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v2, Lp6/l;

    invoke-direct {v1, v2, v5, v7}, Lx6/o;-><init>(Lp6/l;Lq83/d;I)V

    iput v7, v8, Ls40/c0;->x:I

    check-cast p1, Lx6/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v1, p0}, Lx6/l;->b(Lx6/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_19

    goto :goto_d

    :cond_19
    :goto_c
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_d
    return-object v0

    :pswitch_3
    move-object v8, p0

    iget-object v0, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v0, Lx20/w;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v8, Ls40/c0;->x:I

    if-eqz v2, :cond_1b

    if-ne v2, v7, :cond_1a

    iget-object v1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_e

    :cond_1a
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-object v2, v0, Lx20/w;->w:Lx20/s;

    iget-wide v2, v2, Lx20/s;->c:J

    iput-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    iput v7, v8, Ls40/c0;->x:I

    invoke-static {v2, v3, p0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1c

    goto :goto_f

    :cond_1c
    move-object v1, p1

    :goto_e
    iget-object p1, v0, Lx20/w;->x:Lf30/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "scope"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lf30/e;->d:Lbc3/z;

    new-instance v2, La20/b;

    const/16 v3, 0x14

    invoke-direct {v2, p1, v5, v3}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v0, v5, v2, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p1, Lf30/e;->e:Lbc3/c2;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_f
    return-object v1

    :pswitch_4
    move-object v8, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_1e

    if-ne v1, v7, :cond_1d

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_10

    :cond_1d
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1e
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lwz/y;

    iget-object v1, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/model/ConsumerSessionRefresh;

    iput v7, v8, Ls40/c0;->x:I

    invoke-static {p1, v2, v1, p0, v3}, Lwz/y;->t(Lwz/y;ZLcom/stripe/android/model/ConsumerSessionRefresh;Ls83/c;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1f

    goto :goto_11

    :cond_1f
    :goto_10
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_11
    return-object v0

    :pswitch_5
    move-object v8, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_21

    if-ne v1, v7, :cond_20

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_12

    :cond_20
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_21
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lwz/y;

    iget-object p1, p1, Lwz/y;->R:Lec3/w1;

    iget-object v1, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lwz/q;

    iput v7, v8, Ls40/c0;->x:I

    invoke-virtual {p1, v1, p0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_22

    goto :goto_13

    :cond_22
    :goto_12
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_13
    return-object v0

    :pswitch_6
    move-object v8, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_24

    if-ne v1, v7, :cond_23

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_14

    :cond_23
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_24
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lwz/y;

    iget-object p1, p1, Lwz/y;->w:Lc00/a;

    iget-object p1, p1, Lc00/a;->k0:Lv03/h;

    invoke-interface {p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwz/s1;

    iget-object p1, p1, Lwz/s1;->a:Lec3/w1;

    new-instance v1, Lo23/p;

    iget-object v2, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/link/LinkActivity;

    const/16 v3, 0xf

    invoke-direct {v1, v2, v5, v3}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput v7, v8, Ls40/c0;->x:I

    invoke-static {p1, v1, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_25

    goto :goto_15

    :cond_25
    :goto_14
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_15
    return-object v0

    :pswitch_7
    move-object v8, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_27

    if-ne v1, v7, :cond_26

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_16

    :cond_26
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_27
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lwe/g0;

    iget-object v1, p1, Lwe/g0;->e:Lgf/o;

    iget-object v2, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v2, Lwe/g;

    iget-object v3, v2, Lwe/g;->m:Lve/e;

    new-instance v4, Lo23/p;

    const/16 v6, 0xe

    invoke-direct {v4, v2, p1, v5, v6}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v7, v8, Ls40/c0;->x:I

    invoke-virtual {v1, v3, v4, p0}, Lgf/o;->a(Ljava/lang/Object;Lo23/p;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_28

    move-object p1, v0

    :cond_28
    :goto_16
    return-object p1

    :pswitch_8
    move-object v8, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_2a

    if-ne v1, v7, :cond_29

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_17

    :cond_29
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lw20/x;

    iget-object p1, p1, Lw20/x;->x:Lec3/w1;

    new-instance v1, Lw20/n;

    iget-object v2, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-direct {v1, v2}, Lw20/n;-><init>(Ljava/lang/String;)V

    iput v7, v8, Ls40/c0;->x:I

    invoke-virtual {p1, v1, p0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2b

    goto :goto_18

    :cond_2b
    :goto_17
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_18
    return-object v0

    :pswitch_9
    move-object v8, p0

    iget-object v0, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionActivity;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v8, Ls40/c0;->x:I

    if-eqz v2, :cond_2d

    if-ne v2, v7, :cond_2c

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_19

    :cond_2c
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2d
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {p1}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw20/x;

    iget-object p1, p1, Lw20/x;->y:Lec3/q1;

    new-instance v2, Ln43/a;

    iget-object v3, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v3, Lh40/k;

    const/16 v4, 0x1c

    invoke-direct {v2, v0, v3, v5, v4}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v7, v8, Ls40/c0;->x:I

    invoke-static {p1, v2, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2e

    goto :goto_1a

    :cond_2e
    :goto_19
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_1a
    return-object v1

    :pswitch_a
    move-object v8, p0

    iget-object v0, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v8, Ls40/c0;->x:I

    if-eqz v2, :cond_30

    if-ne v2, v7, :cond_2f

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1b

    :cond_2f
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_30
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;->y:I

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationActivity;->o()Lv20/r;

    move-result-object p1

    iget-object p1, p1, Lv20/r;->x:Lec3/q1;

    new-instance v2, Ln43/a;

    iget-object v3, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v3, Lh40/k;

    const/16 v4, 0x1b

    invoke-direct {v2, v0, v3, v5, v4}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v7, v8, Ls40/c0;->x:I

    invoke-static {p1, v2, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_31

    goto :goto_1c

    :cond_31
    :goto_1b
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_1c
    return-object v1

    :pswitch_b
    move-object v8, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_34

    if-ne v1, v7, :cond_33

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    :cond_32
    move-object v0, p1

    goto :goto_1d

    :cond_33
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_34
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lux/j0;

    iget-object v1, p1, Lux/j0;->a:Lb10/z0;

    iget-object v2, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v2, Ly00/d5;

    new-instance v3, Lyy/f;

    iget-object p1, p1, Lux/j0;->b:Ljava/lang/String;

    invoke-direct {v3, p1, v5, v5}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput v7, v8, Ls40/c0;->x:I

    invoke-virtual {v1, v2, v3, p0}, Lb10/z0;->p(Ly00/d5;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_32

    goto :goto_1e

    :goto_1d
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_35

    :goto_1e
    return-object v0

    :cond_35
    sget v0, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {p1}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p1

    throw p1

    :pswitch_c
    move-object v8, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_37

    if-ne v1, v7, :cond_36

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1f

    :cond_36
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_37
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lux/j0;

    iget-object v1, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Ly00/m;

    iput v7, v8, Ls40/c0;->x:I

    invoke-virtual {p1, v1, p0}, Lux/j0;->c(Ly00/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_38

    move-object p1, v0

    :cond_38
    :goto_1f
    return-object p1

    :pswitch_d
    move-object v8, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_3a

    if-ne v1, v7, :cond_39

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_20

    :cond_39
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Luf/s;

    iget-object p1, p1, Luf/s;->a:Lyf/e;

    iget-object v1, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Luf/u;

    iput v7, v8, Ls40/c0;->x:I

    invoke-interface {p1, v1, p0}, Lyf/e;->a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3b

    move-object p1, v0

    :cond_3b
    :goto_20
    return-object p1

    :pswitch_e
    move-object v8, p0

    iget-object v0, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v8, Ls40/c0;->x:I

    if-eqz v2, :cond_3d

    if-eq v2, v7, :cond_3c

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3c
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_21

    :cond_3d
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->r()Lu10/q;

    move-result-object p1

    iget-object p1, p1, Lu10/q;->e:Lec3/q1;

    new-instance v2, Landroidx/room/x;

    iget-object v3, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    const/16 v4, 0x12

    invoke-direct {v2, v4, v0, v3}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v7, v8, Ls40/c0;->x:I

    iget-object p1, p1, Lec3/q1;->w:Lec3/t1;

    invoke-interface {p1, v2, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3e

    return-object v1

    :cond_3e
    :goto_21
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :pswitch_f
    move-object v8, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_40

    if-ne v1, v7, :cond_3f

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_22

    :cond_3f
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_40
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lu2/v;

    iget-object p1, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast p1, Lf1/s1;

    move v9, v7

    new-instance v7, Lf1/h1;

    invoke-direct {v7, p1, v4}, Lf1/h1;-><init>(Lf1/s1;I)V

    iput v9, v8, Ls40/c0;->x:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x7

    invoke-static/range {v3 .. v9}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_41

    goto :goto_23

    :cond_41
    :goto_22
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_23
    return-object v0

    :pswitch_10
    move-object v8, p0

    move v9, v7

    iget-object v0, v8, Ls40/c0;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lty/a;

    iget-object v2, v1, Lty/a;->a:Lpg3/p;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v7, v8, Ls40/c0;->x:I

    if-eqz v7, :cond_44

    if-eq v7, v9, :cond_43

    if-ne v7, v4, :cond_42

    iget-object v0, v8, Ls40/c0;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lty/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_26

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_28

    :cond_42
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_43
    iget-object v6, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v6, Lbc3/c0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_24

    :cond_44
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iput-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    iput v9, v8, Ls40/c0;->x:I

    iget-object p1, v2, Lpg3/p;->x:Ljava/lang/Object;

    check-cast p1, Lq83/j;

    new-instance v6, Lo23/p;

    const/16 v7, 0xb

    invoke-direct {v6, v2, v5, v7}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, v6, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_45

    goto/16 :goto_2c

    :cond_45
    :goto_24
    check-cast p1, Lty/b;

    if-eqz p1, :cond_47

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    iget-wide v9, p1, Lty/b;->z:J

    sub-long/2addr v6, v9

    sget-wide v9, Lty/b;->E:J

    cmp-long v6, v6, v9

    if-lez v6, :cond_46

    goto :goto_25

    :cond_46
    move-object v0, p1

    goto :goto_2b

    :cond_47
    :goto_25
    :try_start_1
    iget-object v6, v1, Lty/a;->c:Lab/i0;

    iget-object v7, v1, Lty/a;->b:Lq30/u0;

    invoke-virtual {v7, p1}, Lq30/u0;->A(Lty/b;)Lty/e;

    move-result-object p1

    iput-object v1, v8, Ls40/c0;->y:Ljava/lang/Object;

    iput v4, v8, Ls40/c0;->x:I

    invoke-virtual {v6, p1, p0}, Lab/i0;->r(Lyy/m0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v0, :cond_48

    goto/16 :goto_2c

    :cond_48
    move-object v4, v1

    :goto_26
    :try_start_2
    check-cast p1, Lyy/n0;

    iget-boolean v0, p1, Lyy/n0;->d:Z

    if-eqz v0, :cond_49

    goto :goto_27

    :cond_49
    move-object p1, v5

    :goto_27
    if-eqz p1, :cond_4a

    sget-object v0, Lty/d;->a:Lty/c;

    invoke-static {p1}, Lyy/q;->i(Lyy/n0;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lty/c;->t(Lorg/json/JSONObject;)Lty/b;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_29

    :cond_4a
    move-object p1, v5

    goto :goto_29

    :catchall_1
    move-exception v0

    move-object p1, v0

    move-object v4, v1

    :goto_28
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_29
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_4b

    sget v6, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v0}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v0

    iget-object v4, v4, Lty/a;->d:Lb20/f;

    sget-object v6, Lb20/c;->V:Lb20/c;

    invoke-static {v4, v6, v0, v5, v3}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    :cond_4b
    instance-of v0, p1, Ll83/m;

    if-eqz v0, :cond_4c

    goto :goto_2a

    :cond_4c
    move-object v5, p1

    :goto_2a
    check-cast v5, Lty/b;

    move-object v0, v5

    :goto_2b
    iget-object p1, v1, Lty/a;->f:Lty/b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4d

    if-eqz v0, :cond_4d

    iput-object v0, v1, Lty/a;->f:Lty/b;

    iget-object p1, v2, Lpg3/p;->y:Ljava/lang/Object;

    check-cast p1, Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "guid"

    iget-object v3, v0, Lty/b;->w:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "muid"

    iget-object v3, v0, Lty/b;->x:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "sid"

    iget-object v3, v0, Lty/b;->y:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "timestamp"

    iget-wide v3, v0, Lty/b;->z:J

    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "put(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_fraud_detection_data"

    invoke-interface {p1, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_4d
    :goto_2c
    return-object v0

    :pswitch_11
    move-object v8, p0

    move v9, v7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_4f

    if-ne v1, v9, :cond_4e

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2d

    :cond_4e
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4f
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lyf/e;

    iget-object v1, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Luf/u;

    iput v9, v8, Ls40/c0;->x:I

    invoke-interface {p1, v1, p0}, Lyf/e;->a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_50

    move-object p1, v0

    :cond_50
    :goto_2d
    return-object p1

    :pswitch_12
    move-object v8, p0

    move v9, v7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_53

    if-eq v1, v9, :cond_52

    if-ne v1, v4, :cond_51

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2f

    :cond_51
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_52
    iget-object v1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/q0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2e

    :cond_53
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Landroidx/lifecycle/q0;

    iget-object p1, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast p1, Lt30/g;

    iget-object p1, p1, Lt30/g;->x:Lq30/g0;

    iget-object p1, p1, Lq30/g0;->e:Lec3/h2;

    new-instance v2, Lh40/c;

    invoke-direct {v2, v4, v3, v5}, Lh40/c;-><init>(IILq83/d;)V

    iput-object v1, v8, Ls40/c0;->y:Ljava/lang/Object;

    iput v9, v8, Ls40/c0;->x:I

    invoke-static {p1, v2, p0}, Lec3/v;->B(Lec3/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_54

    goto :goto_30

    :cond_54
    :goto_2e
    iput-object v5, v8, Ls40/c0;->y:Ljava/lang/Object;

    iput v4, v8, Ls40/c0;->x:I

    check-cast v1, Landroidx/lifecycle/r0;

    invoke-virtual {v1, p1, p0}, Landroidx/lifecycle/r0;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_55

    goto :goto_30

    :cond_55
    :goto_2f
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_30
    return-object v0

    :pswitch_13
    move-object v8, p0

    move v9, v7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v8, Ls40/c0;->x:I

    if-eqz v2, :cond_57

    if-ne v2, v9, :cond_56

    iget-object v0, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_32

    :cond_56
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_57
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-object v2, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v2, Lt23/b4;

    iget-object v3, v2, Lt23/b4;->T:Lbc3/j0;

    if-eqz v3, :cond_58

    goto :goto_31

    :cond_58
    iget-object v3, v2, Lt23/b4;->x:Lbc3/c0;

    new-instance v4, Ll43/b;

    const/4 v6, 0x6

    invoke-direct {v4, v2, v5, v6}, Ll43/b;-><init>(Lt23/b4;Lq83/d;I)V

    invoke-static {v3, v5, v4, v1}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v3

    iput-object v3, v2, Lt23/b4;->T:Lbc3/j0;

    :goto_31
    iput-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    iput v9, v8, Ls40/c0;->x:I

    invoke-virtual {v3, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_59

    goto :goto_33

    :cond_59
    move-object v0, p1

    move-object p1, v1

    :goto_32
    check-cast p1, Ln23/h;

    sget-object v1, Lb23/g;->y:Lb23/g;

    invoke-static {v0}, Landroidx/room/c1;->G(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    invoke-interface {v2, v1, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5a

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-virtual {p1}, Ln23/h;->b()Ljava/lang/Object;

    move-result-object p1

    const-string v3, "location initialized: "

    invoke-static {p1, v3}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, v1, v0, p1, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_33
    return-object v0

    :pswitch_14
    move-object v8, p0

    move v9, v7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_5c

    if-ne v1, v9, :cond_5b

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_34

    :cond_5b
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5c
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Lec3/s1;

    new-instance v2, Lw;

    const/16 v3, 0x11

    invoke-direct {v2, p1, v3}, Lw;-><init>(Lec3/m;I)V

    iput v9, v8, Ls40/c0;->x:I

    invoke-virtual {v1, v2, p0}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5d

    goto :goto_35

    :cond_5d
    :goto_34
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_35
    return-object v0

    :pswitch_15
    move-object v8, p0

    move v9, v7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_5f

    if-eq v1, v9, :cond_5e

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5e
    invoke-static {p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_5f
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lt23/s0;

    iget-object v1, p1, Lt23/s0;->j:Lec3/h2;

    new-instance v2, Landroidx/room/x;

    iget-object v3, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v3, Ldc3/u;

    const/16 v4, 0x10

    invoke-direct {v2, v4, p1, v3}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v9, v8, Ls40/c0;->x:I

    invoke-virtual {v1, v2, p0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v0

    :pswitch_16
    move-object v8, p0

    move v9, v7

    iget-object v0, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v0, Lt23/c0;

    iget-object v0, v0, Lt23/c0;->k:Lbc3/e2;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v8, Ls40/c0;->x:I

    if-eqz v2, :cond_61

    if-ne v2, v9, :cond_60

    iget-object v2, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_36

    :cond_60
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_61
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lbc3/t1;->getChildren()Lxb3/i;

    move-result-object p1

    check-cast p1, Lm83/r;

    iget-object p1, p1, Lm83/r;->b:Ljava/lang/Object;

    check-cast p1, Ls83/h;

    invoke-static {p1}, Lv63/c;->i(Lc93/m;)Lxb3/j;

    move-result-object p1

    move-object v2, p1

    :cond_62
    :goto_36
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_63

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbc3/k1;

    iput-object v2, v8, Ls40/c0;->y:Ljava/lang/Object;

    iput v9, v8, Ls40/c0;->x:I

    invoke-interface {p1, p0}, Lbc3/k1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_62

    goto :goto_37

    :cond_63
    invoke-virtual {v0, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_37
    return-object v1

    :pswitch_17
    move-object v8, p0

    move v9, v7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v3, v8, Ls40/c0;->x:I

    if-eqz v3, :cond_65

    if-ne v3, v9, :cond_64

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_38

    :cond_64
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_65
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lt23/f;

    iget-object v3, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v3, Lt23/c0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, v3, Lt23/c0;->C:Lec3/h2;

    new-instance v3, Lch/i;

    invoke-direct {v3, p1, v4}, Lch/i;-><init>(Lec3/l;I)V

    new-instance p1, Lt23/b;

    invoke-direct {p1, v1, v2, v5}, Lt23/b;-><init>(IILq83/d;)V

    invoke-static {v3, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    iput v9, v8, Ls40/c0;->x:I

    invoke-static {p1, p0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_66

    goto :goto_39

    :cond_66
    :goto_38
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_39
    return-object v0

    :pswitch_18
    move-object v8, p0

    move v9, v7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_68

    if-ne v1, v9, :cond_67

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3a

    :cond_67
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_68
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lt10/d;

    iget-object p1, p1, Lt10/d;->b:Le10/r0;

    iget-object v1, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Le10/k;

    iput v9, v8, Ls40/c0;->x:I

    invoke-virtual {p1, v1, p0}, Le10/r0;->g(Le10/k;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_69

    goto :goto_3b

    :cond_69
    :goto_3a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3b
    return-object v0

    :pswitch_19
    move-object v8, p0

    move v9, v7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_6b

    if-ne v1, v9, :cond_6a

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3c

    :cond_6a
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6b
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lsz/d;

    iget-object p1, p1, Lsz/d;->i:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsz/b;

    iget-object v1, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v1, Ldq/f;

    iput v9, v8, Ls40/c0;->x:I

    invoke-virtual {p1, v1, p0}, Lsz/b;->a(Ldq/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6c

    move-object p1, v0

    :cond_6c
    :goto_3c
    return-object p1

    :pswitch_1a
    move-object v8, p0

    move v9, v7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_6f

    if-eq v1, v9, :cond_6e

    if-ne v1, v4, :cond_6d

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3e

    :cond_6d
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6e
    iget-object v1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3d

    :cond_6f
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lec3/m;

    iget-object p1, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast p1, Lsz/d;

    iput-object v1, v8, Ls40/c0;->y:Ljava/lang/Object;

    iput v9, v8, Ls40/c0;->x:I

    invoke-static {p1, p0}, Lsz/d;->a(Lsz/d;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_70

    goto :goto_3f

    :cond_70
    :goto_3d
    iput-object v5, v8, Ls40/c0;->y:Ljava/lang/Object;

    iput v4, v8, Ls40/c0;->x:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_71

    goto :goto_3f

    :cond_71
    :goto_3e
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3f
    return-object v0

    :pswitch_1b
    move-object v8, p0

    move v9, v7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_73

    if-eq v1, v9, :cond_72

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_72
    invoke-static {p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_73
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast p1, Lec3/h2;

    new-instance v1, Lu;

    iget-object v2, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/view/PaymentAuthWebViewActivity;

    const/16 v3, 0x16

    invoke-direct {v1, v2, v3}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v9, v8, Ls40/c0;->x:I

    invoke-virtual {p1, v1, p0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v0

    :pswitch_1c
    move-object v8, p0

    move v9, v7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ls40/c0;->x:I

    if-eqz v1, :cond_75

    if-ne v1, v9, :cond_74

    iget-object v0, v8, Ls40/c0;->y:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_40

    :cond_74
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_75
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Ls40/c0;->z:Ljava/lang/Object;

    check-cast p1, Ls40/d0;

    iget-object v1, p1, Ls40/d0;->z:Lec3/h2;

    iput-object v1, v8, Ls40/c0;->y:Ljava/lang/Object;

    iput v9, v8, Ls40/c0;->x:I

    invoke-static {p1, p0}, Ls40/d0;->g(Ls40/d0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_76

    goto :goto_41

    :cond_76
    move-object v0, v1

    :goto_40
    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_41
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
