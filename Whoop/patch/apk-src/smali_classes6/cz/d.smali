.class public final Lcz/d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld0/f1;Ljava/lang/Object;Ld0/z1;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcz/d;->w:I

    .line 1
    iput-object p1, p0, Lcz/d;->E:Ljava/lang/Object;

    iput-object p2, p0, Lcz/d;->F:Ljava/lang/Object;

    iput-object p3, p0, Lcz/d;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p7, p0, Lcz/d;->w:I

    iput-object p1, p0, Lcz/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Lcz/d;->z:Ljava/lang/Object;

    iput-object p3, p0, Lcz/d;->E:Ljava/lang/Object;

    iput-object p4, p0, Lcz/d;->F:Ljava/lang/Object;

    iput-object p5, p0, Lcz/d;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 3
    iput p6, p0, Lcz/d;->w:I

    iput-object p1, p0, Lcz/d;->z:Ljava/lang/Object;

    iput-object p2, p0, Lcz/d;->E:Ljava/lang/Object;

    iput-object p3, p0, Lcz/d;->F:Ljava/lang/Object;

    iput-object p4, p0, Lcz/d;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 4
    iput p4, p0, Lcz/d;->w:I

    iput-object p1, p0, Lcz/d;->F:Ljava/lang/Object;

    iput-object p2, p0, Lcz/d;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lp1/c1;Lh40/k;Lcom/stripe/android/customersheet/CustomerSheetActivity;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcz/d;->w:I

    .line 5
    iput-object p1, p0, Lcz/d;->F:Ljava/lang/Object;

    iput-object p2, p0, Lcz/d;->G:Ljava/lang/Object;

    iput-object p3, p0, Lcz/d;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lu0/s0;Lp1/c1;Lq3/z;Lf1/s1;Lq3/l;Lq83/d;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, Lcz/d;->w:I

    .line 6
    iput-object p1, p0, Lcz/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Lcz/d;->F:Ljava/lang/Object;

    iput-object p3, p0, Lcz/d;->z:Ljava/lang/Object;

    iput-object p4, p0, Lcz/d;->E:Ljava/lang/Object;

    iput-object p5, p0, Lcz/d;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lu2/v;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lh0/h2;Lq83/d;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lcz/d;->w:I

    .line 7
    iput-object p1, p0, Lcz/d;->z:Ljava/lang/Object;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Lcz/d;->E:Ljava/lang/Object;

    iput-object p3, p0, Lcz/d;->F:Ljava/lang/Object;

    iput-object p4, p0, Lcz/d;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 10

    iget v0, p0, Lcz/d;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Lcz/d;

    iget-object v0, p0, Lcz/d;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/m;

    iget-object v0, p0, Lcz/d;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lux/f0;

    iget-object v0, p0, Lcz/d;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lbc3/c0;

    iget-object v0, p0, Lcz/d;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/util/concurrent/atomic/AtomicReference;

    const/16 v7, 0x10

    move-object v6, p2

    invoke-direct/range {v1 .. v7}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v1, Lcz/d;->y:Ljava/lang/Object;

    return-object v1

    :pswitch_0
    move-object v7, p2

    new-instance v2, Lcz/d;

    iget-object p1, p0, Lcz/d;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lr0/a;

    iget-object p1, p0, Lcz/d;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lq3/y;

    iget-object p1, p0, Lcz/d;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lu0/s0;

    iget-object p1, p0, Lcz/d;->F:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lu0/p1;

    iget-object p1, p0, Lcz/d;->G:Ljava/lang/Object;

    check-cast p1, Lq3/r;

    const/16 v9, 0xf

    move-object v8, v7

    move-object v7, p1

    invoke-direct/range {v2 .. v9}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_1
    move-object v7, p2

    new-instance v2, Lcz/d;

    iget-object p1, p0, Lcz/d;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lu0/s0;

    iget-object p1, p0, Lcz/d;->F:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lp1/c1;

    iget-object p1, p0, Lcz/d;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lq3/z;

    iget-object p1, p0, Lcz/d;->E:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lf1/s1;

    iget-object p1, p0, Lcz/d;->G:Ljava/lang/Object;

    check-cast p1, Lq3/l;

    move-object v8, v7

    move-object v7, p1

    invoke-direct/range {v2 .. v8}, Lcz/d;-><init>(Lu0/s0;Lp1/c1;Lq3/z;Lf1/s1;Lq3/l;Lq83/d;)V

    return-object v2

    :pswitch_2
    move-object v7, p2

    new-instance p1, Lcz/d;

    iget-object p2, p0, Lcz/d;->F:Ljava/lang/Object;

    check-cast p2, Ls33/c;

    iget-object v0, p0, Lcz/d;->G:Ljava/lang/Object;

    check-cast v0, Lio/getstream/android/video/generated/models/ClosedCaptionEvent;

    const/16 v1, 0xd

    invoke-direct {p1, p2, v0, v7, v1}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_3
    move-object v7, p2

    new-instance v2, Lcz/d;

    iget-object p1, p0, Lcz/d;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lfi/i;

    iget-object p1, p0, Lcz/d;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lrh/t;

    iget-object p1, p0, Lcz/d;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lgi/i;

    iget-object p1, p0, Lcz/d;->F:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lrh/f;

    iget-object p1, p0, Lcz/d;->G:Ljava/lang/Object;

    check-cast p1, Lrh/j;

    const/16 v9, 0xc

    move-object v8, v7

    move-object v7, p1

    invoke-direct/range {v2 .. v9}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_4
    move-object v7, p2

    new-instance v2, Lcz/d;

    iget-object p2, p0, Lcz/d;->z:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Landroid/app/Activity;

    iget-object p2, p0, Lcz/d;->E:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Ld1/j;

    iget-object p2, p0, Lcz/d;->F:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Leb/u0;

    iget-object p2, p0, Lcz/d;->G:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v8, 0xb

    invoke-direct/range {v2 .. v8}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v2, Lcz/d;->y:Ljava/lang/Object;

    return-object v2

    :pswitch_5
    move-object v7, p2

    new-instance v2, Lcz/d;

    iget-object p2, p0, Lcz/d;->z:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Landroidx/lifecycle/x;

    iget-object p2, p0, Lcz/d;->E:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Landroidx/lifecycle/w;

    iget-object p2, p0, Lcz/d;->F:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Lq83/j;

    iget-object p2, p0, Lcz/d;->G:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Lec3/l;

    const/16 v8, 0xa

    invoke-direct/range {v2 .. v8}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v2, Lcz/d;->y:Ljava/lang/Object;

    return-object v2

    :pswitch_6
    move-object v7, p2

    new-instance v2, Lcz/d;

    iget-object p2, p0, Lcz/d;->z:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Lhy/c;

    iget-object p2, p0, Lcz/d;->E:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Ly00/u1;

    iget-object p2, p0, Lcz/d;->F:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, La30/v0;

    iget-object p2, p0, Lcz/d;->G:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Ljava/util/List;

    const/16 v8, 0x9

    invoke-direct/range {v2 .. v8}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v2, Lcz/d;->y:Ljava/lang/Object;

    return-object v2

    :pswitch_7
    move-object v7, p2

    new-instance v2, Lcz/d;

    iget-object p2, p0, Lcz/d;->z:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Lu2/v;

    iget-object p2, p0, Lcz/d;->E:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Ls83/i;

    iget-object p2, p0, Lcz/d;->F:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object p2, p0, Lcz/d;->G:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Lh0/h2;

    invoke-direct/range {v2 .. v7}, Lcz/d;-><init>(Lu2/v;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lh0/h2;Lq83/d;)V

    iput-object p1, v2, Lcz/d;->y:Ljava/lang/Object;

    return-object v2

    :pswitch_8
    move-object v7, p2

    new-instance v2, Lcz/d;

    iget-object p2, p0, Lcz/d;->z:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Lh0/d4;

    iget-object p2, p0, Lcz/d;->E:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Lh0/w;

    iget-object p2, p0, Lcz/d;->F:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Lh0/s;

    iget-object p2, p0, Lcz/d;->G:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Lbc3/k1;

    const/4 v8, 0x7

    invoke-direct/range {v2 .. v8}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v2, Lcz/d;->y:Ljava/lang/Object;

    return-object v2

    :pswitch_9
    move-object v7, p2

    new-instance p1, Lcz/d;

    iget-object p2, p0, Lcz/d;->F:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iget-object v0, p0, Lcz/d;->G:Ljava/lang/Object;

    check-cast v0, Lp1/r1;

    const/4 v1, 0x6

    invoke-direct {p1, p2, v0, v7, v1}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_a
    move-object v7, p2

    new-instance v2, Lcz/d;

    iget-object p2, p0, Lcz/d;->z:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Le00/w;

    iget-object p2, p0, Lcz/d;->E:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    iget-object p2, p0, Lcz/d;->F:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    iget-object p2, p0, Lcz/d;->G:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Ljava/util/List;

    const/4 v8, 0x5

    invoke-direct/range {v2 .. v8}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v2, Lcz/d;->y:Ljava/lang/Object;

    return-object v2

    :pswitch_b
    move-object v7, p2

    new-instance v2, Lcz/d;

    iget-object p1, p0, Lcz/d;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Le00/w;

    iget-object p1, p0, Lcz/d;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    iget-object p1, p0, Lcz/d;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    iget-object p1, p0, Lcz/d;->F:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    iget-object p1, p0, Lcz/d;->G:Ljava/lang/Object;

    check-cast p1, Ly00/n;

    const/4 v9, 0x4

    move-object v8, v7

    move-object v7, p1

    invoke-direct/range {v2 .. v9}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_c
    move-object v7, p2

    new-instance v2, Lcz/d;

    iget-object p1, p0, Lcz/d;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;

    iget-object p1, p0, Lcz/d;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lj/d;

    iget-object p1, p0, Lcz/d;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lcom/whoop/profile/view/edit/n;

    iget-object p1, p0, Lcz/d;->F:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lj/d;

    iget-object p1, p0, Lcz/d;->G:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/y1;

    const/4 v9, 0x3

    move-object v8, v7

    move-object v7, p1

    invoke-direct/range {v2 .. v9}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_d
    move-object v7, p2

    new-instance v2, Lcz/d;

    iget-object p2, p0, Lcz/d;->z:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Lb3/x0;

    iget-object p2, p0, Lcz/d;->E:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object p2, p0, Lcz/d;->F:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Ld1/b;

    iget-object p2, p0, Lcz/d;->G:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Ld1/k;

    const/4 v8, 0x2

    invoke-direct/range {v2 .. v8}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v2, Lcz/d;->y:Ljava/lang/Object;

    return-object v2

    :pswitch_e
    move-object v7, p2

    new-instance p1, Lcz/d;

    iget-object p2, p0, Lcz/d;->E:Ljava/lang/Object;

    check-cast p2, Ld0/f1;

    iget-object v0, p0, Lcz/d;->G:Ljava/lang/Object;

    check-cast v0, Ld0/z1;

    iget-object v1, p0, Lcz/d;->F:Ljava/lang/Object;

    invoke-direct {p1, p2, v1, v0, v7}, Lcz/d;-><init>(Ld0/f1;Ljava/lang/Object;Ld0/z1;Lq83/d;)V

    return-object p1

    :pswitch_f
    move-object v7, p2

    new-instance p1, Lcz/d;

    iget-object p2, p0, Lcz/d;->F:Ljava/lang/Object;

    check-cast p2, Lp1/c1;

    iget-object v0, p0, Lcz/d;->G:Ljava/lang/Object;

    check-cast v0, Lh40/k;

    iget-object v1, p0, Lcz/d;->z:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/customersheet/CustomerSheetActivity;

    invoke-direct {p1, p2, v0, v1, v7}, Lcz/d;-><init>(Lp1/c1;Lh40/k;Lcom/stripe/android/customersheet/CustomerSheetActivity;Lq83/d;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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

    iget v0, p0, Lcz/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ln40/f;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lp1/r1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lh0/a3;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_e
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
    .locals 29

    move-object/from16 v5, p0

    iget v0, v5, Lcz/d;->w:I

    const/4 v6, 0x4

    const/16 v1, 0x1b

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x3

    const/4 v9, 0x0

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    iget-object v11, v5, Lcz/d;->G:Ljava/lang/Object;

    iget-object v12, v5, Lcz/d;->F:Ljava/lang/Object;

    const-string v13, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v14, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lcz/d;->x:I

    if-eqz v1, :cond_1

    if-ne v1, v14, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Lcz/d;->y:Ljava/lang/Object;

    move-object/from16 v16, v1

    check-cast v16, Lbc3/c0;

    new-instance v15, Lx6/v;

    iget-object v1, v5, Lcz/d;->E:Ljava/lang/Object;

    move-object/from16 v17, v1

    check-cast v17, Lux/f0;

    move-object/from16 v18, v12

    check-cast v18, Lbc3/c0;

    iget-object v1, v5, Lcz/d;->z:Ljava/lang/Object;

    move-object/from16 v19, v1

    check-cast v19, Lc93/m;

    move-object/from16 v20, v11

    check-cast v20, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct/range {v15 .. v20}, Lx6/v;-><init>(Lbc3/c0;Lux/f0;Lbc3/c0;Lc93/m;Ljava/util/concurrent/atomic/AtomicReference;)V

    iget-object v1, v5, Lcz/d;->z:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    iput v14, v5, Lcz/d;->x:I

    invoke-interface {v1, v15, v5}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lcz/d;->x:I

    if-eqz v1, :cond_4

    if-ne v1, v14, :cond_3

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Lcz/d;->y:Ljava/lang/Object;

    check-cast v1, Lr0/a;

    iget-object v4, v5, Lcz/d;->z:Ljava/lang/Object;

    check-cast v4, Lq3/y;

    iget-object v6, v5, Lcz/d;->E:Ljava/lang/Object;

    check-cast v6, Lu0/s0;

    iget-object v6, v6, Lu0/s0;->a:Lu0/c1;

    check-cast v12, Lu0/p1;

    iget-object v7, v12, Lu0/p1;->a:Ll3/r0;

    check-cast v11, Lq3/r;

    iput v14, v5, Lcz/d;->x:I

    iget-wide v8, v4, Lq3/y;->b:J

    invoke-static {v8, v9}, Ll3/u0;->e(J)I

    move-result v4

    invoke-interface {v11, v4}, Lq3/r;->x(I)I

    move-result v4

    iget-object v8, v7, Ll3/r0;->a:Ll3/q0;

    iget-object v8, v8, Ll3/q0;->a:Ll3/g;

    iget-object v8, v8, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-ge v4, v8, :cond_5

    invoke-virtual {v7, v4}, Ll3/r0;->b(I)Lh2/c;

    move-result-object v2

    goto :goto_1

    :cond_5
    if-eqz v4, :cond_6

    sub-int/2addr v4, v14

    invoke-virtual {v7, v4}, Ll3/r0;->b(I)Lh2/c;

    move-result-object v2

    goto :goto_1

    :cond_6
    iget-object v4, v6, Lu0/c1;->b:Ll3/v0;

    iget-object v7, v6, Lu0/c1;->g:Ly3/c;

    iget-object v6, v6, Lu0/c1;->h:Lp3/h;

    invoke-static {v4, v7, v6}, Lu0/f1;->b(Ll3/v0;Ly3/c;Lp3/h;)J

    move-result-wide v6

    new-instance v4, Lh2/c;

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-float v6, v6

    invoke-direct {v4, v3, v3, v2, v6}, Lh2/c;-><init>(FFFF)V

    move-object v2, v4

    :goto_1
    check-cast v1, Lr0/c;

    invoke-virtual {v1, v2, v5}, Lr0/c;->b(Lh2/c;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_7

    goto :goto_2

    :cond_7
    move-object v1, v10

    :goto_2
    if-ne v1, v0, :cond_8

    move-object v10, v0

    :cond_8
    :goto_3
    return-object v10

    :pswitch_1
    iget-object v0, v5, Lcz/d;->y:Ljava/lang/Object;

    move-object/from16 v16, v0

    check-cast v16, Lu0/s0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v5, Lcz/d;->x:I

    if-eqz v2, :cond_a

    if-ne v2, v14, :cond_9

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_6

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    check-cast v12, Lp1/c1;

    new-instance v2, Lo0/i;

    invoke-direct {v2, v1, v12}, Lo0/i;-><init>(ILp1/c1;)V

    invoke-static {v2}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object v1

    new-instance v15, Lk63/d;

    iget-object v2, v5, Lcz/d;->z:Ljava/lang/Object;

    move-object/from16 v17, v2

    check-cast v17, Lq3/z;

    iget-object v2, v5, Lcz/d;->E:Ljava/lang/Object;

    move-object/from16 v18, v2

    check-cast v18, Lf1/s1;

    move-object/from16 v19, v11

    check-cast v19, Lq3/l;

    const/16 v20, 0x2

    invoke-direct/range {v15 .. v20}, Lk63/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput v14, v5, Lcz/d;->x:I

    invoke-virtual {v1, v15, v5}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v1, v0, :cond_b

    move-object v10, v0

    goto :goto_5

    :cond_b
    :goto_4
    invoke-static/range {v16 .. v16}, Lu0/n0;->l(Lu0/s0;)V

    :goto_5
    return-object v10

    :goto_6
    invoke-static/range {v16 .. v16}, Lu0/n0;->l(Lu0/s0;)V

    throw v0

    :pswitch_2
    check-cast v12, Ls33/c;

    iget-object v0, v12, Ls33/c;->g:Lhc3/d;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, Lcz/d;->x:I

    if-eqz v2, :cond_d

    if-ne v2, v14, :cond_c

    iget-object v1, v5, Lcz/d;->E:Ljava/lang/Object;

    check-cast v1, Ls33/c;

    iget-object v2, v5, Lcz/d;->z:Ljava/lang/Object;

    check-cast v2, Lio/getstream/android/video/generated/models/ClosedCaptionEvent;

    iget-object v3, v5, Lcz/d;->y:Ljava/lang/Object;

    check-cast v3, Lmc3/c;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v12, Ls33/c;->h:Lmc3/c;

    move-object v2, v11

    check-cast v2, Lio/getstream/android/video/generated/models/ClosedCaptionEvent;

    iput-object v3, v5, Lcz/d;->y:Ljava/lang/Object;

    iput-object v2, v5, Lcz/d;->z:Ljava/lang/Object;

    iput-object v12, v5, Lcz/d;->E:Ljava/lang/Object;

    iput v14, v5, Lcz/d;->x:I

    invoke-virtual {v3, v5}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_e

    move-object v10, v1

    goto/16 :goto_9

    :cond_e
    move-object v1, v12

    :goto_7
    :try_start_2
    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/ClosedCaptionEvent;->getClosedCaption()Lio/getstream/android/video/generated/models/CallClosedCaption;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/android/video/generated/models/CallClosedCaption;->getSpeakerId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/ClosedCaptionEvent;->getClosedCaption()Lio/getstream/android/video/generated/models/CallClosedCaption;

    move-result-object v11

    invoke-virtual {v11}, Lio/getstream/android/video/generated/models/CallClosedCaption;->getStartTime()Ljg3/i;

    move-result-object v11

    invoke-virtual {v11}, Ljg3/i;->toEpochSecond()J

    move-result-wide v14

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "/"

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    iget-object v11, v1, Ls33/c;->b:Ljava/util/LinkedHashSet;

    invoke-interface {v11, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_f

    iget-object v11, v1, Ls33/c;->a:Lec3/h2;

    invoke-virtual {v11}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Collection;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/ClosedCaptionEvent;->getClosedCaption()Lio/getstream/android/video/generated/models/CallClosedCaption;

    move-result-object v2

    invoke-static {v2, v13}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v7, v2}, Lm83/s;->x1(ILjava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v11, v9, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v1, Ls33/c;->b:Ljava/util/LinkedHashSet;

    invoke-interface {v1, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception v0

    goto :goto_a

    :cond_f
    :goto_8
    invoke-interface {v3, v9}, Lmc3/a;->i(Ljava/lang/Object;)V

    iget-object v1, v12, Ls33/c;->f:Lbc3/c2;

    if-eqz v1, :cond_10

    invoke-virtual {v1, v9}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_10
    new-instance v1, Ls33/b;

    invoke-direct {v1, v12, v9, v4}, Ls33/b;-><init>(Ls33/c;Lq83/d;I)V

    invoke-static {v0, v9, v9, v1, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    iput-object v1, v12, Ls33/c;->f:Lbc3/c2;

    iget-object v1, v12, Ls33/c;->c:Lbc3/c2;

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Lbc3/t1;->isActive()Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_12

    goto :goto_9

    :cond_11
    const/4 v2, 0x1

    :cond_12
    new-instance v1, Ls33/b;

    invoke-direct {v1, v12, v9, v2}, Ls33/b;-><init>(Ls33/c;Lq83/d;I)V

    invoke-static {v0, v9, v9, v1, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, v12, Ls33/c;->c:Lbc3/c2;

    :goto_9
    return-object v10

    :goto_a
    invoke-interface {v3, v9}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lcz/d;->x:I

    if-eqz v1, :cond_14

    const/4 v2, 0x1

    if-ne v1, v2, :cond_13

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_c

    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v17, Lxh/k;

    iget-object v1, v5, Lcz/d;->y:Ljava/lang/Object;

    move-object/from16 v18, v1

    check-cast v18, Lfi/i;

    iget-object v1, v5, Lcz/d;->z:Ljava/lang/Object;

    check-cast v1, Lrh/t;

    iget-object v1, v1, Lrh/t;->d:Lrh/d;

    iget-object v1, v1, Lrh/d;->a:Ljava/util/List;

    iget-object v2, v5, Lcz/d;->E:Ljava/lang/Object;

    move-object/from16 v22, v2

    check-cast v22, Lgi/i;

    move-object/from16 v23, v12

    check-cast v23, Lrh/f;

    check-cast v11, Lrh/j;

    if-eqz v11, :cond_15

    const/16 v24, 0x1

    goto :goto_b

    :cond_15
    move/from16 v24, v4

    :goto_b
    const/16 v20, 0x0

    move-object/from16 v21, v18

    move-object/from16 v19, v1

    invoke-direct/range {v17 .. v24}, Lxh/k;-><init>(Lfi/i;Ljava/util/List;ILfi/i;Lgi/i;Lrh/f;Z)V

    move-object/from16 v1, v17

    const/4 v2, 0x1

    iput v2, v5, Lcz/d;->x:I

    invoke-virtual {v1, v5}, Lxh/k;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_16

    goto :goto_c

    :cond_16
    move-object v0, v1

    :goto_c
    return-object v0

    :pswitch_4
    move v2, v14

    check-cast v12, Leb/u0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lcz/d;->x:I

    if-eqz v1, :cond_18

    if-ne v1, v2, :cond_17

    iget-object v0, v5, Lcz/d;->y:Ljava/lang/Object;

    check-cast v0, Ln40/f;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_f

    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Lcz/d;->y:Ljava/lang/Object;

    check-cast v1, Ln40/f;

    iget-object v2, v5, Lcz/d;->z:Ljava/lang/Object;

    check-cast v2, Landroid/app/Activity;

    if-eqz v2, :cond_19

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1a

    goto/16 :goto_10

    :cond_19
    const/4 v3, 0x1

    :cond_1a
    iget-object v2, v5, Lcz/d;->E:Ljava/lang/Object;

    check-cast v2, Ld1/j;

    iput-object v1, v5, Lcz/d;->y:Ljava/lang/Object;

    iput v3, v5, Lcz/d;->x:I

    iget-object v3, v2, Ld1/j;->y:Ljava/lang/Object;

    check-cast v3, Lp1/t2;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1c

    iget-object v3, v2, Ld1/j;->x:Ljava/lang/Object;

    check-cast v3, Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    new-instance v3, Llive/hms/video/connection/degredation/a;

    const/16 v4, 0x13

    invoke-direct {v3, v2, v4}, Llive/hms/video/connection/degredation/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {v3}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object v2

    new-instance v3, Lh40/c;

    invoke-direct {v3, v7, v8, v9}, Lh40/c;-><init>(IILq83/d;)V

    invoke-static {v2, v3, v5}, Lec3/v;->z(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_1b

    goto :goto_d

    :cond_1b
    move-object v2, v10

    :goto_d
    if-ne v2, v0, :cond_1c

    goto :goto_e

    :cond_1c
    move-object v2, v10

    :goto_e
    if-ne v2, v0, :cond_1d

    move-object v10, v0

    goto :goto_10

    :cond_1d
    move-object v0, v1

    :goto_f
    nop

    instance-of v1, v0, Ln40/e;

    if-eqz v1, :cond_1f

    invoke-virtual {v12}, Leb/a0;->i()Leb/n0;

    move-result-object v1

    if-eqz v1, :cond_1e

    iget-object v9, v1, Leb/n0;->I:Ljava/lang/String;

    :cond_1e
    check-cast v0, Ln40/e;

    iget-object v1, v0, Ln40/e;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_20

    invoke-virtual {v1, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_20

    new-instance v2, Llq0/d;

    invoke-direct {v2, v0, v12, v9}, Llq0/d;-><init>(Ln40/e;Leb/u0;Ljava/lang/String;)V

    invoke-virtual {v12, v1, v2}, Leb/a0;->w(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    goto :goto_10

    :cond_1f
    sget-object v1, Ln40/d;->a:Ln40/d;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-virtual {v12}, Leb/a0;->z()Z

    move-result v0

    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v11, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_20
    :goto_10
    return-object v10

    :cond_21
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lcz/d;->x:I

    if-eqz v1, :cond_23

    const/4 v2, 0x1

    if-ne v1, v2, :cond_22

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_11

    :cond_22
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_23
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Lcz/d;->y:Ljava/lang/Object;

    move-object/from16 v20, v1

    check-cast v20, Lp1/r1;

    iget-object v1, v5, Lcz/d;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/x;

    iget-object v2, v5, Lcz/d;->E:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/w;

    new-instance v17, Lg20/p;

    move-object/from16 v18, v12

    check-cast v18, Lq83/j;

    move-object/from16 v19, v11

    check-cast v19, Lec3/l;

    const/16 v21, 0x0

    const/16 v22, 0x14

    invoke-direct/range {v17 .. v22}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object/from16 v3, v17

    const/4 v4, 0x1

    iput v4, v5, Lcz/d;->x:I

    invoke-static {v1, v2, v3, v5}, Landroidx/lifecycle/o1;->l(Landroidx/lifecycle/x;Landroidx/lifecycle/w;Lc93/m;Ls83/i;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_24

    move-object v10, v0

    :cond_24
    :goto_11
    return-object v10

    :pswitch_6
    iget-object v0, v5, Lcz/d;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhy/c;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v5, Lcz/d;->x:I

    if-eqz v2, :cond_26

    const/4 v3, 0x1

    if-ne v2, v3, :cond_25

    :try_start_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_12

    :catchall_2
    move-exception v0

    goto :goto_13

    :cond_25
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_26
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v5, Lcz/d;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    iget-object v2, v5, Lcz/d;->E:Ljava/lang/Object;

    check-cast v2, Ly00/u1;

    check-cast v12, La30/v0;

    check-cast v11, Ljava/util/List;

    const/4 v3, 0x1

    :try_start_4
    iput v3, v5, Lcz/d;->x:I

    invoke-static {v1, v2, v12, v11, v5}, Lhy/c;->a(Lhy/c;Ly00/u1;La30/v0;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-ne v2, v0, :cond_27

    move-object v10, v0

    goto :goto_15

    :cond_27
    :goto_12
    move-object v0, v10

    goto :goto_14

    :goto_13
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_14
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_28

    iget-object v1, v1, Lhy/c;->h:Lqy/d;

    const-string v2, "Failed to log Global holdback exposure"

    invoke-virtual {v1, v2, v0}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_28
    :goto_15
    return-object v10

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lcz/d;->x:I

    if-eqz v1, :cond_2a

    const/4 v2, 0x1

    if-ne v1, v2, :cond_29

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_16

    :cond_29
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Lcz/d;->y:Ljava/lang/Object;

    move-object/from16 v18, v1

    check-cast v18, Lbc3/c0;

    iget-object v1, v5, Lcz/d;->z:Ljava/lang/Object;

    check-cast v1, Lu2/v;

    new-instance v17, Lh0/v0;

    iget-object v2, v5, Lcz/d;->E:Ljava/lang/Object;

    move-object/from16 v19, v2

    check-cast v19, Ls83/i;

    move-object/from16 v20, v12

    check-cast v20, Lkotlin/jvm/functions/Function1;

    move-object/from16 v21, v11

    check-cast v21, Lh0/h2;

    const/16 v22, 0x0

    invoke-direct/range {v17 .. v22}, Lh0/v0;-><init>(Lbc3/c0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lh0/h2;Lq83/d;)V

    move-object/from16 v2, v17

    const/4 v3, 0x1

    iput v3, v5, Lcz/d;->x:I

    invoke-static {v1, v2, v5}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2b

    move-object v10, v0

    :cond_2b
    :goto_16
    return-object v10

    :pswitch_8
    check-cast v12, Lh0/s;

    iget-object v0, v5, Lcz/d;->E:Ljava/lang/Object;

    check-cast v0, Lh0/w;

    iget-object v1, v5, Lcz/d;->z:Ljava/lang/Object;

    check-cast v1, Lh0/d4;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v5, Lcz/d;->x:I

    if-eqz v3, :cond_2d

    const/4 v4, 0x1

    if-ne v3, v4, :cond_2c

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_17

    :cond_2c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v5, Lcz/d;->y:Ljava/lang/Object;

    check-cast v3, Lh0/a3;

    invoke-static {v0, v12}, Lh0/w;->X0(Lh0/w;Lh0/s;)F

    move-result v4

    iput v4, v1, Lh0/d4;->e:F

    check-cast v11, Lbc3/k1;

    new-instance v4, Lep1/g;

    invoke-direct {v4, v0, v1, v11, v3}, Lep1/g;-><init>(Lh0/w;Lh0/d4;Lbc3/k1;Lh0/a3;)V

    new-instance v3, Ld30/r;

    const/16 v6, 0x14

    invoke-direct {v3, v0, v1, v12, v6}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 v0, 0x1

    iput v0, v5, Lcz/d;->x:I

    invoke-virtual {v1, v4, v3, v5}, Lh0/d4;->a(Lep1/g;Ld30/r;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_2e

    move-object v10, v2

    :cond_2e
    :goto_17
    return-object v10

    :pswitch_9
    move v0, v14

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, Lcz/d;->x:I

    if-eqz v2, :cond_30

    if-ne v2, v0, :cond_2f

    iget-object v0, v5, Lcz/d;->E:Ljava/lang/Object;

    check-cast v0, Lg40/q3;

    iget-object v2, v5, Lcz/d;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v3, v5, Lcz/d;->y:Ljava/lang/Object;

    check-cast v3, Lp1/r1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_19

    :cond_2f
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_30
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_31
    move-object v0, v12

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    move-object v2, v11

    check-cast v2, Lp1/r1;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v3, v2

    move-object v2, v0

    :goto_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg40/q3;

    iput-object v3, v5, Lcz/d;->y:Ljava/lang/Object;

    iput-object v2, v5, Lcz/d;->z:Ljava/lang/Object;

    iput-object v0, v5, Lcz/d;->E:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, v5, Lcz/d;->x:I

    const-wide/16 v6, 0x3e8

    invoke-static {v6, v7, v5}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_32

    return-object v1

    :cond_32
    :goto_19
    invoke-interface {v3, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    goto :goto_18

    :pswitch_a
    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lcz/d;->x:I

    if-eqz v0, :cond_34

    const/4 v2, 0x1

    if-ne v0, v2, :cond_33

    :try_start_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move-object/from16 v0, p1

    goto :goto_1a

    :catchall_3
    move-exception v0

    goto :goto_1b

    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Lcz/d;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v0, v5, Lcz/d;->z:Ljava/lang/Object;

    check-cast v0, Le00/w;

    iget-object v1, v5, Lcz/d;->E:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    move-object v2, v12

    check-cast v2, Ljava/lang/String;

    move-object v3, v11

    check-cast v3, Ljava/util/List;

    :try_start_6
    iget-object v4, v0, Le00/w;->e:Lg30/g;

    iget-object v6, v0, Le00/w;->a:Lb10/d;

    iget-object v6, v6, Lb10/d;->w:Ljava/lang/String;

    invoke-virtual {v0}, Le00/w;->b()Lyy/f;

    move-result-object v0

    const/4 v8, 0x1

    iput v8, v5, Lcz/d;->x:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-object/from16 v28, v5

    move-object v5, v0

    move-object v0, v4

    move-object v4, v6

    move-object/from16 v6, v28

    :try_start_7
    invoke-virtual/range {v0 .. v6}, Lg30/g;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lyy/f;Lcz/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    move-object v5, v6

    if-ne v0, v7, :cond_35

    goto :goto_1d

    :cond_35
    :goto_1a
    :try_start_8
    check-cast v0, Lcom/stripe/android/model/ConsumerSessionRefresh;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_1c

    :catchall_4
    move-exception v0

    move-object v5, v6

    :goto_1b
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_1c
    new-instance v7, Ll83/n;

    invoke-direct {v7, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_1d
    return-object v7

    :pswitch_b
    iget-object v0, v5, Lcz/d;->y:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Le00/w;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lcz/d;->x:I

    if-eqz v0, :cond_37

    const/4 v2, 0x1

    if-ne v0, v2, :cond_36

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1e

    :cond_36
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_37
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v7, Le00/w;->e:Lg30/g;

    iget-object v1, v5, Lcz/d;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    new-instance v2, Ly00/e0;

    iget-object v3, v5, Lcz/d;->E:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    check-cast v12, Ljava/lang/String;

    check-cast v11, Ly00/n;

    invoke-static {v7, v11}, Le00/w;->a(Le00/w;Ly00/n;)Ljava/util/Map;

    move-result-object v4

    invoke-direct {v2, v3, v9, v12, v4}, Ly00/e0;-><init>(Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/Map;)V

    iget-object v3, v7, Le00/w;->a:Lb10/d;

    iget-object v3, v3, Lb10/d;->w:Ljava/lang/String;

    invoke-virtual {v7}, Le00/w;->b()Lyy/f;

    move-result-object v4

    const/4 v10, 0x1

    iput v10, v5, Lcz/d;->x:I

    invoke-virtual/range {v0 .. v5}, Lg30/g;->c(Ljava/lang/String;Ly00/g0;Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_38

    goto :goto_20

    :cond_38
    :goto_1e
    instance-of v1, v0, Ll83/m;

    if-nez v1, :cond_39

    :try_start_9
    check-cast v0, Ly00/d0;

    iget-object v0, v0, Ly00/d0;->w:Ljava/util/List;

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly00/c0;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_1f

    :catchall_5
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :cond_39
    :goto_1f
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_3a

    iget-object v2, v7, Le00/w;->h:Lb20/f;

    sget-object v3, Lb20/c;->J:Lb20/c;

    sget v4, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v1}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v1

    invoke-static {v2, v3, v1, v9, v6}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    :cond_3a
    new-instance v8, Ll83/n;

    invoke-direct {v8, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_20
    return-object v8

    :pswitch_c
    check-cast v11, Landroidx/lifecycle/y1;

    iget-object v0, v5, Lcz/d;->y:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, Lcz/d;->x:I

    if-eqz v2, :cond_3d

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3c

    if-ne v2, v7, :cond_3b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_23

    :cond_3b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_21

    :cond_3d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_45

    invoke-virtual {v11}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld20/r;

    const/4 v3, 0x1

    iput v3, v5, Lcz/d;->x:I

    invoke-virtual {v2, v5}, Ld20/r;->l(Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3e

    goto :goto_22

    :cond_3e
    :goto_21
    check-cast v2, Ld20/h;

    instance-of v3, v2, Ld20/f;

    if-eqz v3, :cond_42

    sget v0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->z:I

    invoke-virtual {v11}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld20/r;

    check-cast v2, Ld20/f;

    iget-object v2, v2, Ld20/f;->a:Lq30/i0;

    iput v7, v5, Lcz/d;->x:I

    iget-object v0, v0, Ld20/r;->I:Lev/i;

    invoke-virtual {v0, v2, v5}, Lev/i;->m(Lq30/i0;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3f

    :goto_22
    move-object v10, v1

    goto :goto_24

    :cond_3f
    :goto_23
    check-cast v0, Lq30/m0;

    instance-of v1, v0, Lq30/l0;

    if-eqz v1, :cond_40

    iget-object v1, v5, Lcz/d;->z:Ljava/lang/Object;

    check-cast v1, Lj/d;

    check-cast v0, Lq30/l0;

    iget-object v0, v0, Lq30/l0;->w:Lt30/s;

    invoke-virtual {v1, v0, v9}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_24

    :cond_40
    instance-of v1, v0, Lq30/k0;

    if-eqz v1, :cond_41

    iget-object v1, v5, Lcz/d;->E:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/profile/view/edit/n;

    check-cast v0, Lq30/k0;

    iget-object v0, v0, Lq30/k0;->w:Lq30/a0;

    invoke-virtual {v1, v0}, Lcom/whoop/profile/view/edit/n;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_24

    :cond_41
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_42
    instance-of v1, v2, Ld20/g;

    if-eqz v1, :cond_43

    check-cast v12, Lj/d;

    check-cast v2, Ld20/g;

    iget-object v0, v2, Ld20/g;->a:Lyx/b;

    invoke-virtual {v12, v0, v9}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_24

    :cond_43
    instance-of v1, v2, Ld20/e;

    if-eqz v1, :cond_44

    check-cast v2, Ld20/e;

    iget-object v1, v2, Ld20/e;->a:Lv10/b;

    sget v2, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->z:I

    invoke-virtual {v0, v1}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->o(Lv10/b;)V

    goto :goto_24

    :cond_44
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_45
    :goto_24
    return-object v10

    :pswitch_d
    check-cast v12, Ld1/b;

    iget-object v0, v5, Lcz/d;->z:Ljava/lang/Object;

    check-cast v0, Lb3/x0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v5, Lcz/d;->x:I

    if-eqz v3, :cond_47

    const/4 v4, 0x1

    if-eq v3, v4, :cond_46

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_46
    :try_start_a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    :catchall_6
    move-exception v0

    goto :goto_25

    :cond_47
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v5, Lcz/d;->y:Ljava/lang/Object;

    check-cast v3, Lbc3/c0;

    sget-object v4, Ld1/n;->a:Ld1/m;

    iget-object v6, v0, Lb3/x0;->w:Landroid/view/View;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Ld1/j;

    invoke-direct {v4, v6}, Ld1/j;-><init>(Landroid/view/View;)V

    new-instance v6, Ld1/o;

    iget-object v7, v0, Lb3/x0;->w:Landroid/view/View;

    new-instance v10, Ld1/a;

    check-cast v11, Ld1/k;

    invoke-direct {v10, v11}, Ld1/a;-><init>(Ld1/k;)V

    invoke-direct {v6, v7, v10, v4}, Ld1/o;-><init>(Landroid/view/View;Ld1/a;Ld1/j;)V

    sget-boolean v7, Lc1/b;->a:Z

    if-eqz v7, :cond_48

    new-instance v7, Le;

    invoke-direct {v7, v12, v4, v9, v1}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v3, v9, v9, v7, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_48
    iget-object v1, v5, Lcz/d;->E:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_49

    invoke-interface {v1, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_49
    iput-object v6, v12, Ld1/b;->c:Ld1/o;

    const/4 v3, 0x1

    :try_start_b
    iput v3, v5, Lcz/d;->x:I

    invoke-virtual {v0, v6, v5}, Lb3/x0;->a(Ld1/o;Ls83/c;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    return-object v2

    :goto_25
    iput-object v9, v12, Ld1/b;->c:Ld1/o;

    throw v0

    :pswitch_e
    check-cast v11, Ld0/z1;

    iget-object v0, v5, Lcz/d;->E:Ljava/lang/Object;

    check-cast v0, Ld0/f1;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v14, v5, Lcz/d;->x:I

    const-wide/high16 v17, -0x8000000000000000L

    const/4 v15, 0x5

    move-object/from16 v20, v10

    const-wide/16 v9, 0x0

    move/from16 v21, v2

    if-eqz v14, :cond_4f

    const/4 v2, 0x1

    if-eq v14, v2, :cond_4e

    if-eq v14, v7, :cond_4d

    if-eq v14, v8, :cond_4c

    if-eq v14, v6, :cond_4b

    if-ne v14, v15, :cond_4a

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v1, v3

    goto/16 :goto_32

    :cond_4a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 v16, v3

    goto/16 :goto_30

    :cond_4c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_29

    :cond_4d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_28

    :cond_4e
    iget-object v2, v5, Lcz/d;->z:Ljava/lang/Object;

    check-cast v2, Ld0/f1;

    iget-object v11, v5, Lcz/d;->y:Ljava/lang/Object;

    check-cast v11, Lmc3/c;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_26

    :cond_4f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Ld0/f1;->y:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v12, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_50

    invoke-static {v0}, Ld0/f1;->H0(Ld0/f1;)V

    invoke-virtual {v0, v3}, Ld0/f1;->Q0(F)V

    invoke-virtual {v11, v12}, Ld0/z1;->p(Ljava/lang/Object;)V

    invoke-virtual {v11, v9, v10}, Ld0/z1;->n(J)V

    invoke-virtual {v0, v2}, Ld0/f1;->B0(Ljava/lang/Object;)V

    iget-object v2, v0, Ld0/f1;->y:Lp1/k1;

    invoke-virtual {v2, v12}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_50
    iget-object v11, v0, Ld0/f1;->K:Lmc3/c;

    iput-object v11, v5, Lcz/d;->y:Ljava/lang/Object;

    iput-object v0, v5, Lcz/d;->z:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, v5, Lcz/d;->x:I

    invoke-virtual {v11, v5}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_51

    goto/16 :goto_31

    :cond_51
    move-object v2, v0

    :goto_26
    :try_start_c
    iget-object v2, v2, Ld0/f1;->E:Ljava/lang/Object;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    const/4 v13, 0x0

    invoke-interface {v11, v13}, Lmc3/a;->i(Ljava/lang/Object;)V

    invoke-virtual {v12, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_55

    iput-object v13, v5, Lcz/d;->y:Ljava/lang/Object;

    iput-object v13, v5, Lcz/d;->z:Ljava/lang/Object;

    iput v7, v5, Lcz/d;->x:I

    iget-wide v13, v0, Ld0/f1;->M:J

    cmp-long v2, v13, v17

    if-nez v2, :cond_52

    iget-object v2, v0, Ld0/f1;->P:Ld0/x0;

    invoke-interface {v5}, Lq83/d;->getContext()Lq83/j;

    move-result-object v7

    invoke-static {v7}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object v7

    invoke-interface {v7, v2, v5}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_53

    goto :goto_27

    :cond_52
    invoke-virtual {v0, v5}, Ld0/f1;->L0(Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_53

    goto :goto_27

    :cond_53
    move-object/from16 v2, v20

    :goto_27
    if-ne v2, v1, :cond_54

    goto/16 :goto_31

    :cond_54
    :goto_28
    iput v8, v5, Lcz/d;->x:I

    invoke-static {v0, v5}, Ld0/f1;->K0(Ld0/f1;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_55

    goto/16 :goto_31

    :cond_55
    :goto_29
    iget-object v2, v0, Ld0/f1;->z:Lp1/k1;

    iget-object v7, v0, Ld0/f1;->I:Lp1/g1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_62

    invoke-virtual {v7}, Lp1/g1;->x()F

    move-result v2

    cmpg-float v2, v2, v21

    if-gez v2, :cond_56

    iget-object v2, v0, Ld0/f1;->O:Ld0/y0;

    if-eqz v2, :cond_57

    iget-object v8, v2, Ld0/y0;->b:Ld0/j2;

    const/4 v13, 0x0

    invoke-static {v13, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_56

    goto :goto_2b

    :cond_56
    move/from16 v16, v3

    :goto_2a
    const/4 v13, 0x0

    goto/16 :goto_2f

    :cond_57
    :goto_2b
    if-eqz v2, :cond_58

    iget-object v8, v2, Ld0/y0;->b:Ld0/j2;

    move-object/from16 v22, v8

    goto :goto_2c

    :cond_58
    const/16 v22, 0x0

    :goto_2c
    sget-object v8, Ld0/f1;->S:Ld0/n;

    if-eqz v22, :cond_5a

    iget-wide v13, v2, Ld0/y0;->a:J

    iget-object v11, v2, Ld0/y0;->e:Ld0/n;

    move/from16 v16, v3

    iget-object v3, v2, Ld0/y0;->f:Ld0/n;

    if-nez v3, :cond_59

    move-object/from16 v27, v8

    goto :goto_2d

    :cond_59
    move-object/from16 v27, v3

    :goto_2d
    sget-object v26, Ld0/f1;->T:Ld0/n;

    move-object/from16 v25, v11

    move-wide/from16 v23, v13

    invoke-interface/range {v22 .. v27}, Ld0/g2;->m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ld0/n;

    goto :goto_2e

    :cond_5a
    move/from16 v16, v3

    if-eqz v2, :cond_5e

    iget-wide v13, v2, Ld0/y0;->a:J

    cmp-long v3, v13, v9

    if-nez v3, :cond_5b

    goto :goto_2e

    :cond_5b
    iget-wide v13, v2, Ld0/y0;->g:J

    cmp-long v3, v13, v17

    if-nez v3, :cond_5c

    iget-wide v13, v0, Ld0/f1;->G:J

    :cond_5c
    long-to-float v3, v13

    const v11, 0x4e6e6b28    # 1.0E9f

    div-float/2addr v3, v11

    cmpg-float v11, v3, v16

    if-gtz v11, :cond_5d

    goto :goto_2e

    :cond_5d
    new-instance v8, Ld0/n;

    div-float v3, v21, v3

    invoke-direct {v8, v3}, Ld0/n;-><init>(F)V

    :cond_5e
    :goto_2e
    if-nez v2, :cond_5f

    new-instance v2, Ld0/y0;

    invoke-direct {v2}, Ld0/y0;-><init>()V

    :cond_5f
    iget-object v3, v2, Ld0/y0;->e:Ld0/n;

    const/4 v13, 0x0

    iput-object v13, v2, Ld0/y0;->b:Ld0/j2;

    iput-boolean v4, v2, Ld0/y0;->c:Z

    invoke-virtual {v7}, Lp1/g1;->x()F

    move-result v11

    iput v11, v2, Ld0/y0;->d:F

    invoke-virtual {v7}, Lp1/g1;->x()F

    move-result v11

    invoke-virtual {v3, v11, v4}, Ld0/n;->e(FI)V

    iget-wide v3, v0, Ld0/f1;->G:J

    iput-wide v3, v2, Ld0/y0;->g:J

    iput-wide v9, v2, Ld0/y0;->a:J

    iput-object v8, v2, Ld0/y0;->f:Ld0/n;

    long-to-double v3, v3

    invoke-virtual {v7}, Lp1/g1;->x()F

    move-result v7

    float-to-double v7, v7

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v9, v7

    mul-double/2addr v9, v3

    invoke-static {v9, v10}, Le93/b;->Y(D)J

    move-result-wide v3

    iput-wide v3, v2, Ld0/y0;->h:J

    iput-object v2, v0, Ld0/f1;->O:Ld0/y0;

    goto/16 :goto_2a

    :goto_2f
    iput-object v13, v5, Lcz/d;->y:Ljava/lang/Object;

    iput-object v13, v5, Lcz/d;->z:Ljava/lang/Object;

    iput v6, v5, Lcz/d;->x:I

    invoke-static {v0, v5}, Ld0/f1;->I0(Ld0/f1;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_60

    goto :goto_31

    :cond_60
    :goto_30
    invoke-virtual {v0, v12}, Ld0/f1;->B0(Ljava/lang/Object;)V

    iput v15, v5, Lcz/d;->x:I

    invoke-static {v0, v5}, Ld0/f1;->J0(Ld0/f1;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_61

    :goto_31
    move-object v10, v1

    goto :goto_33

    :cond_61
    move/from16 v1, v16

    :goto_32
    invoke-virtual {v0, v1}, Ld0/f1;->Q0(F)V

    :cond_62
    move-object/from16 v10, v20

    :goto_33
    return-object v10

    :catchall_7
    move-exception v0

    const/4 v13, 0x0

    invoke-interface {v11, v13}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0

    :pswitch_f
    move-object/from16 v20, v10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lcz/d;->x:I

    if-eqz v1, :cond_64

    const/4 v2, 0x1

    if-ne v1, v2, :cond_63

    iget-object v0, v5, Lcz/d;->E:Ljava/lang/Object;

    check-cast v0, Lcz/z0;

    iget-object v1, v5, Lcz/d;->y:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/customersheet/CustomerSheetActivity;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_34

    :cond_63
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_64
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v12, Lp1/c1;

    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcz/z0;

    if-eqz v1, :cond_66

    check-cast v11, Lh40/k;

    iget-object v2, v5, Lcz/d;->z:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/customersheet/CustomerSheetActivity;

    iput-object v2, v5, Lcz/d;->y:Ljava/lang/Object;

    iput-object v1, v5, Lcz/d;->E:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, v5, Lcz/d;->x:I

    invoke-virtual {v11, v5}, Lh40/k;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_65

    move-object v10, v0

    goto :goto_35

    :cond_65
    move-object v0, v1

    move-object v1, v2

    :goto_34
    sget v2, Lcom/stripe/android/customersheet/CustomerSheetActivity;->z:I

    invoke-virtual {v1, v0}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->o(Lcz/z0;)V

    :cond_66
    move-object/from16 v10, v20

    :goto_35
    return-object v10

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
