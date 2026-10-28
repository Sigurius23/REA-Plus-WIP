.class public final Lay/u;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 1
    iput p5, p0, Lay/u;->w:I

    iput-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    iput-object p2, p0, Lay/u;->y:Ljava/lang/Object;

    iput-object p3, p0, Lay/u;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p4, p0, Lay/u;->w:I

    iput-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    iput-object p2, p0, Lay/u;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8

    iget v0, p0, Lay/u;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lyz/b;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ldz/i;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/util/Map;

    const/16 v6, 0x1a

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v1

    :pswitch_0
    move-object v6, p2

    new-instance p2, Lay/u;

    iget-object v0, p0, Lay/u;->y:Ljava/lang/Object;

    check-cast v0, Lw23/p;

    iget-object v1, p0, Lay/u;->z:Ljava/lang/Object;

    check-cast v1, Lec3/f2;

    const/16 v2, 0x19

    invoke-direct {p2, v0, v1, v6, v2}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lay/u;->x:Ljava/lang/Object;

    return-object p2

    :pswitch_1
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Landroid/graphics/drawable/Drawable;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lc93/a;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lc93/a;

    const/16 v7, 0x18

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_2
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lqi/i;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Landroid/content/Context;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    const/16 v7, 0x17

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_3
    move-object v6, p2

    new-instance p2, Lay/u;

    iget-object v0, p0, Lay/u;->y:Ljava/lang/Object;

    check-cast v0, Lu2/v;

    iget-object v1, p0, Lay/u;->z:Ljava/lang/Object;

    check-cast v1, Lu0/d1;

    const/16 v2, 0x16

    invoke-direct {p2, v0, v1, v6, v2}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lay/u;->x:Ljava/lang/Object;

    return-object p2

    :pswitch_4
    move-object v6, p2

    new-instance p2, Lay/u;

    iget-object v0, p0, Lay/u;->y:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    iget-object v1, p0, Lay/u;->z:Ljava/lang/Object;

    check-cast v1, Lrv/m;

    const/16 v2, 0x15

    invoke-direct {p2, v0, v1, v6, v2}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lay/u;->x:Ljava/lang/Object;

    return-object p2

    :pswitch_5
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lp1/c1;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lp1/c1;

    const/16 v7, 0x14

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_6
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ljz/f;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lkz/j;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lq00/p0;

    const/16 v7, 0x13

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_7
    move-object v6, p2

    new-instance p2, Lay/u;

    iget-object v0, p0, Lay/u;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lay/u;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x12

    invoke-direct {p2, v0, v1, v6, v2}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lay/u;->x:Ljava/lang/Object;

    return-object p2

    :pswitch_8
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lp00/q;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Landroid/content/Context;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lc93/a;

    const/16 v7, 0x11

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_9
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lp00/q;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lg2/i;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lb3/x2;

    const/16 v7, 0x10

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_a
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lcm/b;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lh40/e;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lp1/t2;

    const/16 v7, 0xf

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_b
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lnk/m;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lorg/json/JSONArray;

    const/16 v7, 0xe

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_c
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Leb/u0;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lp1/c1;

    const/16 v7, 0xd

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_d
    move-object v6, p2

    new-instance p2, Lay/u;

    iget-object v0, p0, Lay/u;->y:Ljava/lang/Object;

    check-cast v0, Ln30/c;

    iget-object v1, p0, Lay/u;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    const/16 v2, 0xc

    invoke-direct {p2, v0, v1, v6, v2}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lay/u;->x:Ljava/lang/Object;

    return-object p2

    :pswitch_e
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ln20/p;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, La30/f1;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lh20/x1;

    const/16 v7, 0xb

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_f
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ln20/p;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/lang/Throwable;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljo2/d;

    const/16 v7, 0xa

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_10
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lt23/b4;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lt23/c0;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lt23/z2;

    const/16 v7, 0x9

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_11
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lk20/a;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lk20/t;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lv00/c0;

    const/16 v7, 0x8

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_12
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lcom/stripe/android/shoppay/ShopPayActivity;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lbc3/c0;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lh40/k;

    const/4 v7, 0x7

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_13
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lh20/z4;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, La30/a;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    const/4 v7, 0x6

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_14
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lh20/z4;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ly00/o4;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x5

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_15
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lh20/k4;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lq20/y;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lv00/c0;

    const/4 v7, 0x4

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_16
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lg2/i;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lp1/c1;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lp1/c1;

    const/4 v7, 0x3

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_17
    move-object v6, p2

    new-instance p2, Lay/u;

    iget-object v0, p0, Lay/u;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lay/u;->z:Ljava/lang/Object;

    check-cast v1, Ld1/j;

    const/4 v2, 0x2

    invoke-direct {p2, v0, v1, v6, v2}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lay/u;->x:Ljava/lang/Object;

    return-object p2

    :pswitch_18
    move-object v6, p2

    new-instance p2, Lay/u;

    iget-object v0, p0, Lay/u;->y:Ljava/lang/Object;

    check-cast v0, Ln0/g;

    iget-object v1, p0, Lay/u;->z:Ljava/lang/Object;

    check-cast v1, Lbm/t;

    const/4 v2, 0x1

    invoke-direct {p2, v0, v1, v6, v2}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lay/u;->x:Ljava/lang/Object;

    return-object p2

    :pswitch_19
    move-object v6, p2

    new-instance v2, Lay/u;

    iget-object p1, p0, Lay/u;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lay/v;

    iget-object p1, p0, Lay/u;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ls40/a;

    iget-object p1, p0, Lay/u;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ly00/c8;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
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

    iget v0, p0, Lay/u;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_3
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_5
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_6
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_7
    check-cast p1, Lf6/f;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_9
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_d
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_e
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_f
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_10
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_11
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_12
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    throw p1

    :pswitch_13
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_14
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_15
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_17
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lh0/k2;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_19
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lay/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lay/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lay/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
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
    .locals 26

    move-object/from16 v1, p0

    iget v0, v1, Lay/u;->w:I

    sget-object v2, Lm83/z;->w:Lm83/z;

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    iget-object v9, v1, Lay/u;->y:Ljava/lang/Object;

    iget-object v10, v1, Lay/u;->z:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lyz/b;

    iget-object v3, v0, Lyz/b;->a:Lyy/j;

    iget-object v0, v0, Lyz/b;->b:Lb10/b;

    check-cast v9, Ldz/i;

    check-cast v10, Ljava/util/Map;

    if-nez v10, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v10

    :goto_0
    invoke-virtual {v0, v9, v2}, Lb10/b;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object v0

    invoke-virtual {v3, v0}, Lyy/j;->a(Lyy/b;)V

    return-object v8

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    move-object v14, v9

    check-cast v14, Lw23/p;

    iget-object v2, v14, Lw23/p;->g:Lw23/r;

    iget-object v4, v14, Lw23/p;->g:Lw23/r;

    iget-object v2, v2, Lw23/r;->b:Lec3/r1;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw23/q;

    iget-object v2, v2, Lw23/q;->b:Lbc3/k1;

    if-eqz v2, :cond_1

    invoke-interface {v2, v7}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    move-object v12, v10

    check-cast v12, Lec3/f2;

    sget-object v17, Lb33/i;->x:Lb33/i;

    sget-object v13, Lw23/a;->y:Lw23/a;

    new-instance v15, Lw23/o;

    invoke-direct {v15, v14, v5}, Lw23/o;-><init>(Lw23/p;I)V

    new-instance v16, Lv20/g;

    iget-object v2, v14, Lw23/p;->g:Lw23/r;

    const/16 v24, 0x0

    const/16 v25, 0x3

    const/16 v19, 0x1

    const-class v21, Lw23/r;

    const-string v22, "updatePublisherStage"

    const-string v23, "updatePublisherStage(Lio/getstream/video/android/core/analytics/call/observer/model/Stage;)V"

    move-object/from16 v20, v2

    move-object/from16 v18, v16

    invoke-direct/range {v18 .. v25}, Lv20/g;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v11, Lw23/n;

    const/16 v18, 0x0

    invoke-direct/range {v11 .. v18}, Lw23/n;-><init>(Lec3/f2;Lkotlin/jvm/functions/Function1;Lw23/p;Lc93/a;Lkotlin/jvm/functions/Function1;Lb33/i;Lq83/d;)V

    invoke-static {v0, v7, v7, v11, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v17

    iget-object v2, v4, Lw23/r;->a:Lec3/h2;

    :cond_2
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v15, v5

    check-cast v15, Lw23/q;

    const/16 v20, 0x0

    const/16 v21, 0x1d

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v15 .. v21}, Lw23/q;->a(Lw23/q;Lbc3/k1;Lbc3/c2;Lbc3/c2;Lx23/f;Lx23/f;I)Lw23/q;

    move-result-object v9

    invoke-virtual {v2, v5, v9}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v2, v4, Lw23/r;->b:Lec3/r1;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw23/q;

    iget-object v2, v2, Lw23/q;->c:Lbc3/k1;

    if-eqz v2, :cond_3

    invoke-interface {v2, v7}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_3
    move-object v12, v10

    check-cast v12, Lec3/f2;

    sget-object v17, Lb33/i;->y:Lb33/i;

    sget-object v13, Lw23/a;->z:Lw23/a;

    new-instance v15, Lw23/o;

    invoke-direct {v15, v14, v6}, Lw23/o;-><init>(Lw23/p;I)V

    new-instance v16, Lv20/g;

    iget-object v2, v14, Lw23/p;->g:Lw23/r;

    const/16 v24, 0x0

    const/16 v25, 0x4

    const/16 v19, 0x1

    const-class v21, Lw23/r;

    const-string v22, "updateSubscriberStage"

    const-string v23, "updateSubscriberStage(Lio/getstream/video/android/core/analytics/call/observer/model/Stage;)V"

    move-object/from16 v20, v2

    move-object/from16 v18, v16

    invoke-direct/range {v18 .. v25}, Lv20/g;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v11, Lw23/n;

    const/16 v18, 0x0

    invoke-direct/range {v11 .. v18}, Lw23/n;-><init>(Lec3/f2;Lkotlin/jvm/functions/Function1;Lw23/p;Lc93/a;Lkotlin/jvm/functions/Function1;Lb33/i;Lq83/d;)V

    invoke-static {v0, v7, v7, v11, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v15

    iget-object v5, v4, Lw23/r;->a:Lec3/h2;

    :cond_4
    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lw23/q;

    const/16 v17, 0x0

    const/16 v18, 0x1b

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v12 .. v18}, Lw23/q;->a(Lw23/q;Lbc3/k1;Lbc3/c2;Lbc3/c2;Lx23/f;Lx23/f;I)Lw23/q;

    move-result-object v2

    invoke-virtual {v5, v0, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    return-object v8

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/Drawable;

    check-cast v0, Landroid/graphics/drawable/AnimatedImageDrawable;

    check-cast v9, Lc93/a;

    check-cast v10, Lc93/a;

    new-instance v2, Lwh/c;

    invoke-direct {v2, v9, v10}, Lwh/c;-><init>(Lc93/a;Lc93/a;)V

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/AnimatedImageDrawable;->registerAnimationCallback(Landroid/graphics/drawable/Animatable2$AnimationCallback;)V

    return-object v8

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lqi/i;

    invoke-virtual {v0}, Lqi/i;->c()Ljava/util/Map;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lqi/y;

    const-string v0, "asset"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v3, Lqi/y;->d:Ljava/lang/String;

    iget-object v0, v3, Lqi/y;->f:Landroid/graphics/Bitmap;

    const/16 v11, 0xa0

    if-eqz v0, :cond_6

    goto :goto_2

    :cond_6
    const-string v0, "data:"

    invoke-static {v4, v0, v5}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "base64,"

    const/4 v12, 0x6

    invoke-static {v4, v0, v5, v5, v12}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v0

    if-lez v0, :cond_7

    const/16 v0, 0x2c

    :try_start_0
    invoke-static {v4, v0, v5, v5, v12}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v0

    add-int/2addr v0, v6

    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v12, "this as java.lang.String).substring(startIndex)"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    new-instance v12, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v12}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-boolean v6, v12, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    iput v11, v12, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    array-length v13, v0

    invoke-static {v0, v5, v13, v12}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, v3, Lqi/y;->f:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v12, "data URL did not have correct base64 format."

    invoke-static {v12, v0}, Ldj/c;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    :goto_2
    move-object v0, v9

    check-cast v0, Landroid/content/Context;

    move-object v12, v10

    check-cast v12, Ljava/lang/String;

    iget-object v13, v3, Lqi/y;->f:Landroid/graphics/Bitmap;

    if-nez v13, :cond_5

    if-nez v12, :cond_8

    goto :goto_1

    :cond_8
    :try_start_1
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    const-string v4, "try {\n        context.as\u2026, e)\n        return\n    }"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_2
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-boolean v6, v4, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    iput v11, v4, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    invoke-static {v0, v7, v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    iget v4, v3, Lqi/y;->a:I

    iget v11, v3, Lqi/y;->b:I

    invoke-static {v0, v4, v11}, Ldj/i;->d(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, v3, Lqi/y;->f:Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_1

    :catch_1
    move-exception v0

    const-string v3, "Unable to decode image."

    invoke-static {v3, v0}, Ldj/c;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_1

    :catch_2
    move-exception v0

    const-string v3, "Unable to open asset."

    invoke-static {v3, v0}, Ldj/c;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_1

    :cond_9
    return-object v8

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v2, Lbc3/d0;->z:Lbc3/d0;

    new-instance v3, Lu0/c0;

    check-cast v9, Lu2/v;

    check-cast v10, Lu0/d1;

    invoke-direct {v3, v9, v10, v7, v6}, Lu0/c0;-><init>(Lu2/v;Lu0/d1;Lq83/d;I)V

    invoke-static {v0, v7, v2, v3, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v3, Lu0/c0;

    invoke-direct {v3, v9, v10, v7, v4}, Lu0/c0;-><init>(Lu2/v;Lu0/d1;Lq83/d;I)V

    invoke-static {v0, v7, v2, v3, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    return-object v0

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    check-cast v9, Lm63/d;

    iget-object v2, v9, Lm63/d;->G:Ljava/lang/Object;

    check-cast v2, Lec3/l;

    new-instance v4, Lrv/c;

    check-cast v10, Lrv/m;

    invoke-direct {v4, v2, v10, v9, v7}, Lrv/c;-><init>(Lec3/l;Lrv/m;Lm63/d;Lq83/d;)V

    invoke-static {v0, v7, v7, v4, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v4, Lrv/c;

    invoke-direct {v4, v9, v2, v10, v7}, Lrv/c;-><init>(Lm63/d;Lec3/l;Lrv/m;Lq83/d;)V

    invoke-static {v0, v7, v7, v4, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v4, Ln20/j;

    const/16 v5, 0x1a

    invoke-direct {v4, v2, v10, v7, v5}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v7, v7, v4, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v8

    :pswitch_5
    check-cast v10, Lp1/c1;

    check-cast v9, Lp1/c1;

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/net/URLConnection;->setDoInput(Z)V

    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-interface {v9, v3}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    invoke-interface {v9}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    if-nez v0, :cond_a

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v10, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception v0

    sget-object v3, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v4, "Tooltip View: Error loading image from source "

    invoke-static {v4, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v10, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_a
    :goto_3
    return-object v8

    :pswitch_6
    check-cast v10, Lq00/p0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Ljz/f;

    if-eqz v0, :cond_c

    check-cast v9, Lkz/j;

    if-eqz v9, :cond_b

    invoke-virtual {v9, v0, v7}, Lkz/j;->c(Ljz/f;Ljz/e;)V

    invoke-virtual {v10, v6}, Lq00/p0;->p(Z)V

    goto :goto_4

    :cond_b
    invoke-virtual {v10, v5}, Lq00/p0;->p(Z)V

    :cond_c
    :goto_4
    return-object v8

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lf6/f;

    invoke-virtual {v0}, Lf6/f;->c()Lf6/a;

    move-result-object v2

    check-cast v9, Ljava/lang/String;

    check-cast v10, Ljava/lang/String;

    sget-object v3, Lp6/n0;->g:Lf6/d;

    invoke-virtual {v0, v3}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_d

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    :cond_d
    invoke-static {v9, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    sget-object v0, Lp6/n0;->d:Lp6/j0;

    invoke-static {v0, v9}, Lp6/j0;->a(Lp6/j0;Ljava/lang/String;)Lf6/d;

    move-result-object v0

    invoke-virtual {v2, v0, v10}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lf6/f;->d()Lf6/a;

    move-result-object v0

    return-object v0

    :pswitch_8
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lp00/q;

    iget-boolean v0, v0, Lp00/q;->E:Z

    if-eqz v0, :cond_e

    check-cast v9, Landroid/content/Context;

    const v0, 0x7f141104

    invoke-static {v9, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    check-cast v10, Lc93/a;

    invoke-interface {v10}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_e
    return-object v8

    :pswitch_9
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lp00/q;

    iget-boolean v0, v0, Lp00/q;->w:Z

    if-eqz v0, :cond_f

    check-cast v9, Lg2/i;

    check-cast v9, Lg2/l;

    invoke-virtual {v9, v6}, Lg2/l;->b(Z)V

    check-cast v10, Lb3/x2;

    if-eqz v10, :cond_f

    check-cast v10, Lb3/x1;

    invoke-virtual {v10}, Lb3/x1;->a()V

    :cond_f
    return-object v8

    :pswitch_a
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lcm/b;

    check-cast v9, Lh40/e;

    iget-wide v2, v9, Lh40/e;->c:J

    check-cast v10, Lp1/t2;

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    sget-object v4, Lcm/d;->b:Lcm/c;

    check-cast v0, Lcm/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "transformColorForLightContent"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Lcm/a;->c:Lh5/v1;

    if-nez v4, :cond_10

    goto :goto_5

    :cond_10
    invoke-virtual {v4, v5}, Lh5/v1;->b(Z)V

    :goto_5
    iget-object v0, v0, Lcm/a;->b:Landroid/view/Window;

    if-nez v0, :cond_11

    goto :goto_6

    :cond_11
    invoke-static {v2, v3}, Li2/w0;->H(J)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/Window;->setStatusBarColor(I)V

    :goto_6
    return-object v8

    :pswitch_b
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lnk/m;

    iget-object v0, v0, Lnk/m;->a:Ldk/f;

    check-cast v9, Ljava/lang/String;

    check-cast v10, Lorg/json/JSONArray;

    const-string v2, "filePath"

    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Ldk/f;->c:Lnk/i;

    iget-object v2, v0, Lnk/i;->a:Ljava/io/File;

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_12

    goto :goto_8

    :cond_12
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v7, Ljava/io/File;

    const-string v11, "-1.tmp"

    invoke-static {v3, v11}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v7, v2, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v11, Ljava/io/File;

    const-string v12, "-2.tmp"

    invoke-static {v3, v12}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v11, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v2

    div-int/2addr v2, v4

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v12

    invoke-static {v5, v12}, Le93/b;->i0(II)Li93/j;

    move-result-object v5

    invoke-virtual {v5}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_7
    move-object v12, v5

    check-cast v12, Li93/i;

    iget-boolean v12, v12, Li93/i;->y:Z

    if-eqz v12, :cond_14

    move-object v12, v5

    check-cast v12, Lm83/e0;

    invoke-virtual {v12}, Lm83/e0;->nextInt()I

    move-result v12

    const-string v13, "this.getJSONObject(index)"

    if-ge v12, v2, :cond_13

    invoke-virtual {v10, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_13
    invoke-virtual {v10, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_14
    invoke-virtual {v0, v3, v7, v6}, Lnk/i;->j(Ljava/util/List;Ljava/io/File;Z)V

    invoke-virtual {v0, v4, v11, v6}, Lnk/i;->j(Ljava/util/List;Ljava/io/File;Z)V

    invoke-virtual {v0, v9}, Lnk/i;->f(Ljava/lang/String;)Z

    :goto_8
    return-object v8

    :pswitch_c
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Ln40/b;

    iget-object v2, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v2, Leb/u0;

    invoke-virtual {v2}, Leb/a0;->m()Leb/q;

    move-result-object v2

    check-cast v10, Lp1/c1;

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/q;

    invoke-direct {v0, v2, v3}, Ln40/b;-><init>(Leb/q;Leb/q;)V

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-interface {v9, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v8

    :pswitch_d
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    check-cast v9, Ln30/c;

    check-cast v10, Ljava/lang/Throwable;

    :try_start_4
    invoke-virtual {v9, v10}, Ln30/c;->b(Ljava/lang/Throwable;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v9, v0}, Ln30/c;->a(Ln30/c;Lorg/json/JSONObject;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v0, v8

    goto :goto_9

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_9
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_15

    iget-object v2, v9, Ln30/c;->z:Lx30/s0;

    const-string v3, "Failed to send error report."

    invoke-virtual {v2, v3, v0}, Lx30/s0;->o(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_15
    return-object v8

    :pswitch_e
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Ln20/p;

    iget-object v0, v0, Ln20/p;->c:Ln20/u;

    new-instance v2, Ln20/h;

    check-cast v9, La30/f1;

    check-cast v10, Lh20/x1;

    invoke-direct {v2, v9, v10, v5}, Ln20/h;-><init>(La30/f1;Lh20/x1;Z)V

    iget-object v0, v0, Ln20/u;->x:Landroidx/lifecycle/k1;

    const-string v3, "state"

    invoke-virtual {v0, v2, v3}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v8

    :pswitch_f
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Ln20/p;

    check-cast v9, Ljava/lang/Throwable;

    if-eqz v9, :cond_16

    move v2, v6

    goto :goto_a

    :cond_16
    move v2, v5

    :goto_a
    iput-boolean v2, v0, Ln20/p;->g:Z

    iget-object v0, v0, Ln20/p;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    check-cast v10, Ljo2/d;

    if-nez v9, :cond_17

    move v5, v6

    :cond_17
    iget-object v0, v10, Ljo2/d;->a:Ljo2/e;

    iget-wide v2, v10, Ljo2/d;->b:J

    invoke-static {v0, v2, v3, v5, v9}, Ljo2/e;->a(Ljo2/e;JZLjava/lang/Throwable;)V

    return-object v8

    :pswitch_10
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lt23/b4;

    iget-object v0, v0, Lt23/b4;->U:Lt23/g1;

    check-cast v9, Lt23/c0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lt23/g1;->e:Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v7, v9}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v8

    :pswitch_11
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lk20/a;

    iget-object v3, v0, Lk20/a;->b:Lyy/j;

    iget-object v0, v0, Lk20/a;->d:Lb10/b;

    check-cast v9, Lk20/t;

    check-cast v10, Lv00/c0;

    if-eqz v10, :cond_19

    iget-object v4, v10, Lv00/c0;->i0:Lv00/n;

    if-eqz v4, :cond_19

    iget-object v4, v4, Lv00/n;->x:Ljava/util/Map;

    if-nez v4, :cond_18

    goto :goto_b

    :cond_18
    move-object v2, v4

    :cond_19
    :goto_b
    invoke-virtual {v9}, Lk20/t;->getParams()Ljava/util/Map;

    move-result-object v4

    invoke-static {v2, v4}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v0, v9, v2}, Lb10/b;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object v0

    invoke-virtual {v3, v0}, Lyy/j;->a(Lyy/b;)V

    return-object v8

    :pswitch_12
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/shoppay/ShopPayActivity;

    sget v2, Lcom/stripe/android/shoppay/ShopPayActivity;->E:I

    iget-object v0, v0, Lcom/stripe/android/shoppay/ShopPayActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {v0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lr;->t(Ljava/lang/Object;)V

    throw v7

    :pswitch_13
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lh20/z4;

    iget-object v2, v0, Lh20/z4;->i:Lh20/f;

    check-cast v9, La30/a;

    iget-object v3, v9, La30/a;->w:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    check-cast v10, Ljava/lang/String;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1a
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    check-cast v11, Ly00/o4;

    iget-object v11, v11, Ly00/o4;->w:Ljava/lang/String;

    invoke-static {v11, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1a

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_1b
    invoke-static {v9, v5, v7, v4}, La30/a;->b(La30/a;Ljava/util/List;Ljava/lang/String;I)La30/a;

    move-result-object v3

    invoke-virtual {v2, v3}, Lh20/f;->a(La30/a;)V

    iget-object v2, v0, Lh20/z4;->g:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lq20/w;

    if-eqz v3, :cond_1c

    check-cast v2, Lq20/w;

    goto :goto_d

    :cond_1c
    move-object v2, v7

    :goto_d
    if-eqz v2, :cond_1d

    iget-object v2, v2, Lq20/w;->x:Ly00/o4;

    if-eqz v2, :cond_1d

    iget-object v2, v2, Ly00/o4;->w:Ljava/lang/String;

    goto :goto_e

    :cond_1d
    move-object v2, v7

    :goto_e
    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1e

    iget-object v2, v0, Lh20/z4;->h:Lkotlin/jvm/internal/i;

    invoke-interface {v2, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1e
    iget-object v0, v0, Lh20/z4;->k:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-object v8

    :pswitch_14
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lh20/z4;

    iget-object v2, v0, Lh20/z4;->i:Lh20/f;

    check-cast v9, Ly00/o4;

    iget-object v3, v2, Lh20/f;->a:Landroidx/lifecycle/k1;

    const-string v5, "saved_selection"

    invoke-virtual {v3, v9, v5}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v2, Lh20/f;->b:Lec3/r1;

    iget-object v3, v3, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La30/a;

    if-eqz v3, :cond_21

    iget-object v5, v3, La30/a;->w:Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v5, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v6, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_20

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ly00/o4;

    iget-object v12, v11, Ly00/o4;->w:Ljava/lang/String;

    iget-object v13, v9, Ly00/o4;->w:Ljava/lang/String;

    invoke-static {v13, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1f

    move-object v11, v9

    :cond_1f
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_20
    invoke-static {v3, v6, v7, v4}, La30/a;->b(La30/a;Ljava/util/List;Ljava/lang/String;I)La30/a;

    move-result-object v3

    goto :goto_10

    :cond_21
    move-object v3, v7

    :goto_10
    invoke-virtual {v2, v3}, Lh20/f;->a(La30/a;)V

    iget-object v2, v0, Lh20/z4;->g:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lq20/w;

    if-eqz v3, :cond_22

    check-cast v2, Lq20/w;

    goto :goto_11

    :cond_22
    move-object v2, v7

    :goto_11
    if-eqz v2, :cond_23

    iget-object v2, v2, Lq20/w;->x:Ly00/o4;

    if-eqz v2, :cond_23

    iget-object v2, v2, Ly00/o4;->w:Ljava/lang/String;

    goto :goto_12

    :cond_23
    move-object v2, v7

    :goto_12
    iget-object v3, v9, Ly00/o4;->w:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_24

    iget-object v0, v0, Lh20/z4;->h:Lkotlin/jvm/internal/i;

    new-instance v2, Lq20/w;

    invoke-direct {v2, v9, v7, v7}, Lq20/w;-><init>(Ly00/o4;Lq20/u;Ly00/u5;)V

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_24
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-interface {v10, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v8

    :pswitch_15
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lh20/k4;

    check-cast v9, Lq20/y;

    iget-object v2, v0, Le30/c;->z:Landroidx/lifecycle/k1;

    const-string v4, "IN_PROGRESS_PAYMENT_SELECTION"

    invoke-virtual {v2, v9, v4}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v9, Lq20/w;

    if-nez v2, :cond_25

    goto :goto_14

    :cond_25
    move-object v2, v9

    check-cast v2, Lq20/w;

    iget-object v4, v2, Lq20/w;->z:Ly00/u5;

    iget-object v5, v0, Le30/c;->L:Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lv00/c0;

    if-eqz v5, :cond_28

    iget-object v6, v0, Lh20/k4;->g0:Ll20/a;

    iget-object v5, v5, Lv00/c0;->w:Ly00/c8;

    iget-object v8, v2, Lq20/w;->x:Ly00/o4;

    invoke-virtual {v6, v5, v8}, Ll20/a;->c(Ly00/c8;Ly00/o4;)Z

    move-result v5

    if-eqz v5, :cond_28

    invoke-virtual {v0}, Le30/c;->o()Lh20/x2;

    move-result-object v5

    sget-object v6, Lh20/x2;->w:Lh20/x2;

    if-ne v5, v6, :cond_28

    instance-of v5, v4, Ly00/l5;

    if-eqz v5, :cond_26

    check-cast v4, Ly00/l5;

    goto :goto_13

    :cond_26
    move-object v4, v7

    :goto_13
    if-nez v4, :cond_27

    new-instance v4, Ly00/l5;

    const/4 v5, 0x7

    invoke-direct {v4, v5, v7, v7}, Ly00/l5;-><init>(ILjava/lang/String;Ly00/o;)V

    :cond_27
    iget-object v5, v0, Le30/c;->V:Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lx30/e0;

    iget-object v5, v5, Lx30/e0;->h:Lec3/r1;

    iget-object v5, v5, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v5}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/16 v6, 0xe

    invoke-static {v4, v5, v7, v6}, Ly00/l5;->f(Ly00/l5;Ljava/lang/String;Ly00/o;I)Ly00/l5;

    move-result-object v4

    invoke-static {v2, v7, v4, v3}, Lq20/w;->h(Lq20/w;Ly00/o4;Ly00/l5;I)Lq20/w;

    move-result-object v9

    invoke-virtual {v0, v9}, Le30/c;->z(Lq20/y;)V

    :cond_28
    :goto_14
    if-eqz v9, :cond_29

    iget-object v2, v0, Le30/c;->w:Lh20/x1;

    invoke-static {v2}, Lio/sentry/config/a;->m(Lh20/x1;)Lmy/a;

    move-result-object v2

    iget-object v0, v0, Le30/c;->E:Lh20/x;

    iget-object v0, v0, Lh20/x;->e:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwz/g0;

    check-cast v10, Lv00/c0;

    iget-object v3, v10, Lv00/c0;->Y:Lux/b;

    invoke-static {v9, v2, v0, v3}, Lds/q;->K(Lq20/y;Lmy/a;Lwz/g0;Lux/b;)Le10/l;

    move-result-object v7

    :cond_29
    return-object v7

    :pswitch_16
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v9, Lp1/c1;

    invoke-interface {v9}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2a

    check-cast v10, Lp1/c1;

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2a

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lg2/i;

    invoke-static {v0, v6}, Luf/c0;->c0(Lg2/i;I)V

    :cond_2a
    return-object v8

    :pswitch_17
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    check-cast v9, Ljava/lang/String;

    check-cast v10, Ld1/j;

    :try_start_5
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, v9}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type java.net.HttpURLConnection"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/net/HttpURLConnection;

    const/16 v2, 0x2710

    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual {v0, v5}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    instance-of v2, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v2, :cond_2b

    iget-object v2, v10, Ld1/j;->x:Ljava/lang/Object;

    check-cast v2, Lbs1/n;

    invoke-virtual {v2, v0}, Lbs1/n;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_15

    :catchall_1
    move-exception v0

    goto :goto_16

    :cond_2b
    :goto_15
    const-string v2, "Location"

    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2c

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-nez v2, :cond_2d

    :cond_2c
    move-object v0, v9

    goto :goto_17

    :goto_16
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :cond_2d
    :goto_17
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_2e

    move-object v9, v0

    :cond_2e
    return-object v9

    :pswitch_18
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lh0/k2;

    check-cast v9, Ln0/g;

    check-cast v9, Ln0/o;

    iget v2, v9, Ln0/o;->p:I

    check-cast v10, Lbm/t;

    invoke-virtual {v10}, Lbm/t;->i()I

    move-result v3

    add-int/2addr v3, v2

    int-to-float v2, v3

    const/4 v3, 0x0

    mul-float/2addr v2, v3

    invoke-interface {v0, v2}, Lh0/k2;->a(F)F

    return-object v8

    :pswitch_19
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lay/u;->x:Ljava/lang/Object;

    check-cast v0, Lay/v;

    iget-object v2, v0, Lay/v;->e:La1/b;

    check-cast v9, Ls40/a;

    invoke-virtual {v2, v9}, La1/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lay/z;

    iget-object v3, v0, Lay/v;->a:Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v0, v0, Lay/v;->b:Ljava/util/Set;

    new-instance v4, Lay/p;

    check-cast v10, Ly00/c8;

    invoke-direct {v4, v3, v0, v10}, Lay/p;-><init>(Ljava/lang/String;Ljava/util/Set;Ly00/c8;)V

    invoke-interface {v2, v4}, Lay/z;->a(Lay/p;)V

    return-object v8

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
