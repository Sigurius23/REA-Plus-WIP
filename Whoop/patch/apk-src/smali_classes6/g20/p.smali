.class public final Lg20/p;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lbc3/k1;Lc93/m;Lq83/d;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lg20/p;->w:I

    .line 1
    iput-object p1, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Lg20/p;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lh0/f0;Lc93/m;Lq83/d;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lg20/p;->w:I

    .line 3
    iput-object p1, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Lg20/p;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lh0/f0;Lf0/z0;Lc93/m;Lq83/d;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lg20/p;->w:I

    .line 4
    iput-object p1, p0, Lg20/p;->y:Ljava/lang/Object;

    iput-object p2, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast p3, Ls83/i;

    iput-object p3, p0, Lg20/p;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lh0/p;Lkotlin/jvm/functions/Function3;Lq83/d;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lg20/p;->w:I

    .line 2
    check-cast p2, Ls83/i;

    iput-object p2, p0, Lg20/p;->z:Ljava/lang/Object;

    iput-object p1, p0, Lg20/p;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 5
    iput p5, p0, Lg20/p;->w:I

    iput-object p1, p0, Lg20/p;->y:Ljava/lang/Object;

    iput-object p2, p0, Lg20/p;->z:Ljava/lang/Object;

    iput-object p3, p0, Lg20/p;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 6
    iput p4, p0, Lg20/p;->w:I

    iput-object p1, p0, Lg20/p;->z:Ljava/lang/Object;

    iput-object p2, p0, Lg20/p;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function3;Lh0/h2;Lu2/r;Lq83/d;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lg20/p;->w:I

    .line 7
    check-cast p1, Ls83/i;

    iput-object p1, p0, Lg20/p;->y:Ljava/lang/Object;

    iput-object p2, p0, Lg20/p;->z:Ljava/lang/Object;

    iput-object p3, p0, Lg20/p;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lp1/c1;Lg2/i;ILp1/c1;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg20/p;->w:I

    .line 8
    iput-object p1, p0, Lg20/p;->y:Ljava/lang/Object;

    iput-object p2, p0, Lg20/p;->z:Ljava/lang/Object;

    iput p3, p0, Lg20/p;->x:I

    iput-object p4, p0, Lg20/p;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8

    iget v0, p0, Lg20/p;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Lg20/p;

    iget-object p1, p0, Lg20/p;->y:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lc93/a;

    iget-object p1, p0, Lg20/p;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ln10/b;

    iget-object p1, p0, Lg20/p;->E:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lb20/d;

    const/16 v6, 0x1d

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v1

    :pswitch_0
    move-object v6, p2

    new-instance v2, Lg20/p;

    iget-object p1, p0, Lg20/p;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lmf/u;

    iget-object p1, p0, Lg20/p;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ldg/a;

    iget-object p1, p0, Lg20/p;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lvf/h;

    const/16 v7, 0x1c

    invoke-direct/range {v2 .. v7}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_1
    move-object v6, p2

    new-instance p2, Lg20/p;

    iget-object v0, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lic/e;

    iget-object v1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v1, Lmc/d;

    const/16 v2, 0x1b

    invoke-direct {p2, v0, v1, v6, v2}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lg20/p;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_2
    move-object v6, p2

    new-instance p1, Lg20/p;

    iget-object p2, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast p2, Lec3/p1;

    iget-object v0, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v0, Ll1/x4;

    const/16 v1, 0x1a

    invoke-direct {p1, p2, v0, v6, v1}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_3
    move-object v6, p2

    new-instance p2, Lg20/p;

    iget-object v0, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lc93/n;

    iget-object v1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v1, Lm1/g;

    const/16 v2, 0x19

    invoke-direct {p2, v0, v1, v6, v2}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lg20/p;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_4
    move-object v6, p2

    new-instance p2, Lg20/p;

    iget-object v0, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    iget-object v1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v1, Lm1/g;

    const/16 v2, 0x18

    invoke-direct {p2, v0, v1, v6, v2}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lg20/p;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_5
    move-object v6, p2

    new-instance p1, Lg20/p;

    iget-object p2, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/g0;

    iget-object v0, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v0, Llb/s;

    const/16 v1, 0x17

    invoke-direct {p1, p2, v0, v6, v1}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_6
    move-object v6, p2

    new-instance p2, Lg20/p;

    iget-object v0, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/16 v2, 0x16

    invoke-direct {p2, v0, v1, v6, v2}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lg20/p;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_7
    move-object v6, p2

    new-instance v2, Lg20/p;

    iget-object p1, p0, Lg20/p;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Landroid/app/Activity;

    iget-object p1, p0, Lg20/p;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    iget-object p1, p0, Lg20/p;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lb3/t0;

    const/16 v7, 0x15

    invoke-direct/range {v2 .. v7}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_8
    move-object v6, p2

    new-instance v2, Lg20/p;

    iget-object p1, p0, Lg20/p;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lq83/j;

    iget-object p1, p0, Lg20/p;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lec3/l;

    iget-object p1, p0, Lg20/p;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lp1/r1;

    const/16 v7, 0x14

    invoke-direct/range {v2 .. v7}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_9
    move-object v6, p2

    new-instance p2, Lg20/p;

    iget-object v0, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lj00/h;

    iget-object v1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/16 v2, 0x13

    invoke-direct {p2, v0, v1, v6, v2}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lg20/p;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_a
    move-object v6, p2

    new-instance p2, Lg20/p;

    iget-object v0, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lhb2/c;

    iget-object v1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x12

    invoke-direct {p2, v0, v1, v6, v2}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lg20/p;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_b
    move-object v6, p2

    new-instance v2, Lg20/p;

    iget-object p1, p0, Lg20/p;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    iget-object p1, p0, Lg20/p;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Li20/c0;

    iget-object p1, p0, Lg20/p;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lh40/k;

    const/16 v7, 0x11

    invoke-direct/range {v2 .. v7}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_c
    move-object v6, p2

    new-instance v2, Lg20/p;

    iget-object p1, p0, Lg20/p;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lh40/k;

    iget-object p1, p0, Lg20/p;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    iget-object p1, p0, Lg20/p;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Li20/v;

    const/16 v7, 0x10

    invoke-direct/range {v2 .. v7}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_d
    move-object v6, p2

    new-instance p2, Lg20/p;

    iget-object v0, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lh20/z4;

    iget-object v1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v1, Ly00/o4;

    const/16 v2, 0xf

    invoke-direct {p2, v0, v1, v6, v2}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lg20/p;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_e
    move-object v6, p2

    new-instance v2, Lg20/p;

    iget-object p1, p0, Lg20/p;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lh20/g;

    iget-object p1, p0, Lg20/p;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lo20/b;

    iget-object p1, p0, Lg20/p;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    const/16 v7, 0xe

    invoke-direct/range {v2 .. v7}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_f
    move-object v6, p2

    new-instance p2, Lg20/p;

    iget-object v0, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lu2/v;

    iget-object v1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v1, Lh0/z3;

    const/16 v2, 0xd

    invoke-direct {p2, v0, v1, v6, v2}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lg20/p;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_10
    move-object v6, p2

    new-instance p2, Lg20/p;

    iget-object v0, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    iget-object v1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    invoke-direct {p2, v0, v1, v6}, Lg20/p;-><init>(Lbc3/k1;Lc93/m;Lq83/d;)V

    iput-object p1, p2, Lg20/p;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_11
    move-object v6, p2

    new-instance p1, Lg20/p;

    iget-object p2, p0, Lg20/p;->y:Ljava/lang/Object;

    check-cast p2, Ls83/i;

    iget-object v0, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lh0/h2;

    iget-object v1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v1, Lu2/r;

    invoke-direct {p1, p2, v0, v1, v6}, Lg20/p;-><init>(Lkotlin/jvm/functions/Function3;Lh0/h2;Lu2/r;Lq83/d;)V

    return-object p1

    :pswitch_12
    move-object v6, p2

    new-instance p2, Lg20/p;

    iget-object v0, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lh0/c3;

    iget-object v1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    const/16 v2, 0xa

    invoke-direct {p2, v0, v1, v6, v2}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lg20/p;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_13
    move-object v6, p2

    new-instance p2, Lg20/p;

    iget-object v0, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lh0/e1;

    iget-object v1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v1, Lh0/c3;

    const/16 v2, 0x9

    invoke-direct {p2, v0, v1, v6, v2}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lg20/p;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_14
    move-object v6, p2

    new-instance p2, Lg20/p;

    iget-object v0, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lh0/e1;

    iget-object v1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v1, Lh0/m1;

    const/16 v2, 0x8

    invoke-direct {p2, v0, v1, v6, v2}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lg20/p;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_15
    move-object v6, p2

    new-instance p1, Lg20/p;

    iget-object p2, p0, Lg20/p;->y:Ljava/lang/Object;

    check-cast p2, Lh0/f0;

    iget-object v0, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lf0/z0;

    iget-object v1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    invoke-direct {p1, p2, v0, v1, v6}, Lg20/p;-><init>(Lh0/f0;Lf0/z0;Lc93/m;Lq83/d;)V

    return-object p1

    :pswitch_16
    move-object v6, p2

    new-instance p2, Lg20/p;

    iget-object v0, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lh0/f0;

    iget-object v1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    invoke-direct {p2, v0, v1, v6}, Lg20/p;-><init>(Lh0/f0;Lc93/m;Lq83/d;)V

    iput-object p1, p2, Lg20/p;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_17
    move-object v6, p2

    new-instance v2, Lg20/p;

    iget-object p1, p0, Lg20/p;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lh0/d0;

    iget-object p1, p0, Lg20/p;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lf0/z0;

    iget-object p1, p0, Lg20/p;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lc93/m;

    const/4 v7, 0x5

    invoke-direct/range {v2 .. v7}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_18
    move-object v6, p2

    new-instance p2, Lg20/p;

    iget-object v0, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lh0/d0;

    iget-object v1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    const/4 v2, 0x4

    invoke-direct {p2, v0, v1, v6, v2}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lg20/p;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_19
    move-object v6, p2

    new-instance p2, Lg20/p;

    iget-object v0, p0, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Ls83/i;

    iget-object v1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast v1, Lh0/p;

    invoke-direct {p2, v1, v0, v6}, Lg20/p;-><init>(Lh0/p;Lkotlin/jvm/functions/Function3;Lq83/d;)V

    iput-object p1, p2, Lg20/p;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_1a
    move-object v6, p2

    new-instance v2, Lg20/p;

    iget-object p1, p0, Lg20/p;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ld0/f1;

    iget-object p1, p0, Lg20/p;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lp1/c1;

    iget-object p1, p0, Lg20/p;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lp1/z0;

    const/4 v7, 0x2

    invoke-direct/range {v2 .. v7}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_1b
    move-object v6, p2

    new-instance v2, Lg20/p;

    iget-object p1, p0, Lg20/p;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lp1/c1;

    iget-object p1, p0, Lg20/p;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lg2/i;

    iget v5, p0, Lg20/p;->x:I

    iget-object p1, p0, Lg20/p;->E:Ljava/lang/Object;

    check-cast p1, Lp1/c1;

    move-object v7, v6

    move-object v6, p1

    invoke-direct/range {v2 .. v7}, Lg20/p;-><init>(Lp1/c1;Lg2/i;ILp1/c1;Lq83/d;)V

    return-object v2

    :pswitch_1c
    move-object v6, p2

    new-instance v2, Lg20/p;

    iget-object p1, p0, Lg20/p;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lg20/r;

    iget-object p1, p0, Lg20/p;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ly00/c8;

    iget-object p1, p0, Lg20/p;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ls40/a;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

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

    iget v0, p0, Lg20/p;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ll83/k;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lm1/b0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lh20/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lh0/k2;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lh0/a3;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lh0/g1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lh0/e0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lh0/k2;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lh0/h1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_1c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg20/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 16

    move-object/from16 v1, p0

    iget v0, v1, Lg20/p;->w:I

    const/4 v2, 0x4

    const/16 v3, 0x1b

    const/4 v4, 0x0

    const/16 v5, 0x1a

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg20/p;->x:I

    if-eqz v2, :cond_1

    if-ne v2, v9, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_2
    iput v9, v1, Lg20/p;->x:I

    const-wide/16 v2, 0x5

    invoke-static {v2, v3, v1}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v2, Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v0, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Ln10/b;

    iget-object v3, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v3, Lb20/d;

    iget-object v0, v0, Ln10/b;->a:Lb20/f;

    const/4 v4, 0x6

    invoke-static {v0, v3, v8, v8, v4}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    move-object v0, v2

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg20/p;->x:I

    if-eqz v2, :cond_5

    if-ne v2, v9, :cond_4

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v2, Lmf/u;

    iget-object v2, v2, Lmf/u;->a:Lpf/a;

    iget-object v3, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v3, Ldg/a;

    iget-object v4, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v4, Lvf/h;

    iput v9, v1, Lg20/p;->x:I

    invoke-interface {v2, v3, v4, v1}, Lpf/a;->z0(Ldg/a;Lvf/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_6

    goto :goto_2

    :cond_6
    move-object v0, v2

    :goto_2
    return-object v0

    :pswitch_1
    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v0, v1, Lg20/p;->x:I

    if-eqz v0, :cond_8

    if-ne v0, v9, :cond_7

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lg20/p;->y:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ldc3/u;

    iget-object v0, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lic/e;

    invoke-virtual {v0}, Lic/e;->a()Landroid/net/NetworkRequest;

    move-result-object v0

    if-nez v0, :cond_9

    check-cast v7, Ldc3/t;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7, v8}, Ldc3/t;->r(Ljava/lang/Throwable;)Z

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    goto/16 :goto_a

    :cond_9
    new-instance v10, Lh20/i0;

    iget-object v11, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v11, Lmc/d;

    invoke-direct {v10, v11, v7, v8, v5}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v7, v8, v8, v10, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v8

    new-instance v10, Llq0/d;

    const/16 v11, 0xa

    invoke-direct {v10, v11, v8, v7}, Llq0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x1e

    const/4 v12, 0x7

    if-lt v8, v11, :cond_d

    sget-object v3, Lmc/g;->a:Lmc/g;

    iget-object v4, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v4, Lmc/d;

    iget-object v4, v4, Lmc/d;->a:Landroid/net/ConnectivityManager;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lmc/g;->b:Ljava/lang/Object;

    monitor-enter v6

    :try_start_0
    sget-object v8, Lmc/g;->c:Ljava/util/LinkedHashMap;

    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    move-result v11

    invoke-interface {v8, v10, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v11, :cond_a

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v8

    sget-object v11, Lmc/i;->a:Ljava/lang/String;

    const-string v13, "NetworkRequestConstraintController register shared callback"

    invoke-virtual {v8, v11, v13}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_6

    :cond_a
    :goto_3
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v3

    sget-object v8, Lmc/i;->a:Ljava/lang/String;

    const-string v11, "NetworkRequestConstraintController send initial capabilities"

    invoke-virtual {v3, v8, v11}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-boolean v3, Lmc/g;->e:Z

    if-eqz v3, :cond_b

    sget-object v3, Lmc/g;->d:Landroid/net/NetworkCapabilities;

    goto :goto_4

    :cond_b
    invoke-virtual {v4}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v3

    invoke-virtual {v4, v3}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v3

    sput-object v3, Lmc/g;->d:Landroid/net/NetworkCapabilities;

    sput-boolean v9, Lmc/g;->e:Z

    :goto_4
    invoke-static {v0, v3}, Lmc/g;->a(Landroid/net/NetworkRequest;Landroid/net/NetworkCapabilities;)Z

    move-result v0

    if-eqz v0, :cond_c

    sget-object v0, Lmc/a;->a:Lmc/a;

    goto :goto_5

    :cond_c
    new-instance v0, Lmc/b;

    invoke-direct {v0, v12}, Lmc/b;-><init>(I)V

    :goto_5
    invoke-virtual {v10, v0}, Llq0/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v6

    new-instance v0, Ll01/q;

    invoke-direct {v0, v5, v10, v4}, Ll01/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_8

    :goto_6
    monitor-exit v6

    throw v0

    :cond_d
    sget v5, Lcom/iterable/iterableapi/r1;->c:I

    iget-object v5, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v5, Lmc/d;

    iget-object v5, v5, Lmc/d;->a:Landroid/net/ConnectivityManager;

    new-instance v8, Lcom/iterable/iterableapi/r1;

    invoke-direct {v8, v10}, Lcom/iterable/iterableapi/r1;-><init>(Llq0/d;)V

    new-instance v11, Lkotlin/jvm/internal/b0;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    :try_start_1
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v13

    sget-object v14, Lmc/i;->a:Ljava/lang/String;

    const-string v15, "NetworkRequestConstraintController register callback"

    invoke-virtual {v13, v14, v15}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v0, v8}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    iput-boolean v9, v11, Lkotlin/jvm/internal/b0;->w:Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_7

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    const-string v14, "TooManyRequestsException"

    invoke-static {v13, v14, v4}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v4

    sget-object v13, Lmc/i;->a:Ljava/lang/String;

    const-string v14, "NetworkRequestConstraintController couldn\'t register callback"

    iget v4, v4, Lic/w;->a:I

    if-gt v4, v6, :cond_e

    invoke-static {v13, v14, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_e
    new-instance v0, Lmc/b;

    invoke-direct {v0, v12}, Lmc/b;-><init>(I)V

    invoke-virtual {v10, v0}, Llq0/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_7
    new-instance v0, Lim1/a0;

    invoke-direct {v0, v11, v5, v8, v3}, Lim1/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    :goto_8
    new-instance v3, Llq2/k;

    const/16 v4, 0x8

    invoke-direct {v3, v0, v4}, Llq2/k;-><init>(Lc93/a;I)V

    iput v9, v1, Lg20/p;->x:I

    invoke-static {v7, v3, v1}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_f

    goto :goto_a

    :cond_f
    :goto_9
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_a
    return-object v2

    :cond_10
    throw v0

    :pswitch_2
    iget-object v0, v1, Lg20/p;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lec3/p1;

    iget-object v0, v1, Lg20/p;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ll1/x4;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v0, v1, Lg20/p;->x:I

    if-eqz v0, :cond_14

    if-eq v0, v9, :cond_13

    if-eq v0, v7, :cond_12

    if-eq v0, v6, :cond_11

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    iget-object v0, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_f

    :cond_12
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_c

    :cond_13
    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_b

    :catchall_1
    move-exception v0

    goto :goto_d

    :cond_14
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object v5, v2

    check-cast v5, Lec3/h2;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5, v8, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object v0, Lf0/z0;->y:Lf0/z0;

    iput v9, v1, Lg20/p;->x:I

    invoke-virtual {v3, v0, v1}, Ll1/x4;->c(Lf0/z0;Ls83/i;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v0, v4, :cond_15

    goto :goto_e

    :cond_15
    :goto_b
    invoke-virtual {v3}, Ll1/x4;->b()Z

    move-result v0

    if-eqz v0, :cond_16

    new-instance v0, Lb30/i5;

    invoke-direct {v0, v3, v8, v6}, Lb30/i5;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput v7, v1, Lg20/p;->x:I

    invoke-static {v2, v0, v1}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_16

    goto :goto_e

    :cond_16
    :goto_c
    sget-object v4, Ll83/a0;->a:Ll83/a0;

    goto :goto_e

    :goto_d
    invoke-virtual {v3}, Ll1/x4;->b()Z

    move-result v5

    if-eqz v5, :cond_17

    new-instance v5, Lb30/i5;

    invoke-direct {v5, v3, v8, v6}, Lb30/i5;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object v0, v1, Lg20/p;->y:Ljava/lang/Object;

    iput v6, v1, Lg20/p;->x:I

    invoke-static {v2, v5, v1}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_17

    :goto_e
    return-object v4

    :cond_17
    :goto_f
    throw v0

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg20/p;->x:I

    if-eqz v2, :cond_19

    if-ne v2, v9, :cond_18

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_10

    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v2, Ll83/k;

    iget-object v3, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Lm1/b0;

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    iget-object v4, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v4, Lc93/n;

    iget-object v5, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v5, Lm1/g;

    iget-object v5, v5, Lm1/g;->n:Lm1/f;

    iput v9, v1, Lg20/p;->x:I

    invoke-interface {v4, v5, v3, v2, v1}, Lc93/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_1a

    goto :goto_11

    :cond_1a
    :goto_10
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_11
    return-object v0

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg20/p;->x:I

    if-eqz v2, :cond_1c

    if-ne v2, v9, :cond_1b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_12

    :cond_1b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v2, Lm1/b0;

    iget-object v3, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function3;

    iget-object v4, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v4, Lm1/g;

    iget-object v4, v4, Lm1/g;->n:Lm1/f;

    iput v9, v1, Lg20/p;->x:I

    invoke-interface {v3, v4, v2, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_1d

    goto :goto_13

    :cond_1d
    :goto_12
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_13
    return-object v0

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg20/p;->x:I

    if-eqz v2, :cond_1f

    if-ne v2, v9, :cond_1e

    iget-object v0, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_14

    :cond_1e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v3, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v3, Llb/s;

    iput-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    iput v9, v1, Lg20/p;->x:I

    invoke-virtual {v3, v1}, Llb/s;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_20

    goto :goto_15

    :cond_20
    move-object v0, v2

    :goto_14
    iput-object v3, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_15
    return-object v0

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg20/p;->x:I

    if-eqz v2, :cond_22

    if-ne v2, v9, :cond_21

    :try_start_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-object/from16 v2, p1

    goto :goto_17

    :catchall_2
    move-exception v0

    goto :goto_16

    :cond_21
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    iget-object v2, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v2, Lc93/m;

    :try_start_5
    new-instance v3, Lh20/i0;

    const/16 v4, 0xe

    invoke-direct {v3, v2, v8, v4}, Lh20/i0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput v9, v1, Lg20/p;->x:I

    invoke-static {v3, v1}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-ne v2, v0, :cond_23

    goto :goto_18

    :goto_16
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v2

    :cond_23
    :goto_17
    iget-object v0, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_24

    if-eqz v0, :cond_24

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_24
    new-instance v0, Ll83/n;

    invoke-direct {v0, v2}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_18
    return-object v0

    :pswitch_7
    iget-object v0, v1, Lg20/p;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lb3/t0;

    iget-object v0, v1, Lg20/p;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v5, v1, Lg20/p;->x:I

    if-eqz v5, :cond_26

    if-ne v5, v9, :cond_25

    :try_start_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    move-object/from16 v3, p1

    goto :goto_19

    :catch_1
    move-exception v0

    goto :goto_1a

    :cond_25
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_26
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_7
    iget-object v5, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v5, Landroid/app/Activity;

    iput v9, v1, Lg20/p;->x:I

    sget-object v6, Lnj/c;->a:[Lj93/z;

    sget-object v6, Lbc3/q0;->a:Lkc3/e;

    sget-object v6, Lhc3/o;->a:Lbc3/w1;

    new-instance v7, Landroidx/room/e;

    invoke-direct {v7, v5, v4, v8, v3}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v6, v7, v1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_27

    goto :goto_1c

    :cond_27
    :goto_19
    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v9

    new-instance v3, Lij/h;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lij/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lb3/t0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    goto :goto_1b

    :goto_1a
    sget-object v3, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v5, "Error in isElementVisible for selector: "

    const-string v6, " - "

    invoke-static {v5, v4, v6}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v0, v4}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    new-instance v0, Lij/h;

    const-string v3, "false"

    invoke-direct {v0, v3}, Lij/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lb3/t0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1c
    return-object v0

    :pswitch_8
    iget-object v0, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v0, Lp1/r1;

    iget-object v2, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v2, Lec3/l;

    iget-object v3, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v3, Lq83/j;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v1, Lg20/p;->x:I

    if-eqz v6, :cond_2a

    if-eq v6, v9, :cond_29

    if-ne v6, v7, :cond_28

    goto :goto_1d

    :cond_28
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_29
    :goto_1d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1e

    :cond_2a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v6, Lq83/k;->w:Lq83/k;

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2b

    new-instance v3, Lj8/a;

    invoke-direct {v3, v0, v4}, Lj8/a;-><init>(Lp1/r1;I)V

    iput v9, v1, Lg20/p;->x:I

    invoke-interface {v2, v3, v1}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_2c

    goto :goto_1f

    :cond_2b
    new-instance v6, Lj8/b;

    invoke-direct {v6, v2, v0, v8, v4}, Lj8/b;-><init>(Lec3/l;Lp1/r1;Lq83/d;I)V

    iput v7, v1, Lg20/p;->x:I

    invoke-static {v3, v6, v1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_2c

    goto :goto_1f

    :cond_2c
    :goto_1e
    sget-object v5, Ll83/a0;->a:Ll83/a0;

    :goto_1f
    return-object v5

    :pswitch_9
    iget-object v0, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    iget-object v2, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v2, Lj00/h;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v1, Lg20/p;->x:I

    if-eqz v4, :cond_2f

    if-eq v4, v9, :cond_2e

    if-ne v4, v7, :cond_2d

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_22

    :cond_2d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2e
    iget-object v4, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_20

    :cond_2f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_32

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_30

    goto :goto_21

    :cond_30
    iget-wide v5, v2, Lj00/h;->F:J

    iput-object v4, v1, Lg20/p;->y:Ljava/lang/Object;

    iput v9, v1, Lg20/p;->x:I

    invoke-static {v5, v6, v1}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_31

    goto :goto_23

    :cond_31
    :goto_20
    sget-object v5, Ln00/d;->x:Ln00/d;

    invoke-virtual {v0, v5}, Lio/getstream/chat/android/ui/viewmodel/typing/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v8, v1, Lg20/p;->y:Ljava/lang/Object;

    iput v7, v1, Lg20/p;->x:I

    invoke-static {v2, v4, v1}, Lj00/h;->g(Lj00/h;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_33

    goto :goto_23

    :cond_32
    :goto_21
    iget-object v2, v2, Lj00/h;->G:Lj00/k;

    iget-object v2, v2, Lj00/k;->k:Ln00/d;

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/ui/viewmodel/typing/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_33
    :goto_22
    sget-object v3, Ll83/a0;->a:Ll83/a0;

    :goto_23
    return-object v3

    :pswitch_a
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg20/p;->x:I

    if-eqz v2, :cond_35

    if-ne v2, v9, :cond_34

    iget-object v0, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_24

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_35
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    iput-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    iput v9, v1, Lg20/p;->x:I

    const-wide/16 v3, 0x190

    invoke-static {v3, v4, v1}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_36

    goto :goto_25

    :cond_36
    move-object v0, v2

    :goto_24
    invoke-static {v0}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result v0

    if-eqz v0, :cond_37

    iget-object v0, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lhb2/c;

    iget-object v2, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lhb2/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_37
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_25
    return-object v0

    :pswitch_b
    iget-object v0, v1, Lg20/p;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg20/p;->x:I

    if-eqz v2, :cond_39

    if-ne v2, v9, :cond_38

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_26

    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_39
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v4, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {v2}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li20/v0;

    iget-object v8, v2, Li20/v0;->G:Lec3/q1;

    new-instance v2, Lb2/y;

    iget-object v3, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v3, Li20/c0;

    iget-object v5, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v5, Lh40/k;

    const/4 v6, 0x0

    const/16 v7, 0xe

    invoke-direct/range {v2 .. v7}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v9, v1, Lg20/p;->x:I

    invoke-static {v8, v2, v1}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_3a

    goto :goto_27

    :cond_3a
    :goto_26
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_27
    return-object v0

    :pswitch_c
    iget-object v0, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lg20/p;->x:I

    if-eqz v3, :cond_3c

    if-ne v3, v9, :cond_3b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_28

    :cond_3b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v3, Lh40/k;

    iput v9, v1, Lg20/p;->x:I

    invoke-virtual {v3, v1}, Lh40/k;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_3d

    goto :goto_29

    :cond_3d
    :goto_28
    iget-object v2, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v2, Li20/v;

    sget v3, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->z:I

    invoke-virtual {v2}, Li20/v;->b()I

    move-result v3

    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    new-instance v5, Li20/i;

    invoke-direct {v5, v2}, Li20/i;-><init>(Li20/v;)V

    const-string v2, "com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_result"

    new-instance v6, Ll83/k;

    invoke-direct {v6, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v6}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->finish()V

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_29
    return-object v2

    :pswitch_d
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg20/p;->x:I

    if-eqz v2, :cond_3f

    if-ne v2, v9, :cond_3e

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_2a

    :cond_3e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v2, Lh20/a;

    iget-object v3, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v3, Lh20/z4;

    iget-object v4, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v4, Ly00/o4;

    iput v9, v1, Lg20/p;->x:I

    new-instance v5, Lh00/l0;

    const/16 v6, 0x9

    invoke-direct {v5, v6}, Lh00/l0;-><init>(I)V

    invoke-virtual {v3, v4, v2, v5, v1}, Lh20/z4;->a(Ly00/o4;Lh20/a;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_40

    goto :goto_2b

    :cond_40
    move-object v0, v2

    :goto_2a
    new-instance v2, Ll83/n;

    invoke-direct {v2, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    move-object v0, v2

    :goto_2b
    return-object v0

    :pswitch_e
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg20/p;->x:I

    if-eqz v2, :cond_42

    if-ne v2, v9, :cond_41

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2c

    :cond_41
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_42
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v2, Lh20/g;

    iget-object v2, v2, Lh20/g;->o:Lec3/w1;

    iget-object v3, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v3, Lo20/b;

    iget-object v4, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    new-instance v5, Ll83/k;

    invoke-direct {v5, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput v9, v1, Lg20/p;->x:I

    invoke-virtual {v2, v5, v1}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_43

    goto :goto_2d

    :cond_43
    :goto_2c
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_2d
    return-object v0

    :pswitch_f
    iget-object v0, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v0, Lh0/z3;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v1, Lg20/p;->x:I

    if-eqz v4, :cond_45

    if-ne v4, v9, :cond_44

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2e

    :cond_44
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_45
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v4, Lbc3/c0;

    sget-object v5, Lbc3/d0;->z:Lbc3/d0;

    new-instance v6, Lh0/y3;

    invoke-direct {v6, v0, v8}, Lh0/y3;-><init>(Lh0/z3;Lq83/d;)V

    invoke-static {v4, v8, v5, v6, v9}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v5, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v5, Lu2/v;

    new-instance v6, Lf1/v0;

    invoke-direct {v6, v0, v4, v8, v2}, Lf1/v0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v9, v1, Lg20/p;->x:I

    invoke-static {v5, v6, v1}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_46

    goto :goto_2f

    :cond_46
    :goto_2e
    sget-object v3, Ll83/a0;->a:Ll83/a0;

    :goto_2f
    return-object v3

    :pswitch_10
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg20/p;->x:I

    if-eqz v2, :cond_49

    if-eq v2, v9, :cond_48

    if-ne v2, v7, :cond_47

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_31

    :cond_47
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_48
    iget-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_30

    :cond_49
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    iget-object v3, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v3, Lbc3/k1;

    iput-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    iput v9, v1, Lg20/p;->x:I

    invoke-interface {v3, v1}, Lbc3/k1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_4a

    goto :goto_32

    :cond_4a
    :goto_30
    iget-object v3, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v3, Ls83/i;

    iput-object v8, v1, Lg20/p;->y:Ljava/lang/Object;

    iput v7, v1, Lg20/p;->x:I

    invoke-interface {v3, v2, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_4b

    goto :goto_32

    :cond_4b
    :goto_31
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_32
    return-object v0

    :pswitch_11
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg20/p;->x:I

    if-eqz v2, :cond_4d

    if-ne v2, v9, :cond_4c

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_33

    :cond_4c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v2, Ls83/i;

    iget-object v3, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v3, Lh0/h2;

    iget-object v4, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v4, Lu2/r;

    iget-wide v4, v4, Lu2/r;->c:J

    new-instance v6, Lh2/b;

    invoke-direct {v6, v4, v5}, Lh2/b;-><init>(J)V

    iput v9, v1, Lg20/p;->x:I

    invoke-interface {v2, v3, v6, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_4e

    goto :goto_34

    :cond_4e
    :goto_33
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_34
    return-object v0

    :pswitch_12
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg20/p;->x:I

    if-eqz v2, :cond_50

    if-ne v2, v9, :cond_4f

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_35

    :cond_4f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_50
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v2, Lh0/k2;

    iget-object v3, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v3, Lh0/c3;

    iput-object v2, v3, Lh0/c3;->k:Lh0/k2;

    iget-object v2, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v2, Lc93/m;

    iget-object v3, v3, Lh0/c3;->l:Lh0/a3;

    iput v9, v1, Lg20/p;->x:I

    invoke-interface {v2, v3, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_51

    goto :goto_36

    :cond_51
    :goto_35
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_36
    return-object v0

    :pswitch_13
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg20/p;->x:I

    if-eqz v2, :cond_53

    if-ne v2, v9, :cond_52

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_37

    :cond_52
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_53
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v2, Lh0/a3;

    iget-object v4, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v4, Lh0/e1;

    iget-object v5, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v5, Lh0/c3;

    new-instance v6, Lfd3/a;

    invoke-direct {v6, v3, v2, v5}, Lfd3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v9, v1, Lg20/p;->x:I

    invoke-virtual {v4, v6, v1}, Lh0/e1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_54

    goto :goto_38

    :cond_54
    :goto_37
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_38
    return-object v0

    :pswitch_14
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg20/p;->x:I

    if-eqz v2, :cond_56

    if-ne v2, v9, :cond_55

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_39

    :cond_55
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_56
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v2, Lh0/g1;

    iget-object v3, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v3, Lh0/e1;

    iget-object v4, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v4, Lh0/m1;

    new-instance v6, Lfd3/a;

    invoke-direct {v6, v5, v2, v4}, Lfd3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v9, v1, Lg20/p;->x:I

    invoke-virtual {v3, v6, v1}, Lh0/e1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_57

    goto :goto_3a

    :cond_57
    :goto_39
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3a
    return-object v0

    :pswitch_15
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg20/p;->x:I

    if-eqz v2, :cond_59

    if-ne v2, v9, :cond_58

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3b

    :cond_58
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_59
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v2, Lh0/f0;

    iget-object v12, v2, Lh0/f0;->c:Lf0/c1;

    iget-object v14, v2, Lh0/f0;->b:Lh0/e0;

    iget-object v3, v1, Lg20/p;->z:Ljava/lang/Object;

    move-object v11, v3

    check-cast v11, Lf0/z0;

    new-instance v13, Lg20/p;

    iget-object v3, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v3, Ls83/i;

    invoke-direct {v13, v2, v3, v8}, Lg20/p;-><init>(Lh0/f0;Lc93/m;Lq83/d;)V

    iput v9, v1, Lg20/p;->x:I

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v10, Lf0/b1;

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v15}, Lf0/b1;-><init>(Lf0/z0;Lf0/c1;Lc93/m;Ljava/lang/Object;Lq83/d;)V

    invoke-static {v10, v1}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_5a

    goto :goto_3c

    :cond_5a
    :goto_3b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3c
    return-object v0

    :pswitch_16
    iget-object v0, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lh0/f0;

    iget-object v2, v0, Lh0/f0;->d:Lp1/k1;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lg20/p;->x:I

    if-eqz v3, :cond_5c

    if-ne v3, v9, :cond_5b

    :try_start_8
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_3d

    :catchall_3
    move-exception v0

    goto :goto_3f

    :cond_5b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v3, Lh0/e0;

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :try_start_9
    iget-object v4, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v4, Ls83/i;

    iput v9, v1, Lg20/p;->x:I

    invoke-interface {v4, v3, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    if-ne v3, v0, :cond_5d

    goto :goto_3e

    :cond_5d
    :goto_3d
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3e
    return-object v0

    :goto_3f
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    throw v0

    :pswitch_17
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lg20/p;->x:I

    if-eqz v3, :cond_5f

    if-ne v3, v9, :cond_5e

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_40

    :cond_5e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v3, Lh0/d0;

    iget-object v12, v3, Lh0/d0;->c:Lf0/c1;

    iget-object v14, v3, Lh0/d0;->b:Lh0/c0;

    iget-object v4, v1, Lg20/p;->z:Ljava/lang/Object;

    move-object v11, v4

    check-cast v11, Lf0/z0;

    new-instance v13, Lg20/p;

    iget-object v4, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v4, Lc93/m;

    invoke-direct {v13, v3, v4, v8, v2}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v9, v1, Lg20/p;->x:I

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v10, Lf0/b1;

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v15}, Lf0/b1;-><init>(Lf0/z0;Lf0/c1;Lc93/m;Ljava/lang/Object;Lq83/d;)V

    invoke-static {v10, v1}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_60

    goto :goto_41

    :cond_60
    :goto_40
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_41
    return-object v0

    :pswitch_18
    iget-object v0, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lh0/d0;

    iget-object v2, v0, Lh0/d0;->d:Lp1/k1;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lg20/p;->x:I

    if-eqz v3, :cond_62

    if-ne v3, v9, :cond_61

    :try_start_a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    goto :goto_42

    :catchall_4
    move-exception v0

    goto :goto_44

    :cond_61
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_62
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v3, Lh0/k2;

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :try_start_b
    iget-object v4, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v4, Lc93/m;

    iput v9, v1, Lg20/p;->x:I

    invoke-interface {v4, v3, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    if-ne v3, v0, :cond_63

    goto :goto_43

    :cond_63
    :goto_42
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_43
    return-object v0

    :goto_44
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    throw v0

    :pswitch_19
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lg20/p;->x:I

    if-eqz v2, :cond_65

    if-ne v2, v9, :cond_64

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_45

    :cond_64
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_65
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v2, Lh0/h1;

    iget-object v3, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v3, Ls83/i;

    iget-object v4, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v4, Lh0/p;

    iget-object v4, v4, Lh0/p;->j:Lh0/o;

    iput v9, v1, Lg20/p;->x:I

    invoke-interface {v3, v4, v2, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_66

    goto :goto_46

    :cond_66
    :goto_45
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_46
    return-object v0

    :pswitch_1a
    iget-object v0, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lg20/p;->x:I

    if-eqz v3, :cond_68

    if-ne v3, v9, :cond_67

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_47

    :cond_67
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_68
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v7

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    iget-object v3, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v3, Ld0/f1;

    iget-object v4, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v4, Lp1/z0;

    check-cast v4, Lp1/g1;

    invoke-virtual {v4}, Lp1/g1;->x()F

    move-result v4

    iput v9, v1, Lg20/p;->x:I

    invoke-virtual {v3, v4, v0, v1}, Ld0/f1;->O0(FLjava/lang/Object;Ls83/i;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_69

    goto :goto_48

    :cond_69
    :goto_47
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_48
    return-object v2

    :pswitch_1b
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    sget-object v2, Lg40/j4;->a:Lp1/u2;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg40/s3;

    instance-of v0, v0, Lg40/x3;

    if-eqz v0, :cond_6a

    iget-object v0, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6a

    iget-object v0, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Lg2/i;

    iget v2, v1, Lg20/p;->x:I

    invoke-static {v0, v2}, Luf/c0;->c0(Lg2/i;I)V

    :cond_6a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1c
    iget-object v0, v1, Lg20/p;->z:Ljava/lang/Object;

    check-cast v0, Ly00/c8;

    iget-object v2, v1, Lg20/p;->y:Ljava/lang/Object;

    check-cast v2, Lg20/r;

    iget-object v3, v2, Lg20/r;->K:Landroidx/lifecycle/k1;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v1, Lg20/p;->x:I

    if-eqz v5, :cond_6c

    if-ne v5, v9, :cond_6b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_49

    :cond_6b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    const-string v5, "key_has_started"

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v6, v5}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "confirm_action_requested"

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v3, v6, v5}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v2, Lg20/r;->M:Lbz/c;

    sget-object v5, Lbz/b;->H:Lbz/b;

    invoke-static {v3, v5}, Lvd/e;->f0(Lbz/c;Lbz/b;)V

    iget-object v3, v2, Lg20/r;->y:Lc20/a;

    invoke-virtual {v3, v0}, Lc20/a;->b(Ljava/lang/Object;)Lc20/e;

    move-result-object v3

    iget-object v5, v1, Lg20/p;->E:Ljava/lang/Object;

    check-cast v5, Ls40/a;

    iget-object v2, v2, Lg20/r;->E:Lb20/g;

    invoke-virtual {v2}, Lb20/g;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyy/f;

    iput v9, v1, Lg20/p;->x:I

    invoke-virtual {v3, v5, v0, v2, v1}, Lc20/e;->c(Ls40/a;Ljava/lang/Object;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_6d

    goto :goto_4a

    :cond_6d
    :goto_49
    sget-object v4, Ll83/a0;->a:Ll83/a0;

    :goto_4a
    return-object v4

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
