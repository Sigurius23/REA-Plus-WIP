.class public final Lo23/p;
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
    iput p4, p0, Lo23/p;->w:I

    iput-object p1, p0, Lo23/p;->x:Ljava/lang/Object;

    iput-object p2, p0, Lo23/p;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p3, p0, Lo23/p;->w:I

    iput-object p1, p0, Lo23/p;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lo23/p;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lo23/p;

    iget-object v0, p0, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lzx/s;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    const/16 v2, 0x15

    invoke-direct {p1, v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lo23/p;

    iget-object v0, p0, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Lq30/w0;

    const/16 v2, 0x14

    invoke-direct {p1, v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lo23/p;

    iget-object v0, p0, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lq30/w0;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x13

    invoke-direct {p1, v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Lo23/p;

    iget-object v0, p0, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lxz/x;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Ld00/l;

    const/16 v2, 0x12

    invoke-direct {p1, v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance v0, Lo23/p;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/glance/session/SessionWorker;

    const/16 v2, 0x11

    invoke-direct {v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lo23/p;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_4
    new-instance v0, Lo23/p;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Lx20/w;

    const/16 v2, 0x10

    invoke-direct {v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lo23/p;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_5
    new-instance v0, Lo23/p;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/link/LinkActivity;

    const/16 v2, 0xf

    invoke-direct {v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lo23/p;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_6
    new-instance p1, Lo23/p;

    iget-object v0, p0, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lwe/g;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Lwe/g0;

    const/16 v2, 0xe

    invoke-direct {p1, v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_7
    new-instance p1, Lo23/p;

    iget-object v0, p0, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/c;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Lyf/u;

    const/16 v2, 0xd

    invoke-direct {p1, v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_8
    new-instance p1, Lo23/p;

    iget-object v0, p0, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, [B

    const/16 v2, 0xc

    invoke-direct {p1, v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_9
    new-instance v0, Lo23/p;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Lpg3/p;

    const/16 v2, 0xb

    invoke-direct {v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lo23/p;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_a
    new-instance v0, Lo23/p;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Lt23/c0;

    const/16 v2, 0xa

    invoke-direct {v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lo23/p;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_b
    new-instance p1, Lo23/p;

    iget-object v0, p0, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    const/16 v2, 0x9

    invoke-direct {p1, v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_c
    new-instance v0, Lo23/p;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Lt10/e;

    const/16 v2, 0x8

    invoke-direct {v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lo23/p;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_d
    new-instance v0, Lo23/p;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Lt10/d;

    const/4 v2, 0x7

    invoke-direct {v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lo23/p;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_e
    new-instance v0, Lo23/p;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Lq30/w0;

    const/4 v2, 0x6

    invoke-direct {v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lo23/p;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_f
    new-instance p1, Lo23/p;

    iget-object v0, p0, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lq00/i0;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Lg2/i;

    const/4 v2, 0x5

    invoke-direct {p1, v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_10
    new-instance v0, Lo23/p;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Lp6/z0;

    const/4 v2, 0x4

    invoke-direct {v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lo23/p;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_11
    new-instance v0, Lo23/p;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    const/4 v2, 0x3

    invoke-direct {v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lo23/p;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_12
    new-instance v0, Lo23/p;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    const/4 v2, 0x2

    invoke-direct {v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lo23/p;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_13
    new-instance p1, Lo23/p;

    iget-object v0, p0, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Ld10/b;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_14
    new-instance p1, Lo23/p;

    iget-object v0, p0, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lo23/q;

    iget-object v1, p0, Lo23/p;->y:Ljava/lang/Object;

    check-cast v1, Lo23/a;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, p2, v2}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

    iget v0, p0, Lo23/p;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_3
    check-cast p1, Lx6/k;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lx20/o;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_5
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_6
    check-cast p1, Lve/e;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_9
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ljava/util/List;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_c
    check-cast p1, Lq20/y;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_d
    check-cast p1, Le10/b0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_e
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_10
    check-cast p1, Lr6/s;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lf6/f;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lf6/f;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_14
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lo23/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lo23/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lo23/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
    .locals 16

    move-object/from16 v1, p0

    iget v0, v1, Lo23/p;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    iget-object v6, v1, Lo23/p;->y:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lzx/s;

    check-cast v6, Ljava/util/List;

    if-nez v6, :cond_0

    sget-object v6, Lm83/y;->w:Lm83/y;

    :cond_0
    invoke-virtual {v0, v6}, Lzx/s;->d(Ljava/util/List;)V

    return-object v5

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "toString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lad3/c;->d:Lad3/b;

    iget-object v3, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->Companion:Lcom/stripe/android/core/networking/a;

    invoke-virtual {v4}, Lcom/stripe/android/core/networking/a;->serializer()Lwc3/c;

    move-result-object v4

    check-cast v4, Lwc3/j;

    invoke-virtual {v2, v4, v3}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    check-cast v6, Lq30/w0;

    iget-object v3, v6, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v3, Ll83/p;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lq30/w0;

    iget-object v0, v0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/SharedPreferences;

    check-cast v6, Ljava/lang/String;

    invoke-interface {v2, v6, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v6}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :try_start_0
    sget-object v0, Lad3/c;->d:Lad3/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->Companion:Lcom/stripe/android/core/networking/a;

    invoke-virtual {v3}, Lcom/stripe/android/core/networking/a;->serializer()Lwc3/c;

    move-result-object v3

    check-cast v3, Lwc3/b;

    invoke-virtual {v0, v3, v2}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_0
    instance-of v2, v0, Ll83/m;

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    move-object v4, v0

    :goto_1
    return-object v4

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lxz/x;

    iget-object v0, v0, Lxz/x;->a:Lxz/f0;

    new-instance v2, Lwz/d;

    check-cast v6, Ld00/l;

    invoke-direct {v2, v6, v4}, Lwz/d;-><init>(Ld00/l;Lwz/c;)V

    invoke-virtual {v0, v2}, Lxz/f0;->a(Lwz/d;)V

    return-object v5

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lx6/k;

    check-cast v6, Landroidx/glance/session/SessionWorker;

    iget-object v2, v6, Landroidx/glance/session/SessionWorker;->E:Ljava/lang/String;

    iget-object v0, v0, Lx6/k;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp6/l;

    return-object v0

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lx20/o;

    sget-object v2, Lx20/o;->y:Lx20/o;

    if-ne v0, v2, :cond_4

    check-cast v6, Lx20/w;

    iget-object v0, v6, Lx20/w;->x:Lf30/e;

    iget-object v2, v0, Lf30/e;->e:Lbc3/c2;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v4}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_3
    iput-object v4, v0, Lf30/e;->e:Lbc3/c2;

    :cond_4
    return-object v5

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast v6, Lcom/stripe/android/link/LinkActivity;

    iget-object v2, v6, Lcom/stripe/android/link/LinkActivity;->z:Lj/d;

    if-eqz v2, :cond_5

    invoke-virtual {v2, v0, v4}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :cond_5
    return-object v5

    :pswitch_6
    move-object v0, v6

    check-cast v0, Lwe/g0;

    sget-object v4, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "AWS4A"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v5, Lwe/g;

    iget-object v5, v5, Lwe/g;->m:Lve/e;

    iget-object v6, v5, Lve/e;->b:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v4

    move v6, v3

    :cond_6
    iget-object v7, v5, Lve/e;->a:Ljava/lang/String;

    const/4 v8, 0x4

    new-array v9, v8, [B

    fill-array-data v9, :array_0

    sget-object v10, Lwe/e;->x:Lwe/e;

    const-string v10, "AWS4-ECDSA-P256-SHA256"

    invoke-static {v10}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v10

    invoke-static {v9, v10}, Lm83/n;->F0([B[B)[B

    move-result-object v9

    new-array v10, v3, [B

    aput-byte v2, v10, v2

    invoke-static {v9, v10}, Lm83/n;->F0([B[B)[B

    move-result-object v9

    invoke-static {v7}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v7

    invoke-static {v9, v7}, Lm83/n;->F0([B[B)[B

    move-result-object v7

    array-length v9, v7

    add-int/lit8 v10, v9, 0x1

    invoke-static {v7, v10}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v7

    aput-byte v6, v7, v9

    new-array v8, v8, [B

    fill-array-data v8, :array_1

    invoke-static {v7, v8}, Lm83/n;->F0([B[B)[B

    move-result-object v7

    iget-object v8, v0, Lwe/g0;->d:Lc93/a;

    invoke-static {v4, v7, v8}, Ltx/f;->P([B[BLc93/a;)[B

    move-result-object v7

    sget-object v8, Lwe/h0;->a:Lkf/a;

    new-instance v8, Lkf/a;

    new-array v9, v3, [B

    aput-byte v2, v9, v2

    invoke-static {v9, v7}, Lm83/n;->F0([B[B)[B

    move-result-object v7

    invoke-direct {v8, v7}, Lkf/a;-><init>([B)V

    new-instance v7, Lkf/a;

    new-instance v9, Ljava/math/BigInteger;

    const-string v10, "1"

    invoke-direct {v9, v10}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    invoke-direct {v7, v9}, Lkf/a;-><init>(Ljava/math/BigInteger;)V

    iget-object v9, v8, Lkf/a;->w:Ljava/math/BigInteger;

    iget-object v10, v7, Lkf/a;->w:Ljava/math/BigInteger;

    invoke-virtual {v9, v10}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v11

    const-string v12, "add(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    goto :goto_2

    :cond_7
    invoke-virtual {v11, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    move-object v8, v7

    goto :goto_2

    :cond_8
    new-instance v8, Lkf/a;

    invoke-direct {v8, v11}, Lkf/a;-><init>(Ljava/math/BigInteger;)V

    :goto_2
    iget-object v7, v8, Lkf/a;->w:Ljava/math/BigInteger;

    invoke-virtual {v7}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v7

    const-string v8, "toByteArray(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, -0x2

    const-string v10, "other"

    if-ne v6, v8, :cond_a

    sget-object v8, Lwe/h0;->a:Lkf/a;

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v8, Lkf/a;->w:Ljava/math/BigInteger;

    invoke-virtual {v9, v8}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v8

    if-gtz v8, :cond_9

    goto :goto_3

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Counter exceeded maximum length"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    :goto_3
    add-int/lit8 v6, v6, 0x1

    int-to-byte v6, v6

    sget-object v8, Lwe/h0;->a:Lkf/a;

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v8, Lkf/a;->w:Ljava/math/BigInteger;

    invoke-virtual {v9, v8}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v8

    if-gtz v8, :cond_6

    new-instance v0, Lvg/h;

    sget-object v2, Lug/b;->F:Lug/b;

    invoke-direct {v0, v7, v2}, Lvg/h;-><init>(Ljava/lang/Object;Lug/b;)V

    return-object v0

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/c;

    check-cast v6, Lyf/u;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llf/a;

    new-instance v2, Lyf/f;

    invoke-direct {v2, v0}, Lyf/f;-><init>(Llf/a;)V

    invoke-static {v2}, Lyf/j;->a(Lyf/t;)Lyf/l;

    move-result-object v2

    :try_start_1
    invoke-interface {v2, v6}, Lyf/l;->C(Lyf/u;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-interface {v6}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    invoke-interface {v0}, Llf/a;->a()[B

    move-result-object v0

    invoke-static {v0}, Ltg/f;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_1
    move-exception v0

    move-object v3, v0

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object v3, v0

    :try_start_3
    invoke-interface {v6}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v0

    :try_start_4
    invoke-static {v3, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_4
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :catchall_4
    move-exception v0

    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_5
    :try_start_6
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    goto :goto_6

    :catchall_5
    move-exception v0

    invoke-static {v3, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_6
    throw v3

    :pswitch_8
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Ljava/io/File;

    iget-object v2, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    check-cast v6, [B

    invoke-static {v0, v6}, Lx83/j;->p(Ljava/io/File;[B)V

    return-object v5

    :pswitch_9
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    check-cast v6, Lpg3/p;

    :try_start_7
    new-instance v0, Lorg/json/JSONObject;

    iget-object v2, v6, Lpg3/p;->y:Ljava/lang/Object;

    check-cast v2, Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/SharedPreferences;

    const-string v3, "key_fraud_detection_data"

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_b

    const-string v2, ""

    goto :goto_7

    :catchall_6
    move-exception v0

    goto :goto_9

    :cond_b
    :goto_7
    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "guid"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_c

    :goto_8
    move-object v5, v4

    goto :goto_a

    :cond_c
    const-string v2, "muid"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_d

    goto :goto_8

    :cond_d
    const-string v2, "sid"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_e

    goto :goto_8

    :cond_e
    new-instance v5, Lty/b;

    const-string v2, "timestamp"

    const-wide/16 v9, -0x1

    invoke-virtual {v0, v2, v9, v10}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v9

    invoke-direct/range {v5 .. v10}, Lty/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    goto :goto_a

    :goto_9
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v5

    :goto_a
    instance-of v0, v5, Ll83/m;

    if-eqz v0, :cond_f

    goto :goto_b

    :cond_f
    move-object v4, v5

    :goto_b
    return-object v4

    :pswitch_a
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    check-cast v6, Lt23/c0;

    invoke-virtual {v6}, Lt23/c0;->g()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v7, Lb23/g;->y:Lb23/g;

    iget-object v8, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_10

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-virtual {v6}, Lt23/c0;->i()Lt23/a2;

    move-result-object v3

    iget-object v3, v3, Lt23/a2;->n:Lc33/l;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "[monitorHeadset] new available devices, prev selected: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v7, v8, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_10
    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lc33/l;

    instance-of v7, v7, Lc33/h;

    if-eqz v7, :cond_11

    goto :goto_c

    :cond_12
    move-object v3, v4

    :goto_c
    check-cast v3, Lc33/l;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lc33/l;

    instance-of v7, v7, Lc33/k;

    if-eqz v7, :cond_13

    goto :goto_d

    :cond_14
    move-object v2, v4

    :goto_d
    check-cast v2, Lc33/l;

    if-eqz v3, :cond_16

    invoke-virtual {v6}, Lt23/c0;->g()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v7, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_15

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[monitorHeadset] BT headset selected"

    invoke-interface {v0, v8, v7, v2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_15
    invoke-virtual {v6}, Lt23/c0;->i()Lt23/a2;

    move-result-object v0

    invoke-virtual {v0, v3}, Lt23/a2;->d(Lc33/l;)V

    goto :goto_e

    :cond_16
    if-eqz v2, :cond_18

    invoke-virtual {v6}, Lt23/c0;->g()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v7, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_17

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v3, "[monitorHeadset] wired headset found"

    invoke-interface {v0, v8, v7, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_17
    invoke-virtual {v6}, Lt23/c0;->i()Lt23/a2;

    move-result-object v0

    invoke-virtual {v0, v2}, Lt23/a2;->d(Lc33/l;)V

    goto :goto_e

    :cond_18
    invoke-virtual {v6}, Lt23/c0;->g()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v7, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_19

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[monitorHeadset] no headset found"

    invoke-interface {v0, v7, v3, v2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_19
    invoke-virtual {v6}, Lt23/c0;->i()Lt23/a2;

    move-result-object v0

    iget-object v0, v0, Lt23/a2;->n:Lc33/l;

    if-eqz v0, :cond_1b

    invoke-virtual {v6}, Lt23/c0;->g()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v8, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1a

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v3, "[monitorHeadset] before device selected"

    invoke-interface {v2, v7, v8, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1a
    invoke-virtual {v6}, Lt23/c0;->i()Lt23/a2;

    move-result-object v2

    invoke-virtual {v2, v0}, Lt23/a2;->d(Lc33/l;)V

    :cond_1b
    :goto_e
    return-object v5

    :pswitch_b
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v6, Lp1/c1;

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1c

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_1c
    return-object v5

    :pswitch_c
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lq20/y;

    move-object v4, v6

    check-cast v4, Lt10/e;

    iget-object v7, v4, Lt10/e;->f:Lec3/h2;

    :cond_1d
    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lt10/j;

    iget-object v9, v4, Lt10/e;->h:Lb30/p3;

    if-eqz v9, :cond_1e

    iget-boolean v9, v9, Lb30/p3;->e:Z

    move v10, v9

    goto :goto_f

    :cond_1e
    if-eqz v0, :cond_1f

    iget-boolean v9, v8, Lt10/j;->d:Z

    if-nez v9, :cond_1f

    move v10, v3

    goto :goto_f

    :cond_1f
    move v10, v2

    :goto_f
    const/4 v14, 0x0

    const/16 v15, 0x7d

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v15}, Lt10/j;->a(Lt10/j;Lzy/c;ZLb30/g4;ZLzy/c;Lzy/c;I)Lt10/j;

    move-result-object v8

    invoke-virtual {v7, v6, v8}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1d

    return-object v5

    :pswitch_d
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Le10/b0;

    check-cast v6, Lt10/d;

    iget-object v4, v6, Lt10/d;->e:Lt10/e;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "confirmationState"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v4, Lt10/e;->f:Lec3/h2;

    :cond_20
    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lt10/j;

    iget-object v9, v4, Lt10/e;->b:Ls10/f;

    instance-of v10, v0, Le10/y;

    if-eqz v10, :cond_2a

    iget-object v10, v4, Lt10/e;->e:Lk20/a;

    move-object v11, v0

    check-cast v11, Le10/y;

    iget-object v11, v11, Le10/y;->a:Le10/x;

    iget-object v9, v9, Ls10/f;->b:Lec3/r1;

    iget-object v12, v9, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v12}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lq20/y;

    const-string v13, "<this>"

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v12, :cond_24

    instance-of v13, v11, Le10/w;

    if-eqz v13, :cond_21

    move-object v13, v11

    check-cast v13, Le10/w;

    iget-object v14, v13, Le10/w;->b:Ln10/c0;

    iget-object v13, v13, Le10/w;->a:Ly00/c8;

    invoke-interface {v13}, Ly00/c8;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v12, v14, v13}, Lk20/a;->p(Lq20/y;Ln10/c0;Ljava/lang/String;)V

    goto :goto_10

    :cond_21
    instance-of v13, v11, Le10/v;

    if-eqz v13, :cond_22

    move-object v13, v11

    check-cast v13, Le10/v;

    invoke-static {v13}, Lds/q;->I(Le10/v;)Lk20/h;

    move-result-object v13

    if-eqz v13, :cond_24

    invoke-virtual {v10, v12, v13}, Lk20/a;->m(Lq20/y;Lk20/h;)V

    goto :goto_10

    :cond_22
    instance-of v10, v11, Le10/n;

    if-eqz v10, :cond_23

    goto :goto_10

    :cond_23
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_24
    :goto_10
    instance-of v10, v11, Le10/w;

    if-eqz v10, :cond_25

    const/4 v14, 0x0

    const/16 v15, 0x79

    const/4 v9, 0x0

    const/4 v10, 0x0

    sget-object v11, Lb30/d4;->a:Lb30/d4;

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v15}, Lt10/j;->a(Lt10/j;Lzy/c;ZLb30/g4;ZLzy/c;Lzy/c;I)Lt10/j;

    move-result-object v8

    goto/16 :goto_14

    :cond_25
    instance-of v10, v11, Le10/v;

    if-eqz v10, :cond_27

    move-object v10, v11

    new-instance v11, Lb30/e4;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    iget-object v9, v9, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v9}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v9

    move-object v12, v10

    if-eqz v9, :cond_26

    move v10, v3

    goto :goto_11

    :cond_26
    move v10, v2

    :goto_11
    move-object v9, v12

    check-cast v9, Le10/v;

    iget-object v13, v9, Le10/v;->b:Lzy/c;

    const/4 v14, 0x0

    const/16 v15, 0x51

    const/4 v9, 0x0

    const/4 v12, 0x0

    invoke-static/range {v8 .. v15}, Lt10/j;->a(Lt10/j;Lzy/c;ZLb30/g4;ZLzy/c;Lzy/c;I)Lt10/j;

    move-result-object v8

    goto :goto_14

    :cond_27
    move-object v12, v11

    instance-of v10, v12, Le10/n;

    if-eqz v10, :cond_29

    new-instance v11, Lb30/e4;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    iget-object v9, v9, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v9}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_28

    move v10, v3

    goto :goto_12

    :cond_28
    move v10, v2

    :goto_12
    const/4 v14, 0x0

    const/16 v15, 0x51

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v15}, Lt10/j;->a(Lt10/j;Lzy/c;ZLb30/g4;ZLzy/c;Lzy/c;I)Lt10/j;

    move-result-object v8

    goto :goto_14

    :cond_29
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2a
    instance-of v10, v0, Le10/z;

    if-eqz v10, :cond_2b

    const/4 v14, 0x0

    const/16 v15, 0x51

    const/4 v9, 0x0

    const/4 v10, 0x0

    sget-object v11, Lb30/f4;->a:Lb30/f4;

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-static/range {v8 .. v15}, Lt10/j;->a(Lt10/j;Lzy/c;ZLb30/g4;ZLzy/c;Lzy/c;I)Lt10/j;

    move-result-object v8

    goto :goto_14

    :cond_2b
    instance-of v10, v0, Le10/a0;

    if-eqz v10, :cond_2d

    new-instance v11, Lb30/e4;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    iget-object v9, v9, Ls10/f;->b:Lec3/r1;

    iget-object v9, v9, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v9}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_2c

    move v10, v3

    goto :goto_13

    :cond_2c
    move v10, v2

    :goto_13
    const/4 v14, 0x0

    const/16 v15, 0x71

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v15}, Lt10/j;->a(Lt10/j;Lzy/c;ZLb30/g4;ZLzy/c;Lzy/c;I)Lt10/j;

    move-result-object v8

    :goto_14
    invoke-virtual {v6, v7, v8}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_20

    return-object v5

    :cond_2d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_e
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    check-cast v6, Lq30/w0;

    :try_start_8
    iget-object v0, v6, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v2, "url"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type java.net.HttpURLConnection"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0, v3}, Ljava/net/URLConnection;->setDoInput(Z)V

    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    const/16 v3, 0xc8

    if-ne v2, v3, :cond_2e

    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    goto :goto_16

    :catchall_7
    move-exception v0

    goto :goto_15

    :cond_2e
    move-object v0, v4

    goto :goto_16

    :goto_15
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_16
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_2f

    iget-object v3, v6, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v3, Ln30/d;

    check-cast v3, Ln30/c;

    invoke-virtual {v3, v2}, Ln30/c;->c(Ljava/lang/Throwable;)V

    :cond_2f
    instance-of v2, v0, Ll83/m;

    if-eqz v2, :cond_30

    goto :goto_17

    :cond_30
    move-object v4, v0

    :goto_17
    return-object v4

    :pswitch_f
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lq00/i0;

    iget-boolean v0, v0, Lq00/i0;->g:Z

    if-eqz v0, :cond_31

    check-cast v6, Lg2/i;

    invoke-static {v6}, Lg2/i;->a(Lg2/i;)V

    :cond_31
    return-object v5

    :pswitch_10
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lr6/s;

    const/4 v2, 0x5

    invoke-virtual {v0, v2}, Lr6/s;->d(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/glance/appwidget/protobuf/y;

    iget-object v3, v2, Landroidx/glance/appwidget/protobuf/y;->w:Landroidx/glance/appwidget/protobuf/a0;

    invoke-virtual {v3, v0}, Landroidx/glance/appwidget/protobuf/a0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_32

    goto :goto_18

    :cond_32
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v3, v2, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    invoke-static {v3, v0}, Landroidx/glance/appwidget/protobuf/y;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_18
    check-cast v6, Lp6/z0;

    check-cast v2, Lr6/r;

    iget-object v0, v2, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v0, Lr6/s;

    invoke-virtual {v0}, Lr6/s;->s()I

    move-result v0

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v3, v2, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v3, Lr6/s;

    invoke-static {v3, v0}, Lr6/s;->p(Lr6/s;I)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v0, v2, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v0, Lr6/s;

    invoke-static {v0}, Lr6/s;->o(Lr6/s;)V

    iget-object v0, v6, Lp6/z0;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_33
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_34

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr6/w;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    iget-object v5, v6, Lp6/z0;->e:Ljava/util/LinkedHashSet;

    new-instance v7, Ljava/lang/Integer;

    invoke-direct {v7, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v5, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_33

    invoke-static {}, Lr6/u;->r()Lr6/t;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v7, v5, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v7, Lr6/u;

    invoke-static {v7, v4}, Lr6/u;->n(Lr6/u;Lr6/w;)V

    invoke-virtual {v5}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v4, v5, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v4, Lr6/u;

    invoke-static {v4, v3}, Lr6/u;->o(Lr6/u;I)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v3, v2, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v3, Lr6/s;

    invoke-virtual {v5}, Landroidx/glance/appwidget/protobuf/y;->a()Landroidx/glance/appwidget/protobuf/a0;

    move-result-object v4

    check-cast v4, Lr6/u;

    invoke-static {v3, v4}, Lr6/s;->n(Lr6/s;Lr6/u;)V

    goto :goto_19

    :cond_34
    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/y;->a()Landroidx/glance/appwidget/protobuf/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lf6/f;

    sget-object v2, Lp6/n0;->g:Lf6/d;

    invoke-virtual {v0, v2}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    if-nez v2, :cond_35

    goto :goto_1c

    :cond_35
    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    check-cast v6, Ljava/util/Set;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_36
    :goto_1a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_37

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ljava/lang/String;

    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_36

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1a

    :cond_37
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_38

    goto :goto_1c

    :cond_38
    invoke-virtual {v0}, Lf6/f;->c()Lf6/a;

    move-result-object v0

    sget-object v3, Lp6/n0;->g:Lf6/d;

    invoke-static {v2, v4}, Ldt/b;->z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lf6/a;->g(Lf6/d;Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_39

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget-object v4, Lp6/n0;->d:Lp6/j0;

    invoke-static {v4, v3}, Lp6/j0;->a(Lp6/j0;Ljava/lang/String;)Lf6/d;

    move-result-object v3

    invoke-virtual {v0, v3}, Lf6/a;->f(Lf6/d;)V

    goto :goto_1b

    :cond_39
    invoke-virtual {v0}, Lf6/f;->d()Lf6/a;

    move-result-object v0

    :goto_1c
    return-object v0

    :pswitch_12
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lf6/f;

    invoke-virtual {v0}, Lf6/f;->c()Lf6/a;

    move-result-object v0

    check-cast v6, Ljava/util/ArrayList;

    sget-object v2, Lp6/n0;->g:Lf6/d;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v6, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp6/s0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_3a
    invoke-static {v3}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lf6/a;->g(Lf6/d;Ljava/lang/Object;)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp6/s0;

    sget-object v4, Lp6/n0;->d:Lp6/j0;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3c

    invoke-static {v4, v5}, Lp6/j0;->a(Lp6/j0;Ljava/lang/String;)Lf6/d;

    move-result-object v4

    invoke-virtual {v3}, Lp6/s0;->f()Lp6/g0;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3b

    invoke-virtual {v0, v4, v3}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    goto :goto_1e

    :cond_3b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "no provider name"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "no receiver name"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3d
    invoke-virtual {v0}, Lf6/f;->d()Lf6/a;

    move-result-object v0

    return-object v0

    :pswitch_13
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ld10/a;->a:Ljava/util/LinkedHashMap;

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast v6, Ld10/b;

    sget-object v2, Ld10/a;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v2, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v5

    :pswitch_14
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lo23/p;->x:Ljava/lang/Object;

    check-cast v0, Lo23/q;

    iget-object v2, v0, Lo23/q;->a:Lo23/d;

    check-cast v6, Lo23/a;

    new-instance v3, Lc9/c;

    const/16 v4, 0x1c

    invoke-direct {v3, v4, v0, v6}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Lo23/d;->enqueue(Lo23/a;)V

    return-object v5

    :pswitch_data_0
    .packed-switch 0x0
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

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data

    :array_1
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x0t
    .end array-data
.end method
