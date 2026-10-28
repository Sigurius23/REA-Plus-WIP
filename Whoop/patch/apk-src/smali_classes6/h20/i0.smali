.class public final Lh20/i0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Ljava/lang/Object;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lh40/k;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 1
    iput p4, p0, Lh20/i0;->w:I

    iput-object p1, p0, Lh20/i0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lh20/i0;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p4, p0, Lh20/i0;->w:I

    iput-object p1, p0, Lh20/i0;->z:Ljava/lang/Object;

    iput-object p2, p0, Lh20/i0;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 3
    iput p3, p0, Lh20/i0;->w:I

    iput-object p1, p0, Lh20/i0;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method private final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh20/i0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast p1, Lm40/w;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    new-instance v3, La33/c;

    const/4 v4, 0x0

    const/16 v5, 0x9

    invoke-direct {v3, p1, v1, v4, v5}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v2, p0, Lh20/i0;->x:I

    invoke-static {p1, v1, v3, p0}, Lm40/w;->e(Lm40/w;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh20/i0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, p0, Lh20/i0;->x:I

    const-wide/16 v1, 0x3e8

    invoke-static {v1, v2, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object p1

    sget-object v0, Lmc/i;->a:Ljava/lang/String;

    const-string v1, "NetworkRequestConstraintController didn\'t receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms"

    invoke-virtual {p1, v0, v1}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast p1, Ldc3/u;

    new-instance v0, Lmc/b;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lmc/b;-><init>(I)V

    check-cast p1, Ldc3/t;

    invoke-virtual {p1, v0}, Ldc3/t;->s(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh20/i0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast p1, Lu2/v;

    new-instance v1, Lc4/e;

    iget-object v3, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/ui/platform/ComposeView;

    const/4 v4, 0x5

    invoke-direct {v1, v3, v4}, Lc4/e;-><init>(Ljava/lang/Object;I)V

    iput v2, p0, Lh20/i0;->x:I

    invoke-static {p1, v1, p0}, Lh0/z0;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh20/i0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, p0, Lh20/i0;->x:I

    const-wide/16 v1, 0x28a

    invoke-static {v1, v2, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast p1, Lg2/s;

    invoke-virtual {p1}, Lg2/s;->b()V

    iget-object p1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast p1, Lp1/c1;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lh20/i0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lh20/i0;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Ln00/k;

    const/16 v2, 0x1d

    invoke-direct {v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lh20/i0;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lg2/s;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    const/16 v2, 0x1c

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance v0, Lh20/i0;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/platform/ComposeView;

    const/16 v2, 0x1b

    invoke-direct {v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lh20/i0;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_2
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lmc/d;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Ldc3/u;

    const/16 v2, 0x1a

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lm40/w;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x19

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_4
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lg2/v;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Ll1/x4;

    const/16 v2, 0x18

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_5
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Llz/i;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x17

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_6
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Llz/i;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    const/16 v2, 0x16

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_7
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    const/16 v2, 0x15

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_8
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Llb/a0;

    const/16 v2, 0x14

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_9
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lt23/c0;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Lgm/r;

    const/16 v2, 0x13

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_a
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lt23/c0;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Lj43/a;

    const/16 v2, 0x12

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_b
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lec3/l;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Lk20/d;

    const/16 v2, 0x11

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_c
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lk20/a;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Lk20/n;

    const/16 v2, 0x10

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_d
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lc33/c;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Ld0/l;

    const/16 v2, 0xf

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_e
    new-instance v0, Lh20/i0;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    const/16 v2, 0xe

    invoke-direct {v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lh20/i0;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_f
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lj0/i;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    const/16 v2, 0xd

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_10
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lt23/j3;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Li43/b;

    const/16 v2, 0xc

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_11
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Li20/j1;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0xb

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_12
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Li20/v0;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Lz30/b;

    const/16 v2, 0xa

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_13
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Li20/v0;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x9

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_14
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Li20/v0;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Li20/k1;

    const/16 v2, 0x8

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_15
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v0, Lh40/k;

    iget-object v1, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    const/4 v2, 0x7

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Lh40/k;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_16
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v0, Lh40/k;

    iget-object v1, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/shoppay/ShopPayActivity;

    const/4 v2, 0x6

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Lh40/k;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_17
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lh3/c;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    const/4 v2, 0x5

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_18
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lh20/z4;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x4

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_19
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Le30/c;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Lh20/z4;

    const/4 v2, 0x3

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1a
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lw20/b0;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Lh20/k4;

    const/4 v2, 0x2

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1b
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Lh40/k;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1c
    new-instance p1, Lh20/i0;

    iget-object v0, p0, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;

    iget-object v1, p0, Lh20/i0;->y:Ljava/lang/Object;

    check-cast v1, Lh40/k;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, p2, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

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

    iget v0, p0, Lh20/i0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lu2/v;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_1a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh20/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 34

    move-object/from16 v4, p0

    iget v0, v4, Lh20/i0;->w:I

    const/4 v1, 0x3

    const/4 v2, 0x6

    const/16 v3, 0xe

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x2

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    const-string v10, "call to \'resume\' before \'invoke\' with coroutine"

    iget-object v11, v4, Lh20/i0;->y:Ljava/lang/Object;

    const/4 v12, 0x1

    packed-switch v0, :pswitch_data_0

    check-cast v11, Ln00/k;

    iget-object v0, v11, Ln00/k;->w:Lwz/g0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v4, Lh20/i0;->x:I

    if-eqz v2, :cond_2

    if-eq v2, v12, :cond_1

    if-ne v2, v8, :cond_0

    iget-object v1, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v2, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    sget v3, Ln00/k;->R:I

    invoke-virtual {v11, v7, v7}, Ln00/k;->o(Ljava/lang/Throwable;Lzy/c;)V

    sget-wide v5, Ln00/k;->Q:J

    iput-object v2, v4, Lh20/i0;->z:Ljava/lang/Object;

    iput v12, v4, Lh20/i0;->x:I

    invoke-static {v5, v6, v4}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    if-eqz v2, :cond_7

    iget-object v3, v0, Lwz/g0;->F:Lwz/f0;

    iget-object v3, v3, Lwz/f0;->x:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-boolean v3, v11, Ln00/k;->P:Z

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    sget-object v1, Ln00/d;->y:Ln00/d;

    invoke-virtual {v11, v1}, Ln00/k;->q(Ln00/d;)V

    goto :goto_4

    :cond_5
    :goto_1
    iput-object v2, v4, Lh20/i0;->z:Ljava/lang/Object;

    iput v8, v4, Lh20/i0;->x:I

    invoke-static {v11, v2, v4}, Ln00/k;->g(Ln00/k;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_6

    :goto_2
    move-object v9, v1

    goto :goto_5

    :cond_6
    move-object v1, v2

    :goto_3
    move-object v2, v1

    goto :goto_4

    :cond_7
    sget-object v1, Ln00/d;->w:Ln00/d;

    sget v3, Ln00/k;->R:I

    invoke-virtual {v11, v1}, Ln00/k;->q(Ln00/d;)V

    iget-object v1, v11, Ln00/k;->N:Lec3/h2;

    :cond_8
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ln00/c;

    const/16 v18, 0x0

    const/16 v19, 0x7f

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Ln00/c;->a(Ln00/c;ZLn00/d;ZLzy/c;Ljava/lang/String;I)Ln00/c;

    move-result-object v5

    invoke-virtual {v1, v3, v5}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    :goto_4
    iget-object v0, v0, Lwz/g0;->F:Lwz/f0;

    iget-object v0, v0, Lwz/f0;->x:Ljava/lang/String;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    iput-boolean v12, v11, Ln00/k;->P:Z

    :cond_9
    :goto_5
    return-object v9

    :pswitch_0
    invoke-direct/range {p0 .. p1}, Lh20/i0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-direct/range {p0 .. p1}, Lh20/i0;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-direct/range {p0 .. p1}, Lh20/i0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-direct/range {p0 .. p1}, Lh20/i0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lg2/v;

    check-cast v11, Ll1/x4;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v4, Lh20/i0;->x:I

    if-eqz v2, :cond_b

    if-ne v2, v12, :cond_a

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v0

    check-cast v2, Lg2/w;

    invoke-virtual {v2}, Lg2/w;->b()Z

    move-result v2

    if-eqz v2, :cond_c

    sget-object v2, Lf0/z0;->y:Lf0/z0;

    iput v12, v4, Lh20/i0;->x:I

    invoke-virtual {v11, v2, v4}, Ll1/x4;->c(Lf0/z0;Ls83/i;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_c

    move-object v9, v1

    goto :goto_7

    :cond_c
    :goto_6
    invoke-virtual {v11}, Ll1/x4;->b()Z

    move-result v1

    if-eqz v1, :cond_d

    check-cast v0, Lg2/w;

    invoke-virtual {v0}, Lg2/w;->b()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {v11}, Ll1/x4;->a()V

    :cond_d
    :goto_7
    return-object v9

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lh20/i0;->x:I

    if-eqz v1, :cond_f

    if-ne v1, v12, :cond_e

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_8

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v1, Llz/i;

    iget-object v1, v1, Llz/i;->E:Lec3/w1;

    new-instance v2, Llz/f;

    check-cast v11, Ljava/lang/String;

    invoke-direct {v2, v11}, Llz/f;-><init>(Ljava/lang/String;)V

    iput v12, v4, Lh20/i0;->x:I

    invoke-virtual {v1, v2, v4}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_10

    move-object v9, v0

    :cond_10
    :goto_8
    return-object v9

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lh20/i0;->x:I

    if-eqz v1, :cond_12

    if-ne v1, v12, :cond_11

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_9

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v1, Llz/i;

    iget-object v1, v1, Llz/i;->E:Lec3/w1;

    new-instance v2, Llz/d;

    new-instance v3, Lkz/g;

    check-cast v11, Ljava/lang/Throwable;

    invoke-direct {v3, v11}, Lkz/g;-><init>(Ljava/lang/Throwable;)V

    invoke-direct {v2, v3}, Llz/d;-><init>(Lkz/h;)V

    iput v12, v4, Lh20/i0;->x:I

    invoke-virtual {v1, v2, v4}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_13

    move-object v9, v0

    :cond_13
    :goto_9
    return-object v9

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lh20/i0;->x:I

    if-eqz v1, :cond_15

    if-ne v1, v12, :cond_14

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_a

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast v11, Lkotlin/jvm/internal/g0;

    iget-object v2, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput v12, v4, Lh20/i0;->x:I

    invoke-interface {v1, v2, v4}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_16

    goto :goto_a

    :cond_16
    move-object v0, v1

    :goto_a
    return-object v0

    :pswitch_8
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lh20/i0;->x:I

    if-eqz v1, :cond_18

    if-ne v1, v12, :cond_17

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_b

    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast v11, Llb/a0;

    iput v12, v4, Lh20/i0;->x:I

    invoke-interface {v1, v11, v4}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_19

    goto :goto_b

    :cond_19
    move-object v0, v1

    :goto_b
    return-object v0

    :pswitch_9
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lh20/i0;->x:I

    if-eqz v1, :cond_1b

    if-ne v1, v12, :cond_1a

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_c

    :cond_1a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v1, Lt23/c0;

    iget-object v1, v1, Lt23/c0;->p:Lt23/s0;

    iget-object v1, v1, Lt23/s0;->y0:Lec3/h2;

    new-instance v2, Lu;

    check-cast v11, Lgm/r;

    const/16 v3, 0x10

    invoke-direct {v2, v11, v3}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v12, v4, Lh20/i0;->x:I

    new-instance v3, La6/t;

    invoke-direct {v3, v2, v8}, La6/t;-><init>(Lec3/m;I)V

    invoke-virtual {v1, v3, v4}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-object v9, v0

    :goto_c
    return-object v9

    :pswitch_a
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lh20/i0;->x:I

    if-eqz v1, :cond_1d

    if-ne v1, v12, :cond_1c

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_d

    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v1, Lt23/c0;

    iput v12, v4, Lh20/i0;->x:I

    invoke-virtual {v1, v4}, Lt23/c0;->d(Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_1e

    move-object v9, v0

    goto :goto_e

    :cond_1e
    :goto_d
    check-cast v1, Ln23/h;

    instance-of v0, v1, Ln23/f;

    if-eqz v0, :cond_1f

    check-cast v11, Lj43/a;

    invoke-virtual {v1}, Ln23/h;->a()Ln23/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fail to perform initializeCallAndSocket with error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "message"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v11, Lj43/a;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/video/android/core/notifications/internal/service/CallService;

    sget-object v2, Lio/getstream/video/android/core/notifications/internal/service/CallService;->I:Ll83/p;

    invoke-virtual {v1, v0}, Lio/getstream/video/android/core/notifications/internal/service/CallService;->e(Ljava/lang/String;)V

    :cond_1f
    :goto_e
    return-object v9

    :pswitch_b
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lh20/i0;->x:I

    if-eqz v1, :cond_21

    if-ne v1, v12, :cond_20

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_f

    :cond_20
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_21
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v1, Lec3/l;

    new-instance v2, Landroidx/room/e;

    check-cast v11, Lk20/d;

    const/16 v3, 0x13

    invoke-direct {v2, v11, v7, v3}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput v12, v4, Lh20/i0;->x:I

    invoke-static {v1, v2, v4}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_22

    move-object v9, v0

    :cond_22
    :goto_f
    return-object v9

    :pswitch_c
    check-cast v11, Lk20/n;

    iget-object v0, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lk20/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v4, Lh20/i0;->x:I

    if-eqz v2, :cond_24

    if-ne v2, v12, :cond_23

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_16

    :cond_23
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lk20/a;->i:Lk83/a;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv00/c0;

    iget-object v3, v0, Lk20/a;->c:Lyy/n;

    iget-object v5, v0, Lk20/a;->j:Lq/f;

    if-eqz v2, :cond_25

    iget-object v0, v2, Lv00/c0;->i0:Lv00/n;

    if-eqz v0, :cond_25

    iget-object v0, v0, Lv00/n;->x:Ljava/util/Map;

    if-nez v0, :cond_26

    :cond_25
    sget-object v0, Lm83/z;->w:Lm83/z;

    :cond_26
    iget-object v2, v11, Lk20/n;->x:Ljava/util/LinkedHashMap;

    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->Companion:Lcom/stripe/android/core/networking/a;

    iget-object v0, v5, Lq/f;->x:Ljava/lang/Object;

    move-object v15, v0

    check-cast v15, Ljava/lang/String;

    iget-object v0, v5, Lq/f;->z:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v11, Ll83/k;

    const-string v13, "os_version"

    invoke-direct {v11, v13, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, Ll83/k;

    const-string v0, "sdk_platform"

    const-string v14, "android"

    invoke-direct {v13, v0, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, Ll83/k;

    const-string v0, "sdk_version"

    const-string v7, "22.6.1"

    invoke-direct {v14, v0, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v7, Landroid/os/Build;->BRAND:Ljava/lang/String;

    sget-object v12, Landroid/os/Build;->MODEL:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ll83/k;

    const-string v7, "device_type"

    invoke-direct {v6, v7, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v5, Lq/f;->y:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Landroid/content/Context;

    const-string v0, "appContext"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v19, v6

    const/4 v6, 0x0

    :try_start_1
    invoke-virtual {v0, v12, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_11

    :catchall_0
    move-exception v0

    goto :goto_10

    :catchall_1
    move-exception v0

    move-object/from16 v19, v6

    :goto_10
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_11
    instance-of v6, v0, Ll83/m;

    if-eqz v6, :cond_27

    const/4 v0, 0x0

    :cond_27
    check-cast v0, Landroid/content/pm/PackageInfo;

    if-eqz v0, :cond_28

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v0, :cond_28

    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_12

    :cond_28
    const/4 v0, 0x0

    :goto_12
    if-eqz v0, :cond_29

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2a

    :cond_29
    const/4 v0, 0x0

    :cond_2a
    if-nez v0, :cond_2b

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v6, "getPackageName(...)"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2b
    new-instance v6, Ll83/k;

    const-string v12, "app_name"

    invoke-direct {v6, v12, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :try_start_2
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-object/from16 v20, v6

    const/4 v6, 0x0

    :try_start_3
    invoke-virtual {v0, v12, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_14

    :catchall_2
    move-exception v0

    goto :goto_13

    :catchall_3
    move-exception v0

    move-object/from16 v20, v6

    :goto_13
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_14
    instance-of v6, v0, Ll83/m;

    if-eqz v6, :cond_2c

    const/4 v0, 0x0

    :cond_2c
    check-cast v0, Landroid/content/pm/PackageInfo;

    if-eqz v0, :cond_2d

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_15

    :cond_2d
    const/4 v0, 0x0

    :goto_15
    new-instance v6, Ll83/k;

    const-string v12, "app_version"

    invoke-direct {v6, v12, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v12, "android_id"

    invoke-static {v0, v12}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v12, Ll83/k;

    move-object/from16 v21, v6

    const-string v6, "device_id"

    invoke-direct {v12, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v5, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    new-instance v5, Ll83/k;

    const-string v6, "plugin_type"

    invoke-direct {v5, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "package_name"

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    new-instance v6, Ll83/k;

    const-string v7, "platform_info"

    invoke-direct {v6, v7, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v23, v5

    move-object/from16 v24, v6

    move-object/from16 v16, v11

    move-object/from16 v22, v12

    move-object/from16 v17, v13

    move-object/from16 v18, v14

    filled-new-array/range {v16 .. v24}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v2, v0}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "clientId"

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "origin"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v5, Ll83/k;

    const-string v6, "uses_work_manager"

    invoke-direct {v5, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    new-instance v13, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    sget-object v2, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sget-object v2, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v5, v6, v2}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v5

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v5, v6, v2}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v17

    invoke-static {v0}, Lyy/q;->k(Ljava/util/Map;)Lkotlinx/serialization/json/JsonObject;

    move-result-object v19

    const/16 v20, 0x0

    const-string v14, "elements.experiment_exposure"

    move-object/from16 v16, v10

    invoke-direct/range {v13 .. v20}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x1

    iput v2, v4, Lh20/i0;->x:I

    invoke-virtual {v3, v13, v4}, Lyy/n;->a(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_2e

    move-object v9, v1

    :cond_2e
    :goto_16
    return-object v9

    :pswitch_d
    move v2, v12

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, v4, Lh20/i0;->x:I

    if-eqz v0, :cond_30

    if-ne v0, v2, :cond_2f

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_17

    :cond_2f
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_30
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lc33/c;

    iget-object v0, v0, Lc33/c;->d:Ljava/lang/Object;

    check-cast v0, Ld0/e;

    new-instance v1, Ljava/lang/Float;

    invoke-direct {v1, v5}, Ljava/lang/Float;-><init>(F)V

    move-object v2, v11

    check-cast v2, Ld0/l;

    const/4 v3, 0x1

    iput v3, v4, Lh20/i0;->x:I

    const/4 v3, 0x0

    const/16 v5, 0xc

    invoke-static/range {v0 .. v5}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_31

    move-object v9, v6

    :cond_31
    :goto_17
    return-object v9

    :pswitch_e
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lh20/i0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_33

    if-ne v1, v2, :cond_32

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_18

    :cond_32
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    check-cast v11, Lc93/m;

    iput v2, v4, Lh20/i0;->x:I

    invoke-interface {v11, v1, v4}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_34

    goto :goto_18

    :cond_34
    move-object v0, v1

    :goto_18
    return-object v0

    :pswitch_f
    move v2, v12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lh20/i0;->x:I

    if-eqz v1, :cond_36

    if-ne v1, v2, :cond_35

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_19

    :cond_35
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v2, Lj0/i;

    check-cast v2, Lj0/j;

    iget-object v2, v2, Lj0/j;->a:Lec3/w1;

    new-instance v3, Landroidx/room/x;

    check-cast v11, Lp1/c1;

    const/16 v5, 0x8

    invoke-direct {v3, v5, v1, v11}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iput v1, v4, Lh20/i0;->x:I

    invoke-virtual {v2, v3, v4}, Lec3/w1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-object v9, v0

    :goto_19
    return-object v9

    :pswitch_10
    move v1, v12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v4, Lh20/i0;->x:I

    if-eqz v2, :cond_38

    if-ne v2, v1, :cond_37

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1a

    :cond_37
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v1, Lt23/j3;

    check-cast v1, Lt23/b4;

    iget-object v1, v1, Lt23/b4;->U:Lt23/g1;

    iget-object v2, v1, Lt23/g1;->h:Lec3/h2;

    iget-object v1, v1, Lt23/g1;->g:Lec3/h2;

    new-array v5, v8, [Lec3/l;

    const/16 v17, 0x0

    aput-object v2, v5, v17

    const/4 v2, 0x1

    aput-object v1, v5, v2

    invoke-static {v5}, Lec3/v;->J([Lec3/l;)Lec3/h;

    move-result-object v1

    sget-object v5, Li43/a;->w:Li43/a;

    sget-object v6, Lec3/v;->b:Lds2/a;

    invoke-static {v1, v5, v6}, Lec3/v;->u(Lec3/l;Lkotlin/jvm/functions/Function1;Lc93/m;)Lec3/j;

    move-result-object v1

    new-instance v5, Lu;

    check-cast v11, Li43/b;

    invoke-direct {v5, v11, v3}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v2, v4, Lh20/i0;->x:I

    invoke-virtual {v1, v5, v4}, Lec3/j;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_39

    move-object v9, v0

    :cond_39
    :goto_1a
    return-object v9

    :pswitch_11
    iget-object v0, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Li20/j1;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v3, v4, Lh20/i0;->x:I

    if-eqz v3, :cond_3b

    const/4 v5, 0x1

    if-ne v3, v5, :cond_3a

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_25

    :cond_3a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Li20/j1;->I:Lec3/h2;

    iget-object v5, v0, Li20/j1;->L:Lm63/d;

    iget-object v5, v5, Lm63/d;->z:Ljava/lang/Object;

    check-cast v5, Lg40/v;

    invoke-virtual {v5}, Lg40/v;->k()Lg40/t;

    move-result-object v5

    iget-object v5, v5, Lg40/t;->p:Ln53/e;

    iget-object v5, v5, Ln53/e;->y:Ll83/e;

    check-cast v5, Lc93/a;

    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3c
    :goto_1b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ll83/k;

    iget-object v8, v8, Ll83/k;->x:Ljava/lang/Object;

    check-cast v8, Ll40/a;

    iget-boolean v8, v8, Ll40/a;->b:Z

    if-eqz v8, :cond_3c

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1b

    :cond_3d
    invoke-static {v6}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v5

    new-instance v6, Li20/b;

    sget-object v7, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll40/a;

    if-eqz v7, :cond_3e

    iget-object v7, v7, Ll40/a;->a:Ljava/lang/String;

    goto :goto_1c

    :cond_3e
    const/4 v7, 0x0

    :goto_1c
    new-instance v17, Lh20/x0;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCity$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll40/a;

    if-eqz v8, :cond_3f

    iget-object v8, v8, Ll40/a;->a:Ljava/lang/String;

    move-object/from16 v18, v8

    goto :goto_1d

    :cond_3f
    const/16 v18, 0x0

    :goto_1d
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll40/a;

    if-eqz v8, :cond_40

    iget-object v8, v8, Ll40/a;->a:Ljava/lang/String;

    move-object/from16 v19, v8

    goto :goto_1e

    :cond_40
    const/16 v19, 0x0

    :goto_1e
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine1$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll40/a;

    if-eqz v8, :cond_41

    iget-object v8, v8, Ll40/a;->a:Ljava/lang/String;

    move-object/from16 v20, v8

    goto :goto_1f

    :cond_41
    const/16 v20, 0x0

    :goto_1f
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine2$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll40/a;

    if-eqz v8, :cond_42

    iget-object v8, v8, Ll40/a;->a:Ljava/lang/String;

    move-object/from16 v21, v8

    goto :goto_20

    :cond_42
    const/16 v21, 0x0

    :goto_20
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPostalCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll40/a;

    if-eqz v8, :cond_43

    iget-object v8, v8, Ll40/a;->a:Ljava/lang/String;

    move-object/from16 v22, v8

    goto :goto_21

    :cond_43
    const/16 v22, 0x0

    :goto_21
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getState$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll40/a;

    if-eqz v8, :cond_44

    iget-object v8, v8, Ll40/a;->a:Ljava/lang/String;

    move-object/from16 v23, v8

    goto :goto_22

    :cond_44
    const/16 v23, 0x0

    :goto_22
    invoke-direct/range {v17 .. v23}, Lh20/x0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v8, v17

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPhone$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    invoke-interface {v5, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll40/a;

    if-eqz v5, :cond_45

    iget-object v5, v5, Ll40/a;->a:Ljava/lang/String;

    :goto_23
    const/4 v10, 0x0

    goto :goto_24

    :cond_45
    const/4 v5, 0x0

    goto :goto_23

    :goto_24
    invoke-direct {v6, v7, v8, v5, v10}, Li20/b;-><init>(Ljava/lang/String;Lh20/x0;Ljava/lang/String;Ljava/lang/Boolean;)V

    const/4 v5, 0x1

    iput v5, v4, Lh20/i0;->x:I

    invoke-virtual {v3, v6, v4}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v9, v1, :cond_46

    move-object v9, v1

    goto :goto_26

    :cond_46
    :goto_25
    iget-object v0, v0, Li20/j1;->x:Li20/k1;

    check-cast v11, Ljava/lang/String;

    const-string v1, "Autocomplete?country="

    invoke-virtual {v1, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Li20/k1;->a:Leb/u0;

    if-eqz v0, :cond_47

    const/4 v10, 0x0

    invoke-static {v0, v1, v10, v2}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    :cond_47
    :goto_26
    return-object v9

    :pswitch_12
    iget-object v0, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Li20/v0;

    iget-object v2, v0, Li20/v0;->F:Lec3/w1;

    iget-object v3, v0, Li20/v0;->E:Lec3/h2;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, Lh20/i0;->x:I

    if-eqz v6, :cond_4b

    const/4 v7, 0x1

    if-eq v6, v7, :cond_4a

    if-eq v6, v8, :cond_49

    if-ne v6, v1, :cond_48

    goto :goto_27

    :cond_48
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_49
    :goto_27
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3b

    :cond_4a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v6, p1

    check-cast v6, Ll83/n;

    iget-object v6, v6, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_28

    :cond_4b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v10, 0x0

    invoke-virtual {v3, v10, v6}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v6, v0, Li20/v0;->x:Ly30/e;

    if-eqz v6, :cond_82

    check-cast v11, Lz30/b;

    iget-object v7, v11, Lz30/b;->c:Ljava/lang/String;

    const/4 v10, 0x1

    iput v10, v4, Lh20/i0;->x:I

    invoke-interface {v6, v7, v4}, Ly30/e;->a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_4c

    goto/16 :goto_3a

    :cond_4c
    :goto_28
    invoke-static {v6}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v7

    if-nez v7, :cond_81

    check-cast v6, Lz30/c;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v10, 0x0

    invoke-virtual {v3, v10, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v6, Lz30/c;->a:Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;

    iget-object v0, v0, Landroidx/lifecycle/b;->w:Landroid/app/Application;

    const-string v3, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lz30/f;->a:Ljava/util/Set;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;->getAddressComponents()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_60

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    :goto_29
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_5f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    check-cast v21, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;

    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getTypes()Ljava/util/List;

    move-result-object v8

    sget-object v23, Lz30/e;->x:Lz30/e;

    move-object/from16 v23, v0

    const-string v0, "street_number"

    invoke-interface {v8, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4d

    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    goto/16 :goto_2e

    :cond_4d
    const-string v0, "route"

    invoke-interface {v8, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4e

    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto/16 :goto_2e

    :cond_4e
    const-string v0, "premise"

    invoke-interface {v8, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4f

    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v19, v0

    goto/16 :goto_2e

    :cond_4f
    const-string v0, "sublocality_level_1"

    invoke-interface {v8, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_51

    if-nez v13, :cond_50

    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v0

    :goto_2a
    move-object v15, v0

    goto/16 :goto_2e

    :cond_50
    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v0

    :goto_2b
    move-object v13, v0

    goto/16 :goto_2e

    :cond_51
    const-string v0, "sublocality_level_2"

    invoke-interface {v8, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_52

    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v0

    move-object v10, v0

    goto/16 :goto_2e

    :cond_52
    const-string v0, "sublocality_level_3"

    invoke-interface {v8, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_53

    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v0

    move-object v11, v0

    goto/16 :goto_2e

    :cond_53
    const-string v0, "sublocality_level_4"

    invoke-interface {v8, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_54

    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v0

    move-object v12, v0

    goto/16 :goto_2e

    :cond_54
    const-string v0, "locality"

    invoke-interface {v8, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5d

    const-string v0, "sublocality"

    invoke-interface {v8, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5d

    const-string v0, "postal_town"

    invoke-interface {v8, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_55

    goto/16 :goto_2d

    :cond_55
    const-string v0, "administrative_area_level_1"

    invoke-interface {v8, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_56

    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getShortName()Ljava/lang/String;

    move-result-object v0

    :goto_2c
    move-object v14, v0

    goto :goto_2e

    :cond_56
    const-string v0, "administrative_area_level_3"

    invoke-interface {v8, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_57

    if-nez v13, :cond_5e

    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v0

    goto :goto_2b

    :cond_57
    const-string v0, "administrative_area_level_2"

    invoke-interface {v8, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_59

    if-nez v14, :cond_58

    if-nez v15, :cond_58

    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v0

    goto :goto_2a

    :cond_58
    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getShortName()Ljava/lang/String;

    move-result-object v0

    goto :goto_2c

    :cond_59
    const-string v0, "neighborhood"

    invoke-interface {v8, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5b

    if-nez v13, :cond_5a

    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_2b

    :cond_5a
    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_2a

    :cond_5b
    const-string v0, "postal_code"

    invoke-interface {v8, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5c

    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v20, v0

    goto :goto_2e

    :cond_5c
    const-string v0, "country"

    invoke-interface {v8, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5e

    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getShortName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v18, v0

    goto :goto_2e

    :cond_5d
    :goto_2d
    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_2b

    :cond_5e
    :goto_2e
    move-object/from16 v0, v23

    const/4 v8, 0x2

    goto/16 :goto_29

    :cond_5f
    move-object/from16 v23, v0

    move-object/from16 v27, v13

    move-object/from16 v31, v14

    move-object/from16 v32, v15

    move-object/from16 v0, v18

    move-object/from16 v30, v19

    move-object/from16 v33, v20

    goto :goto_2f

    :cond_60
    move-object/from16 v23, v0

    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v27, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    :goto_2f
    const-string v3, ""

    if-nez v6, :cond_61

    move-object v6, v3

    :cond_61
    if-nez v7, :cond_62

    move-object v7, v3

    :cond_62
    const-string v8, "JP"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    const-string v14, " "

    if-eqz v13, :cond_6a

    if-eqz v10, :cond_63

    if-eqz v11, :cond_63

    if-eqz v12, :cond_63

    const/16 v25, 0x1

    goto :goto_30

    :cond_63
    const/16 v25, 0x0

    :goto_30
    if-nez v30, :cond_64

    move-object v6, v3

    goto :goto_31

    :cond_64
    move-object/from16 v6, v30

    :goto_31
    if-nez v27, :cond_65

    move-object v7, v3

    goto :goto_32

    :cond_65
    move-object/from16 v7, v27

    :goto_32
    invoke-virtual/range {v23 .. v23}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    invoke-virtual {v13}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v13

    invoke-virtual {v13}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v13

    const/4 v15, 0x0

    invoke-virtual {v13, v15}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v13

    sget-object v15, Ljava/util/Locale;->JAPANESE:Ljava/util/Locale;

    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    const-string v15, "-"

    if-eqz v13, :cond_68

    if-eqz v25, :cond_66

    invoke-static {v11, v12, v15, v6}, Ldc/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_66
    invoke-static {v7, v10, v3}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_67
    :goto_33
    move-object/from16 v29, v3

    goto/16 :goto_34

    :cond_68
    if-eqz v25, :cond_69

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_69
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_33

    :cond_6a
    invoke-static {v6}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_6b

    invoke-static {v7}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_67

    :cond_6b
    sget-object v3, Lz30/f;->a:Ljava/util/Set;

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3, v0}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6c

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_33

    :cond_6c
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_33

    :goto_34
    sget-object v3, Lz30/e;->y:Lz30/e;

    invoke-static {v1, v3}, Lz30/f;->b(Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;Lz30/e;)Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;

    move-result-object v3

    if-eqz v3, :cond_6d

    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getShortName()Ljava/lang/String;

    move-result-object v3

    goto :goto_35

    :cond_6d
    const/4 v3, 0x0

    :goto_35
    sget-object v6, Lz30/e;->x:Lz30/e;

    invoke-static {v1, v6}, Lz30/f;->b(Lcom/stripe/android/ui/core/elements/autocomplete/model/Place;Lz30/e;)Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;

    move-result-object v1

    if-eqz v1, :cond_6e

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressComponent;->getLongName()Ljava/lang/String;

    move-result-object v1

    goto :goto_36

    :cond_6e
    const/4 v1, 0x0

    :goto_36
    new-instance v26, Lz30/a;

    move-object/from16 v28, v0

    invoke-direct/range {v26 .. v33}, Lz30/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, v26

    move-object/from16 v6, v28

    if-eqz v6, :cond_7f

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7

    const/16 v10, 0x850

    if-eq v7, v10, :cond_7c

    const/16 v10, 0x8ae

    if-eq v7, v10, :cond_7a

    const/16 v10, 0x91c

    if-eq v7, v10, :cond_78

    const/16 v1, 0x92b

    if-eq v7, v1, :cond_77

    const/16 v1, 0x946

    if-eq v7, v1, :cond_75

    const/16 v1, 0x9f8

    if-eq v7, v1, :cond_73

    const/16 v1, 0xa7e

    if-eq v7, v1, :cond_72

    const/16 v1, 0xb27    # 4.001E-42f

    if-eq v7, v1, :cond_71

    const/16 v1, 0x9ab

    if-eq v7, v1, :cond_70

    const/16 v1, 0x9ac

    if-eq v7, v1, :cond_6f

    goto/16 :goto_38

    :cond_6f
    const-string v1, "MY"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_74

    goto/16 :goto_38

    :cond_70
    const-string v1, "MX"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_74

    goto/16 :goto_38

    :cond_71
    const-string v1, "ZA"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_74

    goto/16 :goto_38

    :cond_72
    const-string v1, "TR"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7d

    goto :goto_38

    :cond_73
    const-string v1, "PH"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_74

    goto :goto_38

    :cond_74
    invoke-static {v0}, Lz30/f;->a(Lz30/a;)Lz30/a;

    move-result-object v26

    :goto_37
    move-object/from16 v0, v26

    goto :goto_38

    :cond_75
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_76

    goto :goto_38

    :cond_76
    const/4 v10, 0x0

    iput-object v10, v0, Lz30/a;->d:Ljava/lang/String;

    goto :goto_38

    :cond_77
    const-string v1, "IT"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7b

    goto :goto_38

    :cond_78
    const-string v3, "IE"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_79

    goto :goto_38

    :cond_79
    if-eqz v1, :cond_7f

    iput-object v1, v0, Lz30/a;->e:Ljava/lang/String;

    invoke-static {v0}, Lz30/f;->a(Lz30/a;)Lz30/a;

    move-result-object v26

    goto :goto_37

    :cond_7a
    const-string v1, "ES"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7b

    goto :goto_38

    :cond_7b
    if-eqz v3, :cond_7f

    iput-object v3, v0, Lz30/a;->e:Ljava/lang/String;

    goto :goto_38

    :cond_7c
    const-string v1, "BR"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7d

    goto :goto_38

    :cond_7d
    if-nez v27, :cond_7e

    if-eqz v3, :cond_7e

    iput-object v3, v0, Lz30/a;->a:Ljava/lang/String;

    :cond_7e
    invoke-static {v0}, Lz30/f;->a(Lz30/a;)Lz30/a;

    move-result-object v26

    goto :goto_37

    :cond_7f
    :goto_38
    iget-object v1, v0, Lz30/a;->c:Ljava/lang/String;

    iget-object v3, v0, Lz30/a;->d:Ljava/lang/String;

    iget-object v6, v0, Lz30/a;->a:Ljava/lang/String;

    iget-object v7, v0, Lz30/a;->e:Ljava/lang/String;

    iget-object v8, v0, Lz30/a;->b:Ljava/lang/String;

    if-eqz v8, :cond_80

    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v8, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    const-string v10, "toUpperCase(...)"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v25, v8

    goto :goto_39

    :cond_80
    const/16 v25, 0x0

    :goto_39
    iget-object v0, v0, Lz30/a;->g:Ljava/lang/String;

    new-instance v8, Li20/s0;

    new-instance v23, Lh20/x0;

    move-object/from16 v28, v0

    move-object/from16 v26, v1

    move-object/from16 v27, v3

    move-object/from16 v24, v6

    move-object/from16 v29, v7

    invoke-direct/range {v23 .. v29}, Lh20/x0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, v23

    invoke-direct {v8, v0}, Li20/s0;-><init>(Lh20/x0;)V

    const/4 v0, 0x2

    iput v0, v4, Lh20/i0;->x:I

    invoke-virtual {v2, v8, v4}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_82

    goto :goto_3a

    :cond_81
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v10, 0x0

    invoke-virtual {v3, v10, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v0, Li20/s0;

    invoke-direct {v0, v10}, Li20/s0;-><init>(Lh20/x0;)V

    iput v1, v4, Lh20/i0;->x:I

    invoke-virtual {v2, v0, v4}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_82

    :goto_3a
    move-object v9, v5

    :cond_82
    :goto_3b
    return-object v9

    :pswitch_13
    iget-object v0, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Li20/v0;

    iget-object v1, v0, Li20/v0;->E:Lec3/h2;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v4, Lh20/i0;->x:I

    if-eqz v3, :cond_84

    const/4 v5, 0x1

    if-ne v3, v5, :cond_83

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    check-cast v2, Ll83/n;

    iget-object v2, v2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_3c

    :cond_83
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_84
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Li20/v0;->x:Ly30/e;

    if-eqz v3, :cond_88

    check-cast v11, Ljava/lang/String;

    iget-object v5, v0, Li20/v0;->y:Li20/p0;

    iget-object v5, v5, Li20/p0;->a:Ljava/lang/String;

    if-eqz v5, :cond_87

    const/4 v7, 0x1

    iput v7, v4, Lh20/i0;->x:I

    const/4 v6, 0x4

    invoke-interface {v3, v11, v5, v6, v4}, Ly30/e;->b(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_85

    move-object v9, v2

    goto :goto_3d

    :cond_85
    move-object v2, v3

    :goto_3c
    invoke-static {v2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_86

    check-cast v2, Lz30/d;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v10, 0x0

    invoke-virtual {v1, v10, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, v0, Li20/v0;->z:Lec3/h2;

    iget-object v1, v2, Lz30/d;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v10, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_3d

    :cond_86
    const/4 v10, 0x0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v10, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_3d

    :cond_87
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Country cannot be empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_88
    :goto_3d
    return-object v9

    :pswitch_14
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lh20/i0;->x:I

    if-eqz v1, :cond_8a

    const/4 v2, 0x1

    if-ne v1, v2, :cond_89

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3e

    :cond_89
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v1, Li20/v0;

    iget-object v1, v1, Li20/v0;->G:Lec3/q1;

    new-instance v2, Landroidx/room/e;

    check-cast v11, Li20/k1;

    const/4 v10, 0x0

    invoke-direct {v2, v11, v10, v3}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v5, 0x1

    iput v5, v4, Lh20/i0;->x:I

    invoke-static {v1, v2, v4}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_8b

    move-object v9, v0

    :cond_8b
    :goto_3e
    return-object v9

    :pswitch_15
    move v5, v12

    check-cast v11, Lh40/k;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lh20/i0;->x:I

    if-eqz v1, :cond_8e

    if-eq v1, v5, :cond_8d

    const/4 v2, 0x2

    if-ne v1, v2, :cond_8c

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_41

    :cond_8c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3f

    :cond_8e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v11, Lh40/k;->a:Lg1/y3;

    invoke-virtual {v1}, Lg1/y3;->e()Z

    move-result v1

    if-nez v1, :cond_8f

    const/4 v2, 0x1

    iput v2, v4, Lh20/i0;->x:I

    invoke-virtual {v11, v4}, Lh40/k;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_8f

    goto :goto_40

    :cond_8f
    :goto_3f
    const/4 v2, 0x2

    iput v2, v4, Lh20/i0;->x:I

    invoke-virtual {v11, v4}, Lh40/k;->a(Ls83/c;)Ljava/lang/Enum;

    move-result-object v1

    if-ne v1, v0, :cond_90

    :goto_40
    move-object v9, v0

    goto :goto_42

    :cond_90
    :goto_41
    check-cast v1, Lh40/g;

    sget-object v0, Lh40/g;->x:Lh40/g;

    if-ne v1, v0, :cond_91

    iget-object v0, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_91
    :goto_42
    return-object v9

    :pswitch_16
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lh20/i0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_93

    if-ne v1, v2, :cond_92

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_43

    :cond_92
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_93
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v11, Lh40/k;

    iput v2, v4, Lh20/i0;->x:I

    invoke-virtual {v11, v4}, Lh40/k;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_94

    move-object v9, v0

    goto :goto_44

    :cond_94
    :goto_43
    iget-object v0, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/shoppay/ShopPayActivity;

    sget v1, Lcom/stripe/android/shoppay/ShopPayActivity;->E:I

    sget-object v1, Lh30/f;->w:Lh30/f;

    invoke-virtual {v0, v1}, Lcom/stripe/android/shoppay/ShopPayActivity;->p(Lh30/i;)V

    :goto_44
    return-object v9

    :pswitch_17
    iget-object v0, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lh3/c;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v4, Lh20/i0;->x:I

    const/4 v7, 0x1

    if-eqz v2, :cond_96

    if-ne v2, v7, :cond_95

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_46

    :cond_95
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_96
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lh3/c;->f:Lh3/g;

    iput v7, v4, Lh20/i0;->x:I

    iget v3, v2, Lh3/g;->b:F

    sub-float/2addr v5, v3

    invoke-virtual {v2, v5, v4}, Lh3/g;->b(FLs83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_97

    goto :goto_45

    :cond_97
    move-object v2, v9

    :goto_45
    if-ne v2, v1, :cond_98

    move-object v9, v1

    goto :goto_47

    :cond_98
    :goto_46
    iget-object v0, v0, Lh3/c;->c:Lh3/j;

    iget-object v0, v0, Lh3/j;->a:Lp1/k1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    check-cast v11, Ljava/lang/Runnable;

    invoke-interface {v11}, Ljava/lang/Runnable;->run()V

    :goto_47
    return-object v9

    :pswitch_18
    iget-object v0, v4, Lh20/i0;->z:Ljava/lang/Object;

    move-object v13, v0

    check-cast v13, Lh20/z4;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lh20/i0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_9b

    if-eq v1, v2, :cond_9a

    const/4 v2, 0x2

    if-ne v1, v2, :cond_99

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4d

    :cond_99
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_48

    :cond_9b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v13, Lh20/z4;->j:Ls83/i;

    iput v2, v4, Lh20/i0;->x:I

    invoke-interface {v1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_9c

    goto/16 :goto_4c

    :cond_9c
    :goto_48
    move-object v15, v11

    check-cast v15, Ljava/lang/String;

    const/4 v2, 0x2

    iput v2, v4, Lh20/i0;->x:I

    iget-object v1, v13, Lh20/z4;->i:Lh20/f;

    iget-object v1, v1, Lh20/f;->b:Lec3/r1;

    iget-object v1, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, La30/a;

    if-nez v14, :cond_9d

    goto :goto_4a

    :cond_9d
    iget-object v1, v14, La30/a;->w:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/16 v16, 0x0

    if-eqz v2, :cond_9f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ly00/o4;

    iget-object v3, v3, Ly00/o4;->w:Ljava/lang/String;

    invoke-static {v3, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9e

    goto :goto_49

    :cond_9f
    move-object/from16 v2, v16

    :goto_49
    check-cast v2, Ly00/o4;

    if-eqz v2, :cond_a0

    iget-object v1, v2, Ly00/o4;->E:Ly00/f4;

    if-eqz v1, :cond_a0

    iget-object v1, v1, Ly00/f4;->w:Ljava/lang/String;

    if-eqz v1, :cond_a0

    iget-object v2, v13, Lh20/z4;->b:Lk20/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lc10/d;

    invoke-direct {v3, v1}, Lc10/d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lk20/a;->g(Lx30/s0;)V

    new-instance v3, Lk20/s;

    iget-object v5, v2, Lk20/a;->a:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    invoke-direct {v3, v5, v1}, Lk20/s;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    :cond_a0
    iget-object v1, v13, Lh20/z4;->e:Lq83/j;

    new-instance v12, Lay/u;

    const/16 v17, 0x6

    invoke-direct/range {v12 .. v17}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v12, v4}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_a1

    goto :goto_4b

    :cond_a1
    :goto_4a
    move-object v1, v9

    :goto_4b
    if-ne v1, v0, :cond_a2

    :goto_4c
    move-object v9, v0

    :cond_a2
    :goto_4d
    return-object v9

    :pswitch_19
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v4, Lh20/i0;->x:I

    if-eqz v2, :cond_a4

    const/4 v5, 0x1

    if-eq v2, v5, :cond_a3

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a3
    invoke-static/range {p1 .. p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object v0

    throw v0

    :cond_a4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v2, Le30/c;

    iget-object v2, v2, Le30/c;->M:Lr20/d;

    iget-object v2, v2, Lr20/d;->g:Ln53/e;

    new-instance v3, Lh20/s4;

    check-cast v11, Lh20/z4;

    invoke-direct {v3, v11, v1}, Lh20/s4;-><init>(Lh20/z4;I)V

    const/4 v5, 0x1

    iput v5, v4, Lh20/i0;->x:I

    invoke-virtual {v2, v3, v4}, Ln53/e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v0

    :pswitch_1a
    move v5, v12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lh20/i0;->x:I

    if-eqz v1, :cond_a6

    if-ne v1, v5, :cond_a5

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4e

    :cond_a5
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v1, Lw20/b0;

    iget-object v1, v1, Lw20/b0;->d:Ln53/e;

    new-instance v12, Lek/d;

    move-object v14, v11

    check-cast v14, Lh20/k4;

    const/16 v18, 0x4

    const/16 v19, 0x3

    const/4 v13, 0x2

    const-class v15, Lh20/k4;

    const-string v16, "handleCvcCompletionState"

    const-string v17, "handleCvcCompletionState(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcCompletionState;)V"

    invoke-direct/range {v12 .. v19}, Lek/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    const/4 v2, 0x1

    iput v2, v4, Lh20/i0;->x:I

    invoke-static {v1, v12, v4}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_a7

    move-object v9, v0

    :cond_a7
    :goto_4e
    return-object v9

    :pswitch_1b
    iget-object v0, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v4, Lh20/i0;->x:I

    if-eqz v2, :cond_a9

    const/4 v5, 0x1

    if-ne v2, v5, :cond_a8

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4f

    :cond_a8
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a9
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->p()Lh20/k4;

    move-result-object v2

    iget-object v2, v2, Lh20/k4;->j0:Lec3/w1;

    new-instance v3, Landroidx/room/x;

    check-cast v11, Lh40/k;

    const/4 v5, 0x7

    invoke-direct {v3, v5, v0, v11}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v5, 0x1

    iput v5, v4, Lh20/i0;->x:I

    new-instance v0, La6/t;

    const/4 v5, 0x2

    invoke-direct {v0, v3, v5}, La6/t;-><init>(Lec3/m;I)V

    invoke-virtual {v2, v0, v4}, Lec3/w1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-object v9, v1

    :goto_4f
    return-object v9

    :pswitch_1c
    move v5, v12

    iget-object v0, v4, Lh20/i0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v3, v4, Lh20/i0;->x:I

    if-eqz v3, :cond_ab

    if-ne v3, v5, :cond_aa

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_50

    :cond_aa
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_ab
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;->p()Lh20/w0;

    move-result-object v3

    iget-object v3, v3, Lh20/w0;->h0:Lec3/w1;

    new-instance v5, Landroidx/room/x;

    check-cast v11, Lh40/k;

    invoke-direct {v5, v2, v0, v11}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iput v2, v4, Lh20/i0;->x:I

    new-instance v0, La6/t;

    const/4 v2, 0x2

    invoke-direct {v0, v5, v2}, La6/t;-><init>(Lec3/m;I)V

    invoke-virtual {v3, v0, v4}, Lec3/w1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-object v9, v1

    :goto_50
    return-object v9

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
